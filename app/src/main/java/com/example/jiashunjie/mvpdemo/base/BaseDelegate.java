package com.example.jiashunjie.mvpdemo.base;

import android.support.annotation.NonNull;

/**
 * Created by jiashunjie on 2018/3/12.
 */

public interface BaseDelegate<V extends BaseView, P extends BasePresenter<V>> {

    /**
     * 初始化presenter
     */
    @NonNull
    P createPresenter();

    /**
     * 获取presenter
     */
    @NonNull
    P getPresenter();

}
