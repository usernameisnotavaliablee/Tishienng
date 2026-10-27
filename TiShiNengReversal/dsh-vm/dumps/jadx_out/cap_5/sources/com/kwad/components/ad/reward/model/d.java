package com.kwad.components.ad.reward.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class d {
    public d() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String m(com.kwad.sdk.core.response.model.AdInfo r1) {
            boolean r0 = com.kwad.sdk.core.response.b.a.cR(r1)
            if (r0 == 0) goto L9
            java.lang.String r1 = "live"
            return r1
        L9:
            boolean r0 = com.kwad.sdk.core.response.b.a.bd(r1)
            if (r0 == 0) goto L12
            java.lang.String r1 = "image"
            return r1
        L12:
            boolean r1 = com.kwad.sdk.core.response.b.a.cf(r1)
            if (r1 == 0) goto L1b
            java.lang.String r1 = "reward_preview"
            return r1
        L1b:
            java.lang.String r1 = "video"
            return r1
    }
}
