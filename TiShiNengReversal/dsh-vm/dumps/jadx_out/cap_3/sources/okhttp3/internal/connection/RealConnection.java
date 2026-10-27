package okhttp3.internal.connection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nRealConnection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealConnection.kt\nokhttp3/internal/connection/RealConnection\n+ 2 Lockable.kt\nokhttp3/internal/concurrent/LockableKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,463:1\n63#2:464\n63#2:465\n63#2:466\n55#2,4:467\n55#2,4:474\n49#2,4:478\n63#2:482\n63#2:483\n63#2:484\n1761#3,3:471\n*S KotlinDebug\n*F\n+ 1 RealConnection.kt\nokhttp3/internal/connection/RealConnection\n*L\n133#1:464\n141#1:465\n147#1:466\n185#1:467,4\n241#1:474,4\n301#1:478,4\n318#1:482\n337#1:483\n372#1:484\n234#1:471,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class RealConnection extends okhttp3.internal.http2.Http2Connection.Listener implements okhttp3.Connection, okhttp3.internal.http.ExchangeCodec.Carrier, okhttp3.internal.concurrent.Lockable {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.connection.RealConnection.Companion Companion = null;
    public static final long IDLE_CONNECTION_HEALTHY_NS = 10000000000L;
    private int allocationLimit;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.ref.Reference<okhttp3.internal.connection.RealCall>> calls;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.connection.ConnectionListener connectionListener;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.connection.RealConnectionPool connectionPool;

    @org.jetbrains.annotations.Nullable
    private final okhttp3.Handshake handshake;

    @org.jetbrains.annotations.Nullable
    private okhttp3.internal.http2.Http2Connection http2Connection;
    private long idleAtNs;

    @org.jetbrains.annotations.NotNull
    private final java.net.Socket javaNetSocket;
    private boolean noCoalescedConnections;
    private boolean noNewExchanges;
    private final int pingIntervalMillis;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.Protocol protocol;

    @org.jetbrains.annotations.NotNull
    private final java.net.Socket rawSocket;
    private int refusedStreamCount;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.Route route;
    private int routeFailureCount;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.connection.BufferedSocket socket;
    private int successCount;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.concurrent.TaskRunner taskRunner;

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

        @org.jetbrains.annotations.NotNull
        public final okhttp3.internal.connection.RealConnection newTestConnection(@org.jetbrains.annotations.NotNull okhttp3.internal.concurrent.TaskRunner r13, @org.jetbrains.annotations.NotNull okhttp3.internal.connection.RealConnectionPool r14, @org.jetbrains.annotations.NotNull okhttp3.Route r15, @org.jetbrains.annotations.NotNull java.net.Socket r16, long r17) {
                r12 = this;
                java.lang.String r0 = "taskRunner"
                kotlin.jvm.internal.g0.p(r13, r0)
                java.lang.String r0 = "connectionPool"
                kotlin.jvm.internal.g0.p(r14, r0)
                java.lang.String r0 = "route"
                kotlin.jvm.internal.g0.p(r15, r0)
                java.lang.String r0 = "socket"
                r6 = r16
                kotlin.jvm.internal.g0.p(r6, r0)
                okhttp3.internal.connection.RealConnection$Companion$newTestConnection$bufferedSocket$1 r9 = new okhttp3.internal.connection.RealConnection$Companion$newTestConnection$bufferedSocket$1
                r9.<init>()
                okhttp3.internal.connection.RealConnection r1 = new okhttp3.internal.connection.RealConnection
                java.net.Socket r5 = new java.net.Socket
                r5.<init>()
                okhttp3.Protocol r8 = okhttp3.Protocol.HTTP_2
                okhttp3.internal.connection.ConnectionListener$Companion r0 = okhttp3.internal.connection.ConnectionListener.Companion
                okhttp3.internal.connection.ConnectionListener r11 = r0.getNONE()
                r7 = 0
                r10 = 0
                r2 = r13
                r3 = r14
                r4 = r15
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                r13 = r17
                r1.setIdleAtNs(r13)
                return r1
        }
    }

    static {
            okhttp3.internal.connection.RealConnection$Companion r0 = new okhttp3.internal.connection.RealConnection$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.connection.RealConnection.Companion = r0
            return
    }

    public RealConnection(@org.jetbrains.annotations.NotNull okhttp3.internal.concurrent.TaskRunner r2, @org.jetbrains.annotations.NotNull okhttp3.internal.connection.RealConnectionPool r3, @org.jetbrains.annotations.NotNull okhttp3.Route r4, @org.jetbrains.annotations.NotNull java.net.Socket r5, @org.jetbrains.annotations.NotNull java.net.Socket r6, @org.jetbrains.annotations.Nullable okhttp3.Handshake r7, @org.jetbrains.annotations.NotNull okhttp3.Protocol r8, @org.jetbrains.annotations.NotNull okhttp3.internal.connection.BufferedSocket r9, int r10, @org.jetbrains.annotations.NotNull okhttp3.internal.connection.ConnectionListener r11) {
            r1 = this;
            java.lang.String r0 = "taskRunner"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "connectionPool"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "route"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "rawSocket"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "javaNetSocket"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "protocol"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "socket"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "connectionListener"
            kotlin.jvm.internal.g0.p(r11, r0)
            r1.<init>()
            r1.taskRunner = r2
            r1.connectionPool = r3
            r1.route = r4
            r1.rawSocket = r5
            r1.javaNetSocket = r6
            r1.handshake = r7
            r1.protocol = r8
            r1.socket = r9
            r1.pingIntervalMillis = r10
            r1.connectionListener = r11
            r2 = 1
            r1.allocationLimit = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.calls = r2
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r1.idleAtNs = r2
            return
    }

    private final boolean certificateSupportHost(okhttp3.HttpUrl r4, okhttp3.Handshake r5) {
            r3 = this;
            java.util.List r5 = r5.peerCertificates()
            r0 = r5
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 != 0) goto L27
            okhttp3.internal.tls.OkHostnameVerifier r0 = okhttp3.internal.tls.OkHostnameVerifier.INSTANCE
            java.lang.String r4 = r4.host()
            java.lang.Object r5 = r5.get(r1)
            java.lang.String r2 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            kotlin.jvm.internal.g0.n(r5, r2)
            java.security.cert.X509Certificate r5 = (java.security.cert.X509Certificate) r5
            boolean r4 = r0.verify(r4, r5)
            if (r4 == 0) goto L27
            r4 = 1
            return r4
        L27:
            return r1
    }

    private final boolean routeMatchesAny(java.util.List<okhttp3.Route> r5) {
            r4 = this;
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            boolean r0 = r5 instanceof java.util.Collection
            r1 = 0
            if (r0 == 0) goto L11
            r0 = r5
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L11
            return r1
        L11:
            java.util.Iterator r5 = r5.iterator()
        L15:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L4f
            java.lang.Object r0 = r5.next()
            okhttp3.Route r0 = (okhttp3.Route) r0
            java.net.Proxy r2 = r0.proxy()
            java.net.Proxy$Type r2 = r2.type()
            java.net.Proxy$Type r3 = java.net.Proxy.Type.DIRECT
            if (r2 != r3) goto L15
            okhttp3.Route r2 = r4.getRoute()
            java.net.Proxy r2 = r2.proxy()
            java.net.Proxy$Type r2 = r2.type()
            if (r2 != r3) goto L15
            okhttp3.Route r2 = r4.getRoute()
            java.net.InetSocketAddress r2 = r2.socketAddress()
            java.net.InetSocketAddress r0 = r0.socketAddress()
            boolean r0 = kotlin.jvm.internal.g0.g(r2, r0)
            if (r0 == 0) goto L15
            r5 = 1
            return r5
        L4f:
            return r1
    }

    private final void startHttp2() throws java.io.IOException {
            r7 = this;
            java.net.Socket r0 = r7.javaNetSocket
            r1 = 0
            r0.setSoTimeout(r1)
            okhttp3.internal.connection.ConnectionListener r0 = r7.connectionListener
            boolean r2 = r0 instanceof okhttp3.internal.http2.FlowControlListener
            r3 = 0
            if (r2 == 0) goto L10
            okhttp3.internal.http2.FlowControlListener r0 = (okhttp3.internal.http2.FlowControlListener) r0
            goto L11
        L10:
            r0 = r3
        L11:
            if (r0 != 0) goto L15
            okhttp3.internal.http2.FlowControlListener$None r0 = okhttp3.internal.http2.FlowControlListener.None.INSTANCE
        L15:
            okhttp3.internal.http2.Http2Connection$Builder r2 = new okhttp3.internal.http2.Http2Connection$Builder
            okhttp3.internal.concurrent.TaskRunner r4 = r7.taskRunner
            r5 = 1
            r2.<init>(r5, r4)
            okhttp3.internal.connection.BufferedSocket r4 = r7.socket
            okhttp3.Route r6 = r7.getRoute()
            okhttp3.Address r6 = r6.address()
            okhttp3.HttpUrl r6 = r6.url()
            java.lang.String r6 = r6.host()
            okhttp3.internal.http2.Http2Connection$Builder r2 = r2.socket(r4, r6)
            okhttp3.internal.http2.Http2Connection$Builder r2 = r2.listener(r7)
            int r4 = r7.pingIntervalMillis
            okhttp3.internal.http2.Http2Connection$Builder r2 = r2.pingIntervalMillis(r4)
            okhttp3.internal.http2.Http2Connection$Builder r0 = r2.flowControlListener(r0)
            okhttp3.internal.http2.Http2Connection r0 = r0.build()
            r7.http2Connection = r0
            okhttp3.internal.http2.Http2Connection$Companion r2 = okhttp3.internal.http2.Http2Connection.Companion
            okhttp3.internal.http2.Settings r2 = r2.getDEFAULT_SETTINGS()
            int r2 = r2.getMaxConcurrentStreams()
            r7.allocationLimit = r2
            okhttp3.internal.http2.Http2Connection.start$default(r0, r1, r5, r3)
            return
    }

    private final boolean supportsUrl(okhttp3.HttpUrl r5) {
            r4 = this;
            boolean r0 = okhttp3.internal._UtilJvmKt.assertionsEnabled
            if (r0 == 0) goto L32
            boolean r0 = java.lang.Thread.holdsLock(r4)
            if (r0 == 0) goto Lb
            goto L32
        Lb:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Thread "
            r0.append(r1)
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = " MUST hold lock on "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L32:
            okhttp3.Route r0 = r4.getRoute()
            okhttp3.Address r0 = r0.address()
            okhttp3.HttpUrl r0 = r0.url()
            int r1 = r5.port()
            int r2 = r0.port()
            r3 = 0
            if (r1 == r2) goto L4a
            return r3
        L4a:
            java.lang.String r1 = r5.host()
            java.lang.String r0 = r0.host()
            boolean r0 = kotlin.jvm.internal.g0.g(r1, r0)
            r1 = 1
            if (r0 == 0) goto L5a
            return r1
        L5a:
            boolean r0 = r4.noCoalescedConnections
            if (r0 != 0) goto L69
            okhttp3.Handshake r0 = r4.handshake
            if (r0 == 0) goto L69
            boolean r5 = r4.certificateSupportHost(r5, r0)
            if (r5 == 0) goto L69
            return r1
        L69:
            return r3
    }

    public void cancel() {
            r1 = this;
            java.net.Socket r0 = r1.rawSocket
            okhttp3.internal._UtilJvmKt.closeQuietly(r0)
            return
    }

    public final void connectFailed$okhttp(@org.jetbrains.annotations.NotNull okhttp3.OkHttpClient r4, @org.jetbrains.annotations.NotNull okhttp3.Route r5, @org.jetbrains.annotations.NotNull java.io.IOException r6) {
            r3 = this;
            java.lang.String r0 = "client"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "failedRoute"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "failure"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.net.Proxy r0 = r5.proxy()
            java.net.Proxy$Type r0 = r0.type()
            java.net.Proxy$Type r1 = java.net.Proxy.Type.DIRECT
            if (r0 == r1) goto L36
            okhttp3.Address r0 = r5.address()
            java.net.ProxySelector r1 = r0.proxySelector()
            okhttp3.HttpUrl r0 = r0.url()
            java.net.URI r0 = r0.uri()
            java.net.Proxy r2 = r5.proxy()
            java.net.SocketAddress r2 = r2.address()
            r1.connectFailed(r0, r2, r6)
        L36:
            okhttp3.internal.connection.RouteDatabase r4 = r4.getRouteDatabase$okhttp()
            r4.failed(r5)
            return
    }

    public final int getAllocationLimit$okhttp() {
            r1 = this;
            int r0 = r1.allocationLimit
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.ref.Reference<okhttp3.internal.connection.RealCall>> getCalls() {
            r1 = this;
            java.util.List<java.lang.ref.Reference<okhttp3.internal.connection.RealCall>> r0 = r1.calls
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.connection.ConnectionListener getConnectionListener$okhttp() {
            r1 = this;
            okhttp3.internal.connection.ConnectionListener r0 = r1.connectionListener
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.connection.RealConnectionPool getConnectionPool() {
            r1 = this;
            okhttp3.internal.connection.RealConnectionPool r0 = r1.connectionPool
            return r0
    }

    public final long getIdleAtNs() {
            r2 = this;
            long r0 = r2.idleAtNs
            return r0
    }

    public final boolean getNoNewExchanges() {
            r1 = this;
            boolean r0 = r1.noNewExchanges
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public okhttp3.Route getRoute() {
            r1 = this;
            okhttp3.Route r0 = r1.route
            return r0
    }

    public final int getRouteFailureCount$okhttp() {
            r1 = this;
            int r0 = r1.routeFailureCount
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.concurrent.TaskRunner getTaskRunner() {
            r1 = this;
            okhttp3.internal.concurrent.TaskRunner r0 = r1.taskRunner
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public okhttp3.Handshake handshake() {
            r1 = this;
            okhttp3.Handshake r0 = r1.handshake
            return r0
    }

    public final void incrementSuccessCount$okhttp() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.successCount     // Catch: java.lang.Throwable -> L9
            int r0 = r0 + 1
            r1.successCount = r0     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return
        L9:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final boolean isEligible$okhttp(@org.jetbrains.annotations.NotNull okhttp3.Address r4, @org.jetbrains.annotations.Nullable java.util.List<okhttp3.Route> r5) {
            r3 = this;
            java.lang.String r0 = "address"
            kotlin.jvm.internal.g0.p(r4, r0)
            boolean r0 = okhttp3.internal._UtilJvmKt.assertionsEnabled
            if (r0 == 0) goto L37
            boolean r0 = java.lang.Thread.holdsLock(r3)
            if (r0 == 0) goto L10
            goto L37
        L10:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Thread "
            r5.append(r0)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            r5.append(r0)
            java.lang.String r0 = " MUST hold lock on "
            r5.append(r0)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L37:
            java.util.List<java.lang.ref.Reference<okhttp3.internal.connection.RealCall>> r0 = r3.calls
            int r0 = r0.size()
            int r1 = r3.allocationLimit
            r2 = 0
            if (r0 >= r1) goto Lb6
            boolean r0 = r3.noNewExchanges
            if (r0 == 0) goto L47
            goto Lb6
        L47:
            okhttp3.Route r0 = r3.getRoute()
            okhttp3.Address r0 = r0.address()
            boolean r0 = r0.equalsNonHost$okhttp(r4)
            if (r0 != 0) goto L56
            return r2
        L56:
            okhttp3.HttpUrl r0 = r4.url()
            java.lang.String r0 = r0.host()
            okhttp3.Route r1 = r3.route()
            okhttp3.Address r1 = r1.address()
            okhttp3.HttpUrl r1 = r1.url()
            java.lang.String r1 = r1.host()
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            r1 = 1
            if (r0 == 0) goto L76
            return r1
        L76:
            okhttp3.internal.http2.Http2Connection r0 = r3.http2Connection
            if (r0 != 0) goto L7b
            return r2
        L7b:
            if (r5 == 0) goto Lb6
            boolean r5 = r3.routeMatchesAny(r5)
            if (r5 != 0) goto L84
            goto Lb6
        L84:
            javax.net.ssl.HostnameVerifier r5 = r4.hostnameVerifier()
            okhttp3.internal.tls.OkHostnameVerifier r0 = okhttp3.internal.tls.OkHostnameVerifier.INSTANCE
            if (r5 == r0) goto L8d
            return r2
        L8d:
            okhttp3.HttpUrl r5 = r4.url()
            boolean r5 = r3.supportsUrl(r5)
            if (r5 != 0) goto L98
            return r2
        L98:
            okhttp3.CertificatePinner r5 = r4.certificatePinner()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lb6
            kotlin.jvm.internal.g0.m(r5)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lb6
            okhttp3.HttpUrl r4 = r4.url()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lb6
            java.lang.String r4 = r4.host()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lb6
            okhttp3.Handshake r0 = r3.handshake()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lb6
            kotlin.jvm.internal.g0.m(r0)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lb6
            java.util.List r0 = r0.peerCertificates()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lb6
            r5.check(r4, r0)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lb6
            return r1
        Lb6:
            return r2
    }

    public final boolean isHealthy(boolean r6) {
            r5 = this;
            boolean r0 = okhttp3.internal._UtilJvmKt.assertionsEnabled
            if (r0 == 0) goto L32
            boolean r0 = java.lang.Thread.holdsLock(r5)
            if (r0 != 0) goto Lb
            goto L32
        Lb:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Thread "
            r0.append(r1)
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = " MUST NOT hold lock on "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L32:
            long r0 = java.lang.System.nanoTime()
            java.net.Socket r2 = r5.rawSocket
            boolean r2 = r2.isClosed()
            if (r2 != 0) goto L82
            java.net.Socket r2 = r5.javaNetSocket
            boolean r2 = r2.isClosed()
            if (r2 != 0) goto L82
            java.net.Socket r2 = r5.javaNetSocket
            boolean r2 = r2.isInputShutdown()
            if (r2 != 0) goto L82
            java.net.Socket r2 = r5.javaNetSocket
            boolean r2 = r2.isOutputShutdown()
            if (r2 == 0) goto L57
            goto L82
        L57:
            okhttp3.internal.http2.Http2Connection r2 = r5.http2Connection
            if (r2 == 0) goto L60
            boolean r6 = r2.isHealthy(r0)
            return r6
        L60:
            monitor-enter(r5)
            long r2 = r5.idleAtNs     // Catch: java.lang.Throwable -> L7f
            long r0 = r0 - r2
            monitor-exit(r5)
            r2 = 10000000000(0x2540be400, double:4.9406564584E-314)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L7d
            if (r6 == 0) goto L7d
            java.net.Socket r6 = r5.javaNetSocket
            okhttp3.internal.connection.BufferedSocket r0 = r5.socket
            okio.BufferedSource r0 = r0.mo11getSource()
            boolean r6 = okhttp3.internal._UtilJvmKt.isHealthy(r6, r0)
            return r6
        L7d:
            r6 = 1
            return r6
        L7f:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        L82:
            r6 = 0
            return r6
    }

    public final boolean isMultiplexed$okhttp() {
            r1 = this;
            okhttp3.internal.http2.Http2Connection r0 = r1.http2Connection
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.http.ExchangeCodec newCodec$okhttp(@org.jetbrains.annotations.NotNull okhttp3.OkHttpClient r6, @org.jetbrains.annotations.NotNull okhttp3.internal.http.RealInterceptorChain r7) throws java.net.SocketException {
            r5 = this;
            java.lang.String r0 = "client"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.g0.p(r7, r0)
            okhttp3.internal.connection.BufferedSocket r0 = r5.socket
            okhttp3.internal.http2.Http2Connection r1 = r5.http2Connection
            if (r1 == 0) goto L16
            okhttp3.internal.http2.Http2ExchangeCodec r0 = new okhttp3.internal.http2.Http2ExchangeCodec
            r0.<init>(r6, r5, r7, r1)
            return r0
        L16:
            java.net.Socket r1 = r5.javaNetSocket
            int r2 = r7.readTimeoutMillis()
            r1.setSoTimeout(r2)
            okio.BufferedSource r1 = r0.mo11getSource()
            okio.Timeout r1 = r1.timeout()
            int r2 = r7.getReadTimeoutMillis$okhttp()
            long r2 = (long) r2
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            r1.timeout(r2, r4)
            okio.BufferedSink r1 = r0.mo9getSink()
            okio.Timeout r1 = r1.timeout()
            int r7 = r7.getWriteTimeoutMillis$okhttp()
            long r2 = (long) r7
            r1.timeout(r2, r4)
            okhttp3.internal.http1.Http1ExchangeCodec r7 = new okhttp3.internal.http1.Http1ExchangeCodec
            r7.<init>(r6, r5, r0)
            return r7
    }

    public final void noCoalescedConnections$okhttp() {
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            r1.noCoalescedConnections = r0     // Catch: java.lang.Throwable -> L8
            kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public void noNewExchanges() {
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            r1.noNewExchanges = r0     // Catch: java.lang.Throwable -> Ld
            kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)
            okhttp3.internal.connection.ConnectionListener r0 = r1.connectionListener
            r0.noNewExchanges(r1)
            return
        Ld:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public void onSettings(@org.jetbrains.annotations.NotNull okhttp3.internal.http2.Http2Connection r2, @org.jetbrains.annotations.NotNull okhttp3.internal.http2.Settings r3) {
            r1 = this;
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "settings"
            kotlin.jvm.internal.g0.p(r3, r2)
            monitor-enter(r1)
            int r2 = r3.getMaxConcurrentStreams()     // Catch: java.lang.Throwable -> L15
            r1.allocationLimit = r2     // Catch: java.lang.Throwable -> L15
            kotlin.n1 r2 = kotlin.n1.a     // Catch: java.lang.Throwable -> L15
            monitor-exit(r1)
            return
        L15:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public void onStream(@org.jetbrains.annotations.NotNull okhttp3.internal.http2.Http2Stream r3) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "stream"
            kotlin.jvm.internal.g0.p(r3, r0)
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.REFUSED_STREAM
            r1 = 0
            r3.close(r0, r1)
            return
    }

    @org.jetbrains.annotations.NotNull
    public okhttp3.Protocol protocol() {
            r1 = this;
            okhttp3.Protocol r0 = r1.protocol
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public okhttp3.Route route() {
            r1 = this;
            okhttp3.Route r0 = r1.getRoute()
            return r0
    }

    public final void setIdleAtNs(long r1) {
            r0 = this;
            r0.idleAtNs = r1
            return
    }

    public final void setNoNewExchanges(boolean r1) {
            r0 = this;
            r0.noNewExchanges = r1
            return
    }

    public final void setRouteFailureCount$okhttp(int r1) {
            r0 = this;
            r0.routeFailureCount = r1
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.net.Socket socket() {
            r1 = this;
            java.net.Socket r0 = r1.javaNetSocket
            return r0
    }

    public final void start() throws java.io.IOException {
            r2 = this;
            long r0 = java.lang.System.nanoTime()
            r2.idleAtNs = r0
            okhttp3.Protocol r0 = r2.protocol
            okhttp3.Protocol r1 = okhttp3.Protocol.HTTP_2
            if (r0 == r1) goto L12
            okhttp3.Protocol r1 = okhttp3.Protocol.H2_PRIOR_KNOWLEDGE
            if (r0 != r1) goto L11
            goto L12
        L11:
            return
        L12:
            r2.startHttp2()
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Connection{"
            r0.append(r1)
            okhttp3.Route r1 = r2.getRoute()
            okhttp3.Address r1 = r1.address()
            okhttp3.HttpUrl r1 = r1.url()
            java.lang.String r1 = r1.host()
            r0.append(r1)
            r1 = 58
            r0.append(r1)
            okhttp3.Route r1 = r2.getRoute()
            okhttp3.Address r1 = r1.address()
            okhttp3.HttpUrl r1 = r1.url()
            int r1 = r1.port()
            r0.append(r1)
            java.lang.String r1 = ", proxy="
            r0.append(r1)
            okhttp3.Route r1 = r2.getRoute()
            java.net.Proxy r1 = r1.proxy()
            r0.append(r1)
            java.lang.String r1 = " hostAddress="
            r0.append(r1)
            okhttp3.Route r1 = r2.getRoute()
            java.net.InetSocketAddress r1 = r1.socketAddress()
            r0.append(r1)
            java.lang.String r1 = " cipherSuite="
            r0.append(r1)
            okhttp3.Handshake r1 = r2.handshake
            if (r1 == 0) goto L64
            okhttp3.CipherSuite r1 = r1.cipherSuite()
            if (r1 != 0) goto L66
        L64:
            java.lang.String r1 = "none"
        L66:
            r0.append(r1)
            java.lang.String r1 = " protocol="
            r0.append(r1)
            okhttp3.Protocol r1 = r2.protocol
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void trackFailure(@org.jetbrains.annotations.NotNull okhttp3.internal.connection.RealCall r4, @org.jetbrains.annotations.Nullable java.io.IOException r5) {
            r3 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r4, r0)
            monitor-enter(r3)
            boolean r0 = r5 instanceof okhttp3.internal.http2.StreamResetException     // Catch: java.lang.Throwable -> L26
            r1 = 1
            if (r0 == 0) goto L41
            r0 = r5
            okhttp3.internal.http2.StreamResetException r0 = (okhttp3.internal.http2.StreamResetException) r0     // Catch: java.lang.Throwable -> L26
            okhttp3.internal.http2.ErrorCode r0 = r0.errorCode     // Catch: java.lang.Throwable -> L26
            okhttp3.internal.http2.ErrorCode r2 = okhttp3.internal.http2.ErrorCode.REFUSED_STREAM     // Catch: java.lang.Throwable -> L26
            if (r0 != r2) goto L28
            int r4 = r3.refusedStreamCount     // Catch: java.lang.Throwable -> L26
            int r4 = r4 + r1
            r3.refusedStreamCount = r4     // Catch: java.lang.Throwable -> L26
            if (r4 <= r1) goto L4c
            boolean r4 = r3.noNewExchanges     // Catch: java.lang.Throwable -> L26
            r4 = r4 ^ r1
            r3.noNewExchanges = r1     // Catch: java.lang.Throwable -> L26
            int r5 = r3.routeFailureCount     // Catch: java.lang.Throwable -> L26
            int r5 = r5 + r1
            r3.routeFailureCount = r5     // Catch: java.lang.Throwable -> L26
            goto L6a
        L26:
            r4 = move-exception
            goto L75
        L28:
            okhttp3.internal.http2.StreamResetException r5 = (okhttp3.internal.http2.StreamResetException) r5     // Catch: java.lang.Throwable -> L26
            okhttp3.internal.http2.ErrorCode r5 = r5.errorCode     // Catch: java.lang.Throwable -> L26
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.CANCEL     // Catch: java.lang.Throwable -> L26
            if (r5 != r0) goto L36
            boolean r4 = r4.isCanceled()     // Catch: java.lang.Throwable -> L26
            if (r4 != 0) goto L4c
        L36:
            boolean r4 = r3.noNewExchanges     // Catch: java.lang.Throwable -> L26
            r4 = r4 ^ r1
            r3.noNewExchanges = r1     // Catch: java.lang.Throwable -> L26
            int r5 = r3.routeFailureCount     // Catch: java.lang.Throwable -> L26
            int r5 = r5 + r1
            r3.routeFailureCount = r5     // Catch: java.lang.Throwable -> L26
            goto L6a
        L41:
            boolean r0 = r3.isMultiplexed$okhttp()     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L4e
            boolean r0 = r5 instanceof okhttp3.internal.http2.ConnectionShutdownException     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L4c
            goto L4e
        L4c:
            r4 = 0
            goto L6a
        L4e:
            boolean r0 = r3.noNewExchanges     // Catch: java.lang.Throwable -> L26
            r0 = r0 ^ r1
            r3.noNewExchanges = r1     // Catch: java.lang.Throwable -> L26
            int r2 = r3.successCount     // Catch: java.lang.Throwable -> L26
            if (r2 != 0) goto L69
            if (r5 == 0) goto L64
            okhttp3.OkHttpClient r4 = r4.getClient()     // Catch: java.lang.Throwable -> L26
            okhttp3.Route r2 = r3.getRoute()     // Catch: java.lang.Throwable -> L26
            r3.connectFailed$okhttp(r4, r2, r5)     // Catch: java.lang.Throwable -> L26
        L64:
            int r4 = r3.routeFailureCount     // Catch: java.lang.Throwable -> L26
            int r4 = r4 + r1
            r3.routeFailureCount = r4     // Catch: java.lang.Throwable -> L26
        L69:
            r4 = r0
        L6a:
            kotlin.n1 r5 = kotlin.n1.a     // Catch: java.lang.Throwable -> L26
            monitor-exit(r3)
            if (r4 == 0) goto L74
            okhttp3.internal.connection.ConnectionListener r4 = r3.connectionListener
            r4.noNewExchanges(r3)
        L74:
            return
        L75:
            monitor-exit(r3)
            throw r4
    }

    public final void useAsSocket$okhttp() {
            r2 = this;
            java.net.Socket r0 = r2.javaNetSocket
            r1 = 0
            r0.setSoTimeout(r1)
            r2.noNewExchanges()
            return
    }
}
