package com.tigergoo.fweather.model;

import org.litepal.crud.LitePalSupport;

/**
 * Project:FWeather
 * com.tigergoo.fweather.model
 * Author : Ryan
 * Created :2019/3/16 21:56
 **/
public class Province extends LitePalSupport {

    private int id;

    private String provinceName;

    private String getProvinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getGetProvinceCode() {
        return getProvinceCode;
    }

    public void setGetProvinceCode(String getProvinceCode) {
        this.getProvinceCode = getProvinceCode;
    }
}
