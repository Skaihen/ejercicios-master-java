package io.skaihen.ejerciciocursos.repository;

import java.util.List;

import io.skaihen.ejerciciocursos.model.Curso;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class CursosQueries {
    private CursosQueries() {

    }

    public static void where() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("cursos");

        try (EntityManager em = emf.createEntityManager()) {
            TypedQuery<Curso> consulta = em
                    .createQuery("select c from Curso c where c.precio > 50", Curso.class);

            List<Curso> cursos = consulta.getResultList();
            for (Curso curso : cursos) {
                System.out.println(curso);
            }
        }
    }

    public static void between() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("cursos");

        try (EntityManager em = emf.createEntityManager()) {
            TypedQuery<Curso> consulta = em
                    .createQuery("select c from Curso c where c.precio between 43 and 50", Curso.class);

            List<Curso> cursos = consulta.getResultList();
            for (Curso curso : cursos) {
                System.out.println(curso);
            }
        }
    }
}