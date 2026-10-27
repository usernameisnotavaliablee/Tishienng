package com.github.mikephil.charting.data;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class ScatterData extends com.github.mikephil.charting.data.BarLineScatterCandleBubbleData<com.github.mikephil.charting.interfaces.datasets.IScatterDataSet> {
    public ScatterData() {
            r0 = this;
            r0.<init>()
            return
    }

    public ScatterData(java.util.List<com.github.mikephil.charting.interfaces.datasets.IScatterDataSet> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public ScatterData(com.github.mikephil.charting.interfaces.datasets.IScatterDataSet... r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public float getGreatestShapeSize() {
            r4 = this;
            java.util.List r0 = r4.mDataSets
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L7:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1d
            java.lang.Object r2 = r0.next()
            com.github.mikephil.charting.interfaces.datasets.IScatterDataSet r2 = (com.github.mikephil.charting.interfaces.datasets.IScatterDataSet) r2
            float r2 = r2.getScatterShapeSize()
            int r3 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r3 <= 0) goto L7
            r1 = r2
            goto L7
        L1d:
            return r1
    }
}
