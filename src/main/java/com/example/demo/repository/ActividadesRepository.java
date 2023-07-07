
package com.example.demo.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Actividades;

@Repository
public class ActividadesRepository {
    @Autowired
	  private JdbcTemplate jdbcTemplate;
		
	  public ActividadesRepository(JdbcTemplate jdbcTemplate) {
		  this.jdbcTemplate = jdbcTemplate;
	  }
	 
	  public List<Actividades> findAll() {
	        String sql = "SELECT * from actividad";
	        return jdbcTemplate.query(sql, (resultSet, rowNum) ->
	                new Actividades(
                                resultSet.getInt("id_actividad"),
                                resultSet.getString("nombreActividad"),
	                        resultSet.getString("descripcion")
	                		)
	        );
	    }
	  
	  
	   public void save(Actividades actividades) {
	        String sql = "INSERT INTO actividad (nombreActividad, descripcion) VALUES (?,?)";
	        jdbcTemplate.update(sql, actividades.getNombreActividad(), actividades.getDescripcion());
	    }
	 
	   
	   public void delete(int id) {
	        String sql = "DELETE FROM actividad WHERE id_actividad = ?";
	        jdbcTemplate.update(sql, id);
	    }
	   
	   
	   public void update(Actividades actividades) {
	        String sql = "UPDATE actividades  SET nombreActividad=?, descripcion = ?";
	        jdbcTemplate.update(sql, actividades.getNombreActividad(), actividades.getDescripcion());
	   }
	   
	   public Actividades findById(int id) {
	        String sql = "SELECT * from actividades  WHERE id_actividad = ?";
	        return jdbcTemplate.queryForObject(sql, new Object[]{id}, (resultSet, rowNum) ->
	                new Actividades(
	                		resultSet.getString("nombreActividad"),
	                        resultSet.getString("descripcion")
	                )
	        );
	    }
}
