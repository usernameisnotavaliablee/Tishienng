package com.kwad.components.ad.splashscreen.presenter.endcard;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class f extends com.kwad.components.ad.splashscreen.presenter.e {
    com.kwad.components.ad.splashscreen.f Ix;


    public f() {
            r1 = this;
            r1.<init>()
            com.kwad.components.ad.splashscreen.presenter.endcard.f$1 r0 = new com.kwad.components.ad.splashscreen.presenter.endcard.f$1
            r0.<init>(r1)
            r1.Ix = r0
            return
    }

    @Override // com.kwad.components.ad.splashscreen.presenter.e, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r2 = this;
            super.at()
            com.kwad.components.ad.splashscreen.h r0 = r2.Gf
            com.kwad.components.ad.splashscreen.f r1 = r2.Ix
            r0.a(r1)
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r2 = this;
            super.onUnbind()
            com.kwad.components.ad.splashscreen.h r0 = r2.Gf
            com.kwad.components.ad.splashscreen.f r1 = r2.Ix
            r0.b(r1)
            return
    }
}
