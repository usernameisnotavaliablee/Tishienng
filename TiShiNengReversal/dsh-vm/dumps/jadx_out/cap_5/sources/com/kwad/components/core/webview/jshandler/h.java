package com.kwad.components.core.webview.jshandler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class h implements com.kwad.sdk.core.webview.c.a {
    private int Gm;
    private com.kwad.sdk.core.webview.c.c ack;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.ksad.json.annotation.KsJson
    public static class a extends com.kwad.sdk.core.response.a.a {
        public int loadType;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public h(int r1) {
            r0 = this;
            r0.<init>()
            r0.Gm = r1
            return
    }

    private void be(int r2) {
            r1 = this;
            com.kwad.sdk.core.webview.c.c r0 = r1.ack
            if (r0 != 0) goto L5
            return
        L5:
            com.kwad.components.core.webview.jshandler.h$a r0 = new com.kwad.components.core.webview.jshandler.h$a
            r0.<init>()
            r0.loadType = r2
            com.kwad.sdk.core.webview.c.c r2 = r1.ack
            r2.a(r0)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r1, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r2) {
            r0 = this;
            r0.ack = r2
            int r1 = r0.Gm
            r0.be(r1)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "getLoadInfo"
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
