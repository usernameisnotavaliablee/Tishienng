package io.netty.handler.ssl.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class BouncyCastleSelfSignedCertGenerator {
    private static final java.security.Provider PROVIDER = null;

    static {
            org.bouncycastle.jce.provider.BouncyCastleProvider r0 = new org.bouncycastle.jce.provider.BouncyCastleProvider
            r0.<init>()
            io.netty.handler.ssl.util.BouncyCastleSelfSignedCertGenerator.PROVIDER = r0
            return
    }

    private BouncyCastleSelfSignedCertGenerator() {
            r0 = this;
            r0.<init>()
            return
    }

    static java.lang.String[] generate(java.lang.String r8, java.security.KeyPair r9, java.security.SecureRandom r10, java.util.Date r11, java.util.Date r12) throws java.lang.Exception {
            java.security.PrivateKey r0 = r9.getPrivate()
            org.bouncycastle.asn1.x500.X500Name r2 = new org.bouncycastle.asn1.x500.X500Name
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "CN="
            r1.append(r3)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            org.bouncycastle.cert.jcajce.JcaX509v3CertificateBuilder r1 = new org.bouncycastle.cert.jcajce.JcaX509v3CertificateBuilder
            java.math.BigInteger r3 = new java.math.BigInteger
            r4 = 64
            r3.<init>(r4, r10)
            java.security.PublicKey r7 = r9.getPublic()
            r6 = r2
            r4 = r11
            r5 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7)
            org.bouncycastle.operator.jcajce.JcaContentSignerBuilder r10 = new org.bouncycastle.operator.jcajce.JcaContentSignerBuilder
            java.lang.String r11 = "SHA256WithRSAEncryption"
            r10.<init>(r11)
            org.bouncycastle.operator.ContentSigner r10 = r10.build(r0)
            org.bouncycastle.cert.X509CertificateHolder r10 = r1.build(r10)
            org.bouncycastle.cert.jcajce.JcaX509CertificateConverter r11 = new org.bouncycastle.cert.jcajce.JcaX509CertificateConverter
            r11.<init>()
            java.security.Provider r12 = io.netty.handler.ssl.util.BouncyCastleSelfSignedCertGenerator.PROVIDER
            org.bouncycastle.cert.jcajce.JcaX509CertificateConverter r11 = r11.setProvider(r12)
            java.security.cert.X509Certificate r10 = r11.getCertificate(r10)
            java.security.PublicKey r9 = r9.getPublic()
            r10.verify(r9)
            java.lang.String[] r8 = io.netty.handler.ssl.util.SelfSignedCertificate.newSelfSignedCertificate(r8, r0, r10)
            return r8
    }
}
