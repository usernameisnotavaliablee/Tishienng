package com.kwad.components.core.webview.jshandler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class v implements com.kwad.sdk.core.webview.c.a {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a extends com.kwad.sdk.core.response.a.a {
        public boolean acE;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.kwad.sdk.core.response.a.a, com.kwad.sdk.core.b
        public final org.json.JSONObject toJson() {
                r3 = this;
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
                java.lang.String r1 = "isStarted"
                boolean r2 = r3.acE
                com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.ksad.json.annotation.KsJson
    public static class b extends com.kwad.sdk.core.response.a.a {
        public java.lang.String packageName;

        public b() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public v() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r3, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r4) {
            r2 = this;
            com.kwad.components.core.webview.jshandler.v$b r0 = new com.kwad.components.core.webview.jshandler.v$b
            r0.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> Ld
            r1.<init>(r3)     // Catch: java.lang.Exception -> Ld
            r0.parseJson(r1)     // Catch: java.lang.Exception -> Ld
        Ld:
            com.kwad.components.core.webview.jshandler.v$a r3 = new com.kwad.components.core.webview.jshandler.v$a
            r3.<init>()
            android.content.Context r1 = com.kwad.sdk.service.ServiceProvider.getContext()
            java.lang.String r0 = r0.packageName
            boolean r0 = com.kwad.sdk.utils.as.as(r1, r0)
            r3.acE = r0
            r4.a(r3)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "startApp"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r0 = this;
            return
    }
}
