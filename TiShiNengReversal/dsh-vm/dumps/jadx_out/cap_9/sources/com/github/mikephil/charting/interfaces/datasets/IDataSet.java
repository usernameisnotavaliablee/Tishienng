package com.github.mikephil.charting.interfaces.datasets;

import com.github.mikephil.charting.data.Entry;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface IDataSet<T extends com.github.mikephil.charting.data.Entry> {
    boolean addEntry(T r1);

    void addEntryOrdered(T r1);

    void calcMinMax();

    void calcMinMaxY(float r1, float r2);

    void clear();

    boolean contains(T r1);

    com.github.mikephil.charting.components.YAxis.AxisDependency getAxisDependency();

    int getColor();

    int getColor(int r1);

    java.util.List<java.lang.Integer> getColors();

    java.util.List<T> getEntriesForXValue(float r1);

    int getEntryCount();

    T getEntryForIndex(int r1);

    T getEntryForXValue(float r1, float r2);

    T getEntryForXValue(float r1, float r2, com.github.mikephil.charting.data.DataSet.Rounding r3);

    int getEntryIndex(float r1, float r2, com.github.mikephil.charting.data.DataSet.Rounding r3);

    int getEntryIndex(T r1);

    com.github.mikephil.charting.components.Legend.LegendForm getForm();

    android.graphics.DashPathEffect getFormLineDashEffect();

    float getFormLineWidth();

    float getFormSize();

    com.github.mikephil.charting.model.GradientColor getGradientColor();

    com.github.mikephil.charting.model.GradientColor getGradientColor(int r1);

    java.util.List<com.github.mikephil.charting.model.GradientColor> getGradientColors();

    com.github.mikephil.charting.utils.MPPointF getIconsOffset();

    int getIndexInEntries(int r1);

    java.lang.String getLabel();

    com.github.mikephil.charting.formatter.ValueFormatter getValueFormatter();

    int getValueTextColor();

    int getValueTextColor(int r1);

    float getValueTextSize();

    android.graphics.Typeface getValueTypeface();

    float getXMax();

    float getXMin();

    float getYMax();

    float getYMin();

    boolean isDrawIconsEnabled();

    boolean isDrawValuesEnabled();

    boolean isHighlightEnabled();

    boolean isVisible();

    boolean needsFormatter();

    boolean removeEntry(int r1);

    boolean removeEntry(T r1);

    boolean removeEntryByXValue(float r1);

    boolean removeFirst();

    boolean removeLast();

    void setAxisDependency(com.github.mikephil.charting.components.YAxis.AxisDependency r1);

    void setDrawIcons(boolean r1);

    void setDrawValues(boolean r1);

    void setHighlightEnabled(boolean r1);

    void setIconsOffset(com.github.mikephil.charting.utils.MPPointF r1);

    void setLabel(java.lang.String r1);

    void setValueFormatter(com.github.mikephil.charting.formatter.ValueFormatter r1);

    void setValueTextColor(int r1);

    void setValueTextColors(java.util.List<java.lang.Integer> r1);

    void setValueTextSize(float r1);

    void setValueTypeface(android.graphics.Typeface r1);

    void setVisible(boolean r1);
}
