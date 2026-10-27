package com.kwad.components.core.webview.jshandler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class u implements com.kwad.sdk.core.webview.c.a {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.ksad.json.annotation.KsJson
    public static class a extends com.kwad.sdk.core.response.a.a {
        public java.lang.String key;
        public java.lang.String value;

        public a() {
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

    private static boolean aW(java.lang.String r3) {
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
            if (r3 != 0) goto L2f
            java.lang.String r3 = r0.value
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L20
            goto L2f
        L20:
            android.content.Context r3 = com.kwad.sdk.service.ServiceProvider.getContext()
            java.lang.String r1 = r0.key
            java.lang.String r0 = r0.value
            java.lang.String r2 = "ksadsdk_js_storage_cache_name"
            com.kwad.sdk.utils.ag.a(r3, r2, r1, r0)
            r3 = 1
            return r3
        L2f:
            r3 = 0
            return r3
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r3, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r4) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = -1
            if (r0 != 0) goto L18
            boolean r3 = aW(r3)
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
            java.lang.String r0 = "setStorageItem"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r0 = this;
            return
    }
}
