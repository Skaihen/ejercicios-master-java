package io.skaihen.cliente.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.skaihen.cliente.models.Ejemplar;

@Service
public class EjemplarServiceImpl implements EjemplarService {
    @Autowired
    RestTemplate template;

    private String url = "https://localhost:8080/";

    @Override
    public List<Ejemplar> ejemplares() {
        return Arrays.asList(template.getForObject(url + "libros", Ejemplar[].class));
    }

    @Override
    public Ejemplar buscarEjemplar(int isbn) {
        return template.getForObject(url + "libro/" + isbn, Ejemplar.class);
    }

    @Override
    public List<Ejemplar> nuevoEjemplar(Ejemplar ejemplar) {
        template.postForLocation(url + "nuevo", ejemplar);

        return Arrays.asList(template.getForObject(url + "libros", Ejemplar[].class));
    }

    @Override
    public void actualizarEjemplar(Ejemplar ejemplar) {
        template.put(url + "actualizar", ejemplar);
    }

    @Override
    public List<Ejemplar> eliminarEjemplar(int isbn) {
        template.delete(url + "eliminar" + isbn);
        return Arrays.asList(template.getForObject(url + "libros", Ejemplar[].class));
    }

    @Override
    public List<Ejemplar> buscarPrecioMinMax(int precioMin, int precioMax) {
        return Arrays.asList(template.getForObject(url + "libros/" + precioMin + "/" + precioMax, Ejemplar[].class));
    }
}