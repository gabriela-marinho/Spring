package io.github.gabrielamarinho.domain.repository;

import io.github.gabrielamarinho.domain.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface Clientes extends JpaRepository<Cliente, Integer> {
    @Query(value = "select c from Cliente c WHERE c.descricao LIKE :descricao")
    List<Cliente> findbyDescricao(String descricao);
    List<Cliente> findByNome(String nome);

    /*
    CONSULTA SQL NATIVA
     */
    @Query(value = " select * from cliente c where c.nome like '%:nome%' ", nativeQuery = true)
    List<Cliente> encontrarPorNome( @Param("nome") String nome );

}

