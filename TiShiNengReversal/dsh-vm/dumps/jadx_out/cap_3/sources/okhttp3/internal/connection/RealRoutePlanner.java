package okhttp3.internal.connection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nRealRoutePlanner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealRoutePlanner.kt\nokhttp3/internal/connection/RealRoutePlanner\n+ 2 Lockable.kt\nokhttp3/internal/concurrent/LockableKt\n*L\n1#1,348:1\n63#2:349\n63#2:350\n*S KotlinDebug\n*F\n+ 1 RealRoutePlanner.kt\nokhttp3/internal/connection/RealRoutePlanner\n*L\n100#1:349\n327#1:350\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class RealRoutePlanner implements okhttp3.internal.connection.RoutePlanner {

    @org.jetbrains.annotations.NotNull
    private final okhttp3.Address address;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.connection.RealCall call;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.connection.RealConnectionPool connectionPool;

    @org.jetbrains.annotations.NotNull
    private final kotlin.collections.m<okhttp3.internal.connection.RoutePlanner.Plan> deferredPlans;
    private final boolean doExtensiveHealthChecks;
    private final boolean fastFallback;

    @org.jetbrains.annotations.Nullable
    private okhttp3.Route nextRouteToTry;
    private final int pingIntervalMillis;
    private final int readTimeoutMillis;
    private final boolean retryOnConnectionFailure;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.connection.RouteDatabase routeDatabase;

    @org.jetbrains.annotations.Nullable
    private okhttp3.internal.connection.RouteSelector.Selection routeSelection;

    @org.jetbrains.annotations.Nullable
    private okhttp3.internal.connection.RouteSelector routeSelector;
    private final int socketConnectTimeoutMillis;
    private final int socketReadTimeoutMillis;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.concurrent.TaskRunner taskRunner;
    private final int writeTimeoutMillis;

    public RealRoutePlanner(@org.jetbrains.annotations.NotNull okhttp3.internal.concurrent.TaskRunner r2, @org.jetbrains.annotations.NotNull okhttp3.internal.connection.RealConnectionPool r3, int r4, int r5, int r6, int r7, int r8, boolean r9, boolean r10, @org.jetbrains.annotations.NotNull okhttp3.Address r11, @org.jetbrains.annotations.NotNull okhttp3.internal.connection.RouteDatabase r12, @org.jetbrains.annotations.NotNull okhttp3.internal.connection.RealCall r13, @org.jetbrains.annotations.NotNull okhttp3.Request r14) {
            r1 = this;
            java.lang.String r0 = "taskRunner"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "connectionPool"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "address"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.String r0 = "routeDatabase"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r13, r0)
            java.lang.String r0 = "request"
            kotlin.jvm.internal.g0.p(r14, r0)
            r1.<init>()
            r1.taskRunner = r2
            r1.connectionPool = r3
            r1.readTimeoutMillis = r4
            r1.writeTimeoutMillis = r5
            r1.socketConnectTimeoutMillis = r6
            r1.socketReadTimeoutMillis = r7
            r1.pingIntervalMillis = r8
            r1.retryOnConnectionFailure = r9
            r1.fastFallback = r10
            r1.address = r11
            r1.routeDatabase = r12
            r1.call = r13
            java.lang.String r2 = r14.method()
            java.lang.String r3 = "GET"
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r3)
            r2 = r2 ^ 1
            r1.doExtensiveHealthChecks = r2
            kotlin.collections.m r2 = new kotlin.collections.m
            r2.<init>()
            r1.deferredPlans = r2
            return
    }

    private final okhttp3.Request createTunnelRequest(okhttp3.Route r5) throws java.io.IOException {
            r4 = this;
            okhttp3.Request$Builder r0 = new okhttp3.Request$Builder
            r0.<init>()
            okhttp3.Address r1 = r5.address()
            okhttp3.HttpUrl r1 = r1.url()
            okhttp3.Request$Builder r0 = r0.url(r1)
            java.lang.String r1 = "CONNECT"
            r2 = 0
            okhttp3.Request$Builder r0 = r0.method(r1, r2)
            okhttp3.Address r1 = r5.address()
            okhttp3.HttpUrl r1 = r1.url()
            r2 = 1
            java.lang.String r1 = okhttp3.internal._UtilJvmKt.toHostHeader(r1, r2)
            java.lang.String r2 = "Host"
            okhttp3.Request$Builder r0 = r0.header(r2, r1)
            java.lang.String r1 = "Proxy-Connection"
            java.lang.String r2 = "Keep-Alive"
            okhttp3.Request$Builder r0 = r0.header(r1, r2)
            java.lang.String r1 = "User-Agent"
            java.lang.String r2 = "okhttp/5.3.0"
            okhttp3.Request$Builder r0 = r0.header(r1, r2)
            okhttp3.Request r0 = r0.build()
            okhttp3.Response$Builder r1 = new okhttp3.Response$Builder
            r1.<init>()
            okhttp3.Response$Builder r1 = r1.request(r0)
            okhttp3.Protocol r2 = okhttp3.Protocol.HTTP_1_1
            okhttp3.Response$Builder r1 = r1.protocol(r2)
            r2 = 407(0x197, float:5.7E-43)
            okhttp3.Response$Builder r1 = r1.code(r2)
            java.lang.String r2 = "Preemptive Authenticate"
            okhttp3.Response$Builder r1 = r1.message(r2)
            r2 = -1
            okhttp3.Response$Builder r1 = r1.sentRequestAtMillis(r2)
            okhttp3.Response$Builder r1 = r1.receivedResponseAtMillis(r2)
            java.lang.String r2 = "Proxy-Authenticate"
            java.lang.String r3 = "OkHttp-Preemptive"
            okhttp3.Response$Builder r1 = r1.header(r2, r3)
            okhttp3.Response r1 = r1.build()
            okhttp3.Address r2 = r5.address()
            okhttp3.Authenticator r2 = r2.proxyAuthenticator()
            okhttp3.Request r5 = r2.authenticate(r5, r1)
            if (r5 != 0) goto L7f
            return r0
        L7f:
            return r5
    }

    public static /* synthetic */ okhttp3.internal.connection.ConnectPlan planConnectToRoute$okhttp$default(okhttp3.internal.connection.RealRoutePlanner r0, okhttp3.Route r1, java.util.List r2, int r3, java.lang.Object r4) throws java.io.IOException {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            okhttp3.internal.connection.ConnectPlan r0 = r0.planConnectToRoute$okhttp(r1, r2)
            return r0
    }

    private final okhttp3.internal.connection.ReusePlan planReuseCallConnection() {
            r6 = this;
            okhttp3.internal.connection.RealCall r0 = r6.call
            okhttp3.internal.connection.RealConnection r0 = r0.getConnection()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            boolean r2 = r6.doExtensiveHealthChecks
            boolean r2 = r0.isHealthy(r2)
            monitor-enter(r0)
            if (r2 != 0) goto L26
            boolean r2 = r0.getNoNewExchanges()     // Catch: java.lang.Throwable -> L23
            r3 = 1
            r2 = r2 ^ r3
            r0.setNoNewExchanges(r3)     // Catch: java.lang.Throwable -> L23
            okhttp3.internal.connection.RealCall r3 = r6.call     // Catch: java.lang.Throwable -> L23
            java.net.Socket r3 = r3.releaseConnectionNoEvents$okhttp()     // Catch: java.lang.Throwable -> L23
            goto L4b
        L23:
            r1 = move-exception
            goto L91
        L26:
            boolean r2 = r0.getNoNewExchanges()     // Catch: java.lang.Throwable -> L23
            r3 = 0
            if (r2 != 0) goto L43
            okhttp3.Route r2 = r0.route()     // Catch: java.lang.Throwable -> L23
            okhttp3.Address r2 = r2.address()     // Catch: java.lang.Throwable -> L23
            okhttp3.HttpUrl r2 = r2.url()     // Catch: java.lang.Throwable -> L23
            boolean r2 = r6.sameHostAndPort(r2)     // Catch: java.lang.Throwable -> L23
            if (r2 != 0) goto L40
            goto L43
        L40:
            r3 = r1
        L41:
            r2 = 0
            goto L4b
        L43:
            okhttp3.internal.connection.RealCall r2 = r6.call     // Catch: java.lang.Throwable -> L23
            java.net.Socket r2 = r2.releaseConnectionNoEvents$okhttp()     // Catch: java.lang.Throwable -> L23
            r3 = r2
            goto L41
        L4b:
            monitor-exit(r0)
            okhttp3.internal.connection.RealCall r4 = r6.call
            okhttp3.internal.connection.RealConnection r4 = r4.getConnection()
            if (r4 == 0) goto L64
            if (r3 != 0) goto L5c
            okhttp3.internal.connection.ReusePlan r1 = new okhttp3.internal.connection.ReusePlan
            r1.<init>(r0)
            return r1
        L5c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Check failed."
            r0.<init>(r1)
            throw r0
        L64:
            if (r3 == 0) goto L69
            okhttp3.internal._UtilJvmKt.closeQuietly(r3)
        L69:
            okhttp3.internal.connection.RealCall r4 = r6.call
            okhttp3.EventListener r4 = r4.getEventListener$okhttp()
            okhttp3.internal.connection.RealCall r5 = r6.call
            r4.connectionReleased(r5, r0)
            okhttp3.internal.connection.ConnectionListener r4 = r0.getConnectionListener$okhttp()
            okhttp3.internal.connection.RealCall r5 = r6.call
            r4.connectionReleased(r0, r5)
            if (r3 == 0) goto L87
            okhttp3.internal.connection.ConnectionListener r2 = r0.getConnectionListener$okhttp()
            r2.connectionClosed(r0)
            goto L90
        L87:
            if (r2 == 0) goto L90
            okhttp3.internal.connection.ConnectionListener r2 = r0.getConnectionListener$okhttp()
            r2.noNewExchanges(r0)
        L90:
            return r1
        L91:
            monitor-exit(r0)
            throw r1
    }

    public static /* synthetic */ okhttp3.internal.connection.ReusePlan planReusePooledConnection$okhttp$default(okhttp3.internal.connection.RealRoutePlanner r1, okhttp3.internal.connection.ConnectPlan r2, java.util.List r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            r0 = 0
            if (r5 == 0) goto L6
            r2 = r0
        L6:
            r4 = r4 & 2
            if (r4 == 0) goto Lb
            r3 = r0
        Lb:
            okhttp3.internal.connection.ReusePlan r1 = r1.planReusePooledConnection$okhttp(r2, r3)
            return r1
    }

    private final okhttp3.Route retryRoute(okhttp3.internal.connection.RealConnection r4) {
            r3 = this;
            monitor-enter(r4)
            int r0 = r4.getRouteFailureCount$okhttp()     // Catch: java.lang.Throwable -> L31
            r1 = 0
            if (r0 == 0) goto L9
            goto L2f
        L9:
            boolean r0 = r4.getNoNewExchanges()     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L10
            goto L2f
        L10:
            okhttp3.Route r0 = r4.route()     // Catch: java.lang.Throwable -> L31
            okhttp3.Address r0 = r0.address()     // Catch: java.lang.Throwable -> L31
            okhttp3.HttpUrl r0 = r0.url()     // Catch: java.lang.Throwable -> L31
            okhttp3.Address r2 = r3.getAddress()     // Catch: java.lang.Throwable -> L31
            okhttp3.HttpUrl r2 = r2.url()     // Catch: java.lang.Throwable -> L31
            boolean r0 = okhttp3.internal._UtilJvmKt.canReuseConnectionFor(r0, r2)     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L2b
            goto L2f
        L2b:
            okhttp3.Route r1 = r4.route()     // Catch: java.lang.Throwable -> L31
        L2f:
            monitor-exit(r4)
            return r1
        L31:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    @org.jetbrains.annotations.NotNull
    public okhttp3.Address getAddress() {
            r1 = this;
            okhttp3.Address r0 = r1.address
            return r0
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    @org.jetbrains.annotations.NotNull
    public kotlin.collections.m<okhttp3.internal.connection.RoutePlanner.Plan> getDeferredPlans() {
            r1 = this;
            kotlin.collections.m<okhttp3.internal.connection.RoutePlanner$Plan> r0 = r1.deferredPlans
            return r0
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public boolean hasNext(@org.jetbrains.annotations.Nullable okhttp3.internal.connection.RealConnection r3) {
            r2 = this;
            kotlin.collections.m r0 = r2.getDeferredPlans()
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 != 0) goto Lc
            return r1
        Lc:
            okhttp3.Route r0 = r2.nextRouteToTry
            if (r0 == 0) goto L11
            return r1
        L11:
            if (r3 == 0) goto L1c
            okhttp3.Route r3 = r2.retryRoute(r3)
            if (r3 == 0) goto L1c
            r2.nextRouteToTry = r3
            return r1
        L1c:
            okhttp3.internal.connection.RouteSelector$Selection r3 = r2.routeSelection
            if (r3 == 0) goto L27
            boolean r3 = r3.hasNext()
            if (r3 != r1) goto L27
            return r1
        L27:
            okhttp3.internal.connection.RouteSelector r3 = r2.routeSelector
            if (r3 != 0) goto L2c
            return r1
        L2c:
            boolean r3 = r3.hasNext()
            return r3
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public boolean isCanceled() {
            r1 = this;
            okhttp3.internal.connection.RealCall r0 = r1.call
            boolean r0 = r0.isCanceled()
            return r0
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    @org.jetbrains.annotations.NotNull
    public okhttp3.internal.connection.RoutePlanner.Plan plan() throws java.io.IOException {
            r2 = this;
            okhttp3.internal.connection.ReusePlan r0 = r2.planReuseCallConnection()
            if (r0 == 0) goto L7
            return r0
        L7:
            r0 = 3
            r1 = 0
            okhttp3.internal.connection.ReusePlan r0 = planReusePooledConnection$okhttp$default(r2, r1, r1, r0, r1)
            if (r0 == 0) goto L10
            return r0
        L10:
            kotlin.collections.m r0 = r2.getDeferredPlans()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L25
            kotlin.collections.m r0 = r2.getDeferredPlans()
            java.lang.Object r0 = r0.removeFirst()
            okhttp3.internal.connection.RoutePlanner$Plan r0 = (okhttp3.internal.connection.RoutePlanner.Plan) r0
            return r0
        L25:
            okhttp3.internal.connection.ConnectPlan r0 = r2.planConnect$okhttp()
            java.util.List r1 = r0.getRoutes$okhttp()
            okhttp3.internal.connection.ReusePlan r1 = r2.planReusePooledConnection$okhttp(r0, r1)
            if (r1 == 0) goto L34
            return r1
        L34:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.connection.ConnectPlan planConnect$okhttp() throws java.io.IOException {
            r5 = this;
            okhttp3.Route r0 = r5.nextRouteToTry
            r1 = 2
            r2 = 0
            if (r0 == 0) goto Ld
            r5.nextRouteToTry = r2
            okhttp3.internal.connection.ConnectPlan r0 = planConnectToRoute$okhttp$default(r5, r0, r2, r1, r2)
            return r0
        Ld:
            okhttp3.internal.connection.RouteSelector$Selection r0 = r5.routeSelection
            if (r0 == 0) goto L20
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L20
            okhttp3.Route r0 = r0.next()
            okhttp3.internal.connection.ConnectPlan r0 = planConnectToRoute$okhttp$default(r5, r0, r2, r1, r2)
            return r0
        L20:
            okhttp3.internal.connection.RouteSelector r0 = r5.routeSelector
            if (r0 != 0) goto L35
            okhttp3.internal.connection.RouteSelector r0 = new okhttp3.internal.connection.RouteSelector
            okhttp3.Address r1 = r5.getAddress()
            okhttp3.internal.connection.RouteDatabase r2 = r5.routeDatabase
            okhttp3.internal.connection.RealCall r3 = r5.call
            boolean r4 = r5.fastFallback
            r0.<init>(r1, r2, r3, r4)
            r5.routeSelector = r0
        L35:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5c
            okhttp3.internal.connection.RouteSelector$Selection r0 = r0.next()
            r5.routeSelection = r0
            boolean r1 = r5.isCanceled()
            if (r1 != 0) goto L54
            okhttp3.Route r1 = r0.next()
            java.util.List r0 = r0.getRoutes()
            okhttp3.internal.connection.ConnectPlan r0 = r5.planConnectToRoute$okhttp(r1, r0)
            return r0
        L54:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Canceled"
            r0.<init>(r1)
            throw r0
        L5c:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "exhausted all routes"
            r0.<init>(r1)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.connection.ConnectPlan planConnectToRoute$okhttp(@org.jetbrains.annotations.NotNull okhttp3.Route r18, @org.jetbrains.annotations.Nullable java.util.List<okhttp3.Route> r19) throws java.io.IOException {
            r17 = this;
            r10 = r17
            java.lang.String r0 = "route"
            r11 = r18
            kotlin.jvm.internal.g0.p(r11, r0)
            okhttp3.Address r0 = r11.address()
            javax.net.ssl.SSLSocketFactory r0 = r0.sslSocketFactory()
            if (r0 != 0) goto L60
            okhttp3.Address r0 = r11.address()
            java.util.List r0 = r0.connectionSpecs()
            okhttp3.ConnectionSpec r1 = okhttp3.ConnectionSpec.CLEARTEXT
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L58
            okhttp3.Address r0 = r11.address()
            okhttp3.HttpUrl r0 = r0.url()
            java.lang.String r0 = r0.host()
            okhttp3.internal.platform.Platform$Companion r1 = okhttp3.internal.platform.Platform.Companion
            okhttp3.internal.platform.Platform r1 = r1.get()
            boolean r1 = r1.isCleartextTrafficPermitted(r0)
            if (r1 == 0) goto L3c
            goto L70
        L3c:
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "CLEARTEXT communication to "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " not permitted by network security policy"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L58:
            java.net.UnknownServiceException r0 = new java.net.UnknownServiceException
            java.lang.String r1 = "CLEARTEXT communication not enabled for client"
            r0.<init>(r1)
            throw r0
        L60:
            okhttp3.Address r0 = r11.address()
            java.util.List r0 = r0.protocols()
            okhttp3.Protocol r1 = okhttp3.Protocol.H2_PRIOR_KNOWLEDGE
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L9c
        L70:
            boolean r0 = r11.requiresTunnel()
            if (r0 == 0) goto L7c
            okhttp3.Request r0 = r17.createTunnelRequest(r18)
        L7a:
            r14 = r0
            goto L7e
        L7c:
            r0 = 0
            goto L7a
        L7e:
            okhttp3.internal.connection.ConnectPlan r0 = new okhttp3.internal.connection.ConnectPlan
            okhttp3.internal.concurrent.TaskRunner r1 = r10.taskRunner
            okhttp3.internal.connection.RealConnectionPool r2 = r10.connectionPool
            int r3 = r10.readTimeoutMillis
            int r4 = r10.writeTimeoutMillis
            int r5 = r10.socketConnectTimeoutMillis
            int r6 = r10.socketReadTimeoutMillis
            int r7 = r10.pingIntervalMillis
            boolean r8 = r10.retryOnConnectionFailure
            okhttp3.internal.connection.RealCall r9 = r10.call
            r15 = -1
            r16 = 0
            r13 = 0
            r12 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r0
        L9c:
            java.net.UnknownServiceException r0 = new java.net.UnknownServiceException
            java.lang.String r1 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r0.<init>(r1)
            throw r0
    }

    @org.jetbrains.annotations.Nullable
    public final okhttp3.internal.connection.ReusePlan planReusePooledConnection$okhttp(@org.jetbrains.annotations.Nullable okhttp3.internal.connection.ConnectPlan r7, @org.jetbrains.annotations.Nullable java.util.List<okhttp3.Route> r8) {
            r6 = this;
            okhttp3.internal.connection.RealConnectionPool r0 = r6.connectionPool
            boolean r1 = r6.doExtensiveHealthChecks
            okhttp3.Address r2 = r6.getAddress()
            okhttp3.internal.connection.RealCall r3 = r6.call
            if (r7 == 0) goto L16
            boolean r4 = r7.isReady()
            if (r4 == 0) goto L16
            r4 = 1
            r5 = 1
        L14:
            r4 = r8
            goto L19
        L16:
            r4 = 0
            r5 = 0
            goto L14
        L19:
            okhttp3.internal.connection.RealConnection r8 = r0.callAcquirePooledConnection$okhttp(r1, r2, r3, r4, r5)
            if (r8 != 0) goto L21
            r7 = 0
            return r7
        L21:
            if (r7 == 0) goto L2c
            okhttp3.Route r0 = r7.getRoute()
            r6.nextRouteToTry = r0
            r7.closeQuietly()
        L2c:
            okhttp3.internal.connection.RealCall r7 = r6.call
            okhttp3.EventListener r7 = r7.getEventListener$okhttp()
            okhttp3.internal.connection.RealCall r0 = r6.call
            r7.connectionAcquired(r0, r8)
            okhttp3.internal.connection.ConnectionListener r7 = r8.getConnectionListener$okhttp()
            okhttp3.internal.connection.RealCall r0 = r6.call
            r7.connectionAcquired(r8, r0)
            okhttp3.internal.connection.ReusePlan r7 = new okhttp3.internal.connection.ReusePlan
            r7.<init>(r8)
            return r7
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public boolean sameHostAndPort(@org.jetbrains.annotations.NotNull okhttp3.HttpUrl r4) {
            r3 = this;
            java.lang.String r0 = "url"
            kotlin.jvm.internal.g0.p(r4, r0)
            okhttp3.Address r0 = r3.getAddress()
            okhttp3.HttpUrl r0 = r0.url()
            int r1 = r4.port()
            int r2 = r0.port()
            if (r1 != r2) goto L27
            java.lang.String r4 = r4.host()
            java.lang.String r0 = r0.host()
            boolean r4 = kotlin.jvm.internal.g0.g(r4, r0)
            if (r4 == 0) goto L27
            r4 = 1
            return r4
        L27:
            r4 = 0
            return r4
    }
}
