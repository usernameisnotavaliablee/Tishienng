package com.bytedance.pangle.tl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
class w extends java.security.cert.X509Certificate {
    private final java.security.cert.X509Certificate j;

    w(java.security.cert.X509Certificate r1) {
            r0 = this;
            r0.<init>()
            r0.j = r1
            return
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity() throws java.security.cert.CertificateExpiredException, java.security.cert.CertificateNotYetValidException {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.j
            r0.checkValidity()
            return
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity(java.util.Date r2) throws java.security.cert.CertificateExpiredException, java.security.cert.CertificateNotYetValidException {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.j
            r0.checkValidity(r2)
            return
    }

    @Override // java.security.cert.X509Certificate
    public int getBasicConstraints() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.j
            int r0 = r0.getBasicConstraints()
            return r0
    }

    @Override // java.security.cert.X509Extension
    public java.util.Set<java.lang.String> getCriticalExtensionOIDs() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.j
            java.util.Set r0 = r0.getCriticalExtensionOIDs()
            return r0
    }

    @Override // java.security.cert.Certificate
    public byte[] getEncoded() throws java.security.cert.CertificateEncodingException {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.j
            byte[] r0 = r0.getEncoded()
            return r0
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(java.lang.String r2) {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.j
            byte[] r2 = r0.getExtensionValue(r2)
            return r2
    }

    @Override // java.security.cert.X509Certificate
    public java.security.Principal getIssuerDN() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.j
            java.security.Principal r0 = r0.getIssuerDN()
            return r0
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getIssuerUniqueID() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.j
            boolean[] r0 = r0.getIssuerUniqueID()
            return r0
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getKeyUsage() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.j
            boolean[] r0 = r0.getKeyUsage()
            return r0
    }

    @Override // java.security.cert.X509Extension
    public java.util.Set<java.lang.String> getNonCriticalExtensionOIDs() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.j
            java.util.Set r0 = r0.getNonCriticalExtensionOIDs()
            return r0
    }

    @Override // java.security.cert.X509Certificate
    public java.util.Date getNotAfter() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.j
            java.util.Date r0 = r0.getNotAfter()
            return r0
    }

    @Override // java.security.cert.X509Certificate
    public java.util.Date getNotBefore() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.j
            java.util.Date r0 = r0.getNotBefore()
            return r0
    }

    @Override // java.security.cert.Certificate
    public java.security.PublicKey getPublicKey() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.j
            java.security.PublicKey r0 = r0.getPublicKey()
            return r0
    }

    @Override // java.security.cert.X509Certificate
    public java.math.BigInteger getSerialNumber() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.j
            java.math.BigInteger r0 = r0.getSerialNumber()
            return r0
    }

    @Override // java.security.cert.X509Certificate
    public java.lang.String getSigAlgName() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.j
            java.lang.String r0 = r0.getSigAlgName()
            return r0
    }

    @Override // java.security.cert.X509Certificate
    public java.lang.String getSigAlgOID() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.j
            java.lang.String r0 = r0.getSigAlgOID()
            return r0
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSigAlgParams() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.j
            byte[] r0 = r0.getSigAlgParams()
            return r0
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSignature() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.j
            byte[] r0 = r0.getSignature()
            return r0
    }

    @Override // java.security.cert.X509Certificate
    public java.security.Principal getSubjectDN() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.j
            java.security.Principal r0 = r0.getSubjectDN()
            return r0
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getSubjectUniqueID() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.j
            boolean[] r0 = r0.getSubjectUniqueID()
            return r0
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getTBSCertificate() throws java.security.cert.CertificateEncodingException {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.j
            byte[] r0 = r0.getTBSCertificate()
            return r0
    }

    @Override // java.security.cert.X509Certificate
    public int getVersion() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.j
            int r0 = r0.getVersion()
            return r0
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.j
            boolean r0 = r0.hasUnsupportedCriticalExtension()
            return r0
    }

    @Override // java.security.cert.Certificate
    public java.lang.String toString() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.j
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // java.security.cert.Certificate
    public void verify(java.security.PublicKey r2) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.NoSuchProviderException, java.security.SignatureException {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.j
            r0.verify(r2)
            return
    }

    @Override // java.security.cert.Certificate
    public void verify(java.security.PublicKey r2, java.lang.String r3) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.NoSuchProviderException, java.security.SignatureException {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.j
            r0.verify(r2, r3)
            return
    }
}
