package io.skaihen.microproductos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.skaihen.microproductos.models.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {
}