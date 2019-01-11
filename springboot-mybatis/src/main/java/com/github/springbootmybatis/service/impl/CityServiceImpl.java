package com.github.springbootmybatis.service.impl;

import com.github.springbootmybatis.dao.CityMapper;
import com.github.springbootmybatis.entity.City;
import com.github.springbootmybatis.service.CityService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityMapper cityMapper;

//    @Override
//    public City findCityByName(String cityName) {
//        return cityMapper.findByName(cityName);
//    }

    @Override
    public City selectByPrimaryKey(@Param("id") int id) {
        return cityMapper.selectByPrimaryKey(id);
    }
}
