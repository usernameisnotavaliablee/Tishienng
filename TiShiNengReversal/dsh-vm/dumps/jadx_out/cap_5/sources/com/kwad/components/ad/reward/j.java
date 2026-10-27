package com.kwad.components.ad.reward;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class j extends com.kwad.components.ad.l.b {

    @androidx.annotation.Nullable
    private com.kwad.components.ad.reward.c.d tc;
    private java.lang.ref.WeakReference<com.kwad.components.ad.reward.g> td;



    public j(com.kwad.components.ad.reward.g r1, @androidx.annotation.Nullable org.json.JSONObject r2, @androidx.annotation.Nullable java.lang.String r3) {
            r0 = this;
            r3 = 0
            r0.<init>(r2, r3)
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r1)
            r0.td = r2
            return
    }

    static /* synthetic */ com.kwad.components.ad.reward.c.d a(com.kwad.components.ad.reward.j r0) {
            com.kwad.components.ad.reward.c.d r0 = r0.tc
            return r0
    }

    public final void a(@androidx.annotation.Nullable com.kwad.components.ad.reward.c.d r1) {
            r0 = this;
            r0.tc = r1
            return
    }

    @Override // com.kwad.components.ad.l.b
    public final void a(com.kwad.components.core.webview.a r8) {
            r7 = this;
            super.a(r8)
            com.kwad.components.ad.reward.i.b r0 = new com.kwad.components.ad.reward.i.b
            com.kwad.sdk.core.webview.KsAdWebView r1 = r7.eN
            android.content.Context r1 = r1.getContext()
            com.kwad.sdk.core.response.model.AdTemplate r2 = r7.mAdTemplate
            com.kwad.components.core.playable.PlayableSource r3 = com.kwad.components.core.playable.PlayableSource.ENDCARD_CLICK
            r0.<init>(r1, r2, r3)
            r8.a(r0)
            com.kwad.components.ad.reward.c.f r0 = new com.kwad.components.ad.reward.c.f
            com.kwad.components.ad.reward.j$1 r1 = new com.kwad.components.ad.reward.j$1
            r1.<init>(r7)
            r0.<init>(r1)
            r8.a(r0)
            com.kwad.components.core.webview.jshandler.j r0 = new com.kwad.components.core.webview.jshandler.j
            com.kwad.components.ad.reward.j$2 r1 = new com.kwad.components.ad.reward.j$2
            r1.<init>(r7)
            r0.<init>(r1)
            r8.a(r0)
            java.lang.ref.WeakReference<com.kwad.components.ad.reward.g> r0 = r7.td
            if (r0 == 0) goto L3b
            java.lang.Object r0 = r0.get()
            com.kwad.components.ad.reward.g r0 = (com.kwad.components.ad.reward.g) r0
        L39:
            r2 = r0
            goto L3d
        L3b:
            r0 = 0
            goto L39
        L3d:
            com.kwad.components.ad.reward.k.p r1 = new com.kwad.components.ad.reward.k.p
            r4 = -1
            com.kwad.sdk.core.webview.b r6 = r7.eQ
            java.lang.String r3 = "native_id"
            r1.<init>(r2, r3, r4, r6)
            r8.b(r1)
            return
    }

    @Override // com.kwad.components.ad.l.b
    public final void gv() {
            r2 = this;
            java.lang.ref.WeakReference<com.kwad.components.ad.reward.g> r0 = r2.td
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r0.get()
            com.kwad.components.ad.reward.g r0 = (com.kwad.components.ad.reward.g) r0
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            java.lang.String r1 = "end_card"
            com.kwad.components.ad.reward.monitor.c.a(r0, r1)
            return
    }

    @Override // com.kwad.components.ad.l.b
    public final void gw() {
            r4 = this;
            java.lang.ref.WeakReference<com.kwad.components.ad.reward.g> r0 = r4.td
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r0.get()
            com.kwad.components.ad.reward.g r0 = (com.kwad.components.ad.reward.g) r0
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            com.kwad.sdk.core.response.model.AdTemplate r1 = r4.mAdTemplate
            java.lang.String r2 = "end_card"
            java.lang.String r3 = r4.K(r1)
            com.kwad.components.ad.reward.monitor.c.a(r1, r0, r2, r3)
            return
    }

    @Override // com.kwad.components.ad.l.b
    public final void gx() {
            r6 = this;
            java.lang.ref.WeakReference<com.kwad.components.ad.reward.g> r0 = r6.td
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r0.get()
            com.kwad.components.ad.reward.g r0 = (com.kwad.components.ad.reward.g) r0
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            com.kwad.sdk.core.response.model.AdTemplate r1 = r6.mAdTemplate
            java.lang.String r1 = r6.K(r1)
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r6.getLoadTime()
            long r2 = r2 - r4
            java.lang.String r4 = "end_card"
            com.kwad.components.ad.reward.monitor.c.a(r0, r4, r1, r2)
            return
    }
}
