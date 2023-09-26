package io.skaihen.ejerciciocursos.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import io.skaihen.ejerciciocursos.model.Curso;

@Service
public class CursosServiceImpl implements CursosService {
    private List<Curso> cursos;

    public CursosServiceImpl() {
        this.cursos = new ArrayList<>();
        this.cursos.add(new Curso(1, "Java", 40, 200));
        this.cursos.add(new Curso(2, "Python", 32, 120));
        this.cursos.add(new Curso(3, "C#", 50, 300));
    }

    @Override
    public List<Curso> cursos() {
        return this.cursos;
    }

    @Override
    public Curso buscarCurso(int codigo) {
        for (Curso curso : this.cursos) {
            if (curso.getCodigo() == codigo) {
                return curso;
            }
        }
        return null;
    }

    @Override
    public List<Curso> altaCurso(Curso curso) {
        this.cursos.add(curso);
        return this.cursos;
    }

    @Override
    public void actualizarCurso(int codigo, int duracion) {
        for (Curso curso : this.cursos) {
            if (curso.getCodigo() == codigo) {
                curso.setDuracion(duracion);
            }
        }
    }

    @Override
    public List<Curso> eliminarCurso(int codigo) {
        for (Curso curso : this.cursos) {
            if (curso.getCodigo() == codigo) {
                this.cursos.remove(curso);
            }
        }
        return this.cursos;
    }
}