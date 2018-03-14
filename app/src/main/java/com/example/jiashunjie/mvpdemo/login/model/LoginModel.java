package com.example.jiashunjie.mvpdemo.login.model;

import android.text.TextUtils;

import com.example.jiashunjie.mvpdemo.base.BaseModel;
import com.example.jiashunjie.mvpdemo.http.ApiUtils;
import com.example.jiashunjie.mvpdemo.http.BaseEntity;
import com.example.jiashunjie.mvpdemo.http.BaseObserver;
import com.example.jiashunjie.mvpdemo.login.presenter.LoginPresenter;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;


/**
 * Created by jiashunjie on 2018/3/12.
 */

public class LoginModel extends BaseModel<LoginPresenter> {
    public LoginModel(LoginPresenter loginPresenter) {
        super(loginPresenter);
    }

    public void login(String account, String passWord) {
        int iMonth = Integer.valueOf(account).intValue();
        if (iMonth <= 0 || iMonth > 12) {
//            mPresenter.showMessage("只能输入1-12的月份");
            return;
        }
        if (TextUtils.isEmpty(passWord)) {
//            mPresenter.showMessage("天不能为空");
            return;
        }
        int iDay = Integer.valueOf(passWord).intValue();
        if (iDay <= 0 || iDay > 31) {
//            mPresenter.showMessage("只能输入1-31的天");
            return;
        }
        if (TextUtils.isEmpty(account)) {
//            mPresenter.showMessage("月份不能为空");
            return;
        }
        ApiUtils.getInstence()
                .login(account, passWord)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .subscribe(new BaseObserver<UserBean>() {
                    @Override
                    protected void onSuccees(BaseEntity<UserBean> t) throws Exception {
                        mPresenter.loginSucess(t);
                    }

                    @Override
                    protected void onFailure(Throwable e, boolean isNetWorkError) throws Exception {
                        mPresenter.loginFailed(e);
                    }
                });
    }
}
