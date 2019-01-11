package com.github.springbootmybatis.controller;

import com.github.springbootmybatis.entity.City;
import com.github.springbootmybatis.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class CityRestController {

    @Autowired
    private CityService cityService;

    @RequestMapping("/hello")
    public String hello(){
        return "你好";
    }

//    @RequestMapping("/findCityByName")
//    public City findCityByName(String cityName){
//        return cityService.findCityByName(cityName);
//    }

    @RequestMapping("/findById")
    public City findById(int id){
        return cityService.selectByPrimaryKey(id);
    }


}
