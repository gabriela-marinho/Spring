package io.github.gabrielamarinho.rest.controller;

import io.github.gabrielamarinho.domain.entity.Cliente;
import io.github.gabrielamarinho.domain.repository.Clientes;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;


@Controller
@AllArgsConstructor
@RequestMapping("cliente")
public class ClienteController {

    private Clientes clientes;

    @GetMapping(value = "{id}")
    @ResponseBody
    public ResponseEntity<Cliente> getClienteById(@PathVariable Integer id){
           Optional<Cliente> cliente = clientes.findById(id);
           if(cliente.isPresent()){
               return ResponseEntity.ok(cliente.get());
           }
           return ResponseEntity.notFound().build();
    }
}
