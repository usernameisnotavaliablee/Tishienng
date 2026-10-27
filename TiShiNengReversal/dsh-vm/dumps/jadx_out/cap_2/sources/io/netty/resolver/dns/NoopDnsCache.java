package io.netty.resolver.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class NoopDnsCache implements io.netty.resolver.dns.DnsCache {
    public static final io.netty.resolver.dns.NoopDnsCache INSTANCE = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class NoopDnsCacheEntry implements io.netty.resolver.dns.DnsCacheEntry {
        private final java.net.InetAddress address;

        NoopDnsCacheEntry(java.net.InetAddress r1) {
                r0 = this;
                r0.<init>()
                r0.address = r1
                return
        }

        @Override // io.netty.resolver.dns.DnsCacheEntry
        public java.net.InetAddress address() {
                r1 = this;
                java.net.InetAddress r0 = r1.address
                return r0
        }

        @Override // io.netty.resolver.dns.DnsCacheEntry
        public java.lang.Throwable cause() {
                r1 = this;
                r0 = 0
                return r0
        }

        public java.lang.String toString() {
                r1 = this;
                java.net.InetAddress r0 = r1.address
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            io.netty.resolver.dns.NoopDnsCache r0 = new io.netty.resolver.dns.NoopDnsCache
            r0.<init>()
            io.netty.resolver.dns.NoopDnsCache.INSTANCE = r0
            return
    }

    private NoopDnsCache() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // io.netty.resolver.dns.DnsCache
    public io.netty.resolver.dns.DnsCacheEntry cache(java.lang.String r1, io.netty.handler.codec.dns.DnsRecord[] r2, java.lang.Throwable r3, io.netty.channel.EventLoop r4) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // io.netty.resolver.dns.DnsCache
    public io.netty.resolver.dns.DnsCacheEntry cache(java.lang.String r1, io.netty.handler.codec.dns.DnsRecord[] r2, java.net.InetAddress r3, long r4, io.netty.channel.EventLoop r6) {
            r0 = this;
            io.netty.resolver.dns.NoopDnsCache$NoopDnsCacheEntry r1 = new io.netty.resolver.dns.NoopDnsCache$NoopDnsCacheEntry
            r1.<init>(r3)
            return r1
    }

    @Override // io.netty.resolver.dns.DnsCache
    public void clear() {
            r0 = this;
            return
    }

    @Override // io.netty.resolver.dns.DnsCache
    public boolean clear(java.lang.String r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // io.netty.resolver.dns.DnsCache
    public java.util.List<? extends io.netty.resolver.dns.DnsCacheEntry> get(java.lang.String r1, io.netty.handler.codec.dns.DnsRecord[] r2) {
            r0 = this;
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            return r1
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.Class<io.netty.resolver.dns.NoopDnsCache> r0 = io.netty.resolver.dns.NoopDnsCache.class
            java.lang.String r0 = r0.getSimpleName()
            return r0
    }
}
