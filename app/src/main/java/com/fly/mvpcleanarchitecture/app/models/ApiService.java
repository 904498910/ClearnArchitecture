package com.fly.mvpcleanarchitecture.app.models;

import android.database.Observable;

import com.fly.mvpcleanarchitecture.ui.entry.TestBean;

import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Administrator on 2016/8/3.
 */
public interface ApiService {

    @GET("/kedu/uc/login")
    Observable<TestBean> logon(@Query("mobile") String mobile, @Query("password") String pwd,
                                  @Query("devKey") String devKey,
                                  @Query("clientType") String clientType);
}
