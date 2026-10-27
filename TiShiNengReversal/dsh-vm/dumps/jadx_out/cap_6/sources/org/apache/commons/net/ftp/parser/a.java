package org.apache.commons.net.ftp.parser;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a extends org.apache.commons.net.ftp.g {
    private final org.apache.commons.net.ftp.f[] c;
    private org.apache.commons.net.ftp.f d;

    public a(org.apache.commons.net.ftp.f[] r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.d = r0
            r1.c = r2
            return
    }

    @Override // org.apache.commons.net.ftp.f
    public org.apache.commons.net.ftp.FTPFile a(java.lang.String r6) {
            r5 = this;
            org.apache.commons.net.ftp.f r0 = r5.d
            if (r0 == 0) goto Lb
            org.apache.commons.net.ftp.FTPFile r6 = r0.a(r6)
            if (r6 == 0) goto L1f
            return r6
        Lb:
            org.apache.commons.net.ftp.f[] r0 = r5.c
            int r1 = r0.length
            r2 = 0
        Lf:
            if (r2 >= r1) goto L1f
            r3 = r0[r2]
            org.apache.commons.net.ftp.FTPFile r4 = r3.a(r6)
            if (r4 == 0) goto L1c
            r5.d = r3
            return r4
        L1c:
            int r2 = r2 + 1
            goto Lf
        L1f:
            r6 = 0
            return r6
    }
}
