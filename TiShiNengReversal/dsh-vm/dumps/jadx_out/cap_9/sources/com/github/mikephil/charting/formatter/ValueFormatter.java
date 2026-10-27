package com.github.mikephil.charting.formatter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class ValueFormatter implements com.github.mikephil.charting.formatter.IAxisValueFormatter, com.github.mikephil.charting.formatter.IValueFormatter {
    public ValueFormatter() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.lang.String getAxisLabel(float r1, com.github.mikephil.charting.components.AxisBase r2) {
            r0 = this;
            java.lang.String r1 = r0.getFormattedValue(r1)
            return r1
    }

    public java.lang.String getBarLabel(com.github.mikephil.charting.data.BarEntry r1) {
            r0 = this;
            float r1 = r1.getY()
            java.lang.String r1 = r0.getFormattedValue(r1)
            return r1
    }

    public java.lang.String getBarStackedLabel(float r1, com.github.mikephil.charting.data.BarEntry r2) {
            r0 = this;
            java.lang.String r1 = r0.getFormattedValue(r1)
            return r1
    }

    public java.lang.String getBubbleLabel(com.github.mikephil.charting.data.BubbleEntry r1) {
            r0 = this;
            float r1 = r1.getSize()
            java.lang.String r1 = r0.getFormattedValue(r1)
            return r1
    }

    public java.lang.String getCandleLabel(com.github.mikephil.charting.data.CandleEntry r1) {
            r0 = this;
            float r1 = r1.getHigh()
            java.lang.String r1 = r0.getFormattedValue(r1)
            return r1
    }

    public java.lang.String getFormattedValue(float r1) {
            r0 = this;
            java.lang.String r1 = java.lang.String.valueOf(r1)
            return r1
    }

    @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
    @java.lang.Deprecated
    public java.lang.String getFormattedValue(float r1, com.github.mikephil.charting.components.AxisBase r2) {
            r0 = this;
            java.lang.String r1 = r0.getFormattedValue(r1)
            return r1
    }

    @Override // com.github.mikephil.charting.formatter.IValueFormatter
    @java.lang.Deprecated
    public java.lang.String getFormattedValue(float r1, com.github.mikephil.charting.data.Entry r2, int r3, com.github.mikephil.charting.utils.ViewPortHandler r4) {
            r0 = this;
            java.lang.String r1 = r0.getFormattedValue(r1)
            return r1
    }

    public java.lang.String getPieLabel(float r1, com.github.mikephil.charting.data.PieEntry r2) {
            r0 = this;
            java.lang.String r1 = r0.getFormattedValue(r1)
            return r1
    }

    public java.lang.String getPointLabel(com.github.mikephil.charting.data.Entry r1) {
            r0 = this;
            float r1 = r1.getY()
            java.lang.String r1 = r0.getFormattedValue(r1)
            return r1
    }

    public java.lang.String getRadarLabel(com.github.mikephil.charting.data.RadarEntry r1) {
            r0 = this;
            float r1 = r1.getY()
            java.lang.String r1 = r0.getFormattedValue(r1)
            return r1
    }
}
