package com.sun.mail.smtp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class SMTPOutputStream extends com.sun.mail.util.CRLFOutputStream {
    public SMTPOutputStream(java.io.OutputStream r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public void ensureAtBOL() throws java.io.IOException {
            r1 = this;
            boolean r0 = r1.atBOL
            if (r0 != 0) goto L7
            super.writeln()
        L7:
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() {
            r0 = this;
            return
    }

    @Override // com.sun.mail.util.CRLFOutputStream, java.io.FilterOutputStream, java.io.OutputStream
    public void write(int r3) throws java.io.IOException {
            r2 = this;
            int r0 = r2.lastb
            r1 = 10
            if (r0 == r1) goto Ld
            r1 = 13
            if (r0 == r1) goto Ld
            r1 = -1
            if (r0 != r1) goto L16
        Ld:
            r0 = 46
            if (r3 != r0) goto L16
            java.io.OutputStream r1 = r2.out
            r1.write(r0)
        L16:
            super.write(r3)
            return
    }

    @Override // com.sun.mail.util.CRLFOutputStream, java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] r5, int r6, int r7) throws java.io.IOException {
            r4 = this;
            int r0 = r4.lastb
            r1 = -1
            r2 = 10
            if (r0 != r1) goto L9
            r0 = 10
        L9:
            int r7 = r7 + r6
            r1 = r0
            r0 = r6
        Lc:
            if (r6 < r7) goto L15
            int r7 = r7 - r0
            if (r7 <= 0) goto L14
            super.write(r5, r0, r7)
        L14:
            return
        L15:
            if (r1 == r2) goto L1b
            r3 = 13
            if (r1 != r3) goto L2c
        L1b:
            r1 = r5[r6]
            r3 = 46
            if (r1 != r3) goto L2c
            int r1 = r6 - r0
            super.write(r5, r0, r1)
            java.io.OutputStream r0 = r4.out
            r0.write(r3)
            r0 = r6
        L2c:
            r1 = r5[r6]
            int r6 = r6 + 1
            goto Lc
    }
}
