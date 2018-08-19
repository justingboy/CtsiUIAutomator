package com.ctsi.uiautomotor.test;

import android.support.annotation.IntDef;

/**
 * Created by wanglin on 2018/8/19.
 */

@IntDef({MyAA.SUCCESS, MyAA.FAILED})
public @interface MyAA {
    int SUCCESS = 1;
    int FAILED = 2;
}

