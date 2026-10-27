package com.qq.e.comm.pi;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public interface SVSD {
    android.os.IBinder onBind(android.content.Intent r1);

    void onConfigurationChanged(android.content.res.Configuration r1);

    void onCreate();

    void onDestroy();

    void onLowMemory();

    void onRebind(android.content.Intent r1);

    int onStartCommand(android.content.Intent r1, int r2, int r3);

    void onTaskRemoved(android.content.Intent r1);

    void onTrimMemory(int r1);

    boolean onUnbind(android.content.Intent r1);
}
