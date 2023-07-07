
package com.example.demo.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor /* CONSTRUCTOR SIN DATOS*/
@Data
public class Actividades {
        private int id_actividad;
	private String nombreActividad;
        private String descripcion;

    public Actividades(String nombreActividad, String descripcion) {
        this.nombreActividad = nombreActividad;
        this.descripcion = descripcion;
    }
}
