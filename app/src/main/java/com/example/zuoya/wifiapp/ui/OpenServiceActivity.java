package com.example.zuoya.wifiapp.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.zuoya.wifiapp.BaseActivity;
import com.example.zuoya.wifiapp.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by cqf on 2018/5/24.
 */
public class OpenServiceActivity extends BaseActivity {
    @BindView(R.id.tvCreateWifiHot)
    TextView tvCreateWifiHot;
    @BindView(R.id.tvCloseWifiHot)
    TextView tvCloseWifiHot;
    @BindView(R.id.tvSend)
    TextView tvSend;
    @BindView(R.id.tvDesc)
    TextView tvDesc;

    @Override
    protected int onLayoutId() {
        return R.layout.activity_opne_service;
    }

    @Override
    protected void onLayoutAfter() {
        super.onLayoutAfter();
    }

    @OnClick({R.id.tvCreateWifiHot, R.id.tvCloseWifiHot, R.id.tvSend})
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tvCreateWifiHot:
                // TODO:
                break;
            case R.id.tvCloseWifiHot:
                // TODO:
                break;
            case R.id.tvSend:
                // TODO:
                break;
        }
    }
}
