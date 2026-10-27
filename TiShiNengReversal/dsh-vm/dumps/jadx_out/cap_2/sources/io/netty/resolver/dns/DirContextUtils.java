package io.netty.resolver.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class DirContextUtils {
    private static final io.netty.util.internal.logging.InternalLogger logger = null;

    static {
            java.lang.Class<io.netty.resolver.dns.DirContextUtils> r0 = io.netty.resolver.dns.DirContextUtils.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.resolver.dns.DirContextUtils.logger = r0
            return
    }

    private DirContextUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    static void addNameServers(java.util.List<java.net.InetSocketAddress> r7, int r8) {
            java.util.Hashtable r0 = new java.util.Hashtable
            r0.<init>()
            java.lang.String r1 = "java.naming.factory.initial"
            java.lang.String r2 = "com.sun.jndi.dns.DnsContextFactory"
            r0.put(r1, r2)
            java.lang.String r1 = "dns://"
            java.lang.String r2 = "java.naming.provider.url"
            r0.put(r2, r1)
            javax.naming.directory.InitialDirContext r1 = new javax.naming.directory.InitialDirContext     // Catch: javax.naming.NamingException -> L75
            r1.<init>(r0)     // Catch: javax.naming.NamingException -> L75
            java.util.Hashtable r0 = r1.getEnvironment()     // Catch: javax.naming.NamingException -> L75
            java.lang.Object r0 = r0.get(r2)     // Catch: javax.naming.NamingException -> L75
            java.lang.String r0 = (java.lang.String) r0     // Catch: javax.naming.NamingException -> L75
            if (r0 == 0) goto L75
            boolean r1 = r0.isEmpty()     // Catch: javax.naming.NamingException -> L75
            if (r1 != 0) goto L75
            java.lang.String r1 = " "
            java.lang.String[] r0 = r0.split(r1)     // Catch: javax.naming.NamingException -> L75
            int r1 = r0.length     // Catch: javax.naming.NamingException -> L75
            r2 = 0
        L32:
            if (r2 >= r1) goto L75
            r3 = r0[r2]     // Catch: javax.naming.NamingException -> L75
            java.net.URI r4 = new java.net.URI     // Catch: java.net.URISyntaxException -> L61 javax.naming.NamingException -> L75
            r4.<init>(r3)     // Catch: java.net.URISyntaxException -> L61 javax.naming.NamingException -> L75
            java.net.URI r5 = new java.net.URI     // Catch: java.net.URISyntaxException -> L61 javax.naming.NamingException -> L75
            r5.<init>(r3)     // Catch: java.net.URISyntaxException -> L61 javax.naming.NamingException -> L75
            java.lang.String r5 = r5.getHost()     // Catch: java.net.URISyntaxException -> L61 javax.naming.NamingException -> L75
            if (r5 == 0) goto L63
            boolean r5 = r5.isEmpty()     // Catch: java.net.URISyntaxException -> L61 javax.naming.NamingException -> L75
            if (r5 == 0) goto L4d
            goto L63
        L4d:
            int r5 = r4.getPort()     // Catch: java.net.URISyntaxException -> L61 javax.naming.NamingException -> L75
            java.lang.String r4 = r4.getHost()     // Catch: java.net.URISyntaxException -> L61 javax.naming.NamingException -> L75
            r6 = -1
            if (r5 != r6) goto L59
            r5 = r8
        L59:
            java.net.InetSocketAddress r4 = io.netty.util.internal.SocketUtils.socketAddress(r4, r5)     // Catch: java.net.URISyntaxException -> L61 javax.naming.NamingException -> L75
            r7.add(r4)     // Catch: java.net.URISyntaxException -> L61 javax.naming.NamingException -> L75
            goto L72
        L61:
            r4 = move-exception
            goto L6b
        L63:
            io.netty.util.internal.logging.InternalLogger r4 = io.netty.resolver.dns.DirContextUtils.logger     // Catch: java.net.URISyntaxException -> L61 javax.naming.NamingException -> L75
            java.lang.String r5 = "Skipping a nameserver URI as host portion could not be extracted: {}"
            r4.debug(r5, r3)     // Catch: java.net.URISyntaxException -> L61 javax.naming.NamingException -> L75
            goto L72
        L6b:
            io.netty.util.internal.logging.InternalLogger r5 = io.netty.resolver.dns.DirContextUtils.logger     // Catch: javax.naming.NamingException -> L75
            java.lang.String r6 = "Skipping a malformed nameserver URI: {}"
            r5.debug(r6, r3, r4)     // Catch: javax.naming.NamingException -> L75
        L72:
            int r2 = r2 + 1
            goto L32
        L75:
            return
    }
}
