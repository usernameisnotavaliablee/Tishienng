package io.netty.resolver.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultDnsCache implements io.netty.resolver.dns.DnsCache {
    private final int maxTtl;
    private final int minTtl;
    private final int negativeTtl;
    private final io.netty.resolver.dns.Cache<io.netty.resolver.dns.DefaultDnsCache.DefaultDnsCacheEntry> resolveCache;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class DefaultDnsCacheEntry implements io.netty.resolver.dns.DnsCacheEntry {
        private final java.net.InetAddress address;
        private final java.lang.Throwable cause;
        private final java.lang.String hostname;

        DefaultDnsCacheEntry(java.lang.String r1, java.lang.Throwable r2) {
                r0 = this;
                r0.<init>()
                r0.hostname = r1
                r0.cause = r2
                r1 = 0
                r0.address = r1
                return
        }

        DefaultDnsCacheEntry(java.lang.String r1, java.net.InetAddress r2) {
                r0 = this;
                r0.<init>()
                r0.hostname = r1
                r0.address = r2
                r1 = 0
                r0.cause = r1
                return
        }

        public java.net.InetAddress address() {
                r1 = this;
                java.net.InetAddress r0 = r1.address
                return r0
        }

        public java.lang.Throwable cause() {
                r1 = this;
                java.lang.Throwable r0 = r1.cause
                return r0
        }

        java.lang.String hostname() {
                r1 = this;
                java.lang.String r0 = r1.hostname
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.Throwable r0 = r2.cause
                if (r0 == 0) goto L1d
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r2.hostname
                r0.append(r1)
                r1 = 47
                r0.append(r1)
                java.lang.Throwable r1 = r2.cause
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
            L1d:
                java.net.InetAddress r0 = r2.address
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public DefaultDnsCache() {
            r2 = this;
            r0 = 0
            int r1 = io.netty.resolver.dns.Cache.MAX_SUPPORTED_TTL_SECS
            r2.<init>(r0, r1, r0)
            return
    }

    public DefaultDnsCache(int r3, int r4, int r5) {
            r2 = this;
            r2.<init>()
            io.netty.resolver.dns.DefaultDnsCache$1 r0 = new io.netty.resolver.dns.DefaultDnsCache$1
            r0.<init>(r2)
            r2.resolveCache = r0
            int r0 = io.netty.resolver.dns.Cache.MAX_SUPPORTED_TTL_SECS
            java.lang.String r1 = "minTtl"
            int r1 = io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r3, r1)
            int r1 = java.lang.Math.min(r0, r1)
            r2.minTtl = r1
            java.lang.String r1 = "maxTtl"
            int r1 = io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r4, r1)
            int r0 = java.lang.Math.min(r0, r1)
            r2.maxTtl = r0
            if (r3 > r4) goto L2f
            java.lang.String r3 = "negativeTtl"
            int r3 = io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r5, r3)
            r2.negativeTtl = r3
            return
        L2f:
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

    private static java.lang.String appendDot(java.lang.String r2) {
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

    private static boolean emptyAdditionals(io.netty.handler.codec.dns.DnsRecord[] r0) {
            if (r0 == 0) goto L8
            int r0 = r0.length
            if (r0 != 0) goto L6
            goto L8
        L6:
            r0 = 0
            return r0
        L8:
            r0 = 1
            return r0
    }

    public io.netty.resolver.dns.DnsCacheEntry cache(java.lang.String r2, io.netty.handler.codec.dns.DnsRecord[] r3, java.lang.Throwable r4, io.netty.channel.EventLoop r5) {
            r1 = this;
            java.lang.String r0 = "hostname"
            io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            java.lang.String r0 = "cause"
            io.netty.util.internal.ObjectUtil.checkNotNull(r4, r0)
            java.lang.String r0 = "loop"
            io.netty.util.internal.ObjectUtil.checkNotNull(r5, r0)
            io.netty.resolver.dns.DefaultDnsCache$DefaultDnsCacheEntry r0 = new io.netty.resolver.dns.DefaultDnsCache$DefaultDnsCacheEntry
            r0.<init>(r2, r4)
            int r4 = r1.negativeTtl
            if (r4 == 0) goto L2a
            boolean r3 = emptyAdditionals(r3)
            if (r3 != 0) goto L1f
            goto L2a
        L1f:
            io.netty.resolver.dns.Cache<io.netty.resolver.dns.DefaultDnsCache$DefaultDnsCacheEntry> r3 = r1.resolveCache
            java.lang.String r2 = appendDot(r2)
            int r4 = r1.negativeTtl
            r3.cache(r2, r0, r4, r5)
        L2a:
            return r0
    }

    public io.netty.resolver.dns.DnsCacheEntry cache(java.lang.String r4, io.netty.handler.codec.dns.DnsRecord[] r5, java.net.InetAddress r6, long r7, io.netty.channel.EventLoop r9) {
            r3 = this;
            java.lang.String r0 = "hostname"
            io.netty.util.internal.ObjectUtil.checkNotNull(r4, r0)
            java.lang.String r0 = "address"
            io.netty.util.internal.ObjectUtil.checkNotNull(r6, r0)
            java.lang.String r0 = "loop"
            io.netty.util.internal.ObjectUtil.checkNotNull(r9, r0)
            io.netty.resolver.dns.DefaultDnsCache$DefaultDnsCacheEntry r0 = new io.netty.resolver.dns.DefaultDnsCache$DefaultDnsCacheEntry
            r0.<init>(r4, r6)
            int r6 = r3.maxTtl
            if (r6 == 0) goto L36
            boolean r5 = emptyAdditionals(r5)
            if (r5 != 0) goto L1f
            goto L36
        L1f:
            io.netty.resolver.dns.Cache<io.netty.resolver.dns.DefaultDnsCache$DefaultDnsCacheEntry> r5 = r3.resolveCache
            java.lang.String r4 = appendDot(r4)
            int r6 = r3.minTtl
            int r1 = r3.maxTtl
            long r1 = (long) r1
            long r7 = java.lang.Math.min(r1, r7)
            int r8 = (int) r7
            int r6 = java.lang.Math.max(r6, r8)
            r5.cache(r4, r0, r6, r9)
        L36:
            return r0
    }

    public void clear() {
            r1 = this;
            io.netty.resolver.dns.Cache<io.netty.resolver.dns.DefaultDnsCache$DefaultDnsCacheEntry> r0 = r1.resolveCache
            r0.clear()
            return
    }

    public boolean clear(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "hostname"
            io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.resolver.dns.Cache<io.netty.resolver.dns.DefaultDnsCache$DefaultDnsCacheEntry> r0 = r1.resolveCache
            java.lang.String r2 = appendDot(r2)
            boolean r2 = r0.clear(r2)
            return r2
    }

    public java.util.List<? extends io.netty.resolver.dns.DnsCacheEntry> get(java.lang.String r2, io.netty.handler.codec.dns.DnsRecord[] r3) {
            r1 = this;
            java.lang.String r0 = "hostname"
            io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            boolean r3 = emptyAdditionals(r3)
            if (r3 != 0) goto Le
            java.util.List r2 = java.util.Collections.EMPTY_LIST
            return r2
        Le:
            io.netty.resolver.dns.Cache<io.netty.resolver.dns.DefaultDnsCache$DefaultDnsCacheEntry> r3 = r1.resolveCache
            java.lang.String r2 = appendDot(r2)
            java.util.List r2 = r3.get(r2)
            return r2
    }

    public int maxTtl() {
            r1 = this;
            int r0 = r1.maxTtl
            return r0
    }

    public int minTtl() {
            r1 = this;
            int r0 = r1.minTtl
            return r0
    }

    public int negativeTtl() {
            r1 = this;
            int r0 = r1.negativeTtl
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "DefaultDnsCache(minTtl="
            r0.append(r1)
            int r1 = r2.minTtl
            r0.append(r1)
            java.lang.String r1 = ", maxTtl="
            r0.append(r1)
            int r1 = r2.maxTtl
            r0.append(r1)
            java.lang.String r1 = ", negativeTtl="
            r0.append(r1)
            int r1 = r2.negativeTtl
            r0.append(r1)
            java.lang.String r1 = ", cached resolved hostname="
            r0.append(r1)
            io.netty.resolver.dns.Cache<io.netty.resolver.dns.DefaultDnsCache$DefaultDnsCacheEntry> r1 = r2.resolveCache
            int r1 = r1.size()
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
