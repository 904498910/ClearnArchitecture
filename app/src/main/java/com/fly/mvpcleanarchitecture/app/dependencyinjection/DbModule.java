package com.fly.mvpcleanarchitecture.app.dependencyinjection;

import android.content.Context;

import com.fly.mvpcleanarchitecture.app.models.database.UserInfoDao;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2016/8/4.
 */
@Module
public class DbModule {

    @Provides
    @Singleton
    UserInfoDao getUserInfoDao(Context context) {
        return new UserInfoDao(context);
    }
}
