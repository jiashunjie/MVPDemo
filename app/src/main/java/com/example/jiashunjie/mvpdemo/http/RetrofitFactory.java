package com.example.jiashunjie.mvpdemo.http;

import com.dou361.retrofit2.converter.fastjson.FastJsonConverterFactory;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * Created by jiashunjie on 2018/3/12.
 */

public class RetrofitFactory {

    public static final String URL = "http://192.168.1.101:8080/";
  

    protected static APIFunction API() {
        return API(null);
    }

    protected static APIFunction API(String ip) {
        return API(ip, 0, 0, 0);
    }

    protected static APIFunction API(String ip, long readTime, long connectTime, long writeTime) {

        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(connectTime <= 0 ? 30 : connectTime, TimeUnit.SECONDS)//设置连接超时时间
                .readTimeout(readTime <= 0 ? 30 : readTime, TimeUnit.SECONDS)//设置读取超时时间
                .writeTimeout(writeTime <= 0 ? 30 : writeTime, TimeUnit.SECONDS)//设置写入超时时间
                .addInterceptor(InterceptorUtil.tokenInterceptor())//添加其他拦截器
                .addInterceptor(InterceptorUtil.LogInterceptor())//添加日志拦截器
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ip == null ? URL : ip)
                .client(client)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())//添加rxjava转换器
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(FastJsonConverterFactory.create())
                .build();
        return retrofit.create(APIFunction.class);

    }

}
