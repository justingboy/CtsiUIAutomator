package com.ctsi.uiautomotor;

import java.util.ArrayList;

/**
 * Created by wanglin on 2018/5/17.
 */

public class StaticClass {
    public static ArrayList<String> list = new ArrayList<>();

    public static ArrayList<String> getList() {
        return list;
    }

    public static void add(String item) {
        list.add(item);
    }
}
