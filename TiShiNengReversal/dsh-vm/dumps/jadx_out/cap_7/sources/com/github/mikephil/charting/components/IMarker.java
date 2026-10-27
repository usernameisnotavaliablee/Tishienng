package com.github.mikephil.charting.components;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public interface IMarker {
    void draw(android.graphics.Canvas r1, float r2, float r3);

    com.github.mikephil.charting.utils.MPPointF getOffset();

    com.github.mikephil.charting.utils.MPPointF getOffsetForDrawingAtPoint(float r1, float r2);

    void refreshContent(com.github.mikephil.charting.data.Entry r1, com.github.mikephil.charting.highlight.Highlight r2);
}
