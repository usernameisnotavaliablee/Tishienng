package com.kwad.components.ad.c.d;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b extends com.kwad.components.core.webview.tachikoma.i {
    public b(android.content.Context r1, int r2, int r3) {
            r0 = this;
            r2 = -1
            r0.<init>(r1, r2, r2)
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.i
    public final void f(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L11
            com.kwad.sdk.core.response.model.AdTemplate r2 = r0.vj()
            java.lang.String r2 = com.kwad.sdk.core.response.b.b.dM(r2)
            r1.equals(r2)
        L11:
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.i
    public final void g(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L11
            com.kwad.sdk.core.response.model.AdTemplate r2 = r0.vj()
            java.lang.String r2 = com.kwad.sdk.core.response.b.b.dM(r2)
            r1.equals(r2)
        L11:
            return
    }
}
