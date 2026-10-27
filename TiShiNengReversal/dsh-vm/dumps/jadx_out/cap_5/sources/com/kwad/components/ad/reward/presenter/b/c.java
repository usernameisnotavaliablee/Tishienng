package com.kwad.components.ad.reward.presenter.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c extends com.kwad.components.ad.reward.presenter.b implements com.kwad.components.ad.reward.presenter.platdetail.actionbar.a {
    private com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl rG;
    private com.kwad.components.core.video.m vR;

    @androidx.annotation.Nullable
    private com.kwad.components.ad.reward.n.o xn;


    public c() {
            r1 = this;
            r1.<init>()
            com.kwad.components.ad.reward.presenter.b.c$1 r0 = new com.kwad.components.ad.reward.presenter.b.c$1
            r0.<init>(r1)
            r1.vR = r0
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.reward.presenter.b.c r0) {
            r0.iF()
            return
    }

    private void iF() {
            r2 = this;
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl r0 = r2.rG
            r1 = 0
            r0.P(r1)
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.platdetail.actionbar.a
    public final void a(com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.ShowActionBarResult r1, android.view.View r2) {
            r0 = this;
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.b, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r4 = this;
            super.at()
            com.kwad.components.ad.reward.g r0 = r4.tm
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl r1 = r0.rG
            r4.rG = r1
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            com.kwad.components.core.video.m r1 = r4.vR
            r0.a(r1)
            com.kwad.components.ad.reward.g r0 = r4.tm
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r1 = com.kwad.sdk.core.response.b.e.el(r0)
            boolean r2 = com.kwad.sdk.core.response.b.a.cR(r1)
            if (r2 == 0) goto L4c
            com.kwad.components.ad.reward.n.o r2 = r4.xn
            if (r2 != 0) goto L2b
            com.kwad.components.ad.reward.n.o r2 = new com.kwad.components.ad.reward.n.o
            com.kwad.components.ad.reward.g r3 = r4.tm
            r2.<init>(r3)
            r4.xn = r2
        L2b:
            com.kwad.components.ad.reward.n.o r2 = r4.xn
            com.kwad.components.ad.reward.g r3 = r4.tm
            com.kwad.sdk.core.view.AdBaseFrameLayout r3 = r3.mRootContainer
            int r1 = com.kwad.sdk.core.response.b.a.bf(r1)
            r2.b(r3, r1)
            com.kwad.components.ad.reward.n.o r1 = r4.xn
            com.kwad.components.ad.reward.n.r r0 = com.kwad.components.ad.reward.n.r.aa(r0)
            r1.b(r0)
            int r0 = com.kwad.sdk.R.id.ksad_reward_origin_live_root
            android.view.View r0 = r4.findViewById(r0)
            r1 = 8
            r0.setVisibility(r1)
        L4c:
            com.kwad.components.ad.reward.g r0 = r4.tm
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl r0 = r0.rG
            r0.a(r4)
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r2 = this;
            super.onUnbind()
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            com.kwad.components.core.video.m r1 = r2.vR
            r0.b(r1)
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl r0 = r0.rG
            r0.b(r2)
            com.kwad.components.ad.reward.n.o r0 = r2.xn
            if (r0 == 0) goto L1a
            r0.onUnbind()
        L1a:
            return
    }
}
