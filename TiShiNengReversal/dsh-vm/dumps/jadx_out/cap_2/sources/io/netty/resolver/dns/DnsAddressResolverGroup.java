package io.netty.resolver.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class DnsAddressResolverGroup extends io.netty.resolver.AddressResolverGroup<java.net.InetSocketAddress> {
    private final io.netty.resolver.dns.DnsNameResolverBuilder dnsResolverBuilder;
    private final java.util.concurrent.ConcurrentMap<java.lang.String, io.netty.util.concurrent.Promise<java.util.List<java.net.InetAddress>>> resolveAllsInProgress;
    private final java.util.concurrent.ConcurrentMap<java.lang.String, io.netty.util.concurrent.Promise<java.net.InetAddress>> resolvesInProgress;

    public DnsAddressResolverGroup(io.netty.channel.ChannelFactory<? extends io.netty.channel.socket.DatagramChannel> r2, io.netty.resolver.dns.DnsServerAddressStreamProvider r3) {
            r1 = this;
            io.netty.resolver.dns.DnsNameResolverBuilder r0 = new io.netty.resolver.dns.DnsNameResolverBuilder
            r0.<init>()
            r1.<init>(r0)
            io.netty.resolver.dns.DnsNameResolverBuilder r0 = r1.dnsResolverBuilder
            io.netty.resolver.dns.DnsNameResolverBuilder r2 = r0.channelFactory(r2)
            r2.nameServerProvider(r3)
            return
    }

    public DnsAddressResolverGroup(io.netty.resolver.dns.DnsNameResolverBuilder r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentMap r0 = io.netty.util.internal.PlatformDependent.newConcurrentHashMap()
            r1.resolvesInProgress = r0
            java.util.concurrent.ConcurrentMap r0 = io.netty.util.internal.PlatformDependent.newConcurrentHashMap()
            r1.resolveAllsInProgress = r0
            io.netty.resolver.dns.DnsNameResolverBuilder r2 = r2.copy()
            r1.dnsResolverBuilder = r2
            return
    }

    public DnsAddressResolverGroup(java.lang.Class<? extends io.netty.channel.socket.DatagramChannel> r2, io.netty.resolver.dns.DnsServerAddressStreamProvider r3) {
            r1 = this;
            io.netty.resolver.dns.DnsNameResolverBuilder r0 = new io.netty.resolver.dns.DnsNameResolverBuilder
            r0.<init>()
            r1.<init>(r0)
            io.netty.resolver.dns.DnsNameResolverBuilder r0 = r1.dnsResolverBuilder
            io.netty.resolver.dns.DnsNameResolverBuilder r2 = r0.channelType(r2)
            r2.nameServerProvider(r3)
            return
    }

    protected io.netty.resolver.AddressResolver<java.net.InetSocketAddress> newAddressResolver(io.netty.channel.EventLoop r2, io.netty.resolver.NameResolver<java.net.InetAddress> r3) throws java.lang.Exception {
            r1 = this;
            io.netty.resolver.InetSocketAddressResolver r0 = new io.netty.resolver.InetSocketAddressResolver
            r0.<init>(r2, r3)
            return r0
    }

    protected io.netty.resolver.NameResolver<java.net.InetAddress> newNameResolver(io.netty.channel.EventLoop r2, io.netty.channel.ChannelFactory<? extends io.netty.channel.socket.DatagramChannel> r3, io.netty.resolver.dns.DnsServerAddressStreamProvider r4) throws java.lang.Exception {
            r1 = this;
            io.netty.resolver.dns.DnsNameResolverBuilder r0 = r1.dnsResolverBuilder
            io.netty.resolver.dns.DnsNameResolverBuilder r2 = r0.eventLoop(r2)
            io.netty.resolver.dns.DnsNameResolverBuilder r2 = r2.channelFactory(r3)
            io.netty.resolver.dns.DnsNameResolverBuilder r2 = r2.nameServerProvider(r4)
            io.netty.resolver.dns.DnsNameResolver r2 = r2.build()
            return r2
    }

    @java.lang.Deprecated
    protected io.netty.resolver.AddressResolver<java.net.InetSocketAddress> newResolver(io.netty.channel.EventLoop r3, io.netty.channel.ChannelFactory<? extends io.netty.channel.socket.DatagramChannel> r4, io.netty.resolver.dns.DnsServerAddressStreamProvider r5) throws java.lang.Exception {
            r2 = this;
            io.netty.resolver.dns.InflightNameResolver r0 = new io.netty.resolver.dns.InflightNameResolver
            io.netty.resolver.NameResolver r4 = r2.newNameResolver(r3, r4, r5)
            java.util.concurrent.ConcurrentMap<java.lang.String, io.netty.util.concurrent.Promise<java.net.InetAddress>> r5 = r2.resolvesInProgress
            java.util.concurrent.ConcurrentMap<java.lang.String, io.netty.util.concurrent.Promise<java.util.List<java.net.InetAddress>>> r1 = r2.resolveAllsInProgress
            r0.<init>(r3, r4, r5, r1)
            io.netty.resolver.AddressResolver r3 = r2.newAddressResolver(r3, r0)
            return r3
    }

    protected final io.netty.resolver.AddressResolver<java.net.InetSocketAddress> newResolver(io.netty.util.concurrent.EventExecutor r4) throws java.lang.Exception {
            r3 = this;
            boolean r0 = r4 instanceof io.netty.channel.EventLoop
            if (r0 == 0) goto L17
            io.netty.channel.EventLoop r4 = (io.netty.channel.EventLoop) r4
            io.netty.resolver.dns.DnsNameResolverBuilder r0 = r3.dnsResolverBuilder
            io.netty.channel.ChannelFactory r0 = r0.channelFactory()
            io.netty.resolver.dns.DnsNameResolverBuilder r1 = r3.dnsResolverBuilder
            io.netty.resolver.dns.DnsServerAddressStreamProvider r1 = r1.nameServerProvider()
            io.netty.resolver.AddressResolver r4 = r3.newResolver(r4, r0, r1)
            return r4
        L17:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unsupported executor type: "
            r1.append(r2)
            java.lang.String r4 = io.netty.util.internal.StringUtil.simpleClassName(r4)
            r1.append(r4)
            java.lang.String r4 = " (expected: "
            r1.append(r4)
            java.lang.Class<io.netty.channel.EventLoop> r4 = io.netty.channel.EventLoop.class
            java.lang.String r4 = io.netty.util.internal.StringUtil.simpleClassName(r4)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }
}
