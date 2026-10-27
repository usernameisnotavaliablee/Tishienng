package com.github.mikephil.charting.renderer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class LineScatterCandleRadarRenderer extends com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer {
    private android.graphics.Path mHighlightLinePath;

    public LineScatterCandleRadarRenderer(com.github.mikephil.charting.animation.ChartAnimator r1, com.github.mikephil.charting.utils.ViewPortHandler r2) {
            r0 = this;
            r0.<init>(r1, r2)
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r0.mHighlightLinePath = r1
            return
    }

    protected void drawHighlightLines(android.graphics.Canvas r3, float r4, float r5, com.github.mikephil.charting.interfaces.datasets.ILineScatterCandleRadarDataSet r6) {
            r2 = this;
            android.graphics.Paint r0 = r2.mHighlightPaint
            int r1 = r6.getHighLightColor()
            r0.setColor(r1)
            android.graphics.Paint r0 = r2.mHighlightPaint
            float r1 = r6.getHighlightLineWidth()
            r0.setStrokeWidth(r1)
            android.graphics.Paint r0 = r2.mHighlightPaint
            android.graphics.DashPathEffect r1 = r6.getDashPathEffectHighlight()
            r0.setPathEffect(r1)
            boolean r0 = r6.isVerticalHighlightIndicatorEnabled()
            if (r0 == 0) goto L43
            android.graphics.Path r0 = r2.mHighlightLinePath
            r0.reset()
            android.graphics.Path r0 = r2.mHighlightLinePath
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r2.mViewPortHandler
            float r1 = r1.contentTop()
            r0.moveTo(r4, r1)
            android.graphics.Path r0 = r2.mHighlightLinePath
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r2.mViewPortHandler
            float r1 = r1.contentBottom()
            r0.lineTo(r4, r1)
            android.graphics.Path r4 = r2.mHighlightLinePath
            android.graphics.Paint r0 = r2.mHighlightPaint
            r3.drawPath(r4, r0)
        L43:
            boolean r4 = r6.isHorizontalHighlightIndicatorEnabled()
            if (r4 == 0) goto L6b
            android.graphics.Path r4 = r2.mHighlightLinePath
            r4.reset()
            android.graphics.Path r4 = r2.mHighlightLinePath
            com.github.mikephil.charting.utils.ViewPortHandler r6 = r2.mViewPortHandler
            float r6 = r6.contentLeft()
            r4.moveTo(r6, r5)
            android.graphics.Path r4 = r2.mHighlightLinePath
            com.github.mikephil.charting.utils.ViewPortHandler r6 = r2.mViewPortHandler
            float r6 = r6.contentRight()
            r4.lineTo(r6, r5)
            android.graphics.Path r4 = r2.mHighlightLinePath
            android.graphics.Paint r5 = r2.mHighlightPaint
            r3.drawPath(r4, r5)
        L6b:
            return
    }
}
