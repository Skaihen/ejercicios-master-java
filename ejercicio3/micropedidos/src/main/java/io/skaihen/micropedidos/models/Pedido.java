package io.skaihen.micropedidos.models;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The class "Pedido" represents a order with its unique ID, product code,
 * number of units, total
 * price, and date.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "pedidos")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idPedido;
    private int codigoProducto;
    private int unidades;
    private double total;
    private LocalDateTime fecha;
}
