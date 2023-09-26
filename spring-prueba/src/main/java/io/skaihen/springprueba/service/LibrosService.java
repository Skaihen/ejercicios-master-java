package io.skaihen.springprueba.service;

import java.util.List;

import io.skaihen.springprueba.model.Libro;

public interface LibrosService {
    List<Libro> libros();

    Libro buscarLibro(int isbn);

    void altaLibro(Libro libro);

    void actualizarLibro(Libro libro);

    void eliminarLibro(int isbn);
}
