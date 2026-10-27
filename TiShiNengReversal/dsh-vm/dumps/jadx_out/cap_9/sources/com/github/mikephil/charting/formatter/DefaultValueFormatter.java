package com.github.mikephil.charting.formatter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class DefaultValueFormatter extends com.github.mikephil.charting.formatter.ValueFormatter {
    protected int mDecimalDigits;
    protected java.text.DecimalFormat mFormat;

    public DefaultValueFormatter(int r1) {
            r0 = this;
            r0.<init>()
            r0.setup(r1)
            return
    }

    public int getDecimalDigits() {
            r1 = this;
            int r0 = r1.mDecimalDigits
            return r0
    }

    @Override // com.github.mikephil.charting.formatter.ValueFormatter
    public java.lang.String getFormattedValue(float r4) {
            r3 = this;
            java.text.DecimalFormat r0 = r3.mFormat
            double r1 = (double) r4
            java.lang.String r4 = r0.format(r1)
            return r4
    }

    public void setup(int r4) {
            r3 = this;
            r3.mDecimalDigits = r4
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r1 = 0
        L8:
            if (r1 >= r4) goto L19
            if (r1 != 0) goto L11
            java.lang.String r2 = "."
            r0.append(r2)
        L11:
            java.lang.String r2 = "0"
            r0.append(r2)
            int r1 = r1 + 1
            goto L8
        L19:
            java.text.DecimalFormat r4 = new java.text.DecimalFormat
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "###,###,###,##0"
            r1.append(r2)
            java.lang.String r0 = r0.toString()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.<init>(r0)
            r3.mFormat = r4
            return
    }
}
