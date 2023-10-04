package io.skaihen.micropedidos.services;

import java.util.List;

import io.skaihen.micropedidos.models.Pedido;

public interface PedidoService {

    /**
     * The function "pedidos()" returns a list of all Pedido objects from the
     * pedidoRepository.
     *
     * @return The method is returning a List of Pedido objects.
     */
    List<Pedido> pedidos();

    /**
     * The function `altaPedido` checks the stock and price of a product, creates a
     * new order if there is
     * enough stock, and updates the stock quantity.
     *
     * @param codigoProducto The codigoProducto parameter represents the code or
     *                       identifier of the product
     *                       for which the pedido (order) is being placed.
     * @param unidades       The parameter "unidades" represents the number of units
     *                       of a product that are being
     *                       requested in the order.
     */
    void altaPedido(int codigoProducto, int unidades);
}
