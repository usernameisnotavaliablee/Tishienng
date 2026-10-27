package com.kwad.components.ad.draw;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a extends com.kwad.sdk.components.e implements com.kwad.components.ad.b.c {
    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.kwad.sdk.components.b
    public final java.lang.Class getComponentsType() {
            r1 = this;
            java.lang.Class<com.kwad.components.ad.b.c> r0 = com.kwad.components.ad.b.c.class
            return r0
    }

    @Override // com.kwad.sdk.components.b
    public final void init(android.content.Context r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.components.ad.b.c
    public final void loadDrawAd(com.kwad.sdk.api.KsScene r2, @androidx.annotation.NonNull com.kwad.sdk.api.KsLoadManager.DrawAdListener r3) {
            r1 = this;
            com.kwad.sdk.l r0 = com.kwad.sdk.l.Cf()
            boolean r0 = r0.CG()
            if (r0 != 0) goto L14
            com.kwad.sdk.core.network.e r2 = com.kwad.sdk.core.network.e.aEz
            int r0 = r2.errorCode
            java.lang.String r2 = r2.msg
            r3.onError(r0, r2)
            return
        L14:
            com.kwad.components.ad.draw.d.loadDrawAd(r2, r3)
            return
    }
}
