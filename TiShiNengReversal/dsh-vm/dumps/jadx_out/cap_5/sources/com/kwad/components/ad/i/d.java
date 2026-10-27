package com.kwad.components.ad.i;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class d extends com.kwad.sdk.widget.KSFrameLayout implements com.kwad.components.core.webview.tachikoma.j, com.kwad.sdk.core.j.c {
    public static java.lang.String qP = "PUSH_VIEW_TAG";
    private com.kwad.components.core.webview.jshandler.az eS;
    private com.kwad.components.core.webview.tachikoma.i fU;
    private final com.kwad.components.core.widget.a.b fg;
    private com.kwad.sdk.core.response.model.AdTemplate qQ;
    private com.kwad.components.ad.b.a.b qR;
    private boolean qS;
    private android.view.ViewGroup qT;
    private boolean qU;



    static {
            return
    }

    public d(@androidx.annotation.NonNull android.content.Context r3, com.kwad.sdk.core.response.model.AdTemplate r4) {
            r2 = this;
            r2.<init>(r3)
            r3 = 0
            r2.qS = r3
            java.lang.String r3 = com.kwad.components.ad.i.d.qP
            r2.setTag(r3)
            r2.qQ = r4
            com.kwad.components.core.widget.a.b r3 = new com.kwad.components.core.widget.a.b
            r4 = 100
            r3.<init>(r2, r4)
            r2.fg = r3
            com.kwad.components.ad.i.d$1 r3 = new com.kwad.components.ad.i.d$1
            r0 = -1
            android.content.Context r4 = r2.getContext()
            r3.<init>(r2, r0, r4)
            r2.fU = r3
            com.kwad.sdk.core.response.model.AdTemplate r3 = r2.qQ
            com.kwad.sdk.core.response.model.AdResultData r3 = com.kwad.sdk.core.response.b.c.dW(r3)
            com.kwad.components.core.webview.tachikoma.i r4 = r2.fU
            r0 = 0
            r4.a(r0, r3, r2)
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.i.d r0) {
            r0.fZ()
            return
    }

    private void destroy() {
            r2 = this;
            com.kwad.components.core.webview.tachikoma.i r0 = r2.fU
            r0.kz()
            android.view.ViewGroup r0 = r2.qT
            if (r0 == 0) goto Lc
            r0.removeView(r2)
        Lc:
            android.view.ViewParent r0 = r2.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L19
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeView(r2)
        L19:
            return
    }

    private void fZ() {
            r1 = this;
            boolean r0 = r1.qU
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r1.qU = r0
            r1.gc()
            r1.destroy()
            return
    }

    private void ga() {
            r1 = this;
            com.kwad.components.ad.b.a.b r0 = r1.qR
            if (r0 == 0) goto L7
            r0.U()
        L7:
            com.kwad.components.core.webview.jshandler.az r0 = r1.eS
            if (r0 == 0) goto L13
            r0.uF()
            com.kwad.components.core.webview.jshandler.az r0 = r1.eS
            r0.uG()
        L13:
            return
    }

    private void gc() {
            r1 = this;
            com.kwad.components.ad.b.a.b r0 = r1.qR
            if (r0 == 0) goto L7
            r0.V()
        L7:
            com.kwad.components.core.webview.jshandler.az r0 = r1.eS
            if (r0 == 0) goto L13
            r0.uH()
            com.kwad.components.core.webview.jshandler.az r0 = r1.eS
            r0.uI()
        L13:
            return
    }

    private boolean gd() {
            r4 = this;
            r0 = 0
            com.kwad.sdk.core.c.b.Ho()     // Catch: java.lang.Throwable -> L41
            android.app.Activity r1 = com.kwad.sdk.core.c.b.getCurrentActivity()     // Catch: java.lang.Throwable -> L41
            if (r1 == 0) goto L43
            boolean r2 = r1.isFinishing()     // Catch: java.lang.Throwable -> L41
            if (r2 == 0) goto L11
            goto L43
        L11:
            android.view.Window r2 = r1.getWindow()     // Catch: java.lang.Throwable -> L41
            android.view.View r2 = r2.getDecorView()     // Catch: java.lang.Throwable -> L41
            r3 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r2 = r2.findViewById(r3)     // Catch: java.lang.Throwable -> L41
            boolean r3 = r2 instanceof android.view.ViewGroup     // Catch: java.lang.Throwable -> L41
            if (r3 != 0) goto L25
            return r0
        L25:
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2     // Catch: java.lang.Throwable -> L41
            r4.qT = r2     // Catch: java.lang.Throwable -> L41
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams     // Catch: java.lang.Throwable -> L41
            r3 = -1
            r2.<init>(r3, r3)     // Catch: java.lang.Throwable -> L41
            android.view.ViewGroup r3 = r4.qT     // Catch: java.lang.Throwable -> L41
            r3.addView(r4, r2)     // Catch: java.lang.Throwable -> L41
            com.kwad.sdk.core.c.b.Ho()     // Catch: java.lang.Throwable -> L41
            com.kwad.components.ad.i.d$2 r2 = new com.kwad.components.ad.i.d$2     // Catch: java.lang.Throwable -> L41
            r2.<init>(r4, r1)     // Catch: java.lang.Throwable -> L41
            com.kwad.sdk.core.c.b.a(r2)     // Catch: java.lang.Throwable -> L41
            r0 = 1
            return r0
        L41:
            r1 = move-exception
            goto L44
        L43:
            return r0
        L44:
            com.kwad.sdk.core.d.c.printStackTrace(r1)
            return r0
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.components.core.webview.jshandler.a.C0094a r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.components.core.webview.jshandler.ae.a r5) {
            r4 = this;
            android.content.Context r0 = r4.getContext()
            float r0 = com.kwad.sdk.c.a.a.bj(r0)
            android.content.Context r1 = r4.getContext()
            int r1 = com.kwad.sdk.c.a.a.getScreenHeight(r1)
            float r1 = (float) r1
            android.content.Context r2 = r4.getContext()
            int r2 = com.kwad.sdk.c.a.a.getScreenWidth(r2)
            float r2 = (float) r2
            float r2 = r2 / r0
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r3
            int r2 = (int) r2
            r5.width = r2
            float r1 = r1 / r0
            float r1 = r1 + r3
            int r0 = (int) r1
            r5.height = r0
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.components.core.webview.jshandler.az r1) {
            r0 = this;
            r0.eS = r1
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.components.core.webview.tachikoma.TKRenderFailReason r2) {
            r1 = this;
            java.lang.String r2 = "PushAdView"
            java.lang.String r0 = "onTkLoadFailed"
            com.kwad.sdk.core.d.c.d(r2, r0)
            r2 = 0
            r1.qS = r2
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.components.core.webview.tachikoma.b.o r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.components.core.webview.tachikoma.b.p r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.components.core.webview.tachikoma.c.n r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.components.core.webview.tachikoma.c.u r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final void a(@androidx.annotation.Nullable com.kwad.sdk.commercial.model.WebCloseStatus r1) {
            r0 = this;
            r0.fZ()
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.sdk.components.t r1, com.kwad.sdk.core.webview.b r2) {
            r0 = this;
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final void a(@androidx.annotation.Nullable com.kwad.sdk.core.webview.d.b.a r2) {
            r1 = this;
            java.lang.String r2 = "PushAdView"
            java.lang.String r0 = "onAdClicked"
            com.kwad.sdk.core.d.c.d(r2, r0)
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final void aA() {
            r0 = this;
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final void aB() {
            r0 = this;
            return
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout
    public final void aa() {
            r1 = this;
            super.aa()
            com.kwad.components.core.widget.a.b r0 = r1.fg
            r0.a(r1)
            com.kwad.components.core.widget.a.b r0 = r1.fg
            r0.wi()
            return
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout
    public final void ab() {
            r1 = this;
            super.ab()
            com.kwad.components.core.widget.a.b r0 = r1.fg
            r0.release()
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final void az() {
            r2 = this;
            java.lang.String r0 = "PushAdView"
            java.lang.String r1 = "onTkLoadSuccess"
            com.kwad.sdk.core.d.c.d(r0, r1)
            r0 = 1
            r2.qS = r0
            return
    }

    @Override // com.kwad.sdk.core.j.c
    public final void bt() {
            r2 = this;
            java.lang.String r0 = "PushAdView"
            java.lang.String r1 = "onPageVisible: "
            com.kwad.sdk.core.d.c.d(r0, r1)
            com.kwad.components.core.webview.jshandler.az r0 = r2.eS
            if (r0 == 0) goto Le
            r0.uJ()
        Le:
            return
    }

    @Override // com.kwad.sdk.core.j.c
    public final void bu() {
            r2 = this;
            java.lang.String r0 = "PushAdView"
            java.lang.String r1 = "onPageInvisible: "
            com.kwad.sdk.core.d.c.d(r0, r1)
            com.kwad.components.core.webview.jshandler.az r0 = r2.eS
            if (r0 == 0) goto Le
            r0.uK()
        Le:
            return
    }

    public final boolean c(com.kwad.components.ad.b.a.b r1) {
            r0 = this;
            r0.qR = r1
            boolean r1 = r0.qS
            if (r1 == 0) goto L11
            boolean r1 = r0.gd()
            if (r1 == 0) goto L11
            r0.ga()
            r1 = 1
            return r1
        L11:
            r1 = 0
            return r1
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final void f(com.kwad.sdk.core.response.model.AdTemplate r1) {
            r0 = this;
            return
    }

    public final boolean gb() {
            r1 = this;
            boolean r0 = r1.qS
            return r0
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final java.lang.String getRegisterViewKey() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final android.widget.FrameLayout getTKContainer() {
            r0 = this;
            return r0
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final java.lang.String getTKReaderScene() {
            r1 = this;
            java.lang.String r0 = "tk_push_ad"
            return r0
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final java.lang.String getTkTemplateId() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.qQ
            java.lang.String r0 = com.kwad.sdk.core.response.b.b.dS(r0)
            return r0
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final com.kwad.sdk.widget.g getTouchCoordsView() {
            r0 = this;
            return r0
    }
}
