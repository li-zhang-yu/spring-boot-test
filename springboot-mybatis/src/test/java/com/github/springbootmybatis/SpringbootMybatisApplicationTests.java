package com.github.springbootmybatis;

import com.github.springbootmybatis.entity.City;
import com.github.springbootmybatis.service.CityService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisApplicationTests {

    @Autowired
    private CityService cityService;

    @Test
    public void contextLoads() {
        for (int i = 1; i <= 10; i++) {
            insert();
        }
    }

        public void insert() {
        City city = new City();
        Long begin = new Date().getTime();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 100000; j++) {
//                city.setId(i * j);
                city.setCityName(String.valueOf(i * j));
                city.setDescription(String.valueOf(i * j));
                city.setProvinceId(i * j);
                cityService.insert(city);
            }
        }
        // 结束时间
        Long end = new Date().getTime();
        // 耗时
        System.out.println("100万条数据插入花费时间 : " + (end - begin) / 1000 + " s"+"  插入完成");
    }



}

