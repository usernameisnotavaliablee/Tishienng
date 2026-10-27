package com.sun.mail.imap.protocol;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a {
    static final char[] a = null;
    private static final byte[] b = null;

    static {
            r0 = 64
            char[] r0 = new char[r0]
            r0 = {x002e: FILL_ARRAY_DATA , data: [65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 44} // fill-array
            com.sun.mail.imap.protocol.a.a = r0
            r0 = 256(0x100, float:3.59E-43)
            byte[] r0 = new byte[r0]
            com.sun.mail.imap.protocol.a.b = r0
            r0 = 0
            r1 = 0
        L11:
            r2 = 255(0xff, float:3.57E-43)
            if (r1 < r2) goto L25
        L15:
            char[] r1 = com.sun.mail.imap.protocol.a.a
            int r2 = r1.length
            if (r0 < r2) goto L1b
            return
        L1b:
            byte[] r2 = com.sun.mail.imap.protocol.a.b
            char r1 = r1[r0]
            byte r3 = (byte) r0
            r2[r1] = r3
            int r0 = r0 + 1
            goto L15
        L25:
            byte[] r2 = com.sun.mail.imap.protocol.a.b
            r3 = -1
            r2[r1] = r3
            int r1 = r1 + 1
            goto L11
    }

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    protected static int a(char[] r9, int r10, java.text.CharacterIterator r11) {
            r0 = 1
            r1 = -1
        L2:
            r2 = -1
        L3:
            char r3 = r11.next()
            byte r3 = (byte) r3
            if (r3 != r1) goto Lc
            goto La6
        Lc:
            r4 = 45
            if (r3 != r4) goto L19
            if (r0 == 0) goto La6
            int r11 = r10 + 1
            r0 = 38
            r9[r10] = r0
            return r11
        L19:
            char r0 = r11.next()
            byte r0 = (byte) r0
            if (r0 == r1) goto La6
            if (r0 != r4) goto L24
            goto La6
        L24:
            byte[] r5 = com.sun.mail.imap.protocol.a.b
            r3 = r3 & 255(0xff, float:3.57E-43)
            r3 = r5[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r0 = r5[r0]
            int r3 = r3 << 2
            r3 = r3 & 252(0xfc, float:3.53E-43)
            int r6 = r0 >>> 4
            r6 = r6 & 3
            r3 = r3 | r6
            byte r3 = (byte) r3
            if (r2 == r1) goto L47
            int r6 = r10 + 1
            int r2 = r2 << 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            r2 = r2 | r3
            char r2 = (char) r2
            r9[r10] = r2
            r10 = r6
            r2 = -1
            goto L49
        L47:
            r2 = r3 & 255(0xff, float:3.57E-43)
        L49:
            char r3 = r11.next()
            byte r3 = (byte) r3
            r6 = 61
            r7 = 0
            if (r3 != r6) goto L55
        L53:
            r0 = 0
            goto L3
        L55:
            if (r3 == r1) goto La6
            if (r3 != r4) goto L5a
            goto La6
        L5a:
            r3 = r3 & 255(0xff, float:3.57E-43)
            r3 = r5[r3]
            int r0 = r0 << 4
            r0 = r0 & 240(0xf0, float:3.36E-43)
            int r8 = r3 >>> 2
            r8 = r8 & 15
            r0 = r0 | r8
            byte r0 = (byte) r0
            if (r2 == r1) goto L77
            int r8 = r10 + 1
            int r2 = r2 << 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            r0 = r0 | r2
            char r0 = (char) r0
            r9[r10] = r0
            r10 = r8
            r2 = -1
            goto L7a
        L77:
            r0 = r0 & 255(0xff, float:3.57E-43)
            r2 = r0
        L7a:
            char r0 = r11.next()
            byte r0 = (byte) r0
            if (r0 != r6) goto L82
            goto L53
        L82:
            if (r0 == r1) goto La6
            if (r0 != r4) goto L87
            goto La6
        L87:
            r0 = r0 & 255(0xff, float:3.57E-43)
            r0 = r5[r0]
            int r3 = r3 << 6
            r3 = r3 & 192(0xc0, float:2.69E-43)
            r0 = r0 & 63
            r0 = r0 | r3
            byte r0 = (byte) r0
            if (r2 == r1) goto La3
            int r2 = r2 << 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            r0 = r0 | r2
            char r0 = (char) r0
            int r2 = r10 + 1
            r9[r10] = r0
            r10 = r2
            r0 = 0
            goto L2
        La3:
            r2 = r0 & 255(0xff, float:3.57E-43)
            goto L53
        La6:
            return r10
    }

    public static java.lang.String b(java.lang.String r7) {
            if (r7 == 0) goto L3d
            int r0 = r7.length()
            if (r0 != 0) goto L9
            goto L3d
        L9:
            int r0 = r7.length()
            char[] r0 = new char[r0]
            java.text.StringCharacterIterator r1 = new java.text.StringCharacterIterator
            r1.<init>(r7)
            char r2 = r1.first()
            r3 = 0
            r4 = 0
            r5 = 0
        L1b:
            r6 = 65535(0xffff, float:9.1834E-41)
            if (r2 != r6) goto L28
            if (r4 == 0) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0, r3, r5)
        L27:
            return r7
        L28:
            r6 = 38
            if (r2 != r6) goto L33
            int r2 = a(r0, r5, r1)
            r4 = 1
            r5 = r2
            goto L38
        L33:
            int r6 = r5 + 1
            r0[r5] = r2
            r5 = r6
        L38:
            char r2 = r1.next()
            goto L1b
        L3d:
            return r7
    }
}
