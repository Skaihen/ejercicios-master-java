package io.skaihen.microproductos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import io.skaihen.microproductos.models.Producto;
import io.skaihen.microproductos.services.ProductoService;

@RestController
public class ProductoController {

    @Autowired
    ProductoService productoService;

    @GetMapping(value = "/productos", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Producto> productos() {
        return productoService.productos();
    }

    @PutMapping(value = "/producto/{codigoProducto}/{stock}")
    public void actualizarStockProducto(@PathVariable int codigoProducto, @PathVariable int stock) {
        productoService.actualizarStockProducto(codigoProducto, stock);
    }

    @GetMapping(value = "/producto/precio/{codigoProducto}", produces = MediaType.APPLICATION_JSON_VALUE)
    public double buscarPrecioProducto(@PathVariable int codigoProducto) {
        return productoService.buscarPrecioProducto(codigoProducto);
    }
}
