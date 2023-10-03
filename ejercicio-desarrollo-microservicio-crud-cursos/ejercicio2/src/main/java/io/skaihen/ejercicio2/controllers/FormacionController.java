package io.skaihen.ejercicio2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.skaihen.ejercicio2.models.Formacion;
import io.skaihen.ejercicio2.services.FormacionService;

@RestController
public class FormacionController {

    @Autowired
    FormacionService formacionService;

    @GetMapping(value = "/formaciones", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Formacion> formaciones() {
        return formacionService.formaciones();
    }

    @PostMapping(value = "/formacion", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void altaCurso(@RequestBody Formacion formacion) {
        formacionService.altaCurso(formacion);
    }
}
