package io.skaihen.ejerciciocursos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import io.skaihen.ejerciciocursos.model.Curso;

public interface CursosRepository extends JpaRepository<Curso, Integer> {

    @Query("SELECT c FROM Curso c WHERE c.precio BETWEEN :precioMin AND :precioMax")
    List<Curso> findAllBetweenPrices(int precioMin, int precioMax);
}
