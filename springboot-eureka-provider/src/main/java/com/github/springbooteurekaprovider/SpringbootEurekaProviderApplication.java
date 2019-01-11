package com.github.springbooteurekaprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringbootEurekaProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootEurekaProviderApplication.class, args);
    }

}

