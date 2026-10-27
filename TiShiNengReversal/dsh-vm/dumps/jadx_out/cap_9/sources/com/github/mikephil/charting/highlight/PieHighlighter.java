package com.github.mikephil.charting.highlight;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class PieHighlighter extends com.github.mikephil.charting.highlight.PieRadarHighlighter<com.github.mikephil.charting.charts.PieChart> {
    public PieHighlighter(com.github.mikephil.charting.charts.PieChart r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.github.mikephil.charting.highlight.PieRadarHighlighter
    protected com.github.mikephil.charting.highlight.Highlight getClosestHighlight(int r10, float r11, float r12) {
            r9 = this;
            T extends com.github.mikephil.charting.charts.PieRadarChartBase r0 = r9.mChart
            com.github.mikephil.charting.charts.PieChart r0 = (com.github.mikephil.charting.charts.PieChart) r0
            com.github.mikephil.charting.data.ChartData r0 = r0.getData()
            com.github.mikephil.charting.data.PieData r0 = (com.github.mikephil.charting.data.PieData) r0
            com.github.mikephil.charting.interfaces.datasets.IPieDataSet r0 = r0.getDataSet()
            com.github.mikephil.charting.data.Entry r1 = r0.getEntryForIndex(r10)
            com.github.mikephil.charting.highlight.Highlight r2 = new com.github.mikephil.charting.highlight.Highlight
            float r3 = (float) r10
            float r4 = r1.getY()
            r7 = 0
            com.github.mikephil.charting.components.YAxis$AxisDependency r8 = r0.getAxisDependency()
            r5 = r11
            r6 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r2
    }
}
