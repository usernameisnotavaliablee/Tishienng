package io.netty.resolver.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class AuthoritativeDnsServerCacheAdapter implements io.netty.resolver.dns.AuthoritativeDnsServerCache {
    private static final io.netty.handler.codec.dns.DnsRecord[] EMPTY = null;
    private final io.netty.resolver.dns.DnsCache cache;

    static {
            r0 = 0
            io.netty.handler.codec.dns.DnsRecord[] r0 = new io.netty.handler.codec.dns.DnsRecord[r0]
            io.netty.resolver.dns.AuthoritativeDnsServerCacheAdapter.EMPTY = r0
            return
    }

    AuthoritativeDnsServerCacheAdapter(io.netty.resolver.dns.DnsCache r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "cache"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.resolver.dns.DnsCache r2 = (io.netty.resolver.dns.DnsCache) r2
            r1.cache = r2
            return
    }

    @Override // io.netty.resolver.dns.AuthoritativeDnsServerCache
    public void cache(java.lang.String r9, java.net.InetSocketAddress r10, long r11, io.netty.channel.EventLoop r13) {
            r8 = this;
            boolean r0 = r10.isUnresolved()
            if (r0 != 0) goto L14
            io.netty.resolver.dns.DnsCache r1 = r8.cache
            io.netty.handler.codec.dns.DnsRecord[] r3 = io.netty.resolver.dns.AuthoritativeDnsServerCacheAdapter.EMPTY
            java.net.InetAddress r4 = r10.getAddress()
            r2 = r9
            r5 = r11
            r7 = r13
            r1.cache(r2, r3, r4, r5, r7)
        L14:
            return
    }

    @Override // io.netty.resolver.dns.AuthoritativeDnsServerCache
    public void clear() {
            r1 = this;
            io.netty.resolver.dns.DnsCache r0 = r1.cache
            r0.clear()
            return
    }

    @Override // io.netty.resolver.dns.AuthoritativeDnsServerCache
    public boolean clear(java.lang.String r2) {
            r1 = this;
            io.netty.resolver.dns.DnsCache r0 = r1.cache
            boolean r2 = r0.clear(r2)
            return r2
    }

    @Override // io.netty.resolver.dns.AuthoritativeDnsServerCache
    public io.netty.resolver.dns.DnsServerAddressStream get(java.lang.String r7) {
            r6 = this;
            io.netty.resolver.dns.DnsCache r0 = r6.cache
            io.netty.handler.codec.dns.DnsRecord[] r1 = io.netty.resolver.dns.AuthoritativeDnsServerCacheAdapter.EMPTY
            java.util.List r7 = r0.get(r7, r1)
            r0 = 0
            if (r7 == 0) goto L4c
            boolean r1 = r7.isEmpty()
            if (r1 == 0) goto L12
            goto L4c
        L12:
            r1 = 0
            java.lang.Object r2 = r7.get(r1)
            io.netty.resolver.dns.DnsCacheEntry r2 = (io.netty.resolver.dns.DnsCacheEntry) r2
            java.lang.Throwable r2 = r2.cause()
            if (r2 == 0) goto L20
            return r0
        L20:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r0 = r7.size()
            r2.<init>(r0)
            r0 = 0
        L2a:
            java.lang.Object r3 = r7.get(r0)
            io.netty.resolver.dns.DnsCacheEntry r3 = (io.netty.resolver.dns.DnsCacheEntry) r3
            java.net.InetAddress r3 = r3.address()
            java.net.InetSocketAddress r4 = new java.net.InetSocketAddress
            r5 = 53
            r4.<init>(r3, r5)
            r2.add(r4)
            int r0 = r0 + 1
            int r3 = r7.size()
            if (r0 < r3) goto L2a
            io.netty.resolver.dns.SequentialDnsServerAddressStream r7 = new io.netty.resolver.dns.SequentialDnsServerAddressStream
            r7.<init>(r2, r1)
            return r7
        L4c:
            return r0
    }
}
