package io.netty.resolver.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class ShuffledDnsServerAddressStream implements io.netty.resolver.dns.DnsServerAddressStream {
    private final java.util.List<java.net.InetSocketAddress> addresses;
    private int i;

    ShuffledDnsServerAddressStream(java.util.List<java.net.InetSocketAddress> r1) {
            r0 = this;
            r0.<init>()
            r0.addresses = r1
            r0.shuffle()
            return
    }

    private ShuffledDnsServerAddressStream(java.util.List<java.net.InetSocketAddress> r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.addresses = r1
            r0.i = r2
            return
    }

    private void shuffle() {
            r2 = this;
            java.util.List<java.net.InetSocketAddress> r0 = r2.addresses
            java.util.Random r1 = io.netty.util.internal.PlatformDependent.threadLocalRandom()
            java.util.Collections.shuffle(r0, r1)
            return
    }

    @Override // io.netty.resolver.dns.DnsServerAddressStream
    public /* bridge */ /* synthetic */ io.netty.resolver.dns.DnsServerAddressStream duplicate() {
            r1 = this;
            io.netty.resolver.dns.ShuffledDnsServerAddressStream r0 = r1.duplicate()
            return r0
    }

    @Override // io.netty.resolver.dns.DnsServerAddressStream
    public io.netty.resolver.dns.ShuffledDnsServerAddressStream duplicate() {
            r3 = this;
            io.netty.resolver.dns.ShuffledDnsServerAddressStream r0 = new io.netty.resolver.dns.ShuffledDnsServerAddressStream
            java.util.List<java.net.InetSocketAddress> r1 = r3.addresses
            int r2 = r3.i
            r0.<init>(r1, r2)
            return r0
    }

    @Override // io.netty.resolver.dns.DnsServerAddressStream
    public java.net.InetSocketAddress next() {
            r3 = this;
            int r0 = r3.i
            java.util.List<java.net.InetSocketAddress> r1 = r3.addresses
            java.lang.Object r1 = r1.get(r0)
            java.net.InetSocketAddress r1 = (java.net.InetSocketAddress) r1
            int r0 = r0 + 1
            java.util.List<java.net.InetSocketAddress> r2 = r3.addresses
            int r2 = r2.size()
            if (r0 >= r2) goto L17
            r3.i = r0
            return r1
        L17:
            r0 = 0
            r3.i = r0
            r3.shuffle()
            return r1
    }

    @Override // io.netty.resolver.dns.DnsServerAddressStream
    public int size() {
            r1 = this;
            java.util.List<java.net.InetSocketAddress> r0 = r1.addresses
            int r0 = r0.size()
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            int r0 = r3.i
            java.util.List<java.net.InetSocketAddress> r1 = r3.addresses
            java.lang.String r2 = "shuffled"
            java.lang.String r0 = io.netty.resolver.dns.SequentialDnsServerAddressStream.toString(r2, r0, r1)
            return r0
    }
}
