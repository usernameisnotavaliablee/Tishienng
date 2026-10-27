package com.kwad.components.ad.reward.presenter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class t extends com.kwad.components.ad.reward.presenter.b implements android.view.View.OnClickListener, com.kwad.components.ad.reward.e.o, com.kwad.sdk.core.g.b {
    private com.kwad.sdk.core.g.d gX;
    private android.os.Vibrator gZ;
    private android.view.ViewGroup kn;
    private android.widget.TextView ko;
    private android.widget.TextView kp;
    private android.widget.ImageView kq;
    private android.widget.FrameLayout kr;
    private android.widget.ImageView ks;
    private android.widget.FrameLayout kt;
    private android.widget.TextView ku;

    @androidx.annotation.Nullable
    private android.animation.Animator kv;
    private com.kwad.components.ad.reward.e.g mPlayEndPageListener;














    public t() {
            r1 = this;
            r1.<init>()
            com.kwad.components.ad.reward.presenter.t$1 r0 = new com.kwad.components.ad.reward.presenter.t$1
            r0.<init>(r1)
            r1.mPlayEndPageListener = r0
            return
    }

    @androidx.annotation.Nullable
    private android.animation.Animator a(float r19, float r20) {
            r18 = this;
            r0 = r18
            android.view.ViewGroup r1 = r0.kn
            r2 = 0
            if (r1 != 0) goto L8
            return r2
        L8:
            android.animation.AnimatorSet r1 = new android.animation.AnimatorSet
            r1.<init>()
            android.view.ViewGroup r3 = r0.kn
            android.content.res.Resources r3 = r3.getResources()
            android.widget.ImageView r4 = r0.kq
            r5 = 100
            r7 = 1098907648(0x41800000, float:16.0)
            android.animation.Animator r4 = com.kwad.components.core.t.o.a(r4, r2, r5, r7)
            com.kwad.components.ad.reward.presenter.t$7 r5 = new com.kwad.components.ad.reward.presenter.t$7
            r5.<init>(r0)
            r4.addListener(r5)
            android.view.ViewGroup r5 = r0.kn
            int r5 = r5.getLeft()
            float r5 = (float) r5
            android.view.ViewGroup r6 = r0.kn
            int r6 = r6.getWidth()
            float r6 = (float) r6
            r7 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r7
            float r5 = r5 + r6
            android.view.ViewGroup r6 = r0.kn
            int r6 = r6.getTop()
            float r6 = (float) r6
            android.view.ViewGroup r8 = r0.kn
            int r8 = r8.getHeight()
            float r8 = (float) r8
            float r8 = r8 / r7
            float r6 = r6 + r8
            android.view.ViewGroup r7 = r0.kn
            float r5 = r19 - r5
            r8 = 1
            float[] r9 = new float[r8]
            r10 = 0
            r9[r10] = r5
            java.lang.String r5 = "translationX"
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r7, r5, r9)
            android.view.ViewGroup r7 = r0.kn
            float r6 = r20 - r6
            float[] r9 = new float[r8]
            r9[r10] = r6
            java.lang.String r6 = "translationY"
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r7, r6, r9)
            int r7 = com.kwad.sdk.R.dimen.ksad_reward_shake_tips_height
            float r7 = r3.getDimension(r7)
            int r9 = com.kwad.sdk.R.dimen.ksad_reward_shake_tips_icon_size
            float r9 = r3.getDimension(r9)
            android.widget.FrameLayout r11 = r0.kr
            int r11 = r11.getWidth()
            float r11 = (float) r11
            android.widget.ImageView r12 = r0.kq
            int r12 = r12.getWidth()
            float r12 = (float) r12
            r13 = 0
            int r14 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r14 == 0) goto L1bc
            int r14 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r14 != 0) goto L8a
            goto L1bc
        L8a:
            r2 = 2
            float[] r14 = new float[r2]
            r14[r10] = r11
            r14[r8] = r7
            android.animation.ValueAnimator r7 = android.animation.ValueAnimator.ofFloat(r14)
            com.kwad.components.ad.reward.presenter.t$8 r11 = new com.kwad.components.ad.reward.presenter.t$8
            android.widget.ImageView r14 = r0.ks
            r11.<init>(r0, r14)
            r7.addUpdateListener(r11)
            float[] r11 = new float[r2]
            r11[r10] = r12
            r11[r8] = r9
            android.animation.ValueAnimator r11 = android.animation.ValueAnimator.ofFloat(r11)
            com.kwad.components.ad.reward.presenter.t$9 r12 = new com.kwad.components.ad.reward.presenter.t$9
            android.widget.ImageView r14 = r0.kq
            r12.<init>(r0, r14)
            r11.addUpdateListener(r12)
            int r12 = com.kwad.sdk.R.color.ksad_shake_icon_bg_start_color
            int r12 = r3.getColor(r12)
            int r14 = com.kwad.sdk.R.color.ksad_reward_main_color
            int r14 = r3.getColor(r14)
            int r15 = com.kwad.sdk.R.dimen.ksad_reward_shake_tips_icon_stroke_size
            int r15 = r3.getDimensionPixelSize(r15)
            int[] r12 = new int[]{r12, r14}
            android.animation.ValueAnimator r12 = com.kwad.sdk.widget.a.ofArgb(r12)
            r19 = 1
            com.kwad.components.ad.reward.presenter.t$10 r8 = new com.kwad.components.ad.reward.presenter.t$10
            r8.<init>(r0, r14, r15)
            r12.addUpdateListener(r8)
            float[] r8 = new float[r2]
            r8 = {x01be: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            android.animation.ValueAnimator r8 = android.animation.ValueAnimator.ofFloat(r8)
            r14 = 200(0xc8, double:9.9E-322)
            r8.setDuration(r14)
            com.kwad.components.ad.reward.presenter.t$11 r14 = new com.kwad.components.ad.reward.presenter.t$11
            r14.<init>(r0)
            r8.addUpdateListener(r14)
            android.widget.TextView r14 = r0.ko
            int r14 = r14.getHeight()
            float r14 = (float) r14
            float[] r15 = new float[r2]
            r15[r10] = r14
            r15[r19] = r13
            android.animation.ValueAnimator r14 = android.animation.ValueAnimator.ofFloat(r15)
            com.kwad.components.ad.reward.presenter.t$12 r15 = new com.kwad.components.ad.reward.presenter.t$12
            r16 = 0
            android.widget.TextView r10 = r0.ko
            r15.<init>(r0, r10)
            r14.addUpdateListener(r15)
            android.widget.TextView r10 = r0.kp
            int r10 = r10.getHeight()
            float r10 = (float) r10
            float[] r15 = new float[r2]
            r15[r16] = r10
            r15[r19] = r13
            android.animation.ValueAnimator r10 = android.animation.ValueAnimator.ofFloat(r15)
            com.kwad.components.ad.reward.presenter.t$13 r15 = new com.kwad.components.ad.reward.presenter.t$13
            r20 = 0
            android.widget.TextView r13 = r0.kp
            r15.<init>(r0, r13)
            r10.addUpdateListener(r15)
            android.animation.AnimatorSet r13 = new android.animation.AnimatorSet
            r13.<init>()
            r15 = r3
            r17 = 2
            r2 = 500(0x1f4, double:2.47E-321)
            r13.setDuration(r2)
            r2 = 7
            android.animation.Animator[] r2 = new android.animation.Animator[r2]
            r2[r16] = r5
            r2[r19] = r6
            r2[r17] = r7
            r3 = 3
            r2[r3] = r11
            r5 = 4
            r2[r5] = r12
            r6 = 5
            r2[r6] = r14
            r7 = 6
            r2[r7] = r10
            r13.playTogether(r2)
            android.animation.AnimatorSet r2 = new android.animation.AnimatorSet
            r2.<init>()
            android.animation.Animator r10 = r4.clone()
            com.kwad.components.ad.reward.presenter.t$2 r11 = new com.kwad.components.ad.reward.presenter.t$2
            r11.<init>(r0, r9, r10)
            r10.addListener(r11)
            android.widget.FrameLayout r9 = r0.kt
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            int r11 = com.kwad.sdk.R.dimen.ksad_reward_shake_tips_width
            float r11 = r15.getDimension(r11)
            r12 = 2
            float[] r14 = new float[r12]
            r14[r16] = r20
            r14[r19] = r11
            android.animation.ValueAnimator r11 = android.animation.ValueAnimator.ofFloat(r14)
            r14 = 500(0x1f4, double:2.47E-321)
            android.animation.ValueAnimator r11 = r11.setDuration(r14)
            r20 = 4
            com.kwad.components.ad.reward.presenter.t$3 r5 = new com.kwad.components.ad.reward.presenter.t$3
            r5.<init>(r0, r9)
            r11.addUpdateListener(r5)
            android.widget.TextView r5 = r0.ku
            float[] r9 = new float[r12]
            r9 = {x01c6: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            r17 = 5
            java.lang.String r6 = "alpha"
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r5, r6, r9)
            android.animation.ObjectAnimator r5 = r5.setDuration(r14)
            android.animation.Animator[] r6 = new android.animation.Animator[r3]
            r6[r16] = r10
            r6[r19] = r11
            r6[r12] = r5
            r2.playTogether(r6)
            android.animation.Animator r5 = r4.clone()
            android.animation.Animator r6 = r4.clone()
            android.animation.Animator[] r7 = new android.animation.Animator[r7]
            r7[r16] = r4
            r7[r19] = r5
            r7[r12] = r6
            r7[r3] = r8
            r7[r20] = r13
            r7[r17] = r2
            r1.playSequentially(r7)
            return r1
        L1bc:
            return r2
    }

    static /* synthetic */ android.animation.Animator a(com.kwad.components.ad.reward.presenter.t r0, float r1, float r2) {
            android.animation.Animator r0 = r0.a(r1, r2)
            return r0
    }

    static /* synthetic */ android.animation.Animator a(com.kwad.components.ad.reward.presenter.t r0, android.animation.Animator r1) {
            r0.kv = r1
            return r1
    }

    static /* synthetic */ android.view.ViewGroup a(com.kwad.components.ad.reward.presenter.t r0) {
            android.view.ViewGroup r0 = r0.kn
            return r0
    }

    private static java.lang.String a(com.kwad.components.ad.reward.g r2, com.kwad.sdk.core.response.model.AdInfo r3) {
            java.lang.String r0 = com.kwad.sdk.core.response.b.b.ei(r3)
            com.kwad.components.core.e.d.c r2 = r2.mApkDownloadHelper
            boolean r1 = com.kwad.sdk.core.response.b.a.aF(r3)
            if (r1 == 0) goto L27
            if (r2 == 0) goto L27
            int r2 = r2.pB()
            com.kwad.sdk.core.response.model.AdMatrixInfo$DownloadTexts r3 = com.kwad.sdk.core.response.b.b.ek(r3)
            r0 = 8
            if (r2 == r0) goto L24
            r0 = 12
            if (r2 == r0) goto L21
            java.lang.String r2 = r3.adActionDescription
            return r2
        L21:
            java.lang.String r2 = r3.openAppLabel
            return r2
        L24:
            java.lang.String r2 = r3.installAppLabel
            return r2
        L27:
            return r0
    }

    private void a(com.kwad.sdk.core.response.model.AdInfo r4) {
            r3 = this;
            java.lang.String r0 = com.kwad.sdk.core.response.b.b.eg(r4)
            android.widget.TextView r1 = r3.ko
            if (r1 == 0) goto Lb
            r1.setText(r0)
        Lb:
            android.widget.TextView r1 = r3.ku
            if (r1 == 0) goto L12
            r1.setText(r0)
        L12:
            com.kwad.components.ad.reward.g r0 = r3.tm
            java.lang.String r4 = a(r0, r4)
            android.widget.TextView r0 = r3.kp
            if (r0 == 0) goto L2d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "或点击"
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.setText(r4)
        L2d:
            return
    }

    static /* synthetic */ android.widget.FrameLayout b(com.kwad.components.ad.reward.presenter.t r0) {
            android.widget.FrameLayout r0 = r0.kt
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.g.d c(com.kwad.components.ad.reward.presenter.t r0) {
            com.kwad.sdk.core.g.d r0 = r0.gX
            return r0
    }

    static /* synthetic */ android.content.Context d(com.kwad.components.ad.reward.presenter.t r0) {
            android.content.Context r0 = r0.getContext()
            return r0
    }

    private void ds() {
            r9 = this;
            int r0 = com.kwad.sdk.R.id.ksad_root_container
            android.view.View r0 = r9.findViewById(r0)
            com.kwad.sdk.core.view.AdBaseFrameLayout r0 = (com.kwad.sdk.core.view.AdBaseFrameLayout) r0
            android.content.Context r1 = r9.getContext()
            int r2 = com.kwad.sdk.R.layout.ksad_shake_center
            r3 = 0
            android.view.View r1 = com.kwad.sdk.o.m.a(r1, r2, r0, r3)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r9.kn = r1
            r1.setVisibility(r3)
            android.view.ViewGroup r1 = r9.kn
            android.content.res.Resources r1 = r1.getResources()
            r2 = 1
            com.kwad.components.ad.reward.g r4 = r9.tm     // Catch: java.lang.Throwable -> L33
            com.kwad.sdk.core.response.model.AdTemplate r4 = r4.mAdTemplate     // Catch: java.lang.Throwable -> L33
            com.kwad.sdk.core.response.model.AdInfo r4 = com.kwad.sdk.core.response.b.e.el(r4)     // Catch: java.lang.Throwable -> L33
            int r4 = com.kwad.sdk.core.response.b.a.bf(r4)     // Catch: java.lang.Throwable -> L33
            r5 = 8
            if (r4 != r5) goto L37
            r4 = 1
            goto L38
        L33:
            r4 = move-exception
            com.kwad.sdk.core.d.c.printStackTrace(r4)
        L37:
            r4 = 0
        L38:
            int r5 = com.kwad.sdk.R.dimen.ksad_reward_shake_tips_icon_marginLeft
            int r5 = r1.getDimensionPixelSize(r5)
            com.kwad.components.ad.reward.g r6 = r9.tm
            int r6 = r6.mScreenOrientation
            r7 = 1112014848(0x42480000, float:50.0)
            if (r6 != r2) goto L56
            int r6 = com.kwad.sdk.R.dimen.ksad_reward_shake_tips_icon_marginBottom
            int r6 = r1.getDimensionPixelSize(r6)
            android.content.Context r8 = r9.getContext()
            int r8 = com.kwad.sdk.c.a.a.a(r8, r7)
            int r6 = r6 + r8
            goto L65
        L56:
            if (r4 == 0) goto L5f
            int r6 = com.kwad.sdk.R.dimen.ksad_reward_shake_tips_icon_live_shop_marginBottom
            int r6 = r1.getDimensionPixelSize(r6)
            goto L65
        L5f:
            int r6 = com.kwad.sdk.R.dimen.ksad_reward_shake_tips_icon_marginBottom
            int r6 = r1.getDimensionPixelSize(r6)
        L65:
            com.kwad.components.ad.reward.g r8 = r9.tm
            int r8 = r8.mScreenOrientation
            if (r8 != r2) goto L7b
            int r2 = com.kwad.sdk.R.dimen.ksad_reward_shake_tips_title_marginBottom
            int r2 = r1.getDimensionPixelSize(r2)
            android.content.Context r4 = r9.getContext()
            int r4 = com.kwad.sdk.c.a.a.a(r4, r7)
            int r2 = r2 + r4
            goto L8a
        L7b:
            if (r4 == 0) goto L84
            int r2 = com.kwad.sdk.R.dimen.ksad_reward_shake_tips_title_live_shop_marginBottom
            int r2 = r1.getDimensionPixelSize(r2)
            goto L8a
        L84:
            int r2 = com.kwad.sdk.R.dimen.ksad_reward_shake_tips_title_marginBottom
            int r2 = r1.getDimensionPixelSize(r2)
        L8a:
            int r4 = com.kwad.sdk.R.dimen.ksad_reward_shake_tips_height
            int r1 = r1.getDimensionPixelSize(r4)
            android.content.Context r4 = r9.getContext()
            int r7 = com.kwad.sdk.R.layout.ksad_shake_tips_title
            android.view.View r3 = com.kwad.sdk.o.m.a(r4, r7, r0, r3)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r9.kt = r3
            int r4 = com.kwad.sdk.R.id.ksad_shake_tips_label
            android.view.View r3 = r3.findViewById(r4)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r9.ku = r3
            android.widget.FrameLayout r3 = r9.kt
            r4 = 4
            r3.setVisibility(r4)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r4 = -2
            r3.<init>(r4, r1)
            r3.leftMargin = r5
            r3.bottomMargin = r2
            r1 = 83
            r3.gravity = r1
            android.widget.FrameLayout r1 = r9.kt
            r0.addView(r1, r3)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r1.<init>(r4, r4)
            r2 = 17
            r1.gravity = r2
            android.view.ViewGroup r2 = r9.kn
            r0.addView(r2, r1)
            com.kwad.components.ad.reward.g r1 = r9.tm
            com.kwad.sdk.core.response.model.AdTemplate r1 = r1.mAdTemplate
            r2 = 185(0xb9, float:2.59E-43)
            r3 = 0
            com.kwad.sdk.core.adlog.c.b(r1, r2, r3)
            android.view.ViewGroup r1 = r9.kn
            com.kwad.components.ad.reward.presenter.t$6 r2 = new com.kwad.components.ad.reward.presenter.t$6
            r2.<init>(r9, r0, r5, r6)
            r1.post(r2)
            return
    }

    static /* synthetic */ android.animation.Animator e(com.kwad.components.ad.reward.presenter.t r0) {
            android.animation.Animator r0 = r0.kv
            return r0
    }

    static /* synthetic */ android.widget.ImageView f(com.kwad.components.ad.reward.presenter.t r0) {
            android.widget.ImageView r0 = r0.kq
            return r0
    }

    static /* synthetic */ android.widget.ImageView g(com.kwad.components.ad.reward.presenter.t r0) {
            android.widget.ImageView r0 = r0.ks
            return r0
    }

    static /* synthetic */ android.widget.TextView h(com.kwad.components.ad.reward.presenter.t r0) {
            android.widget.TextView r0 = r0.ko
            return r0
    }

    static /* synthetic */ android.widget.TextView i(com.kwad.components.ad.reward.presenter.t r0) {
            android.widget.TextView r0 = r0.kp
            return r0
    }

    private void initView() {
            r2 = this;
            android.view.ViewGroup r0 = r2.kn
            int r1 = com.kwad.sdk.R.id.ksad_shake_center_title
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.ko = r0
            android.view.ViewGroup r0 = r2.kn
            int r1 = com.kwad.sdk.R.id.ksad_shake_center_sub_title
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.kp = r0
            android.view.ViewGroup r0 = r2.kn
            int r1 = com.kwad.sdk.R.id.ksad_shake_center_icon
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r2.kq = r0
            android.view.ViewGroup r0 = r2.kn
            int r1 = com.kwad.sdk.R.id.ksad_shake_center_circle_area
            android.view.View r0 = r0.findViewById(r1)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r2.kr = r0
            android.view.ViewGroup r0 = r2.kn
            int r1 = com.kwad.sdk.R.id.ksad_shake_center_circle_area_bg
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r2.ks = r0
            android.widget.TextView r0 = r2.ko
            r0.setOnClickListener(r2)
            android.widget.TextView r0 = r2.kp
            r0.setOnClickListener(r2)
            android.widget.FrameLayout r0 = r2.kr
            r0.setOnClickListener(r2)
            android.widget.TextView r0 = r2.ku
            r0.setOnClickListener(r2)
            return
    }

    @Override // com.kwad.sdk.core.g.b
    public final void a(double r15) {
            r14 = this;
            com.kwad.sdk.core.c.b.Ho()
            android.app.Activity r0 = com.kwad.sdk.core.c.b.getCurrentActivity()
            android.app.Activity r1 = r14.getActivity()
            if (r1 == 0) goto L15
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L15
            r0 = 1
            goto L16
        L15:
            r0 = 0
        L16:
            boolean r1 = com.kwad.components.core.e.c.b.oW()
            r2 = 500(0x1f4, double:2.47E-321)
            r4 = 0
            if (r1 != 0) goto L66
            if (r0 != 0) goto L22
            goto L66
        L22:
            com.kwad.components.ad.reward.g r0 = r14.tm
            if (r0 == 0) goto L45
            boolean r0 = r0.gV()
            if (r0 != 0) goto L45
            com.kwad.sdk.core.adlog.c.b r13 = new com.kwad.sdk.core.adlog.c.b
            r13.<init>()
            r0 = r15
            r13.l(r0)
            com.kwad.components.ad.reward.g r5 = r14.tm
            android.content.Context r7 = r14.getContext()
            r10 = 0
            r12 = 0
            r6 = 1
            r8 = 157(0x9d, float:2.2E-43)
            r9 = 1
            r5.a(r6, r7, r8, r9, r10, r12, r13)
        L45:
            com.kwad.components.ad.reward.presenter.t$5 r0 = new com.kwad.components.ad.reward.presenter.t$5
            r0.<init>(r14)
            com.kwad.sdk.utils.bw.a(r0, r4, r2)
            com.kwad.components.ad.reward.g r0 = r14.tm
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.response.b.e.el(r0)
            com.kwad.components.ad.reward.g r0 = r14.tm
            boolean r0 = r0.gV()
            if (r0 != 0) goto L65
            android.content.Context r0 = r14.getContext()
            android.os.Vibrator r1 = r14.gZ
            com.kwad.sdk.utils.bw.a(r0, r1)
        L65:
            return
        L66:
            com.kwad.components.ad.reward.presenter.t$4 r0 = new com.kwad.components.ad.reward.presenter.t$4
            r0.<init>(r14)
            com.kwad.sdk.utils.bw.a(r0, r4, r2)
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.b, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r3 = this;
            super.at()
            com.kwad.components.ad.reward.g r0 = r3.tm
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            com.kwad.components.ad.reward.g r1 = r3.tm
            r1.a(r3)
            com.kwad.components.ad.reward.g r1 = r3.tm
            com.kwad.components.ad.reward.e.g r2 = r3.mPlayEndPageListener
            r1.b(r2)
            r3.ds()
            r3.initView()
            r3.a(r0)
            float r0 = com.kwad.sdk.core.response.b.b.ee(r0)
            com.kwad.sdk.core.g.d r1 = r3.gX
            if (r1 != 0) goto L33
            com.kwad.sdk.core.g.d r1 = new com.kwad.sdk.core.g.d
            r1.<init>(r0)
            r3.gX = r1
            r1.a(r3)
            goto L36
        L33:
            r1.g(r0)
        L36:
            com.kwad.sdk.core.g.d r0 = r3.gX
            android.content.Context r1 = r3.getContext()
            r0.bG(r1)
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L4f
            java.lang.String r1 = "vibrator"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.os.Vibrator r0 = (android.os.Vibrator) r0
            r3.gZ = r0
        L4f:
            return
    }

    @Override // com.kwad.sdk.core.g.b
    public final void cd() {
            r0 = this;
            return
    }

    @Override // com.kwad.components.ad.reward.e.o
    public final int dr() {
            r3 = this;
            android.content.Context r0 = r3.getContext()
            int r1 = com.kwad.sdk.R.dimen.ksad_reward_shake_tips_title_marginBottom
            int r0 = com.kwad.sdk.c.a.a.h(r0, r1)
            android.content.Context r1 = r3.getContext()
            int r2 = com.kwad.sdk.R.dimen.ksad_reward_shake_tips_height
            int r1 = com.kwad.sdk.c.a.a.h(r1, r2)
            int r0 = r0 + r1
            return r0
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r4) {
            r3 = this;
            com.kwad.components.ad.reward.g r4 = r3.tm
            com.kwad.sdk.core.response.model.AdTemplate r4 = r4.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r4 = com.kwad.sdk.core.response.b.e.el(r4)
            boolean r4 = com.kwad.sdk.core.response.b.b.ec(r4)
            if (r4 != 0) goto Lf
            return
        Lf:
            com.kwad.components.ad.reward.g r4 = r3.tm
            android.content.Context r0 = r3.getContext()
            r1 = 158(0x9e, float:2.21E-43)
            r2 = 1
            r4.a(r2, r0, r1, r2)
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r3 = this;
            super.onUnbind()
            android.view.ViewGroup r0 = r3.kn
            r1 = 0
            if (r0 == 0) goto L1d
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L1b
            android.view.ViewGroup r0 = r3.kn
            android.view.ViewParent r0 = r0.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.ViewGroup r2 = r3.kn
            r0.removeView(r2)
        L1b:
            r3.kn = r1
        L1d:
            android.content.Context r0 = r3.getContext()
            android.os.Vibrator r2 = r3.gZ
            com.kwad.sdk.utils.bw.b(r0, r2)
            r3.gZ = r1
            android.animation.Animator r0 = r3.kv
            if (r0 == 0) goto L31
            r0.cancel()
            r3.kv = r1
        L31:
            com.kwad.components.ad.reward.g r0 = r3.tm
            com.kwad.components.ad.reward.e.g r1 = r3.mPlayEndPageListener
            r0.c(r1)
            return
    }
}
