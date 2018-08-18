package com.ctsi.uiautomotor.test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by wanglin on 2018/8/18.
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Profile {

    String id() default "";

    int age() default 23;

    int height() default 180;

}
