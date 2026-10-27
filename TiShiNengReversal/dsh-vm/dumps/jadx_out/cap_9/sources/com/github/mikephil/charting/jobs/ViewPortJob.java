package com.github.mikephil.charting.jobs;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class ViewPortJob extends com.github.mikephil.charting.utils.ObjectPool.Poolable implements java.lang.Runnable {
    protected com.github.mikephil.charting.utils.Transformer mTrans;
    protected com.github.mikephil.charting.utils.ViewPortHandler mViewPortHandler;
    protected float[] pts;
    protected android.view.View view;
    protected float xValue;
    protected float yValue;

    public ViewPortJob(com.github.mikephil.charting.utils.ViewPortHandler r2, float r3, float r4, com.github.mikephil.charting.utils.Transformer r5, android.view.View r6) {
            r1 = this;
            r1.<init>()
            r0 = 2
            float[] r0 = new float[r0]
            r1.pts = r0
            r1.mViewPortHandler = r2
            r1.xValue = r3
            r1.yValue = r4
            r1.mTrans = r5
            r1.view = r6
            return
    }

    public float getXValue() {
            r1 = this;
            float r0 = r1.xValue
            return r0
    }

    public float getYValue() {
            r1 = this;
            float r0 = r1.yValue
            return r0
    }
}
