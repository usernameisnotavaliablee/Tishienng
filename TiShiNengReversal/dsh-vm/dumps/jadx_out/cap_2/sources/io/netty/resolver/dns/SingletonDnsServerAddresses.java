package io.netty.resolver.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class SingletonDnsServerAddresses extends io.netty.resolver.dns.DnsServerAddresses {
    private final java.net.InetSocketAddress address;
    private final io.netty.resolver.dns.DnsServerAddressStream stream;


    SingletonDnsServerAddresses(java.net.InetSocketAddress r2) {
            r1 = this;
            r1.<init>()
            io.netty.resolver.dns.SingletonDnsServerAddresses$1 r0 = new io.netty.resolver.dns.SingletonDnsServerAddresses$1
            r0.<init>(r1)
            r1.stream = r0
            r1.address = r2
            return
    }

    static /* synthetic */ java.net.InetSocketAddress access$000(io.netty.resolver.dns.SingletonDnsServerAddresses r0) {
            java.net.InetSocketAddress r0 = r0.address
            return r0
    }

    @Override // io.netty.resolver.dns.DnsServerAddresses
    public io.netty.resolver.dns.DnsServerAddressStream stream() {
            r1 = this;
            io.netty.resolver.dns.DnsServerAddressStream r0 = r1.stream
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "singleton("
            r0.append(r1)
            java.net.InetSocketAddress r1 = r2.address
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
