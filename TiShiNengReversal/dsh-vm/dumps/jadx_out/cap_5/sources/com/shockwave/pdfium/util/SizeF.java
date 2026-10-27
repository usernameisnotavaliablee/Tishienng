package com.shockwave.pdfium.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class SizeF {
    private final float a;
    private final float b;

    public SizeF(float r1, float r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public float a() {
            r1 = this;
            float r0 = r1.b
            return r0
    }

    public float b() {
            r1 = this;
            float r0 = r1.a
            return r0
    }

    public com.shockwave.pdfium.util.Size c() {
            r3 = this;
            com.shockwave.pdfium.util.Size r0 = new com.shockwave.pdfium.util.Size
            float r1 = r3.a
            int r1 = (int) r1
            float r2 = r3.b
            int r2 = (int) r2
            r0.<init>(r1, r2)
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
            boolean r2 = r5 instanceof com.shockwave.pdfium.util.SizeF
            if (r2 == 0) goto L1f
            com.shockwave.pdfium.util.SizeF r5 = (com.shockwave.pdfium.util.SizeF) r5
            float r2 = r4.a
            float r3 = r5.a
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L1f
            float r2 = r4.b
            float r5 = r5.b
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 != 0) goto L1f
            return r1
        L1f:
            return r0
    }

    public int hashCode() {
            r2 = this;
            float r0 = r2.a
            int r0 = java.lang.Float.floatToIntBits(r0)
            float r1 = r2.b
            int r1 = java.lang.Float.floatToIntBits(r1)
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            float r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            float r1 = r2.b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
