package com.example.zuoya.wifiapp.event;

import android.support.annotation.IntDef;

import com.example.zuoya.wifiapp.util.EventBusUtil;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by cqf on 2018/5/28.
 */
public class SocketStateEvent {

    private int state;

    private SocketStateEvent() {
    }

    public static SocketStateEvent getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final SocketStateEvent INSTANCE = new SocketStateEvent();
    }

    public void send(int state) {
        this.state = state;
        EventBusUtil.post(this);
    }

    @IntDef({State.DEVICE_CONNECTING, State.DEVICE_CONNECTED, State.SEND_MSG_SUCCESS, State.SEND_MSG_ERROR, State.GET_MSG})
    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
        int DEVICE_CONNECTING = 0;// 有设备正在连接热点
        int DEVICE_CONNECTED = 1;// 有设备连上热点
        int SEND_MSG_SUCCESS = 2;// 发送消息成功
        int SEND_MSG_ERROR = 3;// 发送消息失败
        int GET_MSG = 4;// 获取新消息
    }
}
