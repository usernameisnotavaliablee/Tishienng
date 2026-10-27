package com.kwad.components.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a extends com.kwad.sdk.components.e implements com.kwad.components.ad.b.b {



    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.kwad.components.ad.b.b
    public final java.lang.String getBidRequestToken(com.kwad.sdk.api.KsScene r1) {
            r0 = this;
            com.kwad.sdk.internal.api.SceneImpl r1 = com.kwad.sdk.internal.api.SceneImpl.covert(r1)
            java.lang.String r1 = com.kwad.components.ad.adbit.c.a(r1)
            return r1
    }

    @Override // com.kwad.components.ad.b.b
    public final java.lang.String getBidRequestTokenV2(com.kwad.sdk.api.KsScene r1) {
            r0 = this;
            java.lang.String r1 = com.kwad.components.ad.adbit.c.getBidRequestTokenV2(r1)
            return r1
    }

    @Override // com.kwad.sdk.components.b
    public final java.lang.Class getComponentsType() {
            r1 = this;
            java.lang.Class<com.kwad.components.ad.b.b> r0 = com.kwad.components.ad.b.b.class
            return r0
    }

    @Override // com.kwad.sdk.components.b
    public final void init(android.content.Context r1) {
            r0 = this;
            com.kwad.components.ad.j.d r1 = com.kwad.components.ad.j.d.nG()
            r1.init()
            return
    }

    @Override // com.kwad.sdk.components.e, com.kwad.sdk.components.b
    public final int priority() {
            r1 = this;
            r0 = -100
            return r0
    }

    @Override // com.kwad.components.ad.b.b
    public final boolean showInstallDialog(android.app.Activity r3, com.kwad.sdk.api.KsExitInstallListener r4) {
            r2 = this;
            com.kwad.sdk.l r0 = com.kwad.sdk.l.Cf()
            boolean r0 = r0.Bn()
            if (r0 != 0) goto Lc
            r3 = 0
            return r3
        Lc:
            com.kwad.components.ad.a$1 r0 = new com.kwad.components.ad.a$1
            r0.<init>(r2, r4)
            com.kwad.components.ad.a$2 r1 = new com.kwad.components.ad.a$2
            r1.<init>(r2, r4)
            boolean r3 = com.kwad.sdk.a.a.a.a(r3, r0, r1)
            return r3
    }
}
