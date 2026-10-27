package com.sun.mail.imap.protocol;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class b {
    private static final char[] e = null;
    protected byte[] a;
    protected int b;
    protected boolean c;
    protected java.io.Writer d;

    static {
            r0 = 64
            char[] r0 = new char[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 44} // fill-array
            com.sun.mail.imap.protocol.b.e = r0
            return
    }

    public b(java.io.Writer r2) {
            r1 = this;
            r1.<init>()
            r0 = 4
            byte[] r0 = new byte[r0]
            r1.a = r0
            r0 = 0
            r1.b = r0
            r1.c = r0
            r1.d = r2
            return
    }

    public static java.lang.String a(java.lang.String r9) {
            char[] r0 = r9.toCharArray()
            int r1 = r0.length
            java.io.CharArrayWriter r2 = new java.io.CharArrayWriter
            r2.<init>(r1)
            r3 = 0
            r4 = 0
            r5 = 0
        Ld:
            if (r4 < r1) goto L1b
            if (r3 == 0) goto L14
            r3.c()
        L14:
            if (r5 == 0) goto L1a
            java.lang.String r9 = r2.toString()
        L1a:
            return r9
        L1b:
            char r6 = r0[r4]
            r7 = 32
            r8 = 1
            if (r6 < r7) goto L3d
            r7 = 126(0x7e, float:1.77E-43)
            if (r6 > r7) goto L3d
            if (r3 == 0) goto L2b
            r3.c()
        L2b:
            r7 = 38
            if (r6 != r7) goto L39
            r2.write(r7)
            r5 = 45
            r2.write(r5)
            r5 = 1
            goto L48
        L39:
            r2.write(r6)
            goto L48
        L3d:
            if (r3 != 0) goto L45
            com.sun.mail.imap.protocol.b r3 = new com.sun.mail.imap.protocol.b
            r3.<init>(r2)
            r5 = 1
        L45:
            r3.d(r6)
        L48:
            int r4 = r4 + 1
            goto Ld
    }

    protected void b() throws java.io.IOException {
            r9 = this;
            int r0 = r9.b
            r1 = 0
            r2 = 4
            r3 = 1
            if (r0 != r3) goto L23
            byte[] r0 = r9.a
            r0 = r0[r1]
            java.io.Writer r1 = r9.d
            char[] r3 = com.sun.mail.imap.protocol.b.e
            int r4 = r0 >>> 2
            r4 = r4 & 63
            char r4 = r3[r4]
            r1.write(r4)
            java.io.Writer r1 = r9.d
            int r0 = r0 << r2
            r0 = r0 & 48
            char r0 = r3[r0]
            r1.write(r0)
            return
        L23:
            r4 = 2
            if (r0 != r4) goto L53
            byte[] r0 = r9.a
            r1 = r0[r1]
            r0 = r0[r3]
            java.io.Writer r3 = r9.d
            char[] r5 = com.sun.mail.imap.protocol.b.e
            int r6 = r1 >>> 2
            r6 = r6 & 63
            char r6 = r5[r6]
            r3.write(r6)
            java.io.Writer r3 = r9.d
            int r1 = r1 << r2
            r1 = r1 & 48
            int r2 = r0 >>> 4
            r2 = r2 & 15
            int r1 = r1 + r2
            char r1 = r5[r1]
            r3.write(r1)
            java.io.Writer r1 = r9.d
            int r0 = r0 << r4
            r0 = r0 & 60
            char r0 = r5[r0]
            r1.write(r0)
            return
        L53:
            byte[] r0 = r9.a
            r5 = r0[r1]
            r3 = r0[r3]
            r0 = r0[r4]
            java.io.Writer r6 = r9.d
            char[] r7 = com.sun.mail.imap.protocol.b.e
            int r8 = r5 >>> 2
            r8 = r8 & 63
            char r8 = r7[r8]
            r6.write(r8)
            java.io.Writer r6 = r9.d
            int r5 = r5 << r2
            r5 = r5 & 48
            int r8 = r3 >>> 4
            r8 = r8 & 15
            int r5 = r5 + r8
            char r5 = r7[r5]
            r6.write(r5)
            java.io.Writer r5 = r9.d
            int r3 = r3 << r4
            r3 = r3 & 60
            int r4 = r0 >>> 6
            r6 = 3
            r4 = r4 & r6
            int r3 = r3 + r4
            char r3 = r7[r3]
            r5.write(r3)
            java.io.Writer r3 = r9.d
            r0 = r0 & 63
            char r0 = r7[r0]
            r3.write(r0)
            int r0 = r9.b
            if (r0 != r2) goto L99
            byte[] r0 = r9.a
            r2 = r0[r6]
            r0[r1] = r2
        L99:
            return
    }

    public void c() {
            r3 = this;
            int r0 = r3.b     // Catch: java.io.IOException -> L17
            r1 = 0
            if (r0 <= 0) goto La
            r3.b()     // Catch: java.io.IOException -> L17
            r3.b = r1     // Catch: java.io.IOException -> L17
        La:
            boolean r0 = r3.c     // Catch: java.io.IOException -> L17
            if (r0 == 0) goto L17
            java.io.Writer r0 = r3.d     // Catch: java.io.IOException -> L17
            r2 = 45
            r0.write(r2)     // Catch: java.io.IOException -> L17
            r3.c = r1     // Catch: java.io.IOException -> L17
        L17:
            return
    }

    public void d(int r5) {
            r4 = this;
            boolean r0 = r4.c     // Catch: java.io.IOException -> L2f
            if (r0 != 0) goto Le
            r0 = 1
            r4.c = r0     // Catch: java.io.IOException -> L2f
            java.io.Writer r0 = r4.d     // Catch: java.io.IOException -> L2f
            r1 = 38
            r0.write(r1)     // Catch: java.io.IOException -> L2f
        Le:
            byte[] r0 = r4.a     // Catch: java.io.IOException -> L2f
            int r1 = r4.b     // Catch: java.io.IOException -> L2f
            int r2 = r1 + 1
            r4.b = r2     // Catch: java.io.IOException -> L2f
            int r3 = r5 >> 8
            byte r3 = (byte) r3     // Catch: java.io.IOException -> L2f
            r0[r1] = r3     // Catch: java.io.IOException -> L2f
            int r1 = r1 + 2
            r4.b = r1     // Catch: java.io.IOException -> L2f
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5     // Catch: java.io.IOException -> L2f
            r0[r2] = r5     // Catch: java.io.IOException -> L2f
            r5 = 3
            if (r1 < r5) goto L2f
            r4.b()     // Catch: java.io.IOException -> L2f
            int r0 = r4.b     // Catch: java.io.IOException -> L2f
            int r0 = r0 - r5
            r4.b = r0     // Catch: java.io.IOException -> L2f
        L2f:
            return
    }
}
