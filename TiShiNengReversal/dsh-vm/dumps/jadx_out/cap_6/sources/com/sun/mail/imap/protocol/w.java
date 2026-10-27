package com.sun.mail.imap.protocol;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class w {
    public long a;
    public long b;

    public w() {
            r0 = this;
            r0.<init>()
            return
    }

    public w(long r1, long r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r3
            return
    }

    public static com.sun.mail.imap.protocol.w[] a(long[] r9) {
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r9.length
            if (r1 < r2) goto L13
            int r9 = r0.size()
            com.sun.mail.imap.protocol.w[] r9 = new com.sun.mail.imap.protocol.w[r9]
            r0.copyInto(r9)
            return r9
        L13:
            com.sun.mail.imap.protocol.w r2 = new com.sun.mail.imap.protocol.w
            r2.<init>()
            r3 = r9[r1]
            r2.a = r3
        L1c:
            int r1 = r1 + 1
            int r3 = r9.length
            if (r1 < r3) goto L22
            goto L2f
        L22:
            r3 = r9[r1]
            int r5 = r1 + (-1)
            r5 = r9[r5]
            r7 = 1
            long r5 = r5 + r7
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L1c
        L2f:
            int r3 = r1 + (-1)
            r3 = r9[r3]
            r2.b = r3
            r0.addElement(r2)
            goto L6
    }

    public static long c(com.sun.mail.imap.protocol.w[] r5) {
            r0 = 0
            if (r5 != 0) goto L5
            return r0
        L5:
            r2 = 0
        L6:
            int r3 = r5.length
            if (r2 < r3) goto La
            return r0
        La:
            r3 = r5[r2]
            long r3 = r3.b()
            long r0 = r0 + r3
            int r2 = r2 + 1
            goto L6
    }

    public static java.lang.String d(com.sun.mail.imap.protocol.w[] r8) {
            if (r8 == 0) goto L35
            int r0 = r8.length
            if (r0 != 0) goto L6
            goto L35
        L6:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            int r1 = r8.length
            r2 = 0
        Ld:
            r3 = r8[r2]
            long r4 = r3.a
            long r6 = r3.b
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 <= 0) goto L23
            r0.append(r4)
            r3 = 58
            r0.append(r3)
            r0.append(r6)
            goto L26
        L23:
            r0.append(r4)
        L26:
            int r2 = r2 + 1
            if (r2 < r1) goto L2f
            java.lang.String r8 = r0.toString()
            return r8
        L2f:
            r3 = 44
            r0.append(r3)
            goto Ld
        L35:
            r8 = 0
            return r8
    }

    public long b() {
            r4 = this;
            long r0 = r4.b
            long r2 = r4.a
            long r0 = r0 - r2
            r2 = 1
            long r0 = r0 + r2
            return r0
    }
}
