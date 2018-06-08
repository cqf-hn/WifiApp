package com.example.zuoya.wifiapp.ui;

import android.view.View;
import android.widget.TextView;

import com.example.zuoya.wifiapp.BaseActivity;
import com.example.zuoya.wifiapp.R;
import com.example.zuoya.wifiapp.util.UIHelper;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by cqf on 2018/5/24.
 */
public class WifiSocketActivity extends BaseActivity {
    @BindView(R.id.tvOpenService)
    TextView tvOpenService;
    @BindView(R.id.tvOpenClient)
    TextView tvOpenClient;

    @Override
    protected int onLayoutId() {
        return R.layout.activity_wifi_socket;
    }

    @OnClick({R.id.tvOpenService, R.id.tvOpenClient})
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tvOpenService:
                UIHelper.showOpenService(_activity);
                break;
            case R.id.tvOpenClient:
                UIHelper.showOpenClient(_activity);
                break;
        }
    }
}
