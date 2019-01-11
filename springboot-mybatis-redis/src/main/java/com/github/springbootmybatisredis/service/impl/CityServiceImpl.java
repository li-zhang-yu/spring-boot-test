package com.github.springbootmybatisredis.service.impl;

import com.github.springbootmybatisredis.dao.CityMapper;
import com.github.springbootmybatisredis.entity.City;
import com.github.springbootmybatisredis.service.CityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class CityServiceImpl implements CityService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CityServiceImpl.class);

    @Autowired
    private CityMapper cityMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public City selectByPrimaryKey(int id) {
        //从缓存中获取城市信息
        String key = "city_" + id;
        ValueOperations<String,City> operations = redisTemplate.opsForValue();

        //缓存存在
        boolean hasKey = redisTemplate.hasKey(key);
        if(hasKey){
            City city = operations.get(key);
            System.out.println(city);
            LOGGER.info("CityServiceImpl.selectByPrimaryKey() : 从缓存中获取了城市 >> " + city.toString());
            return city;
        }

        //从DB中获取城市信息
        City city = cityMapper.selectByPrimaryKey(id);

        //插入缓存
        operations.set(key, city, 10, TimeUnit.SECONDS);
        LOGGER.info("CityServiceImpl.selectByPrimaryKey() : 城市插入缓存 >> " + city.toString());

        return city;
    }

}
