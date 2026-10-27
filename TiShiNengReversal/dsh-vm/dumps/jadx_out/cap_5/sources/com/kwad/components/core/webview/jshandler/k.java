package com.kwad.components.core.webview.jshandler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class k implements com.kwad.sdk.core.webview.c.a {
    public k() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String aU(java.lang.String r3) {
            com.kwad.components.core.webview.jshandler.u$a r0 = new com.kwad.components.core.webview.jshandler.u$a
            r0.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> Le
            r1.<init>(r3)     // Catch: org.json.JSONException -> Le
            r0.parseJson(r1)     // Catch: org.json.JSONException -> Le
            goto Lf
        Le:
        Lf:
            java.lang.String r3 = r0.key
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r1 = ""
            if (r3 == 0) goto L1a
            return r1
        L1a:
            android.content.Context r3 = com.kwad.sdk.service.ServiceProvider.getContext()
            java.lang.String r2 = "ksadsdk_js_storage_cache_name"
            java.lang.String r0 = r0.key
            java.lang.String r3 = com.kwad.sdk.utils.ag.b(r3, r2, r0, r1)
            return r3
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r2, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r3) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L15
            java.lang.String r2 = aU(r2)
            com.kwad.components.core.webview.jshandler.u$a r0 = new com.kwad.components.core.webview.jshandler.u$a
            r0.<init>()
            r0.value = r2
            r3.a(r0)
            return
        L15:
            r2 = -1
            java.lang.String r0 = "data is empty"
            r3.onError(r2, r0)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "getStorageItem"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r0 = this;
            return
    }
}
