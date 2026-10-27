package com.github.mikephil.charting.charts;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class BarChart extends com.github.mikephil.charting.charts.BarLineChartBase<com.github.mikephil.charting.data.BarData> implements com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider {
    private boolean mDrawBarShadow;
    private boolean mDrawValueAboveBar;
    private boolean mFitBars;
    protected boolean mHighlightFullBarEnabled;

    public BarChart(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r2 = 0
            r1.mHighlightFullBarEnabled = r2
            r0 = 1
            r1.mDrawValueAboveBar = r0
            r1.mDrawBarShadow = r2
            r1.mFitBars = r2
            return
    }

    public BarChart(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.mHighlightFullBarEnabled = r1
            r2 = 1
            r0.mDrawValueAboveBar = r2
            r0.mDrawBarShadow = r1
            r0.mFitBars = r1
            return
    }

    public BarChart(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 0
            r0.mHighlightFullBarEnabled = r1
            r2 = 1
            r0.mDrawValueAboveBar = r2
            r0.mDrawBarShadow = r1
            r0.mFitBars = r1
            return
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    protected void calcMinMax() {
            r5 = this;
            boolean r0 = r5.mFitBars
            if (r0 == 0) goto L30
            com.github.mikephil.charting.components.XAxis r0 = r5.mXAxis
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r1 = r5.mData
            com.github.mikephil.charting.data.BarData r1 = (com.github.mikephil.charting.data.BarData) r1
            float r1 = r1.getXMin()
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r2 = r5.mData
            com.github.mikephil.charting.data.BarData r2 = (com.github.mikephil.charting.data.BarData) r2
            float r2 = r2.getBarWidth()
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            float r1 = r1 - r2
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r2 = r5.mData
            com.github.mikephil.charting.data.BarData r2 = (com.github.mikephil.charting.data.BarData) r2
            float r2 = r2.getXMax()
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r4 = r5.mData
            com.github.mikephil.charting.data.BarData r4 = (com.github.mikephil.charting.data.BarData) r4
            float r4 = r4.getBarWidth()
            float r4 = r4 / r3
            float r2 = r2 + r4
            r0.calculate(r1, r2)
            goto L45
        L30:
            com.github.mikephil.charting.components.XAxis r0 = r5.mXAxis
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r1 = r5.mData
            com.github.mikephil.charting.data.BarData r1 = (com.github.mikephil.charting.data.BarData) r1
            float r1 = r1.getXMin()
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r2 = r5.mData
            com.github.mikephil.charting.data.BarData r2 = (com.github.mikephil.charting.data.BarData) r2
            float r2 = r2.getXMax()
            r0.calculate(r1, r2)
        L45:
            com.github.mikephil.charting.components.YAxis r0 = r5.mAxisLeft
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r1 = r5.mData
            com.github.mikephil.charting.data.BarData r1 = (com.github.mikephil.charting.data.BarData) r1
            com.github.mikephil.charting.components.YAxis$AxisDependency r2 = com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT
            float r1 = r1.getYMin(r2)
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r3 = r5.mData
            com.github.mikephil.charting.data.BarData r3 = (com.github.mikephil.charting.data.BarData) r3
            float r2 = r3.getYMax(r2)
            r0.calculate(r1, r2)
            com.github.mikephil.charting.components.YAxis r0 = r5.mAxisRight
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r1 = r5.mData
            com.github.mikephil.charting.data.BarData r1 = (com.github.mikephil.charting.data.BarData) r1
            com.github.mikephil.charting.components.YAxis$AxisDependency r2 = com.github.mikephil.charting.components.YAxis.AxisDependency.RIGHT
            float r1 = r1.getYMin(r2)
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r3 = r5.mData
            com.github.mikephil.charting.data.BarData r3 = (com.github.mikephil.charting.data.BarData) r3
            float r2 = r3.getYMax(r2)
            r0.calculate(r1, r2)
            return
    }

    public android.graphics.RectF getBarBounds(com.github.mikephil.charting.data.BarEntry r2) {
            r1 = this;
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r1.getBarBounds(r2, r0)
            return r0
    }

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
            r8.set(r3, r4, r7, r1)
            com.github.mikephil.charting.components.YAxis$AxisDependency r7 = r0.getAxisDependency()
            com.github.mikephil.charting.utils.Transformer r7 = r6.getTransformer(r7)
            r7.rectValueToPixel(r8)
            return
    }

    public com.github.mikephil.charting.data.BarData getBarData() {
            r1 = this;
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r1.mData
            com.github.mikephil.charting.data.BarData r0 = (com.github.mikephil.charting.data.BarData) r0
            return r0
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public com.github.mikephil.charting.highlight.Highlight getHighlightByTouchPoint(float r9, float r10) {
            r8 = this;
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r8.mData
            if (r0 != 0) goto L6
            r9 = 0
            return r9
        L6:
            com.github.mikephil.charting.highlight.IHighlighter r0 = r8.getHighlighter()
            com.github.mikephil.charting.highlight.Highlight r9 = r0.getHighlight(r9, r10)
            if (r9 == 0) goto L36
            boolean r10 = r8.isHighlightFullBarEnabled()
            if (r10 != 0) goto L17
            goto L36
        L17:
            com.github.mikephil.charting.highlight.Highlight r0 = new com.github.mikephil.charting.highlight.Highlight
            float r1 = r9.getX()
            float r2 = r9.getY()
            float r3 = r9.getXPx()
            float r4 = r9.getYPx()
            int r5 = r9.getDataSetIndex()
            r6 = -1
            com.github.mikephil.charting.components.YAxis$AxisDependency r7 = r9.getAxis()
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
        L36:
            return r9
    }

    public void groupBars(float r2, float r3, float r4) {
            r1 = this;
            com.github.mikephil.charting.data.BarData r0 = r1.getBarData()
            if (r0 == 0) goto L11
            com.github.mikephil.charting.data.BarData r0 = r1.getBarData()
            r0.groupBars(r2, r3, r4)
            r1.notifyDataSetChanged()
            return
        L11:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "You need to set data for the chart before grouping bars."
            r2.<init>(r3)
            throw r2
    }

    public void highlightValue(float r2, int r3, int r4) {
            r1 = this;
            com.github.mikephil.charting.highlight.Highlight r0 = new com.github.mikephil.charting.highlight.Highlight
            r0.<init>(r2, r3, r4)
            r2 = 0
            r1.highlightValue(r0, r2)
            return
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    protected void init() {
            r3 = this;
            super.init()
            com.github.mikephil.charting.renderer.BarChartRenderer r0 = new com.github.mikephil.charting.renderer.BarChartRenderer
            com.github.mikephil.charting.animation.ChartAnimator r1 = r3.mAnimator
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r3.mViewPortHandler
            r0.<init>(r3, r1, r2)
            r3.mRenderer = r0
            com.github.mikephil.charting.highlight.BarHighlighter r0 = new com.github.mikephil.charting.highlight.BarHighlighter
            r0.<init>(r3)
            r3.setHighlighter(r0)
            com.github.mikephil.charting.components.XAxis r0 = r3.getXAxis()
            r1 = 1056964608(0x3f000000, float:0.5)
            r0.setSpaceMin(r1)
            com.github.mikephil.charting.components.XAxis r0 = r3.getXAxis()
            r0.setSpaceMax(r1)
            return
    }

    public boolean isDrawBarShadowEnabled() {
            r1 = this;
            boolean r0 = r1.mDrawBarShadow
            return r0
    }

    public boolean isDrawValueAboveBarEnabled() {
            r1 = this;
            boolean r0 = r1.mDrawValueAboveBar
            return r0
    }

    public boolean isHighlightFullBarEnabled() {
            r1 = this;
            boolean r0 = r1.mHighlightFullBarEnabled
            return r0
    }

    public void setDrawBarShadow(boolean r1) {
            r0 = this;
            r0.mDrawBarShadow = r1
            return
    }

    public void setDrawValueAboveBar(boolean r1) {
            r0 = this;
            r0.mDrawValueAboveBar = r1
            return
    }

    public void setFitBars(boolean r1) {
            r0 = this;
            r0.mFitBars = r1
            return
    }

    public void setHighlightFullBarEnabled(boolean r1) {
            r0 = this;
            r0.mHighlightFullBarEnabled = r1
            return
    }
}
