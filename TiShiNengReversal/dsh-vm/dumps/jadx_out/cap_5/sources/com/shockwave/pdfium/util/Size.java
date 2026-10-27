package com.shockwave.pdfium.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class Size {
    private final int a;
    private final int b;

    public Size(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public int a() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    public int b() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            r1 = 1
            if (r4 != r5) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof com.shockwave.pdfium.util.Size
            if (r2 == 0) goto L1b
            com.shockwave.pdfium.util.Size r5 = (com.shockwave.pdfium.util.Size) r5
            int r2 = r4.a
            int r3 = r5.a
            if (r2 != r3) goto L1b
            int r2 = r4.b
            int r5 = r5.b
            if (r2 != r5) goto L1b
            return r1
        L1b:
            return r0
    }

    public int hashCode() {
            r3 = this;
            int r0 = r3.b
            int r1 = r3.a
            int r2 = r1 << 16
            int r1 = r1 >>> 16
            r1 = r1 | r2
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            int r1 = r2.b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
