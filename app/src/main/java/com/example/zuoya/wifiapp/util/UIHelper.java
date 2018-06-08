package com.example.zuoya.wifiapp.util;

import android.content.Intent;

import com.example.zuoya.wifiapp.BaseActivity;
import com.example.zuoya.wifiapp.ui.OpenClientActivity;
import com.example.zuoya.wifiapp.ui.OpenServiceActivity;
import com.example.zuoya.wifiapp.ui.WifiSocketActivity;

/**
 * Created by cqf on 2018/5/24.
 */
public class UIHelper {

    public static void showWifiSocket(BaseActivity activity) {
        Intent intent = new Intent(activity, WifiSocketActivity.class);
        activity.startActivity(intent);
    }

    public static void showOpenService(BaseActivity activity) {
        Intent intent = new Intent(activity, OpenServiceActivity.class);
        activity.startActivity(intent);
    }

    public static void showOpenClient(BaseActivity activity) {
        Intent intent = new Intent(activity, OpenClientActivity.class);
        activity.startActivity(intent);
    }
}
