package com.ctsi.uiautomotor.test;

import android.util.Log;

import java.lang.reflect.Field;

/**
 * Created by wanglin on 2018/8/18.
 */

public class AnnotationParseUtils {

    public static void parse(Class<?> cls) {

        String name = "";
        String gander = "";
        String profile = "";

        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(Name.class)) {
                Name name1 = field.getAnnotation(Name.class);
                name = name1.value();
            }
            if (field.isAnnotationPresent(Gander.class)) {
                Gander gander1 = field.getAnnotation(Gander.class);
                gander = gander1.gander().toString();
            }
            if (field.isAnnotationPresent(Profile.class)) {
                Profile profile1 = field.getAnnotation(Profile.class);
                profile = "age =" + profile1.age() + "height = " + profile1.height();
            }
        }

        Log.i("TAG_CTSI", "name = " + name);
        Log.i("TAG_CTSI", "gander = " + gander);
        Log.i("TAG_CTSI", "profile = " + profile);

    }

}
