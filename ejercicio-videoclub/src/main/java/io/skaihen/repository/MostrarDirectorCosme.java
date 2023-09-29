package io.skaihen.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import io.skaihen.model.Pelicula;

public class MostrarDirectorCosme {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("videoclubdb");
        EntityManager em = emf.createEntityManager();

        TypedQuery<Pelicula> consulta = em
                .createQuery("select p from Pelicula p where p.nombreDirector = 'Cosme'", Pelicula.class);

        List<Pelicula> peliculas = consulta.getResultList();
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }

    }
}