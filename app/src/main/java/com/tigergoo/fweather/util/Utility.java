package com.tigergoo.fweather.util;

import android.text.TextUtils;

import com.tigergoo.fweather.model.City;
import com.tigergoo.fweather.model.County;
import com.tigergoo.fweather.model.Province;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Project:FWeather
 * com.tigergoo.fweather.util
 * Author : Ryan
 * Created :2019/3/17 2:05
 **/
public class Utility {

    public static boolean hanleProvinceResponse(String response) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allProvinces = new JSONArray(response);

                for (int i = 0; i < allProvinces.length(); i++) {
                    JSONObject provinceObject = allProvinces.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceName(provinceObject.getString("name"));
                    province.setGetProvinceCode(provinceObject.getString("id"));
                    province.save();
                }
                return true;

            } catch (JSONException e) {
                e.printStackTrace();
            }

        }
        return false;
    }

    public static boolean handleCityResponse(String response, int provinceid) {
        if (!TextUtils.isEmpty(response)) {

            try {
                JSONArray allCities = new JSONArray(response);
                for (int i = 0; i < allCities.length(); i++) {

                    JSONObject cityObject = allCities.getJSONObject(i);
                    City city = new City();
                    city.setProvinceId(provinceid);
                    city.setCityName(cityObject.getString("name"));
                    city.setCityCode(cityObject.getString("id"));
                    city.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }

        }
        return false;
    }

    public static boolean handleCountyResponse(String response,int cityId){
        if(!TextUtils.isEmpty(response)){
            try {
                JSONArray allCounties = new JSONArray(response);

                for (int i = 0; i < allCounties.length(); i++) {

                    JSONObject countyObject = allCounties.getJSONObject(i);
                    County county = new County();
                    county.setCityId(cityId);
                    county.setCountyName(countyObject.getString("name"));
                    county.setWeatherId(countyObject.getString("weather_id"));
                    county.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

}
