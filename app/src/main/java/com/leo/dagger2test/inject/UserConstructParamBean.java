package com.leo.dagger2test.inject;

import javax.inject.Inject;

/**
 * Created by Leo on 2018/1/6.
 */

public class UserConstructParamBean {
    private String userName;
    @Inject
    public UserConstructParamBean(UserParamBean userParamBean) {
        this.userName = userParamBean.paramName;
    }

    public String getUserName() {
        return userName;
    }
}
