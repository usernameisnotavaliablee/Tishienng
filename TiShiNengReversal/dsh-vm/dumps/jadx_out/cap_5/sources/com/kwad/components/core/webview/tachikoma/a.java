package com.kwad.components.core.webview.tachikoma;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a implements com.kwad.sdk.core.webview.c.a {
    private final com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;

    public a(com.kwad.sdk.core.response.model.AdTemplate r1) {
            r0 = this;
            r0.<init>()
            r0.mAdTemplate = r1
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r3, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r4) {
            r2 = this;
            com.kwad.sdk.core.response.model.AdTemplate r3 = r2.mAdTemplate
            r0 = -1
            if (r3 == 0) goto L24
            com.kwad.sdk.core.response.model.AdInfo r3 = com.kwad.sdk.core.response.b.e.el(r3)
            java.lang.String r3 = com.kwad.sdk.core.response.b.a.aS(r3)
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 == 0) goto L19
            java.lang.String r3 = "landing page url is null"
            r4.onError(r0, r3)
            return
        L19:
            com.kwad.components.core.webview.tachikoma.c.m r0 = new com.kwad.components.core.webview.tachikoma.c.m
            r0.<init>()
            r0.ahf = r3
            r4.a(r0)
            return
        L24:
            java.lang.String r3 = "adTemplate is null"
            r4.onError(r0, r3)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "getLandingPageInfo"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r0 = this;
            return
    }
}
