package io.skaihen.cliente.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import io.skaihen.cliente.models.Ejemplar;
import io.skaihen.cliente.services.EjemplarService;

@RestController
public class EjemplarController {

    @Autowired
    EjemplarService ejemplarService;

    public List<Ejemplar> ejemplares() {
        return ejemplarService.ejemplares();
    }
}
