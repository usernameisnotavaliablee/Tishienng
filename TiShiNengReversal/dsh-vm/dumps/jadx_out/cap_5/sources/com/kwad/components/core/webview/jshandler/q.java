package com.kwad.components.core.webview.jshandler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class q implements com.kwad.sdk.core.webview.c.a {
    private android.content.BroadcastReceiver acx;
    private com.kwad.sdk.core.webview.c.c qn;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.ksad.json.annotation.KsJson
    public static class a extends com.kwad.sdk.core.response.a.a {
        public java.lang.String message;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public q() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ com.kwad.sdk.core.webview.c.c a(com.kwad.components.core.webview.jshandler.q r0) {
            com.kwad.sdk.core.webview.c.c r0 = r0.qn
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r4, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r5) {
            r3 = this;
            r3.qn = r5
            android.content.IntentFilter r4 = new android.content.IntentFilter
            r4.<init>()
            java.lang.String r0 = "ksad_webView_local_broadcast"
            r4.addAction(r0)
            r0 = 0
            android.content.BroadcastReceiver r1 = r3.acx     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L23
            android.content.Context r1 = com.kwad.sdk.service.ServiceProvider.getContext()     // Catch: java.lang.Throwable -> L21
            com.kwad.sdk.utils.ad r1 = com.kwad.sdk.utils.ad.cO(r1)     // Catch: java.lang.Throwable -> L21
            android.content.BroadcastReceiver r2 = r3.acx     // Catch: java.lang.Throwable -> L21
            r1.unregisterReceiver(r2)     // Catch: java.lang.Throwable -> L21
            r3.acx = r0     // Catch: java.lang.Throwable -> L21
            goto L23
        L21:
            r4 = move-exception
            goto L38
        L23:
            com.kwad.components.core.webview.jshandler.q$1 r1 = new com.kwad.components.core.webview.jshandler.q$1     // Catch: java.lang.Throwable -> L21
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L21
            r3.acx = r1     // Catch: java.lang.Throwable -> L21
            android.content.Context r1 = com.kwad.sdk.service.ServiceProvider.getContext()     // Catch: java.lang.Throwable -> L21
            com.kwad.sdk.utils.ad r1 = com.kwad.sdk.utils.ad.cO(r1)     // Catch: java.lang.Throwable -> L21
            android.content.BroadcastReceiver r2 = r3.acx     // Catch: java.lang.Throwable -> L21
            r1.a(r2, r4)     // Catch: java.lang.Throwable -> L21
            goto L3b
        L38:
            com.kwad.sdk.crash.b.n(r4)
        L3b:
            r5.a(r0)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "onMessage"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r2 = this;
            android.content.BroadcastReceiver r0 = r2.acx     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L17
            android.content.Context r0 = com.kwad.sdk.service.ServiceProvider.getContext()     // Catch: java.lang.Throwable -> L15
            com.kwad.sdk.utils.ad r0 = com.kwad.sdk.utils.ad.cO(r0)     // Catch: java.lang.Throwable -> L15
            android.content.BroadcastReceiver r1 = r2.acx     // Catch: java.lang.Throwable -> L15
            r0.unregisterReceiver(r1)     // Catch: java.lang.Throwable -> L15
            r0 = 0
            r2.acx = r0     // Catch: java.lang.Throwable -> L15
            return
        L15:
            r0 = move-exception
            goto L18
        L17:
            return
        L18:
            com.kwad.sdk.crash.b.n(r0)
            return
    }
}
