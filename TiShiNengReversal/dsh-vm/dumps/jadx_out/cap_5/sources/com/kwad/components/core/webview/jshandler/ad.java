package com.kwad.components.core.webview.jshandler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class ad implements com.kwad.sdk.core.webview.c.a {
    private com.kwad.components.core.webview.jshandler.ad.a acZ;
    private final com.kwad.sdk.core.webview.b acw;
    private android.os.Handler iK;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void cK();
    }

    public ad(com.kwad.sdk.core.webview.b r3, com.kwad.components.core.webview.jshandler.ad.a r4) {
            r2 = this;
            r2.<init>()
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.iK = r0
            r2.acw = r3
            r2.acZ = r4
            return
    }

    static /* synthetic */ com.kwad.components.core.webview.jshandler.ad.a a(com.kwad.components.core.webview.jshandler.ad r0) {
            com.kwad.components.core.webview.jshandler.ad$a r0 = r0.acZ
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r2, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r3) {
            r1 = this;
            android.os.Handler r2 = r1.iK
            com.kwad.components.core.webview.jshandler.ad$1 r0 = new com.kwad.components.core.webview.jshandler.ad$1
            r0.<init>(r1)
            r2.post(r0)
            r2 = 0
            r3.a(r2)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "dislike"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r2 = this;
            android.os.Handler r0 = r2.iK
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
            return
    }
}
