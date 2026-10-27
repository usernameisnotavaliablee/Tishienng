package io.netty.resolver.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class MultiDnsServerAddressStreamProvider implements io.netty.resolver.dns.DnsServerAddressStreamProvider {
    private final io.netty.resolver.dns.DnsServerAddressStreamProvider[] providers;

    public MultiDnsServerAddressStreamProvider(java.util.List<io.netty.resolver.dns.DnsServerAddressStreamProvider> r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            io.netty.resolver.dns.DnsServerAddressStreamProvider[] r0 = new io.netty.resolver.dns.DnsServerAddressStreamProvider[r0]
            java.lang.Object[] r2 = r2.toArray(r0)
            io.netty.resolver.dns.DnsServerAddressStreamProvider[] r2 = (io.netty.resolver.dns.DnsServerAddressStreamProvider[]) r2
            r1.providers = r2
            return
    }

    public MultiDnsServerAddressStreamProvider(io.netty.resolver.dns.DnsServerAddressStreamProvider... r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = r1.clone()
            io.netty.resolver.dns.DnsServerAddressStreamProvider[] r1 = (io.netty.resolver.dns.DnsServerAddressStreamProvider[]) r1
            r0.providers = r1
            return
    }

    @Override // io.netty.resolver.dns.DnsServerAddressStreamProvider
    public io.netty.resolver.dns.DnsServerAddressStream nameServerAddressStream(java.lang.String r5) {
            r4 = this;
            io.netty.resolver.dns.DnsServerAddressStreamProvider[] r0 = r4.providers
            int r1 = r0.length
            r2 = 0
        L4:
            if (r2 >= r1) goto L12
            r3 = r0[r2]
            io.netty.resolver.dns.DnsServerAddressStream r3 = r3.nameServerAddressStream(r5)
            if (r3 == 0) goto Lf
            return r3
        Lf:
            int r2 = r2 + 1
            goto L4
        L12:
            r5 = 0
            return r5
    }
}
