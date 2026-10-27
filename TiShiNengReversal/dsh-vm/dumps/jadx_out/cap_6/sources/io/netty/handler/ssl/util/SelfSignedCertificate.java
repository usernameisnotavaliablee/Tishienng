package io.netty.handler.ssl.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class SelfSignedCertificate {
    private static final int DEFAULT_KEY_LENGTH_BITS = 0;
    private static final java.util.Date DEFAULT_NOT_AFTER = null;
    private static final java.util.Date DEFAULT_NOT_BEFORE = null;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private final java.security.cert.X509Certificate cert;
    private final java.io.File certificate;
    private final java.security.PrivateKey key;
    private final java.io.File privateKey;

    static {
            java.lang.Class<io.netty.handler.ssl.util.SelfSignedCertificate> r0 = io.netty.handler.ssl.util.SelfSignedCertificate.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.handler.ssl.util.SelfSignedCertificate.logger = r0
            java.util.Date r0 = new java.util.Date
            long r1 = java.lang.System.currentTimeMillis()
            r3 = 31536000000(0x757b12c00, double:1.55808542072E-313)
            long r1 = r1 - r3
            java.lang.String r3 = "io.netty.selfSignedCertificate.defaultNotBefore"
            long r1 = io.netty.util.internal.SystemPropertyUtil.getLong(r3, r1)
            r0.<init>(r1)
            io.netty.handler.ssl.util.SelfSignedCertificate.DEFAULT_NOT_BEFORE = r0
            java.util.Date r0 = new java.util.Date
            java.lang.String r1 = "io.netty.selfSignedCertificate.defaultNotAfter"
            r2 = 253402300799000(0xe677d21fd818, double:1.25197371401916E-309)
            long r1 = io.netty.util.internal.SystemPropertyUtil.getLong(r1, r2)
            r0.<init>(r1)
            io.netty.handler.ssl.util.SelfSignedCertificate.DEFAULT_NOT_AFTER = r0
            java.lang.String r0 = "io.netty.handler.ssl.util.selfSignedKeyStrength"
            r1 = 2048(0x800, float:2.87E-42)
            int r0 = io.netty.util.internal.SystemPropertyUtil.getInt(r0, r1)
            io.netty.handler.ssl.util.SelfSignedCertificate.DEFAULT_KEY_LENGTH_BITS = r0
            return
    }

    public SelfSignedCertificate() throws java.security.cert.CertificateException {
            r2 = this;
            java.util.Date r0 = io.netty.handler.ssl.util.SelfSignedCertificate.DEFAULT_NOT_BEFORE
            java.util.Date r1 = io.netty.handler.ssl.util.SelfSignedCertificate.DEFAULT_NOT_AFTER
            r2.<init>(r0, r1)
            return
    }

    public SelfSignedCertificate(java.lang.String r3) throws java.security.cert.CertificateException {
            r2 = this;
            java.util.Date r0 = io.netty.handler.ssl.util.SelfSignedCertificate.DEFAULT_NOT_BEFORE
            java.util.Date r1 = io.netty.handler.ssl.util.SelfSignedCertificate.DEFAULT_NOT_AFTER
            r2.<init>(r3, r0, r1)
            return
    }

    public SelfSignedCertificate(java.lang.String r7, java.security.SecureRandom r8, int r9) throws java.security.cert.CertificateException {
            r6 = this;
            java.util.Date r4 = io.netty.handler.ssl.util.SelfSignedCertificate.DEFAULT_NOT_BEFORE
            java.util.Date r5 = io.netty.handler.ssl.util.SelfSignedCertificate.DEFAULT_NOT_AFTER
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public SelfSignedCertificate(java.lang.String r5, java.security.SecureRandom r6, int r7, java.util.Date r8, java.util.Date r9) throws java.security.cert.CertificateException {
            r4 = this;
            java.lang.String r0 = "Failed to close a file: "
            r4.<init>()
            java.lang.String r1 = "RSA"
            java.security.KeyPairGenerator r1 = java.security.KeyPairGenerator.getInstance(r1)     // Catch: java.security.NoSuchAlgorithmException -> Lbc
            r1.initialize(r7, r6)     // Catch: java.security.NoSuchAlgorithmException -> Lbc
            java.security.KeyPair r7 = r1.generateKeyPair()     // Catch: java.security.NoSuchAlgorithmException -> Lbc
            java.lang.String[] r5 = io.netty.handler.ssl.util.OpenJdkSelfSignedCertGenerator.generate(r5, r7, r6, r8, r9)     // Catch: java.lang.Throwable -> L17
            goto L23
        L17:
            r1 = move-exception
            io.netty.util.internal.logging.InternalLogger r2 = io.netty.handler.ssl.util.SelfSignedCertificate.logger
            java.lang.String r3 = "Failed to generate a self-signed X.509 certificate using sun.security.x509:"
            r2.debug(r3, r1)
            java.lang.String[] r5 = io.netty.handler.ssl.util.BouncyCastleSelfSignedCertGenerator.generate(r5, r7, r6, r8, r9)     // Catch: java.lang.Throwable -> Lac
        L23:
            java.io.File r6 = new java.io.File
            r8 = 0
            r8 = r5[r8]
            r6.<init>(r8)
            r4.certificate = r6
            java.io.File r8 = new java.io.File
            r9 = 1
            r5 = r5[r9]
            r8.<init>(r5)
            r4.privateKey = r8
            java.security.PrivateKey r5 = r7.getPrivate()
            r4.key = r5
            r5 = 0
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L79 java.lang.Exception -> L7d
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L79 java.lang.Exception -> L7d
            java.lang.String r5 = "X509"
            java.security.cert.CertificateFactory r5 = java.security.cert.CertificateFactory.getInstance(r5)     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L77
            java.security.cert.Certificate r5 = r5.generateCertificate(r7)     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L77
            java.security.cert.X509Certificate r5 = (java.security.cert.X509Certificate) r5     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L77
            r4.cert = r5     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L77
            r7.close()     // Catch: java.io.IOException -> L55
            goto L74
        L55:
            r5 = move-exception
            io.netty.util.internal.logging.InternalLogger r6 = io.netty.handler.ssl.util.SelfSignedCertificate.logger
            boolean r6 = r6.isWarnEnabled()
            if (r6 == 0) goto L74
            io.netty.util.internal.logging.InternalLogger r6 = io.netty.handler.ssl.util.SelfSignedCertificate.logger
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            java.io.File r8 = r4.certificate
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.warn(r7, r5)
        L74:
            return
        L75:
            r5 = move-exception
            goto L86
        L77:
            r5 = move-exception
            goto L80
        L79:
            r6 = move-exception
            r7 = r5
            r5 = r6
            goto L86
        L7d:
            r6 = move-exception
            r7 = r5
            r5 = r6
        L80:
            java.security.cert.CertificateEncodingException r6 = new java.security.cert.CertificateEncodingException     // Catch: java.lang.Throwable -> L75
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L75
            throw r6     // Catch: java.lang.Throwable -> L75
        L86:
            if (r7 == 0) goto Lab
            r7.close()     // Catch: java.io.IOException -> L8c
            goto Lab
        L8c:
            r6 = move-exception
            io.netty.util.internal.logging.InternalLogger r7 = io.netty.handler.ssl.util.SelfSignedCertificate.logger
            boolean r7 = r7.isWarnEnabled()
            if (r7 == 0) goto Lab
            io.netty.util.internal.logging.InternalLogger r7 = io.netty.handler.ssl.util.SelfSignedCertificate.logger
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r0)
            java.io.File r9 = r4.certificate
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.warn(r8, r6)
        Lab:
            throw r5
        Lac:
            r5 = move-exception
            io.netty.util.internal.logging.InternalLogger r6 = io.netty.handler.ssl.util.SelfSignedCertificate.logger
            java.lang.String r7 = "Failed to generate a self-signed X.509 certificate using Bouncy Castle:"
            r6.debug(r7, r5)
            java.security.cert.CertificateException r6 = new java.security.cert.CertificateException
            java.lang.String r7 = "No provider succeeded to generate a self-signed certificate. See debug log for the root cause."
            r6.<init>(r7, r5)
            throw r6
        Lbc:
            r5 = move-exception
            java.lang.Error r6 = new java.lang.Error
            r6.<init>(r5)
            throw r6
    }

    public SelfSignedCertificate(java.lang.String r7, java.util.Date r8, java.util.Date r9) throws java.security.cert.CertificateException {
            r6 = this;
            java.security.SecureRandom r2 = io.netty.handler.ssl.util.ThreadLocalInsecureRandom.current()
            int r3 = io.netty.handler.ssl.util.SelfSignedCertificate.DEFAULT_KEY_LENGTH_BITS
            r0 = r6
            r1 = r7
            r4 = r8
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public SelfSignedCertificate(java.util.Date r2, java.util.Date r3) throws java.security.cert.CertificateException {
            r1 = this;
            java.lang.String r0 = "example.com"
            r1.<init>(r0, r2, r3)
            return
    }

    static java.lang.String[] newSelfSignedCertificate(java.lang.String r6, java.security.PrivateKey r7, java.security.cert.X509Certificate r8) throws java.io.IOException, java.security.cert.CertificateEncodingException {
            byte[] r7 = r7.getEncoded()
            io.netty.buffer.ByteBuf r7 = io.netty.buffer.Unpooled.wrappedBuffer(r7)
            r0 = 1
            io.netty.buffer.ByteBuf r1 = io.netty.handler.codec.base64.Base64.encode(r7, r0)     // Catch: java.lang.Throwable -> Lde
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le0
            r2.<init>()     // Catch: java.lang.Throwable -> Le0
            java.lang.String r3 = "-----BEGIN PRIVATE KEY-----\n"
            r2.append(r3)     // Catch: java.lang.Throwable -> Le0
            java.nio.charset.Charset r3 = io.netty.util.CharsetUtil.US_ASCII     // Catch: java.lang.Throwable -> Le0
            java.lang.String r4 = r1.toString(r3)     // Catch: java.lang.Throwable -> Le0
            r2.append(r4)     // Catch: java.lang.Throwable -> Le0
            java.lang.String r4 = "\n-----END PRIVATE KEY-----\n"
            r2.append(r4)     // Catch: java.lang.Throwable -> Le0
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Le0
            r1.release()     // Catch: java.lang.Throwable -> Lde
            r7.release()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = "keyutil_"
            r7.append(r1)
            r7.append(r6)
            r4 = 95
            r7.append(r4)
            java.lang.String r7 = r7.toString()
            java.lang.String r5 = ".key"
            java.io.File r7 = java.io.File.createTempFile(r7, r5)
            r7.deleteOnExit()
            java.io.FileOutputStream r5 = new java.io.FileOutputStream
            r5.<init>(r7)
            byte[] r2 = r2.getBytes(r3)     // Catch: java.lang.Throwable -> Ld6
            r5.write(r2)     // Catch: java.lang.Throwable -> Ld6
            r5.close()     // Catch: java.lang.Throwable -> Ld6
            byte[] r8 = r8.getEncoded()
            io.netty.buffer.ByteBuf r8 = io.netty.buffer.Unpooled.wrappedBuffer(r8)
            io.netty.buffer.ByteBuf r0 = io.netty.handler.codec.base64.Base64.encode(r8, r0)     // Catch: java.lang.Throwable -> Lcb
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcd
            r2.<init>()     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r5 = "-----BEGIN CERTIFICATE-----\n"
            r2.append(r5)     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r5 = r0.toString(r3)     // Catch: java.lang.Throwable -> Lcd
            r2.append(r5)     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r5 = "\n-----END CERTIFICATE-----\n"
            r2.append(r5)     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lcd
            r0.release()     // Catch: java.lang.Throwable -> Lcb
            r8.release()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r1)
            r8.append(r6)
            r8.append(r4)
            java.lang.String r6 = r8.toString()
            java.lang.String r8 = ".crt"
            java.io.File r6 = java.io.File.createTempFile(r6, r8)
            r6.deleteOnExit()
            java.io.FileOutputStream r8 = new java.io.FileOutputStream
            r8.<init>(r6)
            byte[] r0 = r2.getBytes(r3)     // Catch: java.lang.Throwable -> Lc0
            r8.write(r0)     // Catch: java.lang.Throwable -> Lc0
            r8.close()     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r6 = r6.getPath()
            java.lang.String r7 = r7.getPath()
            java.lang.String[] r6 = new java.lang.String[]{r6, r7}
            return r6
        Lc0:
            r0 = move-exception
            safeClose(r6, r8)
            safeDelete(r6)
            safeDelete(r7)
            throw r0
        Lcb:
            r6 = move-exception
            goto Ld2
        Lcd:
            r6 = move-exception
            r0.release()     // Catch: java.lang.Throwable -> Lcb
            throw r6     // Catch: java.lang.Throwable -> Lcb
        Ld2:
            r8.release()
            throw r6
        Ld6:
            r6 = move-exception
            safeClose(r7, r5)
            safeDelete(r7)
            throw r6
        Lde:
            r6 = move-exception
            goto Le5
        Le0:
            r6 = move-exception
            r1.release()     // Catch: java.lang.Throwable -> Lde
            throw r6     // Catch: java.lang.Throwable -> Lde
        Le5:
            r7.release()
            throw r6
    }

    private static void safeClose(java.io.File r3, java.io.OutputStream r4) {
            r4.close()     // Catch: java.io.IOException -> L4
            return
        L4:
            r4 = move-exception
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.handler.ssl.util.SelfSignedCertificate.logger
            boolean r0 = r0.isWarnEnabled()
            if (r0 == 0) goto L23
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.handler.ssl.util.SelfSignedCertificate.logger
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to close a file: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.warn(r3, r4)
        L23:
            return
    }

    private static void safeDelete(java.io.File r3) {
            boolean r0 = r3.delete()
            if (r0 != 0) goto L22
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.handler.ssl.util.SelfSignedCertificate.logger
            boolean r1 = r0.isWarnEnabled()
            if (r1 == 0) goto L22
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to delete a file: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.warn(r3)
        L22:
            return
    }

    public java.security.cert.X509Certificate cert() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.cert
            return r0
    }

    public java.io.File certificate() {
            r1 = this;
            java.io.File r0 = r1.certificate
            return r0
    }

    public void delete() {
            r1 = this;
            java.io.File r0 = r1.certificate
            safeDelete(r0)
            java.io.File r0 = r1.privateKey
            safeDelete(r0)
            return
    }

    public java.security.PrivateKey key() {
            r1 = this;
            java.security.PrivateKey r0 = r1.key
            return r0
    }

    public java.io.File privateKey() {
            r1 = this;
            java.io.File r0 = r1.privateKey
            return r0
    }
}
