package com.fly.mvpcleanarchitecture.app.dependencyinjection;

import android.content.Context;

import com.fly.mvpcleanarchitecture.app.MvpCleanApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2016/3/23.
 */
@Module
public class ApplicationModule {

    private MvpCleanApplication application;

    public ApplicationModule(MvpCleanApplication application) {
        this.application = application;
    }

    @Provides
    @Singleton
    MvpCleanApplication providesContext() {
        return this.application;
    }

    @Provides
    @Singleton
    Context getContext() {
        return this.application;
    }

}
