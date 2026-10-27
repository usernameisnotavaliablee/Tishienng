package com.github.mikephil.charting.renderer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class DataRenderer extends com.github.mikephil.charting.renderer.Renderer {
    protected com.github.mikephil.charting.animation.ChartAnimator mAnimator;
    protected android.graphics.Paint mDrawPaint;
    protected android.graphics.Paint mHighlightPaint;
    protected android.graphics.Paint mRenderPaint;
    protected android.graphics.Paint mValuePaint;

    public DataRenderer(com.github.mikephil.charting.animation.ChartAnimator r3, com.github.mikephil.charting.utils.ViewPortHandler r4) {
            r2 = this;
            r2.<init>(r4)
            r2.mAnimator = r3
            android.graphics.Paint r3 = new android.graphics.Paint
            r4 = 1
            r3.<init>(r4)
            r2.mRenderPaint = r3
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r3.setStyle(r0)
            android.graphics.Paint r3 = new android.graphics.Paint
            r0 = 4
            r3.<init>(r0)
            r2.mDrawPaint = r3
            android.graphics.Paint r3 = new android.graphics.Paint
            r3.<init>(r4)
            r2.mValuePaint = r3
            r0 = 63
            int r0 = android.graphics.Color.rgb(r0, r0, r0)
            r3.setColor(r0)
            android.graphics.Paint r3 = r2.mValuePaint
            android.graphics.Paint$Align r0 = android.graphics.Paint.Align.CENTER
            r3.setTextAlign(r0)
            android.graphics.Paint r3 = r2.mValuePaint
            r0 = 1091567616(0x41100000, float:9.0)
            float r0 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r0)
            r3.setTextSize(r0)
            android.graphics.Paint r3 = new android.graphics.Paint
            r3.<init>(r4)
            r2.mHighlightPaint = r3
            android.graphics.Paint$Style r4 = android.graphics.Paint.Style.STROKE
            r3.setStyle(r4)
            android.graphics.Paint r3 = r2.mHighlightPaint
            r4 = 1073741824(0x40000000, float:2.0)
            r3.setStrokeWidth(r4)
            android.graphics.Paint r3 = r2.mHighlightPaint
            r4 = 187(0xbb, float:2.62E-43)
            r0 = 115(0x73, float:1.61E-43)
            r1 = 255(0xff, float:3.57E-43)
            int r4 = android.graphics.Color.rgb(r1, r4, r0)
            r3.setColor(r4)
            return
    }

    protected void applyValueTextStyle(com.github.mikephil.charting.interfaces.datasets.IDataSet r3) {
            r2 = this;
            android.graphics.Paint r0 = r2.mValuePaint
            android.graphics.Typeface r1 = r3.getValueTypeface()
            r0.setTypeface(r1)
            android.graphics.Paint r0 = r2.mValuePaint
            float r3 = r3.getValueTextSize()
            r0.setTextSize(r3)
            return
    }

    public abstract void drawData(android.graphics.Canvas r1);

    public abstract void drawExtras(android.graphics.Canvas r1);

    public abstract void drawHighlighted(android.graphics.Canvas r1, com.github.mikephil.charting.highlight.Highlight[] r2);

    public abstract void drawValue(android.graphics.Canvas r1, java.lang.String r2, float r3, float r4, int r5);

    public abstract void drawValues(android.graphics.Canvas r1);

    public android.graphics.Paint getPaintHighlight() {
            r1 = this;
            android.graphics.Paint r0 = r1.mHighlightPaint
            return r0
    }

    public android.graphics.Paint getPaintRender() {
            r1 = this;
            android.graphics.Paint r0 = r1.mRenderPaint
            return r0
    }

    public android.graphics.Paint getPaintValues() {
            r1 = this;
            android.graphics.Paint r0 = r1.mValuePaint
            return r0
    }

    public abstract void initBuffers();

    protected boolean isDrawingValuesAllowed(com.github.mikephil.charting.interfaces.dataprovider.ChartInterface r3) {
            r2 = this;
            com.github.mikephil.charting.data.ChartData r0 = r3.getData()
            int r0 = r0.getEntryCount()
            float r0 = (float) r0
            int r3 = r3.getMaxVisibleCount()
            float r3 = (float) r3
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r2.mViewPortHandler
            float r1 = r1.getScaleX()
            float r3 = r3 * r1
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 >= 0) goto L1c
            r3 = 1
            return r3
        L1c:
            r3 = 0
            return r3
    }
}
