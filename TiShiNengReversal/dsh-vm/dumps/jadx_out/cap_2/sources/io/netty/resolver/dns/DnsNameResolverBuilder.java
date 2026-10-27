package io.netty.resolver.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class DnsNameResolverBuilder {
    private io.netty.resolver.dns.AuthoritativeDnsServerCache authoritativeDnsServerCache;
    private io.netty.channel.ChannelFactory<? extends io.netty.channel.socket.DatagramChannel> channelFactory;
    private io.netty.resolver.dns.DnsCnameCache cnameCache;
    private boolean completeOncePreferredResolved;
    private boolean decodeIdn;
    private io.netty.resolver.dns.DnsQueryLifecycleObserverFactory dnsQueryLifecycleObserverFactory;
    private io.netty.resolver.dns.DnsServerAddressStreamProvider dnsServerAddressStreamProvider;
    private io.netty.channel.EventLoop eventLoop;
    private io.netty.resolver.HostsFileEntriesResolver hostsFileEntriesResolver;
    private int maxPayloadSize;
    private int maxQueriesPerResolve;
    private java.lang.Integer maxTtl;
    private java.lang.Integer minTtl;
    private int ndots;
    private java.lang.Integer negativeTtl;
    private boolean optResourceEnabled;
    private long queryTimeoutMillis;
    private boolean recursionDesired;
    private io.netty.resolver.dns.DnsCache resolveCache;
    private io.netty.resolver.ResolvedAddressTypes resolvedAddressTypes;
    private java.lang.String[] searchDomains;
    private io.netty.channel.ChannelFactory<? extends io.netty.channel.socket.SocketChannel> socketChannelFactory;
    private boolean traceEnabled;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.resolver.dns.DnsNameResolverBuilder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$channel$socket$InternetProtocolFamily = null;

        static {
                io.netty.channel.socket.InternetProtocolFamily[] r0 = io.netty.channel.socket.InternetProtocolFamily.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.resolver.dns.DnsNameResolverBuilder.AnonymousClass1.$SwitchMap$io$netty$channel$socket$InternetProtocolFamily = r0
                io.netty.channel.socket.InternetProtocolFamily r1 = io.netty.channel.socket.InternetProtocolFamily.IPv4     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.resolver.dns.DnsNameResolverBuilder.AnonymousClass1.$SwitchMap$io$netty$channel$socket$InternetProtocolFamily     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.channel.socket.InternetProtocolFamily r1 = io.netty.channel.socket.InternetProtocolFamily.IPv6     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    public DnsNameResolverBuilder() {
            r2 = this;
            r2.<init>()
            r0 = 5000(0x1388, double:2.4703E-320)
            r2.queryTimeoutMillis = r0
            io.netty.resolver.ResolvedAddressTypes r0 = io.netty.resolver.dns.DnsNameResolver.DEFAULT_RESOLVE_ADDRESS_TYPES
            r2.resolvedAddressTypes = r0
            r0 = 1
            r2.recursionDesired = r0
            r1 = 16
            r2.maxQueriesPerResolve = r1
            r1 = 4096(0x1000, float:5.74E-42)
            r2.maxPayloadSize = r1
            r2.optResourceEnabled = r0
            io.netty.resolver.HostsFileEntriesResolver r1 = io.netty.resolver.HostsFileEntriesResolver.DEFAULT
            r2.hostsFileEntriesResolver = r1
            io.netty.resolver.dns.DnsServerAddressStreamProvider r1 = io.netty.resolver.dns.DnsServerAddressStreamProviders.platformDefault()
            r2.dnsServerAddressStreamProvider = r1
            io.netty.resolver.dns.NoopDnsQueryLifecycleObserverFactory r1 = io.netty.resolver.dns.NoopDnsQueryLifecycleObserverFactory.INSTANCE
            r2.dnsQueryLifecycleObserverFactory = r1
            r1 = -1
            r2.ndots = r1
            r2.decodeIdn = r0
            return
    }

    public DnsNameResolverBuilder(io.netty.channel.EventLoop r3) {
            r2 = this;
            r2.<init>()
            r0 = 5000(0x1388, double:2.4703E-320)
            r2.queryTimeoutMillis = r0
            io.netty.resolver.ResolvedAddressTypes r0 = io.netty.resolver.dns.DnsNameResolver.DEFAULT_RESOLVE_ADDRESS_TYPES
            r2.resolvedAddressTypes = r0
            r0 = 1
            r2.recursionDesired = r0
            r1 = 16
            r2.maxQueriesPerResolve = r1
            r1 = 4096(0x1000, float:5.74E-42)
            r2.maxPayloadSize = r1
            r2.optResourceEnabled = r0
            io.netty.resolver.HostsFileEntriesResolver r1 = io.netty.resolver.HostsFileEntriesResolver.DEFAULT
            r2.hostsFileEntriesResolver = r1
            io.netty.resolver.dns.DnsServerAddressStreamProvider r1 = io.netty.resolver.dns.DnsServerAddressStreamProviders.platformDefault()
            r2.dnsServerAddressStreamProvider = r1
            io.netty.resolver.dns.NoopDnsQueryLifecycleObserverFactory r1 = io.netty.resolver.dns.NoopDnsQueryLifecycleObserverFactory.INSTANCE
            r2.dnsQueryLifecycleObserverFactory = r1
            r1 = -1
            r2.ndots = r1
            r2.decodeIdn = r0
            r2.eventLoop(r3)
            return
    }

    public static io.netty.resolver.ResolvedAddressTypes computeResolvedAddressTypes(io.netty.channel.socket.InternetProtocolFamily... r3) {
            if (r3 == 0) goto L48
            int r0 = r3.length
            if (r0 != 0) goto L6
            goto L48
        L6:
            int r0 = r3.length
            r1 = 2
            if (r0 > r1) goto L40
            int[] r0 = io.netty.resolver.dns.DnsNameResolverBuilder.AnonymousClass1.$SwitchMap$io$netty$channel$socket$InternetProtocolFamily
            r2 = 0
            r2 = r3[r2]
            int r2 = r2.ordinal()
            r0 = r0[r2]
            r2 = 1
            if (r0 == r2) goto L31
            if (r0 != r1) goto L29
            int r0 = r3.length
            if (r0 < r1) goto L26
            r3 = r3[r2]
            io.netty.channel.socket.InternetProtocolFamily r0 = io.netty.channel.socket.InternetProtocolFamily.IPv4
            if (r3 != r0) goto L26
            io.netty.resolver.ResolvedAddressTypes r3 = io.netty.resolver.ResolvedAddressTypes.IPV6_PREFERRED
            return r3
        L26:
            io.netty.resolver.ResolvedAddressTypes r3 = io.netty.resolver.ResolvedAddressTypes.IPV6_ONLY
            return r3
        L29:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Couldn't resolve ResolvedAddressTypes from InternetProtocolFamily array"
            r3.<init>(r0)
            throw r3
        L31:
            int r0 = r3.length
            if (r0 < r1) goto L3d
            r3 = r3[r2]
            io.netty.channel.socket.InternetProtocolFamily r0 = io.netty.channel.socket.InternetProtocolFamily.IPv6
            if (r3 != r0) goto L3d
            io.netty.resolver.ResolvedAddressTypes r3 = io.netty.resolver.ResolvedAddressTypes.IPV4_PREFERRED
            return r3
        L3d:
            io.netty.resolver.ResolvedAddressTypes r3 = io.netty.resolver.ResolvedAddressTypes.IPV4_ONLY
            return r3
        L40:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "No more than 2 InternetProtocolFamilies"
            r3.<init>(r0)
            throw r3
        L48:
            io.netty.resolver.ResolvedAddressTypes r3 = io.netty.resolver.dns.DnsNameResolver.DEFAULT_RESOLVE_ADDRESS_TYPES
            return r3
    }

    private io.netty.resolver.dns.AuthoritativeDnsServerCache newAuthoritativeDnsServerCache() {
            r5 = this;
            io.netty.resolver.dns.DefaultAuthoritativeDnsServerCache r0 = new io.netty.resolver.dns.DefaultAuthoritativeDnsServerCache
            java.lang.Integer r1 = r5.minTtl
            r2 = 0
            int r1 = io.netty.util.internal.ObjectUtil.intValue(r1, r2)
            java.lang.Integer r2 = r5.maxTtl
            r3 = 2147483647(0x7fffffff, float:NaN)
            int r2 = io.netty.util.internal.ObjectUtil.intValue(r2, r3)
            io.netty.resolver.dns.NameServerComparator r3 = new io.netty.resolver.dns.NameServerComparator
            io.netty.resolver.ResolvedAddressTypes r4 = r5.resolvedAddressTypes
            io.netty.channel.socket.InternetProtocolFamily r4 = io.netty.resolver.dns.DnsNameResolver.preferredAddressType(r4)
            java.lang.Class r4 = r4.addressType()
            r3.<init>(r4)
            r0.<init>(r1, r2, r3)
            return r0
    }

    private io.netty.resolver.dns.DnsCache newCache() {
            r5 = this;
            io.netty.resolver.dns.DefaultDnsCache r0 = new io.netty.resolver.dns.DefaultDnsCache
            java.lang.Integer r1 = r5.minTtl
            r2 = 0
            int r1 = io.netty.util.internal.ObjectUtil.intValue(r1, r2)
            java.lang.Integer r3 = r5.maxTtl
            r4 = 2147483647(0x7fffffff, float:NaN)
            int r3 = io.netty.util.internal.ObjectUtil.intValue(r3, r4)
            java.lang.Integer r4 = r5.negativeTtl
            int r2 = io.netty.util.internal.ObjectUtil.intValue(r4, r2)
            r0.<init>(r1, r3, r2)
            return r0
    }

    private io.netty.resolver.dns.DnsCnameCache newCnameCache() {
            r4 = this;
            io.netty.resolver.dns.DefaultDnsCnameCache r0 = new io.netty.resolver.dns.DefaultDnsCnameCache
            java.lang.Integer r1 = r4.minTtl
            r2 = 0
            int r1 = io.netty.util.internal.ObjectUtil.intValue(r1, r2)
            java.lang.Integer r2 = r4.maxTtl
            r3 = 2147483647(0x7fffffff, float:NaN)
            int r2 = io.netty.util.internal.ObjectUtil.intValue(r2, r3)
            r0.<init>(r1, r2)
            return r0
    }

    public io.netty.resolver.dns.DnsNameResolverBuilder authoritativeDnsServerCache(io.netty.resolver.dns.AuthoritativeDnsServerCache r1) {
            r0 = this;
            r0.authoritativeDnsServerCache = r1
            return r0
    }

    @java.lang.Deprecated
    public io.netty.resolver.dns.DnsNameResolverBuilder authoritativeDnsServerCache(io.netty.resolver.dns.DnsCache r2) {
            r1 = this;
            io.netty.resolver.dns.AuthoritativeDnsServerCacheAdapter r0 = new io.netty.resolver.dns.AuthoritativeDnsServerCacheAdapter
            r0.<init>(r2)
            r1.authoritativeDnsServerCache = r0
            return r1
    }

    public io.netty.resolver.dns.DnsNameResolver build() {
            r24 = this;
            r0 = r24
            io.netty.channel.EventLoop r1 = r0.eventLoop
            if (r1 == 0) goto L8f
            io.netty.resolver.dns.DnsCache r1 = r0.resolveCache
            if (r1 == 0) goto L1f
            java.lang.Integer r2 = r0.minTtl
            if (r2 != 0) goto L17
            java.lang.Integer r2 = r0.maxTtl
            if (r2 != 0) goto L17
            java.lang.Integer r2 = r0.negativeTtl
            if (r2 != 0) goto L17
            goto L1f
        L17:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "resolveCache and TTLs are mutually exclusive"
            r1.<init>(r2)
            throw r1
        L1f:
            io.netty.resolver.dns.AuthoritativeDnsServerCache r2 = r0.authoritativeDnsServerCache
            if (r2 == 0) goto L38
            java.lang.Integer r2 = r0.minTtl
            if (r2 != 0) goto L30
            java.lang.Integer r2 = r0.maxTtl
            if (r2 != 0) goto L30
            java.lang.Integer r2 = r0.negativeTtl
            if (r2 != 0) goto L30
            goto L38
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "authoritativeDnsServerCache and TTLs are mutually exclusive"
            r1.<init>(r2)
            throw r1
        L38:
            if (r1 == 0) goto L3c
        L3a:
            r6 = r1
            goto L41
        L3c:
            io.netty.resolver.dns.DnsCache r1 = r0.newCache()
            goto L3a
        L41:
            io.netty.resolver.dns.DnsCnameCache r1 = r0.cnameCache
            if (r1 == 0) goto L47
        L45:
            r7 = r1
            goto L4c
        L47:
            io.netty.resolver.dns.DnsCnameCache r1 = r0.newCnameCache()
            goto L45
        L4c:
            io.netty.resolver.dns.AuthoritativeDnsServerCache r1 = r0.authoritativeDnsServerCache
            if (r1 == 0) goto L52
        L50:
            r8 = r1
            goto L57
        L52:
            io.netty.resolver.dns.AuthoritativeDnsServerCache r1 = r0.newAuthoritativeDnsServerCache()
            goto L50
        L57:
            io.netty.resolver.dns.DnsNameResolver r2 = new io.netty.resolver.dns.DnsNameResolver
            io.netty.channel.EventLoop r3 = r0.eventLoop
            io.netty.channel.ChannelFactory<? extends io.netty.channel.socket.DatagramChannel> r4 = r0.channelFactory
            io.netty.channel.ChannelFactory<? extends io.netty.channel.socket.SocketChannel> r5 = r0.socketChannelFactory
            io.netty.resolver.dns.DnsQueryLifecycleObserverFactory r9 = r0.dnsQueryLifecycleObserverFactory
            long r10 = r0.queryTimeoutMillis
            io.netty.resolver.ResolvedAddressTypes r12 = r0.resolvedAddressTypes
            boolean r13 = r0.recursionDesired
            int r14 = r0.maxQueriesPerResolve
            boolean r15 = r0.traceEnabled
            int r1 = r0.maxPayloadSize
            r16 = r1
            boolean r1 = r0.optResourceEnabled
            r17 = r1
            io.netty.resolver.HostsFileEntriesResolver r1 = r0.hostsFileEntriesResolver
            r18 = r1
            io.netty.resolver.dns.DnsServerAddressStreamProvider r1 = r0.dnsServerAddressStreamProvider
            r19 = r1
            java.lang.String[] r1 = r0.searchDomains
            r20 = r1
            int r1 = r0.ndots
            r21 = r1
            boolean r1 = r0.decodeIdn
            r22 = r1
            boolean r1 = r0.completeOncePreferredResolved
            r23 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r2
        L8f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "eventLoop should be specified to build a DnsNameResolver."
            r1.<init>(r2)
            throw r1
    }

    protected io.netty.channel.ChannelFactory<? extends io.netty.channel.socket.DatagramChannel> channelFactory() {
            r1 = this;
            io.netty.channel.ChannelFactory<? extends io.netty.channel.socket.DatagramChannel> r0 = r1.channelFactory
            return r0
    }

    public io.netty.resolver.dns.DnsNameResolverBuilder channelFactory(io.netty.channel.ChannelFactory<? extends io.netty.channel.socket.DatagramChannel> r1) {
            r0 = this;
            r0.channelFactory = r1
            return r0
    }

    public io.netty.resolver.dns.DnsNameResolverBuilder channelType(java.lang.Class<? extends io.netty.channel.socket.DatagramChannel> r2) {
            r1 = this;
            io.netty.channel.ReflectiveChannelFactory r0 = new io.netty.channel.ReflectiveChannelFactory
            r0.<init>(r2)
            io.netty.resolver.dns.DnsNameResolverBuilder r2 = r1.channelFactory(r0)
            return r2
    }

    public io.netty.resolver.dns.DnsNameResolverBuilder cnameCache(io.netty.resolver.dns.DnsCnameCache r1) {
            r0 = this;
            r0.cnameCache = r1
            return r0
    }

    public io.netty.resolver.dns.DnsNameResolverBuilder completeOncePreferredResolved(boolean r1) {
            r0 = this;
            r0.completeOncePreferredResolved = r1
            return r0
    }

    public io.netty.resolver.dns.DnsNameResolverBuilder copy() {
            r3 = this;
            io.netty.resolver.dns.DnsNameResolverBuilder r0 = new io.netty.resolver.dns.DnsNameResolverBuilder
            r0.<init>()
            io.netty.channel.EventLoop r1 = r3.eventLoop
            if (r1 == 0) goto Lc
            r0.eventLoop(r1)
        Lc:
            io.netty.channel.ChannelFactory<? extends io.netty.channel.socket.DatagramChannel> r1 = r3.channelFactory
            if (r1 == 0) goto L13
            r0.channelFactory(r1)
        L13:
            io.netty.channel.ChannelFactory<? extends io.netty.channel.socket.SocketChannel> r1 = r3.socketChannelFactory
            if (r1 == 0) goto L1a
            r0.socketChannelFactory(r1)
        L1a:
            io.netty.resolver.dns.DnsCache r1 = r3.resolveCache
            if (r1 == 0) goto L21
            r0.resolveCache(r1)
        L21:
            io.netty.resolver.dns.DnsCnameCache r1 = r3.cnameCache
            if (r1 == 0) goto L28
            r0.cnameCache(r1)
        L28:
            java.lang.Integer r1 = r3.maxTtl
            if (r1 == 0) goto L3d
            java.lang.Integer r1 = r3.minTtl
            if (r1 == 0) goto L3d
            int r1 = r1.intValue()
            java.lang.Integer r2 = r3.maxTtl
            int r2 = r2.intValue()
            r0.ttl(r1, r2)
        L3d:
            java.lang.Integer r1 = r3.negativeTtl
            if (r1 == 0) goto L48
            int r1 = r1.intValue()
            r0.negativeTtl(r1)
        L48:
            io.netty.resolver.dns.AuthoritativeDnsServerCache r1 = r3.authoritativeDnsServerCache
            if (r1 == 0) goto L4f
            r0.authoritativeDnsServerCache(r1)
        L4f:
            io.netty.resolver.dns.DnsQueryLifecycleObserverFactory r1 = r3.dnsQueryLifecycleObserverFactory
            if (r1 == 0) goto L56
            r0.dnsQueryLifecycleObserverFactory(r1)
        L56:
            long r1 = r3.queryTimeoutMillis
            r0.queryTimeoutMillis(r1)
            io.netty.resolver.ResolvedAddressTypes r1 = r3.resolvedAddressTypes
            r0.resolvedAddressTypes(r1)
            boolean r1 = r3.recursionDesired
            r0.recursionDesired(r1)
            int r1 = r3.maxQueriesPerResolve
            r0.maxQueriesPerResolve(r1)
            boolean r1 = r3.traceEnabled
            r0.traceEnabled(r1)
            int r1 = r3.maxPayloadSize
            r0.maxPayloadSize(r1)
            boolean r1 = r3.optResourceEnabled
            r0.optResourceEnabled(r1)
            io.netty.resolver.HostsFileEntriesResolver r1 = r3.hostsFileEntriesResolver
            r0.hostsFileEntriesResolver(r1)
            io.netty.resolver.dns.DnsServerAddressStreamProvider r1 = r3.dnsServerAddressStreamProvider
            if (r1 == 0) goto L85
            r0.nameServerProvider(r1)
        L85:
            java.lang.String[] r1 = r3.searchDomains
            if (r1 == 0) goto L90
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.searchDomains(r1)
        L90:
            int r1 = r3.ndots
            r0.ndots(r1)
            boolean r1 = r3.decodeIdn
            r0.decodeIdn(r1)
            boolean r1 = r3.completeOncePreferredResolved
            r0.completeOncePreferredResolved(r1)
            return r0
    }

    public io.netty.resolver.dns.DnsNameResolverBuilder decodeIdn(boolean r1) {
            r0 = this;
            r0.decodeIdn = r1
            return r0
    }

    public io.netty.resolver.dns.DnsNameResolverBuilder dnsQueryLifecycleObserverFactory(io.netty.resolver.dns.DnsQueryLifecycleObserverFactory r2) {
            r1 = this;
            java.lang.String r0 = "lifecycleObserverFactory"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.resolver.dns.DnsQueryLifecycleObserverFactory r2 = (io.netty.resolver.dns.DnsQueryLifecycleObserverFactory) r2
            r1.dnsQueryLifecycleObserverFactory = r2
            return r1
    }

    public io.netty.resolver.dns.DnsNameResolverBuilder eventLoop(io.netty.channel.EventLoop r1) {
            r0 = this;
            r0.eventLoop = r1
            return r0
    }

    public io.netty.resolver.dns.DnsNameResolverBuilder hostsFileEntriesResolver(io.netty.resolver.HostsFileEntriesResolver r1) {
            r0 = this;
            r0.hostsFileEntriesResolver = r1
            return r0
    }

    public io.netty.resolver.dns.DnsNameResolverBuilder maxPayloadSize(int r1) {
            r0 = this;
            r0.maxPayloadSize = r1
            return r0
    }

    public io.netty.resolver.dns.DnsNameResolverBuilder maxQueriesPerResolve(int r1) {
            r0 = this;
            r0.maxQueriesPerResolve = r1
            return r0
    }

    public io.netty.resolver.dns.DnsNameResolverBuilder nameServerProvider(io.netty.resolver.dns.DnsServerAddressStreamProvider r2) {
            r1 = this;
            java.lang.String r0 = "dnsServerAddressStreamProvider"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.resolver.dns.DnsServerAddressStreamProvider r2 = (io.netty.resolver.dns.DnsServerAddressStreamProvider) r2
            r1.dnsServerAddressStreamProvider = r2
            return r1
    }

    protected io.netty.resolver.dns.DnsServerAddressStreamProvider nameServerProvider() {
            r1 = this;
            io.netty.resolver.dns.DnsServerAddressStreamProvider r0 = r1.dnsServerAddressStreamProvider
            return r0
    }

    public io.netty.resolver.dns.DnsNameResolverBuilder ndots(int r1) {
            r0 = this;
            r0.ndots = r1
            return r0
    }

    public io.netty.resolver.dns.DnsNameResolverBuilder negativeTtl(int r1) {
            r0 = this;
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.negativeTtl = r1
            return r0
    }

    public io.netty.resolver.dns.DnsNameResolverBuilder optResourceEnabled(boolean r1) {
            r0 = this;
            r0.optResourceEnabled = r1
            return r0
    }

    public io.netty.resolver.dns.DnsNameResolverBuilder queryTimeoutMillis(long r1) {
            r0 = this;
            r0.queryTimeoutMillis = r1
            return r0
    }

    public io.netty.resolver.dns.DnsNameResolverBuilder recursionDesired(boolean r1) {
            r0 = this;
            r0.recursionDesired = r1
            return r0
    }

    public io.netty.resolver.dns.DnsNameResolverBuilder resolveCache(io.netty.resolver.dns.DnsCache r1) {
            r0 = this;
            r0.resolveCache = r1
            return r0
    }

    public io.netty.resolver.dns.DnsNameResolverBuilder resolvedAddressTypes(io.netty.resolver.ResolvedAddressTypes r1) {
            r0 = this;
            r0.resolvedAddressTypes = r1
            return r0
    }

    public io.netty.resolver.dns.DnsNameResolverBuilder searchDomains(java.lang.Iterable<java.lang.String> r4) {
            r3 = this;
            java.lang.String r0 = "searchDomains"
            io.netty.util.internal.ObjectUtil.checkNotNull(r4, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 4
            r0.<init>(r1)
            java.util.Iterator r4 = r4.iterator()
        Lf:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L1e
            goto L29
        L1e:
            boolean r2 = r0.contains(r1)
            if (r2 == 0) goto L25
            goto Lf
        L25:
            r0.add(r1)
            goto Lf
        L29:
            r4 = 0
            java.lang.String[] r4 = new java.lang.String[r4]
            java.lang.Object[] r4 = r0.toArray(r4)
            java.lang.String[] r4 = (java.lang.String[]) r4
            r3.searchDomains = r4
            return r3
    }

    public io.netty.resolver.dns.DnsNameResolverBuilder socketChannelFactory(io.netty.channel.ChannelFactory<? extends io.netty.channel.socket.SocketChannel> r1) {
            r0 = this;
            r0.socketChannelFactory = r1
            return r0
    }

    public io.netty.resolver.dns.DnsNameResolverBuilder socketChannelType(java.lang.Class<? extends io.netty.channel.socket.SocketChannel> r2) {
            r1 = this;
            if (r2 != 0) goto L8
            r2 = 0
            io.netty.resolver.dns.DnsNameResolverBuilder r2 = r1.socketChannelFactory(r2)
            return r2
        L8:
            io.netty.channel.ReflectiveChannelFactory r0 = new io.netty.channel.ReflectiveChannelFactory
            r0.<init>(r2)
            io.netty.resolver.dns.DnsNameResolverBuilder r2 = r1.socketChannelFactory(r0)
            return r2
    }

    public io.netty.resolver.dns.DnsNameResolverBuilder traceEnabled(boolean r1) {
            r0 = this;
            r0.traceEnabled = r1
            return r0
    }

    public io.netty.resolver.dns.DnsNameResolverBuilder ttl(int r1, int r2) {
            r0 = this;
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.maxTtl = r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.minTtl = r1
            return r0
    }
}
