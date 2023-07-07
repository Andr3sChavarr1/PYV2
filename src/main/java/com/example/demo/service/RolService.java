/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.service;

import java.util.List;
import java.util.Map;

import com.example.demo.entity.Rol;

public interface RolService {
    public List<Rol> readAll();
	public Rol findById(int id);
	public void save(Rol rol);
	public void delete(int id);
	public void update(Rol rol);
}
