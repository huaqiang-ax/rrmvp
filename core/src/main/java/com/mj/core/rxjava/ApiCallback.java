package com.mj.core.rxjava;


/**
 * Created by huaqiang
 * on 2015-08-02.
 */
public interface ApiCallback<T> {

    void onSuccess(T model);

    void onFailure(int code, String msg);

    void onCompleted();

}
