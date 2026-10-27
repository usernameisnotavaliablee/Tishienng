package com.sun.mail.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class CRLFOutputStream extends java.io.FilterOutputStream {
    private static final byte[] newline = null;
    protected boolean atBOL;
    protected int lastb;

    static {
            r0 = 2
            byte[] r0 = new byte[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [13, 10} // fill-array
            com.sun.mail.util.CRLFOutputStream.newline = r0
            return
    }

    public CRLFOutputStream(java.io.OutputStream r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = -1
            r0.lastb = r1
            r1 = 1
            r0.atBOL = r1
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int r3) throws java.io.IOException {
            r2 = this;
            r0 = 13
            if (r3 != r0) goto L8
            r2.writeln()
            goto L1c
        L8:
            r1 = 10
            if (r3 != r1) goto L14
            int r1 = r2.lastb
            if (r1 == r0) goto L1c
            r2.writeln()
            goto L1c
        L14:
            java.io.OutputStream r0 = r2.out
            r0.write(r3)
            r0 = 0
            r2.atBOL = r0
        L1c:
            r2.lastb = r3
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
    public void write(byte[] r5, int r6, int r7) throws java.io.IOException {
            r4 = this;
            int r7 = r7 + r6
            r0 = r6
        L2:
            if (r6 < r7) goto L10
            int r7 = r7 - r0
            if (r7 <= 0) goto Lf
            java.io.OutputStream r6 = r4.out
            r6.write(r5, r0, r7)
            r5 = 0
            r4.atBOL = r5
        Lf:
            return
        L10:
            r1 = r5[r6]
            r2 = 13
            if (r1 != r2) goto L23
            java.io.OutputStream r1 = r4.out
            int r2 = r6 - r0
            r1.write(r5, r0, r2)
            r4.writeln()
        L20:
            int r0 = r6 + 1
            goto L36
        L23:
            r3 = 10
            if (r1 != r3) goto L36
            int r1 = r4.lastb
            if (r1 == r2) goto L20
            java.io.OutputStream r1 = r4.out
            int r2 = r6 - r0
            r1.write(r5, r0, r2)
            r4.writeln()
            goto L20
        L36:
            r1 = r5[r6]
            r4.lastb = r1
            int r6 = r6 + 1
            goto L2
    }

    public void writeln() throws java.io.IOException {
            r2 = this;
            java.io.OutputStream r0 = r2.out
            byte[] r1 = com.sun.mail.util.CRLFOutputStream.newline
            r0.write(r1)
            r0 = 1
            r2.atBOL = r0
            return
    }
}
