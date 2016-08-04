package com.fly.mvpcleanarchitecture.app.models.database;

import java.util.List;

/**
 * Created by lalala on 2016/5/7.
 */
public interface DBOperation<T> {

    void add(T t);

    void delete(T t);

    void update(T t);

    List<T> getAllData(int id);
}
