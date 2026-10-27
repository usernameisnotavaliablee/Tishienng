package com.sun.mail.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class QPEncoderStream extends java.io.FilterOutputStream {
    private static final char[] hex = null;
    private int bytesPerLine;
    private int count;
    private boolean gotCR;
    private boolean gotSpace;

    static {
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70} // fill-array
            com.sun.mail.util.QPEncoderStream.hex = r0
            return
    }

    public QPEncoderStream(java.io.OutputStream r2) {
            r1 = this;
            r0 = 76
            r1.<init>(r2, r0)
            return
    }

    public QPEncoderStream(java.io.OutputStream r1, int r2) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.count = r1
            r0.gotSpace = r1
            r0.gotCR = r1
            int r2 = r2 + (-1)
            r0.bytesPerLine = r2
            return
    }

    private void outputCRLF() throws java.io.IOException {
            r2 = this;
            java.io.OutputStream r0 = r2.out
            r1 = 13
            r0.write(r1)
            java.io.OutputStream r0 = r2.out
            r1 = 10
            r0.write(r1)
            r0 = 0
            r2.count = r0
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            java.io.OutputStream r0 = r1.out
            r0.close()
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws java.io.IOException {
            r1 = this;
            java.io.OutputStream r0 = r1.out
            r0.flush()
            return
    }

    protected void output(int r6, boolean r7) throws java.io.IOException {
            r5 = this;
            r0 = 10
            r1 = 13
            r2 = 61
            if (r7 == 0) goto L3d
            int r7 = r5.count
            r3 = 3
            int r7 = r7 + r3
            r5.count = r7
            int r4 = r5.bytesPerLine
            if (r7 <= r4) goto L23
            java.io.OutputStream r7 = r5.out
            r7.write(r2)
            java.io.OutputStream r7 = r5.out
            r7.write(r1)
            java.io.OutputStream r7 = r5.out
            r7.write(r0)
            r5.count = r3
        L23:
            java.io.OutputStream r7 = r5.out
            r7.write(r2)
            java.io.OutputStream r7 = r5.out
            char[] r0 = com.sun.mail.util.QPEncoderStream.hex
            int r1 = r6 >> 4
            char r1 = r0[r1]
            r7.write(r1)
            java.io.OutputStream r7 = r5.out
            r6 = r6 & 15
            char r6 = r0[r6]
            r7.write(r6)
            return
        L3d:
            int r7 = r5.count
            r3 = 1
            int r7 = r7 + r3
            r5.count = r7
            int r4 = r5.bytesPerLine
            if (r7 <= r4) goto L58
            java.io.OutputStream r7 = r5.out
            r7.write(r2)
            java.io.OutputStream r7 = r5.out
            r7.write(r1)
            java.io.OutputStream r7 = r5.out
            r7.write(r0)
            r5.count = r3
        L58:
            java.io.OutputStream r7 = r5.out
            r7.write(r6)
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int r7) throws java.io.IOException {
            r6 = this;
            r7 = r7 & 255(0xff, float:3.57E-43)
            boolean r0 = r6.gotSpace
            r1 = 10
            r2 = 13
            r3 = 1
            r4 = 0
            r5 = 32
            if (r0 == 0) goto L1c
            if (r7 == r2) goto L17
            if (r7 != r1) goto L13
            goto L17
        L13:
            r6.output(r5, r4)
            goto L1a
        L17:
            r6.output(r5, r3)
        L1a:
            r6.gotSpace = r4
        L1c:
            if (r7 != r2) goto L24
            r6.gotCR = r3
            r6.outputCRLF()
            return
        L24:
            if (r7 != r1) goto L2f
            boolean r7 = r6.gotCR
            if (r7 == 0) goto L2b
            goto L46
        L2b:
            r6.outputCRLF()
            goto L46
        L2f:
            if (r7 != r5) goto L34
            r6.gotSpace = r3
            goto L46
        L34:
            if (r7 < r5) goto L43
            r0 = 127(0x7f, float:1.78E-43)
            if (r7 >= r0) goto L43
            r0 = 61
            if (r7 != r0) goto L3f
            goto L43
        L3f:
            r6.output(r7, r4)
            goto L46
        L43:
            r6.output(r7, r3)
        L46:
            r6.gotCR = r4
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] r3) throws java.io.IOException {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            r2.write(r3, r0, r1)
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
            r0 = 0
        L1:
            if (r0 < r5) goto L4
            return
        L4:
            int r1 = r4 + r0
            r1 = r3[r1]
            r2.write(r1)
            int r0 = r0 + 1
            goto L1
    }
}
