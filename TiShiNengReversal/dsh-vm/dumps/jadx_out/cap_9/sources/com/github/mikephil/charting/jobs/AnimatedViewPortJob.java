package com.github.mikephil.charting.jobs;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"NewApi"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class AnimatedViewPortJob extends com.github.mikephil.charting.jobs.ViewPortJob implements android.animation.ValueAnimator.AnimatorUpdateListener, android.animation.Animator.AnimatorListener {
    protected android.animation.ObjectAnimator animator;
    protected float phase;
    protected float xOrigin;
    protected float yOrigin;

    public AnimatedViewPortJob(com.github.mikephil.charting.utils.ViewPortHandler r1, float r2, float r3, com.github.mikephil.charting.utils.Transformer r4, android.view.View r5, float r6, float r7, long r8) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5)
            r1 = r0
            r1.xOrigin = r6
            r1.yOrigin = r7
            r2 = 2
            float[] r2 = new float[r2]
            r2 = {x0024: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            java.lang.String r3 = "phase"
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r0, r3, r2)
            r1.animator = r2
            r2.setDuration(r8)
            android.animation.ObjectAnimator r2 = r1.animator
            r2.addUpdateListener(r0)
            android.animation.ObjectAnimator r2 = r1.animator
            r2.addListener(r0)
            return
    }

    public float getPhase() {
            r1 = this;
            float r0 = r1.phase
            return r0
    }

    public float getXOrigin() {
            r1 = this;
            float r0 = r1.xOrigin
            return r0
    }

    public float getYOrigin() {
            r1 = this;
            float r0 = r1.yOrigin
            return r0
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator r1) {
            r0 = this;
            r0.recycleSelf()     // Catch: java.lang.IllegalArgumentException -> L3
        L3:
            return
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator r1) {
            r0 = this;
            r0.recycleSelf()     // Catch: java.lang.IllegalArgumentException -> L3
        L3:
            return
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator r1) {
            r0 = this;
            return
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator r1) {
            r0 = this;
            return
    }

    public void onAnimationUpdate(android.animation.ValueAnimator r1) {
            r0 = this;
            return
    }

    public abstract void recycleSelf();

    protected void resetAnimator() {
            r1 = this;
            android.animation.ObjectAnimator r0 = r1.animator
            r0.removeAllListeners()
            android.animation.ObjectAnimator r0 = r1.animator
            r0.removeAllUpdateListeners()
            android.animation.ObjectAnimator r0 = r1.animator
            r0.reverse()
            android.animation.ObjectAnimator r0 = r1.animator
            r0.addUpdateListener(r1)
            android.animation.ObjectAnimator r0 = r1.animator
            r0.addListener(r1)
            return
    }

    @Override // java.lang.Runnable
    @android.annotation.SuppressLint({"NewApi"})
    public void run() {
            r1 = this;
            android.animation.ObjectAnimator r0 = r1.animator
            r0.start()
            return
    }

    public void setPhase(float r1) {
            r0 = this;
            r0.phase = r1
            return
    }
}
