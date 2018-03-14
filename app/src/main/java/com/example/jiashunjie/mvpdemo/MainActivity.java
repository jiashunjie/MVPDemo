package com.example.jiashunjie.mvpdemo;

import android.os.Bundle;
import android.support.annotation.NonNull;

import com.example.jiashunjie.mvpdemo.base.BaseActivity;
import com.example.jiashunjie.mvpdemo.login.presenter.LoginPresenter;
import com.example.jiashunjie.mvpdemo.login.view.LoginView;

public class MainActivity extends BaseActivity<LoginView, LoginPresenter> implements LoginView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPresenter.login("123", "123");
    }

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
