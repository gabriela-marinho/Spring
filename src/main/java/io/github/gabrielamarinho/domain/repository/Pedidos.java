package io.github.gabrielamarinho.domain.repository;

import io.github.gabrielamarinho.domain.entity.Cliente;
import io.github.gabrielamarinho.domain.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Pedidos extends JpaRepository<Pedido, Integer> {
}
