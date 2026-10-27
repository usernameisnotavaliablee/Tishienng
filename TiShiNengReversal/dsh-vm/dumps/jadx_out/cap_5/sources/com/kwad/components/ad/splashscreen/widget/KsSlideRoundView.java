package com.kwad.components.ad.splashscreen.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class KsSlideRoundView extends com.kwad.components.ad.splashscreen.widget.c {
    private android.widget.ImageView KH;

    @androidx.annotation.DrawableRes
    private int Kv;

    public KsSlideRoundView(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public KsSlideRoundView(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public KsSlideRoundView(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
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
            int r0 = com.kwad.sdk.R.drawable.ksad_splash_slide_round_bg
            int r5 = r4.getResourceId(r5, r0)
            r2.Kv = r5
            r4.recycle()
            android.widget.ImageView r4 = new android.widget.ImageView
            r4.<init>(r3)
            r2.KH = r4
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r4 = -1
            r3.<init>(r4, r4)
            android.widget.ImageView r4 = r2.KH
            android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.FIT_END
            r4.setScaleType(r5)
            android.widget.ImageView r4 = r2.KH
            r2.addView(r4, r3)
            return
    }

    @Override // com.kwad.components.ad.splashscreen.widget.c
    protected final android.animation.Animator fN() {
            r8 = this;
            android.view.View r0 = r8.getInteractionView()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            android.animation.AnimatorSet r1 = new android.animation.AnimatorSet
            r1.<init>()
            int r2 = r0.getHeight()
            float r2 = (float) r2
            r0.setPivotY(r2)
            r2 = 2
            float[] r3 = new float[r2]
            r3 = {x0040: FILL_ARRAY_DATA , data: [1065353216, 1066192077} // fill-array
            java.lang.String r4 = "scaleY"
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r0, r4, r3)
            r5 = 400(0x190, double:1.976E-321)
            android.animation.ObjectAnimator r3 = r3.setDuration(r5)
            float[] r7 = new float[r2]
            r7 = {x0048: FILL_ARRAY_DATA , data: [1066192077, 1065353216} // fill-array
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r0, r4, r7)
            android.animation.ObjectAnimator r0 = r0.setDuration(r5)
            android.animation.Animator[] r2 = new android.animation.Animator[r2]
            r4 = 0
            r2[r4] = r3
            r3 = 1
            r2[r3] = r0
            r1.playSequentially(r2)
            return r1
    }

    @Override // com.kwad.components.ad.splashscreen.widget.c
    protected int getAnimationDelayTime() {
            r1 = this;
            r0 = 200(0xc8, float:2.8E-43)
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
            android.widget.ImageView r0 = r2.KH
            if (r0 == 0) goto L9
            int r1 = r2.Kv
            r0.setImageResource(r1)
        L9:
            return
    }

    @Override // com.kwad.components.ad.splashscreen.widget.c
    protected final void nv() {
            r2 = this;
            android.view.View r0 = r2.getInteractionView()
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setScaleY(r1)
            return
    }
}
