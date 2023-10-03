package io.skaihen.microproductos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.skaihen.microproductos.models.Producto;
import io.skaihen.microproductos.repositories.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {
    @Autowired
    ProductoRepository productoRepository;

    @Override
    public List<Producto> productos() {
        return productoRepository.findAll();
    }

    @Override
    public void actualizarStockProducto(int codigoProducto, int stock) {
        productoRepository.findById(codigoProducto)
                .ifPresent(producto -> productoRepository.save(producto.setStock(stock)));
    }

    @Override
    public double buscarPrecioProducto(int codigoProducto) {
        return productoRepository.getReferenceById(codigoProducto).getPrecioUnitario();
    }
}
