package com.sun.mail.imap.protocol;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class FLAGS extends javax.mail.Flags implements com.sun.mail.imap.protocol.l {
    static final char[] name = null;
    private static final long serialVersionUID = 439049847053756670L;
    public int msgno;

    static {
            r0 = 5
            char[] r0 = new char[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [70, 76, 65, 71, 83} // fill-array
            com.sun.mail.imap.protocol.FLAGS.name = r0
            return
    }

    public FLAGS(com.sun.mail.imap.protocol.i r8) throws com.sun.mail.iap.ParsingException {
            r7 = this;
            r7.<init>()
            int r0 = r8.E()
            r7.msgno = r0
            r8.B()
            java.lang.String[] r8 = r8.H()
            if (r8 == 0) goto L9e
            r0 = 0
            r1 = 0
        L14:
            int r2 = r8.length
            if (r1 < r2) goto L19
            goto L9e
        L19:
            r2 = r8[r1]
            int r3 = r2.length()
            r4 = 2
            if (r3 < r4) goto L97
            char r3 = r2.charAt(r0)
            r5 = 92
            if (r3 != r5) goto L97
            r3 = 1
            char r3 = r2.charAt(r3)
            char r3 = java.lang.Character.toUpperCase(r3)
            r5 = 42
            if (r3 == r5) goto L91
            r5 = 65
            if (r3 == r5) goto L8b
            r5 = 68
            r6 = 82
            if (r3 == r5) goto L61
            r4 = 70
            if (r3 == r4) goto L5b
            if (r3 == r6) goto L55
            r4 = 83
            if (r3 == r4) goto L4f
            r7.add(r2)
            goto L9a
        L4f:
            javax.mail.Flags$Flag r2 = javax.mail.Flags.Flag.SEEN
            r7.add(r2)
            goto L9a
        L55:
            javax.mail.Flags$Flag r2 = javax.mail.Flags.Flag.RECENT
            r7.add(r2)
            goto L9a
        L5b:
            javax.mail.Flags$Flag r2 = javax.mail.Flags.Flag.FLAGGED
            r7.add(r2)
            goto L9a
        L61:
            int r3 = r2.length()
            r5 = 3
            if (r3 < r5) goto L87
            char r2 = r2.charAt(r4)
            r3 = 101(0x65, float:1.42E-43)
            if (r2 == r3) goto L81
            r3 = 69
            if (r2 != r3) goto L75
            goto L81
        L75:
            r3 = 114(0x72, float:1.6E-43)
            if (r2 == r3) goto L7b
            if (r2 != r6) goto L9a
        L7b:
            javax.mail.Flags$Flag r2 = javax.mail.Flags.Flag.DRAFT
            r7.add(r2)
            goto L9a
        L81:
            javax.mail.Flags$Flag r2 = javax.mail.Flags.Flag.DELETED
            r7.add(r2)
            goto L9a
        L87:
            r7.add(r2)
            goto L9a
        L8b:
            javax.mail.Flags$Flag r2 = javax.mail.Flags.Flag.ANSWERED
            r7.add(r2)
            goto L9a
        L91:
            javax.mail.Flags$Flag r2 = javax.mail.Flags.Flag.USER
            r7.add(r2)
            goto L9a
        L97:
            r7.add(r2)
        L9a:
            int r1 = r1 + 1
            goto L14
        L9e:
            return
    }
}
