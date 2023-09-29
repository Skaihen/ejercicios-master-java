package io.skaihen.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.skaihen.apirest.models.Libro;
import io.skaihen.apirest.services.LibroService;

@RestController
public class LibroController {

    @Autowired
    LibroService libroService;

    @GetMapping("/libros")
    public List<Libro> libros() {
        return libroService.libros();
    }
}
