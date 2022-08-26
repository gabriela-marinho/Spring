package io.github.gabrielamarinho.domain.repository;

import io.github.gabrielamarinho.domain.entity.Cliente;
import io.github.gabrielamarinho.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto, Integer> {
}
