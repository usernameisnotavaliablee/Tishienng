package com.kwad.components.ad.reward.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class HandSlideView extends com.kwad.sdk.widget.KSFrameLayout {
    private android.view.View Dp;
    private android.animation.AnimatorSet Dq;
    private float Dr;
    private float Ds;
    private float Dt;
    private long Du;
    private long Dv;
    private int Dw;
    private int Dx;
    private android.widget.ImageView hY;
    private boolean started;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void onHandSlideLoopEnd();
    }

    public HandSlideView(@androidx.annotation.NonNull android.content.Context r3) {
            r2 = this;
            r2.<init>(r3)
            r0 = 600(0x258, double:2.964E-321)
            r2.Du = r0
            r0 = 500(0x1f4, double:2.47E-321)
            r2.Dv = r0
            r3 = 3
            r2.Dw = r3
            r3 = 0
            r2.Dx = r3
            r2.started = r3
            return
    }

    public HandSlideView(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 600(0x258, double:2.964E-321)
            r0.Du = r1
            r1 = 500(0x1f4, double:2.47E-321)
            r0.Dv = r1
            r1 = 3
            r0.Dw = r1
            r1 = 0
            r0.Dx = r1
            r0.started = r1
            return
    }

    public HandSlideView(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 600(0x258, double:2.964E-321)
            r0.Du = r1
            r1 = 500(0x1f4, double:2.47E-321)
            r0.Dv = r1
            r1 = 3
            r0.Dw = r1
            r1 = 0
            r0.Dx = r1
            r0.started = r1
            return
    }

    static /* synthetic */ android.animation.AnimatorSet a(com.kwad.components.ad.reward.widget.HandSlideView r0) {
            android.animation.AnimatorSet r0 = r0.Dq
            return r0
    }

    static /* synthetic */ int b(com.kwad.components.ad.reward.widget.HandSlideView r2) {
            int r0 = r2.Dx
            int r1 = r0 + 1
            r2.Dx = r1
            return r0
    }

    private android.animation.AnimatorSet b(android.view.View r14, android.view.View r15) {
            r13 = this;
            float r0 = r13.Dr
            float r0 = -r0
            r1 = 2
            float[] r2 = new float[r1]
            r3 = 0
            r4 = 0
            r2[r3] = r4
            r5 = 1
            r2[r5] = r0
            java.lang.String r0 = "translationY"
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r14, r0, r2)
            float[] r2 = new float[r5]
            r6 = 1106247680(0x41f00000, float:30.0)
            r2[r3] = r6
            java.lang.String r6 = "rotation"
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r14, r6, r2)
            float[] r6 = new float[r1]
            r6 = {x00b0: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            java.lang.String r7 = "alpha"
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r14, r7, r6)
            r8 = 10
            r6.setDuration(r8)
            float r8 = r13.Ds
            float r9 = r13.Dt
            float[] r10 = new float[r1]
            r10[r3] = r8
            r10[r5] = r9
            android.animation.ValueAnimator r8 = android.animation.ValueAnimator.ofFloat(r10)
            android.animation.ValueAnimator$AnimatorUpdateListener r9 = u(r15)
            r8.addUpdateListener(r9)
            float[] r9 = new float[r1]
            r9 = {x00b8: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ObjectAnimator r9 = android.animation.ObjectAnimator.ofFloat(r15, r7, r9)
            android.animation.AnimatorSet r10 = new android.animation.AnimatorSet
            r10.<init>()
            long r11 = r13.Du
            r10.setDuration(r11)
            r11 = 5
            android.animation.Animator[] r11 = new android.animation.Animator[r11]
            r11[r3] = r0
            r11[r5] = r2
            r11[r1] = r6
            r0 = 3
            r11[r0] = r8
            r0 = 4
            r11[r0] = r9
            r10.playTogether(r11)
            r0 = 1045220557(0x3e4ccccd, float:0.2)
            r2 = 1065353216(0x3f800000, float:1.0)
            android.view.animation.Interpolator r6 = androidx.core.view.animation.PathInterpolatorCompat.create(r4, r4, r0, r2)
            r10.setInterpolator(r6)
            android.animation.AnimatorSet r6 = new android.animation.AnimatorSet
            r6.<init>()
            float[] r8 = new float[r1]
            r8 = {x00c0: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            android.animation.ObjectAnimator r15 = android.animation.ObjectAnimator.ofFloat(r15, r7, r8)
            float[] r8 = new float[r1]
            r8 = {x00c8: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            android.animation.ObjectAnimator r14 = android.animation.ObjectAnimator.ofFloat(r14, r7, r8)
            android.animation.Animator[] r7 = new android.animation.Animator[r1]
            r7[r3] = r14
            r7[r5] = r15
            r6.playTogether(r7)
            long r14 = r13.Dv
            r6.setDuration(r14)
            android.view.animation.Interpolator r14 = androidx.core.view.animation.PathInterpolatorCompat.create(r4, r4, r0, r2)
            r6.setInterpolator(r14)
            android.animation.AnimatorSet r14 = new android.animation.AnimatorSet
            r14.<init>()
            android.animation.Animator[] r15 = new android.animation.Animator[r1]
            r15[r3] = r10
            r15[r5] = r6
            r14.playSequentially(r15)
            return r14
    }

    static /* synthetic */ int c(com.kwad.components.ad.reward.widget.HandSlideView r0) {
            int r0 = r0.Dx
            return r0
    }

    static /* synthetic */ int d(com.kwad.components.ad.reward.widget.HandSlideView r0) {
            int r0 = r0.Dw
            return r0
    }

    private static android.animation.ValueAnimator.AnimatorUpdateListener u(android.view.View r1) {
            com.kwad.components.ad.reward.widget.HandSlideView$2 r0 = new com.kwad.components.ad.reward.widget.HandSlideView$2
            r0.<init>(r1)
            return r0
    }

    public final void a(@androidx.annotation.Nullable com.kwad.components.ad.reward.widget.HandSlideView.a r3) {
            r2 = this;
            r0 = 1
            r2.started = r0
            android.widget.ImageView r0 = r2.hY
            android.view.View r1 = r2.Dp
            android.animation.AnimatorSet r0 = r2.b(r0, r1)
            r2.Dq = r0
            com.kwad.components.ad.reward.widget.HandSlideView$1 r1 = new com.kwad.components.ad.reward.widget.HandSlideView$1
            r1.<init>(r2, r3)
            r0.addListener(r1)
            android.animation.AnimatorSet r3 = r2.Dq
            r3.start()
            return
    }

    public final void destroy() {
            r1 = this;
            r0 = 0
            r1.started = r0
            android.animation.AnimatorSet r0 = r1.Dq
            if (r0 == 0) goto L12
            r0.removeAllListeners()
            android.animation.AnimatorSet r0 = r1.Dq
            r0.cancel()
            r0 = 0
            r1.Dq = r0
        L12:
            return
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout
    public final void init(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2) {
            r0 = this;
            super.init(r1, r2)
            android.content.Context r1 = r0.getContext()
            int r2 = com.kwad.sdk.R.layout.ksad_hand_slide
            android.view.View.inflate(r1, r2, r0)
            int r1 = com.kwad.sdk.R.id.ksad_hand_slide_hand
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0.hY = r1
            int r1 = com.kwad.sdk.R.id.ksad_hand_slide_tail
            android.view.View r1 = r0.findViewById(r1)
            r0.Dp = r1
            android.content.Context r1 = r0.getContext()
            android.content.res.Resources r1 = r1.getResources()
            int r2 = com.kwad.sdk.R.dimen.ksad_hand_slide_up
            float r1 = r1.getDimension(r2)
            r0.Dr = r1
            android.content.Context r1 = r0.getContext()
            android.content.res.Resources r1 = r1.getResources()
            int r2 = com.kwad.sdk.R.dimen.ksad_hand_slide_tail_height_start
            float r1 = r1.getDimension(r2)
            r0.Ds = r1
            android.content.Context r1 = r0.getContext()
            android.content.res.Resources r1 = r1.getResources()
            int r2 = com.kwad.sdk.R.dimen.ksad_hand_slide_tail_height_end
            float r1 = r1.getDimension(r2)
            r0.Dt = r1
            return
    }

    public final boolean isStarted() {
            r1 = this;
            boolean r0 = r1.started
            return r0
    }
}
