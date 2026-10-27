package io.netty.resolver.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
abstract class DnsResolveContext<T> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.lang.RuntimeException CNAME_NOT_FOUND_QUERY_FAILED_EXCEPTION = null;
    private static final java.lang.RuntimeException NAME_SERVERS_EXHAUSTED_EXCEPTION = null;
    private static final java.lang.RuntimeException NO_MATCHING_RECORD_QUERY_FAILED_EXCEPTION = null;
    private static final java.lang.RuntimeException NXDOMAIN_QUERY_FAILED_EXCEPTION = null;
    private static final java.lang.RuntimeException UNRECOGNIZED_TYPE_QUERY_FAILED_EXCEPTION = null;
    final io.netty.handler.codec.dns.DnsRecord[] additionals;
    private int allowedQueries;
    private boolean completeEarly;
    private final int dnsClass;
    private final io.netty.handler.codec.dns.DnsRecordType[] expectedTypes;
    private java.util.List<T> finalResult;
    private final java.lang.String hostname;
    private final int maxAllowedQueries;
    private final io.netty.resolver.dns.DnsServerAddressStream nameServerAddrs;
    final io.netty.resolver.dns.DnsNameResolver parent;
    private final java.util.Set<io.netty.util.concurrent.Future<io.netty.channel.AddressedEnvelope<io.netty.handler.codec.dns.DnsResponse, java.net.InetSocketAddress>>> queriesInProgress;
    private boolean triedCNAME;





    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class AuthoritativeNameServer {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private java.net.InetSocketAddress address;
        private final java.lang.String domainName;
        private final int dots;
        final boolean isCopy;
        io.netty.resolver.dns.DnsResolveContext.AuthoritativeNameServer next;
        final java.lang.String nsName;
        private long ttl;

        static {
                return
        }

        AuthoritativeNameServer(int r1, long r2, java.lang.String r4, java.lang.String r5) {
                r0 = this;
                r0.<init>()
                r0.dots = r1
                r0.ttl = r2
                r0.nsName = r5
                r0.domainName = r4
                r1 = 0
                r0.isCopy = r1
                return
        }

        AuthoritativeNameServer(io.netty.resolver.dns.DnsResolveContext.AuthoritativeNameServer r3) {
                r2 = this;
                r2.<init>()
                int r0 = r3.dots
                r2.dots = r0
                long r0 = r3.ttl
                r2.ttl = r0
                java.lang.String r0 = r3.nsName
                r2.nsName = r0
                java.lang.String r3 = r3.domainName
                r2.domainName = r3
                r3 = 1
                r2.isCopy = r3
                return
        }

        static /* synthetic */ java.net.InetSocketAddress access$1000(io.netty.resolver.dns.DnsResolveContext.AuthoritativeNameServer r0) {
                java.net.InetSocketAddress r0 = r0.address
                return r0
        }

        static /* synthetic */ java.net.InetSocketAddress access$1002(io.netty.resolver.dns.DnsResolveContext.AuthoritativeNameServer r0, java.net.InetSocketAddress r1) {
                r0.address = r1
                return r1
        }

        static /* synthetic */ java.lang.String access$1100(io.netty.resolver.dns.DnsResolveContext.AuthoritativeNameServer r0) {
                java.lang.String r0 = r0.domainName
                return r0
        }

        static /* synthetic */ long access$1200(io.netty.resolver.dns.DnsResolveContext.AuthoritativeNameServer r2) {
                long r0 = r2.ttl
                return r0
        }

        static /* synthetic */ int access$900(io.netty.resolver.dns.DnsResolveContext.AuthoritativeNameServer r0) {
                int r0 = r0.dots
                return r0
        }

        boolean isRootServer() {
                r2 = this;
                int r0 = r2.dots
                r1 = 1
                if (r0 != r1) goto L6
                return r1
            L6:
                r0 = 0
                return r0
        }

        void update(java.net.InetSocketAddress r3) {
                r2 = this;
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r2.update(r3, r0)
                return
        }

        void update(java.net.InetSocketAddress r3, long r4) {
                r2 = this;
                r2.address = r3
                long r0 = r2.ttl
                long r3 = java.lang.Math.min(r0, r4)
                r2.ttl = r3
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class AuthoritativeNameServerList {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private io.netty.resolver.dns.DnsResolveContext.AuthoritativeNameServer head;
        private int nameServerCount;
        private final java.lang.String questionName;

        static {
                return
        }

        AuthoritativeNameServerList(java.lang.String r2) {
                r1 = this;
                r1.<init>()
                java.util.Locale r0 = java.util.Locale.US
                java.lang.String r2 = r2.toLowerCase(r0)
                r1.questionName = r2
                return
        }

        private static void cache(io.netty.resolver.dns.DnsResolveContext.AuthoritativeNameServer r7, io.netty.resolver.dns.AuthoritativeDnsServerCache r8, io.netty.channel.EventLoop r9) {
                boolean r0 = r7.isRootServer()
                if (r0 != 0) goto L17
                java.lang.String r2 = io.netty.resolver.dns.DnsResolveContext.AuthoritativeNameServer.access$1100(r7)
                java.net.InetSocketAddress r3 = io.netty.resolver.dns.DnsResolveContext.AuthoritativeNameServer.access$1000(r7)
                long r4 = io.netty.resolver.dns.DnsResolveContext.AuthoritativeNameServer.access$1200(r7)
                r1 = r8
                r6 = r9
                r1.cache(r2, r3, r4, r6)
            L17:
                return
        }

        private static void cacheUnresolved(io.netty.resolver.dns.DnsResolveContext.AuthoritativeNameServer r2, io.netty.resolver.dns.AuthoritativeDnsServerCache r3, io.netty.channel.EventLoop r4) {
                java.lang.String r0 = r2.nsName
                r1 = 53
                java.net.InetSocketAddress r0 = java.net.InetSocketAddress.createUnresolved(r0, r1)
                io.netty.resolver.dns.DnsResolveContext.AuthoritativeNameServer.access$1002(r2, r0)
                cache(r2, r3, r4)
                return
        }

        void add(io.netty.handler.codec.dns.DnsRecord r9) {
                r8 = this;
                io.netty.handler.codec.dns.DnsRecordType r0 = r9.type()
                io.netty.handler.codec.dns.DnsRecordType r1 = io.netty.handler.codec.dns.DnsRecordType.NS
                if (r0 != r1) goto La4
                boolean r0 = r9 instanceof io.netty.handler.codec.dns.DnsRawRecord
                if (r0 != 0) goto Le
                goto La4
            Le:
                java.lang.String r0 = r8.questionName
                int r0 = r0.length()
                java.lang.String r1 = r9.name()
                int r1 = r1.length()
                if (r0 >= r1) goto L20
                goto La4
            L20:
                java.lang.String r0 = r9.name()
                java.util.Locale r1 = java.util.Locale.US
                java.lang.String r6 = r0.toLowerCase(r1)
                int r0 = r6.length()
                r1 = 1
                int r0 = r0 - r1
                java.lang.String r2 = r8.questionName
                int r2 = r2.length()
                int r2 = r2 - r1
                r3 = 0
            L38:
                if (r0 < 0) goto L52
                char r4 = r6.charAt(r0)
                java.lang.String r5 = r8.questionName
                char r5 = r5.charAt(r2)
                if (r5 == r4) goto L47
                goto La4
            L47:
                r5 = 46
                if (r4 != r5) goto L4d
                int r3 = r3 + 1
            L4d:
                int r0 = r0 + (-1)
                int r2 = r2 + (-1)
                goto L38
            L52:
                io.netty.resolver.dns.DnsResolveContext$AuthoritativeNameServer r0 = r8.head
                if (r0 == 0) goto L5d
                int r0 = io.netty.resolver.dns.DnsResolveContext.AuthoritativeNameServer.access$900(r0)
                if (r0 <= r3) goto L5d
                goto La4
            L5d:
                r0 = r9
                io.netty.buffer.ByteBufHolder r0 = (io.netty.buffer.ByteBufHolder) r0
                io.netty.buffer.ByteBuf r0 = r0.content()
                java.lang.String r7 = io.netty.resolver.dns.DnsResolveContext.decodeDomainName(r0)
                if (r7 != 0) goto L6b
                goto La4
            L6b:
                io.netty.resolver.dns.DnsResolveContext$AuthoritativeNameServer r0 = r8.head
                if (r0 == 0) goto L97
                int r0 = io.netty.resolver.dns.DnsResolveContext.AuthoritativeNameServer.access$900(r0)
                if (r0 >= r3) goto L76
                goto L97
            L76:
                io.netty.resolver.dns.DnsResolveContext$AuthoritativeNameServer r0 = r8.head
                int r0 = io.netty.resolver.dns.DnsResolveContext.AuthoritativeNameServer.access$900(r0)
                if (r0 != r3) goto La4
                io.netty.resolver.dns.DnsResolveContext$AuthoritativeNameServer r0 = r8.head
            L80:
                io.netty.resolver.dns.DnsResolveContext$AuthoritativeNameServer r2 = r0.next
                if (r2 == 0) goto L86
                r0 = r2
                goto L80
            L86:
                io.netty.resolver.dns.DnsResolveContext$AuthoritativeNameServer r2 = new io.netty.resolver.dns.DnsResolveContext$AuthoritativeNameServer
                long r4 = r9.timeToLive()
                r2.<init>(r3, r4, r6, r7)
                r0.next = r2
                int r9 = r8.nameServerCount
                int r9 = r9 + r1
                r8.nameServerCount = r9
                return
            L97:
                r8.nameServerCount = r1
                io.netty.resolver.dns.DnsResolveContext$AuthoritativeNameServer r2 = new io.netty.resolver.dns.DnsResolveContext$AuthoritativeNameServer
                long r4 = r9.timeToLive()
                r2.<init>(r3, r4, r6, r7)
                r8.head = r2
            La4:
                return
        }

        java.util.List<java.net.InetSocketAddress> addressList() {
                r3 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r3.nameServerCount
                r0.<init>(r1)
                io.netty.resolver.dns.DnsResolveContext$AuthoritativeNameServer r1 = r3.head
            L9:
                if (r1 == 0) goto L1b
                java.net.InetSocketAddress r2 = io.netty.resolver.dns.DnsResolveContext.AuthoritativeNameServer.access$1000(r1)
                if (r2 == 0) goto L18
                java.net.InetSocketAddress r2 = io.netty.resolver.dns.DnsResolveContext.AuthoritativeNameServer.access$1000(r1)
                r0.add(r2)
            L18:
                io.netty.resolver.dns.DnsResolveContext$AuthoritativeNameServer r1 = r1.next
                goto L9
            L1b:
                return r0
        }

        void handleWithAdditional(io.netty.resolver.dns.DnsNameResolver r5, io.netty.handler.codec.dns.DnsRecord r6, io.netty.resolver.dns.AuthoritativeDnsServerCache r7) {
                r4 = this;
                io.netty.resolver.dns.DnsResolveContext$AuthoritativeNameServer r0 = r4.head
                java.lang.String r1 = r6.name()
                boolean r2 = r5.isDecodeIdn()
                java.net.InetAddress r2 = io.netty.resolver.dns.DnsAddressDecoder.decodeAddress(r6, r1, r2)
                if (r2 != 0) goto L11
                goto L53
            L11:
                if (r0 == 0) goto L53
                java.lang.String r3 = r0.nsName
                boolean r3 = r3.equalsIgnoreCase(r1)
                if (r3 == 0) goto L50
                java.net.InetSocketAddress r1 = io.netty.resolver.dns.DnsResolveContext.AuthoritativeNameServer.access$1000(r0)
                if (r1 == 0) goto L3d
            L21:
                io.netty.resolver.dns.DnsResolveContext$AuthoritativeNameServer r1 = r0.next
                if (r1 == 0) goto L2b
                boolean r3 = r1.isCopy
                if (r3 == 0) goto L2b
                r0 = r1
                goto L21
            L2b:
                io.netty.resolver.dns.DnsResolveContext$AuthoritativeNameServer r1 = new io.netty.resolver.dns.DnsResolveContext$AuthoritativeNameServer
                r1.<init>(r0)
                io.netty.resolver.dns.DnsResolveContext$AuthoritativeNameServer r3 = r0.next
                r1.next = r3
                r0.next = r1
                int r0 = r4.nameServerCount
                int r0 = r0 + 1
                r4.nameServerCount = r0
                r0 = r1
            L3d:
                java.net.InetSocketAddress r1 = r5.newRedirectServerAddress(r2)
                long r2 = r6.timeToLive()
                r0.update(r1, r2)
                io.netty.channel.EventLoop r5 = r5.executor()
                cache(r0, r7, r5)
                return
            L50:
                io.netty.resolver.dns.DnsResolveContext$AuthoritativeNameServer r0 = r0.next
                goto L11
            L53:
                return
        }

        void handleWithoutAdditionals(io.netty.resolver.dns.DnsNameResolver r8, io.netty.resolver.dns.DnsCache r9, io.netty.resolver.dns.AuthoritativeDnsServerCache r10) {
                r7 = this;
                io.netty.resolver.dns.DnsResolveContext$AuthoritativeNameServer r0 = r7.head
            L2:
                if (r0 == 0) goto L64
                java.net.InetSocketAddress r1 = io.netty.resolver.dns.DnsResolveContext.AuthoritativeNameServer.access$1000(r0)
                if (r1 != 0) goto L61
                io.netty.channel.EventLoop r1 = r8.executor()
                cacheUnresolved(r0, r10, r1)
                java.lang.String r1 = r0.nsName
                r2 = 0
                java.util.List r1 = r9.get(r1, r2)
                if (r1 == 0) goto L61
                boolean r2 = r1.isEmpty()
                if (r2 != 0) goto L61
                r2 = 0
                java.lang.Object r2 = r1.get(r2)
                io.netty.resolver.dns.DnsCacheEntry r2 = (io.netty.resolver.dns.DnsCacheEntry) r2
                java.net.InetAddress r2 = r2.address()
                if (r2 == 0) goto L61
                java.net.InetSocketAddress r2 = r8.newRedirectServerAddress(r2)
                r0.update(r2)
                r2 = 1
                r3 = 1
            L36:
                int r4 = r1.size()
                if (r3 >= r4) goto L61
                java.lang.Object r4 = r1.get(r3)
                io.netty.resolver.dns.DnsCacheEntry r4 = (io.netty.resolver.dns.DnsCacheEntry) r4
                java.net.InetAddress r4 = r4.address()
                io.netty.resolver.dns.DnsResolveContext$AuthoritativeNameServer r5 = new io.netty.resolver.dns.DnsResolveContext$AuthoritativeNameServer
                r5.<init>(r0)
                io.netty.resolver.dns.DnsResolveContext$AuthoritativeNameServer r6 = r0.next
                r5.next = r6
                r0.next = r5
                java.net.InetSocketAddress r0 = r8.newRedirectServerAddress(r4)
                r5.update(r0)
                int r0 = r7.nameServerCount
                int r0 = r0 + r2
                r7.nameServerCount = r0
                int r3 = r3 + 1
                r0 = r5
                goto L36
            L61:
                io.netty.resolver.dns.DnsResolveContext$AuthoritativeNameServer r0 = r0.next
                goto L2
            L64:
                return
        }

        boolean isEmpty() {
                r1 = this;
                int r0 = r1.nameServerCount
                if (r0 != 0) goto L6
                r0 = 1
                return r0
            L6:
                r0 = 0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class CombinedDnsServerAddressStream implements io.netty.resolver.dns.DnsServerAddressStream {
        private final io.netty.resolver.dns.DnsServerAddressStream originalStream;
        private final java.net.InetSocketAddress replaced;
        private java.util.Iterator<java.net.InetAddress> resolved;
        private final java.util.List<java.net.InetAddress> resolvedAddresses;
        final /* synthetic */ io.netty.resolver.dns.DnsResolveContext this$0;

        CombinedDnsServerAddressStream(io.netty.resolver.dns.DnsResolveContext r1, java.net.InetSocketAddress r2, java.util.List<java.net.InetAddress> r3, io.netty.resolver.dns.DnsServerAddressStream r4) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.replaced = r2
                r0.resolvedAddresses = r3
                r0.originalStream = r4
                java.util.Iterator r1 = r3.iterator()
                r0.resolved = r1
                return
        }

        private java.net.InetSocketAddress nextResolved0() {
                r2 = this;
                io.netty.resolver.dns.DnsResolveContext r0 = r2.this$0
                io.netty.resolver.dns.DnsNameResolver r0 = r0.parent
                java.util.Iterator<java.net.InetAddress> r1 = r2.resolved
                java.lang.Object r1 = r1.next()
                java.net.InetAddress r1 = (java.net.InetAddress) r1
                java.net.InetSocketAddress r0 = r0.newRedirectServerAddress(r1)
                return r0
        }

        @Override // io.netty.resolver.dns.DnsServerAddressStream
        public io.netty.resolver.dns.DnsServerAddressStream duplicate() {
                r5 = this;
                io.netty.resolver.dns.DnsResolveContext$CombinedDnsServerAddressStream r0 = new io.netty.resolver.dns.DnsResolveContext$CombinedDnsServerAddressStream
                io.netty.resolver.dns.DnsResolveContext r1 = r5.this$0
                java.net.InetSocketAddress r2 = r5.replaced
                java.util.List<java.net.InetAddress> r3 = r5.resolvedAddresses
                io.netty.resolver.dns.DnsServerAddressStream r4 = r5.originalStream
                io.netty.resolver.dns.DnsServerAddressStream r4 = r4.duplicate()
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        @Override // io.netty.resolver.dns.DnsServerAddressStream
        public java.net.InetSocketAddress next() {
                r2 = this;
                java.util.Iterator<java.net.InetAddress> r0 = r2.resolved
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto Ld
                java.net.InetSocketAddress r0 = r2.nextResolved0()
                return r0
            Ld:
                io.netty.resolver.dns.DnsServerAddressStream r0 = r2.originalStream
                java.net.InetSocketAddress r0 = r0.next()
                java.net.InetSocketAddress r1 = r2.replaced
                boolean r1 = r0.equals(r1)
                if (r1 == 0) goto L27
                java.util.List<java.net.InetAddress> r0 = r2.resolvedAddresses
                java.util.Iterator r0 = r0.iterator()
                r2.resolved = r0
                java.net.InetSocketAddress r0 = r2.nextResolved0()
            L27:
                return r0
        }

        @Override // io.netty.resolver.dns.DnsServerAddressStream
        public int size() {
                r2 = this;
                io.netty.resolver.dns.DnsServerAddressStream r0 = r2.originalStream
                int r0 = r0.size()
                java.util.List<java.net.InetAddress> r1 = r2.resolvedAddresses
                int r1 = r1.size()
                int r0 = r0 + r1
                int r0 = r0 + (-1)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class DnsAddressStreamList extends java.util.AbstractList<java.net.InetSocketAddress> {
        private java.util.List<java.net.InetSocketAddress> addresses;
        private final io.netty.resolver.dns.DnsServerAddressStream duplicate;


        DnsAddressStreamList(io.netty.resolver.dns.DnsServerAddressStream r1) {
                r0 = this;
                r0.<init>()
                io.netty.resolver.dns.DnsServerAddressStream r1 = r1.duplicate()
                r0.duplicate = r1
                return
        }

        static /* synthetic */ io.netty.resolver.dns.DnsServerAddressStream access$800(io.netty.resolver.dns.DnsResolveContext.DnsAddressStreamList r0) {
                io.netty.resolver.dns.DnsServerAddressStream r0 = r0.duplicate
                return r0
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                java.net.InetSocketAddress r1 = r0.get(r1)
                return r1
        }

        @Override // java.util.AbstractList, java.util.List
        public java.net.InetSocketAddress get(int r5) {
                r4 = this;
                java.util.List<java.net.InetSocketAddress> r0 = r4.addresses
                if (r0 != 0) goto L28
                io.netty.resolver.dns.DnsServerAddressStream r0 = r4.duplicate
                io.netty.resolver.dns.DnsServerAddressStream r0 = r0.duplicate()
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r4.size()
                r1.<init>(r2)
                r4.addresses = r1
                r1 = 0
            L16:
                int r2 = r0.size()
                if (r1 >= r2) goto L28
                java.util.List<java.net.InetSocketAddress> r2 = r4.addresses
                java.net.InetSocketAddress r3 = r0.next()
                r2.add(r3)
                int r1 = r1 + 1
                goto L16
            L28:
                java.util.List<java.net.InetSocketAddress> r0 = r4.addresses
                java.lang.Object r5 = r0.get(r5)
                java.net.InetSocketAddress r5 = (java.net.InetSocketAddress) r5
                return r5
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public java.util.Iterator<java.net.InetSocketAddress> iterator() {
                r1 = this;
                io.netty.resolver.dns.DnsResolveContext$DnsAddressStreamList$1 r0 = new io.netty.resolver.dns.DnsResolveContext$DnsAddressStreamList$1
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                io.netty.resolver.dns.DnsServerAddressStream r0 = r1.duplicate
                int r0 = r0.size()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class DnsResolveContextException extends java.lang.RuntimeException {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        static {
                return
        }

        private DnsResolveContextException(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @io.netty.util.internal.SuppressJava6Requirement(reason = "uses Java 7+ Exception.<init>(String, Throwable, boolean, boolean) but is guarded by version checks")
        private DnsResolveContextException(java.lang.String r3, boolean r4) {
                r2 = this;
                r4 = 0
                r0 = 1
                r1 = 0
                r2.<init>(r3, r1, r4, r0)
                return
        }

        static io.netty.resolver.dns.DnsResolveContext.DnsResolveContextException newStatic(java.lang.String r2) {
                int r0 = io.netty.util.internal.PlatformDependent.javaVersion()
                r1 = 7
                if (r0 < r1) goto Le
                io.netty.resolver.dns.DnsResolveContext$DnsResolveContextException r0 = new io.netty.resolver.dns.DnsResolveContext$DnsResolveContextException
                r1 = 1
                r0.<init>(r2, r1)
                return r0
            Le:
                io.netty.resolver.dns.DnsResolveContext$DnsResolveContextException r0 = new io.netty.resolver.dns.DnsResolveContext$DnsResolveContextException
                r0.<init>(r2)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class SearchDomainUnknownHostException extends java.net.UnknownHostException {
        private static final long serialVersionUID = -8573510133644997085L;

        SearchDomainUnknownHostException(java.lang.Throwable r3, java.lang.String r4) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Search domain query failed. Original hostname: '"
                r0.append(r1)
                r0.append(r4)
                java.lang.String r4 = "' "
                r0.append(r4)
                java.lang.String r4 = r3.getMessage()
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r2.<init>(r4)
                java.lang.StackTraceElement[] r4 = r3.getStackTrace()
                r2.setStackTrace(r4)
                java.lang.Throwable r3 = r3.getCause()
                r2.initCause(r3)
                return
        }

        @Override // java.lang.Throwable
        public java.lang.Throwable fillInStackTrace() {
                r0 = this;
                return r0
        }
    }

    static {
            java.lang.String r0 = "No answer found and NXDOMAIN response code returned"
            io.netty.resolver.dns.DnsResolveContext$DnsResolveContextException r0 = io.netty.resolver.dns.DnsResolveContext.DnsResolveContextException.newStatic(r0)
            java.lang.Class<io.netty.resolver.dns.DnsResolveContext> r1 = io.netty.resolver.dns.DnsResolveContext.class
            java.lang.String r2 = "onResponse(..)"
            java.lang.Throwable r0 = io.netty.util.internal.ThrowableUtil.unknownStackTrace(r0, r1, r2)
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
            io.netty.resolver.dns.DnsResolveContext.NXDOMAIN_QUERY_FAILED_EXCEPTION = r0
            java.lang.String r0 = "No matching CNAME record found"
            io.netty.resolver.dns.DnsResolveContext$DnsResolveContextException r0 = io.netty.resolver.dns.DnsResolveContext.DnsResolveContextException.newStatic(r0)
            java.lang.String r3 = "onResponseCNAME(..)"
            java.lang.Throwable r0 = io.netty.util.internal.ThrowableUtil.unknownStackTrace(r0, r1, r3)
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
            io.netty.resolver.dns.DnsResolveContext.CNAME_NOT_FOUND_QUERY_FAILED_EXCEPTION = r0
            java.lang.String r0 = "No matching record type found"
            io.netty.resolver.dns.DnsResolveContext$DnsResolveContextException r0 = io.netty.resolver.dns.DnsResolveContext.DnsResolveContextException.newStatic(r0)
            java.lang.String r3 = "onResponseAorAAAA(..)"
            java.lang.Throwable r0 = io.netty.util.internal.ThrowableUtil.unknownStackTrace(r0, r1, r3)
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
            io.netty.resolver.dns.DnsResolveContext.NO_MATCHING_RECORD_QUERY_FAILED_EXCEPTION = r0
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r3 = "Response type was unrecognized"
            r0.<init>(r3)
            java.lang.Throwable r0 = io.netty.util.internal.ThrowableUtil.unknownStackTrace(r0, r1, r2)
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
            io.netty.resolver.dns.DnsResolveContext.UNRECOGNIZED_TYPE_QUERY_FAILED_EXCEPTION = r0
            java.lang.String r0 = "No name servers returned an answer"
            io.netty.resolver.dns.DnsResolveContext$DnsResolveContextException r0 = io.netty.resolver.dns.DnsResolveContext.DnsResolveContextException.newStatic(r0)
            java.lang.String r2 = "tryToFinishResolve(..)"
            java.lang.Throwable r0 = io.netty.util.internal.ThrowableUtil.unknownStackTrace(r0, r1, r2)
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
            io.netty.resolver.dns.DnsResolveContext.NAME_SERVERS_EXHAUSTED_EXCEPTION = r0
            return
    }

    DnsResolveContext(io.netty.resolver.dns.DnsNameResolver r2, java.lang.String r3, int r4, io.netty.handler.codec.dns.DnsRecordType[] r5, io.netty.handler.codec.dns.DnsRecord[] r6, io.netty.resolver.dns.DnsServerAddressStream r7) {
            r1 = this;
            r1.<init>()
            java.util.IdentityHashMap r0 = new java.util.IdentityHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            r1.queriesInProgress = r0
            r1.parent = r2
            r1.hostname = r3
            r1.dnsClass = r4
            r1.expectedTypes = r5
            r1.additionals = r6
            java.lang.String r3 = "nameServerAddrs"
            java.lang.Object r3 = io.netty.util.internal.ObjectUtil.checkNotNull(r7, r3)
            io.netty.resolver.dns.DnsServerAddressStream r3 = (io.netty.resolver.dns.DnsServerAddressStream) r3
            r1.nameServerAddrs = r3
            int r2 = r2.maxQueriesPerResolve()
            r1.maxAllowedQueries = r2
            r1.allowedQueries = r2
            return
    }

    static /* synthetic */ java.lang.String access$000(io.netty.resolver.dns.DnsResolveContext r0) {
            java.lang.String r0 = r0.hostname
            return r0
    }

    static /* synthetic */ void access$100(io.netty.resolver.dns.DnsResolveContext r0, java.lang.String r1, io.netty.util.concurrent.Promise r2) {
            r0.internalResolve(r1, r2)
            return
    }

    static /* synthetic */ java.util.Set access$200(io.netty.resolver.dns.DnsResolveContext r0) {
            java.util.Set<io.netty.util.concurrent.Future<io.netty.channel.AddressedEnvelope<io.netty.handler.codec.dns.DnsResponse, java.net.InetSocketAddress>>> r0 = r0.queriesInProgress
            return r0
    }

    static /* synthetic */ int access$300(io.netty.resolver.dns.DnsResolveContext r0) {
            int r0 = r0.allowedQueries
            return r0
    }

    static /* synthetic */ void access$400(io.netty.resolver.dns.DnsResolveContext r0, io.netty.resolver.dns.DnsServerAddressStream r1, int r2, io.netty.handler.codec.dns.DnsQuestion r3, io.netty.channel.AddressedEnvelope r4, io.netty.resolver.dns.DnsQueryLifecycleObserver r5, io.netty.util.concurrent.Promise r6) {
            r0.onResponse(r1, r2, r3, r4, r5, r6)
            return
    }

    static /* synthetic */ io.netty.resolver.dns.DnsQueryLifecycleObserver access$500(io.netty.resolver.dns.DnsResolveContext r0, io.netty.handler.codec.dns.DnsQuestion r1) {
            io.netty.resolver.dns.DnsQueryLifecycleObserver r0 = r0.newDnsQueryLifecycleObserver(r1)
            return r0
    }

    static /* synthetic */ void access$600(io.netty.resolver.dns.DnsResolveContext r0, io.netty.resolver.dns.DnsServerAddressStream r1, int r2, io.netty.handler.codec.dns.DnsQuestion r3, io.netty.resolver.dns.DnsQueryLifecycleObserver r4, boolean r5, io.netty.util.concurrent.Promise r6, java.lang.Throwable r7) {
            r0.query(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    static /* synthetic */ void access$700(io.netty.resolver.dns.DnsResolveContext r0, io.netty.resolver.dns.DnsServerAddressStream r1, int r2, io.netty.handler.codec.dns.DnsQuestion r3, io.netty.resolver.dns.DnsQueryLifecycleObserver r4, io.netty.util.concurrent.Promise r5, java.lang.Throwable r6) {
            r0.tryToFinishResolve(r1, r2, r3, r4, r5, r6)
            return
    }

    private static java.util.Map<java.lang.String, java.lang.String> buildAliasMap(io.netty.handler.codec.dns.DnsResponse r12, io.netty.resolver.dns.DnsCnameCache r13, io.netty.channel.EventLoop r14) {
            io.netty.handler.codec.dns.DnsSection r0 = io.netty.handler.codec.dns.DnsSection.ANSWER
            int r0 = r12.count(r0)
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L68
            io.netty.handler.codec.dns.DnsSection r3 = io.netty.handler.codec.dns.DnsSection.ANSWER
            io.netty.handler.codec.dns.DnsRecord r3 = r12.recordAt(r3, r2)
            io.netty.handler.codec.dns.DnsRecordType r4 = r3.type()
            io.netty.handler.codec.dns.DnsRecordType r5 = io.netty.handler.codec.dns.DnsRecordType.CNAME
            if (r4 == r5) goto L19
            goto L2b
        L19:
            boolean r4 = r3 instanceof io.netty.handler.codec.dns.DnsRawRecord
            if (r4 != 0) goto L1e
            goto L2b
        L1e:
            r4 = r3
            io.netty.buffer.ByteBufHolder r4 = (io.netty.buffer.ByteBufHolder) r4
            io.netty.buffer.ByteBuf r4 = r4.content()
            java.lang.String r4 = decodeDomainName(r4)
            if (r4 != 0) goto L2e
        L2b:
            r6 = r13
            r11 = r14
            goto L63
        L2e:
            if (r1 != 0) goto L3b
            java.util.HashMap r1 = new java.util.HashMap
            r5 = 8
            int r5 = java.lang.Math.min(r5, r0)
            r1.<init>(r5)
        L3b:
            java.lang.String r5 = r3.name()
            java.util.Locale r6 = java.util.Locale.US
            java.lang.String r5 = r5.toLowerCase(r6)
            java.lang.String r4 = r4.toLowerCase(r6)
            java.lang.String r7 = hostnameWithDot(r5)
            java.lang.String r8 = hostnameWithDot(r4)
            boolean r6 = r7.equalsIgnoreCase(r8)
            if (r6 != 0) goto L2b
            long r9 = r3.timeToLive()
            r6 = r13
            r11 = r14
            r6.cache(r7, r8, r9, r11)
            r1.put(r5, r4)
        L63:
            int r2 = r2 + 1
            r13 = r6
            r14 = r11
            goto L8
        L68:
            if (r1 == 0) goto L6b
            return r1
        L6b:
            java.util.Map r12 = java.util.Collections.EMPTY_MAP
            return r12
    }

    static java.lang.String decodeDomainName(io.netty.buffer.ByteBuf r1) {
            r1.markReaderIndex()
            java.lang.String r0 = io.netty.handler.codec.dns.DefaultDnsRecordDecoder.decodeName(r1)     // Catch: java.lang.Throwable -> Lb io.netty.handler.codec.CorruptedFrameException -> L10
            r1.resetReaderIndex()
            return r0
        Lb:
            r0 = move-exception
            r1.resetReaderIndex()
            throw r0
        L10:
            r1.resetReaderIndex()
            r1 = 0
            return r1
    }

    private static io.netty.resolver.dns.DnsResolveContext.AuthoritativeNameServerList extractAuthoritativeNameServers(java.lang.String r4, io.netty.handler.codec.dns.DnsResponse r5) {
            io.netty.handler.codec.dns.DnsSection r0 = io.netty.handler.codec.dns.DnsSection.AUTHORITY
            int r0 = r5.count(r0)
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            io.netty.resolver.dns.DnsResolveContext$AuthoritativeNameServerList r2 = new io.netty.resolver.dns.DnsResolveContext$AuthoritativeNameServerList
            r2.<init>(r4)
            r4 = 0
        L10:
            if (r4 >= r0) goto L1e
            io.netty.handler.codec.dns.DnsSection r3 = io.netty.handler.codec.dns.DnsSection.AUTHORITY
            io.netty.handler.codec.dns.DnsRecord r3 = r5.recordAt(r3, r4)
            r2.add(r3)
            int r4 = r4 + 1
            goto L10
        L1e:
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L25
            return r1
        L25:
            return r2
    }

    private void finishResolve(io.netty.util.concurrent.Promise<java.util.List<T>> r4, java.lang.Throwable r5) {
            r3 = this;
            boolean r0 = r3.completeEarly
            if (r0 != 0) goto L26
            java.util.Set<io.netty.util.concurrent.Future<io.netty.channel.AddressedEnvelope<io.netty.handler.codec.dns.DnsResponse, java.net.InetSocketAddress>>> r0 = r3.queriesInProgress
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L26
            java.util.Set<io.netty.util.concurrent.Future<io.netty.channel.AddressedEnvelope<io.netty.handler.codec.dns.DnsResponse, java.net.InetSocketAddress>>> r0 = r3.queriesInProgress
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            io.netty.util.concurrent.Future r1 = (io.netty.util.concurrent.Future) r1
            r0.remove()
            r2 = 0
            r1.cancel(r2)
            goto L12
        L26:
            java.util.List<T> r0 = r3.finalResult
            if (r0 == 0) goto L3a
            boolean r5 = r4.isDone()
            if (r5 != 0) goto L39
            java.util.List<T> r5 = r3.finalResult
            java.util.List r5 = r3.filterResults(r5)
            io.netty.resolver.dns.DnsNameResolver.trySuccess(r4, r5)
        L39:
            return
        L3a:
            int r0 = r3.maxAllowedQueries
            int r1 = r3.allowedQueries
            int r0 = r0 - r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 64
            r1.<init>(r2)
            java.lang.String r2 = "failed to resolve '"
            r1.append(r2)
            java.lang.String r2 = r3.hostname
            r1.append(r2)
            r2 = 39
            r1.append(r2)
            r2 = 1
            if (r0 <= r2) goto L79
            int r2 = r3.maxAllowedQueries
            if (r0 >= r2) goto L6a
            java.lang.String r2 = " after "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = " queries "
            r1.append(r0)
            goto L79
        L6a:
            java.lang.String r0 = ". Exceeded max queries per resolve "
            r1.append(r0)
            int r0 = r3.maxAllowedQueries
            r1.append(r0)
            r0 = 32
            r1.append(r0)
        L79:
            java.net.UnknownHostException r0 = new java.net.UnknownHostException
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            if (r5 != 0) goto L8c
            java.lang.String r5 = r3.hostname
            io.netty.handler.codec.dns.DnsRecord[] r1 = r3.additionals
            r3.cache(r5, r1, r0)
            goto L8f
        L8c:
            r0.initCause(r5)
        L8f:
            r4.tryFailure(r0)
            return
    }

    private void followCname(io.netty.handler.codec.dns.DnsQuestion r12, java.lang.String r13, io.netty.resolver.dns.DnsQueryLifecycleObserver r14, io.netty.util.concurrent.Promise<java.util.List<T>> r15) {
            r11 = this;
            r0 = 0
        L1:
            io.netty.resolver.dns.DnsCnameCache r1 = r11.cnameCache()
            java.lang.String r2 = hostnameWithDot(r13)
            java.lang.String r1 = r1.get(r2)
            if (r1 != 0) goto L10
            goto L1e
        L10:
            if (r0 != 0) goto L18
            java.util.HashSet r0 = new java.util.HashSet
            r2 = 2
            r0.<init>(r2)
        L18:
            boolean r2 = r0.add(r13)
            if (r2 != 0) goto L43
        L1e:
            io.netty.resolver.dns.DnsServerAddressStream r4 = r11.getNameServers(r13)
            io.netty.handler.codec.dns.DefaultDnsQuestion r6 = new io.netty.handler.codec.dns.DefaultDnsQuestion     // Catch: java.lang.Throwable -> L3a
            io.netty.handler.codec.dns.DnsRecordType r12 = r12.type()     // Catch: java.lang.Throwable -> L3a
            int r0 = r11.dnsClass     // Catch: java.lang.Throwable -> L3a
            r6.<init>(r13, r12, r0)     // Catch: java.lang.Throwable -> L3a
            io.netty.resolver.dns.DnsQueryLifecycleObserver r7 = r14.queryCNAMEd(r6)
            r8 = 1
            r10 = 0
            r5 = 0
            r3 = r11
            r9 = r15
            r3.query(r4, r5, r6, r7, r8, r9, r10)
            return
        L3a:
            r0 = move-exception
            r12 = r0
            r14.queryFailed(r12)
            io.netty.util.internal.PlatformDependent.throwException(r12)
            return
        L43:
            r13 = r1
            goto L1
    }

    private io.netty.resolver.dns.DnsServerAddressStream getNameServers(java.lang.String r1) {
            r0 = this;
            io.netty.resolver.dns.DnsServerAddressStream r1 = r0.getNameServersFromCache(r1)
            if (r1 != 0) goto Lc
            io.netty.resolver.dns.DnsServerAddressStream r1 = r0.nameServerAddrs
            io.netty.resolver.dns.DnsServerAddressStream r1 = r1.duplicate()
        Lc:
            return r1
    }

    private io.netty.resolver.dns.DnsServerAddressStream getNameServersFromCache(java.lang.String r5) {
            r4 = this;
            int r0 = r5.length()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = r0 + (-1)
            char r0 = r5.charAt(r0)
            r2 = 46
            if (r0 == r2) goto L23
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r5 = "."
            r0.append(r5)
            java.lang.String r5 = r0.toString()
        L23:
            int r0 = r5.indexOf(r2)
            int r3 = r5.length()
            int r3 = r3 + (-1)
            if (r0 != r3) goto L30
            return r1
        L30:
            int r0 = r0 + 1
            java.lang.String r5 = r5.substring(r0)
            int r0 = r5.indexOf(r2)
            if (r0 <= 0) goto L50
            int r3 = r5.length()
            int r3 = r3 + (-1)
            if (r0 != r3) goto L45
            goto L50
        L45:
            io.netty.resolver.dns.AuthoritativeDnsServerCache r3 = r4.authoritativeDnsServerCache()
            io.netty.resolver.dns.DnsServerAddressStream r3 = r3.get(r5)
            if (r3 == 0) goto L30
            return r3
        L50:
            return r1
    }

    private boolean handleRedirect(io.netty.handler.codec.dns.DnsQuestion r12, io.netty.channel.AddressedEnvelope<io.netty.handler.codec.dns.DnsResponse, java.net.InetSocketAddress> r13, io.netty.resolver.dns.DnsQueryLifecycleObserver r14, io.netty.util.concurrent.Promise<java.util.List<T>> r15) {
            r11 = this;
            java.lang.Object r13 = r13.content()
            io.netty.handler.codec.dns.DnsResponse r13 = (io.netty.handler.codec.dns.DnsResponse) r13
            io.netty.handler.codec.dns.DnsSection r0 = io.netty.handler.codec.dns.DnsSection.ANSWER
            int r0 = r13.count(r0)
            r1 = 0
            if (r0 != 0) goto L82
            java.lang.String r0 = r12.name()
            io.netty.resolver.dns.DnsResolveContext$AuthoritativeNameServerList r0 = extractAuthoritativeNameServers(r0, r13)
            if (r0 == 0) goto L82
            io.netty.handler.codec.dns.DnsSection r2 = io.netty.handler.codec.dns.DnsSection.ADDITIONAL
            int r2 = r13.count(r2)
            io.netty.resolver.dns.AuthoritativeDnsServerCache r3 = r11.authoritativeDnsServerCache()
            r4 = 0
        L24:
            if (r4 >= r2) goto L55
            io.netty.handler.codec.dns.DnsSection r5 = io.netty.handler.codec.dns.DnsSection.ADDITIONAL
            io.netty.handler.codec.dns.DnsRecord r5 = r13.recordAt(r5, r4)
            io.netty.handler.codec.dns.DnsRecordType r6 = r5.type()
            io.netty.handler.codec.dns.DnsRecordType r7 = io.netty.handler.codec.dns.DnsRecordType.A
            if (r6 != r7) goto L3c
            io.netty.resolver.dns.DnsNameResolver r6 = r11.parent
            boolean r6 = r6.supportsARecords()
            if (r6 == 0) goto L52
        L3c:
            io.netty.handler.codec.dns.DnsRecordType r6 = r5.type()
            io.netty.handler.codec.dns.DnsRecordType r7 = io.netty.handler.codec.dns.DnsRecordType.AAAA
            if (r6 != r7) goto L4d
            io.netty.resolver.dns.DnsNameResolver r6 = r11.parent
            boolean r6 = r6.supportsAAAARecords()
            if (r6 != 0) goto L4d
            goto L52
        L4d:
            io.netty.resolver.dns.DnsNameResolver r6 = r11.parent
            r0.handleWithAdditional(r6, r5, r3)
        L52:
            int r4 = r4 + 1
            goto L24
        L55:
            io.netty.resolver.dns.DnsNameResolver r13 = r11.parent
            io.netty.resolver.dns.DnsCache r2 = r11.resolveCache()
            r0.handleWithoutAdditionals(r13, r2, r3)
            java.util.List r13 = r0.addressList()
            io.netty.resolver.dns.DnsNameResolver r0 = r11.parent
            java.lang.String r2 = r12.name()
            io.netty.resolver.dns.DnsServerAddressStream r4 = r0.newRedirectDnsServerStream(r2, r13)
            if (r4 == 0) goto L82
            io.netty.resolver.dns.DnsResolveContext$DnsAddressStreamList r13 = new io.netty.resolver.dns.DnsResolveContext$DnsAddressStreamList
            r13.<init>(r4)
            io.netty.resolver.dns.DnsQueryLifecycleObserver r7 = r14.queryRedirected(r13)
            r8 = 1
            r10 = 0
            r5 = 0
            r3 = r11
            r6 = r12
            r9 = r15
            r3.query(r4, r5, r6, r7, r8, r9, r10)
            r12 = 1
            return r12
        L82:
            return r1
    }

    private boolean hasNDots() {
            r6 = this;
            java.lang.String r0 = r6.hostname
            int r0 = r0.length()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r3 = 0
        La:
            if (r0 < 0) goto L24
            java.lang.String r4 = r6.hostname
            char r4 = r4.charAt(r0)
            r5 = 46
            if (r4 != r5) goto L21
            int r3 = r3 + 1
            io.netty.resolver.dns.DnsNameResolver r4 = r6.parent
            int r4 = r4.ndots()
            if (r3 < r4) goto L21
            return r1
        L21:
            int r0 = r0 + (-1)
            goto La
        L24:
            return r2
    }

    private static java.lang.String hostnameWithDot(java.lang.String r2) {
            r0 = 46
            boolean r1 = io.netty.util.internal.StringUtil.endsWith(r2, r0)
            if (r1 == 0) goto L9
            return r2
        L9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r0)
            java.lang.String r2 = r1.toString()
            return r2
    }

    private void internalResolve(java.lang.String r9, io.netty.util.concurrent.Promise<java.util.List<T>> r10) {
            r8 = this;
        L0:
            r2 = r9
            io.netty.resolver.dns.DnsCnameCache r9 = r8.cnameCache()
            java.lang.String r0 = hostnameWithDot(r2)
            java.lang.String r9 = r9.get(r0)
            if (r9 != 0) goto L4f
            io.netty.resolver.dns.DnsServerAddressStream r9 = r8.getNameServers(r2)     // Catch: java.lang.Throwable -> L3a
            io.netty.handler.codec.dns.DnsRecordType[] r0 = r8.expectedTypes     // Catch: java.lang.Throwable -> L3a
            int r0 = r0.length     // Catch: java.lang.Throwable -> L3a
            int r0 = r0 + (-1)
            r1 = 0
            r7 = 0
        L1a:
            if (r7 >= r0) goto L3d
            io.netty.handler.codec.dns.DnsRecordType[] r1 = r8.expectedTypes     // Catch: java.lang.Throwable -> L3a
            r3 = r1[r7]     // Catch: java.lang.Throwable -> L3a
            io.netty.resolver.dns.DnsServerAddressStream r4 = r9.duplicate()     // Catch: java.lang.Throwable -> L3a
            r5 = 0
            r1 = r8
            r6 = r10
            boolean r10 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L37
            if (r10 != 0) goto L33
        L2d:
            io.netty.resolver.dns.DnsNameResolver r9 = r1.parent
            r9.flushQueries()
            return
        L33:
            int r7 = r7 + 1
            r10 = r6
            goto L1a
        L37:
            r0 = move-exception
        L38:
            r9 = r0
            goto L49
        L3a:
            r0 = move-exception
            r1 = r8
            goto L38
        L3d:
            r1 = r8
            r6 = r10
            io.netty.handler.codec.dns.DnsRecordType[] r10 = r1.expectedTypes     // Catch: java.lang.Throwable -> L37
            r3 = r10[r0]     // Catch: java.lang.Throwable -> L37
            r5 = 0
            r4 = r9
            r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L37
            goto L2d
        L49:
            io.netty.resolver.dns.DnsNameResolver r10 = r1.parent
            r10.flushQueries()
            throw r9
        L4f:
            r1 = r8
            goto L0
    }

    private io.netty.resolver.dns.DnsQueryLifecycleObserver newDnsQueryLifecycleObserver(io.netty.handler.codec.dns.DnsQuestion r2) {
            r1 = this;
            io.netty.resolver.dns.DnsNameResolver r0 = r1.parent
            io.netty.resolver.dns.DnsQueryLifecycleObserverFactory r0 = r0.dnsQueryLifecycleObserverFactory()
            io.netty.resolver.dns.DnsQueryLifecycleObserver r2 = r0.newDnsQueryLifecycleObserver(r2)
            return r2
    }

    private void onExpectedResponse(io.netty.handler.codec.dns.DnsQuestion r15, io.netty.channel.AddressedEnvelope<io.netty.handler.codec.dns.DnsResponse, java.net.InetSocketAddress> r16, io.netty.resolver.dns.DnsQueryLifecycleObserver r17, io.netty.util.concurrent.Promise<java.util.List<T>> r18) {
            r14 = this;
            java.lang.Object r0 = r16.content()
            io.netty.handler.codec.dns.DnsResponse r0 = (io.netty.handler.codec.dns.DnsResponse) r0
            io.netty.resolver.dns.DnsCnameCache r1 = r14.cnameCache()
            io.netty.resolver.dns.DnsNameResolver r2 = r14.parent
            io.netty.channel.EventLoop r2 = r2.executor()
            java.util.Map r1 = buildAliasMap(r0, r1, r2)
            io.netty.handler.codec.dns.DnsSection r2 = io.netty.handler.codec.dns.DnsSection.ANSWER
            int r2 = r0.count(r2)
            boolean r3 = r14.completeEarly
            r4 = 0
            r5 = 0
            r6 = 0
        L1f:
            r7 = 1
            if (r5 >= r2) goto Lba
            io.netty.handler.codec.dns.DnsSection r8 = io.netty.handler.codec.dns.DnsSection.ANSWER
            io.netty.handler.codec.dns.DnsRecord r8 = r0.recordAt(r8, r5)
            io.netty.handler.codec.dns.DnsRecordType r9 = r8.type()
            io.netty.handler.codec.dns.DnsRecordType[] r10 = r14.expectedTypes
            int r11 = r10.length
            r12 = 0
        L30:
            if (r12 >= r11) goto Lb6
            r13 = r10[r12]
            if (r9 != r13) goto Lb2
            java.lang.String r9 = r15.name()
            java.util.Locale r10 = java.util.Locale.US
            java.lang.String r9 = r9.toLowerCase(r10)
            java.lang.String r11 = r8.name()
            java.lang.String r10 = r11.toLowerCase(r10)
            boolean r11 = r10.equals(r9)
            if (r11 != 0) goto L65
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>(r1)
        L53:
            java.lang.Object r9 = r11.remove(r9)
            java.lang.String r9 = (java.lang.String) r9
            boolean r12 = r10.equals(r9)
            if (r12 == 0) goto L60
            goto L62
        L60:
            if (r9 != 0) goto L53
        L62:
            if (r9 != 0) goto L65
            goto Lb6
        L65:
            java.lang.String r9 = r14.hostname
            io.netty.handler.codec.dns.DnsRecord[] r10 = r14.additionals
            io.netty.resolver.dns.DnsNameResolver r11 = r14.parent
            io.netty.channel.EventLoop r11 = r11.executor()
            java.lang.Object r9 = r14.convertRecord(r8, r9, r10, r11)
            if (r9 != 0) goto L76
            goto Lb6
        L76:
            if (r3 != 0) goto L7c
            boolean r3 = r14.isCompleteEarly(r9)
        L7c:
            java.util.List<T> r6 = r14.finalResult
            if (r6 != 0) goto L8d
            java.util.ArrayList r6 = new java.util.ArrayList
            r10 = 8
            r6.<init>(r10)
            r14.finalResult = r6
            r6.add(r9)
            goto La3
        L8d:
            boolean r6 = r14.isDuplicateAllowed()
            if (r6 != 0) goto L9e
            java.util.List<T> r6 = r14.finalResult
            boolean r6 = r6.contains(r9)
            if (r6 != 0) goto L9c
            goto L9e
        L9c:
            r6 = 1
            goto La4
        L9e:
            java.util.List<T> r6 = r14.finalResult
            r6.add(r9)
        La3:
            r6 = 0
        La4:
            java.lang.String r10 = r14.hostname
            io.netty.handler.codec.dns.DnsRecord[] r11 = r14.additionals
            r14.cache(r10, r11, r8, r9)
            if (r6 == 0) goto Lb0
            io.netty.util.ReferenceCountUtil.release(r9)
        Lb0:
            r6 = 1
            goto Lb6
        Lb2:
            int r12 = r12 + 1
            goto L30
        Lb6:
            int r5 = r5 + 1
            goto L1f
        Lba:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Ld2
            if (r6 == 0) goto Lca
            if (r3 == 0) goto Lc6
            r14.completeEarly = r7
        Lc6:
            r17.querySucceed()
            return
        Lca:
            java.lang.RuntimeException r15 = io.netty.resolver.dns.DnsResolveContext.NO_MATCHING_RECORD_QUERY_FAILED_EXCEPTION
            r0 = r17
            r0.queryFailed(r15)
            return
        Ld2:
            r0 = r17
            r0.querySucceed()
            io.netty.resolver.dns.DnsQueryLifecycleObserver r0 = r14.newDnsQueryLifecycleObserver(r15)
            r2 = r18
            r14.onResponseCNAME(r15, r1, r0, r2)
            return
    }

    private void onResponse(io.netty.resolver.dns.DnsServerAddressStream r10, int r11, io.netty.handler.codec.dns.DnsQuestion r12, io.netty.channel.AddressedEnvelope<io.netty.handler.codec.dns.DnsResponse, java.net.InetSocketAddress> r13, io.netty.resolver.dns.DnsQueryLifecycleObserver r14, io.netty.util.concurrent.Promise<java.util.List<T>> r15) {
            r9 = this;
            r7 = r15
            java.lang.Object r2 = r13.content()     // Catch: java.lang.Throwable -> L3c
            io.netty.handler.codec.dns.DnsResponse r2 = (io.netty.handler.codec.dns.DnsResponse) r2     // Catch: java.lang.Throwable -> L3c
            io.netty.handler.codec.dns.DnsResponseCode r3 = r2.code()     // Catch: java.lang.Throwable -> L3c
            io.netty.handler.codec.dns.DnsResponseCode r5 = io.netty.handler.codec.dns.DnsResponseCode.NOERROR     // Catch: java.lang.Throwable -> L3c
            if (r3 != r5) goto L5b
            boolean r2 = r9.handleRedirect(r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L19
            io.netty.util.ReferenceCountUtil.safeRelease(r13)
            return
        L19:
            io.netty.handler.codec.dns.DnsRecordType r2 = r12.type()     // Catch: java.lang.Throwable -> L3c
            io.netty.handler.codec.dns.DnsRecordType r3 = io.netty.handler.codec.dns.DnsRecordType.CNAME     // Catch: java.lang.Throwable -> L3c
            if (r2 != r3) goto L3e
            java.lang.Object r2 = r13.content()     // Catch: java.lang.Throwable -> L3c
            io.netty.handler.codec.dns.DnsResponse r2 = (io.netty.handler.codec.dns.DnsResponse) r2     // Catch: java.lang.Throwable -> L3c
            io.netty.resolver.dns.DnsCnameCache r3 = r9.cnameCache()     // Catch: java.lang.Throwable -> L3c
            io.netty.resolver.dns.DnsNameResolver r5 = r9.parent     // Catch: java.lang.Throwable -> L3c
            io.netty.channel.EventLoop r5 = r5.executor()     // Catch: java.lang.Throwable -> L3c
            java.util.Map r2 = buildAliasMap(r2, r3, r5)     // Catch: java.lang.Throwable -> L3c
            r9.onResponseCNAME(r12, r2, r14, r15)     // Catch: java.lang.Throwable -> L3c
            io.netty.util.ReferenceCountUtil.safeRelease(r13)
            return
        L3c:
            r0 = move-exception
            goto L8d
        L3e:
            io.netty.handler.codec.dns.DnsRecordType[] r3 = r9.expectedTypes     // Catch: java.lang.Throwable -> L3c
            int r5 = r3.length     // Catch: java.lang.Throwable -> L3c
            r6 = 0
        L42:
            if (r6 >= r5) goto L52
            r8 = r3[r6]     // Catch: java.lang.Throwable -> L3c
            if (r2 != r8) goto L4f
            r9.onExpectedResponse(r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L3c
            io.netty.util.ReferenceCountUtil.safeRelease(r13)
            return
        L4f:
            int r6 = r6 + 1
            goto L42
        L52:
            java.lang.RuntimeException r2 = io.netty.resolver.dns.DnsResolveContext.UNRECOGNIZED_TYPE_QUERY_FAILED_EXCEPTION     // Catch: java.lang.Throwable -> L3c
            r14.queryFailed(r2)     // Catch: java.lang.Throwable -> L3c
            io.netty.util.ReferenceCountUtil.safeRelease(r13)
            return
        L5b:
            io.netty.handler.codec.dns.DnsResponseCode r5 = io.netty.handler.codec.dns.DnsResponseCode.NXDOMAIN     // Catch: java.lang.Throwable -> L3c
            if (r3 == r5) goto L6f
            int r2 = r11 + 1
            io.netty.resolver.dns.DnsQueryLifecycleObserver r5 = r14.queryNoAnswer(r3)     // Catch: java.lang.Throwable -> L3c
            r6 = 1
            r8 = 0
            r1 = r9
            r4 = r12
            r3 = r2
            r2 = r10
            r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L3c
            goto L89
        L6f:
            java.lang.RuntimeException r3 = io.netty.resolver.dns.DnsResolveContext.NXDOMAIN_QUERY_FAILED_EXCEPTION     // Catch: java.lang.Throwable -> L3c
            r14.queryFailed(r3)     // Catch: java.lang.Throwable -> L3c
            boolean r0 = r2.isAuthoritativeAnswer()     // Catch: java.lang.Throwable -> L3c
            if (r0 != 0) goto L89
            int r3 = r11 + 1
            io.netty.resolver.dns.DnsQueryLifecycleObserver r5 = r9.newDnsQueryLifecycleObserver(r12)     // Catch: java.lang.Throwable -> L3c
            r6 = 1
            r8 = 0
            r1 = r9
            r2 = r10
            r4 = r12
            r7 = r15
            r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L3c
        L89:
            io.netty.util.ReferenceCountUtil.safeRelease(r13)
            return
        L8d:
            io.netty.util.ReferenceCountUtil.safeRelease(r13)
            throw r0
    }

    private void onResponseCNAME(io.netty.handler.codec.dns.DnsQuestion r4, java.util.Map<java.lang.String, java.lang.String> r5, io.netty.resolver.dns.DnsQueryLifecycleObserver r6, io.netty.util.concurrent.Promise<java.util.List<T>> r7) {
            r3 = this;
            java.lang.String r0 = r4.name()
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r0 = r0.toLowerCase(r1)
            r1 = 0
        Lb:
            boolean r2 = r5.isEmpty()
            if (r2 != 0) goto L1c
            java.lang.Object r2 = r5.remove(r0)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L1c
            r1 = 1
            r0 = r2
            goto Lb
        L1c:
            if (r1 == 0) goto L22
            r3.followCname(r4, r0, r6, r7)
            return
        L22:
            java.lang.RuntimeException r4 = io.netty.resolver.dns.DnsResolveContext.CNAME_NOT_FOUND_QUERY_FAILED_EXCEPTION
            r6.queryFailed(r4)
            return
    }

    private void query(io.netty.resolver.dns.DnsServerAddressStream r10, int r11, io.netty.handler.codec.dns.DnsQuestion r12, io.netty.resolver.dns.DnsQueryLifecycleObserver r13, boolean r14, io.netty.util.concurrent.Promise<java.util.List<T>> r15, java.lang.Throwable r16) {
            r9 = this;
            boolean r1 = r9.completeEarly
            if (r1 != 0) goto L14
            int r1 = r10.size()
            if (r11 >= r1) goto L14
            int r1 = r9.allowedQueries
            if (r1 == 0) goto L14
            boolean r1 = r15.isCancelled()
            if (r1 == 0) goto L1d
        L14:
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r15
            r6 = r16
            goto L6f
        L1d:
            int r1 = r9.allowedQueries
            int r1 = r1 + (-1)
            r9.allowedQueries = r1
            java.net.InetSocketAddress r1 = r10.next()
            boolean r3 = r1.isUnresolved()
            if (r3 == 0) goto L39
            r0 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r15
            r7 = r16
            r0.queryUnresolvedNameserver(r1, r2, r3, r4, r5, r6, r7)
            return
        L39:
            io.netty.resolver.dns.DnsNameResolver r2 = r9.parent
            io.netty.channel.Channel r2 = r2.ch
            io.netty.channel.ChannelPromise r7 = r2.newPromise()
            io.netty.resolver.dns.DnsNameResolver r2 = r9.parent
            io.netty.channel.Channel r2 = r2.ch
            io.netty.channel.EventLoop r2 = r2.eventLoop()
            io.netty.util.concurrent.Promise r8 = r2.newPromise()
            io.netty.resolver.dns.DnsNameResolver r2 = r9.parent
            io.netty.handler.codec.dns.DnsRecord[] r5 = r9.additionals
            r4 = r12
            r6 = r14
            r3 = r1
            io.netty.util.concurrent.Future r8 = r2.query0(r3, r4, r5, r6, r7, r8)
            java.util.Set<io.netty.util.concurrent.Future<io.netty.channel.AddressedEnvelope<io.netty.handler.codec.dns.DnsResponse, java.net.InetSocketAddress>>> r2 = r9.queriesInProgress
            r2.add(r8)
            r13.queryWritten(r1, r7)
            io.netty.resolver.dns.DnsResolveContext$2 r0 = new io.netty.resolver.dns.DnsResolveContext$2
            r1 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r3 = r13
            r2 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.addListener(r0)
            return
        L6f:
            r0.tryToFinishResolve(r1, r2, r3, r4, r5, r6)
            return
    }

    private boolean query(java.lang.String r10, io.netty.handler.codec.dns.DnsRecordType r11, io.netty.resolver.dns.DnsServerAddressStream r12, boolean r13, io.netty.util.concurrent.Promise<java.util.List<T>> r14) {
            r9 = this;
            io.netty.handler.codec.dns.DefaultDnsQuestion r4 = new io.netty.handler.codec.dns.DefaultDnsQuestion     // Catch: java.lang.Throwable -> L16
            int r0 = r9.dnsClass     // Catch: java.lang.Throwable -> L16
            r4.<init>(r10, r11, r0)     // Catch: java.lang.Throwable -> L16
            io.netty.resolver.dns.DnsQueryLifecycleObserver r5 = r9.newDnsQueryLifecycleObserver(r4)
            r8 = 0
            r3 = 0
            r1 = r9
            r2 = r12
            r6 = r13
            r7 = r14
            r1.query(r2, r3, r4, r5, r6, r7, r8)
            r10 = 1
            return r10
        L16:
            r0 = move-exception
            r7 = r14
            r12 = r0
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "Unable to create DNS Question for: ["
            r14.append(r0)
            r14.append(r10)
            java.lang.String r10 = ", "
            r14.append(r10)
            r14.append(r11)
            r10 = 93
            r14.append(r10)
            java.lang.String r10 = r14.toString()
            r13.<init>(r10, r12)
            r7.tryFailure(r13)
            r10 = 0
            return r10
    }

    private void queryUnresolvedNameserver(java.net.InetSocketAddress r13, io.netty.resolver.dns.DnsServerAddressStream r14, int r15, io.netty.handler.codec.dns.DnsQuestion r16, io.netty.resolver.dns.DnsQueryLifecycleObserver r17, io.netty.util.concurrent.Promise<java.util.List<T>> r18, java.lang.Throwable r19) {
            r12 = this;
            int r0 = io.netty.util.internal.PlatformDependent.javaVersion()
            r2 = 7
            if (r0 < r2) goto Ld
            java.lang.String r0 = r13.getHostString()
        Lb:
            r10 = r0
            goto L12
        Ld:
            java.lang.String r0 = r13.getHostName()
            goto Lb
        L12:
            io.netty.resolver.dns.DnsNameResolver r0 = r12.parent
            io.netty.channel.EventLoop r0 = r0.executor()
            r2 = 0
            io.netty.util.concurrent.Future r2 = r0.newSucceededFuture(r2)
            java.util.Set<io.netty.util.concurrent.Future<io.netty.channel.AddressedEnvelope<io.netty.handler.codec.dns.DnsResponse, java.net.InetSocketAddress>>> r0 = r12.queriesInProgress
            r0.add(r2)
            io.netty.resolver.dns.DnsNameResolver r0 = r12.parent
            io.netty.channel.EventLoop r0 = r0.executor()
            io.netty.util.concurrent.Promise r11 = r0.newPromise()
            io.netty.resolver.dns.DnsResolveContext$3 r0 = new io.netty.resolver.dns.DnsResolveContext$3
            r1 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = r0
            r11.addListener(r1)
            io.netty.handler.codec.dns.DnsRecord[] r1 = r12.additionals
            io.netty.resolver.dns.DnsCache r2 = r12.resolveCache()
            io.netty.resolver.dns.DnsNameResolver r3 = r12.parent
            io.netty.channel.socket.InternetProtocolFamily[] r3 = r3.resolvedInternetProtocolFamiliesUnsafe()
            boolean r1 = io.netty.resolver.dns.DnsNameResolver.doResolveAllCached(r10, r1, r11, r2, r3)
            if (r1 != 0) goto L74
            io.netty.resolver.dns.AuthoritativeDnsServerCache r1 = r12.authoritativeDnsServerCache()
            io.netty.resolver.dns.DnsAddressResolveContext r2 = new io.netty.resolver.dns.DnsAddressResolveContext
            r3 = r2
            io.netty.resolver.dns.DnsNameResolver r2 = r12.parent
            io.netty.handler.codec.dns.DnsRecord[] r4 = r12.additionals
            io.netty.resolver.dns.DnsServerAddressStream r5 = r2.newNameServerAddressStream(r10)
            io.netty.resolver.dns.DnsCache r6 = r12.resolveCache()
            io.netty.resolver.dns.DnsResolveContext$4 r7 = new io.netty.resolver.dns.DnsResolveContext$4
            r7.<init>(r12, r1)
            r8 = 0
            r1 = r3
            r3 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r1.resolve(r11)
        L74:
            return
    }

    private void tryToFinishResolve(io.netty.resolver.dns.DnsServerAddressStream r9, int r10, io.netty.handler.codec.dns.DnsQuestion r11, io.netty.resolver.dns.DnsQueryLifecycleObserver r12, io.netty.util.concurrent.Promise<java.util.List<T>> r13, java.lang.Throwable r14) {
            r8 = this;
            boolean r2 = r8.completeEarly
            if (r2 != 0) goto L12
            java.util.Set<io.netty.util.concurrent.Future<io.netty.channel.AddressedEnvelope<io.netty.handler.codec.dns.DnsResponse, java.net.InetSocketAddress>>> r2 = r8.queriesInProgress
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L12
            int r1 = r8.allowedQueries
            r12.queryCancelled(r1)
            return
        L12:
            java.util.List<T> r2 = r8.finalResult
            if (r2 != 0) goto L5a
            int r2 = r9.size()
            r3 = 1
            if (r10 >= r2) goto L3e
            io.netty.resolver.dns.NoopDnsQueryLifecycleObserver r2 = io.netty.resolver.dns.NoopDnsQueryLifecycleObserver.INSTANCE
            if (r12 != r2) goto L31
            int r2 = r10 + 1
            io.netty.resolver.dns.DnsQueryLifecycleObserver r4 = r8.newDnsQueryLifecycleObserver(r11)
            r5 = 1
            r0 = r8
            r1 = r9
            r3 = r11
            r6 = r13
            r7 = r14
            r0.query(r1, r2, r3, r4, r5, r6, r7)
            return
        L31:
            int r2 = r10 + 1
            r5 = 1
            r0 = r8
            r1 = r9
            r3 = r11
            r4 = r12
            r6 = r13
            r7 = r14
            r0.query(r1, r2, r3, r4, r5, r6, r7)
            return
        L3e:
            java.lang.RuntimeException r1 = io.netty.resolver.dns.DnsResolveContext.NAME_SERVERS_EXHAUSTED_EXCEPTION
            r12.queryFailed(r1)
            if (r14 != 0) goto L5f
            boolean r1 = r8.triedCNAME
            if (r1 != 0) goto L5f
            r8.triedCNAME = r3
            java.lang.String r1 = r8.hostname
            io.netty.handler.codec.dns.DnsRecordType r2 = io.netty.handler.codec.dns.DnsRecordType.CNAME
            io.netty.resolver.dns.DnsServerAddressStream r3 = r8.getNameServers(r1)
            r4 = 1
            r0 = r8
            r5 = r13
            r0.query(r1, r2, r3, r4, r5)
            return
        L5a:
            int r1 = r8.allowedQueries
            r12.queryCancelled(r1)
        L5f:
            r8.finishResolve(r13, r14)
            return
    }

    io.netty.resolver.dns.AuthoritativeDnsServerCache authoritativeDnsServerCache() {
            r1 = this;
            io.netty.resolver.dns.DnsNameResolver r0 = r1.parent
            io.netty.resolver.dns.AuthoritativeDnsServerCache r0 = r0.authoritativeDnsServerCache()
            return r0
    }

    abstract void cache(java.lang.String r1, io.netty.handler.codec.dns.DnsRecord[] r2, io.netty.handler.codec.dns.DnsRecord r3, T r4);

    abstract void cache(java.lang.String r1, io.netty.handler.codec.dns.DnsRecord[] r2, java.net.UnknownHostException r3);

    io.netty.resolver.dns.DnsCnameCache cnameCache() {
            r1 = this;
            io.netty.resolver.dns.DnsNameResolver r0 = r1.parent
            io.netty.resolver.dns.DnsCnameCache r0 = r0.cnameCache()
            return r0
    }

    abstract T convertRecord(io.netty.handler.codec.dns.DnsRecord r1, java.lang.String r2, io.netty.handler.codec.dns.DnsRecord[] r3, io.netty.channel.EventLoop r4);

    void doSearchDomainQuery(java.lang.String r8, io.netty.util.concurrent.Promise<java.util.List<T>> r9) {
            r7 = this;
            io.netty.resolver.dns.DnsNameResolver r1 = r7.parent
            int r3 = r7.dnsClass
            io.netty.handler.codec.dns.DnsRecordType[] r4 = r7.expectedTypes
            io.netty.handler.codec.dns.DnsRecord[] r5 = r7.additionals
            io.netty.resolver.dns.DnsServerAddressStream r6 = r7.nameServerAddrs
            r0 = r7
            r2 = r8
            io.netty.resolver.dns.DnsResolveContext r8 = r0.newResolverContext(r1, r2, r3, r4, r5, r6)
            r8.internalResolve(r2, r9)
            return
    }

    abstract java.util.List<T> filterResults(java.util.List<T> r1);

    abstract boolean isCompleteEarly(T r1);

    abstract boolean isDuplicateAllowed();

    abstract io.netty.resolver.dns.DnsResolveContext<T> newResolverContext(io.netty.resolver.dns.DnsNameResolver r1, java.lang.String r2, int r3, io.netty.handler.codec.dns.DnsRecordType[] r4, io.netty.handler.codec.dns.DnsRecord[] r5, io.netty.resolver.dns.DnsServerAddressStream r6);

    void resolve(io.netty.util.concurrent.Promise<java.util.List<T>> r9) {
            r8 = this;
            io.netty.resolver.dns.DnsNameResolver r0 = r8.parent
            java.lang.String[] r5 = r0.searchDomains()
            int r0 = r5.length
            if (r0 == 0) goto L1b
            io.netty.resolver.dns.DnsNameResolver r0 = r8.parent
            int r0 = r0.ndots()
            if (r0 == 0) goto L1b
            java.lang.String r0 = r8.hostname
            r1 = 46
            boolean r0 = io.netty.util.internal.StringUtil.endsWith(r0, r1)
            if (r0 == 0) goto L1e
        L1b:
            r2 = r8
            r4 = r9
            goto L58
        L1e:
            boolean r6 = r8.hasNDots()
            if (r6 == 0) goto L27
            java.lang.String r0 = r8.hostname
            goto L3e
        L27:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r8.hostname
            r0.append(r2)
            r0.append(r1)
            r1 = 0
            r1 = r5[r1]
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L3e:
            r3 = r6 ^ 1
            io.netty.resolver.dns.DnsNameResolver r1 = r8.parent
            io.netty.channel.EventLoop r1 = r1.executor()
            io.netty.util.concurrent.Promise r7 = r1.newPromise()
            io.netty.resolver.dns.DnsResolveContext$1 r1 = new io.netty.resolver.dns.DnsResolveContext$1
            r2 = r8
            r4 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r7.addListener(r1)
            r8.doSearchDomainQuery(r0, r7)
            return
        L58:
            java.lang.String r9 = r2.hostname
            r8.internalResolve(r9, r4)
            return
    }

    io.netty.resolver.dns.DnsCache resolveCache() {
            r1 = this;
            io.netty.resolver.dns.DnsNameResolver r0 = r1.parent
            io.netty.resolver.dns.DnsCache r0 = r0.resolveCache()
            return r0
    }
}
