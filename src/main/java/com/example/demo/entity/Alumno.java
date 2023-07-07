package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor /* CONSTRUCTOR SIN DATOS*/

@Data
public class Alumno {
	private int id_alumno;
	private String codigoAlumno;
        private String nombres;
	private String apellidos;
	private String DNI;
        private String email;
        private String numero;

    public Alumno(String codigoAlumno, String nombres, String apellidos, String DNI, String email, String numero) {
        this.codigoAlumno = codigoAlumno;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.email = email;
        this.numero = numero;
    }
}
