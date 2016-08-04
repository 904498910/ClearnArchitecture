package com.fly.mvpcleanarchitecture.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.fly.mvpcleanarchitecture.app.models.BusProvider;

/**
 * Created by Administrator on 2016/8/3.
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        injectDependencies();
        BusProvider.getInstance().register(this);
    }

    @Override
    protected void onDestroy() {
        try {
            BusProvider.getInstance().unregister(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
        super.onDestroy();
    }

    public abstract void injectDependencies();
}
