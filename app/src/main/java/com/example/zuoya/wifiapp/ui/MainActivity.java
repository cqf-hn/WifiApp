package com.example.zuoya.wifiapp.ui;

import android.view.View;
import android.widget.TextView;

import com.example.zuoya.wifiapp.BaseActivity;
import com.example.zuoya.wifiapp.R;
import com.example.zuoya.wifiapp.ui.WifiSocketActivity;
import com.example.zuoya.wifiapp.util.UIHelper;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    @BindView(R.id.tvWifiSocket)
    TextView tvWifiSocket;

    @Override
    protected int onLayoutId() {
        return R.layout.activity_main;
    }

    @OnClick({R.id.tvWifiSocket})
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tvWifiSocket:
                UIHelper.showWifiSocket(this);
                break;
        }
    }
}
