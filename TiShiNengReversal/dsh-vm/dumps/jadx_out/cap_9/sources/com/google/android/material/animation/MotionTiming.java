package com.google.android.material.animation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class MotionTiming {
    private long delay;
    private long duration;

    @androidx.annotation.Nullable
    private android.animation.TimeInterpolator interpolator;
    private int repeatCount;
    private int repeatMode;

    public MotionTiming(long r2, long r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.interpolator = r0
            r0 = 0
            r1.repeatCount = r0
            r0 = 1
            r1.repeatMode = r0
            r1.delay = r2
            r1.duration = r4
            return
    }

    public MotionTiming(long r2, long r4, @androidx.annotation.NonNull android.animation.TimeInterpolator r6) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.repeatCount = r0
            r0 = 1
            r1.repeatMode = r0
            r1.delay = r2
            r1.duration = r4
            r1.interpolator = r6
            return
    }

    @androidx.annotation.NonNull
    static com.google.android.material.animation.MotionTiming createFromAnimator(@androidx.annotation.NonNull android.animation.ValueAnimator r6) {
            com.google.android.material.animation.MotionTiming r0 = new com.google.android.material.animation.MotionTiming
            long r1 = r6.getStartDelay()
            long r3 = r6.getDuration()
            android.animation.TimeInterpolator r5 = getInterpolatorCompat(r6)
            r0.<init>(r1, r3, r5)
            int r1 = r6.getRepeatCount()
            r0.repeatCount = r1
            int r6 = r6.getRepeatMode()
            r0.repeatMode = r6
            return r0
    }

    private static android.animation.TimeInterpolator getInterpolatorCompat(@androidx.annotation.NonNull android.animation.ValueAnimator r1) {
            android.animation.TimeInterpolator r1 = r1.getInterpolator()
            boolean r0 = r1 instanceof android.view.animation.AccelerateDecelerateInterpolator
            if (r0 != 0) goto L19
            if (r1 != 0) goto Lb
            goto L19
        Lb:
            boolean r0 = r1 instanceof android.view.animation.AccelerateInterpolator
            if (r0 == 0) goto L12
            android.animation.TimeInterpolator r1 = com.google.android.material.animation.AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR
            return r1
        L12:
            boolean r0 = r1 instanceof android.view.animation.DecelerateInterpolator
            if (r0 == 0) goto L18
            android.animation.TimeInterpolator r1 = com.google.android.material.animation.AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR
        L18:
            return r1
        L19:
            android.animation.TimeInterpolator r1 = com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR
            return r1
    }

    public void apply(@androidx.annotation.NonNull android.animation.Animator r3) {
            r2 = this;
            long r0 = r2.getDelay()
            r3.setStartDelay(r0)
            long r0 = r2.getDuration()
            r3.setDuration(r0)
            android.animation.TimeInterpolator r0 = r2.getInterpolator()
            r3.setInterpolator(r0)
            boolean r0 = r3 instanceof android.animation.ValueAnimator
            if (r0 == 0) goto L29
            android.animation.ValueAnimator r3 = (android.animation.ValueAnimator) r3
            int r0 = r2.getRepeatCount()
            r3.setRepeatCount(r0)
            int r0 = r2.getRepeatMode()
            r3.setRepeatMode(r0)
        L29:
            return
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r7) {
            r6 = this;
            if (r6 != r7) goto L4
            r7 = 1
            return r7
        L4:
            boolean r0 = r7 instanceof com.google.android.material.animation.MotionTiming
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            com.google.android.material.animation.MotionTiming r7 = (com.google.android.material.animation.MotionTiming) r7
            long r2 = r6.getDelay()
            long r4 = r7.getDelay()
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L19
            return r1
        L19:
            long r2 = r6.getDuration()
            long r4 = r7.getDuration()
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L26
            return r1
        L26:
            int r0 = r6.getRepeatCount()
            int r2 = r7.getRepeatCount()
            if (r0 == r2) goto L31
            return r1
        L31:
            int r0 = r6.getRepeatMode()
            int r2 = r7.getRepeatMode()
            if (r0 == r2) goto L3c
            return r1
        L3c:
            android.animation.TimeInterpolator r0 = r6.getInterpolator()
            java.lang.Class r0 = r0.getClass()
            android.animation.TimeInterpolator r7 = r7.getInterpolator()
            java.lang.Class r7 = r7.getClass()
            boolean r7 = r0.equals(r7)
            return r7
    }

    public long getDelay() {
            r2 = this;
            long r0 = r2.delay
            return r0
    }

    public long getDuration() {
            r2 = this;
            long r0 = r2.duration
            return r0
    }

    @androidx.annotation.Nullable
    public android.animation.TimeInterpolator getInterpolator() {
            r1 = this;
            android.animation.TimeInterpolator r0 = r1.interpolator
            if (r0 == 0) goto L5
            return r0
        L5:
            android.animation.TimeInterpolator r0 = com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR
            return r0
    }

    public int getRepeatCount() {
            r1 = this;
            int r0 = r1.repeatCount
            return r0
    }

    public int getRepeatMode() {
            r1 = this;
            int r0 = r1.repeatMode
            return r0
    }

    public int hashCode() {
            r7 = this;
            long r0 = r7.getDelay()
            long r2 = r7.getDelay()
            r4 = 32
            long r2 = r2 >>> r4
            long r0 = r0 ^ r2
            int r1 = (int) r0
            int r1 = r1 * 31
            long r2 = r7.getDuration()
            long r5 = r7.getDuration()
            long r4 = r5 >>> r4
            long r2 = r2 ^ r4
            int r0 = (int) r2
            int r1 = r1 + r0
            int r1 = r1 * 31
            android.animation.TimeInterpolator r0 = r7.getInterpolator()
            java.lang.Class r0 = r0.getClass()
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r7.getRepeatCount()
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r7.getRepeatMode()
            int r1 = r1 + r0
            return r1
    }

    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 10
            r0.append(r1)
            java.lang.Class r1 = r3.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r3)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = " delay: "
            r0.append(r1)
            long r1 = r3.getDelay()
            r0.append(r1)
            java.lang.String r1 = " duration: "
            r0.append(r1)
            long r1 = r3.getDuration()
            r0.append(r1)
            java.lang.String r1 = " interpolator: "
            r0.append(r1)
            android.animation.TimeInterpolator r1 = r3.getInterpolator()
            java.lang.Class r1 = r1.getClass()
            r0.append(r1)
            java.lang.String r1 = " repeatCount: "
            r0.append(r1)
            int r1 = r3.getRepeatCount()
            r0.append(r1)
            java.lang.String r1 = " repeatMode: "
            r0.append(r1)
            int r1 = r3.getRepeatMode()
            r0.append(r1)
            java.lang.String r1 = "}\n"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
