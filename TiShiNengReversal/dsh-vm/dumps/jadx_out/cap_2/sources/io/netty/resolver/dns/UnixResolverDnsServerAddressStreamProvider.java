package io.netty.resolver.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class UnixResolverDnsServerAddressStreamProvider implements io.netty.resolver.dns.DnsServerAddressStreamProvider {
    static final int DEFAULT_NDOTS = 1;
    private static final java.lang.String DOMAIN_ROW_LABEL = "domain";
    private static final java.lang.String ETC_RESOLVER_DIR = "/etc/resolver";
    private static final java.lang.String ETC_RESOLV_CONF_FILE = "/etc/resolv.conf";
    private static final java.lang.String NAMESERVER_ROW_LABEL = "nameserver";
    private static final java.lang.String NDOTS_LABEL = "ndots:";
    private static final java.lang.String OPTIONS_ROW_LABEL = "options";
    private static final java.lang.String PORT_ROW_LABEL = "port";
    private static final java.util.regex.Pattern SEARCH_DOMAIN_PATTERN = null;
    private static final java.lang.String SEARCH_ROW_LABEL = "search";
    private static final java.lang.String SORTLIST_ROW_LABEL = "sortlist";
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private final io.netty.resolver.dns.DnsServerAddresses defaultNameServerAddresses;
    private final java.util.Map<java.lang.String, io.netty.resolver.dns.DnsServerAddresses> domainToNameServerStreamMap;

    static {
            java.lang.Class<io.netty.resolver.dns.UnixResolverDnsServerAddressStreamProvider> r0 = io.netty.resolver.dns.UnixResolverDnsServerAddressStreamProvider.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.resolver.dns.UnixResolverDnsServerAddressStreamProvider.logger = r0
            java.lang.String r0 = "\\s+"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            io.netty.resolver.dns.UnixResolverDnsServerAddressStreamProvider.SEARCH_DOMAIN_PATTERN = r0
            return
    }

    public UnixResolverDnsServerAddressStreamProvider(java.io.File r5, java.io.File... r6) throws java.io.IOException {
            r4 = this;
            r4.<init>()
            java.lang.String r0 = "etcResolvConf"
            java.lang.Object r0 = io.netty.util.internal.ObjectUtil.checkNotNull(r5, r0)
            java.io.File r0 = (java.io.File) r0
            r1 = 1
            java.io.File[] r2 = new java.io.File[r1]
            r3 = 0
            r2[r3] = r0
            java.util.Map r0 = parse(r2)
            if (r6 == 0) goto L1b
            int r2 = r6.length
            if (r2 == 0) goto L1b
            goto L1c
        L1b:
            r1 = 0
        L1c:
            if (r1 == 0) goto L23
            java.util.Map r6 = parse(r6)
            goto L24
        L23:
            r6 = r0
        L24:
            r4.domainToNameServerStreamMap = r6
            java.lang.String r2 = r5.getName()
            java.lang.Object r2 = r0.get(r2)
            io.netty.resolver.dns.DnsServerAddresses r2 = (io.netty.resolver.dns.DnsServerAddresses) r2
            if (r2 != 0) goto L60
            java.util.Collection r2 = r0.values()
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L49
            java.util.Iterator r5 = r2.iterator()
            java.lang.Object r5 = r5.next()
            io.netty.resolver.dns.DnsServerAddresses r5 = (io.netty.resolver.dns.DnsServerAddresses) r5
            r4.defaultNameServerAddresses = r5
            goto L62
        L49:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r5 = " didn't provide any name servers"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
        L60:
            r4.defaultNameServerAddresses = r2
        L62:
            if (r1 == 0) goto L67
            r6.putAll(r0)
        L67:
            return
    }

    public UnixResolverDnsServerAddressStreamProvider(java.lang.String r3, java.lang.String r4) throws java.io.IOException {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L5
            r1 = r0
            goto La
        L5:
            java.io.File r1 = new java.io.File
            r1.<init>(r3)
        La:
            if (r4 != 0) goto Ld
            goto L16
        Ld:
            java.io.File r3 = new java.io.File
            r3.<init>(r4)
            java.io.File[] r0 = r3.listFiles()
        L16:
            r2.<init>(r1, r0)
            return
    }

    private boolean mayOverrideNameServers() {
            r1 = this;
            java.util.Map<java.lang.String, io.netty.resolver.dns.DnsServerAddresses> r0 = r1.domainToNameServerStreamMap
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L17
            io.netty.resolver.dns.DnsServerAddresses r0 = r1.defaultNameServerAddresses
            io.netty.resolver.dns.DnsServerAddressStream r0 = r0.stream()
            java.net.InetSocketAddress r0 = r0.next()
            if (r0 == 0) goto L15
            goto L17
        L15:
            r0 = 0
            return r0
        L17:
            r0 = 1
            return r0
    }

    private static java.util.Map<java.lang.String, io.netty.resolver.dns.DnsServerAddresses> parse(java.io.File... r17) throws java.io.IOException {
            r0 = r17
            java.lang.String r1 = "sortlist"
            java.util.HashMap r2 = new java.util.HashMap
            int r3 = r0.length
            int r3 = r3 << 1
            r2.<init>(r3)
            int r3 = r0.length
            r4 = 0
            r5 = 0
        Lf:
            if (r5 >= r3) goto L182
            r6 = r0[r5]
            boolean r7 = r6.isFile()
            if (r7 != 0) goto L1c
            r10 = 0
            goto L172
        L1c:
            java.io.FileReader r7 = new java.io.FileReader
            r7.<init>(r6)
            r8 = 0
            java.io.BufferedReader r9 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L177
            r9.<init>(r7)     // Catch: java.lang.Throwable -> L177
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L90
            r10 = 2
            r8.<init>(r10)     // Catch: java.lang.Throwable -> L90
            java.lang.String r11 = r6.getName()     // Catch: java.lang.Throwable -> L90
            r12 = 53
        L33:
            java.lang.String r13 = r9.readLine()     // Catch: java.lang.Throwable -> L90
            if (r13 == 0) goto L165
            java.lang.String r13 = r13.trim()     // Catch: java.lang.Throwable -> L90
            boolean r14 = r13.isEmpty()     // Catch: java.lang.Throwable -> L90
            if (r14 != 0) goto L4f
            char r14 = r13.charAt(r4)     // Catch: java.lang.Throwable -> L90
            r15 = 35
            if (r14 == r15) goto L4f
            r15 = 59
            if (r14 != r15) goto L51
        L4f:
            r10 = 0
            goto Lb9
        L51:
            java.lang.String r14 = "nameserver"
            boolean r14 = r13.startsWith(r14)     // Catch: java.lang.Throwable -> L90
            if (r14 == 0) goto Ld9
            r14 = 10
            int r14 = io.netty.util.internal.StringUtil.indexOfNonWhiteSpace(r13, r14)     // Catch: java.lang.Throwable -> L90
            java.lang.String r15 = "error parsing label nameserver in file "
            if (r14 < 0) goto Lbc
            java.lang.String r14 = r13.substring(r14)     // Catch: java.lang.Throwable -> L90
            boolean r16 = io.netty.util.NetUtil.isValidIpV4Address(r14)     // Catch: java.lang.Throwable -> L90
            if (r16 != 0) goto Lb1
            boolean r16 = io.netty.util.NetUtil.isValidIpV6Address(r14)     // Catch: java.lang.Throwable -> L90
            if (r16 != 0) goto Lb1
            r12 = 46
            int r12 = r14.lastIndexOf(r12)     // Catch: java.lang.Throwable -> L90
            int r10 = r12 + 1
            int r4 = r14.length()     // Catch: java.lang.Throwable -> L90
            if (r10 >= r4) goto L94
            java.lang.String r4 = r14.substring(r10)     // Catch: java.lang.Throwable -> L90
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.Throwable -> L90
            r10 = 0
            java.lang.String r14 = r14.substring(r10, r12)     // Catch: java.lang.Throwable -> L90
            r12 = r4
            goto Lb2
        L90:
            r0 = move-exception
            r8 = r9
            goto L178
        L94:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L90
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L90
            r1.<init>()     // Catch: java.lang.Throwable -> L90
            r1.append(r15)     // Catch: java.lang.Throwable -> L90
            r1.append(r6)     // Catch: java.lang.Throwable -> L90
            java.lang.String r2 = ". invalid IP value: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L90
            r1.append(r13)     // Catch: java.lang.Throwable -> L90
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L90
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L90
            throw r0     // Catch: java.lang.Throwable -> L90
        Lb1:
            r10 = 0
        Lb2:
            java.net.InetSocketAddress r4 = io.netty.util.internal.SocketUtils.socketAddress(r14, r12)     // Catch: java.lang.Throwable -> L90
            r8.add(r4)     // Catch: java.lang.Throwable -> L90
        Lb9:
            r15 = 2
            goto L161
        Lbc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L90
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L90
            r1.<init>()     // Catch: java.lang.Throwable -> L90
            r1.append(r15)     // Catch: java.lang.Throwable -> L90
            r1.append(r6)     // Catch: java.lang.Throwable -> L90
            java.lang.String r2 = ". value: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L90
            r1.append(r13)     // Catch: java.lang.Throwable -> L90
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L90
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L90
            throw r0     // Catch: java.lang.Throwable -> L90
        Ld9:
            r10 = 0
            java.lang.String r4 = "domain"
            boolean r4 = r13.startsWith(r4)     // Catch: java.lang.Throwable -> L90
            java.lang.String r14 = " value: "
            if (r4 == 0) goto L11d
            r4 = 6
            int r4 = io.netty.util.internal.StringUtil.indexOfNonWhiteSpace(r13, r4)     // Catch: java.lang.Throwable -> L90
            if (r4 < 0) goto L100
            java.lang.String r4 = r13.substring(r4)     // Catch: java.lang.Throwable -> L90
            boolean r11 = r8.isEmpty()     // Catch: java.lang.Throwable -> L90
            if (r11 != 0) goto Lf8
            putIfAbsent(r2, r4, r8)     // Catch: java.lang.Throwable -> L90
        Lf8:
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L90
            r15 = 2
            r8.<init>(r15)     // Catch: java.lang.Throwable -> L90
            r11 = r4
            goto L161
        L100:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L90
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L90
            r1.<init>()     // Catch: java.lang.Throwable -> L90
            java.lang.String r2 = "error parsing label domain in file "
            r1.append(r2)     // Catch: java.lang.Throwable -> L90
            r1.append(r6)     // Catch: java.lang.Throwable -> L90
            r1.append(r14)     // Catch: java.lang.Throwable -> L90
            r1.append(r13)     // Catch: java.lang.Throwable -> L90
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L90
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L90
            throw r0     // Catch: java.lang.Throwable -> L90
        L11d:
            r15 = 2
            java.lang.String r4 = "port"
            boolean r4 = r13.startsWith(r4)     // Catch: java.lang.Throwable -> L90
            if (r4 == 0) goto L154
            r4 = 4
            int r4 = io.netty.util.internal.StringUtil.indexOfNonWhiteSpace(r13, r4)     // Catch: java.lang.Throwable -> L90
            if (r4 < 0) goto L137
            java.lang.String r4 = r13.substring(r4)     // Catch: java.lang.Throwable -> L90
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.Throwable -> L90
            r12 = r4
            goto L161
        L137:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L90
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L90
            r1.<init>()     // Catch: java.lang.Throwable -> L90
            java.lang.String r2 = "error parsing label port in file "
            r1.append(r2)     // Catch: java.lang.Throwable -> L90
            r1.append(r6)     // Catch: java.lang.Throwable -> L90
            r1.append(r14)     // Catch: java.lang.Throwable -> L90
            r1.append(r13)     // Catch: java.lang.Throwable -> L90
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L90
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L90
            throw r0     // Catch: java.lang.Throwable -> L90
        L154:
            boolean r4 = r13.startsWith(r1)     // Catch: java.lang.Throwable -> L90
            if (r4 == 0) goto L161
            io.netty.util.internal.logging.InternalLogger r4 = io.netty.resolver.dns.UnixResolverDnsServerAddressStreamProvider.logger     // Catch: java.lang.Throwable -> L90
            java.lang.String r14 = "row type {} not supported. ignoring line: {}"
            r4.info(r14, r1, r13)     // Catch: java.lang.Throwable -> L90
        L161:
            r4 = 0
            r10 = 2
            goto L33
        L165:
            r10 = 0
            boolean r4 = r8.isEmpty()     // Catch: java.lang.Throwable -> L90
            if (r4 != 0) goto L16f
            putIfAbsent(r2, r11, r8)     // Catch: java.lang.Throwable -> L90
        L16f:
            r9.close()
        L172:
            int r5 = r5 + 1
            r4 = 0
            goto Lf
        L177:
            r0 = move-exception
        L178:
            if (r8 != 0) goto L17e
            r7.close()
            goto L181
        L17e:
            r8.close()
        L181:
            throw r0
        L182:
            return r2
    }

    static int parseEtcResolverFirstNdots() throws java.io.IOException {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "/etc/resolv.conf"
            r0.<init>(r1)
            int r0 = parseEtcResolverFirstNdots(r0)
            return r0
    }

    static int parseEtcResolverFirstNdots(java.io.File r5) throws java.io.IOException {
            java.io.FileReader r0 = new java.io.FileReader
            r0.<init>(r5)
            r5 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L43
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L43
        Lb:
            java.lang.String r5 = r1.readLine()     // Catch: java.lang.Throwable -> L30
            if (r5 == 0) goto L3e
            java.lang.String r2 = "options"
            boolean r2 = r5.startsWith(r2)     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto Lb
            java.lang.String r2 = "ndots:"
            int r2 = r5.indexOf(r2)     // Catch: java.lang.Throwable -> L30
            if (r2 < 0) goto L3e
            int r2 = r2 + 6
            r3 = 32
            int r3 = r5.indexOf(r3, r2)     // Catch: java.lang.Throwable -> L30
            if (r3 >= 0) goto L32
            int r3 = r5.length()     // Catch: java.lang.Throwable -> L30
            goto L32
        L30:
            r5 = move-exception
            goto L47
        L32:
            java.lang.String r5 = r5.substring(r2, r3)     // Catch: java.lang.Throwable -> L30
            int r5 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.Throwable -> L30
            r1.close()
            return r5
        L3e:
            r1.close()
            r5 = 1
            return r5
        L43:
            r1 = move-exception
            r4 = r1
            r1 = r5
            r5 = r4
        L47:
            if (r1 != 0) goto L4d
            r0.close()
            goto L50
        L4d:
            r1.close()
        L50:
            throw r5
    }

    static java.util.List<java.lang.String> parseEtcResolverSearchDomains() throws java.io.IOException {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "/etc/resolv.conf"
            r0.<init>(r1)
            java.util.List r0 = parseEtcResolverSearchDomains(r0)
            return r0
    }

    static java.util.List<java.lang.String> parseEtcResolverSearchDomains(java.io.File r6) throws java.io.IOException {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.io.FileReader r1 = new java.io.FileReader
            r1.<init>(r6)
            r6 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L5b
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L5b
        L10:
            java.lang.String r3 = r2.readLine()     // Catch: java.lang.Throwable -> L2c
            if (r3 == 0) goto L4a
            r4 = 6
            if (r6 != 0) goto L2e
            java.lang.String r5 = "domain"
            boolean r5 = r3.startsWith(r5)     // Catch: java.lang.Throwable -> L2c
            if (r5 == 0) goto L2e
            int r4 = io.netty.util.internal.StringUtil.indexOfNonWhiteSpace(r3, r4)     // Catch: java.lang.Throwable -> L2c
            if (r4 < 0) goto L10
            java.lang.String r6 = r3.substring(r4)     // Catch: java.lang.Throwable -> L2c
            goto L10
        L2c:
            r6 = move-exception
            goto L5e
        L2e:
            java.lang.String r5 = "search"
            boolean r5 = r3.startsWith(r5)     // Catch: java.lang.Throwable -> L2c
            if (r5 == 0) goto L10
            int r4 = io.netty.util.internal.StringUtil.indexOfNonWhiteSpace(r3, r4)     // Catch: java.lang.Throwable -> L2c
            if (r4 < 0) goto L10
            java.util.regex.Pattern r5 = io.netty.resolver.dns.UnixResolverDnsServerAddressStreamProvider.SEARCH_DOMAIN_PATTERN     // Catch: java.lang.Throwable -> L2c
            java.lang.String r3 = r3.substring(r4)     // Catch: java.lang.Throwable -> L2c
            java.lang.String[] r3 = r5.split(r3)     // Catch: java.lang.Throwable -> L2c
            java.util.Collections.addAll(r0, r3)     // Catch: java.lang.Throwable -> L2c
            goto L10
        L4a:
            r2.close()
            if (r6 == 0) goto L5a
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L5a
            java.util.List r6 = java.util.Collections.singletonList(r6)
            return r6
        L5a:
            return r0
        L5b:
            r0 = move-exception
            r2 = r6
            r6 = r0
        L5e:
            if (r2 != 0) goto L64
            r1.close()
            goto L67
        L64:
            r2.close()
        L67:
            throw r6
    }

    static io.netty.resolver.dns.DnsServerAddressStreamProvider parseSilently() {
            java.lang.String r0 = "/etc/resolver"
            java.lang.String r1 = "/etc/resolv.conf"
            io.netty.resolver.dns.UnixResolverDnsServerAddressStreamProvider r2 = new io.netty.resolver.dns.UnixResolverDnsServerAddressStreamProvider     // Catch: java.lang.Exception -> L13
            r2.<init>(r1, r0)     // Catch: java.lang.Exception -> L13
            boolean r3 = r2.mayOverrideNameServers()     // Catch: java.lang.Exception -> L13
            if (r3 == 0) goto L10
            return r2
        L10:
            io.netty.resolver.dns.DefaultDnsServerAddressStreamProvider r0 = io.netty.resolver.dns.DefaultDnsServerAddressStreamProvider.INSTANCE     // Catch: java.lang.Exception -> L13
            return r0
        L13:
            r2 = move-exception
            io.netty.util.internal.logging.InternalLogger r3 = io.netty.resolver.dns.UnixResolverDnsServerAddressStreamProvider.logger
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r1
            r1 = 1
            r4[r1] = r0
            r0 = 2
            r4[r0] = r2
            java.lang.String r0 = "failed to parse {} and/or {}"
            r3.debug(r0, r4)
            io.netty.resolver.dns.DefaultDnsServerAddressStreamProvider r0 = io.netty.resolver.dns.DefaultDnsServerAddressStreamProvider.INSTANCE
            return r0
    }

    private static void putIfAbsent(java.util.Map<java.lang.String, io.netty.resolver.dns.DnsServerAddresses> r3, java.lang.String r4, io.netty.resolver.dns.DnsServerAddresses r5) {
            java.lang.Object r0 = r3.put(r4, r5)
            io.netty.resolver.dns.DnsServerAddresses r0 = (io.netty.resolver.dns.DnsServerAddresses) r0
            if (r0 == 0) goto L1e
            r3.put(r4, r0)
            io.netty.util.internal.logging.InternalLogger r3 = io.netty.resolver.dns.UnixResolverDnsServerAddressStreamProvider.logger
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            r1[r4] = r0
            r4 = 2
            r1[r4] = r5
            java.lang.String r4 = "Domain name {} already maps to addresses {} so new addresses {} will be discarded"
            r3.debug(r4, r1)
        L1e:
            return
    }

    private static void putIfAbsent(java.util.Map<java.lang.String, io.netty.resolver.dns.DnsServerAddresses> r0, java.lang.String r1, java.util.List<java.net.InetSocketAddress> r2) {
            io.netty.resolver.dns.DnsServerAddresses r2 = io.netty.resolver.dns.DnsServerAddresses.sequential(r2)
            putIfAbsent(r0, r1, r2)
            return
    }

    @Override // io.netty.resolver.dns.DnsServerAddressStreamProvider
    public io.netty.resolver.dns.DnsServerAddressStream nameServerAddressStream(java.lang.String r4) {
            r3 = this;
        L0:
            r0 = 46
            r1 = 1
            int r0 = r4.indexOf(r0, r1)
            if (r0 < 0) goto L27
            int r2 = r4.length()
            int r2 = r2 - r1
            if (r0 != r2) goto L11
            goto L27
        L11:
            java.util.Map<java.lang.String, io.netty.resolver.dns.DnsServerAddresses> r1 = r3.domainToNameServerStreamMap
            java.lang.Object r1 = r1.get(r4)
            io.netty.resolver.dns.DnsServerAddresses r1 = (io.netty.resolver.dns.DnsServerAddresses) r1
            if (r1 == 0) goto L20
            io.netty.resolver.dns.DnsServerAddressStream r4 = r1.stream()
            return r4
        L20:
            int r0 = r0 + 1
            java.lang.String r4 = r4.substring(r0)
            goto L0
        L27:
            io.netty.resolver.dns.DnsServerAddresses r4 = r3.defaultNameServerAddresses
            io.netty.resolver.dns.DnsServerAddressStream r4 = r4.stream()
            return r4
    }
}
