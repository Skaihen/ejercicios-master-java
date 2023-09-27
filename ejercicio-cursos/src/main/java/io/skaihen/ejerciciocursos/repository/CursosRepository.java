package io.skaihen.ejerciciocursos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.skaihen.ejerciciocursos.model.Curso;

public interface CursosRepository extends JpaRepository<Curso, Integer> {

}
