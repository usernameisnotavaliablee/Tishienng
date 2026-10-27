package com.kwad.components.core.webview.jshandler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class aa implements com.kwad.sdk.core.webview.c.a {
    private android.os.Handler acR;

    @androidx.annotation.Nullable
    private com.kwad.sdk.core.webview.c.c acS;
    private com.kwad.sdk.core.webview.d.a.b mWebCardCloseListener;


    public aa(com.kwad.sdk.core.webview.d.a.b r2) {
            r1 = this;
            r1.<init>()
            r1.mWebCardCloseListener = r2
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r2.<init>(r0)
            r1.acR = r2
            return
    }

    static /* synthetic */ com.kwad.sdk.core.webview.c.c a(com.kwad.components.core.webview.jshandler.aa r0) {
            com.kwad.sdk.core.webview.c.c r0 = r0.acS
            return r0
    }

    static /* synthetic */ void a(com.kwad.components.core.webview.jshandler.aa r0, com.kwad.sdk.commercial.model.WebCloseStatus r1) {
            r0.c(r1)
            return
    }

    private void c(com.kwad.sdk.commercial.model.WebCloseStatus r2) {
            r1 = this;
            com.kwad.sdk.core.webview.d.a.b r0 = r1.mWebCardCloseListener
            if (r0 == 0) goto L7
            r0.b(r2)
        L7:
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r2, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r3) {
            r1 = this;
            r1.acS = r3
            com.kwad.sdk.commercial.model.WebCloseStatus r3 = new com.kwad.sdk.commercial.model.WebCloseStatus
            r3.<init>()
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L10
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L10
            r3.parseJson(r0)     // Catch: java.lang.Throwable -> L10
            goto L14
        L10:
            r2 = move-exception
            com.kwad.sdk.core.d.c.printStackTraceOnly(r2)
        L14:
            android.os.Handler r2 = r1.acR
            com.kwad.components.core.webview.jshandler.aa$1 r0 = new com.kwad.components.core.webview.jshandler.aa$1
            r0.<init>(r1, r3)
            r2.post(r0)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "close"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r2 = this;
            r0 = 0
            r2.mWebCardCloseListener = r0
            r2.acS = r0
            android.os.Handler r1 = r2.acR
            r1.removeCallbacksAndMessages(r0)
            return
    }
}
