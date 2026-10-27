package com.github.mikephil.charting.highlight;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class BarHighlighter extends com.github.mikephil.charting.highlight.ChartHighlighter<com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider> {
    public BarHighlighter(com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    protected int getClosestStackIndex(com.github.mikephil.charting.highlight.Range[] r6, float r7) {
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L2a
            int r1 = r6.length
            if (r1 != 0) goto L7
            goto L2a
        L7:
            int r1 = r6.length
            r2 = 0
            r3 = 0
        La:
            if (r2 >= r1) goto L1a
            r4 = r6[r2]
            boolean r4 = r4.contains(r7)
            if (r4 == 0) goto L15
            return r3
        L15:
            int r3 = r3 + 1
            int r2 = r2 + 1
            goto La
        L1a:
            int r1 = r6.length
            int r1 = r1 + (-1)
            int r1 = java.lang.Math.max(r1, r0)
            r6 = r6[r1]
            float r6 = r6.to
            int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r6 <= 0) goto L2a
            return r1
        L2a:
            return r0
    }

    @Override // com.github.mikephil.charting.highlight.ChartHighlighter
    protected com.github.mikephil.charting.data.BarLineScatterCandleBubbleData getData() {
            r1 = this;
            T extends com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider r0 = r1.mChart
            com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider r0 = (com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider) r0
            com.github.mikephil.charting.data.BarData r0 = r0.getBarData()
            return r0
    }

    @Override // com.github.mikephil.charting.highlight.ChartHighlighter
    protected float getDistance(float r1, float r2, float r3, float r4) {
            r0 = this;
            float r1 = r1 - r3
            float r1 = java.lang.Math.abs(r1)
            return r1
    }

    @Override // com.github.mikephil.charting.highlight.ChartHighlighter, com.github.mikephil.charting.highlight.IHighlighter
    public com.github.mikephil.charting.highlight.Highlight getHighlight(float r5, float r6) {
            r4 = this;
            com.github.mikephil.charting.highlight.Highlight r0 = super.getHighlight(r5, r6)
            if (r0 != 0) goto L8
            r5 = 0
            return r5
        L8:
            com.github.mikephil.charting.utils.MPPointD r5 = r4.getValsForTouch(r5, r6)
            T extends com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider r6 = r4.mChart
            com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider r6 = (com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider) r6
            com.github.mikephil.charting.data.BarData r6 = r6.getBarData()
            int r1 = r0.getDataSetIndex()
            com.github.mikephil.charting.interfaces.datasets.IDataSet r6 = r6.getDataSetByIndex(r1)
            com.github.mikephil.charting.interfaces.datasets.IBarDataSet r6 = (com.github.mikephil.charting.interfaces.datasets.IBarDataSet) r6
            boolean r1 = r6.isStacked()
            if (r1 == 0) goto L2f
            double r1 = r5.x
            float r1 = (float) r1
            double r2 = r5.y
            float r5 = (float) r2
            com.github.mikephil.charting.highlight.Highlight r5 = r4.getStackedHighlight(r0, r6, r1, r5)
            return r5
        L2f:
            com.github.mikephil.charting.utils.MPPointD.recycleInstance(r5)
            return r0
    }

    public com.github.mikephil.charting.highlight.Highlight getStackedHighlight(com.github.mikephil.charting.highlight.Highlight r12, com.github.mikephil.charting.interfaces.datasets.IBarDataSet r13, float r14, float r15) {
            r11 = this;
            com.github.mikephil.charting.data.Entry r14 = r13.getEntryForXValue(r14, r15)
            com.github.mikephil.charting.data.BarEntry r14 = (com.github.mikephil.charting.data.BarEntry) r14
            r0 = 0
            if (r14 != 0) goto La
            return r0
        La:
            float[] r1 = r14.getYVals()
            if (r1 != 0) goto L11
            return r12
        L11:
            com.github.mikephil.charting.highlight.Range[] r1 = r14.getRanges()
            int r2 = r1.length
            if (r2 <= 0) goto L53
            int r9 = r11.getClosestStackIndex(r1, r15)
            T extends com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider r15 = r11.mChart
            com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider r15 = (com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider) r15
            com.github.mikephil.charting.components.YAxis$AxisDependency r13 = r13.getAxisDependency()
            com.github.mikephil.charting.utils.Transformer r13 = r15.getTransformer(r13)
            float r15 = r12.getX()
            r0 = r1[r9]
            float r0 = r0.to
            com.github.mikephil.charting.utils.MPPointD r13 = r13.getPixelForValues(r15, r0)
            com.github.mikephil.charting.highlight.Highlight r3 = new com.github.mikephil.charting.highlight.Highlight
            float r4 = r14.getX()
            float r5 = r14.getY()
            double r14 = r13.x
            float r6 = (float) r14
            double r14 = r13.y
            float r7 = (float) r14
            int r8 = r12.getDataSetIndex()
            com.github.mikephil.charting.components.YAxis$AxisDependency r10 = r12.getAxis()
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            com.github.mikephil.charting.utils.MPPointD.recycleInstance(r13)
            return r3
        L53:
            return r0
    }
}
