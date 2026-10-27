package com.kwad.components.ad.splashscreen.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class KsSlideHandView extends com.kwad.components.ad.splashscreen.widget.c {
    private android.widget.ImageView KA;
    private android.widget.ImageView KB;
    private android.widget.ImageView KC;
    private android.widget.ImageView Kx;
    private android.widget.ImageView Ky;
    private android.widget.ImageView Kz;

    public KsSlideHandView(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public KsSlideHandView(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public KsSlideHandView(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // com.kwad.components.ad.splashscreen.widget.c
    protected final void a(@androidx.annotation.NonNull android.content.Context r6, @androidx.annotation.Nullable android.util.AttributeSet r7, int r8) {
            r5 = this;
            android.widget.ImageView r7 = new android.widget.ImageView
            r7.<init>(r6)
            r5.Ky = r7
            android.widget.FrameLayout$LayoutParams r7 = new android.widget.FrameLayout$LayoutParams
            r8 = 1129185280(0x434e0000, float:206.0)
            int r0 = com.kwad.sdk.c.a.a.a(r6, r8)
            r1 = 1123024896(0x42f00000, float:120.0)
            int r2 = com.kwad.sdk.c.a.a.a(r6, r1)
            r7.<init>(r0, r2)
            android.widget.ImageView r0 = r5.Ky
            int r2 = com.kwad.sdk.R.drawable.ksad_splash_base_arrows
            r0.setImageResource(r2)
            r0 = 17
            r7.gravity = r0
            android.widget.ImageView r2 = r5.Ky
            r5.addView(r2, r7)
            android.widget.ImageView r7 = new android.widget.ImageView
            r7.<init>(r6)
            r5.KB = r7
            android.widget.FrameLayout$LayoutParams r7 = new android.widget.FrameLayout$LayoutParams
            int r2 = com.kwad.sdk.c.a.a.a(r6, r8)
            int r3 = com.kwad.sdk.c.a.a.a(r6, r1)
            r7.<init>(r2, r3)
            android.widget.ImageView r2 = r5.KB
            int r3 = com.kwad.sdk.R.drawable.ksad_splash_up_highlight_arrow
            r2.setImageResource(r3)
            android.widget.ImageView r2 = r5.KB
            r3 = 0
            r2.setAlpha(r3)
            r7.gravity = r0
            android.widget.ImageView r2 = r5.KB
            r5.addView(r2, r7)
            android.widget.ImageView r7 = new android.widget.ImageView
            r7.<init>(r6)
            r5.KA = r7
            android.widget.FrameLayout$LayoutParams r7 = new android.widget.FrameLayout$LayoutParams
            int r2 = com.kwad.sdk.c.a.a.a(r6, r8)
            int r4 = com.kwad.sdk.c.a.a.a(r6, r1)
            r7.<init>(r2, r4)
            android.widget.ImageView r2 = r5.KA
            int r4 = com.kwad.sdk.R.drawable.ksad_splash_right_highlight_arrow
            r2.setImageResource(r4)
            android.widget.ImageView r2 = r5.KA
            r2.setAlpha(r3)
            r7.gravity = r0
            android.widget.ImageView r2 = r5.KA
            r5.addView(r2, r7)
            android.widget.ImageView r7 = new android.widget.ImageView
            r7.<init>(r6)
            r5.KC = r7
            android.widget.FrameLayout$LayoutParams r7 = new android.widget.FrameLayout$LayoutParams
            int r2 = com.kwad.sdk.c.a.a.a(r6, r8)
            int r4 = com.kwad.sdk.c.a.a.a(r6, r1)
            r7.<init>(r2, r4)
            android.widget.ImageView r2 = r5.KC
            int r4 = com.kwad.sdk.R.drawable.ksad_splash_down_highlight_arrow
            r2.setImageResource(r4)
            android.widget.ImageView r2 = r5.KC
            r2.setAlpha(r3)
            r7.gravity = r0
            android.widget.ImageView r2 = r5.KC
            r5.addView(r2, r7)
            android.widget.ImageView r7 = new android.widget.ImageView
            r7.<init>(r6)
            r5.Kz = r7
            android.widget.FrameLayout$LayoutParams r7 = new android.widget.FrameLayout$LayoutParams
            int r8 = com.kwad.sdk.c.a.a.a(r6, r8)
            int r1 = com.kwad.sdk.c.a.a.a(r6, r1)
            r7.<init>(r8, r1)
            android.widget.ImageView r8 = r5.Kz
            int r1 = com.kwad.sdk.R.drawable.ksad_splash_left_highlight_arrow
            r8.setImageResource(r1)
            android.widget.ImageView r8 = r5.Kz
            r8.setAlpha(r3)
            r7.gravity = r0
            android.widget.ImageView r8 = r5.Kz
            r5.addView(r8, r7)
            android.widget.ImageView r7 = new android.widget.ImageView
            r7.<init>(r6)
            r5.Kx = r7
            android.widget.FrameLayout$LayoutParams r7 = new android.widget.FrameLayout$LayoutParams
            r8 = 1120403456(0x42c80000, float:100.0)
            int r8 = com.kwad.sdk.c.a.a.a(r6, r8)
            r0 = 1126301696(0x43220000, float:162.0)
            int r0 = com.kwad.sdk.c.a.a.a(r6, r0)
            r7.<init>(r8, r0)
            android.widget.ImageView r8 = r5.Kx
            int r0 = com.kwad.sdk.R.drawable.ksad_splash_slide_animation_hand
            r8.setImageResource(r0)
            r8 = 1125449728(0x43150000, float:149.0)
            int r8 = com.kwad.sdk.c.a.a.a(r6, r8)
            r7.leftMargin = r8
            r8 = -1047003136(0xffffffffc1980000, float:-19.0)
            int r6 = com.kwad.sdk.c.a.a.a(r6, r8)
            r7.bottomMargin = r6
            r6 = 83
            r7.gravity = r6
            android.widget.ImageView r6 = r5.Kx
            r5.addView(r6, r7)
            return
    }

    @Override // com.kwad.components.ad.splashscreen.widget.c
    protected final android.animation.Animator fN() {
            r39 = this;
            r0 = r39
            android.animation.AnimatorSet r1 = new android.animation.AnimatorSet
            r1.<init>()
            android.widget.ImageView r2 = r0.Kx
            r3 = 2
            float[] r4 = new float[r3]
            r4 = {x03c2: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            java.lang.String r5 = "alpha"
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r2, r5, r4)
            r6 = 50
            android.animation.ObjectAnimator r2 = r2.setDuration(r6)
            android.widget.ImageView r4 = r0.Kx
            float[] r8 = new float[r3]
            r8 = {x03ca: FILL_ARRAY_DATA , data: [1065353216, 1065353216} // fill-array
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r4, r5, r8)
            r8 = 100
            android.animation.ObjectAnimator r4 = r4.setDuration(r8)
            android.widget.ImageView r10 = r0.KB
            float[] r11 = new float[r3]
            r11 = {x03d2: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ObjectAnimator r10 = android.animation.ObjectAnimator.ofFloat(r10, r5, r11)
            r11 = 450(0x1c2, double:2.223E-321)
            android.animation.ObjectAnimator r10 = r10.setDuration(r11)
            android.widget.ImageView r13 = r0.Kx
            android.content.Context r14 = r0.getContext()
            r15 = -1030619136(0xffffffffc2920000, float:-73.0)
            int r14 = com.kwad.sdk.c.a.a.a(r14, r15)
            float r14 = (float) r14
            r15 = 1
            float[] r6 = new float[r15]
            r7 = 0
            r6[r7] = r14
            java.lang.String r14 = "translationY"
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r13, r14, r6)
            android.animation.ObjectAnimator r6 = r6.setDuration(r11)
            android.widget.ImageView r13 = r0.KB
            r16 = 0
            float[] r7 = new float[r3]
            r7 = {x03da: FILL_ARRAY_DATA , data: [1065353216, 1065353216} // fill-array
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r13, r5, r7)
            android.animation.ObjectAnimator r7 = r7.setDuration(r8)
            android.widget.ImageView r13 = r0.KB
            float[] r8 = new float[r3]
            r8 = {x03e2: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r13, r5, r8)
            android.animation.ObjectAnimator r8 = r8.setDuration(r11)
            android.widget.ImageView r9 = r0.Kx
            float[] r13 = new float[r3]
            r13 = {x03ea: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            android.animation.ObjectAnimator r9 = android.animation.ObjectAnimator.ofFloat(r9, r5, r13)
            android.animation.ObjectAnimator r9 = r9.setDuration(r11)
            android.widget.ImageView r13 = r0.Kx
            android.content.Context r11 = r0.getContext()
            r12 = 0
            int r11 = com.kwad.sdk.c.a.a.a(r11, r12)
            float r11 = (float) r11
            float[] r12 = new float[r15]
            r12[r16] = r11
            android.animation.ObjectAnimator r11 = android.animation.ObjectAnimator.ofFloat(r13, r14, r12)
            r12 = 50
            android.animation.ObjectAnimator r11 = r11.setDuration(r12)
            android.widget.ImageView r12 = r0.Kx
            float[] r13 = new float[r3]
            r13 = {x03f2: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ObjectAnimator r12 = android.animation.ObjectAnimator.ofFloat(r12, r5, r13)
            r19 = r4
            r3 = 100
            android.animation.ObjectAnimator r12 = r12.setDuration(r3)
            android.widget.ImageView r13 = r0.Kx
            r15 = 2
            float[] r3 = new float[r15]
            r3 = {x03fa: FILL_ARRAY_DATA , data: [1065353216, 1065353216} // fill-array
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r13, r5, r3)
            r4 = r12
            r12 = 100
            android.animation.ObjectAnimator r3 = r3.setDuration(r12)
            android.widget.ImageView r12 = r0.KA
            float[] r13 = new float[r15]
            r15 = r13
            r15 = {x0402: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ObjectAnimator r12 = android.animation.ObjectAnimator.ofFloat(r12, r5, r15)
            r15 = r14
            r13 = 450(0x1c2, double:2.223E-321)
            android.animation.ObjectAnimator r12 = r12.setDuration(r13)
            android.widget.ImageView r13 = r0.Kx
            android.content.Context r14 = r0.getContext()
            r21 = r4
            r4 = 1118437376(0x42aa0000, float:85.0)
            int r4 = com.kwad.sdk.c.a.a.a(r14, r4)
            float r4 = (float) r4
            r22 = r4
            r14 = 1
            float[] r4 = new float[r14]
            r4[r16] = r22
            java.lang.String r14 = "translationX"
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r13, r14, r4)
            r22 = r12
            r12 = 450(0x1c2, double:2.223E-321)
            android.animation.ObjectAnimator r4 = r4.setDuration(r12)
            android.widget.ImageView r12 = r0.KA
            r20 = r15
            r13 = 2
            float[] r15 = new float[r13]
            r15 = {x040a: FILL_ARRAY_DATA , data: [1065353216, 1065353216} // fill-array
            android.animation.ObjectAnimator r12 = android.animation.ObjectAnimator.ofFloat(r12, r5, r15)
            r15 = r14
            r13 = 100
            android.animation.ObjectAnimator r12 = r12.setDuration(r13)
            android.widget.ImageView r13 = r0.KA
            r23 = r15
            r14 = 2
            float[] r15 = new float[r14]
            r15 = {x0412: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            android.animation.ObjectAnimator r13 = android.animation.ObjectAnimator.ofFloat(r13, r5, r15)
            r14 = 450(0x1c2, double:2.223E-321)
            android.animation.ObjectAnimator r13 = r13.setDuration(r14)
            android.widget.ImageView r14 = r0.Kx
            r24 = r13
            r15 = 2
            float[] r13 = new float[r15]
            r13 = {x041a: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            android.animation.ObjectAnimator r13 = android.animation.ObjectAnimator.ofFloat(r14, r5, r13)
            r14 = 450(0x1c2, double:2.223E-321)
            android.animation.ObjectAnimator r13 = r13.setDuration(r14)
            android.widget.ImageView r14 = r0.Kx
            android.content.Context r15 = r0.getContext()
            r26 = r13
            r13 = 0
            int r15 = com.kwad.sdk.c.a.a.a(r15, r13)
            float r13 = (float) r15
            r27 = r13
            r15 = 1
            float[] r13 = new float[r15]
            r13[r16] = r27
            r15 = r23
            android.animation.ObjectAnimator r13 = android.animation.ObjectAnimator.ofFloat(r14, r15, r13)
            r14 = r3
            r23 = r4
            r3 = 50
            android.animation.ObjectAnimator r13 = r13.setDuration(r3)
            android.widget.ImageView r3 = r0.Kx
            r25 = r13
            r4 = 2
            float[] r13 = new float[r4]
            r13 = {x0422: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r3, r5, r13)
            r27 = r5
            r4 = 100
            android.animation.ObjectAnimator r3 = r3.setDuration(r4)
            android.widget.ImageView r13 = r0.Kx
            r4 = 2
            float[] r5 = new float[r4]
            r5 = {x042a: FILL_ARRAY_DATA , data: [1065353216, 1065353216} // fill-array
            r4 = r27
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r13, r4, r5)
            r27 = r14
            r13 = 100
            android.animation.ObjectAnimator r5 = r5.setDuration(r13)
            android.widget.ImageView r14 = r0.KC
            r28 = r5
            r13 = 2
            float[] r5 = new float[r13]
            r13 = r24
            r31 = r25
            r24 = r3
            r3 = r26
            r5 = {x0432: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r14, r4, r5)
            r25 = r13
            r13 = 450(0x1c2, double:2.223E-321)
            android.animation.ObjectAnimator r5 = r5.setDuration(r13)
            android.widget.ImageView r13 = r0.Kx
            android.content.Context r14 = r0.getContext()
            r26 = r5
            r5 = 1114636288(0x42700000, float:60.0)
            int r5 = com.kwad.sdk.c.a.a.a(r14, r5)
            float r5 = (float) r5
            r29 = r5
            r14 = 1
            float[] r5 = new float[r14]
            r5[r16] = r29
            r14 = r20
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r13, r14, r5)
            r20 = r12
            r12 = 450(0x1c2, double:2.223E-321)
            android.animation.ObjectAnimator r5 = r5.setDuration(r12)
            android.widget.ImageView r12 = r0.KC
            r29 = r5
            r13 = 2
            float[] r5 = new float[r13]
            r5 = {x043a: FILL_ARRAY_DATA , data: [1065353216, 1065353216} // fill-array
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r12, r4, r5)
            r12 = r14
            r13 = 100
            android.animation.ObjectAnimator r5 = r5.setDuration(r13)
            android.widget.ImageView r13 = r0.KC
            r30 = r12
            r14 = 2
            float[] r12 = new float[r14]
            r12 = {x0442: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            android.animation.ObjectAnimator r12 = android.animation.ObjectAnimator.ofFloat(r13, r4, r12)
            r13 = r15
            r14 = 450(0x1c2, double:2.223E-321)
            android.animation.ObjectAnimator r12 = r12.setDuration(r14)
            android.widget.ImageView r14 = r0.Kx
            r32 = r13
            r15 = 2
            float[] r13 = new float[r15]
            r13 = {x044a: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            android.animation.ObjectAnimator r13 = android.animation.ObjectAnimator.ofFloat(r14, r4, r13)
            r14 = 450(0x1c2, double:2.223E-321)
            android.animation.ObjectAnimator r13 = r13.setDuration(r14)
            android.widget.ImageView r14 = r0.Kx
            android.content.Context r15 = r0.getContext()
            r34 = r13
            r13 = 0
            int r15 = com.kwad.sdk.c.a.a.a(r15, r13)
            float r13 = (float) r15
            r35 = r13
            r15 = 1
            float[] r13 = new float[r15]
            r13[r16] = r35
            r15 = r30
            android.animation.ObjectAnimator r13 = android.animation.ObjectAnimator.ofFloat(r14, r15, r13)
            r14 = 50
            android.animation.ObjectAnimator r13 = r13.setDuration(r14)
            android.widget.ImageView r14 = r0.Kx
            r30 = r13
            r15 = 2
            float[] r13 = new float[r15]
            r13 = {x0452: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ObjectAnimator r13 = android.animation.ObjectAnimator.ofFloat(r14, r4, r13)
            r14 = r2
            r33 = r3
            r2 = 100
            android.animation.ObjectAnimator r13 = r13.setDuration(r2)
            android.widget.ImageView r2 = r0.Kx
            float[] r3 = new float[r15]
            r3 = {x045a: FILL_ARRAY_DATA , data: [1065353216, 1065353216} // fill-array
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r2, r4, r3)
            r35 = r13
            r3 = r14
            r13 = 100
            android.animation.ObjectAnimator r2 = r2.setDuration(r13)
            android.widget.ImageView r13 = r0.Kz
            float[] r14 = new float[r15]
            r14 = {x0462: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ObjectAnimator r13 = android.animation.ObjectAnimator.ofFloat(r13, r4, r14)
            r14 = 450(0x1c2, double:2.223E-321)
            android.animation.ObjectAnimator r13 = r13.setDuration(r14)
            android.widget.ImageView r14 = r0.Kx
            android.content.Context r15 = r0.getContext()
            r37 = r3
            r3 = -1024458752(0xffffffffc2f00000, float:-120.0)
            int r3 = com.kwad.sdk.c.a.a.a(r15, r3)
            float r3 = (float) r3
            r38 = r3
            r15 = 1
            float[] r3 = new float[r15]
            r3[r16] = r38
            r15 = r32
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r14, r15, r3)
            r32 = r13
            r13 = 450(0x1c2, double:2.223E-321)
            android.animation.ObjectAnimator r3 = r3.setDuration(r13)
            android.widget.ImageView r13 = r0.Kz
            r36 = r3
            r14 = 2
            float[] r3 = new float[r14]
            r3 = {x046a: FILL_ARRAY_DATA , data: [1065353216, 1065353216} // fill-array
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r13, r4, r3)
            r13 = r15
            r14 = 100
            android.animation.ObjectAnimator r3 = r3.setDuration(r14)
            android.widget.ImageView r14 = r0.Kz
            r17 = r13
            r15 = 2
            float[] r13 = new float[r15]
            r13 = {x0472: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            android.animation.ObjectAnimator r13 = android.animation.ObjectAnimator.ofFloat(r14, r4, r13)
            r14 = r2
            r18 = r3
            r2 = 450(0x1c2, double:2.223E-321)
            android.animation.ObjectAnimator r13 = r13.setDuration(r2)
            android.widget.ImageView r2 = r0.Kx
            float[] r3 = new float[r15]
            r3 = {x047a: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r2, r4, r3)
            r3 = 450(0x1c2, double:2.223E-321)
            android.animation.ObjectAnimator r2 = r2.setDuration(r3)
            android.widget.ImageView r3 = r0.Kx
            android.content.Context r4 = r0.getContext()
            r15 = 0
            int r4 = com.kwad.sdk.c.a.a.a(r4, r15)
            float r4 = (float) r4
            r15 = 1
            float[] r15 = new float[r15]
            r15[r16] = r4
            r4 = r17
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r3, r4, r15)
            r4 = r14
            r14 = 50
            android.animation.ObjectAnimator r3 = r3.setDuration(r14)
            r14 = r19
            android.animation.AnimatorSet$Builder r14 = r1.play(r14)
            r14.before(r10)
            android.animation.AnimatorSet$Builder r10 = r1.play(r10)
            android.animation.AnimatorSet$Builder r6 = r10.with(r6)
            android.animation.AnimatorSet$Builder r6 = r6.before(r7)
            r6.before(r8)
            android.animation.AnimatorSet$Builder r6 = r1.play(r8)
            android.animation.AnimatorSet$Builder r6 = r6.with(r9)
            r6.before(r11)
            android.animation.AnimatorSet$Builder r6 = r1.play(r11)
            r14 = r37
            android.animation.AnimatorSet$Builder r6 = r6.with(r14)
            r7 = r21
            android.animation.AnimatorSet$Builder r6 = r6.before(r7)
            r7 = r27
            android.animation.AnimatorSet$Builder r6 = r6.before(r7)
            r7 = r22
            r6.before(r7)
            android.animation.AnimatorSet$Builder r6 = r1.play(r7)
            r7 = r23
            android.animation.AnimatorSet$Builder r6 = r6.with(r7)
            r7 = r20
            android.animation.AnimatorSet$Builder r6 = r6.before(r7)
            r7 = r25
            r6.before(r7)
            android.animation.AnimatorSet$Builder r6 = r1.play(r7)
            r7 = r33
            android.animation.AnimatorSet$Builder r6 = r6.with(r7)
            r7 = r31
            r6.before(r7)
            android.animation.AnimatorSet$Builder r6 = r1.play(r7)
            android.animation.AnimatorSet$Builder r6 = r6.with(r14)
            r7 = r24
            android.animation.AnimatorSet$Builder r6 = r6.before(r7)
            r7 = r28
            android.animation.AnimatorSet$Builder r6 = r6.before(r7)
            r7 = r26
            r6.before(r7)
            android.animation.AnimatorSet$Builder r6 = r1.play(r7)
            r7 = r29
            android.animation.AnimatorSet$Builder r6 = r6.with(r7)
            android.animation.AnimatorSet$Builder r5 = r6.before(r5)
            r5.before(r12)
            android.animation.AnimatorSet$Builder r5 = r1.play(r12)
            r6 = r34
            android.animation.AnimatorSet$Builder r5 = r5.with(r6)
            r6 = r30
            r5.before(r6)
            android.animation.AnimatorSet$Builder r5 = r1.play(r6)
            android.animation.AnimatorSet$Builder r5 = r5.with(r14)
            r6 = r35
            android.animation.AnimatorSet$Builder r5 = r5.before(r6)
            android.animation.AnimatorSet$Builder r4 = r5.before(r4)
            r5 = r32
            r4.before(r5)
            android.animation.AnimatorSet$Builder r4 = r1.play(r5)
            r5 = r36
            android.animation.AnimatorSet$Builder r4 = r4.with(r5)
            r5 = r18
            android.animation.AnimatorSet$Builder r4 = r4.before(r5)
            r4.before(r13)
            android.animation.AnimatorSet$Builder r4 = r1.play(r13)
            android.animation.AnimatorSet$Builder r2 = r4.with(r2)
            r2.before(r3)
            android.animation.AnimatorSet$Builder r2 = r1.play(r3)
            r2.with(r14)
            return r1
    }

    @Override // com.kwad.components.ad.splashscreen.widget.c
    protected int getAnimationDelayTime() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.kwad.components.ad.splashscreen.widget.c
    protected android.view.View getInteractionView() {
            r0 = this;
            return r0
    }

    @Override // com.kwad.components.ad.splashscreen.widget.c
    protected final void nu() {
            r0 = this;
            return
    }

    @Override // com.kwad.components.ad.splashscreen.widget.c
    protected final void nv() {
            r2 = this;
            android.widget.ImageView r0 = r2.Ky
            r1 = 0
            r0.setAlpha(r1)
            android.widget.ImageView r0 = r2.KB
            r0.setAlpha(r1)
            android.widget.ImageView r0 = r2.KA
            r0.setAlpha(r1)
            android.widget.ImageView r0 = r2.KC
            r0.setAlpha(r1)
            android.widget.ImageView r0 = r2.Kz
            r0.setAlpha(r1)
            android.widget.ImageView r0 = r2.Kx
            r0.setAlpha(r1)
            return
    }
}
