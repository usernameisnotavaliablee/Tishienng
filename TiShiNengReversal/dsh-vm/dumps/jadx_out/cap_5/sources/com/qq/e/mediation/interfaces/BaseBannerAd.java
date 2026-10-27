package com.qq.e.mediation.interfaces;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class BaseBannerAd implements com.qq.e.mediation.interfaces.IBaseAd {
    public BaseBannerAd(android.app.Activity r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract void destroy();

    public abstract android.view.View getAdView();

    public abstract boolean isValid();

    public abstract void loadAD();

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

    public abstract void setAdSize(int r1, int r2);

    @Override // com.qq.e.mediation.interfaces.IBaseAd
    public void setBidECPM(int r1) {
            r0 = this;
            return
    }

    @Override // com.qq.e.mediation.interfaces.IBaseAd
    public void setPayload(java.lang.String r1) {
            r0 = this;
            return
    }

    public abstract void setServerSideVerificationOptions(com.qq.e.ads.rewardvideo.ServerSideVerificationOptions r1);
}
