package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class OpenSslJavaxX509Certificate extends javax.security.cert.X509Certificate {
    private final byte[] bytes;
    private javax.security.cert.X509Certificate wrapped;

    OpenSslJavaxX509Certificate(byte[] r1) {
            r0 = this;
            r0.<init>()
            r0.bytes = r1
            return
    }

    private javax.security.cert.X509Certificate unwrap() {
            r2 = this;
            javax.security.cert.X509Certificate r0 = r2.wrapped
            if (r0 != 0) goto L14
            byte[] r0 = r2.bytes     // Catch: javax.security.cert.CertificateException -> Ld
            javax.security.cert.X509Certificate r0 = javax.security.cert.X509Certificate.getInstance(r0)     // Catch: javax.security.cert.CertificateException -> Ld
            r2.wrapped = r0     // Catch: javax.security.cert.CertificateException -> Ld
            return r0
        Ld:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L14:
            return r0
    }

    @Override // javax.security.cert.X509Certificate
    public void checkValidity() throws javax.security.cert.CertificateExpiredException, javax.security.cert.CertificateNotYetValidException {
            r1 = this;
            javax.security.cert.X509Certificate r0 = r1.unwrap()
            r0.checkValidity()
            return
    }

    @Override // javax.security.cert.X509Certificate
    public void checkValidity(java.util.Date r2) throws javax.security.cert.CertificateExpiredException, javax.security.cert.CertificateNotYetValidException {
            r1 = this;
            javax.security.cert.X509Certificate r0 = r1.unwrap()
            r0.checkValidity(r2)
            return
    }

    @Override // javax.security.cert.Certificate
    public byte[] getEncoded() {
            r1 = this;
            byte[] r0 = r1.bytes
            java.lang.Object r0 = r0.clone()
            byte[] r0 = (byte[]) r0
            return r0
    }

    @Override // javax.security.cert.X509Certificate
    public java.security.Principal getIssuerDN() {
            r1 = this;
            javax.security.cert.X509Certificate r0 = r1.unwrap()
            java.security.Principal r0 = r0.getIssuerDN()
            return r0
    }

    @Override // javax.security.cert.X509Certificate
    public java.util.Date getNotAfter() {
            r1 = this;
            javax.security.cert.X509Certificate r0 = r1.unwrap()
            java.util.Date r0 = r0.getNotAfter()
            return r0
    }

    @Override // javax.security.cert.X509Certificate
    public java.util.Date getNotBefore() {
            r1 = this;
            javax.security.cert.X509Certificate r0 = r1.unwrap()
            java.util.Date r0 = r0.getNotBefore()
            return r0
    }

    @Override // javax.security.cert.Certificate
    public java.security.PublicKey getPublicKey() {
            r1 = this;
            javax.security.cert.X509Certificate r0 = r1.unwrap()
            java.security.PublicKey r0 = r0.getPublicKey()
            return r0
    }

    @Override // javax.security.cert.X509Certificate
    public java.math.BigInteger getSerialNumber() {
            r1 = this;
            javax.security.cert.X509Certificate r0 = r1.unwrap()
            java.math.BigInteger r0 = r0.getSerialNumber()
            return r0
    }

    @Override // javax.security.cert.X509Certificate
    public java.lang.String getSigAlgName() {
            r1 = this;
            javax.security.cert.X509Certificate r0 = r1.unwrap()
            java.lang.String r0 = r0.getSigAlgName()
            return r0
    }

    @Override // javax.security.cert.X509Certificate
    public java.lang.String getSigAlgOID() {
            r1 = this;
            javax.security.cert.X509Certificate r0 = r1.unwrap()
            java.lang.String r0 = r0.getSigAlgOID()
            return r0
    }

    @Override // javax.security.cert.X509Certificate
    public byte[] getSigAlgParams() {
            r1 = this;
            javax.security.cert.X509Certificate r0 = r1.unwrap()
            byte[] r0 = r0.getSigAlgParams()
            return r0
    }

    @Override // javax.security.cert.X509Certificate
    public java.security.Principal getSubjectDN() {
            r1 = this;
            javax.security.cert.X509Certificate r0 = r1.unwrap()
            java.security.Principal r0 = r0.getSubjectDN()
            return r0
    }

    @Override // javax.security.cert.X509Certificate
    public int getVersion() {
            r1 = this;
            javax.security.cert.X509Certificate r0 = r1.unwrap()
            int r0 = r0.getVersion()
            return r0
    }

    @Override // javax.security.cert.Certificate
    public java.lang.String toString() {
            r1 = this;
            javax.security.cert.X509Certificate r0 = r1.unwrap()
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // javax.security.cert.Certificate
    public void verify(java.security.PublicKey r2) throws javax.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.NoSuchProviderException, java.security.SignatureException {
            r1 = this;
            javax.security.cert.X509Certificate r0 = r1.unwrap()
            r0.verify(r2)
            return
    }

    @Override // javax.security.cert.Certificate
    public void verify(java.security.PublicKey r2, java.lang.String r3) throws javax.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.NoSuchProviderException, java.security.SignatureException {
            r1 = this;
            javax.security.cert.X509Certificate r0 = r1.unwrap()
            r0.verify(r2, r3)
            return
    }
}
