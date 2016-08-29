package com.fly.mvpcleanarchitecture.utils;

import android.app.ActivityManager;
import android.content.Context;

import java.util.List;

/**
 * Created by Administrator on 2016/8/29.
 */
public class FunctionUtil {

    public static boolean isBackground(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        List<ActivityManager.RunningAppProcessInfo> appProcesses = activityManager.getRunningAppProcesses();
        for (ActivityManager.RunningAppProcessInfo appProcess : appProcesses) {
            if (appProcess.processName.equals(context.getPackageName())) {
                if (appProcess.importance == ActivityManager.RunningAppProcessInfo.IMPORTANCE_FOREGROUND) {
                    System.out.print(String.format("Foreground App:", appProcess.processName));
                    return false;
                }else{
                    System.out.print("Background App:"+appProcess.processName);
                    return true;
                }
            }
        }
        return false;
    }
}
