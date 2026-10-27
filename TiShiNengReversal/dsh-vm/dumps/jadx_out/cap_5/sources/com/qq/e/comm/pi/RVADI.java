package com.qq.e.comm.pi;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public interface RVADI extends com.qq.e.comm.pi.LADI {
    java.lang.String getAdNetWorkName();

    @java.lang.Deprecated
    long getExpireTimestamp();

    int getRewardAdType();

    int getVideoDuration();

    boolean hasShown();

    void loadAD();

    void setLoadAdParams(com.qq.e.comm.constants.LoadAdParams r1);

    void setServerSideVerificationOptions(com.qq.e.ads.rewardvideo.ServerSideVerificationOptions r1);

    void setVolumeOn(boolean r1);

    void showAD();

    void showAD(android.app.Activity r1);
}
