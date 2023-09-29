package io.skaihen.apirest.services;

import java.util.List;

import io.skaihen.apirest.models.Libro;

public interface LibroService {
    List<Libro> libros();

    Libro buscarLibro(int isbn);

    List<Libro> subirLibro(Libro libro);

    void actualizarLibro(Libro libro);

    List<Libro> eliminarLibro(int isbn);

    List<Libro> buscarPrecioMinMax(int precioMin, int precioMax);
}
