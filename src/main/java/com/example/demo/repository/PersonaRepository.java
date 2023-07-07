package com.example.demo.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Alumno;

@Repository
public class PersonaRepository {
	
	  @Autowired
	  private JdbcTemplate jdbcTemplate;
		
	  public PersonaRepository(JdbcTemplate jdbcTemplate) {
		  this.jdbcTemplate = jdbcTemplate;
	  }
	 
	  public List<Alumno> findAll() {
	        String sql = "SELECT * from alumno";
	        return jdbcTemplate.query(sql, (resultSet, rowNum) ->
	                new Alumno(
	                		resultSet.getInt("id_alumno"),
                                resultSet.getString("codigoAlumno"),
	                        resultSet.getString("nombres"),
	                        resultSet.getString("apellidos"),
	                        resultSet.getString("DNI"),
                                resultSet.getString("email"),
                                resultSet.getString("numero")
	                		)
	        );
	    }
	  
	  
	   public void save(Alumno alumno) {
	        String sql = "INSERT INTO alumno (codigoAlumno, nombres, apellidos, DNI, email, numero) VALUES (?,?,?,?,?,?)";
	        jdbcTemplate.update(sql, alumno.getCodigoAlumno(),alumno.getNombres(), alumno.getApellidos(),alumno.getDNI(),alumno.getEmail(),alumno.getNumero());
	    }
	 
	   
	   public void delete(int id) {
	        String sql = "DELETE FROM alumno WHERE id_alumno = ?";
	        jdbcTemplate.update(sql, id);
	    }
	   
	   
	   public void update(Alumno alumno) {
	        String sql = "UPDATE alumno  SET codigoAlumno=?, nombres = ?, apellidos = ?, DNI= ?, email = ?, numero=? WHERE id_alumno = ?";
	        jdbcTemplate.update(sql, alumno.getCodigoAlumno(), alumno.getNombres(), alumno.getApellidos(), alumno.getDNI(), alumno.getEmail(),alumno.getNumero());
	   }
	   
	   public Alumno findById(int id) {
	        String sql = "SELECT * from alumno  WHERE id_alumno = ?";
	        return jdbcTemplate.queryForObject(sql, new Object[]{id}, (resultSet, rowNum) ->
	                new Alumno(
	                		resultSet.getInt("id_alumno"),
                                resultSet.getString("codigoAlumno"),
	                        resultSet.getString("nombres"),
	                        resultSet.getString("apellidos"),
	                        resultSet.getString("DNI"),
                                resultSet.getString("email"),
                                resultSet.getString("numero")
	                )
	        );
	    }
	   
}
