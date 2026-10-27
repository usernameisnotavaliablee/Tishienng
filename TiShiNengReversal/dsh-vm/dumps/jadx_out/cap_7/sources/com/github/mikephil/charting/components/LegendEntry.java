package com.github.mikephil.charting.components;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class LegendEntry {
    public com.github.mikephil.charting.components.Legend.LegendForm form;
    public int formColor;
    public android.graphics.DashPathEffect formLineDashEffect;
    public float formLineWidth;
    public float formSize;
    public java.lang.String label;

    public LegendEntry() {
            r1 = this;
            r1.<init>()
            com.github.mikephil.charting.components.Legend$LegendForm r0 = com.github.mikephil.charting.components.Legend.LegendForm.DEFAULT
            r1.form = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            r1.formSize = r0
            r1.formLineWidth = r0
            r0 = 0
            r1.formLineDashEffect = r0
            r0 = 1122867(0x112233, float:1.573472E-39)
            r1.formColor = r0
            return
    }

    public LegendEntry(java.lang.String r2, com.github.mikephil.charting.components.Legend.LegendForm r3, float r4, float r5, android.graphics.DashPathEffect r6, int r7) {
            r1 = this;
            r1.<init>()
            com.github.mikephil.charting.components.Legend$LegendForm r0 = com.github.mikephil.charting.components.Legend.LegendForm.DEFAULT
            r1.label = r2
            r1.form = r3
            r1.formSize = r4
            r1.formLineWidth = r5
            r1.formLineDashEffect = r6
            r1.formColor = r7
            return
    }
}
