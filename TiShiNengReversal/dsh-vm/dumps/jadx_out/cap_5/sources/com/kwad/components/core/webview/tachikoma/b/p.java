package com.kwad.components.core.webview.tachikoma.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class p extends com.kwad.components.core.webview.tachikoma.b.w {
    private boolean enable;

    public p() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.enable = r0
            return
    }

    public final void a(com.kwad.components.core.webview.tachikoma.c.z r2) {
            r1 = this;
            boolean r0 = r1.enable
            if (r0 == 0) goto L7
            super.b(r2)
        L7:
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.b.w, com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r1, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r2) {
            r0 = this;
            super.a(r1, r2)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "registerVideoProgressListener"
            return r0
    }
}
