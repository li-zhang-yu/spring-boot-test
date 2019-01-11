package com.github.springbootdemo.demo;

import org.springframework.context.annotation.Bean;

public class MyConfig {

    @Bean
    public Man getMan(){
        return new Man();
    }

    @Bean
    public Woman getWoman(){
        return new Woman();
    }

}
