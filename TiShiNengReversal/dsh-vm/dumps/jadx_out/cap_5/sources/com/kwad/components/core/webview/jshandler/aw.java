package com.kwad.components.core.webview.jshandler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class aw implements com.kwad.sdk.core.webview.c.a {
    private com.kwad.sdk.core.webview.c.c ack;

    public aw() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r1, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r2) {
            r0 = this;
            r0.ack = r2
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "registerDeeplinkListener"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r1 = this;
            r0 = 0
            r1.ack = r0
            return
    }

    public final void onFailed() {
            r3 = this;
            com.kwad.sdk.core.webview.c.c r0 = r3.ack
            if (r0 == 0) goto La
            r1 = -1
            java.lang.String r2 = "deep link error"
            r0.onError(r1, r2)
        La:
            return
    }

    public final void onSuccess() {
            r2 = this;
            com.kwad.sdk.core.webview.c.c r0 = r2.ack
            if (r0 == 0) goto L8
            r1 = 0
            r0.a(r1)
        L8:
            return
    }
}
