package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class OpenSslX509Certificate extends java.security.cert.X509Certificate {
    private final byte[] bytes;
    private java.security.cert.X509Certificate wrapped;

    OpenSslX509Certificate(byte[] r1) {
            r0 = this;
            r0.<init>()
            r0.bytes = r1
            return
    }

    private java.security.cert.X509Certificate unwrap() {
            r3 = this;
            java.security.cert.X509Certificate r0 = r3.wrapped
            if (r0 != 0) goto L1d
            java.security.cert.CertificateFactory r0 = io.netty.handler.ssl.SslContext.X509_CERT_FACTORY     // Catch: java.security.cert.CertificateException -> L16
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch: java.security.cert.CertificateException -> L16
            byte[] r2 = r3.bytes     // Catch: java.security.cert.CertificateException -> L16
            r1.<init>(r2)     // Catch: java.security.cert.CertificateException -> L16
            java.security.cert.Certificate r0 = r0.generateCertificate(r1)     // Catch: java.security.cert.CertificateException -> L16
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0     // Catch: java.security.cert.CertificateException -> L16
            r3.wrapped = r0     // Catch: java.security.cert.CertificateException -> L16
            return r0
        L16:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L1d:
            return r0
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity() throws java.security.cert.CertificateExpiredException, java.security.cert.CertificateNotYetValidException {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.unwrap()
            r0.checkValidity()
            return
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity(java.util.Date r2) throws java.security.cert.CertificateExpiredException, java.security.cert.CertificateNotYetValidException {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.unwrap()
            r0.checkValidity(r2)
            return
    }

    @Override // java.security.cert.X509Certificate
    public int getBasicConstraints() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.unwrap()
            int r0 = r0.getBasicConstraints()
            return r0
    }

    @Override // java.security.cert.X509Extension
    public java.util.Set<java.lang.String> getCriticalExtensionOIDs() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.unwrap()
            java.util.Set r0 = r0.getCriticalExtensionOIDs()
            return r0
    }

    @Override // java.security.cert.Certificate
    public byte[] getEncoded() {
            r1 = this;
            byte[] r0 = r1.bytes
            java.lang.Object r0 = r0.clone()
            byte[] r0 = (byte[]) r0
            return r0
    }

    @Override // java.security.cert.X509Certificate
    public java.util.List<java.lang.String> getExtendedKeyUsage() throws java.security.cert.CertificateParsingException {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.unwrap()
            java.util.List r0 = r0.getExtendedKeyUsage()
            return r0
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(java.lang.String r2) {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.unwrap()
            byte[] r2 = r0.getExtensionValue(r2)
            return r2
    }

    @Override // java.security.cert.X509Certificate
    public java.util.Collection<java.util.List<?>> getIssuerAlternativeNames() throws java.security.cert.CertificateParsingException {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.unwrap()
            java.util.Collection r0 = r0.getSubjectAlternativeNames()
            return r0
    }

    @Override // java.security.cert.X509Certificate
    public java.security.Principal getIssuerDN() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.unwrap()
            java.security.Principal r0 = r0.getIssuerDN()
            return r0
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getIssuerUniqueID() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.unwrap()
            boolean[] r0 = r0.getIssuerUniqueID()
            return r0
    }

    @Override // java.security.cert.X509Certificate
    public javax.security.auth.x500.X500Principal getIssuerX500Principal() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.unwrap()
            javax.security.auth.x500.X500Principal r0 = r0.getIssuerX500Principal()
            return r0
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getKeyUsage() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.unwrap()
            boolean[] r0 = r0.getKeyUsage()
            return r0
    }

    @Override // java.security.cert.X509Extension
    public java.util.Set<java.lang.String> getNonCriticalExtensionOIDs() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.unwrap()
            java.util.Set r0 = r0.getNonCriticalExtensionOIDs()
            return r0
    }

    @Override // java.security.cert.X509Certificate
    public java.util.Date getNotAfter() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.unwrap()
            java.util.Date r0 = r0.getNotAfter()
            return r0
    }

    @Override // java.security.cert.X509Certificate
    public java.util.Date getNotBefore() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.unwrap()
            java.util.Date r0 = r0.getNotBefore()
            return r0
    }

    @Override // java.security.cert.Certificate
    public java.security.PublicKey getPublicKey() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.unwrap()
            java.security.PublicKey r0 = r0.getPublicKey()
            return r0
    }

    @Override // java.security.cert.X509Certificate
    public java.math.BigInteger getSerialNumber() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.unwrap()
            java.math.BigInteger r0 = r0.getSerialNumber()
            return r0
    }

    @Override // java.security.cert.X509Certificate
    public java.lang.String getSigAlgName() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.unwrap()
            java.lang.String r0 = r0.getSigAlgName()
            return r0
    }

    @Override // java.security.cert.X509Certificate
    public java.lang.String getSigAlgOID() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.unwrap()
            java.lang.String r0 = r0.getSigAlgOID()
            return r0
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSigAlgParams() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.unwrap()
            byte[] r0 = r0.getSigAlgParams()
            return r0
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSignature() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.unwrap()
            byte[] r0 = r0.getSignature()
            return r0
    }

    @Override // java.security.cert.X509Certificate
    public java.util.Collection<java.util.List<?>> getSubjectAlternativeNames() throws java.security.cert.CertificateParsingException {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.unwrap()
            java.util.Collection r0 = r0.getSubjectAlternativeNames()
            return r0
    }

    @Override // java.security.cert.X509Certificate
    public java.security.Principal getSubjectDN() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.unwrap()
            java.security.Principal r0 = r0.getSubjectDN()
            return r0
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getSubjectUniqueID() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.unwrap()
            boolean[] r0 = r0.getSubjectUniqueID()
            return r0
    }

    @Override // java.security.cert.X509Certificate
    public javax.security.auth.x500.X500Principal getSubjectX500Principal() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.unwrap()
            javax.security.auth.x500.X500Principal r0 = r0.getSubjectX500Principal()
            return r0
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getTBSCertificate() throws java.security.cert.CertificateEncodingException {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.unwrap()
            byte[] r0 = r0.getTBSCertificate()
            return r0
    }

    @Override // java.security.cert.X509Certificate
    public int getVersion() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.unwrap()
            int r0 = r0.getVersion()
            return r0
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.unwrap()
            boolean r0 = r0.hasUnsupportedCriticalExtension()
            return r0
    }

    @Override // java.security.cert.Certificate
    public java.lang.String toString() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.unwrap()
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // java.security.cert.Certificate
    public void verify(java.security.PublicKey r2) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.NoSuchProviderException, java.security.SignatureException {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.unwrap()
            r0.verify(r2)
            return
    }

    @Override // java.security.cert.Certificate
    public void verify(java.security.PublicKey r2, java.lang.String r3) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.NoSuchProviderException, java.security.SignatureException {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.unwrap()
            r0.verify(r2, r3)
            return
    }

    @Override // java.security.cert.X509Certificate, java.security.cert.Certificate
    public void verify(java.security.PublicKey r2, java.security.Provider r3) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.SignatureException {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.unwrap()
            io.netty.handler.ssl.x.a(r0, r2, r3)
            return
    }
}
