package com.github.mikephil.charting.jobs;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class MoveViewJob extends com.github.mikephil.charting.jobs.ViewPortJob {
    private static com.github.mikephil.charting.utils.ObjectPool<com.github.mikephil.charting.jobs.MoveViewJob> pool;

    static {
            com.github.mikephil.charting.jobs.MoveViewJob r0 = new com.github.mikephil.charting.jobs.MoveViewJob
            r4 = 0
            r5 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            r1 = 2
            com.github.mikephil.charting.utils.ObjectPool r0 = com.github.mikephil.charting.utils.ObjectPool.create(r1, r0)
            com.github.mikephil.charting.jobs.MoveViewJob.pool = r0
            r1 = 1056964608(0x3f000000, float:0.5)
            r0.setReplenishPercentage(r1)
            return
    }

    public MoveViewJob(com.github.mikephil.charting.utils.ViewPortHandler r1, float r2, float r3, com.github.mikephil.charting.utils.Transformer r4, android.view.View r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public static com.github.mikephil.charting.jobs.MoveViewJob getInstance(com.github.mikephil.charting.utils.ViewPortHandler r1, float r2, float r3, com.github.mikephil.charting.utils.Transformer r4, android.view.View r5) {
            com.github.mikephil.charting.utils.ObjectPool<com.github.mikephil.charting.jobs.MoveViewJob> r0 = com.github.mikephil.charting.jobs.MoveViewJob.pool
            com.github.mikephil.charting.utils.ObjectPool$Poolable r0 = r0.get()
            com.github.mikephil.charting.jobs.MoveViewJob r0 = (com.github.mikephil.charting.jobs.MoveViewJob) r0
            r0.mViewPortHandler = r1
            r0.xValue = r2
            r0.yValue = r3
            r0.mTrans = r4
            r0.view = r5
            return r0
    }

    public static void recycleInstance(com.github.mikephil.charting.jobs.MoveViewJob r1) {
            com.github.mikephil.charting.utils.ObjectPool<com.github.mikephil.charting.jobs.MoveViewJob> r0 = com.github.mikephil.charting.jobs.MoveViewJob.pool
            r0.recycle(r1)
            return
    }

    @Override // com.github.mikephil.charting.utils.ObjectPool.Poolable
    protected com.github.mikephil.charting.utils.ObjectPool.Poolable instantiate() {
            r6 = this;
            com.github.mikephil.charting.jobs.MoveViewJob r0 = new com.github.mikephil.charting.jobs.MoveViewJob
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r6.mViewPortHandler
            float r2 = r6.xValue
            float r3 = r6.yValue
            com.github.mikephil.charting.utils.Transformer r4 = r6.mTrans
            android.view.View r5 = r6.view
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // java.lang.Runnable
    public void run() {
            r3 = this;
            float[] r0 = r3.pts
            r1 = 0
            float r2 = r3.xValue
            r0[r1] = r2
            r1 = 1
            float r2 = r3.yValue
            r0[r1] = r2
            com.github.mikephil.charting.utils.Transformer r1 = r3.mTrans
            r1.pointValuesToPixel(r0)
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r3.mViewPortHandler
            float[] r1 = r3.pts
            android.view.View r2 = r3.view
            r0.centerViewPort(r1, r2)
            recycleInstance(r3)
            return
    }
}
