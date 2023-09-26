package io.skaihen.springprueba.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {
    @GetMapping(value = "/sumar/{x}/{y}", produces = MediaType.TEXT_PLAIN_VALUE)
    public String sumar(@PathVariable("x") int valor1, @PathVariable("y") int valor2) {
        return "La suma es: " + (valor1 + valor2);
    }

    @GetMapping(value = "/restar/{x}/{y}", produces = MediaType.TEXT_PLAIN_VALUE)
    public String restar(@PathVariable("x") int valor1, @PathVariable("y") int valor2) {
        return "La resta es: " + (valor1 - valor2);
    }

    @GetMapping(value = "/multiplicar/{x}/{y}", produces = MediaType.TEXT_PLAIN_VALUE)
    public String multiplicar(@PathVariable("x") int valor1, @PathVariable("y") int valor2) {
        return "La multiplicación es: " + (valor1 * valor2);
    }

    @GetMapping(value = "/dividir/{x}/{y}", produces = MediaType.TEXT_PLAIN_VALUE)
    public String dividir(@PathVariable("x") int valor1, @PathVariable("y") int valor2) {
        return "La división es: " + (valor1 / valor2);
    }
}
