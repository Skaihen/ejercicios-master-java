package io.skaihen.ejercicio2.services;

import java.util.List;

import io.skaihen.ejercicio2.models.Formacion;

public interface FormacionService {
    List<Formacion> formacions();

    Formacion buscarFormacion(int id);

    void nuevoFormacion(Formacion formacion);

    void actualizarFormacion(Formacion formacion);

    void eliminarFormacion(int id);

    List<Formacion> buscarFormacionSpeedMin(int speedMin);

    List<Formacion> buscarFormacionHpEntreMinMax(int hpMin, int hpMax);
}
