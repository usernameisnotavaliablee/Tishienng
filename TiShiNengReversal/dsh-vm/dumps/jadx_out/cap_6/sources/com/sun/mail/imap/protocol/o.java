package com.sun.mail.imap.protocol;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class o {
    public int a;
    public int b;

    public o() {
            r0 = this;
            r0.<init>()
            return
    }

    public o(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public static com.sun.mail.imap.protocol.o[] a(int[] r5) {
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r5.length
            if (r1 < r2) goto L13
            int r5 = r0.size()
            com.sun.mail.imap.protocol.o[] r5 = new com.sun.mail.imap.protocol.o[r5]
            r0.copyInto(r5)
            return r5
        L13:
            com.sun.mail.imap.protocol.o r2 = new com.sun.mail.imap.protocol.o
            r2.<init>()
            r3 = r5[r1]
            r2.a = r3
        L1c:
            int r1 = r1 + 1
            int r3 = r5.length
            if (r1 < r3) goto L22
            goto L2c
        L22:
            r3 = r5[r1]
            int r4 = r1 + (-1)
            r4 = r5[r4]
            int r4 = r4 + 1
            if (r3 == r4) goto L1c
        L2c:
            int r3 = r1 + (-1)
            r3 = r5[r3]
            r2.b = r3
            r0.addElement(r2)
            goto L6
    }

    public static int c(com.sun.mail.imap.protocol.o[] r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            r1 = 0
        L5:
            int r2 = r3.length
            if (r0 < r2) goto L9
            return r1
        L9:
            r2 = r3[r0]
            int r2 = r2.b()
            int r1 = r1 + r2
            int r0 = r0 + 1
            goto L5
    }

    public static java.lang.String d(com.sun.mail.imap.protocol.o[] r5) {
            if (r5 == 0) goto L33
            int r0 = r5.length
            if (r0 != 0) goto L6
            goto L33
        L6:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            int r1 = r5.length
            r2 = 0
        Ld:
            r3 = r5[r2]
            int r4 = r3.a
            int r3 = r3.b
            if (r3 <= r4) goto L21
            r0.append(r4)
            r4 = 58
            r0.append(r4)
            r0.append(r3)
            goto L24
        L21:
            r0.append(r4)
        L24:
            int r2 = r2 + 1
            if (r2 < r1) goto L2d
            java.lang.String r5 = r0.toString()
            return r5
        L2d:
            r3 = 44
            r0.append(r3)
            goto Ld
        L33:
            r5 = 0
            return r5
    }

    public int b() {
            r2 = this;
            int r0 = r2.b
            int r1 = r2.a
            int r0 = r0 - r1
            int r0 = r0 + 1
            return r0
    }
}
