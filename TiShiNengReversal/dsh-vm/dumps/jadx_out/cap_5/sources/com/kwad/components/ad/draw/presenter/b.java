package com.kwad.components.ad.draw.presenter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b extends com.kwad.components.ad.draw.b.a {
    private android.widget.ImageView dJ;
    private com.kwad.sdk.core.response.model.b dK;
    private java.lang.Runnable dL;
    private com.kwad.components.core.video.l mVideoPlayStateListener;



    public b() {
            r1 = this;
            r1.<init>()
            com.kwad.components.ad.draw.presenter.b$1 r0 = new com.kwad.components.ad.draw.presenter.b$1
            r0.<init>(r1)
            r1.mVideoPlayStateListener = r0
            com.kwad.components.ad.draw.presenter.b$2 r0 = new com.kwad.components.ad.draw.presenter.b$2
            r0.<init>(r1)
            r1.dL = r0
            return
    }

    static /* synthetic */ android.widget.ImageView a(com.kwad.components.ad.draw.presenter.b r0) {
            android.widget.ImageView r0 = r0.dJ
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.b b(com.kwad.components.ad.draw.presenter.b r0) {
            com.kwad.sdk.core.response.model.b r0 = r0.dK
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.draw.b.b c(com.kwad.components.ad.draw.presenter.b r0) {
            com.kwad.components.ad.draw.b.b r0 = r0.dz
            return r0
    }

    @Override // com.kwad.components.ad.draw.b.a, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r2 = this;
            super.at()
            com.kwad.components.ad.draw.b.b r0 = r2.dz
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            com.kwad.sdk.core.response.model.b r0 = com.kwad.sdk.core.response.b.a.bu(r0)
            r2.dK = r0
            java.lang.String r0 = r0.getUrl()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1c
            goto L36
        L1c:
            android.view.View r0 = r2.getRootView()
            java.lang.Runnable r1 = r2.dL
            r0.post(r1)
            android.widget.ImageView r0 = r2.dJ
            r1 = 0
            r0.setVisibility(r1)
            com.kwad.components.ad.draw.b.b r0 = r2.dz
            com.kwad.components.ad.draw.c.a r0 = r0.dB
            if (r0 == 0) goto L36
            com.kwad.components.core.video.l r1 = r2.mVideoPlayStateListener
            r0.a2(r1)
        L36:
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r1 = this;
            super.onCreate()
            int r0 = com.kwad.sdk.R.id.ksad_video_first_frame
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1.dJ = r0
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r2 = this;
            super.onUnbind()
            android.view.View r0 = r2.getRootView()
            java.lang.Runnable r1 = r2.dL
            r0.removeCallbacks(r1)
            com.kwad.components.ad.draw.b.b r0 = r2.dz
            com.kwad.components.ad.draw.c.a r0 = r0.dB
            if (r0 == 0) goto L17
            com.kwad.components.core.video.l r1 = r2.mVideoPlayStateListener
            r0.b2(r1)
        L17:
            return
    }
}
