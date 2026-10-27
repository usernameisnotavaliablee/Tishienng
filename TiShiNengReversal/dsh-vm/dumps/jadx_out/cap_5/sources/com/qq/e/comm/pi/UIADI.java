package com.qq.e.comm.pi;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public interface UIADI extends com.qq.e.comm.pi.LADI {
    void close();

    void destroy();

    java.lang.String getAdNetWorkName();

    int getAdPatternType();

    int getVideoDuration();

    void loadAd();

    void loadFullScreenAD();

    void setLoadAdParams(com.qq.e.comm.constants.LoadAdParams r1);

    void setMaxVideoDuration(int r1);

    void setMinVideoDuration(int r1);

    void setServerSideVerificationOptions(com.qq.e.ads.rewardvideo.ServerSideVerificationOptions r1);

    void setVideoOption(com.qq.e.ads.cfg.VideoOption r1);

    void show();

    void show(android.app.Activity r1);

    void showFullScreenAD(android.app.Activity r1);
}
