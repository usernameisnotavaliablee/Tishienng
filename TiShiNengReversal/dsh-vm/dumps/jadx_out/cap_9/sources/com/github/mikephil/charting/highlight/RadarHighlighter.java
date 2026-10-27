package com.github.mikephil.charting.highlight;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class RadarHighlighter extends com.github.mikephil.charting.highlight.PieRadarHighlighter<com.github.mikephil.charting.charts.RadarChart> {
    public RadarHighlighter(com.github.mikephil.charting.charts.RadarChart r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.github.mikephil.charting.highlight.PieRadarHighlighter
    protected com.github.mikephil.charting.highlight.Highlight getClosestHighlight(int r6, float r7, float r8) {
            r5 = this;
            java.util.List r6 = r5.getHighlightsAtIndex(r6)
            T extends com.github.mikephil.charting.charts.PieRadarChartBase r0 = r5.mChart
            com.github.mikephil.charting.charts.RadarChart r0 = (com.github.mikephil.charting.charts.RadarChart) r0
            float r7 = r0.distanceToCenter(r7, r8)
            T extends com.github.mikephil.charting.charts.PieRadarChartBase r8 = r5.mChart
            com.github.mikephil.charting.charts.RadarChart r8 = (com.github.mikephil.charting.charts.RadarChart) r8
            float r8 = r8.getFactor()
            float r7 = r7 / r8
            r8 = 0
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r1 = 0
        L1a:
            int r2 = r6.size()
            if (r1 >= r2) goto L38
            java.lang.Object r2 = r6.get(r1)
            com.github.mikephil.charting.highlight.Highlight r2 = (com.github.mikephil.charting.highlight.Highlight) r2
            float r3 = r2.getY()
            float r3 = r3 - r7
            float r3 = java.lang.Math.abs(r3)
            int r4 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r4 >= 0) goto L35
            r8 = r2
            r0 = r3
        L35:
            int r1 = r1 + 1
            goto L1a
        L38:
            return r8
    }

    protected java.util.List<com.github.mikephil.charting.highlight.Highlight> getHighlightsAtIndex(int r15) {
            r14 = this;
            java.util.List<com.github.mikephil.charting.highlight.Highlight> r0 = r14.mHighlightBuffer
            r0.clear()
            T extends com.github.mikephil.charting.charts.PieRadarChartBase r0 = r14.mChart
            com.github.mikephil.charting.charts.RadarChart r0 = (com.github.mikephil.charting.charts.RadarChart) r0
            com.github.mikephil.charting.animation.ChartAnimator r0 = r0.getAnimator()
            float r0 = r0.getPhaseX()
            T extends com.github.mikephil.charting.charts.PieRadarChartBase r1 = r14.mChart
            com.github.mikephil.charting.charts.RadarChart r1 = (com.github.mikephil.charting.charts.RadarChart) r1
            com.github.mikephil.charting.animation.ChartAnimator r1 = r1.getAnimator()
            float r1 = r1.getPhaseY()
            T extends com.github.mikephil.charting.charts.PieRadarChartBase r2 = r14.mChart
            com.github.mikephil.charting.charts.RadarChart r2 = (com.github.mikephil.charting.charts.RadarChart) r2
            float r2 = r2.getSliceAngle()
            T extends com.github.mikephil.charting.charts.PieRadarChartBase r3 = r14.mChart
            com.github.mikephil.charting.charts.RadarChart r3 = (com.github.mikephil.charting.charts.RadarChart) r3
            float r3 = r3.getFactor()
            r4 = 0
            com.github.mikephil.charting.utils.MPPointF r4 = com.github.mikephil.charting.utils.MPPointF.getInstance(r4, r4)
            r5 = 0
            r11 = 0
        L34:
            T extends com.github.mikephil.charting.charts.PieRadarChartBase r5 = r14.mChart
            com.github.mikephil.charting.charts.RadarChart r5 = (com.github.mikephil.charting.charts.RadarChart) r5
            com.github.mikephil.charting.data.ChartData r5 = r5.getData()
            com.github.mikephil.charting.data.RadarData r5 = (com.github.mikephil.charting.data.RadarData) r5
            int r5 = r5.getDataSetCount()
            if (r11 >= r5) goto L9b
            T extends com.github.mikephil.charting.charts.PieRadarChartBase r5 = r14.mChart
            com.github.mikephil.charting.charts.RadarChart r5 = (com.github.mikephil.charting.charts.RadarChart) r5
            com.github.mikephil.charting.data.ChartData r5 = r5.getData()
            com.github.mikephil.charting.data.RadarData r5 = (com.github.mikephil.charting.data.RadarData) r5
            com.github.mikephil.charting.interfaces.datasets.IDataSet r5 = r5.getDataSetByIndex(r11)
            com.github.mikephil.charting.data.Entry r6 = r5.getEntryForIndex(r15)
            float r7 = r6.getY()
            T extends com.github.mikephil.charting.charts.PieRadarChartBase r8 = r14.mChart
            com.github.mikephil.charting.charts.RadarChart r8 = (com.github.mikephil.charting.charts.RadarChart) r8
            float r8 = r8.getYChartMin()
            float r7 = r7 - r8
            T extends com.github.mikephil.charting.charts.PieRadarChartBase r8 = r14.mChart
            com.github.mikephil.charting.charts.RadarChart r8 = (com.github.mikephil.charting.charts.RadarChart) r8
            com.github.mikephil.charting.utils.MPPointF r8 = r8.getCenterOffsets()
            float r7 = r7 * r3
            float r7 = r7 * r1
            r9 = r7
            float r7 = (float) r15
            float r10 = r2 * r7
            float r10 = r10 * r0
            T extends com.github.mikephil.charting.charts.PieRadarChartBase r12 = r14.mChart
            com.github.mikephil.charting.charts.RadarChart r12 = (com.github.mikephil.charting.charts.RadarChart) r12
            float r12 = r12.getRotationAngle()
            float r10 = r10 + r12
            com.github.mikephil.charting.utils.Utils.getPosition(r8, r9, r10, r4)
            java.util.List<com.github.mikephil.charting.highlight.Highlight> r13 = r14.mHighlightBuffer
            r8 = r6
            com.github.mikephil.charting.highlight.Highlight r6 = new com.github.mikephil.charting.highlight.Highlight
            float r8 = r8.getY()
            float r9 = r4.x
            float r10 = r4.y
            com.github.mikephil.charting.components.YAxis$AxisDependency r12 = r5.getAxisDependency()
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r13.add(r6)
            int r11 = r11 + 1
            goto L34
        L9b:
            java.util.List<com.github.mikephil.charting.highlight.Highlight> r15 = r14.mHighlightBuffer
            return r15
    }
}
