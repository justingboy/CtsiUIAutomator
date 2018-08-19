package com.ctsi.uiautomotor;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.kejiee.huaxindou.ndk.CPUFrameworkHelper;

import reverse.android.com.myannations.JPHelloWorld;

@JPHelloWorld
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = findViewById(R.id.tv);
        tv.setText(isWhichCpu());
//      DaemonHelper.startService(this);(开启服务保活，能够使的Application不被重新构建，静态值不会丢失)
        StaticClass.add("AAA");
        Log.i("TAG_CTSI", "size = " + StaticClass.getList().size());
//        showAutoExToStackOverflow();
    }

    class MyViewHodler extends RecyclerView.ViewHolder {

        public MyViewHodler(View itemView) {
            super(itemView);
        }
    }

    class MyAdapter extends RecyclerView.Adapter<MyViewHodler> {


        @NonNull
        @Override
        public MyViewHodler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return null;
        }

        @Override
        public void onBindViewHolder(@NonNull MyViewHodler holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 0;
        }
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


    //自动跳转到StackOverflow 在查找错误
    private void showAutoExToStackOverflow() {
        int i = 1 / 0;
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.i("TAG_CTSI", "resultCode = " + requestCode);
    }
}
