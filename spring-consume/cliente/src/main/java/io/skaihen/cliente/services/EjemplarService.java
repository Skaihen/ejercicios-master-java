package io.skaihen.cliente.services;

import java.util.List;

import io.skaihen.cliente.models.Ejemplar;

public interface EjemplarService {
    List<Ejemplar> ejemplares();

    Ejemplar buscarEjemplar(int isbn);

    List<Ejemplar> nuevoEjemplar(Ejemplar ejemplar);

    void actualizarEjemplar(Ejemplar ejemplar);

    List<Ejemplar> eliminarEjemplar(int isbn);

    List<Ejemplar> buscarPrecioMinMax(int precioMin, int precioMax);
}
