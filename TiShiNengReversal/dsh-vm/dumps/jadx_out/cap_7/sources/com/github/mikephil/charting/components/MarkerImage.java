package com.github.mikephil.charting.components;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class MarkerImage implements com.github.mikephil.charting.components.IMarker {
    private android.content.Context mContext;
    private android.graphics.drawable.Drawable mDrawable;
    private android.graphics.Rect mDrawableBoundsCache;
    private com.github.mikephil.charting.utils.MPPointF mOffset;
    private com.github.mikephil.charting.utils.MPPointF mOffset2;
    private com.github.mikephil.charting.utils.FSize mSize;
    private java.lang.ref.WeakReference<com.github.mikephil.charting.charts.Chart> mWeakChart;

    public MarkerImage(android.content.Context r2, int r3) {
            r1 = this;
            r1.<init>()
            com.github.mikephil.charting.utils.MPPointF r0 = new com.github.mikephil.charting.utils.MPPointF
            r0.<init>()
            r1.mOffset = r0
            com.github.mikephil.charting.utils.MPPointF r0 = new com.github.mikephil.charting.utils.MPPointF
            r0.<init>()
            r1.mOffset2 = r0
            com.github.mikephil.charting.utils.FSize r0 = new com.github.mikephil.charting.utils.FSize
            r0.<init>()
            r1.mSize = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.mDrawableBoundsCache = r0
            r1.mContext = r2
            android.content.res.Resources r2 = r2.getResources()
            r0 = 0
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r3, r0)
            r1.mDrawable = r2
            return
    }

    @Override // com.github.mikephil.charting.components.IMarker
    public void draw(android.graphics.Canvas r7, float r8, float r9) {
            r6 = this;
            android.graphics.drawable.Drawable r0 = r6.mDrawable
            if (r0 != 0) goto L5
            return
        L5:
            com.github.mikephil.charting.utils.MPPointF r0 = r6.getOffsetForDrawingAtPoint(r8, r9)
            com.github.mikephil.charting.utils.FSize r1 = r6.mSize
            float r2 = r1.width
            float r1 = r1.height
            r3 = 0
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 != 0) goto L1b
            android.graphics.drawable.Drawable r2 = r6.mDrawable
            int r2 = r2.getIntrinsicWidth()
            float r2 = (float) r2
        L1b:
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 != 0) goto L26
            android.graphics.drawable.Drawable r1 = r6.mDrawable
            int r1 = r1.getIntrinsicHeight()
            float r1 = (float) r1
        L26:
            android.graphics.drawable.Drawable r3 = r6.mDrawable
            android.graphics.Rect r4 = r6.mDrawableBoundsCache
            r3.copyBounds(r4)
            android.graphics.drawable.Drawable r3 = r6.mDrawable
            android.graphics.Rect r4 = r6.mDrawableBoundsCache
            int r5 = r4.left
            int r4 = r4.top
            int r2 = (int) r2
            int r2 = r2 + r5
            int r1 = (int) r1
            int r1 = r1 + r4
            r3.setBounds(r5, r4, r2, r1)
            int r1 = r7.save()
            float r2 = r0.x
            float r8 = r8 + r2
            float r0 = r0.y
            float r9 = r9 + r0
            r7.translate(r8, r9)
            android.graphics.drawable.Drawable r8 = r6.mDrawable
            r8.draw(r7)
            r7.restoreToCount(r1)
            android.graphics.drawable.Drawable r7 = r6.mDrawable
            android.graphics.Rect r8 = r6.mDrawableBoundsCache
            r7.setBounds(r8)
            return
    }

    public com.github.mikephil.charting.charts.Chart getChartView() {
            r1 = this;
            java.lang.ref.WeakReference<com.github.mikephil.charting.charts.Chart> r0 = r1.mWeakChart
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.Object r0 = r0.get()
            com.github.mikephil.charting.charts.Chart r0 = (com.github.mikephil.charting.charts.Chart) r0
            return r0
    }

    @Override // com.github.mikephil.charting.components.IMarker
    public com.github.mikephil.charting.utils.MPPointF getOffset() {
            r1 = this;
            com.github.mikephil.charting.utils.MPPointF r0 = r1.mOffset
            return r0
    }

    @Override // com.github.mikephil.charting.components.IMarker
    public com.github.mikephil.charting.utils.MPPointF getOffsetForDrawingAtPoint(float r8, float r9) {
            r7 = this;
            com.github.mikephil.charting.utils.MPPointF r0 = r7.getOffset()
            com.github.mikephil.charting.utils.MPPointF r1 = r7.mOffset2
            float r2 = r0.x
            r1.x = r2
            float r0 = r0.y
            r1.y = r0
            com.github.mikephil.charting.charts.Chart r0 = r7.getChartView()
            com.github.mikephil.charting.utils.FSize r1 = r7.mSize
            float r2 = r1.width
            float r1 = r1.height
            r3 = 0
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 != 0) goto L26
            android.graphics.drawable.Drawable r4 = r7.mDrawable
            if (r4 == 0) goto L26
            int r2 = r4.getIntrinsicWidth()
            float r2 = (float) r2
        L26:
            int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r4 != 0) goto L33
            android.graphics.drawable.Drawable r4 = r7.mDrawable
            if (r4 == 0) goto L33
            int r1 = r4.getIntrinsicHeight()
            float r1 = (float) r1
        L33:
            com.github.mikephil.charting.utils.MPPointF r4 = r7.mOffset2
            float r5 = r4.x
            float r6 = r8 + r5
            int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r6 >= 0) goto L41
            float r8 = -r8
            r4.x = r8
            goto L5a
        L41:
            if (r0 == 0) goto L5a
            float r4 = r8 + r2
            float r4 = r4 + r5
            int r5 = r0.getWidth()
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L5a
            com.github.mikephil.charting.utils.MPPointF r4 = r7.mOffset2
            int r5 = r0.getWidth()
            float r5 = (float) r5
            float r5 = r5 - r8
            float r5 = r5 - r2
            r4.x = r5
        L5a:
            com.github.mikephil.charting.utils.MPPointF r8 = r7.mOffset2
            float r2 = r8.y
            float r4 = r9 + r2
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 >= 0) goto L68
            float r9 = -r9
            r8.y = r9
            goto L81
        L68:
            if (r0 == 0) goto L81
            float r8 = r9 + r1
            float r8 = r8 + r2
            int r2 = r0.getHeight()
            float r2 = (float) r2
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 <= 0) goto L81
            com.github.mikephil.charting.utils.MPPointF r8 = r7.mOffset2
            int r0 = r0.getHeight()
            float r0 = (float) r0
            float r0 = r0 - r9
            float r0 = r0 - r1
            r8.y = r0
        L81:
            com.github.mikephil.charting.utils.MPPointF r8 = r7.mOffset2
            return r8
    }

    public com.github.mikephil.charting.utils.FSize getSize() {
            r1 = this;
            com.github.mikephil.charting.utils.FSize r0 = r1.mSize
            return r0
    }

    @Override // com.github.mikephil.charting.components.IMarker
    public void refreshContent(com.github.mikephil.charting.data.Entry r1, com.github.mikephil.charting.highlight.Highlight r2) {
            r0 = this;
            return
    }

    public void setChartView(com.github.mikephil.charting.charts.Chart r2) {
            r1 = this;
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.mWeakChart = r0
            return
    }

    public void setOffset(float r2, float r3) {
            r1 = this;
            com.github.mikephil.charting.utils.MPPointF r0 = r1.mOffset
            r0.x = r2
            r0.y = r3
            return
    }

    public void setOffset(com.github.mikephil.charting.utils.MPPointF r1) {
            r0 = this;
            r0.mOffset = r1
            if (r1 != 0) goto Lb
            com.github.mikephil.charting.utils.MPPointF r1 = new com.github.mikephil.charting.utils.MPPointF
            r1.<init>()
            r0.mOffset = r1
        Lb:
            return
    }

    public void setSize(com.github.mikephil.charting.utils.FSize r1) {
            r0 = this;
            r0.mSize = r1
            if (r1 != 0) goto Lb
            com.github.mikephil.charting.utils.FSize r1 = new com.github.mikephil.charting.utils.FSize
            r1.<init>()
            r0.mSize = r1
        Lb:
            return
    }
}
