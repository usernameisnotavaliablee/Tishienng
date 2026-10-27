package org.apache.commons.net.io;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class j extends java.io.FilterInputStream {
    private static final int b = 0;
    private static final int c = 1;
    private static final int d = 2;
    private int a;

    public j(java.io.InputStream r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.a = r1
            return
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws java.io.IOException {
            r3 = this;
            java.io.InputStream r0 = r3.in
            int r0 = r0.available()
            int r1 = r3.a
            r2 = 2
            if (r1 != r2) goto Ld
            int r0 = r0 + 1
        Ld:
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
            r6 = this;
            int r0 = r6.a
            r1 = 10
            r2 = 0
            r3 = 2
            if (r0 != r3) goto Lb
            r6.a = r2
            return r1
        Lb:
            java.io.InputStream r0 = r6.in
            int r0 = r0.read()
            r4 = 1
            r5 = 13
            if (r0 == r1) goto L1c
            if (r0 == r5) goto L19
            goto L23
        L19:
            r6.a = r4
            return r5
        L1c:
            int r1 = r6.a
            if (r1 == r4) goto L23
            r6.a = r3
            return r5
        L23:
            r6.a = r2
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

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] r5, int r6, int r7) throws java.io.IOException {
            r4 = this;
            r0 = 1
            if (r7 >= r0) goto L5
            r5 = 0
            return r5
        L5:
            int r1 = r4.available()
            if (r7 <= r1) goto Lc
            r7 = r1
        Lc:
            if (r7 >= r0) goto Lf
            goto L10
        Lf:
            r0 = r7
        L10:
            int r7 = r4.read()
            r1 = -1
            if (r7 != r1) goto L18
            return r1
        L18:
            r2 = r6
        L19:
            int r3 = r2 + 1
            byte r7 = (byte) r7
            r5[r2] = r7
            int r0 = r0 + r1
            if (r0 <= 0) goto L2a
            int r7 = r4.read()
            if (r7 != r1) goto L28
            goto L2a
        L28:
            r2 = r3
            goto L19
        L2a:
            int r3 = r3 - r6
            return r3
    }
}
