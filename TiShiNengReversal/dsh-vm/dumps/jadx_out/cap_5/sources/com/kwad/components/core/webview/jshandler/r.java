package com.kwad.components.core.webview.jshandler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class r implements com.kwad.sdk.core.webview.c.a {
    public r() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r3, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r4) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L7
            goto L21
        L7:
            com.kwad.components.core.webview.jshandler.q$a r0 = new com.kwad.components.core.webview.jshandler.q$a
            r0.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L15
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L15
            r0.parseJson(r1)     // Catch: java.lang.Throwable -> L15
            goto L19
        L15:
            r3 = move-exception
            com.kwad.sdk.core.d.c.printStackTraceOnly(r3)
        L19:
            java.lang.String r3 = r0.message
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L22
        L21:
            return
        L22:
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r1 = "ksad_webView_local_broadcast"
            r3.<init>(r1)
            java.lang.String r1 = "data"
            java.lang.String r0 = r0.message
            r3.putExtra(r1, r0)
            android.content.Context r0 = com.kwad.sdk.service.ServiceProvider.getContext()
            com.kwad.sdk.utils.ad r0 = com.kwad.sdk.utils.ad.cO(r0)
            r0.i(r3)
            r3 = 0
            r4.a(r3)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "postMessage"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r0 = this;
            return
    }
}
