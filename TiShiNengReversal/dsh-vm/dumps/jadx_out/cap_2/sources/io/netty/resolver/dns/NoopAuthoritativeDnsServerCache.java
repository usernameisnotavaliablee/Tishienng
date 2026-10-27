package io.netty.resolver.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class NoopAuthoritativeDnsServerCache implements io.netty.resolver.dns.AuthoritativeDnsServerCache {
    public static final io.netty.resolver.dns.NoopAuthoritativeDnsServerCache INSTANCE = null;

    static {
            io.netty.resolver.dns.NoopAuthoritativeDnsServerCache r0 = new io.netty.resolver.dns.NoopAuthoritativeDnsServerCache
            r0.<init>()
            io.netty.resolver.dns.NoopAuthoritativeDnsServerCache.INSTANCE = r0
            return
    }

    private NoopAuthoritativeDnsServerCache() {
            r0 = this;
            r0.<init>()
            return
    }

    public void cache(java.lang.String r1, java.net.InetSocketAddress r2, long r3, io.netty.channel.EventLoop r5) {
            r0 = this;
            return
    }

    public void clear() {
            r0 = this;
            return
    }

    public boolean clear(java.lang.String r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public io.netty.resolver.dns.DnsServerAddressStream get(java.lang.String r1) {
            r0 = this;
            r1 = 0
            return r1
    }
}
