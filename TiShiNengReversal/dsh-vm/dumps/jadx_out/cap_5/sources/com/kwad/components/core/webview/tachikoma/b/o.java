package com.kwad.components.core.webview.tachikoma.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class o extends com.kwad.components.core.webview.tachikoma.b.w {
    private com.kwad.components.core.webview.tachikoma.b.o.a agE;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        boolean isMuted();
    }

    public o() {
            r0 = this;
            r0.<init>()
            return
    }

    public final void a(com.kwad.components.core.webview.tachikoma.b.o.a r1) {
            r0 = this;
            r0.agE = r1
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.b.w, com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r2, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r3) {
            r1 = this;
            super.a(r2, r3)
            com.kwad.components.core.webview.tachikoma.b.o$a r2 = r1.agE
            if (r2 == 0) goto L17
            com.kwad.components.core.webview.tachikoma.c.n r2 = new com.kwad.components.core.webview.tachikoma.c.n
            r2.<init>()
            com.kwad.components.core.webview.tachikoma.b.o$a r0 = r1.agE
            boolean r0 = r0.isMuted()
            r2.ahg = r0
            r3.a(r2)
        L17:
            return
    }

    public final void c(com.kwad.components.core.webview.tachikoma.c.n r1) {
            r0 = this;
            super.b(r1)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "registerMuteStateListener"
            return r0
    }
}
