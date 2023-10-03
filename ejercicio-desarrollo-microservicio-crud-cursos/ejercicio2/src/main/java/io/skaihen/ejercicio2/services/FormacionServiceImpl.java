package io.skaihen.ejercicio2.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.skaihen.ejercicio2.models.CursoAux;
import io.skaihen.ejercicio2.models.Formacion;

@Service
public class FormacionServiceImpl implements FormacionService {
    @Autowired
    RestTemplate template;

    private String url = "http://localhost:8080/";

    @Override
    public List<Formacion> formaciones() {
        List<Formacion> listaFormacion = new ArrayList<>();

        Arrays.asList(template.getForObject(url + "cursos", CursoAux[].class)).forEach(
                curso -> listaFormacion.add(
                        new Formacion(curso.getNombre(), curso.getDuracion() >= 50 ? 10 : 5, curso.getPrecio())));

        return listaFormacion;
    }

    @Override
    public void altaCurso(Formacion formacion) {

        boolean cursoExiste = false;

        for (CursoAux curso : Arrays.asList(template.getForObject(url + "cursos", CursoAux[].class))) {
            if (curso.getNombre().equals(formacion.getCurso())) {
                cursoExiste = true;
            }
        }

        if (!cursoExiste) {
            template.postForLocation(url + "curso",
                    new CursoAux(0, formacion.getCurso(), formacion.getAsignaturas() * 10, formacion.getPrecio()));
        }
    }
}