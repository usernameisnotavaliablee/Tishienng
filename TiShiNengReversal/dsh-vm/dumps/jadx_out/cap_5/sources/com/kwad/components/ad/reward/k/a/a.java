package com.kwad.components.ad.reward.k.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a extends com.kwad.components.core.webview.tachikoma.d.b {
    private com.kwad.components.ad.reward.g AM;

    public a(com.kwad.components.ad.reward.g r1) {
            r0 = this;
            r0.<init>()
            r0.AM = r1
            return
    }

    public final void b(com.kwad.components.ad.reward.c.b r3) {
            r2 = this;
            com.kwad.components.ad.reward.c.a r0 = com.kwad.components.ad.reward.c.a.hV()
            com.kwad.sdk.core.response.model.AdTemplate r1 = r2.mAdTemplate
            r0.a(r1, r3)
            return
    }

    public final com.kwad.components.ad.reward.g ks() {
            r1 = this;
            com.kwad.components.ad.reward.g r0 = r1.AM
            return r0
    }

    @Override // com.kwad.components.core.webview.tachikoma.d.b, com.kwad.sdk.mvp.a
    public final void release() {
            r1 = this;
            super.release()
            r0 = 0
            r1.AM = r0
            return
    }
}
