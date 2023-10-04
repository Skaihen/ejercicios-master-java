package io.skaihen.microproductos.services;

import java.util.List;

import io.skaihen.microproductos.models.Producto;

public interface ProductoService {
    /**
     * The function "productos()" returns a list of all products from the
     * "productoRepository".
     *
     * @return A List of Producto objects is being returned.
     */
    List<Producto> productos();

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
    int buscarStockProducto(int codigoProducto);

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
    void actualizarStockProducto(int codigoProducto, int stock);

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
    double buscarPrecioProducto(int codigoProducto);
}
