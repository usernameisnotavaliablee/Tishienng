package com.kwad.components.ad.reward.n;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class i extends com.kwad.components.ad.reward.n.d implements android.view.View.OnClickListener {
    private android.view.ViewGroup Cc;

    @androidx.annotation.Nullable
    private com.kwad.components.ad.widget.KsPriceView Cd;

    @androidx.annotation.Nullable
    private android.widget.TextView Ce;

    @androidx.annotation.Nullable
    private com.kwad.components.core.widget.KsStyledTextButton Cf;

    @androidx.annotation.Nullable
    private android.widget.TextView Cg;

    @androidx.annotation.Nullable
    private android.widget.TextView Ch;

    @androidx.annotation.Nullable
    private android.view.View Ci;

    @androidx.annotation.Nullable
    private android.widget.ImageView Cj;

    @androidx.annotation.Nullable
    private android.widget.TextView fv;

    @androidx.annotation.Nullable
    private android.widget.TextView ko;

    @androidx.annotation.Nullable
    private com.kwad.components.core.widget.KsLogoView mLogoView;

    @androidx.annotation.Nullable
    private com.kwad.components.core.widget.KSCornerImageView nR;
    private com.kwad.components.ad.reward.g tm;
    private android.view.ViewGroup vV;




    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a {
        private java.lang.String Ct;

        @androidx.annotation.Nullable
        private java.lang.String Cu;
        private java.lang.String Cv;
        private java.lang.String Cw;
        private java.lang.String nw;
        private java.lang.String rating;
        private java.lang.String sW;
        private java.lang.String sX;
        private java.lang.String title;
        private java.lang.String uS;

        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        private void S(java.lang.String r1) {
                r0 = this;
                r0.uS = r1
                return
        }

        static com.kwad.components.ad.reward.n.i.a Z(com.kwad.sdk.core.response.model.AdTemplate r3) {
                com.kwad.sdk.core.response.model.AdInfo r3 = com.kwad.sdk.core.response.b.e.el(r3)
                com.kwad.sdk.core.response.model.AdProductInfo r0 = com.kwad.sdk.core.response.b.a.cV(r3)
                com.kwad.components.ad.reward.n.i$a r1 = new com.kwad.components.ad.reward.n.i$a
                r1.<init>()
                java.lang.String r2 = r0.getName()
                r1.title = r2
                boolean r2 = android.text.TextUtils.isEmpty(r2)
                if (r2 == 0) goto L1f
                java.lang.String r2 = com.kwad.sdk.core.response.b.a.ax(r3)
                r1.title = r2
            L1f:
                java.lang.String r2 = com.kwad.sdk.core.response.b.a.aE(r3)
                r1.Cv = r2
                java.lang.String r2 = r0.getIcon()
                r1.sW = r2
                java.lang.String r3 = com.kwad.sdk.core.response.b.a.au(r3)
                r1.sX = r3
                java.lang.String r3 = r0.getPrice()
                r1.Ct = r3
                java.lang.String r3 = r0.getOriginPrice()
                r1.nw = r3
                java.lang.String r3 = r0.getVolume()
                r1.Cw = r3
                java.lang.String r3 = r0.getRating()
                r1.rating = r3
                boolean r3 = r0.isCouponListEmpty()
                if (r3 != 0) goto L62
                com.kwad.sdk.core.response.model.CouponInfo r3 = r0.getFirstCouponList()
                if (r3 == 0) goto L62
                java.lang.String r0 = com.kwad.sdk.core.response.model.CouponInfo.jinniuFormatCoupon(r3)
                r1.Cu = r0
                java.lang.String r3 = r3.getFormattedJinniuPrefix()
                r1.S(r3)
            L62:
                return r1
        }

        public final java.lang.String eB() {
                r1 = this;
                java.lang.String r0 = r1.nw
                return r0
        }

        public final java.lang.String getRating() {
                r1 = this;
                java.lang.String r0 = r1.rating
                return r0
        }

        public final java.lang.String getTitle() {
                r1 = this;
                java.lang.String r0 = r1.title
                return r0
        }

        public final java.lang.String ho() {
                r1 = this;
                java.lang.String r0 = r1.sW
                return r0
        }

        public final java.lang.String hp() {
                r1 = this;
                java.lang.String r0 = r1.sX
                return r0
        }

        public final java.lang.String ih() {
                r1 = this;
                java.lang.String r0 = r1.uS
                return r0
        }

        public final java.lang.String lf() {
                r1 = this;
                java.lang.String r0 = r1.Ct
                return r0
        }

        public final java.lang.String lg() {
                r1 = this;
                java.lang.String r0 = r1.Cu
                return r0
        }

        public final java.lang.String lh() {
                r1 = this;
                java.lang.String r0 = r1.Cv
                return r0
        }

        public final java.lang.String li() {
                r1 = this;
                java.lang.String r0 = r1.Cw
                return r0
        }
    }

    public i(com.kwad.components.ad.reward.g r1, android.view.ViewGroup r2, com.kwad.components.core.widget.KsLogoView r3) {
            r0 = this;
            r0.<init>()
            r0.tm = r1
            r0.mLogoView = r3
            r0.Cc = r2
            r0.initView()
            return
    }

    @androidx.annotation.Nullable
    private static android.animation.Animator a(android.view.View r7, float r8) {
            if (r7 == 0) goto L52
            int r0 = r7.getWidth()
            if (r0 > 0) goto L9
            goto L52
        L9:
            android.content.res.Resources r0 = r7.getResources()
            int r1 = com.kwad.sdk.R.dimen.ksad_jinniu_light_sweep_width
            float r0 = r0.getDimension(r1)
            float r0 = r0 + r8
            r8 = 1
            float[] r1 = new float[r8]
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = "translationX"
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r7, r0, r1)
            r3 = 1000(0x3e8, double:4.94E-321)
            android.animation.ObjectAnimator r0 = r0.setDuration(r3)
            r1 = 1054280253(0x3ed70a3d, float:0.42)
            r5 = 0
            r6 = 1065353216(0x3f800000, float:1.0)
            android.view.animation.Interpolator r1 = androidx.core.view.animation.PathInterpolatorCompat.create(r1, r5, r6, r6)
            r0.setInterpolator(r1)
            r1 = 2
            float[] r5 = new float[r1]
            r5 = {x0054: FILL_ARRAY_DATA , data: [1065353216, 1065353216} // fill-array
            java.lang.String r6 = "alpha"
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r7, r6, r5)
            android.animation.ObjectAnimator r7 = r7.setDuration(r3)
            android.animation.AnimatorSet r3 = new android.animation.AnimatorSet
            r3.<init>()
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            r1[r2] = r0
            r1[r8] = r7
            r3.playSequentially(r1)
            return r3
        L52:
            r7 = 0
            return r7
    }

    @androidx.annotation.Nullable
    private android.animation.Animator a(android.view.View r11, android.view.View r12, android.view.View r13) {
            r10 = this;
            int r2 = r11.getHeight()
            if (r2 <= 0) goto Laa
            android.view.ViewGroup$LayoutParams r0 = r11.getLayoutParams()
            if (r0 != 0) goto Le
            goto Laa
        Le:
            r0 = 1057132380(0x3f028f5c, float:0.51)
            r1 = 1059816735(0x3f2b851f, float:0.67)
            r7 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            android.view.animation.Interpolator r0 = androidx.core.view.animation.PathInterpolatorCompat.create(r0, r7, r1, r8)
            android.content.res.Resources r1 = r11.getResources()
            int r3 = com.kwad.sdk.R.dimen.ksad_reward_jinniu_card_height_full
            int r1 = r1.getDimensionPixelSize(r3)
            int[] r1 = new int[]{r2, r1}
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofInt(r1)
            r3 = 500(0x1f4, double:2.47E-321)
            android.animation.ValueAnimator r9 = r1.setDuration(r3)
            r9.setInterpolator(r0)
            r11.getContext()
            boolean r0 = com.kwad.sdk.utils.aq.QW()
            if (r0 == 0) goto L5d
            if (r13 == 0) goto L5d
            android.view.ViewGroup$LayoutParams r0 = r13.getLayoutParams()
            boolean r0 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L5d
            android.view.ViewGroup$LayoutParams r0 = r13.getLayoutParams()
            r3 = r0
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            int r4 = r3.bottomMargin
            com.kwad.components.ad.reward.n.i$3 r0 = new com.kwad.components.ad.reward.n.i$3
            r1 = r10
            r6 = r11
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r9.addUpdateListener(r0)
        L5d:
            android.animation.AnimatorSet r11 = new android.animation.AnimatorSet
            r11.<init>()
            r13 = 2
            float[] r0 = new float[r13]
            r0 = {x00ac: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            java.lang.String r1 = "alpha"
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r12, r1, r0)
            r2 = 200(0xc8, double:9.9E-322)
            android.animation.ObjectAnimator r0 = r0.setDuration(r2)
            r2 = 1063004406(0x3f5c28f6, float:0.86)
            r3 = 1062501089(0x3f547ae1, float:0.83)
            android.view.animation.Interpolator r2 = androidx.core.view.animation.PathInterpolatorCompat.create(r2, r7, r3, r8)
            float[] r3 = new float[r13]
            r3 = {x00b4: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ObjectAnimator r12 = android.animation.ObjectAnimator.ofFloat(r12, r1, r3)
            r3 = 300(0x12c, double:1.48E-321)
            android.animation.ObjectAnimator r12 = r12.setDuration(r3)
            r12.setInterpolator(r2)
            android.animation.Animator[] r1 = new android.animation.Animator[r13]
            r2 = 0
            r1[r2] = r0
            r0 = 1
            r1[r0] = r12
            r11.playSequentially(r1)
            android.animation.AnimatorSet r12 = new android.animation.AnimatorSet
            r12.<init>()
            android.animation.Animator[] r13 = new android.animation.Animator[r13]
            r13[r2] = r9
            r13[r0] = r11
            r12.playTogether(r13)
            return r12
        Laa:
            r11 = 0
            return r11
    }

    static /* synthetic */ android.animation.Animator a(com.kwad.components.ad.reward.n.i r0, android.view.View r1, float r2) {
            android.animation.Animator r0 = a(r1, r2)
            return r0
    }

    static /* synthetic */ android.animation.Animator a(com.kwad.components.ad.reward.n.i r0, android.view.View r1, android.view.View r2, android.view.View r3) {
            android.animation.Animator r0 = r0.a(r1, r2, r3)
            return r0
    }

    static /* synthetic */ android.view.ViewGroup a(com.kwad.components.ad.reward.n.i r0) {
            android.view.ViewGroup r0 = r0.vV
            return r0
    }

    private void a(com.kwad.sdk.core.response.model.AdTemplate r4, com.kwad.components.ad.reward.n.i.a r5) {
            r3 = this;
            if (r5 != 0) goto L4
            goto Le8
        L4:
            com.kwad.components.core.widget.KSCornerImageView r0 = r3.nR
            java.lang.String r1 = r5.ho()
            r2 = 4
            com.kwad.sdk.core.imageloader.KSImageLoader.loadAppIcon(r0, r1, r4, r2)
            android.widget.TextView r4 = r3.ko
            if (r4 == 0) goto L19
            java.lang.String r0 = r5.getTitle()
            r4.setText(r0)
        L19:
            android.widget.TextView r4 = r3.fv
            if (r4 == 0) goto L24
            java.lang.String r0 = r5.hp()
            r4.setText(r0)
        L24:
            com.kwad.components.ad.widget.KsPriceView r4 = r3.Cd
            if (r4 == 0) goto L5d
            android.content.res.Resources r4 = r4.getResources()
            int r0 = com.kwad.sdk.R.dimen.ksad_reward_jinniu_end_origin_text_size
            int r4 = r4.getDimensionPixelSize(r0)
            com.kwad.components.ad.widget.KsPriceView r0 = r3.Cd
            android.content.res.Resources r0 = r0.getResources()
            int r1 = com.kwad.sdk.R.color.ksad_jinniu_end_origin_color
            int r0 = r0.getColor(r1)
            com.kwad.components.ad.widget.KsPriceView r1 = r3.Cd
            com.kwad.components.ad.widget.KsPriceView$a r1 = r1.getConfig()
            com.kwad.components.ad.widget.KsPriceView$a r1 = r1.as(r4)
            com.kwad.components.ad.widget.KsPriceView$a r4 = r1.au(r4)
            r4.at(r0)
            com.kwad.components.ad.widget.KsPriceView r4 = r3.Cd
            java.lang.String r0 = r5.lf()
            java.lang.String r1 = r5.eB()
            r2 = 1
            r4.d(r0, r1, r2)
        L5d:
            android.widget.TextView r4 = r3.Ce
            r0 = 8
            if (r4 == 0) goto L90
            java.lang.String r4 = r5.li()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L77
            android.widget.TextView r4 = r3.Ce
            java.lang.String r1 = r5.li()
            r4.setText(r1)
            goto L90
        L77:
            java.lang.String r4 = r5.getRating()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L8b
            android.widget.TextView r4 = r3.Ce
            java.lang.String r1 = r5.getRating()
            r4.setText(r1)
            goto L90
        L8b:
            android.widget.TextView r4 = r3.Ce
            r4.setVisibility(r0)
        L90:
            android.widget.TextView r4 = r3.Cg
            if (r4 == 0) goto La7
            java.lang.String r4 = r5.lg()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto La7
            android.widget.TextView r4 = r3.Cg
            java.lang.String r1 = r5.lg()
            r4.setText(r1)
        La7:
            com.kwad.components.core.widget.KsStyledTextButton r4 = r3.Cf
            if (r4 == 0) goto Lbe
            java.lang.String r4 = r5.lh()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto Lbe
            com.kwad.components.core.widget.KsStyledTextButton r4 = r3.Cf
            java.lang.String r1 = r5.lh()
            r4.setText(r1)
        Lbe:
            java.lang.String r4 = r5.lg()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto Lc9
            goto Lca
        Lc9:
            r0 = 0
        Lca:
            android.view.View r4 = r3.Ci
            if (r4 == 0) goto Ld1
            r4.setVisibility(r0)
        Ld1:
            android.widget.TextView r4 = r3.Ch
            if (r4 == 0) goto Le8
            java.lang.String r4 = r5.ih()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto Le8
            android.widget.TextView r4 = r3.Ch
            java.lang.String r5 = r5.ih()
            r4.setText(r5)
        Le8:
            return
    }

    static /* synthetic */ com.kwad.components.core.widget.KsStyledTextButton b(com.kwad.components.ad.reward.n.i r0) {
            com.kwad.components.core.widget.KsStyledTextButton r0 = r0.Cf
            return r0
    }

    static /* synthetic */ com.kwad.components.core.widget.KsLogoView c(com.kwad.components.ad.reward.n.i r0) {
            com.kwad.components.core.widget.KsLogoView r0 = r0.mLogoView
            return r0
    }

    static /* synthetic */ android.widget.ImageView d(com.kwad.components.ad.reward.n.i r0) {
            android.widget.ImageView r0 = r0.Cj
            return r0
    }

    private void initView() {
            r3 = this;
            android.view.ViewGroup r0 = r3.Cc
            int r1 = com.kwad.sdk.R.id.ksad_reward_jinniu_root
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r3.vV = r0
            android.view.ViewGroup r0 = r3.Cc
            int r1 = com.kwad.sdk.R.id.ksad_reward_jinniu_icon
            android.view.View r0 = r0.findViewById(r1)
            com.kwad.components.core.widget.KSCornerImageView r0 = (com.kwad.components.core.widget.KSCornerImageView) r0
            r3.nR = r0
            android.view.ViewGroup r0 = r3.Cc
            int r1 = com.kwad.sdk.R.id.ksad_reward_jinniu_title
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.ko = r0
            android.view.ViewGroup r0 = r3.Cc
            int r1 = com.kwad.sdk.R.id.ksad_reward_jinniu_desc
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.fv = r0
            android.view.ViewGroup r0 = r3.Cc
            int r1 = com.kwad.sdk.R.id.ksad_reward_jinniu_price
            android.view.View r0 = r0.findViewById(r1)
            com.kwad.components.ad.widget.KsPriceView r0 = (com.kwad.components.ad.widget.KsPriceView) r0
            r3.Cd = r0
            android.view.ViewGroup r0 = r3.Cc
            int r1 = com.kwad.sdk.R.id.ksad_reward_jinniu_right_label
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.Ce = r0
            android.view.ViewGroup r0 = r3.Cc
            int r1 = com.kwad.sdk.R.id.ksad_reward_jinniu_btn_buy
            android.view.View r0 = r0.findViewById(r1)
            com.kwad.components.core.widget.KsStyledTextButton r0 = (com.kwad.components.core.widget.KsStyledTextButton) r0
            r3.Cf = r0
            android.view.ViewGroup r0 = r3.Cc
            int r1 = com.kwad.sdk.R.id.ksad_reward_jinniu_light_sweep
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.Cj = r0
            android.view.ViewGroup r0 = r3.Cc
            int r1 = com.kwad.sdk.R.id.ksad_reward_jinniu_coupon_layout
            android.view.View r0 = r0.findViewById(r1)
            r3.Ci = r0
            android.view.ViewGroup r0 = r3.Cc
            int r1 = com.kwad.sdk.R.id.ksad_reward_jinniu_coupon
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.Cg = r0
            android.view.ViewGroup r0 = r3.Cc
            int r1 = com.kwad.sdk.R.id.ksad_reward_jinniu_coupon_prefix
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.Ch = r0
            android.view.ViewGroup r0 = r3.vV
            r0.setOnClickListener(r3)
            com.kwad.components.core.widget.KsStyledTextButton r0 = r3.Cf
            if (r0 == 0) goto L8e
            r0.setOnClickListener(r3)
        L8e:
            android.view.ViewGroup r0 = r3.vV
            android.content.Context r0 = r0.getContext()
            boolean r1 = com.kwad.sdk.utils.aq.QW()
            if (r1 != 0) goto Lb7
            android.view.ViewGroup r1 = r3.vV
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r2 = r1 instanceof android.widget.FrameLayout.LayoutParams
            if (r2 == 0) goto Lb7
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            android.content.res.Resources r0 = r0.getResources()
            int r2 = com.kwad.sdk.R.dimen.ksad_reward_follow_card_width_horizontal
            int r0 = r0.getDimensionPixelSize(r2)
            r1.width = r0
            android.view.ViewGroup r0 = r3.vV
            r0.setLayoutParams(r1)
        Lb7:
            return
    }

    @Override // com.kwad.components.ad.reward.n.d
    public final void a(com.kwad.components.ad.reward.n.r r4) {
            r3 = this;
            super.a(r4)
            if (r4 != 0) goto L6
            goto L2f
        L6:
            com.kwad.sdk.core.response.model.AdTemplate r0 = r4.getAdTemplate()
            com.kwad.components.ad.reward.n.i$a r0 = com.kwad.components.ad.reward.n.i.a.Z(r0)
            com.kwad.sdk.core.response.model.AdTemplate r4 = r4.getAdTemplate()
            r3.a(r4, r0)
            android.view.ViewGroup r4 = r3.vV
            if (r4 == 0) goto L2f
            com.kwad.components.ad.reward.n.i$1 r0 = new com.kwad.components.ad.reward.n.i$1
            r0.<init>(r3)
            r1 = 3000(0xbb8, double:1.482E-320)
            r4.postDelayed(r0, r1)
            android.view.ViewGroup r4 = r3.vV
            com.kwad.components.ad.reward.n.i$2 r0 = new com.kwad.components.ad.reward.n.i$2
            r0.<init>(r3)
            r1 = 5000(0x1388, double:2.4703E-320)
            r4.postDelayed(r0, r1)
        L2f:
            return
    }

    @Override // com.kwad.components.ad.reward.n.d
    public final android.view.ViewGroup hP() {
            r1 = this;
            android.view.ViewGroup r0 = r1.vV
            return r0
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r5) {
            r4 = this;
            android.view.ViewGroup r0 = r4.vV
            boolean r0 = r5.equals(r0)
            r1 = 1
            if (r0 == 0) goto L16
            com.kwad.components.ad.reward.g r0 = r4.tm
            android.content.Context r5 = r5.getContext()
            r2 = 118(0x76, float:1.65E-43)
            r3 = 2
            r0.a(r1, r5, r2, r3)
            return
        L16:
            com.kwad.components.core.widget.KsStyledTextButton r0 = r4.Cf
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L27
            com.kwad.components.ad.reward.g r0 = r4.tm
            android.content.Context r5 = r5.getContext()
            r0.a(r1, r5, r1, r1)
        L27:
            return
    }
}
