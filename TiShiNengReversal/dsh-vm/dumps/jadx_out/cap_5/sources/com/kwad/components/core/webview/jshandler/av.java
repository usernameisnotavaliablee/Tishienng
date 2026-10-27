package com.kwad.components.core.webview.jshandler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class av implements com.kwad.sdk.core.webview.c.a {
    private com.kwad.sdk.core.webview.c.c ack;
    private com.kwad.components.core.webview.jshandler.av.b aec;

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

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b {
        void rv();
    }

    public av(com.kwad.components.core.webview.jshandler.av.b r1) {
            r0 = this;
            r0.<init>()
            r0.aec = r1
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r1, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r2) {
            r0 = this;
            r0.ack = r2
            com.kwad.components.core.webview.jshandler.av$b r1 = r0.aec
            if (r1 == 0) goto L9
            r1.rv()
        L9:
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "registerBackClickListener"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r1 = this;
            r0 = 0
            r1.ack = r0
            return
    }

    public final void uE() {
            r2 = this;
            com.kwad.sdk.core.webview.c.c r0 = r2.ack
            if (r0 == 0) goto L11
            com.kwad.components.core.webview.jshandler.av$a r0 = new com.kwad.components.core.webview.jshandler.av$a
            r0.<init>()
            r1 = 1
            r0.status = r1
            com.kwad.sdk.core.webview.c.c r1 = r2.ack
            r1.a(r0)
        L11:
            return
    }
}
