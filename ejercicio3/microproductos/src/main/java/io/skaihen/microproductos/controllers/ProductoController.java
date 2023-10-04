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

    /**
     * The function "productos" returns a list of Producto objects in JSON format.
     *
     * @return A List of Producto objects is being returned.
     */
    @GetMapping(value = "/productos", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Producto> productos() {
        return productoService.productos();
    }

    /**
     * The function "buscarStockProducto" returns the stock of a product given its
     * code.
     *
     * @param codigoProducto The parameter "codigoProducto" is an integer value that
     *                       represents the code of
     *                       a product.
     * @return The method is returning an integer value, which represents the stock
     *         of a product.
     */
    @GetMapping(value = "/stock/{codigoProducto}", produces = MediaType.APPLICATION_JSON_VALUE)
    public int buscarStockProducto(@PathVariable int codigoProducto) {
        return productoService.buscarStockProducto(codigoProducto);
    }

    /**
     * This Java function updates the stock of a product based on its product code.
     *
     * @param codigoProducto The codigoProducto parameter is an integer that
     *                       represents the code of the
     *                       product that needs to be updated.
     * @param stock          The stock parameter represents the new stock value that
     *                       will be updated for the product
     *                       with the given codigoProducto.
     */
    @PutMapping(value = "/producto/{codigoProducto}/{stock}")
    public void actualizarStockProducto(@PathVariable int codigoProducto, @PathVariable int stock) {
        productoService.actualizarStockProducto(codigoProducto, stock);
    }

    /**
     * This Java function retrieves the price of a product based on its product
     * code.
     *
     * @param codigoProducto The parameter "codigoProducto" is an integer that
     *                       represents the code of a
     *                       product.
     * @return The method is returning a double value, which represents the price of
     *         a product.
     */
    @GetMapping(value = "/precio/{codigoProducto}", produces = MediaType.APPLICATION_JSON_VALUE)
    public double buscarPrecioProducto(@PathVariable int codigoProducto) {
        return productoService.buscarPrecioProducto(codigoProducto);
    }
}
