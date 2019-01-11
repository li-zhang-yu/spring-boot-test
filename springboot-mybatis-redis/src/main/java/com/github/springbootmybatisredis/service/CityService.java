package com.github.springbootmybatisredis.service;

import com.github.springbootmybatisredis.entity.City;

/**
 * 城市业务逻辑接口类
 */
public interface CityService {

    City selectByPrimaryKey(int id);

}
