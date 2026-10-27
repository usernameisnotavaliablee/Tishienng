package okhttp3.internal.platform;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nPlatform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Platform.kt\nokhttp3/internal/platform/Platform\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,241:1\n1617#2,9:242\n1869#2:251\n1870#2:253\n1626#2:254\n1#3:252\n*S KotlinDebug\n*F\n+ 1 Platform.kt\nokhttp3/internal/platform/Platform\n*L\n134#1:242,9\n134#1:251\n134#1:253\n134#1:254\n134#1:252\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class Platform {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.platform.Platform.Companion Companion = null;
    public static final int INFO = 4;
    public static final int WARN = 5;
    private static final java.util.logging.Logger logger = null;

    @org.jetbrains.annotations.NotNull
    private static volatile okhttp3.internal.platform.Platform platform;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nPlatform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Platform.kt\nokhttp3/internal/platform/Platform$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,241:1\n774#2:242\n865#2,2:243\n1563#2:245\n1634#2,3:246\n*S KotlinDebug\n*F\n+ 1 Platform.kt\nokhttp3/internal/platform/Platform$Companion\n*L\n219#1:242\n219#1:243,2\n219#1:245\n219#1:246,3\n*E\n"})
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public static final /* synthetic */ okhttp3.internal.platform.Platform access$findPlatform(okhttp3.internal.platform.Platform.Companion r0) {
                okhttp3.internal.platform.Platform r0 = r0.findPlatform()
                return r0
        }

        private final okhttp3.internal.platform.Platform findPlatform() {
                r1 = this;
                okhttp3.internal.platform.PlatformRegistry r0 = okhttp3.internal.platform.PlatformRegistry.INSTANCE
                okhttp3.internal.platform.Platform r0 = r0.findPlatform()
                return r0
        }

        public static /* synthetic */ void resetForTests$default(okhttp3.internal.platform.Platform.Companion r0, okhttp3.internal.platform.Platform r1, int r2, java.lang.Object r3) {
                r2 = r2 & 1
                if (r2 == 0) goto L8
                okhttp3.internal.platform.Platform r1 = r0.findPlatform()
            L8:
                r0.resetForTests(r1)
                return
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.lang.String> alpnProtocolNames(@org.jetbrains.annotations.NotNull java.util.List<? extends okhttp3.Protocol> r5) {
                r4 = this;
                java.lang.String r0 = "protocols"
                kotlin.jvm.internal.g0.p(r5, r0)
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.Iterator r5 = r5.iterator()
            L10:
                boolean r1 = r5.hasNext()
                if (r1 == 0) goto L25
                java.lang.Object r1 = r5.next()
                r2 = r1
                okhttp3.Protocol r2 = (okhttp3.Protocol) r2
                okhttp3.Protocol r3 = okhttp3.Protocol.HTTP_1_0
                if (r2 == r3) goto L10
                r0.add(r1)
                goto L10
            L25:
                java.util.ArrayList r5 = new java.util.ArrayList
                r1 = 10
                int r1 = kotlin.collections.f0.d0(r0, r1)
                r5.<init>(r1)
                java.util.Iterator r0 = r0.iterator()
            L34:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L48
                java.lang.Object r1 = r0.next()
                okhttp3.Protocol r1 = (okhttp3.Protocol) r1
                java.lang.String r1 = r1.toString()
                r5.add(r1)
                goto L34
            L48:
                return r5
        }

        @org.jetbrains.annotations.NotNull
        public final byte[] concatLengthPrefixed(@org.jetbrains.annotations.NotNull java.util.List<? extends okhttp3.Protocol> r4) {
                r3 = this;
                java.lang.String r0 = "protocols"
                kotlin.jvm.internal.g0.p(r4, r0)
                okio.Buffer r0 = new okio.Buffer
                r0.<init>()
                java.util.List r4 = r3.alpnProtocolNames(r4)
                java.util.Iterator r4 = r4.iterator()
            L12:
                boolean r1 = r4.hasNext()
                if (r1 == 0) goto L29
                java.lang.Object r1 = r4.next()
                java.lang.String r1 = (java.lang.String) r1
                int r2 = r1.length()
                r0.writeByte(r2)
                r0.writeUtf8(r1)
                goto L12
            L29:
                byte[] r4 = r0.readByteArray()
                return r4
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final okhttp3.internal.platform.Platform get() {
                r1 = this;
                okhttp3.internal.platform.Platform r0 = okhttp3.internal.platform.Platform.access$getPlatform$cp()
                return r0
        }

        public final boolean isAndroid() {
                r1 = this;
                okhttp3.internal.platform.PlatformRegistry r0 = okhttp3.internal.platform.PlatformRegistry.INSTANCE
                boolean r0 = r0.isAndroid()
                return r0
        }

        public final void resetForTests(@org.jetbrains.annotations.NotNull okhttp3.internal.platform.Platform r2) {
                r1 = this;
                java.lang.String r0 = "platform"
                kotlin.jvm.internal.g0.p(r2, r0)
                okhttp3.internal.platform.Platform.access$setPlatform$cp(r2)
                okhttp3.internal.publicsuffix.PublicSuffixDatabase$Companion r2 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion
                r2.resetForTests$okhttp()
                return
        }
    }

    static {
            okhttp3.internal.platform.Platform$Companion r0 = new okhttp3.internal.platform.Platform$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.platform.Platform.Companion = r0
            okhttp3.internal.platform.Platform r0 = okhttp3.internal.platform.Platform.Companion.access$findPlatform(r0)
            okhttp3.internal.platform.Platform.platform = r0
            java.lang.Class<okhttp3.OkHttpClient> r0 = okhttp3.OkHttpClient.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            okhttp3.internal.platform.Platform.logger = r0
            return
    }

    public Platform() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ okhttp3.internal.platform.Platform access$getPlatform$cp() {
            okhttp3.internal.platform.Platform r0 = okhttp3.internal.platform.Platform.platform
            return r0
    }

    public static final /* synthetic */ void access$setPlatform$cp(okhttp3.internal.platform.Platform r0) {
            okhttp3.internal.platform.Platform.platform = r0
            return
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.platform.Platform get() {
            okhttp3.internal.platform.Platform$Companion r0 = okhttp3.internal.platform.Platform.Companion
            okhttp3.internal.platform.Platform r0 = r0.get()
            return r0
    }

    public static /* synthetic */ void log$default(okhttp3.internal.platform.Platform r1, java.lang.String r2, int r3, java.lang.Throwable r4, int r5, java.lang.Object r6) {
            if (r6 != 0) goto L10
            r6 = r5 & 2
            r0 = 4
            if (r6 == 0) goto L8
            r3 = 4
        L8:
            r5 = r5 & r0
            if (r5 == 0) goto Lc
            r4 = 0
        Lc:
            r1.log(r2, r3, r4)
            return
        L10:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Super calls with default arguments not supported in this target, function: log"
            r1.<init>(r2)
            throw r1
    }

    public void afterHandshake(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocket r2) {
            r1 = this;
            java.lang.String r0 = "sslSocket"
            kotlin.jvm.internal.g0.p(r2, r0)
            return
    }

    @org.jetbrains.annotations.NotNull
    public okhttp3.internal.tls.CertificateChainCleaner buildCertificateChainCleaner(@org.jetbrains.annotations.NotNull javax.net.ssl.X509TrustManager r2) {
            r1 = this;
            java.lang.String r0 = "trustManager"
            kotlin.jvm.internal.g0.p(r2, r0)
            okhttp3.internal.tls.BasicCertificateChainCleaner r0 = new okhttp3.internal.tls.BasicCertificateChainCleaner
            okhttp3.internal.tls.TrustRootIndex r2 = r1.buildTrustRootIndex(r2)
            r0.<init>(r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public okhttp3.internal.tls.TrustRootIndex buildTrustRootIndex(@org.jetbrains.annotations.NotNull javax.net.ssl.X509TrustManager r3) {
            r2 = this;
            java.lang.String r0 = "trustManager"
            kotlin.jvm.internal.g0.p(r3, r0)
            okhttp3.internal.tls.BasicTrustRootIndex r0 = new okhttp3.internal.tls.BasicTrustRootIndex
            java.security.cert.X509Certificate[] r3 = r3.getAcceptedIssuers()
            int r1 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r1)
            java.security.cert.X509Certificate[] r3 = (java.security.cert.X509Certificate[]) r3
            r0.<init>(r3)
            return r0
    }

    public void configureTlsExtensions(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocket r1, @org.jetbrains.annotations.Nullable java.lang.String r2, @org.jetbrains.annotations.NotNull java.util.List<okhttp3.Protocol> r3) {
            r0 = this;
            java.lang.String r2 = "sslSocket"
            kotlin.jvm.internal.g0.p(r1, r2)
            java.lang.String r1 = "protocols"
            kotlin.jvm.internal.g0.p(r3, r1)
            return
    }

    public void connectSocket(@org.jetbrains.annotations.NotNull java.net.Socket r2, @org.jetbrains.annotations.NotNull java.net.InetSocketAddress r3, int r4) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "socket"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "address"
            kotlin.jvm.internal.g0.p(r3, r0)
            r2.connect(r3, r4)
            return
    }

    @org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
    @org.jetbrains.annotations.NotNull
    public java.util.List<java.lang.String> getHandshakeServerNames(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocket r5) {
            r4 = this;
            java.lang.String r0 = "sslSocket"
            kotlin.jvm.internal.g0.p(r5, r0)
            javax.net.ssl.SSLSession r5 = r5.getSession()
            boolean r0 = x4.j.a(r5)
            r1 = 0
            if (r0 == 0) goto L15
            javax.net.ssl.ExtendedSSLSession r5 = x4.k.a(r5)
            goto L16
        L15:
            r5 = r1
        L16:
            if (r5 != 0) goto L1d
            java.util.List r5 = kotlin.collections.f0.J()
            return r5
        L1d:
            java.util.List r5 = x4.l.a(r5)     // Catch: java.lang.UnsupportedOperationException -> L5a
            java.lang.String r0 = "getRequestedServerNames(...)"
            kotlin.jvm.internal.g0.o(r5, r0)     // Catch: java.lang.UnsupportedOperationException -> L5a
            java.lang.Iterable r5 = (java.lang.Iterable) r5     // Catch: java.lang.UnsupportedOperationException -> L5a
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.UnsupportedOperationException -> L5a
            r0.<init>()     // Catch: java.lang.UnsupportedOperationException -> L5a
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.UnsupportedOperationException -> L5a
        L31:
            boolean r2 = r5.hasNext()     // Catch: java.lang.UnsupportedOperationException -> L5a
            if (r2 == 0) goto L59
            java.lang.Object r2 = r5.next()     // Catch: java.lang.UnsupportedOperationException -> L5a
            javax.net.ssl.SNIServerName r2 = io.netty.handler.ssl.g.a(r2)     // Catch: java.lang.UnsupportedOperationException -> L5a
            boolean r3 = io.netty.handler.ssl.h.a(r2)     // Catch: java.lang.UnsupportedOperationException -> L5a
            if (r3 == 0) goto L4a
            javax.net.ssl.SNIHostName r2 = io.netty.handler.ssl.i.a(r2)     // Catch: java.lang.UnsupportedOperationException -> L5a
            goto L4b
        L4a:
            r2 = r1
        L4b:
            if (r2 == 0) goto L52
            java.lang.String r2 = io.netty.handler.ssl.j.a(r2)     // Catch: java.lang.UnsupportedOperationException -> L5a
            goto L53
        L52:
            r2 = r1
        L53:
            if (r2 == 0) goto L31
            r0.add(r2)     // Catch: java.lang.UnsupportedOperationException -> L5a
            goto L31
        L59:
            return r0
        L5a:
            java.util.List r5 = kotlin.collections.f0.J()
            return r5
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPrefix() {
            r1 = this;
            java.lang.String r0 = "OkHttp"
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.String getSelectedProtocol(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocket r2) {
            r1 = this;
            java.lang.String r0 = "sslSocket"
            kotlin.jvm.internal.g0.p(r2, r0)
            r2 = 0
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Object getStackTraceForCloseable(@org.jetbrains.annotations.NotNull java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "closer"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.logging.Logger r0 = okhttp3.internal.platform.Platform.logger
            java.util.logging.Level r1 = java.util.logging.Level.FINE
            boolean r0 = r0.isLoggable(r1)
            if (r0 == 0) goto L15
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>(r3)
            return r0
        L15:
            r3 = 0
            return r3
    }

    public boolean isCleartextTrafficPermitted(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "hostname"
            kotlin.jvm.internal.g0.p(r2, r0)
            r2 = 1
            return r2
    }

    public void log(@org.jetbrains.annotations.NotNull java.lang.String r2, int r3, @org.jetbrains.annotations.Nullable java.lang.Throwable r4) {
            r1 = this;
            java.lang.String r0 = "message"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 5
            if (r3 != r0) goto Lb
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            goto Ld
        Lb:
            java.util.logging.Level r3 = java.util.logging.Level.INFO
        Ld:
            java.util.logging.Logger r0 = okhttp3.internal.platform.Platform.logger
            r0.log(r3, r2, r4)
            return
    }

    public void logCloseableLeak(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r1 = this;
            java.lang.String r0 = "message"
            kotlin.jvm.internal.g0.p(r2, r0)
            if (r3 != 0) goto L18
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
        L18:
            r0 = 5
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            r1.log(r2, r0, r3)
            return
    }

    @org.jetbrains.annotations.NotNull
    public javax.net.ssl.SSLContext newSSLContext() {
            r2 = this;
            java.lang.String r0 = "TLS"
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r0)
            java.lang.String r1 = "getInstance(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public javax.net.ssl.SSLSocketFactory newSslSocketFactory(@org.jetbrains.annotations.NotNull javax.net.ssl.X509TrustManager r4) {
            r3 = this;
            java.lang.String r0 = "trustManager"
            kotlin.jvm.internal.g0.p(r4, r0)
            javax.net.ssl.SSLContext r0 = r3.newSSLContext()     // Catch: java.security.GeneralSecurityException -> L1d
            r1 = 1
            javax.net.ssl.TrustManager[] r1 = new javax.net.ssl.TrustManager[r1]     // Catch: java.security.GeneralSecurityException -> L1d
            r2 = 0
            r1[r2] = r4     // Catch: java.security.GeneralSecurityException -> L1d
            r4 = 0
            r0.init(r4, r1, r4)     // Catch: java.security.GeneralSecurityException -> L1d
            javax.net.ssl.SSLSocketFactory r4 = r0.getSocketFactory()     // Catch: java.security.GeneralSecurityException -> L1d
            java.lang.String r0 = "getSocketFactory(...)"
            kotlin.jvm.internal.g0.o(r4, r0)     // Catch: java.security.GeneralSecurityException -> L1d
            return r4
        L1d:
            r4 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No System TLS: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r4)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public javax.net.ssl.X509TrustManager platformTrustManager() {
            r3 = this;
            java.lang.String r0 = javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm()
            javax.net.ssl.TrustManagerFactory r0 = javax.net.ssl.TrustManagerFactory.getInstance(r0)
            r1 = 0
            r0.init(r1)
            javax.net.ssl.TrustManager[] r0 = r0.getTrustManagers()
            kotlin.jvm.internal.g0.m(r0)
            int r1 = r0.length
            r2 = 1
            if (r1 != r2) goto L26
            r1 = 0
            r1 = r0[r1]
            boolean r2 = r1 instanceof javax.net.ssl.X509TrustManager
            if (r2 == 0) goto L26
            java.lang.String r0 = "null cannot be cast to non-null type javax.net.ssl.X509TrustManager"
            kotlin.jvm.internal.g0.n(r1, r0)
            javax.net.ssl.X509TrustManager r1 = (javax.net.ssl.X509TrustManager) r1
            return r1
        L26:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected default trust managers: "
            r1.append(r2)
            java.lang.String r0 = java.util.Arrays.toString(r0)
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.g0.o(r0, r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r1 = "getSimpleName(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public javax.net.ssl.X509TrustManager trustManager(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocketFactory r4) {
            r3 = this;
            java.lang.String r0 = "sslSocketFactory"
            kotlin.jvm.internal.g0.p(r4, r0)
            r0 = 0
            java.lang.String r1 = "sun.security.ssl.SSLContextImpl"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.RuntimeException -> L23 java.lang.ClassNotFoundException -> L36
            kotlin.jvm.internal.g0.m(r1)     // Catch: java.lang.RuntimeException -> L23 java.lang.ClassNotFoundException -> L36
            java.lang.String r2 = "context"
            java.lang.Object r4 = okhttp3.internal._UtilJvmKt.readFieldOrNull(r4, r1, r2)     // Catch: java.lang.RuntimeException -> L23 java.lang.ClassNotFoundException -> L36
            if (r4 != 0) goto L18
            return r0
        L18:
            java.lang.Class<javax.net.ssl.X509TrustManager> r1 = javax.net.ssl.X509TrustManager.class
            java.lang.String r2 = "trustManager"
            java.lang.Object r4 = okhttp3.internal._UtilJvmKt.readFieldOrNull(r4, r1, r2)     // Catch: java.lang.RuntimeException -> L23 java.lang.ClassNotFoundException -> L36
            javax.net.ssl.X509TrustManager r4 = (javax.net.ssl.X509TrustManager) r4     // Catch: java.lang.RuntimeException -> L23 java.lang.ClassNotFoundException -> L36
            return r4
        L23:
            r4 = move-exception
            java.lang.Class r1 = r4.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "java.lang.reflect.InaccessibleObjectException"
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r2)
            if (r1 == 0) goto L35
            goto L36
        L35:
            throw r4
        L36:
            return r0
    }
}
