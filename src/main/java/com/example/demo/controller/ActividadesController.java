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

import com.example.demo.entity.Actividades;
import com.example.demo.serviceImpl.ActividadesServiceImpl;

@RestController
@RequestMapping("/api/actividades")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class ActividadesController {
	
	
	@Autowired
	private ActividadesServiceImpl actividadesServiceImpl;
	
	@GetMapping("/all")
	 public List<Actividades> getAllActividades() {
	        return actividadesServiceImpl.readAll();
	 }

	
	 @PostMapping("/create")
	 public void createUser(@RequestBody Actividades actividades) {
		  actividadesServiceImpl.save(actividades);
	 }
	 
	 @DeleteMapping("/delete/{id}")
	 public void deleteUser(@PathVariable int id) {
		 actividadesServiceImpl.delete(id);
	 }
	 
	 
	 @PutMapping("/update/{id}")
	 public void updateUser(@PathVariable int id, @RequestBody Actividades actividades) {
		 actividades.setId_actividad(id);
		 actividadesServiceImpl.update(actividades);
	 }
	 
	  @GetMapping("search/{id}")
	    public Actividades getUserById(@PathVariable int id) {
	        return actividadesServiceImpl.findById(id);
	    }
	
}
