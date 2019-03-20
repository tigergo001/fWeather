package com.tigergoo.fweather.util;

import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * Project:FWeather
 * com.tigergoo.fweather.util
 * Author : Ryan
 * Created :2019/3/16 23:30
 **/
public class HttpUtil {

    public static final MediaType JSON
            = MediaType.get("application/json; charset=utf-8");

    public static void sendRequest(String url,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(url).build();
        client.newCall(request).enqueue(callback);
    }

    public static void sendRequest(String url, String json,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        RequestBody body = RequestBody.create(JSON, json);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        client.newCall(request).enqueue(callback);

    }

}
