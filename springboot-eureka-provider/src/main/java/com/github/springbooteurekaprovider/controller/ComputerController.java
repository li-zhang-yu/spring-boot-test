package com.github.springbooteurekaprovider.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ComputerController {

    private final Logger logger = LoggerFactory.getLogger(ComputerController.class);

    @Autowired
    private DiscoveryClient client;

    @RequestMapping("/add")
    public int add(int a,int b){
        int r = a + b;
        logger.info("result:" + r);
        return r;
    }



}
