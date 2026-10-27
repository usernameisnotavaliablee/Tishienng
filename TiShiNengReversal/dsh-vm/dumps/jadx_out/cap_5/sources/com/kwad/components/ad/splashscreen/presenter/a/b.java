package com.kwad.components.ad.splashscreen.presenter.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b extends com.kwad.components.core.webview.tachikoma.i {
    public b(android.content.Context r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.i
    public final void f(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L1f
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.vj()
            java.lang.String r0 = com.kwad.sdk.core.response.b.b.dK(r0)
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L1f
            com.kwad.components.ad.splashscreen.monitor.b r2 = com.kwad.components.ad.splashscreen.monitor.b.lZ()
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.vj()
            r2.c(r0, r3)
        L1f:
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.i
    public final void g(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L1f
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.vj()
            java.lang.String r0 = com.kwad.sdk.core.response.b.b.dK(r0)
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L1f
            com.kwad.components.ad.splashscreen.monitor.b r2 = com.kwad.components.ad.splashscreen.monitor.b.lZ()
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.vj()
            r2.d(r0, r3)
        L1f:
            return
    }
}
