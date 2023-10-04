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

    @Override
    public List<Pedido> pedidos() {
        return pedidoRepository.findAll();
    }

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