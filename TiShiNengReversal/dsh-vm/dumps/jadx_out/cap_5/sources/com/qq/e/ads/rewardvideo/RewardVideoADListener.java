package com.qq.e.ads.rewardvideo;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public interface RewardVideoADListener {
    void onADClick();

    void onADClose();

    void onADExpose();

    void onADLoad();

    void onADShow();

    void onError(com.qq.e.comm.util.AdError r1);

    void onReward(java.util.Map<java.lang.String, java.lang.Object> r1);

    void onVideoCached();

    void onVideoComplete();
}
