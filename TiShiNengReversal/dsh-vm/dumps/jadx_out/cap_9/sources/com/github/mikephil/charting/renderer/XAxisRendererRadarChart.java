package com.github.mikephil.charting.renderer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class XAxisRendererRadarChart extends com.github.mikephil.charting.renderer.XAxisRenderer {
    private com.github.mikephil.charting.charts.RadarChart mChart;

    public XAxisRendererRadarChart(com.github.mikephil.charting.utils.ViewPortHandler r2, com.github.mikephil.charting.components.XAxis r3, com.github.mikephil.charting.charts.RadarChart r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            r1.mChart = r4
            return
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderAxisLabels(android.graphics.Canvas r13) {
            r12 = this;
            com.github.mikephil.charting.components.XAxis r0 = r12.mXAxis
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto Lb8
            com.github.mikephil.charting.components.XAxis r0 = r12.mXAxis
            boolean r0 = r0.isDrawLabelsEnabled()
            if (r0 != 0) goto L12
            goto Lb8
        L12:
            com.github.mikephil.charting.components.XAxis r0 = r12.mXAxis
            float r7 = r0.getLabelRotationAngle()
            r0 = 1056964608(0x3f000000, float:0.5)
            r1 = 1048576000(0x3e800000, float:0.25)
            com.github.mikephil.charting.utils.MPPointF r6 = com.github.mikephil.charting.utils.MPPointF.getInstance(r0, r1)
            android.graphics.Paint r0 = r12.mAxisLabelPaint
            com.github.mikephil.charting.components.XAxis r1 = r12.mXAxis
            android.graphics.Typeface r1 = r1.getTypeface()
            r0.setTypeface(r1)
            android.graphics.Paint r0 = r12.mAxisLabelPaint
            com.github.mikephil.charting.components.XAxis r1 = r12.mXAxis
            float r1 = r1.getTextSize()
            r0.setTextSize(r1)
            android.graphics.Paint r0 = r12.mAxisLabelPaint
            com.github.mikephil.charting.components.XAxis r1 = r12.mXAxis
            int r1 = r1.getTextColor()
            r0.setColor(r1)
            com.github.mikephil.charting.charts.RadarChart r0 = r12.mChart
            float r0 = r0.getSliceAngle()
            com.github.mikephil.charting.charts.RadarChart r1 = r12.mChart
            float r8 = r1.getFactor()
            com.github.mikephil.charting.charts.RadarChart r1 = r12.mChart
            com.github.mikephil.charting.utils.MPPointF r9 = r1.getCenterOffsets()
            r1 = 0
            com.github.mikephil.charting.utils.MPPointF r10 = com.github.mikephil.charting.utils.MPPointF.getInstance(r1, r1)
            r1 = 0
            r11 = 0
        L5a:
            com.github.mikephil.charting.charts.RadarChart r1 = r12.mChart
            com.github.mikephil.charting.data.ChartData r1 = r1.getData()
            com.github.mikephil.charting.data.RadarData r1 = (com.github.mikephil.charting.data.RadarData) r1
            com.github.mikephil.charting.interfaces.datasets.IDataSet r1 = r1.getMaxEntryCountSet()
            com.github.mikephil.charting.interfaces.datasets.IRadarDataSet r1 = (com.github.mikephil.charting.interfaces.datasets.IRadarDataSet) r1
            int r1 = r1.getEntryCount()
            if (r11 >= r1) goto Laf
            com.github.mikephil.charting.components.XAxis r1 = r12.mXAxis
            com.github.mikephil.charting.formatter.ValueFormatter r1 = r1.getValueFormatter()
            float r2 = (float) r11
            com.github.mikephil.charting.components.XAxis r3 = r12.mXAxis
            java.lang.String r3 = r1.getAxisLabel(r2, r3)
            float r2 = r2 * r0
            com.github.mikephil.charting.charts.RadarChart r1 = r12.mChart
            float r1 = r1.getRotationAngle()
            float r2 = r2 + r1
            r1 = 1135869952(0x43b40000, float:360.0)
            float r2 = r2 % r1
            com.github.mikephil.charting.charts.RadarChart r1 = r12.mChart
            float r1 = r1.getYRange()
            float r1 = r1 * r8
            com.github.mikephil.charting.components.XAxis r4 = r12.mXAxis
            int r4 = r4.mLabelRotatedWidth
            float r4 = (float) r4
            r5 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r5
            float r1 = r1 + r4
            com.github.mikephil.charting.utils.Utils.getPosition(r9, r1, r2, r10)
            float r4 = r10.x
            float r1 = r10.y
            com.github.mikephil.charting.components.XAxis r2 = r12.mXAxis
            int r2 = r2.mLabelRotatedHeight
            float r2 = (float) r2
            float r2 = r2 / r5
            float r5 = r1 - r2
            r1 = r12
            r2 = r13
            r1.drawLabel(r2, r3, r4, r5, r6, r7)
            int r11 = r11 + 1
            goto L5a
        Laf:
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(r9)
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(r10)
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(r6)
        Lb8:
            return
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderLimitLines(android.graphics.Canvas r1) {
            r0 = this;
            return
    }
}
