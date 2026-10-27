package okhttp3.internal.connection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nConnectPlan.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectPlan.kt\nokhttp3/internal/connection/ConnectPlan\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Lockable.kt\nokhttp3/internal/concurrent/LockableKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,564:1\n1#2:565\n63#3:566\n1563#4:567\n1634#4,3:568\n*S KotlinDebug\n*F\n+ 1 ConnectPlan.kt\nokhttp3/internal/connection/ConnectPlan\n*L\n508#1:566\n393#1:567\n393#1:568,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class ConnectPlan implements okhttp3.internal.connection.RoutePlanner.Plan, okhttp3.internal.http.ExchangeCodec.Carrier {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.connection.ConnectPlan.Companion Companion = null;
    private static final int MAX_TUNNEL_ATTEMPTS = 21;

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String NPE_THROW_WITH_NULL = "throw with null exception";
    private final int attempt;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.connection.RealCall call;
    private volatile boolean canceled;

    @org.jetbrains.annotations.Nullable
    private okhttp3.internal.connection.RealConnection connection;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.connection.RealConnectionPool connectionPool;
    private final int connectionSpecIndex;

    @org.jetbrains.annotations.Nullable
    private okhttp3.Handshake handshake;
    private final boolean isTlsFallback;

    @org.jetbrains.annotations.Nullable
    private java.net.Socket javaNetSocket;
    private final int pingIntervalMillis;

    @org.jetbrains.annotations.Nullable
    private okhttp3.Protocol protocol;

    @org.jetbrains.annotations.Nullable
    private java.net.Socket rawSocket;
    private final int readTimeoutMillis;
    private final boolean retryOnConnectionFailure;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.Route route;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.connection.RealRoutePlanner routePlanner;

    @org.jetbrains.annotations.Nullable
    private final java.util.List<okhttp3.Route> routes;
    private okhttp3.internal.connection.BufferedSocket socket;
    private final int socketConnectTimeoutMillis;
    private final int socketReadTimeoutMillis;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.concurrent.TaskRunner taskRunner;

    @org.jetbrains.annotations.Nullable
    private final okhttp3.Request tunnelRequest;
    private final int writeTimeoutMillis;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
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
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
                java.net.Proxy$Type[] r0 = java.net.Proxy.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                java.net.Proxy$Type r1 = java.net.Proxy.Type.DIRECT     // Catch: java.lang.NoSuchFieldError -> L10
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
            L10:
                java.net.Proxy$Type r1 = java.net.Proxy.Type.HTTP     // Catch: java.lang.NoSuchFieldError -> L19
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
            L19:
                okhttp3.internal.connection.ConnectPlan.WhenMappings.$EnumSwitchMapping$0 = r0
                return
        }

        public WhenMappings() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    static {
            okhttp3.internal.connection.ConnectPlan$Companion r0 = new okhttp3.internal.connection.ConnectPlan$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.connection.ConnectPlan.Companion = r0
            return
    }

    public ConnectPlan(@org.jetbrains.annotations.NotNull okhttp3.internal.concurrent.TaskRunner r2, @org.jetbrains.annotations.NotNull okhttp3.internal.connection.RealConnectionPool r3, int r4, int r5, int r6, int r7, int r8, boolean r9, @org.jetbrains.annotations.NotNull okhttp3.internal.connection.RealCall r10, @org.jetbrains.annotations.NotNull okhttp3.internal.connection.RealRoutePlanner r11, @org.jetbrains.annotations.NotNull okhttp3.Route r12, @org.jetbrains.annotations.Nullable java.util.List<okhttp3.Route> r13, int r14, @org.jetbrains.annotations.Nullable okhttp3.Request r15, int r16, boolean r17) {
            r1 = this;
            java.lang.String r0 = "taskRunner"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "connectionPool"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r0 = "routePlanner"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.String r0 = "route"
            kotlin.jvm.internal.g0.p(r12, r0)
            r1.<init>()
            r1.taskRunner = r2
            r1.connectionPool = r3
            r1.readTimeoutMillis = r4
            r1.writeTimeoutMillis = r5
            r1.socketConnectTimeoutMillis = r6
            r1.socketReadTimeoutMillis = r7
            r1.pingIntervalMillis = r8
            r1.retryOnConnectionFailure = r9
            r1.call = r10
            r1.routePlanner = r11
            r1.route = r12
            r1.routes = r13
            r1.attempt = r14
            r2 = r15
            r1.tunnelRequest = r2
            r2 = r16
            r1.connectionSpecIndex = r2
            r2 = r17
            r1.isTlsFallback = r2
            return
    }

    public static /* synthetic */ java.util.List a(okhttp3.CertificatePinner r0, okhttp3.Handshake r1, okhttp3.Address r2) {
            java.util.List r0 = connectTls$lambda$0(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ java.util.List b(okhttp3.Handshake r0) {
            java.util.List r0 = connectTls$lambda$1(r0)
            return r0
    }

    private final void connectSocket() throws java.io.IOException {
            r4 = this;
            okhttp3.Route r0 = r4.getRoute()
            java.net.Proxy r0 = r0.proxy()
            java.net.Proxy$Type r0 = r0.type()
            if (r0 != 0) goto L10
            r0 = -1
            goto L18
        L10:
            int[] r1 = okhttp3.internal.connection.ConnectPlan.WhenMappings.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r1[r0]
        L18:
            r1 = 1
            if (r0 == r1) goto L2c
            r1 = 2
            if (r0 == r1) goto L2c
            java.net.Socket r0 = new java.net.Socket
            okhttp3.Route r1 = r4.getRoute()
            java.net.Proxy r1 = r1.proxy()
            r0.<init>(r1)
            goto L3f
        L2c:
            okhttp3.Route r0 = r4.getRoute()
            okhttp3.Address r0 = r0.address()
            javax.net.SocketFactory r0 = r0.socketFactory()
            java.net.Socket r0 = r0.createSocket()
            kotlin.jvm.internal.g0.m(r0)
        L3f:
            r4.rawSocket = r0
            boolean r1 = r4.canceled
            if (r1 != 0) goto L9b
            int r1 = r4.socketReadTimeoutMillis
            r0.setSoTimeout(r1)
            okhttp3.internal.platform.Platform$Companion r1 = okhttp3.internal.platform.Platform.Companion     // Catch: java.net.ConnectException -> L78
            okhttp3.internal.platform.Platform r1 = r1.get()     // Catch: java.net.ConnectException -> L78
            okhttp3.Route r2 = r4.getRoute()     // Catch: java.net.ConnectException -> L78
            java.net.InetSocketAddress r2 = r2.socketAddress()     // Catch: java.net.ConnectException -> L78
            int r3 = r4.socketConnectTimeoutMillis     // Catch: java.net.ConnectException -> L78
            r1.connectSocket(r0, r2, r3)     // Catch: java.net.ConnectException -> L78
            okhttp3.internal.connection.BufferedSocket r0 = okhttp3.internal.connection.BufferedSocketKt.asBufferedSocket(r0)     // Catch: java.lang.NullPointerException -> L64
            r4.socket = r0     // Catch: java.lang.NullPointerException -> L64
            return
        L64:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            java.lang.String r2 = "throw with null exception"
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r2)
            if (r1 != 0) goto L72
            return
        L72:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r0)
            throw r1
        L78:
            r0 = move-exception
            java.net.ConnectException r1 = new java.net.ConnectException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to connect to "
            r2.append(r3)
            okhttp3.Route r3 = r4.getRoute()
            java.net.InetSocketAddress r3 = r3.socketAddress()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            r1.initCause(r0)
            throw r1
        L9b:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "canceled"
            r0.<init>(r1)
            throw r0
    }

    private final void connectTls(javax.net.ssl.SSLSocket r10, okhttp3.ConnectionSpec r11) throws java.io.IOException {
            r9 = this;
            okhttp3.Route r0 = r9.getRoute()
            okhttp3.Address r0 = r0.address()
            boolean r1 = r11.supportsTlsExtensions()     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L27
            okhttp3.internal.platform.Platform$Companion r1 = okhttp3.internal.platform.Platform.Companion     // Catch: java.lang.Throwable -> L24
            okhttp3.internal.platform.Platform r1 = r1.get()     // Catch: java.lang.Throwable -> L24
            okhttp3.HttpUrl r2 = r0.url()     // Catch: java.lang.Throwable -> L24
            java.lang.String r2 = r2.host()     // Catch: java.lang.Throwable -> L24
            java.util.List r3 = r0.protocols()     // Catch: java.lang.Throwable -> L24
            r1.configureTlsExtensions(r10, r2, r3)     // Catch: java.lang.Throwable -> L24
            goto L27
        L24:
            r11 = move-exception
            goto L13d
        L27:
            r10.startHandshake()     // Catch: java.lang.Throwable -> L24
            javax.net.ssl.SSLSession r1 = r10.getSession()     // Catch: java.lang.Throwable -> L24
            okhttp3.Handshake$Companion r2 = okhttp3.Handshake.Companion     // Catch: java.lang.Throwable -> L24
            kotlin.jvm.internal.g0.m(r1)     // Catch: java.lang.Throwable -> L24
            okhttp3.Handshake r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L24
            javax.net.ssl.HostnameVerifier r3 = r0.hostnameVerifier()     // Catch: java.lang.Throwable -> L24
            kotlin.jvm.internal.g0.m(r3)     // Catch: java.lang.Throwable -> L24
            okhttp3.HttpUrl r4 = r0.url()     // Catch: java.lang.Throwable -> L24
            java.lang.String r4 = r4.host()     // Catch: java.lang.Throwable -> L24
            boolean r1 = r3.verify(r4, r1)     // Catch: java.lang.Throwable -> L24
            r3 = 0
            if (r1 != 0) goto Ldf
            java.util.List r11 = r2.peerCertificates()     // Catch: java.lang.Throwable -> L24
            r1 = r11
            java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> L24
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L24
            if (r1 != 0) goto Lbb
            r1 = 0
            java.lang.Object r11 = r11.get(r1)     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            kotlin.jvm.internal.g0.n(r11, r1)     // Catch: java.lang.Throwable -> L24
            java.security.cert.X509Certificate r11 = (java.security.cert.X509Certificate) r11     // Catch: java.lang.Throwable -> L24
            javax.net.ssl.SSLPeerUnverifiedException r1 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch: java.lang.Throwable -> L24
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L24
            r2.<init>()     // Catch: java.lang.Throwable -> L24
            java.lang.String r4 = "\n            |Hostname "
            r2.append(r4)     // Catch: java.lang.Throwable -> L24
            okhttp3.HttpUrl r0 = r0.url()     // Catch: java.lang.Throwable -> L24
            java.lang.String r0 = r0.host()     // Catch: java.lang.Throwable -> L24
            r2.append(r0)     // Catch: java.lang.Throwable -> L24
            java.lang.String r0 = " not verified:\n            |    certificate: "
            r2.append(r0)     // Catch: java.lang.Throwable -> L24
            okhttp3.CertificatePinner$Companion r0 = okhttp3.CertificatePinner.Companion     // Catch: java.lang.Throwable -> L24
            java.lang.String r0 = r0.pin(r11)     // Catch: java.lang.Throwable -> L24
            r2.append(r0)     // Catch: java.lang.Throwable -> L24
            java.lang.String r0 = "\n            |    DN: "
            r2.append(r0)     // Catch: java.lang.Throwable -> L24
            java.security.Principal r0 = r11.getSubjectDN()     // Catch: java.lang.Throwable -> L24
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L24
            r2.append(r0)     // Catch: java.lang.Throwable -> L24
            java.lang.String r0 = "\n            |    subjectAltNames: "
            r2.append(r0)     // Catch: java.lang.Throwable -> L24
            okhttp3.internal.tls.OkHostnameVerifier r0 = okhttp3.internal.tls.OkHostnameVerifier.INSTANCE     // Catch: java.lang.Throwable -> L24
            java.util.List r11 = r0.allSubjectAltNames(r11)     // Catch: java.lang.Throwable -> L24
            r2.append(r11)     // Catch: java.lang.Throwable -> L24
            java.lang.String r11 = "\n            "
            r2.append(r11)     // Catch: java.lang.Throwable -> L24
            java.lang.String r11 = r2.toString()     // Catch: java.lang.Throwable -> L24
            r0 = 1
            java.lang.String r11 = kotlin.text.u.x(r11, r3, r0, r3)     // Catch: java.lang.Throwable -> L24
            r1.<init>(r11)     // Catch: java.lang.Throwable -> L24
            throw r1     // Catch: java.lang.Throwable -> L24
        Lbb:
            javax.net.ssl.SSLPeerUnverifiedException r11 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch: java.lang.Throwable -> L24
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L24
            r1.<init>()     // Catch: java.lang.Throwable -> L24
            java.lang.String r2 = "Hostname "
            r1.append(r2)     // Catch: java.lang.Throwable -> L24
            okhttp3.HttpUrl r0 = r0.url()     // Catch: java.lang.Throwable -> L24
            java.lang.String r0 = r0.host()     // Catch: java.lang.Throwable -> L24
            r1.append(r0)     // Catch: java.lang.Throwable -> L24
            java.lang.String r0 = " not verified (no certificates)"
            r1.append(r0)     // Catch: java.lang.Throwable -> L24
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L24
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L24
            throw r11     // Catch: java.lang.Throwable -> L24
        Ldf:
            okhttp3.CertificatePinner r1 = r0.certificatePinner()     // Catch: java.lang.Throwable -> L24
            kotlin.jvm.internal.g0.m(r1)     // Catch: java.lang.Throwable -> L24
            okhttp3.Handshake r4 = new okhttp3.Handshake     // Catch: java.lang.Throwable -> L24
            okhttp3.TlsVersion r5 = r2.tlsVersion()     // Catch: java.lang.Throwable -> L24
            okhttp3.CipherSuite r6 = r2.cipherSuite()     // Catch: java.lang.Throwable -> L24
            java.util.List r7 = r2.localCertificates()     // Catch: java.lang.Throwable -> L24
            okhttp3.internal.connection.a r8 = new okhttp3.internal.connection.a     // Catch: java.lang.Throwable -> L24
            r8.<init>(r1, r2, r0)     // Catch: java.lang.Throwable -> L24
            r4.<init>(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L24
            r9.handshake = r4     // Catch: java.lang.Throwable -> L24
            okhttp3.HttpUrl r0 = r0.url()     // Catch: java.lang.Throwable -> L24
            java.lang.String r0 = r0.host()     // Catch: java.lang.Throwable -> L24
            okhttp3.internal.connection.b r2 = new okhttp3.internal.connection.b     // Catch: java.lang.Throwable -> L24
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L24
            r1.check$okhttp(r0, r2)     // Catch: java.lang.Throwable -> L24
            boolean r11 = r11.supportsTlsExtensions()     // Catch: java.lang.Throwable -> L24
            if (r11 == 0) goto L11e
            okhttp3.internal.platform.Platform$Companion r11 = okhttp3.internal.platform.Platform.Companion     // Catch: java.lang.Throwable -> L24
            okhttp3.internal.platform.Platform r11 = r11.get()     // Catch: java.lang.Throwable -> L24
            java.lang.String r3 = r11.getSelectedProtocol(r10)     // Catch: java.lang.Throwable -> L24
        L11e:
            r9.javaNetSocket = r10     // Catch: java.lang.Throwable -> L24
            okhttp3.internal.connection.BufferedSocket r11 = okhttp3.internal.connection.BufferedSocketKt.asBufferedSocket(r10)     // Catch: java.lang.Throwable -> L24
            r9.socket = r11     // Catch: java.lang.Throwable -> L24
            if (r3 == 0) goto L12f
            okhttp3.Protocol$Companion r11 = okhttp3.Protocol.Companion     // Catch: java.lang.Throwable -> L24
            okhttp3.Protocol r11 = r11.get(r3)     // Catch: java.lang.Throwable -> L24
            goto L131
        L12f:
            okhttp3.Protocol r11 = okhttp3.Protocol.HTTP_1_1     // Catch: java.lang.Throwable -> L24
        L131:
            r9.protocol = r11     // Catch: java.lang.Throwable -> L24
            okhttp3.internal.platform.Platform$Companion r11 = okhttp3.internal.platform.Platform.Companion
            okhttp3.internal.platform.Platform r11 = r11.get()
            r11.afterHandshake(r10)
            return
        L13d:
            okhttp3.internal.platform.Platform$Companion r0 = okhttp3.internal.platform.Platform.Companion
            okhttp3.internal.platform.Platform r0 = r0.get()
            r0.afterHandshake(r10)
            okhttp3.internal._UtilJvmKt.closeQuietly(r10)
            throw r11
    }

    private static final java.util.List connectTls$lambda$0(okhttp3.CertificatePinner r0, okhttp3.Handshake r1, okhttp3.Address r2) {
            okhttp3.internal.tls.CertificateChainCleaner r0 = r0.getCertificateChainCleaner$okhttp()
            kotlin.jvm.internal.g0.m(r0)
            java.util.List r1 = r1.peerCertificates()
            okhttp3.HttpUrl r2 = r2.url()
            java.lang.String r2 = r2.host()
            java.util.List r0 = r0.clean(r1, r2)
            return r0
    }

    private static final java.util.List connectTls$lambda$1(okhttp3.Handshake r3) {
            java.util.List r3 = r3.peerCertificates()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.f0.d0(r3, r1)
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        L15:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r3.next()
            java.security.cert.Certificate r1 = (java.security.cert.Certificate) r1
            java.lang.String r2 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            kotlin.jvm.internal.g0.n(r1, r2)
            java.security.cert.X509Certificate r1 = (java.security.cert.X509Certificate) r1
            r0.add(r1)
            goto L15
        L2c:
            return r0
    }

    private final okhttp3.internal.connection.ConnectPlan copy(int r19, okhttp3.Request r20, int r21, boolean r22) {
            r18 = this;
            r0 = r18
            okhttp3.internal.connection.ConnectPlan r1 = new okhttp3.internal.connection.ConnectPlan
            okhttp3.internal.concurrent.TaskRunner r2 = r0.taskRunner
            okhttp3.internal.connection.RealConnectionPool r3 = r0.connectionPool
            int r4 = r0.readTimeoutMillis
            int r5 = r0.writeTimeoutMillis
            int r6 = r0.socketConnectTimeoutMillis
            int r7 = r0.socketReadTimeoutMillis
            int r8 = r0.pingIntervalMillis
            boolean r9 = r0.retryOnConnectionFailure
            okhttp3.internal.connection.RealCall r10 = r0.call
            okhttp3.internal.connection.RealRoutePlanner r11 = r0.routePlanner
            okhttp3.Route r12 = r0.getRoute()
            java.util.List<okhttp3.Route> r13 = r0.routes
            r14 = r19
            r15 = r20
            r16 = r21
            r17 = r22
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r1
    }

    static /* synthetic */ okhttp3.internal.connection.ConnectPlan copy$default(okhttp3.internal.connection.ConnectPlan r0, int r1, okhttp3.Request r2, int r3, boolean r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto L6
            int r1 = r0.attempt
        L6:
            r6 = r5 & 2
            if (r6 == 0) goto Lc
            okhttp3.Request r2 = r0.tunnelRequest
        Lc:
            r6 = r5 & 4
            if (r6 == 0) goto L12
            int r3 = r0.connectionSpecIndex
        L12:
            r5 = r5 & 8
            if (r5 == 0) goto L18
            boolean r4 = r0.isTlsFallback
        L18:
            okhttp3.internal.connection.ConnectPlan r0 = r0.copy(r1, r2, r3, r4)
            return r0
    }

    private final okhttp3.Request createTunnel() throws java.io.IOException {
            r10 = this;
            okhttp3.Request r0 = r10.tunnelRequest
            kotlin.jvm.internal.g0.m(r0)
            okhttp3.Route r1 = r10.getRoute()
            okhttp3.Address r1 = r1.address()
            okhttp3.HttpUrl r1 = r1.url()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "CONNECT "
            r2.append(r3)
            r3 = 1
            java.lang.String r1 = okhttp3.internal._UtilJvmKt.toHostHeader(r1, r3)
            r2.append(r1)
            java.lang.String r1 = " HTTP/1.1"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        L2c:
            okhttp3.internal.http1.Http1ExchangeCodec r2 = new okhttp3.internal.http1.Http1ExchangeCodec
            okhttp3.internal.connection.BufferedSocket r4 = r10.socket
            java.lang.String r5 = "socket"
            r6 = 0
            if (r4 != 0) goto L39
            kotlin.jvm.internal.g0.S(r5)
            r4 = r6
        L39:
            r2.<init>(r6, r10, r4)
            okhttp3.internal.connection.BufferedSocket r4 = r10.socket
            if (r4 != 0) goto L44
            kotlin.jvm.internal.g0.S(r5)
            r4 = r6
        L44:
            okio.BufferedSource r4 = r4.mo11getSource()
            okio.Timeout r4 = r4.timeout()
            int r7 = r10.readTimeoutMillis
            long r7 = (long) r7
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            r4.timeout(r7, r9)
            okhttp3.internal.connection.BufferedSocket r4 = r10.socket
            if (r4 != 0) goto L5c
            kotlin.jvm.internal.g0.S(r5)
            r4 = r6
        L5c:
            okio.BufferedSink r4 = r4.mo9getSink()
            okio.Timeout r4 = r4.timeout()
            int r5 = r10.writeTimeoutMillis
            long r7 = (long) r5
            r4.timeout(r7, r9)
            okhttp3.Headers r4 = r0.headers()
            r2.writeRequest(r4, r1)
            r2.finishRequest()
            r4 = 0
            okhttp3.Response$Builder r4 = r2.readResponseHeaders(r4)
            kotlin.jvm.internal.g0.m(r4)
            okhttp3.Response$Builder r0 = r4.request(r0)
            okhttp3.Response r0 = r0.build()
            r2.skipConnectBody(r0)
            int r2 = r0.code()
            r4 = 200(0xc8, float:2.8E-43)
            if (r2 == r4) goto Ldf
            r4 = 407(0x197, float:5.7E-43)
            if (r2 != r4) goto Lc4
            okhttp3.Route r2 = r10.getRoute()
            okhttp3.Address r2 = r2.address()
            okhttp3.Authenticator r2 = r2.proxyAuthenticator()
            okhttp3.Route r4 = r10.getRoute()
            okhttp3.Request r2 = r2.authenticate(r4, r0)
            if (r2 == 0) goto Lbc
            java.lang.String r4 = "Connection"
            r5 = 2
            java.lang.String r0 = okhttp3.Response.header$default(r0, r4, r6, r5, r6)
            java.lang.String r4 = "close"
            boolean r0 = kotlin.text.u.a2(r4, r0, r3)
            if (r0 == 0) goto Lb9
            return r2
        Lb9:
            r0 = r2
            goto L2c
        Lbc:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Failed to authenticate with proxy"
            r0.<init>(r1)
            throw r0
        Lc4:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unexpected response code for CONNECT: "
            r2.append(r3)
            int r0 = r0.code()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        Ldf:
            return r6
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* renamed from: cancel */
    public void mo5cancel() {
            r1 = this;
            r0 = 1
            r1.canceled = r0
            java.net.Socket r0 = r1.rawSocket
            if (r0 == 0) goto La
            okhttp3.internal._UtilJvmKt.closeQuietly(r0)
        La:
            return
    }

    public final void closeQuietly() {
            r1 = this;
            java.net.Socket r0 = r1.javaNetSocket
            if (r0 == 0) goto L7
            okhttp3.internal._UtilJvmKt.closeQuietly(r0)
        L7:
            return
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    @org.jetbrains.annotations.NotNull
    /* renamed from: connectTcp */
    public okhttp3.internal.connection.RoutePlanner.ConnectResult mo13connectTcp() {
            r14 = this;
            java.net.Socket r0 = r14.rawSocket
            if (r0 != 0) goto L103
            okhttp3.internal.connection.RealCall r0 = r14.call
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.getPlansToCancel$okhttp()
            r0.add(r14)
            r1 = 0
            okhttp3.internal.connection.RealCall r0 = r14.call     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L5a
            okhttp3.EventListener r0 = r0.getEventListener$okhttp()     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L5a
            okhttp3.internal.connection.RealCall r2 = r14.call     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L5a
            okhttp3.Route r3 = r14.getRoute()     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L5a
            java.net.InetSocketAddress r3 = r3.socketAddress()     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L5a
            okhttp3.Route r4 = r14.getRoute()     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L5a
            java.net.Proxy r4 = r4.proxy()     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L5a
            r0.connectStart(r2, r3, r4)     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L5a
            okhttp3.internal.connection.RealConnectionPool r0 = r14.connectionPool     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L5a
            okhttp3.internal.connection.ConnectionListener r0 = r0.getConnectionListener$okhttp()     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L5a
            okhttp3.Route r2 = r14.getRoute()     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L5a
            okhttp3.internal.connection.RealCall r3 = r14.call     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L5a
            r0.connectStart(r2, r3)     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L5a
            r14.connectSocket()     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L5a
            r1 = 1
            okhttp3.internal.connection.RoutePlanner$ConnectResult r2 = new okhttp3.internal.connection.RoutePlanner$ConnectResult     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L5a
            r6 = 6
            r7 = 0
            r4 = 0
            r5 = 0
            r3 = r14
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L53
            okhttp3.internal.connection.RealCall r0 = r3.call
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.getPlansToCancel$okhttp()
            r0.remove(r14)
            return r2
        L50:
            r0 = move-exception
            goto Lf0
        L53:
            r0 = move-exception
        L54:
            r9 = r0
            goto L5d
        L56:
            r0 = move-exception
            r3 = r14
            goto Lf0
        L5a:
            r0 = move-exception
            r3 = r14
            goto L54
        L5d:
            okhttp3.Route r0 = r14.getRoute()     // Catch: java.lang.Throwable -> L50
            okhttp3.Address r0 = r0.address()     // Catch: java.lang.Throwable -> L50
            java.net.Proxy r0 = r0.proxy()     // Catch: java.lang.Throwable -> L50
            if (r0 != 0) goto La6
            okhttp3.Route r0 = r14.getRoute()     // Catch: java.lang.Throwable -> L50
            java.net.Proxy r0 = r0.proxy()     // Catch: java.lang.Throwable -> L50
            java.net.Proxy$Type r0 = r0.type()     // Catch: java.lang.Throwable -> L50
            java.net.Proxy$Type r2 = java.net.Proxy.Type.DIRECT     // Catch: java.lang.Throwable -> L50
            if (r0 == r2) goto La6
            okhttp3.Route r0 = r14.getRoute()     // Catch: java.lang.Throwable -> L50
            okhttp3.Address r0 = r0.address()     // Catch: java.lang.Throwable -> L50
            java.net.ProxySelector r0 = r0.proxySelector()     // Catch: java.lang.Throwable -> L50
            okhttp3.Route r2 = r14.getRoute()     // Catch: java.lang.Throwable -> L50
            okhttp3.Address r2 = r2.address()     // Catch: java.lang.Throwable -> L50
            okhttp3.HttpUrl r2 = r2.url()     // Catch: java.lang.Throwable -> L50
            java.net.URI r2 = r2.uri()     // Catch: java.lang.Throwable -> L50
            okhttp3.Route r4 = r14.getRoute()     // Catch: java.lang.Throwable -> L50
            java.net.Proxy r4 = r4.proxy()     // Catch: java.lang.Throwable -> L50
            java.net.SocketAddress r4 = r4.address()     // Catch: java.lang.Throwable -> L50
            r0.connectFailed(r2, r4, r9)     // Catch: java.lang.Throwable -> L50
        La6:
            okhttp3.internal.connection.RealCall r0 = r3.call     // Catch: java.lang.Throwable -> L50
            okhttp3.EventListener r4 = r0.getEventListener$okhttp()     // Catch: java.lang.Throwable -> L50
            okhttp3.internal.connection.RealCall r5 = r3.call     // Catch: java.lang.Throwable -> L50
            okhttp3.Route r0 = r14.getRoute()     // Catch: java.lang.Throwable -> L50
            java.net.InetSocketAddress r6 = r0.socketAddress()     // Catch: java.lang.Throwable -> L50
            okhttp3.Route r0 = r14.getRoute()     // Catch: java.lang.Throwable -> L50
            java.net.Proxy r7 = r0.proxy()     // Catch: java.lang.Throwable -> L50
            r8 = 0
            r4.connectFailed(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L50
            okhttp3.internal.connection.RealConnectionPool r0 = r3.connectionPool     // Catch: java.lang.Throwable -> L50
            okhttp3.internal.connection.ConnectionListener r0 = r0.getConnectionListener$okhttp()     // Catch: java.lang.Throwable -> L50
            okhttp3.Route r2 = r14.getRoute()     // Catch: java.lang.Throwable -> L50
            okhttp3.internal.connection.RealCall r4 = r3.call     // Catch: java.lang.Throwable -> L50
            r0.connectFailed(r2, r4, r9)     // Catch: java.lang.Throwable -> L50
            okhttp3.internal.connection.RoutePlanner$ConnectResult r8 = new okhttp3.internal.connection.RoutePlanner$ConnectResult     // Catch: java.lang.Throwable -> L50
            r12 = 2
            r13 = 0
            r10 = 0
            r11 = r9
            r9 = r3
            r8.<init>(r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> Lee
            okhttp3.internal.connection.RealCall r0 = r3.call
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.getPlansToCancel$okhttp()
            r0.remove(r14)
            if (r1 != 0) goto Led
            java.net.Socket r0 = r3.rawSocket
            if (r0 == 0) goto Led
            okhttp3.internal._UtilJvmKt.closeQuietly(r0)
        Led:
            return r8
        Lee:
            r0 = move-exception
            r3 = r9
        Lf0:
            okhttp3.internal.connection.RealCall r2 = r3.call
            java.util.concurrent.CopyOnWriteArrayList r2 = r2.getPlansToCancel$okhttp()
            r2.remove(r14)
            if (r1 != 0) goto L102
            java.net.Socket r1 = r3.rawSocket
            if (r1 == 0) goto L102
            okhttp3.internal._UtilJvmKt.closeQuietly(r1)
        L102:
            throw r0
        L103:
            r3 = r14
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "TCP already connected"
            r0.<init>(r1)
            throw r0
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    @org.jetbrains.annotations.NotNull
    /* renamed from: connectTlsEtc */
    public okhttp3.internal.connection.RoutePlanner.ConnectResult mo14connectTlsEtc() {
            r17 = this;
            r1 = r17
            java.net.Socket r6 = r1.rawSocket
            if (r6 == 0) goto L201
            boolean r0 = r1.isReady()
            if (r0 != 0) goto L1f9
            okhttp3.Route r0 = r1.getRoute()
            okhttp3.Address r0 = r0.address()
            java.util.List r0 = r0.connectionSpecs()
            okhttp3.internal.connection.RealCall r2 = r1.call
            java.util.concurrent.CopyOnWriteArrayList r2 = r2.getPlansToCancel$okhttp()
            r2.add(r1)
            r13 = 0
            r14 = 0
            okhttp3.Request r2 = r1.tunnelRequest     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
            if (r2 == 0) goto L55
            okhttp3.internal.connection.RoutePlanner$ConnectResult r2 = r1.connectTunnel$okhttp()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
            okhttp3.internal.connection.RoutePlanner$Plan r3 = r2.getNextPlan()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
            if (r3 != 0) goto L41
            java.lang.Throwable r3 = r2.getThrowable()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
            if (r3 == 0) goto L55
            goto L41
        L38:
            r0 = move-exception
            goto L1e3
        L3b:
            r0 = move-exception
            r12 = r0
            r16 = r13
            goto L190
        L41:
            okhttp3.internal.connection.RealCall r0 = r1.call
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.getPlansToCancel$okhttp()
            r0.remove(r1)
            java.net.Socket r0 = r1.javaNetSocket
            if (r0 == 0) goto L51
            okhttp3.internal._UtilJvmKt.closeQuietly(r0)
        L51:
            okhttp3.internal._UtilJvmKt.closeQuietly(r6)
            return r2
        L55:
            okhttp3.Route r2 = r1.getRoute()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
            okhttp3.Address r2 = r2.address()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
            javax.net.ssl.SSLSocketFactory r2 = r2.sslSocketFactory()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
            r15 = 1
            java.lang.String r3 = "socket"
            if (r2 == 0) goto L10a
            okhttp3.internal.connection.BufferedSocket r2 = r1.socket     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
            if (r2 != 0) goto L6e
            kotlin.jvm.internal.g0.S(r3)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
            r2 = r13
        L6e:
            okio.BufferedSource r2 = r2.mo11getSource()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
            okio.Buffer r2 = r2.getBuffer()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
            boolean r2 = r2.exhausted()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
            if (r2 == 0) goto L102
            okhttp3.internal.connection.BufferedSocket r2 = r1.socket     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
            if (r2 != 0) goto L84
            kotlin.jvm.internal.g0.S(r3)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
            r2 = r13
        L84:
            okio.BufferedSink r2 = r2.mo9getSink()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
            okio.Buffer r2 = r2.getBuffer()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
            boolean r2 = r2.exhausted()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
            if (r2 == 0) goto L102
            okhttp3.internal.connection.RealCall r2 = r1.call     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
            okhttp3.EventListener r2 = r2.getEventListener$okhttp()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
            okhttp3.internal.connection.RealCall r4 = r1.call     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
            r2.secureConnectStart(r4)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
            okhttp3.Route r2 = r1.getRoute()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
            okhttp3.Address r2 = r2.address()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
            javax.net.ssl.SSLSocketFactory r2 = r2.sslSocketFactory()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
            okhttp3.Route r4 = r1.getRoute()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
            okhttp3.Address r4 = r4.address()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
            okhttp3.HttpUrl r4 = r4.url()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
            java.lang.String r4 = r4.host()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
            okhttp3.Route r5 = r1.getRoute()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
            okhttp3.Address r5 = r5.address()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
            okhttp3.HttpUrl r5 = r5.url()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
            int r5 = r5.port()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
            java.net.Socket r2 = r2.createSocket(r6, r4, r5, r15)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
            java.lang.String r4 = "null cannot be cast to non-null type javax.net.ssl.SSLSocket"
            kotlin.jvm.internal.g0.n(r2, r4)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
            javax.net.ssl.SSLSocket r2 = (javax.net.ssl.SSLSocket) r2     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
            okhttp3.internal.connection.ConnectPlan r4 = r1.planWithCurrentOrInitialConnectionSpec$okhttp(r0, r2)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
            int r5 = r4.connectionSpecIndex     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
            java.lang.Object r5 = r0.get(r5)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
            okhttp3.ConnectionSpec r5 = (okhttp3.ConnectionSpec) r5     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
            okhttp3.internal.connection.ConnectPlan r7 = r4.nextConnectionSpec$okhttp(r0, r2)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
            boolean r0 = r4.isTlsFallback     // Catch: java.lang.Throwable -> L38 java.io.IOException -> Lfc
            r5.apply$okhttp(r2, r0)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> Lfc
            r1.connectTls(r2, r5)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> Lfc
            okhttp3.internal.connection.RealCall r0 = r1.call     // Catch: java.lang.Throwable -> L38 java.io.IOException -> Lfc
            okhttp3.EventListener r0 = r0.getEventListener$okhttp()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> Lfc
            okhttp3.internal.connection.RealCall r2 = r1.call     // Catch: java.lang.Throwable -> L38 java.io.IOException -> Lfc
            okhttp3.Handshake r4 = r1.handshake     // Catch: java.lang.Throwable -> L38 java.io.IOException -> Lfc
            r0.secureConnectEnd(r2, r4)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> Lfc
            r16 = r7
            goto L127
        Lfc:
            r0 = move-exception
            r12 = r0
            r16 = r7
            goto L190
        L102:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
            java.lang.String r2 = "TLS tunnel buffered too many bytes!"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
            throw r0     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
        L10a:
            r1.javaNetSocket = r6     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
            okhttp3.Route r0 = r1.getRoute()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
            okhttp3.Address r0 = r0.address()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
            java.util.List r0 = r0.protocols()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
            okhttp3.Protocol r2 = okhttp3.Protocol.H2_PRIOR_KNOWLEDGE     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
            boolean r0 = r0.contains(r2)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
            if (r0 == 0) goto L121
            goto L123
        L121:
            okhttp3.Protocol r2 = okhttp3.Protocol.HTTP_1_1     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
        L123:
            r1.protocol = r2     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
            r16 = r13
        L127:
            okhttp3.internal.connection.RealConnection r2 = new okhttp3.internal.connection.RealConnection     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L147
            r0 = r3
            okhttp3.internal.concurrent.TaskRunner r3 = r1.taskRunner     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L147
            okhttp3.internal.connection.RealConnectionPool r4 = r1.connectionPool     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L147
            okhttp3.Route r5 = r1.getRoute()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L147
            java.net.Socket r7 = r1.javaNetSocket     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L147
            kotlin.jvm.internal.g0.m(r7)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L147
            okhttp3.Handshake r8 = r1.handshake     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L147
            okhttp3.Protocol r9 = r1.protocol     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L147
            kotlin.jvm.internal.g0.m(r9)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L147
            okhttp3.internal.connection.BufferedSocket r10 = r1.socket     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L147
            if (r10 != 0) goto L14a
            kotlin.jvm.internal.g0.S(r0)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L147
            r10 = r13
            goto L14a
        L147:
            r0 = move-exception
            r12 = r0
            goto L190
        L14a:
            int r11 = r1.pingIntervalMillis     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L147
            okhttp3.internal.connection.RealConnectionPool r0 = r1.connectionPool     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L147
            okhttp3.internal.connection.ConnectionListener r12 = r0.getConnectionListener$okhttp()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L147
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L147
            r1.connection = r2     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L147
            r2.start()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L147
            okhttp3.internal.connection.RealCall r0 = r1.call     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L147
            okhttp3.EventListener r0 = r0.getEventListener$okhttp()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L147
            okhttp3.internal.connection.RealCall r2 = r1.call     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L147
            okhttp3.Route r3 = r1.getRoute()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L147
            java.net.InetSocketAddress r3 = r3.socketAddress()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L147
            okhttp3.Route r4 = r1.getRoute()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L147
            java.net.Proxy r4 = r4.proxy()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L147
            okhttp3.Protocol r5 = r1.protocol     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L147
            r0.connectEnd(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L147
            okhttp3.internal.connection.RoutePlanner$ConnectResult r0 = new okhttp3.internal.connection.RoutePlanner$ConnectResult     // Catch: java.lang.Throwable -> L18a java.io.IOException -> L18d
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L18a java.io.IOException -> L18d
            okhttp3.internal.connection.RealCall r2 = r1.call
            java.util.concurrent.CopyOnWriteArrayList r2 = r2.getPlansToCancel$okhttp()
            r2.remove(r1)
            return r0
        L18a:
            r0 = move-exception
            r14 = 1
            goto L1e3
        L18d:
            r0 = move-exception
            r12 = r0
            r14 = 1
        L190:
            okhttp3.internal.connection.RealCall r0 = r1.call     // Catch: java.lang.Throwable -> L38
            okhttp3.EventListener r7 = r0.getEventListener$okhttp()     // Catch: java.lang.Throwable -> L38
            okhttp3.internal.connection.RealCall r8 = r1.call     // Catch: java.lang.Throwable -> L38
            okhttp3.Route r0 = r1.getRoute()     // Catch: java.lang.Throwable -> L38
            java.net.InetSocketAddress r9 = r0.socketAddress()     // Catch: java.lang.Throwable -> L38
            okhttp3.Route r0 = r1.getRoute()     // Catch: java.lang.Throwable -> L38
            java.net.Proxy r10 = r0.proxy()     // Catch: java.lang.Throwable -> L38
            r11 = 0
            r7.connectFailed(r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L38
            okhttp3.internal.connection.RealConnectionPool r0 = r1.connectionPool     // Catch: java.lang.Throwable -> L38
            okhttp3.internal.connection.ConnectionListener r0 = r0.getConnectionListener$okhttp()     // Catch: java.lang.Throwable -> L38
            okhttp3.Route r2 = r1.getRoute()     // Catch: java.lang.Throwable -> L38
            okhttp3.internal.connection.RealCall r3 = r1.call     // Catch: java.lang.Throwable -> L38
            r0.connectFailed(r2, r3, r12)     // Catch: java.lang.Throwable -> L38
            boolean r0 = r1.retryOnConnectionFailure     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L1c8
            boolean r0 = okhttp3.internal.connection.RetryTlsHandshakeKt.retryTlsHandshake(r12)     // Catch: java.lang.Throwable -> L38
            if (r0 != 0) goto L1c6
            goto L1c8
        L1c6:
            r13 = r16
        L1c8:
            okhttp3.internal.connection.RoutePlanner$ConnectResult r0 = new okhttp3.internal.connection.RoutePlanner$ConnectResult     // Catch: java.lang.Throwable -> L38
            r0.<init>(r1, r13, r12)     // Catch: java.lang.Throwable -> L38
            okhttp3.internal.connection.RealCall r2 = r1.call
            java.util.concurrent.CopyOnWriteArrayList r2 = r2.getPlansToCancel$okhttp()
            r2.remove(r1)
            if (r14 != 0) goto L1e2
            java.net.Socket r2 = r1.javaNetSocket
            if (r2 == 0) goto L1df
            okhttp3.internal._UtilJvmKt.closeQuietly(r2)
        L1df:
            okhttp3.internal._UtilJvmKt.closeQuietly(r6)
        L1e2:
            return r0
        L1e3:
            okhttp3.internal.connection.RealCall r2 = r1.call
            java.util.concurrent.CopyOnWriteArrayList r2 = r2.getPlansToCancel$okhttp()
            r2.remove(r1)
            if (r14 != 0) goto L1f8
            java.net.Socket r2 = r1.javaNetSocket
            if (r2 == 0) goto L1f5
            okhttp3.internal._UtilJvmKt.closeQuietly(r2)
        L1f5:
            okhttp3.internal._UtilJvmKt.closeQuietly(r6)
        L1f8:
            throw r0
        L1f9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "already connected"
            r0.<init>(r2)
            throw r0
        L201:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "TCP not connected"
            r0.<init>(r2)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.connection.RoutePlanner.ConnectResult connectTunnel$okhttp() throws java.io.IOException {
            r15 = this;
            okhttp3.Request r2 = r15.createTunnel()
            if (r2 != 0) goto L12
            okhttp3.internal.connection.RoutePlanner$ConnectResult r3 = new okhttp3.internal.connection.RoutePlanner$ConnectResult
            r7 = 6
            r8 = 0
            r5 = 0
            r6 = 0
            r4 = r15
            r3.<init>(r4, r5, r6, r7, r8)
            r10 = r4
            return r3
        L12:
            r10 = r15
            java.net.Socket r0 = r10.rawSocket
            if (r0 == 0) goto L1a
            okhttp3.internal._UtilJvmKt.closeQuietly(r0)
        L1a:
            int r0 = r10.attempt
            int r1 = r0 + 1
            r0 = 21
            if (r1 >= r0) goto L51
            okhttp3.internal.connection.RealCall r0 = r10.call
            okhttp3.EventListener r0 = r0.getEventListener$okhttp()
            okhttp3.internal.connection.RealCall r3 = r10.call
            okhttp3.Route r4 = r15.getRoute()
            java.net.InetSocketAddress r4 = r4.socketAddress()
            okhttp3.Route r5 = r15.getRoute()
            java.net.Proxy r5 = r5.proxy()
            r6 = 0
            r0.connectEnd(r3, r4, r5, r6)
            okhttp3.internal.connection.RoutePlanner$ConnectResult r9 = new okhttp3.internal.connection.RoutePlanner$ConnectResult
            r5 = 12
            r3 = 0
            r4 = 0
            r0 = r10
            okhttp3.internal.connection.ConnectPlan r11 = copy$default(r0, r1, r2, r3, r4, r5, r6)
            r13 = 4
            r14 = 0
            r12 = 0
            r10 = r15
            r9.<init>(r10, r11, r12, r13, r14)
            return r9
        L51:
            java.net.ProtocolException r5 = new java.net.ProtocolException
            java.lang.String r0 = "Too many tunnel connections attempted: 21"
            r5.<init>(r0)
            okhttp3.internal.connection.RealCall r0 = r10.call
            okhttp3.EventListener r0 = r0.getEventListener$okhttp()
            okhttp3.internal.connection.RealCall r1 = r10.call
            okhttp3.Route r2 = r15.getRoute()
            java.net.InetSocketAddress r2 = r2.socketAddress()
            okhttp3.Route r3 = r15.getRoute()
            java.net.Proxy r3 = r3.proxy()
            r4 = 0
            r0.connectFailed(r1, r2, r3, r4, r5)
            okhttp3.internal.connection.RealConnectionPool r0 = r10.connectionPool
            okhttp3.internal.connection.ConnectionListener r0 = r0.getConnectionListener$okhttp()
            okhttp3.Route r1 = r15.getRoute()
            okhttp3.internal.connection.RealCall r2 = r10.call
            r0.connectFailed(r1, r2, r5)
            okhttp3.internal.connection.RoutePlanner$ConnectResult r9 = new okhttp3.internal.connection.RoutePlanner$ConnectResult
            r13 = 2
            r14 = 0
            r11 = 0
            r12 = r5
            r9.<init>(r10, r11, r12, r13, r14)
            return r9
    }

    public final int getConnectionSpecIndex$okhttp() {
            r1 = this;
            int r0 = r1.connectionSpecIndex
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.net.Socket getJavaNetSocket$okhttp() {
            r1 = this;
            java.net.Socket r0 = r1.javaNetSocket
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public okhttp3.Route getRoute() {
            r1 = this;
            okhttp3.Route r0 = r1.route
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<okhttp3.Route> getRoutes$okhttp() {
            r1 = this;
            java.util.List<okhttp3.Route> r0 = r1.routes
            return r0
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    @org.jetbrains.annotations.NotNull
    /* renamed from: handleSuccess */
    public okhttp3.internal.connection.RealConnection mo6handleSuccess() {
            r4 = this;
            okhttp3.internal.connection.RealCall r0 = r4.call
            okhttp3.OkHttpClient r0 = r0.getClient()
            okhttp3.internal.connection.RouteDatabase r0 = r0.getRouteDatabase$okhttp()
            okhttp3.Route r1 = r4.getRoute()
            r0.connected(r1)
            okhttp3.internal.connection.RealConnection r0 = r4.connection
            kotlin.jvm.internal.g0.m(r0)
            okhttp3.internal.connection.ConnectionListener r1 = r0.getConnectionListener$okhttp()
            okhttp3.Route r2 = r4.getRoute()
            okhttp3.internal.connection.RealCall r3 = r4.call
            r1.connectEnd(r0, r2, r3)
            okhttp3.internal.connection.RealRoutePlanner r1 = r4.routePlanner
            java.util.List<okhttp3.Route> r2 = r4.routes
            okhttp3.internal.connection.ReusePlan r1 = r1.planReusePooledConnection$okhttp(r4, r2)
            if (r1 == 0) goto L32
            okhttp3.internal.connection.RealConnection r0 = r1.getConnection()
            return r0
        L32:
            monitor-enter(r0)
            okhttp3.internal.connection.RealConnectionPool r1 = r4.connectionPool     // Catch: java.lang.Throwable -> L55
            r1.put(r0)     // Catch: java.lang.Throwable -> L55
            okhttp3.internal.connection.RealCall r1 = r4.call     // Catch: java.lang.Throwable -> L55
            r1.acquireConnectionNoEvents(r0)     // Catch: java.lang.Throwable -> L55
            kotlin.n1 r1 = kotlin.n1.a     // Catch: java.lang.Throwable -> L55
            monitor-exit(r0)
            okhttp3.internal.connection.RealCall r1 = r4.call
            okhttp3.EventListener r1 = r1.getEventListener$okhttp()
            okhttp3.internal.connection.RealCall r2 = r4.call
            r1.connectionAcquired(r2, r0)
            okhttp3.internal.connection.ConnectionListener r1 = r0.getConnectionListener$okhttp()
            okhttp3.internal.connection.RealCall r2 = r4.call
            r1.connectionAcquired(r0, r2)
            return r0
        L55:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public boolean isReady() {
            r1 = this;
            okhttp3.Protocol r0 = r1.protocol
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final boolean isTlsFallback$okhttp() {
            r1 = this;
            boolean r0 = r1.isTlsFallback
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final okhttp3.internal.connection.ConnectPlan nextConnectionSpec$okhttp(@org.jetbrains.annotations.NotNull java.util.List<okhttp3.ConnectionSpec> r11, @org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocket r12) {
            r10 = this;
            java.lang.String r0 = "connectionSpecs"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.String r0 = "sslSocket"
            kotlin.jvm.internal.g0.p(r12, r0)
            int r0 = r10.connectionSpecIndex
            r1 = 1
            int r0 = r0 + r1
            int r2 = r11.size()
            r6 = r0
        L13:
            if (r6 >= r2) goto L37
            java.lang.Object r0 = r11.get(r6)
            okhttp3.ConnectionSpec r0 = (okhttp3.ConnectionSpec) r0
            boolean r0 = r0.isCompatible(r12)
            if (r0 == 0) goto L34
            int r11 = r10.connectionSpecIndex
            r12 = -1
            if (r11 == r12) goto L28
            r7 = 1
            goto L2a
        L28:
            r1 = 0
            r7 = 0
        L2a:
            r8 = 3
            r9 = 0
            r4 = 0
            r5 = 0
            r3 = r10
            okhttp3.internal.connection.ConnectPlan r11 = copy$default(r3, r4, r5, r6, r7, r8, r9)
            return r11
        L34:
            int r6 = r6 + 1
            goto L13
        L37:
            r11 = 0
            return r11
    }

    public void noNewExchanges() {
            r0 = this;
            return
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.connection.ConnectPlan planWithCurrentOrInitialConnectionSpec$okhttp(@org.jetbrains.annotations.NotNull java.util.List<okhttp3.ConnectionSpec> r4, @org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocket r5) throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = "connectionSpecs"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "sslSocket"
            kotlin.jvm.internal.g0.p(r5, r0)
            int r0 = r3.connectionSpecIndex
            r1 = -1
            if (r0 == r1) goto L10
            return r3
        L10:
            okhttp3.internal.connection.ConnectPlan r0 = r3.nextConnectionSpec$okhttp(r4, r5)
            if (r0 == 0) goto L17
            return r0
        L17:
            java.net.UnknownServiceException r0 = new java.net.UnknownServiceException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to find acceptable protocols. isFallback="
            r1.append(r2)
            boolean r2 = r3.isTlsFallback
            r1.append(r2)
            java.lang.String r2 = ", modes="
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ", supported protocols="
            r1.append(r4)
            java.lang.String[] r4 = r5.getEnabledProtocols()
            kotlin.jvm.internal.g0.m(r4)
            java.lang.String r4 = java.util.Arrays.toString(r4)
            java.lang.String r5 = "toString(...)"
            kotlin.jvm.internal.g0.o(r4, r5)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    @org.jetbrains.annotations.NotNull
    /* renamed from: retry */
    public okhttp3.internal.connection.RoutePlanner.Plan mo7retry() {
            r19 = this;
            r0 = r19
            okhttp3.internal.connection.ConnectPlan r1 = new okhttp3.internal.connection.ConnectPlan
            okhttp3.internal.concurrent.TaskRunner r2 = r0.taskRunner
            okhttp3.internal.connection.RealConnectionPool r3 = r0.connectionPool
            int r4 = r0.readTimeoutMillis
            int r5 = r0.writeTimeoutMillis
            int r6 = r0.socketConnectTimeoutMillis
            int r7 = r0.socketReadTimeoutMillis
            int r8 = r0.pingIntervalMillis
            boolean r9 = r0.retryOnConnectionFailure
            okhttp3.internal.connection.RealCall r10 = r0.call
            okhttp3.internal.connection.RealRoutePlanner r11 = r0.routePlanner
            okhttp3.Route r12 = r0.getRoute()
            java.util.List<okhttp3.Route> r13 = r0.routes
            int r14 = r0.attempt
            okhttp3.Request r15 = r0.tunnelRequest
            r16 = r1
            int r1 = r0.connectionSpecIndex
            r17 = r1
            boolean r1 = r0.isTlsFallback
            r18 = r17
            r17 = r1
            r1 = r16
            r16 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r16 = r1
            return r16
    }

    public final void setJavaNetSocket$okhttp(@org.jetbrains.annotations.Nullable java.net.Socket r1) {
            r0 = this;
            r0.javaNetSocket = r1
            return
    }

    public void trackFailure(@org.jetbrains.annotations.NotNull okhttp3.internal.connection.RealCall r1, @org.jetbrains.annotations.Nullable java.io.IOException r2) {
            r0 = this;
            java.lang.String r2 = "call"
            kotlin.jvm.internal.g0.p(r1, r2)
            return
    }
}
