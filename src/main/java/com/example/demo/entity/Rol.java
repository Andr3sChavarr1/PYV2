
package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor /* CONSTRUCTOR SIN DATOS*/
@Data

public class Rol {
    private int id_rol;
    private String rol;
    private String descripcion;
    private int horasGanadas;

    public Rol(String rol, String descripcion, int horasGanadas) {
        this.rol = rol;
        this.descripcion = descripcion;
        this.horasGanadas = horasGanadas;
    }
    
}
