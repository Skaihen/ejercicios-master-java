package io.skaihen.ejercicio1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import io.skaihen.ejercicio1.models.Curso;
import io.skaihen.ejercicio1.services.CursoService;

@RestController
public class CursoController {

    @Autowired
    CursoService cursoService;

    @GetMapping(value = "/cursos", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Curso> cursos() {
        return cursoService.cursos();
    }

    @GetMapping(value = "/curso/{codCurso}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Curso buscarCurso(@PathVariable("codCurso") int codCurso) {
        return cursoService.buscarCurso(codCurso);
    }

    @PostMapping(value = "/curso", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void altaCurso(Curso curso) {
        cursoService.altaCurso(curso);
    }

    @PutMapping(value = "/curso", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void actualizarCurso(Curso curso) {
        cursoService.actualizarCurso(curso);
    }

    @DeleteMapping(value = "/curso/{codCurso}")
    public void eliminarCurso(@PathVariable("codCurso") int codCurso) {
        cursoService.eliminarCurso(codCurso);
    }

    @GetMapping(value = "/hp/{hpMin}/{hpMax}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Curso> buscarCursoEntrePrecioMinMax(@PathVariable("hpMin") int hpMin,
            @PathVariable("hpMax") int hpMax) {
        return cursoService.buscarCursoEntrePrecioMinMax(hpMin, hpMax);
    }
}
