package com.github.mikephil.charting.charts;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class CombinedChart extends com.github.mikephil.charting.charts.BarLineChartBase<com.github.mikephil.charting.data.CombinedData> implements com.github.mikephil.charting.interfaces.dataprovider.CombinedDataProvider {
    private boolean mDrawBarShadow;
    protected com.github.mikephil.charting.charts.CombinedChart.DrawOrder[] mDrawOrder;
    private boolean mDrawValueAboveBar;
    protected boolean mHighlightFullBarEnabled;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum DrawOrder extends java.lang.Enum<com.github.mikephil.charting.charts.CombinedChart.DrawOrder> {
        private static final /* synthetic */ com.github.mikephil.charting.charts.CombinedChart.DrawOrder[] $VALUES = null;
        public static final com.github.mikephil.charting.charts.CombinedChart.DrawOrder BAR = null;
        public static final com.github.mikephil.charting.charts.CombinedChart.DrawOrder BUBBLE = null;
        public static final com.github.mikephil.charting.charts.CombinedChart.DrawOrder CANDLE = null;
        public static final com.github.mikephil.charting.charts.CombinedChart.DrawOrder LINE = null;
        public static final com.github.mikephil.charting.charts.CombinedChart.DrawOrder SCATTER = null;

        static {
                com.github.mikephil.charting.charts.CombinedChart$DrawOrder r0 = new com.github.mikephil.charting.charts.CombinedChart$DrawOrder
                java.lang.String r1 = "BAR"
                r2 = 0
                r0.<init>(r1, r2)
                com.github.mikephil.charting.charts.CombinedChart.DrawOrder.BAR = r0
                com.github.mikephil.charting.charts.CombinedChart$DrawOrder r1 = new com.github.mikephil.charting.charts.CombinedChart$DrawOrder
                java.lang.String r3 = "BUBBLE"
                r4 = 1
                r1.<init>(r3, r4)
                com.github.mikephil.charting.charts.CombinedChart.DrawOrder.BUBBLE = r1
                com.github.mikephil.charting.charts.CombinedChart$DrawOrder r3 = new com.github.mikephil.charting.charts.CombinedChart$DrawOrder
                java.lang.String r5 = "LINE"
                r6 = 2
                r3.<init>(r5, r6)
                com.github.mikephil.charting.charts.CombinedChart.DrawOrder.LINE = r3
                com.github.mikephil.charting.charts.CombinedChart$DrawOrder r5 = new com.github.mikephil.charting.charts.CombinedChart$DrawOrder
                java.lang.String r7 = "CANDLE"
                r8 = 3
                r5.<init>(r7, r8)
                com.github.mikephil.charting.charts.CombinedChart.DrawOrder.CANDLE = r5
                com.github.mikephil.charting.charts.CombinedChart$DrawOrder r7 = new com.github.mikephil.charting.charts.CombinedChart$DrawOrder
                java.lang.String r9 = "SCATTER"
                r10 = 4
                r7.<init>(r9, r10)
                com.github.mikephil.charting.charts.CombinedChart.DrawOrder.SCATTER = r7
                r9 = 5
                com.github.mikephil.charting.charts.CombinedChart$DrawOrder[] r9 = new com.github.mikephil.charting.charts.CombinedChart.DrawOrder[r9]
                r9[r2] = r0
                r9[r4] = r1
                r9[r6] = r3
                r9[r8] = r5
                r9[r10] = r7
                com.github.mikephil.charting.charts.CombinedChart.DrawOrder.$VALUES = r9
                return
        }

        DrawOrder(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.github.mikephil.charting.charts.CombinedChart.DrawOrder valueOf(java.lang.String r1) {
                java.lang.Class<com.github.mikephil.charting.charts.CombinedChart$DrawOrder> r0 = com.github.mikephil.charting.charts.CombinedChart.DrawOrder.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.github.mikephil.charting.charts.CombinedChart$DrawOrder r1 = (com.github.mikephil.charting.charts.CombinedChart.DrawOrder) r1
                return r1
        }

        public static com.github.mikephil.charting.charts.CombinedChart.DrawOrder[] values() {
                com.github.mikephil.charting.charts.CombinedChart$DrawOrder[] r0 = com.github.mikephil.charting.charts.CombinedChart.DrawOrder.$VALUES
                java.lang.Object r0 = r0.clone()
                com.github.mikephil.charting.charts.CombinedChart$DrawOrder[] r0 = (com.github.mikephil.charting.charts.CombinedChart.DrawOrder[]) r0
                return r0
        }
    }

    public CombinedChart(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1
            r0.mDrawValueAboveBar = r1
            r1 = 0
            r0.mHighlightFullBarEnabled = r1
            r0.mDrawBarShadow = r1
            return
    }

    public CombinedChart(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 1
            r0.mDrawValueAboveBar = r1
            r1 = 0
            r0.mHighlightFullBarEnabled = r1
            r0.mDrawBarShadow = r1
            return
    }

    public CombinedChart(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 1
            r0.mDrawValueAboveBar = r1
            r1 = 0
            r0.mHighlightFullBarEnabled = r1
            r0.mDrawBarShadow = r1
            return
    }

    @Override // com.github.mikephil.charting.charts.Chart
    protected void drawMarkers(android.graphics.Canvas r10) {
            r9 = this;
            com.github.mikephil.charting.components.IMarker r0 = r9.mMarker
            if (r0 == 0) goto L67
            boolean r0 = r9.isDrawMarkersEnabled()
            if (r0 == 0) goto L67
            boolean r0 = r9.valuesToHighlight()
            if (r0 != 0) goto L11
            goto L67
        L11:
            r0 = 0
            r1 = 0
        L13:
            com.github.mikephil.charting.highlight.Highlight[] r2 = r9.mIndicesToHighlight
            int r3 = r2.length
            if (r1 >= r3) goto L67
            r2 = r2[r1]
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r3 = r9.mData
            com.github.mikephil.charting.data.CombinedData r3 = (com.github.mikephil.charting.data.CombinedData) r3
            com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet r3 = r3.getDataSetByHighlight(r2)
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r4 = r9.mData
            com.github.mikephil.charting.data.CombinedData r4 = (com.github.mikephil.charting.data.CombinedData) r4
            com.github.mikephil.charting.data.Entry r4 = r4.getEntryForHighlight(r2)
            if (r4 != 0) goto L2d
            goto L64
        L2d:
            int r5 = r3.getEntryIndex(r4)
            float r5 = (float) r5
            int r3 = r3.getEntryCount()
            float r3 = (float) r3
            com.github.mikephil.charting.animation.ChartAnimator r6 = r9.mAnimator
            float r6 = r6.getPhaseX()
            float r3 = r3 * r6
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 <= 0) goto L44
            goto L64
        L44:
            float[] r3 = r9.getMarkerPosition(r2)
            com.github.mikephil.charting.utils.ViewPortHandler r5 = r9.mViewPortHandler
            r6 = r3[r0]
            r7 = 1
            r8 = r3[r7]
            boolean r5 = r5.isInBounds(r6, r8)
            if (r5 != 0) goto L56
            goto L64
        L56:
            com.github.mikephil.charting.components.IMarker r5 = r9.mMarker
            r5.refreshContent(r4, r2)
            com.github.mikephil.charting.components.IMarker r2 = r9.mMarker
            r4 = r3[r0]
            r3 = r3[r7]
            r2.draw(r10, r4, r3)
        L64:
            int r1 = r1 + 1
            goto L13
        L67:
            return
    }

    public com.github.mikephil.charting.data.BarData getBarData() {
            r1 = this;
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r1.mData
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            com.github.mikephil.charting.data.CombinedData r0 = (com.github.mikephil.charting.data.CombinedData) r0
            com.github.mikephil.charting.data.BarData r0 = r0.getBarData()
            return r0
    }

    public com.github.mikephil.charting.data.BubbleData getBubbleData() {
            r1 = this;
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r1.mData
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            com.github.mikephil.charting.data.CombinedData r0 = (com.github.mikephil.charting.data.CombinedData) r0
            com.github.mikephil.charting.data.BubbleData r0 = r0.getBubbleData()
            return r0
    }

    public com.github.mikephil.charting.data.CandleData getCandleData() {
            r1 = this;
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r1.mData
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            com.github.mikephil.charting.data.CombinedData r0 = (com.github.mikephil.charting.data.CombinedData) r0
            com.github.mikephil.charting.data.CandleData r0 = r0.getCandleData()
            return r0
    }

    public com.github.mikephil.charting.data.CombinedData getCombinedData() {
            r1 = this;
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r1.mData
            com.github.mikephil.charting.data.CombinedData r0 = (com.github.mikephil.charting.data.CombinedData) r0
            return r0
    }

    public com.github.mikephil.charting.charts.CombinedChart.DrawOrder[] getDrawOrder() {
            r1 = this;
            com.github.mikephil.charting.charts.CombinedChart$DrawOrder[] r0 = r1.mDrawOrder
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

    public com.github.mikephil.charting.data.LineData getLineData() {
            r1 = this;
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r1.mData
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            com.github.mikephil.charting.data.CombinedData r0 = (com.github.mikephil.charting.data.CombinedData) r0
            com.github.mikephil.charting.data.LineData r0 = r0.getLineData()
            return r0
    }

    public com.github.mikephil.charting.data.ScatterData getScatterData() {
            r1 = this;
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r1.mData
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            com.github.mikephil.charting.data.CombinedData r0 = (com.github.mikephil.charting.data.CombinedData) r0
            com.github.mikephil.charting.data.ScatterData r0 = r0.getScatterData()
            return r0
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    protected void init() {
            r4 = this;
            super.init()
            r0 = 5
            com.github.mikephil.charting.charts.CombinedChart$DrawOrder[] r0 = new com.github.mikephil.charting.charts.CombinedChart.DrawOrder[r0]
            com.github.mikephil.charting.charts.CombinedChart$DrawOrder r1 = com.github.mikephil.charting.charts.CombinedChart.DrawOrder.BAR
            r2 = 0
            r0[r2] = r1
            com.github.mikephil.charting.charts.CombinedChart$DrawOrder r1 = com.github.mikephil.charting.charts.CombinedChart.DrawOrder.BUBBLE
            r2 = 1
            r0[r2] = r1
            com.github.mikephil.charting.charts.CombinedChart$DrawOrder r1 = com.github.mikephil.charting.charts.CombinedChart.DrawOrder.LINE
            r3 = 2
            r0[r3] = r1
            com.github.mikephil.charting.charts.CombinedChart$DrawOrder r1 = com.github.mikephil.charting.charts.CombinedChart.DrawOrder.CANDLE
            r3 = 3
            r0[r3] = r1
            com.github.mikephil.charting.charts.CombinedChart$DrawOrder r1 = com.github.mikephil.charting.charts.CombinedChart.DrawOrder.SCATTER
            r3 = 4
            r0[r3] = r1
            r4.mDrawOrder = r0
            com.github.mikephil.charting.highlight.CombinedHighlighter r0 = new com.github.mikephil.charting.highlight.CombinedHighlighter
            r0.<init>(r4, r4)
            r4.setHighlighter(r0)
            r4.setHighlightFullBarEnabled(r2)
            com.github.mikephil.charting.renderer.CombinedChartRenderer r0 = new com.github.mikephil.charting.renderer.CombinedChartRenderer
            com.github.mikephil.charting.animation.ChartAnimator r1 = r4.mAnimator
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r4.mViewPortHandler
            r0.<init>(r4, r1, r2)
            r4.mRenderer = r0
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

    @Override // com.github.mikephil.charting.charts.Chart
    public /* bridge */ /* synthetic */ void setData(com.github.mikephil.charting.data.ChartData r1) {
            r0 = this;
            com.github.mikephil.charting.data.CombinedData r1 = (com.github.mikephil.charting.data.CombinedData) r1
            r0.setData(r1)
            return
    }

    public void setData(com.github.mikephil.charting.data.CombinedData r1) {
            r0 = this;
            super.setData(r1)
            com.github.mikephil.charting.highlight.CombinedHighlighter r1 = new com.github.mikephil.charting.highlight.CombinedHighlighter
            r1.<init>(r0, r0)
            r0.setHighlighter(r1)
            com.github.mikephil.charting.renderer.DataRenderer r1 = r0.mRenderer
            com.github.mikephil.charting.renderer.CombinedChartRenderer r1 = (com.github.mikephil.charting.renderer.CombinedChartRenderer) r1
            r1.createRenderers()
            com.github.mikephil.charting.renderer.DataRenderer r1 = r0.mRenderer
            r1.initBuffers()
            return
    }

    public void setDrawBarShadow(boolean r1) {
            r0 = this;
            r0.mDrawBarShadow = r1
            return
    }

    public void setDrawOrder(com.github.mikephil.charting.charts.CombinedChart.DrawOrder[] r2) {
            r1 = this;
            if (r2 == 0) goto L8
            int r0 = r2.length
            if (r0 > 0) goto L6
            goto L8
        L6:
            r1.mDrawOrder = r2
        L8:
            return
    }

    public void setDrawValueAboveBar(boolean r1) {
            r0 = this;
            r0.mDrawValueAboveBar = r1
            return
    }

    public void setHighlightFullBarEnabled(boolean r1) {
            r0 = this;
            r0.mHighlightFullBarEnabled = r1
            return
    }
}
