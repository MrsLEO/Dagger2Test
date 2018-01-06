package com.leo.dagger2test.module;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import com.leo.dagger2test.R;
import javax.inject.Inject;
import javax.inject.Named;

public class ModuleMainActivity extends AppCompatActivity {
    //通过无参构造函数实例化
    @Inject
    UserModuleConstructNoParamBean userBean;

    @MY_NAME("provideUserConstructBean")
    @Inject
    UserModuleConstructBean userConstructBean;

    @Named("provideNamedUserQualifyBean")
    @Inject
    UserModuleConstructBean userQualifyBean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerUserModuleBeanComponent.create().inject(this);
        Log.d("LEO","=====userBean:===="+userBean);
        Log.d("LEO","=====userConstructBean:===="+userConstructBean.getUserName());
        Log.d("LEO","=====userQualifyBean:===="+userQualifyBean.getUserName());
    }
}
