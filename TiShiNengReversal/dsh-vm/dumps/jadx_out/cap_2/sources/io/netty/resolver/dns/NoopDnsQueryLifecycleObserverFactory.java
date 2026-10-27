package io.netty.resolver.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class NoopDnsQueryLifecycleObserverFactory implements io.netty.resolver.dns.DnsQueryLifecycleObserverFactory {
    public static final io.netty.resolver.dns.NoopDnsQueryLifecycleObserverFactory INSTANCE = null;

    static {
            io.netty.resolver.dns.NoopDnsQueryLifecycleObserverFactory r0 = new io.netty.resolver.dns.NoopDnsQueryLifecycleObserverFactory
            r0.<init>()
            io.netty.resolver.dns.NoopDnsQueryLifecycleObserverFactory.INSTANCE = r0
            return
    }

    private NoopDnsQueryLifecycleObserverFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // io.netty.resolver.dns.DnsQueryLifecycleObserverFactory
    public io.netty.resolver.dns.DnsQueryLifecycleObserver newDnsQueryLifecycleObserver(io.netty.handler.codec.dns.DnsQuestion r1) {
            r0 = this;
            io.netty.resolver.dns.NoopDnsQueryLifecycleObserver r1 = io.netty.resolver.dns.NoopDnsQueryLifecycleObserver.INSTANCE
            return r1
    }
}
