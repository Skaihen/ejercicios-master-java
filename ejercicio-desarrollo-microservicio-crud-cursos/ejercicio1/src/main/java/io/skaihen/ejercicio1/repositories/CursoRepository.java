package io.skaihen.ejercicio1.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import io.skaihen.ejercicio1.models.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer> {

    /**
     * This function retrieves a list of courses whose price falls within a
     * specified range.
     *
     * @param priceMin The minimum price value for the courses.
     * @param priceMax The maximum price value for the courses.
     * @return The method `findAllBetweenPriceMinMax` returns a list of `Curso`
     *         objects that have a price
     *         between the `priceMin` and `priceMax` values.
     */
    @Query("SELECT c FROM Curso c WHERE c.precio BETWEEN :priceMin AND :priceMax")
    List<Curso> findAllBetweenPriceMinMax(double priceMin, double priceMax);
}