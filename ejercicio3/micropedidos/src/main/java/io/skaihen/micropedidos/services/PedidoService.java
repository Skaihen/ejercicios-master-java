package io.skaihen.micropedidos.services;

import java.util.List;

import io.skaihen.micropedidos.models.Pedido;

public interface PedidoService {
    List<Pedido> pedidos();

    void altaProducto(Pedido pedido);
}
