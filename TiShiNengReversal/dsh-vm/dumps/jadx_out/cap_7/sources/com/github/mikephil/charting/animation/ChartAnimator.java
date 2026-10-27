package com.github.mikephil.charting.animation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class ChartAnimator {
    private android.animation.ValueAnimator.AnimatorUpdateListener mListener;
    protected float mPhaseX;
    protected float mPhaseY;

    public ChartAnimator() {
            r1 = this;
            r1.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.mPhaseY = r0
            r1.mPhaseX = r0
            return
    }

    @androidx.annotation.RequiresApi(11)
    public ChartAnimator(android.animation.ValueAnimator.AnimatorUpdateListener r2) {
            r1 = this;
            r1.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.mPhaseY = r0
            r1.mPhaseX = r0
            r1.mListener = r2
            return
    }

    @androidx.annotation.RequiresApi(11)
    private android.animation.ObjectAnimator xAnimator(int r3, com.github.mikephil.charting.animation.Easing.EasingFunction r4) {
            r2 = this;
            r0 = 2
            float[] r0 = new float[r0]
            r0 = {x0014: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            java.lang.String r1 = "phaseX"
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r2, r1, r0)
            r0.setInterpolator(r4)
            long r3 = (long) r3
            r0.setDuration(r3)
            return r0
    }

    @androidx.annotation.RequiresApi(11)
    private android.animation.ObjectAnimator yAnimator(int r3, com.github.mikephil.charting.animation.Easing.EasingFunction r4) {
            r2 = this;
            r0 = 2
            float[] r0 = new float[r0]
            r0 = {x0014: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            java.lang.String r1 = "phaseY"
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r2, r1, r0)
            r0.setInterpolator(r4)
            long r3 = (long) r3
            r0.setDuration(r3)
            return r0
    }

    @androidx.annotation.RequiresApi(11)
    public void animateX(int r2) {
            r1 = this;
            com.github.mikephil.charting.animation.Easing$EasingFunction r0 = com.github.mikephil.charting.animation.Easing.Linear
            r1.animateX(r2, r0)
            return
    }

    @androidx.annotation.RequiresApi(11)
    public void animateX(int r1, com.github.mikephil.charting.animation.Easing.EasingFunction r2) {
            r0 = this;
            android.animation.ObjectAnimator r1 = r0.xAnimator(r1, r2)
            android.animation.ValueAnimator$AnimatorUpdateListener r2 = r0.mListener
            r1.addUpdateListener(r2)
            r1.start()
            return
    }

    @androidx.annotation.RequiresApi(11)
    public void animateXY(int r2, int r3) {
            r1 = this;
            com.github.mikephil.charting.animation.Easing$EasingFunction r0 = com.github.mikephil.charting.animation.Easing.Linear
            r1.animateXY(r2, r3, r0, r0)
            return
    }

    @androidx.annotation.RequiresApi(11)
    public void animateXY(int r2, int r3, com.github.mikephil.charting.animation.Easing.EasingFunction r4) {
            r1 = this;
            android.animation.ObjectAnimator r0 = r1.xAnimator(r2, r4)
            android.animation.ObjectAnimator r4 = r1.yAnimator(r3, r4)
            if (r2 <= r3) goto L10
            android.animation.ValueAnimator$AnimatorUpdateListener r2 = r1.mListener
            r0.addUpdateListener(r2)
            goto L15
        L10:
            android.animation.ValueAnimator$AnimatorUpdateListener r2 = r1.mListener
            r4.addUpdateListener(r2)
        L15:
            r0.start()
            r4.start()
            return
    }

    @androidx.annotation.RequiresApi(11)
    public void animateXY(int r1, int r2, com.github.mikephil.charting.animation.Easing.EasingFunction r3, com.github.mikephil.charting.animation.Easing.EasingFunction r4) {
            r0 = this;
            android.animation.ObjectAnimator r3 = r0.xAnimator(r1, r3)
            android.animation.ObjectAnimator r4 = r0.yAnimator(r2, r4)
            if (r1 <= r2) goto L10
            android.animation.ValueAnimator$AnimatorUpdateListener r1 = r0.mListener
            r3.addUpdateListener(r1)
            goto L15
        L10:
            android.animation.ValueAnimator$AnimatorUpdateListener r1 = r0.mListener
            r4.addUpdateListener(r1)
        L15:
            r3.start()
            r4.start()
            return
    }

    @androidx.annotation.RequiresApi(11)
    public void animateY(int r2) {
            r1 = this;
            com.github.mikephil.charting.animation.Easing$EasingFunction r0 = com.github.mikephil.charting.animation.Easing.Linear
            r1.animateY(r2, r0)
            return
    }

    @androidx.annotation.RequiresApi(11)
    public void animateY(int r1, com.github.mikephil.charting.animation.Easing.EasingFunction r2) {
            r0 = this;
            android.animation.ObjectAnimator r1 = r0.yAnimator(r1, r2)
            android.animation.ValueAnimator$AnimatorUpdateListener r2 = r0.mListener
            r1.addUpdateListener(r2)
            r1.start()
            return
    }

    public float getPhaseX() {
            r1 = this;
            float r0 = r1.mPhaseX
            return r0
    }

    public float getPhaseY() {
            r1 = this;
            float r0 = r1.mPhaseY
            return r0
    }

    public void setPhaseX(float r3) {
            r2 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L9
            r3 = 1065353216(0x3f800000, float:1.0)
            goto Lf
        L9:
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto Lf
            r3 = 0
        Lf:
            r2.mPhaseX = r3
            return
    }

    public void setPhaseY(float r3) {
            r2 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L9
            r3 = 1065353216(0x3f800000, float:1.0)
            goto Lf
        L9:
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto Lf
            r3 = 0
        Lf:
            r2.mPhaseY = r3
            return
    }
}
