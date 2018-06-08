package com.example.zuoya.wifiapp.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.zuoya.wifiapp.BaseActivity;
import com.example.zuoya.wifiapp.R;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by cqf on 2018/5/24.
 */
public class OpenClientActivity extends BaseActivity {
    @BindView(R.id.tvConnection)
    TextView tvConnection;
    @BindView(R.id.tvSend)
    TextView tvSend;
    @BindView(R.id.tvOpenFile)
    TextView tvOpenFile;
    @BindView(R.id.tvDesc)
    TextView tvDesc;

    @Override
    protected int onLayoutId() {
        return R.layout.activity_open_client;
    }

    @OnClick({R.id.tvConnection, R.id.tvOpenFile, R.id.tvSend})
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tvConnection:
                // TODO:
                break;
            case R.id.tvOpenFile:
                // TODO:
                break;
            case R.id.tvSend:
                // TODO:
                break;
        }
    }

}
