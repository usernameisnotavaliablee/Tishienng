package io.netty.handler.ssl.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class OpenJdkSelfSignedCertGenerator {
    private OpenJdkSelfSignedCertGenerator() {
            r0 = this;
            r0.<init>()
            return
    }

    static java.lang.String[] generate(java.lang.String r8, java.security.KeyPair r9, java.security.SecureRandom r10, java.util.Date r11, java.util.Date r12) throws java.lang.Exception {
            java.lang.String r0 = "issuer"
            java.lang.String r1 = "subject"
            java.security.PrivateKey r2 = r9.getPrivate()
            sun.security.x509.X509CertInfo r3 = new sun.security.x509.X509CertInfo
            r3.<init>()
            sun.security.x509.X500Name r4 = new sun.security.x509.X500Name
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "CN="
            r5.append(r6)
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            sun.security.x509.CertificateVersion r5 = new sun.security.x509.CertificateVersion
            r6 = 2
            r5.<init>(r6)
            java.lang.String r6 = "version"
            r3.set(r6, r5)
            sun.security.x509.CertificateSerialNumber r5 = new sun.security.x509.CertificateSerialNumber
            java.math.BigInteger r6 = new java.math.BigInteger
            r7 = 64
            r6.<init>(r7, r10)
            r5.<init>(r6)
            java.lang.String r10 = "serialNumber"
            r3.set(r10, r5)
            sun.security.x509.CertificateSubjectName r10 = new sun.security.x509.CertificateSubjectName     // Catch: java.security.cert.CertificateException -> L48
            r10.<init>(r4)     // Catch: java.security.cert.CertificateException -> L48
            r3.set(r1, r10)     // Catch: java.security.cert.CertificateException -> L48
            goto L4b
        L48:
            r3.set(r1, r4)
        L4b:
            sun.security.x509.CertificateIssuerName r10 = new sun.security.x509.CertificateIssuerName     // Catch: java.security.cert.CertificateException -> L54
            r10.<init>(r4)     // Catch: java.security.cert.CertificateException -> L54
            r3.set(r0, r10)     // Catch: java.security.cert.CertificateException -> L54
            goto L57
        L54:
            r3.set(r0, r4)
        L57:
            sun.security.x509.CertificateValidity r10 = new sun.security.x509.CertificateValidity
            r10.<init>(r11, r12)
            java.lang.String r11 = "validity"
            r3.set(r11, r10)
            sun.security.x509.CertificateX509Key r10 = new sun.security.x509.CertificateX509Key
            java.security.PublicKey r11 = r9.getPublic()
            r10.<init>(r11)
            java.lang.String r11 = "key"
            r3.set(r11, r10)
            sun.security.x509.CertificateAlgorithmId r10 = new sun.security.x509.CertificateAlgorithmId
            sun.security.x509.AlgorithmId r11 = new sun.security.x509.AlgorithmId
            sun.security.util.ObjectIdentifier r12 = sun.security.x509.AlgorithmId.sha256WithRSAEncryption_oid
            r11.<init>(r12)
            r10.<init>(r11)
            java.lang.String r11 = "algorithmID"
            r3.set(r11, r10)
            sun.security.x509.X509CertImpl r10 = new sun.security.x509.X509CertImpl
            r10.<init>(r3)
            java.lang.String r11 = "SHA256withRSA"
            r10.sign(r2, r11)
            java.lang.String r12 = "x509.algorithm"
            java.lang.Object r10 = r10.get(r12)
            java.lang.String r12 = "algorithmID.algorithm"
            r3.set(r12, r10)
            sun.security.x509.X509CertImpl r10 = new sun.security.x509.X509CertImpl
            r10.<init>(r3)
            r10.sign(r2, r11)
            java.security.PublicKey r9 = r9.getPublic()
            r10.verify(r9)
            java.lang.String[] r8 = io.netty.handler.ssl.util.SelfSignedCertificate.newSelfSignedCertificate(r8, r2, r10)
            return r8
    }
}
