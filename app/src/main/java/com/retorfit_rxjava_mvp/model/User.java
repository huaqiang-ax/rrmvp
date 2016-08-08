package com.retorfit_rxjava_mvp.model;

/**
 * Created by huaqiang
 * on 2015-08-02.
 */
public class User {
    private String userName;
    private String userPass;

    public User() {
    }

    public User(String userName, String userPass) {
        this.userName = userName;
        this.userPass = userPass;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }
}
