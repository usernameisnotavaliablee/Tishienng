package com.sun.mail.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class QPDecoderStream extends java.io.FilterInputStream {
    protected byte[] ba;
    protected int spaces;

    public QPDecoderStream(java.io.InputStream r3) {
            r2 = this;
            java.io.PushbackInputStream r0 = new java.io.PushbackInputStream
            r1 = 2
            r0.<init>(r3, r1)
            r2.<init>(r0)
            byte[] r3 = new byte[r1]
            r2.ba = r3
            r3 = 0
            r2.spaces = r3
            return
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws java.io.IOException {
            r1 = this;
            java.io.InputStream r0 = r1.in
            int r0 = r0.available()
            return r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws java.io.IOException {
            r7 = this;
            int r0 = r7.spaces
            r1 = 1
            r2 = 32
            if (r0 <= 0) goto Lb
            int r0 = r0 - r1
            r7.spaces = r0
            return r2
        Lb:
            java.io.InputStream r0 = r7.in
            int r0 = r0.read()
            r3 = 13
            r4 = 0
            r5 = -1
            r6 = 10
            if (r0 != r2) goto L39
        L19:
            java.io.InputStream r0 = r7.in
            int r0 = r0.read()
            if (r0 == r2) goto L33
            if (r0 == r3) goto L30
            if (r0 == r6) goto L30
            if (r0 != r5) goto L28
            goto L30
        L28:
            java.io.InputStream r1 = r7.in
            java.io.PushbackInputStream r1 = (java.io.PushbackInputStream) r1
            r1.unread(r0)
            return r2
        L30:
            r7.spaces = r4
            return r0
        L33:
            int r0 = r7.spaces
            int r0 = r0 + r1
            r7.spaces = r0
            goto L19
        L39:
            r2 = 61
            if (r0 != r2) goto L84
            java.io.InputStream r2 = r7.in
            int r2 = r2.read()
            if (r2 != r6) goto L4a
            int r0 = r7.read()
            return r0
        L4a:
            if (r2 != r3) goto L60
            java.io.InputStream r0 = r7.in
            int r0 = r0.read()
            if (r0 == r6) goto L5b
            java.io.InputStream r1 = r7.in
            java.io.PushbackInputStream r1 = (java.io.PushbackInputStream) r1
            r1.unread(r0)
        L5b:
            int r0 = r7.read()
            return r0
        L60:
            if (r2 != r5) goto L63
            return r5
        L63:
            byte[] r3 = r7.ba
            byte r2 = (byte) r2
            r3[r4] = r2
            java.io.InputStream r2 = r7.in
            int r2 = r2.read()
            byte r2 = (byte) r2
            r3[r1] = r2
            byte[] r1 = r7.ba     // Catch: java.lang.NumberFormatException -> L7b
            r2 = 2
            r3 = 16
            int r0 = com.sun.mail.util.ASCIIUtility.parseInt(r1, r4, r2, r3)     // Catch: java.lang.NumberFormatException -> L7b
            return r0
        L7b:
            java.io.InputStream r1 = r7.in
            java.io.PushbackInputStream r1 = (java.io.PushbackInputStream) r1
            byte[] r2 = r7.ba
            r1.unread(r2)
        L84:
            return r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] r4, int r5, int r6) throws java.io.IOException {
            r3 = this;
            r0 = 0
        L1:
            if (r0 < r6) goto L4
            goto Le
        L4:
            int r1 = r3.read()
            r2 = -1
            if (r1 != r2) goto Lf
            if (r0 != 0) goto Le
            return r2
        Le:
            return r0
        Lf:
            int r2 = r5 + r0
            byte r1 = (byte) r1
            r4[r2] = r1
            int r0 = r0 + 1
            goto L1
    }
}
