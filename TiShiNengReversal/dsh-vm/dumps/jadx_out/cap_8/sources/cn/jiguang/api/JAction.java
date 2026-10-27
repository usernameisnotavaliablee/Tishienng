package cn.jiguang.api;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface JAction {
    long dispatchMessage(android.content.Context r1, long r2, int r4, java.lang.Object r5, java.nio.ByteBuffer r6);

    void dispatchTimeOutMessage(android.content.Context r1, long r2, long r4, int r6);

    android.os.IBinder getBinderByType(java.lang.String r1);

    java.lang.String getSdkVersion();

    void handleMessage(android.content.Context r1, long r2, java.lang.Object r4);

    boolean isSupportedCMD(int r1);

    void onActionRun(android.content.Context r1, long r2, android.os.Bundle r4, java.lang.Object r5);

    void onEvent(android.content.Context r1, long r2, int r4);
}
