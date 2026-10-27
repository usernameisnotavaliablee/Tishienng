package com.kwad.components.core.webview.jshandler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class ax implements com.kwad.sdk.core.webview.c.a {
    private final com.kwad.components.core.webview.jshandler.ax.a aed;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void c(com.kwad.components.core.webview.tachikoma.f.d r1);

        void d(com.kwad.components.core.webview.tachikoma.f.d r1);

        void e(com.kwad.components.core.webview.tachikoma.f.d r1);
    }

    public ax(com.kwad.components.core.webview.jshandler.ax.a r1) {
            r0 = this;
            r0.<init>()
            r0.aed = r1
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r3, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r4) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L7
            goto L2f
        L7:
            com.kwad.components.core.webview.tachikoma.c.i r0 = new com.kwad.components.core.webview.tachikoma.c.i
            r0.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L15
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L15
            r0.parseJson(r1)     // Catch: java.lang.Throwable -> L15
            goto L19
        L15:
            r3 = move-exception
            com.kwad.sdk.core.d.c.printStackTraceOnly(r3)
        L19:
            com.kwad.components.core.webview.jshandler.ax$1 r3 = new com.kwad.components.core.webview.jshandler.ax$1
            r3.<init>(r2, r0, r4)
            int r4 = r0.agZ
            r0 = 1
            if (r4 == r0) goto L36
            r0 = 2
            if (r4 == r0) goto L30
            r0 = 3
            if (r4 == r0) goto L2a
            goto L2f
        L2a:
            com.kwad.components.core.webview.jshandler.ax$a r4 = r2.aed
            r4.e(r3)
        L2f:
            return
        L30:
            com.kwad.components.core.webview.jshandler.ax$a r4 = r2.aed
            r4.c(r3)
            return
        L36:
            com.kwad.components.core.webview.jshandler.ax$a r4 = r2.aed
            r4.d(r3)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "registerFeedMotionListener"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r0 = this;
            return
    }
}
