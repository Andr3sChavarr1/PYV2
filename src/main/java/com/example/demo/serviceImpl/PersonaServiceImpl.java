package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Alumno;
import com.example.demo.repository.PersonaRepository;
import com.example.demo.service.PersonaService;

@Service
public class PersonaServiceImpl implements PersonaService {
	
	
	@Autowired
	private PersonaRepository personarepository;

	@Override
	public List<Alumno> readAll() {
		return personarepository.findAll();
	}

	@Override
	public void save(Alumno alumno) {
		 personarepository.save(alumno);
	}

	@Override
	public void delete(int id) {
		personarepository.delete(id);		
	}

	@Override
	public void update(Alumno alumno) {
		personarepository.update(alumno);
		
	}

	@Override
	public Alumno findById(int id) {
		return personarepository.findById(id);
	}	
}
