package com.kwad.components.core.webview.tachikoma.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class v implements com.kwad.sdk.core.webview.c.a {
    private com.kwad.components.core.webview.tachikoma.b.v.a agI;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void b(com.kwad.components.core.webview.tachikoma.c.n r1);
    }

    public v() {
            r0 = this;
            r0.<init>()
            return
    }

    public final void a(com.kwad.components.core.webview.tachikoma.b.v.a r1) {
            r0 = this;
            r0.agI = r1
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r2, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r3) {
            r1 = this;
            com.kwad.components.core.webview.tachikoma.b.v$a r3 = r1.agI
            if (r3 == 0) goto L16
            com.kwad.components.core.webview.tachikoma.c.n r3 = new com.kwad.components.core.webview.tachikoma.c.n
            r3.<init>()
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L16
            r0.<init>(r2)     // Catch: org.json.JSONException -> L16
            r3.parseJson(r0)     // Catch: org.json.JSONException -> L16
            com.kwad.components.core.webview.tachikoma.b.v$a r2 = r1.agI     // Catch: org.json.JSONException -> L16
            r2.b(r3)     // Catch: org.json.JSONException -> L16
        L16:
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "updateVideoMuteState"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r1 = this;
            r0 = 0
            r1.agI = r0
            return
    }
}
