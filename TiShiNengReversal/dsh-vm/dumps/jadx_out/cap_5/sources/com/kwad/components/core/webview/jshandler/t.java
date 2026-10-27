package com.kwad.components.core.webview.jshandler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class t implements com.kwad.sdk.core.webview.c.a {
    public t() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean aV(java.lang.String r2) {
            com.kwad.components.core.webview.jshandler.u$a r0 = new com.kwad.components.core.webview.jshandler.u$a
            r0.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> Le
            r1.<init>(r2)     // Catch: org.json.JSONException -> Le
            r0.parseJson(r1)     // Catch: org.json.JSONException -> Le
            goto Lf
        Le:
        Lf:
            java.lang.String r2 = r0.key
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L19
            r2 = 0
            return r2
        L19:
            android.content.Context r2 = com.kwad.sdk.service.ServiceProvider.getContext()
            java.lang.String r1 = "ksadsdk_js_storage_cache_name"
            java.lang.String r0 = r0.key
            com.kwad.sdk.utils.ag.h(r2, r1, r0)
            r2 = 1
            return r2
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r3, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r4) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = -1
            if (r0 != 0) goto L18
            boolean r3 = aV(r3)
            if (r3 == 0) goto L12
            r3 = 0
            r4.a(r3)
            return
        L12:
            java.lang.String r3 = ""
            r4.onError(r1, r3)
            return
        L18:
            java.lang.String r3 = "data is empty"
            r4.onError(r1, r3)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "removeStorageItem"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r0 = this;
            return
    }
}
