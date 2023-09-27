package io.skaihen.ejerciciocursos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.skaihen.ejerciciocursos.model.Curso;
import io.skaihen.ejerciciocursos.service.CursosService;

@RestController
public class CursosController {
    @Autowired
    CursosService service;

    @GetMapping(value = "/cursos", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Curso> cursos() {
        return service.cursos();
    }

    @GetMapping(value = "/cursos/{codigo}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Curso buscarCurso(@PathVariable("codigo") int codigo) {
        return service.buscarCurso(codigo);
    }

    @PostMapping(value = "/cursos/alta", consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<Curso> altaCurso(@RequestBody Curso curso) {
        return service.altaCurso(curso);
    }

    @PutMapping(value = "/cursos/actualizar/{codigo}/{duracion}")
    public void actualizarCurso(@PathVariable("codigo") int codigo, @PathVariable("duracion") int duracion) {
        service.actualizarCurso(codigo, duracion);
    }

    @DeleteMapping(value = "/cursos/eliminar/{codigo}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Curso> eliminarCurso(@PathVariable("codigo") int codigo) {
        return service.eliminarCurso(codigo);
    }

    @GetMapping(value = "/cursos/precio/{precioMin}/{precioMax}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Curso> cursosPorPrecio(@PathVariable("precioMin") int precioMin,
            @PathVariable("precioMax") int precioMax) {
        return service.buscarCursosRangoPrecio(precioMin, precioMax);
    }
}