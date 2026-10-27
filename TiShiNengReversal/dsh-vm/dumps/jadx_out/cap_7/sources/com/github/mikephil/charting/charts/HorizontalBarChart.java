package com.github.mikephil.charting.charts;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class HorizontalBarChart extends com.github.mikephil.charting.charts.BarChart {
    protected float[] mGetPositionBuffer;
    private android.graphics.RectF mOffsetsBuffer;

    public HorizontalBarChart(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.mOffsetsBuffer = r1
            r1 = 2
            float[] r1 = new float[r1]
            r0.mGetPositionBuffer = r1
            return
    }

    public HorizontalBarChart(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.mOffsetsBuffer = r1
            r1 = 2
            float[] r1 = new float[r1]
            r0.mGetPositionBuffer = r1
            return
    }

    public HorizontalBarChart(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.mOffsetsBuffer = r1
            r1 = 2
            float[] r1 = new float[r1]
            r0.mGetPositionBuffer = r1
            return
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void calculateOffsets() {
            r7 = this;
            android.graphics.RectF r0 = r7.mOffsetsBuffer
            r7.calculateLegendOffsets(r0)
            android.graphics.RectF r0 = r7.mOffsetsBuffer
            float r1 = r0.left
            r2 = 0
            float r1 = r1 + r2
            float r3 = r0.top
            float r3 = r3 + r2
            float r4 = r0.right
            float r4 = r4 + r2
            float r0 = r0.bottom
            float r0 = r0 + r2
            com.github.mikephil.charting.components.YAxis r2 = r7.mAxisLeft
            boolean r2 = r2.needsOffset()
            if (r2 == 0) goto L29
            com.github.mikephil.charting.components.YAxis r2 = r7.mAxisLeft
            com.github.mikephil.charting.renderer.YAxisRenderer r5 = r7.mAxisRendererLeft
            android.graphics.Paint r5 = r5.getPaintAxisLabels()
            float r2 = r2.getRequiredHeightSpace(r5)
            float r3 = r3 + r2
        L29:
            com.github.mikephil.charting.components.YAxis r2 = r7.mAxisRight
            boolean r2 = r2.needsOffset()
            if (r2 == 0) goto L3e
            com.github.mikephil.charting.components.YAxis r2 = r7.mAxisRight
            com.github.mikephil.charting.renderer.YAxisRenderer r5 = r7.mAxisRendererRight
            android.graphics.Paint r5 = r5.getPaintAxisLabels()
            float r2 = r2.getRequiredHeightSpace(r5)
            float r0 = r0 + r2
        L3e:
            com.github.mikephil.charting.components.XAxis r2 = r7.mXAxis
            int r5 = r2.mLabelRotatedWidth
            float r5 = (float) r5
            boolean r2 = r2.isEnabled()
            if (r2 == 0) goto L6d
            com.github.mikephil.charting.components.XAxis r2 = r7.mXAxis
            com.github.mikephil.charting.components.XAxis$XAxisPosition r2 = r2.getPosition()
            com.github.mikephil.charting.components.XAxis$XAxisPosition r6 = com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTTOM
            if (r2 != r6) goto L55
            float r1 = r1 + r5
            goto L6d
        L55:
            com.github.mikephil.charting.components.XAxis r2 = r7.mXAxis
            com.github.mikephil.charting.components.XAxis$XAxisPosition r2 = r2.getPosition()
            com.github.mikephil.charting.components.XAxis$XAxisPosition r6 = com.github.mikephil.charting.components.XAxis.XAxisPosition.TOP
            if (r2 != r6) goto L61
        L5f:
            float r4 = r4 + r5
            goto L6d
        L61:
            com.github.mikephil.charting.components.XAxis r2 = r7.mXAxis
            com.github.mikephil.charting.components.XAxis$XAxisPosition r2 = r2.getPosition()
            com.github.mikephil.charting.components.XAxis$XAxisPosition r6 = com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTH_SIDED
            if (r2 != r6) goto L6d
            float r1 = r1 + r5
            goto L5f
        L6d:
            float r2 = r7.getExtraTopOffset()
            float r3 = r3 + r2
            float r2 = r7.getExtraRightOffset()
            float r4 = r4 + r2
            float r2 = r7.getExtraBottomOffset()
            float r0 = r0 + r2
            float r2 = r7.getExtraLeftOffset()
            float r1 = r1 + r2
            float r2 = r7.mMinOffset
            float r2 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r2)
            com.github.mikephil.charting.utils.ViewPortHandler r5 = r7.mViewPortHandler
            float r1 = java.lang.Math.max(r2, r1)
            float r3 = java.lang.Math.max(r2, r3)
            float r4 = java.lang.Math.max(r2, r4)
            float r0 = java.lang.Math.max(r2, r0)
            r5.restrainViewPort(r1, r3, r4, r0)
            boolean r0 = r7.mLogEnabled
            if (r0 == 0) goto La9
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r7.mViewPortHandler
            android.graphics.RectF r0 = r0.getContentRect()
            r0.toString()
        La9:
            r7.prepareOffsetMatrix()
            r7.prepareValuePxMatrix()
            return
    }

    @Override // com.github.mikephil.charting.charts.BarChart
    public void getBarBounds(com.github.mikephil.charting.data.BarEntry r7, android.graphics.RectF r8) {
            r6 = this;
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r6.mData
            com.github.mikephil.charting.data.BarData r0 = (com.github.mikephil.charting.data.BarData) r0
            com.github.mikephil.charting.interfaces.datasets.IDataSet r0 = r0.getDataSetForEntry(r7)
            com.github.mikephil.charting.interfaces.datasets.IBarDataSet r0 = (com.github.mikephil.charting.interfaces.datasets.IBarDataSet) r0
            if (r0 != 0) goto L11
            r7 = 1
            r8.set(r7, r7, r7, r7)
            return
        L11:
            float r1 = r7.getY()
            float r7 = r7.getX()
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r2 = r6.mData
            com.github.mikephil.charting.data.BarData r2 = (com.github.mikephil.charting.data.BarData) r2
            float r2 = r2.getBarWidth()
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            float r3 = r7 - r2
            float r7 = r7 + r2
            r2 = 0
            int r4 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r4 < 0) goto L2e
            r4 = r1
            goto L2f
        L2e:
            r4 = 0
        L2f:
            int r5 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r5 > 0) goto L34
            goto L35
        L34:
            r1 = 0
        L35:
            r8.set(r4, r3, r1, r7)
            com.github.mikephil.charting.components.YAxis$AxisDependency r7 = r0.getAxisDependency()
            com.github.mikephil.charting.utils.Transformer r7 = r6.getTransformer(r7)
            r7.rectValueToPixel(r8)
            return
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public float getHighestVisibleX() {
            r4 = this;
            com.github.mikephil.charting.components.YAxis$AxisDependency r0 = com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT
            com.github.mikephil.charting.utils.Transformer r0 = r4.getTransformer(r0)
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r4.mViewPortHandler
            float r1 = r1.contentLeft()
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r4.mViewPortHandler
            float r2 = r2.contentTop()
            com.github.mikephil.charting.utils.MPPointD r3 = r4.posForGetHighestVisibleX
            r0.getValuesByTouchPoint(r1, r2, r3)
            com.github.mikephil.charting.components.XAxis r0 = r4.mXAxis
            float r0 = r0.mAxisMaximum
            double r0 = (double) r0
            com.github.mikephil.charting.utils.MPPointD r2 = r4.posForGetHighestVisibleX
            double r2 = r2.y
            double r0 = java.lang.Math.min(r0, r2)
            float r0 = (float) r0
            return r0
    }

    @Override // com.github.mikephil.charting.charts.BarChart, com.github.mikephil.charting.charts.Chart
    public com.github.mikephil.charting.highlight.Highlight getHighlightByTouchPoint(float r2, float r3) {
            r1 = this;
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r1.mData
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            com.github.mikephil.charting.highlight.IHighlighter r0 = r1.getHighlighter()
            com.github.mikephil.charting.highlight.Highlight r2 = r0.getHighlight(r3, r2)
            return r2
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public float getLowestVisibleX() {
            r4 = this;
            com.github.mikephil.charting.components.YAxis$AxisDependency r0 = com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT
            com.github.mikephil.charting.utils.Transformer r0 = r4.getTransformer(r0)
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r4.mViewPortHandler
            float r1 = r1.contentLeft()
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r4.mViewPortHandler
            float r2 = r2.contentBottom()
            com.github.mikephil.charting.utils.MPPointD r3 = r4.posForGetLowestVisibleX
            r0.getValuesByTouchPoint(r1, r2, r3)
            com.github.mikephil.charting.components.XAxis r0 = r4.mXAxis
            float r0 = r0.mAxisMinimum
            double r0 = (double) r0
            com.github.mikephil.charting.utils.MPPointD r2 = r4.posForGetLowestVisibleX
            double r2 = r2.y
            double r0 = java.lang.Math.max(r0, r2)
            float r0 = (float) r0
            return r0
    }

    @Override // com.github.mikephil.charting.charts.Chart
    protected float[] getMarkerPosition(com.github.mikephil.charting.highlight.Highlight r4) {
            r3 = this;
            float r0 = r4.getDrawY()
            float r4 = r4.getDrawX()
            r1 = 2
            float[] r1 = new float[r1]
            r2 = 0
            r1[r2] = r0
            r0 = 1
            r1[r0] = r4
            return r1
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public com.github.mikephil.charting.utils.MPPointF getPosition(com.github.mikephil.charting.data.Entry r4, com.github.mikephil.charting.components.YAxis.AxisDependency r5) {
            r3 = this;
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            float[] r0 = r3.mGetPositionBuffer
            float r1 = r4.getY()
            r2 = 0
            r0[r2] = r1
            float r4 = r4.getX()
            r1 = 1
            r0[r1] = r4
            com.github.mikephil.charting.utils.Transformer r4 = r3.getTransformer(r5)
            r4.pointValuesToPixel(r0)
            r4 = r0[r2]
            r5 = r0[r1]
            com.github.mikephil.charting.utils.MPPointF r4 = com.github.mikephil.charting.utils.MPPointF.getInstance(r4, r5)
            return r4
    }

    @Override // com.github.mikephil.charting.charts.BarChart, com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    protected void init() {
            r4 = this;
            com.github.mikephil.charting.utils.HorizontalViewPortHandler r0 = new com.github.mikephil.charting.utils.HorizontalViewPortHandler
            r0.<init>()
            r4.mViewPortHandler = r0
            super.init()
            com.github.mikephil.charting.utils.TransformerHorizontalBarChart r0 = new com.github.mikephil.charting.utils.TransformerHorizontalBarChart
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r4.mViewPortHandler
            r0.<init>(r1)
            r4.mLeftAxisTransformer = r0
            com.github.mikephil.charting.utils.TransformerHorizontalBarChart r0 = new com.github.mikephil.charting.utils.TransformerHorizontalBarChart
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r4.mViewPortHandler
            r0.<init>(r1)
            r4.mRightAxisTransformer = r0
            com.github.mikephil.charting.renderer.HorizontalBarChartRenderer r0 = new com.github.mikephil.charting.renderer.HorizontalBarChartRenderer
            com.github.mikephil.charting.animation.ChartAnimator r1 = r4.mAnimator
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r4.mViewPortHandler
            r0.<init>(r4, r1, r2)
            r4.mRenderer = r0
            com.github.mikephil.charting.highlight.HorizontalBarHighlighter r0 = new com.github.mikephil.charting.highlight.HorizontalBarHighlighter
            r0.<init>(r4)
            r4.setHighlighter(r0)
            com.github.mikephil.charting.renderer.YAxisRendererHorizontalBarChart r0 = new com.github.mikephil.charting.renderer.YAxisRendererHorizontalBarChart
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r4.mViewPortHandler
            com.github.mikephil.charting.components.YAxis r2 = r4.mAxisLeft
            com.github.mikephil.charting.utils.Transformer r3 = r4.mLeftAxisTransformer
            r0.<init>(r1, r2, r3)
            r4.mAxisRendererLeft = r0
            com.github.mikephil.charting.renderer.YAxisRendererHorizontalBarChart r0 = new com.github.mikephil.charting.renderer.YAxisRendererHorizontalBarChart
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r4.mViewPortHandler
            com.github.mikephil.charting.components.YAxis r2 = r4.mAxisRight
            com.github.mikephil.charting.utils.Transformer r3 = r4.mRightAxisTransformer
            r0.<init>(r1, r2, r3)
            r4.mAxisRendererRight = r0
            com.github.mikephil.charting.renderer.XAxisRendererHorizontalBarChart r0 = new com.github.mikephil.charting.renderer.XAxisRendererHorizontalBarChart
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r4.mViewPortHandler
            com.github.mikephil.charting.components.XAxis r2 = r4.mXAxis
            com.github.mikephil.charting.utils.Transformer r3 = r4.mLeftAxisTransformer
            r0.<init>(r1, r2, r3, r4)
            r4.mXAxisRenderer = r0
            return
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    protected void prepareValuePxMatrix() {
            r5 = this;
            com.github.mikephil.charting.utils.Transformer r0 = r5.mRightAxisTransformer
            com.github.mikephil.charting.components.YAxis r1 = r5.mAxisRight
            float r2 = r1.mAxisMinimum
            float r1 = r1.mAxisRange
            com.github.mikephil.charting.components.XAxis r3 = r5.mXAxis
            float r4 = r3.mAxisRange
            float r3 = r3.mAxisMinimum
            r0.prepareMatrixValuePx(r2, r1, r4, r3)
            com.github.mikephil.charting.utils.Transformer r0 = r5.mLeftAxisTransformer
            com.github.mikephil.charting.components.YAxis r1 = r5.mAxisLeft
            float r2 = r1.mAxisMinimum
            float r1 = r1.mAxisRange
            com.github.mikephil.charting.components.XAxis r3 = r5.mXAxis
            float r4 = r3.mAxisRange
            float r3 = r3.mAxisMinimum
            r0.prepareMatrixValuePx(r2, r1, r4, r3)
            return
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void setVisibleXRange(float r2, float r3) {
            r1 = this;
            com.github.mikephil.charting.components.XAxis r0 = r1.mXAxis
            float r0 = r0.mAxisRange
            float r2 = r0 / r2
            float r0 = r0 / r3
            com.github.mikephil.charting.utils.ViewPortHandler r3 = r1.mViewPortHandler
            r3.setMinMaxScaleY(r2, r0)
            return
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void setVisibleXRangeMaximum(float r2) {
            r1 = this;
            com.github.mikephil.charting.components.XAxis r0 = r1.mXAxis
            float r0 = r0.mAxisRange
            float r0 = r0 / r2
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r1.mViewPortHandler
            r2.setMinimumScaleY(r0)
            return
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void setVisibleXRangeMinimum(float r2) {
            r1 = this;
            com.github.mikephil.charting.components.XAxis r0 = r1.mXAxis
            float r0 = r0.mAxisRange
            float r0 = r0 / r2
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r1.mViewPortHandler
            r2.setMaximumScaleY(r0)
            return
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void setVisibleYRange(float r2, float r3, com.github.mikephil.charting.components.YAxis.AxisDependency r4) {
            r1 = this;
            float r0 = r1.getAxisRange(r4)
            float r0 = r0 / r2
            float r2 = r1.getAxisRange(r4)
            float r2 = r2 / r3
            com.github.mikephil.charting.utils.ViewPortHandler r3 = r1.mViewPortHandler
            r3.setMinMaxScaleX(r0, r2)
            return
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void setVisibleYRangeMaximum(float r1, com.github.mikephil.charting.components.YAxis.AxisDependency r2) {
            r0 = this;
            float r2 = r0.getAxisRange(r2)
            float r2 = r2 / r1
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r0.mViewPortHandler
            r1.setMinimumScaleX(r2)
            return
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void setVisibleYRangeMinimum(float r1, com.github.mikephil.charting.components.YAxis.AxisDependency r2) {
            r0 = this;
            float r2 = r0.getAxisRange(r2)
            float r2 = r2 / r1
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r0.mViewPortHandler
            r1.setMaximumScaleX(r2)
            return
    }
}
