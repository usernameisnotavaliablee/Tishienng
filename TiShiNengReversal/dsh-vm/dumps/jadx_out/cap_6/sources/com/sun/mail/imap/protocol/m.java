package com.sun.mail.imap.protocol;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class m {
    public static final int g = 1;
    public static final int h = 2;
    public static final int i = 3;
    public java.lang.String a;
    public char b;
    public boolean c;
    public boolean d;
    public int e;
    public java.lang.String[] f;

    public m(com.sun.mail.imap.protocol.i r9) throws com.sun.mail.iap.ParsingException {
            r8 = this;
            r8.<init>()
            r0 = 0
            r8.a = r0
            r0 = 47
            r8.b = r0
            r0 = 1
            r8.c = r0
            r8.d = r0
            r1 = 3
            r8.e = r1
            java.lang.String[] r1 = r9.H()
            java.util.Vector r2 = new java.util.Vector
            r2.<init>()
            r3 = 2
            if (r1 == 0) goto L5f
            r4 = 0
            r5 = 0
        L20:
            int r6 = r1.length
            if (r5 < r6) goto L24
            goto L5f
        L24:
            r6 = r1[r5]
            java.lang.String r7 = "\\Marked"
            boolean r6 = r6.equalsIgnoreCase(r7)
            if (r6 == 0) goto L31
            r8.e = r0
            goto L57
        L31:
            r6 = r1[r5]
            java.lang.String r7 = "\\Unmarked"
            boolean r6 = r6.equalsIgnoreCase(r7)
            if (r6 == 0) goto L3e
            r8.e = r3
            goto L57
        L3e:
            r6 = r1[r5]
            java.lang.String r7 = "\\Noselect"
            boolean r6 = r6.equalsIgnoreCase(r7)
            if (r6 == 0) goto L4b
            r8.d = r4
            goto L57
        L4b:
            r6 = r1[r5]
            java.lang.String r7 = "\\Noinferiors"
            boolean r6 = r6.equalsIgnoreCase(r7)
            if (r6 == 0) goto L57
            r8.c = r4
        L57:
            r6 = r1[r5]
            r2.addElement(r6)
            int r5 = r5 + 1
            goto L20
        L5f:
            int r1 = r2.size()
            java.lang.String[] r1 = new java.lang.String[r1]
            r8.f = r1
            r2.copyInto(r1)
            r9.B()
            byte r1 = r9.r()
            r2 = 34
            if (r1 != r2) goto L8b
            byte r1 = r9.r()
            char r1 = (char) r1
            r8.b = r1
            r2 = 92
            if (r1 != r2) goto L87
            byte r1 = r9.r()
            char r1 = (char) r1
            r8.b = r1
        L87:
            r9.A(r0)
            goto L8e
        L8b:
            r9.A(r3)
        L8e:
            r9.B()
            java.lang.String r9 = r9.q()
            r8.a = r9
            java.lang.String r9 = com.sun.mail.imap.protocol.a.b(r9)
            r8.a = r9
            return
    }
}
