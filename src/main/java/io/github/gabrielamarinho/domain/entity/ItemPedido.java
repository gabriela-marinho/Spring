package io.github.gabrielamarinho.domain.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ItemPedido {

    private Integer id;
    private Pedido pedido;
    private Produto produto;
    private Integer quantidade;
}
