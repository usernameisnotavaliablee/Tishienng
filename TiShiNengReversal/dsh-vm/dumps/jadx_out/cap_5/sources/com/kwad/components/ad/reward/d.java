package com.kwad.components.ad.reward;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class d extends com.kwad.components.ad.l.b {
    private java.util.List<com.kwad.sdk.core.response.model.AdTemplate> rv;
    private boolean rw;
    private java.util.List<com.kwad.components.core.e.d.c> rx;
    private com.kwad.components.core.webview.jshandler.y.b ry;


    public d(java.util.List<com.kwad.sdk.core.response.model.AdTemplate> r2, @androidx.annotation.Nullable org.json.JSONObject r3, com.kwad.components.core.webview.jshandler.y.b r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r3, r0)
            r3 = 0
            r1.rw = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r1.rx = r3
            r1.rv = r2
            r1.ry = r4
            if (r2 == 0) goto L37
            int r2 = r2.size()
            if (r2 <= 0) goto L37
            java.util.List<com.kwad.sdk.core.response.model.AdTemplate> r2 = r1.rv
            java.util.Iterator r2 = r2.iterator()
        L20:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L37
            java.lang.Object r3 = r2.next()
            com.kwad.sdk.core.response.model.AdTemplate r3 = (com.kwad.sdk.core.response.model.AdTemplate) r3
            com.kwad.components.core.e.d.c r4 = new com.kwad.components.core.e.d.c
            r4.<init>(r3)
            java.util.List<com.kwad.components.core.e.d.c> r3 = r1.rx
            r3.add(r4)
            goto L20
        L37:
            return
    }

    @Override // com.kwad.components.ad.l.b
    public final java.lang.String K(com.kwad.sdk.core.response.model.AdTemplate r3) {
            r2 = this;
            java.util.List<com.kwad.sdk.core.response.model.AdTemplate> r0 = r2.rv
            if (r0 == 0) goto L1a
            int r0 = r0.size()
            r1 = 2
            if (r0 >= r1) goto Lc
            goto L1a
        Lc:
            java.util.List<com.kwad.sdk.core.response.model.AdTemplate> r3 = r2.rv
            r0 = 1
            java.lang.Object r3 = r3.get(r0)
            com.kwad.sdk.core.response.model.AdTemplate r3 = (com.kwad.sdk.core.response.model.AdTemplate) r3
            java.lang.String r3 = com.kwad.sdk.core.response.b.b.cA(r3)
            return r3
        L1a:
            java.lang.String r3 = super.K(r3)
            return r3
    }

    @Override // com.kwad.components.ad.l.b
    public final void a(android.widget.FrameLayout r1, com.kwad.sdk.core.view.AdBaseFrameLayout r2, com.kwad.sdk.core.response.model.AdTemplate r3, com.kwad.components.core.e.d.c r4, int r5) {
            r0 = this;
            java.util.List<com.kwad.sdk.core.response.model.AdTemplate> r3 = r0.rv
            java.util.List<com.kwad.components.core.e.d.c> r4 = r0.rx
            super.a(r1, r2, r3, r4)
            return
    }

    @Override // com.kwad.components.ad.l.b
    public final void a(com.kwad.components.core.webview.a r5) {
            r4 = this;
            super.a(r5)
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<com.kwad.sdk.core.response.model.AdTemplate> r1 = r4.rv
            int r2 = r1.size()
            r3 = 1
            int r2 = r2 - r3
            java.util.List r1 = r1.subList(r3, r2)
            r0.<init>(r1)
            com.kwad.components.core.webview.jshandler.y r1 = new com.kwad.components.core.webview.jshandler.y
            r1.<init>(r0)
            com.kwad.components.core.webview.jshandler.y$b r0 = r4.ry
            r1.a(r0)
            r5.a(r1)
            return
    }

    @Override // com.kwad.components.ad.l.b
    public final void b(com.kwad.sdk.core.webview.b r2) {
            r1 = this;
            java.util.List<com.kwad.sdk.core.response.model.AdTemplate> r0 = r1.rv
            r2.setAdTemplateList(r0)
            return
    }

    @Override // com.kwad.components.ad.l.b
    public final boolean cH() {
            r1 = this;
            boolean r0 = r1.rw
            if (r0 == 0) goto L7
            boolean r0 = r1.Mn
            return r0
        L7:
            boolean r0 = super.cH()
            return r0
    }

    @Override // com.kwad.components.ad.l.b
    public final java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = "MiddlePlayEndCard"
            return r0
    }

    @Override // com.kwad.components.ad.l.b
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    public final void gs() {
            r2 = this;
            super.gs()
            com.kwad.sdk.core.webview.KsAdWebView r0 = r2.eN
            com.kwad.components.ad.reward.d$1 r1 = new com.kwad.components.ad.reward.d$1
            r1.<init>(r2)
            r0.setOnTouchListener(r1)
            return
    }

    @Override // com.kwad.components.ad.l.b
    public final boolean gt() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final void gu() {
            r1 = this;
            com.kwad.components.core.webview.jshandler.az r0 = r1.eS
            if (r0 == 0) goto L7
            r0.uG()
        L7:
            return
    }

    @Override // com.kwad.components.ad.l.b
    public final void gv() {
            r2 = this;
            r0 = 1
            java.lang.String r1 = "middle_play_end_card"
            com.kwad.components.ad.reward.monitor.c.a(r0, r1)
            return
    }

    @Override // com.kwad.components.ad.l.b
    public final void gw() {
            r4 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r4.mAdTemplate
            java.lang.String r1 = "middle_play_end_card"
            java.lang.String r2 = r4.K(r0)
            r3 = 1
            com.kwad.components.ad.reward.monitor.c.a(r0, r3, r1, r2)
            return
    }

    @Override // com.kwad.components.ad.l.b
    public final void gx() {
            r5 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r5.mAdTemplate
            java.lang.String r0 = r5.K(r0)
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = r5.getLoadTime()
            long r1 = r1 - r3
            r3 = 1
            java.lang.String r4 = "middle_play_end_card"
            com.kwad.components.ad.reward.monitor.c.a(r3, r4, r0, r1)
            return
    }

    public final void setShowLandingPage(boolean r1) {
            r0 = this;
            r0.rw = r1
            return
    }
}
