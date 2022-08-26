package io.github.gabrielamarinho.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/clientes", method = RequestMethod.GET)
public class ClienteController {

    @RequestMapping(value = "hello/{nome}")
    @ResponseBody
    public String helloCliente( @PathVariable("nome") String nomeCliente ){
        return String.format("Hello %s ", nomeCliente);
    }
}
