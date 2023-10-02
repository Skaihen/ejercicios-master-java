package io.skaihen.ejercicio2.models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Formacion {
    private String curso;
    private int asignaturas;
    private double precio;
}
