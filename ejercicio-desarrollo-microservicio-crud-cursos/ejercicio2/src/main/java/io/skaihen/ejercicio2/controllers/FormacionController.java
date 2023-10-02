package io.skaihen.ejercicio2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import io.skaihen.ejercicio2.models.Formacion;
import io.skaihen.ejercicio2.services.FormacionService;

@RestController
public class FormacionController {

    @Autowired
    FormacionService formacionService;

    @GetMapping(value = "/formacions", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Formacion> formacions() {
        return formacionService.formacions();
    }

    @GetMapping(value = "/formacion/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Formacion buscarFormacion(@PathVariable("id") int id) {
        return formacionService.buscarFormacion(id);
    }

    @PostMapping(value = "/formacion", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void nuevoFormacion(Formacion formacion) {
        formacionService.nuevoFormacion(formacion);
    }

    @PutMapping(value = "/formacion", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void actualizarFormacion(Formacion formacion) {
        formacionService.actualizarFormacion(formacion);
    }

    @DeleteMapping(value = "/formacion/{id}")
    public void eliminarFormacion(@PathVariable("id") int id) {
        formacionService.eliminarFormacion(id);
    }

    @GetMapping(value = "/speed/{speedMin}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Formacion> buscarFormacionSpeedMin(@PathVariable("speedMin") int speedMin) {
        return formacionService.buscarFormacionSpeedMin(speedMin);
    }

    @GetMapping(value = "/hp/{hpMin}/{hpMax}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Formacion> buscarFormacionHpEntreMinMax(@PathVariable("hpMin") int hpMin,
            @PathVariable("hpMax") int hpMax) {
        return formacionService.buscarFormacionHpEntreMinMax(hpMin, hpMax);
    }
}
