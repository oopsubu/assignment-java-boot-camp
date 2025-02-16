package com.example.week1;

import org.modelmapper.ModelMapper;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfiguration {

    @Bean
    public RestTemplate createRestTemplate(){
        return new RestTemplateBuilder().build();
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
