package io.skaihen.cliente.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.skaihen.cliente.models.Ejemplar;

@Service
public class EjemplarServiceImpl {
    @Autowired
    RestTemplate template;

    private String url = "https://localhost:8080/";

    @Override
    public List<Ejemplar> nuevoEjemplar(Ejemplar ejemplar) {
        template.postForLocation(url + "libro", ejemplar);

        return Arrays.asList(template.getForObject(url + "libros", Ejemplar[].class));
    }

}
