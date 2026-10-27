package com.qq.e.mediation.interfaces;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class BaseRewardAd implements com.qq.e.mediation.interfaces.IBaseAd {
    public static final int DEFAULT_PRIORITY = -1;
    private com.qq.e.comm.constants.LoadAdParams a;

    public BaseRewardAd(android.content.Context r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r1 = 0
            r0.a = r1
            return
    }

    public int getAdapterPriority() {
            r1 = this;
            r0 = -1
            return r0
    }

    public abstract java.lang.String getECPMLevel();

    @java.lang.Deprecated
    public abstract long getExpireTimestamp();

    public com.qq.e.comm.constants.LoadAdParams getLoadAdParams() {
            r1 = this;
            com.qq.e.comm.constants.LoadAdParams r0 = r1.a
            return r0
    }

    public int getRewardAdType() {
            r1 = this;
            r0 = 0
            return r0
    }

    public abstract int getVideoDuration();

    public abstract boolean hasShown();

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

    @Override // com.qq.e.mediation.interfaces.IBaseAd
    public void setBidECPM(int r1) {
            r0 = this;
            return
    }

    public void setLoadAdParams(com.qq.e.comm.constants.LoadAdParams r1) {
            r0 = this;
            r0.a = r1
            return
    }

    @Override // com.qq.e.mediation.interfaces.IBaseAd
    public void setPayload(java.lang.String r1) {
            r0 = this;
            return
    }

    public abstract void setServerSideVerificationOptions(com.qq.e.ads.rewardvideo.ServerSideVerificationOptions r1);

    public abstract void setVolumeOn(boolean r1);

    public abstract void showAD();

    public void showAD(android.app.Activity r1) {
            r0 = this;
            r0.showAD()
            return
    }
}
