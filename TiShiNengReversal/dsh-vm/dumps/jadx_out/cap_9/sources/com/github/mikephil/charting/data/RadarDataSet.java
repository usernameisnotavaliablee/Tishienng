package com.github.mikephil.charting.data;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class RadarDataSet extends com.github.mikephil.charting.data.LineRadarDataSet<com.github.mikephil.charting.data.RadarEntry> implements com.github.mikephil.charting.interfaces.datasets.IRadarDataSet {
    protected boolean mDrawHighlightCircleEnabled;
    protected int mHighlightCircleFillColor;
    protected float mHighlightCircleInnerRadius;
    protected float mHighlightCircleOuterRadius;
    protected int mHighlightCircleStrokeAlpha;
    protected int mHighlightCircleStrokeColor;
    protected float mHighlightCircleStrokeWidth;

    public RadarDataSet(java.util.List<com.github.mikephil.charting.data.RadarEntry> r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.mDrawHighlightCircleEnabled = r1
            r1 = -1
            r0.mHighlightCircleFillColor = r1
            r1 = 1122867(0x112233, float:1.573472E-39)
            r0.mHighlightCircleStrokeColor = r1
            r1 = 76
            r0.mHighlightCircleStrokeAlpha = r1
            r1 = 1077936128(0x40400000, float:3.0)
            r0.mHighlightCircleInnerRadius = r1
            r1 = 1082130432(0x40800000, float:4.0)
            r0.mHighlightCircleOuterRadius = r1
            r1 = 1073741824(0x40000000, float:2.0)
            r0.mHighlightCircleStrokeWidth = r1
            return
    }

    public com.github.mikephil.charting.data.DataSet<com.github.mikephil.charting.data.RadarEntry> copy() {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            java.util.List r2 = r3.mValues
            int r2 = r2.size()
            if (r1 >= r2) goto L20
            java.util.List r2 = r3.mValues
            java.lang.Object r2 = r2.get(r1)
            com.github.mikephil.charting.data.RadarEntry r2 = (com.github.mikephil.charting.data.RadarEntry) r2
            com.github.mikephil.charting.data.RadarEntry r2 = r2.m1copy()
            r0.add(r2)
            int r1 = r1 + 1
            goto L6
        L20:
            com.github.mikephil.charting.data.RadarDataSet r1 = new com.github.mikephil.charting.data.RadarDataSet
            java.lang.String r2 = r3.getLabel()
            r1.<init>(r0, r2)
            r3.copy(r1)
            return r1
    }

    protected void copy(com.github.mikephil.charting.data.RadarDataSet r2) {
            r1 = this;
            super.copy(r2)
            boolean r0 = r1.mDrawHighlightCircleEnabled
            r2.mDrawHighlightCircleEnabled = r0
            int r0 = r1.mHighlightCircleFillColor
            r2.mHighlightCircleFillColor = r0
            float r0 = r1.mHighlightCircleInnerRadius
            r2.mHighlightCircleInnerRadius = r0
            int r0 = r1.mHighlightCircleStrokeAlpha
            r2.mHighlightCircleStrokeAlpha = r0
            int r0 = r1.mHighlightCircleStrokeColor
            r2.mHighlightCircleStrokeColor = r0
            float r0 = r1.mHighlightCircleStrokeWidth
            r2.mHighlightCircleStrokeWidth = r0
            return
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IRadarDataSet
    public int getHighlightCircleFillColor() {
            r1 = this;
            int r0 = r1.mHighlightCircleFillColor
            return r0
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IRadarDataSet
    public float getHighlightCircleInnerRadius() {
            r1 = this;
            float r0 = r1.mHighlightCircleInnerRadius
            return r0
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IRadarDataSet
    public float getHighlightCircleOuterRadius() {
            r1 = this;
            float r0 = r1.mHighlightCircleOuterRadius
            return r0
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IRadarDataSet
    public int getHighlightCircleStrokeAlpha() {
            r1 = this;
            int r0 = r1.mHighlightCircleStrokeAlpha
            return r0
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IRadarDataSet
    public int getHighlightCircleStrokeColor() {
            r1 = this;
            int r0 = r1.mHighlightCircleStrokeColor
            return r0
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IRadarDataSet
    public float getHighlightCircleStrokeWidth() {
            r1 = this;
            float r0 = r1.mHighlightCircleStrokeWidth
            return r0
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IRadarDataSet
    public boolean isDrawHighlightCircleEnabled() {
            r1 = this;
            boolean r0 = r1.mDrawHighlightCircleEnabled
            return r0
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IRadarDataSet
    public void setDrawHighlightCircleEnabled(boolean r1) {
            r0 = this;
            r0.mDrawHighlightCircleEnabled = r1
            return
    }

    public void setHighlightCircleFillColor(int r1) {
            r0 = this;
            r0.mHighlightCircleFillColor = r1
            return
    }

    public void setHighlightCircleInnerRadius(float r1) {
            r0 = this;
            r0.mHighlightCircleInnerRadius = r1
            return
    }

    public void setHighlightCircleOuterRadius(float r1) {
            r0 = this;
            r0.mHighlightCircleOuterRadius = r1
            return
    }

    public void setHighlightCircleStrokeAlpha(int r1) {
            r0 = this;
            r0.mHighlightCircleStrokeAlpha = r1
            return
    }

    public void setHighlightCircleStrokeColor(int r1) {
            r0 = this;
            r0.mHighlightCircleStrokeColor = r1
            return
    }

    public void setHighlightCircleStrokeWidth(float r1) {
            r0 = this;
            r0.mHighlightCircleStrokeWidth = r1
            return
    }
}
