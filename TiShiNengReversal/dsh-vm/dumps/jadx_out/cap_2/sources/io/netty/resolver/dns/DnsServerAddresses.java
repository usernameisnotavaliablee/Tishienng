package io.netty.resolver.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class DnsServerAddresses {



    public DnsServerAddresses() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public static java.util.List<java.net.InetSocketAddress> defaultAddressList() {
            java.util.List r0 = io.netty.resolver.dns.DefaultDnsServerAddressStreamProvider.defaultAddressList()
            return r0
    }

    @java.lang.Deprecated
    public static io.netty.resolver.dns.DnsServerAddresses defaultAddresses() {
            io.netty.resolver.dns.DnsServerAddresses r0 = io.netty.resolver.dns.DefaultDnsServerAddressStreamProvider.defaultAddresses()
            return r0
    }

    public static io.netty.resolver.dns.DnsServerAddresses rotational(java.lang.Iterable<? extends java.net.InetSocketAddress> r0) {
            java.util.List r0 = sanitize(r0)
            io.netty.resolver.dns.DnsServerAddresses r0 = rotational0(r0)
            return r0
    }

    public static io.netty.resolver.dns.DnsServerAddresses rotational(java.net.InetSocketAddress... r0) {
            java.util.List r0 = sanitize(r0)
            io.netty.resolver.dns.DnsServerAddresses r0 = rotational0(r0)
            return r0
    }

    private static io.netty.resolver.dns.DnsServerAddresses rotational0(java.util.List<java.net.InetSocketAddress> r2) {
            int r0 = r2.size()
            r1 = 1
            if (r0 != r1) goto L13
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            java.net.InetSocketAddress r2 = (java.net.InetSocketAddress) r2
            io.netty.resolver.dns.DnsServerAddresses r2 = singleton(r2)
            return r2
        L13:
            io.netty.resolver.dns.RotationalDnsServerAddresses r0 = new io.netty.resolver.dns.RotationalDnsServerAddresses
            r0.<init>(r2)
            return r0
    }

    private static java.util.List<java.net.InetSocketAddress> sanitize(java.lang.Iterable<? extends java.net.InetSocketAddress> r3) {
            if (r3 == 0) goto L5c
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L13
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r3
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            r0.<init>(r1)
            goto L19
        L13:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 4
            r0.<init>(r1)
        L19:
            java.util.Iterator r3 = r3.iterator()
        L1d:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L4d
            java.lang.Object r1 = r3.next()
            java.net.InetSocketAddress r1 = (java.net.InetSocketAddress) r1
            if (r1 != 0) goto L2c
            goto L4d
        L2c:
            boolean r2 = r1.isUnresolved()
            if (r2 != 0) goto L36
            r0.add(r1)
            goto L1d
        L36:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "cannot use an unresolved DNS server address: "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
        L4d:
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L54
            return r0
        L54:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "empty addresses"
            r3.<init>(r0)
            throw r3
        L5c:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "addresses"
            r3.<init>(r0)
            throw r3
    }

    private static java.util.List<java.net.InetSocketAddress> sanitize(java.net.InetSocketAddress[] r5) {
            if (r5 == 0) goto L40
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r5.length
            r0.<init>(r1)
            int r1 = r5.length
            r2 = 0
        La:
            if (r2 >= r1) goto L34
            r3 = r5[r2]
            if (r3 != 0) goto L11
            goto L34
        L11:
            boolean r4 = r3.isUnresolved()
            if (r4 != 0) goto L1d
            r0.add(r3)
            int r2 = r2 + 1
            goto La
        L1d:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "cannot use an unresolved DNS server address: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L34:
            boolean r5 = r0.isEmpty()
            if (r5 == 0) goto L3f
            java.util.List r5 = io.netty.resolver.dns.DefaultDnsServerAddressStreamProvider.defaultAddressList()
            return r5
        L3f:
            return r0
        L40:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "addresses"
            r5.<init>(r0)
            throw r5
    }

    public static io.netty.resolver.dns.DnsServerAddresses sequential(java.lang.Iterable<? extends java.net.InetSocketAddress> r0) {
            java.util.List r0 = sanitize(r0)
            io.netty.resolver.dns.DnsServerAddresses r0 = sequential0(r0)
            return r0
    }

    public static io.netty.resolver.dns.DnsServerAddresses sequential(java.net.InetSocketAddress... r0) {
            java.util.List r0 = sanitize(r0)
            io.netty.resolver.dns.DnsServerAddresses r0 = sequential0(r0)
            return r0
    }

    private static io.netty.resolver.dns.DnsServerAddresses sequential0(java.util.List<java.net.InetSocketAddress> r2) {
            int r0 = r2.size()
            r1 = 1
            if (r0 != r1) goto L13
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            java.net.InetSocketAddress r2 = (java.net.InetSocketAddress) r2
            io.netty.resolver.dns.DnsServerAddresses r2 = singleton(r2)
            return r2
        L13:
            io.netty.resolver.dns.DnsServerAddresses$1 r0 = new io.netty.resolver.dns.DnsServerAddresses$1
            java.lang.String r1 = "sequential"
            r0.<init>(r1, r2)
            return r0
    }

    public static io.netty.resolver.dns.DnsServerAddresses shuffled(java.lang.Iterable<? extends java.net.InetSocketAddress> r0) {
            java.util.List r0 = sanitize(r0)
            io.netty.resolver.dns.DnsServerAddresses r0 = shuffled0(r0)
            return r0
    }

    public static io.netty.resolver.dns.DnsServerAddresses shuffled(java.net.InetSocketAddress... r0) {
            java.util.List r0 = sanitize(r0)
            io.netty.resolver.dns.DnsServerAddresses r0 = shuffled0(r0)
            return r0
    }

    private static io.netty.resolver.dns.DnsServerAddresses shuffled0(java.util.List<java.net.InetSocketAddress> r2) {
            int r0 = r2.size()
            r1 = 1
            if (r0 != r1) goto L13
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            java.net.InetSocketAddress r2 = (java.net.InetSocketAddress) r2
            io.netty.resolver.dns.DnsServerAddresses r2 = singleton(r2)
            return r2
        L13:
            io.netty.resolver.dns.DnsServerAddresses$2 r0 = new io.netty.resolver.dns.DnsServerAddresses$2
            java.lang.String r1 = "shuffled"
            r0.<init>(r1, r2)
            return r0
    }

    public static io.netty.resolver.dns.DnsServerAddresses singleton(java.net.InetSocketAddress r3) {
            if (r3 == 0) goto L25
            boolean r0 = r3.isUnresolved()
            if (r0 != 0) goto Le
            io.netty.resolver.dns.SingletonDnsServerAddresses r0 = new io.netty.resolver.dns.SingletonDnsServerAddresses
            r0.<init>(r3)
            return r0
        Le:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "cannot use an unresolved DNS server address: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L25:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "address"
            r3.<init>(r0)
            throw r3
    }

    public abstract io.netty.resolver.dns.DnsServerAddressStream stream();
}
