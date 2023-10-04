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

    @GetMapping(value = "/pedidos", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Pedido> pedidos() {
        return pedidoService.pedidos();
    }

    @PostMapping(value = "/pedido/{codigoProducto}/{unidades}")
    public void altaPedido(@PathVariable int codigoProducto, @PathVariable int unidades) {
        pedidoService.altaPedido(codigoProducto, unidades);
    }
}
