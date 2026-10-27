package com.kwad.components.core.webview.tachikoma.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class r implements com.kwad.sdk.core.webview.c.a {
    public r() {
            r0 = this;
            r0.<init>()
            return
    }

    public void a(com.kwad.components.core.webview.tachikoma.c.s r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r2, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r3) {
            r1 = this;
            com.kwad.components.core.webview.tachikoma.c.s r3 = new com.kwad.components.core.webview.tachikoma.c.s
            r3.<init>()
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L10
            r0.<init>(r2)     // Catch: org.json.JSONException -> L10
            r3.parseJson(r0)     // Catch: org.json.JSONException -> L10
            r1.a(r3)     // Catch: org.json.JSONException -> L10
        L10:
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "showTKDialog"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r0 = this;
            return
    }
}
