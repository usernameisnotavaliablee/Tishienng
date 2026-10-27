package com.kwad.components.core.e.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class f extends com.kwad.sdk.mvp.Presenter implements com.kwad.components.core.webview.tachikoma.j, com.kwad.sdk.core.j.c {
    private com.kwad.components.core.widget.a.b Ok;
    private com.kwad.components.core.e.a.a Ou;
    private com.kwad.components.core.webview.jshandler.az eS;
    private com.kwad.components.core.webview.tachikoma.i fU;
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;



    public f() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ com.kwad.components.core.e.a.a a(com.kwad.components.core.e.a.f r0) {
            com.kwad.components.core.e.a.a r0 = r0.Ou
            return r0
    }

    private void ak(boolean r1) {
            r0 = this;
            if (r1 != 0) goto L7
            com.kwad.components.core.e.a.a r1 = r0.Ou
            r1.Y()
        L7:
            com.kwad.components.core.e.a.f$2 r1 = new com.kwad.components.core.e.a.f$2
            r1.<init>(r0)
            com.kwad.sdk.utils.bw.runOnUiThread(r1)
            return
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
    public final void a(com.kwad.components.core.webview.jshandler.az r2) {
            r1 = this;
            r1.eS = r2
            com.kwad.components.core.e.a.a r0 = r1.Ou
            r0.eS = r2
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.components.core.webview.tachikoma.TKRenderFailReason r2) {
            r1 = this;
            java.lang.String r2 = "InstalledActivatePresenter"
            java.lang.String r0 = "onTkLoadFailed"
            com.kwad.sdk.core.d.c.d(r2, r0)
            r2 = 1
            r1.ak(r2)
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
            r1 = 0
            r0.ak(r1)
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
            java.lang.String r2 = "InstalledActivatePresenter"
            java.lang.String r0 = "onAdClicked"
            com.kwad.sdk.core.d.c.d(r2, r0)
            r2 = 0
            r1.ak(r2)
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
            r3 = this;
            super.at()
            java.lang.Object r0 = r3.NN()
            com.kwad.components.core.e.a.a r0 = (com.kwad.components.core.e.a.a) r0
            r3.Ou = r0
            com.kwad.sdk.core.response.model.AdTemplate r1 = r0.mAdTemplate
            r3.mAdTemplate = r1
            com.kwad.components.core.widget.a.b r0 = r0.Ok
            r3.Ok = r0
            com.kwad.components.core.e.a.f$1 r0 = new com.kwad.components.core.e.a.f$1
            android.content.Context r1 = r3.getContext()
            r0.<init>(r3, r1)
            r3.fU = r0
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            com.kwad.sdk.core.response.model.AdResultData r0 = com.kwad.sdk.core.response.b.c.dW(r0)
            com.kwad.components.core.webview.tachikoma.i r1 = r3.fU
            r2 = 0
            r1.a(r2, r0, r3)
            com.kwad.components.core.widget.a.b r0 = r3.Ok
            r0.a(r3)
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final void az() {
            r2 = this;
            java.lang.String r0 = "InstalledActivatePresenter"
            java.lang.String r1 = "onTkLoadSuccess"
            com.kwad.sdk.core.d.c.d(r0, r1)
            com.kwad.components.core.e.a.a r0 = r2.Ou
            r0.W()
            return
    }

    @Override // com.kwad.sdk.core.j.c
    public final void bt() {
            r2 = this;
            java.lang.String r0 = "InstalledActivatePresenter"
            java.lang.String r1 = "onPageVisible"
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
            java.lang.String r0 = "InstalledActivatePresenter"
            java.lang.String r1 = "onPageInvisible"
            com.kwad.sdk.core.d.c.d(r0, r1)
            com.kwad.components.core.webview.jshandler.az r0 = r2.eS
            if (r0 == 0) goto Le
            r0.uK()
        Le:
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
            com.kwad.components.core.e.a.a r0 = r1.Ou
            com.kwad.components.core.e.a.g r0 = r0.Oj
            return r0
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final java.lang.String getTKReaderScene() {
            r1 = this;
            java.lang.String r0 = "tk_installed_activate"
            return r0
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final java.lang.String getTkTemplateId() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            com.kwad.sdk.core.response.model.AdMatrixInfo$AdDataV2 r0 = com.kwad.sdk.core.response.b.b.cr(r0)
            com.kwad.sdk.core.response.model.AdMatrixInfo$InstalledActivateInfo r0 = r0.installedActivateInfo
            java.lang.String r0 = r0.templateId
            return r0
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final com.kwad.sdk.widget.g getTouchCoordsView() {
            r1 = this;
            com.kwad.components.core.e.a.a r0 = r1.Ou
            com.kwad.components.core.e.a.g r0 = r0.Oj
            return r0
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r1 = this;
            super.onUnbind()
            com.kwad.components.core.webview.tachikoma.i r0 = r1.fU
            r0.kz()
            com.kwad.components.core.widget.a.b r0 = r1.Ok
            r0.b(r1)
            return
    }
}
