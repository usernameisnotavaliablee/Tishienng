package com.kwad.components.ad.splashscreen.presenter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class r extends com.kwad.components.ad.splashscreen.presenter.e {
    private com.kwad.sdk.core.download.a.a HF;


    public r() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ android.content.Context a(com.kwad.components.ad.splashscreen.presenter.r r0) {
            android.content.Context r0 = r0.getContext()
            return r0
    }

    @Override // com.kwad.components.ad.splashscreen.presenter.e, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r2 = this;
            super.at()
            com.kwad.components.ad.splashscreen.presenter.r$1 r0 = new com.kwad.components.ad.splashscreen.presenter.r$1
            r0.<init>(r2)
            r2.HF = r0
            com.kwad.components.ad.splashscreen.h r1 = r2.Gf
            com.kwad.components.core.e.d.c r1 = r1.mApkDownloadHelper
            r1.b(r0)
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r2 = this;
            com.kwad.sdk.core.download.a.a r0 = r2.HF
            if (r0 == 0) goto Lb
            com.kwad.components.ad.splashscreen.h r1 = r2.Gf
            com.kwad.components.core.e.d.c r1 = r1.mApkDownloadHelper
            r1.c(r0)
        Lb:
            return
    }
}
