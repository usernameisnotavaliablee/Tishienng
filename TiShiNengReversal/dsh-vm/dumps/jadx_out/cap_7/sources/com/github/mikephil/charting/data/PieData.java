package com.github.mikephil.charting.data;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class PieData extends com.github.mikephil.charting.data.ChartData<com.github.mikephil.charting.interfaces.datasets.IPieDataSet> {
    public PieData() {
            r0 = this;
            r0.<init>()
            return
    }

    public PieData(com.github.mikephil.charting.interfaces.datasets.IPieDataSet r3) {
            r2 = this;
            r0 = 1
            com.github.mikephil.charting.interfaces.datasets.IPieDataSet[] r0 = new com.github.mikephil.charting.interfaces.datasets.IPieDataSet[r0]
            r1 = 0
            r0[r1] = r3
            r2.<init>(r0)
            return
    }

    public com.github.mikephil.charting.interfaces.datasets.IPieDataSet getDataSet() {
            r2 = this;
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r2.mDataSets
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.github.mikephil.charting.interfaces.datasets.IPieDataSet r0 = (com.github.mikephil.charting.interfaces.datasets.IPieDataSet) r0
            return r0
    }

    @Override // com.github.mikephil.charting.data.ChartData
    public /* bridge */ /* synthetic */ com.github.mikephil.charting.interfaces.datasets.IPieDataSet getDataSetByIndex(int r1) {
            r0 = this;
            com.github.mikephil.charting.interfaces.datasets.IPieDataSet r1 = r0.getDataSetByIndex2(r1)
            return r1
    }

    /* renamed from: getDataSetByIndex, reason: avoid collision after fix types in other method */
    public com.github.mikephil.charting.interfaces.datasets.IPieDataSet getDataSetByIndex2(int r1) {
            r0 = this;
            if (r1 != 0) goto L7
            com.github.mikephil.charting.interfaces.datasets.IPieDataSet r1 = r0.getDataSet()
            return r1
        L7:
            r1 = 0
            return r1
    }

    @Override // com.github.mikephil.charting.data.ChartData
    public /* bridge */ /* synthetic */ com.github.mikephil.charting.interfaces.datasets.IPieDataSet getDataSetByLabel(java.lang.String r1, boolean r2) {
            r0 = this;
            com.github.mikephil.charting.interfaces.datasets.IPieDataSet r1 = r0.getDataSetByLabel2(r1, r2)
            return r1
    }

    /* renamed from: getDataSetByLabel, reason: avoid collision after fix types in other method */
    public com.github.mikephil.charting.interfaces.datasets.IPieDataSet getDataSetByLabel2(java.lang.String r3, boolean r4) {
            r2 = this;
            r0 = 0
            r1 = 0
            if (r4 == 0) goto L20
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r4 = r2.mDataSets
            java.lang.Object r4 = r4.get(r1)
            com.github.mikephil.charting.interfaces.datasets.IPieDataSet r4 = (com.github.mikephil.charting.interfaces.datasets.IPieDataSet) r4
            java.lang.String r4 = r4.getLabel()
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 == 0) goto L1f
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r3 = r2.mDataSets
            java.lang.Object r3 = r3.get(r1)
            com.github.mikephil.charting.interfaces.datasets.IPieDataSet r3 = (com.github.mikephil.charting.interfaces.datasets.IPieDataSet) r3
            return r3
        L1f:
            return r0
        L20:
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r4 = r2.mDataSets
            java.lang.Object r4 = r4.get(r1)
            com.github.mikephil.charting.interfaces.datasets.IPieDataSet r4 = (com.github.mikephil.charting.interfaces.datasets.IPieDataSet) r4
            java.lang.String r4 = r4.getLabel()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L3b
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r3 = r2.mDataSets
            java.lang.Object r3 = r3.get(r1)
            com.github.mikephil.charting.interfaces.datasets.IPieDataSet r3 = (com.github.mikephil.charting.interfaces.datasets.IPieDataSet) r3
            return r3
        L3b:
            return r0
    }

    @Override // com.github.mikephil.charting.data.ChartData
    public com.github.mikephil.charting.data.Entry getEntryForHighlight(com.github.mikephil.charting.highlight.Highlight r2) {
            r1 = this;
            com.github.mikephil.charting.interfaces.datasets.IPieDataSet r0 = r1.getDataSet()
            float r2 = r2.getX()
            int r2 = (int) r2
            com.github.mikephil.charting.data.Entry r2 = r0.getEntryForIndex(r2)
            return r2
    }

    public float getYValueSum() {
            r3 = this;
            r0 = 0
            r1 = 0
        L2:
            com.github.mikephil.charting.interfaces.datasets.IPieDataSet r2 = r3.getDataSet()
            int r2 = r2.getEntryCount()
            if (r1 >= r2) goto L1e
            com.github.mikephil.charting.interfaces.datasets.IPieDataSet r2 = r3.getDataSet()
            com.github.mikephil.charting.data.Entry r2 = r2.getEntryForIndex(r1)
            com.github.mikephil.charting.data.PieEntry r2 = (com.github.mikephil.charting.data.PieEntry) r2
            float r2 = r2.getY()
            float r0 = r0 + r2
            int r1 = r1 + 1
            goto L2
        L1e:
            return r0
    }

    public void setDataSet(com.github.mikephil.charting.interfaces.datasets.IPieDataSet r2) {
            r1 = this;
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r1.mDataSets
            r0.clear()
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r1.mDataSets
            r0.add(r2)
            r1.notifyDataChanged()
            return
    }
}
