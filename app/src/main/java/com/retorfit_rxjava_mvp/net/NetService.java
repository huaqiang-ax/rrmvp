package com.retorfit_rxjava_mvp.net;

import com.retorfit_rxjava_mvp.model.User;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by huaqiang
 * on 2015-08-02.
 */
public interface NetService {
    String API_SERVER_URL = "http://192.168.88.65:8080/";

    //登陆
    @GET("system_03/servlet/Hq")
    Observable<User> login(@Query("userName") String userName,@Query("userPass") String userPass);
}
