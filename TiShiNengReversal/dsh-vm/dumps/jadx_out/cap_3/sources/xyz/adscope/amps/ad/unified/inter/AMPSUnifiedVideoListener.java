package xyz.adscope.amps.ad.unified.inter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public interface AMPSUnifiedVideoListener {
    void onVideoClicked();

    void onVideoCompleted();

    void onVideoError(xyz.adscope.amps.ad.unified.AMPSUnifiedNativeAdError r1);

    void onVideoInit();

    void onVideoLoaded(int r1);

    void onVideoLoading();

    void onVideoPause();

    void onVideoReady();

    void onVideoResume();

    void onVideoStart();

    void onVideoStop();
}
