package com.sun.mail.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class QDecoderStream extends com.sun.mail.util.QPDecoderStream {
    public QDecoderStream(java.io.InputStream r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.sun.mail.util.QPDecoderStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws java.io.IOException {
            r4 = this;
            java.io.InputStream r0 = r4.in
            int r0 = r0.read()
            r1 = 95
            if (r0 != r1) goto Ld
            r0 = 32
            return r0
        Ld:
            r1 = 61
            if (r0 != r1) goto L4c
            byte[] r0 = r4.ba
            java.io.InputStream r1 = r4.in
            int r1 = r1.read()
            byte r1 = (byte) r1
            r2 = 0
            r0[r2] = r1
            byte[] r0 = r4.ba
            java.io.InputStream r1 = r4.in
            int r1 = r1.read()
            byte r1 = (byte) r1
            r3 = 1
            r0[r3] = r1
            byte[] r0 = r4.ba     // Catch: java.lang.NumberFormatException -> L33
            r1 = 2
            r3 = 16
            int r0 = com.sun.mail.util.ASCIIUtility.parseInt(r0, r2, r1, r3)     // Catch: java.lang.NumberFormatException -> L33
            return r0
        L33:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Error in QP stream "
            r2.<init>(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L4c:
            return r0
    }
}
