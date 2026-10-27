package com.kwad.components.core.webview.tachikoma.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class u implements com.kwad.sdk.core.webview.c.a {
    private com.kwad.components.core.webview.tachikoma.b.u.a agH;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void a(com.kwad.components.core.webview.tachikoma.b.u.b r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.ksad.json.annotation.KsJson
    public static class b extends com.kwad.sdk.core.response.a.a {
        public int errorCode;
        public java.lang.String errorMsg;
        public int status;

        public b() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public u() {
            r0 = this;
            r0.<init>()
            return
    }

    public final void a(com.kwad.components.core.webview.tachikoma.b.u.a r1) {
            r0 = this;
            r0.agH = r1
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r2, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r3) {
            r1 = this;
            com.kwad.components.core.webview.tachikoma.b.u$a r3 = r1.agH
            if (r3 == 0) goto L1e
            com.kwad.components.core.webview.tachikoma.b.u$b r3 = new com.kwad.components.core.webview.tachikoma.b.u$b
            r3.<init>()
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L11 java.lang.Throwable -> L17
            r0.<init>(r2)     // Catch: org.json.JSONException -> L11 java.lang.Throwable -> L17
            r3.parseJson(r0)     // Catch: org.json.JSONException -> L11 java.lang.Throwable -> L17
        L11:
            com.kwad.components.core.webview.tachikoma.b.u$a r2 = r1.agH
            r2.a(r3)
            return
        L17:
            r2 = move-exception
            com.kwad.components.core.webview.tachikoma.b.u$a r0 = r1.agH
            r0.a(r3)
            throw r2
        L1e:
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "splashShowStatus"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r1 = this;
            r0 = 0
            r1.agH = r0
            return
    }
}
