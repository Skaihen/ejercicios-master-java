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
    public List<Formacion> formacions() {
        return Arrays.asList(template.getForObject(url + "cursos", Formacion[].class));
    }

    @Override
    public Formacion buscarFormacion(int id) {
        return template.getForObject(url + "curso/" + id, Formacion.class);
    }

    @Override
    public void nuevoFormacion(Formacion formacion) {
        template.postForLocation(url + "curso", formacion);
    }

    @Override
    public void actualizarFormacion(Formacion formacion) {
        template.put(url + "curso", formacion);
    }

    @Override
    public void eliminarFormacion(int id) {
        template.delete(url + "curso/" + id);
    }

    @Override
    public List<Formacion> buscarFormacionSpeedMin(int speedMin) {
        return Arrays.asList(template.getForObject(url + "speed/" + speedMin, Formacion[].class));
    }

    @Override
    public List<Formacion> buscarFormacionHpEntreMinMax(int hpMin, int hpMax) {
        return Arrays.asList(template.getForObject(url + "hp/" + hpMin + "/" + hpMax, Formacion[].class));
    }
}