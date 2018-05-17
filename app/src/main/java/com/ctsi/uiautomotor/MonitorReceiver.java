package com.ctsi.uiautomotor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by wanglin on 2018/5/17.
 */

public class MonitorReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("TAG_CTSI", "--->进程拉活操作");
//        boolean isMyServiceRunning = ProcessUtils.isRunningService(context, MyService.class.getName());
//        if (!isMyServiceRunning) {
//            context.startService(new Intent(context, MyService.class));
//        }
    }
}