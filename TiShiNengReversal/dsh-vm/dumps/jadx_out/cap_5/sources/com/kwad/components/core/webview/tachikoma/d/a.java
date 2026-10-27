package com.kwad.components.core.webview.tachikoma.d;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class a extends com.kwad.sdk.mvp.Presenter implements com.kwad.components.core.webview.tachikoma.j {
    protected com.kwad.components.core.webview.tachikoma.d.b ahp;
    protected com.kwad.components.core.webview.tachikoma.i fU;

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.components.core.webview.tachikoma.b.o r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public void a(com.kwad.components.core.webview.tachikoma.b.p r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.components.core.webview.tachikoma.c.n r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public void a(com.kwad.components.core.webview.tachikoma.c.u r1) {
            r0 = this;
            return
    }

    protected void a(com.kwad.components.core.webview.tachikoma.d.b r1) {
            r0 = this;
            return
    }

    public void a(com.kwad.sdk.commercial.model.WebCloseStatus r1) {
            r0 = this;
            com.kwad.components.core.webview.tachikoma.d.b r1 = r0.ahp
            com.kwad.components.core.webview.tachikoma.d.e r1 = r1.afi
            if (r1 == 0) goto L9
            r1.dismiss()
        L9:
            return
    }

    public void a(com.kwad.sdk.components.t r1, com.kwad.sdk.core.webview.b r2) {
            r0 = this;
            return
    }

    public void a(@androidx.annotation.Nullable com.kwad.sdk.core.webview.d.b.a r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public void aA() {
            r0 = this;
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public void at() {
            r3 = this;
            super.at()
            java.lang.Object r0 = r3.NN()
            com.kwad.components.core.webview.tachikoma.d.b r0 = (com.kwad.components.core.webview.tachikoma.d.b) r0
            r3.ahp = r0
            r3.a(r0)
            com.kwad.components.core.webview.tachikoma.i r0 = r3.fU
            if (r0 != 0) goto L18
            com.kwad.components.core.webview.tachikoma.i r0 = r3.iY()
            r3.fU = r0
        L18:
            com.kwad.components.core.webview.tachikoma.d.b r0 = r3.ahp
            com.kwad.components.offline.api.tk.model.StyleTemplate r0 = r0.Yf
            if (r0 == 0) goto L23
            com.kwad.components.core.webview.tachikoma.i r1 = r3.fU
            r1.a(r0)
        L23:
            com.kwad.components.core.webview.tachikoma.i r0 = r3.fU
            com.kwad.components.core.webview.tachikoma.d.b r1 = r3.ahp
            android.app.Activity r2 = r1.mActivity
            com.kwad.sdk.core.response.model.AdResultData r1 = r1.mAdResultData
            r0.a(r2, r1, r3)
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final void f(com.kwad.sdk.core.response.model.AdTemplate r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public com.kwad.sdk.widget.g getTouchCoordsView() {
            r1 = this;
            com.kwad.components.core.webview.tachikoma.d.b r0 = r1.ahp
            com.kwad.sdk.widget.g r0 = r0.ahq
            return r0
    }

    protected com.kwad.components.core.webview.tachikoma.i iY() {
            r4 = this;
            com.kwad.components.core.webview.tachikoma.i r0 = new com.kwad.components.core.webview.tachikoma.i
            com.kwad.components.core.webview.tachikoma.d.b r1 = r4.ahp
            long r1 = r1.AO
            android.content.Context r3 = r4.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r1 = this;
            super.onUnbind()
            com.kwad.components.core.webview.tachikoma.i r0 = r1.fU
            r0.kz()
            r0 = 0
            r1.fU = r0
            return
    }
}
