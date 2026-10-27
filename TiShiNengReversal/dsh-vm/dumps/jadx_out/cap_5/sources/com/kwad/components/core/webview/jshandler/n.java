package com.kwad.components.core.webview.jshandler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class n implements com.kwad.sdk.core.webview.c.a {
    com.kwad.sdk.core.webview.b acw;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a implements com.kwad.sdk.core.b {
        public java.lang.String NN;
        public com.kwad.sdk.core.response.model.AdTemplate adTemplate;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.kwad.sdk.core.b
        public final void parseJson(@androidx.annotation.Nullable org.json.JSONObject r3) {
                r2 = this;
                java.lang.String r0 = "adTemplate"
                if (r3 != 0) goto L5
                goto L2f
            L5:
                java.lang.String r1 = "creativeId"
                java.lang.String r1 = r3.optString(r1)
                r2.NN = r1
                boolean r1 = r3.has(r0)     // Catch: java.lang.Exception -> L23
                if (r1 == 0) goto L2f
                java.lang.String r3 = r3.getString(r0)     // Catch: java.lang.Exception -> L23
                com.kwad.sdk.core.response.model.AdTemplate r0 = r2.adTemplate     // Catch: java.lang.Exception -> L23
                if (r0 != 0) goto L25
                com.kwad.sdk.core.response.model.AdTemplate r0 = new com.kwad.sdk.core.response.model.AdTemplate     // Catch: java.lang.Exception -> L23
                r0.<init>()     // Catch: java.lang.Exception -> L23
                r2.adTemplate = r0     // Catch: java.lang.Exception -> L23
                goto L25
            L23:
                r3 = move-exception
                goto L30
            L25:
                com.kwad.sdk.core.response.model.AdTemplate r0 = r2.adTemplate     // Catch: java.lang.Exception -> L23
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L23
                r1.<init>(r3)     // Catch: java.lang.Exception -> L23
                r0.parseJson(r1)     // Catch: java.lang.Exception -> L23
            L2f:
                return
            L30:
                com.kwad.sdk.core.d.c.printStackTraceOnly(r3)
                return
        }

        @Override // com.kwad.sdk.core.b
        public final org.json.JSONObject toJson() {
                r3 = this;
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
                java.lang.String r1 = "adTemplate"
                com.kwad.sdk.core.response.model.AdTemplate r2 = r3.adTemplate
                com.kwad.sdk.utils.aa.a(r0, r1, r2)
                java.lang.String r1 = "creativeId"
                java.lang.String r2 = r3.NN
                com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
                return r0
        }
    }

    public n(com.kwad.sdk.core.webview.b r1) {
            r0 = this;
            r0.<init>()
            r0.acw = r1
            return
    }

    private com.kwad.sdk.core.response.model.AdTemplate a(com.kwad.components.core.webview.jshandler.n.a r2) {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.adTemplate
            if (r0 == 0) goto L5
            return r0
        L5:
            com.kwad.sdk.core.webview.b r0 = r1.acw
            java.lang.String r2 = r2.NN
            com.kwad.sdk.core.response.model.AdTemplate r2 = r0.dk(r2)
            return r2
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r3, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r4) {
            r2 = this;
            com.kwad.components.core.webview.jshandler.n$a r0 = new com.kwad.components.core.webview.jshandler.n$a     // Catch: java.lang.Throwable -> L21
            r0.<init>()     // Catch: java.lang.Throwable -> L21
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L21
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L21
            r0.parseJson(r1)     // Catch: java.lang.Throwable -> L21
            com.kwad.sdk.core.response.model.AdTemplate r3 = r2.a(r0)     // Catch: java.lang.Throwable -> L21
            com.kwad.sdk.core.response.model.AdInfo r3 = com.kwad.sdk.core.response.b.e.el(r3)     // Catch: java.lang.Throwable -> L21
            com.kwad.sdk.core.response.model.AdInfo$AdConversionInfo r3 = r3.adConversionInfo     // Catch: java.lang.Throwable -> L21
            java.lang.String r3 = r3.appDownloadUrl     // Catch: java.lang.Throwable -> L21
            com.kwad.sdk.core.download.a.dM(r3)     // Catch: java.lang.Throwable -> L21
            r3 = 0
            r4.a(r3)     // Catch: java.lang.Throwable -> L21
            return
        L21:
            r3 = move-exception
            com.kwad.sdk.core.d.c.printStackTraceOnly(r3)
            r0 = -1
            java.lang.String r3 = r3.getMessage()
            r4.onError(r0, r3)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "cancelAppDownloadForAd"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r0 = this;
            return
    }
}
