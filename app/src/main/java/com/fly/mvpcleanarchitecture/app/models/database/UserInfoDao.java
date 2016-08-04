package com.fly.mvpcleanarchitecture.app.models.database;

import android.content.Context;

import com.fly.mvpcleanarchitecture.ui.entry.UserInfo;
import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Administrator on 2016/8/4.
 */
public class UserInfoDao implements DBOperation<UserInfo> {

    private Context context;
    private Dao<UserInfo, Integer> dao;
    private DatabaseHelper helper;

    public UserInfoDao(Context context) {
        this.context = context;
        try {
            helper = DatabaseHelper.getHelper(context);
            dao = helper.getDao(UserInfo.class);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void add(UserInfo userInfo) {

        try {
            dao.createOrUpdate(userInfo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(UserInfo userInfo) {

        try {
            dao.delete(userInfo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(UserInfo userInfo) {

        try {
            dao.update(userInfo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<UserInfo> getAllData(int id) {
        return null;
    }
}
