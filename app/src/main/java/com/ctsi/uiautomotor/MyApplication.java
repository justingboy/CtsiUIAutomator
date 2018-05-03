package com.ctsi.uiautomotor;

import android.app.Application;

import com.bolex.autoEx.AutoEx;

/**
 * Created by wanglin on 2018/5/3.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AutoEx.apply(this);

    }

    /**
     * @param mApp    Applicatin
     * @param maxSize 最大提示答案数目
     * @param tag     自定义日志 默认 AutoEx
     * @param isDebug 是否开启调试 true为开启 false为关闭 默认开启
     */
    //public static void apply (Context mApp,int maxSize, String tag,boolean isDebug)
}
