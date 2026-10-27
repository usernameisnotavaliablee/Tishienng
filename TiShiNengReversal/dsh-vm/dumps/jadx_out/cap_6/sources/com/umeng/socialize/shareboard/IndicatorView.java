package com.umeng.socialize.shareboard;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class IndicatorView extends android.view.View {
    private int mIndicatorMargin;
    private int mIndicatorWidth;
    private float mLeftPosition;
    private android.graphics.Paint mNormalPaint;
    private int mPageCount;
    private android.graphics.Paint mSelectPaint;
    private int mSelectPosition;

    public IndicatorView(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public IndicatorView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public IndicatorView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @android.annotation.TargetApi(21)
    public IndicatorView(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    private int measureHeight(int r4) {
            r3 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 != r1) goto Ld
            return r4
        Ld:
            int r1 = r3.getPaddingTop()
            int r2 = r3.getPaddingBottom()
            int r1 = r1 + r2
            int r2 = r3.mIndicatorWidth
            int r2 = r2 * 2
            int r1 = r1 + r2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L24
            int r4 = java.lang.Math.min(r1, r4)
            return r4
        L24:
            return r1
    }

    private int measureWidth(int r5) {
            r4 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r1 = r4.getPaddingLeft()
            int r2 = r4.getPaddingRight()
            int r1 = r1 + r2
            int r2 = r4.mIndicatorWidth
            int r3 = r4.mPageCount
            int r2 = r2 * r3
            int r2 = r2 * 2
            int r1 = r1 + r2
            int r2 = r4.mIndicatorMargin
            int r3 = r3 + (-1)
            int r2 = r2 * r3
            int r1 = r1 + r2
            int r2 = r4.getMeasuredWidth()
            int r2 = r2 - r1
            float r2 = (float) r2
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            int r3 = r4.getPaddingLeft()
            float r3 = (float) r3
            float r2 = r2 + r3
            r4.mLeftPosition = r2
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L3b
            int r5 = java.lang.Math.max(r1, r5)
            return r5
        L3b:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L44
            int r5 = java.lang.Math.min(r1, r5)
            return r5
        L44:
            return r1
    }

    protected int dip2px(float r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r2 = r2 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r0
            int r2 = (int) r2
            return r2
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r6) {
            r5 = this;
            super.onDraw(r6)
            android.graphics.Paint r0 = r5.mSelectPaint
            if (r0 == 0) goto L33
            android.graphics.Paint r0 = r5.mNormalPaint
            if (r0 != 0) goto Lc
            goto L33
        Lc:
            float r0 = r5.mLeftPosition
            int r1 = r5.mIndicatorWidth
            float r1 = (float) r1
            float r0 = r0 + r1
            r1 = 0
        L13:
            int r2 = r5.mPageCount
            if (r1 >= r2) goto L33
            int r2 = r5.mIndicatorWidth
            float r3 = (float) r2
            float r2 = (float) r2
            int r4 = r5.mSelectPosition
            if (r1 != r4) goto L22
            android.graphics.Paint r4 = r5.mSelectPaint
            goto L24
        L22:
            android.graphics.Paint r4 = r5.mNormalPaint
        L24:
            r6.drawCircle(r0, r3, r2, r4)
            int r2 = r5.mIndicatorMargin
            int r3 = r5.mIndicatorWidth
            int r3 = r3 * 2
            int r2 = r2 + r3
            float r2 = (float) r2
            float r0 = r0 + r2
            int r1 = r1 + 1
            goto L13
        L33:
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r1, int r2) {
            r0 = this;
            int r1 = r0.measureWidth(r1)
            int r2 = r0.measureHeight(r2)
            r0.setMeasuredDimension(r1, r2)
            return
    }

    public void setIndicator(int r1, int r2) {
            r0 = this;
            float r2 = (float) r2
            int r2 = r0.dip2px(r2)
            r0.mIndicatorMargin = r2
            float r1 = (float) r1
            int r1 = r0.dip2px(r1)
            r0.mIndicatorWidth = r1
            return
    }

    public void setIndicatorColor(int r4, int r5) {
            r3 = this;
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r3.mSelectPaint = r0
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r0.setStyle(r1)
            android.graphics.Paint r0 = r3.mSelectPaint
            r2 = 1
            r0.setAntiAlias(r2)
            android.graphics.Paint r0 = r3.mSelectPaint
            r0.setColor(r5)
            android.graphics.Paint r5 = new android.graphics.Paint
            r5.<init>()
            r3.mNormalPaint = r5
            r5.setStyle(r1)
            android.graphics.Paint r5 = r3.mNormalPaint
            r5.setAntiAlias(r2)
            android.graphics.Paint r5 = r3.mNormalPaint
            r5.setColor(r4)
            return
    }

    public void setPageCount(int r1) {
            r0 = this;
            r0.mPageCount = r1
            r0.invalidate()
            return
    }

    public void setSelectedPosition(int r1) {
            r0 = this;
            r0.mSelectPosition = r1
            r0.invalidate()
            return
    }
}
