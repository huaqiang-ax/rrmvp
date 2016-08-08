package com.retorfit_rxjava_mvp.view;

/**
 * Created by huaqiang
 * on 2015-08-02.
 */
public interface LoginView {
    void loginSuccess();

    void loginError();

    void setUserNameError();

    void setPassWordError();

    String getUserName();

    String getPassWord();

    void setUserName(String userName);

    void setUserPassWord(String passWord);


}
