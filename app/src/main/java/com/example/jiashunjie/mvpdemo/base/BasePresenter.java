package com.example.jiashunjie.mvpdemo.base;

/**
 * Created by admin on 2016/11/24.
 */

public interface BasePresenter<V extends BaseView> {
    /**绑定接口*/
    void attachView(V view);

    /**释放接口*/
    void detachView();
}
