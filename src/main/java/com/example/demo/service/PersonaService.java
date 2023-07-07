package com.example.demo.service;

import java.util.List;
import java.util.Map;

import com.example.demo.entity.Alumno;

public interface PersonaService {	
	public List<Alumno> readAll();
	public Alumno findById(int id);
	public void save(Alumno alumno);
	public void delete(int id);
	public void update(Alumno alumno);
}
