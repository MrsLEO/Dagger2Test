package com.leo.dagger2test.single;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.leo.dagger2test.R;

import javax.inject.Inject;

public class SingleMainActivity extends AppCompatActivity {
    @Inject
    UserNoSingleBean userBean1;
    @Inject
    UserNoSingleBean userBean2;

    @Inject
    UserSingleBean userSingleBean1;
    @Inject
    UserSingleBean userSingleBean2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerUserSingleComponent.create().inject(this);
        Log.d("LEO","=====userBean1:===="+userBean1);
        Log.d("LEO","=====userBean2:===="+userBean2);
        Log.d("LEO","=====userSingleBean1:===="+userSingleBean1);
        Log.d("LEO","=====userSingleBean2:===="+userSingleBean2);
    }
}
