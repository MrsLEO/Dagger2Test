package com.leo.dagger2test.inject;

import dagger.Component;

/**
 * Created by Leo on 2018/1/6.
 */
@Component
public interface UserBeanComponent {
    void inject(InjectMainActivity activity);
}
