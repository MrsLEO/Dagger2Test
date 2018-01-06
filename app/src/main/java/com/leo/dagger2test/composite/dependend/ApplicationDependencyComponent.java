package com.leo.dagger2test.composite.dependend;

import com.leo.dagger2test.DaggerApplication;
import com.leo.dagger2test.composite.ApplicationBean;
import com.leo.dagger2test.composite.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Leo on 2018/1/6.
 */
//这里注意当Module有@Singleton时，这里必须声明@Singleton，则编译不过
//反过来是可以的，但是@Singleton将失去作用
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationDependencyComponent {
    void inject(DaggerApplication daggerApplication);
    //注意这里将ApplicationComponent的单例对象ApplicationBean对象供其他Component使用，
   //例如ActivityComponent,所没有下面这句代码，如果我们在CompositeMainActivity注入ApplicationBean会编译报错。
    ApplicationBean provideApplicationBean();
}
