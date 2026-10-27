package io.netty.resolver.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class NoopDnsQueryLifecycleObserver implements io.netty.resolver.dns.DnsQueryLifecycleObserver {
    static final io.netty.resolver.dns.NoopDnsQueryLifecycleObserver INSTANCE = null;

    static {
            io.netty.resolver.dns.NoopDnsQueryLifecycleObserver r0 = new io.netty.resolver.dns.NoopDnsQueryLifecycleObserver
            r0.<init>()
            io.netty.resolver.dns.NoopDnsQueryLifecycleObserver.INSTANCE = r0
            return
    }

    private NoopDnsQueryLifecycleObserver() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // io.netty.resolver.dns.DnsQueryLifecycleObserver
    public io.netty.resolver.dns.DnsQueryLifecycleObserver queryCNAMEd(io.netty.handler.codec.dns.DnsQuestion r1) {
            r0 = this;
            return r0
    }

    @Override // io.netty.resolver.dns.DnsQueryLifecycleObserver
    public void queryCancelled(int r1) {
            r0 = this;
            return
    }

    @Override // io.netty.resolver.dns.DnsQueryLifecycleObserver
    public void queryFailed(java.lang.Throwable r1) {
            r0 = this;
            return
    }

    @Override // io.netty.resolver.dns.DnsQueryLifecycleObserver
    public io.netty.resolver.dns.DnsQueryLifecycleObserver queryNoAnswer(io.netty.handler.codec.dns.DnsResponseCode r1) {
            r0 = this;
            return r0
    }

    @Override // io.netty.resolver.dns.DnsQueryLifecycleObserver
    public io.netty.resolver.dns.DnsQueryLifecycleObserver queryRedirected(java.util.List<java.net.InetSocketAddress> r1) {
            r0 = this;
            return r0
    }

    @Override // io.netty.resolver.dns.DnsQueryLifecycleObserver
    public void querySucceed() {
            r0 = this;
            return
    }

    @Override // io.netty.resolver.dns.DnsQueryLifecycleObserver
    public void queryWritten(java.net.InetSocketAddress r1, io.netty.channel.ChannelFuture r2) {
            r0 = this;
            return
    }
}
