package com.leo.dagger2test.composite.subComponent;


import com.leo.dagger2test.composite.ActivityModule;
import com.leo.dagger2test.composite.ForActivity;

import dagger.Subcomponent;

/**
 * Created by Leo on 2018/1/6.
 */
//注意下面注解必须增加否则编译不过
//主要原因是因为ApplicationComponent使用了@Singleton所以我们必须定义的Component作用范围
//并且不能使用@Singleton
@ForActivity
@Subcomponent(modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(CompositeSubComponentMainActivity compositeMainActivity);
}
