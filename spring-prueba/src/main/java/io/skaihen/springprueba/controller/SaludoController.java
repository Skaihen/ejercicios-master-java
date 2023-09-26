package io.skaihen.springprueba.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.skaihen.springprueba.model.Info;

@RestController
public class SaludoController {
    @GetMapping(value = "/saludo/{nombre}/{apellido}", produces = MediaType.TEXT_PLAIN_VALUE)
    public String saludo(@PathVariable("nombre") String nombre, @PathVariable("apellido") String apellido) {
        return "Hola" + nombre + " " + apellido;
    }

    @GetMapping(value = "/informacion", produces = MediaType.APPLICATION_JSON_VALUE)
    public Info informacion() {
        return new Info("fernando", 33, "magicalonso@gmail.com");
    }
}
