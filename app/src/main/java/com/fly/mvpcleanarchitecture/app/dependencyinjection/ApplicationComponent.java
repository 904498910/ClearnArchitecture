package com.fly.mvpcleanarchitecture.app.dependencyinjection;

import com.fly.mvpcleanarchitecture.app.MvpCleanApplication;
import com.fly.mvpcleanarchitecture.app.models.ApiService;
import com.fly.mvpcleanarchitecture.ui.activity.MainActivity;
import com.fly.mvpcleanarchitecture.ui.presenter.BasePresenter;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Administrator on 2016/3/23.
 */
@Singleton
@Component(modules = {ApplicationModule.class, ApiServiceModule.class, PresenterModule.class,
        DbModule.class})
public interface ApplicationComponent {
    ApiService getApiService();

    MvpCleanApplication getApplication();

    void inject(BasePresenter presenter);

    void inject(MainActivity activity);
}
