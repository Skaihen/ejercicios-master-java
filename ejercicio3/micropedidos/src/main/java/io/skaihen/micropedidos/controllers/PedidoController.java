package io.skaihen.micropedidos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping(value = "/pedido", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void altaProducto(@RequestBody Pedido pedido) {
        pedidoService.altaProducto(pedido);
    }
}
