package com.github.mikephil.charting.components;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class MarkerView extends android.widget.RelativeLayout implements com.github.mikephil.charting.components.IMarker {
    private com.github.mikephil.charting.utils.MPPointF mOffset;
    private com.github.mikephil.charting.utils.MPPointF mOffset2;
    private java.lang.ref.WeakReference<com.github.mikephil.charting.charts.Chart> mWeakChart;

    public MarkerView(android.content.Context r1, int r2) {
            r0 = this;
            r0.<init>(r1)
            com.github.mikephil.charting.utils.MPPointF r1 = new com.github.mikephil.charting.utils.MPPointF
            r1.<init>()
            r0.mOffset = r1
            com.github.mikephil.charting.utils.MPPointF r1 = new com.github.mikephil.charting.utils.MPPointF
            r1.<init>()
            r0.mOffset2 = r1
            r0.setupLayoutResource(r2)
            return
    }

    private void setupLayoutResource(int r4) {
            r3 = this;
            android.content.Context r0 = r3.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            android.view.View r4 = r0.inflate(r4, r3)
            android.widget.RelativeLayout$LayoutParams r0 = new android.widget.RelativeLayout$LayoutParams
            r1 = -2
            r0.<init>(r1, r1)
            r4.setLayoutParams(r0)
            r0 = 0
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r4.measure(r1, r2)
            int r1 = r4.getMeasuredWidth()
            int r2 = r4.getMeasuredHeight()
            r4.layout(r0, r0, r1, r2)
            return
    }

    @Override // com.github.mikephil.charting.components.IMarker
    public void draw(android.graphics.Canvas r4, float r5, float r6) {
            r3 = this;
            com.github.mikephil.charting.utils.MPPointF r0 = r3.getOffsetForDrawingAtPoint(r5, r6)
            int r1 = r4.save()
            float r2 = r0.x
            float r5 = r5 + r2
            float r0 = r0.y
            float r6 = r6 + r0
            r4.translate(r5, r6)
            r3.draw(r4)
            r4.restoreToCount(r1)
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
            int r1 = r7.getWidth()
            float r1 = (float) r1
            int r2 = r7.getHeight()
            float r2 = (float) r2
            com.github.mikephil.charting.utils.MPPointF r3 = r7.mOffset2
            float r4 = r3.x
            float r5 = r8 + r4
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L2b
            float r8 = -r8
            r3.x = r8
            goto L44
        L2b:
            if (r0 == 0) goto L44
            float r3 = r8 + r1
            float r3 = r3 + r4
            int r4 = r0.getWidth()
            float r4 = (float) r4
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L44
            com.github.mikephil.charting.utils.MPPointF r3 = r7.mOffset2
            int r4 = r0.getWidth()
            float r4 = (float) r4
            float r4 = r4 - r8
            float r4 = r4 - r1
            r3.x = r4
        L44:
            com.github.mikephil.charting.utils.MPPointF r8 = r7.mOffset2
            float r1 = r8.y
            float r3 = r9 + r1
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 >= 0) goto L52
            float r9 = -r9
            r8.y = r9
            goto L6b
        L52:
            if (r0 == 0) goto L6b
            float r8 = r9 + r2
            float r8 = r8 + r1
            int r1 = r0.getHeight()
            float r1 = (float) r1
            int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r8 <= 0) goto L6b
            com.github.mikephil.charting.utils.MPPointF r8 = r7.mOffset2
            int r0 = r0.getHeight()
            float r0 = (float) r0
            float r0 = r0 - r9
            float r0 = r0 - r2
            r8.y = r0
        L6b:
            com.github.mikephil.charting.utils.MPPointF r8 = r7.mOffset2
            return r8
    }

    @Override // com.github.mikephil.charting.components.IMarker
    public void refreshContent(com.github.mikephil.charting.data.Entry r2, com.github.mikephil.charting.highlight.Highlight r3) {
            r1 = this;
            r2 = 0
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r2)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r2)
            r1.measure(r3, r0)
            int r3 = r1.getMeasuredWidth()
            int r0 = r1.getMeasuredHeight()
            r1.layout(r2, r2, r3, r0)
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
}
