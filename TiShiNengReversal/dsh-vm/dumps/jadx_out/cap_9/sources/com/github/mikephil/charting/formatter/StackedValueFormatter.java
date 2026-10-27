package com.github.mikephil.charting.formatter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class StackedValueFormatter extends com.github.mikephil.charting.formatter.ValueFormatter {
    private boolean mDrawWholeStack;
    private java.text.DecimalFormat mFormat;
    private java.lang.String mSuffix;

    public StackedValueFormatter(boolean r2, java.lang.String r3, int r4) {
            r1 = this;
            r1.<init>()
            r1.mDrawWholeStack = r2
            r1.mSuffix = r3
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            r3 = 0
        Ld:
            if (r3 >= r4) goto L1e
            if (r3 != 0) goto L16
            java.lang.String r0 = "."
            r2.append(r0)
        L16:
            java.lang.String r0 = "0"
            r2.append(r0)
            int r3 = r3 + 1
            goto Ld
        L1e:
            java.text.DecimalFormat r3 = new java.text.DecimalFormat
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "###,###,###,##0"
            r4.append(r0)
            java.lang.String r2 = r2.toString()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.<init>(r2)
            r1.mFormat = r3
            return
    }

    @Override // com.github.mikephil.charting.formatter.ValueFormatter
    public java.lang.String getBarStackedLabel(float r4, com.github.mikephil.charting.data.BarEntry r5) {
            r3 = this;
            boolean r0 = r3.mDrawWholeStack
            if (r0 != 0) goto L33
            float[] r0 = r5.getYVals()
            if (r0 == 0) goto L33
            int r1 = r0.length
            int r1 = r1 + (-1)
            r0 = r0[r1]
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 != 0) goto L30
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.text.DecimalFormat r0 = r3.mFormat
            float r5 = r5.getY()
            double r1 = (double) r5
            java.lang.String r5 = r0.format(r1)
            r4.append(r5)
            java.lang.String r5 = r3.mSuffix
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            return r4
        L30:
            java.lang.String r4 = ""
            return r4
        L33:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.text.DecimalFormat r0 = r3.mFormat
            double r1 = (double) r4
            java.lang.String r4 = r0.format(r1)
            r5.append(r4)
            java.lang.String r4 = r3.mSuffix
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            return r4
    }
}
