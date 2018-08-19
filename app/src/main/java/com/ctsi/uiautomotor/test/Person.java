package com.ctsi.uiautomotor.test;

/**
 * Created by wanglin on 2018/8/18.
 */

public class Person {

    @Name("张三")
    private String name;

    @Profile(age = 28)
    private int age;

    @Profile(height = 180)
    private int height;


    @Gander(gander = Gander.GanderType.Male)
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
