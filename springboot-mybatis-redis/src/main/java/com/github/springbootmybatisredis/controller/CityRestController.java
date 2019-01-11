package com.github.springbootmybatisredis.controller;

import com.github.springbootmybatisredis.entity.City;
import com.github.springbootmybatisredis.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class CityRestController {

    @Autowired
    private CityService cityService;

    @RequestMapping("/select")
    public City selectByPrimaryKey(int id){
        return cityService.selectByPrimaryKey(id);
    }




}
