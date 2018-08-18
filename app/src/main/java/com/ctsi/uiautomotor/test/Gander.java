package com.ctsi.uiautomotor.test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by wanglin on 2018/8/18.
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.SOURCE)
public @interface Gander {

    enum GanderType {

        Male("男"),
        Female("女"),
        Other("人妖");

        private String ganderType;

        GanderType(String ganderType) {
            this.ganderType = ganderType;
        }

        @Override
        public String toString() {
            return ganderType;
        }
    }

    GanderType gander() default GanderType.Male;

}
