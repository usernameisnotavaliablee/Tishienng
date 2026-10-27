package io.netty.resolver.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class BiDnsQueryLifecycleObserverFactory implements io.netty.resolver.dns.DnsQueryLifecycleObserverFactory {
    private final io.netty.resolver.dns.DnsQueryLifecycleObserverFactory a;
    private final io.netty.resolver.dns.DnsQueryLifecycleObserverFactory b;

    public BiDnsQueryLifecycleObserverFactory(io.netty.resolver.dns.DnsQueryLifecycleObserverFactory r2, io.netty.resolver.dns.DnsQueryLifecycleObserverFactory r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "a"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.resolver.dns.DnsQueryLifecycleObserverFactory r2 = (io.netty.resolver.dns.DnsQueryLifecycleObserverFactory) r2
            r1.a = r2
            java.lang.String r2 = "b"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r2)
            io.netty.resolver.dns.DnsQueryLifecycleObserverFactory r2 = (io.netty.resolver.dns.DnsQueryLifecycleObserverFactory) r2
            r1.b = r2
            return
    }

    public io.netty.resolver.dns.DnsQueryLifecycleObserver newDnsQueryLifecycleObserver(io.netty.handler.codec.dns.DnsQuestion r4) {
            r3 = this;
            io.netty.resolver.dns.BiDnsQueryLifecycleObserver r0 = new io.netty.resolver.dns.BiDnsQueryLifecycleObserver
            io.netty.resolver.dns.DnsQueryLifecycleObserverFactory r1 = r3.a
            io.netty.resolver.dns.DnsQueryLifecycleObserver r1 = r1.newDnsQueryLifecycleObserver(r4)
            io.netty.resolver.dns.DnsQueryLifecycleObserverFactory r2 = r3.b
            io.netty.resolver.dns.DnsQueryLifecycleObserver r4 = r2.newDnsQueryLifecycleObserver(r4)
            r0.<init>(r1, r4)
            return r0
    }
}
