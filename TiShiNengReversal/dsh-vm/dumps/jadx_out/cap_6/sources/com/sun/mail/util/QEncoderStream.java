package com.sun.mail.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class QEncoderStream extends com.sun.mail.util.QPEncoderStream {
    private static java.lang.String TEXT_SPECIALS = "=_?";
    private static java.lang.String WORD_SPECIALS = "=_?\"#$%&'(),.:;<>@[\\]^`{|}~";
    private java.lang.String specials;

    static {
            return
    }

    public QEncoderStream(java.io.OutputStream r2, boolean r3) {
            r1 = this;
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1.<init>(r2, r0)
            if (r3 == 0) goto Lb
            java.lang.String r2 = com.sun.mail.util.QEncoderStream.WORD_SPECIALS
            goto Ld
        Lb:
            java.lang.String r2 = com.sun.mail.util.QEncoderStream.TEXT_SPECIALS
        Ld:
            r1.specials = r2
            return
    }

    public static int encodedLength(byte[] r4, boolean r5) {
            if (r5 == 0) goto L5
            java.lang.String r5 = com.sun.mail.util.QEncoderStream.WORD_SPECIALS
            goto L7
        L5:
            java.lang.String r5 = com.sun.mail.util.QEncoderStream.TEXT_SPECIALS
        L7:
            r0 = 0
            r1 = 0
        L9:
            int r2 = r4.length
            if (r0 < r2) goto Ld
            return r1
        Ld:
            r2 = r4[r0]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 32
            if (r2 < r3) goto L23
            r3 = 127(0x7f, float:1.78E-43)
            if (r2 >= r3) goto L23
            int r2 = r5.indexOf(r2)
            if (r2 < 0) goto L20
            goto L23
        L20:
            int r1 = r1 + 1
            goto L25
        L23:
            int r1 = r1 + 3
        L25:
            int r0 = r0 + 1
            goto L9
    }

    @Override // com.sun.mail.util.QPEncoderStream, java.io.FilterOutputStream, java.io.OutputStream
    public void write(int r3) throws java.io.IOException {
            r2 = this;
            r3 = r3 & 255(0xff, float:3.57E-43)
            r0 = 0
            r1 = 32
            if (r3 != r1) goto Ld
            r3 = 95
            r2.output(r3, r0)
            return
        Ld:
            if (r3 < r1) goto L20
            r1 = 127(0x7f, float:1.78E-43)
            if (r3 >= r1) goto L20
            java.lang.String r1 = r2.specials
            int r1 = r1.indexOf(r3)
            if (r1 < 0) goto L1c
            goto L20
        L1c:
            r2.output(r3, r0)
            return
        L20:
            r0 = 1
            r2.output(r3, r0)
            return
    }
}
