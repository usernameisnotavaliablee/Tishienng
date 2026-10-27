package xyz.adscope.amps.ad.draw.adapter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public abstract class AMPSDrawAdVideoListener implements xyz.adscope.amps.base.AMPSBaseListener {
    public AMPSDrawAdVideoListener() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract void onProgressUpdate(long r1, long r3);

    public abstract void onVideoAdComplete();

    public abstract void onVideoAdContinuePlay();

    public abstract void onVideoAdPaused();

    public abstract void onVideoAdStartPlay();

    public abstract void onVideoError(int r1, int r2);

    public abstract void onVideoLoad();
}
