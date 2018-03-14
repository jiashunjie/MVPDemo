package com.example.jiashunjie.mvpdemo.http;


import com.example.jiashunjie.mvpdemo.login.model.UserBean;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;


/**
 * Created by jiashunjie on 2018/3/12.
 */

public interface APIFunction {

    /**
     * 注册
     */
    @GET("register/register.do")
    Observable<BaseEntity<UserBean>> register(@QueryMap Map<String, String> map);

    /**
     * 登陆
     */
    @GET("login/androidLogin.do")
    Observable<BaseEntity<UserBean>> login(@QueryMap Map<String, String> map);

    @POST("获取新token的地址")
    Call<BaseEntity<String>> loginByToken(@Query("mobile") String mobile, @Query("token") String cookie);
}
