package com.fly.mvpcleanarchitecture.app.dependencyinjection;

import com.fly.mvpcleanarchitecture.ui.presenter.TestPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2016/8/3.
 */
@Module
public class PresenterModule {

    @Provides
    TestPresenter testPresenter() {
        return new TestPresenter();
    }
}
