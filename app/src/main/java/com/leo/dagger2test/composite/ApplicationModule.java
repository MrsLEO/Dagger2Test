package com.leo.dagger2test.composite;
import com.leo.dagger2test.composite.ApplicationBean;

import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Leo on 2018/1/6.
 */
@Module
public class ApplicationModule {
    @Singleton
    @Provides
    ApplicationBean provideApplicationBean(){
        return new ApplicationBean();
    }
}
