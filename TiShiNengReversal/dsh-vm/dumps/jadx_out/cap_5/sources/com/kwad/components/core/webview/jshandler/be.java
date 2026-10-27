package com.kwad.components.core.webview.jshandler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class be implements com.kwad.sdk.core.webview.c.a {
    private com.kwad.sdk.core.webview.c.c ack;
    private com.kwad.components.core.webview.jshandler.be.a aes;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.ksad.json.annotation.KsJson
    public static final class a extends com.kwad.sdk.core.response.a.a implements com.kwad.sdk.core.b {
        public int status;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public be() {
            r1 = this;
            r1.<init>()
            com.kwad.components.core.webview.jshandler.be$a r0 = new com.kwad.components.core.webview.jshandler.be$a
            r0.<init>()
            r1.aes = r0
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r1, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r2) {
            r0 = this;
            r0.ack = r2
            return
    }

    public final void bg(int r3) {
            r2 = this;
            com.kwad.sdk.core.webview.c.c r0 = r2.ack
            if (r0 == 0) goto Lb
            com.kwad.components.core.webview.jshandler.be$a r1 = r2.aes
            r1.status = r3
            r0.a(r1)
        Lb:
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "registerVideoListener"
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
