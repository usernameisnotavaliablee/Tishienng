package com.kwad.components.ad.reward.n;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class n extends com.kwad.components.ad.reward.n.d implements android.view.View.OnClickListener {
    private android.widget.TextView BW;
    private android.view.ViewGroup CN;
    private android.widget.LinearLayout CU;
    private com.kwad.components.ad.widget.KsPriceView CV;
    private android.widget.TextView CW;
    private android.view.View CX;
    private com.kwad.components.core.widget.KSCornerImageView CY;
    private com.kwad.components.ad.reward.n.b CZ;
    private com.kwad.components.ad.reward.n.n.a Da;
    private com.kwad.components.core.widget.KSCornerImageView el;
    private android.view.ViewGroup jI;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void iE();
    }

    public n(android.view.ViewGroup r1, com.kwad.components.ad.reward.n.b r2) {
            r0 = this;
            r0.<init>()
            r0.jI = r1
            r0.CZ = r2
            r0.initView()
            return
    }

    private static android.view.View a(android.content.Context r2, com.kwad.sdk.core.response.model.CouponInfo r3, android.view.ViewGroup r4) {
            int r0 = com.kwad.sdk.R.layout.ksad_reward_order_card_coupon
            r1 = 0
            android.view.View r2 = com.kwad.sdk.o.m.a(r2, r0, r4, r1)
            com.kwad.components.ad.reward.widget.KSCouponLabelTextView r2 = (com.kwad.components.ad.reward.widget.KSCouponLabelTextView) r2
            java.lang.String r3 = r3.getDisplayName()
            r2.setText(r3)
            return r2
    }

    static /* synthetic */ android.view.View a(com.kwad.components.ad.reward.n.n r0, android.content.Context r1, com.kwad.sdk.core.response.model.CouponInfo r2, android.view.ViewGroup r3) {
            android.view.View r0 = a(r1, r2, r3)
            return r0
    }

    static /* synthetic */ android.widget.LinearLayout a(com.kwad.components.ad.reward.n.n r0) {
            android.widget.LinearLayout r0 = r0.CU
            return r0
    }

    private void a(com.kwad.sdk.core.response.model.AdProductInfo r3, com.kwad.sdk.core.response.model.AdTemplate r4) {
            r2 = this;
            com.kwad.components.core.widget.KSCornerImageView r0 = r2.el
            java.lang.String r1 = r3.getIcon()
            com.kwad.sdk.core.imageloader.KSImageLoader.loadImage(r0, r1, r4)
            android.widget.TextView r0 = r2.BW
            java.lang.String r1 = r3.getName()
            r0.setText(r1)
            boolean r0 = r3.isCouponListEmpty()
            if (r0 == 0) goto L25
            android.widget.LinearLayout r0 = r2.CU
            r1 = 8
            r0.setVisibility(r1)
            com.kwad.components.ad.reward.n.n$a r0 = r2.Da
            r0.iE()
            goto L35
        L25:
            android.widget.LinearLayout r0 = r2.CU
            r1 = 0
            r0.setVisibility(r1)
            android.widget.LinearLayout r0 = r2.CU
            com.kwad.components.ad.reward.n.n$1 r1 = new com.kwad.components.ad.reward.n.n$1
            r1.<init>(r2, r3)
            r0.post(r1)
        L35:
            com.kwad.components.ad.widget.KsPriceView r0 = r2.CV
            java.lang.String r1 = r3.getPrice()
            java.lang.String r3 = r3.getOriginPrice()
            r0.h(r1, r3)
            java.lang.String r3 = com.kwad.components.ad.e.b.aE()
            boolean r0 = com.kwad.sdk.utils.bp.isNullString(r3)
            if (r0 != 0) goto L51
            com.kwad.components.core.widget.KSCornerImageView r0 = r2.CY
            com.kwad.sdk.core.imageloader.KSImageLoader.loadImage(r0, r3, r4)
        L51:
            return
    }

    static /* synthetic */ com.kwad.components.ad.reward.n.n.a b(com.kwad.components.ad.reward.n.n r0) {
            com.kwad.components.ad.reward.n.n$a r0 = r0.Da
            return r0
    }

    private void initView() {
            r3 = this;
            android.view.ViewGroup r0 = r3.jI
            int r1 = com.kwad.sdk.R.id.ksad_reward_order_root
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r3.CN = r0
            android.view.ViewGroup r0 = r3.jI
            int r1 = com.kwad.sdk.R.id.ksad_reward_order_icon
            android.view.View r0 = r0.findViewById(r1)
            com.kwad.components.core.widget.KSCornerImageView r0 = (com.kwad.components.core.widget.KSCornerImageView) r0
            r3.el = r0
            android.view.ViewGroup r0 = r3.jI
            int r1 = com.kwad.sdk.R.id.ksad_reward_order_title
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.BW = r0
            android.view.ViewGroup r0 = r3.jI
            int r1 = com.kwad.sdk.R.id.ksad_reward_order_coupon_list
            android.view.View r0 = r0.findViewById(r1)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r3.CU = r0
            android.view.ViewGroup r0 = r3.jI
            int r1 = com.kwad.sdk.R.id.ksad_reward_order_price
            android.view.View r0 = r0.findViewById(r1)
            com.kwad.components.ad.widget.KsPriceView r0 = (com.kwad.components.ad.widget.KsPriceView) r0
            r3.CV = r0
            android.view.ViewGroup r0 = r3.jI
            int r1 = com.kwad.sdk.R.id.ksad_reward_order_btn_buy
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.CW = r0
            android.view.ViewGroup r0 = r3.jI
            int r1 = com.kwad.sdk.R.id.ksad_reward_order_text_area
            android.view.View r0 = r0.findViewById(r1)
            r3.CX = r0
            android.view.ViewGroup r0 = r3.jI
            int r1 = com.kwad.sdk.R.id.ksad_reward_order_kwai_logo
            android.view.View r0 = r0.findViewById(r1)
            com.kwad.components.core.widget.KSCornerImageView r0 = (com.kwad.components.core.widget.KSCornerImageView) r0
            r3.CY = r0
            android.widget.TextView r0 = r3.CW
            java.lang.String r1 = com.kwad.components.ad.e.b.aD()
            r0.setText(r1)
            android.widget.TextView r0 = r3.CW
            r0.setOnClickListener(r3)
            com.kwad.components.core.widget.KSCornerImageView r0 = r3.el
            r0.setOnClickListener(r3)
            android.view.View r0 = r3.CX
            r0.setOnClickListener(r3)
            android.view.ViewGroup r0 = r3.jI
            android.content.Context r0 = r0.getContext()
            boolean r1 = com.kwad.sdk.utils.aq.QW()
            if (r1 != 0) goto L9f
            android.view.ViewGroup r1 = r3.jI
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r2 = r1 instanceof android.widget.FrameLayout.LayoutParams
            if (r2 == 0) goto L9f
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            android.content.res.Resources r0 = r0.getResources()
            int r2 = com.kwad.sdk.R.dimen.ksad_reward_follow_card_width_horizontal
            int r0 = r0.getDimensionPixelSize(r2)
            r1.width = r0
            android.view.ViewGroup r0 = r3.jI
            r0.setLayoutParams(r1)
        L9f:
            return
    }

    public final void a(com.kwad.components.ad.reward.n.n.a r1) {
            r0 = this;
            r0.Da = r1
            return
    }

    @Override // com.kwad.components.ad.reward.n.d
    public final void a(com.kwad.components.ad.reward.n.r r2) {
            r1 = this;
            super.a(r2)
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.getAdTemplate()
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            com.kwad.sdk.core.response.model.AdProductInfo r0 = com.kwad.sdk.core.response.b.a.cV(r0)
            com.kwad.sdk.core.response.model.AdTemplate r2 = r2.getAdTemplate()
            r1.a(r0, r2)
            return
    }

    @Override // com.kwad.components.ad.reward.n.d
    public final android.view.ViewGroup hP() {
            r1 = this;
            android.view.ViewGroup r0 = r1.CN
            return r0
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r2) {
            r1 = this;
            com.kwad.components.ad.reward.n.b r0 = r1.CZ
            if (r0 != 0) goto L5
            goto L2e
        L5:
            android.widget.TextView r0 = r1.CW
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L13
            com.kwad.components.ad.reward.n.b r2 = r1.CZ
            r2.hT()
            return
        L13:
            com.kwad.components.core.widget.KSCornerImageView r0 = r1.el
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L21
            com.kwad.components.ad.reward.n.b r2 = r1.CZ
            r2.js()
            return
        L21:
            android.view.View r0 = r1.CX
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L2e
            com.kwad.components.ad.reward.n.b r2 = r1.CZ
            r2.jt()
        L2e:
            return
    }
}
