package io.netty.resolver;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class HostsFileParser {
    private static final java.util.regex.Pattern WHITESPACES = null;
    private static final java.lang.String WINDOWS_DEFAULT_SYSTEM_ROOT = "C:\\Windows";
    private static final java.lang.String WINDOWS_HOSTS_FILE_RELATIVE_PATH = "\\system32\\drivers\\etc\\hosts";
    private static final java.lang.String X_PLATFORMS_HOSTS_FILE_PATH = "/etc/hosts";
    private static final io.netty.util.internal.logging.InternalLogger logger = null;

    static {
            java.lang.String r0 = "[ \t]+"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            io.netty.resolver.HostsFileParser.WHITESPACES = r0
            java.lang.Class<io.netty.resolver.HostsFileParser> r0 = io.netty.resolver.HostsFileParser.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.resolver.HostsFileParser.logger = r0
            return
    }

    private HostsFileParser() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.io.File locateHostsFile() {
            boolean r0 = io.netty.util.internal.PlatformDependent.isWindows()
            if (r0 == 0) goto L30
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "SystemRoot"
            java.lang.String r2 = java.lang.System.getenv(r2)
            r1.append(r2)
            java.lang.String r2 = "\\system32\\drivers\\etc\\hosts"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L2f
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "C:\\Windows\\system32\\drivers\\etc\\hosts"
            r0.<init>(r1)
        L2f:
            return r0
        L30:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "/etc/hosts"
            r0.<init>(r1)
            return r0
    }

    public static io.netty.resolver.HostsFileEntries parse() throws java.io.IOException {
            java.io.File r0 = locateHostsFile()
            io.netty.resolver.HostsFileEntries r0 = parse(r0)
            return r0
    }

    public static io.netty.resolver.HostsFileEntries parse(java.io.File r3) throws java.io.IOException {
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
            r1 = 1
            java.nio.charset.Charset[] r1 = new java.nio.charset.Charset[r1]
            r2 = 0
            r1[r2] = r0
            io.netty.resolver.HostsFileEntries r3 = parse(r3, r1)
            return r3
    }

    public static io.netty.resolver.HostsFileEntries parse(java.io.File r6, java.nio.charset.Charset... r7) throws java.io.IOException {
            java.lang.String r0 = "file"
            io.netty.util.internal.ObjectUtil.checkNotNull(r6, r0)
            java.lang.String r0 = "charsets"
            io.netty.util.internal.ObjectUtil.checkNotNull(r7, r0)
            boolean r0 = r6.exists()
            if (r0 == 0) goto L37
            boolean r0 = r6.isFile()
            if (r0 == 0) goto L37
            int r0 = r7.length
            r1 = 0
        L18:
            if (r1 >= r0) goto L37
            r2 = r7[r1]
            java.io.BufferedReader r3 = new java.io.BufferedReader
            java.io.InputStreamReader r4 = new java.io.InputStreamReader
            java.io.FileInputStream r5 = new java.io.FileInputStream
            r5.<init>(r6)
            r4.<init>(r5, r2)
            r3.<init>(r4)
            io.netty.resolver.HostsFileEntries r2 = parse(r3)
            io.netty.resolver.HostsFileEntries r3 = io.netty.resolver.HostsFileEntries.EMPTY
            if (r2 == r3) goto L34
            return r2
        L34:
            int r1 = r1 + 1
            goto L18
        L37:
            io.netty.resolver.HostsFileEntries r6 = io.netty.resolver.HostsFileEntries.EMPTY
            return r6
    }

    public static io.netty.resolver.HostsFileEntries parse(java.io.Reader r10) throws java.io.IOException {
            java.lang.String r0 = "Failed to close a reader"
            java.lang.String r1 = "reader"
            io.netty.util.internal.ObjectUtil.checkNotNull(r10, r1)
            java.io.BufferedReader r1 = new java.io.BufferedReader
            r1.<init>(r10)
            java.util.HashMap r10 = new java.util.HashMap     // Catch: java.lang.Throwable -> L2b
            r10.<init>()     // Catch: java.lang.Throwable -> L2b
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.Throwable -> L2b
            r2.<init>()     // Catch: java.lang.Throwable -> L2b
        L16:
            java.lang.String r3 = r1.readLine()     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto La4
            r4 = 35
            int r4 = r3.indexOf(r4)     // Catch: java.lang.Throwable -> L2b
            r5 = -1
            r6 = 0
            if (r4 == r5) goto L2e
            java.lang.String r3 = r3.substring(r6, r4)     // Catch: java.lang.Throwable -> L2b
            goto L2e
        L2b:
            r10 = move-exception
            goto Lc4
        L2e:
            java.lang.String r3 = r3.trim()     // Catch: java.lang.Throwable -> L2b
            boolean r4 = r3.isEmpty()     // Catch: java.lang.Throwable -> L2b
            if (r4 == 0) goto L39
            goto L16
        L39:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2b
            r4.<init>()     // Catch: java.lang.Throwable -> L2b
            java.util.regex.Pattern r5 = io.netty.resolver.HostsFileParser.WHITESPACES     // Catch: java.lang.Throwable -> L2b
            java.lang.String[] r3 = r5.split(r3)     // Catch: java.lang.Throwable -> L2b
            int r5 = r3.length     // Catch: java.lang.Throwable -> L2b
            r7 = 0
        L46:
            if (r7 >= r5) goto L56
            r8 = r3[r7]     // Catch: java.lang.Throwable -> L2b
            boolean r9 = r8.isEmpty()     // Catch: java.lang.Throwable -> L2b
            if (r9 != 0) goto L53
            r4.add(r8)     // Catch: java.lang.Throwable -> L2b
        L53:
            int r7 = r7 + 1
            goto L46
        L56:
            int r3 = r4.size()     // Catch: java.lang.Throwable -> L2b
            r5 = 2
            if (r3 >= r5) goto L5e
            goto L16
        L5e:
            java.lang.Object r3 = r4.get(r6)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L2b
            byte[] r3 = io.netty.util.NetUtil.createByteArrayFromIpAddressString(r3)     // Catch: java.lang.Throwable -> L2b
            if (r3 != 0) goto L6b
            goto L16
        L6b:
            r5 = 1
        L6c:
            int r6 = r4.size()     // Catch: java.lang.Throwable -> L2b
            if (r5 >= r6) goto L16
            java.lang.Object r6 = r4.get(r5)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L2b
            java.util.Locale r7 = java.util.Locale.ENGLISH     // Catch: java.lang.Throwable -> L2b
            java.lang.String r7 = r6.toLowerCase(r7)     // Catch: java.lang.Throwable -> L2b
            java.net.InetAddress r6 = java.net.InetAddress.getByAddress(r6, r3)     // Catch: java.lang.Throwable -> L2b
            boolean r8 = r6 instanceof java.net.Inet4Address     // Catch: java.lang.Throwable -> L2b
            if (r8 == 0) goto L94
            java.net.Inet4Address r6 = (java.net.Inet4Address) r6     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r6 = r10.put(r7, r6)     // Catch: java.lang.Throwable -> L2b
            java.net.Inet4Address r6 = (java.net.Inet4Address) r6     // Catch: java.lang.Throwable -> L2b
            if (r6 == 0) goto La1
            r10.put(r7, r6)     // Catch: java.lang.Throwable -> L2b
            goto La1
        L94:
            java.net.Inet6Address r6 = (java.net.Inet6Address) r6     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r6 = r2.put(r7, r6)     // Catch: java.lang.Throwable -> L2b
            java.net.Inet6Address r6 = (java.net.Inet6Address) r6     // Catch: java.lang.Throwable -> L2b
            if (r6 == 0) goto La1
            r2.put(r7, r6)     // Catch: java.lang.Throwable -> L2b
        La1:
            int r5 = r5 + 1
            goto L6c
        La4:
            boolean r3 = r10.isEmpty()     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto Lb3
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto Lb3
            io.netty.resolver.HostsFileEntries r10 = io.netty.resolver.HostsFileEntries.EMPTY     // Catch: java.lang.Throwable -> L2b
            goto Lb9
        Lb3:
            io.netty.resolver.HostsFileEntries r3 = new io.netty.resolver.HostsFileEntries     // Catch: java.lang.Throwable -> L2b
            r3.<init>(r10, r2)     // Catch: java.lang.Throwable -> L2b
            r10 = r3
        Lb9:
            r1.close()     // Catch: java.io.IOException -> Lbd
            return r10
        Lbd:
            r1 = move-exception
            io.netty.util.internal.logging.InternalLogger r2 = io.netty.resolver.HostsFileParser.logger
            r2.warn(r0, r1)
            return r10
        Lc4:
            r1.close()     // Catch: java.io.IOException -> Lc8
            goto Lce
        Lc8:
            r1 = move-exception
            io.netty.util.internal.logging.InternalLogger r2 = io.netty.resolver.HostsFileParser.logger
            r2.warn(r0, r1)
        Lce:
            throw r10
    }

    public static io.netty.resolver.HostsFileEntries parseSilently() {
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
            r1 = 1
            java.nio.charset.Charset[] r1 = new java.nio.charset.Charset[r1]
            r2 = 0
            r1[r2] = r0
            io.netty.resolver.HostsFileEntries r0 = parseSilently(r1)
            return r0
    }

    public static io.netty.resolver.HostsFileEntries parseSilently(java.nio.charset.Charset... r4) {
            java.io.File r0 = locateHostsFile()
            io.netty.resolver.HostsFileEntries r4 = parse(r0, r4)     // Catch: java.io.IOException -> L9
            return r4
        L9:
            r4 = move-exception
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.resolver.HostsFileParser.logger
            boolean r1 = r1.isWarnEnabled()
            if (r1 == 0) goto L2c
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.resolver.HostsFileParser.logger
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to load and parse hosts file at "
            r2.append(r3)
            java.lang.String r0 = r0.getPath()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.warn(r0, r4)
        L2c:
            io.netty.resolver.HostsFileEntries r4 = io.netty.resolver.HostsFileEntries.EMPTY
            return r4
    }
}
