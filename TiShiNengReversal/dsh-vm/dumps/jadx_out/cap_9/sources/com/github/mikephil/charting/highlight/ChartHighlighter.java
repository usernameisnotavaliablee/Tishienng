package com.github.mikephil.charting.highlight;

import com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class ChartHighlighter<T extends com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider> implements com.github.mikephil.charting.highlight.IHighlighter {
    protected T mChart;
    protected java.util.List<com.github.mikephil.charting.highlight.Highlight> mHighlightBuffer;

    public ChartHighlighter(T r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mHighlightBuffer = r0
            r1.mChart = r2
            return
    }

    protected java.util.List<com.github.mikephil.charting.highlight.Highlight> buildHighlights(com.github.mikephil.charting.interfaces.datasets.IDataSet r10, int r11, float r12, com.github.mikephil.charting.data.DataSet.Rounding r13) {
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r1 = r10.getEntriesForXValue(r12)
            int r2 = r1.size()
            if (r2 != 0) goto L1f
            r2 = 2143289344(0x7fc00000, float:NaN)
            com.github.mikephil.charting.data.Entry r12 = r10.getEntryForXValue(r12, r2, r13)
            if (r12 == 0) goto L1f
            float r12 = r12.getX()
            java.util.List r1 = r10.getEntriesForXValue(r12)
        L1f:
            int r12 = r1.size()
            if (r12 != 0) goto L26
            goto L68
        L26:
            java.util.Iterator r12 = r1.iterator()
        L2a:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L68
            java.lang.Object r13 = r12.next()
            com.github.mikephil.charting.data.Entry r13 = (com.github.mikephil.charting.data.Entry) r13
            T extends com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider r1 = r9.mChart
            com.github.mikephil.charting.components.YAxis$AxisDependency r2 = r10.getAxisDependency()
            com.github.mikephil.charting.utils.Transformer r1 = r1.getTransformer(r2)
            float r2 = r13.getX()
            float r3 = r13.getY()
            com.github.mikephil.charting.utils.MPPointD r1 = r1.getPixelForValues(r2, r3)
            com.github.mikephil.charting.highlight.Highlight r2 = new com.github.mikephil.charting.highlight.Highlight
            float r3 = r13.getX()
            float r4 = r13.getY()
            double r5 = r1.x
            float r5 = (float) r5
            double r6 = r1.y
            float r6 = (float) r6
            com.github.mikephil.charting.components.YAxis$AxisDependency r8 = r10.getAxisDependency()
            r7 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r0.add(r2)
            goto L2a
        L68:
            return r0
    }

    public com.github.mikephil.charting.highlight.Highlight getClosestHighlightByPixel(java.util.List<com.github.mikephil.charting.highlight.Highlight> r6, float r7, float r8, com.github.mikephil.charting.components.YAxis.AxisDependency r9, float r10) {
            r5 = this;
            r0 = 0
            r1 = 0
        L2:
            int r2 = r6.size()
            if (r1 >= r2) goto L2b
            java.lang.Object r2 = r6.get(r1)
            com.github.mikephil.charting.highlight.Highlight r2 = (com.github.mikephil.charting.highlight.Highlight) r2
            if (r9 == 0) goto L16
            com.github.mikephil.charting.components.YAxis$AxisDependency r3 = r2.getAxis()
            if (r3 != r9) goto L28
        L16:
            float r3 = r2.getXPx()
            float r4 = r2.getYPx()
            float r3 = r5.getDistance(r7, r8, r3, r4)
            int r4 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r4 >= 0) goto L28
            r0 = r2
            r10 = r3
        L28:
            int r1 = r1 + 1
            goto L2
        L2b:
            return r0
    }

    protected com.github.mikephil.charting.data.BarLineScatterCandleBubbleData getData() {
            r1 = this;
            T extends com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider r0 = r1.mChart
            com.github.mikephil.charting.data.BarLineScatterCandleBubbleData r0 = r0.getData()
            return r0
    }

    protected float getDistance(float r3, float r4, float r5, float r6) {
            r2 = this;
            float r3 = r3 - r5
            double r0 = (double) r3
            float r4 = r4 - r6
            double r3 = (double) r4
            double r3 = java.lang.Math.hypot(r0, r3)
            float r3 = (float) r3
            return r3
    }

    @Override // com.github.mikephil.charting.highlight.IHighlighter
    public com.github.mikephil.charting.highlight.Highlight getHighlight(float r4, float r5) {
            r3 = this;
            com.github.mikephil.charting.utils.MPPointD r0 = r3.getValsForTouch(r4, r5)
            double r1 = r0.x
            float r1 = (float) r1
            com.github.mikephil.charting.utils.MPPointD.recycleInstance(r0)
            com.github.mikephil.charting.highlight.Highlight r4 = r3.getHighlightForX(r1, r4, r5)
            return r4
    }

    protected com.github.mikephil.charting.highlight.Highlight getHighlightForX(float r7, float r8, float r9) {
            r6 = this;
            java.util.List r1 = r6.getHighlightsAtXValue(r7, r8, r9)
            boolean r7 = r1.isEmpty()
            if (r7 == 0) goto Lc
            r7 = 0
            return r7
        Lc:
            com.github.mikephil.charting.components.YAxis$AxisDependency r7 = com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT
            float r0 = r6.getMinimumDistance(r1, r9, r7)
            com.github.mikephil.charting.components.YAxis$AxisDependency r2 = com.github.mikephil.charting.components.YAxis.AxisDependency.RIGHT
            float r3 = r6.getMinimumDistance(r1, r9, r2)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L1e
            r4 = r7
            goto L1f
        L1e:
            r4 = r2
        L1f:
            T extends com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider r7 = r6.mChart
            float r5 = r7.getMaxHighlightDistance()
            r0 = r6
            r2 = r8
            r3 = r9
            com.github.mikephil.charting.highlight.Highlight r7 = r0.getClosestHighlightByPixel(r1, r2, r3, r4, r5)
            return r7
    }

    protected float getHighlightPos(com.github.mikephil.charting.highlight.Highlight r1) {
            r0 = this;
            float r1 = r1.getYPx()
            return r1
    }

    protected java.util.List<com.github.mikephil.charting.highlight.Highlight> getHighlightsAtXValue(float r5, float r6, float r7) {
            r4 = this;
            java.util.List<com.github.mikephil.charting.highlight.Highlight> r6 = r4.mHighlightBuffer
            r6.clear()
            com.github.mikephil.charting.data.BarLineScatterCandleBubbleData r6 = r4.getData()
            if (r6 != 0) goto Le
            java.util.List<com.github.mikephil.charting.highlight.Highlight> r5 = r4.mHighlightBuffer
            return r5
        Le:
            int r7 = r6.getDataSetCount()
            r0 = 0
        L13:
            if (r0 >= r7) goto L2e
            com.github.mikephil.charting.interfaces.datasets.IDataSet r1 = r6.getDataSetByIndex(r0)
            boolean r2 = r1.isHighlightEnabled()
            if (r2 != 0) goto L20
            goto L2b
        L20:
            java.util.List<com.github.mikephil.charting.highlight.Highlight> r2 = r4.mHighlightBuffer
            com.github.mikephil.charting.data.DataSet$Rounding r3 = com.github.mikephil.charting.data.DataSet.Rounding.CLOSEST
            java.util.List r1 = r4.buildHighlights(r1, r0, r5, r3)
            r2.addAll(r1)
        L2b:
            int r0 = r0 + 1
            goto L13
        L2e:
            java.util.List<com.github.mikephil.charting.highlight.Highlight> r5 = r4.mHighlightBuffer
            return r5
    }

    protected float getMinimumDistance(java.util.List<com.github.mikephil.charting.highlight.Highlight> r5, float r6, com.github.mikephil.charting.components.YAxis.AxisDependency r7) {
            r4 = this;
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r1 = 0
        L4:
            int r2 = r5.size()
            if (r1 >= r2) goto L27
            java.lang.Object r2 = r5.get(r1)
            com.github.mikephil.charting.highlight.Highlight r2 = (com.github.mikephil.charting.highlight.Highlight) r2
            com.github.mikephil.charting.components.YAxis$AxisDependency r3 = r2.getAxis()
            if (r3 != r7) goto L24
            float r2 = r4.getHighlightPos(r2)
            float r2 = r2 - r6
            float r2 = java.lang.Math.abs(r2)
            int r3 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r3 >= 0) goto L24
            r0 = r2
        L24:
            int r1 = r1 + 1
            goto L4
        L27:
            return r0
    }

    protected com.github.mikephil.charting.utils.MPPointD getValsForTouch(float r3, float r4) {
            r2 = this;
            T extends com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider r0 = r2.mChart
            com.github.mikephil.charting.components.YAxis$AxisDependency r1 = com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT
            com.github.mikephil.charting.utils.Transformer r0 = r0.getTransformer(r1)
            com.github.mikephil.charting.utils.MPPointD r3 = r0.getValuesByTouchPoint(r3, r4)
            return r3
    }
}
