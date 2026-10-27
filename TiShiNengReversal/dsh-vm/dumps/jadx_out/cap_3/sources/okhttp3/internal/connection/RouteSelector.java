package okhttp3.internal.connection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class RouteSelector {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.connection.RouteSelector.Companion Companion = null;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.Address address;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.connection.RealCall call;
    private final boolean fastFallback;

    @org.jetbrains.annotations.NotNull
    private java.util.List<? extends java.net.InetSocketAddress> inetSocketAddresses;
    private int nextProxyIndex;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<okhttp3.Route> postponedRoutes;

    @org.jetbrains.annotations.NotNull
    private java.util.List<? extends java.net.Proxy> proxies;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.connection.RouteDatabase routeDatabase;

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
        public final java.lang.String getSocketHost(@org.jetbrains.annotations.NotNull java.net.InetSocketAddress r2) {
                r1 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.net.InetAddress r0 = r2.getAddress()
                if (r0 != 0) goto L15
                java.lang.String r2 = r2.getHostName()
                java.lang.String r0 = "getHostName(...)"
                kotlin.jvm.internal.g0.o(r2, r0)
                return r2
            L15:
                java.lang.String r2 = r0.getHostAddress()
                java.lang.String r0 = "getHostAddress(...)"
                kotlin.jvm.internal.g0.o(r2, r0)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Selection {
        private int nextRouteIndex;

        @org.jetbrains.annotations.NotNull
        private final java.util.List<okhttp3.Route> routes;

        public Selection(@org.jetbrains.annotations.NotNull java.util.List<okhttp3.Route> r2) {
                r1 = this;
                java.lang.String r0 = "routes"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.<init>()
                r1.routes = r2
                return
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.List<okhttp3.Route> getRoutes() {
                r1 = this;
                java.util.List<okhttp3.Route> r0 = r1.routes
                return r0
        }

        public final boolean hasNext() {
                r2 = this;
                int r0 = r2.nextRouteIndex
                java.util.List<okhttp3.Route> r1 = r2.routes
                int r1 = r1.size()
                if (r0 >= r1) goto Lc
                r0 = 1
                return r0
            Lc:
                r0 = 0
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.Route next() {
                r3 = this;
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L15
                java.util.List<okhttp3.Route> r0 = r3.routes
                int r1 = r3.nextRouteIndex
                int r2 = r1 + 1
                r3.nextRouteIndex = r2
                java.lang.Object r0 = r0.get(r1)
                okhttp3.Route r0 = (okhttp3.Route) r0
                return r0
            L15:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }
    }

    static {
            okhttp3.internal.connection.RouteSelector$Companion r0 = new okhttp3.internal.connection.RouteSelector$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.connection.RouteSelector.Companion = r0
            return
    }

    public RouteSelector(@org.jetbrains.annotations.NotNull okhttp3.Address r2, @org.jetbrains.annotations.NotNull okhttp3.internal.connection.RouteDatabase r3, @org.jetbrains.annotations.NotNull okhttp3.internal.connection.RealCall r4, boolean r5) {
            r1 = this;
            java.lang.String r0 = "address"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "routeDatabase"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r4, r0)
            r1.<init>()
            r1.address = r2
            r1.routeDatabase = r3
            r1.call = r4
            r1.fastFallback = r5
            java.util.List r3 = kotlin.collections.f0.J()
            r1.proxies = r3
            java.util.List r3 = kotlin.collections.f0.J()
            r1.inetSocketAddresses = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r1.postponedRoutes = r3
            okhttp3.HttpUrl r3 = r2.url()
            java.net.Proxy r2 = r2.proxy()
            r1.resetNextProxy(r3, r2)
            return
    }

    private final boolean hasNextProxy() {
            r2 = this;
            int r0 = r2.nextProxyIndex
            java.util.List<? extends java.net.Proxy> r1 = r2.proxies
            int r1 = r1.size()
            if (r0 >= r1) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    private final java.net.Proxy nextProxy() throws java.io.IOException {
            r3 = this;
            boolean r0 = r3.hasNextProxy()
            if (r0 == 0) goto L18
            java.util.List<? extends java.net.Proxy> r0 = r3.proxies
            int r1 = r3.nextProxyIndex
            int r2 = r1 + 1
            r3.nextProxyIndex = r2
            java.lang.Object r0 = r0.get(r1)
            java.net.Proxy r0 = (java.net.Proxy) r0
            r3.resetNextInetSocketAddress(r0)
            return r0
        L18:
            java.net.SocketException r0 = new java.net.SocketException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No route to "
            r1.append(r2)
            okhttp3.Address r2 = r3.address
            okhttp3.HttpUrl r2 = r2.url()
            java.lang.String r2 = r2.host()
            r1.append(r2)
            java.lang.String r2 = "; exhausted proxy configurations: "
            r1.append(r2)
            java.util.List<? extends java.net.Proxy> r2 = r3.proxies
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private final void resetNextInetSocketAddress(java.net.Proxy r6) throws java.io.IOException {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.inetSocketAddresses = r0
            java.net.Proxy$Type r1 = r6.type()
            java.net.Proxy$Type r2 = java.net.Proxy.Type.DIRECT
            if (r1 == r2) goto L4c
            java.net.Proxy$Type r1 = r6.type()
            java.net.Proxy$Type r2 = java.net.Proxy.Type.SOCKS
            if (r1 != r2) goto L18
            goto L4c
        L18:
            java.net.SocketAddress r1 = r6.address()
            boolean r2 = r1 instanceof java.net.InetSocketAddress
            if (r2 == 0) goto L2d
            okhttp3.internal.connection.RouteSelector$Companion r2 = okhttp3.internal.connection.RouteSelector.Companion
            java.net.InetSocketAddress r1 = (java.net.InetSocketAddress) r1
            java.lang.String r2 = r2.getSocketHost(r1)
            int r1 = r1.getPort()
            goto L60
        L2d:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Proxy.address() is not an InetSocketAddress: "
            r6.append(r0)
            java.lang.Class r0 = r1.getClass()
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r0.<init>(r6)
            throw r0
        L4c:
            okhttp3.Address r1 = r5.address
            okhttp3.HttpUrl r1 = r1.url()
            java.lang.String r2 = r1.host()
            okhttp3.Address r1 = r5.address
            okhttp3.HttpUrl r1 = r1.url()
            int r1 = r1.port()
        L60:
            r3 = 1
            if (r3 > r1) goto Lee
            r3 = 65536(0x10000, float:9.1835E-41)
            if (r1 >= r3) goto Lee
            java.net.Proxy$Type r6 = r6.type()
            java.net.Proxy$Type r3 = java.net.Proxy.Type.SOCKS
            if (r6 != r3) goto L77
            java.net.InetSocketAddress r6 = java.net.InetSocketAddress.createUnresolved(r2, r1)
            r0.add(r6)
            return
        L77:
            boolean r6 = okhttp3.internal._HostnamesCommonKt.canParseAsIpAddress(r2)
            if (r6 == 0) goto L86
            java.net.InetAddress r6 = java.net.InetAddress.getByName(r2)
            java.util.List r6 = kotlin.collections.f0.l(r6)
            goto Lac
        L86:
            okhttp3.internal.connection.RealCall r6 = r5.call
            okhttp3.EventListener r6 = r6.getEventListener$okhttp()
            okhttp3.internal.connection.RealCall r3 = r5.call
            r6.dnsStart(r3, r2)
            okhttp3.Address r6 = r5.address
            okhttp3.Dns r6 = r6.dns()
            java.util.List r6 = r6.lookup(r2)
            boolean r3 = r6.isEmpty()
            if (r3 != 0) goto Lce
            okhttp3.internal.connection.RealCall r3 = r5.call
            okhttp3.EventListener r3 = r3.getEventListener$okhttp()
            okhttp3.internal.connection.RealCall r4 = r5.call
            r3.dnsEnd(r4, r2, r6)
        Lac:
            boolean r2 = r5.fastFallback
            if (r2 == 0) goto Lb4
            java.util.List r6 = okhttp3.internal.connection.InetAddressOrderKt.reorderForHappyEyeballs(r6)
        Lb4:
            java.util.Iterator r6 = r6.iterator()
        Lb8:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto Lcd
            java.lang.Object r2 = r6.next()
            java.net.InetAddress r2 = (java.net.InetAddress) r2
            java.net.InetSocketAddress r3 = new java.net.InetSocketAddress
            r3.<init>(r2, r1)
            r0.add(r3)
            goto Lb8
        Lcd:
            return
        Lce:
            java.net.UnknownHostException r6 = new java.net.UnknownHostException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            okhttp3.Address r1 = r5.address
            okhttp3.Dns r1 = r1.dns()
            r0.append(r1)
            java.lang.String r1 = " returned no addresses for "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        Lee:
            java.net.SocketException r6 = new java.net.SocketException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "No route to "
            r0.append(r3)
            r0.append(r2)
            r2 = 58
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = "; port is out of range"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
    }

    private final void resetNextProxy(okhttp3.HttpUrl r3, java.net.Proxy r4) {
            r2 = this;
            okhttp3.internal.connection.RealCall r0 = r2.call
            okhttp3.EventListener r0 = r0.getEventListener$okhttp()
            okhttp3.internal.connection.RealCall r1 = r2.call
            r0.proxySelectStart(r1, r3)
            java.util.List r4 = resetNextProxy$selectProxies(r4, r3, r2)
            r2.proxies = r4
            r4 = 0
            r2.nextProxyIndex = r4
            okhttp3.internal.connection.RealCall r4 = r2.call
            okhttp3.EventListener r4 = r4.getEventListener$okhttp()
            okhttp3.internal.connection.RealCall r0 = r2.call
            java.util.List<? extends java.net.Proxy> r1 = r2.proxies
            r4.proxySelectEnd(r0, r3, r1)
            return
    }

    private static final java.util.List<java.net.Proxy> resetNextProxy$selectProxies(java.net.Proxy r2, okhttp3.HttpUrl r3, okhttp3.internal.connection.RouteSelector r4) {
            if (r2 == 0) goto L7
            java.util.List r2 = kotlin.collections.f0.l(r2)
            return r2
        L7:
            java.net.URI r2 = r3.uri()
            java.lang.String r3 = r2.getHost()
            r0 = 0
            r1 = 1
            if (r3 != 0) goto L1e
            java.net.Proxy[] r2 = new java.net.Proxy[r1]
            java.net.Proxy r3 = java.net.Proxy.NO_PROXY
            r2[r0] = r3
            java.util.List r2 = okhttp3.internal._UtilJvmKt.immutableListOf(r2)
            return r2
        L1e:
            okhttp3.Address r3 = r4.address
            java.net.ProxySelector r3 = r3.proxySelector()
            java.util.List r2 = r3.select(r2)
            r3 = r2
            java.util.Collection r3 = (java.util.Collection) r3
            if (r3 == 0) goto L39
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L34
            goto L39
        L34:
            java.util.List r2 = okhttp3.internal._UtilJvmKt.toImmutableList(r2)
            return r2
        L39:
            java.net.Proxy[] r2 = new java.net.Proxy[r1]
            java.net.Proxy r3 = java.net.Proxy.NO_PROXY
            r2[r0] = r3
            java.util.List r2 = okhttp3.internal._UtilJvmKt.immutableListOf(r2)
            return r2
    }

    public final boolean hasNext() {
            r1 = this;
            boolean r0 = r1.hasNextProxy()
            if (r0 != 0) goto L13
            java.util.List<okhttp3.Route> r0 = r1.postponedRoutes
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L11
            goto L13
        L11:
            r0 = 0
            return r0
        L13:
            r0 = 1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.connection.RouteSelector.Selection next() throws java.io.IOException {
            r6 = this;
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L60
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Lb:
            boolean r1 = r6.hasNextProxy()
            if (r1 == 0) goto L48
            java.net.Proxy r1 = r6.nextProxy()
            java.util.List<? extends java.net.InetSocketAddress> r2 = r6.inetSocketAddresses
            java.util.Iterator r2 = r2.iterator()
        L1b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L42
            java.lang.Object r3 = r2.next()
            java.net.InetSocketAddress r3 = (java.net.InetSocketAddress) r3
            okhttp3.Route r4 = new okhttp3.Route
            okhttp3.Address r5 = r6.address
            r4.<init>(r5, r1, r3)
            okhttp3.internal.connection.RouteDatabase r3 = r6.routeDatabase
            boolean r3 = r3.shouldPostpone(r4)
            if (r3 == 0) goto L3e
            java.util.List<okhttp3.Route> r3 = r6.postponedRoutes
            java.util.Collection r3 = (java.util.Collection) r3
            r3.add(r4)
            goto L1b
        L3e:
            r0.add(r4)
            goto L1b
        L42:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto Lb
        L48:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L5a
            java.util.List<okhttp3.Route> r1 = r6.postponedRoutes
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            kotlin.collections.f0.s0(r0, r1)
            java.util.List<okhttp3.Route> r1 = r6.postponedRoutes
            r1.clear()
        L5a:
            okhttp3.internal.connection.RouteSelector$Selection r1 = new okhttp3.internal.connection.RouteSelector$Selection
            r1.<init>(r0)
            return r1
        L60:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }
}
