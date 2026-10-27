package com.github.mikephil.charting.data;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class BubbleData extends com.github.mikephil.charting.data.BarLineScatterCandleBubbleData<com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet> {
    public BubbleData() {
            r0 = this;
            r0.<init>()
            return
    }

    public BubbleData(java.util.List<com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public BubbleData(com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet... r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public void setHighlightCircleWidth(float r3) {
            r2 = this;
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r2.mDataSets
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet r1 = (com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet) r1
            r1.setHighlightCircleWidth(r3)
            goto L6
        L16:
            return
    }
}
