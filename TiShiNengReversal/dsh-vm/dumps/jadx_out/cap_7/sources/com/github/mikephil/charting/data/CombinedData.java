package com.github.mikephil.charting.data;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class CombinedData extends com.github.mikephil.charting.data.BarLineScatterCandleBubbleData<com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet<? extends com.github.mikephil.charting.data.Entry>> {
    private com.github.mikephil.charting.data.BarData mBarData;
    private com.github.mikephil.charting.data.BubbleData mBubbleData;
    private com.github.mikephil.charting.data.CandleData mCandleData;
    private com.github.mikephil.charting.data.LineData mLineData;
    private com.github.mikephil.charting.data.ScatterData mScatterData;

    public CombinedData() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.github.mikephil.charting.data.ChartData
    public void calcMinMax() {
            r4 = this;
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r4.mDataSets
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.mDataSets = r0
        Lb:
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r4.mDataSets
            r0.clear()
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r4.mYMax = r0
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r4.mYMin = r1
            r4.mXMax = r0
            r4.mXMin = r1
            r4.mLeftAxisMax = r0
            r4.mLeftAxisMin = r1
            r4.mRightAxisMax = r0
            r4.mRightAxisMin = r1
            java.util.List r0 = r4.getAllData()
            java.util.Iterator r0 = r0.iterator()
        L2e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lb0
            java.lang.Object r1 = r0.next()
            com.github.mikephil.charting.data.ChartData r1 = (com.github.mikephil.charting.data.ChartData) r1
            r1.calcMinMax()
            java.util.List r2 = r1.getDataSets()
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r3 = r4.mDataSets
            r3.addAll(r2)
            float r2 = r1.getYMax()
            float r3 = r4.mYMax
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L56
            float r2 = r1.getYMax()
            r4.mYMax = r2
        L56:
            float r2 = r1.getYMin()
            float r3 = r4.mYMin
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L66
            float r2 = r1.getYMin()
            r4.mYMin = r2
        L66:
            float r2 = r1.getXMax()
            float r3 = r4.mXMax
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L76
            float r2 = r1.getXMax()
            r4.mXMax = r2
        L76:
            float r2 = r1.getXMin()
            float r3 = r4.mXMin
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L86
            float r2 = r1.getXMin()
            r4.mXMin = r2
        L86:
            float r2 = r1.mLeftAxisMax
            float r3 = r4.mLeftAxisMax
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 <= 0) goto L90
            r4.mLeftAxisMax = r2
        L90:
            float r2 = r1.mLeftAxisMin
            float r3 = r4.mLeftAxisMin
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 >= 0) goto L9a
            r4.mLeftAxisMin = r2
        L9a:
            float r2 = r1.mRightAxisMax
            float r3 = r4.mRightAxisMax
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 <= 0) goto La4
            r4.mRightAxisMax = r2
        La4:
            float r1 = r1.mRightAxisMin
            float r2 = r4.mRightAxisMin
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 >= 0) goto L2e
            r4.mRightAxisMin = r1
            goto L2e
        Lb0:
            return
    }

    public java.util.List<com.github.mikephil.charting.data.BarLineScatterCandleBubbleData> getAllData() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.github.mikephil.charting.data.LineData r1 = r2.mLineData
            if (r1 == 0) goto Lc
            r0.add(r1)
        Lc:
            com.github.mikephil.charting.data.BarData r1 = r2.mBarData
            if (r1 == 0) goto L13
            r0.add(r1)
        L13:
            com.github.mikephil.charting.data.ScatterData r1 = r2.mScatterData
            if (r1 == 0) goto L1a
            r0.add(r1)
        L1a:
            com.github.mikephil.charting.data.CandleData r1 = r2.mCandleData
            if (r1 == 0) goto L21
            r0.add(r1)
        L21:
            com.github.mikephil.charting.data.BubbleData r1 = r2.mBubbleData
            if (r1 == 0) goto L28
            r0.add(r1)
        L28:
            return r0
    }

    public com.github.mikephil.charting.data.BarData getBarData() {
            r1 = this;
            com.github.mikephil.charting.data.BarData r0 = r1.mBarData
            return r0
    }

    public com.github.mikephil.charting.data.BubbleData getBubbleData() {
            r1 = this;
            com.github.mikephil.charting.data.BubbleData r0 = r1.mBubbleData
            return r0
    }

    public com.github.mikephil.charting.data.CandleData getCandleData() {
            r1 = this;
            com.github.mikephil.charting.data.CandleData r0 = r1.mCandleData
            return r0
    }

    public com.github.mikephil.charting.data.BarLineScatterCandleBubbleData getDataByIndex(int r2) {
            r1 = this;
            java.util.List r0 = r1.getAllData()
            java.lang.Object r2 = r0.get(r2)
            com.github.mikephil.charting.data.BarLineScatterCandleBubbleData r2 = (com.github.mikephil.charting.data.BarLineScatterCandleBubbleData) r2
            return r2
    }

    public int getDataIndex(com.github.mikephil.charting.data.ChartData r2) {
            r1 = this;
            java.util.List r0 = r1.getAllData()
            int r2 = r0.indexOf(r2)
            return r2
    }

    public com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet<? extends com.github.mikephil.charting.data.Entry> getDataSetByHighlight(com.github.mikephil.charting.highlight.Highlight r5) {
            r4 = this;
            int r0 = r5.getDataIndex()
            java.util.List r1 = r4.getAllData()
            int r1 = r1.size()
            r2 = 0
            if (r0 < r1) goto L10
            return r2
        L10:
            int r0 = r5.getDataIndex()
            com.github.mikephil.charting.data.BarLineScatterCandleBubbleData r0 = r4.getDataByIndex(r0)
            int r1 = r5.getDataSetIndex()
            int r3 = r0.getDataSetCount()
            if (r1 < r3) goto L23
            return r2
        L23:
            java.util.List r0 = r0.getDataSets()
            int r5 = r5.getDataSetIndex()
            java.lang.Object r5 = r0.get(r5)
            com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet r5 = (com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet) r5
            return r5
    }

    @Override // com.github.mikephil.charting.data.ChartData
    public com.github.mikephil.charting.data.Entry getEntryForHighlight(com.github.mikephil.charting.highlight.Highlight r6) {
            r5 = this;
            int r0 = r6.getDataIndex()
            java.util.List r1 = r5.getAllData()
            int r1 = r1.size()
            r2 = 0
            if (r0 < r1) goto L10
            return r2
        L10:
            int r0 = r6.getDataIndex()
            com.github.mikephil.charting.data.BarLineScatterCandleBubbleData r0 = r5.getDataByIndex(r0)
            int r1 = r6.getDataSetIndex()
            int r3 = r0.getDataSetCount()
            if (r1 < r3) goto L23
            return r2
        L23:
            int r1 = r6.getDataSetIndex()
            com.github.mikephil.charting.interfaces.datasets.IDataSet r0 = r0.getDataSetByIndex(r1)
            float r1 = r6.getX()
            java.util.List r0 = r0.getEntriesForXValue(r1)
            java.util.Iterator r0 = r0.iterator()
        L37:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5a
            java.lang.Object r1 = r0.next()
            com.github.mikephil.charting.data.Entry r1 = (com.github.mikephil.charting.data.Entry) r1
            float r3 = r1.getY()
            float r4 = r6.getY()
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 == 0) goto L59
            float r3 = r6.getY()
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 == 0) goto L37
        L59:
            return r1
        L5a:
            return r2
    }

    public com.github.mikephil.charting.data.LineData getLineData() {
            r1 = this;
            com.github.mikephil.charting.data.LineData r0 = r1.mLineData
            return r0
    }

    public com.github.mikephil.charting.data.ScatterData getScatterData() {
            r1 = this;
            com.github.mikephil.charting.data.ScatterData r0 = r1.mScatterData
            return r0
    }

    @Override // com.github.mikephil.charting.data.ChartData
    public void notifyDataChanged() {
            r1 = this;
            com.github.mikephil.charting.data.LineData r0 = r1.mLineData
            if (r0 == 0) goto L7
            r0.notifyDataChanged()
        L7:
            com.github.mikephil.charting.data.BarData r0 = r1.mBarData
            if (r0 == 0) goto Le
            r0.notifyDataChanged()
        Le:
            com.github.mikephil.charting.data.CandleData r0 = r1.mCandleData
            if (r0 == 0) goto L15
            r0.notifyDataChanged()
        L15:
            com.github.mikephil.charting.data.ScatterData r0 = r1.mScatterData
            if (r0 == 0) goto L1c
            r0.notifyDataChanged()
        L1c:
            com.github.mikephil.charting.data.BubbleData r0 = r1.mBubbleData
            if (r0 == 0) goto L23
            r0.notifyDataChanged()
        L23:
            r1.calcMinMax()
            return
    }

    @Override // com.github.mikephil.charting.data.ChartData
    @java.lang.Deprecated
    public boolean removeDataSet(int r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public boolean removeDataSet(com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet<? extends com.github.mikephil.charting.data.Entry> r4) {
            r3 = this;
            java.util.List r0 = r3.getAllData()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L9:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1b
            java.lang.Object r1 = r0.next()
            com.github.mikephil.charting.data.ChartData r1 = (com.github.mikephil.charting.data.ChartData) r1
            boolean r1 = r1.removeDataSet(r4)
            if (r1 == 0) goto L9
        L1b:
            return r1
    }

    @Override // com.github.mikephil.charting.data.ChartData
    public /* bridge */ /* synthetic */ boolean removeDataSet(com.github.mikephil.charting.interfaces.datasets.IDataSet r1) {
            r0 = this;
            com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet r1 = (com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet) r1
            boolean r1 = r0.removeDataSet(r1)
            return r1
    }

    @Override // com.github.mikephil.charting.data.ChartData
    @java.lang.Deprecated
    public boolean removeEntry(float r1, int r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.github.mikephil.charting.data.ChartData
    @java.lang.Deprecated
    public boolean removeEntry(com.github.mikephil.charting.data.Entry r1, int r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    public void setData(com.github.mikephil.charting.data.BarData r1) {
            r0 = this;
            r0.mBarData = r1
            r0.notifyDataChanged()
            return
    }

    public void setData(com.github.mikephil.charting.data.BubbleData r1) {
            r0 = this;
            r0.mBubbleData = r1
            r0.notifyDataChanged()
            return
    }

    public void setData(com.github.mikephil.charting.data.CandleData r1) {
            r0 = this;
            r0.mCandleData = r1
            r0.notifyDataChanged()
            return
    }

    public void setData(com.github.mikephil.charting.data.LineData r1) {
            r0 = this;
            r0.mLineData = r1
            r0.notifyDataChanged()
            return
    }

    public void setData(com.github.mikephil.charting.data.ScatterData r1) {
            r0 = this;
            r0.mScatterData = r1
            r0.notifyDataChanged()
            return
    }
}
