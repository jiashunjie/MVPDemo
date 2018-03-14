package com.example.jiashunjie.mvpdemo.login.view;

import com.example.jiashunjie.mvpdemo.base.BaseView;

/**
 * Created by jiashunjie on 2018/3/12.
 */

public interface LoginView extends BaseView {
    /**
     * 登陆成功
     */
    void loginSuccess(Object object);

    /**
     * 登陆失败
     */
    void loginFailed(Object object);
}
