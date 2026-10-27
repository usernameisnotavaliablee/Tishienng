package com.bytedance.adsdk.lottie.up;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class j extends android.animation.ValueAnimator {
    private final java.util.Set<android.animation.Animator.AnimatorPauseListener> cw;
    private final java.util.Set<android.animation.ValueAnimator.AnimatorUpdateListener> j;
    private final java.util.Set<android.animation.Animator.AnimatorListener> xt;

    public j() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.CopyOnWriteArraySet r0 = new java.util.concurrent.CopyOnWriteArraySet
            r0.<init>()
            r1.j = r0
            java.util.concurrent.CopyOnWriteArraySet r0 = new java.util.concurrent.CopyOnWriteArraySet
            r0.<init>()
            r1.xt = r0
            java.util.concurrent.CopyOnWriteArraySet r0 = new java.util.concurrent.CopyOnWriteArraySet
            r0.<init>()
            r1.cw = r0
            return
    }

    @Override // android.animation.Animator
    public void addListener(android.animation.Animator.AnimatorListener r2) {
            r1 = this;
            java.util.Set<android.animation.Animator$AnimatorListener> r0 = r1.xt
            r0.add(r2)
            return
    }

    @Override // android.animation.Animator
    public void addPauseListener(android.animation.Animator.AnimatorPauseListener r2) {
            r1 = this;
            java.util.Set<android.animation.Animator$AnimatorPauseListener> r0 = r1.cw
            r0.add(r2)
            return
    }

    @Override // android.animation.ValueAnimator
    public void addUpdateListener(android.animation.ValueAnimator.AnimatorUpdateListener r2) {
            r1 = this;
            java.util.Set<android.animation.ValueAnimator$AnimatorUpdateListener> r0 = r1.j
            r0.add(r2)
            return
    }

    void cw() {
            r2 = this;
            java.util.Set<android.animation.ValueAnimator$AnimatorUpdateListener> r0 = r2.j
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            android.animation.ValueAnimator$AnimatorUpdateListener r1 = (android.animation.ValueAnimator.AnimatorUpdateListener) r1
            r1.onAnimationUpdate(r2)
            goto L6
        L16:
            return
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getStartDelay() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "LottieAnimator does not support getStartDelay."
            r0.<init>(r1)
            throw r0
    }

    void j() {
            r2 = this;
            java.util.Set<android.animation.Animator$AnimatorListener> r0 = r2.xt
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            android.animation.Animator$AnimatorListener r1 = (android.animation.Animator.AnimatorListener) r1
            r1.onAnimationRepeat(r2)
            goto L6
        L16:
            return
    }

    void j(boolean r5) {
            r4 = this;
            java.util.Set<android.animation.Animator$AnimatorListener> r0 = r4.xt
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            android.animation.Animator$AnimatorListener r1 = (android.animation.Animator.AnimatorListener) r1
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            if (r2 < r3) goto L1c
            com.bytedance.adsdk.lottie.up.b.a(r1, r4, r5)
            goto L6
        L1c:
            r1.onAnimationStart(r4)
            goto L6
        L20:
            return
    }

    void r() {
            r2 = this;
            java.util.Set<android.animation.Animator$AnimatorPauseListener> r0 = r2.cw
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            android.animation.Animator$AnimatorPauseListener r1 = (android.animation.Animator.AnimatorPauseListener) r1
            r1.onAnimationPause(r2)
            goto L6
        L16:
            return
    }

    @Override // android.animation.Animator
    public void removeAllListeners() {
            r1 = this;
            java.util.Set<android.animation.Animator$AnimatorListener> r0 = r1.xt
            r0.clear()
            return
    }

    @Override // android.animation.ValueAnimator
    public void removeAllUpdateListeners() {
            r1 = this;
            java.util.Set<android.animation.ValueAnimator$AnimatorUpdateListener> r0 = r1.j
            r0.clear()
            return
    }

    @Override // android.animation.Animator
    public void removeListener(android.animation.Animator.AnimatorListener r2) {
            r1 = this;
            java.util.Set<android.animation.Animator$AnimatorListener> r0 = r1.xt
            r0.remove(r2)
            return
    }

    @Override // android.animation.Animator
    public void removePauseListener(android.animation.Animator.AnimatorPauseListener r2) {
            r1 = this;
            java.util.Set<android.animation.Animator$AnimatorPauseListener> r0 = r1.cw
            r0.remove(r2)
            return
    }

    @Override // android.animation.ValueAnimator
    public void removeUpdateListener(android.animation.ValueAnimator.AnimatorUpdateListener r2) {
            r1 = this;
            java.util.Set<android.animation.ValueAnimator$AnimatorUpdateListener> r0 = r1.j
            r0.remove(r2)
            return
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public /* bridge */ /* synthetic */ android.animation.Animator setDuration(long r1) {
            r0 = this;
            android.animation.ValueAnimator r1 = r0.setDuration(r1)
            return r1
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public android.animation.ValueAnimator setDuration(long r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "LottieAnimator does not support setDuration."
            r1.<init>(r2)
            throw r1
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setInterpolator(android.animation.TimeInterpolator r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "LottieAnimator does not support setInterpolator."
            r2.<init>(r0)
            throw r2
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setStartDelay(long r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "LottieAnimator does not support setStartDelay."
            r1.<init>(r2)
            throw r1
    }

    void up() {
            r2 = this;
            java.util.Set<android.animation.Animator$AnimatorPauseListener> r0 = r2.cw
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            android.animation.Animator$AnimatorPauseListener r1 = (android.animation.Animator.AnimatorPauseListener) r1
            r1.onAnimationResume(r2)
            goto L6
        L16:
            return
    }

    void xt() {
            r2 = this;
            java.util.Set<android.animation.Animator$AnimatorListener> r0 = r2.xt
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            android.animation.Animator$AnimatorListener r1 = (android.animation.Animator.AnimatorListener) r1
            r1.onAnimationCancel(r2)
            goto L6
        L16:
            return
    }

    void xt(boolean r5) {
            r4 = this;
            java.util.Set<android.animation.Animator$AnimatorListener> r0 = r4.xt
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            android.animation.Animator$AnimatorListener r1 = (android.animation.Animator.AnimatorListener) r1
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            if (r2 < r3) goto L1c
            com.bytedance.adsdk.lottie.up.a.a(r1, r4, r5)
            goto L6
        L1c:
            r1.onAnimationEnd(r4)
            goto L6
        L20:
            return
    }
}
