package io.skaihen.ejerciciocursos.service;

import java.util.List;

import io.skaihen.ejerciciocursos.model.Curso;

public interface CursosService {
    List<Curso> cursos();

    Curso buscarCurso(int codigo);

    List<Curso> altaCurso(Curso curso);

    void actualizarCurso(int codigo, int duracion);

    List<Curso> eliminarCurso(int codigo);

    List<Curso> buscarCursosRangoPrecio(int precioMin, int precioMax);

}