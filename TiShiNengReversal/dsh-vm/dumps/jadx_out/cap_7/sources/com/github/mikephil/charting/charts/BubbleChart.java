package com.github.mikephil.charting.charts;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class BubbleChart extends com.github.mikephil.charting.charts.BarLineChartBase<com.github.mikephil.charting.data.BubbleData> implements com.github.mikephil.charting.interfaces.dataprovider.BubbleDataProvider {
    public BubbleChart(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public BubbleChart(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public BubbleChart(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    public com.github.mikephil.charting.data.BubbleData getBubbleData() {
            r1 = this;
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r1.mData
            com.github.mikephil.charting.data.BubbleData r0 = (com.github.mikephil.charting.data.BubbleData) r0
            return r0
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    protected void init() {
            r3 = this;
            super.init()
            com.github.mikephil.charting.renderer.BubbleChartRenderer r0 = new com.github.mikephil.charting.renderer.BubbleChartRenderer
            com.github.mikephil.charting.animation.ChartAnimator r1 = r3.mAnimator
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r3.mViewPortHandler
            r0.<init>(r3, r1, r2)
            r3.mRenderer = r0
            return
    }
}
