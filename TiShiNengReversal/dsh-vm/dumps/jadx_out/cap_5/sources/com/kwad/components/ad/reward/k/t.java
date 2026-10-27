package com.kwad.components.ad.reward.k;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class t implements com.kwad.sdk.core.webview.c.a {
    private com.kwad.components.ad.reward.g AM;
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
    private android.content.Context mContext;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.ksad.json.annotation.KsJson
    public static class a extends com.kwad.sdk.core.response.a.a {
        public boolean AN;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public t(android.content.Context r1, com.kwad.components.ad.reward.g r2) {
            r0 = this;
            r0.<init>()
            r0.mContext = r1
            com.kwad.sdk.core.response.model.AdTemplate r1 = r2.mAdTemplate
            r0.mAdTemplate = r1
            r0.AM = r2
            return
    }

    private void a(com.kwad.components.ad.reward.k.t.a r2) {
            r1 = this;
            boolean r2 = r2.AN
            if (r2 == 0) goto La
            com.kwad.components.ad.reward.g r2 = r1.AM
            com.kwad.components.ad.reward.presenter.f.r(r2)
            return
        La:
            android.content.Context r2 = r1.mContext
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            com.kwad.components.core.page.AdWebViewActivityProxy.launch(r2, r0)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r1, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r2) {
            r0 = this;
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L11
            r2.<init>(r1)     // Catch: java.lang.Exception -> L11
            com.kwad.components.ad.reward.k.t$a r1 = new com.kwad.components.ad.reward.k.t$a     // Catch: java.lang.Exception -> L11
            r1.<init>()     // Catch: java.lang.Exception -> L11
            r1.parseJson(r2)     // Catch: java.lang.Exception -> L11
            r0.a(r1)     // Catch: java.lang.Exception -> L11
            return
        L11:
            r1 = move-exception
            com.kwad.sdk.core.d.c.printStackTraceOnly(r1)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "showLandingPage"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r1 = this;
            r0 = 0
            r1.AM = r0
            r1.mContext = r0
            r1.mAdTemplate = r0
            return
    }
}
