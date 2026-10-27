package com.kwad.components.core.webview.jshandler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class g implements com.kwad.sdk.core.webview.c.a {
    private com.kwad.sdk.core.webview.c.c ack;
    private int oS;
    private int oT;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.ksad.json.annotation.KsJson
    public static class a extends com.kwad.sdk.core.response.a.a {
        public int showLiveStatus;
        public int showLiveStyle;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public g(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.oS = r1
            r0.oT = r2
            return
    }

    private void r(int r2, int r3) {
            r1 = this;
            com.kwad.sdk.core.webview.c.c r0 = r1.ack
            if (r0 != 0) goto L5
            return
        L5:
            com.kwad.components.core.webview.jshandler.g$a r0 = new com.kwad.components.core.webview.jshandler.g$a
            r0.<init>()
            r0.showLiveStatus = r2
            r0.showLiveStyle = r3
            com.kwad.sdk.core.webview.c.c r2 = r1.ack
            r2.a(r0)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r1, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r2) {
            r0 = this;
            r0.ack = r2
            int r1 = r0.oS
            int r2 = r0.oT
            r0.r(r1, r2)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "getLiveInfo"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r1 = this;
            r0 = 0
            r1.ack = r0
            return
    }
}
