package com.kwad.components.core.webview.jshandler.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class f implements com.kwad.sdk.core.webview.c.a {
    private final java.lang.ref.WeakReference<android.content.Context> aeJ;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.ksad.json.annotation.KsJson
    public static class a extends com.kwad.sdk.core.response.a.a {
        public java.lang.String text;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public f(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.aeJ = r0
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r5, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r6) {
            r4 = this;
            java.lang.ref.WeakReference<android.content.Context> r0 = r4.aeJ     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L36
            r1 = 0
            if (r0 == 0) goto L12
            java.lang.ref.WeakReference<android.content.Context> r0 = r4.aeJ     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L36
            android.content.Context r0 = (android.content.Context) r0     // Catch: java.lang.Throwable -> L36
            goto L13
        L12:
            r0 = r1
        L13:
            if (r0 == 0) goto L36
            com.kwad.components.core.webview.jshandler.a.f$a r2 = new com.kwad.components.core.webview.jshandler.a.f$a     // Catch: java.lang.Throwable -> L36
            r2.<init>()     // Catch: java.lang.Throwable -> L36
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L36
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L36
            r2.parseJson(r3)     // Catch: java.lang.Throwable -> L36
            java.lang.String r5 = "ksad_landing_page"
            java.lang.String r2 = r2.text     // Catch: java.lang.Throwable -> L36
            boolean r5 = com.kwad.sdk.utils.o.a(r0, r5, r2)     // Catch: java.lang.Throwable -> L36
            if (r5 == 0) goto L30
            r6.a(r1)     // Catch: java.lang.Throwable -> L36
            return
        L30:
            java.lang.String r5 = "写入错误"
            r0 = -1
            r6.onError(r0, r5)     // Catch: java.lang.Throwable -> L36
        L36:
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "setClipBoard"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r0 = this;
            return
    }
}
