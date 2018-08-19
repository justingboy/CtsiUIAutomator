package com.ctsi.uiautomotor.test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Created by wanglin on 2018/8/18.
 */

@Target(ElementType.FIELD)
public @interface Name {
    String value() default "";

    int SUCCESS = 1;
    int FAILED = 2;

}
