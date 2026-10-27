package com.kwad.components.core.webview.jshandler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class bi implements com.kwad.sdk.core.webview.c.a {
    private static android.os.Handler aeD;
    private com.kwad.components.core.e.d.c Pc;
    private com.kwad.sdk.core.webview.b aeC;
    private com.kwad.components.core.webview.jshandler.bi.b aeE;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.ksad.json.annotation.KsJson
    public static class a extends com.kwad.sdk.core.response.a.a {
        public int mI;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b {
        @androidx.annotation.MainThread
        void ae(int r1);
    }

    public bi(com.kwad.sdk.core.webview.b r1, com.kwad.components.core.e.d.c r2, com.kwad.components.core.webview.jshandler.bi.b r3) {
            r0 = this;
            r0.<init>()
            r0.aeC = r1
            r0.Pc = r2
            r0.aeE = r3
            android.os.Handler r1 = com.kwad.components.core.webview.jshandler.bi.aeD
            if (r1 != 0) goto L18
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            com.kwad.components.core.webview.jshandler.bi.aeD = r1
        L18:
            return
    }

    static /* synthetic */ com.kwad.components.core.webview.jshandler.bi.b a(com.kwad.components.core.webview.jshandler.bi r0) {
            com.kwad.components.core.webview.jshandler.bi$b r0 = r0.aeE
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r2, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r3) {
            r1 = this;
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L21
            if (r3 == 0) goto L7
            return
        L7:
            com.kwad.components.core.webview.jshandler.bi$a r3 = new com.kwad.components.core.webview.jshandler.bi$a     // Catch: java.lang.Exception -> L21
            r3.<init>()     // Catch: java.lang.Exception -> L21
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L21
            r0.<init>(r2)     // Catch: java.lang.Exception -> L21
            r3.parseJson(r0)     // Catch: java.lang.Exception -> L21
            int r2 = r3.mI     // Catch: java.lang.Exception -> L21
            android.os.Handler r3 = com.kwad.components.core.webview.jshandler.bi.aeD     // Catch: java.lang.Exception -> L21
            com.kwad.components.core.webview.jshandler.bi$1 r0 = new com.kwad.components.core.webview.jshandler.bi$1     // Catch: java.lang.Exception -> L21
            r0.<init>(r1, r2)     // Catch: java.lang.Exception -> L21
            r3.post(r0)     // Catch: java.lang.Exception -> L21
            return
        L21:
            r2 = move-exception
            com.kwad.sdk.core.d.c.printStackTrace(r2)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "playableConvert"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r0 = this;
            return
    }
}
