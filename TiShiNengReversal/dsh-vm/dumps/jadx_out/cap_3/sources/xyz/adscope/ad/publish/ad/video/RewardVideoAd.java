package xyz.adscope.ad.publish.ad.video;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class RewardVideoAd extends xyz.adscope.ad.s2<xyz.adscope.ad.publish.ad.video.IRewardVideoConfig, xyz.adscope.ad.publish.ad.video.IRewardVideoListener> {
    public RewardVideoAd(android.content.Context r1, xyz.adscope.ad.publish.ad.video.IRewardVideoConfig r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // xyz.adscope.ad.c2
    protected xyz.adscope.ad.c b() {
            r1 = this;
            xyz.adscope.ad.c r0 = xyz.adscope.ad.c.g
            return r0
    }

    @Override // xyz.adscope.ad.c2
    public java.lang.String getRequestSessionID() {
            r1 = this;
            java.lang.String r0 = super.getRequestSessionID()
            return r0
    }

    public void loadAd(xyz.adscope.ad.publish.ad.video.IRewardVideoListener r1) {
            r0 = this;
            super.a(r1)
            return
    }

    public void showAd(android.content.Context r1) {
            r0 = this;
            super.a(r1)
            return
    }
}
