package com.leo.dagger2test.inject;

import javax.inject.Inject;

/**
 * Created by Leo on 2018/1/6.
 */

public class UserConstructNoParamBean {
    private String userName;
    @Inject
    public UserConstructNoParamBean() {
        this.userName = "LEO";
    }

    public String getUserName() {
        return userName;
    }
}
