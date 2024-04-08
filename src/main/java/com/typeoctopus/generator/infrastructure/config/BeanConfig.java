package com.typeoctopus.generator.infrastructure.config;

import com.typeoctopus.generator.domain.ports.output.IGetTextGateway;
import com.typeoctopus.generator.domain.usecase.GetTextUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class BeanConfig {

    @Bean
    public GetTextUseCase getTextUseCase (IGetTextGateway getTextGateway){
        return new GetTextUseCase(getTextGateway);
    }
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
