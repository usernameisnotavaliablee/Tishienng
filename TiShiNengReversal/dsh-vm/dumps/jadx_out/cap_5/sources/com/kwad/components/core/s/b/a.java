package com.kwad.components.core.s.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a extends com.kwad.sdk.mvp.Presenter implements com.kwad.components.core.webview.tachikoma.j {
    private android.widget.FrameLayout Yp;
    private com.kwad.components.core.webview.jshandler.az Yq;
    protected boolean Yr;
    protected com.kwad.components.core.s.a.b Ys;
    private com.kwad.components.core.m.a.a Yt;
    private com.kwad.components.core.webview.tachikoma.i fU;



    public a() {
            r1 = this;
            r1.<init>()
            com.kwad.components.core.s.b.a$1 r0 = new com.kwad.components.core.s.b.a$1
            r0.<init>(r1)
            r1.Yt = r0
            return
    }

    static /* synthetic */ void a(com.kwad.components.core.s.b.a r0) {
            r0.sR()
            return
    }

    static /* synthetic */ void b(com.kwad.components.core.s.b.a r0) {
            r0.sS()
            return
    }

    static /* synthetic */ void c(com.kwad.components.core.s.b.a r0) {
            r0.sT()
            return
    }

    private void sQ() {
            r2 = this;
            com.kwad.components.core.webview.jshandler.az r0 = r2.Yq
            if (r0 != 0) goto L5
            return
        L5:
            boolean r1 = r2.Yr
            if (r1 != 0) goto L15
            r0.uF()
            com.kwad.components.core.webview.jshandler.az r0 = r2.Yq
            r0.uG()
            r0 = 1
            r2.Yr = r0
            return
        L15:
            r0.uJ()
            return
    }

    private void sR() {
            r0 = this;
            r0.sQ()
            return
    }

    private void sS() {
            r2 = this;
            com.kwad.components.core.webview.jshandler.az r0 = r2.Yq
            if (r0 == 0) goto Lc
            boolean r1 = r2.Yr
            if (r1 != 0) goto L9
            goto Lc
        L9:
            r0.uK()
        Lc:
            return
    }

    private void sT() {
            r2 = this;
            com.kwad.components.core.webview.jshandler.az r0 = r2.Yq
            if (r0 == 0) goto L1a
            boolean r1 = r2.Yr
            if (r1 != 0) goto L9
            goto L1a
        L9:
            r0.uH()
            com.kwad.components.core.webview.jshandler.az r0 = r2.Yq
            r0.uI()
            com.kwad.components.core.s.a.b r0 = r2.Ys
            com.kwad.sdk.components.n r0 = r0.Yi
            if (r0 == 0) goto L1a
            r0.callbackDismiss()
        L1a:
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.components.core.webview.jshandler.a.C0094a r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.components.core.webview.jshandler.ae.a r4) {
            r3 = this;
            android.content.Context r0 = r3.getContext()
            float r0 = com.kwad.sdk.c.a.a.bj(r0)
            android.content.Context r1 = r3.getContext()
            int r1 = com.kwad.sdk.utils.br.getScreenWidth(r1)
            float r1 = (float) r1
            float r1 = r1 / r0
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            int r1 = (int) r1
            r4.width = r1
            android.content.Context r1 = r3.getContext()
            int r1 = com.kwad.sdk.utils.br.getScreenHeight(r1)
            float r1 = (float) r1
            float r1 = r1 / r0
            float r1 = r1 + r2
            int r0 = (int) r1
            r4.height = r0
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.components.core.webview.jshandler.az r1) {
            r0 = this;
            r0.Yq = r1
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.components.core.webview.tachikoma.TKRenderFailReason r1) {
            r0 = this;
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
    public final void a(com.kwad.sdk.commercial.model.WebCloseStatus r1) {
            r0 = this;
            android.app.Activity r1 = r0.getActivity()
            r1.finish()
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.sdk.components.t r1, com.kwad.sdk.core.webview.b r2) {
            r0 = this;
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final void a(@androidx.annotation.Nullable com.kwad.sdk.core.webview.d.b.a r1) {
            r0 = this;
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

    @Override // com.kwad.sdk.mvp.Presenter
    public final void at() {
            r4 = this;
            super.at()
            java.lang.Object r0 = r4.NN()
            com.kwad.components.core.s.a.b r0 = (com.kwad.components.core.s.a.b) r0
            r4.Ys = r0
            int r0 = com.kwad.sdk.R.id.ksad_js_container
            android.view.View r0 = r4.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r4.Yp = r0
            com.kwad.components.core.webview.tachikoma.i r0 = new com.kwad.components.core.webview.tachikoma.i
            android.content.Context r1 = r4.getContext()
            r2 = 1000(0x3e8, float:1.401E-42)
            r3 = 0
            r0.<init>(r1, r2, r3)
            r4.fU = r0
            com.kwad.components.core.s.a.b r1 = r4.Ys
            com.kwad.components.offline.api.tk.model.StyleTemplate r1 = r1.Yf
            r0.a(r1)
            com.kwad.components.core.s.a.b r0 = r4.Ys
            com.kwad.sdk.components.n r0 = r0.Yi
            if (r0 == 0) goto L48
            com.kwad.components.core.webview.tachikoma.i r1 = r4.fU
            r0.a(r1)
            com.kwad.components.core.webview.tachikoma.i r0 = r4.fU
            com.kwad.components.core.s.b.a$2 r1 = new com.kwad.components.core.s.b.a$2
            r1.<init>(r4)
            r0.a(r1)
            com.kwad.components.core.webview.tachikoma.i r0 = r4.fU
            java.lang.String r1 = "hasTKBridge"
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.a(r1, r2)
        L48:
            com.kwad.components.core.webview.tachikoma.i r0 = r4.fU
            android.app.Activity r1 = r4.getActivity()
            com.kwad.components.core.s.a.b r2 = r4.Ys
            com.kwad.sdk.core.response.model.AdResultData r2 = r2.mAdResultData
            r0.a(r1, r2, r4)
            com.kwad.components.core.s.a.b r0 = r4.Ys
            java.util.List<com.kwad.components.core.m.a.a> r0 = r0.Rt
            com.kwad.components.core.m.a.a r1 = r4.Yt
            r0.add(r1)
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final void az() {
            r0 = this;
            r0.sQ()
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final void f(com.kwad.sdk.core.response.model.AdTemplate r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final java.lang.String getRegisterViewKey() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final android.widget.FrameLayout getTKContainer() {
            r1 = this;
            android.widget.FrameLayout r0 = r1.Yp
            return r0
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final java.lang.String getTKReaderScene() {
            r1 = this;
            java.lang.String r0 = "tk_activity"
            return r0
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final java.lang.String getTkTemplateId() {
            r1 = this;
            com.kwad.components.core.s.a.b r0 = r1.Ys
            com.kwad.components.offline.api.tk.model.StyleTemplate r0 = r0.Yf
            java.lang.String r0 = r0.templateId
            return r0
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final com.kwad.sdk.widget.g getTouchCoordsView() {
            r1 = this;
            com.kwad.components.core.s.a.b r0 = r1.Ys
            com.kwad.sdk.core.view.AdBaseFrameLayout r0 = r0.mRootContainer
            return r0
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r0 = this;
            super.onCreate()
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r2 = this;
            super.onUnbind()
            r2.sT()
            com.kwad.components.core.webview.tachikoma.i r0 = r2.fU
            r0.kz()
            com.kwad.components.core.s.a.b r0 = r2.Ys
            java.util.List<com.kwad.components.core.m.a.a> r0 = r0.Rt
            com.kwad.components.core.m.a.a r1 = r2.Yt
            r0.remove(r1)
            return
    }
}
