package com.kwad.components.ad.reward.i;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b extends com.kwad.components.core.webview.jshandler.bj implements com.kwad.components.core.webview.jshandler.bj.a {
    private com.kwad.components.core.playable.PlayableSource vw;

    public b(android.content.Context r1, com.kwad.sdk.core.response.model.AdTemplate r2, com.kwad.components.core.playable.PlayableSource r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.vw = r3
            r0.a(r0)
            return
    }

    @Override // com.kwad.components.core.webview.jshandler.bj.a
    public final boolean eM() {
            r4 = this;
            com.kwad.components.ad.reward.a r0 = com.kwad.components.ad.reward.a.gg()
            com.kwad.components.core.playable.PlayableSource r1 = r4.vw
            com.kwad.components.ad.reward.i.a r2 = new com.kwad.components.ad.reward.i.a
            android.content.Context r3 = r4.mContext
            r2.<init>(r3)
            r0.c(r1, r2)
            r0 = 0
            return r0
    }
}
