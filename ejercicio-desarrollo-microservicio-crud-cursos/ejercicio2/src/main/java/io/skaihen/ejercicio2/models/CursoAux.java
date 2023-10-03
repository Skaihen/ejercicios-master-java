package io.skaihen.ejercicio2.models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CursoAux {
    private int codCurso;
    private String nombre;
    private int duracion;
    private double precio;
}
