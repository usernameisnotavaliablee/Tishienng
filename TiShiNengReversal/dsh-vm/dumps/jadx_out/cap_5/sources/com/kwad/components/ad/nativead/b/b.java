package com.kwad.components.ad.nativead.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b extends com.kwad.components.ad.nativead.a.a {
    private android.widget.ImageView dJ;
    private com.kwad.sdk.core.response.model.b dK;
    private java.lang.Runnable dL;



    public b() {
            r1 = this;
            r1.<init>()
            com.kwad.components.ad.nativead.b.b$2 r0 = new com.kwad.components.ad.nativead.b.b$2
            r0.<init>(r1)
            r1.dL = r0
            return
    }

    static /* synthetic */ android.widget.ImageView a(com.kwad.components.ad.nativead.b.b r0) {
            android.widget.ImageView r0 = r0.dJ
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.b b(com.kwad.components.ad.nativead.b.b r0) {
            com.kwad.sdk.core.response.model.b r0 = r0.dK
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.nativead.a.b c(com.kwad.components.ad.nativead.b.b r0) {
            com.kwad.components.ad.nativead.a.b r0 = r0.pq
            return r0
    }

    @Override // com.kwad.components.ad.nativead.a.a, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r2 = this;
            super.at()
            com.kwad.components.ad.nativead.a.b r0 = r2.pq
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            com.kwad.sdk.core.response.model.b r0 = com.kwad.sdk.core.response.b.a.bu(r0)
            r2.dK = r0
            java.lang.String r0 = r0.getUrl()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1c
            return
        L1c:
            android.view.View r0 = r2.getRootView()
            java.lang.Runnable r1 = r2.dL
            r0.post(r1)
            android.widget.ImageView r0 = r2.dJ
            r1 = 0
            r0.setVisibility(r1)
            com.kwad.components.ad.nativead.b.b$1 r0 = new com.kwad.components.ad.nativead.b.b$1
            r0.<init>(r2)
            r2.mVideoPlayStateListener = r0
            com.kwad.components.ad.nativead.a.b r1 = r2.pq
            com.kwad.components.ad.nativead.c.a r1 = r1.pr
            r1.a2(r0)
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

    @Override // com.kwad.components.ad.nativead.a.a, com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r2 = this;
            super.onUnbind()
            android.view.View r0 = r2.getRootView()
            java.lang.Runnable r1 = r2.dL
            r0.removeCallbacks(r1)
            return
    }
}
