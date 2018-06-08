package com.example.zuoya.wifiapp.util;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

import com.example.zuoya.wifiapp.event.SocketStateEvent;
import com.example.zuoya.wifiapp.ui.MainActivity;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ListenerThread extends Thread {

    private ServerSocket serverSocket = null;
    private int port;
    private Socket socket;

    public ListenerThread(int port) {
        setName("ListenerThread");
        this.port = port;
        try {
            serverSocket = new ServerSocket(port);//监听本机的12345端口
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void run() {
        while (true) {
            try {
                Log.i("ListennerThread", "阻塞");
                //阻塞，等待设备连接
                if (serverSocket != null)
                    socket = serverSocket.accept();
                SocketStateEvent.getInstance().send(SocketStateEvent.State.DEVICE_CONNECTING);
            } catch (IOException e) {
                Log.i("ListennerThread", "error:" + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    public Socket getSocket() {
        return socket;
    }
}