package io.github.gabrielamarinho;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

/*
RETORNA SOMENTE CONFIGURAÇÕES
 */
    @Bean
    public  String applicationName(){
        return  "Sistema de Vendas";
    }
}
