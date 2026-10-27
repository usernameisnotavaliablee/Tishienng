package io.netty.resolver.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class RoundRobinDnsAddressResolverGroup extends io.netty.resolver.dns.DnsAddressResolverGroup {
    public RoundRobinDnsAddressResolverGroup(io.netty.channel.ChannelFactory<? extends io.netty.channel.socket.DatagramChannel> r1, io.netty.resolver.dns.DnsServerAddressStreamProvider r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public RoundRobinDnsAddressResolverGroup(io.netty.resolver.dns.DnsNameResolverBuilder r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public RoundRobinDnsAddressResolverGroup(java.lang.Class<? extends io.netty.channel.socket.DatagramChannel> r1, io.netty.resolver.dns.DnsServerAddressStreamProvider r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // io.netty.resolver.dns.DnsAddressResolverGroup
    protected final io.netty.resolver.AddressResolver<java.net.InetSocketAddress> newAddressResolver(io.netty.channel.EventLoop r2, io.netty.resolver.NameResolver<java.net.InetAddress> r3) throws java.lang.Exception {
            r1 = this;
            io.netty.resolver.RoundRobinInetAddressResolver r0 = new io.netty.resolver.RoundRobinInetAddressResolver
            r0.<init>(r2, r3)
            io.netty.resolver.AddressResolver r2 = r0.asAddressResolver()
            return r2
    }
}
