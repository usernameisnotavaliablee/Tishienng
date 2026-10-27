package com.kwad.components.ad.reward.presenter.g;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a extends com.kwad.components.ad.reward.presenter.b implements com.kwad.components.ad.reward.n.c.a, com.kwad.sdk.core.webview.d.a.a, com.kwad.sdk.widget.d {

    @androidx.annotation.Nullable
    private android.view.ViewGroup Ac;

    @androidx.annotation.Nullable
    private com.kwad.components.ad.reward.n.q Ad;
    private android.view.ViewGroup Ae;
    private com.kwad.components.ad.reward.n.e Af;
    private com.kwad.components.ad.reward.n.c Ag;

    @androidx.annotation.Nullable
    private com.kwad.components.ad.reward.n.c Ah;
    private final com.kwad.components.ad.reward.e.l mRewardVerifyListener;
    private com.kwad.components.ad.reward.l.a.a sn;


    public a() {
            r1 = this;
            r1.<init>()
            com.kwad.components.ad.reward.presenter.g.a$1 r0 = new com.kwad.components.ad.reward.presenter.g.a$1
            r0.<init>(r1)
            r1.mRewardVerifyListener = r0
            return
    }

    static /* synthetic */ com.kwad.components.ad.reward.n.c a(com.kwad.components.ad.reward.presenter.g.a r0) {
            com.kwad.components.ad.reward.n.c r0 = r0.Ag
            return r0
    }

    private void a(com.kwad.sdk.core.view.AdBaseFrameLayout r5) {
            r4 = this;
            r4.getContext()
            boolean r0 = com.kwad.sdk.utils.aq.QW()
            if (r0 != 0) goto L11
            java.lang.String r5 = "LandPageOpenTaskPresenter"
            java.lang.String r0 = "initBottomActionBar screen is horizontal"
            com.kwad.sdk.core.d.c.d(r5, r0)
            return
        L11:
            int r0 = com.kwad.sdk.R.id.ksad_reward_apk_info_stub
            android.view.View r0 = r4.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            r0.inflate()
            int r0 = com.kwad.sdk.R.id.ksad_reward_apk_info_card_root
            android.view.View r0 = r4.findViewById(r0)
            com.kwad.sdk.widget.KSFrameLayout r0 = (com.kwad.sdk.widget.KSFrameLayout) r0
            android.content.Context r1 = r4.getContext()
            android.content.res.Resources r1 = r1.getResources()
            int r2 = com.kwad.sdk.R.dimen.ksad_reward_apk_info_card_step_icon_radius
            float r1 = r1.getDimension(r2)
            r0.setRadius(r1)
            com.kwad.components.ad.reward.g r1 = r4.tm
            com.kwad.sdk.core.response.model.AdTemplate r1 = r1.mAdTemplate
            java.util.List r1 = com.kwad.sdk.core.response.b.d.ec(r1)
            int r1 = r1.size()
            r2 = 0
            if (r1 != 0) goto L55
            r0.setRatio(r2)
            android.content.Context r1 = r4.getContext()
            r2 = 1124597760(0x43080000, float:136.0)
            int r1 = com.kwad.sdk.c.a.a.a(r1, r2)
            com.kwad.sdk.c.a.a.m(r0, r1)
            goto L65
        L55:
            r0.setRatio(r2)
            android.content.Context r1 = r4.getContext()
            r2 = 1125842944(0x431b0000, float:155.0)
            int r1 = com.kwad.sdk.c.a.a.a(r1, r2)
            com.kwad.sdk.c.a.a.m(r0, r1)
        L65:
            int r0 = com.kwad.sdk.R.id.ksad_reward_apk_info_card_native_container
            android.view.View r0 = r4.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r4.Ae = r0
            r1 = 1
            r0.setClickable(r1)
            com.kwad.sdk.widget.h r0 = new com.kwad.sdk.widget.h
            android.view.ViewGroup r2 = r4.Ae
            r0.<init>(r2, r4)
            com.kwad.components.ad.reward.n.c r0 = new com.kwad.components.ad.reward.n.c
            android.view.ViewGroup r2 = r4.Ae
            r0.<init>(r2)
            r4.Ag = r0
            r0.a(r4)
            com.kwad.components.ad.reward.n.c r0 = r4.Ag
            com.kwad.components.ad.reward.g r2 = r4.tm
            com.kwad.sdk.core.response.model.AdTemplate r2 = r2.mAdTemplate
            r0.c(r2, r1)
            int r0 = com.kwad.sdk.R.id.ksad_reward_apk_info_card_h5
            android.view.View r0 = r4.findViewById(r0)
            com.kwad.sdk.core.webview.KsAdWebView r0 = (com.kwad.sdk.core.webview.KsAdWebView) r0
            com.kwad.components.ad.reward.n.e r1 = new com.kwad.components.ad.reward.n.e
            android.view.ViewGroup r2 = r4.Ae
            r3 = 0
            r1.<init>(r0, r2, r3, r4)
            r4.Af = r1
            com.kwad.components.ad.reward.g r0 = r4.tm
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            r1.a(r0, r5)
            return
    }

    static /* synthetic */ com.kwad.components.ad.reward.n.c b(com.kwad.components.ad.reward.presenter.g.a r0) {
            com.kwad.components.ad.reward.n.c r0 = r0.Ah
            return r0
    }

    private void e(android.view.View r2, boolean r3) {
            r1 = this;
            int r2 = r2.getId()
            int r0 = com.kwad.sdk.R.id.ksad_reward_apk_info_card_native_container
            if (r2 == r0) goto Le
            int r0 = com.kwad.sdk.R.id.ksad_activity_apk_info_area_native
            if (r2 != r0) goto Ld
            goto Le
        Ld:
            return
        Le:
            r2 = 2
            r1.e(r3, r2)
            return
    }

    private void e(boolean r4, int r5) {
            r3 = this;
            r0 = 1
            if (r4 == 0) goto L5
            r4 = 1
            goto L7
        L5:
            r4 = 153(0x99, float:2.14E-43)
        L7:
            com.kwad.components.ad.reward.g r1 = r3.tm
            android.content.Context r2 = r3.getContext()
            r1.a(r0, r2, r4, r5)
            return
    }

    @Override // com.kwad.sdk.widget.d
    public final void a(android.view.View r2) {
            r1 = this;
            r0 = 1
            r1.e(r2, r0)
            return
    }

    @Override // com.kwad.sdk.core.webview.d.a.a
    public final void a(@androidx.annotation.Nullable com.kwad.sdk.core.webview.d.b.a r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.b, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r5 = this;
            super.at()
            java.lang.String r0 = "LandPageOpenTaskPresenter"
            java.lang.String r1 = "onBind"
            com.kwad.sdk.core.d.c.d(r0, r1)
            com.kwad.components.ad.reward.g r0 = r5.tm
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            boolean r0 = com.kwad.components.ad.reward.g.O(r0)
            if (r0 != 0) goto L15
            return
        L15:
            com.kwad.components.ad.reward.l.a.a r0 = com.kwad.components.ad.reward.l.d.kJ()
            r5.sn = r0
            com.kwad.components.ad.reward.g r1 = r5.tm
            r1.sn = r0
            com.kwad.components.ad.reward.b r0 = com.kwad.components.ad.reward.b.gk()
            com.kwad.components.ad.reward.e.l r1 = r5.mRewardVerifyListener
            r0.a(r1)
            int r0 = com.kwad.sdk.R.id.ksad_root_container
            android.view.View r0 = r5.findViewById(r0)
            com.kwad.sdk.core.view.AdBaseFrameLayout r0 = (com.kwad.sdk.core.view.AdBaseFrameLayout) r0
            int r1 = com.kwad.sdk.R.id.ksad_activity_apk_info_area_native
            android.view.View r1 = r5.findViewById(r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r5.Ac = r1
            if (r1 == 0) goto L88
            r2 = 1
            r1.setClickable(r2)
            android.view.ViewGroup r1 = r5.Ac
            r2 = 8
            r1.setVisibility(r2)
            com.kwad.sdk.widget.h r1 = new com.kwad.sdk.widget.h
            android.view.ViewGroup r2 = r5.Ac
            r1.<init>(r2, r5)
            com.kwad.components.ad.reward.n.c r1 = new com.kwad.components.ad.reward.n.c
            android.view.ViewGroup r2 = r5.Ac
            r1.<init>(r2)
            r5.Ah = r1
            r1.a(r5)
            com.kwad.components.ad.reward.n.c r1 = r5.Ah
            com.kwad.components.ad.reward.g r2 = r5.tm
            com.kwad.sdk.core.response.model.AdTemplate r2 = r2.mAdTemplate
            r3 = 0
            r1.c(r2, r3)
            int r1 = com.kwad.sdk.R.id.ksad_right_area_webview_container
            android.view.View r1 = r5.findViewById(r1)
            com.kwad.sdk.widget.KSFrameLayout r1 = (com.kwad.sdk.widget.KSFrameLayout) r1
            r1.setWidthBasedRatio(r3)
            int r1 = com.kwad.sdk.R.id.ksad_right_area_webview
            android.view.View r1 = r5.findViewById(r1)
            com.kwad.sdk.core.webview.KsAdWebView r1 = (com.kwad.sdk.core.webview.KsAdWebView) r1
            com.kwad.components.ad.reward.n.q r2 = new com.kwad.components.ad.reward.n.q
            android.view.ViewGroup r3 = r5.Ac
            r4 = 0
            r2.<init>(r1, r3, r4, r5)
            r5.Ad = r2
            com.kwad.components.ad.reward.g r1 = r5.tm
            com.kwad.sdk.core.response.model.AdTemplate r1 = r1.mAdTemplate
            r2.a(r1, r0)
        L88:
            r5.a(r0)
            return
    }

    @Override // com.kwad.sdk.widget.d
    public final void b(android.view.View r2) {
            r1 = this;
            com.kwad.components.ad.reward.g r0 = r1.tm
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            boolean r0 = com.kwad.sdk.core.response.b.d.ea(r0)
            if (r0 == 0) goto Le
            r0 = 0
            r1.e(r2, r0)
        Le:
            return
    }

    @Override // com.kwad.components.ad.reward.n.c.a
    public final void d(boolean r1, int r2) {
            r0 = this;
            r2 = 1
            r0.e(r1, r2)
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r3 = this;
            super.onUnbind()
            java.lang.String r0 = "LandPageOpenTaskPresenter"
            java.lang.String r1 = "onUnbind"
            com.kwad.sdk.core.d.c.d(r0, r1)
            com.kwad.components.ad.reward.n.e r0 = r3.Af
            r1 = 0
            if (r0 == 0) goto L14
            r0.lc()
            r3.Af = r1
        L14:
            com.kwad.components.ad.reward.n.c r0 = r3.Ah
            if (r0 == 0) goto L1b
            r0.kZ()
        L1b:
            com.kwad.components.ad.reward.b r0 = com.kwad.components.ad.reward.b.gk()
            com.kwad.components.ad.reward.e.l r2 = r3.mRewardVerifyListener
            r0.b(r2)
            com.kwad.components.ad.reward.g r0 = r3.tm
            r0.sn = r1
            return
    }
}
