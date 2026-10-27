package com.kwad.components.ad.splashscreen.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class KsButtonBorderSpreadView extends com.kwad.components.ad.splashscreen.widget.c {
    private android.widget.ImageView JX;

    @androidx.annotation.DrawableRes
    private int JY;

    public KsButtonBorderSpreadView(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public KsButtonBorderSpreadView(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public KsButtonBorderSpreadView(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
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
            int r0 = com.kwad.sdk.R.drawable.ksad_splash_shake_combo_border
            int r5 = r4.getResourceId(r5, r0)
            r2.JY = r5
            r4.recycle()
            android.widget.ImageView r4 = new android.widget.ImageView
            r4.<init>(r3)
            r2.JX = r4
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r5 = 1132822528(0x43858000, float:267.0)
            int r5 = com.kwad.sdk.c.a.a.a(r3, r5)
            r0 = 1115947008(0x42840000, float:66.0)
            int r3 = com.kwad.sdk.c.a.a.a(r3, r0)
            r4.<init>(r5, r3)
            r3 = 17
            r4.gravity = r3
            android.widget.ImageView r3 = r2.JX
            r2.addView(r3, r4)
            return
    }

    @Override // com.kwad.components.ad.splashscreen.widget.c
    protected final android.animation.Animator fN() {
            r9 = this;
            android.view.View r0 = r9.getInteractionView()
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
            r2 = 2
            float[] r3 = new float[r2]
            r3 = {x0060: FILL_ARRAY_DATA , data: [1065353216, 1066192077} // fill-array
            java.lang.String r4 = "scaleX"
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r0, r4, r3)
            r4 = 1000(0x3e8, double:4.94E-321)
            android.animation.ObjectAnimator r3 = r3.setDuration(r4)
            float[] r6 = new float[r2]
            r6 = {x0068: FILL_ARRAY_DATA , data: [1065353216, 1068708659} // fill-array
            java.lang.String r7 = "scaleY"
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r0, r7, r6)
            android.animation.ObjectAnimator r6 = r6.setDuration(r4)
            float[] r7 = new float[r2]
            r7 = {x0070: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            java.lang.String r8 = "alpha"
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r0, r8, r7)
            android.animation.ObjectAnimator r0 = r0.setDuration(r4)
            r4 = 3
            android.animation.Animator[] r4 = new android.animation.Animator[r4]
            r5 = 0
            r4[r5] = r3
            r3 = 1
            r4[r3] = r6
            r4[r2] = r0
            r1.playTogether(r4)
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
            r1 = this;
            android.widget.ImageView r0 = r1.JX
            return r0
    }

    @Override // com.kwad.components.ad.splashscreen.widget.c
    protected final void nu() {
            r2 = this;
            android.widget.ImageView r0 = r2.JX
            int r1 = r2.JY
            r0.setImageResource(r1)
            return
    }

    @Override // com.kwad.components.ad.splashscreen.widget.c
    protected final void nv() {
            r2 = this;
            android.view.View r0 = r2.getInteractionView()
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setScaleX(r1)
            android.view.View r0 = r2.getInteractionView()
            r0.setScaleY(r1)
            android.view.View r0 = r2.getInteractionView()
            r0.setAlpha(r1)
            return
    }
}
