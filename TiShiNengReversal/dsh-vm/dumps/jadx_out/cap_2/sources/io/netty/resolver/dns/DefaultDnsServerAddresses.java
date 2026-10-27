package io.netty.resolver.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
abstract class DefaultDnsServerAddresses extends io.netty.resolver.dns.DnsServerAddresses {
    protected final java.util.List<java.net.InetSocketAddress> addresses;
    private final java.lang.String strVal;

    DefaultDnsServerAddresses(java.lang.String r4, java.util.List<java.net.InetSocketAddress> r5) {
            r3 = this;
            r3.<init>()
            r3.addresses = r5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r4.length()
            int r1 = r1 + 2
            int r2 = r5.size()
            int r2 = r2 * 16
            int r1 = r1 + r2
            r0.<init>(r1)
            r0.append(r4)
            r4 = 40
            r0.append(r4)
            java.util.Iterator r4 = r5.iterator()
        L23:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L38
            java.lang.Object r5 = r4.next()
            java.net.InetSocketAddress r5 = (java.net.InetSocketAddress) r5
            r0.append(r5)
            java.lang.String r5 = ", "
            r0.append(r5)
            goto L23
        L38:
            int r4 = r0.length()
            int r4 = r4 + (-2)
            r0.setLength(r4)
            r4 = 41
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.strVal = r4
            return
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.strVal
            return r0
    }
}
