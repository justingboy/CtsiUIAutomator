package com.ctsi.uiautomotor;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import com.ctsi.uiautomotor.test.AnnotationParseUtils;
import com.ctsi.uiautomotor.test.ModeType;
import com.ctsi.uiautomotor.test.MyInterface;
import com.ctsi.uiautomotor.test.Person;
import com.ctsi.uiautomotor.test.Status;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.ctsi.uiautomotor", appContext.getPackageName());
    }

    @Test
    public void test() {
        Person person = new Person();
        person.setAge(MyInterface.FAILED);
        person.setAge(ModeType.FAILED);
        AnnotationParseUtils.parse(person.getClass());
        play(Status.FAILED);
        Log.i("TAG_CTSI", "age = " + person.getAge());

    }

    private void play(@Status int code) {
        switch (code) {
            case Status.SUCCESS:
                Log.i("TAG_CTSI", "success");
                break;
            case Status.FAILED:
                Log.i("TAG_CTSI", "failed");
                break;
        }
    }
}
