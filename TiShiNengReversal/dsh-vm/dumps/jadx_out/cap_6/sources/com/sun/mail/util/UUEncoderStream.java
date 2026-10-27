package com.sun.mail.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class UUEncoderStream extends java.io.FilterOutputStream {
    private byte[] buffer;
    private int bufsize;
    protected int mode;
    protected java.lang.String name;
    private boolean wrotePrefix;

    public UUEncoderStream(java.io.OutputStream r3) {
            r2 = this;
            java.lang.String r0 = "encoder.buf"
            r1 = 644(0x284, float:9.02E-43)
            r2.<init>(r3, r0, r1)
            return
    }

    public UUEncoderStream(java.io.OutputStream r2, java.lang.String r3) {
            r1 = this;
            r0 = 644(0x284, float:9.02E-43)
            r1.<init>(r2, r3, r0)
            return
    }

    public UUEncoderStream(java.io.OutputStream r1, java.lang.String r2, int r3) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.bufsize = r1
            r0.wrotePrefix = r1
            r0.name = r2
            r0.mode = r3
            r1 = 45
            byte[] r1 = new byte[r1]
            r0.buffer = r1
            return
    }

    private void encode() throws java.io.IOException {
            r7 = this;
            java.io.OutputStream r0 = r7.out
            int r1 = r7.bufsize
            r1 = r1 & 63
            int r1 = r1 + 32
            r0.write(r1)
            r0 = 0
        Lc:
            int r1 = r7.bufsize
            if (r0 < r1) goto L18
            java.io.OutputStream r0 = r7.out
            r1 = 10
            r0.write(r1)
            return
        L18:
            byte[] r2 = r7.buffer
            int r3 = r0 + 1
            r4 = r2[r0]
            r5 = 1
            if (r3 >= r1) goto L32
            int r6 = r0 + 2
            r3 = r2[r3]
            if (r6 >= r1) goto L2e
            int r0 = r0 + 3
            r5 = r2[r6]
            r1 = r5
            r5 = r3
            goto L34
        L2e:
            r5 = r3
            r0 = r6
        L30:
            r1 = 1
            goto L34
        L32:
            r0 = r3
            goto L30
        L34:
            int r2 = r4 >>> 2
            r2 = r2 & 63
            int r3 = r4 << 4
            r3 = r3 & 48
            int r4 = r5 >>> 4
            r4 = r4 & 15
            r3 = r3 | r4
            int r4 = r5 << 2
            r4 = r4 & 60
            int r5 = r1 >>> 6
            r5 = r5 & 3
            r4 = r4 | r5
            r1 = r1 & 63
            java.io.OutputStream r5 = r7.out
            int r2 = r2 + 32
            r5.write(r2)
            java.io.OutputStream r2 = r7.out
            int r3 = r3 + 32
            r2.write(r3)
            java.io.OutputStream r2 = r7.out
            int r4 = r4 + 32
            r2.write(r4)
            java.io.OutputStream r2 = r7.out
            int r1 = r1 + 32
            r2.write(r1)
            goto Lc
    }

    private void writePrefix() throws java.io.IOException {
            r2 = this;
            boolean r0 = r2.wrotePrefix
            if (r0 != 0) goto L11
            java.io.PrintStream r0 = new java.io.PrintStream
            java.io.OutputStream r1 = r2.out
            r0.<init>(r1)
            r0.flush()
            r0 = 1
            r2.wrotePrefix = r0
        L11:
            return
    }

    private void writeSuffix() throws java.io.IOException {
            r2 = this;
            java.io.PrintStream r0 = new java.io.PrintStream
            java.io.OutputStream r1 = r2.out
            r0.<init>(r1)
            r0.flush()
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            r1.flush()
            java.io.OutputStream r0 = r1.out
            r0.close()
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws java.io.IOException {
            r1 = this;
            int r0 = r1.bufsize
            if (r0 <= 0) goto La
            r1.writePrefix()
            r1.encode()
        La:
            r1.writeSuffix()
            java.io.OutputStream r0 = r1.out
            r0.flush()
            return
    }

    public void setNameMode(java.lang.String r1, int r2) {
            r0 = this;
            r0.name = r1
            r0.mode = r2
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int r4) throws java.io.IOException {
            r3 = this;
            byte[] r0 = r3.buffer
            int r1 = r3.bufsize
            int r2 = r1 + 1
            r3.bufsize = r2
            byte r4 = (byte) r4
            r0[r1] = r4
            r4 = 45
            if (r2 != r4) goto L18
            r3.writePrefix()
            r3.encode()
            r4 = 0
            r3.bufsize = r4
        L18:
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
