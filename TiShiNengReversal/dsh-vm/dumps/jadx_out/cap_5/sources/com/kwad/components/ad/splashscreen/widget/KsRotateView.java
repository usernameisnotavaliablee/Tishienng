package com.kwad.components.ad.splashscreen.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class KsRotateView extends com.kwad.components.ad.splashscreen.widget.c {
    private static int Ke = 50;
    private static int Kf = -12;
    private static int Kg = -25;
    private static int Kh = 12;
    private static int Ki = 25;

    @androidx.annotation.DrawableRes
    private int Kd;
    private android.widget.ImageView ig;
    private android.widget.ImageView qg;

    static {
            return
    }

    public KsRotateView(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public KsRotateView(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public KsRotateView(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // com.kwad.components.ad.splashscreen.widget.c
    protected final void a(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.Nullable android.util.AttributeSet r4, int r5) {
            r2 = this;
            int[] r0 = com.kwad.sdk.R.styleable.ksad_KsShakeView
            r1 = 0
            android.content.res.TypedArray r4 = r3.obtainStyledAttributes(r4, r0, r5, r1)
            int r5 = com.kwad.sdk.R.styleable.ksad_KsShakeView_ksad_shakeIcon
            int r0 = com.kwad.sdk.R.drawable.ksad_ic_rotate_phone
            int r5 = r4.getResourceId(r5, r0)
            r2.Kd = r5
            r4.recycle()
            android.widget.ImageView r4 = new android.widget.ImageView
            android.content.Context r5 = r2.getContext()
            r4.<init>(r5)
            r2.qg = r4
            int r5 = com.kwad.sdk.R.drawable.ksad_ic_rotate_line
            r4.setImageResource(r5)
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r5 = -2
            r4.<init>(r5, r5)
            r0 = 49
            r4.gravity = r0
            android.widget.ImageView r0 = r2.qg
            r2.addView(r0, r4)
            android.widget.ImageView r4 = new android.widget.ImageView
            android.content.Context r0 = r2.getContext()
            r4.<init>(r0)
            r2.ig = r4
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r4.<init>(r5, r5)
            r5 = 1102053376(0x41b00000, float:22.0)
            int r3 = com.kwad.sdk.c.a.a.a(r3, r5)
            r4.topMargin = r3
            r3 = 1
            r4.gravity = r3
            android.widget.ImageView r3 = r2.ig
            r2.addView(r3, r4)
            return
    }

    @Override // com.kwad.components.ad.splashscreen.widget.c
    protected final android.animation.Animator fN() {
            r23 = this;
            android.view.View r0 = r23.getInteractionView()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            android.animation.AnimatorSet r1 = new android.animation.AnimatorSet
            r1.<init>()
            int r2 = r0.getWidth()
            float r2 = (float) r2
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            r0.setPivotX(r2)
            int r2 = r0.getHeight()
            float r2 = (float) r2
            float r2 = r2 / r3
            r0.setPivotY(r2)
            int r2 = com.kwad.components.ad.splashscreen.widget.KsRotateView.Kg
            float r2 = (float) r2
            r3 = 2
            float[] r4 = new float[r3]
            r5 = 0
            r6 = 0
            r4[r5] = r6
            r7 = 1
            r4[r7] = r2
            java.lang.String r2 = "rotation"
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r0, r2, r4)
            r8 = 500(0x1f4, double:2.47E-321)
            android.animation.ObjectAnimator r4 = r4.setDuration(r8)
            float[] r10 = new float[r3]
            r10 = {x018c: FILL_ARRAY_DATA , data: [1065353216, 1065353216} // fill-array
            java.lang.String r11 = "alpha"
            android.animation.ObjectAnimator r10 = android.animation.ObjectAnimator.ofFloat(r0, r11, r10)
            r12 = 340(0x154, double:1.68E-321)
            r10.setDuration(r12)
            int r14 = com.kwad.components.ad.splashscreen.widget.KsRotateView.Kg
            float r14 = (float) r14
            float[] r15 = new float[r3]
            r15[r5] = r14
            r15[r7] = r6
            android.animation.ObjectAnimator r14 = android.animation.ObjectAnimator.ofFloat(r0, r2, r15)
            int r15 = com.kwad.components.ad.splashscreen.widget.KsRotateView.Ke
            r16 = 0
            r17 = 0
            long r5 = (long) r15
            android.animation.ObjectAnimator r5 = r14.setDuration(r5)
            int r6 = com.kwad.components.ad.splashscreen.widget.KsRotateView.Kh
            float r6 = (float) r6
            float[] r14 = new float[r3]
            r14[r16] = r17
            r14[r7] = r6
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r0, r2, r14)
            int r14 = com.kwad.components.ad.splashscreen.widget.KsRotateView.Ke
            long r14 = (long) r14
            android.animation.ObjectAnimator r6 = r6.setDuration(r14)
            int r14 = com.kwad.components.ad.splashscreen.widget.KsRotateView.Kh
            float r14 = (float) r14
            float[] r15 = new float[r3]
            r15[r16] = r14
            r15[r7] = r17
            android.animation.ObjectAnimator r14 = android.animation.ObjectAnimator.ofFloat(r0, r2, r15)
            int r15 = com.kwad.components.ad.splashscreen.widget.KsRotateView.Ke
            long r12 = (long) r15
            android.animation.ObjectAnimator r12 = r14.setDuration(r12)
            int r13 = com.kwad.components.ad.splashscreen.widget.KsRotateView.Kf
            float r13 = (float) r13
            float[] r14 = new float[r3]
            r14[r16] = r17
            r14[r7] = r13
            android.animation.ObjectAnimator r13 = android.animation.ObjectAnimator.ofFloat(r0, r2, r14)
            int r14 = com.kwad.components.ad.splashscreen.widget.KsRotateView.Ke
            long r14 = (long) r14
            android.animation.ObjectAnimator r13 = r13.setDuration(r14)
            int r14 = com.kwad.components.ad.splashscreen.widget.KsRotateView.Kf
            float r14 = (float) r14
            float[] r15 = new float[r3]
            r15[r16] = r14
            r15[r7] = r17
            android.animation.ObjectAnimator r14 = android.animation.ObjectAnimator.ofFloat(r0, r2, r15)
            int r15 = com.kwad.components.ad.splashscreen.widget.KsRotateView.Ke
            r20 = 1
            long r7 = (long) r15
            android.animation.ObjectAnimator r7 = r14.setDuration(r7)
            float[] r8 = new float[r3]
            r8 = {x0194: FILL_ARRAY_DATA , data: [1065353216, 1065353216} // fill-array
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r0, r11, r8)
            r14 = 500(0x1f4, double:2.47E-321)
            r8.setDuration(r14)
            int r9 = com.kwad.components.ad.splashscreen.widget.KsRotateView.Ki
            float r9 = (float) r9
            float[] r14 = new float[r3]
            r14[r16] = r17
            r14[r20] = r9
            android.animation.ObjectAnimator r9 = android.animation.ObjectAnimator.ofFloat(r0, r2, r14)
            r14 = 500(0x1f4, double:2.47E-321)
            android.animation.ObjectAnimator r9 = r9.setDuration(r14)
            float[] r14 = new float[r3]
            r14 = {x019c: FILL_ARRAY_DATA , data: [1065353216, 1065353216} // fill-array
            android.animation.ObjectAnimator r11 = android.animation.ObjectAnimator.ofFloat(r0, r11, r14)
            r14 = 340(0x154, double:1.68E-321)
            r10.setDuration(r14)
            int r14 = com.kwad.components.ad.splashscreen.widget.KsRotateView.Ki
            float r14 = (float) r14
            float[] r15 = new float[r3]
            r15[r16] = r14
            r15[r20] = r17
            android.animation.ObjectAnimator r14 = android.animation.ObjectAnimator.ofFloat(r0, r2, r15)
            int r15 = com.kwad.components.ad.splashscreen.widget.KsRotateView.Ke
            r19 = r4
            long r3 = (long) r15
            android.animation.ObjectAnimator r3 = r14.setDuration(r3)
            int r4 = com.kwad.components.ad.splashscreen.widget.KsRotateView.Kf
            float r4 = (float) r4
            r14 = 2
            float[] r15 = new float[r14]
            r15[r16] = r17
            r15[r20] = r4
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r0, r2, r15)
            int r15 = com.kwad.components.ad.splashscreen.widget.KsRotateView.Ke
            long r14 = (long) r15
            android.animation.ObjectAnimator r4 = r4.setDuration(r14)
            int r14 = com.kwad.components.ad.splashscreen.widget.KsRotateView.Kf
            float r14 = (float) r14
            r18 = r3
            r15 = 2
            float[] r3 = new float[r15]
            r3[r16] = r14
            r3[r20] = r17
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r0, r2, r3)
            int r14 = com.kwad.components.ad.splashscreen.widget.KsRotateView.Ke
            r22 = r4
            r21 = r5
            long r4 = (long) r14
            android.animation.ObjectAnimator r3 = r3.setDuration(r4)
            int r4 = com.kwad.components.ad.splashscreen.widget.KsRotateView.Kh
            float r4 = (float) r4
            float[] r5 = new float[r15]
            r5[r16] = r17
            r5[r20] = r4
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r0, r2, r5)
            int r5 = com.kwad.components.ad.splashscreen.widget.KsRotateView.Ke
            r14 = r6
            long r5 = (long) r5
            android.animation.ObjectAnimator r4 = r4.setDuration(r5)
            int r5 = com.kwad.components.ad.splashscreen.widget.KsRotateView.Kh
            float r5 = (float) r5
            float[] r6 = new float[r15]
            r6[r16] = r5
            r6[r20] = r17
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r0, r2, r6)
            int r2 = com.kwad.components.ad.splashscreen.widget.KsRotateView.Ke
            long r5 = (long) r2
            android.animation.ObjectAnimator r0 = r0.setDuration(r5)
            r2 = 15
            android.animation.Animator[] r2 = new android.animation.Animator[r2]
            r2[r16] = r19
            r2[r20] = r10
            r2[r15] = r21
            r5 = 3
            r2[r5] = r14
            r5 = 4
            r2[r5] = r12
            r5 = 5
            r2[r5] = r13
            r5 = 6
            r2[r5] = r7
            r5 = 7
            r2[r5] = r8
            r5 = 8
            r2[r5] = r9
            r5 = 9
            r2[r5] = r11
            r5 = 10
            r2[r5] = r18
            r5 = 11
            r2[r5] = r22
            r5 = 12
            r2[r5] = r3
            r3 = 13
            r2[r3] = r4
            r3 = 14
            r2[r3] = r0
            r1.playSequentially(r2)
            return r1
    }

    @Override // com.kwad.components.ad.splashscreen.widget.c
    protected int getAnimationDelayTime() {
            r1 = this;
            r0 = 500(0x1f4, float:7.0E-43)
            return r0
    }

    @Override // com.kwad.components.ad.splashscreen.widget.c
    protected android.view.View getInteractionView() {
            r1 = this;
            android.widget.ImageView r0 = r1.ig
            return r0
    }

    @Override // com.kwad.components.ad.splashscreen.widget.c
    protected final void nu() {
            r2 = this;
            android.widget.ImageView r0 = r2.ig
            int r1 = r2.Kd
            r0.setImageResource(r1)
            return
    }

    @Override // com.kwad.components.ad.splashscreen.widget.c
    protected final void nv() {
            r2 = this;
            android.view.View r0 = r2.getInteractionView()
            r1 = 0
            r0.setRotation(r1)
            return
    }
}
