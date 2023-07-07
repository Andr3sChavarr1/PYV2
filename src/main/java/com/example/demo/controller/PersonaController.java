package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Alumno;
import com.example.demo.serviceImpl.PersonaServiceImpl;

@RestController
@RequestMapping("/api/persona")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class PersonaController {
	
	
	@Autowired
	private PersonaServiceImpl personaServiceimpl;
	
	@GetMapping("/all")
	 public List<Alumno> getAllPersona() {
	        return personaServiceimpl.readAll();
	 }

	
	 @PostMapping("/create")
	 public void createUser(@RequestBody Alumno alumno) {
		  personaServiceimpl.save(alumno);
	 }
	 
	 @DeleteMapping("/delete/{id}")
	 public void deleteUser(@PathVariable int id) {
		 personaServiceimpl.delete(id);
	 }
	 
	 
	 @PutMapping("/update/{id}")
	 public void updateUser(@PathVariable int id, @RequestBody Alumno alumno) {
		 alumno.setId_alumno(id);
		 personaServiceimpl.update(alumno);
	 }
	 
	  @GetMapping("search/{id}")
	    public Alumno getUserById(@PathVariable int id) {
	        return personaServiceimpl.findById(id);
	    }
	
}
