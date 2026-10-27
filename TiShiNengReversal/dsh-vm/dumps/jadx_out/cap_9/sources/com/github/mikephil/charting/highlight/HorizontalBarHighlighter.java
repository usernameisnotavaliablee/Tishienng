package com.github.mikephil.charting.highlight;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class HorizontalBarHighlighter extends com.github.mikephil.charting.highlight.BarHighlighter {
    public HorizontalBarHighlighter(com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.github.mikephil.charting.highlight.ChartHighlighter
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
            goto L6a
        L26:
            java.util.Iterator r12 = r1.iterator()
        L2a:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L6a
            java.lang.Object r13 = r12.next()
            com.github.mikephil.charting.data.Entry r13 = (com.github.mikephil.charting.data.Entry) r13
            T extends com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider r1 = r9.mChart
            com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider r1 = (com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider) r1
            com.github.mikephil.charting.components.YAxis$AxisDependency r2 = r10.getAxisDependency()
            com.github.mikephil.charting.utils.Transformer r1 = r1.getTransformer(r2)
            float r2 = r13.getY()
            float r3 = r13.getX()
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
        L6a:
            return r0
    }

    @Override // com.github.mikephil.charting.highlight.BarHighlighter, com.github.mikephil.charting.highlight.ChartHighlighter
    protected float getDistance(float r1, float r2, float r3, float r4) {
            r0 = this;
            float r2 = r2 - r4
            float r1 = java.lang.Math.abs(r2)
            return r1
    }

    @Override // com.github.mikephil.charting.highlight.BarHighlighter, com.github.mikephil.charting.highlight.ChartHighlighter, com.github.mikephil.charting.highlight.IHighlighter
    public com.github.mikephil.charting.highlight.Highlight getHighlight(float r5, float r6) {
            r4 = this;
            T extends com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider r0 = r4.mChart
            com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider r0 = (com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider) r0
            com.github.mikephil.charting.data.BarData r0 = r0.getBarData()
            com.github.mikephil.charting.utils.MPPointD r1 = r4.getValsForTouch(r6, r5)
            double r2 = r1.y
            float r2 = (float) r2
            com.github.mikephil.charting.highlight.Highlight r5 = r4.getHighlightForX(r2, r6, r5)
            if (r5 != 0) goto L17
            r5 = 0
            return r5
        L17:
            int r6 = r5.getDataSetIndex()
            com.github.mikephil.charting.interfaces.datasets.IDataSet r6 = r0.getDataSetByIndex(r6)
            com.github.mikephil.charting.interfaces.datasets.IBarDataSet r6 = (com.github.mikephil.charting.interfaces.datasets.IBarDataSet) r6
            boolean r0 = r6.isStacked()
            if (r0 == 0) goto L32
            double r2 = r1.y
            float r0 = (float) r2
            double r1 = r1.x
            float r1 = (float) r1
            com.github.mikephil.charting.highlight.Highlight r5 = r4.getStackedHighlight(r5, r6, r0, r1)
            return r5
        L32:
            com.github.mikephil.charting.utils.MPPointD.recycleInstance(r1)
            return r5
    }
}
