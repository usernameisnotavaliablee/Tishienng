package com.kwad.components.core.webview.jshandler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class bh implements com.kwad.sdk.core.webview.c.a {
    private com.kwad.components.core.webview.jshandler.bh.a aex;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void ut();
    }

    public bh(com.kwad.components.core.webview.jshandler.bh.a r1) {
            r0 = this;
            r0.<init>()
            r0.aex = r1
            return
    }

    static /* synthetic */ com.kwad.components.core.webview.jshandler.bh.a a(com.kwad.components.core.webview.jshandler.bh r0) {
            com.kwad.components.core.webview.jshandler.bh$a r0 = r0.aex
            return r0
    }

    private void uL() {
            r1 = this;
            boolean r0 = com.kwad.components.core.e.c.b.oW()
            if (r0 == 0) goto L7
            return
        L7:
            com.kwad.components.core.webview.jshandler.bh$1 r0 = new com.kwad.components.core.webview.jshandler.bh$1
            r0.<init>(r1)
            com.kwad.sdk.utils.bw.runOnUiThread(r0)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r1, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r2) {
            r0 = this;
            r0.uL()
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "showDownloadTips"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r0 = this;
            return
    }
}
