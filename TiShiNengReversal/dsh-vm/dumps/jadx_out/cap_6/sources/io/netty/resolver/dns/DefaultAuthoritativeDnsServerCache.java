package io.netty.resolver.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultAuthoritativeDnsServerCache implements io.netty.resolver.dns.AuthoritativeDnsServerCache {
    private final java.util.Comparator<java.net.InetSocketAddress> comparator;
    private final int maxTtl;
    private final int minTtl;
    private final io.netty.resolver.dns.Cache<java.net.InetSocketAddress> resolveCache;


    public DefaultAuthoritativeDnsServerCache() {
            r3 = this;
            int r0 = io.netty.resolver.dns.Cache.MAX_SUPPORTED_TTL_SECS
            r1 = 0
            r2 = 0
            r3.<init>(r2, r0, r1)
            return
    }

    public DefaultAuthoritativeDnsServerCache(int r3, int r4, java.util.Comparator<java.net.InetSocketAddress> r5) {
            r2 = this;
            r2.<init>()
            io.netty.resolver.dns.DefaultAuthoritativeDnsServerCache$1 r0 = new io.netty.resolver.dns.DefaultAuthoritativeDnsServerCache$1
            r0.<init>(r2)
            r2.resolveCache = r0
            int r0 = io.netty.resolver.dns.Cache.MAX_SUPPORTED_TTL_SECS
            java.lang.String r1 = "minTtl"
            int r1 = io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r3, r1)
            int r1 = java.lang.Math.min(r0, r1)
            r2.minTtl = r1
            java.lang.String r1 = "maxTtl"
            int r1 = io.netty.util.internal.ObjectUtil.checkPositive(r4, r1)
            int r0 = java.lang.Math.min(r0, r1)
            r2.maxTtl = r0
            if (r3 > r4) goto L29
            r2.comparator = r5
            return
        L29:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "minTtl: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = ", maxTtl: "
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = " (expected: 0 <= minTtl <= maxTtl)"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r5.<init>(r3)
            throw r5
    }

    static /* synthetic */ java.util.Comparator access$000(io.netty.resolver.dns.DefaultAuthoritativeDnsServerCache r0) {
            java.util.Comparator<java.net.InetSocketAddress> r0 = r0.comparator
            return r0
    }

    @Override // io.netty.resolver.dns.AuthoritativeDnsServerCache
    public void cache(java.lang.String r5, java.net.InetSocketAddress r6, long r7, io.netty.channel.EventLoop r9) {
            r4 = this;
            java.lang.String r0 = "hostname"
            io.netty.util.internal.ObjectUtil.checkNotNull(r5, r0)
            java.lang.String r0 = "address"
            io.netty.util.internal.ObjectUtil.checkNotNull(r6, r0)
            java.lang.String r0 = "loop"
            io.netty.util.internal.ObjectUtil.checkNotNull(r9, r0)
            int r0 = io.netty.util.internal.PlatformDependent.javaVersion()
            r1 = 7
            if (r0 < r1) goto L1d
            java.lang.String r0 = r6.getHostString()
            if (r0 != 0) goto L1d
            return
        L1d:
            io.netty.resolver.dns.Cache<java.net.InetSocketAddress> r0 = r4.resolveCache
            int r1 = r4.minTtl
            int r2 = r4.maxTtl
            long r2 = (long) r2
            long r7 = java.lang.Math.min(r2, r7)
            int r8 = (int) r7
            int r7 = java.lang.Math.max(r1, r8)
            r0.cache(r5, r6, r7, r9)
            return
    }

    @Override // io.netty.resolver.dns.AuthoritativeDnsServerCache
    public void clear() {
            r1 = this;
            io.netty.resolver.dns.Cache<java.net.InetSocketAddress> r0 = r1.resolveCache
            r0.clear()
            return
    }

    @Override // io.netty.resolver.dns.AuthoritativeDnsServerCache
    public boolean clear(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "hostname"
            io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.resolver.dns.Cache<java.net.InetSocketAddress> r0 = r1.resolveCache
            boolean r2 = r0.clear(r2)
            return r2
    }

    @Override // io.netty.resolver.dns.AuthoritativeDnsServerCache
    public io.netty.resolver.dns.DnsServerAddressStream get(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "hostname"
            io.netty.util.internal.ObjectUtil.checkNotNull(r3, r0)
            io.netty.resolver.dns.Cache<java.net.InetSocketAddress> r0 = r2.resolveCache
            java.util.List r3 = r0.get(r3)
            if (r3 == 0) goto L1b
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L14
            goto L1b
        L14:
            io.netty.resolver.dns.SequentialDnsServerAddressStream r0 = new io.netty.resolver.dns.SequentialDnsServerAddressStream
            r1 = 0
            r0.<init>(r3, r1)
            return r0
        L1b:
            r3 = 0
            return r3
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "DefaultAuthoritativeDnsServerCache(minTtl="
            r0.append(r1)
            int r1 = r2.minTtl
            r0.append(r1)
            java.lang.String r1 = ", maxTtl="
            r0.append(r1)
            int r1 = r2.maxTtl
            r0.append(r1)
            java.lang.String r1 = ", cached nameservers="
            r0.append(r1)
            io.netty.resolver.dns.Cache<java.net.InetSocketAddress> r1 = r2.resolveCache
            int r1 = r1.size()
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
