package com.github.mikephil.charting.jobs;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"NewApi"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class AnimatedMoveViewJob extends com.github.mikephil.charting.jobs.AnimatedViewPortJob {
    private static com.github.mikephil.charting.utils.ObjectPool<com.github.mikephil.charting.jobs.AnimatedMoveViewJob> pool;

    static {
            com.github.mikephil.charting.jobs.AnimatedMoveViewJob r0 = new com.github.mikephil.charting.jobs.AnimatedMoveViewJob
            r7 = 0
            r8 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = 4
            com.github.mikephil.charting.utils.ObjectPool r0 = com.github.mikephil.charting.utils.ObjectPool.create(r1, r0)
            com.github.mikephil.charting.jobs.AnimatedMoveViewJob.pool = r0
            r1 = 1056964608(0x3f000000, float:0.5)
            r0.setReplenishPercentage(r1)
            return
    }

    public AnimatedMoveViewJob(com.github.mikephil.charting.utils.ViewPortHandler r1, float r2, float r3, com.github.mikephil.charting.utils.Transformer r4, android.view.View r5, float r6, float r7, long r8) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static com.github.mikephil.charting.jobs.AnimatedMoveViewJob getInstance(com.github.mikephil.charting.utils.ViewPortHandler r1, float r2, float r3, com.github.mikephil.charting.utils.Transformer r4, android.view.View r5, float r6, float r7, long r8) {
            com.github.mikephil.charting.utils.ObjectPool<com.github.mikephil.charting.jobs.AnimatedMoveViewJob> r0 = com.github.mikephil.charting.jobs.AnimatedMoveViewJob.pool
            com.github.mikephil.charting.utils.ObjectPool$Poolable r0 = r0.get()
            com.github.mikephil.charting.jobs.AnimatedMoveViewJob r0 = (com.github.mikephil.charting.jobs.AnimatedMoveViewJob) r0
            r0.mViewPortHandler = r1
            r0.xValue = r2
            r0.yValue = r3
            r0.mTrans = r4
            r0.view = r5
            r0.xOrigin = r6
            r0.yOrigin = r7
            android.animation.ObjectAnimator r1 = r0.animator
            r1.setDuration(r8)
            return r0
    }

    public static void recycleInstance(com.github.mikephil.charting.jobs.AnimatedMoveViewJob r1) {
            com.github.mikephil.charting.utils.ObjectPool<com.github.mikephil.charting.jobs.AnimatedMoveViewJob> r0 = com.github.mikephil.charting.jobs.AnimatedMoveViewJob.pool
            r0.recycle(r1)
            return
    }

    @Override // com.github.mikephil.charting.utils.ObjectPool.Poolable
    protected com.github.mikephil.charting.utils.ObjectPool.Poolable instantiate() {
            r10 = this;
            com.github.mikephil.charting.jobs.AnimatedMoveViewJob r0 = new com.github.mikephil.charting.jobs.AnimatedMoveViewJob
            r7 = 0
            r8 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    @Override // com.github.mikephil.charting.jobs.AnimatedViewPortJob, android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator r4) {
            r3 = this;
            float[] r4 = r3.pts
            float r0 = r3.xOrigin
            float r1 = r3.xValue
            float r1 = r1 - r0
            float r2 = r3.phase
            float r1 = r1 * r2
            float r0 = r0 + r1
            r1 = 0
            r4[r1] = r0
            float r0 = r3.yOrigin
            float r1 = r3.yValue
            float r1 = r1 - r0
            float r1 = r1 * r2
            float r0 = r0 + r1
            r1 = 1
            r4[r1] = r0
            com.github.mikephil.charting.utils.Transformer r0 = r3.mTrans
            r0.pointValuesToPixel(r4)
            com.github.mikephil.charting.utils.ViewPortHandler r4 = r3.mViewPortHandler
            float[] r0 = r3.pts
            android.view.View r1 = r3.view
            r4.centerViewPort(r0, r1)
            return
    }

    @Override // com.github.mikephil.charting.jobs.AnimatedViewPortJob
    public void recycleSelf() {
            r0 = this;
            recycleInstance(r0)
            return
    }
}
