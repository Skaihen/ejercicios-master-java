package io.skaihen.ejerciciocursos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.skaihen.ejerciciocursos.model.Curso;
import io.skaihen.ejerciciocursos.repository.CursosRepository;

@Service
public class CursosServiceImpl implements CursosService {
    @Autowired
    CursosRepository repository;

    @Override
    public List<Curso> cursos() {
        return repository.findAll();
    }

    @Override
    public Curso buscarCurso(int codigo) {
        return repository.existsById(codigo) ? repository.getReferenceById(codigo) : null;
    }

    @Override
    public List<Curso> altaCurso(Curso curso) {
        repository.save(curso);
        return repository.findAll();
    }

    @Override
    public void actualizarCurso(int codigo, int duracion) {
        repository.getReferenceById(codigo).setDuracion(duracion);
    }

    @Override
    public List<Curso> eliminarCurso(int codigo) {
        repository.deleteById(codigo);
        return repository.findAll();
    }
}