package com.kwad.components.ad.h.a.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a implements com.kwad.sdk.core.webview.c.a {
    private com.kwad.sdk.core.webview.c.c qn;

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r1, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r2) {
            r0 = this;
            r0.qn = r2
            return
    }

    public final void fO() {
            r2 = this;
            com.kwad.sdk.core.webview.c.c r0 = r2.qn
            if (r0 == 0) goto L8
            r1 = 0
            r0.a(r1)
        L8:
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "registerPlayStateResetListener"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r1 = this;
            r0 = 0
            r1.qn = r0
            return
    }
}
