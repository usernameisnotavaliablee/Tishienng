package com.github.mikephil.charting.data;

import com.github.mikephil.charting.data.Entry;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public abstract class LineRadarDataSet<T extends com.github.mikephil.charting.data.Entry> extends com.github.mikephil.charting.data.LineScatterCandleRadarDataSet<T> implements com.github.mikephil.charting.interfaces.datasets.ILineRadarDataSet<T> {
    private boolean mDrawFilled;
    private int mFillAlpha;
    private int mFillColor;
    protected android.graphics.drawable.Drawable mFillDrawable;
    private float mLineWidth;

    public LineRadarDataSet(java.util.List<T> r2, java.lang.String r3) {
            r1 = this;
            r1.<init>(r2, r3)
            r2 = 234(0xea, float:3.28E-43)
            r3 = 255(0xff, float:3.57E-43)
            r0 = 140(0x8c, float:1.96E-43)
            int r2 = android.graphics.Color.rgb(r0, r2, r3)
            r1.mFillColor = r2
            r2 = 85
            r1.mFillAlpha = r2
            r2 = 1075838976(0x40200000, float:2.5)
            r1.mLineWidth = r2
            r2 = 0
            r1.mDrawFilled = r2
            return
    }

    protected void copy(com.github.mikephil.charting.data.LineRadarDataSet r2) {
            r1 = this;
            super.copy(r2)
            boolean r0 = r1.mDrawFilled
            r2.mDrawFilled = r0
            int r0 = r1.mFillAlpha
            r2.mFillAlpha = r0
            int r0 = r1.mFillColor
            r2.mFillColor = r0
            android.graphics.drawable.Drawable r0 = r1.mFillDrawable
            r2.mFillDrawable = r0
            float r0 = r1.mLineWidth
            r2.mLineWidth = r0
            return
    }

    public int getFillAlpha() {
            r1 = this;
            int r0 = r1.mFillAlpha
            return r0
    }

    public int getFillColor() {
            r1 = this;
            int r0 = r1.mFillColor
            return r0
    }

    public android.graphics.drawable.Drawable getFillDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mFillDrawable
            return r0
    }

    public float getLineWidth() {
            r1 = this;
            float r0 = r1.mLineWidth
            return r0
    }

    public boolean isDrawFilledEnabled() {
            r1 = this;
            boolean r0 = r1.mDrawFilled
            return r0
    }

    public void setDrawFilled(boolean r1) {
            r0 = this;
            r0.mDrawFilled = r1
            return
    }

    public void setFillAlpha(int r1) {
            r0 = this;
            r0.mFillAlpha = r1
            return
    }

    public void setFillColor(int r1) {
            r0 = this;
            r0.mFillColor = r1
            r1 = 0
            r0.mFillDrawable = r1
            return
    }

    @android.annotation.TargetApi(18)
    public void setFillDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.mFillDrawable = r1
            return
    }

    public void setLineWidth(float r3) {
            r2 = this;
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto L6
            r3 = 0
        L6:
            r0 = 1092616192(0x41200000, float:10.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto Le
            r3 = 1092616192(0x41200000, float:10.0)
        Le:
            float r3 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r3)
            r2.mLineWidth = r3
            return
    }
}
