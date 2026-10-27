package com.sun.mail.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class LineOutputStream extends java.io.FilterOutputStream {
    private static byte[] newline;

    static {
            r0 = 2
            byte[] r0 = new byte[r0]
            com.sun.mail.util.LineOutputStream.newline = r0
            r1 = 0
            r2 = 13
            r0[r1] = r2
            r1 = 1
            r2 = 10
            r0[r1] = r2
            return
    }

    public LineOutputStream(java.io.OutputStream r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public void writeln() throws javax.mail.MessagingException {
            r3 = this;
            java.io.OutputStream r0 = r3.out     // Catch: java.lang.Exception -> L8
            byte[] r1 = com.sun.mail.util.LineOutputStream.newline     // Catch: java.lang.Exception -> L8
            r0.write(r1)     // Catch: java.lang.Exception -> L8
            return
        L8:
            r0 = move-exception
            javax.mail.MessagingException r1 = new javax.mail.MessagingException
            java.lang.String r2 = "IOException"
            r1.<init>(r2, r0)
            throw r1
    }

    public void writeln(java.lang.String r3) throws javax.mail.MessagingException {
            r2 = this;
            byte[] r3 = com.sun.mail.util.ASCIIUtility.getBytes(r3)     // Catch: java.lang.Exception -> L11
            java.io.OutputStream r0 = r2.out     // Catch: java.lang.Exception -> L11
            r0.write(r3)     // Catch: java.lang.Exception -> L11
            java.io.OutputStream r3 = r2.out     // Catch: java.lang.Exception -> L11
            byte[] r0 = com.sun.mail.util.LineOutputStream.newline     // Catch: java.lang.Exception -> L11
            r3.write(r0)     // Catch: java.lang.Exception -> L11
            return
        L11:
            r3 = move-exception
            javax.mail.MessagingException r0 = new javax.mail.MessagingException
            java.lang.String r1 = "IOException"
            r0.<init>(r1, r3)
            throw r0
    }
}
