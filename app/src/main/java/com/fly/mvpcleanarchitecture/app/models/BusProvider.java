package com.fly.mvpcleanarchitecture.app.models;

import com.hwangjr.rxbus.Bus;

public class BusProvider {

    public static final String BACK_KEY_DOWN = "back_key_down";

    private static final Bus BUS = new Bus();

    private BusProvider() {
    }

    public static Bus getInstance() {
        return BUS;
    }
}