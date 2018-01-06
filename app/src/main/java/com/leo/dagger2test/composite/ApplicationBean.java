package com.leo.dagger2test.composite;

/**
 * Created by Leo on 2018/1/6.
 */

public class ApplicationBean {
    private String applicationName;

    public ApplicationBean() {
        applicationName = "ApplicationBean";
    }

    public String getApplicationName() {
        return applicationName;
    }
}
