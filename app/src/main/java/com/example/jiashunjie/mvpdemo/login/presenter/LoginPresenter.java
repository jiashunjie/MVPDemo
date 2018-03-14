package com.example.jiashunjie.mvpdemo.login.presenter;

import com.example.jiashunjie.mvpdemo.base.BasePresenter;
import com.example.jiashunjie.mvpdemo.login.model.LoginModel;
import com.example.jiashunjie.mvpdemo.login.view.LoginView;

/**
 * Created by jiashunjie on 2018/3/12.
 */

public class LoginPresenter implements BasePresenter<LoginView> {
    private LoginView mView;
    private LoginModel mModel;

    public LoginPresenter(LoginView view) {
        attachView(view);
        mModel = new LoginModel(this);
    }

    @Override
    public void attachView(LoginView view) {
        this.mView = view;
    }

    @Override
    public void detachView() {
        this.mView = null;
    }

    public void login(String account, String passWord) {
        mView.showDialog();
        mModel.login(account, passWord);
    }

    public void loginSucess(Object object) {
        mView.loginSuccess(object);
    }

    public void loginFailed(Object object) {
        mView.loginFailed(object);
    }

    public void onComplete() {
        mView.dismissDialog();
    }
}
