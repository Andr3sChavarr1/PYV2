package com.example.demo.controller;

import com.example.demo.serviceImpl.RolServiceImpl;
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

import com.example.demo.entity.Rol;

@RestController
@RequestMapping("/api/rol")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class RolController {
	
	
	@Autowired
	private RolServiceImpl rolServiceImpl;
	
	@GetMapping("/all")
	 public List<Rol> getAllActividades() {
	        return rolServiceImpl.readAll();
	 }

	
	 @PostMapping("/create")
	 public void createUser(@RequestBody Rol rol) {
		 rolServiceImpl.save(rol);
	 }
	 
	 @DeleteMapping("/delete/{id}")
	 public void deleteUser(@PathVariable int id) {
		 rolServiceImpl.delete(id);
	 }
	 
	 
	 @PutMapping("/update/{id}")
	 public void updateUser(@PathVariable int id, @RequestBody Rol rol) {
		 rol.setId_rol(id);
		 rolServiceImpl.update(rol);
	 }
	 
	  @GetMapping("search/{id}")
	    public Rol getUserById(@PathVariable int id) {
	        return rolServiceImpl.findById(id);
	    }
	
}
