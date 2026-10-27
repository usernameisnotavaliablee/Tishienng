package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class JdkSslContext extends io.netty.handler.ssl.SslContext {
    private static final java.util.List<java.lang.String> DEFAULT_CIPHERS = null;
    private static final java.util.List<java.lang.String> DEFAULT_CIPHERS_NON_TLSV13 = null;
    private static final java.lang.String[] DEFAULT_PROTOCOLS = null;
    private static final java.security.Provider DEFAULT_PROVIDER = null;
    static final java.lang.String PROTOCOL = "TLS";
    private static final java.util.Set<java.lang.String> SUPPORTED_CIPHERS = null;
    private static final java.util.Set<java.lang.String> SUPPORTED_CIPHERS_NON_TLSV13 = null;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private final io.netty.handler.ssl.JdkApplicationProtocolNegotiator apn;
    private final java.lang.String[] cipherSuites;
    private final io.netty.handler.ssl.ClientAuth clientAuth;
    private final boolean isClient;
    private final java.lang.String[] protocols;
    private final javax.net.ssl.SSLContext sslContext;
    private final java.util.List<java.lang.String> unmodifiableCipherSuites;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.ssl.JdkSslContext$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$Protocol = null;
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$SelectedListenerFailureBehavior = null;
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$SelectorFailureBehavior = null;
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$ssl$ClientAuth = null;

        static {
                io.netty.handler.ssl.ApplicationProtocolConfig$Protocol[] r0 = io.netty.handler.ssl.ApplicationProtocolConfig.Protocol.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.handler.ssl.JdkSslContext.AnonymousClass1.$SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$Protocol = r0
                r1 = 1
                io.netty.handler.ssl.ApplicationProtocolConfig$Protocol r2 = io.netty.handler.ssl.ApplicationProtocolConfig.Protocol.NONE     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = io.netty.handler.ssl.JdkSslContext.AnonymousClass1.$SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$Protocol     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.handler.ssl.ApplicationProtocolConfig$Protocol r3 = io.netty.handler.ssl.ApplicationProtocolConfig.Protocol.ALPN     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                r2 = 3
                int[] r3 = io.netty.handler.ssl.JdkSslContext.AnonymousClass1.$SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$Protocol     // Catch: java.lang.NoSuchFieldError -> L28
                io.netty.handler.ssl.ApplicationProtocolConfig$Protocol r4 = io.netty.handler.ssl.ApplicationProtocolConfig.Protocol.NPN     // Catch: java.lang.NoSuchFieldError -> L28
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                io.netty.handler.ssl.ApplicationProtocolConfig$SelectedListenerFailureBehavior[] r3 = io.netty.handler.ssl.ApplicationProtocolConfig.SelectedListenerFailureBehavior.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                io.netty.handler.ssl.JdkSslContext.AnonymousClass1.$SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$SelectedListenerFailureBehavior = r3
                io.netty.handler.ssl.ApplicationProtocolConfig$SelectedListenerFailureBehavior r4 = io.netty.handler.ssl.ApplicationProtocolConfig.SelectedListenerFailureBehavior.ACCEPT     // Catch: java.lang.NoSuchFieldError -> L39
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L39
                r3[r4] = r1     // Catch: java.lang.NoSuchFieldError -> L39
            L39:
                int[] r3 = io.netty.handler.ssl.JdkSslContext.AnonymousClass1.$SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$SelectedListenerFailureBehavior     // Catch: java.lang.NoSuchFieldError -> L43
                io.netty.handler.ssl.ApplicationProtocolConfig$SelectedListenerFailureBehavior r4 = io.netty.handler.ssl.ApplicationProtocolConfig.SelectedListenerFailureBehavior.FATAL_ALERT     // Catch: java.lang.NoSuchFieldError -> L43
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L43
                r3[r4] = r0     // Catch: java.lang.NoSuchFieldError -> L43
            L43:
                io.netty.handler.ssl.ApplicationProtocolConfig$SelectorFailureBehavior[] r3 = io.netty.handler.ssl.ApplicationProtocolConfig.SelectorFailureBehavior.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                io.netty.handler.ssl.JdkSslContext.AnonymousClass1.$SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$SelectorFailureBehavior = r3
                io.netty.handler.ssl.ApplicationProtocolConfig$SelectorFailureBehavior r4 = io.netty.handler.ssl.ApplicationProtocolConfig.SelectorFailureBehavior.FATAL_ALERT     // Catch: java.lang.NoSuchFieldError -> L54
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r3[r4] = r1     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r3 = io.netty.handler.ssl.JdkSslContext.AnonymousClass1.$SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$SelectorFailureBehavior     // Catch: java.lang.NoSuchFieldError -> L5e
                io.netty.handler.ssl.ApplicationProtocolConfig$SelectorFailureBehavior r4 = io.netty.handler.ssl.ApplicationProtocolConfig.SelectorFailureBehavior.NO_ADVERTISE     // Catch: java.lang.NoSuchFieldError -> L5e
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5e
                r3[r4] = r0     // Catch: java.lang.NoSuchFieldError -> L5e
            L5e:
                io.netty.handler.ssl.ClientAuth[] r3 = io.netty.handler.ssl.ClientAuth.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                io.netty.handler.ssl.JdkSslContext.AnonymousClass1.$SwitchMap$io$netty$handler$ssl$ClientAuth = r3
                io.netty.handler.ssl.ClientAuth r4 = io.netty.handler.ssl.ClientAuth.OPTIONAL     // Catch: java.lang.NoSuchFieldError -> L6f
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6f
                r3[r4] = r1     // Catch: java.lang.NoSuchFieldError -> L6f
            L6f:
                int[] r1 = io.netty.handler.ssl.JdkSslContext.AnonymousClass1.$SwitchMap$io$netty$handler$ssl$ClientAuth     // Catch: java.lang.NoSuchFieldError -> L79
                io.netty.handler.ssl.ClientAuth r3 = io.netty.handler.ssl.ClientAuth.REQUIRE     // Catch: java.lang.NoSuchFieldError -> L79
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L79
                r1[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L79
            L79:
                int[] r0 = io.netty.handler.ssl.JdkSslContext.AnonymousClass1.$SwitchMap$io$netty$handler$ssl$ClientAuth     // Catch: java.lang.NoSuchFieldError -> L83
                io.netty.handler.ssl.ClientAuth r1 = io.netty.handler.ssl.ClientAuth.NONE     // Catch: java.lang.NoSuchFieldError -> L83
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L83
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L83
            L83:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    static {
            java.lang.Class<io.netty.handler.ssl.JdkSslContext> r0 = io.netty.handler.ssl.JdkSslContext.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.handler.ssl.JdkSslContext.logger = r0
            java.lang.String r1 = "TLS"
            javax.net.ssl.SSLContext r1 = javax.net.ssl.SSLContext.getInstance(r1)     // Catch: java.lang.Exception -> L71
            r2 = 0
            r1.init(r2, r2, r2)     // Catch: java.lang.Exception -> L71
            java.security.Provider r2 = r1.getProvider()
            io.netty.handler.ssl.JdkSslContext.DEFAULT_PROVIDER = r2
            javax.net.ssl.SSLEngine r1 = r1.createSSLEngine()
            java.lang.String[] r2 = defaultProtocols(r1)
            io.netty.handler.ssl.JdkSslContext.DEFAULT_PROTOCOLS = r2
            java.util.Set r3 = supportedCiphers(r1)
            java.util.Set r3 = java.util.Collections.unmodifiableSet(r3)
            io.netty.handler.ssl.JdkSslContext.SUPPORTED_CIPHERS = r3
            java.util.List r1 = defaultCiphers(r1, r3)
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            io.netty.handler.ssl.JdkSslContext.DEFAULT_CIPHERS = r1
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r1)
            java.lang.String[] r5 = io.netty.handler.ssl.SslUtils.DEFAULT_TLSV13_CIPHER_SUITES
            java.util.List r6 = java.util.Arrays.asList(r5)
            r4.removeAll(r6)
            java.util.List r4 = java.util.Collections.unmodifiableList(r4)
            io.netty.handler.ssl.JdkSslContext.DEFAULT_CIPHERS_NON_TLSV13 = r4
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>(r3)
            java.util.List r3 = java.util.Arrays.asList(r5)
            r4.removeAll(r3)
            java.util.Set r3 = java.util.Collections.unmodifiableSet(r4)
            io.netty.handler.ssl.JdkSslContext.SUPPORTED_CIPHERS_NON_TLSV13 = r3
            boolean r3 = r0.isDebugEnabled()
            if (r3 == 0) goto L70
            java.lang.String r3 = "Default protocols (JDK): {} "
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0.debug(r3, r2)
            java.lang.String r2 = "Default cipher suites (JDK): {}"
            r0.debug(r2, r1)
        L70:
            return
        L71:
            r0 = move-exception
            java.lang.Error r1 = new java.lang.Error
            java.lang.String r2 = "failed to initialize the default SSL context"
            r1.<init>(r2, r0)
            throw r1
    }

    @java.lang.Deprecated
    public JdkSslContext(javax.net.ssl.SSLContext r10, boolean r11, io.netty.handler.ssl.ClientAuth r12) {
            r9 = this;
            io.netty.handler.ssl.IdentityCipherSuiteFilter r4 = io.netty.handler.ssl.IdentityCipherSuiteFilter.INSTANCE
            io.netty.handler.ssl.JdkDefaultApplicationProtocolNegotiator r5 = io.netty.handler.ssl.JdkDefaultApplicationProtocolNegotiator.INSTANCE
            r7 = 0
            r8 = 0
            r3 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    @java.lang.Deprecated
    public JdkSslContext(javax.net.ssl.SSLContext r10, boolean r11, java.lang.Iterable<java.lang.String> r12, io.netty.handler.ssl.CipherSuiteFilter r13, io.netty.handler.ssl.ApplicationProtocolConfig r14, io.netty.handler.ssl.ClientAuth r15) {
            r9 = this;
            r7 = 0
            r8 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public JdkSslContext(javax.net.ssl.SSLContext r11, boolean r12, java.lang.Iterable<java.lang.String> r13, io.netty.handler.ssl.CipherSuiteFilter r14, io.netty.handler.ssl.ApplicationProtocolConfig r15, io.netty.handler.ssl.ClientAuth r16, java.lang.String[] r17, boolean r18) {
            r10 = this;
            r0 = r12 ^ 1
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator r6 = toNegotiator(r15, r0)
            if (r17 != 0) goto L14
            r15 = 0
        L9:
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r8 = r15
            r7 = r16
            r9 = r18
            goto L1b
        L14:
            java.lang.Object r15 = r17.clone()
            java.lang.String[] r15 = (java.lang.String[]) r15
            goto L9
        L1b:
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    JdkSslContext(javax.net.ssl.SSLContext r3, boolean r4, java.lang.Iterable<java.lang.String> r5, io.netty.handler.ssl.CipherSuiteFilter r6, io.netty.handler.ssl.JdkApplicationProtocolNegotiator r7, io.netty.handler.ssl.ClientAuth r8, java.lang.String[] r9, boolean r10) {
            r2 = this;
            r2.<init>(r10)
            java.lang.String r10 = "apn"
            java.lang.Object r7 = io.netty.util.internal.ObjectUtil.checkNotNull(r7, r10)
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator r7 = (io.netty.handler.ssl.JdkApplicationProtocolNegotiator) r7
            r2.apn = r7
            java.lang.String r7 = "clientAuth"
            java.lang.Object r7 = io.netty.util.internal.ObjectUtil.checkNotNull(r8, r7)
            io.netty.handler.ssl.ClientAuth r7 = (io.netty.handler.ssl.ClientAuth) r7
            r2.clientAuth = r7
            java.lang.String r7 = "sslContext"
            java.lang.Object r7 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r7)
            javax.net.ssl.SSLContext r7 = (javax.net.ssl.SSLContext) r7
            r2.sslContext = r7
            java.security.Provider r7 = io.netty.handler.ssl.JdkSslContext.DEFAULT_PROVIDER
            java.security.Provider r8 = r3.getProvider()
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L43
            if (r9 != 0) goto L31
            java.lang.String[] r9 = io.netty.handler.ssl.JdkSslContext.DEFAULT_PROTOCOLS
        L31:
            r2.protocols = r9
            boolean r3 = isTlsV13Supported(r9)
            if (r3 == 0) goto L3e
            java.util.Set<java.lang.String> r3 = io.netty.handler.ssl.JdkSslContext.SUPPORTED_CIPHERS
            java.util.List<java.lang.String> r7 = io.netty.handler.ssl.JdkSslContext.DEFAULT_CIPHERS
            goto L7a
        L3e:
            java.util.Set<java.lang.String> r3 = io.netty.handler.ssl.JdkSslContext.SUPPORTED_CIPHERS_NON_TLSV13
            java.util.List<java.lang.String> r7 = io.netty.handler.ssl.JdkSslContext.DEFAULT_CIPHERS_NON_TLSV13
            goto L7a
        L43:
            javax.net.ssl.SSLEngine r3 = r3.createSSLEngine()
            if (r9 != 0) goto L52
            java.lang.String[] r7 = defaultProtocols(r3)     // Catch: java.lang.Throwable -> L50
            r2.protocols = r7     // Catch: java.lang.Throwable -> L50
            goto L54
        L50:
            r4 = move-exception
            goto L95
        L52:
            r2.protocols = r9     // Catch: java.lang.Throwable -> L50
        L54:
            java.util.Set r7 = supportedCiphers(r3)     // Catch: java.lang.Throwable -> L50
            java.util.List r8 = defaultCiphers(r3, r7)     // Catch: java.lang.Throwable -> L50
            java.lang.String[] r9 = r2.protocols     // Catch: java.lang.Throwable -> L50
            boolean r9 = isTlsV13Supported(r9)     // Catch: java.lang.Throwable -> L50
            if (r9 != 0) goto L75
            java.lang.String[] r9 = io.netty.handler.ssl.SslUtils.DEFAULT_TLSV13_CIPHER_SUITES     // Catch: java.lang.Throwable -> L50
            int r10 = r9.length     // Catch: java.lang.Throwable -> L50
            r0 = 0
        L68:
            if (r0 >= r10) goto L75
            r1 = r9[r0]     // Catch: java.lang.Throwable -> L50
            r7.remove(r1)     // Catch: java.lang.Throwable -> L50
            r8.remove(r1)     // Catch: java.lang.Throwable -> L50
            int r0 = r0 + 1
            goto L68
        L75:
            io.netty.util.ReferenceCountUtil.release(r3)
            r3 = r7
            r7 = r8
        L7a:
            java.lang.String r8 = "cipherFilter"
            java.lang.Object r6 = io.netty.util.internal.ObjectUtil.checkNotNull(r6, r8)
            io.netty.handler.ssl.CipherSuiteFilter r6 = (io.netty.handler.ssl.CipherSuiteFilter) r6
            java.lang.String[] r3 = r6.filterCipherSuites(r5, r7, r3)
            r2.cipherSuites = r3
            java.util.List r3 = java.util.Arrays.asList(r3)
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r2.unmodifiableCipherSuites = r3
            r2.isClient = r4
            return
        L95:
            io.netty.util.ReferenceCountUtil.release(r3)
            throw r4
    }

    @java.lang.Deprecated
    protected static javax.net.ssl.KeyManagerFactory buildKeyManagerFactory(java.io.File r1, java.io.File r2, java.lang.String r3, javax.net.ssl.KeyManagerFactory r4) throws java.security.UnrecoverableKeyException, java.security.KeyStoreException, java.security.NoSuchAlgorithmException, javax.crypto.NoSuchPaddingException, java.security.spec.InvalidKeySpecException, java.security.InvalidAlgorithmParameterException, java.security.cert.CertificateException, java.security.KeyException, java.io.IOException {
            java.lang.String r0 = java.security.KeyStore.getDefaultType()
            javax.net.ssl.KeyManagerFactory r1 = buildKeyManagerFactory(r1, r2, r3, r4, r0)
            return r1
    }

    static javax.net.ssl.KeyManagerFactory buildKeyManagerFactory(java.io.File r7, java.io.File r8, java.lang.String r9, javax.net.ssl.KeyManagerFactory r10, java.lang.String r11) throws java.security.UnrecoverableKeyException, java.security.KeyStoreException, java.security.NoSuchAlgorithmException, javax.crypto.NoSuchPaddingException, java.security.spec.InvalidKeySpecException, java.security.InvalidAlgorithmParameterException, java.security.cert.CertificateException, java.security.KeyException, java.io.IOException {
            java.lang.String r0 = "ssl.KeyManagerFactory.algorithm"
            java.lang.String r0 = java.security.Security.getProperty(r0)
            if (r0 != 0) goto La
            java.lang.String r0 = "SunX509"
        La:
            r1 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r2 = r0
            javax.net.ssl.KeyManagerFactory r7 = buildKeyManagerFactory(r1, r2, r3, r4, r5, r6)
            return r7
    }

    @java.lang.Deprecated
    protected static javax.net.ssl.KeyManagerFactory buildKeyManagerFactory(java.io.File r6, java.lang.String r7, java.io.File r8, java.lang.String r9, javax.net.ssl.KeyManagerFactory r10) throws java.security.KeyStoreException, java.security.NoSuchAlgorithmException, javax.crypto.NoSuchPaddingException, java.security.spec.InvalidKeySpecException, java.security.InvalidAlgorithmParameterException, java.io.IOException, java.security.cert.CertificateException, java.security.KeyException, java.security.UnrecoverableKeyException {
            java.security.cert.X509Certificate[] r0 = io.netty.handler.ssl.SslContext.toX509Certificates(r6)
            java.security.PrivateKey r2 = io.netty.handler.ssl.SslContext.toPrivateKey(r8, r9)
            java.lang.String r5 = java.security.KeyStore.getDefaultType()
            r1 = r7
            r3 = r9
            r4 = r10
            javax.net.ssl.KeyManagerFactory r6 = io.netty.handler.ssl.SslContext.buildKeyManagerFactory(r0, r1, r2, r3, r4, r5)
            return r6
    }

    static javax.net.ssl.KeyManagerFactory buildKeyManagerFactory(java.io.File r0, java.lang.String r1, java.io.File r2, java.lang.String r3, javax.net.ssl.KeyManagerFactory r4, java.lang.String r5) throws java.security.KeyStoreException, java.security.NoSuchAlgorithmException, javax.crypto.NoSuchPaddingException, java.security.spec.InvalidKeySpecException, java.security.InvalidAlgorithmParameterException, java.io.IOException, java.security.cert.CertificateException, java.security.KeyException, java.security.UnrecoverableKeyException {
            java.security.cert.X509Certificate[] r0 = io.netty.handler.ssl.SslContext.toX509Certificates(r0)
            java.security.PrivateKey r2 = io.netty.handler.ssl.SslContext.toPrivateKey(r2, r3)
            javax.net.ssl.KeyManagerFactory r0 = io.netty.handler.ssl.SslContext.buildKeyManagerFactory(r0, r1, r2, r3, r4, r5)
            return r0
    }

    private javax.net.ssl.SSLEngine configureAndWrapEngine(javax.net.ssl.SSLEngine r4, io.netty.buffer.ByteBufAllocator r5) {
            r3 = this;
            java.lang.String[] r0 = r3.cipherSuites
            r4.setEnabledCipherSuites(r0)
            java.lang.String[] r0 = r3.protocols
            r4.setEnabledProtocols(r0)
            boolean r0 = r3.isClient()
            r4.setUseClientMode(r0)
            boolean r0 = r3.isServer()
            if (r0 == 0) goto L4b
            int[] r0 = io.netty.handler.ssl.JdkSslContext.AnonymousClass1.$SwitchMap$io$netty$handler$ssl$ClientAuth
            io.netty.handler.ssl.ClientAuth r1 = r3.clientAuth
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L48
            r2 = 2
            if (r0 == r2) goto L44
            r1 = 3
            if (r0 != r1) goto L2b
            goto L4b
        L2b:
            java.lang.Error r4 = new java.lang.Error
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Unknown auth "
            r5.append(r0)
            io.netty.handler.ssl.ClientAuth r0 = r3.clientAuth
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L44:
            r4.setNeedClientAuth(r1)
            goto L4b
        L48:
            r4.setWantClientAuth(r1)
        L4b:
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator r0 = r3.apn
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator$SslEngineWrapperFactory r0 = r0.wrapperFactory()
            boolean r1 = r0 instanceof io.netty.handler.ssl.JdkApplicationProtocolNegotiator.AllocatorAwareSslEngineWrapperFactory
            if (r1 == 0) goto L62
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator$AllocatorAwareSslEngineWrapperFactory r0 = (io.netty.handler.ssl.JdkApplicationProtocolNegotiator.AllocatorAwareSslEngineWrapperFactory) r0
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator r1 = r3.apn
            boolean r2 = r3.isServer()
            javax.net.ssl.SSLEngine r4 = r0.wrapSslEngine(r4, r5, r1, r2)
            return r4
        L62:
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator r5 = r3.apn
            boolean r1 = r3.isServer()
            javax.net.ssl.SSLEngine r4 = r0.wrapSslEngine(r4, r5, r1)
            return r4
    }

    private static java.util.List<java.lang.String> defaultCiphers(javax.net.ssl.SSLEngine r2, java.util.Set<java.lang.String> r3) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String[] r1 = io.netty.handler.ssl.SslUtils.DEFAULT_CIPHER_SUITES
            io.netty.handler.ssl.SslUtils.addIfSupported(r3, r0, r1)
            java.lang.String[] r2 = r2.getEnabledCipherSuites()
            io.netty.handler.ssl.SslUtils.useFallbackCiphersIfDefaultIsEmpty(r0, r2)
            return r0
    }

    private static java.lang.String[] defaultProtocols(javax.net.ssl.SSLEngine r5) {
            java.lang.String[] r0 = r5.getSupportedProtocols()
            java.util.HashSet r1 = new java.util.HashSet
            int r2 = r0.length
            r1.<init>(r2)
            java.util.Collections.addAll(r1, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r2 = "TLSv1.1"
            java.lang.String r3 = "TLSv1"
            java.lang.String r4 = "TLSv1.2"
            java.lang.String[] r2 = new java.lang.String[]{r4, r2, r3}
            io.netty.handler.ssl.SslUtils.addIfSupported(r1, r0, r2)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L2f
            r5 = 0
            java.lang.String[] r5 = new java.lang.String[r5]
            java.lang.Object[] r5 = r0.toArray(r5)
            java.lang.String[] r5 = (java.lang.String[]) r5
            return r5
        L2f:
            java.lang.String[] r5 = r5.getEnabledProtocols()
            return r5
    }

    private static boolean isTlsV13Supported(java.lang.String[] r5) {
            int r0 = r5.length
            r1 = 0
            r2 = 0
        L3:
            if (r2 >= r0) goto L14
            r3 = r5[r2]
            java.lang.String r4 = "TLSv1.3"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L11
            r5 = 1
            return r5
        L11:
            int r2 = r2 + 1
            goto L3
        L14:
            return r1
    }

    private static java.util.Set<java.lang.String> supportedCiphers(javax.net.ssl.SSLEngine r6) {
            java.lang.String[] r0 = r6.getSupportedCipherSuites()
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            int r2 = r0.length
            r1.<init>(r2)
            r2 = 0
        Lb:
            int r3 = r0.length
            if (r2 >= r3) goto L3e
            r3 = r0[r2]
            r1.add(r3)
            java.lang.String r4 = "SSL_"
            boolean r4 = r3.startsWith(r4)
            if (r4 == 0) goto L3b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "TLS_"
            r4.append(r5)
            r5 = 4
            java.lang.String r3 = r3.substring(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String[] r4 = new java.lang.String[]{r3}     // Catch: java.lang.IllegalArgumentException -> L3b
            r6.setEnabledCipherSuites(r4)     // Catch: java.lang.IllegalArgumentException -> L3b
            r1.add(r3)     // Catch: java.lang.IllegalArgumentException -> L3b
        L3b:
            int r2 = r2 + 1
            goto Lb
        L3e:
            return r1
    }

    static io.netty.handler.ssl.JdkApplicationProtocolNegotiator toNegotiator(io.netty.handler.ssl.ApplicationProtocolConfig r7, boolean r8) {
            if (r7 != 0) goto L5
            io.netty.handler.ssl.JdkDefaultApplicationProtocolNegotiator r7 = io.netty.handler.ssl.JdkDefaultApplicationProtocolNegotiator.INSTANCE
            return r7
        L5:
            int[] r0 = io.netty.handler.ssl.JdkSslContext.AnonymousClass1.$SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$Protocol
            io.netty.handler.ssl.ApplicationProtocolConfig$Protocol r1 = r7.protocol()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L132
            r2 = 0
            java.lang.String r3 = " failure behavior"
            java.lang.String r4 = "JDK provider does not support "
            r5 = 2
            if (r0 == r5) goto Lb6
            r6 = 3
            if (r0 != r6) goto L9b
            if (r8 == 0) goto L5e
            int[] r8 = io.netty.handler.ssl.JdkSslContext.AnonymousClass1.$SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$SelectedListenerFailureBehavior
            io.netty.handler.ssl.ApplicationProtocolConfig$SelectedListenerFailureBehavior r0 = r7.selectedListenerFailureBehavior()
            int r0 = r0.ordinal()
            r8 = r8[r0]
            if (r8 == r1) goto L54
            if (r8 != r5) goto L3b
            io.netty.handler.ssl.JdkNpnApplicationProtocolNegotiator r8 = new io.netty.handler.ssl.JdkNpnApplicationProtocolNegotiator
            java.util.List r7 = r7.supportedProtocols()
            r8.<init>(r1, r7)
            return r8
        L3b:
            java.lang.UnsupportedOperationException r8 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            io.netty.handler.ssl.ApplicationProtocolConfig$SelectedListenerFailureBehavior r7 = r7.selectedListenerFailureBehavior()
            r0.append(r7)
            r0.append(r3)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            throw r8
        L54:
            io.netty.handler.ssl.JdkNpnApplicationProtocolNegotiator r8 = new io.netty.handler.ssl.JdkNpnApplicationProtocolNegotiator
            java.util.List r7 = r7.supportedProtocols()
            r8.<init>(r2, r7)
            return r8
        L5e:
            int[] r8 = io.netty.handler.ssl.JdkSslContext.AnonymousClass1.$SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$SelectorFailureBehavior
            io.netty.handler.ssl.ApplicationProtocolConfig$SelectorFailureBehavior r0 = r7.selectorFailureBehavior()
            int r0 = r0.ordinal()
            r8 = r8[r0]
            if (r8 == r1) goto L91
            if (r8 != r5) goto L78
            io.netty.handler.ssl.JdkNpnApplicationProtocolNegotiator r8 = new io.netty.handler.ssl.JdkNpnApplicationProtocolNegotiator
            java.util.List r7 = r7.supportedProtocols()
            r8.<init>(r2, r7)
            return r8
        L78:
            java.lang.UnsupportedOperationException r8 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            io.netty.handler.ssl.ApplicationProtocolConfig$SelectorFailureBehavior r7 = r7.selectorFailureBehavior()
            r0.append(r7)
            r0.append(r3)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            throw r8
        L91:
            io.netty.handler.ssl.JdkNpnApplicationProtocolNegotiator r8 = new io.netty.handler.ssl.JdkNpnApplicationProtocolNegotiator
            java.util.List r7 = r7.supportedProtocols()
            r8.<init>(r1, r7)
            return r8
        L9b:
            java.lang.UnsupportedOperationException r8 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            io.netty.handler.ssl.ApplicationProtocolConfig$Protocol r7 = r7.protocol()
            r0.append(r7)
            java.lang.String r7 = " protocol"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            throw r8
        Lb6:
            if (r8 == 0) goto Lf5
            int[] r8 = io.netty.handler.ssl.JdkSslContext.AnonymousClass1.$SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$SelectorFailureBehavior
            io.netty.handler.ssl.ApplicationProtocolConfig$SelectorFailureBehavior r0 = r7.selectorFailureBehavior()
            int r0 = r0.ordinal()
            r8 = r8[r0]
            if (r8 == r1) goto Leb
            if (r8 != r5) goto Ld2
            io.netty.handler.ssl.JdkAlpnApplicationProtocolNegotiator r8 = new io.netty.handler.ssl.JdkAlpnApplicationProtocolNegotiator
            java.util.List r7 = r7.supportedProtocols()
            r8.<init>(r2, r7)
            return r8
        Ld2:
            java.lang.UnsupportedOperationException r8 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            io.netty.handler.ssl.ApplicationProtocolConfig$SelectorFailureBehavior r7 = r7.selectorFailureBehavior()
            r0.append(r7)
            r0.append(r3)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            throw r8
        Leb:
            io.netty.handler.ssl.JdkAlpnApplicationProtocolNegotiator r8 = new io.netty.handler.ssl.JdkAlpnApplicationProtocolNegotiator
            java.util.List r7 = r7.supportedProtocols()
            r8.<init>(r1, r7)
            return r8
        Lf5:
            int[] r8 = io.netty.handler.ssl.JdkSslContext.AnonymousClass1.$SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$SelectedListenerFailureBehavior
            io.netty.handler.ssl.ApplicationProtocolConfig$SelectedListenerFailureBehavior r0 = r7.selectedListenerFailureBehavior()
            int r0 = r0.ordinal()
            r8 = r8[r0]
            if (r8 == r1) goto L128
            if (r8 != r5) goto L10f
            io.netty.handler.ssl.JdkAlpnApplicationProtocolNegotiator r8 = new io.netty.handler.ssl.JdkAlpnApplicationProtocolNegotiator
            java.util.List r7 = r7.supportedProtocols()
            r8.<init>(r1, r7)
            return r8
        L10f:
            java.lang.UnsupportedOperationException r8 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            io.netty.handler.ssl.ApplicationProtocolConfig$SelectedListenerFailureBehavior r7 = r7.selectedListenerFailureBehavior()
            r0.append(r7)
            r0.append(r3)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            throw r8
        L128:
            io.netty.handler.ssl.JdkAlpnApplicationProtocolNegotiator r8 = new io.netty.handler.ssl.JdkAlpnApplicationProtocolNegotiator
            java.util.List r7 = r7.supportedProtocols()
            r8.<init>(r2, r7)
            return r8
        L132:
            io.netty.handler.ssl.JdkDefaultApplicationProtocolNegotiator r7 = io.netty.handler.ssl.JdkDefaultApplicationProtocolNegotiator.INSTANCE
            return r7
    }

    @Override // io.netty.handler.ssl.SslContext
    public /* bridge */ /* synthetic */ io.netty.handler.ssl.ApplicationProtocolNegotiator applicationProtocolNegotiator() {
            r1 = this;
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator r0 = r1.applicationProtocolNegotiator()
            return r0
    }

    @Override // io.netty.handler.ssl.SslContext
    public final io.netty.handler.ssl.JdkApplicationProtocolNegotiator applicationProtocolNegotiator() {
            r1 = this;
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator r0 = r1.apn
            return r0
    }

    @Override // io.netty.handler.ssl.SslContext
    public final java.util.List<java.lang.String> cipherSuites() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.unmodifiableCipherSuites
            return r0
    }

    public final javax.net.ssl.SSLContext context() {
            r1 = this;
            javax.net.ssl.SSLContext r0 = r1.sslContext
            return r0
    }

    @Override // io.netty.handler.ssl.SslContext
    public final boolean isClient() {
            r1 = this;
            boolean r0 = r1.isClient
            return r0
    }

    @Override // io.netty.handler.ssl.SslContext
    public final javax.net.ssl.SSLEngine newEngine(io.netty.buffer.ByteBufAllocator r2) {
            r1 = this;
            javax.net.ssl.SSLContext r0 = r1.context()
            javax.net.ssl.SSLEngine r0 = r0.createSSLEngine()
            javax.net.ssl.SSLEngine r2 = r1.configureAndWrapEngine(r0, r2)
            return r2
    }

    @Override // io.netty.handler.ssl.SslContext
    public final javax.net.ssl.SSLEngine newEngine(io.netty.buffer.ByteBufAllocator r2, java.lang.String r3, int r4) {
            r1 = this;
            javax.net.ssl.SSLContext r0 = r1.context()
            javax.net.ssl.SSLEngine r3 = r0.createSSLEngine(r3, r4)
            javax.net.ssl.SSLEngine r2 = r1.configureAndWrapEngine(r3, r2)
            return r2
    }

    @Override // io.netty.handler.ssl.SslContext
    public final long sessionCacheSize() {
            r2 = this;
            javax.net.ssl.SSLSessionContext r0 = r2.sessionContext()
            int r0 = r0.getSessionCacheSize()
            long r0 = (long) r0
            return r0
    }

    @Override // io.netty.handler.ssl.SslContext
    public final javax.net.ssl.SSLSessionContext sessionContext() {
            r1 = this;
            boolean r0 = r1.isServer()
            if (r0 == 0) goto Lf
            javax.net.ssl.SSLContext r0 = r1.context()
            javax.net.ssl.SSLSessionContext r0 = r0.getServerSessionContext()
            return r0
        Lf:
            javax.net.ssl.SSLContext r0 = r1.context()
            javax.net.ssl.SSLSessionContext r0 = r0.getClientSessionContext()
            return r0
    }

    @Override // io.netty.handler.ssl.SslContext
    public final long sessionTimeout() {
            r2 = this;
            javax.net.ssl.SSLSessionContext r0 = r2.sessionContext()
            int r0 = r0.getSessionTimeout()
            long r0 = (long) r0
            return r0
    }
}
