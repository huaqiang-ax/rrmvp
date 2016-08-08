package com.retorfit_rxjava_mvp.presenter;

import com.mj.core.mvp.BasePresenter;
import com.mj.core.retrofit.AppClient;
import com.mj.core.rxjava.ApiCallback;
import com.mj.core.rxjava.SubscriberCallBack;
import com.retorfit_rxjava_mvp.model.User;
import com.retorfit_rxjava_mvp.net.NetService;
import com.retorfit_rxjava_mvp.view.LoginView;

/**
 * Created by huaqiang
 * on 2015-08-02.
 */
public class LoginPresenter extends BasePresenter<LoginView> {
    public NetService netService= AppClient.retrofit(NetService.API_SERVER_URL).create(NetService.class);
    public LoginPresenter(LoginView loginView) {
        attachView(loginView);
    }

    public void login(){
        addSubscription(netService.login(mvpView.getUserName(),mvpView.getPassWord()),
                new SubscriberCallBack<>(new ApiCallback<User>() {
                    @Override
                    public void onSuccess(User model) {
                        mvpView.loginSuccess();
                    }

                    @Override
                    public void onFailure(int code, String msg) {
                        switch (msg){
                            case "userNameError":
                                mvpView.setUserNameError();
                            case "passWordError":
                                mvpView.setPassWordError();
                        }
                    }

                    @Override
                    public void onCompleted() {

                    }
                }));
    }
}
