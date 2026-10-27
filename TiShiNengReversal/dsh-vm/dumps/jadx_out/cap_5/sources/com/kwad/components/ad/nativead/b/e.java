package com.kwad.components.ad.nativead.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class e extends com.kwad.components.ad.nativead.a.a {
    private boolean eD;
    private com.kwad.sdk.api.KsNativeAd.VideoPlayListener oQ;


    public e() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.eD = r0
            return
    }

    static /* synthetic */ com.kwad.sdk.api.KsNativeAd.VideoPlayListener a(com.kwad.components.ad.nativead.b.e r0) {
            com.kwad.sdk.api.KsNativeAd$VideoPlayListener r0 = r0.oQ
            return r0
    }

    static /* synthetic */ boolean a(com.kwad.components.ad.nativead.b.e r0, boolean r1) {
            r0.eD = r1
            return r1
    }

    static /* synthetic */ boolean b(com.kwad.components.ad.nativead.b.e r0) {
            boolean r0 = r0.eD
            return r0
    }

    @Override // com.kwad.components.ad.nativead.a.a, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r2 = this;
            super.at()
            com.kwad.components.ad.nativead.a.b r0 = r2.pq
            com.kwad.sdk.api.KsNativeAd$VideoPlayListener r0 = r0.oQ
            r2.oQ = r0
            com.kwad.components.ad.nativead.b.e$1 r0 = new com.kwad.components.ad.nativead.b.e$1
            r0.<init>(r2)
            r2.mVideoPlayStateListener = r0
            com.kwad.components.ad.nativead.a.b r1 = r2.pq
            com.kwad.components.ad.nativead.c.a r1 = r1.pr
            r1.a2(r0)
            return
    }

    @Override // com.kwad.components.ad.nativead.a.a, com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r0 = this;
            super.onUnbind()
            return
    }
}
