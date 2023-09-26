package io.skaihen.springprueba.service;

import java.util.ArrayList;
import java.util.List;

import io.skaihen.springprueba.model.Libro;

public class LibrosServiceImpl implements LibrosService {

    List<Libro> libros;

    public LibrosServiceImpl() {
        this.libros = new ArrayList<>();
        this.libros.add(new Libro(222, "El señor de los anillos", "Fantasía"));
        this.libros.add(new Libro(111, "El principito", "Ciencia ficción"));
        this.libros.add(new Libro(333, "El pozo de la ascensión", "Fantasía"));
    }

    @Override
    public List<Libro> libros() {
        return libros;
    }

    @Override
    public Libro buscarLibro(int isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn() == isbn) {
                return libro;
            }
        }
        return null;
    }

    @Override
    public void altaLibro(Libro libro) {
        libros.add(libro);
    }

    @Override
    public void actualizarLibro(Libro libroEntrada) {
        for (Libro libroLista : libros) {
            if (libroEntrada.getIsbn() == libroLista.getIsbn()) {
                libros.set(libros.indexOf(libroLista), libroEntrada);
            }
        }
    }

    @Override
    public void eliminarLibro(int isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn() == isbn) {
                libros.remove(libro);
            }
        }
    }

}
