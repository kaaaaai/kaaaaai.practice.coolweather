package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by kelianzhikong on 2017/6/23.
 */

public class HttpUtil {

    //发起HTTP请求，调用sendOkHttpRequest（）方法，传入请求地址，并注册一个毁掉来处理服务器响应
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
