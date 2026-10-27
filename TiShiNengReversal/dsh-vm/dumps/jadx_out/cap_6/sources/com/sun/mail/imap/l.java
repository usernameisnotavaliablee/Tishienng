package com.sun.mail.imap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class l extends java.io.OutputStream {
    private int a;
    private byte[] b;
    private int c;

    public l(int r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r0 = new byte[r0]
            r1.b = r0
            r1.c = r2
            return
    }

    public byte[] a() {
            r1 = this;
            byte[] r0 = r1.b
            return r0
    }

    public int b() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    @Override // java.io.OutputStream
    public void write(int r6) {
            r5 = this;
            int r0 = r5.a
            int r1 = r0 + 1
            byte[] r2 = r5.b
            if (r2 == 0) goto L31
            int r3 = r5.c
            if (r1 <= r3) goto L12
            if (r3 < 0) goto L12
            r6 = 0
            r5.b = r6
            goto L31
        L12:
            int r3 = r2.length
            if (r1 <= r3) goto L2e
            int r0 = r2.length
            int r0 = r0 << 1
            int r0 = java.lang.Math.max(r0, r1)
            byte[] r0 = new byte[r0]
            byte[] r2 = r5.b
            int r3 = r5.a
            r4 = 0
            java.lang.System.arraycopy(r2, r4, r0, r4, r3)
            r5.b = r0
            int r2 = r5.a
            byte r6 = (byte) r6
            r0[r2] = r6
            goto L31
        L2e:
            byte r6 = (byte) r6
            r2[r0] = r6
        L31:
            r5.a = r1
            return
    }

    @Override // java.io.OutputStream
    public void write(byte[] r3) throws java.io.IOException {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            r2.write(r3, r0, r1)
            return
    }

    @Override // java.io.OutputStream
    public void write(byte[] r6, int r7, int r8) {
            r5 = this;
            if (r7 < 0) goto L45
            int r0 = r6.length
            if (r7 > r0) goto L45
            if (r8 < 0) goto L45
            int r0 = r7 + r8
            int r1 = r6.length
            if (r0 > r1) goto L45
            if (r0 < 0) goto L45
            if (r8 != 0) goto L11
            return
        L11:
            int r0 = r5.a
            int r1 = r0 + r8
            byte[] r2 = r5.b
            if (r2 == 0) goto L42
            int r3 = r5.c
            if (r1 <= r3) goto L23
            if (r3 < 0) goto L23
            r6 = 0
            r5.b = r6
            goto L42
        L23:
            int r3 = r2.length
            if (r1 <= r3) goto L3f
            int r0 = r2.length
            int r0 = r0 << 1
            int r0 = java.lang.Math.max(r0, r1)
            byte[] r0 = new byte[r0]
            byte[] r2 = r5.b
            int r3 = r5.a
            r4 = 0
            java.lang.System.arraycopy(r2, r4, r0, r4, r3)
            r5.b = r0
            int r2 = r5.a
            java.lang.System.arraycopy(r6, r7, r0, r2, r8)
            goto L42
        L3f:
            java.lang.System.arraycopy(r6, r7, r2, r0, r8)
        L42:
            r5.a = r1
            return
        L45:
            java.lang.IndexOutOfBoundsException r6 = new java.lang.IndexOutOfBoundsException
            r6.<init>()
            throw r6
    }
}
