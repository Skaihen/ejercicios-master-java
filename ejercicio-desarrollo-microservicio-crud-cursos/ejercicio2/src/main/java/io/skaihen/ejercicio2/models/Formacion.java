package io.skaihen.ejercicio2.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Formacion {
    @Id
    private String curso;
    private int asignaturas;
    private double precio;
}
