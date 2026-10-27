package com.sun.mail.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class BASE64EncoderStream extends java.io.FilterOutputStream {
    private static byte[] newline;
    private static final char[] pem_array = null;
    private byte[] buffer;
    private int bufsize;
    private int bytesPerLine;
    private int count;
    private int lineLimit;
    private boolean noCRLF;
    private byte[] outbuf;

    static {
            r0 = 2
            byte[] r0 = new byte[r0]
            r0 = {x0012: FILL_ARRAY_DATA , data: [13, 10} // fill-array
            com.sun.mail.util.BASE64EncoderStream.newline = r0
            r0 = 64
            char[] r0 = new char[r0]
            r0 = {x0018: FILL_ARRAY_DATA , data: [65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47} // fill-array
            com.sun.mail.util.BASE64EncoderStream.pem_array = r0
            return
    }

    public BASE64EncoderStream(java.io.OutputStream r2) {
            r1 = this;
            r0 = 76
            r1.<init>(r2, r0)
            return
    }

    public BASE64EncoderStream(java.io.OutputStream r4, int r5) {
            r3 = this;
            r3.<init>(r4)
            r4 = 0
            r3.bufsize = r4
            r3.count = r4
            r3.noCRLF = r4
            r4 = 3
            byte[] r0 = new byte[r4]
            r3.buffer = r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1 = 1
            r2 = 4
            if (r5 == r0) goto L18
            if (r5 >= r2) goto L1c
        L18:
            r3.noCRLF = r1
            r5 = 76
        L1c:
            int r5 = r5 / r2
            int r5 = r5 * 4
            r3.bytesPerLine = r5
            int r0 = r5 / 4
            int r0 = r0 * 3
            r3.lineLimit = r0
            boolean r4 = r3.noCRLF
            if (r4 == 0) goto L30
            byte[] r4 = new byte[r5]
            r3.outbuf = r4
            return
        L30:
            int r4 = r5 + 2
            byte[] r4 = new byte[r4]
            r3.outbuf = r4
            r0 = 13
            r4[r5] = r0
            int r5 = r5 + r1
            r0 = 10
            r4[r5] = r0
            return
    }

    private void encode() throws java.io.IOException {
            r6 = this;
            int r0 = r6.bufsize
            int r0 = encodedSize(r0)
            java.io.OutputStream r1 = r6.out
            byte[] r2 = r6.buffer
            int r3 = r6.bufsize
            byte[] r4 = r6.outbuf
            r5 = 0
            byte[] r2 = encode(r2, r5, r3, r4)
            r1.write(r2, r5, r0)
            int r1 = r6.count
            int r1 = r1 + r0
            r6.count = r1
            int r0 = r6.bytesPerLine
            if (r1 < r0) goto L2c
            boolean r0 = r6.noCRLF
            if (r0 != 0) goto L2a
            java.io.OutputStream r0 = r6.out
            byte[] r1 = com.sun.mail.util.BASE64EncoderStream.newline
            r0.write(r1)
        L2a:
            r6.count = r5
        L2c:
            return
    }

    public static byte[] encode(byte[] r3) {
            int r0 = r3.length
            if (r0 != 0) goto L4
            return r3
        L4:
            int r0 = r3.length
            r1 = 0
            r2 = 0
            byte[] r3 = encode(r3, r2, r0, r1)
            return r3
    }

    private static byte[] encode(byte[] r5, int r6, int r7, byte[] r8) {
            if (r8 != 0) goto L8
            int r8 = encodedSize(r7)
            byte[] r8 = new byte[r8]
        L8:
            r0 = 0
        L9:
            r1 = 3
            if (r7 >= r1) goto L69
            r1 = 61
            r2 = 1
            if (r7 != r2) goto L34
            r5 = r5[r6]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 4
            int r6 = r0 + 3
            r8[r6] = r1
            int r6 = r0 + 2
            r8[r6] = r1
            int r6 = r0 + 1
            char[] r7 = com.sun.mail.util.BASE64EncoderStream.pem_array
            r1 = r5 & 63
            char r1 = r7[r1]
            byte r1 = (byte) r1
            r8[r6] = r1
            int r5 = r5 >> 6
            r5 = r5 & 63
            char r5 = r7[r5]
            byte r5 = (byte) r5
            r8[r0] = r5
            return r8
        L34:
            r2 = 2
            if (r7 != r2) goto L68
            int r7 = r6 + 1
            r6 = r5[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 8
            r5 = r5[r7]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r5 = r5 | r6
            int r5 = r5 << r2
            int r6 = r0 + 3
            r8[r6] = r1
            int r6 = r0 + 2
            char[] r7 = com.sun.mail.util.BASE64EncoderStream.pem_array
            r1 = r5 & 63
            char r1 = r7[r1]
            byte r1 = (byte) r1
            r8[r6] = r1
            int r6 = r5 >> 6
            int r1 = r0 + 1
            r6 = r6 & 63
            char r6 = r7[r6]
            byte r6 = (byte) r6
            r8[r1] = r6
            int r5 = r5 >> 12
            r5 = r5 & 63
            char r5 = r7[r5]
            byte r5 = (byte) r5
            r8[r0] = r5
        L68:
            return r8
        L69:
            int r1 = r6 + 1
            r2 = r5[r6]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            int r3 = r6 + 2
            r1 = r5[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r1 = r1 | r2
            int r1 = r1 << 8
            int r6 = r6 + 3
            r2 = r5[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r1 = r1 | r2
            int r2 = r0 + 3
            char[] r3 = com.sun.mail.util.BASE64EncoderStream.pem_array
            r4 = r1 & 63
            char r4 = r3[r4]
            byte r4 = (byte) r4
            r8[r2] = r4
            int r2 = r1 >> 6
            int r4 = r0 + 2
            r2 = r2 & 63
            char r2 = r3[r2]
            byte r2 = (byte) r2
            r8[r4] = r2
            int r2 = r1 >> 12
            int r4 = r0 + 1
            r2 = r2 & 63
            char r2 = r3[r2]
            byte r2 = (byte) r2
            r8[r4] = r2
            int r1 = r1 >> 18
            r1 = r1 & 63
            char r1 = r3[r1]
            byte r1 = (byte) r1
            r8[r0] = r1
            int r7 = r7 + (-3)
            int r0 = r0 + 4
            goto L9
    }

    private static int encodedSize(int r0) {
            int r0 = r0 + 2
            int r0 = r0 / 3
            int r0 = r0 * 4
            return r0
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            r2.flush()     // Catch: java.lang.Throwable -> L19
            int r0 = r2.count     // Catch: java.lang.Throwable -> L19
            if (r0 <= 0) goto L1b
            boolean r0 = r2.noCRLF     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto L1b
            java.io.OutputStream r0 = r2.out     // Catch: java.lang.Throwable -> L19
            byte[] r1 = com.sun.mail.util.BASE64EncoderStream.newline     // Catch: java.lang.Throwable -> L19
            r0.write(r1)     // Catch: java.lang.Throwable -> L19
            java.io.OutputStream r0 = r2.out     // Catch: java.lang.Throwable -> L19
            r0.flush()     // Catch: java.lang.Throwable -> L19
            goto L1b
        L19:
            r0 = move-exception
            goto L22
        L1b:
            java.io.OutputStream r0 = r2.out     // Catch: java.lang.Throwable -> L19
            r0.close()     // Catch: java.lang.Throwable -> L19
            monitor-exit(r2)
            return
        L22:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            throw r0
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public synchronized void flush() throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.bufsize     // Catch: java.lang.Throwable -> Lc
            if (r0 <= 0) goto Le
            r1.encode()     // Catch: java.lang.Throwable -> Lc
            r0 = 0
            r1.bufsize = r0     // Catch: java.lang.Throwable -> Lc
            goto Le
        Lc:
            r0 = move-exception
            goto L15
        Le:
            java.io.OutputStream r0 = r1.out     // Catch: java.lang.Throwable -> Lc
            r0.flush()     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return
        L15:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            throw r0
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public synchronized void write(int r4) throws java.io.IOException {
            r3 = this;
            monitor-enter(r3)
            byte[] r0 = r3.buffer     // Catch: java.lang.Throwable -> L16
            int r1 = r3.bufsize     // Catch: java.lang.Throwable -> L16
            int r2 = r1 + 1
            r3.bufsize = r2     // Catch: java.lang.Throwable -> L16
            byte r4 = (byte) r4     // Catch: java.lang.Throwable -> L16
            r0[r1] = r4     // Catch: java.lang.Throwable -> L16
            r4 = 3
            if (r2 != r4) goto L18
            r3.encode()     // Catch: java.lang.Throwable -> L16
            r4 = 0
            r3.bufsize = r4     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r4 = move-exception
            goto L1a
        L18:
            monitor-exit(r3)
            return
        L1a:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L16
            throw r4
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
    public synchronized void write(byte[] r8, int r9, int r10) throws java.io.IOException {
            r7 = this;
            monitor-enter(r7)
            int r10 = r10 + r9
        L2:
            int r0 = r7.bufsize     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L15
            if (r9 < r10) goto L9
            goto L15
        L9:
            int r0 = r9 + 1
            r9 = r8[r9]     // Catch: java.lang.Throwable -> L12
            r7.write(r9)     // Catch: java.lang.Throwable -> L12
            r9 = r0
            goto L2
        L12:
            r8 = move-exception
            goto L87
        L15:
            int r0 = r7.bytesPerLine     // Catch: java.lang.Throwable -> L12
            int r1 = r7.count     // Catch: java.lang.Throwable -> L12
            int r0 = r0 - r1
            int r0 = r0 / 4
            int r0 = r0 * 3
            int r1 = r9 + r0
            r2 = 0
            if (r1 >= r10) goto L47
            int r3 = encodedSize(r0)     // Catch: java.lang.Throwable -> L12
            boolean r4 = r7.noCRLF     // Catch: java.lang.Throwable -> L12
            if (r4 != 0) goto L39
            byte[] r4 = r7.outbuf     // Catch: java.lang.Throwable -> L12
            int r5 = r3 + 1
            r6 = 13
            r4[r3] = r6     // Catch: java.lang.Throwable -> L12
            int r3 = r3 + 2
            r6 = 10
            r4[r5] = r6     // Catch: java.lang.Throwable -> L12
        L39:
            java.io.OutputStream r4 = r7.out     // Catch: java.lang.Throwable -> L12
            byte[] r5 = r7.outbuf     // Catch: java.lang.Throwable -> L12
            byte[] r9 = encode(r8, r9, r0, r5)     // Catch: java.lang.Throwable -> L12
            r4.write(r9, r2, r3)     // Catch: java.lang.Throwable -> L12
            r7.count = r2     // Catch: java.lang.Throwable -> L12
            r9 = r1
        L47:
            int r0 = r7.lineLimit     // Catch: java.lang.Throwable -> L12
            int r1 = r9 + r0
            if (r1 < r10) goto L78
            int r0 = r9 + 3
            if (r0 >= r10) goto L6c
            int r0 = r10 - r9
            int r0 = r0 / 3
            int r0 = r0 * 3
            int r1 = encodedSize(r0)     // Catch: java.lang.Throwable -> L12
            java.io.OutputStream r3 = r7.out     // Catch: java.lang.Throwable -> L12
            byte[] r4 = r7.outbuf     // Catch: java.lang.Throwable -> L12
            byte[] r4 = encode(r8, r9, r0, r4)     // Catch: java.lang.Throwable -> L12
            r3.write(r4, r2, r1)     // Catch: java.lang.Throwable -> L12
            int r9 = r9 + r0
            int r0 = r7.count     // Catch: java.lang.Throwable -> L12
            int r0 = r0 + r1
            r7.count = r0     // Catch: java.lang.Throwable -> L12
        L6c:
            if (r9 < r10) goto L70
            monitor-exit(r7)
            return
        L70:
            r0 = r8[r9]     // Catch: java.lang.Throwable -> L12
            r7.write(r0)     // Catch: java.lang.Throwable -> L12
            int r9 = r9 + 1
            goto L6c
        L78:
            java.io.OutputStream r1 = r7.out     // Catch: java.lang.Throwable -> L12
            byte[] r3 = r7.outbuf     // Catch: java.lang.Throwable -> L12
            byte[] r0 = encode(r8, r9, r0, r3)     // Catch: java.lang.Throwable -> L12
            r1.write(r0)     // Catch: java.lang.Throwable -> L12
            int r0 = r7.lineLimit     // Catch: java.lang.Throwable -> L12
            int r9 = r9 + r0
            goto L47
        L87:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L12
            throw r8
    }
}
