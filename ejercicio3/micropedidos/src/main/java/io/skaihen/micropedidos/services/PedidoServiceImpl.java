package io.skaihen.micropedidos.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.skaihen.micropedidos.models.Pedido;
import io.skaihen.micropedidos.models.ProductoAux;
import io.skaihen.micropedidos.repositories.PedidoRepository;

@Service
public class PedidoServiceImpl implements PedidoService {
    @Autowired
    RestTemplate restTemplate;

    @Autowired
    PedidoRepository pedidoRepository;

    private String url = "http://localhost:8080/";

    /**
     * The function "pedidos()" returns a list of all Pedido objects from the
     * pedidoRepository.
     *
     * @return The method is returning a List of Pedido objects.
     */
    @Override
    public List<Pedido> pedidos() {
        return pedidoRepository.findAll();
    }

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
    @Override
    public void altaPedido(int codigoProducto, int unidades) {
        Integer stockProducto = restTemplate.getForObject(url + "stock/" + codigoProducto, Integer.class);
        Double precioProducto = restTemplate.getForObject(url + "precio/" + codigoProducto, Double.class);

        if (stockProducto != null && precioProducto != null && stockProducto > unidades
                && (restTemplate.getForObject(url + "precio/" + codigoProducto, Double.class) != null)) {

            double totalPedido = precioProducto
                    * unidades;

            pedidoRepository.save(new Pedido(0, codigoProducto, unidades, totalPedido, LocalDateTime.now()));

            restTemplate.put(url + "producto/" + codigoProducto + "/" + (stockProducto - unidades),
                    ProductoAux.class);
        }
    }
}