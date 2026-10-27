package com.bytedance.pangle.tl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
class av extends com.bytedance.pangle.tl.w {
    private final byte[] j;
    private int xt;

    av(java.security.cert.X509Certificate r1, byte[] r2) {
            r0 = this;
            r0.<init>(r1)
            r1 = -1
            r0.xt = r1
            r0.j = r2
            return
    }

    @Override // java.security.cert.Certificate
    public boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            boolean r0 = r3 instanceof com.bytedance.pangle.tl.av
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            byte[] r0 = r2.getEncoded()     // Catch: java.security.cert.CertificateEncodingException -> L19
            com.bytedance.pangle.tl.av r3 = (com.bytedance.pangle.tl.av) r3     // Catch: java.security.cert.CertificateEncodingException -> L19
            byte[] r3 = r3.getEncoded()     // Catch: java.security.cert.CertificateEncodingException -> L19
            boolean r3 = java.util.Arrays.equals(r0, r3)     // Catch: java.security.cert.CertificateEncodingException -> L19
            return r3
        L19:
            return r1
    }

    @Override // com.bytedance.pangle.tl.w, java.security.cert.Certificate
    public byte[] getEncoded() throws java.security.cert.CertificateEncodingException {
            r1 = this;
            byte[] r0 = r1.j
            return r0
    }

    @Override // java.security.cert.Certificate
    public int hashCode() {
            r2 = this;
            int r0 = r2.xt
            r1 = -1
            if (r0 != r1) goto L13
            byte[] r0 = r2.getEncoded()     // Catch: java.security.cert.CertificateEncodingException -> L10
            int r0 = java.util.Arrays.hashCode(r0)     // Catch: java.security.cert.CertificateEncodingException -> L10
            r2.xt = r0     // Catch: java.security.cert.CertificateEncodingException -> L10
            goto L13
        L10:
            r0 = 0
            r2.xt = r0
        L13:
            int r0 = r2.xt
            return r0
    }
}
