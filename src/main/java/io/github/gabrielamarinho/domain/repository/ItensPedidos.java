package io.github.gabrielamarinho.domain.repository;

import io.github.gabrielamarinho.domain.entity.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItensPedidos extends JpaRepository<ItemPedido, Integer> {
}
