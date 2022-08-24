package io.github.gabrielamarinho.domain.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Table(name = "CLIENTE")
@Entity
public class Cliente  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "descricao", length = 100)
    private String descricao;



}
