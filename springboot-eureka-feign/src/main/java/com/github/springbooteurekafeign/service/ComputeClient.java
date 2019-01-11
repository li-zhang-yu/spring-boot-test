package com.github.springbooteurekafeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("compute-service")
public interface ComputeClient {

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public int add(@RequestParam(value = "a") int a, @RequestParam(value = "b") int b);

}
