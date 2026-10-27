package com.kwad.components.core.webview.jshandler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class ab implements com.kwad.sdk.core.webview.c.a {
    private com.kwad.sdk.core.webview.b acw;

    public ab() {
            r0 = this;
            r0.<init>()
            return
    }

    public ab(com.kwad.sdk.core.webview.b r1) {
            r0 = this;
            r0.<init>()
            r0.acw = r1
            return
    }

    private static void a(@androidx.annotation.NonNull com.kwad.sdk.commercial.model.WebViewCommercialMsg r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "handleH5Log actionType actionType"
            r0.<init>(r1)
            java.lang.String r1 = r2.category
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "CommercialLogHandler"
            com.kwad.sdk.core.d.c.d(r1, r0)
            java.lang.String r0 = r2.category
            com.kwad.sdk.commercial.b.a(r0, r2)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r4, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r5) {
            r3 = this;
            java.lang.String r0 = "CommercialLogHandler"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L2c
            java.lang.String r2 = "handleJsCall : "
            r1.<init>(r2)     // Catch: org.json.JSONException -> L2c
            r1.append(r4)     // Catch: org.json.JSONException -> L2c
            java.lang.String r1 = r1.toString()     // Catch: org.json.JSONException -> L2c
            com.kwad.sdk.core.d.c.d(r0, r1)     // Catch: org.json.JSONException -> L2c
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L2c
            r0.<init>(r4)     // Catch: org.json.JSONException -> L2c
            java.lang.String r4 = "adCacheId"
            int r4 = r0.optInt(r4)     // Catch: org.json.JSONException -> L2c
            r1 = 0
            if (r4 == 0) goto L2e
            com.kwad.sdk.core.response.model.AdResultData r4 = com.kwad.components.core.o.a.e.a.a.aI(r4)     // Catch: org.json.JSONException -> L2c
            if (r4 == 0) goto L2e
            com.kwad.sdk.core.response.model.AdInfo r4 = com.kwad.sdk.core.response.b.c.s(r4)     // Catch: org.json.JSONException -> L2c
            goto L2f
        L2c:
            r4 = move-exception
            goto L4e
        L2e:
            r4 = r1
        L2f:
            if (r4 != 0) goto L3f
            com.kwad.sdk.core.webview.b r2 = r3.acw     // Catch: org.json.JSONException -> L2c
            if (r2 == 0) goto L3f
            com.kwad.sdk.core.response.model.AdTemplate r2 = r2.getAdTemplate()     // Catch: org.json.JSONException -> L2c
            if (r2 == 0) goto L3f
            com.kwad.sdk.core.response.model.AdInfo r4 = com.kwad.sdk.core.response.b.e.el(r2)     // Catch: org.json.JSONException -> L2c
        L3f:
            com.kwad.sdk.commercial.model.WebViewCommercialMsg r2 = new com.kwad.sdk.commercial.model.WebViewCommercialMsg     // Catch: org.json.JSONException -> L2c
            r2.<init>(r4)     // Catch: org.json.JSONException -> L2c
            r2.parseJson(r0)     // Catch: org.json.JSONException -> L2c
            a(r2)     // Catch: org.json.JSONException -> L2c
            r5.a(r1)     // Catch: org.json.JSONException -> L2c
            return
        L4e:
            com.kwad.sdk.core.d.c.printStackTrace(r4)
            r0 = -1
            java.lang.String r4 = r4.getMessage()
            r5.onError(r0, r4)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "commercialLog"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r0 = this;
            return
    }
}
