package com.kwad.components.core.webview.jshandler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class at implements com.kwad.sdk.core.webview.c.a {
    private com.kwad.sdk.core.webview.c.c ack;
    private com.kwad.components.core.webview.jshandler.at.a adY;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.ksad.json.annotation.KsJson
    public class a extends com.kwad.sdk.core.response.a.a implements com.kwad.sdk.core.b {
        final /* synthetic */ com.kwad.components.core.webview.jshandler.at adZ;
        public int id;
        public int status;

        public a(com.kwad.components.core.webview.jshandler.at r1) {
                r0 = this;
                r0.adZ = r1
                r0.<init>()
                return
        }
    }

    public at() {
            r1 = this;
            r1.<init>()
            com.kwad.components.core.webview.jshandler.at$a r0 = new com.kwad.components.core.webview.jshandler.at$a
            r0.<init>(r1)
            r1.adY = r0
            return
    }

    private void s(int r2, int r3) {
            r1 = this;
            com.kwad.sdk.core.webview.c.c r3 = r1.ack
            if (r3 == 0) goto Le
            com.kwad.components.core.webview.jshandler.at$a r0 = r1.adY
            r0.id = r2
            r2 = 2
            r0.status = r2
            r3.a(r0)
        Le:
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r1, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r2) {
            r0 = this;
            r0.ack = r2
            return
    }

    public final void bf(int r2) {
            r1 = this;
            r2 = 1
            r0 = 2
            r1.s(r2, r0)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "registerAnimationListener"
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
