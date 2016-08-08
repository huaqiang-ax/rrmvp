package com.mj.core.mvp;

public interface Presenter<V> {

    void attachView(V view);

    void detachView();

}
