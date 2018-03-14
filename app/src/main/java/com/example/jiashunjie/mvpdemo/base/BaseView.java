package com.example.jiashunjie.mvpdemo.base;

/**
 * Created by admin on 2016/11/24.
 */

public interface BaseView {
    /**
     * 请求开始
     */
    void showDialog();

    /**
     * 请求结束
     */
    void dismissDialog();

    /**
     * 请求失败
     */
    void onFailed(Object object);

}
