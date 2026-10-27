package com.github.mikephil.charting.data;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class BarDataSet extends com.github.mikephil.charting.data.BarLineScatterCandleBubbleDataSet<com.github.mikephil.charting.data.BarEntry> implements com.github.mikephil.charting.interfaces.datasets.IBarDataSet {
    private int mBarBorderColor;
    private float mBarBorderWidth;
    private int mBarShadowColor;
    private int mEntryCountStacks;
    private int mHighLightAlpha;
    private java.lang.String[] mStackLabels;
    private int mStackSize;

    public BarDataSet(java.util.List<com.github.mikephil.charting.data.BarEntry> r2, java.lang.String r3) {
            r1 = this;
            r1.<init>(r2, r3)
            r3 = 1
            r1.mStackSize = r3
            r3 = 215(0xd7, float:3.01E-43)
            int r3 = android.graphics.Color.rgb(r3, r3, r3)
            r1.mBarShadowColor = r3
            r3 = 0
            r1.mBarBorderWidth = r3
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1.mBarBorderColor = r3
            r3 = 120(0x78, float:1.68E-43)
            r1.mHighLightAlpha = r3
            r3 = 0
            r1.mEntryCountStacks = r3
            java.lang.String r0 = "Stack"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r1.mStackLabels = r0
            int r3 = android.graphics.Color.rgb(r3, r3, r3)
            r1.mHighLightColor = r3
            r1.calcStackSize(r2)
            r1.calcEntryCountIncludingStacks(r2)
            return
    }

    private void calcEntryCountIncludingStacks(java.util.List<com.github.mikephil.charting.data.BarEntry> r4) {
            r3 = this;
            r0 = 0
            r3.mEntryCountStacks = r0
        L3:
            int r1 = r4.size()
            if (r0 >= r1) goto L25
            java.lang.Object r1 = r4.get(r0)
            com.github.mikephil.charting.data.BarEntry r1 = (com.github.mikephil.charting.data.BarEntry) r1
            float[] r1 = r1.getYVals()
            if (r1 != 0) goto L1c
            int r1 = r3.mEntryCountStacks
            int r1 = r1 + 1
            r3.mEntryCountStacks = r1
            goto L22
        L1c:
            int r2 = r3.mEntryCountStacks
            int r1 = r1.length
            int r2 = r2 + r1
            r3.mEntryCountStacks = r2
        L22:
            int r0 = r0 + 1
            goto L3
        L25:
            return
    }

    private void calcStackSize(java.util.List<com.github.mikephil.charting.data.BarEntry> r5) {
            r4 = this;
            r0 = 0
        L1:
            int r1 = r5.size()
            if (r0 >= r1) goto L1e
            java.lang.Object r1 = r5.get(r0)
            com.github.mikephil.charting.data.BarEntry r1 = (com.github.mikephil.charting.data.BarEntry) r1
            float[] r1 = r1.getYVals()
            if (r1 == 0) goto L1b
            int r2 = r1.length
            int r3 = r4.mStackSize
            if (r2 <= r3) goto L1b
            int r1 = r1.length
            r4.mStackSize = r1
        L1b:
            int r0 = r0 + 1
            goto L1
        L1e:
            return
    }

    protected void calcMinMax(com.github.mikephil.charting.data.BarEntry r3) {
            r2 = this;
            if (r3 == 0) goto L58
            float r0 = r3.getY()
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L58
            float[] r0 = r3.getYVals()
            if (r0 != 0) goto L33
            float r0 = r3.getY()
            float r1 = r2.mYMin
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L22
            float r0 = r3.getY()
            r2.mYMin = r0
        L22:
            float r0 = r3.getY()
            float r1 = r2.mYMax
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L55
            float r0 = r3.getY()
            r2.mYMax = r0
            goto L55
        L33:
            float r0 = r3.getNegativeSum()
            float r0 = -r0
            float r1 = r2.mYMin
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L45
            float r0 = r3.getNegativeSum()
            float r0 = -r0
            r2.mYMin = r0
        L45:
            float r0 = r3.getPositiveSum()
            float r1 = r2.mYMax
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L55
            float r0 = r3.getPositiveSum()
            r2.mYMax = r0
        L55:
            r2.calcMinMaxX(r3)
        L58:
            return
    }

    @Override // com.github.mikephil.charting.data.DataSet
    protected /* bridge */ /* synthetic */ void calcMinMax(com.github.mikephil.charting.data.Entry r1) {
            r0 = this;
            com.github.mikephil.charting.data.BarEntry r1 = (com.github.mikephil.charting.data.BarEntry) r1
            r0.calcMinMax(r1)
            return
    }

    @Override // com.github.mikephil.charting.data.DataSet
    public com.github.mikephil.charting.data.DataSet<com.github.mikephil.charting.data.BarEntry> copy() {
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
            com.github.mikephil.charting.data.BarEntry r2 = (com.github.mikephil.charting.data.BarEntry) r2
            com.github.mikephil.charting.data.BarEntry r2 = r2.copy()
            r0.add(r2)
            int r1 = r1 + 1
            goto L6
        L20:
            com.github.mikephil.charting.data.BarDataSet r1 = new com.github.mikephil.charting.data.BarDataSet
            java.lang.String r2 = r3.getLabel()
            r1.<init>(r0, r2)
            r3.copy(r1)
            return r1
    }

    protected void copy(com.github.mikephil.charting.data.BarDataSet r2) {
            r1 = this;
            super.copy(r2)
            int r0 = r1.mStackSize
            r2.mStackSize = r0
            int r0 = r1.mBarShadowColor
            r2.mBarShadowColor = r0
            float r0 = r1.mBarBorderWidth
            r2.mBarBorderWidth = r0
            java.lang.String[] r0 = r1.mStackLabels
            r2.mStackLabels = r0
            int r0 = r1.mHighLightAlpha
            r2.mHighLightAlpha = r0
            return
    }

    public int getBarBorderColor() {
            r1 = this;
            int r0 = r1.mBarBorderColor
            return r0
    }

    public float getBarBorderWidth() {
            r1 = this;
            float r0 = r1.mBarBorderWidth
            return r0
    }

    public int getBarShadowColor() {
            r1 = this;
            int r0 = r1.mBarShadowColor
            return r0
    }

    public int getEntryCountStacks() {
            r1 = this;
            int r0 = r1.mEntryCountStacks
            return r0
    }

    public int getHighLightAlpha() {
            r1 = this;
            int r0 = r1.mHighLightAlpha
            return r0
    }

    public java.lang.String[] getStackLabels() {
            r1 = this;
            java.lang.String[] r0 = r1.mStackLabels
            return r0
    }

    public int getStackSize() {
            r1 = this;
            int r0 = r1.mStackSize
            return r0
    }

    public boolean isStacked() {
            r2 = this;
            int r0 = r2.mStackSize
            r1 = 1
            if (r0 <= r1) goto L6
            return r1
        L6:
            r0 = 0
            return r0
    }

    public void setBarBorderColor(int r1) {
            r0 = this;
            r0.mBarBorderColor = r1
            return
    }

    public void setBarBorderWidth(float r1) {
            r0 = this;
            r0.mBarBorderWidth = r1
            return
    }

    public void setBarShadowColor(int r1) {
            r0 = this;
            r0.mBarShadowColor = r1
            return
    }

    public void setHighLightAlpha(int r1) {
            r0 = this;
            r0.mHighLightAlpha = r1
            return
    }

    public void setStackLabels(java.lang.String[] r1) {
            r0 = this;
            r0.mStackLabels = r1
            return
    }
}
