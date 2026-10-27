package io.netty.resolver.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
abstract class UniSequentialDnsServerAddressStreamProvider implements io.netty.resolver.dns.DnsServerAddressStreamProvider {
    private final io.netty.resolver.dns.DnsServerAddresses addresses;

    UniSequentialDnsServerAddressStreamProvider(io.netty.resolver.dns.DnsServerAddresses r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "addresses"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.resolver.dns.DnsServerAddresses r2 = (io.netty.resolver.dns.DnsServerAddresses) r2
            r1.addresses = r2
            return
    }

    @Override // io.netty.resolver.dns.DnsServerAddressStreamProvider
    public final io.netty.resolver.dns.DnsServerAddressStream nameServerAddressStream(java.lang.String r1) {
            r0 = this;
            io.netty.resolver.dns.DnsServerAddresses r1 = r0.addresses
            io.netty.resolver.dns.DnsServerAddressStream r1 = r1.stream()
            return r1
    }
}
