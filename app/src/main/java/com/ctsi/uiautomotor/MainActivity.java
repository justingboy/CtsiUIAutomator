package com.ctsi.uiautomotor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.kejiee.huaxindou.ndk.CPUFrameworkHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, isWhichCpu(), Toast.LENGTH_LONG).show();
    }

    private String isWhichCpu() {

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("手机CPU型号：\n");
        stringBuffer.append("isArmCpu：" + CPUFrameworkHelper.isArmCpu() + "\n");
        stringBuffer.append("isArm7Compatible：" + CPUFrameworkHelper.isArm7Compatible() + "\n");
        stringBuffer.append("isMipsCpu：" + CPUFrameworkHelper.isMipsCpu() + "\n");
        stringBuffer.append("isX86Cpu：" + CPUFrameworkHelper.isX86Cpu() + "\n");
        stringBuffer.append("isArm64Cpu：" + CPUFrameworkHelper.isArm64Cpu() + "\n");
        stringBuffer.append("isMips64Cpu：" + CPUFrameworkHelper.isMips64Cpu() + "\n");
        stringBuffer.append("isX86_64Cpu：" + CPUFrameworkHelper.isX86_64Cpu() + "\n");

        return stringBuffer.toString();
    }
}
