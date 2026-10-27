package com.kwad.components.ad.reward.k.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class d extends com.kwad.components.core.webview.tachikoma.i implements com.kwad.components.ad.reward.k.s, com.kwad.components.core.webview.jshandler.y.b {
    private com.kwad.components.ad.reward.c.e AS;
    private com.kwad.components.ad.reward.k.m AT;
    private com.kwad.components.ad.reward.k.l AU;
    private com.kwad.components.ad.reward.k.n AV;
    private java.util.List<com.kwad.sdk.core.response.model.AdTemplate> AW;

    @androidx.annotation.Nullable
    private android.content.DialogInterface.OnDismissListener AX;

    @androidx.annotation.Nullable
    private com.kwad.components.core.e.d.c mApkDownloadHelper;
    private java.lang.ref.WeakReference<com.kwad.components.ad.reward.g> td;

    public d(@androidx.annotation.NonNull com.kwad.components.ad.reward.g r1, long r2, android.content.Context r4) {
            r0 = this;
            r0.<init>(r2, r4)
            r2 = 0
            r0.AW = r2
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r1)
            r0.td = r2
            return
    }

    public d(com.kwad.components.ad.reward.g r1, long r2, android.content.Context r4, @androidx.annotation.Nullable android.content.DialogInterface.OnDismissListener r5) {
            r0 = this;
            r2 = -1
            r0.<init>(r2, r4)
            r2 = 0
            r0.AW = r2
            r0.AX = r5
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r1)
            r0.td = r2
            return
    }

    @Override // com.kwad.components.core.webview.jshandler.y.b
    public final void W(com.kwad.sdk.core.response.model.AdTemplate r3) {
            r2 = this;
            com.kwad.components.core.j.c r0 = new com.kwad.components.core.j.c
            int r1 = com.kwad.components.core.j.e.AGGREGATION
            r0.<init>(r3, r1)
            java.lang.ref.WeakReference<com.kwad.components.ad.reward.g> r3 = r2.td
            if (r3 == 0) goto L12
            java.lang.Object r3 = r3.get()
            com.kwad.components.ad.reward.g r3 = (com.kwad.components.ad.reward.g) r3
            goto L13
        L12:
            r3 = 0
        L13:
            if (r3 == 0) goto L18
            r3.b(r0)
        L18:
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.i
    public final void a(@androidx.annotation.Nullable android.app.Activity r1, com.kwad.sdk.core.response.model.AdResultData r2, com.kwad.components.core.webview.tachikoma.j r3) {
            r0 = this;
            super.a(r1, r2, r3)
            java.lang.ref.WeakReference<com.kwad.components.ad.reward.g> r1 = r0.td
            if (r1 == 0) goto Le
            java.lang.Object r1 = r1.get()
            com.kwad.components.ad.reward.g r1 = (com.kwad.components.ad.reward.g) r1
            goto Lf
        Le:
            r1 = 0
        Lf:
            if (r1 == 0) goto L14
            r1.a(r0)
        L14:
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.i
    public final void a(com.kwad.sdk.core.webview.b r10, com.kwad.components.core.e.d.c r11, com.kwad.sdk.components.t r12, android.view.ViewGroup r13) {
            r9 = this;
            super.a(r10, r11, r12, r13)
            r9.mApkDownloadHelper = r11
            com.kwad.components.ad.reward.k.q r0 = new com.kwad.components.ad.reward.k.q
            java.lang.ref.WeakReference<com.kwad.components.ad.reward.g> r13 = r9.td
            r8 = 0
            if (r13 == 0) goto L14
            java.lang.Object r13 = r13.get()
            com.kwad.components.ad.reward.g r13 = (com.kwad.components.ad.reward.g) r13
            r3 = r13
            goto L15
        L14:
            r3 = r8
        L15:
            long r4 = r9.AO
            android.content.DialogInterface$OnDismissListener r7 = r9.AX
            r6 = r9
            r1 = r10
            r2 = r11
            r0.<init>(r1, r2, r3, r4, r6, r7)
            com.kwad.components.core.e.e.g r10 = com.kwad.components.core.e.e.g.pY()
            r10.a(r9)
            r12.c(r0)
            com.kwad.components.ad.reward.c.e r10 = new com.kwad.components.ad.reward.c.e
            r10.<init>()
            r6.AS = r10
            r12.c(r10)
            com.kwad.components.ad.reward.k.t r10 = new com.kwad.components.ad.reward.k.t
            android.content.Context r11 = r6.mContext
            java.lang.ref.WeakReference<com.kwad.components.ad.reward.g> r13 = r6.td
            if (r13 == 0) goto L42
            java.lang.Object r13 = r13.get()
            com.kwad.components.ad.reward.g r13 = (com.kwad.components.ad.reward.g) r13
            goto L43
        L42:
            r13 = r8
        L43:
            r10.<init>(r11, r13)
            r12.c(r10)
            com.kwad.components.ad.reward.k.o r10 = new com.kwad.components.ad.reward.k.o
            java.lang.ref.WeakReference<com.kwad.components.ad.reward.g> r11 = r6.td
            if (r11 == 0) goto L56
            java.lang.Object r11 = r11.get()
            com.kwad.components.ad.reward.g r11 = (com.kwad.components.ad.reward.g) r11
            goto L57
        L56:
            r11 = r8
        L57:
            r10.<init>(r11)
            r12.c(r10)
            com.kwad.components.ad.reward.k.m r10 = new com.kwad.components.ad.reward.k.m
            r10.<init>()
            r6.AT = r10
            r12.c(r10)
            com.kwad.components.ad.reward.k.l r10 = new com.kwad.components.ad.reward.k.l
            r10.<init>()
            r6.AU = r10
            r12.c(r10)
            java.util.List<com.kwad.sdk.core.response.model.AdTemplate> r10 = r6.AW
            if (r10 == 0) goto L7c
            com.kwad.components.ad.reward.k.l r11 = r6.AU
            r11.g(r10)
            r6.AW = r8
        L7c:
            com.kwad.components.core.webview.jshandler.y r10 = new com.kwad.components.core.webview.jshandler.y
            r10.<init>(r1)
            r10.a(r9)
            r12.c(r10)
            com.kwad.components.ad.reward.k.n r10 = new com.kwad.components.ad.reward.k.n
            r10.<init>()
            r6.AV = r10
            r12.c(r10)
            com.kwad.components.ad.reward.k.r r10 = new com.kwad.components.ad.reward.k.r
            java.lang.ref.WeakReference<com.kwad.components.ad.reward.g> r11 = r6.td
            r10.<init>(r11)
            r12.c(r10)
            return
    }

    @Override // com.kwad.components.ad.reward.k.s
    public final void ab(boolean r2) {
            r1 = this;
            com.kwad.components.ad.reward.k.n r0 = r1.AV
            if (r0 == 0) goto L7
            r0.aa(r2)
        L7:
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.i
    public final com.kwad.components.core.webview.jshandler.am c(com.kwad.sdk.core.webview.b r8) {
            r7 = this;
            java.lang.ref.WeakReference<com.kwad.components.ad.reward.g> r0 = r7.td
            if (r0 == 0) goto Lc
            java.lang.Object r0 = r0.get()
            com.kwad.components.ad.reward.g r0 = (com.kwad.components.ad.reward.g) r0
        La:
            r2 = r0
            goto Le
        Lc:
            r0 = 0
            goto La
        Le:
            com.kwad.components.ad.reward.k.p r1 = new com.kwad.components.ad.reward.k.p
            java.lang.String r3 = r7.getTkTemplateId()
            long r4 = r7.AO
            r6 = r8
            r1.<init>(r2, r3, r4, r6)
            return r1
    }

    @Override // com.kwad.components.core.webview.tachikoma.i, com.kwad.components.core.e.e.f
    public final void dismiss() {
            r2 = this;
            java.lang.ref.WeakReference<com.kwad.components.ad.reward.g> r0 = r2.td
            if (r0 == 0) goto Le
            java.lang.Object r0 = r0.get()
            com.kwad.components.ad.reward.g r0 = (com.kwad.components.ad.reward.g) r0
            r1 = 0
            r0.E(r1)
        Le:
            super.dismiss()
            return
    }

    public final void h(java.util.List<com.kwad.sdk.core.response.model.AdTemplate> r1) {
            r0 = this;
            r0.AW = r1
            return
    }

    public final com.kwad.components.ad.reward.page.BackPressHandleResult hx() {
            r1 = this;
            com.kwad.components.ad.reward.k.m r0 = r1.AT
            if (r0 != 0) goto L7
            com.kwad.components.ad.reward.page.BackPressHandleResult r0 = com.kwad.components.ad.reward.page.BackPressHandleResult.NOT_HANDLED
            return r0
        L7:
            r0.kq()
            com.kwad.components.ad.reward.page.BackPressHandleResult r0 = com.kwad.components.ad.reward.page.BackPressHandleResult.HANDLED
            return r0
    }

    public final com.kwad.components.ad.reward.c.e kx() {
            r1 = this;
            com.kwad.components.ad.reward.c.e r0 = r1.AS
            return r0
    }

    public final com.kwad.components.ad.reward.k.l ky() {
            r1 = this;
            com.kwad.components.ad.reward.k.l r0 = r1.AU
            return r0
    }

    @Override // com.kwad.components.core.webview.tachikoma.i
    public final void kz() {
            r1 = this;
            super.kz()
            java.lang.ref.WeakReference<com.kwad.components.ad.reward.g> r0 = r1.td
            if (r0 == 0) goto Le
            java.lang.Object r0 = r0.get()
            com.kwad.components.ad.reward.g r0 = (com.kwad.components.ad.reward.g) r0
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 == 0) goto L14
            r0.b(r1)
        L14:
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.i, com.kwad.components.core.e.e.f
    public final void show() {
            r2 = this;
            super.show()
            java.lang.ref.WeakReference<com.kwad.components.ad.reward.g> r0 = r2.td
            if (r0 == 0) goto L11
            java.lang.Object r0 = r0.get()
            com.kwad.components.ad.reward.g r0 = (com.kwad.components.ad.reward.g) r0
            r1 = 1
            r0.E(r1)
        L11:
            return
    }
}
