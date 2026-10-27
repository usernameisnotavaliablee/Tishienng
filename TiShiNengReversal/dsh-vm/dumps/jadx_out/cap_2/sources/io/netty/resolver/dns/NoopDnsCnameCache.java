package io.netty.resolver.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class NoopDnsCnameCache implements io.netty.resolver.dns.DnsCnameCache {
    public static final io.netty.resolver.dns.NoopDnsCnameCache INSTANCE = null;

    static {
            io.netty.resolver.dns.NoopDnsCnameCache r0 = new io.netty.resolver.dns.NoopDnsCnameCache
            r0.<init>()
            io.netty.resolver.dns.NoopDnsCnameCache.INSTANCE = r0
            return
    }

    private NoopDnsCnameCache() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // io.netty.resolver.dns.DnsCnameCache
    public void cache(java.lang.String r1, java.lang.String r2, long r3, io.netty.channel.EventLoop r5) {
            r0 = this;
            return
    }

    @Override // io.netty.resolver.dns.DnsCnameCache
    public void clear() {
            r0 = this;
            return
    }

    @Override // io.netty.resolver.dns.DnsCnameCache
    public boolean clear(java.lang.String r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // io.netty.resolver.dns.DnsCnameCache
    public java.lang.String get(java.lang.String r1) {
            r0 = this;
            r1 = 0
            return r1
    }
}
