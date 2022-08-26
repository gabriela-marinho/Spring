package io.github.gabrielamarinho.domain.repository;

import io.github.gabrielamarinho.domain.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemPedido extends JpaRepository<ItemPedido, Integer> {
}
