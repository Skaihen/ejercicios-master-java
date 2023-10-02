package io.skaihen.ejercicio2.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.skaihen.ejercicio2.models.Formacion;

@Service
public class FormacionServiceImpl implements FormacionService {
    @Autowired
    RestTemplate template;

    private String url = "http://localhost:8080/";

    @Override
    public List<Formacion> formaciones() {
        return Arrays.asList(template.getForObject(url + "cursos", Formacion[].class));
    }

    @Override
    public void altaCurso(Formacion formacion) {
        template.postForLocation(url + "curso", formacion);
    }
}