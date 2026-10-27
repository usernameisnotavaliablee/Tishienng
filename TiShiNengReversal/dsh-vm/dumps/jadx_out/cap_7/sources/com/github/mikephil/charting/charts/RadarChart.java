package com.github.mikephil.charting.charts;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class RadarChart extends com.github.mikephil.charting.charts.PieRadarChartBase<com.github.mikephil.charting.data.RadarData> {
    private boolean mDrawWeb;
    private float mInnerWebLineWidth;
    private int mSkipWebLineCount;
    private int mWebAlpha;
    private int mWebColor;
    private int mWebColorInner;
    private float mWebLineWidth;
    protected com.github.mikephil.charting.renderer.XAxisRendererRadarChart mXAxisRenderer;
    private com.github.mikephil.charting.components.YAxis mYAxis;
    protected com.github.mikephil.charting.renderer.YAxisRendererRadarChart mYAxisRenderer;

    public RadarChart(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r2 = 1075838976(0x40200000, float:2.5)
            r1.mWebLineWidth = r2
            r2 = 1069547520(0x3fc00000, float:1.5)
            r1.mInnerWebLineWidth = r2
            r2 = 122(0x7a, float:1.71E-43)
            int r0 = android.graphics.Color.rgb(r2, r2, r2)
            r1.mWebColor = r0
            int r2 = android.graphics.Color.rgb(r2, r2, r2)
            r1.mWebColorInner = r2
            r2 = 150(0x96, float:2.1E-43)
            r1.mWebAlpha = r2
            r2 = 1
            r1.mDrawWeb = r2
            r2 = 0
            r1.mSkipWebLineCount = r2
            return
    }

    public RadarChart(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 1075838976(0x40200000, float:2.5)
            r0.mWebLineWidth = r1
            r1 = 1069547520(0x3fc00000, float:1.5)
            r0.mInnerWebLineWidth = r1
            r1 = 122(0x7a, float:1.71E-43)
            int r2 = android.graphics.Color.rgb(r1, r1, r1)
            r0.mWebColor = r2
            int r1 = android.graphics.Color.rgb(r1, r1, r1)
            r0.mWebColorInner = r1
            r1 = 150(0x96, float:2.1E-43)
            r0.mWebAlpha = r1
            r1 = 1
            r0.mDrawWeb = r1
            r1 = 0
            r0.mSkipWebLineCount = r1
            return
    }

    public RadarChart(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 1075838976(0x40200000, float:2.5)
            r0.mWebLineWidth = r1
            r1 = 1069547520(0x3fc00000, float:1.5)
            r0.mInnerWebLineWidth = r1
            r1 = 122(0x7a, float:1.71E-43)
            int r2 = android.graphics.Color.rgb(r1, r1, r1)
            r0.mWebColor = r2
            int r1 = android.graphics.Color.rgb(r1, r1, r1)
            r0.mWebColorInner = r1
            r1 = 150(0x96, float:2.1E-43)
            r0.mWebAlpha = r1
            r1 = 1
            r0.mDrawWeb = r1
            r1 = 0
            r0.mSkipWebLineCount = r1
            return
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    protected void calcMinMax() {
            r4 = this;
            super.calcMinMax()
            com.github.mikephil.charting.components.YAxis r0 = r4.mYAxis
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r1 = r4.mData
            com.github.mikephil.charting.data.RadarData r1 = (com.github.mikephil.charting.data.RadarData) r1
            com.github.mikephil.charting.components.YAxis$AxisDependency r2 = com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT
            float r1 = r1.getYMin(r2)
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r3 = r4.mData
            com.github.mikephil.charting.data.RadarData r3 = (com.github.mikephil.charting.data.RadarData) r3
            float r2 = r3.getYMax(r2)
            r0.calculate(r1, r2)
            com.github.mikephil.charting.components.XAxis r0 = r4.mXAxis
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r1 = r4.mData
            com.github.mikephil.charting.data.RadarData r1 = (com.github.mikephil.charting.data.RadarData) r1
            com.github.mikephil.charting.interfaces.datasets.IDataSet r1 = r1.getMaxEntryCountSet()
            com.github.mikephil.charting.interfaces.datasets.IRadarDataSet r1 = (com.github.mikephil.charting.interfaces.datasets.IRadarDataSet) r1
            int r1 = r1.getEntryCount()
            float r1 = (float) r1
            r2 = 0
            r0.calculate(r2, r1)
            return
    }

    public float getFactor() {
            r3 = this;
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r3.mViewPortHandler
            android.graphics.RectF r0 = r0.getContentRect()
            float r1 = r0.width()
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            float r0 = r0.height()
            float r0 = r0 / r2
            float r0 = java.lang.Math.min(r1, r0)
            com.github.mikephil.charting.components.YAxis r1 = r3.mYAxis
            float r1 = r1.mAxisRange
            float r0 = r0 / r1
            return r0
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public int getIndexForAngle(float r8) {
            r7 = this;
            float r0 = r7.getRotationAngle()
            float r8 = r8 - r0
            float r8 = com.github.mikephil.charting.utils.Utils.getNormalizedAngle(r8)
            float r0 = r7.getSliceAngle()
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r1 = r7.mData
            com.github.mikephil.charting.data.RadarData r1 = (com.github.mikephil.charting.data.RadarData) r1
            com.github.mikephil.charting.interfaces.datasets.IDataSet r1 = r1.getMaxEntryCountSet()
            com.github.mikephil.charting.interfaces.datasets.IRadarDataSet r1 = (com.github.mikephil.charting.interfaces.datasets.IRadarDataSet) r1
            int r1 = r1.getEntryCount()
            r2 = 0
            r3 = 0
        L1d:
            if (r3 >= r1) goto L30
            int r4 = r3 + 1
            float r5 = (float) r4
            float r5 = r5 * r0
            r6 = 1073741824(0x40000000, float:2.0)
            float r6 = r0 / r6
            float r5 = r5 - r6
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 <= 0) goto L2e
            return r3
        L2e:
            r3 = r4
            goto L1d
        L30:
            return r2
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public float getRadius() {
            r3 = this;
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r3.mViewPortHandler
            android.graphics.RectF r0 = r0.getContentRect()
            float r1 = r0.width()
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            float r0 = r0.height()
            float r0 = r0 / r2
            float r0 = java.lang.Math.min(r1, r0)
            return r0
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    protected float getRequiredBaseOffset() {
            r1 = this;
            com.github.mikephil.charting.components.XAxis r0 = r1.mXAxis
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L16
            com.github.mikephil.charting.components.XAxis r0 = r1.mXAxis
            boolean r0 = r0.isDrawLabelsEnabled()
            if (r0 == 0) goto L16
            com.github.mikephil.charting.components.XAxis r0 = r1.mXAxis
            int r0 = r0.mLabelRotatedWidth
            float r0 = (float) r0
            return r0
        L16:
            r0 = 1092616192(0x41200000, float:10.0)
            float r0 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r0)
            return r0
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    protected float getRequiredLegendOffset() {
            r2 = this;
            com.github.mikephil.charting.renderer.LegendRenderer r0 = r2.mLegendRenderer
            android.graphics.Paint r0 = r0.getLabelPaint()
            float r0 = r0.getTextSize()
            r1 = 1082130432(0x40800000, float:4.0)
            float r0 = r0 * r1
            return r0
    }

    public int getSkipWebLineCount() {
            r1 = this;
            int r0 = r1.mSkipWebLineCount
            return r0
    }

    public float getSliceAngle() {
            r2 = this;
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r2.mData
            com.github.mikephil.charting.data.RadarData r0 = (com.github.mikephil.charting.data.RadarData) r0
            com.github.mikephil.charting.interfaces.datasets.IDataSet r0 = r0.getMaxEntryCountSet()
            com.github.mikephil.charting.interfaces.datasets.IRadarDataSet r0 = (com.github.mikephil.charting.interfaces.datasets.IRadarDataSet) r0
            int r0 = r0.getEntryCount()
            float r0 = (float) r0
            r1 = 1135869952(0x43b40000, float:360.0)
            float r1 = r1 / r0
            return r1
    }

    public int getWebAlpha() {
            r1 = this;
            int r0 = r1.mWebAlpha
            return r0
    }

    public int getWebColor() {
            r1 = this;
            int r0 = r1.mWebColor
            return r0
    }

    public int getWebColorInner() {
            r1 = this;
            int r0 = r1.mWebColorInner
            return r0
    }

    public float getWebLineWidth() {
            r1 = this;
            float r0 = r1.mWebLineWidth
            return r0
    }

    public float getWebLineWidthInner() {
            r1 = this;
            float r0 = r1.mInnerWebLineWidth
            return r0
    }

    public com.github.mikephil.charting.components.YAxis getYAxis() {
            r1 = this;
            com.github.mikephil.charting.components.YAxis r0 = r1.mYAxis
            return r0
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public float getYChartMax() {
            r1 = this;
            com.github.mikephil.charting.components.YAxis r0 = r1.mYAxis
            float r0 = r0.mAxisMaximum
            return r0
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public float getYChartMin() {
            r1 = this;
            com.github.mikephil.charting.components.YAxis r0 = r1.mYAxis
            float r0 = r0.mAxisMinimum
            return r0
    }

    public float getYRange() {
            r1 = this;
            com.github.mikephil.charting.components.YAxis r0 = r1.mYAxis
            float r0 = r0.mAxisRange
            return r0
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    protected void init() {
            r3 = this;
            super.init()
            com.github.mikephil.charting.components.YAxis r0 = new com.github.mikephil.charting.components.YAxis
            com.github.mikephil.charting.components.YAxis$AxisDependency r1 = com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT
            r0.<init>(r1)
            r3.mYAxis = r0
            r0 = 1069547520(0x3fc00000, float:1.5)
            float r0 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r0)
            r3.mWebLineWidth = r0
            r0 = 1061158912(0x3f400000, float:0.75)
            float r0 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r0)
            r3.mInnerWebLineWidth = r0
            com.github.mikephil.charting.renderer.RadarChartRenderer r0 = new com.github.mikephil.charting.renderer.RadarChartRenderer
            com.github.mikephil.charting.animation.ChartAnimator r1 = r3.mAnimator
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r3.mViewPortHandler
            r0.<init>(r3, r1, r2)
            r3.mRenderer = r0
            com.github.mikephil.charting.renderer.YAxisRendererRadarChart r0 = new com.github.mikephil.charting.renderer.YAxisRendererRadarChart
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r3.mViewPortHandler
            com.github.mikephil.charting.components.YAxis r2 = r3.mYAxis
            r0.<init>(r1, r2, r3)
            r3.mYAxisRenderer = r0
            com.github.mikephil.charting.renderer.XAxisRendererRadarChart r0 = new com.github.mikephil.charting.renderer.XAxisRendererRadarChart
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r3.mViewPortHandler
            com.github.mikephil.charting.components.XAxis r2 = r3.mXAxis
            r0.<init>(r1, r2, r3)
            r3.mXAxisRenderer = r0
            com.github.mikephil.charting.highlight.RadarHighlighter r0 = new com.github.mikephil.charting.highlight.RadarHighlighter
            r0.<init>(r3)
            r3.mHighlighter = r0
            return
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    public void notifyDataSetChanged() {
            r4 = this;
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r4.mData
            if (r0 != 0) goto L5
            return
        L5:
            r4.calcMinMax()
            com.github.mikephil.charting.renderer.YAxisRendererRadarChart r0 = r4.mYAxisRenderer
            com.github.mikephil.charting.components.YAxis r1 = r4.mYAxis
            float r2 = r1.mAxisMinimum
            float r3 = r1.mAxisMaximum
            boolean r1 = r1.isInverted()
            r0.computeAxis(r2, r3, r1)
            com.github.mikephil.charting.renderer.XAxisRendererRadarChart r0 = r4.mXAxisRenderer
            com.github.mikephil.charting.components.XAxis r1 = r4.mXAxis
            float r2 = r1.mAxisMinimum
            float r1 = r1.mAxisMaximum
            r3 = 0
            r0.computeAxis(r2, r1, r3)
            com.github.mikephil.charting.components.Legend r0 = r4.mLegend
            if (r0 == 0) goto L34
            boolean r0 = r0.isLegendCustom()
            if (r0 != 0) goto L34
            com.github.mikephil.charting.renderer.LegendRenderer r0 = r4.mLegendRenderer
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r1 = r4.mData
            r0.computeLegend(r1)
        L34:
            r4.calculateOffsets()
            return
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.View
    protected void onDraw(android.graphics.Canvas r5) {
            r4 = this;
            super.onDraw(r5)
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r4.mData
            if (r0 != 0) goto L8
            return
        L8:
            com.github.mikephil.charting.components.XAxis r0 = r4.mXAxis
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L1c
            com.github.mikephil.charting.renderer.XAxisRendererRadarChart r0 = r4.mXAxisRenderer
            com.github.mikephil.charting.components.XAxis r1 = r4.mXAxis
            float r2 = r1.mAxisMinimum
            float r1 = r1.mAxisMaximum
            r3 = 0
            r0.computeAxis(r2, r1, r3)
        L1c:
            com.github.mikephil.charting.renderer.XAxisRendererRadarChart r0 = r4.mXAxisRenderer
            r0.renderAxisLabels(r5)
            boolean r0 = r4.mDrawWeb
            if (r0 == 0) goto L2a
            com.github.mikephil.charting.renderer.DataRenderer r0 = r4.mRenderer
            r0.drawExtras(r5)
        L2a:
            com.github.mikephil.charting.components.YAxis r0 = r4.mYAxis
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L3f
            com.github.mikephil.charting.components.YAxis r0 = r4.mYAxis
            boolean r0 = r0.isDrawLimitLinesBehindDataEnabled()
            if (r0 == 0) goto L3f
            com.github.mikephil.charting.renderer.YAxisRendererRadarChart r0 = r4.mYAxisRenderer
            r0.renderLimitLines(r5)
        L3f:
            com.github.mikephil.charting.renderer.DataRenderer r0 = r4.mRenderer
            r0.drawData(r5)
            boolean r0 = r4.valuesToHighlight()
            if (r0 == 0) goto L51
            com.github.mikephil.charting.renderer.DataRenderer r0 = r4.mRenderer
            com.github.mikephil.charting.highlight.Highlight[] r1 = r4.mIndicesToHighlight
            r0.drawHighlighted(r5, r1)
        L51:
            com.github.mikephil.charting.components.YAxis r0 = r4.mYAxis
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L66
            com.github.mikephil.charting.components.YAxis r0 = r4.mYAxis
            boolean r0 = r0.isDrawLimitLinesBehindDataEnabled()
            if (r0 != 0) goto L66
            com.github.mikephil.charting.renderer.YAxisRendererRadarChart r0 = r4.mYAxisRenderer
            r0.renderLimitLines(r5)
        L66:
            com.github.mikephil.charting.renderer.YAxisRendererRadarChart r0 = r4.mYAxisRenderer
            r0.renderAxisLabels(r5)
            com.github.mikephil.charting.renderer.DataRenderer r0 = r4.mRenderer
            r0.drawValues(r5)
            com.github.mikephil.charting.renderer.LegendRenderer r0 = r4.mLegendRenderer
            r0.renderLegend(r5)
            r4.drawDescription(r5)
            r4.drawMarkers(r5)
            return
    }

    public void setDrawWeb(boolean r1) {
            r0 = this;
            r0.mDrawWeb = r1
            return
    }

    public void setSkipWebLineCount(int r2) {
            r1 = this;
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            r1.mSkipWebLineCount = r2
            return
    }

    public void setWebAlpha(int r1) {
            r0 = this;
            r0.mWebAlpha = r1
            return
    }

    public void setWebColor(int r1) {
            r0 = this;
            r0.mWebColor = r1
            return
    }

    public void setWebColorInner(int r1) {
            r0 = this;
            r0.mWebColorInner = r1
            return
    }

    public void setWebLineWidth(float r1) {
            r0 = this;
            float r1 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r1)
            r0.mWebLineWidth = r1
            return
    }

    public void setWebLineWidthInner(float r1) {
            r0 = this;
            float r1 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r1)
            r0.mInnerWebLineWidth = r1
            return
    }
}
