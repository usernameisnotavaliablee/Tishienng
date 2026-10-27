package com.kwad.components.ad.splashscreen.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class KsRotateTypeTwoView extends com.kwad.components.ad.splashscreen.widget.c {
    private android.widget.ImageView Kb;
    private android.widget.ImageView Kc;

    @androidx.annotation.DrawableRes
    private int Kd;
    private android.widget.ImageView ig;

    public KsRotateTypeTwoView(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public KsRotateTypeTwoView(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public KsRotateTypeTwoView(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // com.kwad.components.ad.splashscreen.widget.c
    protected final void a(@androidx.annotation.NonNull android.content.Context r5, @androidx.annotation.Nullable android.util.AttributeSet r6, int r7) {
            r4 = this;
            int[] r0 = com.kwad.sdk.R.styleable.ksad_KsShakeView
            r1 = 0
            android.content.res.TypedArray r6 = r5.obtainStyledAttributes(r6, r0, r7, r1)
            int r7 = com.kwad.sdk.R.styleable.ksad_KsShakeView_ksad_shakeIcon
            int r0 = com.kwad.sdk.R.drawable.ksad_splash_rotate_combo_phone
            int r7 = r6.getResourceId(r7, r0)
            r4.Kd = r7
            r6.recycle()
            android.widget.ImageView r6 = new android.widget.ImageView
            android.content.Context r7 = r4.getContext()
            r6.<init>(r7)
            r4.Kb = r6
            int r7 = com.kwad.sdk.R.drawable.ksad_splash_rotate_combo_left_arrow
            r6.setImageResource(r7)
            android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams
            r7 = 1084227584(0x40a00000, float:5.0)
            int r0 = com.kwad.sdk.c.a.a.a(r5, r7)
            r1 = 1096810496(0x41600000, float:14.0)
            int r2 = com.kwad.sdk.c.a.a.a(r5, r1)
            r6.<init>(r0, r2)
            r0 = 1073741824(0x40000000, float:2.0)
            int r0 = com.kwad.sdk.c.a.a.a(r5, r0)
            r6.leftMargin = r0
            r0 = 16
            r6.gravity = r0
            android.widget.ImageView r2 = r4.Kb
            r4.addView(r2, r6)
            android.widget.ImageView r6 = new android.widget.ImageView
            android.content.Context r2 = r4.getContext()
            r6.<init>(r2)
            r4.ig = r6
            android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams
            r2 = 1097859072(0x41700000, float:15.0)
            int r2 = com.kwad.sdk.c.a.a.a(r5, r2)
            r3 = 1102577664(0x41b80000, float:23.0)
            int r3 = com.kwad.sdk.c.a.a.a(r5, r3)
            r6.<init>(r2, r3)
            r2 = 1091567616(0x41100000, float:9.0)
            int r2 = com.kwad.sdk.c.a.a.a(r5, r2)
            r6.leftMargin = r2
            r6.gravity = r0
            android.widget.ImageView r2 = r4.ig
            r4.addView(r2, r6)
            android.widget.ImageView r6 = new android.widget.ImageView
            android.content.Context r2 = r4.getContext()
            r6.<init>(r2)
            r4.Kc = r6
            int r2 = com.kwad.sdk.R.drawable.ksad_splash_rotate_combo_right_arrow
            r6.setImageResource(r2)
            android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams
            int r7 = com.kwad.sdk.c.a.a.a(r5, r7)
            int r1 = com.kwad.sdk.c.a.a.a(r5, r1)
            r6.<init>(r7, r1)
            r7 = 1104150528(0x41d00000, float:26.0)
            int r5 = com.kwad.sdk.c.a.a.a(r5, r7)
            r6.leftMargin = r5
            r6.gravity = r0
            android.widget.ImageView r5 = r4.Kc
            r4.addView(r5, r6)
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
            r3 = {x0070: FILL_ARRAY_DATA , data: [0, -1043857408} // fill-array
            java.lang.String r4 = "rotation"
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r0, r4, r3)
            r5 = 500(0x1f4, double:2.47E-321)
            android.animation.ObjectAnimator r3 = r3.setDuration(r5)
            float[] r7 = new float[r2]
            r7 = {x0078: FILL_ARRAY_DATA , data: [-1043857408, 1103626240} // fill-array
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r0, r4, r7)
            android.animation.ObjectAnimator r5 = r7.setDuration(r5)
            float[] r6 = new float[r2]
            r6 = {x0080: FILL_ARRAY_DATA , data: [1103626240, -1052770304} // fill-array
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r0, r4, r6)
            r7 = 200(0xc8, double:9.9E-322)
            android.animation.ObjectAnimator r6 = r6.setDuration(r7)
            float[] r7 = new float[r2]
            r7 = {x0088: FILL_ARRAY_DATA , data: [-1052770304, 0} // fill-array
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r0, r4, r7)
            r7 = 100
            android.animation.ObjectAnimator r0 = r0.setDuration(r7)
            r4 = 4
            android.animation.Animator[] r4 = new android.animation.Animator[r4]
            r7 = 0
            r4[r7] = r3
            r3 = 1
            r4[r3] = r5
            r4[r2] = r6
            r2 = 3
            r4[r2] = r0
            r1.playSequentially(r4)
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
            if (r0 == 0) goto L9
            int r1 = r2.Kd
            r0.setImageResource(r1)
        L9:
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
