package io.netty.resolver.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface DnsQueryLifecycleObserver {
    io.netty.resolver.dns.DnsQueryLifecycleObserver queryCNAMEd(io.netty.handler.codec.dns.DnsQuestion r1);

    void queryCancelled(int r1);

    void queryFailed(java.lang.Throwable r1);

    io.netty.resolver.dns.DnsQueryLifecycleObserver queryNoAnswer(io.netty.handler.codec.dns.DnsResponseCode r1);

    io.netty.resolver.dns.DnsQueryLifecycleObserver queryRedirected(java.util.List<java.net.InetSocketAddress> r1);

    void querySucceed();

    void queryWritten(java.net.InetSocketAddress r1, io.netty.channel.ChannelFuture r2);
}
