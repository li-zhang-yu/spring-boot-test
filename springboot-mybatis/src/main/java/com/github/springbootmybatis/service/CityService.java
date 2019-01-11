package com.github.springbootmybatis.service;

import com.github.springbootmybatis.entity.City;

/**
 * 城市业务逻辑接口类
 */
public interface CityService {

//    /**
//     * 根据城市名字查询城市信息
//     * @param cityName
//     * @return
//     */
//    City findCityByName(String cityName);

    City selectByPrimaryKey(int id);

}
