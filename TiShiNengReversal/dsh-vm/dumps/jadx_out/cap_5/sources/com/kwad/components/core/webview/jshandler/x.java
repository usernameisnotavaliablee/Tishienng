package com.kwad.components.core.webview.jshandler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class x implements com.kwad.sdk.core.webview.c.a {


    public x() {
            r0 = this;
            r0.<init>()
            return
    }

    protected void a(com.kwad.components.core.webview.tachikoma.c.y r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r2, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r3) {
            r1 = this;
            com.kwad.components.core.webview.tachikoma.c.y r3 = new com.kwad.components.core.webview.tachikoma.c.y
            r3.<init>()
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> Le
            r0.<init>(r2)     // Catch: org.json.JSONException -> Le
            r3.parseJson(r0)     // Catch: org.json.JSONException -> Le
            goto L12
        Le:
            r2 = move-exception
            com.kwad.sdk.core.d.c.printStackTrace(r2)
        L12:
            com.kwad.components.core.webview.jshandler.x$1 r2 = new com.kwad.components.core.webview.jshandler.x$1
            r2.<init>(r1, r3)
            com.kwad.sdk.utils.bw.runOnUiThread(r2)
            return
    }

    protected void b(com.kwad.components.core.webview.tachikoma.c.y r1) {
            r0 = this;
            return
    }

    protected void c(com.kwad.components.core.webview.tachikoma.c.y r1) {
            r0 = this;
            return
    }

    protected void d(com.kwad.components.core.webview.tachikoma.c.y r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "updateVideoPlayStatus"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r0 = this;
            return
    }
}
