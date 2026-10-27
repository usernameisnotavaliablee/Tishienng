package com.kwad.components.ad.feed.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class d extends android.widget.FrameLayout {
    private int count;
    private android.widget.ImageView hW;
    private android.widget.ImageView hX;
    private android.widget.ImageView hY;
    private android.animation.Animator hZ;
    private android.animation.Animator ia;
    private android.view.animation.Animation ib;
    private android.view.animation.Animation ic;




    public d(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    private d(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            r3 = 0
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    private d(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r3 = 0
            r0.<init>(r1, r2, r3)
            r0.count = r3
            r0.B(r1)
            return
    }

    private void B(android.content.Context r2) {
            r1 = this;
            int r0 = com.kwad.sdk.R.layout.ksad_promote_ad_click
            com.kwad.sdk.o.m.inflate(r2, r0, r1)
            int r2 = com.kwad.sdk.R.id.ksad_inside_circle
            android.view.View r2 = r1.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r1.hW = r2
            int r2 = com.kwad.sdk.R.id.ksad_outside_circle
            android.view.View r2 = r1.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r1.hX = r2
            int r2 = com.kwad.sdk.R.id.ksad_hand
            android.view.View r2 = r1.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r1.hY = r2
            return
    }

    private android.view.animation.Animation a(android.view.View r13, float r14, int r15) {
            r12 = this;
            android.content.Context r0 = r12.getContext()
            r1 = 1092616192(0x41200000, float:10.0)
            int r0 = com.kwad.sdk.c.a.a.a(r0, r1)
            float r0 = (float) r0
            android.view.animation.AlphaAnimation r1 = new android.view.animation.AlphaAnimation
            r2 = 0
            r1.<init>(r14, r2)
            android.view.animation.ScaleAnimation r3 = new android.view.animation.ScaleAnimation
            float r14 = (float) r15
            float r5 = r14 / r0
            r10 = 1
            r11 = 1056964608(0x3f000000, float:0.5)
            r4 = 1065353216(0x3f800000, float:1.0)
            r6 = 1065353216(0x3f800000, float:1.0)
            r8 = 1
            r9 = 1056964608(0x3f000000, float:0.5)
            r7 = r5
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            android.view.animation.AnimationSet r14 = new android.view.animation.AnimationSet
            r15 = 1
            r14.<init>(r15)
            r14.addAnimation(r1)
            r14.addAnimation(r3)
            r0 = 200(0xc8, double:9.9E-322)
            r14.setDuration(r0)
            com.kwad.components.ad.feed.widget.d$3 r15 = new com.kwad.components.ad.feed.widget.d$3
            r15.<init>(r12, r13)
            r14.setAnimationListener(r15)
            return r14
    }

    static /* synthetic */ android.view.animation.Animation a(com.kwad.components.ad.feed.widget.d r0) {
            android.view.animation.Animation r0 = r0.ib
            return r0
    }

    static /* synthetic */ android.widget.ImageView b(com.kwad.components.ad.feed.widget.d r0) {
            android.widget.ImageView r0 = r0.hW
            return r0
    }

    static /* synthetic */ android.view.animation.Animation c(com.kwad.components.ad.feed.widget.d r0) {
            android.view.animation.Animation r0 = r0.ic
            return r0
    }

    private void cA() {
            r3 = this;
            android.widget.ImageView r0 = r3.hY
            android.animation.Animator r0 = r3.e(r0)
            r3.hZ = r0
            android.widget.ImageView r0 = r3.hY
            android.animation.Animator r0 = r3.f(r0)
            r3.ia = r0
            android.widget.ImageView r0 = r3.hW
            android.content.Context r1 = r3.getContext()
            r2 = 1107820544(0x42080000, float:34.0)
            int r1 = com.kwad.sdk.c.a.a.a(r1, r2)
            r2 = 1055286886(0x3ee66666, float:0.45)
            android.view.animation.Animation r0 = r3.a(r0, r2, r1)
            r3.ib = r0
            android.widget.ImageView r0 = r3.hX
            android.content.Context r1 = r3.getContext()
            r2 = 1112014848(0x42480000, float:50.0)
            int r1 = com.kwad.sdk.c.a.a.a(r1, r2)
            r2 = 1056964608(0x3f000000, float:0.5)
            android.view.animation.Animation r0 = r3.a(r0, r2, r1)
            r3.ic = r0
            android.animation.Animator r0 = r3.hZ
            com.kwad.components.ad.feed.widget.d$1 r1 = new com.kwad.components.ad.feed.widget.d$1
            r1.<init>(r3)
            r0.addListener(r1)
            android.animation.Animator r0 = r3.ia
            com.kwad.components.ad.feed.widget.d$2 r1 = new com.kwad.components.ad.feed.widget.d$2
            r1.<init>(r3)
            r0.addListener(r1)
            return
    }

    static /* synthetic */ android.widget.ImageView d(com.kwad.components.ad.feed.widget.d r0) {
            android.widget.ImageView r0 = r0.hX
            return r0
    }

    private android.animation.Animator e(android.view.View r11) {
            r10 = this;
            r0 = 2
            float[] r1 = new float[r0]
            r1 = {x0054: FILL_ARRAY_DATA , data: [0, -1054867456} // fill-array
            java.lang.String r2 = "rotation"
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofFloat(r11, r2, r1)
            android.content.Context r2 = r10.getContext()
            r3 = 1092091904(0x41180000, float:9.5)
            int r2 = com.kwad.sdk.c.a.a.a(r2, r3)
            int r2 = -r2
            float r2 = (float) r2
            float[] r4 = new float[r0]
            r5 = 0
            r6 = 0
            r4[r5] = r6
            r7 = 1
            r4[r7] = r2
            java.lang.String r2 = "translationX"
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r11, r2, r4)
            android.content.Context r4 = r10.getContext()
            int r3 = com.kwad.sdk.c.a.a.a(r4, r3)
            int r3 = -r3
            float r3 = (float) r3
            float[] r4 = new float[r0]
            r4[r5] = r6
            r4[r7] = r3
            java.lang.String r3 = "translationY"
            android.animation.ObjectAnimator r11 = android.animation.ObjectAnimator.ofFloat(r11, r3, r4)
            android.animation.AnimatorSet r3 = new android.animation.AnimatorSet
            r3.<init>()
            r8 = 250(0xfa, double:1.235E-321)
            r3.setDuration(r8)
            r4 = 3
            android.animation.Animator[] r4 = new android.animation.Animator[r4]
            r4[r5] = r1
            r4[r7] = r2
            r4[r0] = r11
            r3.playTogether(r4)
            return r3
    }

    static /* synthetic */ android.animation.Animator e(com.kwad.components.ad.feed.widget.d r0) {
            android.animation.Animator r0 = r0.ia
            return r0
    }

    static /* synthetic */ int f(com.kwad.components.ad.feed.widget.d r2) {
            int r0 = r2.count
            int r1 = r0 + 1
            r2.count = r1
            return r0
    }

    private android.animation.Animator f(android.view.View r9) {
            r8 = this;
            r0 = 2
            float[] r1 = new float[r0]
            r1 = {x0054: FILL_ARRAY_DATA , data: [-1054867456, 0} // fill-array
            java.lang.String r2 = "rotation"
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofFloat(r9, r2, r1)
            android.content.Context r2 = r8.getContext()
            r3 = 1092091904(0x41180000, float:9.5)
            int r2 = com.kwad.sdk.c.a.a.a(r2, r3)
            int r2 = -r2
            float r2 = (float) r2
            float[] r4 = new float[r0]
            r5 = 0
            r4[r5] = r2
            r2 = 1
            r6 = 0
            r4[r2] = r6
            java.lang.String r7 = "translationX"
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r9, r7, r4)
            android.content.Context r7 = r8.getContext()
            int r3 = com.kwad.sdk.c.a.a.a(r7, r3)
            int r3 = -r3
            float r3 = (float) r3
            float[] r7 = new float[r0]
            r7[r5] = r3
            r7[r2] = r6
            java.lang.String r3 = "translationY"
            android.animation.ObjectAnimator r9 = android.animation.ObjectAnimator.ofFloat(r9, r3, r7)
            android.animation.AnimatorSet r3 = new android.animation.AnimatorSet
            r3.<init>()
            r6 = 250(0xfa, double:1.235E-321)
            r3.setDuration(r6)
            r6 = 3
            android.animation.Animator[] r6 = new android.animation.Animator[r6]
            r6[r5] = r1
            r6[r2] = r4
            r6[r0] = r9
            r3.playTogether(r6)
            return r3
    }

    static /* synthetic */ int g(com.kwad.components.ad.feed.widget.d r0) {
            int r0 = r0.count
            return r0
    }

    static /* synthetic */ android.animation.Animator h(com.kwad.components.ad.feed.widget.d r0) {
            android.animation.Animator r0 = r0.hZ
            return r0
    }

    public final void cy() {
            r1 = this;
            r1.cA()
            android.animation.Animator r0 = r1.hZ
            r0.start()
            return
    }

    public final void cz() {
            r1 = this;
            android.animation.Animator r0 = r1.hZ
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            android.animation.Animator r0 = r1.ia
            if (r0 == 0) goto Le
            r0.cancel()
        Le:
            android.view.animation.Animation r0 = r1.ib
            if (r0 == 0) goto L15
            r0.cancel()
        L15:
            android.view.animation.Animation r0 = r1.ic
            if (r0 == 0) goto L1c
            r0.cancel()
        L1c:
            return
    }
}
