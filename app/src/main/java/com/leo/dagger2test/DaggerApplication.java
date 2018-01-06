package com.leo.dagger2test;
import android.app.Application;
import android.util.Log;
import com.leo.dagger2test.composite.ApplicationBean;
import com.leo.dagger2test.composite.dependend.ApplicationDependencyComponent;
import com.leo.dagger2test.composite.dependend.DaggerApplicationDependencyComponent;
import com.leo.dagger2test.composite.subComponent.ApplicationSubComponent;
import com.leo.dagger2test.composite.subComponent.DaggerApplicationSubComponent;
import javax.inject.Inject;

/**
 * Created by Leo on 2018/1/6.
 */

public class DaggerApplication extends Application{
    private ApplicationDependencyComponent applicationDependencyComponent;
    private ApplicationSubComponent applicationSubComponent;
    @Inject
    ApplicationBean applicationBean1;
    @Inject
    ApplicationBean applicationBean2;
    @Override
    public void onCreate() {
        super.onCreate();
        if (applicationDependencyComponent == null){
            applicationDependencyComponent = DaggerApplicationDependencyComponent.create();
        }
        if (applicationSubComponent == null){
            applicationSubComponent = DaggerApplicationSubComponent.create();
        }
        applicationDependencyComponent.inject(this);
        applicationSubComponent.inject(this);
        Log.d("LEO","=====applicationBean1:===="+applicationBean1);
        Log.d("LEO","=====applicationBean2:===="+applicationBean2);
    }

    public ApplicationDependencyComponent getApplicationComponent() {
        return applicationDependencyComponent;
    }

    public ApplicationSubComponent getApplicationSubComponent() {
        return applicationSubComponent;
    }
}
