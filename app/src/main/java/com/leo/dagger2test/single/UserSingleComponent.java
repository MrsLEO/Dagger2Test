package com.leo.dagger2test.single;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Leo on 2018/1/6.
 */
@Singleton
@MY_SINGLETON
@Component(modules = {UserNoSingleModule.class,UserSingleModule.class})
public interface UserSingleComponent {
    void inject(SingleMainActivity singleMainActivity);
}
