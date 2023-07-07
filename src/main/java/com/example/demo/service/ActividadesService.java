
package com.example.demo.service;

import java.util.List;
import java.util.Map;

import com.example.demo.entity.Actividades;

public interface ActividadesService {
    public List<Actividades> readAll();
	public Actividades findById(int id);
	public void save(Actividades actividades);
	public void delete(int id);
	public void update(Actividades actividades);
}
