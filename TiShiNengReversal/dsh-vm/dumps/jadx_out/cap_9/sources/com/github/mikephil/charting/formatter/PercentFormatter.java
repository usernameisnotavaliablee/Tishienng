package com.github.mikephil.charting.formatter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class PercentFormatter extends com.github.mikephil.charting.formatter.ValueFormatter {
    public java.text.DecimalFormat mFormat;
    private com.github.mikephil.charting.charts.PieChart pieChart;

    public PercentFormatter() {
            r2 = this;
            r2.<init>()
            java.text.DecimalFormat r0 = new java.text.DecimalFormat
            java.lang.String r1 = "###,###,##0.0"
            r0.<init>(r1)
            r2.mFormat = r0
            return
    }

    public PercentFormatter(com.github.mikephil.charting.charts.PieChart r1) {
            r0 = this;
            r0.<init>()
            r0.pieChart = r1
            return
    }

    @Override // com.github.mikephil.charting.formatter.ValueFormatter
    public java.lang.String getFormattedValue(float r5) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.text.DecimalFormat r1 = r4.mFormat
            double r2 = (double) r5
            java.lang.String r5 = r1.format(r2)
            r0.append(r5)
            java.lang.String r5 = " %"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }

    @Override // com.github.mikephil.charting.formatter.ValueFormatter
    public java.lang.String getPieLabel(float r3, com.github.mikephil.charting.data.PieEntry r4) {
            r2 = this;
            com.github.mikephil.charting.charts.PieChart r4 = r2.pieChart
            if (r4 == 0) goto Lf
            boolean r4 = r4.isUsePercentValuesEnabled()
            if (r4 == 0) goto Lf
            java.lang.String r3 = r2.getFormattedValue(r3)
            return r3
        Lf:
            java.text.DecimalFormat r4 = r2.mFormat
            double r0 = (double) r3
            java.lang.String r3 = r4.format(r0)
            return r3
    }
}
