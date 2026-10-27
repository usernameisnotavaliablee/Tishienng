package com.kwad.components.ad.reward.g;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a extends com.kwad.sdk.components.e implements com.kwad.components.ad.b.h {
    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.kwad.sdk.components.b
    public final java.lang.Class getComponentsType() {
            r1 = this;
            java.lang.Class<com.kwad.components.ad.b.h> r0 = com.kwad.components.ad.b.h.class
            return r0
    }

    @Override // com.kwad.sdk.components.b
    public final void init(android.content.Context r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.components.ad.b.h
    public final void loadRewardVideoAd(com.kwad.sdk.api.KsScene r4, @androidx.annotation.NonNull com.kwad.sdk.api.KsLoadManager.RewardVideoAdListener r5) {
            r3 = this;
            com.kwad.sdk.l r0 = com.kwad.sdk.l.Cf()
            boolean r0 = r0.CG()
            if (r0 != 0) goto L14
            com.kwad.sdk.core.network.e r4 = com.kwad.sdk.core.network.e.aEz
            int r0 = r4.errorCode
            java.lang.String r4 = r4.msg
            r5.onError(r0, r4)
            return
        L14:
            com.kwad.components.ad.reward.g.c r0 = new com.kwad.components.ad.reward.g.c
            long r1 = r4.getPosId()
            r0.<init>(r1, r5)
            com.kwad.components.ad.reward.g.b.a(r4, r0)
            return
    }

    @Override // com.kwad.components.ad.b.h
    public final void notifyRewardVerify() {
            r1 = this;
            com.kwad.components.ad.reward.b r0 = com.kwad.components.ad.reward.b.gk()
            r0.notifyRewardVerify()
            return
    }
}
