package io.netty.resolver.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class SequentialDnsServerAddressStream implements io.netty.resolver.dns.DnsServerAddressStream {
    private final java.util.List<? extends java.net.InetSocketAddress> addresses;
    private int i;

    SequentialDnsServerAddressStream(java.util.List<? extends java.net.InetSocketAddress> r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.addresses = r1
            r0.i = r2
            return
    }

    static java.lang.String toString(java.lang.String r3, int r4, java.util.Collection<? extends java.net.InetSocketAddress> r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r3.length()
            int r1 = r1 + 2
            int r2 = r5.size()
            int r2 = r2 * 16
            int r1 = r1 + r2
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = "(index: "
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = ", addrs: ("
            r0.append(r3)
            java.util.Iterator r3 = r5.iterator()
        L26:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L3b
            java.lang.Object r4 = r3.next()
            java.net.InetSocketAddress r4 = (java.net.InetSocketAddress) r4
            r0.append(r4)
            java.lang.String r4 = ", "
            r0.append(r4)
            goto L26
        L3b:
            int r3 = r0.length()
            int r3 = r3 + (-2)
            r0.setLength(r3)
            java.lang.String r3 = "))"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    @Override // io.netty.resolver.dns.DnsServerAddressStream
    public /* bridge */ /* synthetic */ io.netty.resolver.dns.DnsServerAddressStream duplicate() {
            r1 = this;
            io.netty.resolver.dns.SequentialDnsServerAddressStream r0 = r1.duplicate()
            return r0
    }

    @Override // io.netty.resolver.dns.DnsServerAddressStream
    public io.netty.resolver.dns.SequentialDnsServerAddressStream duplicate() {
            r3 = this;
            io.netty.resolver.dns.SequentialDnsServerAddressStream r0 = new io.netty.resolver.dns.SequentialDnsServerAddressStream
            java.util.List<? extends java.net.InetSocketAddress> r1 = r3.addresses
            int r2 = r3.i
            r0.<init>(r1, r2)
            return r0
    }

    @Override // io.netty.resolver.dns.DnsServerAddressStream
    public java.net.InetSocketAddress next() {
            r3 = this;
            int r0 = r3.i
            java.util.List<? extends java.net.InetSocketAddress> r1 = r3.addresses
            java.lang.Object r1 = r1.get(r0)
            java.net.InetSocketAddress r1 = (java.net.InetSocketAddress) r1
            int r0 = r0 + 1
            java.util.List<? extends java.net.InetSocketAddress> r2 = r3.addresses
            int r2 = r2.size()
            if (r0 >= r2) goto L17
            r3.i = r0
            return r1
        L17:
            r0 = 0
            r3.i = r0
            return r1
    }

    @Override // io.netty.resolver.dns.DnsServerAddressStream
    public int size() {
            r1 = this;
            java.util.List<? extends java.net.InetSocketAddress> r0 = r1.addresses
            int r0 = r0.size()
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            int r0 = r3.i
            java.util.List<? extends java.net.InetSocketAddress> r1 = r3.addresses
            java.lang.String r2 = "sequential"
            java.lang.String r0 = toString(r2, r0, r1)
            return r0
    }
}
