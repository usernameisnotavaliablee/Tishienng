package com.github.mikephil.charting.jobs;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"NewApi"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class AnimatedZoomJob extends com.github.mikephil.charting.jobs.AnimatedViewPortJob implements android.animation.Animator.AnimatorListener {
    private static com.github.mikephil.charting.utils.ObjectPool<com.github.mikephil.charting.jobs.AnimatedZoomJob> pool;
    protected android.graphics.Matrix mOnAnimationUpdateMatrixBuffer;
    protected float xAxisRange;
    protected com.github.mikephil.charting.components.YAxis yAxis;
    protected float zoomCenterX;
    protected float zoomCenterY;
    protected float zoomOriginX;
    protected float zoomOriginY;

    static {
            com.github.mikephil.charting.jobs.AnimatedZoomJob r0 = new com.github.mikephil.charting.jobs.AnimatedZoomJob
            r13 = 0
            r14 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1 = 8
            com.github.mikephil.charting.utils.ObjectPool r0 = com.github.mikephil.charting.utils.ObjectPool.create(r1, r0)
            com.github.mikephil.charting.jobs.AnimatedZoomJob.pool = r0
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    public AnimatedZoomJob(com.github.mikephil.charting.utils.ViewPortHandler r11, android.view.View r12, com.github.mikephil.charting.utils.Transformer r13, com.github.mikephil.charting.components.YAxis r14, float r15, float r16, float r17, float r18, float r19, float r20, float r21, float r22, float r23, long r24) {
            r10 = this;
            r0 = r10
            r1 = r11
            r5 = r12
            r4 = r13
            r2 = r16
            r3 = r17
            r6 = r18
            r7 = r19
            r8 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            android.graphics.Matrix r11 = new android.graphics.Matrix
            r11.<init>()
            r10.mOnAnimationUpdateMatrixBuffer = r11
            r11 = r20
            r10.zoomCenterX = r11
            r11 = r21
            r10.zoomCenterY = r11
            r11 = r22
            r10.zoomOriginX = r11
            r11 = r23
            r10.zoomOriginY = r11
            android.animation.ObjectAnimator r11 = r10.animator
            r11.addListener(r10)
            r10.yAxis = r14
            r10.xAxisRange = r15
            return
    }

    public static com.github.mikephil.charting.jobs.AnimatedZoomJob getInstance(com.github.mikephil.charting.utils.ViewPortHandler r0, android.view.View r1, com.github.mikephil.charting.utils.Transformer r2, com.github.mikephil.charting.components.YAxis r3, float r4, float r5, float r6, float r7, float r8, float r9, float r10, float r11, float r12, long r13) {
            com.github.mikephil.charting.utils.ObjectPool<com.github.mikephil.charting.jobs.AnimatedZoomJob> r9 = com.github.mikephil.charting.jobs.AnimatedZoomJob.pool
            com.github.mikephil.charting.utils.ObjectPool$Poolable r9 = r9.get()
            com.github.mikephil.charting.jobs.AnimatedZoomJob r9 = (com.github.mikephil.charting.jobs.AnimatedZoomJob) r9
            r9.mViewPortHandler = r0
            r9.xValue = r5
            r9.yValue = r6
            r9.mTrans = r2
            r9.view = r1
            r9.xOrigin = r7
            r9.yOrigin = r8
            r9.yAxis = r3
            r9.xAxisRange = r4
            r9.resetAnimator()
            android.animation.ObjectAnimator r0 = r9.animator
            r0.setDuration(r13)
            return r9
    }

    @Override // com.github.mikephil.charting.utils.ObjectPool.Poolable
    protected com.github.mikephil.charting.utils.ObjectPool.Poolable instantiate() {
            r16 = this;
            com.github.mikephil.charting.jobs.AnimatedZoomJob r0 = new com.github.mikephil.charting.jobs.AnimatedZoomJob
            r13 = 0
            r14 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
    }

    @Override // com.github.mikephil.charting.jobs.AnimatedViewPortJob, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator r1) {
            r0 = this;
            return
    }

    @Override // com.github.mikephil.charting.jobs.AnimatedViewPortJob, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator r1) {
            r0 = this;
            android.view.View r1 = r0.view
            com.github.mikephil.charting.charts.BarLineChartBase r1 = (com.github.mikephil.charting.charts.BarLineChartBase) r1
            r1.calculateOffsets()
            android.view.View r1 = r0.view
            r1.postInvalidate()
            return
    }

    @Override // com.github.mikephil.charting.jobs.AnimatedViewPortJob, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator r1) {
            r0 = this;
            return
    }

    @Override // com.github.mikephil.charting.jobs.AnimatedViewPortJob, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator r1) {
            r0 = this;
            return
    }

    @Override // com.github.mikephil.charting.jobs.AnimatedViewPortJob, android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator r8) {
            r7 = this;
            float r8 = r7.xOrigin
            float r0 = r7.xValue
            float r0 = r0 - r8
            float r1 = r7.phase
            float r0 = r0 * r1
            float r8 = r8 + r0
            float r0 = r7.yOrigin
            float r2 = r7.yValue
            float r2 = r2 - r0
            float r2 = r2 * r1
            float r0 = r0 + r2
            android.graphics.Matrix r1 = r7.mOnAnimationUpdateMatrixBuffer
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r7.mViewPortHandler
            r2.setZoom(r8, r0, r1)
            com.github.mikephil.charting.utils.ViewPortHandler r8 = r7.mViewPortHandler
            android.view.View r0 = r7.view
            r2 = 0
            r8.refresh(r1, r0, r2)
            com.github.mikephil.charting.components.YAxis r8 = r7.yAxis
            float r8 = r8.mAxisRange
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r7.mViewPortHandler
            float r0 = r0.getScaleY()
            float r8 = r8 / r0
            float r0 = r7.xAxisRange
            com.github.mikephil.charting.utils.ViewPortHandler r3 = r7.mViewPortHandler
            float r3 = r3.getScaleX()
            float r0 = r0 / r3
            float[] r3 = r7.pts
            float r4 = r7.zoomOriginX
            float r5 = r7.zoomCenterX
            r6 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r6
            float r5 = r5 - r0
            float r5 = r5 - r4
            float r0 = r7.phase
            float r5 = r5 * r0
            float r4 = r4 + r5
            r3[r2] = r4
            float r2 = r7.zoomOriginY
            float r4 = r7.zoomCenterY
            float r8 = r8 / r6
            float r4 = r4 + r8
            float r4 = r4 - r2
            float r4 = r4 * r0
            float r2 = r2 + r4
            r8 = 1
            r3[r8] = r2
            com.github.mikephil.charting.utils.Transformer r0 = r7.mTrans
            r0.pointValuesToPixel(r3)
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r7.mViewPortHandler
            float[] r2 = r7.pts
            r0.translate(r2, r1)
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r7.mViewPortHandler
            android.view.View r2 = r7.view
            r0.refresh(r1, r2, r8)
            return
    }

    @Override // com.github.mikephil.charting.jobs.AnimatedViewPortJob
    public void recycleSelf() {
            r0 = this;
            return
    }
}
