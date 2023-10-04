package io.skaihen.micropedidos.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The class "ProductoAux" is a data class in Java that represents a product
 * with its code, name, unit
 * price, and stock quantity.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductoAux {
    private int codigoProducto;
    private String nombre;
    private double precioUnitario;
    private int stock;

}
