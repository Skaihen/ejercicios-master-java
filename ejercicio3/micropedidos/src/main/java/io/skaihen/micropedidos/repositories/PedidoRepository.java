package io.skaihen.micropedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.skaihen.micropedidos.models.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}
