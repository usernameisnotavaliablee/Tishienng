package io.netty.resolver.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class BiDnsQueryLifecycleObserver implements io.netty.resolver.dns.DnsQueryLifecycleObserver {
    private final io.netty.resolver.dns.DnsQueryLifecycleObserver a;
    private final io.netty.resolver.dns.DnsQueryLifecycleObserver b;

    public BiDnsQueryLifecycleObserver(io.netty.resolver.dns.DnsQueryLifecycleObserver r2, io.netty.resolver.dns.DnsQueryLifecycleObserver r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "a"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.resolver.dns.DnsQueryLifecycleObserver r2 = (io.netty.resolver.dns.DnsQueryLifecycleObserver) r2
            r1.a = r2
            java.lang.String r2 = "b"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r2)
            io.netty.resolver.dns.DnsQueryLifecycleObserver r2 = (io.netty.resolver.dns.DnsQueryLifecycleObserver) r2
            r1.b = r2
            return
    }

    public io.netty.resolver.dns.DnsQueryLifecycleObserver queryCNAMEd(io.netty.handler.codec.dns.DnsQuestion r3) {
            r2 = this;
            io.netty.resolver.dns.DnsQueryLifecycleObserver r0 = r2.a     // Catch: java.lang.Throwable -> Lb
            r0.queryCNAMEd(r3)     // Catch: java.lang.Throwable -> Lb
            io.netty.resolver.dns.DnsQueryLifecycleObserver r0 = r2.b
            r0.queryCNAMEd(r3)
            return r2
        Lb:
            r0 = move-exception
            io.netty.resolver.dns.DnsQueryLifecycleObserver r1 = r2.b
            r1.queryCNAMEd(r3)
            throw r0
    }

    public void queryCancelled(int r3) {
            r2 = this;
            io.netty.resolver.dns.DnsQueryLifecycleObserver r0 = r2.a     // Catch: java.lang.Throwable -> Lb
            r0.queryCancelled(r3)     // Catch: java.lang.Throwable -> Lb
            io.netty.resolver.dns.DnsQueryLifecycleObserver r0 = r2.b
            r0.queryCancelled(r3)
            return
        Lb:
            r0 = move-exception
            io.netty.resolver.dns.DnsQueryLifecycleObserver r1 = r2.b
            r1.queryCancelled(r3)
            throw r0
    }

    public void queryFailed(java.lang.Throwable r3) {
            r2 = this;
            io.netty.resolver.dns.DnsQueryLifecycleObserver r0 = r2.a     // Catch: java.lang.Throwable -> Lb
            r0.queryFailed(r3)     // Catch: java.lang.Throwable -> Lb
            io.netty.resolver.dns.DnsQueryLifecycleObserver r0 = r2.b
            r0.queryFailed(r3)
            return
        Lb:
            r0 = move-exception
            io.netty.resolver.dns.DnsQueryLifecycleObserver r1 = r2.b
            r1.queryFailed(r3)
            throw r0
    }

    public io.netty.resolver.dns.DnsQueryLifecycleObserver queryNoAnswer(io.netty.handler.codec.dns.DnsResponseCode r3) {
            r2 = this;
            io.netty.resolver.dns.DnsQueryLifecycleObserver r0 = r2.a     // Catch: java.lang.Throwable -> Lb
            r0.queryNoAnswer(r3)     // Catch: java.lang.Throwable -> Lb
            io.netty.resolver.dns.DnsQueryLifecycleObserver r0 = r2.b
            r0.queryNoAnswer(r3)
            return r2
        Lb:
            r0 = move-exception
            io.netty.resolver.dns.DnsQueryLifecycleObserver r1 = r2.b
            r1.queryNoAnswer(r3)
            throw r0
    }

    public io.netty.resolver.dns.DnsQueryLifecycleObserver queryRedirected(java.util.List<java.net.InetSocketAddress> r3) {
            r2 = this;
            io.netty.resolver.dns.DnsQueryLifecycleObserver r0 = r2.a     // Catch: java.lang.Throwable -> Lb
            r0.queryRedirected(r3)     // Catch: java.lang.Throwable -> Lb
            io.netty.resolver.dns.DnsQueryLifecycleObserver r0 = r2.b
            r0.queryRedirected(r3)
            return r2
        Lb:
            r0 = move-exception
            io.netty.resolver.dns.DnsQueryLifecycleObserver r1 = r2.b
            r1.queryRedirected(r3)
            throw r0
    }

    public void querySucceed() {
            r2 = this;
            io.netty.resolver.dns.DnsQueryLifecycleObserver r0 = r2.a     // Catch: java.lang.Throwable -> Lb
            r0.querySucceed()     // Catch: java.lang.Throwable -> Lb
            io.netty.resolver.dns.DnsQueryLifecycleObserver r0 = r2.b
            r0.querySucceed()
            return
        Lb:
            r0 = move-exception
            io.netty.resolver.dns.DnsQueryLifecycleObserver r1 = r2.b
            r1.querySucceed()
            throw r0
    }

    public void queryWritten(java.net.InetSocketAddress r3, io.netty.channel.ChannelFuture r4) {
            r2 = this;
            io.netty.resolver.dns.DnsQueryLifecycleObserver r0 = r2.a     // Catch: java.lang.Throwable -> Lb
            r0.queryWritten(r3, r4)     // Catch: java.lang.Throwable -> Lb
            io.netty.resolver.dns.DnsQueryLifecycleObserver r0 = r2.b
            r0.queryWritten(r3, r4)
            return
        Lb:
            r0 = move-exception
            io.netty.resolver.dns.DnsQueryLifecycleObserver r1 = r2.b
            r1.queryWritten(r3, r4)
            throw r0
    }
}
