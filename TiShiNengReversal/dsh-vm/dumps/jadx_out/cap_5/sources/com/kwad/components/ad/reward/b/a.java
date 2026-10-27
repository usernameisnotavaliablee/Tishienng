package com.kwad.components.ad.reward.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a extends com.kwad.components.ad.reward.n.d implements android.view.View.OnClickListener {
    private android.widget.TextView fv;
    private final android.view.ViewGroup jI;
    private android.widget.TextView ko;
    private int[] tJ;
    private android.view.View tK;
    private android.widget.ImageView tL;
    private android.widget.TextView tM;
    private android.widget.Button tN;

    @androidx.annotation.Nullable
    private com.kwad.components.ad.reward.b.a.b tO;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.kwad.components.ad.reward.b.a$1, reason: invalid class name */
    final class AnonymousClass1 extends com.kwad.sdk.utils.bg {
        final /* synthetic */ com.kwad.components.ad.reward.n.r tP;
        final /* synthetic */ long tQ;
        final /* synthetic */ com.kwad.components.ad.reward.b.a tR;


        AnonymousClass1(com.kwad.components.ad.reward.b.a r1, com.kwad.components.ad.reward.n.r r2, long r3) {
                r0 = this;
                r0.tR = r1
                r0.tP = r2
                r0.tQ = r3
                r0.<init>()
                return
        }

        @Override // com.kwad.sdk.utils.bg
        public final void doTask() {
                r2 = this;
                com.kwad.components.ad.reward.b.a r0 = r2.tR
                android.view.View r1 = com.kwad.components.ad.reward.b.a.a(r0)
                android.animation.Animator r0 = com.kwad.components.ad.reward.b.a.a(r0, r1)
                com.kwad.components.ad.reward.b.a$1$1 r1 = new com.kwad.components.ad.reward.b.a$1$1
                r1.<init>(r2, r0)
                r0.addListener(r1)
                r0.start()
                return
        }
    }


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.kwad.components.ad.reward.b.a$a, reason: collision with other inner class name */
    static class C0038a {
        private java.lang.CharSequence tW;
        private java.lang.CharSequence tX;
        private java.lang.CharSequence tY;
        private java.lang.CharSequence title;

        private C0038a(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.CouponInfo r4) {
                r3 = this;
                r3.<init>()
                java.lang.String r0 = r4.displayTitle
                r3.title = r0
                java.lang.String r0 = r4.displayValue
                r3.tW = r0
                java.lang.String r0 = r4.displayBase
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L24
                java.lang.String r0 = r4.displayBase
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                r1[r2] = r0
                java.lang.String r0 = "满%s可用"
                java.lang.String r0 = java.lang.String.format(r0, r1)
                r3.tX = r0
                goto L28
            L24:
                java.lang.String r0 = ""
                r3.tX = r0
            L28:
                java.lang.String r4 = r4.displayActionWords
                r3.tY = r4
                return
        }

        @androidx.annotation.Nullable
        public static com.kwad.components.ad.reward.b.a.C0038a Q(com.kwad.sdk.core.response.model.AdTemplate r1) {
                com.kwad.sdk.core.response.model.AdInfo r1 = com.kwad.sdk.core.response.b.e.el(r1)
                com.kwad.sdk.core.response.model.AdProductInfo r1 = com.kwad.sdk.core.response.b.a.cV(r1)
                if (r1 == 0) goto L22
                java.util.List<com.kwad.sdk.core.response.model.CouponInfo> r0 = r1.couponList
                if (r0 == 0) goto L22
                int r0 = r0.size()
                if (r0 <= 0) goto L22
                java.util.List<com.kwad.sdk.core.response.model.CouponInfo> r1 = r1.couponList
                r0 = 0
                java.lang.Object r1 = r1.get(r0)
                com.kwad.sdk.core.response.model.CouponInfo r1 = (com.kwad.sdk.core.response.model.CouponInfo) r1
                com.kwad.components.ad.reward.b.a$a r1 = a(r1)
                return r1
            L22:
                r1 = 0
                return r1
        }

        @androidx.annotation.Nullable
        private static com.kwad.components.ad.reward.b.a.C0038a a(com.kwad.sdk.core.response.model.CouponInfo r1) {
                if (r1 != 0) goto L4
                r1 = 0
                return r1
            L4:
                com.kwad.components.ad.reward.b.a$a r0 = new com.kwad.components.ad.reward.b.a$a
                r0.<init>(r1)
                return r0
        }

        public final java.lang.CharSequence Q(android.content.Context r5) {
                r4 = this;
                android.content.res.Resources r5 = r5.getResources()
                int r0 = com.kwad.sdk.R.dimen.ksad_coupon_dialog_value_prefix_text_size
                int r5 = r5.getDimensionPixelSize(r0)
                android.text.style.AbsoluteSizeSpan r0 = new android.text.style.AbsoluteSizeSpan
                r0.<init>(r5)
                android.text.SpannableString r5 = new android.text.SpannableString
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "¥"
                r1.<init>(r2)
                java.lang.CharSequence r2 = r4.tW
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r5.<init>(r1)
                r1 = 1
                r2 = 17
                r3 = 0
                r5.setSpan(r0, r3, r1, r2)
                return r5
        }

        public final java.lang.CharSequence getTitle() {
                r1 = this;
                java.lang.CharSequence r0 = r1.title
                return r0
        }

        public final java.lang.CharSequence hR() {
                r1 = this;
                java.lang.CharSequence r0 = r1.tX
                return r0
        }

        public final java.lang.CharSequence hS() {
                r1 = this;
                java.lang.CharSequence r0 = r1.tY
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b {
        void hT();

        void hU();
    }

    public a(android.content.Context r2, @androidx.annotation.Nullable android.view.ViewGroup r3, @androidx.annotation.Nullable int[] r4) {
            r1 = this;
            r1.<init>()
            r1.tJ = r4
            int r4 = com.kwad.sdk.R.layout.ksad_reward_coupon_dialog
            r0 = 0
            android.view.View r2 = com.kwad.sdk.o.m.a(r2, r4, r3, r0)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r1.jI = r2
            r1.d(r2)
            return
    }

    private static android.animation.Animator a(android.widget.ImageView r3, long r4) {
            float r0 = r3.getAlpha()
            r1 = 2
            float[] r1 = new float[r1]
            r2 = 0
            r1[r2] = r0
            r0 = 0
            r2 = 1
            r1[r2] = r0
            java.lang.String r0 = "alpha"
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r3, r0, r1)
            r3.setDuration(r4)
            return r3
    }

    static /* synthetic */ android.animation.Animator a(com.kwad.components.ad.reward.b.a r0, android.view.View r1) {
            android.animation.Animator r0 = o(r1)
            return r0
    }

    static /* synthetic */ android.animation.Animator a(com.kwad.components.ad.reward.b.a r0, android.widget.ImageView r1, long r2) {
            android.animation.Animator r0 = a(r1, r2)
            return r0
    }

    static /* synthetic */ android.view.View a(com.kwad.components.ad.reward.b.a r0) {
            android.view.View r0 = r0.tK
            return r0
    }

    private void a(com.kwad.components.ad.reward.b.a.C0038a r3) {
            r2 = this;
            if (r3 != 0) goto L3
            goto L35
        L3:
            android.widget.TextView r0 = r2.ko
            if (r0 == 0) goto Le
            java.lang.CharSequence r1 = r3.getTitle()
            r0.setText(r1)
        Le:
            android.widget.TextView r0 = r2.tM
            if (r0 == 0) goto L1f
            android.view.ViewGroup r1 = r2.jI
            android.content.Context r1 = r1.getContext()
            java.lang.CharSequence r1 = r3.Q(r1)
            r0.setText(r1)
        L1f:
            android.widget.TextView r0 = r2.fv
            if (r0 == 0) goto L2a
            java.lang.CharSequence r1 = r3.hR()
            r0.setText(r1)
        L2a:
            android.widget.Button r0 = r2.tN
            if (r0 == 0) goto L35
            java.lang.CharSequence r3 = r3.hS()
            r0.setText(r3)
        L35:
            return
    }

    static /* synthetic */ android.widget.ImageView b(com.kwad.components.ad.reward.b.a r0) {
            android.widget.ImageView r0 = r0.tL
            return r0
    }

    static /* synthetic */ void c(com.kwad.components.ad.reward.b.a r0) {
            r0.hQ()
            return
    }

    static /* synthetic */ com.kwad.components.ad.reward.b.a.b d(com.kwad.components.ad.reward.b.a r0) {
            com.kwad.components.ad.reward.b.a$b r0 = r0.tO
            return r0
    }

    private void d(android.view.ViewGroup r2) {
            r1 = this;
            int r0 = com.kwad.sdk.R.id.ksad_coupon_dialog_card
            android.view.View r0 = r2.findViewById(r0)
            r1.tK = r0
            int r0 = com.kwad.sdk.R.id.ksad_coupon_dialog_bg
            android.view.View r0 = r2.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1.tL = r0
            int r0 = com.kwad.sdk.R.id.ksad_coupon_dialog_title
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.ko = r0
            int r0 = com.kwad.sdk.R.id.ksad_coupon_dialog_content
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.tM = r0
            int r0 = com.kwad.sdk.R.id.ksad_coupon_dialog_desc
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.fv = r0
            int r0 = com.kwad.sdk.R.id.ksad_coupon_dialog_btn_action
            android.view.View r2 = r2.findViewById(r0)
            android.widget.Button r2 = (android.widget.Button) r2
            r1.tN = r2
            r2.setOnClickListener(r1)
            return
    }

    private void hQ() {
            r2 = this;
            android.view.View r0 = r2.tK
            android.animation.Animator r0 = r2.p(r0)
            com.kwad.components.ad.reward.b.a$2 r1 = new com.kwad.components.ad.reward.b.a$2
            r1.<init>(r2, r0)
            r0.addListener(r1)
            r0.start()
            return
    }

    private static android.animation.Animator o(android.view.View r5) {
            r0 = 2
            float[] r1 = new float[r0]
            r1 = {x002e: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            java.lang.String r2 = "scaleX"
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofFloat(r5, r2, r1)
            float[] r2 = new float[r0]
            r2 = {x0036: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            java.lang.String r3 = "scaleY"
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r5, r3, r2)
            android.animation.AnimatorSet r2 = new android.animation.AnimatorSet
            r2.<init>()
            r3 = 300(0x12c, double:1.48E-321)
            r2.setDuration(r3)
            android.animation.Animator[] r0 = new android.animation.Animator[r0]
            r3 = 0
            r0[r3] = r1
            r1 = 1
            r0[r1] = r5
            r2.playTogether(r0)
            return r2
    }

    private android.animation.Animator p(android.view.View r13) {
            r12 = this;
            r0 = 1063507722(0x3f63d70a, float:0.89)
            r1 = 1017370378(0x3ca3d70a, float:0.02)
            r2 = 1060655596(0x3f3851ec, float:0.72)
            r3 = 1065353216(0x3f800000, float:1.0)
            android.view.animation.Interpolator r0 = androidx.core.view.animation.PathInterpolatorCompat.create(r0, r1, r2, r3)
            r1 = 2
            float[] r2 = new float[r1]
            r2 = {x00c8: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            java.lang.String r4 = "scaleX"
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r13, r4, r2)
            float[] r4 = new float[r1]
            r4 = {x00d0: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            java.lang.String r5 = "scaleY"
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r13, r5, r4)
            r2.setInterpolator(r0)
            r4.setInterpolator(r0)
            int[] r0 = r12.tJ
            r5 = 1
            r6 = 0
            if (r0 == 0) goto L71
            int r0 = r0.length
            if (r0 < r1) goto L71
            int[] r0 = com.kwad.sdk.c.a.a.I(r13)
            if (r0 == 0) goto L71
            r7 = 1051260355(0x3ea8f5c3, float:0.33)
            r8 = 1062501089(0x3f547ae1, float:0.83)
            r9 = 0
            android.view.animation.Interpolator r3 = androidx.core.view.animation.PathInterpolatorCompat.create(r7, r9, r8, r3)
            int[] r7 = r12.tJ
            r7 = r7[r6]
            r8 = r0[r6]
            int r7 = r7 - r8
            float r7 = (float) r7
            float[] r8 = new float[r5]
            r8[r6] = r7
            java.lang.String r7 = "translationX"
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r13, r7, r8)
            int[] r8 = r12.tJ
            r8 = r8[r5]
            r0 = r0[r5]
            int r8 = r8 - r0
            float r0 = (float) r8
            float[] r8 = new float[r5]
            r8[r6] = r0
            java.lang.String r0 = "translationY"
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r13, r0, r8)
            r7.setInterpolator(r3)
            r0.setInterpolator(r3)
            goto L73
        L71:
            r7 = 0
            r0 = r7
        L73:
            float[] r3 = new float[r1]
            r3 = {x00d8: FILL_ARRAY_DATA , data: [1065353216, 1065353216} // fill-array
            java.lang.String r8 = "alpha"
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r13, r8, r3)
            r9 = 200(0xc8, double:9.9E-322)
            r3.setDuration(r9)
            float[] r11 = new float[r1]
            r11 = {x00e0: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            android.animation.ObjectAnimator r13 = android.animation.ObjectAnimator.ofFloat(r13, r8, r11)
            r13.setDuration(r9)
            android.animation.AnimatorSet r8 = new android.animation.AnimatorSet
            r8.<init>()
            android.animation.Animator[] r9 = new android.animation.Animator[r1]
            r9[r6] = r3
            r9[r5] = r13
            r8.playSequentially(r9)
            android.animation.AnimatorSet r13 = new android.animation.AnimatorSet
            r13.<init>()
            r9 = 500(0x1f4, double:2.47E-321)
            r13.setDuration(r9)
            r3 = 3
            if (r7 == 0) goto Lbc
            r9 = 5
            android.animation.Animator[] r9 = new android.animation.Animator[r9]
            r9[r6] = r2
            r9[r5] = r4
            r9[r1] = r8
            r9[r3] = r7
            r1 = 4
            r9[r1] = r0
            r13.playTogether(r9)
            return r13
        Lbc:
            android.animation.Animator[] r0 = new android.animation.Animator[r3]
            r0[r6] = r2
            r0[r5] = r4
            r0[r1] = r8
            r13.playTogether(r0)
            return r13
    }

    public final void a(@androidx.annotation.Nullable com.kwad.components.ad.reward.b.a.b r1) {
            r0 = this;
            r0.tO = r1
            return
    }

    @Override // com.kwad.components.ad.reward.n.d
    public final void a(com.kwad.components.ad.reward.n.r r5) {
            r4 = this;
            super.a(r5)
            com.kwad.sdk.core.response.model.AdTemplate r0 = r5.getAdTemplate()
            com.kwad.components.ad.reward.b.a$a r0 = com.kwad.components.ad.reward.b.a.C0038a.Q(r0)
            r4.a(r0)
            long r0 = com.kwad.components.ad.reward.a.b.hI()
            android.view.ViewGroup r2 = r4.jI
            com.kwad.components.ad.reward.b.a$1 r3 = new com.kwad.components.ad.reward.b.a$1
            r3.<init>(r4, r5, r0)
            r2.post(r3)
            return
    }

    @Override // com.kwad.components.ad.reward.n.d
    public final android.view.ViewGroup hP() {
            r1 = this;
            android.view.ViewGroup r0 = r1.jI
            return r0
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r2) {
            r1 = this;
            android.widget.Button r0 = r1.tN
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto Lf
            com.kwad.components.ad.reward.b.a$b r2 = r1.tO
            if (r2 == 0) goto Lf
            r2.hT()
        Lf:
            return
    }
}
