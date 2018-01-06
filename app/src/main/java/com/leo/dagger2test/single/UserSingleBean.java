package com.leo.dagger2test.single;

/**
 * Created by Leo on 2018/1/6.
 */

public class UserSingleBean {
    private String userName;
    public UserSingleBean() {
    }

    public UserSingleBean(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }
}
