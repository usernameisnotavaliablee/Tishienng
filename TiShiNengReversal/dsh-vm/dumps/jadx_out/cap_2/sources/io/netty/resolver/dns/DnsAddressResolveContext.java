package io.netty.resolver.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class DnsAddressResolveContext extends io.netty.resolver.dns.DnsResolveContext<java.net.InetAddress> {
    private final io.netty.resolver.dns.AuthoritativeDnsServerCache authoritativeDnsServerCache;
    private final boolean completeEarlyIfPossible;
    private final io.netty.resolver.dns.DnsCache resolveCache;

    DnsAddressResolveContext(io.netty.resolver.dns.DnsNameResolver r8, java.lang.String r9, io.netty.handler.codec.dns.DnsRecord[] r10, io.netty.resolver.dns.DnsServerAddressStream r11, io.netty.resolver.dns.DnsCache r12, io.netty.resolver.dns.AuthoritativeDnsServerCache r13, boolean r14) {
            r7 = this;
            r3 = 1
            io.netty.handler.codec.dns.DnsRecordType[] r4 = r8.resolveRecordTypes()
            r0 = r7
            r1 = r8
            r2 = r9
            r5 = r10
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0.resolveCache = r12
            r0.authoritativeDnsServerCache = r13
            r0.completeEarlyIfPossible = r14
            return
    }

    @Override // io.netty.resolver.dns.DnsResolveContext
    io.netty.resolver.dns.AuthoritativeDnsServerCache authoritativeDnsServerCache() {
            r1 = this;
            io.netty.resolver.dns.AuthoritativeDnsServerCache r0 = r1.authoritativeDnsServerCache
            return r0
    }

    @Override // io.netty.resolver.dns.DnsResolveContext
    /* bridge */ /* synthetic */ void cache(java.lang.String r1, io.netty.handler.codec.dns.DnsRecord[] r2, io.netty.handler.codec.dns.DnsRecord r3, java.net.InetAddress r4) {
            r0 = this;
            java.net.InetAddress r4 = (java.net.InetAddress) r4
            r0.cache2(r1, r2, r3, r4)
            return
    }

    /* renamed from: cache, reason: avoid collision after fix types in other method */
    void cache2(java.lang.String r8, io.netty.handler.codec.dns.DnsRecord[] r9, io.netty.handler.codec.dns.DnsRecord r10, java.net.InetAddress r11) {
            r7 = this;
            io.netty.resolver.dns.DnsCache r0 = r7.resolveCache
            long r4 = r10.timeToLive()
            io.netty.resolver.dns.DnsNameResolver r10 = r7.parent
            io.netty.channel.Channel r10 = r10.ch
            io.netty.channel.EventLoop r6 = r10.eventLoop()
            r1 = r8
            r2 = r9
            r3 = r11
            r0.cache(r1, r2, r3, r4, r6)
            return
    }

    @Override // io.netty.resolver.dns.DnsResolveContext
    void cache(java.lang.String r3, io.netty.handler.codec.dns.DnsRecord[] r4, java.net.UnknownHostException r5) {
            r2 = this;
            io.netty.resolver.dns.DnsCache r0 = r2.resolveCache
            io.netty.resolver.dns.DnsNameResolver r1 = r2.parent
            io.netty.channel.Channel r1 = r1.ch
            io.netty.channel.EventLoop r1 = r1.eventLoop()
            r0.cache(r3, r4, r5, r1)
            return
    }

    @Override // io.netty.resolver.dns.DnsResolveContext
    /* bridge */ /* synthetic */ java.net.InetAddress convertRecord(io.netty.handler.codec.dns.DnsRecord r1, java.lang.String r2, io.netty.handler.codec.dns.DnsRecord[] r3, io.netty.channel.EventLoop r4) {
            r0 = this;
            java.net.InetAddress r1 = r0.convertRecord2(r1, r2, r3, r4)
            return r1
    }

    @Override // io.netty.resolver.dns.DnsResolveContext
    /* renamed from: convertRecord, reason: avoid collision after fix types in other method */
    java.net.InetAddress convertRecord2(io.netty.handler.codec.dns.DnsRecord r1, java.lang.String r2, io.netty.handler.codec.dns.DnsRecord[] r3, io.netty.channel.EventLoop r4) {
            r0 = this;
            io.netty.resolver.dns.DnsNameResolver r3 = r0.parent
            boolean r3 = r3.isDecodeIdn()
            java.net.InetAddress r1 = io.netty.resolver.dns.DnsAddressDecoder.decodeAddress(r1, r2, r3)
            return r1
    }

    @Override // io.netty.resolver.dns.DnsResolveContext
    void doSearchDomainQuery(java.lang.String r4, io.netty.util.concurrent.Promise<java.util.List<java.net.InetAddress>> r5) {
            r3 = this;
            io.netty.handler.codec.dns.DnsRecord[] r0 = r3.additionals
            io.netty.resolver.dns.DnsCache r1 = r3.resolveCache
            io.netty.resolver.dns.DnsNameResolver r2 = r3.parent
            io.netty.channel.socket.InternetProtocolFamily[] r2 = r2.resolvedInternetProtocolFamiliesUnsafe()
            boolean r0 = io.netty.resolver.dns.DnsNameResolver.doResolveAllCached(r4, r0, r5, r1, r2)
            if (r0 != 0) goto L13
            super.doSearchDomainQuery(r4, r5)
        L13:
            return
    }

    @Override // io.netty.resolver.dns.DnsResolveContext
    java.util.List<java.net.InetAddress> filterResults(java.util.List<java.net.InetAddress> r2) {
            r1 = this;
            io.netty.resolver.dns.DnsNameResolver r0 = r1.parent
            io.netty.channel.socket.InternetProtocolFamily r0 = r0.preferredAddressType()
            io.netty.resolver.dns.PreferredAddressTypeComparator r0 = io.netty.resolver.dns.PreferredAddressTypeComparator.comparator(r0)
            java.util.Collections.sort(r2, r0)
            return r2
    }

    @Override // io.netty.resolver.dns.DnsResolveContext
    /* bridge */ /* synthetic */ boolean isCompleteEarly(java.net.InetAddress r1) {
            r0 = this;
            java.net.InetAddress r1 = (java.net.InetAddress) r1
            boolean r1 = r0.isCompleteEarly2(r1)
            return r1
    }

    /* renamed from: isCompleteEarly, reason: avoid collision after fix types in other method */
    boolean isCompleteEarly2(java.net.InetAddress r2) {
            r1 = this;
            boolean r0 = r1.completeEarlyIfPossible
            if (r0 == 0) goto L16
            io.netty.resolver.dns.DnsNameResolver r0 = r1.parent
            io.netty.channel.socket.InternetProtocolFamily r0 = r0.preferredAddressType()
            java.lang.Class r0 = r0.addressType()
            java.lang.Class r2 = r2.getClass()
            if (r0 != r2) goto L16
            r2 = 1
            return r2
        L16:
            r2 = 0
            return r2
    }

    @Override // io.netty.resolver.dns.DnsResolveContext
    boolean isDuplicateAllowed() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.netty.resolver.dns.DnsResolveContext
    io.netty.resolver.dns.DnsResolveContext<java.net.InetAddress> newResolverContext(io.netty.resolver.dns.DnsNameResolver r9, java.lang.String r10, int r11, io.netty.handler.codec.dns.DnsRecordType[] r12, io.netty.handler.codec.dns.DnsRecord[] r13, io.netty.resolver.dns.DnsServerAddressStream r14) {
            r8 = this;
            io.netty.resolver.dns.DnsAddressResolveContext r0 = new io.netty.resolver.dns.DnsAddressResolveContext
            io.netty.resolver.dns.DnsCache r5 = r8.resolveCache
            io.netty.resolver.dns.AuthoritativeDnsServerCache r6 = r8.authoritativeDnsServerCache
            boolean r7 = r8.completeEarlyIfPossible
            r1 = r9
            r2 = r10
            r3 = r13
            r4 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    @Override // io.netty.resolver.dns.DnsResolveContext
    io.netty.resolver.dns.DnsCache resolveCache() {
            r1 = this;
            io.netty.resolver.dns.DnsCache r0 = r1.resolveCache
            return r0
    }
}
