package com.leo.dagger2test.module;

import dagger.Component;

/**
 * Created by Leo on 2018/1/6.
 */
@Component(modules = UserModule.class)
public interface UserModuleBeanComponent {
    void inject(ModuleMainActivity moduleMainActivity);
}
