
package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Actividades;
import com.example.demo.repository.ActividadesRepository;
import com.example.demo.service.ActividadesService;

@Service

public class ActividadesServiceImpl implements ActividadesService{
    @Autowired
	private ActividadesRepository actividadesrepository;

	@Override
	public List<Actividades> readAll() {
		return actividadesrepository.findAll();
	}

	@Override
	public void save(Actividades actividades) {
		 actividadesrepository.save(actividades);
	}

	@Override
	public void delete(int id) {
		actividadesrepository.delete(id);		
	}

	@Override
	public void update(Actividades actividades) {
		actividadesrepository.update(actividades);
		
	}

	@Override
	public Actividades findById(int id) {
		return actividadesrepository.findById(id);
	}	
}
