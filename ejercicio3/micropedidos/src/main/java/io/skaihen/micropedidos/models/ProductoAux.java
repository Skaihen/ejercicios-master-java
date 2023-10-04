package io.skaihen.micropedidos.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductoAux {
    private int codigoProducto;
    private String nombre;
    private double precioUnitario;
    private int stock;

}
