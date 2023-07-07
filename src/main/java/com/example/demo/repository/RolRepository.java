
package com.example.demo.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Rol;

@Repository

public class RolRepository {
     @Autowired
	  private JdbcTemplate jdbcTemplate;
		
	  public RolRepository(JdbcTemplate jdbcTemplate) {
		  this.jdbcTemplate = jdbcTemplate;
	  }
	 
	 public List<Rol> findAll() {
	        String sql = "SELECT * from rol";
	        return jdbcTemplate.query(sql, (resultSet, rowNum) ->
	                new Rol(
                                resultSet.getInt("id_rol"),
                                resultSet.getString("rol"),
                                resultSet.getString("descripcion"),
                                resultSet.getInt("horasGanadas")
	                		)
	        );
	    }
         public void save(Rol rol) {
	        String sql = "INSERT INTO rol (rol, descripcion, horasGanadas) VALUES (?,?,?)";
	        jdbcTemplate.update(sql, rol.getRol(), rol.getDescripcion(), rol.getHorasGanadas());
	    }
         public void delete(int id) {
	        String sql = "DELETE FROM rol WHERE id_rol = ?";
	        jdbcTemplate.update(sql, id);
	    }
	   
	   
	   public void update(Rol rol) {
	        String sql = "UPDATE rol  SET rol=?, descripcion = ?, horasGanadas= ?";
	        jdbcTemplate.update(sql, rol.getRol(), rol.getDescripcion(), rol.getHorasGanadas());
	   }
	  public Rol findById(int id) {
	        String sql = "SELECT * from rol  WHERE id_rol = ?";
	        return jdbcTemplate.queryForObject(sql, new Object[]{id}, (resultSet, rowNum) ->
	                new Rol(
	                		resultSet.getInt("id_rol"),
                                resultSet.getString("rol"),
                                resultSet.getString("descripcion"),
                                resultSet.getInt("horasGanadas")
	                )
	        );
	    }
}
