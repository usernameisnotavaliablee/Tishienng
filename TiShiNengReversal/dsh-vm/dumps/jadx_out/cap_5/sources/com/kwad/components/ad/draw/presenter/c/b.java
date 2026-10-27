package com.kwad.components.ad.draw.presenter.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b extends com.kwad.components.ad.draw.b.a {

    @androidx.annotation.Nullable
    private com.kwad.components.ad.l.b dF;
    private com.kwad.sdk.core.webview.d.a.a eT;
    private android.widget.FrameLayout fc;


    public b() {
            r1 = this;
            r1.<init>()
            com.kwad.components.ad.draw.presenter.c.b$1 r0 = new com.kwad.components.ad.draw.presenter.c.b$1
            r0.<init>(r1)
            r1.eT = r0
            return
    }

    static /* synthetic */ com.kwad.components.ad.draw.b.b a(com.kwad.components.ad.draw.presenter.c.b r0) {
            com.kwad.components.ad.draw.b.b r0 = r0.dz
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.draw.b.b b(com.kwad.components.ad.draw.presenter.c.b r0) {
            com.kwad.components.ad.draw.b.b r0 = r0.dz
            return r0
    }

    @Override // com.kwad.components.ad.draw.b.a, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r5 = this;
            super.at()
            com.kwad.components.ad.draw.b.b r0 = r5.dz
            com.kwad.components.ad.l.b r0 = r0.dF
            r5.dF = r0
            if (r0 != 0) goto Lc
            return
        Lc:
            com.kwad.sdk.core.webview.d.a.a r1 = r5.eT
            r0.a(r1)
            com.kwad.components.ad.l.b r0 = r5.dF
            android.widget.FrameLayout r1 = r5.fc
            com.kwad.components.ad.draw.b.b r2 = r5.dz
            com.kwad.sdk.core.view.AdBaseFrameLayout r3 = r2.mRootContainer
            com.kwad.sdk.core.response.model.AdTemplate r4 = r2.mAdTemplate
            com.kwad.components.core.e.d.c r2 = r2.mApkDownloadHelper
            r0.a(r1, r3, r4, r2)
            com.kwad.components.ad.l.b r0 = r5.dF
            r1 = 0
            r0.a(r1)
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r1 = this;
            super.onCreate()
            int r0 = com.kwad.sdk.R.id.ksad_play_end_web_card_container
            android.view.View r0 = r1.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r1.fc = r0
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r1 = this;
            super.onUnbind()
            com.kwad.components.ad.l.b r0 = r1.dF
            if (r0 == 0) goto La
            r0.ny()
        La:
            return
    }
}
