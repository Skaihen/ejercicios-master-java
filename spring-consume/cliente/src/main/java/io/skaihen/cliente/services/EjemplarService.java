package io.skaihen.cliente.services;

import java.util.List;

import io.skaihen.cliente.models.Ejemplar;

public interface EjemplarService {
    List<Ejemplar> ejemplars();

    Ejemplar buscarEjemplar(int isbn);

    List<Ejemplar> subirEjemplar(Ejemplar ejemplar);

    void actualizarEjemplar(Ejemplar ejemplar);

    List<Ejemplar> eliminarEjemplar(int isbn);

    List<Ejemplar> buscarPrecioMinMax(int precioMin, int precioMax);
}
