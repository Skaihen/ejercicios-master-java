package io.skaihen.ejerciciocursos.service;

import java.util.List;
import java.util.Optional;

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
        Optional<Curso> curso = repository.findById(codigo);
        return curso.isPresent() ? curso.get() : null;
    }

    @Override
    public List<Curso> altaCurso(Curso curso) {
        repository.save(curso);
        return repository.findAll();
    }

    @Override
    public void actualizarCurso(int codigo, int duracion) {
        int precio = repository.getReferenceById(codigo).getPrecio();
        String nombre = repository.getReferenceById(codigo).getNombre();
        repository.save(new Curso(codigo, nombre, duracion, precio));
    }

    @Override
    public List<Curso> eliminarCurso(int codigo) {
        repository.deleteById(codigo);
        return repository.findAll();
    }

    @Override
    public List<Curso> buscarCursosRangoPrecio(int precioMin, int precioMax) {
        return repository.findAllBetweenPrices(precioMin, precioMax);
    }
}