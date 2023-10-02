package io.skaihen.ejercicio1.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import io.skaihen.ejercicio1.models.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer> {

    @Query("SELECT c FROM Curso c WHERE c.precio BETWEEN :priceMin AND :priceMax")
    List<Curso> findAllBetweenPriceMinMax(double priceMin, double priceMax);
}