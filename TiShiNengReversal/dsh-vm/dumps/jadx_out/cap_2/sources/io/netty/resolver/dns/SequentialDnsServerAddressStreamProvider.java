package io.netty.resolver.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class SequentialDnsServerAddressStreamProvider extends io.netty.resolver.dns.UniSequentialDnsServerAddressStreamProvider {
    public SequentialDnsServerAddressStreamProvider(java.lang.Iterable<? extends java.net.InetSocketAddress> r1) {
            r0 = this;
            io.netty.resolver.dns.DnsServerAddresses r1 = io.netty.resolver.dns.DnsServerAddresses.sequential(r1)
            r0.<init>(r1)
            return
    }

    public SequentialDnsServerAddressStreamProvider(java.net.InetSocketAddress... r1) {
            r0 = this;
            io.netty.resolver.dns.DnsServerAddresses r1 = io.netty.resolver.dns.DnsServerAddresses.sequential(r1)
            r0.<init>(r1)
            return
    }
}
