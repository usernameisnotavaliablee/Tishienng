package com.kwad.components.ad.reward.presenter.platdetail.actionbar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class e extends com.kwad.components.ad.reward.presenter.b implements com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.c {
    private android.view.ViewGroup jI;
    private com.kwad.components.core.widget.KsLogoView vN;
    private com.kwad.components.ad.reward.n.n yp;
    private int yq;
    private android.widget.FrameLayout.LayoutParams yr;
    private com.kwad.components.ad.reward.n.n.a ys;


    public e(android.view.ViewGroup r1, com.kwad.components.ad.reward.n.n.a r2) {
            r0 = this;
            r0.<init>()
            r0.jI = r1
            r0.ys = r2
            return
    }

    static /* synthetic */ android.content.Context a(com.kwad.components.ad.reward.presenter.platdetail.actionbar.e r0) {
            android.content.Context r0 = r0.getContext()
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g b(com.kwad.components.ad.reward.presenter.platdetail.actionbar.e r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ android.content.Context c(com.kwad.components.ad.reward.presenter.platdetail.actionbar.e r0) {
            android.content.Context r0 = r0.getContext()
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g d(com.kwad.components.ad.reward.presenter.platdetail.actionbar.e r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    @Override // com.kwad.components.ad.reward.presenter.b, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r5 = this;
            super.at()
            com.kwad.components.ad.reward.g r0 = r5.tm
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl r0 = r0.rG
            r0.a(r5)
            com.kwad.components.ad.reward.g r0 = r5.tm
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            com.kwad.components.core.widget.KsLogoView r1 = r5.vN
            int r1 = r1.getVisibility()
            r5.yq = r1
            android.content.Context r1 = r5.getContext()
            com.kwad.components.core.widget.KsLogoView r2 = r5.vN
            int r3 = com.kwad.sdk.R.dimen.ksad_reward_order_logo_margin_bottom
            com.kwad.components.ad.reward.g r4 = r5.tm
            com.kwad.components.ad.reward.m.e r4 = r4.rE
            boolean r4 = r4.kW()
            r4 = r4 ^ 1
            android.widget.FrameLayout$LayoutParams r0 = com.kwad.components.ad.reward.presenter.platdetail.actionbar.d.a(r1, r0, r2, r3, r4)
            r5.yr = r0
            com.kwad.components.ad.reward.n.n r0 = new com.kwad.components.ad.reward.n.n
            android.view.ViewGroup r1 = r5.jI
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.e$1 r2 = new com.kwad.components.ad.reward.presenter.platdetail.actionbar.e$1
            android.content.Context r3 = r5.getContext()
            com.kwad.components.ad.reward.g r4 = r5.tm
            r2.<init>(r5, r3, r4)
            r0.<init>(r1, r2)
            r5.yp = r0
            com.kwad.components.ad.reward.n.n$a r1 = r5.ys
            r0.a(r1)
            com.kwad.components.ad.reward.n.n r0 = r5.yp
            com.kwad.components.ad.reward.g r1 = r5.tm
            com.kwad.sdk.core.response.model.AdTemplate r1 = r1.mAdTemplate
            com.kwad.components.ad.reward.n.r r1 = com.kwad.components.ad.reward.n.r.aa(r1)
            r0.b(r1)
            com.kwad.components.core.widget.e r0 = new com.kwad.components.core.widget.e
            r0.<init>()
            com.kwad.components.ad.reward.n.n r1 = r5.yp
            android.view.ViewGroup r1 = r1.hP()
            com.kwad.components.core.t.j.a(r0, r1)
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.c
    public final void e(com.kwad.components.ad.reward.presenter.platdetail.actionbar.a r3) {
            r2 = this;
            android.view.ViewGroup r0 = r2.jI
            r1 = 0
            r0.setVisibility(r1)
            android.view.ViewGroup r0 = r2.jI
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$ShowActionBarResult r1 = com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.ShowActionBarResult.SHOW_NATIVE_ORDER
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.a(r3, r0, r1)
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r1 = this;
            super.onCreate()
            int r0 = com.kwad.sdk.R.id.ksad_ad_label_play_bar
            android.view.View r0 = r1.findViewById(r0)
            com.kwad.components.core.widget.KsLogoView r0 = (com.kwad.components.core.widget.KsLogoView) r0
            r1.vN = r0
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r2 = this;
            super.onUnbind()
            com.kwad.components.core.widget.KsLogoView r0 = r2.vN
            int r1 = r2.yq
            r0.setVisibility(r1)
            android.widget.FrameLayout$LayoutParams r0 = r2.yr
            if (r0 == 0) goto L13
            com.kwad.components.core.widget.KsLogoView r1 = r2.vN
            r1.setLayoutParams(r0)
        L13:
            return
    }
}
