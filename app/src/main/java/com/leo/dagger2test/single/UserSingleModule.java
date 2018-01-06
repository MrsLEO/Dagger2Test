package com.leo.dagger2test.single;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Leo on 2018/1/6.
 */
@Module
public class UserSingleModule {
    @Singleton
    @Provides
    public UserSingleBean provideUserSingleBean(){
        return new UserSingleBean();
    }
    //@MY_SINGLETON注解是使用了@Scope，类似系统注解@Singleton(单例)
    //其实Singleton并不是真正单例，他只是标识一下Dagger(默认重新创建)是否需要重新创建对象。
    //而且只有在同一个Component对象内，才有效。也就是说你必须是同一个Component使用@Scope标识的，对象才会复用
    //从而表现出单例。
    @Named("provideUserMySingleBean")
    @MY_SINGLETON
    @Provides
    public UserSingleBean provideUserMySingleBean(){
        return new UserSingleBean();
    }

}
