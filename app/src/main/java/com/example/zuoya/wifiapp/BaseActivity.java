package com.example.zuoya.wifiapp;

import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.zuoya.wifiapp.util.AppManager;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by cqf on 2018/5/24.
 */
public abstract class BaseActivity extends AppCompatActivity {

    private Unbinder unbinder;
    public BaseActivity _activity;

    @CallSuper
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppManager.getAppManager().addActivity(this);
        _activity = this;
        onLayoutBefore();
        setContentView(onLayoutId());
        unbinder = ButterKnife.bind(this);
        onLayoutAfter();
    }

    @CallSuper
    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
        AppManager.getAppManager().removeActivity(this);
    }

    protected void onLayoutBefore() {
    }

    @LayoutRes
    protected abstract int onLayoutId();

    protected void onLayoutAfter() {
    }
}
