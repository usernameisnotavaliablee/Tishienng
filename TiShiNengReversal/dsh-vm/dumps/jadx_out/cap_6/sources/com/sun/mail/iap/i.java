package com.sun.mail.iap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class i {
    private static final int b = 256;
    private static final int c = 262144;
    private static final int d = 16;
    private java.io.BufferedInputStream a;

    public i(java.io.InputStream r3) {
            r2 = this;
            r2.<init>()
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
            r1 = 2048(0x800, float:2.87E-42)
            r0.<init>(r3, r1)
            r2.a = r0
            return
    }

    public com.sun.mail.iap.d a() throws java.io.IOException {
            r1 = this;
            r0 = 0
            com.sun.mail.iap.d r0 = r1.b(r0)
            return r0
    }

    public com.sun.mail.iap.d b(com.sun.mail.iap.d r8) throws java.io.IOException {
            r7 = this;
            r0 = 0
            if (r8 != 0) goto Lc
            com.sun.mail.iap.d r8 = new com.sun.mail.iap.d
            r1 = 128(0x80, float:1.8E-43)
            byte[] r2 = new byte[r1]
            r8.<init>(r2, r0, r1)
        Lc:
            byte[] r1 = r8.a()
            r2 = 0
        L11:
            r3 = 0
            r4 = 0
        L13:
            r5 = -1
            if (r3 != 0) goto L47
            java.io.BufferedInputStream r4 = r7.a
            int r4 = r4.read()
            if (r4 != r5) goto L1f
            goto L47
        L1f:
            r5 = 10
            if (r4 == r5) goto L24
            goto L2f
        L24:
            if (r2 <= 0) goto L2f
            int r5 = r2 + (-1)
            r5 = r1[r5]
            r6 = 13
            if (r5 != r6) goto L2f
            r3 = 1
        L2f:
            int r5 = r1.length
            if (r2 < r5) goto L40
            int r1 = r1.length
            r5 = 262144(0x40000, float:3.67342E-40)
            if (r1 <= r5) goto L39
            r1 = 262144(0x40000, float:3.67342E-40)
        L39:
            r8.e(r1)
            byte[] r1 = r8.a()
        L40:
            int r5 = r2 + 1
            byte r6 = (byte) r4
            r1[r2] = r6
            r2 = r5
            goto L13
        L47:
            if (r4 == r5) goto L92
            r3 = 5
            if (r2 < r3) goto L8e
            int r3 = r2 + (-3)
            r4 = r1[r3]
            r5 = 125(0x7d, float:1.75E-43)
            if (r4 == r5) goto L55
            goto L8e
        L55:
            int r4 = r2 + (-4)
        L57:
            if (r4 >= 0) goto L5a
            goto L60
        L5a:
            r5 = r1[r4]
            r6 = 123(0x7b, float:1.72E-43)
            if (r5 != r6) goto L8b
        L60:
            if (r4 >= 0) goto L63
            goto L8e
        L63:
            int r4 = r4 + 1
            int r3 = com.sun.mail.util.ASCIIUtility.parseInt(r1, r4, r3)     // Catch: java.lang.NumberFormatException -> L8e
            if (r3 <= 0) goto L11
            int r4 = r1.length
            int r4 = r4 - r2
            int r5 = r3 + 16
            if (r5 <= r4) goto L7f
            int r5 = r5 - r4
            r1 = 256(0x100, float:3.59E-43)
            if (r1 <= r5) goto L78
            r5 = 256(0x100, float:3.59E-43)
        L78:
            r8.e(r5)
            byte[] r1 = r8.a()
        L7f:
            if (r3 > 0) goto L82
            goto L11
        L82:
            java.io.BufferedInputStream r4 = r7.a
            int r4 = r4.read(r1, r2, r3)
            int r3 = r3 - r4
            int r2 = r2 + r4
            goto L7f
        L8b:
            int r4 = r4 + (-1)
            goto L57
        L8e:
            r8.f(r2)
            return r8
        L92:
            java.io.IOException r8 = new java.io.IOException
            r8.<init>()
            throw r8
    }
}
