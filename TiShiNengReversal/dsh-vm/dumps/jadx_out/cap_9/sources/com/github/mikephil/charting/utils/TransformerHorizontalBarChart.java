package com.github.mikephil.charting.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class TransformerHorizontalBarChart extends com.github.mikephil.charting.utils.Transformer {
    public TransformerHorizontalBarChart(com.github.mikephil.charting.utils.ViewPortHandler r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.github.mikephil.charting.utils.Transformer
    public void prepareMatrixOffset(boolean r4) {
            r3 = this;
            android.graphics.Matrix r0 = r3.mMatrixOffset
            r0.reset()
            if (r4 != 0) goto L20
            android.graphics.Matrix r4 = r3.mMatrixOffset
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r3.mViewPortHandler
            float r0 = r0.offsetLeft()
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r3.mViewPortHandler
            float r1 = r1.getChartHeight()
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r3.mViewPortHandler
            float r2 = r2.offsetBottom()
            float r1 = r1 - r2
            r4.postTranslate(r0, r1)
            return
        L20:
            android.graphics.Matrix r4 = r3.mMatrixOffset
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r3.mViewPortHandler
            float r0 = r0.getChartWidth()
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r3.mViewPortHandler
            float r1 = r1.offsetRight()
            float r0 = r0 - r1
            float r0 = -r0
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r3.mViewPortHandler
            float r1 = r1.getChartHeight()
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r3.mViewPortHandler
            float r2 = r2.offsetBottom()
            float r1 = r1 - r2
            r4.setTranslate(r0, r1)
            android.graphics.Matrix r4 = r3.mMatrixOffset
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = 1065353216(0x3f800000, float:1.0)
            r4.postScale(r0, r1)
            return
    }
}
