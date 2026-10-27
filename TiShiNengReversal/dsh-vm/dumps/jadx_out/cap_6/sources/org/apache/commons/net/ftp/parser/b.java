package org.apache.commons.net.ftp.parser;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class b extends org.apache.commons.net.ftp.parser.o implements org.apache.commons.net.ftp.a {
    private final org.apache.commons.net.ftp.parser.f f;

    public b(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            org.apache.commons.net.ftp.parser.g r1 = new org.apache.commons.net.ftp.parser.g
            r1.<init>()
            r0.f = r1
            return
    }

    public b(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            org.apache.commons.net.ftp.parser.g r1 = new org.apache.commons.net.ftp.parser.g
            r1.<init>()
            r0.f = r1
            return
    }

    @Override // org.apache.commons.net.ftp.a
    public void c(org.apache.commons.net.ftp.d r3) {
            r2 = this;
            org.apache.commons.net.ftp.parser.f r0 = r2.f
            boolean r0 = r0 instanceof org.apache.commons.net.ftp.a
            if (r0 == 0) goto L35
            org.apache.commons.net.ftp.d r0 = r2.l()
            if (r3 == 0) goto L2e
            java.lang.String r1 = r3.b()
            if (r1 != 0) goto L19
            java.lang.String r1 = r0.b()
            r3.l(r1)
        L19:
            java.lang.String r1 = r3.c()
            if (r1 != 0) goto L26
            java.lang.String r0 = r0.c()
            r3.n(r0)
        L26:
            org.apache.commons.net.ftp.parser.f r0 = r2.f
            org.apache.commons.net.ftp.a r0 = (org.apache.commons.net.ftp.a) r0
            r0.c(r3)
            return
        L2e:
            org.apache.commons.net.ftp.parser.f r3 = r2.f
            org.apache.commons.net.ftp.a r3 = (org.apache.commons.net.ftp.a) r3
            r3.c(r0)
        L35:
            return
    }

    protected abstract org.apache.commons.net.ftp.d l();

    public java.util.Calendar m(java.lang.String r2) throws java.text.ParseException {
            r1 = this;
            org.apache.commons.net.ftp.parser.f r0 = r1.f
            java.util.Calendar r2 = r0.a(r2)
            return r2
    }
}
