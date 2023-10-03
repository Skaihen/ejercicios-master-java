package io.skaihen.microproductos.services;

import java.util.List;

import io.skaihen.microproductos.models.Producto;

public interface ProductoService {
    List<Producto> productos();

    void actualizarStockProducto(int codigoProducto, int stock);

    double buscarPrecioProducto(int codigoProducto);
}
