package com.leo.dagger2test.composite;

import com.leo.dagger2test.composite.ActivityBean;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Leo on 2018/1/6.
 */
@Module
public class ActivityModule {
    @Provides
    ActivityBean provideActivityBean(){
        return new ActivityBean();
    }
}
