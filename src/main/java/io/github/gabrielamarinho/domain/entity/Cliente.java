package io.github.gabrielamarinho.domain.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@AllArgsConstructor
@Table(name = "cliente")
public class Cliente  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "descricao")
    private String descricao;



}
