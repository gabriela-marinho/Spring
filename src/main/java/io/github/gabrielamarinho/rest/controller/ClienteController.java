package io.github.gabrielamarinho.rest.controller;

import io.github.gabrielamarinho.domain.entity.Cliente;
import io.github.gabrielamarinho.domain.repository.Clientes;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@Controller
@AllArgsConstructor
@RequestMapping("cliente")
public class ClienteController {

    private Clientes clientes;

    @GetMapping(value = "/{id}")
    @ResponseBody
    public ResponseEntity<Cliente> getClienteById(@PathVariable Integer id){
           Optional<Cliente> cliente = clientes.findById(id);
           if(cliente.isPresent()){
               return ResponseEntity.ok(cliente.get());
           }
           return ResponseEntity.notFound().build();
    }

    @PostMapping("/cadastro")
    @ResponseBody
    public ResponseEntity save ( @RequestBody Cliente cliente){
       Cliente clienteSalvo =  clientes.save(cliente);
       return ResponseEntity.ok(clienteSalvo);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public ResponseEntity delete (@PathVariable Integer id){
        Optional<Cliente> clienteDelete = clientes.findById(id);
        if(clienteDelete.isPresent()){
            clientes.delete(clienteDelete.get());
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/update/{id}")
    @ResponseBody
    public ResponseEntity update( @RequestBody Cliente cliente ,
                                  @PathVariable Integer id){
            return clientes.findById(id)
                    .map(clienteExistente -> {
                        cliente.setId(clienteExistente.getId());
                        /*
                        com o .map acima evita precisar setar cada propriedade da entidade como:
                        cliente.setId(clienteExistente.getId());
                        cliente.setNome(clienteExistente.getNome());
                         */
                        clientes.save(cliente);
                        return ResponseEntity.noContent().build();
                    }).orElseGet( () -> ResponseEntity.notFound().build());
    }

    @GetMapping("buscar")
    public ResponseEntity find( Cliente filtro ){
        ExampleMatcher matcher = ExampleMatcher
                .matching()
                .withIgnoreCase()
                .withStringMatcher(
                        ExampleMatcher.StringMatcher.CONTAINING );

        Example<Cliente> example = Example.of(filtro, matcher);
        List<Cliente> lista = clientes.findAll(example);
        return ResponseEntity.ok(lista);
    }

}
