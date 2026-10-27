package com.kwad.components.ad.reward.presenter.platdetail.actionbar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class d extends com.kwad.components.ad.reward.presenter.b implements com.kwad.components.ad.reward.n.b {
    private android.view.ViewGroup jI;
    private com.kwad.components.core.widget.KsLogoView vN;
    private com.kwad.components.ad.reward.n.i yo;

    public d(android.view.ViewGroup r1) {
            r0 = this;
            r0.<init>()
            r0.jI = r1
            return
    }

    public static android.widget.FrameLayout.LayoutParams a(android.content.Context r5, com.kwad.sdk.core.response.model.AdInfo r6, com.kwad.components.core.widget.KsLogoView r7, int r8, boolean r9) {
            r0 = 0
            if (r7 == 0) goto L66
            if (r5 != 0) goto L6
            goto L66
        L6:
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            boolean r2 = r1 instanceof android.widget.FrameLayout.LayoutParams
            if (r2 != 0) goto Lf
            return r0
        Lf:
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            android.widget.FrameLayout$LayoutParams r0 = a(r1)
            r2 = 0
            if (r9 == 0) goto L1b
            r7.setVisibility(r2)
        L1b:
            boolean r9 = com.kwad.sdk.utils.aq.QW()
            r3 = 1
            if (r9 != 0) goto L30
            boolean r9 = com.kwad.components.ad.reward.a.b.i(r6)
            if (r9 != 0) goto L2e
            boolean r9 = com.kwad.sdk.core.response.b.a.cL(r6)
            if (r9 == 0) goto L30
        L2e:
            r9 = 1
            goto L31
        L30:
            r9 = 0
        L31:
            boolean r4 = com.kwad.sdk.utils.aq.QW()
            if (r4 == 0) goto L3f
            boolean r6 = com.kwad.sdk.core.response.b.a.cK(r6)
            if (r6 == 0) goto L3f
            r6 = 1
            goto L40
        L3f:
            r6 = 0
        L40:
            if (r9 != 0) goto L44
            if (r6 == 0) goto L45
        L44:
            r2 = 1
        L45:
            r6 = 85
            r1.gravity = r6
            if (r2 == 0) goto L4d
            int r8 = com.kwad.sdk.R.dimen.ksad_reward_follow_card_margin
        L4d:
            android.content.res.Resources r6 = r5.getResources()
            int r6 = r6.getDimensionPixelOffset(r8)
            r1.bottomMargin = r6
            android.content.res.Resources r5 = r5.getResources()
            int r6 = com.kwad.sdk.R.dimen.ksad_reward_follow_card_margin
            int r5 = r5.getDimensionPixelOffset(r6)
            r1.rightMargin = r5
            r7.setLayoutParams(r1)
        L66:
            return r0
    }

    private static android.widget.FrameLayout.LayoutParams a(android.widget.FrameLayout.LayoutParams r1) {
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r1)
            int r1 = r1.gravity
            r0.gravity = r1
            return r0
    }

    @Override // com.kwad.components.ad.reward.presenter.b, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r5 = this;
            super.at()
            com.kwad.components.ad.reward.n.i r0 = new com.kwad.components.ad.reward.n.i
            com.kwad.components.ad.reward.g r1 = r5.tm
            android.view.ViewGroup r2 = r5.jI
            com.kwad.components.core.widget.KsLogoView r3 = r5.vN
            r0.<init>(r1, r2, r3)
            r5.yo = r0
            com.kwad.components.ad.reward.g r1 = r5.tm
            com.kwad.sdk.core.response.model.AdTemplate r1 = r1.mAdTemplate
            com.kwad.components.ad.reward.n.r r1 = com.kwad.components.ad.reward.n.r.aa(r1)
            r0.b(r1)
            com.kwad.components.ad.reward.g r0 = r5.tm
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            android.content.Context r1 = r5.getContext()
            com.kwad.components.core.widget.KsLogoView r2 = r5.vN
            int r3 = com.kwad.sdk.R.dimen.ksad_reward_jinniu_logo_margin_bottom
            r4 = 0
            a(r1, r0, r2, r3, r4)
            return
    }

    @Override // com.kwad.components.ad.reward.n.b
    public final void hT() {
            r0 = this;
            return
    }

    @Override // com.kwad.components.ad.reward.n.b
    public final void js() {
            r0 = this;
            return
    }

    @Override // com.kwad.components.ad.reward.n.b
    public final void jt() {
            r0 = this;
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
}
