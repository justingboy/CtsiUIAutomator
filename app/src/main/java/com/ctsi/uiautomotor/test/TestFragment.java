package com.ctsi.uiautomotor.test;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.ctsi.uiautomotor.R;

/**
 * Created by wanglin on 2018/8/19.
 */

public class TestFragment extends Fragment implements ActResultManager.Callback {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_test, container, false);
        Button btn = view.findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Activity_Test.class);
//                getActivity().startActivityForResult(intent, 100);//Activity
//                startActivityForResult(intent,100);//Fragment
                Activity_Test.start(getActivity(), TestFragment.this);
            }
        });
        return view;
    }

    @Override
    public void onDestroy() {
        ActResultManager.getInstance(getActivity()).clear();
        super.onDestroy();
    }

    @Override
    public void onActivityResult(int resultCode, Intent data) {
        Toast.makeText(getActivity(), "TestFragment ->返回了", Toast.LENGTH_SHORT).show();
    }
}
