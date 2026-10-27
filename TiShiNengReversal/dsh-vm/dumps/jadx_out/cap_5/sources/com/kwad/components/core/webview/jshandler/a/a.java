package com.kwad.components.core.webview.jshandler.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a extends com.kwad.components.core.webview.jshandler.e {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.ksad.json.annotation.KsJson
    /* renamed from: com.kwad.components.core.webview.jshandler.a.a$a, reason: collision with other inner class name */
    public static class C0095a extends com.kwad.sdk.core.response.a.a {
        public java.lang.String aeH;

        public C0095a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.kwad.components.core.webview.jshandler.e
    public final java.lang.String aS(java.lang.String r3) {
            r2 = this;
            com.kwad.components.core.webview.jshandler.a.a$a r0 = new com.kwad.components.core.webview.jshandler.a.a$a     // Catch: java.lang.Throwable -> L10
            r0.<init>()     // Catch: java.lang.Throwable -> L10
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L10
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L10
            r0.parseJson(r1)     // Catch: java.lang.Throwable -> L10
            java.lang.String r3 = r0.aeH     // Catch: java.lang.Throwable -> L10
            return r3
        L10:
            r3 = 0
            return r3
    }

    @Override // com.kwad.components.core.webview.jshandler.e, com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "checkAppInstalled"
            return r0
    }
}
