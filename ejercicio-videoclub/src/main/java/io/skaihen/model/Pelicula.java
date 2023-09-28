package io.skaihen.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "peliculas")
public class Pelicula {
    @Id
    @GeneratedValue
    private int codigo = 0;
    private String titulo;
    private String nombreDirector;
    private int precioAlquiler;

    public Pelicula() {
        super();
    }

    public Pelicula(int codigo, String titulo, String nombreDirector, int precioAlquiler) {
        super();
        this.codigo = codigo;
        this.titulo = titulo;
        this.nombreDirector = nombreDirector;
        this.precioAlquiler = precioAlquiler;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNombreDirector() {
        return nombreDirector;
    }

    public void setNombreDirector(String nombreDirector) {
        this.nombreDirector = nombreDirector;
    }

    public int getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(int precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    @Override
    public String toString() {
        return "Pelicula [codigo=" + codigo + ", titulo=" + titulo + ", nombreDirector=" + nombreDirector
                + ", precioAlquiler=" + precioAlquiler + "]";
    }
}