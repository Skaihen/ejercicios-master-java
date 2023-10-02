package io.skaihen.ejercicio1.services;

import java.util.List;

import io.skaihen.ejercicio1.models.Curso;

public interface CursoService {
    List<Curso> cursos();

    Curso buscarCurso(int codCurso);

    List<Curso> altaCurso(Curso curso);

    void actualizarCurso(Curso curso);

    List<Curso> eliminarCurso(int id);

    List<Curso> buscarCursoEntrePrecioMinMax(int precioMin, int precioMax);
}
