package com.kwad.components.ad.reward.k;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class o extends com.kwad.components.core.webview.tachikoma.b.w implements com.kwad.components.core.webview.jshandler.as.b {

    @androidx.annotation.Nullable
    private com.kwad.components.core.playable.a rF;

    public o(com.kwad.components.ad.reward.g r1) {
            r0 = this;
            r0.<init>()
            com.kwad.components.core.playable.a r1 = r1.rF
            r0.rF = r1
            if (r1 == 0) goto Lc
            r1.a(r0)
        Lc:
            return
    }

    @Override // com.kwad.components.core.webview.jshandler.as.b
    public final void a(com.kwad.components.core.webview.jshandler.as.a r1) {
            r0 = this;
            r0.b(r1)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "registerPlayableStatusListener"
            return r0
    }

    @Override // com.kwad.components.core.webview.tachikoma.b.w, com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r1 = this;
            super.onDestroy()
            com.kwad.components.core.playable.a r0 = r1.rF
            if (r0 == 0) goto Ld
            r0.b(r1)
            r0 = 0
            r1.rF = r0
        Ld:
            return
    }
}
