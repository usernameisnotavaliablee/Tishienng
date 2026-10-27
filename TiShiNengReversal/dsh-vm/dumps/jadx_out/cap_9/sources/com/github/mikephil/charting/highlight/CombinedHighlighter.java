package com.github.mikephil.charting.highlight;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class CombinedHighlighter extends com.github.mikephil.charting.highlight.ChartHighlighter<com.github.mikephil.charting.interfaces.dataprovider.CombinedDataProvider> implements com.github.mikephil.charting.highlight.IHighlighter {
    protected com.github.mikephil.charting.highlight.BarHighlighter barHighlighter;

    public CombinedHighlighter(com.github.mikephil.charting.interfaces.dataprovider.CombinedDataProvider r1, com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider r2) {
            r0 = this;
            r0.<init>(r1)
            com.github.mikephil.charting.data.BarData r1 = r2.getBarData()
            if (r1 != 0) goto Lb
            r1 = 0
            goto L10
        Lb:
            com.github.mikephil.charting.highlight.BarHighlighter r1 = new com.github.mikephil.charting.highlight.BarHighlighter
            r1.<init>(r2)
        L10:
            r0.barHighlighter = r1
            return
    }

    @Override // com.github.mikephil.charting.highlight.ChartHighlighter
    protected java.util.List<com.github.mikephil.charting.highlight.Highlight> getHighlightsAtXValue(float r9, float r10, float r11) {
            r8 = this;
            java.util.List<com.github.mikephil.charting.highlight.Highlight> r0 = r8.mHighlightBuffer
            r0.clear()
            T extends com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider r0 = r8.mChart
            com.github.mikephil.charting.interfaces.dataprovider.CombinedDataProvider r0 = (com.github.mikephil.charting.interfaces.dataprovider.CombinedDataProvider) r0
            com.github.mikephil.charting.data.CombinedData r0 = r0.getCombinedData()
            java.util.List r0 = r0.getAllData()
            r1 = 0
            r2 = 0
        L13:
            int r3 = r0.size()
            if (r2 >= r3) goto L73
            java.lang.Object r3 = r0.get(r2)
            com.github.mikephil.charting.data.ChartData r3 = (com.github.mikephil.charting.data.ChartData) r3
            com.github.mikephil.charting.highlight.BarHighlighter r4 = r8.barHighlighter
            if (r4 == 0) goto L36
            boolean r5 = r3 instanceof com.github.mikephil.charting.data.BarData
            if (r5 == 0) goto L36
            com.github.mikephil.charting.highlight.Highlight r3 = r4.getHighlight(r10, r11)
            if (r3 == 0) goto L70
            r3.setDataIndex(r2)
            java.util.List<com.github.mikephil.charting.highlight.Highlight> r4 = r8.mHighlightBuffer
            r4.add(r3)
            goto L70
        L36:
            int r3 = r3.getDataSetCount()
            r4 = 0
        L3b:
            if (r4 >= r3) goto L70
            java.lang.Object r5 = r0.get(r2)
            com.github.mikephil.charting.data.BarLineScatterCandleBubbleData r5 = (com.github.mikephil.charting.data.BarLineScatterCandleBubbleData) r5
            com.github.mikephil.charting.interfaces.datasets.IDataSet r5 = r5.getDataSetByIndex(r4)
            boolean r6 = r5.isHighlightEnabled()
            if (r6 != 0) goto L4e
            goto L6d
        L4e:
            com.github.mikephil.charting.data.DataSet$Rounding r6 = com.github.mikephil.charting.data.DataSet.Rounding.CLOSEST
            java.util.List r5 = r8.buildHighlights(r5, r4, r9, r6)
            java.util.Iterator r5 = r5.iterator()
        L58:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L6d
            java.lang.Object r6 = r5.next()
            com.github.mikephil.charting.highlight.Highlight r6 = (com.github.mikephil.charting.highlight.Highlight) r6
            r6.setDataIndex(r2)
            java.util.List<com.github.mikephil.charting.highlight.Highlight> r7 = r8.mHighlightBuffer
            r7.add(r6)
            goto L58
        L6d:
            int r4 = r4 + 1
            goto L3b
        L70:
            int r2 = r2 + 1
            goto L13
        L73:
            java.util.List<com.github.mikephil.charting.highlight.Highlight> r9 = r8.mHighlightBuffer
            return r9
    }
}
