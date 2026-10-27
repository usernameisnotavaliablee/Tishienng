package com.kwad.components.ad.nativead.d;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a extends com.kwad.sdk.widget.KSFrameLayout {
    private android.animation.Animator qc;
    private boolean qd;
    private android.widget.ImageView qe;
    private android.widget.ImageView qf;
    private android.widget.ImageView qg;




    public a(@androidx.annotation.NonNull android.content.Context r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.<init>(r3, r0, r1)
            return
    }

    private a(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r2 = 0
            r3 = 0
            r0.<init>(r1, r2, r3)
            r0.qd = r3
            r0.O(r1)
            return
    }

    private void O(@androidx.annotation.NonNull android.content.Context r3) {
            r2 = this;
            int r0 = com.kwad.sdk.R.layout.ksad_native_rotate_layout
            r1 = 1
            android.view.View r3 = com.kwad.sdk.o.m.a(r3, r0, r2, r1)
            int r0 = com.kwad.sdk.R.id.rotate_line
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r2.qg = r0
            int r0 = com.kwad.sdk.R.id.rotate_phone
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r2.qe = r0
            int r0 = com.kwad.sdk.R.id.rotate_alpha_phone
            android.view.View r3 = r3.findViewById(r0)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r2.qf = r3
            return
    }

    static /* synthetic */ boolean a(com.kwad.components.ad.nativead.d.a r0) {
            boolean r0 = r0.qd
            return r0
    }

    static /* synthetic */ android.animation.Animator b(com.kwad.components.ad.nativead.d.a r0) {
            android.animation.Animator r0 = r0.qc
            return r0
    }

    static /* synthetic */ android.view.View c(com.kwad.components.ad.nativead.d.a r0) {
            android.view.View r0 = r0.getAlphaView()
            return r0
    }

    static /* synthetic */ android.view.View d(com.kwad.components.ad.nativead.d.a r0) {
            android.view.View r0 = r0.getInteractionView()
            return r0
    }

    private android.animation.Animator fN() {
            r31 = this;
            r0 = r31
            android.view.View r1 = r0.getInteractionView()
            android.view.View r2 = r0.getAlphaView()
            if (r1 == 0) goto L280
            if (r2 != 0) goto L10
            goto L280
        L10:
            android.animation.AnimatorSet r3 = new android.animation.AnimatorSet
            r3.<init>()
            android.animation.AnimatorSet r4 = new android.animation.AnimatorSet
            r4.<init>()
            android.animation.AnimatorSet r4 = new android.animation.AnimatorSet
            r4.<init>()
            android.animation.AnimatorSet r5 = new android.animation.AnimatorSet
            r5.<init>()
            android.animation.AnimatorSet r6 = new android.animation.AnimatorSet
            r6.<init>()
            r7 = 0
            r2.setPivotX(r7)
            r2.setPivotY(r7)
            r7 = 2
            float[] r8 = new float[r7]
            r8 = {x0282: FILL_ARRAY_DATA , data: [0, 1106247680} // fill-array
            java.lang.String r9 = "rotationY"
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r1, r9, r8)
            r10 = 300(0x12c, double:1.48E-321)
            android.animation.ObjectAnimator r8 = r8.setDuration(r10)
            float[] r12 = new float[r7]
            r12 = {x028a: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            java.lang.String r13 = "alpha"
            android.animation.ObjectAnimator r12 = android.animation.ObjectAnimator.ofFloat(r2, r13, r12)
            r14 = 10
            android.animation.ObjectAnimator r12 = r12.setDuration(r14)
            r14 = 600(0x258, double:2.964E-321)
            r12.setStartDelay(r14)
            float[] r12 = new float[r7]
            r12 = {x0292: FILL_ARRAY_DATA , data: [0, 1063675494} // fill-array
            java.lang.String r14 = "scaleX"
            android.animation.ObjectAnimator r12 = android.animation.ObjectAnimator.ofFloat(r2, r14, r12)
            android.animation.ObjectAnimator r12 = r12.setDuration(r10)
            float[] r15 = new float[r7]
            r15 = {x029a: FILL_ARRAY_DATA , data: [1065353216, 1065353216} // fill-array
            java.lang.String r7 = "scaleY"
            android.animation.ObjectAnimator r15 = android.animation.ObjectAnimator.ofFloat(r2, r7, r15)
            android.animation.ObjectAnimator r15 = r15.setDuration(r10)
            r10 = 2
            float[] r11 = new float[r10]
            r11 = {x02a2: FILL_ARRAY_DATA , data: [1106247680, 0} // fill-array
            android.animation.ObjectAnimator r11 = android.animation.ObjectAnimator.ofFloat(r1, r9, r11)
            r18 = r5
            r19 = r6
            r5 = 300(0x12c, double:1.48E-321)
            android.animation.ObjectAnimator r11 = r11.setDuration(r5)
            float[] r5 = new float[r10]
            r5 = {x02aa: FILL_ARRAY_DATA , data: [1063675494, 0} // fill-array
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r2, r14, r5)
            r17 = r11
            r6 = r12
            r11 = 300(0x12c, double:1.48E-321)
            android.animation.ObjectAnimator r5 = r5.setDuration(r11)
            float[] r11 = new float[r10]
            r11 = {x02b2: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            android.animation.ObjectAnimator r11 = android.animation.ObjectAnimator.ofFloat(r1, r9, r11)
            r20 = r5
            r12 = r6
            r5 = 300(0x12c, double:1.48E-321)
            android.animation.ObjectAnimator r11 = r11.setDuration(r5)
            float[] r5 = new float[r10]
            r5 = {x02ba: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r2, r13, r5)
            r21 = r11
            r10 = 10
            android.animation.ObjectAnimator r5 = r5.setDuration(r10)
            r10 = 280(0x118, double:1.383E-321)
            r5.setStartDelay(r10)
            r6 = 2
            float[] r5 = new float[r6]
            r5 = {x02c2: FILL_ARRAY_DATA , data: [0, -1041235968} // fill-array
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r1, r9, r5)
            r10 = 300(0x12c, double:1.48E-321)
            android.animation.ObjectAnimator r5 = r5.setDuration(r10)
            float[] r10 = new float[r6]
            r10 = {x02ca: FILL_ARRAY_DATA , data: [1022739087, 1063675494} // fill-array
            android.animation.ObjectAnimator r10 = android.animation.ObjectAnimator.ofFloat(r2, r14, r10)
            r11 = r7
            r6 = 300(0x12c, double:1.48E-321)
            android.animation.ObjectAnimator r10 = r10.setDuration(r6)
            r10.setStartDelay(r6)
            r6 = 2
            float[] r7 = new float[r6]
            r7 = {x02d2: FILL_ARRAY_DATA , data: [-1041235968, 0} // fill-array
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r1, r9, r7)
            r22 = r8
            r8 = 300(0x12c, double:1.48E-321)
            android.animation.ObjectAnimator r7 = r7.setDuration(r8)
            float[] r8 = new float[r6]
            r8 = {x02da: FILL_ARRAY_DATA , data: [1063675494, 0} // fill-array
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r2, r14, r8)
            r23 = r10
            r9 = 300(0x12c, double:1.48E-321)
            android.animation.ObjectAnimator r8 = r8.setDuration(r9)
            float[] r9 = new float[r6]
            r9 = {x02e2: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            java.lang.String r10 = "rotation"
            android.animation.ObjectAnimator r9 = android.animation.ObjectAnimator.ofFloat(r1, r10, r9)
            r24 = r11
            r10 = 300(0x12c, double:1.48E-321)
            android.animation.ObjectAnimator r9 = r9.setDuration(r10)
            float[] r10 = new float[r6]
            r10 = {x02ea: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            android.animation.ObjectAnimator r10 = android.animation.ObjectAnimator.ofFloat(r2, r13, r10)
            r25 = r7
            r6 = 10
            android.animation.ObjectAnimator r10 = r10.setDuration(r6)
            r6 = 600(0x258, double:2.964E-321)
            r10.setStartDelay(r6)
            r6 = 2
            float[] r7 = new float[r6]
            r7 = {x02f2: FILL_ARRAY_DATA , data: [0, 1106247680} // fill-array
            java.lang.String r11 = "rotationX"
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r1, r11, r7)
            r26 = r8
            r27 = r9
            r8 = 300(0x12c, double:1.48E-321)
            android.animation.ObjectAnimator r7 = r7.setDuration(r8)
            float[] r8 = new float[r6]
            r8 = {x02fa: FILL_ARRAY_DATA , data: [-1082130432, -1082969293} // fill-array
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r2, r14, r8)
            r28 = r7
            r6 = 300(0x12c, double:1.48E-321)
            android.animation.ObjectAnimator r8 = r8.setDuration(r6)
            r8.setStartDelay(r6)
            r9 = 2
            float[] r6 = new float[r9]
            r6 = {x0302: FILL_ARRAY_DATA , data: [1017370378, 1063172178} // fill-array
            r7 = r24
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r2, r7, r6)
            r24 = r10
            r9 = 300(0x12c, double:1.48E-321)
            android.animation.ObjectAnimator r6 = r6.setDuration(r9)
            r6.setStartDelay(r9)
            r9 = 2
            float[] r10 = new float[r9]
            r10 = {x030a: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ObjectAnimator r10 = android.animation.ObjectAnimator.ofFloat(r2, r13, r10)
            r29 = r5
            r30 = r6
            r5 = 10
            r10.setDuration(r5)
            r6 = r3
            r10 = r4
            r5 = r24
            r3 = 280(0x118, double:1.383E-321)
            r5.setStartDelay(r3)
            float[] r3 = new float[r9]
            r3 = {x0312: FILL_ARRAY_DATA , data: [1106247680, 0} // fill-array
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r1, r11, r3)
            r4 = 300(0x12c, double:1.48E-321)
            android.animation.ObjectAnimator r3 = r3.setDuration(r4)
            float[] r4 = new float[r9]
            r4 = {x031a: FILL_ARRAY_DATA , data: [-1082969293, -1082130432} // fill-array
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r2, r14, r4)
            r14 = r6
            r5 = 300(0x12c, double:1.48E-321)
            android.animation.ObjectAnimator r4 = r4.setDuration(r5)
            float[] r5 = new float[r9]
            r5 = {x0322: FILL_ARRAY_DATA , data: [1063172178, 1017370378} // fill-array
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r2, r7, r5)
            r6 = 300(0x12c, double:1.48E-321)
            android.animation.ObjectAnimator r5 = r5.setDuration(r6)
            float[] r6 = new float[r9]
            r6 = {x032a: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofFloat(r1, r11, r6)
            r6 = 300(0x12c, double:1.48E-321)
            android.animation.ObjectAnimator r1 = r1.setDuration(r6)
            float[] r6 = new float[r9]
            r6 = {x0332: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r2, r13, r6)
            r7 = r10
            r9 = 10
            android.animation.ObjectAnimator r6 = r6.setDuration(r9)
            r16 = r12
            r11 = 600(0x258, double:2.964E-321)
            r6.setStartDelay(r11)
            r6 = 2
            float[] r11 = new float[r6]
            r11 = {x033a: FILL_ARRAY_DATA , data: [1065353216, 1065353216} // fill-array
            android.animation.ObjectAnimator r11 = android.animation.ObjectAnimator.ofFloat(r2, r13, r11)
            r11.setDuration(r9)
            r9 = 9
            android.animation.Animator[] r9 = new android.animation.Animator[r9]
            r10 = 0
            r9[r10] = r22
            r11 = 1
            r9[r11] = r17
            r9[r6] = r21
            r6 = 3
            r9[r6] = r29
            r12 = 4
            r9[r12] = r25
            r12 = 5
            r9[r12] = r27
            r12 = 6
            r9[r12] = r28
            r12 = 7
            r9[r12] = r3
            r3 = 8
            r9[r3] = r1
            r14.playSequentially(r9)
            r9 = 2
            android.animation.Animator[] r1 = new android.animation.Animator[r9]
            r1[r10] = r16
            r1[r11] = r20
            r7.playSequentially(r1)
            android.animation.Animator[] r1 = new android.animation.Animator[r11]
            r1[r10] = r15
            r3 = r18
            r3.playSequentially(r1)
            android.animation.Animator[] r1 = new android.animation.Animator[r6]
            r1[r10] = r14
            r1[r11] = r7
            r1[r9] = r3
            r3 = r19
            r3.playTogether(r1)
            android.animation.AnimatorSet r1 = new android.animation.AnimatorSet
            r1.<init>()
            android.animation.Animator[] r6 = new android.animation.Animator[r9]
            r6[r10] = r23
            r6[r11] = r26
            r1.playSequentially(r6)
            com.kwad.components.ad.nativead.d.a$2 r6 = new com.kwad.components.ad.nativead.d.a$2
            r6.<init>(r0, r2, r1)
            r1 = r20
            r1.addListener(r6)
            android.animation.AnimatorSet r1 = new android.animation.AnimatorSet
            r1.<init>()
            android.animation.Animator[] r6 = new android.animation.Animator[r9]
            r6[r10] = r30
            r6[r11] = r5
            r1.playSequentially(r6)
            android.animation.AnimatorSet r5 = new android.animation.AnimatorSet
            r5.<init>()
            android.animation.Animator[] r6 = new android.animation.Animator[r9]
            r6[r10] = r8
            r6[r11] = r4
            r5.playSequentially(r6)
            android.animation.AnimatorSet r4 = new android.animation.AnimatorSet
            r4.<init>()
            android.animation.Animator[] r6 = new android.animation.Animator[r9]
            r6[r10] = r1
            r6[r11] = r5
            r4.playTogether(r6)
            com.kwad.components.ad.nativead.d.a$3 r1 = new com.kwad.components.ad.nativead.d.a$3
            r1.<init>(r0, r2, r4)
            r2 = r26
            r2.addListener(r1)
            return r3
        L280:
            r1 = 0
            return r1
    }

    private android.view.View getAlphaView() {
            r1 = this;
            android.widget.ImageView r0 = r1.qf
            return r0
    }

    private android.view.View getInteractionView() {
            r1 = this;
            android.widget.ImageView r0 = r1.qe
            return r0
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout
    public final void aa() {
            r0 = this;
            super.aa()
            return
    }

    @androidx.annotation.MainThread
    public final void fM() {
            r2 = this;
            android.animation.Animator r0 = r2.qc
            if (r0 == 0) goto La
            r0.cancel()
            r0 = 0
            r2.qc = r0
        La:
            android.animation.Animator r0 = r2.fN()
            r2.qc = r0
            if (r0 == 0) goto L1f
            com.kwad.components.ad.nativead.d.a$1 r1 = new com.kwad.components.ad.nativead.d.a$1
            r1.<init>(r2)
            r0.addListener(r1)
            android.animation.Animator r0 = r2.qc
            r0.start()
        L1f:
            return
    }

    protected final int getAnimationDelayTime() {
            r1 = this;
            r0 = 500(0x1f4, float:7.0E-43)
            return r0
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean r7, int r8, int r9, int r10, int r11) {
            r6 = this;
            super.onLayout(r7, r8, r9, r10, r11)
            r7 = r6
            r6.getChildCount()     // Catch: java.lang.Throwable -> L28
            int r10 = r10 - r8
            r8 = 2
            int r10 = r10 / r8
            int r11 = r11 - r9
            int r11 = r11 / r8
            r9 = 0
            android.view.View r0 = r6.getChildAt(r9)     // Catch: java.lang.Throwable -> L28
            boolean r1 = r0 instanceof android.widget.FrameLayout     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L7d
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0     // Catch: java.lang.Throwable -> L28
            r0.getChildCount()     // Catch: java.lang.Throwable -> L28
            android.view.View r1 = r0.getChildAt(r9)     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L2b
            int r9 = r1.getMeasuredWidth()     // Catch: java.lang.Throwable -> L28
            r1.getMeasuredHeight()     // Catch: java.lang.Throwable -> L28
            goto L2b
        L28:
            r0 = move-exception
            r8 = r0
            goto L7e
        L2b:
            int r9 = r9 / 100
            r1 = 1
            android.view.View r1 = r0.getChildAt(r1)     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L4a
            r1.getMeasuredWidth()     // Catch: java.lang.Throwable -> L28
            r1.getMeasuredHeight()     // Catch: java.lang.Throwable -> L28
            int r2 = r9 * 40
            int r3 = r10 - r2
            int r4 = r9 * 30
            int r4 = r11 - r4
            int r2 = r2 + r10
            int r5 = r9 * 10
            int r5 = r11 - r5
            r1.layout(r3, r4, r2, r5)     // Catch: java.lang.Throwable -> L28
        L4a:
            android.view.View r8 = r0.getChildAt(r8)     // Catch: java.lang.Throwable -> L28
            if (r8 == 0) goto L63
            r8.getMeasuredWidth()     // Catch: java.lang.Throwable -> L28
            r8.getMeasuredHeight()     // Catch: java.lang.Throwable -> L28
            int r1 = r9 * 14
            int r2 = r10 - r1
            int r3 = r11 - r1
            int r1 = r1 + r10
            int r4 = r9 * 30
            int r4 = r4 + r11
            r8.layout(r2, r3, r1, r4)     // Catch: java.lang.Throwable -> L28
        L63:
            r8 = 3
            android.view.View r8 = r0.getChildAt(r8)     // Catch: java.lang.Throwable -> L28
            if (r8 == 0) goto L7d
            r8.getMeasuredWidth()     // Catch: java.lang.Throwable -> L28
            r8.getMeasuredHeight()     // Catch: java.lang.Throwable -> L28
            int r0 = r9 * 14
            int r1 = r10 - r0
            int r2 = r11 - r0
            int r10 = r10 + r0
            int r9 = r9 * 30
            int r11 = r11 + r9
            r8.layout(r1, r2, r10, r11)     // Catch: java.lang.Throwable -> L28
        L7d:
            return
        L7e:
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r8)
            return
    }
}
