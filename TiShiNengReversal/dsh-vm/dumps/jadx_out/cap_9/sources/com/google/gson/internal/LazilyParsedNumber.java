package com.google.gson.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class LazilyParsedNumber extends java.lang.Number {
    private final java.lang.String value;

    public LazilyParsedNumber(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            return
    }

    private java.lang.Object writeReplace() throws java.io.ObjectStreamException {
            r2 = this;
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.String r1 = r2.value
            r0.<init>(r1)
            return r0
    }

    @Override // java.lang.Number
    public double doubleValue() {
            r2 = this;
            java.lang.String r0 = r2.value
            double r0 = java.lang.Double.parseDouble(r0)
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof com.google.gson.internal.LazilyParsedNumber
            r2 = 0
            if (r1 == 0) goto L1a
            com.google.gson.internal.LazilyParsedNumber r4 = (com.google.gson.internal.LazilyParsedNumber) r4
            java.lang.String r1 = r3.value
            java.lang.String r4 = r4.value
            if (r1 == r4) goto L19
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L18
            goto L19
        L18:
            return r2
        L19:
            return r0
        L1a:
            return r2
    }

    @Override // java.lang.Number
    public float floatValue() {
            r1 = this;
            java.lang.String r0 = r1.value
            float r0 = java.lang.Float.parseFloat(r0)
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.value
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.lang.Number
    public int intValue() {
            r2 = this;
            java.lang.String r0 = r2.value     // Catch: java.lang.NumberFormatException -> L7
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L7
            return r0
        L7:
            java.lang.String r0 = r2.value     // Catch: java.lang.NumberFormatException -> Lf
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> Lf
            int r1 = (int) r0
            return r1
        Lf:
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.String r1 = r2.value
            r0.<init>(r1)
            int r0 = r0.intValue()
            return r0
    }

    @Override // java.lang.Number
    public long longValue() {
            r2 = this;
            java.lang.String r0 = r2.value     // Catch: java.lang.NumberFormatException -> L7
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L7
            return r0
        L7:
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.String r1 = r2.value
            r0.<init>(r1)
            long r0 = r0.longValue()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.value
            return r0
    }
}
