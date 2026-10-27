package com.kwad.components.ad.feed.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class e extends android.widget.FrameLayout {

    /* renamed from: if, reason: not valid java name */
    private android.view.View f1if;
    private android.widget.ImageView ig;

    @androidx.annotation.Nullable
    private android.animation.Animator ih;
    private com.kwad.sdk.widget.d ij;




    public e(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    private e(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            r3 = 0
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    private e(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r3 = 0
            r0.<init>(r1, r2, r3)
            r0.init(r1)
            return
    }

    private android.animation.Animator a(android.view.View r4, long r5, float r7) {
            r3 = this;
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            r5 = 1052266988(0x3eb851ec, float:0.36)
            r6 = 1065353216(0x3f800000, float:1.0)
            r7 = 1046562734(0x3e6147ae, float:0.22)
            r0 = 1058474557(0x3f170a3d, float:0.59)
            android.view.animation.Interpolator r5 = androidx.core.view.animation.PathInterpolatorCompat.create(r7, r0, r5, r6)
            android.widget.ImageView r6 = r3.ig
            int r7 = r4.getWidth()
            float r7 = (float) r7
            r6.setPivotX(r7)
            android.widget.ImageView r6 = r3.ig
            int r7 = r4.getHeight()
            float r7 = (float) r7
            r6.setPivotY(r7)
            r6 = 100
            r0 = 1098907648(0x41800000, float:16.0)
            android.animation.Animator r1 = com.kwad.components.core.t.o.a(r4, r5, r6, r0)
            android.animation.Animator r2 = com.kwad.components.core.t.o.a(r4, r5, r6, r0)
            android.animation.Animator r4 = com.kwad.components.core.t.o.a(r4, r5, r6, r0)
            android.animation.AnimatorSet r5 = new android.animation.AnimatorSet
            r5.<init>()
            r6 = 3
            android.animation.Animator[] r6 = new android.animation.Animator[r6]
            r7 = 0
            r6[r7] = r1
            r7 = 1
            r6[r7] = r2
            r7 = 2
            r6[r7] = r4
            r5.playSequentially(r6)
            return r5
    }

    static /* synthetic */ android.animation.Animator a(com.kwad.components.ad.feed.widget.e r0) {
            android.animation.Animator r0 = r0.cB()
            return r0
    }

    static /* synthetic */ android.animation.Animator a(com.kwad.components.ad.feed.widget.e r0, android.animation.Animator r1) {
            r0.ih = r1
            return r1
    }

    static /* synthetic */ android.animation.Animator b(com.kwad.components.ad.feed.widget.e r0) {
            android.animation.Animator r0 = r0.ih
            return r0
    }

    private android.animation.Animator c(android.view.View r8, int r9) {
            r7 = this;
            if (r8 != 0) goto L4
            r8 = 0
            return r8
        L4:
            int r0 = r8.getWidth()
            float r0 = (float) r0
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            r8.setPivotX(r0)
            int r0 = r8.getHeight()
            float r0 = (float) r0
            float r0 = r0 / r1
            r8.setPivotY(r0)
            int r0 = r8.getHeight()
            int r1 = r8.getWidth()
            int r0 = java.lang.Math.min(r0, r1)
            float r0 = (float) r0
            float r9 = (float) r9
            float r9 = r9 / r0
            r0 = 2
            float[] r1 = new float[r0]
            r2 = 0
            r1[r2] = r9
            r3 = 1
            r4 = 1065353216(0x3f800000, float:1.0)
            r1[r3] = r4
            java.lang.String r5 = "scaleX"
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofFloat(r8, r5, r1)
            float[] r5 = new float[r0]
            r5[r2] = r9
            r5[r3] = r4
            java.lang.String r9 = "scaleY"
            android.animation.ObjectAnimator r9 = android.animation.ObjectAnimator.ofFloat(r8, r9, r5)
            float[] r4 = new float[r0]
            r4 = {x006e: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            java.lang.String r5 = "alpha"
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r8, r5, r4)
            android.animation.AnimatorSet r5 = new android.animation.AnimatorSet
            r5.<init>()
            r6 = 3
            android.animation.Animator[] r6 = new android.animation.Animator[r6]
            r6[r2] = r1
            r6[r3] = r9
            r6[r0] = r4
            r5.playTogether(r6)
            r0 = 500(0x1f4, double:2.47E-321)
            r5.setDuration(r0)
            com.kwad.components.ad.feed.widget.e$2 r9 = new com.kwad.components.ad.feed.widget.e$2
            r9.<init>(r7, r8)
            r5.addListener(r9)
            return r5
    }

    static /* synthetic */ com.kwad.sdk.widget.d c(com.kwad.components.ad.feed.widget.e r0) {
            com.kwad.sdk.widget.d r0 = r0.ij
            return r0
    }

    private android.animation.Animator cB() {
            r6 = this;
            android.view.View r0 = r6.f1if
            if (r0 == 0) goto L4c
            android.widget.ImageView r1 = r6.ig
            if (r1 == 0) goto L4c
            int r0 = r0.getWidth()
            android.view.View r1 = r6.f1if
            int r1 = r1.getHeight()
            int r0 = r0 + r1
            if (r0 == 0) goto L4c
            android.widget.ImageView r0 = r6.ig
            int r0 = r0.getWidth()
            android.widget.ImageView r1 = r6.ig
            int r1 = r1.getHeight()
            int r0 = r0 + r1
            if (r0 != 0) goto L25
            goto L4c
        L25:
            android.animation.Animator r0 = r6.cC()
            android.widget.ImageView r1 = r6.ig
            r2 = 100
            r4 = 1098907648(0x41800000, float:16.0)
            android.animation.Animator r1 = r6.a(r1, r2, r4)
            android.animation.Animator r2 = r6.cD()
            android.animation.AnimatorSet r3 = new android.animation.AnimatorSet
            r3.<init>()
            r4 = 3
            android.animation.Animator[] r4 = new android.animation.Animator[r4]
            r5 = 0
            r4[r5] = r0
            r0 = 1
            r4[r0] = r1
            r0 = 2
            r4[r0] = r2
            r3.playSequentially(r4)
            return r3
        L4c:
            r0 = 0
            return r0
    }

    private android.animation.Animator cC() {
            r5 = this;
            android.view.View r0 = r5.f1if
            android.content.Context r1 = r5.getContext()
            r2 = 1124073472(0x43000000, float:128.0)
            int r1 = com.kwad.sdk.c.a.a.a(r1, r2)
            android.animation.Animator r0 = r5.c(r0, r1)
            android.widget.ImageView r1 = r5.ig
            android.content.Context r2 = r5.getContext()
            r3 = 1116616786(0x428e3852, float:71.11)
            int r2 = com.kwad.sdk.c.a.a.a(r2, r3)
            android.animation.Animator r1 = r5.c(r1, r2)
            android.animation.AnimatorSet r2 = new android.animation.AnimatorSet
            r2.<init>()
            r3 = 500(0x1f4, double:2.47E-321)
            r2.setDuration(r3)
            r3 = 2
            android.animation.Animator[] r3 = new android.animation.Animator[r3]
            r4 = 0
            r3[r4] = r0
            r0 = 1
            r3[r0] = r1
            r2.playTogether(r3)
            return r2
    }

    private android.animation.Animator cD() {
            r5 = this;
            android.view.View r0 = r5.f1if
            android.animation.Animator r0 = r5.g(r0)
            android.widget.ImageView r1 = r5.ig
            android.animation.Animator r1 = r5.g(r1)
            android.animation.AnimatorSet r2 = new android.animation.AnimatorSet
            r2.<init>()
            r3 = 500(0x1f4, double:2.47E-321)
            r2.setDuration(r3)
            r3 = 2
            android.animation.Animator[] r3 = new android.animation.Animator[r3]
            r4 = 0
            r3[r4] = r0
            r0 = 1
            r3[r0] = r1
            r2.playTogether(r3)
            return r2
    }

    private android.animation.Animator g(android.view.View r5) {
            r4 = this;
            if (r5 != 0) goto L4
            r5 = 0
            return r5
        L4:
            r0 = 2
            float[] r0 = new float[r0]
            r0 = {x0026: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            java.lang.String r1 = "alpha"
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r5, r1, r0)
            android.animation.AnimatorSet r1 = new android.animation.AnimatorSet
            r1.<init>()
            r1.play(r0)
            r2 = 500(0x1f4, double:2.47E-321)
            r1.setDuration(r2)
            com.kwad.components.ad.feed.widget.e$3 r0 = new com.kwad.components.ad.feed.widget.e$3
            r0.<init>(r4, r5)
            r1.addListener(r0)
            return r1
    }

    private void init(android.content.Context r2) {
            r1 = this;
            int r0 = com.kwad.sdk.R.layout.ksad_feed_shake
            com.kwad.sdk.o.m.inflate(r2, r0, r1)
            r2 = 0
            r1.setClickable(r2)
            int r2 = com.kwad.sdk.R.id.ksad_feed_shake_bg
            android.view.View r2 = r1.findViewById(r2)
            r1.f1if = r2
            int r2 = com.kwad.sdk.R.id.ksad_feed_shake_icon
            android.view.View r2 = r1.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r1.ig = r2
            return
    }

    @androidx.annotation.MainThread
    public final void a(android.animation.AnimatorListenerAdapter r3) {
            r2 = this;
            android.animation.Animator r0 = r2.ih
            if (r0 == 0) goto La
            r0.cancel()
            r0 = 0
            r2.ih = r0
        La:
            android.widget.ImageView r0 = r2.ig
            com.kwad.components.ad.feed.widget.e$1 r1 = new com.kwad.components.ad.feed.widget.e$1
            r1.<init>(r2, r3)
            r0.post(r1)
            return
    }

    public final void setOnViewEventListener(com.kwad.sdk.widget.d r1) {
            r0 = this;
            r0.ij = r1
            return
    }
}
