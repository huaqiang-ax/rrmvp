package com.retorfit_rxjava_mvp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.mj.core.mvp.MvpActivity;
import com.retorfit_rxjava_mvp.presenter.LoginPresenter;
import com.retorfit_rxjava_mvp.view.LoginView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;


/**
 * Created by huaqiang
 * on 2015-08-02.
 */

public class LoginActivity extends MvpActivity<LoginPresenter> implements LoginView {

    @Bind(R.id.et_Name)
    EditText etName;
    @Bind(R.id.et_Pass)
    EditText etPass;
    @Bind(R.id.btn_login)
    Button btnLogin;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }

    @Override
    protected LoginPresenter createPresenter() {
        return new LoginPresenter(this);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
    }

    @Override
    public void loginSuccess() {
      startActivity(new Intent(this,MainActivity.class));
    }

    @Override
    public void loginError() {

    }

    @Override
    public void setUserNameError() {

    }

    @Override
    public void setPassWordError() {

    }

    @Override
    public String getUserName() {
        return etName.getText().toString().trim();
    }

    @Override
    public String getPassWord() {
        return etPass.getText().toString().trim();
    }

    @Override
    public void setUserName(String userName) {

    }

    @Override
    public void setUserPassWord(String passWord) {

    }

    @OnClick({R.id.btn_login})
    public void onClick(View view){
        switch (view.getId()){
            case R.id.btn_login:
            mvpPresenter.login();
        }
    }


}
