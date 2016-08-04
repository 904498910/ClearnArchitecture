package com.fly.mvpcleanarchitecture.app;

import android.app.Application;

import com.fly.mvpcleanarchitecture.app.config.Constants;
import com.fly.mvpcleanarchitecture.app.dependencyinjection.ApiServiceModule;
import com.fly.mvpcleanarchitecture.app.dependencyinjection.ApplicationComponent;
import com.fly.mvpcleanarchitecture.app.dependencyinjection.ApplicationModule;
import com.fly.mvpcleanarchitecture.app.dependencyinjection.DaggerApplicationComponent;


/**
 * Created by Administrator on 2016/8/3.
 */
public class MvpCleanApplication extends Application {

    private static ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(this)).apiServiceModule(new
                ApiServiceModule(Constants.ServerUrl)).build();
    }

    public static ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}
