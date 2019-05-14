package com.gary.arouterstudy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.gary.arouterstudy.databinding.ActivityMainBinding;
import com.gary.library.arouter.ARouterUtils;
import com.gary.library.arouter.RouterActivityPath;

@Route(path = RouterActivityPath.Main.PAGER_MAIN)
public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ARouterUtils.injectActivity(this);
        setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.buttonCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouterUtils.navigation(RouterActivityPath.Circle.PAGER_CIRCLE);
            }
        });
        binding.buttonNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouterUtils.navigation(RouterActivityPath.News.PAGER_NEWS);
            }
        });

    }
}
