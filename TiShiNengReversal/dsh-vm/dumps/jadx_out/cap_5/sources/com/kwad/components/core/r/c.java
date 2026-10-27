package com.kwad.components.core.r;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c extends com.kwad.components.core.webview.tachikoma.d.c {


    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    private com.kwad.components.core.webview.tachikoma.d sN() {
            r1 = this;
            com.kwad.components.core.r.c$1 r0 = new com.kwad.components.core.r.c$1
            r0.<init>(r1)
            return r0
    }

    @Override // com.kwad.components.core.webview.tachikoma.d.c, com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.components.core.webview.tachikoma.TKRenderFailReason r1) {
            r0 = this;
            super.a(r1)
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.d.c, com.kwad.components.core.webview.tachikoma.d.a, com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.sdk.commercial.model.WebCloseStatus r1) {
            r0 = this;
            super.a(r1)
            boolean r1 = r1.interactSuccess
            if (r1 == 0) goto L11
            com.kwad.components.core.webview.tachikoma.d.b r1 = r0.ahp
            com.kwad.components.core.webview.tachikoma.d.e r1 = r1.afi
            if (r1 == 0) goto L10
            r1.dismiss()
        L10:
            return
        L11:
            com.kwad.components.core.webview.tachikoma.d.b r1 = r0.ahp
            android.app.Activity r1 = r1.mActivity
            r1.finish()
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.d.a, com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.sdk.components.t r1, com.kwad.sdk.core.webview.b r2) {
            r0 = this;
            com.kwad.components.core.webview.tachikoma.d r2 = r0.sN()
            r1.c(r2)
            return
    }
}
