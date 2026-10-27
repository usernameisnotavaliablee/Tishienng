package io.netty.resolver.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class DnsNameResolver extends io.netty.resolver.InetNameResolver {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final io.netty.handler.codec.dns.DatagramDnsResponseDecoder DATAGRAM_DECODER = null;
    private static final io.netty.handler.codec.dns.DatagramDnsQueryEncoder DATAGRAM_ENCODER = null;
    private static final int DEFAULT_NDOTS = 0;
    static final io.netty.resolver.ResolvedAddressTypes DEFAULT_RESOLVE_ADDRESS_TYPES = null;
    static final java.lang.String[] DEFAULT_SEARCH_DOMAINS = null;
    private static final io.netty.handler.codec.dns.DnsRecord[] EMPTY_ADDITIONALS = null;
    private static final io.netty.channel.socket.InternetProtocolFamily[] IPV4_ONLY_RESOLVED_PROTOCOL_FAMILIES = null;
    private static final io.netty.handler.codec.dns.DnsRecordType[] IPV4_ONLY_RESOLVED_RECORD_TYPES = null;
    private static final io.netty.channel.socket.InternetProtocolFamily[] IPV4_PREFERRED_RESOLVED_PROTOCOL_FAMILIES = null;
    private static final io.netty.handler.codec.dns.DnsRecordType[] IPV4_PREFERRED_RESOLVED_RECORD_TYPES = null;
    private static final io.netty.channel.socket.InternetProtocolFamily[] IPV6_ONLY_RESOLVED_PROTOCOL_FAMILIES = null;
    private static final io.netty.handler.codec.dns.DnsRecordType[] IPV6_ONLY_RESOLVED_RECORD_TYPES = null;
    private static final io.netty.channel.socket.InternetProtocolFamily[] IPV6_PREFERRED_RESOLVED_PROTOCOL_FAMILIES = null;
    private static final io.netty.handler.codec.dns.DnsRecordType[] IPV6_PREFERRED_RESOLVED_RECORD_TYPES = null;
    private static final java.lang.String LOCALHOST = "localhost";
    private static final java.net.InetAddress LOCALHOST_ADDRESS = null;
    private static final io.netty.handler.codec.dns.TcpDnsQueryEncoder TCP_ENCODER = null;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private final io.netty.resolver.dns.AuthoritativeDnsServerCache authoritativeDnsServerCache;
    final io.netty.channel.Channel ch;
    final io.netty.util.concurrent.Future<io.netty.channel.Channel> channelFuture;
    private final io.netty.resolver.dns.DnsCnameCache cnameCache;
    private final boolean completeOncePreferredResolved;
    private final boolean decodeIdn;
    private final io.netty.resolver.dns.DnsQueryLifecycleObserverFactory dnsQueryLifecycleObserverFactory;
    private final io.netty.resolver.dns.DnsServerAddressStreamProvider dnsServerAddressStreamProvider;
    private final io.netty.resolver.HostsFileEntriesResolver hostsFileEntriesResolver;
    private final int maxPayloadSize;
    private final int maxQueriesPerResolve;
    private final io.netty.util.concurrent.FastThreadLocal<io.netty.resolver.dns.DnsServerAddressStream> nameServerAddrStream;
    private final java.util.Comparator<java.net.InetSocketAddress> nameServerComparator;
    private final int ndots;
    private final boolean optResourceEnabled;
    private final io.netty.channel.socket.InternetProtocolFamily preferredAddressType;
    final io.netty.resolver.dns.DnsQueryContextManager queryContextManager;
    private final long queryTimeoutMillis;
    private final boolean recursionDesired;
    private final io.netty.resolver.dns.DnsCache resolveCache;
    private final io.netty.handler.codec.dns.DnsRecordType[] resolveRecordTypes;
    private final io.netty.resolver.ResolvedAddressTypes resolvedAddressTypes;
    private final io.netty.channel.socket.InternetProtocolFamily[] resolvedInternetProtocolFamilies;
    private final java.lang.String[] searchDomains;
    private final io.netty.channel.ChannelFactory<? extends io.netty.channel.socket.SocketChannel> socketChannelFactory;
    private final boolean supportsAAAARecords;
    private final boolean supportsARecords;






    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.resolver.dns.DnsNameResolver$6, reason: invalid class name */
    static /* synthetic */ class AnonymousClass6 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$resolver$ResolvedAddressTypes = null;

        static {
                io.netty.resolver.ResolvedAddressTypes[] r0 = io.netty.resolver.ResolvedAddressTypes.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.resolver.dns.DnsNameResolver.AnonymousClass6.$SwitchMap$io$netty$resolver$ResolvedAddressTypes = r0
                io.netty.resolver.ResolvedAddressTypes r1 = io.netty.resolver.ResolvedAddressTypes.IPV4_ONLY     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.resolver.dns.DnsNameResolver.AnonymousClass6.$SwitchMap$io$netty$resolver$ResolvedAddressTypes     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.resolver.ResolvedAddressTypes r1 = io.netty.resolver.ResolvedAddressTypes.IPV4_PREFERRED     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = io.netty.resolver.dns.DnsNameResolver.AnonymousClass6.$SwitchMap$io$netty$resolver$ResolvedAddressTypes     // Catch: java.lang.NoSuchFieldError -> L28
                io.netty.resolver.ResolvedAddressTypes r1 = io.netty.resolver.ResolvedAddressTypes.IPV6_ONLY     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = io.netty.resolver.dns.DnsNameResolver.AnonymousClass6.$SwitchMap$io$netty$resolver$ResolvedAddressTypes     // Catch: java.lang.NoSuchFieldError -> L33
                io.netty.resolver.ResolvedAddressTypes r1 = io.netty.resolver.ResolvedAddressTypes.IPV6_PREFERRED     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }

        public AnonymousClass6() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class AddressedEnvelopeAdapter implements io.netty.channel.AddressedEnvelope<io.netty.handler.codec.dns.DnsResponse, java.net.InetSocketAddress> {
        private final java.net.InetSocketAddress recipient;
        private final io.netty.handler.codec.dns.DnsResponse response;
        private final java.net.InetSocketAddress sender;
        final /* synthetic */ io.netty.resolver.dns.DnsNameResolver this$0;

        AddressedEnvelopeAdapter(io.netty.resolver.dns.DnsNameResolver r1, java.net.InetSocketAddress r2, java.net.InetSocketAddress r3, io.netty.handler.codec.dns.DnsResponse r4) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.sender = r2
                r0.recipient = r3
                r0.response = r4
                return
        }

        public io.netty.handler.codec.dns.DnsResponse content() {
                r1 = this;
                io.netty.handler.codec.dns.DnsResponse r0 = r1.response
                return r0
        }

        /* renamed from: content, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ java.lang.Object m1content() {
                r1 = this;
                io.netty.handler.codec.dns.DnsResponse r0 = r1.content()
                return r0
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                if (r4 != r5) goto L4
                r5 = 1
                return r5
            L4:
                boolean r0 = r5 instanceof io.netty.channel.AddressedEnvelope
                r1 = 0
                if (r0 != 0) goto La
                return r1
            La:
                r0 = r5
                io.netty.channel.AddressedEnvelope r0 = (io.netty.channel.AddressedEnvelope) r0
                java.net.InetSocketAddress r2 = r4.sender()
                if (r2 != 0) goto L1a
                java.net.SocketAddress r2 = r0.sender()
                if (r2 == 0) goto L29
                return r1
            L1a:
                java.net.InetSocketAddress r2 = r4.sender()
                java.net.SocketAddress r3 = r0.sender()
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L29
                return r1
            L29:
                java.net.InetSocketAddress r2 = r4.recipient()
                if (r2 != 0) goto L36
                java.net.SocketAddress r0 = r0.recipient()
                if (r0 == 0) goto L45
                return r1
            L36:
                java.net.InetSocketAddress r2 = r4.recipient()
                java.net.SocketAddress r0 = r0.recipient()
                boolean r0 = r2.equals(r0)
                if (r0 != 0) goto L45
                return r1
            L45:
                io.netty.handler.codec.dns.DnsResponse r0 = r4.response
                boolean r5 = r0.equals(r5)
                return r5
        }

        public int hashCode() {
                r2 = this;
                io.netty.handler.codec.dns.DnsResponse r0 = r2.response
                int r0 = r0.hashCode()
                java.net.InetSocketAddress r1 = r2.sender()
                if (r1 == 0) goto L17
                int r0 = r0 * 31
                java.net.InetSocketAddress r1 = r2.sender()
                int r1 = r1.hashCode()
                int r0 = r0 + r1
            L17:
                java.net.InetSocketAddress r1 = r2.recipient()
                if (r1 == 0) goto L28
                int r0 = r0 * 31
                java.net.InetSocketAddress r1 = r2.recipient()
                int r1 = r1.hashCode()
                int r0 = r0 + r1
            L28:
                return r0
        }

        public java.net.InetSocketAddress recipient() {
                r1 = this;
                java.net.InetSocketAddress r0 = r1.recipient
                return r0
        }

        /* renamed from: recipient, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ java.net.SocketAddress m2recipient() {
                r1 = this;
                java.net.InetSocketAddress r0 = r1.recipient()
                return r0
        }

        public int refCnt() {
                r1 = this;
                io.netty.handler.codec.dns.DnsResponse r0 = r1.response
                int r0 = r0.refCnt()
                return r0
        }

        public boolean release() {
                r1 = this;
                io.netty.handler.codec.dns.DnsResponse r0 = r1.response
                boolean r0 = r0.release()
                return r0
        }

        public boolean release(int r2) {
                r1 = this;
                io.netty.handler.codec.dns.DnsResponse r0 = r1.response
                boolean r2 = r0.release(r2)
                return r2
        }

        public io.netty.channel.AddressedEnvelope<io.netty.handler.codec.dns.DnsResponse, java.net.InetSocketAddress> retain() {
                r1 = this;
                io.netty.handler.codec.dns.DnsResponse r0 = r1.response
                r0.retain()
                return r1
        }

        public io.netty.channel.AddressedEnvelope<io.netty.handler.codec.dns.DnsResponse, java.net.InetSocketAddress> retain(int r2) {
                r1 = this;
                io.netty.handler.codec.dns.DnsResponse r0 = r1.response
                r0.retain(r2)
                return r1
        }

        /* renamed from: retain, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted m3retain() {
                r1 = this;
                io.netty.channel.AddressedEnvelope r0 = r1.retain()
                return r0
        }

        /* renamed from: retain, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted m4retain(int r1) {
                r0 = this;
                io.netty.channel.AddressedEnvelope r1 = r0.retain(r1)
                return r1
        }

        public java.net.InetSocketAddress sender() {
                r1 = this;
                java.net.InetSocketAddress r0 = r1.sender
                return r0
        }

        /* renamed from: sender, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ java.net.SocketAddress m5sender() {
                r1 = this;
                java.net.InetSocketAddress r0 = r1.sender()
                return r0
        }

        public io.netty.channel.AddressedEnvelope<io.netty.handler.codec.dns.DnsResponse, java.net.InetSocketAddress> touch() {
                r1 = this;
                io.netty.handler.codec.dns.DnsResponse r0 = r1.response
                r0.touch()
                return r1
        }

        public io.netty.channel.AddressedEnvelope<io.netty.handler.codec.dns.DnsResponse, java.net.InetSocketAddress> touch(java.lang.Object r2) {
                r1 = this;
                io.netty.handler.codec.dns.DnsResponse r0 = r1.response
                r0.touch(r2)
                return r1
        }

        /* renamed from: touch, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted m6touch() {
                r1 = this;
                io.netty.channel.AddressedEnvelope r0 = r1.touch()
                return r0
        }

        /* renamed from: touch, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted m7touch(java.lang.Object r1) {
                r0 = this;
                io.netty.channel.AddressedEnvelope r1 = r0.touch(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class DnsResponseHandler extends io.netty.channel.ChannelInboundHandlerAdapter {
        private final io.netty.util.concurrent.Promise<io.netty.channel.Channel> channelActivePromise;
        final /* synthetic */ io.netty.resolver.dns.DnsNameResolver this$0;



        DnsResponseHandler(io.netty.resolver.dns.DnsNameResolver r1, io.netty.util.concurrent.Promise<io.netty.channel.Channel> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.channelActivePromise = r2
                return
        }

        static /* synthetic */ io.netty.util.concurrent.Promise access$300(io.netty.resolver.dns.DnsNameResolver.DnsResponseHandler r0) {
                io.netty.util.concurrent.Promise<io.netty.channel.Channel> r0 = r0.channelActivePromise
                return r0
        }

        public void channelActive(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
                r1 = this;
                super.channelActive(r2)
                io.netty.util.concurrent.Promise<io.netty.channel.Channel> r0 = r1.channelActivePromise
                io.netty.channel.Channel r2 = r2.channel()
                r0.setSuccess(r2)
                return
        }

        public void channelRead(io.netty.channel.ChannelHandlerContext r9, java.lang.Object r10) {
                r8 = this;
                r9 = r10
                io.netty.handler.codec.dns.DatagramDnsResponse r9 = (io.netty.handler.codec.dns.DatagramDnsResponse) r9     // Catch: java.lang.Throwable -> L36
                int r0 = r9.id()     // Catch: java.lang.Throwable -> L36
                io.netty.util.internal.logging.InternalLogger r1 = io.netty.resolver.dns.DnsNameResolver.access$600()     // Catch: java.lang.Throwable -> L36
                boolean r1 = r1.isDebugEnabled()     // Catch: java.lang.Throwable -> L36
                if (r1 == 0) goto L39
                io.netty.util.internal.logging.InternalLogger r1 = io.netty.resolver.dns.DnsNameResolver.access$600()     // Catch: java.lang.Throwable -> L36
                java.lang.String r2 = "{} RECEIVED: UDP [{}: {}], {}"
                io.netty.resolver.dns.DnsNameResolver r3 = r8.this$0     // Catch: java.lang.Throwable -> L36
                io.netty.channel.Channel r3 = r3.ch     // Catch: java.lang.Throwable -> L36
                java.lang.Integer r4 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L36
                java.net.InetSocketAddress r5 = r9.sender()     // Catch: java.lang.Throwable -> L36
                r6 = 4
                java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L36
                r7 = 0
                r6[r7] = r3     // Catch: java.lang.Throwable -> L36
                r3 = 1
                r6[r3] = r4     // Catch: java.lang.Throwable -> L36
                r3 = 2
                r6[r3] = r5     // Catch: java.lang.Throwable -> L36
                r3 = 3
                r6[r3] = r9     // Catch: java.lang.Throwable -> L36
                r1.debug(r2, r6)     // Catch: java.lang.Throwable -> L36
                goto L39
            L36:
                r9 = move-exception
                goto Lb4
            L39:
                io.netty.resolver.dns.DnsNameResolver r1 = r8.this$0     // Catch: java.lang.Throwable -> L36
                io.netty.resolver.dns.DnsQueryContextManager r1 = r1.queryContextManager     // Catch: java.lang.Throwable -> L36
                java.net.InetSocketAddress r2 = r9.sender()     // Catch: java.lang.Throwable -> L36
                io.netty.resolver.dns.DnsQueryContext r1 = r1.get(r2, r0)     // Catch: java.lang.Throwable -> L36
                if (r1 != 0) goto L5c
                io.netty.util.internal.logging.InternalLogger r9 = io.netty.resolver.dns.DnsNameResolver.access$600()     // Catch: java.lang.Throwable -> L36
                java.lang.String r1 = "{} Received a DNS response with an unknown ID: {}"
                io.netty.resolver.dns.DnsNameResolver r2 = r8.this$0     // Catch: java.lang.Throwable -> L36
                io.netty.channel.Channel r2 = r2.ch     // Catch: java.lang.Throwable -> L36
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L36
                r9.warn(r1, r2, r0)     // Catch: java.lang.Throwable -> L36
                io.netty.util.ReferenceCountUtil.safeRelease(r10)
                return
            L5c:
                boolean r2 = r9.isTruncated()     // Catch: java.lang.Throwable -> L36
                if (r2 == 0) goto Lad
                io.netty.resolver.dns.DnsNameResolver r2 = r8.this$0     // Catch: java.lang.Throwable -> L36
                io.netty.channel.ChannelFactory r2 = io.netty.resolver.dns.DnsNameResolver.access$700(r2)     // Catch: java.lang.Throwable -> L36
                if (r2 == 0) goto Lad
                r9.retain()     // Catch: java.lang.Throwable -> L36
                io.netty.bootstrap.Bootstrap r2 = new io.netty.bootstrap.Bootstrap     // Catch: java.lang.Throwable -> L36
                r2.<init>()     // Catch: java.lang.Throwable -> L36
                io.netty.channel.ChannelOption r3 = io.netty.channel.ChannelOption.SO_REUSEADDR     // Catch: java.lang.Throwable -> L36
                java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L36
                io.netty.bootstrap.AbstractBootstrap r3 = r2.option(r3, r4)     // Catch: java.lang.Throwable -> L36
                io.netty.bootstrap.Bootstrap r3 = (io.netty.bootstrap.Bootstrap) r3     // Catch: java.lang.Throwable -> L36
                io.netty.resolver.dns.DnsNameResolver r4 = r8.this$0     // Catch: java.lang.Throwable -> L36
                io.netty.channel.EventLoop r4 = r4.executor()     // Catch: java.lang.Throwable -> L36
                io.netty.bootstrap.AbstractBootstrap r3 = r3.group(r4)     // Catch: java.lang.Throwable -> L36
                io.netty.bootstrap.Bootstrap r3 = (io.netty.bootstrap.Bootstrap) r3     // Catch: java.lang.Throwable -> L36
                io.netty.resolver.dns.DnsNameResolver r4 = r8.this$0     // Catch: java.lang.Throwable -> L36
                io.netty.channel.ChannelFactory r4 = io.netty.resolver.dns.DnsNameResolver.access$700(r4)     // Catch: java.lang.Throwable -> L36
                io.netty.bootstrap.AbstractBootstrap r3 = r3.channelFactory(r4)     // Catch: java.lang.Throwable -> L36
                io.netty.bootstrap.Bootstrap r3 = (io.netty.bootstrap.Bootstrap) r3     // Catch: java.lang.Throwable -> L36
                io.netty.resolver.dns.DnsNameResolver$DnsResponseHandler$1 r4 = new io.netty.resolver.dns.DnsNameResolver$DnsResponseHandler$1     // Catch: java.lang.Throwable -> L36
                r4.<init>(r8, r9, r1, r0)     // Catch: java.lang.Throwable -> L36
                r3.handler(r4)     // Catch: java.lang.Throwable -> L36
                java.net.InetSocketAddress r3 = r9.sender()     // Catch: java.lang.Throwable -> L36
                io.netty.channel.ChannelFuture r2 = r2.connect(r3)     // Catch: java.lang.Throwable -> L36
                io.netty.resolver.dns.DnsNameResolver$DnsResponseHandler$2 r3 = new io.netty.resolver.dns.DnsNameResolver$DnsResponseHandler$2     // Catch: java.lang.Throwable -> L36
                r3.<init>(r8, r1, r9, r0)     // Catch: java.lang.Throwable -> L36
                r2.addListener(r3)     // Catch: java.lang.Throwable -> L36
                goto Lb0
            Lad:
                r1.finish(r9)     // Catch: java.lang.Throwable -> L36
            Lb0:
                io.netty.util.ReferenceCountUtil.safeRelease(r10)
                return
            Lb4:
                io.netty.util.ReferenceCountUtil.safeRelease(r10)
                throw r9
        }

        public void exceptionCaught(io.netty.channel.ChannelHandlerContext r3, java.lang.Throwable r4) {
                r2 = this;
                io.netty.util.internal.logging.InternalLogger r0 = io.netty.resolver.dns.DnsNameResolver.access$600()
                java.lang.String r1 = "{} Unexpected exception: "
                io.netty.channel.Channel r3 = r3.channel()
                r0.warn(r1, r3, r4)
                return
        }
    }

    static {
            java.lang.Class<io.netty.resolver.dns.DnsNameResolver> r0 = io.netty.resolver.dns.DnsNameResolver.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.resolver.dns.DnsNameResolver.logger = r0
            r0 = 0
            io.netty.handler.codec.dns.DnsRecord[] r1 = new io.netty.handler.codec.dns.DnsRecord[r0]
            io.netty.resolver.dns.DnsNameResolver.EMPTY_ADDITIONALS = r1
            io.netty.handler.codec.dns.DnsRecordType r1 = io.netty.handler.codec.dns.DnsRecordType.A
            r2 = 1
            io.netty.handler.codec.dns.DnsRecordType[] r3 = new io.netty.handler.codec.dns.DnsRecordType[r2]
            r3[r0] = r1
            io.netty.resolver.dns.DnsNameResolver.IPV4_ONLY_RESOLVED_RECORD_TYPES = r3
            io.netty.channel.socket.InternetProtocolFamily r3 = io.netty.channel.socket.InternetProtocolFamily.IPv4
            io.netty.channel.socket.InternetProtocolFamily[] r4 = new io.netty.channel.socket.InternetProtocolFamily[r2]
            r4[r0] = r3
            io.netty.resolver.dns.DnsNameResolver.IPV4_ONLY_RESOLVED_PROTOCOL_FAMILIES = r4
            io.netty.handler.codec.dns.DnsRecordType r4 = io.netty.handler.codec.dns.DnsRecordType.AAAA
            r5 = 2
            io.netty.handler.codec.dns.DnsRecordType[] r6 = new io.netty.handler.codec.dns.DnsRecordType[r5]
            r6[r0] = r1
            r6[r2] = r4
            io.netty.resolver.dns.DnsNameResolver.IPV4_PREFERRED_RESOLVED_RECORD_TYPES = r6
            io.netty.channel.socket.InternetProtocolFamily r6 = io.netty.channel.socket.InternetProtocolFamily.IPv6
            io.netty.channel.socket.InternetProtocolFamily[] r7 = new io.netty.channel.socket.InternetProtocolFamily[r5]
            r7[r0] = r3
            r7[r2] = r6
            io.netty.resolver.dns.DnsNameResolver.IPV4_PREFERRED_RESOLVED_PROTOCOL_FAMILIES = r7
            io.netty.handler.codec.dns.DnsRecordType[] r7 = new io.netty.handler.codec.dns.DnsRecordType[r2]
            r7[r0] = r4
            io.netty.resolver.dns.DnsNameResolver.IPV6_ONLY_RESOLVED_RECORD_TYPES = r7
            io.netty.channel.socket.InternetProtocolFamily[] r7 = new io.netty.channel.socket.InternetProtocolFamily[r2]
            r7[r0] = r6
            io.netty.resolver.dns.DnsNameResolver.IPV6_ONLY_RESOLVED_PROTOCOL_FAMILIES = r7
            io.netty.handler.codec.dns.DnsRecordType[] r7 = new io.netty.handler.codec.dns.DnsRecordType[r5]
            r7[r0] = r4
            r7[r2] = r1
            io.netty.resolver.dns.DnsNameResolver.IPV6_PREFERRED_RESOLVED_RECORD_TYPES = r7
            io.netty.channel.socket.InternetProtocolFamily[] r1 = new io.netty.channel.socket.InternetProtocolFamily[r5]
            r1[r0] = r6
            r1[r2] = r3
            io.netty.resolver.dns.DnsNameResolver.IPV6_PREFERRED_RESOLVED_PROTOCOL_FAMILIES = r1
            boolean r1 = io.netty.util.NetUtil.isIpV4StackPreferred()
            if (r1 != 0) goto L74
            boolean r1 = anyInterfaceSupportsIpV6()
            if (r1 != 0) goto L5c
            goto L74
        L5c:
            boolean r1 = io.netty.util.NetUtil.isIpV6AddressesPreferred()
            if (r1 == 0) goto L6b
            io.netty.resolver.ResolvedAddressTypes r1 = io.netty.resolver.ResolvedAddressTypes.IPV6_PREFERRED
            io.netty.resolver.dns.DnsNameResolver.DEFAULT_RESOLVE_ADDRESS_TYPES = r1
            java.net.Inet6Address r1 = io.netty.util.NetUtil.LOCALHOST6
            io.netty.resolver.dns.DnsNameResolver.LOCALHOST_ADDRESS = r1
            goto L7c
        L6b:
            io.netty.resolver.ResolvedAddressTypes r1 = io.netty.resolver.ResolvedAddressTypes.IPV4_PREFERRED
            io.netty.resolver.dns.DnsNameResolver.DEFAULT_RESOLVE_ADDRESS_TYPES = r1
            java.net.Inet4Address r1 = io.netty.util.NetUtil.LOCALHOST4
            io.netty.resolver.dns.DnsNameResolver.LOCALHOST_ADDRESS = r1
            goto L7c
        L74:
            io.netty.resolver.ResolvedAddressTypes r1 = io.netty.resolver.ResolvedAddressTypes.IPV4_ONLY
            io.netty.resolver.dns.DnsNameResolver.DEFAULT_RESOLVE_ADDRESS_TYPES = r1
            java.net.Inet4Address r1 = io.netty.util.NetUtil.LOCALHOST4
            io.netty.resolver.dns.DnsNameResolver.LOCALHOST_ADDRESS = r1
        L7c:
            boolean r1 = io.netty.util.internal.PlatformDependent.isWindows()     // Catch: java.lang.Exception -> L94
            if (r1 == 0) goto L87
            java.util.List r1 = getSearchDomainsHack()     // Catch: java.lang.Exception -> L94
            goto L8b
        L87:
            java.util.List r1 = io.netty.resolver.dns.UnixResolverDnsServerAddressStreamProvider.parseEtcResolverSearchDomains()     // Catch: java.lang.Exception -> L94
        L8b:
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch: java.lang.Exception -> L94
            java.lang.Object[] r0 = r1.toArray(r0)     // Catch: java.lang.Exception -> L94
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch: java.lang.Exception -> L94
            goto L96
        L94:
            java.lang.String[] r0 = io.netty.util.internal.EmptyArrays.EMPTY_STRINGS
        L96:
            io.netty.resolver.dns.DnsNameResolver.DEFAULT_SEARCH_DOMAINS = r0
            int r2 = io.netty.resolver.dns.UnixResolverDnsServerAddressStreamProvider.parseEtcResolverFirstNdots()     // Catch: java.lang.Exception -> L9c
        L9c:
            io.netty.resolver.dns.DnsNameResolver.DEFAULT_NDOTS = r2
            io.netty.handler.codec.dns.DatagramDnsResponseDecoder r0 = new io.netty.handler.codec.dns.DatagramDnsResponseDecoder
            r0.<init>()
            io.netty.resolver.dns.DnsNameResolver.DATAGRAM_DECODER = r0
            io.netty.handler.codec.dns.DatagramDnsQueryEncoder r0 = new io.netty.handler.codec.dns.DatagramDnsQueryEncoder
            r0.<init>()
            io.netty.resolver.dns.DnsNameResolver.DATAGRAM_ENCODER = r0
            io.netty.handler.codec.dns.TcpDnsQueryEncoder r0 = new io.netty.handler.codec.dns.TcpDnsQueryEncoder
            r0.<init>()
            io.netty.resolver.dns.DnsNameResolver.TCP_ENCODER = r0
            return
    }

    DnsNameResolver(io.netty.channel.EventLoop r6, io.netty.channel.ChannelFactory<? extends io.netty.channel.socket.DatagramChannel> r7, io.netty.channel.ChannelFactory<? extends io.netty.channel.socket.SocketChannel> r8, io.netty.resolver.dns.DnsCache r9, io.netty.resolver.dns.DnsCnameCache r10, io.netty.resolver.dns.AuthoritativeDnsServerCache r11, io.netty.resolver.dns.DnsQueryLifecycleObserverFactory r12, long r13, io.netty.resolver.ResolvedAddressTypes r15, boolean r16, int r17, boolean r18, int r19, boolean r20, io.netty.resolver.HostsFileEntriesResolver r21, io.netty.resolver.dns.DnsServerAddressStreamProvider r22, java.lang.String[] r23, int r24, boolean r25, boolean r26) {
            r5 = this;
            r1 = r15
            r2 = r19
            r5.<init>(r6)
            io.netty.resolver.dns.DnsQueryContextManager r6 = new io.netty.resolver.dns.DnsQueryContextManager
            r6.<init>()
            r5.queryContextManager = r6
            io.netty.resolver.dns.DnsNameResolver$1 r6 = new io.netty.resolver.dns.DnsNameResolver$1
            r6.<init>(r5)
            r5.nameServerAddrStream = r6
            java.lang.String r6 = "queryTimeoutMillis"
            long r3 = io.netty.util.internal.ObjectUtil.checkPositive(r13, r6)
            r5.queryTimeoutMillis = r3
            if (r1 == 0) goto L20
            r6 = r1
            goto L22
        L20:
            io.netty.resolver.ResolvedAddressTypes r6 = io.netty.resolver.dns.DnsNameResolver.DEFAULT_RESOLVE_ADDRESS_TYPES
        L22:
            r5.resolvedAddressTypes = r6
            r3 = r16
            r5.recursionDesired = r3
            java.lang.String r3 = "maxQueriesPerResolve"
            r4 = r17
            int r3 = io.netty.util.internal.ObjectUtil.checkPositive(r4, r3)
            r5.maxQueriesPerResolve = r3
            java.lang.String r3 = "maxPayloadSize"
            int r3 = io.netty.util.internal.ObjectUtil.checkPositive(r2, r3)
            r5.maxPayloadSize = r3
            r3 = r20
            r5.optResourceEnabled = r3
            java.lang.String r3 = "hostsFileEntriesResolver"
            r4 = r21
            java.lang.Object r3 = io.netty.util.internal.ObjectUtil.checkNotNull(r4, r3)
            io.netty.resolver.HostsFileEntriesResolver r3 = (io.netty.resolver.HostsFileEntriesResolver) r3
            r5.hostsFileEntriesResolver = r3
            java.lang.String r3 = "dnsServerAddressStreamProvider"
            r4 = r22
            java.lang.Object r3 = io.netty.util.internal.ObjectUtil.checkNotNull(r4, r3)
            io.netty.resolver.dns.DnsServerAddressStreamProvider r3 = (io.netty.resolver.dns.DnsServerAddressStreamProvider) r3
            r5.dnsServerAddressStreamProvider = r3
            java.lang.String r3 = "resolveCache"
            java.lang.Object r3 = io.netty.util.internal.ObjectUtil.checkNotNull(r9, r3)
            io.netty.resolver.dns.DnsCache r3 = (io.netty.resolver.dns.DnsCache) r3
            r5.resolveCache = r3
            java.lang.String r3 = "cnameCache"
            java.lang.Object r3 = io.netty.util.internal.ObjectUtil.checkNotNull(r10, r3)
            io.netty.resolver.dns.DnsCnameCache r3 = (io.netty.resolver.dns.DnsCnameCache) r3
            r5.cnameCache = r3
            if (r18 == 0) goto L82
            boolean r3 = r12 instanceof io.netty.resolver.dns.NoopDnsQueryLifecycleObserverFactory
            if (r3 == 0) goto L76
            io.netty.resolver.dns.TraceDnsQueryLifeCycleObserverFactory r0 = new io.netty.resolver.dns.TraceDnsQueryLifeCycleObserverFactory
            r0.<init>()
            goto L8a
        L76:
            io.netty.resolver.dns.BiDnsQueryLifecycleObserverFactory r3 = new io.netty.resolver.dns.BiDnsQueryLifecycleObserverFactory
            io.netty.resolver.dns.TraceDnsQueryLifeCycleObserverFactory r4 = new io.netty.resolver.dns.TraceDnsQueryLifeCycleObserverFactory
            r4.<init>()
            r3.<init>(r4, r12)
            r0 = r3
            goto L8a
        L82:
            java.lang.String r3 = "dnsQueryLifecycleObserverFactory"
            java.lang.Object r0 = io.netty.util.internal.ObjectUtil.checkNotNull(r12, r3)
            io.netty.resolver.dns.DnsQueryLifecycleObserverFactory r0 = (io.netty.resolver.dns.DnsQueryLifecycleObserverFactory) r0
        L8a:
            r5.dnsQueryLifecycleObserverFactory = r0
            if (r23 == 0) goto L95
            java.lang.Object r0 = r23.clone()
            java.lang.String[] r0 = (java.lang.String[]) r0
            goto L97
        L95:
            java.lang.String[] r0 = io.netty.resolver.dns.DnsNameResolver.DEFAULT_SEARCH_DOMAINS
        L97:
            r5.searchDomains = r0
            if (r24 < 0) goto L9e
            r0 = r24
            goto La0
        L9e:
            int r0 = io.netty.resolver.dns.DnsNameResolver.DEFAULT_NDOTS
        La0:
            r5.ndots = r0
            r0 = r25
            r5.decodeIdn = r0
            r0 = r26
            r5.completeOncePreferredResolved = r0
            r5.socketChannelFactory = r8
            int[] r8 = io.netty.resolver.dns.DnsNameResolver.AnonymousClass6.$SwitchMap$io$netty$resolver$ResolvedAddressTypes
            int r0 = r6.ordinal()
            r8 = r8[r0]
            r0 = 0
            r3 = 1
            if (r8 == r3) goto Lff
            r4 = 2
            if (r8 == r4) goto Lf2
            r4 = 3
            if (r8 == r4) goto Le5
            r0 = 4
            if (r8 != r0) goto Lce
            r5.supportsAAAARecords = r3
            r5.supportsARecords = r3
            io.netty.handler.codec.dns.DnsRecordType[] r8 = io.netty.resolver.dns.DnsNameResolver.IPV6_PREFERRED_RESOLVED_RECORD_TYPES
            r5.resolveRecordTypes = r8
            io.netty.channel.socket.InternetProtocolFamily[] r8 = io.netty.resolver.dns.DnsNameResolver.IPV6_PREFERRED_RESOLVED_PROTOCOL_FAMILIES
            r5.resolvedInternetProtocolFamilies = r8
            goto L10b
        Lce:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Unknown ResolvedAddressTypes "
            r7.append(r8)
            r7.append(r15)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        Le5:
            r5.supportsAAAARecords = r3
            r5.supportsARecords = r0
            io.netty.handler.codec.dns.DnsRecordType[] r8 = io.netty.resolver.dns.DnsNameResolver.IPV6_ONLY_RESOLVED_RECORD_TYPES
            r5.resolveRecordTypes = r8
            io.netty.channel.socket.InternetProtocolFamily[] r8 = io.netty.resolver.dns.DnsNameResolver.IPV6_ONLY_RESOLVED_PROTOCOL_FAMILIES
            r5.resolvedInternetProtocolFamilies = r8
            goto L10b
        Lf2:
            r5.supportsAAAARecords = r3
            r5.supportsARecords = r3
            io.netty.handler.codec.dns.DnsRecordType[] r8 = io.netty.resolver.dns.DnsNameResolver.IPV4_PREFERRED_RESOLVED_RECORD_TYPES
            r5.resolveRecordTypes = r8
            io.netty.channel.socket.InternetProtocolFamily[] r8 = io.netty.resolver.dns.DnsNameResolver.IPV4_PREFERRED_RESOLVED_PROTOCOL_FAMILIES
            r5.resolvedInternetProtocolFamilies = r8
            goto L10b
        Lff:
            r5.supportsAAAARecords = r0
            r5.supportsARecords = r3
            io.netty.handler.codec.dns.DnsRecordType[] r8 = io.netty.resolver.dns.DnsNameResolver.IPV4_ONLY_RESOLVED_RECORD_TYPES
            r5.resolveRecordTypes = r8
            io.netty.channel.socket.InternetProtocolFamily[] r8 = io.netty.resolver.dns.DnsNameResolver.IPV4_ONLY_RESOLVED_PROTOCOL_FAMILIES
            r5.resolvedInternetProtocolFamilies = r8
        L10b:
            io.netty.channel.socket.InternetProtocolFamily r6 = preferredAddressType(r6)
            r5.preferredAddressType = r6
            java.lang.String r8 = "authoritativeDnsServerCache"
            java.lang.Object r8 = io.netty.util.internal.ObjectUtil.checkNotNull(r11, r8)
            io.netty.resolver.dns.AuthoritativeDnsServerCache r8 = (io.netty.resolver.dns.AuthoritativeDnsServerCache) r8
            r5.authoritativeDnsServerCache = r8
            io.netty.resolver.dns.NameServerComparator r8 = new io.netty.resolver.dns.NameServerComparator
            java.lang.Class r6 = r6.addressType()
            r8.<init>(r6)
            r5.nameServerComparator = r8
            io.netty.bootstrap.Bootstrap r6 = new io.netty.bootstrap.Bootstrap
            r6.<init>()
            io.netty.channel.EventLoop r8 = r5.executor()
            r6.group(r8)
            r6.channelFactory(r7)
            io.netty.channel.ChannelOption r7 = io.netty.channel.ChannelOption.DATAGRAM_CHANNEL_ACTIVE_ON_REGISTRATION
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            r6.option(r7, r8)
            io.netty.resolver.dns.DnsNameResolver$DnsResponseHandler r7 = new io.netty.resolver.dns.DnsNameResolver$DnsResponseHandler
            io.netty.channel.EventLoop r8 = r5.executor()
            io.netty.util.concurrent.Promise r8 = r8.newPromise()
            r7.<init>(r5, r8)
            io.netty.resolver.dns.DnsNameResolver$2 r8 = new io.netty.resolver.dns.DnsNameResolver$2
            r8.<init>(r5, r7)
            r6.handler(r8)
            io.netty.util.concurrent.Promise r7 = io.netty.resolver.dns.DnsNameResolver.DnsResponseHandler.access$300(r7)
            r5.channelFuture = r7
            io.netty.channel.ChannelFuture r6 = r6.register()
            java.lang.Throwable r7 = r6.cause()
            if (r7 == 0) goto L177
            boolean r6 = r7 instanceof java.lang.RuntimeException
            if (r6 != 0) goto L174
            boolean r6 = r7 instanceof java.lang.Error
            if (r6 == 0) goto L16c
            java.lang.Error r7 = (java.lang.Error) r7
            throw r7
        L16c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r8 = "Unable to create / register Channel"
            r6.<init>(r8, r7)
            throw r6
        L174:
            java.lang.RuntimeException r7 = (java.lang.RuntimeException) r7
            throw r7
        L177:
            io.netty.channel.Channel r6 = r6.channel()
            r5.ch = r6
            io.netty.channel.ChannelConfig r7 = r6.config()
            io.netty.channel.FixedRecvByteBufAllocator r8 = new io.netty.channel.FixedRecvByteBufAllocator
            r8.<init>(r2)
            r7.setRecvByteBufAllocator(r8)
            io.netty.channel.ChannelFuture r6 = r6.closeFuture()
            io.netty.resolver.dns.DnsNameResolver$3 r7 = new io.netty.resolver.dns.DnsNameResolver$3
            r7.<init>(r5, r9, r10, r11)
            r6.addListener(r7)
            return
    }

    @java.lang.Deprecated
    public DnsNameResolver(io.netty.channel.EventLoop r23, io.netty.channel.ChannelFactory<? extends io.netty.channel.socket.DatagramChannel> r24, io.netty.resolver.dns.DnsCache r25, io.netty.resolver.dns.AuthoritativeDnsServerCache r26, io.netty.resolver.dns.DnsQueryLifecycleObserverFactory r27, long r28, io.netty.resolver.ResolvedAddressTypes r30, boolean r31, int r32, boolean r33, int r34, boolean r35, io.netty.resolver.HostsFileEntriesResolver r36, io.netty.resolver.dns.DnsServerAddressStreamProvider r37, java.lang.String[] r38, int r39, boolean r40) {
            r22 = this;
            io.netty.resolver.dns.NoopDnsCnameCache r5 = io.netty.resolver.dns.NoopDnsCnameCache.INSTANCE
            r21 = 0
            r3 = 0
            r0 = r22
            r1 = r23
            r2 = r24
            r4 = r25
            r6 = r26
            r7 = r27
            r8 = r28
            r10 = r30
            r11 = r31
            r12 = r32
            r13 = r33
            r14 = r34
            r15 = r35
            r16 = r36
            r17 = r37
            r18 = r38
            r19 = r39
            r20 = r40
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
    }

    @java.lang.Deprecated
    public DnsNameResolver(io.netty.channel.EventLoop r20, io.netty.channel.ChannelFactory<? extends io.netty.channel.socket.DatagramChannel> r21, io.netty.resolver.dns.DnsCache r22, io.netty.resolver.dns.DnsCache r23, io.netty.resolver.dns.DnsQueryLifecycleObserverFactory r24, long r25, io.netty.resolver.ResolvedAddressTypes r27, boolean r28, int r29, boolean r30, int r31, boolean r32, io.netty.resolver.HostsFileEntriesResolver r33, io.netty.resolver.dns.DnsServerAddressStreamProvider r34, java.lang.String[] r35, int r36, boolean r37) {
            r19 = this;
            io.netty.resolver.dns.AuthoritativeDnsServerCacheAdapter r4 = new io.netty.resolver.dns.AuthoritativeDnsServerCacheAdapter
            r0 = r23
            r4.<init>(r0)
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            r5 = r24
            r6 = r25
            r8 = r27
            r9 = r28
            r10 = r29
            r11 = r30
            r12 = r31
            r13 = r32
            r14 = r33
            r15 = r34
            r16 = r35
            r17 = r36
            r18 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
    }

    static /* synthetic */ io.netty.resolver.dns.DnsServerAddressStreamProvider access$000(io.netty.resolver.dns.DnsNameResolver r0) {
            io.netty.resolver.dns.DnsServerAddressStreamProvider r0 = r0.dnsServerAddressStreamProvider
            return r0
    }

    static /* synthetic */ io.netty.handler.codec.dns.DatagramDnsQueryEncoder access$100() {
            io.netty.handler.codec.dns.DatagramDnsQueryEncoder r0 = io.netty.resolver.dns.DnsNameResolver.DATAGRAM_ENCODER
            return r0
    }

    static /* synthetic */ io.netty.handler.codec.dns.DatagramDnsResponseDecoder access$200() {
            io.netty.handler.codec.dns.DatagramDnsResponseDecoder r0 = io.netty.resolver.dns.DnsNameResolver.DATAGRAM_DECODER
            return r0
    }

    static /* synthetic */ void access$400(io.netty.util.concurrent.Promise r0, java.lang.Throwable r1) {
            tryFailure(r0, r1)
            return
    }

    static /* synthetic */ void access$500(io.netty.resolver.dns.DnsNameResolver r0, java.lang.String r1, io.netty.handler.codec.dns.DnsRecord[] r2, io.netty.util.concurrent.Promise r3, io.netty.resolver.dns.DnsCache r4, boolean r5) {
            r0.doResolveAllUncached0(r1, r2, r3, r4, r5)
            return
    }

    static /* synthetic */ io.netty.util.internal.logging.InternalLogger access$600() {
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.resolver.dns.DnsNameResolver.logger
            return r0
    }

    static /* synthetic */ io.netty.channel.ChannelFactory access$700(io.netty.resolver.dns.DnsNameResolver r0) {
            io.netty.channel.ChannelFactory<? extends io.netty.channel.socket.SocketChannel> r0 = r0.socketChannelFactory
            return r0
    }

    static /* synthetic */ io.netty.handler.codec.dns.TcpDnsQueryEncoder access$800() {
            io.netty.handler.codec.dns.TcpDnsQueryEncoder r0 = io.netty.resolver.dns.DnsNameResolver.TCP_ENCODER
            return r0
    }

    static /* synthetic */ io.netty.handler.codec.dns.DnsRecord[] access$900() {
            io.netty.handler.codec.dns.DnsRecord[] r0 = io.netty.resolver.dns.DnsNameResolver.EMPTY_ADDITIONALS
            return r0
    }

    private static boolean anyInterfaceSupportsIpV6() {
            java.util.Enumeration r0 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch: java.net.SocketException -> L24
        L4:
            boolean r1 = r0.hasMoreElements()     // Catch: java.net.SocketException -> L24
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r0.nextElement()     // Catch: java.net.SocketException -> L24
            java.net.NetworkInterface r1 = (java.net.NetworkInterface) r1     // Catch: java.net.SocketException -> L24
            java.util.Enumeration r1 = r1.getInetAddresses()     // Catch: java.net.SocketException -> L24
        L14:
            boolean r2 = r1.hasMoreElements()     // Catch: java.net.SocketException -> L24
            if (r2 == 0) goto L4
            java.lang.Object r2 = r1.nextElement()     // Catch: java.net.SocketException -> L24
            boolean r2 = r2 instanceof java.net.Inet6Address     // Catch: java.net.SocketException -> L24
            if (r2 == 0) goto L14
            r0 = 1
            return r0
        L24:
            r0 = move-exception
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.resolver.dns.DnsNameResolver.logger
            java.lang.String r2 = "Unable to detect if any interface supports IPv6, assuming IPv4-only"
            r1.debug(r2, r0)
        L2c:
            r0 = 0
            return r0
    }

    private static io.netty.util.concurrent.Promise<io.netty.channel.AddressedEnvelope<io.netty.handler.codec.dns.DnsResponse, java.net.InetSocketAddress>> cast(io.netty.util.concurrent.Promise<?> r0) {
            return r0
    }

    static boolean doResolveAllCached(java.lang.String r9, io.netty.handler.codec.dns.DnsRecord[] r10, io.netty.util.concurrent.Promise<java.util.List<java.net.InetAddress>> r11, io.netty.resolver.dns.DnsCache r12, io.netty.channel.socket.InternetProtocolFamily[] r13) {
            java.util.List r9 = r12.get(r9, r10)
            r10 = 0
            if (r9 == 0) goto L5c
            boolean r12 = r9.isEmpty()
            if (r12 == 0) goto Le
            goto L5c
        Le:
            java.lang.Object r12 = r9.get(r10)
            io.netty.resolver.dns.DnsCacheEntry r12 = (io.netty.resolver.dns.DnsCacheEntry) r12
            java.lang.Throwable r12 = r12.cause()
            r0 = 1
            if (r12 != 0) goto L58
            int r12 = r9.size()
            int r1 = r13.length
            r2 = 0
            r3 = 0
        L22:
            if (r3 >= r1) goto L51
            r4 = r13[r3]
            r5 = 0
        L27:
            if (r5 >= r12) goto L4e
            java.lang.Object r6 = r9.get(r5)
            io.netty.resolver.dns.DnsCacheEntry r6 = (io.netty.resolver.dns.DnsCacheEntry) r6
            java.lang.Class r7 = r4.addressType()
            java.net.InetAddress r8 = r6.address()
            boolean r7 = r7.isInstance(r8)
            if (r7 == 0) goto L4b
            if (r2 != 0) goto L44
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r12)
        L44:
            java.net.InetAddress r6 = r6.address()
            r2.add(r6)
        L4b:
            int r5 = r5 + 1
            goto L27
        L4e:
            int r3 = r3 + 1
            goto L22
        L51:
            if (r2 == 0) goto L57
            trySuccess(r11, r2)
            return r0
        L57:
            return r10
        L58:
            tryFailure(r11, r12)
            return r0
        L5c:
            return r10
    }

    private void doResolveAllUncached(java.lang.String r10, io.netty.handler.codec.dns.DnsRecord[] r11, io.netty.util.concurrent.Promise<java.util.List<java.net.InetAddress>> r12, io.netty.resolver.dns.DnsCache r13, boolean r14) {
            r9 = this;
            io.netty.channel.EventLoop r0 = r9.executor()
            boolean r1 = r0.inEventLoop()
            if (r1 == 0) goto Le
            r9.doResolveAllUncached0(r10, r11, r12, r13, r14)
            return
        Le:
            io.netty.resolver.dns.DnsNameResolver$5 r2 = new io.netty.resolver.dns.DnsNameResolver$5
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r8 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r0.execute(r2)
            return
    }

    private void doResolveAllUncached0(java.lang.String r10, io.netty.handler.codec.dns.DnsRecord[] r11, io.netty.util.concurrent.Promise<java.util.List<java.net.InetAddress>> r12, io.netty.resolver.dns.DnsCache r13, boolean r14) {
            r9 = this;
            io.netty.resolver.dns.DnsServerAddressStreamProvider r0 = r9.dnsServerAddressStreamProvider
            io.netty.resolver.dns.DnsServerAddressStream r5 = r0.nameServerAddressStream(r10)
            io.netty.resolver.dns.DnsAddressResolveContext r1 = new io.netty.resolver.dns.DnsAddressResolveContext
            io.netty.resolver.dns.AuthoritativeDnsServerCache r7 = r9.authoritativeDnsServerCache
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r13
            r8 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r1.resolve(r12)
            return
    }

    private boolean doResolveCached(java.lang.String r10, io.netty.handler.codec.dns.DnsRecord[] r11, io.netty.util.concurrent.Promise<java.net.InetAddress> r12, io.netty.resolver.dns.DnsCache r13) {
            r9 = this;
            java.util.List r10 = r13.get(r10, r11)
            r11 = 0
            if (r10 == 0) goto L51
            boolean r13 = r10.isEmpty()
            if (r13 == 0) goto Le
            goto L51
        Le:
            java.lang.Object r13 = r10.get(r11)
            io.netty.resolver.dns.DnsCacheEntry r13 = (io.netty.resolver.dns.DnsCacheEntry) r13
            java.lang.Throwable r13 = r13.cause()
            r0 = 1
            if (r13 != 0) goto L4d
            int r13 = r10.size()
            io.netty.channel.socket.InternetProtocolFamily[] r1 = r9.resolvedInternetProtocolFamilies
            int r2 = r1.length
            r3 = 0
        L23:
            if (r3 >= r2) goto L4c
            r4 = r1[r3]
            r5 = 0
        L28:
            if (r5 >= r13) goto L49
            java.lang.Object r6 = r10.get(r5)
            io.netty.resolver.dns.DnsCacheEntry r6 = (io.netty.resolver.dns.DnsCacheEntry) r6
            java.lang.Class r7 = r4.addressType()
            java.net.InetAddress r8 = r6.address()
            boolean r7 = r7.isInstance(r8)
            if (r7 == 0) goto L46
            java.net.InetAddress r10 = r6.address()
            trySuccess(r12, r10)
            return r0
        L46:
            int r5 = r5 + 1
            goto L28
        L49:
            int r3 = r3 + 1
            goto L23
        L4c:
            return r11
        L4d:
            tryFailure(r12, r13)
            return r0
        L51:
            return r11
    }

    private void doResolveUncached(java.lang.String r7, io.netty.handler.codec.dns.DnsRecord[] r8, io.netty.util.concurrent.Promise<java.net.InetAddress> r9, io.netty.resolver.dns.DnsCache r10, boolean r11) {
            r6 = this;
            io.netty.channel.EventLoop r11 = r6.executor()
            io.netty.util.concurrent.Promise r3 = r11.newPromise()
            r5 = 1
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r10
            r0.doResolveAllUncached(r1, r2, r3, r4, r5)
            io.netty.resolver.dns.DnsNameResolver$4 r7 = new io.netty.resolver.dns.DnsNameResolver$4
            r7.<init>(r6, r9)
            r3.addListener(r7)
            return
    }

    private static java.util.List<java.lang.String> getSearchDomainsHack() throws java.lang.Exception {
            java.lang.String r0 = "sun.net.dns.ResolverConfiguration"
            java.lang.Class r0 = java.lang.Class.forName(r0)
            java.lang.String r1 = "open"
            r2 = 0
            java.lang.reflect.Method r1 = r0.getMethod(r1, r2)
            java.lang.String r3 = "searchlist"
            java.lang.reflect.Method r0 = r0.getMethod(r3, r2)
            java.lang.Object r1 = r1.invoke(r2, r2)
            java.lang.Object r0 = r0.invoke(r1, r2)
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    private static java.lang.String hostname(java.lang.String r2) {
            java.lang.String r0 = java.net.IDN.toASCII(r2)
            r1 = 46
            boolean r2 = io.netty.util.internal.StringUtil.endsWith(r2, r1)
            if (r2 == 0) goto L24
            boolean r2 = io.netty.util.internal.StringUtil.endsWith(r0, r1)
            if (r2 != 0) goto L24
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "."
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            return r2
        L24:
            return r0
    }

    public static boolean isTimeoutError(java.lang.Throwable r0) {
            if (r0 == 0) goto Lc
            java.lang.Throwable r0 = r0.getCause()
            boolean r0 = r0 instanceof io.netty.resolver.dns.DnsNameResolverTimeoutException
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public static boolean isTransportOrTimeoutError(java.lang.Throwable r0) {
            if (r0 == 0) goto Lc
            java.lang.Throwable r0 = r0.getCause()
            boolean r0 = r0 instanceof io.netty.resolver.dns.DnsNameResolverException
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    private java.net.InetAddress loopbackAddress() {
            r1 = this;
            io.netty.channel.socket.InternetProtocolFamily r0 = r1.preferredAddressType()
            java.net.InetAddress r0 = r0.localhost()
            return r0
    }

    private java.net.InetSocketAddress nextNameServerAddress() {
            r1 = this;
            io.netty.util.concurrent.FastThreadLocal<io.netty.resolver.dns.DnsServerAddressStream> r0 = r1.nameServerAddrStream
            java.lang.Object r0 = r0.get()
            io.netty.resolver.dns.DnsServerAddressStream r0 = (io.netty.resolver.dns.DnsServerAddressStream) r0
            java.net.InetSocketAddress r0 = r0.next()
            return r0
    }

    static io.netty.channel.socket.InternetProtocolFamily preferredAddressType(io.netty.resolver.ResolvedAddressTypes r3) {
            int[] r0 = io.netty.resolver.dns.DnsNameResolver.AnonymousClass6.$SwitchMap$io$netty$resolver$ResolvedAddressTypes
            int r1 = r3.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L2f
            r1 = 2
            if (r0 == r1) goto L2f
            r1 = 3
            if (r0 == r1) goto L2c
            r1 = 4
            if (r0 != r1) goto L15
            goto L2c
        L15:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown ResolvedAddressTypes "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L2c:
            io.netty.channel.socket.InternetProtocolFamily r3 = io.netty.channel.socket.InternetProtocolFamily.IPv6
            return r3
        L2f:
            io.netty.channel.socket.InternetProtocolFamily r3 = io.netty.channel.socket.InternetProtocolFamily.IPv4
            return r3
    }

    private io.netty.util.concurrent.Future<java.util.List<io.netty.handler.codec.dns.DnsRecord>> resolveAll(io.netty.handler.codec.dns.DnsQuestion r8, io.netty.handler.codec.dns.DnsRecord[] r9, io.netty.util.concurrent.Promise<java.util.List<io.netty.handler.codec.dns.DnsRecord>> r10) {
            r7 = this;
            java.lang.String r0 = "question"
            io.netty.util.internal.ObjectUtil.checkNotNull(r8, r0)
            java.lang.String r0 = "promise"
            io.netty.util.internal.ObjectUtil.checkNotNull(r10, r0)
            io.netty.handler.codec.dns.DnsRecordType r3 = r8.type()
            java.lang.String r2 = r8.name()
            io.netty.handler.codec.dns.DnsRecordType r0 = io.netty.handler.codec.dns.DnsRecordType.A
            if (r3 == r0) goto L1a
            io.netty.handler.codec.dns.DnsRecordType r1 = io.netty.handler.codec.dns.DnsRecordType.AAAA
            if (r3 != r1) goto L55
        L1a:
            java.net.InetAddress r1 = r7.resolveHostsFileEntry(r2)
            if (r1 == 0) goto L55
            boolean r4 = r1 instanceof java.net.Inet4Address
            if (r4 == 0) goto L30
            if (r3 != r0) goto L41
            byte[] r0 = r1.getAddress()
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.wrappedBuffer(r0)
        L2e:
            r6 = r0
            goto L43
        L30:
            boolean r0 = r1 instanceof java.net.Inet6Address
            if (r0 == 0) goto L41
            io.netty.handler.codec.dns.DnsRecordType r0 = io.netty.handler.codec.dns.DnsRecordType.AAAA
            if (r3 != r0) goto L41
            byte[] r0 = r1.getAddress()
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.wrappedBuffer(r0)
            goto L2e
        L41:
            r0 = 0
            goto L2e
        L43:
            if (r6 == 0) goto L55
            io.netty.handler.codec.dns.DefaultDnsRawRecord r1 = new io.netty.handler.codec.dns.DefaultDnsRawRecord
            r4 = 86400(0x15180, double:4.26873E-319)
            r1.<init>(r2, r3, r4, r6)
            java.util.List r8 = java.util.Collections.singletonList(r1)
            trySuccess(r10, r8)
            return r10
        L55:
            io.netty.resolver.dns.DnsServerAddressStreamProvider r0 = r7.dnsServerAddressStreamProvider
            io.netty.resolver.dns.DnsServerAddressStream r0 = r0.nameServerAddressStream(r2)
            io.netty.resolver.dns.DnsRecordResolveContext r1 = new io.netty.resolver.dns.DnsRecordResolveContext
            r1.<init>(r7, r8, r9, r0)
            r1.resolve(r10)
            return r10
    }

    private java.net.InetAddress resolveHostsFileEntry(java.lang.String r3) {
            r2 = this;
            io.netty.resolver.HostsFileEntriesResolver r0 = r2.hostsFileEntriesResolver
            if (r0 != 0) goto L6
            r3 = 0
            return r3
        L6:
            io.netty.resolver.ResolvedAddressTypes r1 = r2.resolvedAddressTypes
            java.net.InetAddress r0 = r0.address(r3, r1)
            if (r0 != 0) goto L1f
            boolean r1 = io.netty.util.internal.PlatformDependent.isWindows()
            if (r1 == 0) goto L1f
            java.lang.String r1 = "localhost"
            boolean r3 = r1.equalsIgnoreCase(r3)
            if (r3 == 0) goto L1f
            java.net.InetAddress r3 = io.netty.resolver.dns.DnsNameResolver.LOCALHOST_ADDRESS
            return r3
        L1f:
            return r0
    }

    private static io.netty.handler.codec.dns.DnsRecord[] toArray(java.lang.Iterable<io.netty.handler.codec.dns.DnsRecord> r2, boolean r3) {
            java.lang.String r0 = "additionals"
            io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto L2d
            r0 = r2
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.Iterator r2 = r2.iterator()
        L10:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r2.next()
            io.netty.handler.codec.dns.DnsRecord r1 = (io.netty.handler.codec.dns.DnsRecord) r1
            validateAdditional(r1, r3)
            goto L10
        L20:
            int r2 = r0.size()
            io.netty.handler.codec.dns.DnsRecord[] r2 = new io.netty.handler.codec.dns.DnsRecord[r2]
            java.lang.Object[] r2 = r0.toArray(r2)
            io.netty.handler.codec.dns.DnsRecord[] r2 = (io.netty.handler.codec.dns.DnsRecord[]) r2
            return r2
        L2d:
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 != 0) goto L3a
            io.netty.handler.codec.dns.DnsRecord[] r2 = io.netty.resolver.dns.DnsNameResolver.EMPTY_ADDITIONALS
            return r2
        L3a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L3f:
            java.lang.Object r1 = r2.next()
            io.netty.handler.codec.dns.DnsRecord r1 = (io.netty.handler.codec.dns.DnsRecord) r1
            validateAdditional(r1, r3)
            r0.add(r1)
            boolean r1 = r2.hasNext()
            if (r1 != 0) goto L3f
            int r2 = r0.size()
            io.netty.handler.codec.dns.DnsRecord[] r2 = new io.netty.handler.codec.dns.DnsRecord[r2]
            java.lang.Object[] r2 = r0.toArray(r2)
            io.netty.handler.codec.dns.DnsRecord[] r2 = (io.netty.handler.codec.dns.DnsRecord[]) r2
            return r2
    }

    private static void tryFailure(io.netty.util.concurrent.Promise<?> r2, java.lang.Throwable r3) {
            boolean r0 = r2.tryFailure(r3)
            if (r0 != 0) goto Ld
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.resolver.dns.DnsNameResolver.logger
            java.lang.String r1 = "Failed to notify failure to a promise: {}"
            r0.trace(r1, r2, r3)
        Ld:
            return
    }

    static <T> void trySuccess(io.netty.util.concurrent.Promise<T> r2, T r3) {
            boolean r0 = r2.trySuccess(r3)
            if (r0 != 0) goto Ld
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.resolver.dns.DnsNameResolver.logger
            java.lang.String r1 = "Failed to notify success ({}) to a promise: {}"
            r0.trace(r1, r3, r2)
        Ld:
            return
    }

    private static void validateAdditional(io.netty.handler.codec.dns.DnsRecord r2, boolean r3) {
            java.lang.String r0 = "record"
            io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            if (r3 == 0) goto L23
            boolean r3 = r2 instanceof io.netty.handler.codec.dns.DnsRawRecord
            if (r3 != 0) goto Lc
            goto L23
        Lc:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "DnsRawRecord implementations not allowed: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
        L23:
            return
    }

    public io.netty.resolver.dns.AuthoritativeDnsServerCache authoritativeDnsServerCache() {
            r1 = this;
            io.netty.resolver.dns.AuthoritativeDnsServerCache r0 = r1.authoritativeDnsServerCache
            return r0
    }

    public void close() {
            r1 = this;
            io.netty.channel.Channel r0 = r1.ch
            boolean r0 = r0.isOpen()
            if (r0 == 0) goto Ld
            io.netty.channel.Channel r0 = r1.ch
            r0.close()
        Ld:
            return
    }

    io.netty.resolver.dns.DnsCnameCache cnameCache() {
            r1 = this;
            io.netty.resolver.dns.DnsCnameCache r0 = r1.cnameCache
            return r0
    }

    final io.netty.resolver.dns.DnsQueryLifecycleObserverFactory dnsQueryLifecycleObserverFactory() {
            r1 = this;
            io.netty.resolver.dns.DnsQueryLifecycleObserverFactory r0 = r1.dnsQueryLifecycleObserverFactory
            return r0
    }

    protected void doResolve(java.lang.String r3, io.netty.util.concurrent.Promise<java.net.InetAddress> r4) throws java.lang.Exception {
            r2 = this;
            io.netty.handler.codec.dns.DnsRecord[] r0 = io.netty.resolver.dns.DnsNameResolver.EMPTY_ADDITIONALS
            io.netty.resolver.dns.DnsCache r1 = r2.resolveCache
            r2.doResolve(r3, r0, r4, r1)
            return
    }

    protected void doResolve(java.lang.String r7, io.netty.handler.codec.dns.DnsRecord[] r8, io.netty.util.concurrent.Promise<java.net.InetAddress> r9, io.netty.resolver.dns.DnsCache r10) throws java.lang.Exception {
            r6 = this;
            if (r7 == 0) goto L8
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto La
        L8:
            r3 = r9
            goto L35
        La:
            byte[] r0 = io.netty.util.NetUtil.createByteArrayFromIpAddressString(r7)
            if (r0 == 0) goto L18
            java.net.InetAddress r7 = java.net.InetAddress.getByAddress(r0)
            r9.setSuccess(r7)
            return
        L18:
            java.lang.String r1 = hostname(r7)
            java.net.InetAddress r7 = r6.resolveHostsFileEntry(r1)
            if (r7 == 0) goto L26
            r9.setSuccess(r7)
            return
        L26:
            boolean r7 = r6.doResolveCached(r1, r8, r9, r10)
            if (r7 != 0) goto L34
            r5 = 1
            r0 = r6
            r2 = r8
            r3 = r9
            r4 = r10
            r0.doResolveUncached(r1, r2, r3, r4, r5)
        L34:
            return
        L35:
            java.net.InetAddress r7 = r6.loopbackAddress()
            r3.setSuccess(r7)
            return
    }

    protected void doResolveAll(java.lang.String r3, io.netty.util.concurrent.Promise<java.util.List<java.net.InetAddress>> r4) throws java.lang.Exception {
            r2 = this;
            io.netty.handler.codec.dns.DnsRecord[] r0 = io.netty.resolver.dns.DnsNameResolver.EMPTY_ADDITIONALS
            io.netty.resolver.dns.DnsCache r1 = r2.resolveCache
            r2.doResolveAll(r3, r0, r4, r1)
            return
    }

    protected void doResolveAll(java.lang.String r7, io.netty.handler.codec.dns.DnsRecord[] r8, io.netty.util.concurrent.Promise<java.util.List<java.net.InetAddress>> r9, io.netty.resolver.dns.DnsCache r10) throws java.lang.Exception {
            r6 = this;
            if (r7 == 0) goto L8
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto La
        L8:
            r3 = r9
            goto L40
        La:
            byte[] r0 = io.netty.util.NetUtil.createByteArrayFromIpAddressString(r7)
            if (r0 == 0) goto L1c
            java.net.InetAddress r7 = java.net.InetAddress.getByAddress(r0)
            java.util.List r7 = java.util.Collections.singletonList(r7)
            r9.setSuccess(r7)
            return
        L1c:
            java.lang.String r1 = hostname(r7)
            java.net.InetAddress r7 = r6.resolveHostsFileEntry(r1)
            if (r7 == 0) goto L2e
            java.util.List r7 = java.util.Collections.singletonList(r7)
            r9.setSuccess(r7)
            return
        L2e:
            io.netty.channel.socket.InternetProtocolFamily[] r7 = r6.resolvedInternetProtocolFamilies
            boolean r7 = doResolveAllCached(r1, r8, r9, r10, r7)
            if (r7 != 0) goto L3f
            boolean r5 = r6.completeOncePreferredResolved
            r0 = r6
            r2 = r8
            r3 = r9
            r4 = r10
            r0.doResolveAllUncached(r1, r2, r3, r4, r5)
        L3f:
            return
        L40:
            java.net.InetAddress r7 = r6.loopbackAddress()
            java.util.List r7 = java.util.Collections.singletonList(r7)
            r3.setSuccess(r7)
            return
    }

    protected io.netty.channel.EventLoop executor() {
            r1 = this;
            io.netty.util.concurrent.EventExecutor r0 = super/*io.netty.resolver.SimpleNameResolver*/.executor()
            io.netty.channel.EventLoop r0 = (io.netty.channel.EventLoop) r0
            return r0
    }

    /* renamed from: executor, reason: collision with other method in class */
    protected /* bridge */ /* synthetic */ io.netty.util.concurrent.EventExecutor m0executor() {
            r1 = this;
            io.netty.channel.EventLoop r0 = r1.executor()
            return r0
    }

    final void flushQueries() {
            r1 = this;
            io.netty.channel.Channel r0 = r1.ch
            r0.flush()
            return
    }

    public io.netty.resolver.HostsFileEntriesResolver hostsFileEntriesResolver() {
            r1 = this;
            io.netty.resolver.HostsFileEntriesResolver r0 = r1.hostsFileEntriesResolver
            return r0
    }

    final boolean isDecodeIdn() {
            r1 = this;
            boolean r0 = r1.decodeIdn
            return r0
    }

    public boolean isOptResourceEnabled() {
            r1 = this;
            boolean r0 = r1.optResourceEnabled
            return r0
    }

    public boolean isRecursionDesired() {
            r1 = this;
            boolean r0 = r1.recursionDesired
            return r0
    }

    public int maxPayloadSize() {
            r1 = this;
            int r0 = r1.maxPayloadSize
            return r0
    }

    public int maxQueriesPerResolve() {
            r1 = this;
            int r0 = r1.maxQueriesPerResolve
            return r0
    }

    final int ndots() {
            r1 = this;
            int r0 = r1.ndots
            return r0
    }

    final io.netty.resolver.dns.DnsServerAddressStream newNameServerAddressStream(java.lang.String r2) {
            r1 = this;
            io.netty.resolver.dns.DnsServerAddressStreamProvider r0 = r1.dnsServerAddressStreamProvider
            io.netty.resolver.dns.DnsServerAddressStream r2 = r0.nameServerAddressStream(r2)
            return r2
    }

    protected io.netty.resolver.dns.DnsServerAddressStream newRedirectDnsServerStream(java.lang.String r2, java.util.List<java.net.InetSocketAddress> r3) {
            r1 = this;
            io.netty.resolver.dns.AuthoritativeDnsServerCache r0 = r1.authoritativeDnsServerCache()
            io.netty.resolver.dns.DnsServerAddressStream r2 = r0.get(r2)
            if (r2 == 0) goto L12
            int r0 = r2.size()
            if (r0 != 0) goto L11
            goto L12
        L11:
            return r2
        L12:
            java.util.Comparator<java.net.InetSocketAddress> r2 = r1.nameServerComparator
            java.util.Collections.sort(r3, r2)
            io.netty.resolver.dns.SequentialDnsServerAddressStream r2 = new io.netty.resolver.dns.SequentialDnsServerAddressStream
            r0 = 0
            r2.<init>(r3, r0)
            return r2
    }

    java.net.InetSocketAddress newRedirectServerAddress(java.net.InetAddress r3) {
            r2 = this;
            java.net.InetSocketAddress r0 = new java.net.InetSocketAddress
            r1 = 53
            r0.<init>(r3, r1)
            return r0
    }

    final io.netty.channel.socket.InternetProtocolFamily preferredAddressType() {
            r1 = this;
            io.netty.channel.socket.InternetProtocolFamily r0 = r1.preferredAddressType
            return r0
    }

    public io.netty.util.concurrent.Future<io.netty.channel.AddressedEnvelope<io.netty.handler.codec.dns.DnsResponse, java.net.InetSocketAddress>> query(io.netty.handler.codec.dns.DnsQuestion r2) {
            r1 = this;
            java.net.InetSocketAddress r0 = r1.nextNameServerAddress()
            io.netty.util.concurrent.Future r2 = r1.query(r0, r2)
            return r2
    }

    public io.netty.util.concurrent.Future<io.netty.channel.AddressedEnvelope<io.netty.handler.codec.dns.DnsResponse, java.net.InetSocketAddress>> query(io.netty.handler.codec.dns.DnsQuestion r3, io.netty.util.concurrent.Promise<io.netty.channel.AddressedEnvelope<? extends io.netty.handler.codec.dns.DnsResponse, java.net.InetSocketAddress>> r4) {
            r2 = this;
            java.net.InetSocketAddress r0 = r2.nextNameServerAddress()
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            io.netty.util.concurrent.Future r3 = r2.query(r0, r3, r1, r4)
            return r3
    }

    public io.netty.util.concurrent.Future<io.netty.channel.AddressedEnvelope<io.netty.handler.codec.dns.DnsResponse, java.net.InetSocketAddress>> query(io.netty.handler.codec.dns.DnsQuestion r2, java.lang.Iterable<io.netty.handler.codec.dns.DnsRecord> r3) {
            r1 = this;
            java.net.InetSocketAddress r0 = r1.nextNameServerAddress()
            io.netty.util.concurrent.Future r2 = r1.query(r0, r2, r3)
            return r2
    }

    public io.netty.util.concurrent.Future<io.netty.channel.AddressedEnvelope<io.netty.handler.codec.dns.DnsResponse, java.net.InetSocketAddress>> query(java.net.InetSocketAddress r8, io.netty.handler.codec.dns.DnsQuestion r9) {
            r7 = this;
            io.netty.handler.codec.dns.DnsRecord[] r3 = io.netty.resolver.dns.DnsNameResolver.EMPTY_ADDITIONALS
            io.netty.channel.Channel r0 = r7.ch
            io.netty.channel.ChannelPromise r5 = r0.newPromise()
            io.netty.channel.Channel r0 = r7.ch
            io.netty.channel.EventLoop r0 = r0.eventLoop()
            io.netty.util.concurrent.Promise r6 = r0.newPromise()
            r4 = 1
            r0 = r7
            r1 = r8
            r2 = r9
            io.netty.util.concurrent.Future r8 = r0.query0(r1, r2, r3, r4, r5, r6)
            return r8
    }

    public io.netty.util.concurrent.Future<io.netty.channel.AddressedEnvelope<io.netty.handler.codec.dns.DnsResponse, java.net.InetSocketAddress>> query(java.net.InetSocketAddress r8, io.netty.handler.codec.dns.DnsQuestion r9, io.netty.util.concurrent.Promise<io.netty.channel.AddressedEnvelope<? extends io.netty.handler.codec.dns.DnsResponse, java.net.InetSocketAddress>> r10) {
            r7 = this;
            io.netty.handler.codec.dns.DnsRecord[] r3 = io.netty.resolver.dns.DnsNameResolver.EMPTY_ADDITIONALS
            io.netty.channel.Channel r0 = r7.ch
            io.netty.channel.ChannelPromise r5 = r0.newPromise()
            r4 = 1
            r0 = r7
            r1 = r8
            r2 = r9
            r6 = r10
            io.netty.util.concurrent.Future r8 = r0.query0(r1, r2, r3, r4, r5, r6)
            return r8
    }

    public io.netty.util.concurrent.Future<io.netty.channel.AddressedEnvelope<io.netty.handler.codec.dns.DnsResponse, java.net.InetSocketAddress>> query(java.net.InetSocketAddress r9, io.netty.handler.codec.dns.DnsQuestion r10, java.lang.Iterable<io.netty.handler.codec.dns.DnsRecord> r11) {
            r8 = this;
            r0 = 0
            io.netty.handler.codec.dns.DnsRecord[] r4 = toArray(r11, r0)
            io.netty.channel.Channel r11 = r8.ch
            io.netty.channel.ChannelPromise r6 = r11.newPromise()
            io.netty.channel.Channel r11 = r8.ch
            io.netty.channel.EventLoop r11 = r11.eventLoop()
            io.netty.util.concurrent.Promise r7 = r11.newPromise()
            r5 = 1
            r1 = r8
            r2 = r9
            r3 = r10
            io.netty.util.concurrent.Future r9 = r1.query0(r2, r3, r4, r5, r6, r7)
            return r9
    }

    public io.netty.util.concurrent.Future<io.netty.channel.AddressedEnvelope<io.netty.handler.codec.dns.DnsResponse, java.net.InetSocketAddress>> query(java.net.InetSocketAddress r9, io.netty.handler.codec.dns.DnsQuestion r10, java.lang.Iterable<io.netty.handler.codec.dns.DnsRecord> r11, io.netty.util.concurrent.Promise<io.netty.channel.AddressedEnvelope<? extends io.netty.handler.codec.dns.DnsResponse, java.net.InetSocketAddress>> r12) {
            r8 = this;
            r0 = 0
            io.netty.handler.codec.dns.DnsRecord[] r4 = toArray(r11, r0)
            io.netty.channel.Channel r11 = r8.ch
            io.netty.channel.ChannelPromise r6 = r11.newPromise()
            r5 = 1
            r1 = r8
            r2 = r9
            r3 = r10
            r7 = r12
            io.netty.util.concurrent.Future r9 = r1.query0(r2, r3, r4, r5, r6, r7)
            return r9
    }

    final io.netty.util.concurrent.Future<io.netty.channel.AddressedEnvelope<io.netty.handler.codec.dns.DnsResponse, java.net.InetSocketAddress>> query0(java.net.InetSocketAddress r7, io.netty.handler.codec.dns.DnsQuestion r8, io.netty.handler.codec.dns.DnsRecord[] r9, boolean r10, io.netty.channel.ChannelPromise r11, io.netty.util.concurrent.Promise<io.netty.channel.AddressedEnvelope<? extends io.netty.handler.codec.dns.DnsResponse, java.net.InetSocketAddress>> r12) {
            r6 = this;
            java.lang.String r0 = "promise"
            java.lang.Object r12 = io.netty.util.internal.ObjectUtil.checkNotNull(r12, r0)
            io.netty.util.concurrent.Promise r12 = (io.netty.util.concurrent.Promise) r12
            io.netty.util.concurrent.Promise r5 = cast(r12)
            io.netty.resolver.dns.DatagramDnsQueryContext r0 = new io.netty.resolver.dns.DatagramDnsQueryContext     // Catch: java.lang.Exception -> L19
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L19
            r0.query(r10, r11)     // Catch: java.lang.Exception -> L19
            return r5
        L19:
            r0 = move-exception
            r7 = r0
            io.netty.util.concurrent.Promise r7 = r5.setFailure(r7)
            return r7
    }

    public long queryTimeoutMillis() {
            r2 = this;
            long r0 = r2.queryTimeoutMillis
            return r0
    }

    public final io.netty.util.concurrent.Future<java.net.InetAddress> resolve(java.lang.String r2, java.lang.Iterable<io.netty.handler.codec.dns.DnsRecord> r3) {
            r1 = this;
            io.netty.channel.EventLoop r0 = r1.executor()
            io.netty.util.concurrent.Promise r0 = r0.newPromise()
            io.netty.util.concurrent.Future r2 = r1.resolve(r2, r3, r0)
            return r2
    }

    public final io.netty.util.concurrent.Future<java.net.InetAddress> resolve(java.lang.String r2, java.lang.Iterable<io.netty.handler.codec.dns.DnsRecord> r3, io.netty.util.concurrent.Promise<java.net.InetAddress> r4) {
            r1 = this;
            java.lang.String r0 = "promise"
            io.netty.util.internal.ObjectUtil.checkNotNull(r4, r0)
            r0 = 1
            io.netty.handler.codec.dns.DnsRecord[] r3 = toArray(r3, r0)
            io.netty.resolver.dns.DnsCache r0 = r1.resolveCache     // Catch: java.lang.Exception -> L10
            r1.doResolve(r2, r3, r4, r0)     // Catch: java.lang.Exception -> L10
            return r4
        L10:
            r2 = move-exception
            io.netty.util.concurrent.Promise r2 = r4.setFailure(r2)
            return r2
    }

    public final io.netty.util.concurrent.Future<java.util.List<io.netty.handler.codec.dns.DnsRecord>> resolveAll(io.netty.handler.codec.dns.DnsQuestion r3) {
            r2 = this;
            io.netty.handler.codec.dns.DnsRecord[] r0 = io.netty.resolver.dns.DnsNameResolver.EMPTY_ADDITIONALS
            io.netty.channel.EventLoop r1 = r2.executor()
            io.netty.util.concurrent.Promise r1 = r1.newPromise()
            io.netty.util.concurrent.Future r3 = r2.resolveAll(r3, r0, r1)
            return r3
    }

    public final io.netty.util.concurrent.Future<java.util.List<io.netty.handler.codec.dns.DnsRecord>> resolveAll(io.netty.handler.codec.dns.DnsQuestion r2, java.lang.Iterable<io.netty.handler.codec.dns.DnsRecord> r3) {
            r1 = this;
            io.netty.channel.EventLoop r0 = r1.executor()
            io.netty.util.concurrent.Promise r0 = r0.newPromise()
            io.netty.util.concurrent.Future r2 = r1.resolveAll(r2, r3, r0)
            return r2
    }

    public final io.netty.util.concurrent.Future<java.util.List<io.netty.handler.codec.dns.DnsRecord>> resolveAll(io.netty.handler.codec.dns.DnsQuestion r2, java.lang.Iterable<io.netty.handler.codec.dns.DnsRecord> r3, io.netty.util.concurrent.Promise<java.util.List<io.netty.handler.codec.dns.DnsRecord>> r4) {
            r1 = this;
            r0 = 1
            io.netty.handler.codec.dns.DnsRecord[] r3 = toArray(r3, r0)
            io.netty.util.concurrent.Future r2 = r1.resolveAll(r2, r3, r4)
            return r2
    }

    public final io.netty.util.concurrent.Future<java.util.List<java.net.InetAddress>> resolveAll(java.lang.String r2, java.lang.Iterable<io.netty.handler.codec.dns.DnsRecord> r3) {
            r1 = this;
            io.netty.channel.EventLoop r0 = r1.executor()
            io.netty.util.concurrent.Promise r0 = r0.newPromise()
            io.netty.util.concurrent.Future r2 = r1.resolveAll(r2, r3, r0)
            return r2
    }

    public final io.netty.util.concurrent.Future<java.util.List<java.net.InetAddress>> resolveAll(java.lang.String r2, java.lang.Iterable<io.netty.handler.codec.dns.DnsRecord> r3, io.netty.util.concurrent.Promise<java.util.List<java.net.InetAddress>> r4) {
            r1 = this;
            java.lang.String r0 = "promise"
            io.netty.util.internal.ObjectUtil.checkNotNull(r4, r0)
            r0 = 1
            io.netty.handler.codec.dns.DnsRecord[] r3 = toArray(r3, r0)
            io.netty.resolver.dns.DnsCache r0 = r1.resolveCache     // Catch: java.lang.Exception -> L10
            r1.doResolveAll(r2, r3, r4, r0)     // Catch: java.lang.Exception -> L10
            return r4
        L10:
            r2 = move-exception
            io.netty.util.concurrent.Promise r2 = r4.setFailure(r2)
            return r2
    }

    public io.netty.resolver.dns.DnsCache resolveCache() {
            r1 = this;
            io.netty.resolver.dns.DnsCache r0 = r1.resolveCache
            return r0
    }

    final io.netty.handler.codec.dns.DnsRecordType[] resolveRecordTypes() {
            r1 = this;
            io.netty.handler.codec.dns.DnsRecordType[] r0 = r1.resolveRecordTypes
            return r0
    }

    public io.netty.resolver.ResolvedAddressTypes resolvedAddressTypes() {
            r1 = this;
            io.netty.resolver.ResolvedAddressTypes r0 = r1.resolvedAddressTypes
            return r0
    }

    io.netty.channel.socket.InternetProtocolFamily[] resolvedInternetProtocolFamiliesUnsafe() {
            r1 = this;
            io.netty.channel.socket.InternetProtocolFamily[] r0 = r1.resolvedInternetProtocolFamilies
            return r0
    }

    final java.lang.String[] searchDomains() {
            r1 = this;
            java.lang.String[] r0 = r1.searchDomains
            return r0
    }

    final boolean supportsAAAARecords() {
            r1 = this;
            boolean r0 = r1.supportsAAAARecords
            return r0
    }

    final boolean supportsARecords() {
            r1 = this;
            boolean r0 = r1.supportsARecords
            return r0
    }
}
