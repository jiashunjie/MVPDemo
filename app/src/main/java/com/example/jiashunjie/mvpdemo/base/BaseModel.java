package com.example.jiashunjie.mvpdemo.base;

/**
 * Created by admin on 2016/11/24.
 */

public abstract class BaseModel<SubP> {
    protected SubP mPresenter;

    public BaseModel(SubP presenter) {
        this.mPresenter = presenter;
    }
    interface AsyncCallback {

        /**
         * 成功回调接口
         */
        void onSuccess(Object obj);

        /**
         * 失败回调接口
         */
        void onFailed(Object object);

        /**
         * 开始回调接口
         */
        void onStart(Object object);

        /**
         * 结束回调接口
         */
        void onFinish(Object object);
    }
}
