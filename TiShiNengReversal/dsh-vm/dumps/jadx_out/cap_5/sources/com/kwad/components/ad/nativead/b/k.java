package com.kwad.components.ad.nativead.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class k extends com.kwad.components.ad.nativead.a.a {
    private android.widget.ProgressBar pU;


    public k() {
            r0 = this;
            r0.<init>()
            return
    }

    private void U(int r2) {
            r1 = this;
            android.widget.ProgressBar r0 = r1.pU
            r0.setProgress(r2)
            android.widget.ProgressBar r2 = r1.pU
            int r2 = r2.getVisibility()
            if (r2 != 0) goto Le
            return
        Le:
            android.widget.ProgressBar r2 = r1.pU
            r0 = 0
            r2.setVisibility(r0)
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.nativead.b.k r0) {
            r0.fH()
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.nativead.b.k r0, int r1) {
            r0.U(r1)
            return
    }

    private void fH() {
            r2 = this;
            android.widget.ProgressBar r0 = r2.pU
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L9
            return
        L9:
            android.widget.ProgressBar r0 = r2.pU
            r1 = 8
            r0.setVisibility(r1)
            return
    }

    @Override // com.kwad.components.ad.nativead.a.a, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r2 = this;
            super.at()
            android.widget.ProgressBar r0 = r2.pU
            r1 = 0
            r0.setProgress(r1)
            android.widget.ProgressBar r0 = r2.pU
            r1 = 8
            r0.setVisibility(r1)
            com.kwad.components.ad.nativead.b.k$1 r0 = new com.kwad.components.ad.nativead.b.k$1
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
            int r0 = com.kwad.sdk.R.id.ksad_video_progress
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r1.pU = r0
            return
    }
}
