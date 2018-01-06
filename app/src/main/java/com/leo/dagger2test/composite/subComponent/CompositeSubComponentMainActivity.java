package com.leo.dagger2test.composite.subComponent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.leo.dagger2test.DaggerApplication;
import com.leo.dagger2test.R;
import com.leo.dagger2test.composite.ActivityBean;
import com.leo.dagger2test.composite.ApplicationBean;

import javax.inject.Inject;


public class CompositeSubComponentMainActivity extends AppCompatActivity {
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
        ApplicationSubComponent applicationComponent = daggerApplication.getApplicationSubComponent();
        applicationComponent.activityComponent().inject(this);
        Log.d("LEO","=====applicationBean3:===="+applicationBean3);
        Log.d("LEO","=====applicationBean4:===="+applicationBean4);
        Log.d("LEO","=====activityBean:===="+activityBean.getActivityName());
    }
}
