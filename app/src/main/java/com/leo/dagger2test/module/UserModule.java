package com.leo.dagger2test.module;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Leo on 2018/1/6.
 */
@Module
public class UserModule {
    @Provides
    public UserModuleConstructNoParamBean provideUserBean(){
        return new UserModuleConstructNoParamBean();
    }
    @MY_NAME("provideUserConstructBean")
    @Provides
    public UserModuleConstructBean provideUserConstructBean(){
        return new UserModuleConstructBean("I am construct Module");
    }
    //这里如果没使用自定义的Qualifier注解，这里会报错。
    //因为Dagger框架里面是通过返回值来区分不同方法创建对象，当返回值相同时
    //Dagger没办法知道调用那个方法注入对象。所以为了解决此问题，引入了@Qualifier
    //当然这里@MY_NAME是我自定义的，Dagger本身也有类似注解@Named
    @MY_NAME("provideUserQualifyBean")
    @Provides
    public UserModuleConstructBean provideUserQualifyBean(){
        return new UserModuleConstructBean("I am qualify Module");
    }
    @Named("provideNamedUserConstructBean")
    @Provides
    public UserModuleConstructBean provideNamedUserConstructBean(){
        return new UserModuleConstructBean("I am construct Module");
    }
    //这里如果没使用自定义的Qualifier注解，这里会报错。
    //因为Dagger框架里面是通过返回值来区分不同方法创建对象，当返回值相同时
    //Dagger没办法知道调用那个方法注入对象。所以为了解决此问题，引入了@Qualifier
    //当然这里@MY_NAME是我自定义的，Dagger本身也有类似注解@NAME
    @Named("provideNamedUserQualifyBean")
    @Provides
    public UserModuleConstructBean provideNamedUserQualifyBean(){
        return new UserModuleConstructBean("I am qualify Module");
    }
}
