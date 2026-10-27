package com.scwang.smartrefresh.header;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class FlyRefreshHeader extends com.scwang.smartrefresh.layout.header.FalsifyHeader implements l2.e {
    private com.scwang.smartrefresh.header.flyrefresh.FlyView b;
    private android.animation.AnimatorSet c;
    private com.scwang.smartrefresh.header.flyrefresh.MountanScenceView d;
    private l2.h e;
    private l2.g f;
    private float g;
    private boolean h;
    private int i;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.animation.ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ com.scwang.smartrefresh.header.FlyRefreshHeader a;

        a(com.scwang.smartrefresh.header.FlyRefreshHeader r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(android.animation.ValueAnimator r3) {
                r2 = this;
                com.scwang.smartrefresh.header.FlyRefreshHeader r0 = r2.a
                java.lang.Object r3 = r3.getAnimatedValue()
                java.lang.Float r3 = (java.lang.Float) r3
                float r3 = r3.floatValue()
                r1 = 0
                r0.x(r3, r1, r1, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends android.animation.AnimatorListenerAdapter {
        final /* synthetic */ com.scwang.smartrefresh.header.FlyRefreshHeader a;

        b(com.scwang.smartrefresh.header.FlyRefreshHeader r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator r2) {
                r1 = this;
                com.scwang.smartrefresh.header.FlyRefreshHeader r2 = r1.a
                com.scwang.smartrefresh.header.flyrefresh.FlyView r2 = com.scwang.smartrefresh.header.FlyRefreshHeader.m(r2)
                if (r2 == 0) goto L13
                com.scwang.smartrefresh.header.FlyRefreshHeader r2 = r1.a
                com.scwang.smartrefresh.header.flyrefresh.FlyView r2 = com.scwang.smartrefresh.header.FlyRefreshHeader.m(r2)
                r0 = 1127481344(0x43340000, float:180.0)
                r2.setRotationY(r0)
            L13:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends android.animation.AnimatorListenerAdapter {
        final /* synthetic */ android.animation.AnimatorListenerAdapter a;
        final /* synthetic */ com.scwang.smartrefresh.header.FlyRefreshHeader b;

        c(com.scwang.smartrefresh.header.FlyRefreshHeader r1, android.animation.AnimatorListenerAdapter r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r3) {
                r2 = this;
                com.scwang.smartrefresh.header.FlyRefreshHeader r0 = r2.b
                l2.h r0 = com.scwang.smartrefresh.header.FlyRefreshHeader.n(r0)
                if (r0 == 0) goto L12
                com.scwang.smartrefresh.header.FlyRefreshHeader r0 = r2.b
                l2.h r0 = com.scwang.smartrefresh.header.FlyRefreshHeader.n(r0)
                r1 = 1
                r0.g0(r1)
            L12:
                android.animation.AnimatorListenerAdapter r0 = r2.a
                if (r0 == 0) goto L19
                r0.onAnimationEnd(r3)
            L19:
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator r2) {
                r1 = this;
                com.scwang.smartrefresh.header.FlyRefreshHeader r2 = r1.b
                com.scwang.smartrefresh.header.flyrefresh.FlyView r2 = com.scwang.smartrefresh.header.FlyRefreshHeader.m(r2)
                if (r2 == 0) goto L12
                com.scwang.smartrefresh.header.FlyRefreshHeader r2 = r1.b
                com.scwang.smartrefresh.header.flyrefresh.FlyView r2 = com.scwang.smartrefresh.header.FlyRefreshHeader.m(r2)
                r0 = 0
                r2.setRotationY(r0)
            L12:
                return
        }
    }

    public FlyRefreshHeader(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.h = r1
            r0.i = r1
            return
    }

    public FlyRefreshHeader(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.h = r1
            r0.i = r1
            return
    }

    public FlyRefreshHeader(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 0
            r0.h = r1
            r0.i = r1
            return
    }

    @androidx.annotation.RequiresApi(21)
    public FlyRefreshHeader(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            r1 = 0
            r0.h = r1
            r0.i = r1
            return
    }

    static /* synthetic */ com.scwang.smartrefresh.header.flyrefresh.FlyView m(com.scwang.smartrefresh.header.FlyRefreshHeader r0) {
            com.scwang.smartrefresh.header.flyrefresh.FlyView r0 = r0.b
            return r0
    }

    static /* synthetic */ l2.h n(com.scwang.smartrefresh.header.FlyRefreshHeader r0) {
            l2.h r0 = r0.e
            return r0
    }

    public void A(android.animation.AnimatorListenerAdapter r22) {
            r21 = this;
            r0 = r21
            com.scwang.smartrefresh.header.flyrefresh.FlyView r1 = r0.b
            if (r1 == 0) goto L16b
            boolean r1 = r0.h
            if (r1 == 0) goto L16b
            l2.h r1 = r0.e
            if (r1 != 0) goto L10
            goto L16b
        L10:
            android.animation.AnimatorSet r1 = r0.c
            if (r1 == 0) goto L1c
            r1.end()
            com.scwang.smartrefresh.header.flyrefresh.FlyView r1 = r0.b
            r1.clearAnimation()
        L1c:
            r1 = 0
            r0.h = r1
            l2.h r2 = r0.e
            r2.A(r1)
            com.scwang.smartrefresh.header.flyrefresh.FlyView r2 = r0.b
            int r2 = r2.getRight()
            int r2 = -r2
            r3 = 1092616192(0x41200000, float:10.0)
            int r3 = com.scwang.smartrefresh.layout.util.c.b(r3)
            int r3 = -r3
            android.animation.AnimatorSet r4 = new android.animation.AnimatorSet
            r4.<init>()
            r5 = 800(0x320, double:3.953E-321)
            r4.setDuration(r5)
            com.scwang.smartrefresh.header.flyrefresh.FlyView r7 = r0.b
            float r8 = r7.getTranslationX()
            float r2 = (float) r2
            r9 = 2
            float[] r10 = new float[r9]
            r10[r1] = r8
            r8 = 1
            r10[r8] = r2
            java.lang.String r11 = "translationX"
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r7, r11, r10)
            com.scwang.smartrefresh.header.flyrefresh.FlyView r10 = r0.b
            float r12 = r10.getTranslationY()
            float r3 = (float) r3
            float[] r13 = new float[r9]
            r13[r1] = r12
            r13[r8] = r3
            java.lang.String r12 = "translationY"
            android.animation.ObjectAnimator r10 = android.animation.ObjectAnimator.ofFloat(r10, r12, r13)
            r13 = 1036831949(0x3dcccccd, float:0.1)
            r14 = 1065353216(0x3f800000, float:1.0)
            android.view.animation.Interpolator r13 = com.scwang.smartrefresh.header.flyrefresh.a.a(r13, r14)
            r10.setInterpolator(r13)
            com.scwang.smartrefresh.header.flyrefresh.FlyView r13 = r0.b
            float r14 = r13.getRotation()
            float[] r15 = new float[r9]
            r15[r1] = r14
            r14 = 0
            r15[r8] = r14
            r16 = 0
            java.lang.String r1 = "rotation"
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofFloat(r13, r1, r15)
            com.scwang.smartrefresh.header.flyrefresh.FlyView r13 = r0.b
            float r15 = r13.getRotationX()
            r17 = 1
            float[] r8 = new float[r9]
            r8[r16] = r15
            r15 = 1106247680(0x41f00000, float:30.0)
            r8[r17] = r15
            java.lang.String r15 = "rotationX"
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r13, r15, r8)
            android.view.animation.AccelerateInterpolator r13 = new android.view.animation.AccelerateInterpolator
            r13.<init>()
            r1.setInterpolator(r13)
            com.scwang.smartrefresh.header.flyrefresh.FlyView r13 = r0.b
            float r18 = r13.getScaleX()
            r19 = 0
            float[] r14 = new float[r9]
            r14[r16] = r18
            r18 = 1063675494(0x3f666666, float:0.9)
            r14[r17] = r18
            java.lang.String r5 = "scaleX"
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r13, r5, r14)
            com.scwang.smartrefresh.header.flyrefresh.FlyView r13 = r0.b
            float r14 = r13.getScaleY()
            r20 = r1
            float[] r1 = new float[r9]
            r1[r16] = r14
            r1[r17] = r18
            java.lang.String r14 = "scaleY"
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofFloat(r13, r14, r1)
            r13 = 6
            android.animation.Animator[] r13 = new android.animation.Animator[r13]
            r13[r16] = r7
            r13[r17] = r10
            r13[r9] = r20
            r7 = 3
            r13[r7] = r8
            r8 = 4
            r13[r8] = r6
            r6 = 5
            r13[r6] = r1
            r4.playTogether(r13)
            com.scwang.smartrefresh.header.FlyRefreshHeader$b r1 = new com.scwang.smartrefresh.header.FlyRefreshHeader$b
            r1.<init>(r0)
            r4.addListener(r1)
            android.animation.AnimatorSet r1 = new android.animation.AnimatorSet
            r1.<init>()
            r7 = 800(0x320, double:3.953E-321)
            r10 = 3
            r13 = 4
            r1.setDuration(r7)
            android.view.animation.DecelerateInterpolator r7 = new android.view.animation.DecelerateInterpolator
            r7.<init>()
            r1.setInterpolator(r7)
            com.scwang.smartrefresh.header.flyrefresh.FlyView r7 = r0.b
            float[] r8 = new float[r9]
            r8[r16] = r2
            r8[r17] = r19
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r7, r11, r8)
            com.scwang.smartrefresh.header.flyrefresh.FlyView r7 = r0.b
            float[] r8 = new float[r9]
            r8[r16] = r3
            r8[r17] = r19
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r7, r12, r8)
            com.scwang.smartrefresh.header.flyrefresh.FlyView r7 = r0.b
            float[] r8 = new float[r9]
            r8 = {x016c: FILL_ARRAY_DATA , data: [1106247680, 0} // fill-array
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r7, r15, r8)
            com.scwang.smartrefresh.header.flyrefresh.FlyView r8 = r0.b
            float[] r11 = new float[r9]
            r11 = {x0174: FILL_ARRAY_DATA , data: [1063675494, 1065353216} // fill-array
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r8, r5, r11)
            com.scwang.smartrefresh.header.flyrefresh.FlyView r8 = r0.b
            float[] r11 = new float[r9]
            r11 = {x017c: FILL_ARRAY_DATA , data: [1063675494, 1065353216} // fill-array
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r8, r14, r11)
            android.animation.Animator[] r6 = new android.animation.Animator[r6]
            r6[r16] = r2
            r6[r17] = r3
            r6[r9] = r7
            r6[r10] = r5
            r6[r13] = r8
            r1.playTogether(r6)
            r2 = 100
            r1.setStartDelay(r2)
            com.scwang.smartrefresh.header.FlyRefreshHeader$c r2 = new com.scwang.smartrefresh.header.FlyRefreshHeader$c
            r3 = r22
            r2.<init>(r0, r3)
            r1.addListener(r2)
            android.animation.AnimatorSet r2 = new android.animation.AnimatorSet
            r2.<init>()
            r0.c = r2
            android.animation.Animator[] r3 = new android.animation.Animator[r9]
            r3[r16] = r4
            r3[r17] = r1
            r2.playSequentially(r3)
            android.animation.AnimatorSet r1 = r0.c
            r1.start()
        L16b:
            return
    }

    public void B(com.scwang.smartrefresh.header.flyrefresh.MountanScenceView r1, com.scwang.smartrefresh.header.flyrefresh.FlyView r2) {
            r0 = this;
            r0.setUpFlyView(r2)
            r0.setUpMountanScenceView(r1)
            return
    }

    @Override // com.scwang.smartrefresh.layout.header.FalsifyHeader
    public void f(l2.g r1, int r2, int r3) {
            r0 = this;
            r0.f = r1
            l2.h r1 = r1.c()
            r0.e = r1
            return
    }

    @Override // com.scwang.smartrefresh.layout.header.FalsifyHeader
    public void g(float r2, int r3, int r4, int r5) {
            r1 = this;
            boolean r0 = r1.h
            if (r0 != 0) goto L7
            r1.x(r2, r3, r4, r5)
        L7:
            return
    }

    @Override // com.scwang.smartrefresh.layout.header.FalsifyHeader
    public void i(l2.h r12, int r13, int r14) {
            r11 = this;
            l2.g r13 = r11.f
            r14 = 0
            r13.b(r14)
            float r13 = r11.g
            r0 = 1
            r1 = 2
            r2 = 0
            int r3 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r3 <= 0) goto L2b
            float[] r3 = new float[r1]
            r3[r14] = r13
            r3[r0] = r2
            android.animation.ValueAnimator r13 = android.animation.ValueAnimator.ofFloat(r3)
            r3 = 300(0x12c, double:1.48E-321)
            r13.setDuration(r3)
            com.scwang.smartrefresh.header.FlyRefreshHeader$a r3 = new com.scwang.smartrefresh.header.FlyRefreshHeader$a
            r3.<init>(r11)
            r13.addUpdateListener(r3)
            r13.start()
            r11.g = r2
        L2b:
            com.scwang.smartrefresh.header.flyrefresh.FlyView r13 = r11.b
            if (r13 == 0) goto L10a
            boolean r13 = r11.h
            if (r13 != 0) goto L10a
            android.animation.AnimatorSet r13 = r11.c
            if (r13 == 0) goto L3f
            r13.end()
            com.scwang.smartrefresh.header.flyrefresh.FlyView r13 = r11.b
            r13.clearAnimation()
        L3f:
            r11.h = r0
            r12.g0(r14)
            l2.h r12 = r11.e
            android.view.View r12 = (android.view.View) r12
            int r12 = r12.getWidth()
            com.scwang.smartrefresh.header.flyrefresh.FlyView r13 = r11.b
            int r13 = r13.getLeft()
            int r12 = r12 - r13
            com.scwang.smartrefresh.header.flyrefresh.FlyView r13 = r11.b
            int r13 = r13.getTop()
            int r3 = r11.i
            int r13 = r13 - r3
            int r13 = -r13
            int r13 = r13 * 2
            r3 = 3
            int r13 = r13 / r3
            com.scwang.smartrefresh.header.flyrefresh.FlyView r4 = r11.b
            float r12 = (float) r12
            float[] r5 = new float[r1]
            r5[r14] = r2
            r5[r0] = r12
            java.lang.String r12 = "translationX"
            android.animation.ObjectAnimator r12 = android.animation.ObjectAnimator.ofFloat(r4, r12, r5)
            com.scwang.smartrefresh.header.flyrefresh.FlyView r4 = r11.b
            float r13 = (float) r13
            float[] r5 = new float[r1]
            r5[r14] = r2
            r5[r0] = r13
            java.lang.String r13 = "translationY"
            android.animation.ObjectAnimator r13 = android.animation.ObjectAnimator.ofFloat(r4, r13, r5)
            r4 = 1060320051(0x3f333333, float:0.7)
            r5 = 1065353216(0x3f800000, float:1.0)
            android.view.animation.Interpolator r4 = com.scwang.smartrefresh.header.flyrefresh.a.a(r4, r5)
            r13.setInterpolator(r4)
            com.scwang.smartrefresh.header.flyrefresh.FlyView r4 = r11.b
            float r5 = r4.getRotation()
            float[] r6 = new float[r1]
            r6[r14] = r5
            r6[r0] = r2
            java.lang.String r2 = "rotation"
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r4, r2, r6)
            android.view.animation.DecelerateInterpolator r4 = new android.view.animation.DecelerateInterpolator
            r4.<init>()
            r2.setInterpolator(r4)
            com.scwang.smartrefresh.header.flyrefresh.FlyView r4 = r11.b
            float r5 = r4.getRotationX()
            float[] r6 = new float[r1]
            r6[r14] = r5
            r5 = 1112014848(0x42480000, float:50.0)
            r6[r0] = r5
            java.lang.String r5 = "rotationX"
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r4, r5, r6)
            android.view.animation.DecelerateInterpolator r5 = new android.view.animation.DecelerateInterpolator
            r5.<init>()
            r4.setInterpolator(r5)
            android.animation.AnimatorSet r5 = new android.animation.AnimatorSet
            r5.<init>()
            r6 = 800(0x320, double:3.953E-321)
            r5.setDuration(r6)
            com.scwang.smartrefresh.header.flyrefresh.FlyView r6 = r11.b
            float r7 = r6.getScaleX()
            float[] r8 = new float[r1]
            r8[r14] = r7
            r7 = 1056964608(0x3f000000, float:0.5)
            r8[r0] = r7
            java.lang.String r9 = "scaleX"
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r6, r9, r8)
            com.scwang.smartrefresh.header.flyrefresh.FlyView r8 = r11.b
            float r9 = r8.getScaleY()
            float[] r10 = new float[r1]
            r10[r14] = r9
            r10[r0] = r7
            java.lang.String r7 = "scaleY"
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r8, r7, r10)
            r8 = 6
            android.animation.Animator[] r8 = new android.animation.Animator[r8]
            r8[r14] = r12
            r8[r0] = r13
            r8[r1] = r2
            r8[r3] = r4
            r12 = 4
            r8[r12] = r6
            r12 = 5
            r8[r12] = r7
            r5.playTogether(r8)
            r11.c = r5
            r5.start()
        L10a:
            return
    }

    @Override // com.scwang.smartrefresh.layout.header.FalsifyHeader
    public void j(float r1, int r2, int r3) {
            r0 = this;
            return
    }

    @Override // com.scwang.smartrefresh.layout.header.FalsifyHeader
    public boolean k() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            r0 = 0
            r1.b = r0
            r1.e = r0
            r1.f = r0
            return
    }

    @Override // com.scwang.smartrefresh.layout.header.FalsifyHeader
    public void q(l2.h r1, com.scwang.smartrefresh.layout.constant.RefreshState r2, com.scwang.smartrefresh.layout.constant.RefreshState r3) {
            r0 = this;
            return
    }

    @Override // com.scwang.smartrefresh.layout.header.FalsifyHeader
    @java.lang.Deprecated
    public void setPrimaryColors(@androidx.annotation.ColorInt int... r3) {
            r2 = this;
            int r0 = r3.length
            if (r0 <= 0) goto Ld
            com.scwang.smartrefresh.header.flyrefresh.MountanScenceView r0 = r2.d
            if (r0 == 0) goto Ld
            r1 = 0
            r3 = r3[r1]
            r0.setPrimaryColor(r3)
        Ld:
            return
    }

    public void setUpFlyView(com.scwang.smartrefresh.header.flyrefresh.FlyView r1) {
            r0 = this;
            r0.b = r1
            return
    }

    public void setUpMountanScenceView(com.scwang.smartrefresh.header.flyrefresh.MountanScenceView r1) {
            r0 = this;
            r0.d = r1
            return
    }

    @Override // com.scwang.smartrefresh.layout.header.FalsifyHeader
    public void t(l2.h r1, int r2, int r3) {
            r0 = this;
            return
    }

    @Override // com.scwang.smartrefresh.layout.header.FalsifyHeader
    public int w(l2.h r2, boolean r3) {
            r1 = this;
            boolean r0 = r1.h
            if (r0 == 0) goto L7
            r1.z()
        L7:
            int r2 = super.w(r2, r3)
            return r2
    }

    @Override // com.scwang.smartrefresh.layout.header.FalsifyHeader
    public void x(float r2, int r3, int r4, int r5) {
            r1 = this;
            if (r3 >= 0) goto L8
            int r2 = r1.i
            if (r2 <= 0) goto L2f
            r3 = 0
            r2 = 0
        L8:
            r1.i = r3
            r1.g = r2
            com.scwang.smartrefresh.header.flyrefresh.MountanScenceView r0 = r1.d
            if (r0 == 0) goto L18
            r0.d(r2)
            com.scwang.smartrefresh.header.flyrefresh.MountanScenceView r0 = r1.d
            r0.postInvalidate()
        L18:
            com.scwang.smartrefresh.header.flyrefresh.FlyView r0 = r1.b
            if (r0 == 0) goto L2f
            int r4 = r4 + r5
            r5 = -1036779520(0xffffffffc2340000, float:-45.0)
            if (r4 <= 0) goto L2a
            float r2 = (float) r3
            float r2 = r2 * r5
            float r3 = (float) r4
            float r2 = r2 / r3
            r0.setRotation(r2)
            return
        L2a:
            float r2 = r2 * r5
            r0.setRotation(r2)
        L2f:
            return
    }

    public void z() {
            r1 = this;
            r0 = 0
            r1.A(r0)
            return
    }
}
