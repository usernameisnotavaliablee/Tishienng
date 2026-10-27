package com.github.mikephil.charting.data;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class BarData extends com.github.mikephil.charting.data.BarLineScatterCandleBubbleData<com.github.mikephil.charting.interfaces.datasets.IBarDataSet> {
    private float mBarWidth;

    public BarData() {
            r1 = this;
            r1.<init>()
            r0 = 1062836634(0x3f59999a, float:0.85)
            r1.mBarWidth = r0
            return
    }

    public BarData(java.util.List<com.github.mikephil.charting.interfaces.datasets.IBarDataSet> r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1062836634(0x3f59999a, float:0.85)
            r0.mBarWidth = r1
            return
    }

    public BarData(com.github.mikephil.charting.interfaces.datasets.IBarDataSet... r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1062836634(0x3f59999a, float:0.85)
            r0.mBarWidth = r1
            return
    }

    public float getBarWidth() {
            r1 = this;
            float r0 = r1.mBarWidth
            return r0
    }

    public float getGroupWidth(float r3, float r4) {
            r2 = this;
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r2.mDataSets
            int r0 = r0.size()
            float r0 = (float) r0
            float r1 = r2.mBarWidth
            float r1 = r1 + r4
            float r0 = r0 * r1
            float r0 = r0 + r3
            return r0
    }

    public void groupBars(float r9, float r10, float r11) {
            r8 = this;
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r8.mDataSets
            int r0 = r0.size()
            r1 = 1
            if (r0 <= r1) goto L67
            com.github.mikephil.charting.interfaces.datasets.IDataSet r0 = r8.getMaxEntryCountSet()
            com.github.mikephil.charting.interfaces.datasets.IBarDataSet r0 = (com.github.mikephil.charting.interfaces.datasets.IBarDataSet) r0
            int r0 = r0.getEntryCount()
            r1 = 1073741824(0x40000000, float:2.0)
            float r2 = r10 / r1
            float r3 = r11 / r1
            float r4 = r8.mBarWidth
            float r4 = r4 / r1
            float r10 = r8.getGroupWidth(r10, r11)
            r11 = 0
        L21:
            if (r11 >= r0) goto L63
            float r1 = r9 + r2
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r5 = r8.mDataSets
            java.util.Iterator r5 = r5.iterator()
        L2b:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L4d
            java.lang.Object r6 = r5.next()
            com.github.mikephil.charting.interfaces.datasets.IBarDataSet r6 = (com.github.mikephil.charting.interfaces.datasets.IBarDataSet) r6
            float r1 = r1 + r3
            float r1 = r1 + r4
            int r7 = r6.getEntryCount()
            if (r11 >= r7) goto L4a
            com.github.mikephil.charting.data.Entry r6 = r6.getEntryForIndex(r11)
            com.github.mikephil.charting.data.BarEntry r6 = (com.github.mikephil.charting.data.BarEntry) r6
            if (r6 == 0) goto L4a
            r6.setX(r1)
        L4a:
            float r1 = r1 + r4
            float r1 = r1 + r3
            goto L2b
        L4d:
            float r1 = r1 + r2
            float r9 = r1 - r9
            float r9 = r10 - r9
            r5 = 0
            int r6 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r6 > 0) goto L5e
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 >= 0) goto L5c
            goto L5e
        L5c:
            r9 = r1
            goto L60
        L5e:
            float r1 = r1 + r9
            goto L5c
        L60:
            int r11 = r11 + 1
            goto L21
        L63:
            r8.notifyDataChanged()
            return
        L67:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.String r10 = "BarData needs to hold at least 2 BarDataSets to allow grouping."
            r9.<init>(r10)
            throw r9
    }

    public void setBarWidth(float r1) {
            r0 = this;
            r0.mBarWidth = r1
            return
    }
}
