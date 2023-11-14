package com.zemoso.springmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class PrototypeBean {
    @Bean
    @Scope("prototype")
    public String PrototypeBeans(){
        System.out.println("Prototype Bean is created");
        return "Prototype Bean";
    }
}

