package com.kwad.components.ad.reward.presenter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class l extends com.kwad.components.ad.reward.presenter.b implements com.kwad.components.ad.reward.presenter.platdetail.actionbar.a {
    private com.kwad.components.core.video.m jE;
    private com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl rG;

    @androidx.annotation.Nullable
    private com.kwad.components.ad.reward.n.g vL;
    private boolean vM;
    private com.kwad.components.core.widget.KsLogoView vN;

    @androidx.annotation.Nullable
    private com.kwad.components.ad.reward.n.l vO;



    public l() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.vM = r0
            com.kwad.components.ad.reward.presenter.l$1 r0 = new com.kwad.components.ad.reward.presenter.l$1
            r0.<init>(r1)
            r1.jE = r0
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.reward.presenter.l r0) {
            r0.iF()
            return
    }

    static /* synthetic */ com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl b(com.kwad.components.ad.reward.presenter.l r0) {
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl r0 = r0.rG
            return r0
    }

    private void iF() {
            r4 = this;
            boolean r0 = r4.vM
            if (r0 != 0) goto L1c
            com.kwad.components.ad.reward.n.g r0 = r4.vL
            if (r0 != 0) goto Lf
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl r0 = r4.rG
            r1 = 0
            r0.P(r1)
            goto L19
        Lf:
            com.kwad.components.ad.reward.presenter.l$2 r1 = new com.kwad.components.ad.reward.presenter.l$2
            r1.<init>(r4)
            r2 = 500(0x1f4, double:2.47E-321)
            r0.a(r1, r2)
        L19:
            r0 = 1
            r4.vM = r0
        L1c:
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.platdetail.actionbar.a
    public final void a(com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.ShowActionBarResult r1, android.view.View r2) {
            r0 = this;
            com.kwad.components.ad.reward.n.l r1 = r0.vO
            if (r1 == 0) goto L7
            r1.lj()
        L7:
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.b, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r5 = this;
            super.at()
            com.kwad.components.ad.reward.g r0 = r5.tm
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl r1 = r0.rG
            r5.rG = r1
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            com.kwad.components.core.video.m r1 = r5.jE
            r0.a(r1)
            com.kwad.components.ad.reward.g r0 = r5.tm
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.response.model.AdMatrixInfo$MerchantLiveReservationInfo r1 = com.kwad.sdk.core.response.b.b.dt(r0)
            boolean r1 = r1.displayWeakCard
            com.kwad.components.ad.reward.g r2 = r5.tm
            r2.B(r1)
            if (r1 == 0) goto L44
            com.kwad.components.ad.reward.n.g r1 = r5.vL
            if (r1 != 0) goto L2e
            com.kwad.components.ad.reward.n.g r1 = new com.kwad.components.ad.reward.n.g
            com.kwad.components.ad.reward.g r2 = r5.tm
            r1.<init>(r2)
            r5.vL = r1
        L2e:
            int r1 = com.kwad.sdk.R.id.ksad_root_container
            android.view.View r1 = r5.findViewById(r1)
            com.kwad.sdk.core.view.AdBaseFrameLayout r1 = (com.kwad.sdk.core.view.AdBaseFrameLayout) r1
            com.kwad.components.ad.reward.n.g r2 = r5.vL
            r2.f(r1)
            com.kwad.components.ad.reward.n.g r1 = r5.vL
            com.kwad.components.ad.reward.n.r r2 = com.kwad.components.ad.reward.n.r.aa(r0)
            r1.b(r2)
        L44:
            com.kwad.sdk.core.response.model.AdInfo r1 = com.kwad.sdk.core.response.b.e.el(r0)
            boolean r2 = com.kwad.sdk.core.response.b.a.co(r0)
            if (r2 == 0) goto L79
            com.kwad.components.ad.reward.n.l r2 = r5.vO
            if (r2 != 0) goto L5b
            com.kwad.components.ad.reward.n.l r2 = new com.kwad.components.ad.reward.n.l
            com.kwad.components.ad.reward.g r3 = r5.tm
            r2.<init>(r3)
            r5.vO = r2
        L5b:
            com.kwad.components.ad.reward.n.l r2 = r5.vO
            com.kwad.components.ad.reward.g r3 = r5.tm
            com.kwad.sdk.core.view.AdBaseFrameLayout r3 = r3.mRootContainer
            r2.h(r3)
            com.kwad.components.ad.reward.n.l r2 = r5.vO
            com.kwad.components.ad.reward.n.r r0 = com.kwad.components.ad.reward.n.r.aa(r0)
            r2.b(r0)
            android.content.Context r0 = r5.getContext()
            com.kwad.components.core.widget.KsLogoView r2 = r5.vN
            int r3 = com.kwad.sdk.R.dimen.ksad_live_subscribe_card_logo_margin_bottom
            r4 = 0
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.d.a(r0, r1, r2, r3, r4)
        L79:
            com.kwad.components.ad.reward.g r0 = r5.tm
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl r0 = r0.rG
            r0.a(r5)
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
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            com.kwad.components.core.video.m r1 = r2.jE
            r0.b(r1)
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl r0 = r0.rG
            r0.b(r2)
            com.kwad.components.ad.reward.n.l r0 = r2.vO
            if (r0 == 0) goto L1a
            r0.onUnbind()
        L1a:
            return
    }
}
