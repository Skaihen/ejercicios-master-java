package io.skaihen.micropedidos.models;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Pedido {
    @Id
    private int idPedido;
    private int codigoProducto;
    private int unidades;
    private double totatl;
    private LocalDateTime fecha;
}
