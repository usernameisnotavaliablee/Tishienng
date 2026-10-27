package com.kwad.components.ad.reward.k.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c extends com.kwad.components.core.webview.tachikoma.d.c implements com.kwad.components.ad.reward.k.a.e {
    private com.kwad.components.ad.reward.k.a.a AQ;



    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    public final void a(com.kwad.components.ad.reward.c.b r2) {
            r1 = this;
            com.kwad.components.ad.reward.k.a.a r0 = r1.AQ
            if (r0 == 0) goto L7
            r0.b(r2)
        L7:
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.d.a, com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.sdk.components.t r2, com.kwad.sdk.core.webview.b r3) {
            r1 = this;
            super.a(r2, r3)
            com.kwad.components.ad.reward.c.f r3 = new com.kwad.components.ad.reward.c.f
            com.kwad.components.ad.reward.k.a.c$1 r0 = new com.kwad.components.ad.reward.k.a.c$1
            r0.<init>(r1)
            r3.<init>(r0)
            r2.c(r3)
            com.kwad.components.core.webview.jshandler.j r3 = new com.kwad.components.core.webview.jshandler.j
            com.kwad.components.ad.reward.k.a.c$2 r0 = new com.kwad.components.ad.reward.k.a.c$2
            r0.<init>(r1)
            r3.<init>(r0)
            r2.c(r3)
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.d.a, com.kwad.components.core.webview.tachikoma.j
    public final void a(@androidx.annotation.Nullable com.kwad.sdk.core.webview.d.b.a r1) {
            r0 = this;
            super.a(r1)
            com.kwad.components.ad.reward.k.a.a r1 = r0.AQ
            if (r1 == 0) goto L18
            com.kwad.components.ad.reward.g r1 = r1.ks()
            if (r1 == 0) goto L18
            com.kwad.components.ad.reward.k.a.a r1 = r0.AQ
            com.kwad.components.ad.reward.g r1 = r1.ks()
            com.kwad.components.ad.reward.e.b r1 = r1.rD
            r1.cW()
        L18:
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.d.a
    public final com.kwad.components.core.webview.tachikoma.i iY() {
            r5 = this;
            com.kwad.components.core.webview.tachikoma.d.b r0 = r5.ahp
            com.kwad.components.ad.reward.k.a.a r0 = (com.kwad.components.ad.reward.k.a.a) r0
            r5.AQ = r0
            com.kwad.components.ad.reward.k.a.d r0 = new com.kwad.components.ad.reward.k.a.d
            com.kwad.components.ad.reward.k.a.a r1 = r5.AQ
            com.kwad.components.ad.reward.g r1 = r1.ks()
            com.kwad.components.ad.reward.k.a.a r2 = r5.AQ
            long r2 = r2.AO
            android.content.Context r4 = r5.getContext()
            r0.<init>(r1, r2, r4)
            return r0
    }
}
