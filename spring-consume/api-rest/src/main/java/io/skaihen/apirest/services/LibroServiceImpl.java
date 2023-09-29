package io.skaihen.apirest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.skaihen.apirest.models.Libro;
import io.skaihen.apirest.repositories.LibroRepository;

@Service
public class LibroServiceImpl implements LibroService {
    @Autowired
    LibroRepository libroRepository;

    @Override
    public List<Libro> libros() {
        return libroRepository.findAll();
    }

    @Override
    public Libro buscarLibro(int isbn) {
        return libroRepository.findById(isbn).orElse(null);
    }

    @Override
    public List<Libro> subirLibro(Libro libro) {
        libroRepository.save(libro);
        return libroRepository.findAll();
    }

    @Override
    public void actualizarLibro(Libro libro) {
        libroRepository.save(libro);
    }

    @Override
    public List<Libro> eliminarLibro(int isbn) {
        libroRepository.deleteById(isbn);
        return libroRepository.findAll();
    }

    @Override
    public List<Libro> buscarPrecioMinMax(int precioMin, int precioMax) {
        return libroRepository.findAllPriceBetween(precioMin, precioMax);
    }

}
