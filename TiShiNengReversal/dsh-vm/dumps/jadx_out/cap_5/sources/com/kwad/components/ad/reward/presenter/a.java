package com.kwad.components.ad.reward.presenter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a extends com.kwad.components.ad.reward.presenter.b {
    private com.kwad.components.core.video.m jE;
    private com.kwad.components.core.video.DetailVideoView mDetailVideoView;


    public a(com.kwad.components.ad.reward.g r2) {
            r1 = this;
            r1.<init>()
            com.kwad.components.ad.reward.presenter.a$1 r0 = new com.kwad.components.ad.reward.presenter.a$1
            r0.<init>(r1)
            r1.jE = r0
            r1.tm = r2
            com.kwad.sdk.core.response.model.AdTemplate r2 = r2.mAdTemplate
            r1.mAdTemplate = r2
            return
    }

    private boolean is() {
            r2 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            com.kwad.sdk.core.response.model.AdTemplate r1 = r2.mAdTemplate
            boolean r0 = com.kwad.components.ad.reward.a.b.k(r0)
            boolean r0 = com.kwad.sdk.core.response.b.e.k(r1, r0)
            return r0
    }

    private boolean it() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            boolean r0 = com.kwad.sdk.core.response.b.e.O(r0)
            return r0
    }

    private void n(com.kwad.components.ad.reward.g r4) {
            r3 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            com.kwad.components.ad.reward.m.e r1 = r4.rE
            boolean r0 = com.kwad.sdk.core.response.b.a.bd(r0)
            if (r0 == 0) goto L1d
            com.kwad.components.ad.reward.m.b r0 = new com.kwad.components.ad.reward.m.b
            com.kwad.sdk.core.response.model.AdTemplate r2 = r3.mAdTemplate
            r0.<init>(r2)
            r2 = 3
            r1.a(r2, r0)
            r4.a(r0)
            goto L2b
        L1d:
            com.kwad.components.ad.reward.m.d r0 = new com.kwad.components.ad.reward.m.d
            com.kwad.components.core.video.DetailVideoView r2 = r3.mDetailVideoView
            r0.<init>(r4, r2)
            r2 = 1
            r1.a(r2, r0)
            r4.a(r0)
        L2b:
            com.kwad.components.core.video.m r4 = r3.jE
            r1.a(r4)
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.b, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r3 = this;
            super.at()
            r3.getContext()
            boolean r0 = com.kwad.sdk.utils.aq.QW()
            boolean r1 = r3.is()
            r2 = 1
            if (r1 != 0) goto L17
            boolean r1 = r3.it()
            if (r1 == 0) goto L1e
        L17:
            if (r0 != 0) goto L1e
            com.kwad.components.core.video.DetailVideoView r0 = r3.mDetailVideoView
            r0.setForce(r2)
        L1e:
            com.kwad.components.core.video.DetailVideoView r0 = r3.mDetailVideoView
            int r1 = com.kwad.sdk.core.config.e.Gc()
            r0.g(r2, r1)
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r3 = this;
            super.onCreate()
            int r0 = com.kwad.sdk.R.id.ksad_native_container_stub
            android.view.View r0 = r3.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            if (r0 == 0) goto L10
            r0.inflate()
        L10:
            int r0 = com.kwad.sdk.R.id.ksad_video_player
            android.view.View r0 = r3.findViewById(r0)
            com.kwad.components.core.video.DetailVideoView r0 = (com.kwad.components.core.video.DetailVideoView) r0
            r3.mDetailVideoView = r0
            com.kwad.components.ad.reward.g r0 = r3.tm
            r3.n(r0)
            com.kwad.components.ad.reward.RewardRenderResult r0 = com.kwad.components.ad.reward.RewardRenderResult.DEFAULT
            com.kwad.components.ad.reward.g r1 = r3.tm
            com.kwad.components.ad.reward.RewardRenderResult r1 = r1.gS()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3e
            int r0 = com.kwad.sdk.R.id.ksad_reward_play_layout
            android.view.View r0 = r3.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            android.content.Context r1 = r3.getContext()
            com.kwad.components.ad.reward.g r2 = r3.tm
            com.kwad.components.ad.reward.g.a(r1, r2, r0)
        L3e:
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onDestroy() {
            r2 = this;
            super.onDestroy()
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            if (r0 == 0) goto Le
            com.kwad.components.core.video.m r1 = r2.jE
            r0.b(r1)
        Le:
            return
    }
}
