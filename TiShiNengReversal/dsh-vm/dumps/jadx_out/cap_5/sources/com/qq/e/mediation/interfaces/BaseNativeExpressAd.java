package com.qq.e.mediation.interfaces;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class BaseNativeExpressAd implements com.qq.e.mediation.interfaces.IBaseAd {
    public static final int DEFAULT_PRIORITY = -1;

    public BaseNativeExpressAd(android.content.Context r1, com.qq.e.ads.nativ.ADSize r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r0 = this;
            r0.<init>()
            return
    }

    public int getAdapterPriority() {
            r1 = this;
            r0 = -1
            return r0
    }

    public abstract void loadAD(int r1);

    public abstract void loadAD(int r1, com.qq.e.comm.constants.LoadAdParams r2);

    @Override // com.qq.e.mediation.interfaces.IBaseAd
    public void sendLossNotification(int r1, int r2, java.lang.String r3) {
            r0 = this;
            return
    }

    @Override // com.qq.e.mediation.interfaces.IBaseAd
    public void sendWinNotification(int r1) {
            r0 = this;
            return
    }

    public abstract void setAdListener(com.qq.e.comm.adevent.ADListener r1);

    @Override // com.qq.e.mediation.interfaces.IBaseAd
    public void setBidECPM(int r1) {
            r0 = this;
            return
    }

    public abstract void setECPMLevel(java.lang.String r1);

    public abstract void setMaxVideoDuration(int r1);

    public abstract void setMinVideoDuration(int r1);

    @Override // com.qq.e.mediation.interfaces.IBaseAd
    public void setPayload(java.lang.String r1) {
            r0 = this;
            return
    }

    public abstract void setServerSideVerificationOptions(com.qq.e.ads.rewardvideo.ServerSideVerificationOptions r1);

    public abstract void setVideoOption(com.qq.e.ads.cfg.VideoOption r1);
}
