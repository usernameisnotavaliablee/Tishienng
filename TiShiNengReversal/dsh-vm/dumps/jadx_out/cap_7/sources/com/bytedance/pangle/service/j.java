package com.bytedance.pangle.service;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public interface j {
    void attach(com.bytedance.pangle.plugin.Plugin r1);

    android.os.IBinder onBind(android.content.Intent r1);

    void onCreate();

    void onDestroy();

    int onStartCommand(android.content.Intent r1, int r2, int r3);

    boolean onUnbind(android.content.Intent r1);
}
