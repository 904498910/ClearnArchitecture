package com.fly.mvpcleanarchitecture.ui.presenter;

import com.fly.mvpcleanarchitecture.ui.view.View;

/**
 * Created by Administrator on 2016/8/3.
 */
public interface Presenter<T extends View> {

    void setView(T t);
}
