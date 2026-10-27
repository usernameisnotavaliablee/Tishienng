package xyz.adscope.ad.ad.nativead.basic;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public interface IBasicNativeAdItem {
    void destroyAd();

    xyz.adscope.ad.publish.ad.IBidding getBidding();

    void setExpressListener(xyz.adscope.ad.publish.ad.nativead.INativeExpressListener r1);

    void setInteractiveListener(xyz.adscope.ad.publish.ad.nativead.INativeInteractiveListener r1);

    void setNegativeFeedbackListener(xyz.adscope.ad.publish.ad.nativead.INativeNegativeFeedbackListener r1);

    void setVideoPlayListener(xyz.adscope.ad.publish.ad.nativead.INativeVideoPlayListener r1);
}
