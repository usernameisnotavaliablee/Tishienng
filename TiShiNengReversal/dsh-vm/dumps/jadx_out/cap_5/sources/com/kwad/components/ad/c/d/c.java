package com.kwad.components.ad.c.d;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class c extends com.kwad.components.ad.c.c.a implements com.kwad.components.core.webview.tachikoma.j {
    private com.kwad.components.ad.c.d.b db;

    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.components.core.webview.jshandler.a.C0094a r3) {
            r2 = this;
            java.lang.String r3 = r3.acf
            r3.getClass()
            java.lang.String r0 = "adShowCallback"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L1f
            java.lang.String r0 = "adShowErrorCallback"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L16
            return
        L16:
            com.kwad.components.ad.c.b r3 = r2.cD
            r0 = 0
            java.lang.String r1 = "onMediaPlayError"
            r3.c(r0, r1)
            return
        L1f:
            com.kwad.components.ad.c.b r3 = r2.cD
            r3.W()
            return
    }

    public void a(com.kwad.components.core.webview.jshandler.az r1) {
            r0 = this;
            return
    }

    public void a(com.kwad.components.core.webview.tachikoma.b.o r1) {
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

    public void a(com.kwad.sdk.commercial.model.WebCloseStatus r1) {
            r0 = this;
            return
    }

    public void a(com.kwad.sdk.components.t r1, com.kwad.sdk.core.webview.b r2) {
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

    @Override // com.kwad.components.ad.c.c.a, com.kwad.sdk.mvp.Presenter
    public void at() {
            r3 = this;
            super.at()
            com.kwad.components.ad.c.d.b r0 = new com.kwad.components.ad.c.d.b
            android.content.Context r1 = r3.getContext()
            r2 = -1
            r0.<init>(r1, r2, r2)
            r3.db = r0
            com.kwad.components.ad.c.b r1 = r3.cD
            com.kwad.sdk.core.response.model.AdResultData r1 = r1.mAdResultData
            r2 = 0
            r0.a(r2, r1, r3)
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final void f(com.kwad.sdk.core.response.model.AdTemplate r2) {
            r1 = this;
            com.kwad.components.ad.c.b r0 = r1.cD
            r0.b(r2)
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public java.lang.String getRegisterViewKey() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public com.kwad.sdk.widget.g getTouchCoordsView() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public void onUnbind() {
            r1 = this;
            super.onUnbind()
            com.kwad.components.ad.c.d.b r0 = r1.db
            r0.kz()
            return
    }
}
