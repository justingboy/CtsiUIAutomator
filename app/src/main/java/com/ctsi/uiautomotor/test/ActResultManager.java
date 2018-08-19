package com.ctsi.uiautomotor.test;

/**
 * Created by wanglin on 2018/8/19.
 */

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Intent;

import java.util.HashMap;

public class ActResultManager {

    private AgentResultFragment fragment;
    private static ActResultManager mActResultRequest = null;
    private static HashMap<Activity, ActResultManager> mHashMap = new HashMap<>();

    private ActResultManager(Activity activity) {
        if (activity != null && !activity.isDestroyed()) {
            fragment = getEventDispatchFragment(activity);
        }
    }

    public static ActResultManager getInstance(Activity activity) {
        if (mHashMap.containsKey(activity)) {
            return mHashMap.get(activity);
        }
        mActResultRequest = new ActResultManager(activity);
        mHashMap.put(activity, mActResultRequest);
        return mActResultRequest;
    }


    private AgentResultFragment getEventDispatchFragment(Activity activity) {
        final FragmentManager fragmentManager = activity.getFragmentManager();

        AgentResultFragment fragment = findEventDispatchFragment(fragmentManager);
        if (fragment == null) {
            fragment = new AgentResultFragment();
            fragmentManager
                    .beginTransaction()
                    .add(fragment, AgentResultFragment.TAG)
                    .commitAllowingStateLoss();
            fragmentManager.executePendingTransactions();
        }
        return fragment;
    }

    private AgentResultFragment findEventDispatchFragment(FragmentManager manager) {
        return (AgentResultFragment) manager.findFragmentByTag(AgentResultFragment.TAG);
    }

    public void clear() {
        if (mHashMap != null) {
            mHashMap.clear();
        }
        if (fragment != null) {
            fragment.clear();
        }
        mActResultRequest = null;
    }

    public void startForResult(Intent intent, Callback callback) {
        if (fragment != null) {
            fragment.startForResult(intent, callback);
        }
    }

    public interface Callback {
        void onActivityResult(int resultCode, Intent data);
    }
}
