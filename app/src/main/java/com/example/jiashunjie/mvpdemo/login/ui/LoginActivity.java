package com.example.jiashunjie.mvpdemo.login.ui;

import android.support.annotation.NonNull;

import com.example.jiashunjie.mvpdemo.base.BaseActivity;
import com.example.jiashunjie.mvpdemo.login.presenter.LoginPresenter;
import com.example.jiashunjie.mvpdemo.login.view.LoginView;

/**
 * Created by jiashunjie on 2018/3/12.
 */

public class LoginActivity extends BaseActivity<LoginView, LoginPresenter> implements LoginView {
    @NonNull
    @Override
    public LoginPresenter createPresenter() {
        return new LoginPresenter(this);
    }

    @Override
    public void showDialog() {

    }

    @Override
    public void dismissDialog() {

    }

    @Override
    public void onFailed(Object object) {

    }

    @Override
    public void loginSuccess(Object object) {

    }

    @Override
    public void loginFailed(Object object) {

    }
}
