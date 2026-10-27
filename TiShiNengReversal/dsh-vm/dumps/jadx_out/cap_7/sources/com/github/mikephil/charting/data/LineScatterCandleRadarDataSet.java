package com.github.mikephil.charting.data;

import com.github.mikephil.charting.data.Entry;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public abstract class LineScatterCandleRadarDataSet<T extends com.github.mikephil.charting.data.Entry> extends com.github.mikephil.charting.data.BarLineScatterCandleBubbleDataSet<T> implements com.github.mikephil.charting.interfaces.datasets.ILineScatterCandleRadarDataSet<T> {
    protected boolean mDrawHorizontalHighlightIndicator;
    protected boolean mDrawVerticalHighlightIndicator;
    protected android.graphics.DashPathEffect mHighlightDashPathEffect;
    protected float mHighlightLineWidth;

    public LineScatterCandleRadarDataSet(java.util.List<T> r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 1
            r0.mDrawVerticalHighlightIndicator = r1
            r0.mDrawHorizontalHighlightIndicator = r1
            r1 = 1056964608(0x3f000000, float:0.5)
            r0.mHighlightLineWidth = r1
            r2 = 0
            r0.mHighlightDashPathEffect = r2
            float r1 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r1)
            r0.mHighlightLineWidth = r1
            return
    }

    protected void copy(com.github.mikephil.charting.data.LineScatterCandleRadarDataSet r2) {
            r1 = this;
            super.copy(r2)
            boolean r0 = r1.mDrawHorizontalHighlightIndicator
            r2.mDrawHorizontalHighlightIndicator = r0
            boolean r0 = r1.mDrawVerticalHighlightIndicator
            r2.mDrawVerticalHighlightIndicator = r0
            float r0 = r1.mHighlightLineWidth
            r2.mHighlightLineWidth = r0
            android.graphics.DashPathEffect r0 = r1.mHighlightDashPathEffect
            r2.mHighlightDashPathEffect = r0
            return
    }

    public void disableDashedHighlightLine() {
            r1 = this;
            r0 = 0
            r1.mHighlightDashPathEffect = r0
            return
    }

    public void enableDashedHighlightLine(float r4, float r5, float r6) {
            r3 = this;
            android.graphics.DashPathEffect r0 = new android.graphics.DashPathEffect
            r1 = 2
            float[] r1 = new float[r1]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            r1[r4] = r5
            r0.<init>(r1, r6)
            r3.mHighlightDashPathEffect = r0
            return
    }

    public android.graphics.DashPathEffect getDashPathEffectHighlight() {
            r1 = this;
            android.graphics.DashPathEffect r0 = r1.mHighlightDashPathEffect
            return r0
    }

    public float getHighlightLineWidth() {
            r1 = this;
            float r0 = r1.mHighlightLineWidth
            return r0
    }

    public boolean isDashedHighlightLineEnabled() {
            r1 = this;
            android.graphics.DashPathEffect r0 = r1.mHighlightDashPathEffect
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = 1
            return r0
    }

    public boolean isHorizontalHighlightIndicatorEnabled() {
            r1 = this;
            boolean r0 = r1.mDrawHorizontalHighlightIndicator
            return r0
    }

    public boolean isVerticalHighlightIndicatorEnabled() {
            r1 = this;
            boolean r0 = r1.mDrawVerticalHighlightIndicator
            return r0
    }

    public void setDrawHighlightIndicators(boolean r1) {
            r0 = this;
            r0.setDrawVerticalHighlightIndicator(r1)
            r0.setDrawHorizontalHighlightIndicator(r1)
            return
    }

    public void setDrawHorizontalHighlightIndicator(boolean r1) {
            r0 = this;
            r0.mDrawHorizontalHighlightIndicator = r1
            return
    }

    public void setDrawVerticalHighlightIndicator(boolean r1) {
            r0 = this;
            r0.mDrawVerticalHighlightIndicator = r1
            return
    }

    public void setHighlightLineWidth(float r1) {
            r0 = this;
            float r1 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r1)
            r0.mHighlightLineWidth = r1
            return
    }
}
