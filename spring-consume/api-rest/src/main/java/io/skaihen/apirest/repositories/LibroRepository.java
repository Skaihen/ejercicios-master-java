package io.skaihen.apirest.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import io.skaihen.apirest.models.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Integer> {
    @Query("SELECT l FROM Libro l WHERE l.precio BETWEEN :precioMin AND :precioMax")
    List<Libro> findAllPriceBetween(int precioMin, int precioMax);
}