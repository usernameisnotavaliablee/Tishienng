package com.kwad.components.core.webview.jshandler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class f implements com.kwad.sdk.core.webview.c.a {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.ksad.json.annotation.KsJson
    public static class a extends com.kwad.sdk.core.response.a.a {
        public java.lang.String data;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public f() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r4, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r5) {
            r3 = this;
            com.kwad.components.core.webview.tachikoma.c.k r0 = new com.kwad.components.core.webview.tachikoma.c.k
            r0.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> Le
            r1.<init>(r4)     // Catch: java.lang.Exception -> Le
            r0.parseJson(r1)     // Catch: java.lang.Exception -> Le
            goto Lf
        Le:
        Lf:
            com.kwad.components.core.webview.jshandler.f$a r4 = new com.kwad.components.core.webview.jshandler.f$a
            r4.<init>()
            java.lang.String r1 = r0.data
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L21
            java.lang.String r0 = ""
            r4.data = r0
            goto L38
        L21:
            java.lang.String r1 = new java.lang.String
            com.kwad.sdk.core.a.c$b r2 = com.kwad.sdk.core.a.c.Hf()
            java.lang.String r0 = r0.data
            byte[] r0 = r0.getBytes()
            byte[] r0 = r2.encode(r0)
            java.nio.charset.Charset r2 = com.kwad.sdk.crash.utils.a.UTF_8
            r1.<init>(r0, r2)
            r4.data = r1
        L38:
            r5.a(r4)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "base64"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r0 = this;
            return
    }
}
