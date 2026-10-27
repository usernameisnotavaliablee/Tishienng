package com.github.mikephil.charting.renderer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class YAxisRendererRadarChart extends com.github.mikephil.charting.renderer.YAxisRenderer {
    private com.github.mikephil.charting.charts.RadarChart mChart;
    private android.graphics.Path mRenderLimitLinesPathBuffer;

    public YAxisRendererRadarChart(com.github.mikephil.charting.utils.ViewPortHandler r2, com.github.mikephil.charting.components.YAxis r3, com.github.mikephil.charting.charts.RadarChart r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
            r1.mRenderLimitLinesPathBuffer = r2
            r1.mChart = r4
            return
    }

    @Override // com.github.mikephil.charting.renderer.AxisRenderer
    protected void computeAxisValues(float r18, float r19) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            com.github.mikephil.charting.components.AxisBase r3 = r0.mAxis
            int r3 = r3.getLabelCount()
            float r4 = r2 - r1
            float r4 = java.lang.Math.abs(r4)
            double r4 = (double) r4
            r6 = 0
            if (r3 == 0) goto L137
            r7 = 0
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 <= 0) goto L137
            boolean r9 = java.lang.Double.isInfinite(r4)
            if (r9 == 0) goto L24
            goto L137
        L24:
            double r9 = (double) r3
            double r9 = r4 / r9
            float r9 = com.github.mikephil.charting.utils.Utils.roundToNextSignificant(r9)
            double r9 = (double) r9
            com.github.mikephil.charting.components.AxisBase r11 = r0.mAxis
            boolean r11 = r11.isGranularityEnabled()
            if (r11 == 0) goto L46
            com.github.mikephil.charting.components.AxisBase r11 = r0.mAxis
            float r11 = r11.getGranularity()
            double r11 = (double) r11
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 >= 0) goto L46
            com.github.mikephil.charting.components.AxisBase r9 = r0.mAxis
            float r9 = r9.getGranularity()
            double r9 = (double) r9
        L46:
            double r11 = java.lang.Math.log10(r9)
            int r11 = (int) r11
            double r11 = (double) r11
            r13 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r11 = java.lang.Math.pow(r13, r11)
            float r11 = com.github.mikephil.charting.utils.Utils.roundToNextSignificant(r11)
            double r11 = (double) r11
            r15 = r7
            double r7 = r9 / r11
            int r7 = (int) r7
            r8 = 5
            if (r7 <= r8) goto L64
            double r11 = r11 * r13
            double r9 = java.lang.Math.floor(r11)
        L64:
            com.github.mikephil.charting.components.AxisBase r7 = r0.mAxis
            boolean r7 = r7.isCenterAxisLabelsEnabled()
            com.github.mikephil.charting.components.AxisBase r8 = r0.mAxis
            boolean r8 = r8.isForceLabelsEnabled()
            r11 = 1
            if (r8 == 0) goto L92
            float r2 = (float) r4
            int r4 = r3 + (-1)
            float r4 = (float) r4
            float r2 = r2 / r4
            com.github.mikephil.charting.components.AxisBase r4 = r0.mAxis
            r4.mEntryCount = r3
            float[] r5 = r4.mEntries
            int r5 = r5.length
            if (r5 >= r3) goto L85
            float[] r5 = new float[r3]
            r4.mEntries = r5
        L85:
            r4 = 0
        L86:
            if (r4 >= r3) goto Le1
            com.github.mikephil.charting.components.AxisBase r5 = r0.mAxis
            float[] r5 = r5.mEntries
            r5[r4] = r1
            float r1 = r1 + r2
            int r4 = r4 + 1
            goto L86
        L92:
            int r3 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r3 != 0) goto L98
            r4 = r15
            goto La0
        L98:
            double r4 = (double) r1
            double r4 = r4 / r9
            double r4 = java.lang.Math.ceil(r4)
            double r4 = r4 * r9
        La0:
            if (r7 == 0) goto La3
            double r4 = r4 - r9
        La3:
            if (r3 != 0) goto La7
            r1 = r15
            goto Lb3
        La7:
            double r1 = (double) r2
            double r1 = r1 / r9
            double r1 = java.lang.Math.floor(r1)
            double r1 = r1 * r9
            double r1 = com.github.mikephil.charting.utils.Utils.nextUp(r1)
        Lb3:
            if (r3 == 0) goto Lbf
            r12 = r4
            r3 = r7
        Lb7:
            int r8 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r8 > 0) goto Lc0
            int r3 = r3 + 1
            double r12 = r12 + r9
            goto Lb7
        Lbf:
            r3 = r7
        Lc0:
            int r3 = r3 + r11
            com.github.mikephil.charting.components.AxisBase r1 = r0.mAxis
            r1.mEntryCount = r3
            float[] r2 = r1.mEntries
            int r2 = r2.length
            if (r2 >= r3) goto Lce
            float[] r2 = new float[r3]
            r1.mEntries = r2
        Lce:
            r1 = 0
        Lcf:
            if (r1 >= r3) goto Le1
            int r2 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r2 != 0) goto Ld6
            r4 = r15
        Ld6:
            com.github.mikephil.charting.components.AxisBase r2 = r0.mAxis
            float[] r2 = r2.mEntries
            float r8 = (float) r4
            r2[r1] = r8
            double r4 = r4 + r9
            int r1 = r1 + 1
            goto Lcf
        Le1:
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r4 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r4 >= 0) goto Lf6
            com.github.mikephil.charting.components.AxisBase r1 = r0.mAxis
            double r4 = java.lang.Math.log10(r9)
            double r4 = -r4
            double r4 = java.lang.Math.ceil(r4)
            int r2 = (int) r4
            r1.mDecimals = r2
            goto Lfa
        Lf6:
            com.github.mikephil.charting.components.AxisBase r1 = r0.mAxis
            r1.mDecimals = r6
        Lfa:
            if (r7 == 0) goto L122
            com.github.mikephil.charting.components.AxisBase r1 = r0.mAxis
            float[] r2 = r1.mCenteredEntries
            int r2 = r2.length
            if (r2 >= r3) goto L107
            float[] r2 = new float[r3]
            r1.mCenteredEntries = r2
        L107:
            float[] r1 = r1.mEntries
            r2 = r1[r11]
            r1 = r1[r6]
            float r2 = r2 - r1
            r1 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r1
            r1 = 0
        L112:
            if (r1 >= r3) goto L122
            com.github.mikephil.charting.components.AxisBase r4 = r0.mAxis
            float[] r5 = r4.mCenteredEntries
            float[] r4 = r4.mEntries
            r4 = r4[r1]
            float r4 = r4 + r2
            r5[r1] = r4
            int r1 = r1 + 1
            goto L112
        L122:
            com.github.mikephil.charting.components.AxisBase r1 = r0.mAxis
            float[] r2 = r1.mEntries
            r4 = r2[r6]
            r1.mAxisMinimum = r4
            int r3 = r3 - r11
            r2 = r2[r3]
            r1.mAxisMaximum = r2
            float r2 = r2 - r4
            float r2 = java.lang.Math.abs(r2)
            r1.mAxisRange = r2
            return
        L137:
            com.github.mikephil.charting.components.AxisBase r1 = r0.mAxis
            float[] r2 = new float[r6]
            r1.mEntries = r2
            float[] r2 = new float[r6]
            r1.mCenteredEntries = r2
            r1.mEntryCount = r6
            return
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderAxisLabels(android.graphics.Canvas r10) {
            r9 = this;
            com.github.mikephil.charting.components.YAxis r0 = r9.mYAxis
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L90
            com.github.mikephil.charting.components.YAxis r0 = r9.mYAxis
            boolean r0 = r0.isDrawLabelsEnabled()
            if (r0 != 0) goto L12
            goto L90
        L12:
            android.graphics.Paint r0 = r9.mAxisLabelPaint
            com.github.mikephil.charting.components.YAxis r1 = r9.mYAxis
            android.graphics.Typeface r1 = r1.getTypeface()
            r0.setTypeface(r1)
            android.graphics.Paint r0 = r9.mAxisLabelPaint
            com.github.mikephil.charting.components.YAxis r1 = r9.mYAxis
            float r1 = r1.getTextSize()
            r0.setTextSize(r1)
            android.graphics.Paint r0 = r9.mAxisLabelPaint
            com.github.mikephil.charting.components.YAxis r1 = r9.mYAxis
            int r1 = r1.getTextColor()
            r0.setColor(r1)
            com.github.mikephil.charting.charts.RadarChart r0 = r9.mChart
            com.github.mikephil.charting.utils.MPPointF r0 = r0.getCenterOffsets()
            r1 = 0
            com.github.mikephil.charting.utils.MPPointF r1 = com.github.mikephil.charting.utils.MPPointF.getInstance(r1, r1)
            com.github.mikephil.charting.charts.RadarChart r2 = r9.mChart
            float r2 = r2.getFactor()
            com.github.mikephil.charting.components.YAxis r3 = r9.mYAxis
            boolean r3 = r3.isDrawBottomYLabelEntryEnabled()
            r3 = r3 ^ 1
            com.github.mikephil.charting.components.YAxis r4 = r9.mYAxis
            boolean r4 = r4.isDrawTopYLabelEntryEnabled()
            if (r4 == 0) goto L59
            com.github.mikephil.charting.components.YAxis r4 = r9.mYAxis
            int r4 = r4.mEntryCount
            goto L5f
        L59:
            com.github.mikephil.charting.components.YAxis r4 = r9.mYAxis
            int r4 = r4.mEntryCount
            int r4 = r4 + (-1)
        L5f:
            if (r3 >= r4) goto L8a
            com.github.mikephil.charting.components.YAxis r5 = r9.mYAxis
            float[] r6 = r5.mEntries
            r6 = r6[r3]
            float r5 = r5.mAxisMinimum
            float r6 = r6 - r5
            float r6 = r6 * r2
            com.github.mikephil.charting.charts.RadarChart r5 = r9.mChart
            float r5 = r5.getRotationAngle()
            com.github.mikephil.charting.utils.Utils.getPosition(r0, r6, r5, r1)
            com.github.mikephil.charting.components.YAxis r5 = r9.mYAxis
            java.lang.String r5 = r5.getFormattedLabel(r3)
            float r6 = r1.x
            r7 = 1092616192(0x41200000, float:10.0)
            float r6 = r6 + r7
            float r7 = r1.y
            android.graphics.Paint r8 = r9.mAxisLabelPaint
            r10.drawText(r5, r6, r7, r8)
            int r3 = r3 + 1
            goto L5f
        L8a:
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(r0)
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(r1)
        L90:
            return
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderLimitLines(android.graphics.Canvas r13) {
            r12 = this;
            com.github.mikephil.charting.components.YAxis r0 = r12.mYAxis
            java.util.List r0 = r0.getLimitLines()
            if (r0 != 0) goto L9
            return
        L9:
            com.github.mikephil.charting.charts.RadarChart r1 = r12.mChart
            float r1 = r1.getSliceAngle()
            com.github.mikephil.charting.charts.RadarChart r2 = r12.mChart
            float r2 = r2.getFactor()
            com.github.mikephil.charting.charts.RadarChart r3 = r12.mChart
            com.github.mikephil.charting.utils.MPPointF r3 = r3.getCenterOffsets()
            r4 = 0
            com.github.mikephil.charting.utils.MPPointF r4 = com.github.mikephil.charting.utils.MPPointF.getInstance(r4, r4)
            r5 = 0
            r6 = 0
        L22:
            int r7 = r0.size()
            if (r6 >= r7) goto La4
            java.lang.Object r7 = r0.get(r6)
            com.github.mikephil.charting.components.LimitLine r7 = (com.github.mikephil.charting.components.LimitLine) r7
            boolean r8 = r7.isEnabled()
            if (r8 != 0) goto L35
            goto La0
        L35:
            android.graphics.Paint r8 = r12.mLimitLinePaint
            int r9 = r7.getLineColor()
            r8.setColor(r9)
            android.graphics.Paint r8 = r12.mLimitLinePaint
            android.graphics.DashPathEffect r9 = r7.getDashPathEffect()
            r8.setPathEffect(r9)
            android.graphics.Paint r8 = r12.mLimitLinePaint
            float r9 = r7.getLineWidth()
            r8.setStrokeWidth(r9)
            float r7 = r7.getLimit()
            com.github.mikephil.charting.charts.RadarChart r8 = r12.mChart
            float r8 = r8.getYChartMin()
            float r7 = r7 - r8
            float r7 = r7 * r2
            android.graphics.Path r8 = r12.mRenderLimitLinesPathBuffer
            r8.reset()
            r9 = 0
        L63:
            com.github.mikephil.charting.charts.RadarChart r10 = r12.mChart
            com.github.mikephil.charting.data.ChartData r10 = r10.getData()
            com.github.mikephil.charting.data.RadarData r10 = (com.github.mikephil.charting.data.RadarData) r10
            com.github.mikephil.charting.interfaces.datasets.IDataSet r10 = r10.getMaxEntryCountSet()
            com.github.mikephil.charting.interfaces.datasets.IRadarDataSet r10 = (com.github.mikephil.charting.interfaces.datasets.IRadarDataSet) r10
            int r10 = r10.getEntryCount()
            if (r9 >= r10) goto L98
            float r10 = (float) r9
            float r10 = r10 * r1
            com.github.mikephil.charting.charts.RadarChart r11 = r12.mChart
            float r11 = r11.getRotationAngle()
            float r10 = r10 + r11
            com.github.mikephil.charting.utils.Utils.getPosition(r3, r7, r10, r4)
            if (r9 != 0) goto L8e
            float r10 = r4.x
            float r11 = r4.y
            r8.moveTo(r10, r11)
            goto L95
        L8e:
            float r10 = r4.x
            float r11 = r4.y
            r8.lineTo(r10, r11)
        L95:
            int r9 = r9 + 1
            goto L63
        L98:
            r8.close()
            android.graphics.Paint r7 = r12.mLimitLinePaint
            r13.drawPath(r8, r7)
        La0:
            int r6 = r6 + 1
            goto L22
        La4:
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(r3)
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(r4)
            return
    }
}
