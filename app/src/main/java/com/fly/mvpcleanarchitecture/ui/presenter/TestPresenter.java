package com.fly.mvpcleanarchitecture.ui.presenter;

import com.fly.mvpcleanarchitecture.ui.view.View;

/**
 * Created by Administrator on 2016/8/3.
 */
public class TestPresenter extends NetPresenter<View.TestView> {

    public void sayHello() {
        if (view == null) {
            throw new NullPointerException("The View must not be null");
        }
        view.sayHello();
    }
}
