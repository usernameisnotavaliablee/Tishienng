package com.kwad.components.ad.splashscreen.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class KsSlidePopUpView extends com.kwad.components.ad.splashscreen.widget.c {
    private android.widget.ImageView KD;

    @androidx.annotation.DrawableRes
    private int KE;


    public KsSlidePopUpView(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public KsSlidePopUpView(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public KsSlidePopUpView(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
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
            int r0 = com.kwad.sdk.R.drawable.ksad_splash_slide_square_bg
            int r5 = r4.getResourceId(r5, r0)
            r2.KE = r5
            r4.recycle()
            android.widget.ImageView r4 = new android.widget.ImageView
            r4.<init>(r3)
            r2.KD = r4
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r4 = -1
            r3.<init>(r4, r4)
            android.widget.ImageView r4 = r2.KD
            android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.FIT_XY
            r4.setScaleType(r5)
            android.widget.ImageView r4 = r2.KD
            r2.addView(r4, r3)
            return
    }

    @Override // com.kwad.components.ad.splashscreen.widget.c
    protected final android.animation.Animator fN() {
            r14 = this;
            android.view.View r0 = r14.getInteractionView()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            android.animation.AnimatorSet r1 = new android.animation.AnimatorSet
            r1.<init>()
            android.content.Context r2 = r14.getContext()
            r3 = -1032847360(0xffffffffc2700000, float:-60.0)
            int r2 = com.kwad.sdk.c.a.a.a(r2, r3)
            float r2 = (float) r2
            android.content.Context r3 = r14.getContext()
            r4 = -1031274496(0xffffffffc2880000, float:-68.0)
            int r3 = com.kwad.sdk.c.a.a.a(r3, r4)
            float r3 = (float) r3
            r4 = 2
            float[] r5 = new float[r4]
            r6 = 0
            r5[r6] = r2
            r7 = 1
            r5[r7] = r3
            java.lang.String r8 = "translationY"
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r0, r8, r5)
            r9 = 200(0xc8, double:9.9E-322)
            android.animation.ObjectAnimator r5 = r5.setDuration(r9)
            float[] r11 = new float[r4]
            r11[r6] = r3
            r11[r7] = r2
            android.animation.ObjectAnimator r11 = android.animation.ObjectAnimator.ofFloat(r0, r8, r11)
            android.animation.ObjectAnimator r11 = r11.setDuration(r9)
            float[] r12 = new float[r4]
            r12[r6] = r2
            r12[r7] = r3
            android.animation.ObjectAnimator r12 = android.animation.ObjectAnimator.ofFloat(r0, r8, r12)
            android.animation.ObjectAnimator r12 = r12.setDuration(r9)
            float[] r13 = new float[r4]
            r13[r6] = r3
            r13[r7] = r2
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r0, r8, r13)
            android.animation.ObjectAnimator r0 = r0.setDuration(r9)
            r2 = 4
            android.animation.Animator[] r2 = new android.animation.Animator[r2]
            r2[r6] = r5
            r2[r7] = r11
            r2[r4] = r12
            r3 = 3
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
            r0 = this;
            return r0
    }

    @Override // com.kwad.components.ad.splashscreen.widget.c
    protected final void nu() {
            r2 = this;
            android.widget.ImageView r0 = r2.KD
            if (r0 == 0) goto L9
            int r1 = r2.KE
            r0.setImageResource(r1)
        L9:
            return
    }

    @Override // com.kwad.components.ad.splashscreen.widget.c
    protected final void nv() {
            r2 = this;
            android.view.View r0 = r2.getInteractionView()
            r1 = 0
            r0.setTranslationY(r1)
            return
    }

    public final void nz() {
            r10 = this;
            android.view.View r0 = r10.getInteractionView()
            if (r0 != 0) goto L7
            return
        L7:
            android.animation.AnimatorSet r1 = new android.animation.AnimatorSet
            r1.<init>()
            android.content.Context r2 = r10.getContext()
            r3 = -1032847360(0xffffffffc2700000, float:-60.0)
            int r2 = com.kwad.sdk.c.a.a.a(r2, r3)
            float r2 = (float) r2
            r3 = 2
            float[] r4 = new float[r3]
            r5 = 0
            r6 = 0
            r4[r5] = r6
            r6 = 1
            r4[r6] = r2
            java.lang.String r2 = "translationY"
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r0, r2, r4)
            r7 = 300(0x12c, double:1.48E-321)
            android.animation.ObjectAnimator r2 = r2.setDuration(r7)
            float[] r4 = new float[r3]
            r4 = {x0052: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            java.lang.String r9 = "alpha"
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r0, r9, r4)
            android.animation.ObjectAnimator r0 = r0.setDuration(r7)
            android.animation.Animator[] r3 = new android.animation.Animator[r3]
            r3[r5] = r2
            r3[r6] = r0
            r1.playTogether(r3)
            com.kwad.components.ad.splashscreen.widget.KsSlidePopUpView$1 r0 = new com.kwad.components.ad.splashscreen.widget.KsSlidePopUpView$1
            r0.<init>(r10)
            r1.addListener(r0)
            r1.start()
            return
    }
}
