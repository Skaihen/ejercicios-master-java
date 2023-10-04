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

    /**
     * The function "productos()" returns a list of all products from the
     * "productoRepository".
     *
     * @return A List of Producto objects is being returned.
     */
    @Override
    public List<Producto> productos() {
        return productoRepository.findAll();
    }

    /**
     * The function `buscarStockProducto` returns the stock quantity of a product
     * given its code.
     *
     * @param codigoProducto The parameter "codigoProducto" is an integer that
     *                       represents the code of the
     *                       product that we want to search for in the stock.
     * @return The method is returning an integer value, which represents the stock
     *         of a product with the
     *         given product code.
     */
    @Override
    public int buscarStockProducto(int codigoProducto) {
        return productoRepository.getReferenceById(codigoProducto).getStock();
    }

    /**
     * The function `actualizarStockProducto` updates the stock of a product with
     * the given product code.
     *
     * @param codigoProducto The codigoProducto parameter is an integer that
     *                       represents the code of the
     *                       product whose stock needs to be updated.
     * @param stock          The stock parameter represents the new stock quantity
     *                       that will be updated for the
     *                       product with the given codigoProducto (product code).
     */
    @Override
    public void actualizarStockProducto(int codigoProducto, int stock) {
        productoRepository.findById(codigoProducto)
                .ifPresent(producto -> {
                    producto.setStock(stock);
                    productoRepository.save(producto);
                });
    }

    /**
     * The function "buscarPrecioProducto" returns the price of a product based on
     * its code.
     *
     * @param codigoProducto The parameter "codigoProducto" is an integer that
     *                       represents the code of the
     *                       product that we want to search for.
     * @return The method is returning the price of a product with the given product
     *         code.
     */
    @Override
    public double buscarPrecioProducto(int codigoProducto) {
        return productoRepository.getReferenceById(codigoProducto).getPrecioUnitario();
    }
}
