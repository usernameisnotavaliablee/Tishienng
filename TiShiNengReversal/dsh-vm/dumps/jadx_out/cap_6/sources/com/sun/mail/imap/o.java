package com.sun.mail.imap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class o {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        boolean a(com.sun.mail.imap.g r1);
    }

    private o() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.sun.mail.imap.protocol.o[] a(javax.mail.Message[] r7, com.sun.mail.imap.o.a r8) {
            java.util.Vector r0 = new java.util.Vector
            r1 = 1
            r0.<init>(r1)
            r2 = 0
        L7:
            int r3 = r7.length
            if (r2 < r3) goto L1c
            boolean r7 = r0.isEmpty()
            if (r7 == 0) goto L12
            r7 = 0
            return r7
        L12:
            int r7 = r0.size()
            com.sun.mail.imap.protocol.o[] r7 = new com.sun.mail.imap.protocol.o[r7]
            r0.copyInto(r7)
            return r7
        L1c:
            r3 = r7[r2]
            com.sun.mail.imap.g r3 = (com.sun.mail.imap.g) r3
            boolean r4 = r3.isExpunged()
            if (r4 == 0) goto L27
            goto L66
        L27:
            int r4 = r3.w()
            if (r8 == 0) goto L34
            boolean r3 = r8.a(r3)
            if (r3 != 0) goto L34
            goto L66
        L34:
            com.sun.mail.imap.protocol.o r3 = new com.sun.mail.imap.protocol.o
            r3.<init>()
            r3.a = r4
        L3b:
            int r2 = r2 + 1
            int r5 = r7.length
            if (r2 < r5) goto L41
            goto L61
        L41:
            r5 = r7[r2]
            com.sun.mail.imap.g r5 = (com.sun.mail.imap.g) r5
            boolean r6 = r5.isExpunged()
            if (r6 == 0) goto L4c
            goto L3b
        L4c:
            int r6 = r5.w()
            if (r8 == 0) goto L59
            boolean r5 = r8.a(r5)
            if (r5 != 0) goto L59
            goto L3b
        L59:
            int r5 = r4 + 1
            if (r6 != r5) goto L5f
            r4 = r6
            goto L3b
        L5f:
            int r2 = r2 + (-1)
        L61:
            r3.b = r4
            r0.addElement(r3)
        L66:
            int r2 = r2 + r1
            goto L7
    }

    public static com.sun.mail.imap.protocol.w[] b(javax.mail.Message[] r11) {
            java.util.Vector r0 = new java.util.Vector
            r1 = 1
            r0.<init>(r1)
            r2 = 0
        L7:
            int r3 = r11.length
            if (r2 < r3) goto L1c
            boolean r11 = r0.isEmpty()
            if (r11 == 0) goto L12
            r11 = 0
            return r11
        L12:
            int r11 = r0.size()
            com.sun.mail.imap.protocol.w[] r11 = new com.sun.mail.imap.protocol.w[r11]
            r0.copyInto(r11)
            return r11
        L1c:
            r3 = r11[r2]
            com.sun.mail.imap.g r3 = (com.sun.mail.imap.g) r3
            boolean r4 = r3.isExpunged()
            if (r4 == 0) goto L27
            goto L57
        L27:
            long r3 = r3.x()
            com.sun.mail.imap.protocol.w r5 = new com.sun.mail.imap.protocol.w
            r5.<init>()
            r5.a = r3
        L32:
            int r2 = r2 + 1
            int r6 = r11.length
            if (r2 < r6) goto L38
            goto L52
        L38:
            r6 = r11[r2]
            com.sun.mail.imap.g r6 = (com.sun.mail.imap.g) r6
            boolean r7 = r6.isExpunged()
            if (r7 == 0) goto L43
            goto L32
        L43:
            long r6 = r6.x()
            r8 = 1
            long r8 = r8 + r3
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 != 0) goto L50
            r3 = r6
            goto L32
        L50:
            int r2 = r2 + (-1)
        L52:
            r5.b = r3
            r0.addElement(r5)
        L57:
            int r2 = r2 + r1
            goto L7
    }
}
