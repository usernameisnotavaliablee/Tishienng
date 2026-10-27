package com.github.mikephil.charting.interfaces.datasets;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface ILineDataSet extends com.github.mikephil.charting.interfaces.datasets.ILineRadarDataSet<com.github.mikephil.charting.data.Entry> {
    int getCircleColor(int r1);

    int getCircleColorCount();

    int getCircleHoleColor();

    float getCircleHoleRadius();

    float getCircleRadius();

    float getCubicIntensity();

    android.graphics.DashPathEffect getDashPathEffect();

    com.github.mikephil.charting.formatter.IFillFormatter getFillFormatter();

    com.github.mikephil.charting.data.LineDataSet.Mode getMode();

    boolean isDashedLineEnabled();

    boolean isDrawCircleHoleEnabled();

    boolean isDrawCirclesEnabled();

    @java.lang.Deprecated
    boolean isDrawCubicEnabled();

    @java.lang.Deprecated
    boolean isDrawSteppedEnabled();
}
