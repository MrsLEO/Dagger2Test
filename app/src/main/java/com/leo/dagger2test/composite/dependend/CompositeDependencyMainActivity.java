package com.leo.dagger2test.composite.dependend;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.leo.dagger2test.DaggerApplication;
import com.leo.dagger2test.R;
import com.leo.dagger2test.composite.ActivityBean;
import com.leo.dagger2test.composite.ApplicationBean;
import javax.inject.Inject;


public class CompositeDependencyMainActivity extends AppCompatActivity {
    @Inject
    ApplicationBean applicationBean3;
    @Inject
    ApplicationBean applicationBean4;
    @Inject
    ActivityBean activityBean;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerApplication daggerApplication = (DaggerApplication)getApplication();
        ApplicationDependencyComponent applicationComponent = daggerApplication.getApplicationComponent();
        ActivityComponent activityComponent = DaggerActivityComponent.builder().applicationDependencyComponent(applicationComponent).build();
        activityComponent.inject(this);
        Log.d("LEO","=====applicationBean3:===="+applicationBean3);
        Log.d("LEO","=====applicationBean4:===="+applicationBean4);
        Log.d("LEO","=====activityBean:===="+activityBean.getActivityName());
    }
}
