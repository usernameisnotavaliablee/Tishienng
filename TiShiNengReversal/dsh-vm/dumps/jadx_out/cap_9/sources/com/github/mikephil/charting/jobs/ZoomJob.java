package com.github.mikephil.charting.jobs;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class ZoomJob extends com.github.mikephil.charting.jobs.ViewPortJob {
    private static com.github.mikephil.charting.utils.ObjectPool<com.github.mikephil.charting.jobs.ZoomJob> pool;
    protected com.github.mikephil.charting.components.YAxis.AxisDependency axisDependency;
    protected android.graphics.Matrix mRunMatrixBuffer;
    protected float scaleX;
    protected float scaleY;

    static {
            com.github.mikephil.charting.jobs.ZoomJob r0 = new com.github.mikephil.charting.jobs.ZoomJob
            r7 = 0
            r8 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = 1
            com.github.mikephil.charting.utils.ObjectPool r0 = com.github.mikephil.charting.utils.ObjectPool.create(r1, r0)
            com.github.mikephil.charting.jobs.ZoomJob.pool = r0
            r1 = 1056964608(0x3f000000, float:0.5)
            r0.setReplenishPercentage(r1)
            return
    }

    public ZoomJob(com.github.mikephil.charting.utils.ViewPortHandler r7, float r8, float r9, float r10, float r11, com.github.mikephil.charting.utils.Transformer r12, com.github.mikephil.charting.components.YAxis.AxisDependency r13, android.view.View r14) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            android.graphics.Matrix r7 = new android.graphics.Matrix
            r7.<init>()
            r0.mRunMatrixBuffer = r7
            r0.scaleX = r8
            r0.scaleY = r9
            r0.axisDependency = r13
            return
    }

    public static com.github.mikephil.charting.jobs.ZoomJob getInstance(com.github.mikephil.charting.utils.ViewPortHandler r1, float r2, float r3, float r4, float r5, com.github.mikephil.charting.utils.Transformer r6, com.github.mikephil.charting.components.YAxis.AxisDependency r7, android.view.View r8) {
            com.github.mikephil.charting.utils.ObjectPool<com.github.mikephil.charting.jobs.ZoomJob> r0 = com.github.mikephil.charting.jobs.ZoomJob.pool
            com.github.mikephil.charting.utils.ObjectPool$Poolable r0 = r0.get()
            com.github.mikephil.charting.jobs.ZoomJob r0 = (com.github.mikephil.charting.jobs.ZoomJob) r0
            r0.xValue = r4
            r0.yValue = r5
            r0.scaleX = r2
            r0.scaleY = r3
            r0.mViewPortHandler = r1
            r0.mTrans = r6
            r0.axisDependency = r7
            r0.view = r8
            return r0
    }

    public static void recycleInstance(com.github.mikephil.charting.jobs.ZoomJob r1) {
            com.github.mikephil.charting.utils.ObjectPool<com.github.mikephil.charting.jobs.ZoomJob> r0 = com.github.mikephil.charting.jobs.ZoomJob.pool
            r0.recycle(r1)
            return
    }

    @Override // com.github.mikephil.charting.utils.ObjectPool.Poolable
    protected com.github.mikephil.charting.utils.ObjectPool.Poolable instantiate() {
            r9 = this;
            com.github.mikephil.charting.jobs.ZoomJob r0 = new com.github.mikephil.charting.jobs.ZoomJob
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

    @Override // java.lang.Runnable
    public void run() {
            r7 = this;
            android.graphics.Matrix r0 = r7.mRunMatrixBuffer
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r7.mViewPortHandler
            float r2 = r7.scaleX
            float r3 = r7.scaleY
            r1.zoom(r2, r3, r0)
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r7.mViewPortHandler
            android.view.View r2 = r7.view
            r3 = 0
            r1.refresh(r0, r2, r3)
            android.view.View r1 = r7.view
            com.github.mikephil.charting.charts.BarLineChartBase r1 = (com.github.mikephil.charting.charts.BarLineChartBase) r1
            com.github.mikephil.charting.components.YAxis$AxisDependency r2 = r7.axisDependency
            com.github.mikephil.charting.components.YAxis r1 = r1.getAxis(r2)
            float r1 = r1.mAxisRange
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r7.mViewPortHandler
            float r2 = r2.getScaleY()
            float r1 = r1 / r2
            android.view.View r2 = r7.view
            com.github.mikephil.charting.charts.BarLineChartBase r2 = (com.github.mikephil.charting.charts.BarLineChartBase) r2
            com.github.mikephil.charting.components.XAxis r2 = r2.getXAxis()
            float r2 = r2.mAxisRange
            com.github.mikephil.charting.utils.ViewPortHandler r4 = r7.mViewPortHandler
            float r4 = r4.getScaleX()
            float r2 = r2 / r4
            float[] r4 = r7.pts
            float r5 = r7.xValue
            r6 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r6
            float r5 = r5 - r2
            r4[r3] = r5
            float r2 = r7.yValue
            float r1 = r1 / r6
            float r2 = r2 + r1
            r1 = 1
            r4[r1] = r2
            com.github.mikephil.charting.utils.Transformer r1 = r7.mTrans
            r1.pointValuesToPixel(r4)
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r7.mViewPortHandler
            float[] r2 = r7.pts
            r1.translate(r2, r0)
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r7.mViewPortHandler
            android.view.View r2 = r7.view
            r1.refresh(r0, r2, r3)
            android.view.View r0 = r7.view
            com.github.mikephil.charting.charts.BarLineChartBase r0 = (com.github.mikephil.charting.charts.BarLineChartBase) r0
            r0.calculateOffsets()
            android.view.View r0 = r7.view
            r0.postInvalidate()
            recycleInstance(r7)
            return
    }
}
