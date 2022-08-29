package io.github.gabrielamarinho.domain.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;


@Getter
@Setter
@Table(name = "CLIENTE")
@Entity

public class Cliente  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nome", length = 100)
    private String nome;

    @OneToMany( mappedBy = "cliente" , fetch = FetchType.LAZY )
    private List<Pedido> pedidos;


    public Cliente(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
