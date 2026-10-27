package io.netty.resolver.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class RotationalDnsServerAddresses extends io.netty.resolver.dns.DefaultDnsServerAddresses {
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater<io.netty.resolver.dns.RotationalDnsServerAddresses> startIdxUpdater = null;
    private volatile int startIdx;

    static {
            java.lang.Class<io.netty.resolver.dns.RotationalDnsServerAddresses> r0 = io.netty.resolver.dns.RotationalDnsServerAddresses.class
            java.lang.String r1 = "startIdx"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            io.netty.resolver.dns.RotationalDnsServerAddresses.startIdxUpdater = r0
            return
    }

    RotationalDnsServerAddresses(java.util.List<java.net.InetSocketAddress> r2) {
            r1 = this;
            java.lang.String r0 = "rotational"
            r1.<init>(r0, r2)
            return
    }

    @Override // io.netty.resolver.dns.DnsServerAddresses
    public io.netty.resolver.dns.DnsServerAddressStream stream() {
            r3 = this;
        L0:
            int r0 = r3.startIdx
            int r1 = r0 + 1
            java.util.List<java.net.InetSocketAddress> r2 = r3.addresses
            int r2 = r2.size()
            if (r1 < r2) goto Ld
            r1 = 0
        Ld:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater<io.netty.resolver.dns.RotationalDnsServerAddresses> r2 = io.netty.resolver.dns.RotationalDnsServerAddresses.startIdxUpdater
            boolean r1 = r2.compareAndSet(r3, r0, r1)
            if (r1 == 0) goto L0
            io.netty.resolver.dns.SequentialDnsServerAddressStream r1 = new io.netty.resolver.dns.SequentialDnsServerAddressStream
            java.util.List<java.net.InetSocketAddress> r2 = r3.addresses
            r1.<init>(r2, r0)
            return r1
    }
}
