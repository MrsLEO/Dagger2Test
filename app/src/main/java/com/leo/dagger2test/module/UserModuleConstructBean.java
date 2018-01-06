package com.leo.dagger2test.module;

/**
 * Created by Leo on 2018/1/6.
 */

public class UserModuleConstructBean {
    String userName;

    public UserModuleConstructBean(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }
}
