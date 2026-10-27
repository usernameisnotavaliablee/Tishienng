package io.netty.resolver.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class DefaultDnsCnameCache implements io.netty.resolver.dns.DnsCnameCache {
    private final io.netty.resolver.dns.Cache<java.lang.String> cache;
    private final int maxTtl;
    private final int minTtl;


    public DefaultDnsCnameCache() {
            r2 = this;
            r0 = 0
            int r1 = io.netty.resolver.dns.Cache.MAX_SUPPORTED_TTL_SECS
            r2.<init>(r0, r1)
            return
    }

    public DefaultDnsCnameCache(int r4, int r5) {
            r3 = this;
            r3.<init>()
            io.netty.resolver.dns.DefaultDnsCnameCache$1 r0 = new io.netty.resolver.dns.DefaultDnsCnameCache$1
            r0.<init>(r3)
            r3.cache = r0
            int r0 = io.netty.resolver.dns.Cache.MAX_SUPPORTED_TTL_SECS
            java.lang.String r1 = "minTtl"
            int r1 = io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r4, r1)
            int r1 = java.lang.Math.min(r0, r1)
            r3.minTtl = r1
            java.lang.String r1 = "maxTtl"
            int r1 = io.netty.util.internal.ObjectUtil.checkPositive(r5, r1)
            int r0 = java.lang.Math.min(r0, r1)
            r3.maxTtl = r0
            if (r4 > r5) goto L27
            return
        L27:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "minTtl: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ", maxTtl: "
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = " (expected: 0 <= minTtl <= maxTtl)"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public void cache(java.lang.String r5, java.lang.String r6, long r7, io.netty.channel.EventLoop r9) {
            r4 = this;
            java.lang.String r0 = "hostname"
            io.netty.util.internal.ObjectUtil.checkNotNull(r5, r0)
            java.lang.String r0 = "cname"
            io.netty.util.internal.ObjectUtil.checkNotNull(r6, r0)
            java.lang.String r0 = "loop"
            io.netty.util.internal.ObjectUtil.checkNotNull(r9, r0)
            io.netty.resolver.dns.Cache<java.lang.String> r0 = r4.cache
            int r1 = r4.minTtl
            int r2 = r4.maxTtl
            long r2 = (long) r2
            long r7 = java.lang.Math.min(r2, r7)
            int r8 = (int) r7
            int r7 = java.lang.Math.max(r1, r8)
            r0.cache(r5, r6, r7, r9)
            return
    }

    public void clear() {
            r1 = this;
            io.netty.resolver.dns.Cache<java.lang.String> r0 = r1.cache
            r0.clear()
            return
    }

    public boolean clear(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "hostname"
            io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.resolver.dns.Cache<java.lang.String> r0 = r1.cache
            boolean r2 = r0.clear(r2)
            return r2
    }

    public java.lang.String get(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "hostname"
            io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.resolver.dns.Cache<java.lang.String> r0 = r1.cache
            java.util.List r2 = r0.get(r2)
            if (r2 == 0) goto L1c
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L14
            goto L1c
        L14:
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            return r2
        L1c:
            r2 = 0
            return r2
    }
}
