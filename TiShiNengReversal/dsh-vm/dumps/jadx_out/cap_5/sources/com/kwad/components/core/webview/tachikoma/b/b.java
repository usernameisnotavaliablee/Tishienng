package com.kwad.components.core.webview.tachikoma.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b implements com.kwad.sdk.core.webview.c.a {
    protected final com.kwad.sdk.core.webview.b acw;
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;

    public b(@androidx.annotation.NonNull com.kwad.sdk.core.webview.b r1, @androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r2) {
            r0 = this;
            r0.<init>()
            r0.acw = r1
            r0.mAdTemplate = r2
            return
    }

    private void aO(com.kwad.sdk.core.response.model.AdTemplate r4) {
            r3 = this;
            r0 = 1
            r4.mIsForceJumpLandingPage = r0
            com.kwad.components.core.e.d.a$a r1 = new com.kwad.components.core.e.d.a$a
            com.kwad.sdk.core.webview.b r2 = r3.acw
            android.view.ViewGroup r2 = r2.TG
            android.content.Context r2 = r2.getContext()
            r1.<init>(r2)
            com.kwad.components.core.e.d.a$a r4 = r1.aB(r4)
            com.kwad.components.core.e.d.a$a r4 = r4.aB(r0)
            com.kwad.components.core.e.d.a$a r4 = r4.ap(r0)
            com.kwad.components.core.e.d.a$a r4 = r4.an(r0)
            r0 = 0
            com.kwad.components.core.e.d.a$a r4 = r4.as(r0)
            com.kwad.components.core.e.d.a.a(r4)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r4, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r5) {
            r3 = this;
            java.lang.String r0 = "adTemplate"
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L1f
            r1.<init>(r4)     // Catch: java.lang.Exception -> L1f
            com.kwad.sdk.core.response.model.AdTemplate r4 = new com.kwad.sdk.core.response.model.AdTemplate     // Catch: java.lang.Exception -> L1f
            r4.<init>()     // Catch: java.lang.Exception -> L1f
            boolean r2 = r1.has(r0)     // Catch: java.lang.Exception -> L1f
            if (r2 == 0) goto L21
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Exception -> L1f
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L1f
            r1.<init>(r0)     // Catch: java.lang.Exception -> L1f
            r4.parseJson(r1)     // Catch: java.lang.Exception -> L1f
            goto L21
        L1f:
            r4 = move-exception
            goto L37
        L21:
            java.util.List<com.kwad.sdk.core.response.model.AdInfo> r0 = r4.adInfoList     // Catch: java.lang.Exception -> L1f
            int r0 = r0.size()     // Catch: java.lang.Exception -> L1f
            if (r0 == 0) goto L2d
            r3.aO(r4)     // Catch: java.lang.Exception -> L1f
            goto L32
        L2d:
            com.kwad.sdk.core.response.model.AdTemplate r4 = r3.mAdTemplate     // Catch: java.lang.Exception -> L1f
            r3.aO(r4)     // Catch: java.lang.Exception -> L1f
        L32:
            r4 = 0
            r5.a(r4)     // Catch: java.lang.Exception -> L1f
            return
        L37:
            com.kwad.sdk.core.d.c.printStackTrace(r4)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "activityMiddlePageConvert"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r0 = this;
            return
    }
}
