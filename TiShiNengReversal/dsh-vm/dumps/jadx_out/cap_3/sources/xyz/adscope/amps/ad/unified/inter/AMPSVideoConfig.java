package xyz.adscope.amps.ad.unified.inter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSVideoConfig {
    private final int autoPlayPrivacy;
    private final boolean isMute;
    private int videoMaxTime;

    public AMPSVideoConfig(boolean r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.isMute = r1
            r0.autoPlayPrivacy = r2
            return
    }

    public int getAutoPlayPrivacy() {
            r1 = this;
            int r0 = r1.autoPlayPrivacy
            return r0
    }

    public int getVideoMaxTime() {
            r1 = this;
            int r0 = r1.videoMaxTime
            return r0
    }

    public boolean isMute() {
            r1 = this;
            boolean r0 = r1.isMute
            return r0
    }

    public void setVideoMaxTime(int r1) {
            r0 = this;
            r0.videoMaxTime = r1
            return
    }
}
