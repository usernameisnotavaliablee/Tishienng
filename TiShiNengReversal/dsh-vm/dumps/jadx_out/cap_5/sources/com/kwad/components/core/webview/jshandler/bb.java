package com.kwad.components.core.webview.jshandler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class bb implements com.kwad.sdk.core.webview.c.a {
    private final com.kwad.components.core.webview.jshandler.bb.a ael;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        @androidx.annotation.MainThread
        void cL();
    }

    public bb(com.kwad.components.core.webview.jshandler.bb.a r1) {
            r0 = this;
            r0.<init>()
            r0.ael = r1
            return
    }

    static /* synthetic */ com.kwad.components.core.webview.jshandler.bb.a a(com.kwad.components.core.webview.jshandler.bb r0) {
            com.kwad.components.core.webview.jshandler.bb$a r0 = r0.ael
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r1, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r2) {
            r0 = this;
            com.kwad.components.core.webview.jshandler.bb$1 r1 = new com.kwad.components.core.webview.jshandler.bb$1
            r1.<init>(r0, r2)
            com.kwad.sdk.utils.bw.runOnUiThread(r1)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "registerMotionListener"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r0 = this;
            return
    }
}
