package com.kwad.components.ad.reward.presenter.d.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c extends com.kwad.components.ad.reward.presenter.b implements com.kwad.components.ad.l.b.a {
    private com.kwad.components.ad.l.b dF;
    private com.kwad.sdk.core.webview.d.a.a eT;
    private android.widget.FrameLayout fc;
    private com.kwad.components.core.video.DetailVideoView mDetailVideoView;
    private final com.kwad.components.ad.reward.e.l mRewardVerifyListener;
    private int wC;



    public c() {
            r1 = this;
            r1.<init>()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.wC = r0
            com.kwad.components.ad.reward.presenter.d.a.c$1 r0 = new com.kwad.components.ad.reward.presenter.d.a.c$1
            r0.<init>(r1)
            r1.mRewardVerifyListener = r0
            com.kwad.components.ad.reward.presenter.d.a.c$2 r0 = new com.kwad.components.ad.reward.presenter.d.a.c$2
            r0.<init>(r1)
            r1.eT = r0
            return
    }

    static /* synthetic */ com.kwad.components.ad.l.b a(com.kwad.components.ad.reward.presenter.d.a.c r0) {
            com.kwad.components.ad.l.b r0 = r0.dF
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g b(com.kwad.components.ad.reward.presenter.d.a.c r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g c(com.kwad.components.ad.reward.presenter.d.a.c r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    @Override // com.kwad.components.ad.reward.presenter.b, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r7 = this;
            super.at()
            com.kwad.components.ad.reward.g r0 = r7.tm
            com.kwad.sdk.core.response.model.AdTemplate r4 = r0.mAdTemplate
            com.kwad.components.ad.reward.j r0 = r0.rH
            r7.dF = r0
            if (r0 != 0) goto Le
            goto L3a
        Le:
            com.kwad.components.ad.reward.b r0 = com.kwad.components.ad.reward.b.gk()
            com.kwad.components.ad.reward.e.l r1 = r7.mRewardVerifyListener
            r0.a(r1)
            com.kwad.components.ad.l.b r0 = r7.dF
            com.kwad.sdk.core.webview.d.a.a r1 = r7.eT
            r0.a(r1)
            com.kwad.components.ad.l.b r1 = r7.dF
            android.widget.FrameLayout r2 = r7.fc
            com.kwad.components.ad.reward.g r0 = r7.tm
            com.kwad.sdk.core.view.AdBaseFrameLayout r3 = r0.mRootContainer
            com.kwad.components.core.e.d.c r5 = r0.mApkDownloadHelper
            int r6 = r0.mScreenOrientation
            r1.a(r2, r3, r4, r5, r6)
            com.kwad.components.ad.l.b r0 = r7.dF
            r1 = 0
            r0.a(r1)
            com.kwad.components.ad.l.b r0 = r7.dF
            if (r0 == 0) goto L3a
            r0.a(r7)
        L3a:
            return
    }

    @Override // com.kwad.components.ad.l.b.a
    public final void jL() {
            r0 = this;
            r0.iz()
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r1 = this;
            super.onCreate()
            int r0 = com.kwad.sdk.R.id.ksad_web_card_container
            android.view.View r0 = r1.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r1.fc = r0
            int r0 = com.kwad.sdk.R.id.ksad_video_player
            android.view.View r0 = r1.findViewById(r0)
            com.kwad.components.core.video.DetailVideoView r0 = (com.kwad.components.core.video.DetailVideoView) r0
            r1.mDetailVideoView = r0
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r3 = this;
            super.onUnbind()
            com.kwad.components.ad.l.b r0 = r3.dF
            if (r0 == 0) goto Lf
            r0.nM()
            com.kwad.components.ad.l.b r0 = r3.dF
            r0.ny()
        Lf:
            com.kwad.components.ad.reward.b r0 = com.kwad.components.ad.reward.b.gk()
            com.kwad.components.ad.reward.e.l r1 = r3.mRewardVerifyListener
            r0.b(r1)
            com.kwad.components.core.video.DetailVideoView r0 = r3.mDetailVideoView
            if (r0 == 0) goto L25
            int r1 = r3.wC
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r2) goto L25
            com.kwad.sdk.c.a.a.n(r0, r1)
        L25:
            return
    }
}
