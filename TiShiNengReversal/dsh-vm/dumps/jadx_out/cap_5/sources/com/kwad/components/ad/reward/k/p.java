package com.kwad.components.ad.reward.k;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class p extends com.kwad.components.core.webview.jshandler.am {
    private long AH;
    private java.lang.String AI;
    private java.lang.ref.WeakReference<com.kwad.components.ad.reward.g> td;


    public p(com.kwad.components.ad.reward.g r1, java.lang.String r2, long r3, com.kwad.sdk.core.webview.b r5) {
            r0 = this;
            r0.<init>(r5)
            r0.AI = r2
            r0.AH = r3
            if (r1 == 0) goto L10
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r1)
            r0.td = r2
        L10:
            return
    }

    private static boolean X(java.lang.String r1) {
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L11
            r0.<init>(r1)     // Catch: java.lang.Exception -> L11
            java.lang.String r1 = "elementType"
            int r1 = r0.optInt(r1)     // Catch: java.lang.Exception -> L11
            r0 = 18
            if (r1 != r0) goto L11
            r1 = 1
            return r1
        L11:
            r1 = 0
            return r1
    }

    static /* synthetic */ java.lang.String a(com.kwad.components.ad.reward.k.p r0) {
            java.lang.String r0 = r0.AI
            return r0
    }

    private boolean b(com.kwad.components.core.webview.jshandler.am.b r4) {
            r3 = this;
            int r0 = r4.getActionType()
            r1 = 140(0x8c, float:1.96E-43)
            if (r0 != r1) goto L36
            boolean r0 = com.kwad.sdk.core.config.e.BP()
            if (r0 == 0) goto L36
            java.lang.String r4 = r4.uD()
            boolean r4 = X(r4)
            if (r4 == 0) goto L36
            java.lang.ref.WeakReference<com.kwad.components.ad.reward.g> r4 = r3.td
            if (r4 == 0) goto L36
            java.lang.Object r4 = r4.get()
            if (r4 == 0) goto L36
            java.lang.ref.WeakReference<com.kwad.components.ad.reward.g> r4 = r3.td
            java.lang.Object r4 = r4.get()
            com.kwad.components.ad.reward.g r4 = (com.kwad.components.ad.reward.g) r4
            com.kwad.components.ad.reward.k.p$1 r0 = new com.kwad.components.ad.reward.k.p$1
            r0.<init>(r3, r4)
            r1 = 1500(0x5dc, double:7.41E-321)
            com.kwad.sdk.utils.bw.runOnUiThreadDelay(r0, r1)
            r4 = 1
            return r4
        L36:
            r4 = 0
            return r4
    }

    @Override // com.kwad.components.core.webview.jshandler.am
    public final void a(@androidx.annotation.NonNull com.kwad.components.core.webview.jshandler.am.b r2) {
            r1 = this;
            boolean r0 = r1.b(r2)
            if (r0 != 0) goto L9
            super.a(r2)
        L9:
            return
    }

    @Override // com.kwad.components.core.webview.jshandler.am
    public final void a(com.kwad.sdk.core.adlog.c.b r6) {
            r5 = this;
            super.a(r6)
            java.lang.ref.WeakReference<com.kwad.components.ad.reward.g> r0 = r5.td
            if (r0 == 0) goto L1f
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L1f
            java.lang.ref.WeakReference<com.kwad.components.ad.reward.g> r0 = r5.td
            java.lang.Object r0 = r0.get()
            com.kwad.components.ad.reward.g r0 = (com.kwad.components.ad.reward.g) r0
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            long r0 = r0.getPlayDuration()
            r6.aw(r0)
            return
        L1f:
            long r0 = r5.AH
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L2a
            r6.aw(r0)
        L2a:
            return
    }

    @Override // com.kwad.components.core.webview.jshandler.am
    public final void b(boolean r1, com.kwad.sdk.core.response.model.AdTemplate r2, @androidx.annotation.Nullable org.json.JSONObject r3, @androidx.annotation.Nullable com.kwad.sdk.core.adlog.c.b r4) {
            r0 = this;
            r3 = 0
            com.kwad.components.ad.reward.j.b.a(r1, r2, r3, r4)
            return
    }
}
