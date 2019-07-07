package com.github.springbootmybatis.controller;

import com.github.springbootmybatis.entity.City;
import com.github.springbootmybatis.service.CityService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/test")
@Api(value = "城市的增删改查")
public class CityRestController {

    @Autowired
    private CityService cityService;

    @RequestMapping("/hello")
    @ApiOperation(value = "测试SpringBoot项目")
    public String hello(){
        return "你好";
    }

//    @RequestMapping("/findCityByName")
//    public City findCityByName(String cityName){
//        return cityService.findCityByName(cityName);
//    }

    /**
     * 根据id
     * @param id 查询城市
     * @return
     */
    @RequestMapping(value = "/findById", method = RequestMethod.POST)
    @ApiOperation(value = "获取城市")
    public City findById(@RequestParam int id){
        return cityService.selectByPrimaryKey(id);
    }

//    @RequestMapping("/insert")
//    public void insert() {
//        City city = new City();
//        Long begin = new Date().getTime();
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 100000; j++) {
////                city.setId(i * j);
//                city.setCityName(String.valueOf(i * j));
//                city.setDescription(String.valueOf(i * j));
//                city.setProvinceId(i * j);
//                cityService.insert(city);
//            }
//        }
//        // 结束时间
//        Long end = new Date().getTime();
//        // 耗时
//        System.out.println("100万条数据插入花费时间 : " + (end - begin) / 1000 + " s"+"  插入完成");
//    }




}
