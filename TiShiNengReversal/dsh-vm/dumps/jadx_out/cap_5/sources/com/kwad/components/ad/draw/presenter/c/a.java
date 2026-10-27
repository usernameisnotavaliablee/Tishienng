package com.kwad.components.ad.draw.presenter.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a extends com.kwad.components.ad.draw.b.a {

    @androidx.annotation.Nullable
    private com.kwad.components.ad.l.b dF;
    private com.kwad.components.ad.draw.view.playend.DrawVideoTailFrame fa;
    private com.kwad.components.core.video.l mVideoPlayStateListener;


    public a() {
            r1 = this;
            r1.<init>()
            com.kwad.components.ad.draw.presenter.c.a$1 r0 = new com.kwad.components.ad.draw.presenter.c.a$1
            r0.<init>(r1)
            r1.mVideoPlayStateListener = r0
            return
    }

    static /* synthetic */ com.kwad.components.ad.l.b a(com.kwad.components.ad.draw.presenter.c.a r0) {
            com.kwad.components.ad.l.b r0 = r0.dF
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.draw.view.playend.DrawVideoTailFrame b(com.kwad.components.ad.draw.presenter.c.a r0) {
            com.kwad.components.ad.draw.view.playend.DrawVideoTailFrame r0 = r0.fa
            return r0
    }

    private void bn() {
            r2 = this;
            com.kwad.components.ad.draw.view.playend.DrawVideoTailFrame r0 = r2.fa
            r0.bW()
            com.kwad.components.ad.draw.view.playend.DrawVideoTailFrame r0 = r2.fa
            r1 = 0
            r0.setVisibility(r1)
            return
    }

    static /* synthetic */ void c(com.kwad.components.ad.draw.presenter.c.a r0) {
            r0.bn()
            return
    }

    @Override // com.kwad.components.ad.draw.b.a, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r2 = this;
            super.at()
            com.kwad.components.ad.draw.b.b r0 = r2.dz
            com.kwad.components.ad.l.b r1 = r0.dF
            r2.dF = r1
            com.kwad.components.ad.draw.view.playend.DrawVideoTailFrame r1 = r2.fa
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            r1.j(r0)
            com.kwad.components.ad.draw.view.playend.DrawVideoTailFrame r0 = r2.fa
            com.kwad.components.ad.draw.b.b r1 = r2.dz
            com.kwad.sdk.core.view.AdBaseFrameLayout r1 = r1.mRootContainer
            r0.setAdBaseFrameLayout(r1)
            com.kwad.components.ad.draw.view.playend.DrawVideoTailFrame r0 = r2.fa
            com.kwad.components.ad.draw.b.b r1 = r2.dz
            com.kwad.components.core.e.d.c r1 = r1.mApkDownloadHelper
            r0.setApkDownloadHelper(r1)
            com.kwad.components.ad.draw.view.playend.DrawVideoTailFrame r0 = r2.fa
            r1 = 8
            r0.setVisibility(r1)
            com.kwad.components.ad.draw.view.playend.DrawVideoTailFrame r0 = r2.fa
            com.kwad.components.ad.draw.b.b r1 = r2.dz
            com.kwad.sdk.api.KsDrawAd$AdInteractionListener r1 = r1.dh
            r0.setAdInteractionListener(r1)
            com.kwad.components.ad.draw.b.b r0 = r2.dz
            com.kwad.components.ad.draw.c.a r0 = r0.dB
            com.kwad.components.core.video.l r1 = r2.mVideoPlayStateListener
            r0.a2(r1)
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r1 = this;
            super.onCreate()
            int r0 = com.kwad.sdk.R.id.ksad_video_tail_frame
            android.view.View r0 = r1.findViewById(r0)
            com.kwad.components.ad.draw.view.playend.DrawVideoTailFrame r0 = (com.kwad.components.ad.draw.view.playend.DrawVideoTailFrame) r0
            r1.fa = r0
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r2 = this;
            super.onUnbind()
            com.kwad.components.ad.draw.b.b r0 = r2.dz
            com.kwad.components.ad.draw.c.a r0 = r0.dB
            com.kwad.components.core.video.l r1 = r2.mVideoPlayStateListener
            r0.b2(r1)
            com.kwad.components.ad.draw.view.playend.DrawVideoTailFrame r0 = r2.fa
            r0.release()
            return
    }
}
