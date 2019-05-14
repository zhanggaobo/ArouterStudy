package com.gary.circle;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.blankj.utilcode.util.LogUtils;
import com.gary.library.arouter.ARouterUtils;
import com.gary.library.arouter.RouterActivityPath;

@Route(path = RouterActivityPath.Circle.PAGER_CIRCLE)
public class CircleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ARouterUtils.injectActivity(this);
        setContentView(R.layout.activity_circle);
        LogUtils.d("Circle" + getPackageName());
    }
}
