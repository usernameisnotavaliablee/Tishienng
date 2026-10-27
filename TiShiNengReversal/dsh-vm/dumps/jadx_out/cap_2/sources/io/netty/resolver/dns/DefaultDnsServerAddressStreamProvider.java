package io.netty.resolver.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class DefaultDnsServerAddressStreamProvider implements io.netty.resolver.dns.DnsServerAddressStreamProvider {
    private static final io.netty.resolver.dns.DnsServerAddresses DEFAULT_NAME_SERVERS = null;
    private static final java.util.List<java.net.InetSocketAddress> DEFAULT_NAME_SERVER_LIST = null;
    static final int DNS_PORT = 53;
    public static final io.netty.resolver.dns.DefaultDnsServerAddressStreamProvider INSTANCE = null;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;

    static {
            java.lang.Class<io.netty.resolver.dns.DefaultDnsServerAddressStreamProvider> r0 = io.netty.resolver.dns.DefaultDnsServerAddressStreamProvider.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.resolver.dns.DefaultDnsServerAddressStreamProvider.logger = r0
            io.netty.resolver.dns.DefaultDnsServerAddressStreamProvider r0 = new io.netty.resolver.dns.DefaultDnsServerAddressStreamProvider
            r0.<init>()
            io.netty.resolver.dns.DefaultDnsServerAddressStreamProvider.INSTANCE = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 2
            r0.<init>(r1)
            boolean r2 = io.netty.util.internal.PlatformDependent.isAndroid()
            r3 = 53
            if (r2 != 0) goto L20
            io.netty.resolver.dns.DirContextUtils.addNameServers(r0, r3)
        L20:
            int r2 = io.netty.util.internal.PlatformDependent.javaVersion()
            r4 = 9
            if (r2 >= r4) goto L6b
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L6b
            java.lang.String r2 = "sun.net.dns.ResolverConfiguration"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Exception -> L6a
            java.lang.String r4 = "open"
            r5 = 0
            java.lang.reflect.Method r4 = r2.getMethod(r4, r5)     // Catch: java.lang.Exception -> L6a
            java.lang.String r6 = "nameservers"
            java.lang.reflect.Method r2 = r2.getMethod(r6, r5)     // Catch: java.lang.Exception -> L6a
            java.lang.Object r4 = r4.invoke(r5, r5)     // Catch: java.lang.Exception -> L6a
            java.lang.Object r2 = r2.invoke(r4, r5)     // Catch: java.lang.Exception -> L6a
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Exception -> L6a
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Exception -> L6a
        L4f:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Exception -> L6a
            if (r4 == 0) goto L6b
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Exception -> L6a
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> L6a
            if (r4 == 0) goto L4f
            java.net.InetSocketAddress r5 = new java.net.InetSocketAddress     // Catch: java.lang.Exception -> L6a
            java.net.InetAddress r4 = io.netty.util.internal.SocketUtils.addressByName(r4)     // Catch: java.lang.Exception -> L6a
            r5.<init>(r4, r3)     // Catch: java.lang.Exception -> L6a
            r0.add(r5)     // Catch: java.lang.Exception -> L6a
            goto L4f
        L6a:
        L6b:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L7f
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.resolver.dns.DefaultDnsServerAddressStreamProvider.logger
            boolean r2 = r1.isDebugEnabled()
            if (r2 == 0) goto Lcc
            java.lang.String r2 = "Default DNS servers: {} (sun.net.dns.ResolverConfiguration)"
            r1.debug(r2, r0)
            goto Lcc
        L7f:
            boolean r2 = io.netty.util.NetUtil.isIpV6AddressesPreferred()
            r4 = 1
            r5 = 0
            if (r2 != 0) goto Laa
            java.net.InetAddress r2 = io.netty.util.NetUtil.LOCALHOST
            boolean r2 = r2 instanceof java.net.Inet6Address
            if (r2 == 0) goto L94
            boolean r2 = io.netty.util.NetUtil.isIpV4StackPreferred()
            if (r2 != 0) goto L94
            goto Laa
        L94:
            java.lang.String r2 = "8.8.8.8"
            java.net.InetSocketAddress r2 = io.netty.util.internal.SocketUtils.socketAddress(r2, r3)
            java.lang.String r6 = "8.8.4.4"
            java.net.InetSocketAddress r3 = io.netty.util.internal.SocketUtils.socketAddress(r6, r3)
            java.net.InetSocketAddress[] r1 = new java.net.InetSocketAddress[r1]
            r1[r5] = r2
            r1[r4] = r3
            java.util.Collections.addAll(r0, r1)
            goto Lbf
        Laa:
            java.lang.String r2 = "2001:4860:4860::8888"
            java.net.InetSocketAddress r2 = io.netty.util.internal.SocketUtils.socketAddress(r2, r3)
            java.lang.String r6 = "2001:4860:4860::8844"
            java.net.InetSocketAddress r3 = io.netty.util.internal.SocketUtils.socketAddress(r6, r3)
            java.net.InetSocketAddress[] r1 = new java.net.InetSocketAddress[r1]
            r1[r5] = r2
            r1[r4] = r3
            java.util.Collections.addAll(r0, r1)
        Lbf:
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.resolver.dns.DefaultDnsServerAddressStreamProvider.logger
            boolean r2 = r1.isWarnEnabled()
            if (r2 == 0) goto Lcc
            java.lang.String r2 = "Default DNS servers: {} (Google Public DNS as a fallback)"
            r1.warn(r2, r0)
        Lcc:
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            io.netty.resolver.dns.DefaultDnsServerAddressStreamProvider.DEFAULT_NAME_SERVER_LIST = r0
            io.netty.resolver.dns.DnsServerAddresses r0 = io.netty.resolver.dns.DnsServerAddresses.sequential(r0)
            io.netty.resolver.dns.DefaultDnsServerAddressStreamProvider.DEFAULT_NAME_SERVERS = r0
            return
    }

    private DefaultDnsServerAddressStreamProvider() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.util.List<java.net.InetSocketAddress> defaultAddressList() {
            java.util.List<java.net.InetSocketAddress> r0 = io.netty.resolver.dns.DefaultDnsServerAddressStreamProvider.DEFAULT_NAME_SERVER_LIST
            return r0
    }

    public static io.netty.resolver.dns.DnsServerAddresses defaultAddresses() {
            io.netty.resolver.dns.DnsServerAddresses r0 = io.netty.resolver.dns.DefaultDnsServerAddressStreamProvider.DEFAULT_NAME_SERVERS
            return r0
    }

    @Override // io.netty.resolver.dns.DnsServerAddressStreamProvider
    public io.netty.resolver.dns.DnsServerAddressStream nameServerAddressStream(java.lang.String r1) {
            r0 = this;
            io.netty.resolver.dns.DnsServerAddresses r1 = io.netty.resolver.dns.DefaultDnsServerAddressStreamProvider.DEFAULT_NAME_SERVERS
            io.netty.resolver.dns.DnsServerAddressStream r1 = r1.stream()
            return r1
    }
}
