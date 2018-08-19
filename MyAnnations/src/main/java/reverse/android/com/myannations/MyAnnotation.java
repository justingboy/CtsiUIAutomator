package reverse.android.com.myannations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by wanglin on 2018/8/18.
 */

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface MyAnnotation {
    String value() default "";
}
