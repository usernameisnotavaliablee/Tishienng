package com.qq.e.ads.nativ;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public interface NativeExpressMediaListener {
    void onVideoCached(com.qq.e.ads.nativ.NativeExpressADView r1);

    void onVideoComplete(com.qq.e.ads.nativ.NativeExpressADView r1);

    void onVideoError(com.qq.e.ads.nativ.NativeExpressADView r1, com.qq.e.comm.util.AdError r2);

    void onVideoInit(com.qq.e.ads.nativ.NativeExpressADView r1);

    void onVideoLoading(com.qq.e.ads.nativ.NativeExpressADView r1);

    void onVideoPageClose(com.qq.e.ads.nativ.NativeExpressADView r1);

    void onVideoPageOpen(com.qq.e.ads.nativ.NativeExpressADView r1);

    void onVideoPause(com.qq.e.ads.nativ.NativeExpressADView r1);

    void onVideoReady(com.qq.e.ads.nativ.NativeExpressADView r1, long r2);

    void onVideoStart(com.qq.e.ads.nativ.NativeExpressADView r1);
}
