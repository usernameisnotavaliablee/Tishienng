package com.kwad.components.ad.nativead.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class j extends com.kwad.components.ad.nativead.a.a {
    private android.view.View pS;


    public j() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.nativead.b.j r0) {
            r0.fG()
            return
    }

    private void fG() {
            r2 = this;
            android.view.View r0 = r2.pS
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L9
            return
        L9:
            android.view.View r0 = r2.pS
            r1 = 0
            r0.setVisibility(r1)
            return
    }

    @Override // com.kwad.components.ad.nativead.a.a, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r2 = this;
            super.at()
            android.view.View r0 = r2.pS
            r1 = 8
            r0.setVisibility(r1)
            com.kwad.components.ad.nativead.b.j$1 r0 = new com.kwad.components.ad.nativead.b.j$1
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
            int r0 = com.kwad.sdk.R.id.ksad_video_error_container
            android.view.View r0 = r1.findViewById(r0)
            r1.pS = r0
            return
    }
}
