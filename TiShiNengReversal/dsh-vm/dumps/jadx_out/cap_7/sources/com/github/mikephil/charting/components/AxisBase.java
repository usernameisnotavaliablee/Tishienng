package com.github.mikephil.charting.components;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public abstract class AxisBase extends com.github.mikephil.charting.components.ComponentBase {
    private int mAxisLineColor;
    private android.graphics.DashPathEffect mAxisLineDashPathEffect;
    private float mAxisLineWidth;
    public float mAxisMaximum;
    public float mAxisMinimum;
    public float mAxisRange;
    protected com.github.mikephil.charting.formatter.ValueFormatter mAxisValueFormatter;
    protected boolean mCenterAxisLabels;
    public float[] mCenteredEntries;
    protected boolean mCustomAxisMax;
    protected boolean mCustomAxisMin;
    public int mDecimals;
    protected boolean mDrawAxisLine;
    protected boolean mDrawGridLines;
    protected boolean mDrawGridLinesBehindData;
    protected boolean mDrawLabels;
    protected boolean mDrawLimitLineBehindData;
    public float[] mEntries;
    public int mEntryCount;
    protected boolean mForceLabels;
    protected float mGranularity;
    protected boolean mGranularityEnabled;
    private int mGridColor;
    private android.graphics.DashPathEffect mGridDashPathEffect;
    private float mGridLineWidth;
    private int mLabelCount;
    protected java.util.List<com.github.mikephil.charting.components.LimitLine> mLimitLines;
    protected float mSpaceMax;
    protected float mSpaceMin;

    public AxisBase() {
            r3 = this;
            r3.<init>()
            r0 = -7829368(0xffffffffff888888, float:NaN)
            r3.mGridColor = r0
            r1 = 1065353216(0x3f800000, float:1.0)
            r3.mGridLineWidth = r1
            r3.mAxisLineColor = r0
            r3.mAxisLineWidth = r1
            r0 = 0
            float[] r2 = new float[r0]
            r3.mEntries = r2
            float[] r2 = new float[r0]
            r3.mCenteredEntries = r2
            r2 = 6
            r3.mLabelCount = r2
            r3.mGranularity = r1
            r3.mGranularityEnabled = r0
            r3.mForceLabels = r0
            r1 = 1
            r3.mDrawGridLines = r1
            r3.mDrawAxisLine = r1
            r3.mDrawLabels = r1
            r3.mCenterAxisLabels = r0
            r2 = 0
            r3.mAxisLineDashPathEffect = r2
            r3.mGridDashPathEffect = r2
            r3.mDrawLimitLineBehindData = r0
            r3.mDrawGridLinesBehindData = r1
            r1 = 0
            r3.mSpaceMin = r1
            r3.mSpaceMax = r1
            r3.mCustomAxisMin = r0
            r3.mCustomAxisMax = r0
            r3.mAxisMaximum = r1
            r3.mAxisMinimum = r1
            r3.mAxisRange = r1
            r0 = 1092616192(0x41200000, float:10.0)
            float r0 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r0)
            r3.mTextSize = r0
            r0 = 1084227584(0x40a00000, float:5.0)
            float r1 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r0)
            r3.mXOffset = r1
            float r0 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r0)
            r3.mYOffset = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.mLimitLines = r0
            return
    }

    public void addLimitLine(com.github.mikephil.charting.components.LimitLine r2) {
            r1 = this;
            java.util.List<com.github.mikephil.charting.components.LimitLine> r0 = r1.mLimitLines
            r0.add(r2)
            java.util.List<com.github.mikephil.charting.components.LimitLine> r2 = r1.mLimitLines
            r2.size()
            return
    }

    public void calculate(float r3, float r4) {
            r2 = this;
            boolean r0 = r2.mCustomAxisMin
            if (r0 == 0) goto L7
            float r3 = r2.mAxisMinimum
            goto La
        L7:
            float r0 = r2.mSpaceMin
            float r3 = r3 - r0
        La:
            boolean r0 = r2.mCustomAxisMax
            if (r0 == 0) goto L11
            float r4 = r2.mAxisMaximum
            goto L14
        L11:
            float r0 = r2.mSpaceMax
            float r4 = r4 + r0
        L14:
            float r0 = r4 - r3
            float r0 = java.lang.Math.abs(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L23
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 + r0
            float r3 = r3 - r0
        L23:
            r2.mAxisMinimum = r3
            r2.mAxisMaximum = r4
            float r4 = r4 - r3
            float r3 = java.lang.Math.abs(r4)
            r2.mAxisRange = r3
            return
    }

    public void disableAxisLineDashedLine() {
            r1 = this;
            r0 = 0
            r1.mAxisLineDashPathEffect = r0
            return
    }

    public void disableGridDashedLine() {
            r1 = this;
            r0 = 0
            r1.mGridDashPathEffect = r0
            return
    }

    public void enableAxisLineDashedLine(float r4, float r5, float r6) {
            r3 = this;
            android.graphics.DashPathEffect r0 = new android.graphics.DashPathEffect
            r1 = 2
            float[] r1 = new float[r1]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            r1[r4] = r5
            r0.<init>(r1, r6)
            r3.mAxisLineDashPathEffect = r0
            return
    }

    public void enableGridDashedLine(float r4, float r5, float r6) {
            r3 = this;
            android.graphics.DashPathEffect r0 = new android.graphics.DashPathEffect
            r1 = 2
            float[] r1 = new float[r1]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            r1[r4] = r5
            r0.<init>(r1, r6)
            r3.mGridDashPathEffect = r0
            return
    }

    public int getAxisLineColor() {
            r1 = this;
            int r0 = r1.mAxisLineColor
            return r0
    }

    public android.graphics.DashPathEffect getAxisLineDashPathEffect() {
            r1 = this;
            android.graphics.DashPathEffect r0 = r1.mAxisLineDashPathEffect
            return r0
    }

    public float getAxisLineWidth() {
            r1 = this;
            float r0 = r1.mAxisLineWidth
            return r0
    }

    public float getAxisMaximum() {
            r1 = this;
            float r0 = r1.mAxisMaximum
            return r0
    }

    public float getAxisMinimum() {
            r1 = this;
            float r0 = r1.mAxisMinimum
            return r0
    }

    public java.lang.String getFormattedLabel(int r3) {
            r2 = this;
            if (r3 < 0) goto L15
            float[] r0 = r2.mEntries
            int r0 = r0.length
            if (r3 < r0) goto L8
            goto L15
        L8:
            com.github.mikephil.charting.formatter.ValueFormatter r0 = r2.getValueFormatter()
            float[] r1 = r2.mEntries
            r3 = r1[r3]
            java.lang.String r3 = r0.getAxisLabel(r3, r2)
            return r3
        L15:
            java.lang.String r3 = ""
            return r3
    }

    public float getGranularity() {
            r1 = this;
            float r0 = r1.mGranularity
            return r0
    }

    public int getGridColor() {
            r1 = this;
            int r0 = r1.mGridColor
            return r0
    }

    public android.graphics.DashPathEffect getGridDashPathEffect() {
            r1 = this;
            android.graphics.DashPathEffect r0 = r1.mGridDashPathEffect
            return r0
    }

    public float getGridLineWidth() {
            r1 = this;
            float r0 = r1.mGridLineWidth
            return r0
    }

    public int getLabelCount() {
            r1 = this;
            int r0 = r1.mLabelCount
            return r0
    }

    public java.util.List<com.github.mikephil.charting.components.LimitLine> getLimitLines() {
            r1 = this;
            java.util.List<com.github.mikephil.charting.components.LimitLine> r0 = r1.mLimitLines
            return r0
    }

    public java.lang.String getLongestLabel() {
            r5 = this;
            java.lang.String r0 = ""
            r1 = 0
        L3:
            float[] r2 = r5.mEntries
            int r2 = r2.length
            if (r1 >= r2) goto L1c
            java.lang.String r2 = r5.getFormattedLabel(r1)
            if (r2 == 0) goto L19
            int r3 = r0.length()
            int r4 = r2.length()
            if (r3 >= r4) goto L19
            r0 = r2
        L19:
            int r1 = r1 + 1
            goto L3
        L1c:
            return r0
    }

    public float getSpaceMax() {
            r1 = this;
            float r0 = r1.mSpaceMax
            return r0
    }

    public float getSpaceMin() {
            r1 = this;
            float r0 = r1.mSpaceMin
            return r0
    }

    public com.github.mikephil.charting.formatter.ValueFormatter getValueFormatter() {
            r2 = this;
            com.github.mikephil.charting.formatter.ValueFormatter r0 = r2.mAxisValueFormatter
            if (r0 == 0) goto L12
            boolean r1 = r0 instanceof com.github.mikephil.charting.formatter.DefaultAxisValueFormatter
            if (r1 == 0) goto L1b
            com.github.mikephil.charting.formatter.DefaultAxisValueFormatter r0 = (com.github.mikephil.charting.formatter.DefaultAxisValueFormatter) r0
            int r0 = r0.getDecimalDigits()
            int r1 = r2.mDecimals
            if (r0 == r1) goto L1b
        L12:
            com.github.mikephil.charting.formatter.DefaultAxisValueFormatter r0 = new com.github.mikephil.charting.formatter.DefaultAxisValueFormatter
            int r1 = r2.mDecimals
            r0.<init>(r1)
            r2.mAxisValueFormatter = r0
        L1b:
            com.github.mikephil.charting.formatter.ValueFormatter r0 = r2.mAxisValueFormatter
            return r0
    }

    public boolean isAxisLineDashedLineEnabled() {
            r1 = this;
            android.graphics.DashPathEffect r0 = r1.mAxisLineDashPathEffect
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = 1
            return r0
    }

    public boolean isAxisMaxCustom() {
            r1 = this;
            boolean r0 = r1.mCustomAxisMax
            return r0
    }

    public boolean isAxisMinCustom() {
            r1 = this;
            boolean r0 = r1.mCustomAxisMin
            return r0
    }

    public boolean isCenterAxisLabelsEnabled() {
            r1 = this;
            boolean r0 = r1.mCenterAxisLabels
            if (r0 == 0) goto La
            int r0 = r1.mEntryCount
            if (r0 <= 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public boolean isDrawAxisLineEnabled() {
            r1 = this;
            boolean r0 = r1.mDrawAxisLine
            return r0
    }

    public boolean isDrawGridLinesBehindDataEnabled() {
            r1 = this;
            boolean r0 = r1.mDrawGridLinesBehindData
            return r0
    }

    public boolean isDrawGridLinesEnabled() {
            r1 = this;
            boolean r0 = r1.mDrawGridLines
            return r0
    }

    public boolean isDrawLabelsEnabled() {
            r1 = this;
            boolean r0 = r1.mDrawLabels
            return r0
    }

    public boolean isDrawLimitLinesBehindDataEnabled() {
            r1 = this;
            boolean r0 = r1.mDrawLimitLineBehindData
            return r0
    }

    public boolean isForceLabelsEnabled() {
            r1 = this;
            boolean r0 = r1.mForceLabels
            return r0
    }

    public boolean isGranularityEnabled() {
            r1 = this;
            boolean r0 = r1.mGranularityEnabled
            return r0
    }

    public boolean isGridDashedLineEnabled() {
            r1 = this;
            android.graphics.DashPathEffect r0 = r1.mGridDashPathEffect
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = 1
            return r0
    }

    public void removeAllLimitLines() {
            r1 = this;
            java.util.List<com.github.mikephil.charting.components.LimitLine> r0 = r1.mLimitLines
            r0.clear()
            return
    }

    public void removeLimitLine(com.github.mikephil.charting.components.LimitLine r2) {
            r1 = this;
            java.util.List<com.github.mikephil.charting.components.LimitLine> r0 = r1.mLimitLines
            r0.remove(r2)
            return
    }

    public void resetAxisMaximum() {
            r1 = this;
            r0 = 0
            r1.mCustomAxisMax = r0
            return
    }

    public void resetAxisMinimum() {
            r1 = this;
            r0 = 0
            r1.mCustomAxisMin = r0
            return
    }

    public void setAxisLineColor(int r1) {
            r0 = this;
            r0.mAxisLineColor = r1
            return
    }

    public void setAxisLineDashedLine(android.graphics.DashPathEffect r1) {
            r0 = this;
            r0.mAxisLineDashPathEffect = r1
            return
    }

    public void setAxisLineWidth(float r1) {
            r0 = this;
            float r1 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r1)
            r0.mAxisLineWidth = r1
            return
    }

    @java.lang.Deprecated
    public void setAxisMaxValue(float r1) {
            r0 = this;
            r0.setAxisMaximum(r1)
            return
    }

    public void setAxisMaximum(float r2) {
            r1 = this;
            r0 = 1
            r1.mCustomAxisMax = r0
            r1.mAxisMaximum = r2
            float r0 = r1.mAxisMinimum
            float r2 = r2 - r0
            float r2 = java.lang.Math.abs(r2)
            r1.mAxisRange = r2
            return
    }

    @java.lang.Deprecated
    public void setAxisMinValue(float r1) {
            r0 = this;
            r0.setAxisMinimum(r1)
            return
    }

    public void setAxisMinimum(float r2) {
            r1 = this;
            r0 = 1
            r1.mCustomAxisMin = r0
            r1.mAxisMinimum = r2
            float r0 = r1.mAxisMaximum
            float r0 = r0 - r2
            float r2 = java.lang.Math.abs(r0)
            r1.mAxisRange = r2
            return
    }

    public void setCenterAxisLabels(boolean r1) {
            r0 = this;
            r0.mCenterAxisLabels = r1
            return
    }

    public void setDrawAxisLine(boolean r1) {
            r0 = this;
            r0.mDrawAxisLine = r1
            return
    }

    public void setDrawGridLines(boolean r1) {
            r0 = this;
            r0.mDrawGridLines = r1
            return
    }

    public void setDrawGridLinesBehindData(boolean r1) {
            r0 = this;
            r0.mDrawGridLinesBehindData = r1
            return
    }

    public void setDrawLabels(boolean r1) {
            r0 = this;
            r0.mDrawLabels = r1
            return
    }

    public void setDrawLimitLinesBehindData(boolean r1) {
            r0 = this;
            r0.mDrawLimitLineBehindData = r1
            return
    }

    public void setGranularity(float r1) {
            r0 = this;
            r0.mGranularity = r1
            r1 = 1
            r0.mGranularityEnabled = r1
            return
    }

    public void setGranularityEnabled(boolean r1) {
            r0 = this;
            r0.mGranularityEnabled = r1
            return
    }

    public void setGridColor(int r1) {
            r0 = this;
            r0.mGridColor = r1
            return
    }

    public void setGridDashedLine(android.graphics.DashPathEffect r1) {
            r0 = this;
            r0.mGridDashPathEffect = r1
            return
    }

    public void setGridLineWidth(float r1) {
            r0 = this;
            float r1 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r1)
            r0.mGridLineWidth = r1
            return
    }

    public void setLabelCount(int r2) {
            r1 = this;
            r0 = 25
            if (r2 <= r0) goto L6
            r2 = 25
        L6:
            r0 = 2
            if (r2 >= r0) goto La
            r2 = 2
        La:
            r1.mLabelCount = r2
            r2 = 0
            r1.mForceLabels = r2
            return
    }

    public void setLabelCount(int r1, boolean r2) {
            r0 = this;
            r0.setLabelCount(r1)
            r0.mForceLabels = r2
            return
    }

    public void setSpaceMax(float r1) {
            r0 = this;
            r0.mSpaceMax = r1
            return
    }

    public void setSpaceMin(float r1) {
            r0 = this;
            r0.mSpaceMin = r1
            return
    }

    public void setValueFormatter(com.github.mikephil.charting.formatter.ValueFormatter r2) {
            r1 = this;
            if (r2 != 0) goto Lc
            com.github.mikephil.charting.formatter.DefaultAxisValueFormatter r2 = new com.github.mikephil.charting.formatter.DefaultAxisValueFormatter
            int r0 = r1.mDecimals
            r2.<init>(r0)
            r1.mAxisValueFormatter = r2
            return
        Lc:
            r1.mAxisValueFormatter = r2
            return
    }
}
