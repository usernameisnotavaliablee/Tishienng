package com.sun.mail.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class UUDecoderStream extends java.io.FilterInputStream {
    private byte[] buffer;
    private int bufsize;
    private boolean gotEnd;
    private boolean gotPrefix;
    private int index;
    private com.sun.mail.util.LineInputStream lin;
    private int mode;
    private java.lang.String name;

    public UUDecoderStream(java.io.InputStream r2) {
            r1 = this;
            r1.<init>(r2)
            r0 = 0
            r1.bufsize = r0
            r1.index = r0
            r1.gotPrefix = r0
            r1.gotEnd = r0
            com.sun.mail.util.LineInputStream r0 = new com.sun.mail.util.LineInputStream
            r0.<init>(r2)
            r1.lin = r0
            r2 = 45
            byte[] r2 = new byte[r2]
            r1.buffer = r2
            return
    }

    private boolean decode() throws java.io.IOException {
            r12 = this;
            boolean r0 = r12.gotEnd
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            r12.bufsize = r1
        L8:
            com.sun.mail.util.LineInputStream r0 = r12.lin
            java.lang.String r2 = r0.readLine()
            java.lang.String r0 = "Missing End"
            if (r2 == 0) goto Le2
            r6 = 0
            r7 = 3
            r3 = 1
            r4 = 0
            java.lang.String r5 = "end"
            boolean r3 = r2.regionMatches(r3, r4, r5, r6, r7)
            r4 = 1
            if (r3 == 0) goto L22
            r12.gotEnd = r4
            return r1
        L22:
            int r3 = r2.length()
            if (r3 == 0) goto L8
            char r3 = r2.charAt(r1)
            r5 = 32
            if (r3 < r5) goto Lda
            int r3 = r3 - r5
            r3 = r3 & 63
            if (r3 != 0) goto L52
            com.sun.mail.util.LineInputStream r2 = r12.lin
            java.lang.String r5 = r2.readLine()
            if (r5 == 0) goto L4c
            r9 = 0
            r10 = 3
            r6 = 1
            r7 = 0
            java.lang.String r8 = "end"
            boolean r2 = r5.regionMatches(r6, r7, r8, r9, r10)
            if (r2 == 0) goto L4c
            r12.gotEnd = r4
            return r1
        L4c:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r0)
            throw r1
        L52:
            int r0 = r3 * 8
            int r0 = r0 + 5
            int r0 = r0 / 6
            int r1 = r2.length()
            int r0 = r0 + r4
            if (r1 < r0) goto Ld2
            r0 = 1
        L60:
            int r1 = r12.bufsize
            if (r1 < r3) goto L65
            return r4
        L65:
            int r1 = r0 + 1
            char r6 = r2.charAt(r0)
            int r6 = r6 - r5
            r6 = r6 & 63
            byte r6 = (byte) r6
            int r7 = r0 + 2
            char r1 = r2.charAt(r1)
            int r1 = r1 - r5
            r1 = r1 & 63
            byte r1 = (byte) r1
            byte[] r8 = r12.buffer
            int r9 = r12.bufsize
            int r10 = r9 + 1
            r12.bufsize = r10
            int r6 = r6 << 2
            r6 = r6 & 252(0xfc, float:3.53E-43)
            int r11 = r1 >>> 4
            r11 = r11 & 3
            r6 = r6 | r11
            byte r6 = (byte) r6
            r8[r9] = r6
            if (r10 >= r3) goto Laf
            int r0 = r0 + 3
            char r6 = r2.charAt(r7)
            int r6 = r6 - r5
            r6 = r6 & 63
            byte r6 = (byte) r6
            byte[] r7 = r12.buffer
            int r8 = r12.bufsize
            int r9 = r8 + 1
            r12.bufsize = r9
            int r1 = r1 << 4
            r1 = r1 & 240(0xf0, float:3.36E-43)
            int r9 = r6 >>> 2
            r9 = r9 & 15
            r1 = r1 | r9
            byte r1 = (byte) r1
            r7[r8] = r1
            r1 = r6
            goto Lb0
        Laf:
            r0 = r7
        Lb0:
            int r6 = r12.bufsize
            if (r6 >= r3) goto L60
            int r6 = r0 + 1
            char r0 = r2.charAt(r0)
            int r0 = r0 - r5
            r0 = r0 & 63
            byte r0 = (byte) r0
            byte[] r7 = r12.buffer
            int r8 = r12.bufsize
            int r9 = r8 + 1
            r12.bufsize = r9
            int r1 = r1 << 6
            r1 = r1 & 192(0xc0, float:2.69E-43)
            r0 = r0 & 63
            r0 = r0 | r1
            byte r0 = (byte) r0
            r7[r8] = r0
            r0 = r6
            goto L60
        Ld2:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Short buffer error"
            r0.<init>(r1)
            throw r0
        Lda:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Buffer format error"
            r0.<init>(r1)
            throw r0
        Le2:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r0)
            throw r1
    }

    private void readPrefix() throws java.io.IOException {
            r7 = this;
            boolean r0 = r7.gotPrefix
            if (r0 == 0) goto L5
            return
        L5:
            com.sun.mail.util.LineInputStream r0 = r7.lin
            java.lang.String r1 = r0.readLine()
            if (r1 == 0) goto L4b
            r5 = 0
            r6 = 5
            r2 = 1
            r3 = 0
            java.lang.String r4 = "begin"
            boolean r0 = r1.regionMatches(r2, r3, r4, r5, r6)
            if (r0 == 0) goto L5
            r0 = 6
            r2 = 9
            java.lang.String r0 = r1.substring(r0, r2)     // Catch: java.lang.NumberFormatException -> L32
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L32
            r7.mode = r0     // Catch: java.lang.NumberFormatException -> L32
            r0 = 10
            java.lang.String r0 = r1.substring(r0)
            r7.name = r0
            r0 = 1
            r7.gotPrefix = r0
            return
        L32:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "UUDecoder error: "
            r2.<init>(r3)
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L4b:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "UUDecoder error: No Begin"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws java.io.IOException {
            r3 = this;
            java.io.InputStream r0 = r3.in
            int r0 = r0.available()
            int r0 = r0 * 3
            int r0 = r0 / 4
            int r1 = r3.bufsize
            int r2 = r3.index
            int r1 = r1 - r2
            int r0 = r0 + r1
            return r0
    }

    public int getMode() throws java.io.IOException {
            r1 = this;
            r1.readPrefix()
            int r0 = r1.mode
            return r0
    }

    public java.lang.String getName() throws java.io.IOException {
            r1 = this;
            r1.readPrefix()
            java.lang.String r0 = r1.name
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
            r3 = this;
            int r0 = r3.index
            int r1 = r3.bufsize
            if (r0 < r1) goto L14
            r3.readPrefix()
            boolean r0 = r3.decode()
            if (r0 != 0) goto L11
            r0 = -1
            return r0
        L11:
            r0 = 0
            r3.index = r0
        L14:
            byte[] r0 = r3.buffer
            int r1 = r3.index
            int r2 = r1 + 1
            r3.index = r2
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
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
