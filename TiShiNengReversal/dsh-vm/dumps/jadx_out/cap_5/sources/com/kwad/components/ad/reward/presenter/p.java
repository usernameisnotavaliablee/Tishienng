package com.kwad.components.ad.reward.presenter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class p extends com.kwad.components.ad.reward.presenter.b {
    private com.kwad.components.core.playable.a rF;
    private com.kwad.components.core.playable.PlayableSource we;
    private final com.kwad.components.ad.reward.e.j wf;




    public p() {
            r1 = this;
            r1.<init>()
            com.kwad.components.ad.reward.presenter.p$1 r0 = new com.kwad.components.ad.reward.presenter.p$1
            r0.<init>(r1)
            r1.wf = r0
            return
    }

    static /* synthetic */ com.kwad.components.core.playable.PlayableSource a(com.kwad.components.ad.reward.presenter.p r0, com.kwad.components.core.playable.PlayableSource r1) {
            r0.we = r1
            return r1
    }

    static /* synthetic */ com.kwad.components.core.playable.a a(com.kwad.components.ad.reward.presenter.p r0) {
            com.kwad.components.core.playable.a r0 = r0.rF
            return r0
    }

    @Override // com.kwad.components.ad.reward.presenter.b, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r4 = this;
            super.at()
            com.kwad.components.ad.reward.g r0 = r4.tm
            com.kwad.components.core.playable.a r1 = r0.rF
            r4.rF = r1
            if (r1 != 0) goto Lc
            return
        Lc:
            com.kwad.sdk.core.response.model.AdTemplate r2 = r0.mAdTemplate
            com.kwad.sdk.core.view.AdBaseFrameLayout r3 = r0.mRootContainer
            com.kwad.components.core.e.d.c r0 = r0.mApkDownloadHelper
            r1.a(r2, r3, r0)
            com.kwad.components.ad.reward.g r0 = r4.tm
            boolean r0 = r0.rS
            java.lang.String r1 = "playable"
            com.kwad.components.ad.reward.monitor.c.a(r0, r1)
            com.kwad.components.ad.reward.g r0 = r4.tm
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            com.kwad.components.ad.reward.g r2 = r4.tm
            com.kwad.sdk.core.response.model.AdTemplate r3 = r2.mAdTemplate
            boolean r2 = r2.rS
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.bQ(r0)
            com.kwad.components.ad.reward.monitor.c.a(r3, r2, r1, r0)
            com.kwad.components.core.playable.a r0 = r4.rF
            r0.rR()
            com.kwad.components.core.playable.a r0 = r4.rF
            com.kwad.components.ad.reward.presenter.p$2 r1 = new com.kwad.components.ad.reward.presenter.p$2
            r1.<init>(r4)
            r0.a(r1)
            com.kwad.components.core.playable.a r0 = r4.rF
            com.kwad.components.ad.reward.presenter.p$3 r1 = new com.kwad.components.ad.reward.presenter.p$3
            r1.<init>(r4)
            r0.a(r1)
            com.kwad.components.ad.reward.a r0 = com.kwad.components.ad.reward.a.gg()
            com.kwad.components.ad.reward.e.j r1 = r4.wf
            r0.a(r1)
            return
    }

    public final void e(@androidx.annotation.Nullable com.kwad.components.core.playable.PlayableSource r2) {
            r1 = this;
            com.kwad.components.core.playable.a r0 = r1.rF
            if (r0 == 0) goto Lf
            if (r2 == 0) goto La
            r0.e(r2)
            return
        La:
            com.kwad.components.core.playable.PlayableSource r2 = r1.we
            r0.e(r2)
        Lf:
            return
    }

    public final void iK() {
            r1 = this;
            com.kwad.components.core.playable.a r0 = r1.rF
            if (r0 == 0) goto L7
            r0.iK()
        L7:
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r2 = this;
            super.onCreate()
            int r0 = com.kwad.sdk.R.id.ksad_playable_webview
            android.view.View r0 = r2.findViewById(r0)
            com.kwad.sdk.core.webview.KsAdWebView r0 = (com.kwad.sdk.core.webview.KsAdWebView) r0
            r1 = 4
            r0.setVisibility(r1)
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r2 = this;
            super.onUnbind()
            com.kwad.components.core.playable.a r0 = r2.rF
            if (r0 != 0) goto L8
            return
        L8:
            r0.rQ()
            com.kwad.components.core.playable.a r0 = r2.rF
            r0.iK()
            com.kwad.components.ad.reward.a r0 = com.kwad.components.ad.reward.a.gg()
            com.kwad.components.ad.reward.e.j r1 = r2.wf
            r0.b(r1)
            return
    }
}
