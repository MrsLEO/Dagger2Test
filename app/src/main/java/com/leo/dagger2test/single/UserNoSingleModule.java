package com.leo.dagger2test.single;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Leo on 2018/1/6.
 */
@Module
public class UserNoSingleModule {
    @MY_SINGLETON
    @Provides
    public UserNoSingleBean provideUserNoSingleBean(){
        return new UserNoSingleBean();
    }

}
