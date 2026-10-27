package com.kwad.components.ad.nativead.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class g extends com.kwad.components.ad.nativead.a.a {
    private android.widget.ImageView pM;


    public g() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.nativead.b.g r0) {
            r0.fD()
            return
    }

    static /* synthetic */ void b(com.kwad.components.ad.nativead.b.g r0) {
            r0.fE()
            return
    }

    private void fD() {
            r3 = this;
            android.widget.ImageView r0 = r3.pM
            com.kwad.components.ad.nativead.a.b r1 = r3.pq
            com.kwad.sdk.core.response.model.AdTemplate r1 = r1.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r1 = com.kwad.sdk.core.response.b.e.el(r1)
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.X(r1)
            com.kwad.components.ad.nativead.a.b r2 = r3.pq
            com.kwad.sdk.core.response.model.AdTemplate r2 = r2.mAdTemplate
            com.kwad.sdk.core.imageloader.KSImageLoader.loadImage(r0, r1, r2)
            android.widget.ImageView r0 = r3.pM
            r1 = 0
            r0.setVisibility(r1)
            return
    }

    private void fE() {
            r2 = this;
            android.widget.ImageView r0 = r2.pM
            int r0 = r0.getVisibility()
            if (r0 != 0) goto Lf
            android.widget.ImageView r0 = r2.pM
            r1 = 8
            r0.setVisibility(r1)
        Lf:
            return
    }

    @Override // com.kwad.components.ad.nativead.a.a, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r2 = this;
            super.at()
            com.kwad.components.ad.nativead.b.g$1 r0 = new com.kwad.components.ad.nativead.b.g$1
            r0.<init>(r2)
            r2.mVideoPlayStateListener = r0
            com.kwad.components.ad.nativead.a.b r1 = r2.pq
            com.kwad.components.ad.nativead.c.a r1 = r1.pr
            r1.a2(r0)
            android.widget.ImageView r0 = r2.pM
            r1 = 8
            r0.setVisibility(r1)
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r2 = this;
            super.onCreate()
            int r0 = com.kwad.sdk.R.id.ksad_video_cover_image
            android.view.View r0 = r2.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r2.pM = r0
            java.lang.String r1 = "NativePlayEndCoverPresenter R.id.ksad_video_cover_image is null"
            com.kwad.components.ad.nativead.a.a.a(r0, r1)
            return
    }
}
