package io.netty.resolver.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class DatagramDnsQueryContext extends io.netty.resolver.dns.DnsQueryContext {
    DatagramDnsQueryContext(io.netty.resolver.dns.DnsNameResolver r1, java.net.InetSocketAddress r2, io.netty.handler.codec.dns.DnsQuestion r3, io.netty.handler.codec.dns.DnsRecord[] r4, io.netty.util.concurrent.Promise<io.netty.channel.AddressedEnvelope<io.netty.handler.codec.dns.DnsResponse, java.net.InetSocketAddress>> r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    protected io.netty.channel.Channel channel() {
            r1 = this;
            io.netty.resolver.dns.DnsNameResolver r0 = r1.parent()
            io.netty.channel.Channel r0 = r0.ch
            return r0
    }

    protected io.netty.handler.codec.dns.DnsQuery newQuery(int r4) {
            r3 = this;
            io.netty.handler.codec.dns.DatagramDnsQuery r0 = new io.netty.handler.codec.dns.DatagramDnsQuery
            r1 = 0
            java.net.InetSocketAddress r2 = r3.nameServerAddr()
            r0.<init>(r1, r2, r4)
            return r0
    }

    protected java.lang.String protocol() {
            r1 = this;
            java.lang.String r0 = "UDP"
            return r0
    }
}
