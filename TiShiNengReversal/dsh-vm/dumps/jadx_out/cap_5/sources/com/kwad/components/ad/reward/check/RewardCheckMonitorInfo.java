package com.kwad.components.ad.reward.check;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.ksad.json.annotation.KsJson
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class RewardCheckMonitorInfo extends com.kwad.sdk.commercial.c.a implements java.io.Serializable {
    public static final int CHECK_TYPE_EXPOSURE = 1;
    public static final int CHECK_TYPE_REWARD = 2;
    public static final int ENVI_TYPE_NATIVE = 0;
    public static final int ENVI_TYPE_TK = 1;
    public static final int REQUEST_STATE_END = 2;
    public static final int REQUEST_STATE_START = 1;
    public static final long serialVersionUID = 1080394611500009098L;
    public int checkType;
    public int code;
    public long creativeId;
    public long dataLoadInterval;
    public int enviType;
    public long posId;
    public int requestStatus;

    public RewardCheckMonitorInfo() {
            r0 = this;
            r0.<init>()
            return
    }

    public com.kwad.components.ad.reward.check.RewardCheckMonitorInfo setCheckType(int r1) {
            r0 = this;
            r0.checkType = r1
            return r0
    }

    public com.kwad.components.ad.reward.check.RewardCheckMonitorInfo setCode(int r1) {
            r0 = this;
            r0.code = r1
            return r0
    }

    public com.kwad.components.ad.reward.check.RewardCheckMonitorInfo setCreativeId(long r1) {
            r0 = this;
            r0.creativeId = r1
            return r0
    }

    public com.kwad.components.ad.reward.check.RewardCheckMonitorInfo setDataLoadInterval(long r1) {
            r0 = this;
            r0.dataLoadInterval = r1
            return r0
    }

    public com.kwad.components.ad.reward.check.RewardCheckMonitorInfo setEnviType(int r1) {
            r0 = this;
            r0.enviType = r1
            return r0
    }

    @Override // com.kwad.sdk.commercial.c.a
    public com.kwad.components.ad.reward.check.RewardCheckMonitorInfo setErrorMsg(java.lang.String r1) {
            r0 = this;
            super.setErrorMsg(r1)
            return r0
    }

    @Override // com.kwad.sdk.commercial.c.a
    public /* bridge */ /* synthetic */ com.kwad.sdk.commercial.c.a setErrorMsg(java.lang.String r1) {
            r0 = this;
            com.kwad.components.ad.reward.check.RewardCheckMonitorInfo r1 = r0.setErrorMsg(r1)
            return r1
    }

    public com.kwad.components.ad.reward.check.RewardCheckMonitorInfo setRequestStatus(int r1) {
            r0 = this;
            r0.requestStatus = r1
            return r0
    }
}
