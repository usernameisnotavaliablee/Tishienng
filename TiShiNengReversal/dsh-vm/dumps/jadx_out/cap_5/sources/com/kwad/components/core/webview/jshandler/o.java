package com.kwad.components.core.webview.jshandler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class o implements com.kwad.sdk.core.webview.c.a {
    com.kwad.sdk.core.webview.b acw;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a implements com.kwad.sdk.core.b {
        public java.lang.String url;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.kwad.sdk.core.b
        public final void parseJson(@androidx.annotation.Nullable org.json.JSONObject r2) {
                r1 = this;
                if (r2 != 0) goto L3
                return
            L3:
                java.lang.String r0 = "url"
                java.lang.String r2 = r2.optString(r0)
                r1.url = r2
                return
        }

        @Override // com.kwad.sdk.core.b
        public final org.json.JSONObject toJson() {
                r3 = this;
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
                java.lang.String r1 = "url"
                java.lang.String r2 = r3.url
                com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
                return r0
        }
    }

    public o(com.kwad.sdk.core.webview.b r1) {
            r0 = this;
            r0.<init>()
            r0.acw = r1
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r4, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r5) {
            r3 = this;
            r0 = -1
            com.kwad.components.core.webview.jshandler.o$a r1 = new com.kwad.components.core.webview.jshandler.o$a     // Catch: java.lang.Throwable -> L1c
            r1.<init>()     // Catch: java.lang.Throwable -> L1c
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1c
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L1c
            r1.parseJson(r2)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r4 = r1.url     // Catch: java.lang.Throwable -> L1c
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L1e
            java.lang.String r4 = "no download url specified"
            r5.onError(r0, r4)     // Catch: java.lang.Throwable -> L1c
            return
        L1c:
            r4 = move-exception
            goto L26
        L1e:
            com.kwad.sdk.core.download.a.dM(r4)     // Catch: java.lang.Throwable -> L1c
            r4 = 0
            r5.a(r4)     // Catch: java.lang.Throwable -> L1c
            return
        L26:
            com.kwad.sdk.core.d.c.printStackTraceOnly(r4)
            java.lang.String r4 = r4.getMessage()
            r5.onError(r0, r4)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "cancelAppDownload"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r0 = this;
            return
    }
}
