package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class SslContext {
    static final java.lang.String ALIAS = "key";
    static final java.security.cert.CertificateFactory X509_CERT_FACTORY = null;
    private final boolean startTls;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.ssl.SslContext$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$ssl$SslProvider = null;

        static {
                io.netty.handler.ssl.SslProvider[] r0 = io.netty.handler.ssl.SslProvider.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.handler.ssl.SslContext.AnonymousClass1.$SwitchMap$io$netty$handler$ssl$SslProvider = r0
                io.netty.handler.ssl.SslProvider r1 = io.netty.handler.ssl.SslProvider.JDK     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.handler.ssl.SslContext.AnonymousClass1.$SwitchMap$io$netty$handler$ssl$SslProvider     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.handler.ssl.SslProvider r1 = io.netty.handler.ssl.SslProvider.OPENSSL     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = io.netty.handler.ssl.SslContext.AnonymousClass1.$SwitchMap$io$netty$handler$ssl$SslProvider     // Catch: java.lang.NoSuchFieldError -> L28
                io.netty.handler.ssl.SslProvider r1 = io.netty.handler.ssl.SslProvider.OPENSSL_REFCNT     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    static {
            java.lang.String r0 = "X.509"
            java.security.cert.CertificateFactory r0 = java.security.cert.CertificateFactory.getInstance(r0)     // Catch: java.security.cert.CertificateException -> L9
            io.netty.handler.ssl.SslContext.X509_CERT_FACTORY = r0     // Catch: java.security.cert.CertificateException -> L9
            return
        L9:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "unable to instance X.509 CertificateFactory"
            r1.<init>(r2, r0)
            throw r1
    }

    protected SslContext() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    protected SslContext(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.startTls = r1
            return
    }

    static javax.net.ssl.KeyManagerFactory buildKeyManagerFactory(java.security.KeyStore r0, java.lang.String r1, char[] r2, javax.net.ssl.KeyManagerFactory r3) throws java.security.KeyStoreException, java.security.NoSuchAlgorithmException, java.security.UnrecoverableKeyException {
            if (r3 != 0) goto L6
            javax.net.ssl.KeyManagerFactory r3 = javax.net.ssl.KeyManagerFactory.getInstance(r1)
        L6:
            r3.init(r0, r2)
            return r3
    }

    static javax.net.ssl.KeyManagerFactory buildKeyManagerFactory(java.security.cert.X509Certificate[] r1, java.lang.String r2, java.security.PrivateKey r3, java.lang.String r4, javax.net.ssl.KeyManagerFactory r5) throws java.security.KeyStoreException, java.security.NoSuchAlgorithmException, java.io.IOException, java.security.cert.CertificateException, java.security.UnrecoverableKeyException {
            char[] r4 = keyStorePassword(r4)
            java.lang.String r0 = java.security.KeyStore.getDefaultType()
            java.security.KeyStore r1 = buildKeyStore(r1, r3, r4, r0)
            javax.net.ssl.KeyManagerFactory r1 = buildKeyManagerFactory(r1, r2, r4, r5)
            return r1
    }

    static javax.net.ssl.KeyManagerFactory buildKeyManagerFactory(java.security.cert.X509Certificate[] r0, java.lang.String r1, java.security.PrivateKey r2, java.lang.String r3, javax.net.ssl.KeyManagerFactory r4, java.lang.String r5) throws java.security.KeyStoreException, java.security.NoSuchAlgorithmException, java.io.IOException, java.security.cert.CertificateException, java.security.UnrecoverableKeyException {
            char[] r3 = keyStorePassword(r3)
            java.security.KeyStore r0 = buildKeyStore(r0, r2, r3, r5)
            javax.net.ssl.KeyManagerFactory r0 = buildKeyManagerFactory(r0, r1, r3, r4)
            return r0
    }

    static javax.net.ssl.KeyManagerFactory buildKeyManagerFactory(java.security.cert.X509Certificate[] r6, java.security.PrivateKey r7, java.lang.String r8, javax.net.ssl.KeyManagerFactory r9, java.lang.String r10) throws java.security.UnrecoverableKeyException, java.security.KeyStoreException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException, java.io.IOException {
            java.lang.String r1 = javax.net.ssl.KeyManagerFactory.getDefaultAlgorithm()
            r0 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            javax.net.ssl.KeyManagerFactory r6 = buildKeyManagerFactory(r0, r1, r2, r3, r4, r5)
            return r6
    }

    static java.security.KeyStore buildKeyStore(java.security.cert.X509Certificate[] r1, java.security.PrivateKey r2, char[] r3, java.lang.String r4) throws java.security.KeyStoreException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException, java.io.IOException {
            if (r4 != 0) goto L6
            java.lang.String r4 = java.security.KeyStore.getDefaultType()
        L6:
            java.security.KeyStore r4 = java.security.KeyStore.getInstance(r4)
            r0 = 0
            r4.load(r0, r0)
            java.lang.String r0 = "key"
            r4.setKeyEntry(r0, r2, r3, r1)
            return r4
    }

    @java.lang.Deprecated
    protected static javax.net.ssl.TrustManagerFactory buildTrustManagerFactory(java.io.File r1, javax.net.ssl.TrustManagerFactory r2) throws java.security.NoSuchAlgorithmException, java.security.cert.CertificateException, java.security.KeyStoreException, java.io.IOException {
            java.lang.String r0 = java.security.KeyStore.getDefaultType()
            javax.net.ssl.TrustManagerFactory r1 = buildTrustManagerFactory(r1, r2, r0)
            return r1
    }

    static javax.net.ssl.TrustManagerFactory buildTrustManagerFactory(java.io.File r0, javax.net.ssl.TrustManagerFactory r1, java.lang.String r2) throws java.security.NoSuchAlgorithmException, java.security.cert.CertificateException, java.security.KeyStoreException, java.io.IOException {
            java.security.cert.X509Certificate[] r0 = toX509Certificates(r0)
            javax.net.ssl.TrustManagerFactory r0 = buildTrustManagerFactory(r0, r1, r2)
            return r0
    }

    static javax.net.ssl.TrustManagerFactory buildTrustManagerFactory(java.security.cert.X509Certificate[] r6, javax.net.ssl.TrustManagerFactory r7, java.lang.String r8) throws java.security.NoSuchAlgorithmException, java.security.cert.CertificateException, java.security.KeyStoreException, java.io.IOException {
            if (r8 != 0) goto L6
            java.lang.String r8 = java.security.KeyStore.getDefaultType()
        L6:
            java.security.KeyStore r8 = java.security.KeyStore.getInstance(r8)
            r0 = 0
            r8.load(r0, r0)
            int r0 = r6.length
            r1 = 1
            r2 = 0
            r3 = 1
        L12:
            if (r2 >= r0) goto L21
            r4 = r6[r2]
            java.lang.String r5 = java.lang.Integer.toString(r3)
            r8.setCertificateEntry(r5, r4)
            int r3 = r3 + r1
            int r2 = r2 + 1
            goto L12
        L21:
            if (r7 != 0) goto L2b
            java.lang.String r6 = javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm()
            javax.net.ssl.TrustManagerFactory r7 = javax.net.ssl.TrustManagerFactory.getInstance(r6)
        L2b:
            r7.init(r8)
            return r7
    }

    public static io.netty.handler.ssl.SslProvider defaultClientProvider() {
            io.netty.handler.ssl.SslProvider r0 = defaultProvider()
            return r0
    }

    private static io.netty.handler.ssl.SslProvider defaultProvider() {
            boolean r0 = io.netty.handler.ssl.OpenSsl.isAvailable()
            if (r0 == 0) goto L9
            io.netty.handler.ssl.SslProvider r0 = io.netty.handler.ssl.SslProvider.OPENSSL
            return r0
        L9:
            io.netty.handler.ssl.SslProvider r0 = io.netty.handler.ssl.SslProvider.JDK
            return r0
    }

    public static io.netty.handler.ssl.SslProvider defaultServerProvider() {
            io.netty.handler.ssl.SslProvider r0 = defaultProvider()
            return r0
    }

    protected static java.security.spec.PKCS8EncodedKeySpec generateKeySpec(char[] r3, byte[] r4) throws java.io.IOException, java.security.NoSuchAlgorithmException, javax.crypto.NoSuchPaddingException, java.security.spec.InvalidKeySpecException, java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
            if (r3 != 0) goto L8
            java.security.spec.PKCS8EncodedKeySpec r3 = new java.security.spec.PKCS8EncodedKeySpec
            r3.<init>(r4)
            return r3
        L8:
            javax.crypto.EncryptedPrivateKeyInfo r0 = new javax.crypto.EncryptedPrivateKeyInfo
            r0.<init>(r4)
            java.lang.String r4 = r0.getAlgName()
            javax.crypto.SecretKeyFactory r4 = javax.crypto.SecretKeyFactory.getInstance(r4)
            javax.crypto.spec.PBEKeySpec r1 = new javax.crypto.spec.PBEKeySpec
            r1.<init>(r3)
            javax.crypto.SecretKey r3 = r4.generateSecret(r1)
            java.lang.String r4 = r0.getAlgName()
            javax.crypto.Cipher r4 = javax.crypto.Cipher.getInstance(r4)
            r1 = 2
            java.security.AlgorithmParameters r2 = r0.getAlgParameters()
            r4.init(r1, r3, r2)
            java.security.spec.PKCS8EncodedKeySpec r3 = r0.getKeySpec(r4)
            return r3
    }

    private static java.security.cert.X509Certificate[] getCertificatesFromBuffers(io.netty.buffer.ByteBuf[] r6) throws java.security.cert.CertificateException {
            java.lang.String r0 = "X.509"
            java.security.cert.CertificateFactory r0 = java.security.cert.CertificateFactory.getInstance(r0)
            int r1 = r6.length
            java.security.cert.X509Certificate[] r1 = new java.security.cert.X509Certificate[r1]
            r2 = 0
            r3 = 0
        Lb:
            int r4 = r6.length     // Catch: java.lang.Throwable -> L23
            if (r3 >= r4) goto L38
            io.netty.buffer.ByteBufInputStream r4 = new io.netty.buffer.ByteBufInputStream     // Catch: java.lang.Throwable -> L23
            r5 = r6[r3]     // Catch: java.lang.Throwable -> L23
            r4.<init>(r5, r2)     // Catch: java.lang.Throwable -> L23
            java.security.cert.Certificate r5 = r0.generateCertificate(r4)     // Catch: java.lang.Throwable -> L2c
            java.security.cert.X509Certificate r5 = (java.security.cert.X509Certificate) r5     // Catch: java.lang.Throwable -> L2c
            r1[r3] = r5     // Catch: java.lang.Throwable -> L2c
            r4.close()     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L25
            int r3 = r3 + 1
            goto Lb
        L23:
            r0 = move-exception
            goto L44
        L25:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L23
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L23
            throw r1     // Catch: java.lang.Throwable -> L23
        L2c:
            r0 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L31
            throw r0     // Catch: java.lang.Throwable -> L23
        L31:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L23
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L23
            throw r1     // Catch: java.lang.Throwable -> L23
        L38:
            int r0 = r6.length
        L39:
            if (r2 >= r0) goto L43
            r3 = r6[r2]
            r3.release()
            int r2 = r2 + 1
            goto L39
        L43:
            return r1
        L44:
            int r1 = r6.length
        L45:
            if (r2 >= r1) goto L4f
            r3 = r6[r2]
            r3.release()
            int r2 = r2 + 1
            goto L45
        L4f:
            throw r0
    }

    private static java.security.PrivateKey getPrivateKeyFromByteBuffer(io.netty.buffer.ByteBuf r1, java.lang.String r2) throws java.security.NoSuchAlgorithmException, javax.crypto.NoSuchPaddingException, java.security.spec.InvalidKeySpecException, java.security.InvalidAlgorithmParameterException, java.security.KeyException, java.io.IOException {
            int r0 = r1.readableBytes()
            byte[] r0 = new byte[r0]
            io.netty.buffer.ByteBuf r1 = r1.readBytes(r0)
            r1.release()
            if (r2 != 0) goto L11
            r1 = 0
            goto L15
        L11:
            char[] r1 = r2.toCharArray()
        L15:
            java.security.spec.PKCS8EncodedKeySpec r1 = generateKeySpec(r1, r0)
            java.lang.String r2 = "RSA"
            java.security.KeyFactory r2 = java.security.KeyFactory.getInstance(r2)     // Catch: java.security.spec.InvalidKeySpecException -> L24
            java.security.PrivateKey r1 = r2.generatePrivate(r1)     // Catch: java.security.spec.InvalidKeySpecException -> L24
            return r1
        L24:
            java.lang.String r2 = "DSA"
            java.security.KeyFactory r2 = java.security.KeyFactory.getInstance(r2)     // Catch: java.security.spec.InvalidKeySpecException -> L2f
            java.security.PrivateKey r1 = r2.generatePrivate(r1)     // Catch: java.security.spec.InvalidKeySpecException -> L2f
            return r1
        L2f:
            java.lang.String r2 = "EC"
            java.security.KeyFactory r2 = java.security.KeyFactory.getInstance(r2)     // Catch: java.security.spec.InvalidKeySpecException -> L3a
            java.security.PrivateKey r1 = r2.generatePrivate(r1)     // Catch: java.security.spec.InvalidKeySpecException -> L3a
            return r1
        L3a:
            r1 = move-exception
            java.security.spec.InvalidKeySpecException r2 = new java.security.spec.InvalidKeySpecException
            java.lang.String r0 = "Neither RSA, DSA nor EC worked"
            r2.<init>(r0, r1)
            throw r2
    }

    static char[] keyStorePassword(java.lang.String r0) {
            if (r0 != 0) goto L5
            char[] r0 = io.netty.util.internal.EmptyArrays.EMPTY_CHARS
            return r0
        L5:
            char[] r0 = r0.toCharArray()
            return r0
    }

    @java.lang.Deprecated
    public static io.netty.handler.ssl.SslContext newClientContext() throws javax.net.ssl.SSLException {
            r0 = 0
            io.netty.handler.ssl.SslContext r0 = newClientContext(r0, r0, r0)
            return r0
    }

    @java.lang.Deprecated
    public static io.netty.handler.ssl.SslContext newClientContext(io.netty.handler.ssl.SslProvider r1) throws javax.net.ssl.SSLException {
            r0 = 0
            io.netty.handler.ssl.SslContext r1 = newClientContext(r1, r0, r0)
            return r1
    }

    @java.lang.Deprecated
    public static io.netty.handler.ssl.SslContext newClientContext(io.netty.handler.ssl.SslProvider r1, java.io.File r2) throws javax.net.ssl.SSLException {
            r0 = 0
            io.netty.handler.ssl.SslContext r1 = newClientContext(r1, r2, r0)
            return r1
    }

    @java.lang.Deprecated
    public static io.netty.handler.ssl.SslContext newClientContext(io.netty.handler.ssl.SslProvider r10, java.io.File r11, javax.net.ssl.TrustManagerFactory r12) throws javax.net.ssl.SSLException {
            io.netty.handler.ssl.IdentityCipherSuiteFilter r4 = io.netty.handler.ssl.IdentityCipherSuiteFilter.INSTANCE
            r6 = 0
            r8 = 0
            r3 = 0
            r5 = 0
            r0 = r10
            r1 = r11
            r2 = r12
            io.netty.handler.ssl.SslContext r10 = newClientContext(r0, r1, r2, r3, r4, r5, r6, r8)
            return r10
    }

    @java.lang.Deprecated
    public static io.netty.handler.ssl.SslContext newClientContext(io.netty.handler.ssl.SslProvider r20, java.io.File r21, javax.net.ssl.TrustManagerFactory r22, java.io.File r23, java.io.File r24, java.lang.String r25, javax.net.ssl.KeyManagerFactory r26, java.lang.Iterable<java.lang.String> r27, io.netty.handler.ssl.CipherSuiteFilter r28, io.netty.handler.ssl.ApplicationProtocolConfig r29, long r30, long r32) throws javax.net.ssl.SSLException {
            java.security.cert.X509Certificate[] r4 = toX509Certificates(r21)     // Catch: java.lang.Exception -> L2b
            java.security.cert.X509Certificate[] r6 = toX509Certificates(r23)     // Catch: java.lang.Exception -> L2b
            java.security.PrivateKey r7 = toPrivateKey(r24, r25)     // Catch: java.lang.Exception -> L2b
            java.lang.String r19 = java.security.KeyStore.getDefaultType()     // Catch: java.lang.Exception -> L2b
            r3 = 0
            r13 = 0
            r18 = 0
            r2 = r20
            r5 = r22
            r8 = r25
            r9 = r26
            r10 = r27
            r11 = r28
            r12 = r29
            r14 = r30
            r16 = r32
            io.netty.handler.ssl.SslContext r0 = newClientContextInternal(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r18, r19)     // Catch: java.lang.Exception -> L2b
            return r0
        L2b:
            r0 = move-exception
            boolean r1 = r0 instanceof javax.net.ssl.SSLException
            if (r1 == 0) goto L33
            javax.net.ssl.SSLException r0 = (javax.net.ssl.SSLException) r0
            throw r0
        L33:
            javax.net.ssl.SSLException r1 = new javax.net.ssl.SSLException
            java.lang.String r2 = "failed to initialize the client-side SSL context"
            r1.<init>(r2, r0)
            throw r1
    }

    @java.lang.Deprecated
    public static io.netty.handler.ssl.SslContext newClientContext(io.netty.handler.ssl.SslProvider r14, java.io.File r15, javax.net.ssl.TrustManagerFactory r16, java.lang.Iterable<java.lang.String> r17, io.netty.handler.ssl.CipherSuiteFilter r18, io.netty.handler.ssl.ApplicationProtocolConfig r19, long r20, long r22) throws javax.net.ssl.SSLException {
            r5 = 0
            r6 = 0
            r3 = 0
            r4 = 0
            r0 = r14
            r1 = r15
            r2 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r12 = r22
            io.netty.handler.ssl.SslContext r14 = newClientContext(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return r14
    }

    @java.lang.Deprecated
    public static io.netty.handler.ssl.SslContext newClientContext(io.netty.handler.ssl.SslProvider r14, java.io.File r15, javax.net.ssl.TrustManagerFactory r16, java.lang.Iterable<java.lang.String> r17, java.lang.Iterable<java.lang.String> r18, long r19, long r21) throws javax.net.ssl.SSLException {
            io.netty.handler.ssl.IdentityCipherSuiteFilter r8 = io.netty.handler.ssl.IdentityCipherSuiteFilter.INSTANCE
            io.netty.handler.ssl.ApplicationProtocolConfig r9 = toApplicationProtocolConfig(r18)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r0 = r14
            r1 = r15
            r2 = r16
            r7 = r17
            r10 = r19
            r12 = r21
            io.netty.handler.ssl.SslContext r14 = newClientContext(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return r14
    }

    @java.lang.Deprecated
    public static io.netty.handler.ssl.SslContext newClientContext(io.netty.handler.ssl.SslProvider r1, javax.net.ssl.TrustManagerFactory r2) throws javax.net.ssl.SSLException {
            r0 = 0
            io.netty.handler.ssl.SslContext r1 = newClientContext(r1, r0, r2)
            return r1
    }

    @java.lang.Deprecated
    public static io.netty.handler.ssl.SslContext newClientContext(java.io.File r1) throws javax.net.ssl.SSLException {
            r0 = 0
            io.netty.handler.ssl.SslContext r1 = newClientContext(r0, r1)
            return r1
    }

    @java.lang.Deprecated
    public static io.netty.handler.ssl.SslContext newClientContext(java.io.File r1, javax.net.ssl.TrustManagerFactory r2) throws javax.net.ssl.SSLException {
            r0 = 0
            io.netty.handler.ssl.SslContext r1 = newClientContext(r0, r1, r2)
            return r1
    }

    @java.lang.Deprecated
    public static io.netty.handler.ssl.SslContext newClientContext(java.io.File r10, javax.net.ssl.TrustManagerFactory r11, java.lang.Iterable<java.lang.String> r12, io.netty.handler.ssl.CipherSuiteFilter r13, io.netty.handler.ssl.ApplicationProtocolConfig r14, long r15, long r17) throws javax.net.ssl.SSLException {
            r0 = 0
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r8 = r17
            io.netty.handler.ssl.SslContext r10 = newClientContext(r0, r1, r2, r3, r4, r5, r6, r8)
            return r10
    }

    @java.lang.Deprecated
    public static io.netty.handler.ssl.SslContext newClientContext(java.io.File r9, javax.net.ssl.TrustManagerFactory r10, java.lang.Iterable<java.lang.String> r11, java.lang.Iterable<java.lang.String> r12, long r13, long r15) throws javax.net.ssl.SSLException {
            r0 = 0
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r7 = r15
            io.netty.handler.ssl.SslContext r9 = newClientContext(r0, r1, r2, r3, r4, r5, r7)
            return r9
    }

    @java.lang.Deprecated
    public static io.netty.handler.ssl.SslContext newClientContext(javax.net.ssl.TrustManagerFactory r1) throws javax.net.ssl.SSLException {
            r0 = 0
            io.netty.handler.ssl.SslContext r1 = newClientContext(r0, r0, r1)
            return r1
    }

    static io.netty.handler.ssl.SslContext newClientContextInternal(io.netty.handler.ssl.SslProvider r21, java.security.Provider r22, java.security.cert.X509Certificate[] r23, javax.net.ssl.TrustManagerFactory r24, java.security.cert.X509Certificate[] r25, java.security.PrivateKey r26, java.lang.String r27, javax.net.ssl.KeyManagerFactory r28, java.lang.Iterable<java.lang.String> r29, io.netty.handler.ssl.CipherSuiteFilter r30, io.netty.handler.ssl.ApplicationProtocolConfig r31, java.lang.String[] r32, long r33, long r35, boolean r37, java.lang.String r38) throws javax.net.ssl.SSLException {
            r1 = r22
            if (r21 != 0) goto L9
            io.netty.handler.ssl.SslProvider r0 = defaultClientProvider()
            goto Lb
        L9:
            r0 = r21
        Lb:
            int[] r2 = io.netty.handler.ssl.SslContext.AnonymousClass1.$SwitchMap$io$netty$handler$ssl$SslProvider
            int r3 = r0.ordinal()
            r2 = r2[r3]
            r3 = 1
            if (r2 == r3) goto L70
            r3 = 2
            if (r2 == r3) goto L4b
            r3 = 3
            if (r2 != r3) goto L41
            verifyNullSslContextProvider(r0, r1)
            io.netty.handler.ssl.ReferenceCountedOpenSslClientContext r4 = new io.netty.handler.ssl.ReferenceCountedOpenSslClientContext
            r5 = r23
            r6 = r24
            r7 = r25
            r8 = r26
            r9 = r27
            r10 = r28
            r11 = r29
            r12 = r30
            r13 = r31
            r14 = r32
            r15 = r33
            r17 = r35
            r19 = r37
            r20 = r38
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r17, r19, r20)
            return r4
        L41:
            java.lang.Error r1 = new java.lang.Error
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L4b:
            verifyNullSslContextProvider(r0, r1)
            io.netty.handler.ssl.OpenSslClientContext r2 = new io.netty.handler.ssl.OpenSslClientContext
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            r7 = r27
            r8 = r28
            r9 = r29
            r10 = r30
            r11 = r31
            r12 = r32
            r13 = r33
            r15 = r35
            r17 = r37
            r18 = r38
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r17, r18)
            return r2
        L70:
            if (r37 != 0) goto L92
            io.netty.handler.ssl.JdkSslClientContext r0 = new io.netty.handler.ssl.JdkSslClientContext
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = r26
            r6 = r27
            r7 = r28
            r8 = r29
            r9 = r30
            r10 = r31
            r11 = r32
            r12 = r33
            r14 = r35
            r16 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r16)
            return r0
        L92:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "OCSP is not supported with this SslProvider: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
    }

    @java.lang.Deprecated
    public static io.netty.handler.ssl.SslContext newServerContext(io.netty.handler.ssl.SslProvider r1, java.io.File r2, java.io.File r3) throws javax.net.ssl.SSLException {
            r0 = 0
            io.netty.handler.ssl.SslContext r1 = newServerContext(r1, r2, r3, r0)
            return r1
    }

    @java.lang.Deprecated
    public static io.netty.handler.ssl.SslContext newServerContext(io.netty.handler.ssl.SslProvider r11, java.io.File r12, java.io.File r13, java.lang.String r14) throws javax.net.ssl.SSLException {
            io.netty.handler.ssl.IdentityCipherSuiteFilter r5 = io.netty.handler.ssl.IdentityCipherSuiteFilter.INSTANCE
            r7 = 0
            r9 = 0
            r4 = 0
            r6 = 0
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            io.netty.handler.ssl.SslContext r11 = newServerContext(r0, r1, r2, r3, r4, r5, r6, r7, r9)
            return r11
    }

    @java.lang.Deprecated
    public static io.netty.handler.ssl.SslContext newServerContext(io.netty.handler.ssl.SslProvider r15, java.io.File r16, java.io.File r17, java.lang.String r18, java.lang.Iterable<java.lang.String> r19, io.netty.handler.ssl.CipherSuiteFilter r20, io.netty.handler.ssl.ApplicationProtocolConfig r21, long r22, long r24) throws javax.net.ssl.SSLException {
            r6 = 0
            java.lang.String r14 = java.security.KeyStore.getDefaultType()
            r1 = 0
            r2 = 0
            r0 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r12 = r24
            io.netty.handler.ssl.SslContext r15 = newServerContext(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r14)
            return r15
    }

    @java.lang.Deprecated
    public static io.netty.handler.ssl.SslContext newServerContext(io.netty.handler.ssl.SslProvider r11, java.io.File r12, java.io.File r13, java.lang.String r14, java.lang.Iterable<java.lang.String> r15, java.lang.Iterable<java.lang.String> r16, long r17, long r19) throws javax.net.ssl.SSLException {
            io.netty.handler.ssl.IdentityCipherSuiteFilter r5 = io.netty.handler.ssl.IdentityCipherSuiteFilter.INSTANCE
            io.netty.handler.ssl.ApplicationProtocolConfig r6 = toApplicationProtocolConfig(r16)
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r7 = r17
            r9 = r19
            io.netty.handler.ssl.SslContext r11 = newServerContext(r0, r1, r2, r3, r4, r5, r6, r7, r9)
            return r11
    }

    @java.lang.Deprecated
    public static io.netty.handler.ssl.SslContext newServerContext(io.netty.handler.ssl.SslProvider r14, java.io.File r15, java.io.File r16, java.lang.String r17, javax.net.ssl.TrustManagerFactory r18, java.lang.Iterable<java.lang.String> r19, java.lang.Iterable<java.lang.String> r20, long r21, long r23) throws javax.net.ssl.SSLException {
            io.netty.handler.ssl.IdentityCipherSuiteFilter r8 = io.netty.handler.ssl.IdentityCipherSuiteFilter.INSTANCE
            io.netty.handler.ssl.ApplicationProtocolConfig r9 = toApplicationProtocolConfig(r20)
            r1 = 0
            r6 = 0
            r0 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r2 = r18
            r7 = r19
            r10 = r21
            r12 = r23
            io.netty.handler.ssl.SslContext r14 = newServerContext(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return r14
    }

    @java.lang.Deprecated
    public static io.netty.handler.ssl.SslContext newServerContext(io.netty.handler.ssl.SslProvider r15, java.io.File r16, javax.net.ssl.TrustManagerFactory r17, java.io.File r18, java.io.File r19, java.lang.String r20, javax.net.ssl.KeyManagerFactory r21, java.lang.Iterable<java.lang.String> r22, io.netty.handler.ssl.CipherSuiteFilter r23, io.netty.handler.ssl.ApplicationProtocolConfig r24, long r25, long r27) throws javax.net.ssl.SSLException {
            java.lang.String r14 = java.security.KeyStore.getDefaultType()
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r10 = r25
            r12 = r27
            io.netty.handler.ssl.SslContext r15 = newServerContext(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r14)
            return r15
    }

    static io.netty.handler.ssl.SslContext newServerContext(io.netty.handler.ssl.SslProvider r22, java.io.File r23, javax.net.ssl.TrustManagerFactory r24, java.io.File r25, java.io.File r26, java.lang.String r27, javax.net.ssl.KeyManagerFactory r28, java.lang.Iterable<java.lang.String> r29, io.netty.handler.ssl.CipherSuiteFilter r30, io.netty.handler.ssl.ApplicationProtocolConfig r31, long r32, long r34, java.lang.String r36) throws javax.net.ssl.SSLException {
            java.security.cert.X509Certificate[] r4 = toX509Certificates(r23)     // Catch: java.lang.Exception -> L2e
            java.security.cert.X509Certificate[] r6 = toX509Certificates(r25)     // Catch: java.lang.Exception -> L2e
            java.security.PrivateKey r7 = toPrivateKey(r26, r27)     // Catch: java.lang.Exception -> L2e
            io.netty.handler.ssl.ClientAuth r17 = io.netty.handler.ssl.ClientAuth.NONE     // Catch: java.lang.Exception -> L2e
            r19 = 0
            r20 = 0
            r3 = 0
            r18 = 0
            r2 = r22
            r5 = r24
            r8 = r27
            r9 = r28
            r10 = r29
            r11 = r30
            r12 = r31
            r13 = r32
            r15 = r34
            r21 = r36
            io.netty.handler.ssl.SslContext r0 = newServerContextInternal(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r17, r18, r19, r20, r21)     // Catch: java.lang.Exception -> L2e
            return r0
        L2e:
            r0 = move-exception
            boolean r1 = r0 instanceof javax.net.ssl.SSLException
            if (r1 == 0) goto L36
            javax.net.ssl.SSLException r0 = (javax.net.ssl.SSLException) r0
            throw r0
        L36:
            javax.net.ssl.SSLException r1 = new javax.net.ssl.SSLException
            java.lang.String r2 = "failed to initialize the server-side SSL context"
            r1.<init>(r2, r0)
            throw r1
    }

    @java.lang.Deprecated
    public static io.netty.handler.ssl.SslContext newServerContext(java.io.File r1, java.io.File r2) throws javax.net.ssl.SSLException {
            r0 = 0
            io.netty.handler.ssl.SslContext r1 = newServerContext(r1, r2, r0)
            return r1
    }

    @java.lang.Deprecated
    public static io.netty.handler.ssl.SslContext newServerContext(java.io.File r1, java.io.File r2, java.lang.String r3) throws javax.net.ssl.SSLException {
            r0 = 0
            io.netty.handler.ssl.SslContext r1 = newServerContext(r0, r1, r2, r3)
            return r1
    }

    @java.lang.Deprecated
    public static io.netty.handler.ssl.SslContext newServerContext(java.io.File r11, java.io.File r12, java.lang.String r13, java.lang.Iterable<java.lang.String> r14, io.netty.handler.ssl.CipherSuiteFilter r15, io.netty.handler.ssl.ApplicationProtocolConfig r16, long r17, long r19) throws javax.net.ssl.SSLException {
            r0 = 0
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r9 = r19
            io.netty.handler.ssl.SslContext r11 = newServerContext(r0, r1, r2, r3, r4, r5, r6, r7, r9)
            return r11
    }

    @java.lang.Deprecated
    public static io.netty.handler.ssl.SslContext newServerContext(java.io.File r10, java.io.File r11, java.lang.String r12, java.lang.Iterable<java.lang.String> r13, java.lang.Iterable<java.lang.String> r14, long r15, long r17) throws javax.net.ssl.SSLException {
            r0 = 0
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r8 = r17
            io.netty.handler.ssl.SslContext r10 = newServerContext(r0, r1, r2, r3, r4, r5, r6, r8)
            return r10
    }

    static io.netty.handler.ssl.SslContext newServerContextInternal(io.netty.handler.ssl.SslProvider r23, java.security.Provider r24, java.security.cert.X509Certificate[] r25, javax.net.ssl.TrustManagerFactory r26, java.security.cert.X509Certificate[] r27, java.security.PrivateKey r28, java.lang.String r29, javax.net.ssl.KeyManagerFactory r30, java.lang.Iterable<java.lang.String> r31, io.netty.handler.ssl.CipherSuiteFilter r32, io.netty.handler.ssl.ApplicationProtocolConfig r33, long r34, long r36, io.netty.handler.ssl.ClientAuth r38, java.lang.String[] r39, boolean r40, boolean r41, java.lang.String r42) throws javax.net.ssl.SSLException {
            r1 = r24
            if (r23 != 0) goto L9
            io.netty.handler.ssl.SslProvider r0 = defaultServerProvider()
            goto Lb
        L9:
            r0 = r23
        Lb:
            int[] r2 = io.netty.handler.ssl.SslContext.AnonymousClass1.$SwitchMap$io$netty$handler$ssl$SslProvider
            int r3 = r0.ordinal()
            r2 = r2[r3]
            r3 = 1
            if (r2 == r3) goto L78
            r3 = 2
            if (r2 == r3) goto L4f
            r3 = 3
            if (r2 != r3) goto L45
            verifyNullSslContextProvider(r0, r1)
            io.netty.handler.ssl.ReferenceCountedOpenSslServerContext r4 = new io.netty.handler.ssl.ReferenceCountedOpenSslServerContext
            r5 = r25
            r6 = r26
            r7 = r27
            r8 = r28
            r9 = r29
            r10 = r30
            r11 = r31
            r12 = r32
            r13 = r33
            r14 = r34
            r16 = r36
            r18 = r38
            r19 = r39
            r20 = r40
            r21 = r41
            r22 = r42
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r18, r19, r20, r21, r22)
            return r4
        L45:
            java.lang.Error r1 = new java.lang.Error
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L4f:
            verifyNullSslContextProvider(r0, r1)
            io.netty.handler.ssl.OpenSslServerContext r2 = new io.netty.handler.ssl.OpenSslServerContext
            r3 = r25
            r4 = r26
            r5 = r27
            r6 = r28
            r7 = r29
            r8 = r30
            r9 = r31
            r10 = r32
            r11 = r33
            r12 = r34
            r14 = r36
            r16 = r38
            r17 = r39
            r18 = r40
            r19 = r41
            r20 = r42
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r16, r17, r18, r19, r20)
            return r2
        L78:
            if (r41 != 0) goto L9e
            io.netty.handler.ssl.JdkSslServerContext r0 = new io.netty.handler.ssl.JdkSslServerContext
            r2 = r25
            r3 = r26
            r4 = r27
            r5 = r28
            r6 = r29
            r7 = r30
            r8 = r31
            r9 = r32
            r10 = r33
            r11 = r34
            r13 = r36
            r15 = r38
            r16 = r39
            r17 = r40
            r18 = r42
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r15, r16, r17, r18)
            return r0
        L9e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "OCSP is not supported with this SslProvider: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
    }

    static io.netty.handler.ssl.ApplicationProtocolConfig toApplicationProtocolConfig(java.lang.Iterable<java.lang.String> r4) {
            if (r4 != 0) goto L5
            io.netty.handler.ssl.ApplicationProtocolConfig r4 = io.netty.handler.ssl.ApplicationProtocolConfig.DISABLED
            return r4
        L5:
            io.netty.handler.ssl.ApplicationProtocolConfig r0 = new io.netty.handler.ssl.ApplicationProtocolConfig
            io.netty.handler.ssl.ApplicationProtocolConfig$Protocol r1 = io.netty.handler.ssl.ApplicationProtocolConfig.Protocol.NPN_AND_ALPN
            io.netty.handler.ssl.ApplicationProtocolConfig$SelectorFailureBehavior r2 = io.netty.handler.ssl.ApplicationProtocolConfig.SelectorFailureBehavior.CHOOSE_MY_LAST_PROTOCOL
            io.netty.handler.ssl.ApplicationProtocolConfig$SelectedListenerFailureBehavior r3 = io.netty.handler.ssl.ApplicationProtocolConfig.SelectedListenerFailureBehavior.ACCEPT
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    static java.security.PrivateKey toPrivateKey(java.io.File r0, java.lang.String r1) throws java.security.NoSuchAlgorithmException, javax.crypto.NoSuchPaddingException, java.security.spec.InvalidKeySpecException, java.security.InvalidAlgorithmParameterException, java.security.KeyException, java.io.IOException {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            io.netty.buffer.ByteBuf r0 = io.netty.handler.ssl.PemReader.readPrivateKey(r0)
            java.security.PrivateKey r0 = getPrivateKeyFromByteBuffer(r0, r1)
            return r0
    }

    static java.security.PrivateKey toPrivateKey(java.io.InputStream r0, java.lang.String r1) throws java.security.NoSuchAlgorithmException, javax.crypto.NoSuchPaddingException, java.security.spec.InvalidKeySpecException, java.security.InvalidAlgorithmParameterException, java.security.KeyException, java.io.IOException {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            io.netty.buffer.ByteBuf r0 = io.netty.handler.ssl.PemReader.readPrivateKey(r0)
            java.security.PrivateKey r0 = getPrivateKeyFromByteBuffer(r0, r1)
            return r0
    }

    static java.security.PrivateKey toPrivateKeyInternal(java.io.File r0, java.lang.String r1) throws javax.net.ssl.SSLException {
            java.security.PrivateKey r0 = toPrivateKey(r0, r1)     // Catch: java.lang.Exception -> L5
            return r0
        L5:
            r0 = move-exception
            javax.net.ssl.SSLException r1 = new javax.net.ssl.SSLException
            r1.<init>(r0)
            throw r1
    }

    static java.security.cert.X509Certificate[] toX509Certificates(java.io.File r0) throws java.security.cert.CertificateException {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            io.netty.buffer.ByteBuf[] r0 = io.netty.handler.ssl.PemReader.readCertificates(r0)
            java.security.cert.X509Certificate[] r0 = getCertificatesFromBuffers(r0)
            return r0
    }

    static java.security.cert.X509Certificate[] toX509Certificates(java.io.InputStream r0) throws java.security.cert.CertificateException {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            io.netty.buffer.ByteBuf[] r0 = io.netty.handler.ssl.PemReader.readCertificates(r0)
            java.security.cert.X509Certificate[] r0 = getCertificatesFromBuffers(r0)
            return r0
    }

    static java.security.cert.X509Certificate[] toX509CertificatesInternal(java.io.File r1) throws javax.net.ssl.SSLException {
            java.security.cert.X509Certificate[] r1 = toX509Certificates(r1)     // Catch: java.security.cert.CertificateException -> L5
            return r1
        L5:
            r1 = move-exception
            javax.net.ssl.SSLException r0 = new javax.net.ssl.SSLException
            r0.<init>(r1)
            throw r0
    }

    private static void verifyNullSslContextProvider(io.netty.handler.ssl.SslProvider r2, java.security.Provider r3) {
            if (r3 != 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Java Security Provider unsupported for SslProvider: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
    }

    public abstract io.netty.handler.ssl.ApplicationProtocolNegotiator applicationProtocolNegotiator();

    public abstract java.util.List<java.lang.String> cipherSuites();

    public abstract boolean isClient();

    public final boolean isServer() {
            r1 = this;
            boolean r0 = r1.isClient()
            r0 = r0 ^ 1
            return r0
    }

    public abstract javax.net.ssl.SSLEngine newEngine(io.netty.buffer.ByteBufAllocator r1);

    public abstract javax.net.ssl.SSLEngine newEngine(io.netty.buffer.ByteBufAllocator r1, java.lang.String r2, int r3);

    public final io.netty.handler.ssl.SslHandler newHandler(io.netty.buffer.ByteBufAllocator r2) {
            r1 = this;
            boolean r0 = r1.startTls
            io.netty.handler.ssl.SslHandler r2 = r1.newHandler(r2, r0)
            return r2
    }

    public final io.netty.handler.ssl.SslHandler newHandler(io.netty.buffer.ByteBufAllocator r2, java.lang.String r3, int r4) {
            r1 = this;
            boolean r0 = r1.startTls
            io.netty.handler.ssl.SslHandler r2 = r1.newHandler(r2, r3, r4, r0)
            return r2
    }

    public io.netty.handler.ssl.SslHandler newHandler(io.netty.buffer.ByteBufAllocator r7, java.lang.String r8, int r9, java.util.concurrent.Executor r10) {
            r6 = this;
            boolean r4 = r6.startTls
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            io.netty.handler.ssl.SslHandler r7 = r0.newHandler(r1, r2, r3, r4, r5)
            return r7
    }

    protected io.netty.handler.ssl.SslHandler newHandler(io.netty.buffer.ByteBufAllocator r2, java.lang.String r3, int r4, boolean r5) {
            r1 = this;
            io.netty.handler.ssl.SslHandler r0 = new io.netty.handler.ssl.SslHandler
            javax.net.ssl.SSLEngine r2 = r1.newEngine(r2, r3, r4)
            r0.<init>(r2, r5)
            return r0
    }

    protected io.netty.handler.ssl.SslHandler newHandler(io.netty.buffer.ByteBufAllocator r2, java.lang.String r3, int r4, boolean r5, java.util.concurrent.Executor r6) {
            r1 = this;
            io.netty.handler.ssl.SslHandler r0 = new io.netty.handler.ssl.SslHandler
            javax.net.ssl.SSLEngine r2 = r1.newEngine(r2, r3, r4)
            r0.<init>(r2, r5, r6)
            return r0
    }

    public io.netty.handler.ssl.SslHandler newHandler(io.netty.buffer.ByteBufAllocator r2, java.util.concurrent.Executor r3) {
            r1 = this;
            boolean r0 = r1.startTls
            io.netty.handler.ssl.SslHandler r2 = r1.newHandler(r2, r0, r3)
            return r2
    }

    protected io.netty.handler.ssl.SslHandler newHandler(io.netty.buffer.ByteBufAllocator r2, boolean r3) {
            r1 = this;
            io.netty.handler.ssl.SslHandler r0 = new io.netty.handler.ssl.SslHandler
            javax.net.ssl.SSLEngine r2 = r1.newEngine(r2)
            r0.<init>(r2, r3)
            return r0
    }

    protected io.netty.handler.ssl.SslHandler newHandler(io.netty.buffer.ByteBufAllocator r2, boolean r3, java.util.concurrent.Executor r4) {
            r1 = this;
            io.netty.handler.ssl.SslHandler r0 = new io.netty.handler.ssl.SslHandler
            javax.net.ssl.SSLEngine r2 = r1.newEngine(r2)
            r0.<init>(r2, r3, r4)
            return r0
    }

    @java.lang.Deprecated
    public final java.util.List<java.lang.String> nextProtocols() {
            r1 = this;
            io.netty.handler.ssl.ApplicationProtocolNegotiator r0 = r1.applicationProtocolNegotiator()
            java.util.List r0 = r0.protocols()
            return r0
    }

    public abstract long sessionCacheSize();

    public abstract javax.net.ssl.SSLSessionContext sessionContext();

    public abstract long sessionTimeout();
}
