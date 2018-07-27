package com.liuchuanzheng.databindingdemo;

/**
 * Created by 刘传政 on 2018/7/27 0027.
 * QQ:1052374416
 * 电话:18501231486
 * 作用:
 * 注意事项:
 */
public class UserBean {
    private String name;
    //姓名
    private int age;

    // 年龄
    public UserBean(String name, int age) {
        this.name = name;
        this.age = age;
    }

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
}


