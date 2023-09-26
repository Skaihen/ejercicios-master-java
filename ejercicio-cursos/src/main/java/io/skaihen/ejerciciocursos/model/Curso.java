package io.skaihen.ejerciciocursos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Curso {
    private int codigo;
    private String nombre;
    private int duracion;
    private int precio;
}