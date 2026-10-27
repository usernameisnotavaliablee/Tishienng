package com.github.mikephil.charting.data;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class BubbleDataSet extends com.github.mikephil.charting.data.BarLineScatterCandleBubbleDataSet<com.github.mikephil.charting.data.BubbleEntry> implements com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet {
    private float mHighlightCircleWidth;
    protected float mMaxSize;
    protected boolean mNormalizeSize;

    public BubbleDataSet(java.util.List<com.github.mikephil.charting.data.BubbleEntry> r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 1
            r0.mNormalizeSize = r1
            r1 = 1075838976(0x40200000, float:2.5)
            r0.mHighlightCircleWidth = r1
            return
    }

    protected void calcMinMax(com.github.mikephil.charting.data.BubbleEntry r2) {
            r1 = this;
            super.calcMinMax(r2)
            float r2 = r2.getSize()
            float r0 = r1.mMaxSize
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto Lf
            r1.mMaxSize = r2
        Lf:
            return
    }

    @Override // com.github.mikephil.charting.data.DataSet
    protected /* bridge */ /* synthetic */ void calcMinMax(com.github.mikephil.charting.data.Entry r1) {
            r0 = this;
            com.github.mikephil.charting.data.BubbleEntry r1 = (com.github.mikephil.charting.data.BubbleEntry) r1
            r0.calcMinMax(r1)
            return
    }

    @Override // com.github.mikephil.charting.data.DataSet
    public com.github.mikephil.charting.data.DataSet<com.github.mikephil.charting.data.BubbleEntry> copy() {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            java.util.List<T extends com.github.mikephil.charting.data.Entry> r2 = r3.mValues
            int r2 = r2.size()
            if (r1 >= r2) goto L20
            java.util.List<T extends com.github.mikephil.charting.data.Entry> r2 = r3.mValues
            java.lang.Object r2 = r2.get(r1)
            com.github.mikephil.charting.data.BubbleEntry r2 = (com.github.mikephil.charting.data.BubbleEntry) r2
            com.github.mikephil.charting.data.BubbleEntry r2 = r2.copy()
            r0.add(r2)
            int r1 = r1 + 1
            goto L6
        L20:
            com.github.mikephil.charting.data.BubbleDataSet r1 = new com.github.mikephil.charting.data.BubbleDataSet
            java.lang.String r2 = r3.getLabel()
            r1.<init>(r0, r2)
            r3.copy(r1)
            return r1
    }

    protected void copy(com.github.mikephil.charting.data.BubbleDataSet r2) {
            r1 = this;
            float r0 = r1.mHighlightCircleWidth
            r2.mHighlightCircleWidth = r0
            boolean r0 = r1.mNormalizeSize
            r2.mNormalizeSize = r0
            return
    }

    public float getHighlightCircleWidth() {
            r1 = this;
            float r0 = r1.mHighlightCircleWidth
            return r0
    }

    public float getMaxSize() {
            r1 = this;
            float r0 = r1.mMaxSize
            return r0
    }

    public boolean isNormalizeSizeEnabled() {
            r1 = this;
            boolean r0 = r1.mNormalizeSize
            return r0
    }

    public void setHighlightCircleWidth(float r1) {
            r0 = this;
            float r1 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r1)
            r0.mHighlightCircleWidth = r1
            return
    }

    public void setNormalizeSizeEnabled(boolean r1) {
            r0 = this;
            r0.mNormalizeSize = r1
            return
    }
}
