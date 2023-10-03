package io.skaihen.micropedidos.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.skaihen.micropedidos.models.Pedido;

@Service
public class PedidoServiceImpl implements PedidoService {
    @Autowired
    RestTemplate template;

    private String url = "http://localhost:8080/";

    @Override
    public List<Pedido> pedidos() {
        List<Pedido> listaPedido = new ArrayList<>();

        Arrays.asList(template.getForObject(url + "productos", ProductoAux[].class)).forEach(
                producto -> listaPedido.add(
                        new Pedido(producto.getNombre(), producto.getDuracion() >= 50 ? 10 : 5, producto.getPrecio())));

        return listaPedido;
    }

    @Override
    public void altaProducto(Pedido pedido) {

        boolean productoExiste = false;

        for (ProductoAux producto : Arrays.asList(template.getForObject(url + "productos", ProductoAux[].class))) {
            if (producto.getNombre().equals(pedido.getProducto())) {
                productoExiste = true;
            }
        }

        if (!productoExiste) {
            template.postForLocation(url + "producto",
                    new ProductoAux(0, pedido.getProducto(), pedido.getAsignaturas() * 10, pedido.getPrecio()));
        }
    }
}