package com.github.mikephil.charting.highlight;

import com.github.mikephil.charting.charts.PieRadarChartBase;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class PieRadarHighlighter<T extends com.github.mikephil.charting.charts.PieRadarChartBase> implements com.github.mikephil.charting.highlight.IHighlighter {
    protected T mChart;
    protected java.util.List<com.github.mikephil.charting.highlight.Highlight> mHighlightBuffer;

    public PieRadarHighlighter(T r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mHighlightBuffer = r0
            r1.mChart = r2
            return
    }

    protected abstract com.github.mikephil.charting.highlight.Highlight getClosestHighlight(int r1, float r2, float r3);

    @Override // com.github.mikephil.charting.highlight.IHighlighter
    public com.github.mikephil.charting.highlight.Highlight getHighlight(float r5, float r6) {
            r4 = this;
            T extends com.github.mikephil.charting.charts.PieRadarChartBase r0 = r4.mChart
            float r0 = r0.distanceToCenter(r5, r6)
            T extends com.github.mikephil.charting.charts.PieRadarChartBase r1 = r4.mChart
            float r1 = r1.getRadius()
            r2 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L12
            return r2
        L12:
            T extends com.github.mikephil.charting.charts.PieRadarChartBase r0 = r4.mChart
            float r0 = r0.getAngleForPoint(r5, r6)
            T extends com.github.mikephil.charting.charts.PieRadarChartBase r1 = r4.mChart
            boolean r3 = r1 instanceof com.github.mikephil.charting.charts.PieChart
            if (r3 == 0) goto L27
            com.github.mikephil.charting.animation.ChartAnimator r1 = r1.getAnimator()
            float r1 = r1.getPhaseY()
            float r0 = r0 / r1
        L27:
            T extends com.github.mikephil.charting.charts.PieRadarChartBase r1 = r4.mChart
            int r0 = r1.getIndexForAngle(r0)
            if (r0 < 0) goto L45
            T extends com.github.mikephil.charting.charts.PieRadarChartBase r1 = r4.mChart
            com.github.mikephil.charting.data.ChartData r1 = r1.getData()
            com.github.mikephil.charting.interfaces.datasets.IDataSet r1 = r1.getMaxEntryCountSet()
            int r1 = r1.getEntryCount()
            if (r0 < r1) goto L40
            goto L45
        L40:
            com.github.mikephil.charting.highlight.Highlight r5 = r4.getClosestHighlight(r0, r5, r6)
            return r5
        L45:
            return r2
    }
}
