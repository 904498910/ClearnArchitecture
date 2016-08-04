package com.fly.mvpcleanarchitecture.ui.presenter;

import com.fly.mvpcleanarchitecture.app.MvpCleanApplication;
import com.fly.mvpcleanarchitecture.app.models.ApiService;

import javax.inject.Inject;

/**
 * Created by Administrator on 2016/8/3.
 */
public class BasePresenter {

    @Inject
    ApiService apiService;

    public BasePresenter() {
        MvpCleanApplication
                .getApplicationComponent().inject(this);
    }
}
