package com.sun.mail.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class LineInputStream extends java.io.FilterInputStream {
    private char[] lineBuffer;

    public LineInputStream(java.io.InputStream r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.lineBuffer = r1
            return
    }

    public java.lang.String readLine() throws java.io.IOException {
            r10 = this;
            java.io.InputStream r0 = r10.in
            char[] r1 = r10.lineBuffer
            if (r1 != 0) goto Lc
            r1 = 128(0x80, float:1.8E-43)
            char[] r1 = new char[r1]
            r10.lineBuffer = r1
        Lc:
            int r2 = r1.length
            r3 = 0
            r4 = 0
        Lf:
            int r5 = r0.read()
            r6 = -1
            if (r5 != r6) goto L17
            goto L3d
        L17:
            r7 = 10
            if (r5 != r7) goto L1c
            goto L3d
        L1c:
            r8 = 13
            if (r5 != r8) goto L48
            int r2 = r0.read()
            if (r2 != r8) goto L2a
            int r2 = r0.read()
        L2a:
            if (r2 == r7) goto L3d
            boolean r7 = r0 instanceof java.io.PushbackInputStream
            if (r7 != 0) goto L38
            java.io.PushbackInputStream r7 = new java.io.PushbackInputStream
            r7.<init>(r0)
            r10.in = r7
            r0 = r7
        L38:
            java.io.PushbackInputStream r0 = (java.io.PushbackInputStream) r0
            r0.unread(r2)
        L3d:
            if (r5 != r6) goto L43
            if (r4 != 0) goto L43
            r0 = 0
            return r0
        L43:
            java.lang.String r0 = java.lang.String.copyValueOf(r1, r3, r4)
            return r0
        L48:
            int r2 = r2 + r6
            if (r2 >= 0) goto L5c
            int r1 = r4 + 128
            char[] r2 = new char[r1]
            int r1 = r1 - r4
            int r1 = r1 + (-1)
            char[] r6 = r10.lineBuffer
            java.lang.System.arraycopy(r6, r3, r2, r3, r4)
            r10.lineBuffer = r2
            r9 = r2
            r2 = r1
            r1 = r9
        L5c:
            int r6 = r4 + 1
            char r5 = (char) r5
            r1[r4] = r5
            r4 = r6
            goto Lf
    }
}
