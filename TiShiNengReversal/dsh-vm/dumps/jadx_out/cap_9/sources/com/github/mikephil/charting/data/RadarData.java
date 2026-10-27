package com.github.mikephil.charting.data;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class RadarData extends com.github.mikephil.charting.data.ChartData<com.github.mikephil.charting.interfaces.datasets.IRadarDataSet> {
    private java.util.List<java.lang.String> mLabels;

    public RadarData() {
            r0 = this;
            r0.<init>()
            return
    }

    public RadarData(java.util.List<com.github.mikephil.charting.interfaces.datasets.IRadarDataSet> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public RadarData(com.github.mikephil.charting.interfaces.datasets.IRadarDataSet... r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public com.github.mikephil.charting.data.Entry getEntryForHighlight(com.github.mikephil.charting.highlight.Highlight r2) {
            r1 = this;
            int r0 = r2.getDataSetIndex()
            com.github.mikephil.charting.interfaces.datasets.IDataSet r0 = r1.getDataSetByIndex(r0)
            com.github.mikephil.charting.interfaces.datasets.IRadarDataSet r0 = (com.github.mikephil.charting.interfaces.datasets.IRadarDataSet) r0
            float r2 = r2.getX()
            int r2 = (int) r2
            com.github.mikephil.charting.data.Entry r2 = r0.getEntryForIndex(r2)
            return r2
    }

    public java.util.List<java.lang.String> getLabels() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.mLabels
            return r0
    }

    public void setLabels(java.util.List<java.lang.String> r1) {
            r0 = this;
            r0.mLabels = r1
            return
    }

    public void setLabels(java.lang.String... r1) {
            r0 = this;
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.mLabels = r1
            return
    }
}
