package com.leo.dagger2test.single;

/**
 * Created by Leo on 2018/1/6.
 */

public class UserNoSingleBean {
    private String userName;
    public UserNoSingleBean() {
    }

    public UserNoSingleBean(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }
}
