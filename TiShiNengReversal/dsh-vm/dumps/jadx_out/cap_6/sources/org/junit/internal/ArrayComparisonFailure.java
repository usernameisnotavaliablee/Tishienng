package org.junit.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ArrayComparisonFailure extends java.lang.AssertionError {
    private static final long serialVersionUID = 1;
    private final java.util.List<java.lang.Integer> fIndices;
    private final java.lang.String fMessage;

    public ArrayComparisonFailure(java.lang.String r2, java.lang.AssertionError r3, int r4) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.fIndices = r0
            r1.fMessage = r2
            r1.initCause(r3)
            r1.addDimension(r4)
            return
    }

    public void addDimension(int r3) {
            r2 = this;
            java.util.List<java.lang.Integer> r0 = r2.fIndices
            r1 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.add(r1, r3)
            return
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r4.fMessage
            if (r1 == 0) goto Lc
            r0.append(r1)
        Lc:
            java.lang.String r1 = "arrays first differed at element "
            r0.append(r1)
            java.util.List<java.lang.Integer> r1 = r4.fIndices
            java.util.Iterator r1 = r1.iterator()
        L17:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L35
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.String r3 = "["
            r0.append(r3)
            r0.append(r2)
            java.lang.String r2 = "]"
            r0.append(r2)
            goto L17
        L35:
            java.lang.String r1 = "; "
            r0.append(r1)
            java.lang.Throwable r1 = r4.getCause()
            java.lang.String r1 = r1.getMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // java.lang.Throwable
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.getMessage()
            return r0
    }
}
