package com.github.mikephil.charting.formatter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class LargeValueFormatter extends com.github.mikephil.charting.formatter.ValueFormatter {
    private java.text.DecimalFormat mFormat;
    private int mMaxLength;
    private java.lang.String[] mSuffix;
    private java.lang.String mText;

    public LargeValueFormatter() {
            r5 = this;
            r5.<init>()
            java.lang.String r0 = "b"
            java.lang.String r1 = "t"
            java.lang.String r2 = ""
            java.lang.String r3 = "k"
            java.lang.String r4 = "m"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r4, r0, r1}
            r5.mSuffix = r0
            r0 = 5
            r5.mMaxLength = r0
            r5.mText = r2
            java.text.DecimalFormat r0 = new java.text.DecimalFormat
            java.lang.String r1 = "###E00"
            r0.<init>(r1)
            r5.mFormat = r0
            return
    }

    public LargeValueFormatter(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.mText = r1
            return
    }

    private java.lang.String makePretty(double r3) {
            r2 = this;
            java.text.DecimalFormat r0 = r2.mFormat
            java.lang.String r3 = r0.format(r3)
            int r4 = r3.length()
            int r4 = r4 + (-1)
            char r4 = r3.charAt(r4)
            int r4 = java.lang.Character.getNumericValue(r4)
            int r0 = r3.length()
            int r0 = r0 + (-2)
            char r0 = r3.charAt(r0)
            int r0 = java.lang.Character.getNumericValue(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = ""
            r1.append(r0)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r4 = r4.intValue()
            java.lang.String[] r0 = r2.mSuffix
            int r4 = r4 / 3
            r4 = r0[r4]
            java.lang.String r0 = "E[0-9][0-9]"
            java.lang.String r3 = r3.replaceAll(r0, r4)
        L4a:
            int r4 = r3.length()
            int r0 = r2.mMaxLength
            if (r4 > r0) goto L5c
            java.lang.String r4 = "[0-9]+\\.[a-z]"
            boolean r4 = r3.matches(r4)
            if (r4 == 0) goto L5b
            goto L5c
        L5b:
            return r3
        L5c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r0 = r3.length()
            int r0 = r0 + (-2)
            r1 = 0
            java.lang.String r0 = r3.substring(r1, r0)
            r4.append(r0)
            int r0 = r3.length()
            int r0 = r0 + (-1)
            java.lang.String r3 = r3.substring(r0)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            goto L4a
    }

    public int getDecimalDigits() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.github.mikephil.charting.formatter.ValueFormatter
    public java.lang.String getFormattedValue(float r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            double r1 = (double) r4
            java.lang.String r4 = r3.makePretty(r1)
            r0.append(r4)
            java.lang.String r4 = r3.mText
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }

    public void setAppendix(java.lang.String r1) {
            r0 = this;
            r0.mText = r1
            return
    }

    public void setMaxLength(int r1) {
            r0 = this;
            r0.mMaxLength = r1
            return
    }

    public void setSuffix(java.lang.String[] r1) {
            r0 = this;
            r0.mSuffix = r1
            return
    }
}
