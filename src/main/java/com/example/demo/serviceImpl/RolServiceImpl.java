
package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Rol;
import com.example.demo.repository.RolRepository;
import com.example.demo.service.RolService;

@Service

public class RolServiceImpl implements RolService{
    
        @Autowired
	private RolRepository rolrepository;

	@Override
	public List<Rol> readAll() {
		return rolrepository.findAll();
	}

	@Override
	public void save(Rol rol) {
		 rolrepository.save(rol);
	}

	@Override
	public void delete(int id) {
		rolrepository.delete(id);		
	}

	@Override
	public void update(Rol rol) {
		rolrepository.update(rol);
		
	}

	@Override
	public Rol findById(int id) {
		return rolrepository.findById(id);
	}	
}
