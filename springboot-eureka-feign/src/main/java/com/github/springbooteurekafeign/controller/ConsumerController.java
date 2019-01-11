package com.github.springbooteurekafeign.controller;

import com.github.springbooteurekafeign.service.ComputeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    private ComputeClient computeClient;

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public int add(){
        return computeClient.add(10,20);
    }

}
