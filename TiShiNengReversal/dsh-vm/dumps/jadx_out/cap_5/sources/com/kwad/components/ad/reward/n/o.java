package com.kwad.components.ad.reward.n;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class o extends com.kwad.components.ad.reward.n.s implements android.view.View.OnClickListener {
    private com.kwad.components.ad.reward.widget.KsAuthorIconView De;
    private android.widget.RelativeLayout Df;
    private java.lang.String fA;
    private com.kwad.components.core.widget.KsLogoView fB;
    private java.lang.Runnable fI;
    private boolean fs;
    private android.widget.TextView fu;
    private android.widget.TextView fv;
    private android.widget.TextView fw;
    private com.kwad.components.core.widget.KsLogoView fx;
    private com.kwad.components.ad.reward.g tm;



    public o(com.kwad.components.ad.reward.g r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.fs = r0
            com.kwad.components.ad.reward.n.o$2 r0 = new com.kwad.components.ad.reward.n.o$2
            r0.<init>(r1)
            r1.fI = r0
            r1.tm = r2
            return
    }

    static /* synthetic */ java.lang.Runnable a(com.kwad.components.ad.reward.n.o r0) {
            java.lang.Runnable r0 = r0.fI
            return r0
    }

    static /* synthetic */ android.widget.TextView b(com.kwad.components.ad.reward.n.o r0) {
            android.widget.TextView r0 = r0.fv
            return r0
    }

    static /* synthetic */ java.lang.String c(com.kwad.components.ad.reward.n.o r0) {
            java.lang.String r0 = r0.fA
            return r0
    }

    static /* synthetic */ com.kwad.components.core.widget.KsLogoView d(com.kwad.components.ad.reward.n.o r0) {
            com.kwad.components.core.widget.KsLogoView r0 = r0.fB
            return r0
    }

    private static void i(android.view.View r2, int r3) {
            if (r2 != 0) goto L3
            goto L20
        L3:
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            boolean r0 = r3 instanceof android.widget.FrameLayout.LayoutParams
            if (r0 == 0) goto L20
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            r0 = 85
            r3.gravity = r0
            android.content.Context r0 = r2.getContext()
            r1 = 1101004800(0x41a00000, float:20.0)
            int r0 = com.kwad.sdk.c.a.a.a(r0, r1)
            r3.bottomMargin = r0
            r2.requestLayout()
        L20:
            return
    }

    private void initView() {
            r2 = this;
            android.view.ViewGroup r0 = r2.vV
            if (r0 != 0) goto L5
            return
        L5:
            int r1 = com.kwad.sdk.R.id.ksad_live_author_icon
            android.view.View r0 = r0.findViewById(r1)
            com.kwad.components.ad.reward.widget.KsAuthorIconView r0 = (com.kwad.components.ad.reward.widget.KsAuthorIconView) r0
            r2.De = r0
            android.view.ViewGroup r0 = r2.vV
            int r1 = com.kwad.sdk.R.id.kwad_actionbar_title
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.fu = r0
            android.view.ViewGroup r0 = r2.vV
            int r1 = com.kwad.sdk.R.id.kwad_actionbar_des_text
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.fv = r0
            android.view.ViewGroup r0 = r2.vV
            int r1 = com.kwad.sdk.R.id.ksad_live_actionbar_btn
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.fw = r0
            android.view.ViewGroup r0 = r2.vV
            int r1 = com.kwad.sdk.R.id.ksad_reward_live_kwai_logo
            android.view.View r0 = r0.findViewById(r1)
            com.kwad.components.core.widget.KsLogoView r0 = (com.kwad.components.core.widget.KsLogoView) r0
            r2.fx = r0
            boolean r0 = r2.fs
            if (r0 != 0) goto L4f
            android.view.ViewGroup r0 = r2.vV
            int r1 = com.kwad.sdk.R.id.ksad_reward_origin_live_relative
            android.view.View r0 = r0.findViewById(r1)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r2.Df = r0
        L4f:
            android.view.ViewGroup r0 = r2.vV
            r0.setOnClickListener(r2)
            android.widget.TextView r0 = r2.fw
            r0.setOnClickListener(r2)
            com.kwad.components.ad.reward.widget.KsAuthorIconView r0 = r2.De
            r0.setOnClickListener(r2)
            android.widget.TextView r0 = r2.fv
            r0.setOnClickListener(r2)
            android.widget.TextView r0 = r2.fu
            r0.setOnClickListener(r2)
            return
    }

    private void j(com.kwad.sdk.core.response.model.AdTemplate r5) {
            r4 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r5)
            android.widget.TextView r1 = r4.fu
            java.lang.String r2 = com.kwad.sdk.core.response.b.a.cl(r0)
            r1.setText(r2)
            com.kwad.components.core.widget.e r1 = new com.kwad.components.core.widget.e
            r1.<init>()
            com.kwad.components.ad.reward.widget.KsAuthorIconView r2 = r4.De
            r3 = 0
            r2.setVisibility(r3)
            com.kwad.components.ad.reward.widget.KsAuthorIconView r2 = r4.De
            r2.j(r5)
            com.kwad.components.ad.reward.widget.KsAuthorIconView r2 = r4.De
            r2.a(r1)
            android.widget.TextView r1 = r4.fw
            java.lang.String r2 = com.kwad.sdk.core.response.b.a.aE(r0)
            r1.setText(r2)
            int r1 = com.kwad.sdk.core.response.b.a.bf(r0)
            r2 = 8
            if (r1 != r2) goto L47
            com.kwad.components.core.widget.KsLogoView r1 = r4.fx
            r1.setVisibility(r3)
            com.kwad.components.core.widget.KsLogoView r1 = r4.fx
            r1.aP(r5)
            android.widget.TextView r5 = r4.fv
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.au(r0)
            r5.setText(r0)
            return
        L47:
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.au(r0)
            r4.fA = r0
            com.kwad.components.core.widget.KsLogoView r0 = new com.kwad.components.core.widget.KsLogoView
            android.view.ViewGroup r1 = r4.vV
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1, r3)
            r4.fB = r0
            com.kwad.components.ad.reward.n.o$1 r1 = new com.kwad.components.ad.reward.n.o$1
            r1.<init>(r4)
            r0.setLogoLoadFinishListener(r1)
            com.kwad.components.core.widget.KsLogoView r0 = r4.fB
            r0.aP(r5)
            com.kwad.components.core.widget.KsLogoView r5 = r4.fx
            r5.setVisibility(r2)
            return
    }

    @Override // com.kwad.components.ad.reward.n.d
    protected final void a(com.kwad.components.ad.reward.n.r r1) {
            r0 = this;
            super.a(r1)
            com.kwad.sdk.core.response.model.AdTemplate r1 = r1.getAdTemplate()
            r0.j(r1)
            return
    }

    @Override // com.kwad.components.ad.reward.n.d
    protected final void ac(boolean r4) {
            r3 = this;
            super.ac(r4)
            android.view.ViewGroup r4 = r3.vV
            android.content.Context r4 = r4.getContext()
            boolean r0 = com.kwad.sdk.utils.aq.QW()
            if (r0 != 0) goto L6a
            boolean r0 = r3.fs
            if (r0 != 0) goto L4c
            android.view.ViewGroup r0 = r3.vV
            int r1 = com.kwad.sdk.R.id.ksad_reward_origin_live_base1
            android.view.View r0 = r0.findViewById(r1)
            r1 = 0
            r0.setVisibility(r1)
            android.widget.RelativeLayout r0 = r3.Df
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.content.res.Resources r1 = r4.getResources()
            int r2 = com.kwad.sdk.R.dimen.ksad_live_subscribe_card_width_horizontal
            int r1 = r1.getDimensionPixelSize(r2)
            r0.width = r1
            android.widget.RelativeLayout r1 = r3.Df
            r1.setLayoutParams(r0)
            android.widget.TextView r0 = r3.fw
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.content.res.Resources r4 = r4.getResources()
            int r4 = r4.getDimensionPixelSize(r2)
            r0.width = r4
            android.widget.TextView r4 = r3.fw
            r4.setLayoutParams(r0)
            return
        L4c:
            android.view.ViewGroup r0 = r3.vV
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.content.res.Resources r4 = r4.getResources()
            int r1 = com.kwad.sdk.R.dimen.ksad_live_subscribe_card_width_horizontal
            int r4 = r4.getDimensionPixelSize(r1)
            r0.width = r4
            android.view.ViewGroup r4 = r3.vV
            r4.setLayoutParams(r0)
            android.view.ViewGroup r4 = r3.vV
            r0 = 85
            i(r4, r0)
        L6a:
            return
    }

    public final void b(android.view.ViewGroup r2, int r3) {
            r1 = this;
            r0 = 8
            if (r3 != r0) goto Lf
            int r3 = com.kwad.sdk.R.id.ksad_reward_origin_live_shop_stub
            int r0 = com.kwad.sdk.R.id.ksad_reward_origin_live_root
            super.a(r2, r3, r0)
            r2 = 1
            r1.fs = r2
            goto L19
        Lf:
            int r3 = com.kwad.sdk.R.id.ksad_reward_origin_live_base_stub
            int r0 = com.kwad.sdk.R.id.ksad_reward_origin_live_root
            super.a(r2, r3, r0)
            r2 = 0
            r1.fs = r2
        L19:
            r1.initView()
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r5) {
            r4 = this;
            android.widget.TextView r0 = r4.fw
            boolean r0 = r5.equals(r0)
            r1 = 1
            if (r0 == 0) goto L15
            com.kwad.components.ad.reward.g r0 = r4.tm
            android.content.Context r5 = r5.getContext()
            r2 = 29
            r0.a(r1, r5, r2, r1)
            return
        L15:
            com.kwad.components.ad.reward.widget.KsAuthorIconView r0 = r4.De
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L29
            com.kwad.components.ad.reward.g r0 = r4.tm
            android.content.Context r5 = r5.getContext()
            r2 = 30
            r0.a(r1, r5, r2, r1)
            return
        L29:
            android.widget.TextView r0 = r4.fv
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L3d
            com.kwad.components.ad.reward.g r0 = r4.tm
            android.content.Context r5 = r5.getContext()
            r2 = 32
            r0.a(r1, r5, r2, r1)
            return
        L3d:
            android.widget.TextView r0 = r4.fu
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L51
            com.kwad.components.ad.reward.g r0 = r4.tm
            android.content.Context r5 = r5.getContext()
            r2 = 31
            r0.a(r1, r5, r2, r1)
            return
        L51:
            android.view.ViewGroup r0 = r4.vV
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L65
            com.kwad.components.ad.reward.g r0 = r4.tm
            android.content.Context r5 = r5.getContext()
            r2 = 53
            r3 = 2
            r0.a(r1, r5, r2, r3)
        L65:
            return
    }
}
