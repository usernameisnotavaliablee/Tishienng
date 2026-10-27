package com.kwad.components.core.webview.jshandler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class ak implements com.kwad.sdk.core.webview.c.a {
    private final android.os.Handler acR;

    @androidx.annotation.Nullable
    private com.kwad.sdk.core.webview.c.c acS;
    private com.kwad.components.core.webview.jshandler.ak.b eV;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.ksad.json.annotation.KsJson
    public static class a extends com.kwad.sdk.core.response.a.a {
        public int ady;
        public int type;

        public a() {
                r1 = this;
                r1.<init>()
                r0 = -1
                r1.ady = r0
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b {
        @androidx.annotation.MainThread
        void a(com.kwad.components.core.webview.jshandler.ak.a r1);
    }

    public ak(com.kwad.components.core.webview.jshandler.ak.b r2) {
            r1 = this;
            r1.<init>()
            r1.eV = r2
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r2.<init>(r0)
            r1.acR = r2
            return
    }

    static /* synthetic */ com.kwad.sdk.core.webview.c.c a(com.kwad.components.core.webview.jshandler.ak r0) {
            com.kwad.sdk.core.webview.c.c r0 = r0.acS
            return r0
    }

    static /* synthetic */ void a(com.kwad.components.core.webview.jshandler.ak r0, com.kwad.components.core.webview.jshandler.ak.a r1) {
            r0.b(r1)
            return
    }

    private void b(com.kwad.components.core.webview.jshandler.ak.a r2) {
            r1 = this;
            com.kwad.components.core.webview.jshandler.ak$b r0 = r1.eV
            if (r0 == 0) goto L7
            r0.a(r2)
        L7:
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r3, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r4) {
            r2 = this;
            r2.acS = r4     // Catch: java.lang.Exception -> L16
            com.kwad.components.core.webview.jshandler.ak$a r4 = new com.kwad.components.core.webview.jshandler.ak$a     // Catch: java.lang.Exception -> L16
            r4.<init>()     // Catch: java.lang.Exception -> L16
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L16
            if (r0 != 0) goto L18
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L16
            r0.<init>(r3)     // Catch: java.lang.Exception -> L16
            r4.parseJson(r0)     // Catch: java.lang.Exception -> L16
            goto L18
        L16:
            r3 = move-exception
            goto L23
        L18:
            android.os.Handler r3 = r2.acR     // Catch: java.lang.Exception -> L16
            com.kwad.components.core.webview.jshandler.ak$1 r0 = new com.kwad.components.core.webview.jshandler.ak$1     // Catch: java.lang.Exception -> L16
            r0.<init>(r2, r4)     // Catch: java.lang.Exception -> L16
            r3.post(r0)     // Catch: java.lang.Exception -> L16
            return
        L23:
            com.kwad.sdk.core.webview.c.c r4 = r2.acS
            r0 = -1
            java.lang.String r1 = r3.getMessage()
            r4.onError(r0, r1)
            com.kwad.sdk.core.d.c.printStackTraceOnly(r3)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "hide"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r2 = this;
            r0 = 0
            r2.eV = r0
            r2.acS = r0
            android.os.Handler r1 = r2.acR
            r1.removeCallbacksAndMessages(r0)
            return
    }
}
