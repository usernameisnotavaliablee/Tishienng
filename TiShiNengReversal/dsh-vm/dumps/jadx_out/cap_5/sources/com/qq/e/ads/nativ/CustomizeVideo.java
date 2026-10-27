package com.qq.e.ads.nativ;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public interface CustomizeVideo {
    java.lang.String getVideoUrl();

    void reportVideoCompleted();

    void reportVideoError(long r1, int r3, int r4);

    void reportVideoPause(long r1);

    void reportVideoPreload();

    void reportVideoResume(long r1);

    void reportVideoStart();
}
