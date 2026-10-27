package com.kwad.components.core.webview.jshandler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class ay implements com.kwad.sdk.core.webview.c.a {
    private com.kwad.sdk.core.webview.c.c ack;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.ksad.json.annotation.KsJson
    public static final class a extends com.kwad.sdk.core.response.a.a implements com.kwad.sdk.core.b {
        public java.lang.String aeg;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public ay() {
            r0 = this;
            r0.<init>()
            return
    }

    private void aY(java.lang.String r2) {
            r1 = this;
            com.kwad.sdk.core.webview.c.c r0 = r1.ack
            if (r0 == 0) goto L10
            com.kwad.components.core.webview.jshandler.ay$a r0 = new com.kwad.components.core.webview.jshandler.ay$a
            r0.<init>()
            r0.aeg = r2
            com.kwad.sdk.core.webview.c.c r2 = r1.ack
            r2.a(r0)
        L10:
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r1, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r2) {
            r0 = this;
            r0.ack = r2
            return
    }

    public final void aX(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L8
            java.lang.String r1 = "windowFocusGet"
            r0.aY(r1)
            return
        L8:
            java.lang.String r1 = "windowFocusLost"
            r0.aY(r1)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "registerFocusListener"
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
