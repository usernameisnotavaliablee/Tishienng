package javax.mail.internet;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class AsciiOutputStream extends java.io.OutputStream {
    private int ascii;
    private boolean badEOL;
    private boolean breakOnNonAscii;
    private boolean checkEOL;
    private int lastb;
    private int linelen;
    private boolean longLine;
    private int non_ascii;
    private int ret;

    public AsciiOutputStream(boolean r2, boolean r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.ascii = r0
            r1.non_ascii = r0
            r1.linelen = r0
            r1.longLine = r0
            r1.badEOL = r0
            r1.checkEOL = r0
            r1.lastb = r0
            r1.ret = r0
            r1.breakOnNonAscii = r2
            if (r3 == 0) goto L1b
            if (r2 == 0) goto L1b
            r0 = 1
        L1b:
            r1.checkEOL = r0
            return
    }

    private final void check(int r5) throws java.io.IOException {
            r4 = this;
            r5 = r5 & 255(0xff, float:3.57E-43)
            boolean r0 = r4.checkEOL
            r1 = 10
            r2 = 13
            r3 = 1
            if (r0 == 0) goto L17
            int r0 = r4.lastb
            if (r0 != r2) goto L11
            if (r5 != r1) goto L15
        L11:
            if (r0 == r2) goto L17
            if (r5 != r1) goto L17
        L15:
            r4.badEOL = r3
        L17:
            if (r5 == r2) goto L28
            if (r5 != r1) goto L1c
            goto L28
        L1c:
            int r0 = r4.linelen
            int r0 = r0 + r3
            r4.linelen = r0
            r1 = 998(0x3e6, float:1.398E-42)
            if (r0 <= r1) goto L2b
            r4.longLine = r3
            goto L2b
        L28:
            r0 = 0
            r4.linelen = r0
        L2b:
            boolean r0 = javax.mail.internet.MimeUtility.nonascii(r5)
            if (r0 == 0) goto L44
            int r0 = r4.non_ascii
            int r0 = r0 + r3
            r4.non_ascii = r0
            boolean r0 = r4.breakOnNonAscii
            if (r0 != 0) goto L3b
            goto L49
        L3b:
            r5 = 3
            r4.ret = r5
            java.io.EOFException r5 = new java.io.EOFException
            r5.<init>()
            throw r5
        L44:
            int r0 = r4.ascii
            int r0 = r0 + r3
            r4.ascii = r0
        L49:
            r4.lastb = r5
            return
    }

    public int getAscii() {
            r4 = this;
            int r0 = r4.ret
            if (r0 == 0) goto L5
            return r0
        L5:
            boolean r0 = r4.badEOL
            r1 = 3
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r4.non_ascii
            r2 = 2
            if (r0 != 0) goto L17
            boolean r0 = r4.longLine
            if (r0 == 0) goto L15
            return r2
        L15:
            r0 = 1
            return r0
        L17:
            int r3 = r4.ascii
            if (r3 <= r0) goto L1c
            return r2
        L1c:
            return r1
    }

    @Override // java.io.OutputStream
    public void write(int r1) throws java.io.IOException {
            r0 = this;
            r0.check(r1)
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
    public void write(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            int r4 = r4 + r3
        L1:
            if (r3 < r4) goto L4
            return
        L4:
            r0 = r2[r3]
            r1.check(r0)
            int r3 = r3 + 1
            goto L1
    }
}
