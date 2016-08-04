package com.fly.mvpcleanarchitecture.ui.presenter;

import com.fly.mvpcleanarchitecture.ui.view.View;

/**
 * Created by Administrator on 2016/8/3.
 */
public abstract class NetPresenter<T extends View> extends BasePresenter implements Presenter<T>{

    protected T view;

    @Override
    public void setView(T view) {
        this.view = view;
    }
}
