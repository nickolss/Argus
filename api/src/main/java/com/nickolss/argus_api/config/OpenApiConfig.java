package com.nickolss.argus_api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenApiConfig {
    @Bean
    OpenAPI customOpenAPI(){
        return new OpenAPI()
            .info(new Info()
                .title("Argus API")
                .description("O **Argus** é um sistema back-end projetado para **coletar, armazenar, analisar e gerar alertas de segurança** com base em registros de atividades (logs) provenientes de diferentes fontes, como servidores, APIs, dispositivos IoT, firewalls, entre outros.")
            );
    }
}
