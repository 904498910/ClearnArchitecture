package com.fly.mvpcleanarchitecture.ui.activity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.fly.mvpcleanarchitecture.R;
import com.fly.mvpcleanarchitecture.app.MvpCleanApplication;
import com.fly.mvpcleanarchitecture.app.models.ApiService;
import com.fly.mvpcleanarchitecture.app.models.database.UserInfoDao;
import com.fly.mvpcleanarchitecture.ui.BaseActivity;
import com.fly.mvpcleanarchitecture.ui.entry.UserInfo;
import com.fly.mvpcleanarchitecture.ui.presenter.TestPresenter;
import com.fly.mvpcleanarchitecture.ui.view.View;
import com.orhanobut.logger.Logger;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity implements View.TestView {

    @Inject
    ApiService apiService;
    @Inject
    TestPresenter testPresenter;
    @Inject
    TestPresenter testPresenter2;
    @Inject
    UserInfoDao userInfoDao;
    @Bind(R.id.test_btn)
    Button testBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        testPresenter.setView(this);

        Logger.d(testPresenter.toString()+" "+testPresenter2.toString());
    }

    @Override
    public void injectDependencies() {
        MvpCleanApplication.getApplicationComponent().inject(this);
    }

    @OnClick(R.id.test_btn)
    public void onClick() {
        testPresenter.sayHello();
        UserInfo info = new UserInfo();
        info.setAge(10);
        info.setName("bao");
        userInfoDao.add(info);
        Logger.d("Db Insert Success");
    }

    @Override
    protected void onDestroy() {
        Logger.d("MainActivity Destroy");
        super.onDestroy();
    }

    @Override
    public void sayHello() {

        Toast.makeText(this, "啦啦啦啦", Toast.LENGTH_LONG).show();
    }
}
