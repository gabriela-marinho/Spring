package io.github.gabrielamarinho.rest.controller;

import io.github.gabrielamarinho.domain.entity.Cliente;
import io.github.gabrielamarinho.domain.repository.Clientes;
import lombok.AllArgsConstructor;
import org.hibernate.hql.internal.ast.tree.ResolvableNode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

import static org.springframework.http.ResponseEntity.ok;

@Controller
@RequestMapping(value = "/clientes", method = RequestMethod.GET)
@AllArgsConstructor
public class ClienteController {

    private Clientes clientesRepository;

    @GetMapping("/{podeSerQlqNome}")
    @ResponseBody
    public ResponseEntity<Cliente> getClienteById( @PathVariable("podeSerQlqNome") Integer id){
       Optional<Cliente> cliente = clientesRepository.findById(id);
        if(cliente.isPresent()){
          return ResponseEntity.ok(cliente.get());
        }
        return ResponseEntity.notFound().build();
    }
    @PostMapping
    @ResponseBody
    public ResponseEntity save(@RequestBody Cliente cliente){
        Cliente clienteSalvo = clientesRepository.save(cliente);
        return ResponseEntity.ok(clienteSalvo);
    }
}
