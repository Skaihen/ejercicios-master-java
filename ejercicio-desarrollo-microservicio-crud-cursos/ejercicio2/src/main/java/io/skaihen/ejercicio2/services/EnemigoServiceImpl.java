package io.skaihen.ejercicio2.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.skaihen.ejercicio2.models.Enemigo;

@Service
public class EnemigoServiceImpl implements EnemigoService {
    @Autowired
    RestTemplate template;

    private String url = "http://localhost:8080/";

    @Override
    public List<Enemigo> enemigos() {
        return Arrays.asList(template.getForObject(url + "cursos", Enemigo[].class));
    }

    @Override
    public Enemigo buscarEnemigo(int id) {
        return template.getForObject(url + "curso/" + id, Enemigo.class);
    }

    @Override
    public void nuevoEnemigo(Enemigo enemigo) {
        template.postForLocation(url + "curso", enemigo);
    }

    @Override
    public void actualizarEnemigo(Enemigo enemigo) {
        template.put(url + "curso", enemigo);
    }

    @Override
    public void eliminarEnemigo(int id) {
        template.delete(url + "curso/" + id);
    }

    @Override
    public List<Enemigo> buscarEnemigoSpeedMin(int speedMin) {
        return Arrays.asList(template.getForObject(url + "speed/" + speedMin, Enemigo[].class));
    }

    @Override
    public List<Enemigo> buscarEnemigoHpEntreMinMax(int hpMin, int hpMax) {
        return Arrays.asList(template.getForObject(url + "hp/" + hpMin + "/" + hpMax, Enemigo[].class));
    }
}