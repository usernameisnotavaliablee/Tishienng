package com.kwad.components.offline.api.core.api;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public interface IEnvironment {
    void addOnAudioConflictListener(android.content.Context r1, com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener r2);

    java.lang.String getAppId();

    java.lang.String getAppVersion();

    java.lang.String getBiz();

    android.content.Context getContext();

    java.lang.String getDeviceId();

    java.lang.String getKpf();

    java.lang.String getKpn();

    double getLatitude(android.content.Context r1);

    double getLongitude(android.content.Context r1);

    java.lang.String getOperator(android.content.Context r1);

    java.lang.String getOsVersion();

    java.lang.String getProcessName(android.content.Context r1);

    java.lang.String getSdkVersion();

    int getStatusBarHeight(android.content.Context r1);

    java.lang.String getUserAgent();

    boolean isArm64(android.content.Context r1);

    boolean isDebug();

    boolean isDevelopEnable();

    boolean isInMainProcess(android.content.Context r1);

    boolean isTKCrashCollectEnable();

    java.lang.String localIpAddress();

    void removeOnAudioConflictListener(android.content.Context r1, com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener r2);

    boolean requestAudioFocus(android.content.Context r1, boolean r2);
}
