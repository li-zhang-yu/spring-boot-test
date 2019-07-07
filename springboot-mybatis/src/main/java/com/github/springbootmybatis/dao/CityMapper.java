package com.github.springbootmybatis.dao;

import com.github.springbootmybatis.entity.City;
import org.apache.ibatis.annotations.Mapper;

public interface CityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(City record);

    int insertSelective(City record);

    City selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);
}