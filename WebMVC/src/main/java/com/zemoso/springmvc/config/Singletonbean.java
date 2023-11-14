package com.zemoso.springmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Singletonbean {
    @Bean
    @Scope("singleton")
     public String DemoBeans(){
        System.out.println("Bean is created");
        return "Welcome Bean";
     }
}
