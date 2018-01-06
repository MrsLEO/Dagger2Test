package com.leo.dagger2test.inject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.leo.dagger2test.R;

import javax.inject.Inject;

public class InjectMainActivity extends AppCompatActivity {
    //通过无参构造函数实例化
    @Inject
    UserConstructNoParamBean userBean;
    //通过有参构造函数实例化
    //Dagger通过递归查找需要注入目标类上面的@Inject，然后依次调用相应的构造方法实例化
    //比如我们例子 先实例UserParamBean在实例UserConstructParamBean
    //1.使用 @Inject实例化对象明显的一个劣势就是虽然他也可以实例化有参数的对象，但是最后一个对象一定
    //是无参构造函数实例化对象
    //2.对于三方库，我们没法更改源码加入@Inject注解
    @Inject
    UserConstructParamBean userConstructParamBean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerUserBeanComponent.create().inject(this);
        Log.d("LEO","=====userBean:===="+userBean.getUserName());
        Log.d("LEO","=====userConstructParamBean:===="+userConstructParamBean.getUserName());
    }
}
