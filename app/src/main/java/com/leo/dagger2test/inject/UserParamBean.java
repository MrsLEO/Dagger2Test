package com.leo.dagger2test.inject;

import javax.inject.Inject;

/**
 * Created by Leo on 2018/1/6.
 */

public class UserParamBean {
    String paramName;
    //必须加上@Inject否则报错
    @Inject
    public UserParamBean() {
        this.paramName = "I am a param";
    }
}
