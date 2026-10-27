package com.kwad.components.ad.reward.presenter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class i {
    public i() {
            r1 = this;
            r1.<init>()
            return
    }

    public static boolean z(com.kwad.components.ad.reward.g r4) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r4.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r1 = com.kwad.sdk.core.response.b.e.el(r0)
            boolean r2 = com.kwad.sdk.core.response.b.a.bK(r1)
            r3 = 0
            if (r2 == 0) goto L18
            com.kwad.components.core.playable.a r4 = r4.rF
            if (r4 == 0) goto L18
            boolean r4 = r4.rS()
            if (r4 == 0) goto L18
            return r3
        L18:
            boolean r4 = com.kwad.components.ad.reward.a.b.k(r1)
            if (r4 == 0) goto L1f
            return r3
        L1f:
            boolean r4 = r0.mXiaomiAppStoreDetailViewOpen
            if (r4 == 0) goto L24
            return r3
        L24:
            boolean r4 = com.kwad.components.ad.reward.a.b.hL()
            r0 = 1
            if (r4 == 0) goto L2c
            return r0
        L2c:
            boolean r4 = com.kwad.sdk.core.response.b.a.aF(r1)
            if (r4 == 0) goto L39
            boolean r4 = com.kwad.sdk.core.response.b.a.at(r1)
            if (r4 == 0) goto L39
            return r0
        L39:
            return r3
    }
}
