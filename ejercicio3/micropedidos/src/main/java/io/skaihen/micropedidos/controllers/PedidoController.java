package io.skaihen.micropedidos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import io.skaihen.micropedidos.models.Pedido;
import io.skaihen.micropedidos.services.PedidoService;

@RestController
public class PedidoController {

    @Autowired
    PedidoService pedidoService;

    /**
     * The function "pedidos" returns a list of Pedido objects.
     *
     * @return A list of Pedido objects is being returned.
     */
    @GetMapping(value = "/pedidos", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Pedido> pedidos() {
        return pedidoService.pedidos();
    }

    /**
     * The function `altaPedido` in the `PedidoController` class receives the
     * `codigoProducto` and
     * `unidades` as path variables and calls the `altaPedido` method in the
     * `pedidoService` to create a
     * new pedido.
     *
     * @param codigoProducto The codigoProducto parameter is an integer that
     *                       represents the code of the
     *                       product for which the pedido (order) is being placed.
     * @param unidades       The "unidades" parameter represents the number of units
     *                       of the product that the
     *                       customer wants to order.
     */
    @PostMapping(value = "/pedido/{codigoProducto}/{unidades}")
    public void altaPedido(@PathVariable int codigoProducto, @PathVariable int unidades) {
        pedidoService.altaPedido(codigoProducto, unidades);
    }
}
