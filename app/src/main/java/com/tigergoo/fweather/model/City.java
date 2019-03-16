package com.tigergoo.fweather.model;

import org.litepal.crud.LitePalSupport;

/**
 * Project:FWeather
 * com.tigergoo.fweather.model
 * Author : Ryan
 * Created :2019/3/16 22:06
 **/
public class City extends LitePalSupport {

    private int id;

    private String cityName;

    private String cityCode;

    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
