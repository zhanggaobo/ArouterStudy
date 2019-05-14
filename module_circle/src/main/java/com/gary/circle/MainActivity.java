package com.gary.circle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.blankj.utilcode.util.LogUtils;
import com.gary.library.arouter.ARouterUtils;
import com.gary.library.arouter.RouterActivityPath;

@Route(path = RouterActivityPath.Circle.PAGER_MAIN)
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        ARouterUtils.injectActivity(this);
        setContentView(R.layout.activity_main);
        ARouterUtils.injectActivity(this);
        LogUtils.d("Circle" + getPackageName());
    }
}
