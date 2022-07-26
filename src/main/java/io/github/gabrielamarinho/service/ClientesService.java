package io.github.gabrielamarinho.service;

import io.github.gabrielamarinho.module.Cliente;
import io.github.gabrielamarinho.repository.ClientesRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
@Getter
@Setter
@AllArgsConstructor
public class ClientesService {
/*
minha variavel de instancia
 */
    private ClientesRepository repository;

    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        this.repository.persistir(cliente);
    }

    public void validarCliente(Cliente cliente){
        //aplica validações
    }

}
