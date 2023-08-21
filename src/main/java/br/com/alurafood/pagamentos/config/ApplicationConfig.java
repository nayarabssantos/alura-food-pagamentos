package br.com.alurafood.pagamentos.config;

import br.com.alurafood.pagamentos.http.PedidoClient;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();

    }
}
