package com.github.springbootmybatis.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "城市实体类")
public class City {

    @ApiModelProperty(name = "id", value = "主键", required = false)
    private Integer id;

    @ApiModelProperty(name = "provinceId", value = "省份id", required = false)
    private Integer provinceId;

    @ApiModelProperty(name = "cityName", value = "城市名称", required = false)
    private String cityName;

    @ApiModelProperty(name = "description", value = "描述", required = false)
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;

    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

}