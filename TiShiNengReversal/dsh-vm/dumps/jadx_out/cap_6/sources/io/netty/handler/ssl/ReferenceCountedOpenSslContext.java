package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class ReferenceCountedOpenSslContext extends io.netty.handler.ssl.SslContext implements io.netty.util.ReferenceCounted {
    private static final int DEFAULT_BIO_NON_APPLICATION_BUFFER_SIZE = 0;
    private static final java.lang.Integer DH_KEY_LENGTH = null;
    static final io.netty.handler.ssl.OpenSslApplicationProtocolNegotiator NONE_PROTOCOL_NEGOTIATOR = null;
    static final boolean USE_TASKS = false;
    protected static final int VERIFY_DEPTH = 10;
    private static final io.netty.util.ResourceLeakDetector<io.netty.handler.ssl.ReferenceCountedOpenSslContext> leakDetector = null;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private final io.netty.handler.ssl.OpenSslApplicationProtocolNegotiator apn;
    private volatile int bioNonApplicationBufferSize;
    final io.netty.handler.ssl.ClientAuth clientAuth;
    protected long ctx;
    final java.util.concurrent.locks.ReadWriteLock ctxLock;
    final boolean enableOcsp;
    final io.netty.handler.ssl.OpenSslEngineMap engineMap;
    final java.security.cert.Certificate[] keyCertChain;
    private final io.netty.util.ResourceLeakTracker<io.netty.handler.ssl.ReferenceCountedOpenSslContext> leak;
    private final int mode;
    final java.lang.String[] protocols;
    private final io.netty.util.AbstractReferenceCounted refCnt;
    private final long sessionCacheSize;
    private final long sessionTimeout;
    private final java.util.List<java.lang.String> unmodifiableCiphers;





    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.ssl.ReferenceCountedOpenSslContext$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$Protocol = null;
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$SelectedListenerFailureBehavior = null;
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$SelectorFailureBehavior = null;

        static {
                io.netty.handler.ssl.ApplicationProtocolConfig$SelectedListenerFailureBehavior[] r0 = io.netty.handler.ssl.ApplicationProtocolConfig.SelectedListenerFailureBehavior.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.handler.ssl.ReferenceCountedOpenSslContext.AnonymousClass5.$SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$SelectedListenerFailureBehavior = r0
                r1 = 1
                io.netty.handler.ssl.ApplicationProtocolConfig$SelectedListenerFailureBehavior r2 = io.netty.handler.ssl.ApplicationProtocolConfig.SelectedListenerFailureBehavior.CHOOSE_MY_LAST_PROTOCOL     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = io.netty.handler.ssl.ReferenceCountedOpenSslContext.AnonymousClass5.$SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$SelectedListenerFailureBehavior     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.handler.ssl.ApplicationProtocolConfig$SelectedListenerFailureBehavior r3 = io.netty.handler.ssl.ApplicationProtocolConfig.SelectedListenerFailureBehavior.ACCEPT     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                io.netty.handler.ssl.ApplicationProtocolConfig$SelectorFailureBehavior[] r2 = io.netty.handler.ssl.ApplicationProtocolConfig.SelectorFailureBehavior.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                io.netty.handler.ssl.ReferenceCountedOpenSslContext.AnonymousClass5.$SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$SelectorFailureBehavior = r2
                io.netty.handler.ssl.ApplicationProtocolConfig$SelectorFailureBehavior r3 = io.netty.handler.ssl.ApplicationProtocolConfig.SelectorFailureBehavior.NO_ADVERTISE     // Catch: java.lang.NoSuchFieldError -> L2e
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2e
                r2[r3] = r1     // Catch: java.lang.NoSuchFieldError -> L2e
            L2e:
                int[] r2 = io.netty.handler.ssl.ReferenceCountedOpenSslContext.AnonymousClass5.$SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$SelectorFailureBehavior     // Catch: java.lang.NoSuchFieldError -> L38
                io.netty.handler.ssl.ApplicationProtocolConfig$SelectorFailureBehavior r3 = io.netty.handler.ssl.ApplicationProtocolConfig.SelectorFailureBehavior.CHOOSE_MY_LAST_PROTOCOL     // Catch: java.lang.NoSuchFieldError -> L38
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L38
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L38
            L38:
                io.netty.handler.ssl.ApplicationProtocolConfig$Protocol[] r2 = io.netty.handler.ssl.ApplicationProtocolConfig.Protocol.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                io.netty.handler.ssl.ReferenceCountedOpenSslContext.AnonymousClass5.$SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$Protocol = r2
                io.netty.handler.ssl.ApplicationProtocolConfig$Protocol r3 = io.netty.handler.ssl.ApplicationProtocolConfig.Protocol.NPN     // Catch: java.lang.NoSuchFieldError -> L49
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2[r3] = r1     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r1 = io.netty.handler.ssl.ReferenceCountedOpenSslContext.AnonymousClass5.$SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$Protocol     // Catch: java.lang.NoSuchFieldError -> L53
                io.netty.handler.ssl.ApplicationProtocolConfig$Protocol r2 = io.netty.handler.ssl.ApplicationProtocolConfig.Protocol.ALPN     // Catch: java.lang.NoSuchFieldError -> L53
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L53
                r1[r2] = r0     // Catch: java.lang.NoSuchFieldError -> L53
            L53:
                int[] r0 = io.netty.handler.ssl.ReferenceCountedOpenSslContext.AnonymousClass5.$SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$Protocol     // Catch: java.lang.NoSuchFieldError -> L5e
                io.netty.handler.ssl.ApplicationProtocolConfig$Protocol r1 = io.netty.handler.ssl.ApplicationProtocolConfig.Protocol.NPN_AND_ALPN     // Catch: java.lang.NoSuchFieldError -> L5e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5e
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5e
            L5e:
                int[] r0 = io.netty.handler.ssl.ReferenceCountedOpenSslContext.AnonymousClass5.$SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$Protocol     // Catch: java.lang.NoSuchFieldError -> L69
                io.netty.handler.ssl.ApplicationProtocolConfig$Protocol r1 = io.netty.handler.ssl.ApplicationProtocolConfig.Protocol.NONE     // Catch: java.lang.NoSuchFieldError -> L69
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L69
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L69
            L69:
                return
        }

        public AnonymousClass5() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static abstract class AbstractCertificateVerifier extends io.netty.internal.tcnative.CertificateVerifier {
        private final io.netty.handler.ssl.OpenSslEngineMap engineMap;

        AbstractCertificateVerifier(io.netty.handler.ssl.OpenSslEngineMap r1) {
                r0 = this;
                r0.<init>()
                r0.engineMap = r1
                return
        }

        public final int verify(long r2, byte[][] r4, java.lang.String r5) {
                r1 = this;
                java.security.cert.X509Certificate[] r4 = io.netty.handler.ssl.ReferenceCountedOpenSslContext.certificates(r4)
                io.netty.handler.ssl.OpenSslEngineMap r0 = r1.engineMap
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine r2 = r0.get(r2)
                r1.verify(r2, r4, r5)     // Catch: java.lang.Throwable -> L10
                int r2 = io.netty.internal.tcnative.CertificateVerifier.X509_V_OK     // Catch: java.lang.Throwable -> L10
                return r2
            L10:
                r3 = move-exception
                io.netty.util.internal.logging.InternalLogger r4 = io.netty.handler.ssl.ReferenceCountedOpenSslContext.access$300()
                java.lang.String r5 = "verification of certificate failed"
                r4.debug(r5, r3)
                r2.initHandshakeException(r3)
                boolean r2 = r3 instanceof io.netty.handler.ssl.OpenSslCertificateException
                if (r2 == 0) goto L28
                io.netty.handler.ssl.OpenSslCertificateException r3 = (io.netty.handler.ssl.OpenSslCertificateException) r3
                int r2 = r3.errorCode()
                return r2
            L28:
                boolean r2 = r3 instanceof java.security.cert.CertificateExpiredException
                if (r2 == 0) goto L2f
                int r2 = io.netty.internal.tcnative.CertificateVerifier.X509_V_ERR_CERT_HAS_EXPIRED
                return r2
            L2f:
                boolean r2 = r3 instanceof java.security.cert.CertificateNotYetValidException
                if (r2 == 0) goto L36
                int r2 = io.netty.internal.tcnative.CertificateVerifier.X509_V_ERR_CERT_NOT_YET_VALID
                return r2
            L36:
                int r2 = io.netty.util.internal.PlatformDependent.javaVersion()
                r4 = 7
                if (r2 < r4) goto L77
                boolean r2 = io.netty.handler.ssl.a0.a(r3)
                if (r2 == 0) goto L46
                int r2 = io.netty.internal.tcnative.CertificateVerifier.X509_V_ERR_CERT_REVOKED
                return r2
            L46:
                java.lang.Throwable r2 = r3.getCause()
            L4a:
                if (r2 == 0) goto L77
                boolean r3 = r2 instanceof java.security.cert.CertPathValidatorException
                if (r3 == 0) goto L72
                r3 = r2
                java.security.cert.CertPathValidatorException r3 = (java.security.cert.CertPathValidatorException) r3
                java.security.cert.CertPathValidatorException$Reason r3 = io.netty.handler.ssl.b0.a(r3)
                java.security.cert.CertPathValidatorException$BasicReason r4 = io.netty.handler.ssl.c0.a()
                if (r3 != r4) goto L60
                int r2 = io.netty.internal.tcnative.CertificateVerifier.X509_V_ERR_CERT_HAS_EXPIRED
                return r2
            L60:
                java.security.cert.CertPathValidatorException$BasicReason r4 = io.netty.handler.ssl.d0.a()
                if (r3 != r4) goto L69
                int r2 = io.netty.internal.tcnative.CertificateVerifier.X509_V_ERR_CERT_NOT_YET_VALID
                return r2
            L69:
                java.security.cert.CertPathValidatorException$BasicReason r4 = io.netty.handler.ssl.e0.a()
                if (r3 != r4) goto L72
                int r2 = io.netty.internal.tcnative.CertificateVerifier.X509_V_ERR_CERT_REVOKED
                return r2
            L72:
                java.lang.Throwable r2 = r2.getCause()
                goto L4a
            L77:
                int r2 = io.netty.internal.tcnative.CertificateVerifier.X509_V_ERR_UNSPECIFIED
                return r2
        }

        abstract void verify(io.netty.handler.ssl.ReferenceCountedOpenSslEngine r1, java.security.cert.X509Certificate[] r2, java.lang.String r3) throws java.lang.Exception;
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class DefaultOpenSslEngineMap implements io.netty.handler.ssl.OpenSslEngineMap {
        private final java.util.Map<java.lang.Long, io.netty.handler.ssl.ReferenceCountedOpenSslEngine> engines;

        private DefaultOpenSslEngineMap() {
                r1 = this;
                r1.<init>()
                java.util.concurrent.ConcurrentMap r0 = io.netty.util.internal.PlatformDependent.newConcurrentHashMap()
                r1.engines = r0
                return
        }

        /* synthetic */ DefaultOpenSslEngineMap(io.netty.handler.ssl.ReferenceCountedOpenSslContext.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // io.netty.handler.ssl.OpenSslEngineMap
        public void add(io.netty.handler.ssl.ReferenceCountedOpenSslEngine r4) {
                r3 = this;
                java.util.Map<java.lang.Long, io.netty.handler.ssl.ReferenceCountedOpenSslEngine> r0 = r3.engines
                long r1 = r4.sslPointer()
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r0.put(r1, r4)
                return
        }

        @Override // io.netty.handler.ssl.OpenSslEngineMap
        public io.netty.handler.ssl.ReferenceCountedOpenSslEngine get(long r2) {
                r1 = this;
                java.util.Map<java.lang.Long, io.netty.handler.ssl.ReferenceCountedOpenSslEngine> r0 = r1.engines
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                java.lang.Object r2 = r0.get(r2)
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine r2 = (io.netty.handler.ssl.ReferenceCountedOpenSslEngine) r2
                return r2
        }

        @Override // io.netty.handler.ssl.OpenSslEngineMap
        public io.netty.handler.ssl.ReferenceCountedOpenSslEngine remove(long r2) {
                r1 = this;
                java.util.Map<java.lang.Long, io.netty.handler.ssl.ReferenceCountedOpenSslEngine> r0 = r1.engines
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                java.lang.Object r2 = r0.remove(r2)
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine r2 = (io.netty.handler.ssl.ReferenceCountedOpenSslEngine) r2
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class PrivateKeyMethod implements io.netty.internal.tcnative.SSLPrivateKeyMethod {
        private final io.netty.handler.ssl.OpenSslEngineMap engineMap;
        private final io.netty.handler.ssl.OpenSslPrivateKeyMethod keyMethod;

        PrivateKeyMethod(io.netty.handler.ssl.OpenSslEngineMap r1, io.netty.handler.ssl.OpenSslPrivateKeyMethod r2) {
                r0 = this;
                r0.<init>()
                r0.engineMap = r1
                r0.keyMethod = r2
                return
        }

        private io.netty.handler.ssl.ReferenceCountedOpenSslEngine retrieveEngine(long r4) throws javax.net.ssl.SSLException {
                r3 = this;
                io.netty.handler.ssl.OpenSslEngineMap r0 = r3.engineMap
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine r0 = r0.get(r4)
                if (r0 == 0) goto L9
                return r0
            L9:
                javax.net.ssl.SSLException r0 = new javax.net.ssl.SSLException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Could not find a "
                r1.append(r2)
                java.lang.Class<io.netty.handler.ssl.ReferenceCountedOpenSslEngine> r2 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.class
                java.lang.String r2 = io.netty.util.internal.StringUtil.simpleClassName(r2)
                r1.append(r2)
                java.lang.String r2 = " for sslPointer "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        private static byte[] verifyResult(byte[] r0) throws java.security.SignatureException {
                if (r0 == 0) goto L3
                return r0
            L3:
                java.security.SignatureException r0 = new java.security.SignatureException
                r0.<init>()
                throw r0
        }

        public byte[] decrypt(long r1, byte[] r3) throws java.lang.Exception {
                r0 = this;
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine r1 = r0.retrieveEngine(r1)
                io.netty.handler.ssl.OpenSslPrivateKeyMethod r2 = r0.keyMethod     // Catch: java.lang.Exception -> Lf
                byte[] r2 = r2.decrypt(r1, r3)     // Catch: java.lang.Exception -> Lf
                byte[] r1 = verifyResult(r2)     // Catch: java.lang.Exception -> Lf
                return r1
            Lf:
                r2 = move-exception
                r1.initHandshakeException(r2)
                throw r2
        }

        public byte[] sign(long r1, int r3, byte[] r4) throws java.lang.Exception {
                r0 = this;
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine r1 = r0.retrieveEngine(r1)
                io.netty.handler.ssl.OpenSslPrivateKeyMethod r2 = r0.keyMethod     // Catch: java.lang.Exception -> Lf
                byte[] r2 = r2.sign(r1, r3, r4)     // Catch: java.lang.Exception -> Lf
                byte[] r1 = verifyResult(r2)     // Catch: java.lang.Exception -> Lf
                return r1
            Lf:
                r2 = move-exception
                r1.initHandshakeException(r2)
                throw r2
        }
    }

    static {
            java.lang.Class<io.netty.handler.ssl.ReferenceCountedOpenSslContext> r0 = io.netty.handler.ssl.ReferenceCountedOpenSslContext.class
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.handler.ssl.ReferenceCountedOpenSslContext.logger = r1
            io.netty.handler.ssl.ReferenceCountedOpenSslContext$1 r1 = new io.netty.handler.ssl.ReferenceCountedOpenSslContext$1
            r1.<init>()
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            io.netty.handler.ssl.ReferenceCountedOpenSslContext.DEFAULT_BIO_NON_APPLICATION_BUFFER_SIZE = r1
            java.lang.String r1 = "io.netty.handler.ssl.openssl.useTasks"
            r2 = 0
            boolean r1 = io.netty.util.internal.SystemPropertyUtil.getBoolean(r1, r2)
            io.netty.handler.ssl.ReferenceCountedOpenSslContext.USE_TASKS = r1
            io.netty.util.ResourceLeakDetectorFactory r1 = io.netty.util.ResourceLeakDetectorFactory.instance()
            io.netty.util.ResourceLeakDetector r0 = r1.newResourceLeakDetector(r0)
            io.netty.handler.ssl.ReferenceCountedOpenSslContext.leakDetector = r0
            io.netty.handler.ssl.ReferenceCountedOpenSslContext$3 r0 = new io.netty.handler.ssl.ReferenceCountedOpenSslContext$3
            r0.<init>()
            io.netty.handler.ssl.ReferenceCountedOpenSslContext.NONE_PROTOCOL_NEGOTIATOR = r0
            r0 = 0
            io.netty.handler.ssl.ReferenceCountedOpenSslContext$4 r1 = new io.netty.handler.ssl.ReferenceCountedOpenSslContext$4     // Catch: java.lang.Throwable -> L5c
            r1.<init>()     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L5c
            if (r1 == 0) goto L5c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.NumberFormatException -> L46 java.lang.Throwable -> L5c
            goto L5c
        L46:
            io.netty.util.internal.logging.InternalLogger r2 = io.netty.handler.ssl.ReferenceCountedOpenSslContext.logger     // Catch: java.lang.Throwable -> L5c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
            r3.<init>()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r4 = "ReferenceCountedOpenSslContext supports -Djdk.tls.ephemeralDHKeySize={int}, but got: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L5c
            r3.append(r1)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L5c
            r2.debug(r1)     // Catch: java.lang.Throwable -> L5c
        L5c:
            io.netty.handler.ssl.ReferenceCountedOpenSslContext.DH_KEY_LENGTH = r0
            return
    }

    ReferenceCountedOpenSslContext(java.lang.Iterable<java.lang.String> r16, io.netty.handler.ssl.CipherSuiteFilter r17, io.netty.handler.ssl.ApplicationProtocolConfig r18, long r19, long r21, int r23, java.security.cert.Certificate[] r24, io.netty.handler.ssl.ClientAuth r25, java.lang.String[] r26, boolean r27, boolean r28, boolean r29) throws javax.net.ssl.SSLException {
            r15 = this;
            io.netty.handler.ssl.OpenSslApplicationProtocolNegotiator r3 = toNegotiator(r18)
            r0 = r15
            r1 = r16
            r2 = r17
            r4 = r19
            r6 = r21
            r8 = r23
            r9 = r24
            r10 = r25
            r11 = r26
            r12 = r27
            r13 = r28
            r14 = r29
            r0.<init>(r1, r2, r3, r4, r6, r8, r9, r10, r11, r12, r13, r14)
            return
    }

    ReferenceCountedOpenSslContext(java.lang.Iterable<java.lang.String> r10, io.netty.handler.ssl.CipherSuiteFilter r11, io.netty.handler.ssl.OpenSslApplicationProtocolNegotiator r12, long r13, long r15, int r17, java.security.cert.Certificate[] r18, io.netty.handler.ssl.ClientAuth r19, java.lang.String[] r20, boolean r21, boolean r22, boolean r23) throws javax.net.ssl.SSLException {
            r9 = this;
            r0 = r17
            r1 = r22
            java.lang.String r2 = ""
            r3 = r21
            r9.<init>(r3)
            io.netty.handler.ssl.ReferenceCountedOpenSslContext$2 r3 = new io.netty.handler.ssl.ReferenceCountedOpenSslContext$2
            r3.<init>(r9)
            r9.refCnt = r3
            io.netty.handler.ssl.ReferenceCountedOpenSslContext$DefaultOpenSslEngineMap r3 = new io.netty.handler.ssl.ReferenceCountedOpenSslContext$DefaultOpenSslEngineMap
            r4 = 0
            r3.<init>(r4)
            r9.engineMap = r3
            java.util.concurrent.locks.ReentrantReadWriteLock r3 = new java.util.concurrent.locks.ReentrantReadWriteLock
            r3.<init>()
            r9.ctxLock = r3
            int r3 = io.netty.handler.ssl.ReferenceCountedOpenSslContext.DEFAULT_BIO_NON_APPLICATION_BUFFER_SIZE
            r9.bioNonApplicationBufferSize = r3
            io.netty.handler.ssl.OpenSsl.ensureAvailability()
            if (r1 == 0) goto L39
            boolean r3 = io.netty.handler.ssl.OpenSsl.isOcspSupported()
            if (r3 == 0) goto L31
            goto L39
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "OCSP is not supported."
            r10.<init>(r11)
            throw r10
        L39:
            r3 = 1
            if (r0 == r3) goto L47
            if (r0 != 0) goto L3f
            goto L47
        L3f:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "mode most be either SSL.SSL_MODE_SERVER or SSL.SSL_MODE_CLIENT"
            r10.<init>(r11)
            throw r10
        L47:
            if (r23 == 0) goto L50
            io.netty.util.ResourceLeakDetector<io.netty.handler.ssl.ReferenceCountedOpenSslContext> r5 = io.netty.handler.ssl.ReferenceCountedOpenSslContext.leakDetector
            io.netty.util.ResourceLeakTracker r5 = r5.track(r9)
            goto L51
        L50:
            r5 = r4
        L51:
            r9.leak = r5
            r9.mode = r0
            boolean r5 = r9.isServer()
            if (r5 == 0) goto L66
            java.lang.String r5 = "clientAuth"
            r6 = r19
            java.lang.Object r5 = io.netty.util.internal.ObjectUtil.checkNotNull(r6, r5)
            io.netty.handler.ssl.ClientAuth r5 = (io.netty.handler.ssl.ClientAuth) r5
            goto L68
        L66:
            io.netty.handler.ssl.ClientAuth r5 = io.netty.handler.ssl.ClientAuth.NONE
        L68:
            r9.clientAuth = r5
            r5 = r20
            r9.protocols = r5
            r9.enableOcsp = r1
            if (r18 != 0) goto L73
            goto L79
        L73:
            java.lang.Object r4 = r18.clone()
            java.security.cert.Certificate[] r4 = (java.security.cert.Certificate[]) r4
        L79:
            r9.keyCertChain = r4
            java.lang.String r4 = "cipherFilter"
            java.lang.Object r11 = io.netty.util.internal.ObjectUtil.checkNotNull(r11, r4)
            io.netty.handler.ssl.CipherSuiteFilter r11 = (io.netty.handler.ssl.CipherSuiteFilter) r11
            java.util.List<java.lang.String> r4 = io.netty.handler.ssl.OpenSsl.DEFAULT_CIPHERS
            java.util.Set r5 = io.netty.handler.ssl.OpenSsl.availableJavaCipherSuites()
            java.lang.String[] r10 = r11.filterCipherSuites(r10, r4, r5)
            java.util.List r10 = java.util.Arrays.asList(r10)
            r9.unmodifiableCiphers = r10
            java.lang.String r11 = "apn"
            java.lang.Object r11 = io.netty.util.internal.ObjectUtil.checkNotNull(r12, r11)
            io.netty.handler.ssl.OpenSslApplicationProtocolNegotiator r11 = (io.netty.handler.ssl.OpenSslApplicationProtocolNegotiator) r11
            r9.apn = r11
            boolean r11 = io.netty.handler.ssl.OpenSsl.isTlsv13Supported()     // Catch: java.lang.Throwable -> Ld0 java.lang.Exception -> L1e5
            if (r11 == 0) goto La6
            r11 = 62
            goto La8
        La6:
            r11 = 30
        La8:
            long r4 = io.netty.internal.tcnative.SSLContext.make(r11, r0)     // Catch: java.lang.Throwable -> Ld0 java.lang.Exception -> L1e5
            r9.ctx = r4     // Catch: java.lang.Throwable -> Ld0 java.lang.Exception -> L1e5
            boolean r11 = io.netty.handler.ssl.OpenSsl.isTlsv13Supported()     // Catch: java.lang.Throwable -> Ld0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld0
            r0.<init>()     // Catch: java.lang.Throwable -> Ld0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld0
            r4.<init>()     // Catch: java.lang.Throwable -> Ld0
            boolean r5 = r10.isEmpty()     // Catch: java.lang.Throwable -> Ld0 java.lang.Exception -> Ld4 javax.net.ssl.SSLException -> Ld8
            r6 = 0
            if (r5 == 0) goto Ldc
            long r4 = r9.ctx     // Catch: java.lang.Throwable -> Ld0 java.lang.Exception -> Ld4 javax.net.ssl.SSLException -> Ld8
            io.netty.internal.tcnative.SSLContext.setCipherSuite(r4, r2, r6)     // Catch: java.lang.Throwable -> Ld0 java.lang.Exception -> Ld4 javax.net.ssl.SSLException -> Ld8
            if (r11 == 0) goto Lf7
            long r10 = r9.ctx     // Catch: java.lang.Throwable -> Ld0 java.lang.Exception -> Ld4 javax.net.ssl.SSLException -> Ld8
            io.netty.internal.tcnative.SSLContext.setCipherSuite(r10, r2, r3)     // Catch: java.lang.Throwable -> Ld0 java.lang.Exception -> Ld4 javax.net.ssl.SSLException -> Ld8
            goto Lf7
        Ld0:
            r0 = move-exception
            r10 = r0
            goto L1ef
        Ld4:
            r0 = move-exception
            r10 = r0
            goto L1cb
        Ld8:
            r0 = move-exception
            r10 = r0
            goto L1e4
        Ldc:
            boolean r2 = io.netty.handler.ssl.OpenSsl.isBoringSSL()     // Catch: java.lang.Throwable -> Ld0 java.lang.Exception -> Ld4 javax.net.ssl.SSLException -> Ld8
            io.netty.handler.ssl.CipherSuiteConverter.convertToCipherStrings(r10, r0, r4, r2)     // Catch: java.lang.Throwable -> Ld0 java.lang.Exception -> Ld4 javax.net.ssl.SSLException -> Ld8
            long r7 = r9.ctx     // Catch: java.lang.Throwable -> Ld0 java.lang.Exception -> Ld4 javax.net.ssl.SSLException -> Ld8
            java.lang.String r10 = r0.toString()     // Catch: java.lang.Throwable -> Ld0 java.lang.Exception -> Ld4 javax.net.ssl.SSLException -> Ld8
            io.netty.internal.tcnative.SSLContext.setCipherSuite(r7, r10, r6)     // Catch: java.lang.Throwable -> Ld0 java.lang.Exception -> Ld4 javax.net.ssl.SSLException -> Ld8
            if (r11 == 0) goto Lf7
            long r10 = r9.ctx     // Catch: java.lang.Throwable -> Ld0 java.lang.Exception -> Ld4 javax.net.ssl.SSLException -> Ld8
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> Ld0 java.lang.Exception -> Ld4 javax.net.ssl.SSLException -> Ld8
            io.netty.internal.tcnative.SSLContext.setCipherSuite(r10, r2, r3)     // Catch: java.lang.Throwable -> Ld0 java.lang.Exception -> Ld4 javax.net.ssl.SSLException -> Ld8
        Lf7:
            long r10 = r9.ctx     // Catch: java.lang.Throwable -> Ld0
            int r10 = io.netty.internal.tcnative.SSLContext.getOptions(r10)     // Catch: java.lang.Throwable -> Ld0
            int r11 = io.netty.internal.tcnative.SSL.SSL_OP_NO_SSLv2     // Catch: java.lang.Throwable -> Ld0
            r10 = r10 | r11
            int r11 = io.netty.internal.tcnative.SSL.SSL_OP_NO_SSLv3     // Catch: java.lang.Throwable -> Ld0
            r10 = r10 | r11
            int r11 = io.netty.internal.tcnative.SSL.SSL_OP_NO_TLSv1_3     // Catch: java.lang.Throwable -> Ld0
            r10 = r10 | r11
            int r11 = io.netty.internal.tcnative.SSL.SSL_OP_CIPHER_SERVER_PREFERENCE     // Catch: java.lang.Throwable -> Ld0
            r10 = r10 | r11
            int r11 = io.netty.internal.tcnative.SSL.SSL_OP_NO_COMPRESSION     // Catch: java.lang.Throwable -> Ld0
            r10 = r10 | r11
            int r11 = io.netty.internal.tcnative.SSL.SSL_OP_NO_TICKET     // Catch: java.lang.Throwable -> Ld0
            r10 = r10 | r11
            int r11 = r0.length()     // Catch: java.lang.Throwable -> Ld0
            if (r11 != 0) goto L124
            int r11 = io.netty.internal.tcnative.SSL.SSL_OP_NO_SSLv2     // Catch: java.lang.Throwable -> Ld0
            int r0 = io.netty.internal.tcnative.SSL.SSL_OP_NO_SSLv3     // Catch: java.lang.Throwable -> Ld0
            r11 = r11 | r0
            int r0 = io.netty.internal.tcnative.SSL.SSL_OP_NO_TLSv1     // Catch: java.lang.Throwable -> Ld0
            r11 = r11 | r0
            int r0 = io.netty.internal.tcnative.SSL.SSL_OP_NO_TLSv1_1     // Catch: java.lang.Throwable -> Ld0
            r11 = r11 | r0
            int r0 = io.netty.internal.tcnative.SSL.SSL_OP_NO_TLSv1_2     // Catch: java.lang.Throwable -> Ld0
            r11 = r11 | r0
            r10 = r10 | r11
        L124:
            long r4 = r9.ctx     // Catch: java.lang.Throwable -> Ld0
            io.netty.internal.tcnative.SSLContext.setOptions(r4, r10)     // Catch: java.lang.Throwable -> Ld0
            long r10 = r9.ctx     // Catch: java.lang.Throwable -> Ld0
            int r0 = io.netty.internal.tcnative.SSLContext.getMode(r10)     // Catch: java.lang.Throwable -> Ld0
            int r2 = io.netty.internal.tcnative.SSL.SSL_MODE_ACCEPT_MOVING_WRITE_BUFFER     // Catch: java.lang.Throwable -> Ld0
            r0 = r0 | r2
            io.netty.internal.tcnative.SSLContext.setMode(r10, r0)     // Catch: java.lang.Throwable -> Ld0
            java.lang.Integer r10 = io.netty.handler.ssl.ReferenceCountedOpenSslContext.DH_KEY_LENGTH     // Catch: java.lang.Throwable -> Ld0
            if (r10 == 0) goto L142
            long r4 = r9.ctx     // Catch: java.lang.Throwable -> Ld0
            int r10 = r10.intValue()     // Catch: java.lang.Throwable -> Ld0
            io.netty.internal.tcnative.SSLContext.setTmpDHLength(r4, r10)     // Catch: java.lang.Throwable -> Ld0
        L142:
            java.util.List r10 = r12.protocols()     // Catch: java.lang.Throwable -> Ld0
            boolean r11 = r10.isEmpty()     // Catch: java.lang.Throwable -> Ld0
            if (r11 != 0) goto L18c
            java.lang.String[] r11 = new java.lang.String[r6]     // Catch: java.lang.Throwable -> Ld0
            java.lang.Object[] r10 = r10.toArray(r11)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String[] r10 = (java.lang.String[]) r10     // Catch: java.lang.Throwable -> Ld0
            io.netty.handler.ssl.ApplicationProtocolConfig$SelectorFailureBehavior r11 = r12.selectorFailureBehavior()     // Catch: java.lang.Throwable -> Ld0
            int r11 = opensslSelectorFailureBehavior(r11)     // Catch: java.lang.Throwable -> Ld0
            int[] r0 = io.netty.handler.ssl.ReferenceCountedOpenSslContext.AnonymousClass5.$SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$Protocol     // Catch: java.lang.Throwable -> Ld0
            io.netty.handler.ssl.ApplicationProtocolConfig$Protocol r12 = r12.protocol()     // Catch: java.lang.Throwable -> Ld0
            int r12 = r12.ordinal()     // Catch: java.lang.Throwable -> Ld0
            r12 = r0[r12]     // Catch: java.lang.Throwable -> Ld0
            if (r12 == r3) goto L187
            r0 = 2
            if (r12 == r0) goto L181
            r0 = 3
            if (r12 != r0) goto L17b
            long r2 = r9.ctx     // Catch: java.lang.Throwable -> Ld0
            io.netty.internal.tcnative.SSLContext.setNpnProtos(r2, r10, r11)     // Catch: java.lang.Throwable -> Ld0
            long r2 = r9.ctx     // Catch: java.lang.Throwable -> Ld0
            io.netty.internal.tcnative.SSLContext.setAlpnProtos(r2, r10, r11)     // Catch: java.lang.Throwable -> Ld0
            goto L18c
        L17b:
            java.lang.Error r10 = new java.lang.Error     // Catch: java.lang.Throwable -> Ld0
            r10.<init>()     // Catch: java.lang.Throwable -> Ld0
            throw r10     // Catch: java.lang.Throwable -> Ld0
        L181:
            long r2 = r9.ctx     // Catch: java.lang.Throwable -> Ld0
            io.netty.internal.tcnative.SSLContext.setAlpnProtos(r2, r10, r11)     // Catch: java.lang.Throwable -> Ld0
            goto L18c
        L187:
            long r2 = r9.ctx     // Catch: java.lang.Throwable -> Ld0
            io.netty.internal.tcnative.SSLContext.setNpnProtos(r2, r10, r11)     // Catch: java.lang.Throwable -> Ld0
        L18c:
            r10 = 0
            int r12 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r12 > 0) goto L19b
            long r2 = r9.ctx     // Catch: java.lang.Throwable -> Ld0
            r4 = 20480(0x5000, double:1.01185E-319)
            long r2 = io.netty.internal.tcnative.SSLContext.setSessionCacheSize(r2, r4)     // Catch: java.lang.Throwable -> Ld0
            goto L19c
        L19b:
            r2 = r13
        L19c:
            r9.sessionCacheSize = r2     // Catch: java.lang.Throwable -> Ld0
            long r4 = r9.ctx     // Catch: java.lang.Throwable -> Ld0
            io.netty.internal.tcnative.SSLContext.setSessionCacheSize(r4, r2)     // Catch: java.lang.Throwable -> Ld0
            int r12 = (r15 > r10 ? 1 : (r15 == r10 ? 0 : -1))
            if (r12 > 0) goto L1b0
            long r10 = r9.ctx     // Catch: java.lang.Throwable -> Ld0
            r2 = 300(0x12c, double:1.48E-321)
            long r10 = io.netty.internal.tcnative.SSLContext.setSessionCacheTimeout(r10, r2)     // Catch: java.lang.Throwable -> Ld0
            goto L1b1
        L1b0:
            r10 = r15
        L1b1:
            r9.sessionTimeout = r10     // Catch: java.lang.Throwable -> Ld0
            long r2 = r9.ctx     // Catch: java.lang.Throwable -> Ld0
            io.netty.internal.tcnative.SSLContext.setSessionCacheTimeout(r2, r10)     // Catch: java.lang.Throwable -> Ld0
            if (r1 == 0) goto L1c3
            long r10 = r9.ctx     // Catch: java.lang.Throwable -> Ld0
            boolean r12 = r9.isClient()     // Catch: java.lang.Throwable -> Ld0
            io.netty.internal.tcnative.SSLContext.enableOcsp(r10, r12)     // Catch: java.lang.Throwable -> Ld0
        L1c3:
            long r10 = r9.ctx     // Catch: java.lang.Throwable -> Ld0
            boolean r12 = io.netty.handler.ssl.ReferenceCountedOpenSslContext.USE_TASKS     // Catch: java.lang.Throwable -> Ld0
            io.netty.internal.tcnative.SSLContext.setUseTasks(r10, r12)     // Catch: java.lang.Throwable -> Ld0
            return
        L1cb:
            javax.net.ssl.SSLException r11 = new javax.net.ssl.SSLException     // Catch: java.lang.Throwable -> Ld0
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld0
            r12.<init>()     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r0 = "failed to set cipher suite: "
            r12.append(r0)     // Catch: java.lang.Throwable -> Ld0
            java.util.List<java.lang.String> r0 = r9.unmodifiableCiphers     // Catch: java.lang.Throwable -> Ld0
            r12.append(r0)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> Ld0
            r11.<init>(r12, r10)     // Catch: java.lang.Throwable -> Ld0
            throw r11     // Catch: java.lang.Throwable -> Ld0
        L1e4:
            throw r10     // Catch: java.lang.Throwable -> Ld0
        L1e5:
            r0 = move-exception
            r10 = r0
            javax.net.ssl.SSLException r11 = new javax.net.ssl.SSLException     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r12 = "failed to create an SSL_CTX"
            r11.<init>(r12, r10)     // Catch: java.lang.Throwable -> Ld0
            throw r11     // Catch: java.lang.Throwable -> Ld0
        L1ef:
            r9.release()
            throw r10
    }

    static /* synthetic */ io.netty.util.ResourceLeakTracker access$000(io.netty.handler.ssl.ReferenceCountedOpenSslContext r0) {
            io.netty.util.ResourceLeakTracker<io.netty.handler.ssl.ReferenceCountedOpenSslContext> r0 = r0.leak
            return r0
    }

    static /* synthetic */ void access$100(io.netty.handler.ssl.ReferenceCountedOpenSslContext r0) {
            r0.destroy()
            return
    }

    static /* synthetic */ io.netty.util.internal.logging.InternalLogger access$300() {
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.handler.ssl.ReferenceCountedOpenSslContext.logger
            return r0
    }

    protected static java.security.cert.X509Certificate[] certificates(byte[][] r5) {
            int r0 = r5.length
            java.security.cert.X509Certificate[] r1 = new java.security.cert.X509Certificate[r0]
            r2 = 0
        L4:
            if (r2 >= r0) goto L12
            io.netty.handler.ssl.OpenSslX509Certificate r3 = new io.netty.handler.ssl.OpenSslX509Certificate
            r4 = r5[r2]
            r3.<init>(r4)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L4
        L12:
            return r1
    }

    protected static javax.net.ssl.X509TrustManager chooseTrustManager(javax.net.ssl.TrustManager[] r4) {
            int r0 = r4.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L1e
            r2 = r4[r1]
            boolean r3 = r2 instanceof javax.net.ssl.X509TrustManager
            if (r3 == 0) goto L1b
            int r4 = io.netty.util.internal.PlatformDependent.javaVersion()
            r0 = 7
            if (r4 < r0) goto L18
            javax.net.ssl.X509TrustManager r2 = (javax.net.ssl.X509TrustManager) r2
            javax.net.ssl.X509TrustManager r4 = io.netty.handler.ssl.OpenSslX509TrustManagerWrapper.wrapIfNeeded(r2)
            return r4
        L18:
            javax.net.ssl.X509TrustManager r2 = (javax.net.ssl.X509TrustManager) r2
            return r2
        L1b:
            int r1 = r1 + 1
            goto L2
        L1e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "no X509TrustManager found"
            r4.<init>(r0)
            throw r4
    }

    protected static javax.net.ssl.X509KeyManager chooseX509KeyManager(javax.net.ssl.KeyManager[] r4) {
            int r0 = r4.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L10
            r2 = r4[r1]
            boolean r3 = r2 instanceof javax.net.ssl.X509KeyManager
            if (r3 == 0) goto Ld
            javax.net.ssl.X509KeyManager r2 = (javax.net.ssl.X509KeyManager) r2
            return r2
        Ld:
            int r1 = r1 + 1
            goto L2
        L10:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "no X509KeyManager found"
            r4.<init>(r0)
            throw r4
    }

    private void destroy() {
            r6 = this;
            java.util.concurrent.locks.ReadWriteLock r0 = r6.ctxLock
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.lock()
            long r1 = r6.ctx     // Catch: java.lang.Throwable -> L19
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L2b
            boolean r5 = r6.enableOcsp     // Catch: java.lang.Throwable -> L19
            if (r5 == 0) goto L1b
            io.netty.internal.tcnative.SSLContext.disableOcsp(r1)     // Catch: java.lang.Throwable -> L19
            goto L1b
        L19:
            r1 = move-exception
            goto L2f
        L1b:
            long r1 = r6.ctx     // Catch: java.lang.Throwable -> L19
            io.netty.internal.tcnative.SSLContext.free(r1)     // Catch: java.lang.Throwable -> L19
            r6.ctx = r3     // Catch: java.lang.Throwable -> L19
            io.netty.handler.ssl.OpenSslSessionContext r1 = r6.sessionContext()     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L2b
            r1.destroy()     // Catch: java.lang.Throwable -> L19
        L2b:
            r0.unlock()
            return
        L2f:
            r0.unlock()
            throw r1
    }

    static void freeBio(long r3) {
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 == 0) goto L9
            io.netty.internal.tcnative.SSL.freeBIO(r3)
        L9:
            return
    }

    private static long newBIO(io.netty.buffer.ByteBuf r7) throws java.lang.Exception {
            long r0 = io.netty.internal.tcnative.SSL.newMemBIO()     // Catch: java.lang.Throwable -> L27
            int r2 = r7.readableBytes()     // Catch: java.lang.Throwable -> L27
            long r3 = io.netty.handler.ssl.OpenSsl.memoryAddress(r7)     // Catch: java.lang.Throwable -> L27
            int r5 = r7.readerIndex()     // Catch: java.lang.Throwable -> L27
            long r5 = (long) r5     // Catch: java.lang.Throwable -> L27
            long r3 = r3 + r5
            int r3 = io.netty.internal.tcnative.SSL.bioWrite(r0, r3, r2)     // Catch: java.lang.Throwable -> L27
            if (r3 != r2) goto L1c
            r7.release()
            return r0
        L1c:
            io.netty.internal.tcnative.SSL.freeBIO(r0)     // Catch: java.lang.Throwable -> L27
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = "Could not write data to memory BIO"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L27
            throw r0     // Catch: java.lang.Throwable -> L27
        L27:
            r0 = move-exception
            r7.release()
            throw r0
    }

    private static int opensslSelectorFailureBehavior(io.netty.handler.ssl.ApplicationProtocolConfig.SelectorFailureBehavior r2) {
            int[] r0 = io.netty.handler.ssl.ReferenceCountedOpenSslContext.AnonymousClass5.$SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$SelectorFailureBehavior
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            if (r2 == r0) goto L15
            r1 = 2
            if (r2 != r1) goto Lf
            return r0
        Lf:
            java.lang.Error r2 = new java.lang.Error
            r2.<init>()
            throw r2
        L15:
            r2 = 0
            return r2
    }

    static io.netty.handler.ssl.OpenSslKeyMaterialProvider providerFor(javax.net.ssl.KeyManagerFactory r1, java.lang.String r2) {
            boolean r0 = r1 instanceof io.netty.handler.ssl.OpenSslX509KeyManagerFactory
            if (r0 == 0) goto Lb
            io.netty.handler.ssl.OpenSslX509KeyManagerFactory r1 = (io.netty.handler.ssl.OpenSslX509KeyManagerFactory) r1
            io.netty.handler.ssl.OpenSslKeyMaterialProvider r1 = r1.newProvider()
            return r1
        Lb:
            javax.net.ssl.KeyManager[] r0 = r1.getKeyManagers()
            javax.net.ssl.X509KeyManager r0 = chooseX509KeyManager(r0)
            boolean r1 = r1 instanceof io.netty.handler.ssl.OpenSslCachingX509KeyManagerFactory
            if (r1 == 0) goto L1d
            io.netty.handler.ssl.OpenSslCachingKeyMaterialProvider r1 = new io.netty.handler.ssl.OpenSslCachingKeyMaterialProvider
            r1.<init>(r0, r2)
            return r1
        L1d:
            io.netty.handler.ssl.OpenSslKeyMaterialProvider r1 = new io.netty.handler.ssl.OpenSslKeyMaterialProvider
            r1.<init>(r0, r2)
            return r1
    }

    static void setKeyMaterial(long r16, java.security.cert.X509Certificate[] r18, java.security.PrivateKey r19, java.lang.String r20) throws javax.net.ssl.SSLException {
            r0 = r19
            r1 = 0
            r3 = 0
            io.netty.buffer.ByteBufAllocator r4 = io.netty.buffer.ByteBufAllocator.DEFAULT     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L63 javax.net.ssl.SSLException -> L67
            r5 = 1
            r6 = r18
            io.netty.handler.ssl.PemEncoded r3 = io.netty.handler.ssl.PemX509Certificate.toPEM(r4, r5, r6)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L63 javax.net.ssl.SSLException -> L67
            io.netty.handler.ssl.PemEncoded r6 = r3.mo39retain()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L63 javax.net.ssl.SSLException -> L67
            long r9 = toBIO(r4, r6)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L63 javax.net.ssl.SSLException -> L67
            io.netty.handler.ssl.PemEncoded r6 = r3.mo39retain()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59 javax.net.ssl.SSLException -> L5c
            long r14 = toBIO(r4, r6)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59 javax.net.ssl.SSLException -> L5c
            if (r0 == 0) goto L24
            long r1 = toBIO(r4, r0)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29 javax.net.ssl.SSLException -> L2b
        L24:
            r11 = r1
            goto L2d
        L26:
            r0 = move-exception
            goto L74
        L29:
            r0 = move-exception
            goto L6b
        L2b:
            r0 = move-exception
            goto L73
        L2d:
            if (r20 != 0) goto L3e
            java.lang.String r0 = ""
            r13 = r0
        L32:
            r7 = r16
            goto L41
        L35:
            r0 = move-exception
            r1 = r11
            goto L74
        L38:
            r0 = move-exception
            r1 = r11
            goto L6b
        L3b:
            r0 = move-exception
            r1 = r11
            goto L73
        L3e:
            r13 = r20
            goto L32
        L41:
            io.netty.internal.tcnative.SSLContext.setCertificateBio(r7, r9, r11, r13)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L38 javax.net.ssl.SSLException -> L3b
            r7 = r16
            io.netty.internal.tcnative.SSLContext.setCertificateChainBio(r7, r14, r5)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L38 javax.net.ssl.SSLException -> L3b
            freeBio(r11)
            freeBio(r9)
            freeBio(r14)
            r3.release()
            return
        L56:
            r0 = move-exception
            r14 = r1
            goto L74
        L59:
            r0 = move-exception
            r14 = r1
            goto L6b
        L5c:
            r0 = move-exception
            r14 = r1
            goto L73
        L5f:
            r0 = move-exception
            r9 = r1
            r14 = r9
            goto L74
        L63:
            r0 = move-exception
            r9 = r1
            r14 = r9
            goto L6b
        L67:
            r0 = move-exception
            r9 = r1
            r14 = r9
            goto L73
        L6b:
            javax.net.ssl.SSLException r4 = new javax.net.ssl.SSLException     // Catch: java.lang.Throwable -> L26
            java.lang.String r5 = "failed to set certificate and key"
            r4.<init>(r5, r0)     // Catch: java.lang.Throwable -> L26
            throw r4     // Catch: java.lang.Throwable -> L26
        L73:
            throw r0     // Catch: java.lang.Throwable -> L26
        L74:
            freeBio(r1)
            freeBio(r9)
            freeBio(r14)
            if (r3 == 0) goto L82
            r3.release()
        L82:
            throw r0
    }

    static long toBIO(io.netty.buffer.ByteBufAllocator r3, io.netty.handler.ssl.PemEncoded r4) throws java.lang.Exception {
            io.netty.buffer.ByteBuf r0 = r4.content()     // Catch: java.lang.Throwable -> L16
            boolean r1 = r0.isDirect()     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L18
            io.netty.buffer.ByteBuf r3 = r0.retainedSlice()     // Catch: java.lang.Throwable -> L16
            long r0 = newBIO(r3)     // Catch: java.lang.Throwable -> L16
            r4.release()
            return r0
        L16:
            r3 = move-exception
            goto L5f
        L18:
            int r1 = r0.readableBytes()     // Catch: java.lang.Throwable -> L16
            io.netty.buffer.ByteBuf r3 = r3.directBuffer(r1)     // Catch: java.lang.Throwable -> L16
            int r1 = r0.readerIndex()     // Catch: java.lang.Throwable -> L4a
            int r2 = r0.readableBytes()     // Catch: java.lang.Throwable -> L4a
            r3.writeBytes(r0, r1, r2)     // Catch: java.lang.Throwable -> L4a
            io.netty.buffer.ByteBuf r0 = r3.retainedSlice()     // Catch: java.lang.Throwable -> L4a
            long r0 = newBIO(r0)     // Catch: java.lang.Throwable -> L4a
            boolean r2 = r4.isSensitive()     // Catch: java.lang.Throwable -> L3d
            if (r2 == 0) goto L3f
            io.netty.handler.ssl.SslUtils.zeroout(r3)     // Catch: java.lang.Throwable -> L3d
            goto L3f
        L3d:
            r0 = move-exception
            goto L46
        L3f:
            r3.release()     // Catch: java.lang.Throwable -> L16
            r4.release()
            return r0
        L46:
            r3.release()     // Catch: java.lang.Throwable -> L16
            throw r0     // Catch: java.lang.Throwable -> L16
        L4a:
            r0 = move-exception
            boolean r1 = r4.isSensitive()     // Catch: java.lang.Throwable -> L55
            if (r1 == 0) goto L57
            io.netty.handler.ssl.SslUtils.zeroout(r3)     // Catch: java.lang.Throwable -> L55
            goto L57
        L55:
            r0 = move-exception
            goto L5b
        L57:
            r3.release()     // Catch: java.lang.Throwable -> L16
            throw r0     // Catch: java.lang.Throwable -> L16
        L5b:
            r3.release()     // Catch: java.lang.Throwable -> L16
            throw r0     // Catch: java.lang.Throwable -> L16
        L5f:
            r4.release()
            throw r3
    }

    static long toBIO(io.netty.buffer.ByteBufAllocator r2, java.security.PrivateKey r3) throws java.lang.Exception {
            if (r3 != 0) goto L5
            r2 = 0
            return r2
        L5:
            r0 = 1
            io.netty.handler.ssl.PemEncoded r3 = io.netty.handler.ssl.PemPrivateKey.toPEM(r2, r0, r3)
            io.netty.handler.ssl.PemEncoded r0 = r3.mo39retain()     // Catch: java.lang.Throwable -> L16
            long r0 = toBIO(r2, r0)     // Catch: java.lang.Throwable -> L16
            r3.release()
            return r0
        L16:
            r2 = move-exception
            r3.release()
            throw r2
    }

    static long toBIO(io.netty.buffer.ByteBufAllocator r2, java.security.cert.X509Certificate... r3) throws java.lang.Exception {
            if (r3 != 0) goto L5
            r2 = 0
            return r2
        L5:
            int r0 = r3.length
            if (r0 == 0) goto L1e
            r0 = 1
            io.netty.handler.ssl.PemEncoded r3 = io.netty.handler.ssl.PemX509Certificate.toPEM(r2, r0, r3)
            io.netty.handler.ssl.PemEncoded r0 = r3.mo39retain()     // Catch: java.lang.Throwable -> L19
            long r0 = toBIO(r2, r0)     // Catch: java.lang.Throwable -> L19
            r3.release()
            return r0
        L19:
            r2 = move-exception
            r3.release()
            throw r2
        L1e:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "certChain can't be empty"
            r2.<init>(r3)
            throw r2
    }

    static io.netty.handler.ssl.OpenSslApplicationProtocolNegotiator toNegotiator(io.netty.handler.ssl.ApplicationProtocolConfig r6) {
            if (r6 != 0) goto L5
            io.netty.handler.ssl.OpenSslApplicationProtocolNegotiator r6 = io.netty.handler.ssl.ReferenceCountedOpenSslContext.NONE_PROTOCOL_NEGOTIATOR
            return r6
        L5:
            int[] r0 = io.netty.handler.ssl.ReferenceCountedOpenSslContext.AnonymousClass5.$SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$Protocol
            io.netty.handler.ssl.ApplicationProtocolConfig$Protocol r1 = r6.protocol()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            r2 = 1
            if (r0 == r2) goto L26
            if (r0 == r1) goto L26
            r3 = 3
            if (r0 == r3) goto L26
            r6 = 4
            if (r0 != r6) goto L20
            io.netty.handler.ssl.OpenSslApplicationProtocolNegotiator r6 = io.netty.handler.ssl.ReferenceCountedOpenSslContext.NONE_PROTOCOL_NEGOTIATOR
            return r6
        L20:
            java.lang.Error r6 = new java.lang.Error
            r6.<init>()
            throw r6
        L26:
            int[] r0 = io.netty.handler.ssl.ReferenceCountedOpenSslContext.AnonymousClass5.$SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$SelectedListenerFailureBehavior
            io.netty.handler.ssl.ApplicationProtocolConfig$SelectedListenerFailureBehavior r3 = r6.selectedListenerFailureBehavior()
            int r3 = r3.ordinal()
            r0 = r0[r3]
            java.lang.String r3 = " behavior"
            java.lang.String r4 = "OpenSSL provider does not support "
            if (r0 == r2) goto L54
            if (r0 != r1) goto L3b
            goto L54
        L3b:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r4)
            io.netty.handler.ssl.ApplicationProtocolConfig$SelectedListenerFailureBehavior r6 = r6.selectedListenerFailureBehavior()
            r1.append(r6)
            r1.append(r3)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
        L54:
            int[] r0 = io.netty.handler.ssl.ReferenceCountedOpenSslContext.AnonymousClass5.$SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$SelectorFailureBehavior
            io.netty.handler.ssl.ApplicationProtocolConfig$SelectorFailureBehavior r5 = r6.selectorFailureBehavior()
            int r5 = r5.ordinal()
            r0 = r0[r5]
            if (r0 == r2) goto L7e
            if (r0 != r1) goto L65
            goto L7e
        L65:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r4)
            io.netty.handler.ssl.ApplicationProtocolConfig$SelectorFailureBehavior r6 = r6.selectorFailureBehavior()
            r1.append(r6)
            r1.append(r3)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
        L7e:
            io.netty.handler.ssl.OpenSslDefaultApplicationProtocolNegotiator r0 = new io.netty.handler.ssl.OpenSslDefaultApplicationProtocolNegotiator
            r0.<init>(r6)
            return r0
    }

    static boolean useExtendedTrustManager(javax.net.ssl.X509TrustManager r2) {
            int r0 = io.netty.util.internal.PlatformDependent.javaVersion()
            r1 = 7
            if (r0 < r1) goto Lf
            boolean r2 = io.netty.handler.ssl.y.a(r2)
            if (r2 == 0) goto Lf
            r2 = 1
            return r2
        Lf:
            r2 = 0
            return r2
    }

    @Override // io.netty.handler.ssl.SslContext
    public io.netty.handler.ssl.ApplicationProtocolNegotiator applicationProtocolNegotiator() {
            r1 = this;
            io.netty.handler.ssl.OpenSslApplicationProtocolNegotiator r0 = r1.apn
            return r0
    }

    @Override // io.netty.handler.ssl.SslContext
    public final java.util.List<java.lang.String> cipherSuites() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.unmodifiableCiphers
            return r0
    }

    @java.lang.Deprecated
    public final long context() {
            r2 = this;
            long r0 = r2.sslCtxPointer()
            return r0
    }

    public int getBioNonApplicationBufferSize() {
            r1 = this;
            int r0 = r1.bioNonApplicationBufferSize
            return r0
    }

    @java.lang.Deprecated
    public boolean getRejectRemoteInitiatedRenegotiation() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // io.netty.handler.ssl.SslContext
    public final boolean isClient() {
            r1 = this;
            int r0 = r1.mode
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // io.netty.handler.ssl.SslContext
    public final javax.net.ssl.SSLEngine newEngine(io.netty.buffer.ByteBufAllocator r3) {
            r2 = this;
            r0 = 0
            r1 = -1
            javax.net.ssl.SSLEngine r3 = r2.newEngine(r3, r0, r1)
            return r3
    }

    @Override // io.netty.handler.ssl.SslContext
    public final javax.net.ssl.SSLEngine newEngine(io.netty.buffer.ByteBufAllocator r2, java.lang.String r3, int r4) {
            r1 = this;
            r0 = 1
            javax.net.ssl.SSLEngine r2 = r1.newEngine0(r2, r3, r4, r0)
            return r2
    }

    javax.net.ssl.SSLEngine newEngine0(io.netty.buffer.ByteBufAllocator r8, java.lang.String r9, int r10, boolean r11) {
            r7 = this;
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine r0 = new io.netty.handler.ssl.ReferenceCountedOpenSslEngine
            r6 = 1
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
    }

    @Override // io.netty.handler.ssl.SslContext
    protected final io.netty.handler.ssl.SslHandler newHandler(io.netty.buffer.ByteBufAllocator r3, java.lang.String r4, int r5, boolean r6) {
            r2 = this;
            io.netty.handler.ssl.SslHandler r0 = new io.netty.handler.ssl.SslHandler
            r1 = 0
            javax.net.ssl.SSLEngine r3 = r2.newEngine0(r3, r4, r5, r1)
            r0.<init>(r3, r6)
            return r0
    }

    @Override // io.netty.handler.ssl.SslContext
    protected io.netty.handler.ssl.SslHandler newHandler(io.netty.buffer.ByteBufAllocator r2, java.lang.String r3, int r4, boolean r5, java.util.concurrent.Executor r6) {
            r1 = this;
            io.netty.handler.ssl.SslHandler r5 = new io.netty.handler.ssl.SslHandler
            r0 = 0
            javax.net.ssl.SSLEngine r2 = r1.newEngine0(r2, r3, r4, r0)
            r5.<init>(r2, r6)
            return r5
    }

    @Override // io.netty.handler.ssl.SslContext
    protected final io.netty.handler.ssl.SslHandler newHandler(io.netty.buffer.ByteBufAllocator r5, boolean r6) {
            r4 = this;
            io.netty.handler.ssl.SslHandler r0 = new io.netty.handler.ssl.SslHandler
            r1 = -1
            r2 = 0
            r3 = 0
            javax.net.ssl.SSLEngine r5 = r4.newEngine0(r5, r3, r1, r2)
            r0.<init>(r5, r6)
            return r0
    }

    @Override // io.netty.handler.ssl.SslContext
    protected io.netty.handler.ssl.SslHandler newHandler(io.netty.buffer.ByteBufAllocator r5, boolean r6, java.util.concurrent.Executor r7) {
            r4 = this;
            io.netty.handler.ssl.SslHandler r0 = new io.netty.handler.ssl.SslHandler
            r1 = -1
            r2 = 0
            r3 = 0
            javax.net.ssl.SSLEngine r5 = r4.newEngine0(r5, r3, r1, r2)
            r0.<init>(r5, r6, r7)
            return r0
    }

    public final int refCnt() {
            r1 = this;
            io.netty.util.AbstractReferenceCounted r0 = r1.refCnt
            int r0 = r0.refCnt()
            return r0
    }

    public final boolean release() {
            r1 = this;
            io.netty.util.AbstractReferenceCounted r0 = r1.refCnt
            boolean r0 = r0.release()
            return r0
    }

    public final boolean release(int r2) {
            r1 = this;
            io.netty.util.AbstractReferenceCounted r0 = r1.refCnt
            boolean r2 = r0.release(r2)
            return r2
    }

    public final io.netty.util.ReferenceCounted retain() {
            r1 = this;
            io.netty.util.AbstractReferenceCounted r0 = r1.refCnt
            r0.retain()
            return r1
    }

    public final io.netty.util.ReferenceCounted retain(int r2) {
            r1 = this;
            io.netty.util.AbstractReferenceCounted r0 = r1.refCnt
            r0.retain(r2)
            return r1
    }

    @Override // io.netty.handler.ssl.SslContext
    public final long sessionCacheSize() {
            r2 = this;
            long r0 = r2.sessionCacheSize
            return r0
    }

    @Override // io.netty.handler.ssl.SslContext
    public abstract io.netty.handler.ssl.OpenSslSessionContext sessionContext();

    @Override // io.netty.handler.ssl.SslContext
    public /* bridge */ /* synthetic */ javax.net.ssl.SSLSessionContext sessionContext() {
            r1 = this;
            io.netty.handler.ssl.OpenSslSessionContext r0 = r1.sessionContext()
            return r0
    }

    @Override // io.netty.handler.ssl.SslContext
    public final long sessionTimeout() {
            r2 = this;
            long r0 = r2.sessionTimeout
            return r0
    }

    public void setBioNonApplicationBufferSize(int r2) {
            r1 = this;
            java.lang.String r0 = "bioNonApplicationBufferSize"
            int r2 = io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r2, r0)
            r1.bioNonApplicationBufferSize = r2
            return
    }

    public final void setPrivateKeyMethod(io.netty.handler.ssl.OpenSslPrivateKeyMethod r6) {
            r5 = this;
            java.lang.String r0 = "method"
            io.netty.util.internal.ObjectUtil.checkNotNull(r6, r0)
            java.util.concurrent.locks.ReadWriteLock r0 = r5.ctxLock
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.lock()
            long r1 = r5.ctx     // Catch: java.lang.Throwable -> L1e
            io.netty.handler.ssl.ReferenceCountedOpenSslContext$PrivateKeyMethod r3 = new io.netty.handler.ssl.ReferenceCountedOpenSslContext$PrivateKeyMethod     // Catch: java.lang.Throwable -> L1e
            io.netty.handler.ssl.OpenSslEngineMap r4 = r5.engineMap     // Catch: java.lang.Throwable -> L1e
            r3.<init>(r4, r6)     // Catch: java.lang.Throwable -> L1e
            io.netty.internal.tcnative.SSLContext.setPrivateKeyMethod(r1, r3)     // Catch: java.lang.Throwable -> L1e
            r0.unlock()
            return
        L1e:
            r6 = move-exception
            r0.unlock()
            throw r6
    }

    @java.lang.Deprecated
    public void setRejectRemoteInitiatedRenegotiation(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L3
            return
        L3:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Renegotiation is not supported"
            r2.<init>(r0)
            throw r2
    }

    @java.lang.Deprecated
    public final void setTicketKeys(byte[] r2) {
            r1 = this;
            io.netty.handler.ssl.OpenSslSessionContext r0 = r1.sessionContext()
            r0.setTicketKeys(r2)
            return
    }

    @java.lang.Deprecated
    public final long sslCtxPointer() {
            r3 = this;
            java.util.concurrent.locks.ReadWriteLock r0 = r3.ctxLock
            java.util.concurrent.locks.Lock r0 = r0.readLock()
            r0.lock()
            long r1 = r3.ctx     // Catch: java.lang.Throwable -> L13
            long r1 = io.netty.internal.tcnative.SSLContext.getSslCtx(r1)     // Catch: java.lang.Throwable -> L13
            r0.unlock()
            return r1
        L13:
            r1 = move-exception
            r0.unlock()
            throw r1
    }

    @java.lang.Deprecated
    public final io.netty.handler.ssl.OpenSslSessionStats stats() {
            r1 = this;
            io.netty.handler.ssl.OpenSslSessionContext r0 = r1.sessionContext()
            io.netty.handler.ssl.OpenSslSessionStats r0 = r0.stats()
            return r0
    }

    public final io.netty.util.ReferenceCounted touch() {
            r1 = this;
            io.netty.util.AbstractReferenceCounted r0 = r1.refCnt
            r0.touch()
            return r1
    }

    public final io.netty.util.ReferenceCounted touch(java.lang.Object r2) {
            r1 = this;
            io.netty.util.AbstractReferenceCounted r0 = r1.refCnt
            r0.touch(r2)
            return r1
    }
}
