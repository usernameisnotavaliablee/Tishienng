package io.netty.resolver.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class TcpDnsQueryContext extends io.netty.resolver.dns.DnsQueryContext {
    private final io.netty.channel.Channel channel;

    TcpDnsQueryContext(io.netty.resolver.dns.DnsNameResolver r7, io.netty.channel.Channel r8, java.net.InetSocketAddress r9, io.netty.handler.codec.dns.DnsQuestion r10, io.netty.handler.codec.dns.DnsRecord[] r11, io.netty.util.concurrent.Promise<io.netty.channel.AddressedEnvelope<io.netty.handler.codec.dns.DnsResponse, java.net.InetSocketAddress>> r12) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            r0.channel = r8
            return
    }

    @Override // io.netty.resolver.dns.DnsQueryContext
    protected io.netty.channel.Channel channel() {
            r1 = this;
            io.netty.channel.Channel r0 = r1.channel
            return r0
    }

    @Override // io.netty.resolver.dns.DnsQueryContext
    protected io.netty.handler.codec.dns.DnsQuery newQuery(int r2) {
            r1 = this;
            io.netty.handler.codec.dns.DefaultDnsQuery r0 = new io.netty.handler.codec.dns.DefaultDnsQuery
            r0.<init>(r2)
            return r0
    }

    @Override // io.netty.resolver.dns.DnsQueryContext
    protected java.lang.String protocol() {
            r1 = this;
            java.lang.String r0 = "TCP"
            return r0
    }
}
