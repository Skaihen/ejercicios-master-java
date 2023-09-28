package io.skaihen.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class MostrarDirectores {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("videoclubdb");
        EntityManager em = emf.createEntityManager();

        TypedQuery<String> consulta = em
                .createQuery("select p.nombreDirector from Pelicula p", String.class);

        List<String> peliculas = consulta.getResultList();
        for (String pelicula : peliculas) {
            System.out.println(pelicula);
        }

    }
}
