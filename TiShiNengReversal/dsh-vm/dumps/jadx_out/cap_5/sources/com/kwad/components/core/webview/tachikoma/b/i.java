package com.kwad.components.core.webview.tachikoma.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class i implements com.kwad.sdk.core.webview.c.a {
    private com.kwad.components.core.webview.tachikoma.b.i.a agz;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void a(com.kwad.sdk.core.webview.d.b.a r1);
    }

    public i(com.kwad.components.core.webview.tachikoma.b.i.a r1) {
            r0 = this;
            r0.<init>()
            r0.agz = r1
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r2, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r3) {
            r1 = this;
            com.kwad.sdk.core.webview.d.b.a r3 = new com.kwad.sdk.core.webview.d.b.a
            r3.<init>()
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> Le
            r0.<init>(r2)     // Catch: org.json.JSONException -> Le
            r3.parseJson(r0)     // Catch: org.json.JSONException -> Le
            goto L12
        Le:
            r2 = move-exception
            com.kwad.sdk.core.d.c.printStackTrace(r2)
        L12:
            com.kwad.components.core.webview.tachikoma.b.i$a r2 = r1.agz
            if (r2 == 0) goto L19
            r2.a(r3)
        L19:
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "notifyClickAd"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r0 = this;
            return
    }
}
