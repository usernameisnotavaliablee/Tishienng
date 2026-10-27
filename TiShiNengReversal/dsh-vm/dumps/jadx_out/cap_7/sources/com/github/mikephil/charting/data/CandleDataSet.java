package com.github.mikephil.charting.data;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class CandleDataSet extends com.github.mikephil.charting.data.LineScatterCandleRadarDataSet<com.github.mikephil.charting.data.CandleEntry> implements com.github.mikephil.charting.interfaces.datasets.ICandleDataSet {
    private float mBarSpace;
    protected int mDecreasingColor;
    protected android.graphics.Paint.Style mDecreasingPaintStyle;
    protected int mIncreasingColor;
    protected android.graphics.Paint.Style mIncreasingPaintStyle;
    protected int mNeutralColor;
    protected int mShadowColor;
    private boolean mShadowColorSameAsCandle;
    private float mShadowWidth;
    private boolean mShowCandleBar;

    public CandleDataSet(java.util.List<com.github.mikephil.charting.data.CandleEntry> r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 1077936128(0x40400000, float:3.0)
            r0.mShadowWidth = r1
            r1 = 1
            r0.mShowCandleBar = r1
            r1 = 1036831949(0x3dcccccd, float:0.1)
            r0.mBarSpace = r1
            r1 = 0
            r0.mShadowColorSameAsCandle = r1
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            r0.mIncreasingPaintStyle = r1
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r0.mDecreasingPaintStyle = r1
            r1 = 1122868(0x112234, float:1.573473E-39)
            r0.mNeutralColor = r1
            r0.mIncreasingColor = r1
            r0.mDecreasingColor = r1
            r0.mShadowColor = r1
            return
    }

    protected void calcMinMax(com.github.mikephil.charting.data.CandleEntry r3) {
            r2 = this;
            float r0 = r3.getLow()
            float r1 = r2.mYMin
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L10
            float r0 = r3.getLow()
            r2.mYMin = r0
        L10:
            float r0 = r3.getHigh()
            float r1 = r2.mYMax
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L20
            float r0 = r3.getHigh()
            r2.mYMax = r0
        L20:
            r2.calcMinMaxX(r3)
            return
    }

    @Override // com.github.mikephil.charting.data.DataSet
    protected /* bridge */ /* synthetic */ void calcMinMax(com.github.mikephil.charting.data.Entry r1) {
            r0 = this;
            com.github.mikephil.charting.data.CandleEntry r1 = (com.github.mikephil.charting.data.CandleEntry) r1
            r0.calcMinMax(r1)
            return
    }

    protected void calcMinMaxY(com.github.mikephil.charting.data.CandleEntry r3) {
            r2 = this;
            float r0 = r3.getHigh()
            float r1 = r2.mYMin
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L10
            float r0 = r3.getHigh()
            r2.mYMin = r0
        L10:
            float r0 = r3.getHigh()
            float r1 = r2.mYMax
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L20
            float r0 = r3.getHigh()
            r2.mYMax = r0
        L20:
            float r0 = r3.getLow()
            float r1 = r2.mYMin
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L30
            float r0 = r3.getLow()
            r2.mYMin = r0
        L30:
            float r0 = r3.getLow()
            float r1 = r2.mYMax
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L40
            float r3 = r3.getLow()
            r2.mYMax = r3
        L40:
            return
    }

    @Override // com.github.mikephil.charting.data.DataSet
    protected /* bridge */ /* synthetic */ void calcMinMaxY(com.github.mikephil.charting.data.Entry r1) {
            r0 = this;
            com.github.mikephil.charting.data.CandleEntry r1 = (com.github.mikephil.charting.data.CandleEntry) r1
            r0.calcMinMaxY(r1)
            return
    }

    @Override // com.github.mikephil.charting.data.DataSet
    public com.github.mikephil.charting.data.DataSet<com.github.mikephil.charting.data.CandleEntry> copy() {
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
            com.github.mikephil.charting.data.CandleEntry r2 = (com.github.mikephil.charting.data.CandleEntry) r2
            com.github.mikephil.charting.data.CandleEntry r2 = r2.copy()
            r0.add(r2)
            int r1 = r1 + 1
            goto L6
        L20:
            com.github.mikephil.charting.data.CandleDataSet r1 = new com.github.mikephil.charting.data.CandleDataSet
            java.lang.String r2 = r3.getLabel()
            r1.<init>(r0, r2)
            r3.copy(r1)
            return r1
    }

    protected void copy(com.github.mikephil.charting.data.CandleDataSet r2) {
            r1 = this;
            super.copy(r2)
            float r0 = r1.mShadowWidth
            r2.mShadowWidth = r0
            boolean r0 = r1.mShowCandleBar
            r2.mShowCandleBar = r0
            float r0 = r1.mBarSpace
            r2.mBarSpace = r0
            boolean r0 = r1.mShadowColorSameAsCandle
            r2.mShadowColorSameAsCandle = r0
            int r0 = r1.mHighLightColor
            r2.mHighLightColor = r0
            android.graphics.Paint$Style r0 = r1.mIncreasingPaintStyle
            r2.mIncreasingPaintStyle = r0
            android.graphics.Paint$Style r0 = r1.mDecreasingPaintStyle
            r2.mDecreasingPaintStyle = r0
            int r0 = r1.mNeutralColor
            r2.mNeutralColor = r0
            int r0 = r1.mIncreasingColor
            r2.mIncreasingColor = r0
            int r0 = r1.mDecreasingColor
            r2.mDecreasingColor = r0
            int r0 = r1.mShadowColor
            r2.mShadowColor = r0
            return
    }

    public float getBarSpace() {
            r1 = this;
            float r0 = r1.mBarSpace
            return r0
    }

    public int getDecreasingColor() {
            r1 = this;
            int r0 = r1.mDecreasingColor
            return r0
    }

    public android.graphics.Paint.Style getDecreasingPaintStyle() {
            r1 = this;
            android.graphics.Paint$Style r0 = r1.mDecreasingPaintStyle
            return r0
    }

    public int getIncreasingColor() {
            r1 = this;
            int r0 = r1.mIncreasingColor
            return r0
    }

    public android.graphics.Paint.Style getIncreasingPaintStyle() {
            r1 = this;
            android.graphics.Paint$Style r0 = r1.mIncreasingPaintStyle
            return r0
    }

    public int getNeutralColor() {
            r1 = this;
            int r0 = r1.mNeutralColor
            return r0
    }

    public int getShadowColor() {
            r1 = this;
            int r0 = r1.mShadowColor
            return r0
    }

    public boolean getShadowColorSameAsCandle() {
            r1 = this;
            boolean r0 = r1.mShadowColorSameAsCandle
            return r0
    }

    public float getShadowWidth() {
            r1 = this;
            float r0 = r1.mShadowWidth
            return r0
    }

    public boolean getShowCandleBar() {
            r1 = this;
            boolean r0 = r1.mShowCandleBar
            return r0
    }

    public void setBarSpace(float r3) {
            r2 = this;
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto L6
            r3 = 0
        L6:
            r0 = 1055286886(0x3ee66666, float:0.45)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L10
            r3 = 1055286886(0x3ee66666, float:0.45)
        L10:
            r2.mBarSpace = r3
            return
    }

    public void setDecreasingColor(int r1) {
            r0 = this;
            r0.mDecreasingColor = r1
            return
    }

    public void setDecreasingPaintStyle(android.graphics.Paint.Style r1) {
            r0 = this;
            r0.mDecreasingPaintStyle = r1
            return
    }

    public void setIncreasingColor(int r1) {
            r0 = this;
            r0.mIncreasingColor = r1
            return
    }

    public void setIncreasingPaintStyle(android.graphics.Paint.Style r1) {
            r0 = this;
            r0.mIncreasingPaintStyle = r1
            return
    }

    public void setNeutralColor(int r1) {
            r0 = this;
            r0.mNeutralColor = r1
            return
    }

    public void setShadowColor(int r1) {
            r0 = this;
            r0.mShadowColor = r1
            return
    }

    public void setShadowColorSameAsCandle(boolean r1) {
            r0 = this;
            r0.mShadowColorSameAsCandle = r1
            return
    }

    public void setShadowWidth(float r1) {
            r0 = this;
            float r1 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r1)
            r0.mShadowWidth = r1
            return
    }

    public void setShowCandleBar(boolean r1) {
            r0 = this;
            r0.mShowCandleBar = r1
            return
    }
}
