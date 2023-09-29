package io.skaihen.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import io.skaihen.model.Libro;

public class Queries {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bibilotecadb");
        EntityManager em = emf.createEntityManager();

        TypedQuery<Libro> consulta = em
                .createQuery("select l from Libro l", Libro.class);

        List<Libro> libros = consulta.getResultList();
        for (Libro libro : libros) {
            System.out.println(libro);
        }

    }
}
