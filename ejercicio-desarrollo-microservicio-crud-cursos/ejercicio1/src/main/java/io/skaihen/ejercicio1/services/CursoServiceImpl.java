package io.skaihen.ejercicio1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.skaihen.ejercicio1.models.Curso;
import io.skaihen.ejercicio1.repositories.CursoRepository;

@Service
public class CursoServiceImpl implements CursoService {
    @Autowired
    CursoRepository cursoRepository;

    @Override
    public List<Curso> cursos() {
        return cursoRepository.findAll();
    }

    @Override
    public Curso buscarCurso(int codCurso) {
        return cursoRepository.findById(codCurso).orElse(null);
    }

    @Override
    public List<Curso> altaCurso(Curso curso) {
        cursoRepository.save(curso);
        return cursoRepository.findAll();
    }

    @Override
    public void actualizarCurso(Curso curso) {
        cursoRepository.save(curso);
    }

    @Override
    public List<Curso> eliminarCurso(int codCurso) {
        cursoRepository.deleteById(codCurso);
        return cursoRepository.findAll();
    }

    @Override
    public List<Curso> buscarCursoEntrePrecioMinMax(double hpMin, double hpMax) {
        return cursoRepository.findAllBetweenPriceMinMax(hpMin, hpMax);
    }
}
