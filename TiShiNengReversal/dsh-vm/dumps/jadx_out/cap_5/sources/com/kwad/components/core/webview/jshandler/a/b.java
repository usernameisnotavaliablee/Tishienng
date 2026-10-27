package com.kwad.components.core.webview.jshandler.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b implements com.kwad.sdk.core.webview.c.a {
    private com.kwad.components.core.webview.jshandler.a.c abQ;


    public b(com.kwad.components.core.webview.jshandler.a.c r1) {
            r0 = this;
            r0.<init>()
            r0.abQ = r1
            return
    }

    static /* synthetic */ com.kwad.components.core.webview.jshandler.a.c a(com.kwad.components.core.webview.jshandler.a.b r0) {
            com.kwad.components.core.webview.jshandler.a.c r0 = r0.abQ
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r1, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r2) {
            r0 = this;
            com.kwad.components.core.webview.jshandler.a.b$1 r1 = new com.kwad.components.core.webview.jshandler.a.b$1
            r1.<init>(r0)
            com.kwad.sdk.utils.bw.runOnUiThread(r1)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "exitWebView"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r1 = this;
            r0 = 0
            r1.abQ = r0
            return
    }
}
