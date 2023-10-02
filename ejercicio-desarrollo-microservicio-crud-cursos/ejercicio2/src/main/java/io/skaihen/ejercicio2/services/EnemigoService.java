package io.skaihen.ejercicio2.services;

import java.util.List;

import io.skaihen.ejercicio2.models.Enemigo;

public interface EnemigoService {
    List<Enemigo> enemigos();

    Enemigo buscarEnemigo(int id);

    void nuevoEnemigo(Enemigo enemigo);

    void actualizarEnemigo(Enemigo enemigo);

    void eliminarEnemigo(int id);

    List<Enemigo> buscarEnemigoSpeedMin(int speedMin);

    List<Enemigo> buscarEnemigoHpEntreMinMax(int hpMin, int hpMax);
}
