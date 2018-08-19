package com.ctsi.uiautomotor.test;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.SparseArray;

/**
 * Created by wanglin on 2018/8/19.
 */

public class AgentResultFragment extends Fragment {

    public static final String TAG = "onActivityResult_dispatcher";
    private SparseArray<ActResultManager.Callback> mCallbacks = new SparseArray<>();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    public void startForResult(Intent intent, ActResultManager.Callback callback) {
        mCallbacks.put(callback.hashCode(), callback);
        startActivityForResult(intent, callback.hashCode());
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        ActResultManager.Callback callback = mCallbacks.get(requestCode);
        mCallbacks.remove(requestCode);
        if (callback != null) {
            callback.onActivityResult(resultCode, data);
        }
    }

    public void clear() {
        if (mCallbacks != null) {
            mCallbacks.clear();
            mCallbacks = null;
        }
    }


}
