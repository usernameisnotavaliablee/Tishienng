package com.github.mikephil.charting.formatter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class IndexAxisValueFormatter extends com.github.mikephil.charting.formatter.ValueFormatter {
    private int mValueCount;
    private java.lang.String[] mValues;

    public IndexAxisValueFormatter() {
            r2 = this;
            r2.<init>()
            r0 = 0
            java.lang.String[] r1 = new java.lang.String[r0]
            r2.mValues = r1
            r2.mValueCount = r0
            return
    }

    public IndexAxisValueFormatter(java.util.Collection<java.lang.String> r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            java.lang.String[] r1 = new java.lang.String[r0]
            r2.mValues = r1
            r2.mValueCount = r0
            if (r3 == 0) goto L1b
            int r0 = r3.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r3 = r3.toArray(r0)
            java.lang.String[] r3 = (java.lang.String[]) r3
            r2.setValues(r3)
        L1b:
            return
    }

    public IndexAxisValueFormatter(java.lang.String[] r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            java.lang.String[] r1 = new java.lang.String[r0]
            r2.mValues = r1
            r2.mValueCount = r0
            if (r3 == 0) goto Lf
            r2.setValues(r3)
        Lf:
            return
    }

    @Override // com.github.mikephil.charting.formatter.ValueFormatter
    public java.lang.String getFormattedValue(float r3) {
            r2 = this;
            int r0 = java.lang.Math.round(r3)
            if (r0 < 0) goto L13
            int r1 = r2.mValueCount
            if (r0 >= r1) goto L13
            int r3 = (int) r3
            if (r0 == r3) goto Le
            goto L13
        Le:
            java.lang.String[] r3 = r2.mValues
            r3 = r3[r0]
            return r3
        L13:
            java.lang.String r3 = ""
            return r3
    }

    public java.lang.String[] getValues() {
            r1 = this;
            java.lang.String[] r0 = r1.mValues
            return r0
    }

    public void setValues(java.lang.String[] r1) {
            r0 = this;
            if (r1 != 0) goto L5
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
        L5:
            r0.mValues = r1
            int r1 = r1.length
            r0.mValueCount = r1
            return
    }
}
