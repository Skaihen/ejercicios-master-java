package io.skaihen.ejercicio2.services;

import java.util.List;

import io.skaihen.ejercicio2.models.Formacion;

public interface FormacionService {
    List<Formacion> formaciones();

    void altaCurso(Formacion formacion);
}
