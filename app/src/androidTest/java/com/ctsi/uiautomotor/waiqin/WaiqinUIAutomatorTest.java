package com.ctsi.uiautomotor.waiqin;

import android.app.Instrumentation;
import android.os.RemoteException;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by wanglin on 2018/4/29.
 * 测试外勤助手
 */

@RunWith(AndroidJUnit4.class)
public class WaiqinUIAutomatorTest {

    public Instrumentation mInstrumentation;
    public UiDevice mUiDevice;

    @Before
    public void setUp() {
        mInstrumentation = InstrumentationRegistry.getInstrumentation();
        mUiDevice = UiDevice.getInstance(mInstrumentation);
    }

    @Test
    public void login() throws InterruptedException, RemoteException {
        UiObject2 uiLogin = mUiDevice.findObject(By.res("com.ctsi.android.mts.client:id/btn_login"));
        uiLogin.click();
    }

    @Test
    public void clickTask() throws InterruptedException {
        mUiDevice.click(152, 286);
        Thread.sleep(2000);
        mUiDevice.click(404, 323);
        Thread.sleep(3000);
    }

    @Test
    public void swipe() throws InterruptedException {
        mUiDevice.swipe(348, 882, 348, 571, 10);
        Thread.sleep(1000);

    }

    @Test
    public void openRecentApps() throws RemoteException {
        mUiDevice.pressRecentApps();
    }


    @After
    public void restore() {
//        mUiDevice.pressHome();
    }

}
