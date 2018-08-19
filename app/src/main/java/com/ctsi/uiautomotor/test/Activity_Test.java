package com.ctsi.uiautomotor.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IntDef;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by wanglin on 2018/8/17.
 */

public class Activity_Test extends AppCompatActivity {


    public static void start(Activity activity, ActResultManager.Callback callback) {
        Intent intent = new Intent(activity, Activity_Test.class);
        startForResult(activity, callback, intent);
    }

    public static void start(Activity activity) {
        start(activity, null);
    }


    protected static void startForResult(Activity activity, ActResultManager.Callback callback, Intent intent) {
        if (callback != null) {
            ActResultManager actResultManager = ActResultManager.getInstance(activity);
            actResultManager.startForResult(intent, callback);
        } else {
            activity.startActivityForResult(intent, 100);
        }
    }

    @IntDef({Mode.GOBACK, Mode.GOPRE})
    @Retention(RetentionPolicy.SOURCE)
    private @interface Mode {
        int GOBACK = 1;
        int GOPRE = 2;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        @Mode
//        int currentDay = 2;
//        switch (currentDay) {
//            case Mode.GOBACK:
//                break;
//            case Mode.GOPRE:
//                break;
//        }

        play(Status.FAILED);

    }

    @Status
    int age = 1;

    private void play(@Status int code) {

        @Status
        int age = 1;
        switch (age) {
            case Status.FAILED:
                break;
            case Status.SUCCESS:
                break;
        }
    }

    @Override
    public void onBackPressed() {
        setResult(Activity.RESULT_OK);
        finish();
    }
}
