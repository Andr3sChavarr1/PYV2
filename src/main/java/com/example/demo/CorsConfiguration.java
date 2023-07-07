/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 *
 * @author andre
 */
@Configuration
public class CorsConfiguration implements WebMvcConfigurer {
  
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**") // Ruta base de tus puntos de enlace
            .allowedOrigins("http://127.0.0.1:5501") // Origen permitido
            .allowedMethods("GET", "POST", "PUT", "DELETE") // Métodos permitidos
            .allowedHeaders("*"); // Encabezados permitidos
    }
}
