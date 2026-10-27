package com.kwad.components.ad.fullscreen;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b {
    public final boolean jk;
    private com.kwad.sdk.core.response.model.AdInfo mAdInfo;
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;

    public b(com.kwad.sdk.core.response.model.AdTemplate r2) {
            r1 = this;
            r1.<init>()
            boolean r0 = com.kwad.components.ad.reward.a.b.hO()
            r1.jk = r0
            r1.mAdTemplate = r2
            com.kwad.sdk.core.response.model.AdInfo r2 = com.kwad.sdk.core.response.b.e.el(r2)
            r1.mAdInfo = r2
            return
    }

    public final com.kwad.sdk.core.response.model.AdInfo cU() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r1.mAdInfo
            return r0
    }

    public final boolean cV() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            boolean r0 = com.kwad.sdk.core.response.b.e.ex(r0)
            return r0
    }

    public final com.kwad.sdk.core.response.model.AdTemplate getAdTemplate() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            return r0
    }
}
