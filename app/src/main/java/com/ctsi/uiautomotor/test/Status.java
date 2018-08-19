package com.ctsi.uiautomotor.test;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import static com.ctsi.uiautomotor.test.Status.SUCCESS;

/**
 * Created by wanglin on 2018/8/18.
 */

@IntDef({SUCCESS, Status.FAILED})
@Retention(RetentionPolicy.SOURCE)
public @interface Status {
    //成功
    int SUCCESS = 1;
    //失败
    int FAILED = 0;
}
