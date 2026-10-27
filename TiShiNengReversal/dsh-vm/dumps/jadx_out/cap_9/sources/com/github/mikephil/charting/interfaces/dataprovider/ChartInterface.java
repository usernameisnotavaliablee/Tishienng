package com.github.mikephil.charting.interfaces.dataprovider;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface ChartInterface {
    com.github.mikephil.charting.utils.MPPointF getCenterOfView();

    com.github.mikephil.charting.utils.MPPointF getCenterOffsets();

    android.graphics.RectF getContentRect();

    com.github.mikephil.charting.data.ChartData getData();

    com.github.mikephil.charting.formatter.ValueFormatter getDefaultValueFormatter();

    int getHeight();

    float getMaxHighlightDistance();

    int getMaxVisibleCount();

    int getWidth();

    float getXChartMax();

    float getXChartMin();

    float getXRange();

    float getYChartMax();

    float getYChartMin();
}
