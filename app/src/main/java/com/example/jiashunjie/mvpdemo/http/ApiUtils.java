package com.example.jiashunjie.mvpdemo.http;


import com.example.jiashunjie.mvpdemo.login.model.UserBean;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observable;


/**
 * Created by jiashunjie on 2018/3/12.
 */

public class ApiUtils extends RetrofitFactory {
    private static ApiUtils apiUtils;

    public static ApiUtils getInstence() {
        if (apiUtils == null) {
            synchronized (RetrofitFactory.class) {
                if (apiUtils == null)
                    apiUtils = new ApiUtils();
            }

        }
        return apiUtils;
    }

    /**
     * 注册
     *
     * @param account
     * @param passWord
     * @return
     */
    public static Observable<BaseEntity<UserBean>> register(String account, String passWord) {
        Map<String, String> map = new HashMap<>();
        map.put("account", account);
        map.put("passWord", passWord);
        return API().register(map);
    }

    /**
     * 登陆
     *
     * @param account
     * @param passWord
     * @return
     */
    public static Observable<BaseEntity<UserBean>> login(String account, String passWord) {
        Map<String, String> map = new HashMap<>();
        map.put("account", account);
        map.put("passWord", passWord);
        return API().login(map);
    }
}
