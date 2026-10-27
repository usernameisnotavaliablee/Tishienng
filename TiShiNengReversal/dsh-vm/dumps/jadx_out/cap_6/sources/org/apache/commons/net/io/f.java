package org.apache.commons.net.io;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class f extends java.io.PushbackInputStream {
    static final boolean b = false;
    static final java.lang.String c = null;
    static final byte[] d = null;
    private int a;

    static {
            java.lang.String r0 = "line.separator"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            org.apache.commons.net.io.f.c = r0
            java.lang.String r1 = "\r\n"
            boolean r1 = r0.equals(r1)
            org.apache.commons.net.io.f.b = r1
            java.lang.String r1 = "US-ASCII"
            byte[] r0 = r0.getBytes(r1)     // Catch: java.io.UnsupportedEncodingException -> L19
            org.apache.commons.net.io.f.d = r0     // Catch: java.io.UnsupportedEncodingException -> L19
            return
        L19:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Broken JVM - cannot find US-ASCII charset!"
            r1.<init>(r2, r0)
            throw r1
    }

    public f(java.io.InputStream r2) {
            r1 = this;
            byte[] r0 = org.apache.commons.net.io.f.d
            int r0 = r0.length
            int r0 = r0 + 1
            r1.<init>(r2, r0)
            r2 = 0
            r1.a = r2
            return
    }

    private int a() throws java.io.IOException {
            r3 = this;
            int r0 = super.read()
            r1 = 13
            if (r0 != r1) goto L27
            int r0 = super.read()
            r2 = 10
            if (r0 != r2) goto L20
            byte[] r0 = org.apache.commons.net.io.f.d
            r3.unread(r0)
            int r0 = super.read()
            int r1 = r3.a
            int r1 = r1 + (-1)
            r3.a = r1
            return r0
        L20:
            r2 = -1
            if (r0 == r2) goto L26
            r3.unread(r0)
        L26:
            return r1
        L27:
            return r0
    }

    public static final boolean b() {
            boolean r0 = org.apache.commons.net.io.f.b
            r0 = r0 ^ 1
            return r0
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream
    public int available() throws java.io.IOException {
            r2 = this;
            java.io.InputStream r0 = r2.in
            if (r0 == 0) goto L12
            byte[] r0 = r2.buf
            int r0 = r0.length
            int r1 = r2.pos
            int r0 = r0 - r1
            java.io.InputStream r1 = r2.in
            int r1 = r1.available()
            int r0 = r0 + r1
            return r0
        L12:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Stream closed"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws java.io.IOException {
            r1 = this;
            boolean r0 = org.apache.commons.net.io.f.b
            if (r0 == 0) goto L9
            int r0 = super.read()
            return r0
        L9:
            int r0 = r1.a()
            return r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] r3) throws java.io.IOException {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            int r3 = r2.read(r3, r0, r1)
            return r3
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] r5, int r6, int r7) throws java.io.IOException {
            r4 = this;
            boolean r0 = org.apache.commons.net.io.f.b
            if (r0 == 0) goto L9
            int r5 = super.read(r5, r6, r7)
            return r5
        L9:
            r0 = 1
            if (r7 >= r0) goto Le
            r5 = 0
            return r5
        Le:
            int r1 = r4.available()
            if (r7 <= r1) goto L15
            r7 = r1
        L15:
            r4.a = r7
            if (r7 >= r0) goto L1b
            r4.a = r0
        L1b:
            int r7 = r4.a()
            r1 = -1
            if (r7 != r1) goto L23
            return r1
        L23:
            r2 = r6
        L24:
            int r3 = r2 + 1
            byte r7 = (byte) r7
            r5[r2] = r7
            int r7 = r4.a
            int r7 = r7 - r0
            r4.a = r7
            if (r7 <= 0) goto L39
            int r7 = r4.a()
            if (r7 != r1) goto L37
            goto L39
        L37:
            r2 = r3
            goto L24
        L39:
            int r3 = r3 - r6
            return r3
    }
}
