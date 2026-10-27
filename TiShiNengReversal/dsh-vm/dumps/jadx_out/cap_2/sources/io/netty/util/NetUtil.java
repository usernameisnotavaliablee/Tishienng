package io.netty.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class NetUtil {
    private static final int IPV4_MAX_CHAR_BETWEEN_SEPARATOR = 3;
    private static final boolean IPV4_PREFERRED = false;
    private static final int IPV4_SEPARATORS = 3;
    private static final boolean IPV6_ADDRESSES_PREFERRED = false;
    private static final int IPV6_BYTE_COUNT = 16;
    private static final int IPV6_MAX_CHAR_BETWEEN_SEPARATOR = 4;
    private static final int IPV6_MAX_CHAR_COUNT = 39;
    private static final int IPV6_MAX_SEPARATORS = 8;
    private static final int IPV6_MIN_SEPARATORS = 2;
    private static final int IPV6_WORD_COUNT = 8;
    public static final java.net.InetAddress LOCALHOST = null;
    public static final java.net.Inet4Address LOCALHOST4 = null;
    public static final java.net.Inet6Address LOCALHOST6 = null;
    public static final java.net.NetworkInterface LOOPBACK_IF = null;
    public static final int SOMAXCONN = 0;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;


    static {
            java.lang.String r0 = "Failed to find the loopback interface"
            java.lang.String r1 = "localhost"
            java.lang.String r2 = "Using hard-coded IPv4 localhost address: {}"
            java.lang.String r3 = "java.net.preferIPv4Stack"
            r4 = 0
            boolean r3 = io.netty.util.internal.SystemPropertyUtil.getBoolean(r3, r4)
            io.netty.util.NetUtil.IPV4_PREFERRED = r3
            java.lang.String r5 = "java.net.preferIPv6Addresses"
            boolean r5 = io.netty.util.internal.SystemPropertyUtil.getBoolean(r5, r4)
            io.netty.util.NetUtil.IPV6_ADDRESSES_PREFERRED = r5
            java.lang.Class<io.netty.util.NetUtil> r6 = io.netty.util.NetUtil.class
            io.netty.util.internal.logging.InternalLogger r6 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r6)
            io.netty.util.NetUtil.logger = r6
            java.lang.String r7 = "-Djava.net.preferIPv4Stack: {}"
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r6.debug(r7, r3)
            java.lang.String r3 = "-Djava.net.preferIPv6Addresses: {}"
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r6.debug(r3, r5)
            r3 = 4
            byte[] r3 = new byte[r3]
            r3 = {x0152: FILL_ARRAY_DATA , data: [127, 0, 0, 1} // fill-array
            r5 = 16
            byte[] r5 = new byte[r5]
            r5 = {x0158: FILL_ARRAY_DATA , data: [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1} // fill-array
            r6 = 0
            java.net.InetAddress r3 = java.net.InetAddress.getByAddress(r1, r3)     // Catch: java.lang.Exception -> L46
            java.net.Inet4Address r3 = (java.net.Inet4Address) r3     // Catch: java.lang.Exception -> L46
            goto L4b
        L46:
            r3 = move-exception
            io.netty.util.internal.PlatformDependent.throwException(r3)
            r3 = r6
        L4b:
            io.netty.util.NetUtil.LOCALHOST4 = r3
            java.net.InetAddress r1 = java.net.InetAddress.getByAddress(r1, r5)     // Catch: java.lang.Exception -> L54
            java.net.Inet6Address r1 = (java.net.Inet6Address) r1     // Catch: java.lang.Exception -> L54
            goto L59
        L54:
            r1 = move-exception
            io.netty.util.internal.PlatformDependent.throwException(r1)
            r1 = r6
        L59:
            io.netty.util.NetUtil.LOCALHOST6 = r1
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Enumeration r7 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch: java.net.SocketException -> L80
            if (r7 == 0) goto L88
        L66:
            boolean r8 = r7.hasMoreElements()     // Catch: java.net.SocketException -> L80
            if (r8 == 0) goto L88
            java.lang.Object r8 = r7.nextElement()     // Catch: java.net.SocketException -> L80
            java.net.NetworkInterface r8 = (java.net.NetworkInterface) r8     // Catch: java.net.SocketException -> L80
            java.util.Enumeration r9 = io.netty.util.internal.SocketUtils.addressesFromNetworkInterface(r8)     // Catch: java.net.SocketException -> L80
            boolean r9 = r9.hasMoreElements()     // Catch: java.net.SocketException -> L80
            if (r9 == 0) goto L66
            r5.add(r8)     // Catch: java.net.SocketException -> L80
            goto L66
        L80:
            r7 = move-exception
            io.netty.util.internal.logging.InternalLogger r8 = io.netty.util.NetUtil.logger
            java.lang.String r9 = "Failed to retrieve the list of available network interfaces"
            r8.warn(r9, r7)
        L88:
            java.util.Iterator r7 = r5.iterator()
        L8c:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lb0
            java.lang.Object r8 = r7.next()
            java.net.NetworkInterface r8 = (java.net.NetworkInterface) r8
            java.util.Enumeration r9 = io.netty.util.internal.SocketUtils.addressesFromNetworkInterface(r8)
        L9c:
            boolean r10 = r9.hasMoreElements()
            if (r10 == 0) goto L8c
            java.lang.Object r10 = r9.nextElement()
            java.net.InetAddress r10 = (java.net.InetAddress) r10
            boolean r11 = r10.isLoopbackAddress()
            if (r11 == 0) goto L9c
            r6 = r8
            goto Lb1
        Lb0:
            r10 = r6
        Lb1:
            if (r6 != 0) goto Lee
            java.util.Iterator r5 = r5.iterator()     // Catch: java.net.SocketException -> Ldf
        Lb7:
            boolean r7 = r5.hasNext()     // Catch: java.net.SocketException -> Ldf
            if (r7 == 0) goto Le1
            java.lang.Object r7 = r5.next()     // Catch: java.net.SocketException -> Ldf
            java.net.NetworkInterface r7 = (java.net.NetworkInterface) r7     // Catch: java.net.SocketException -> Ldf
            boolean r8 = r7.isLoopback()     // Catch: java.net.SocketException -> Ldf
            if (r8 == 0) goto Lb7
            java.util.Enumeration r8 = io.netty.util.internal.SocketUtils.addressesFromNetworkInterface(r7)     // Catch: java.net.SocketException -> Ldf
            boolean r9 = r8.hasMoreElements()     // Catch: java.net.SocketException -> Ldf
            if (r9 == 0) goto Lb7
            java.lang.Object r5 = r8.nextElement()     // Catch: java.net.SocketException -> Ldc
            java.net.InetAddress r5 = (java.net.InetAddress) r5     // Catch: java.net.SocketException -> Ldc
            r10 = r5
            r6 = r7
            goto Le1
        Ldc:
            r5 = move-exception
            r6 = r7
            goto Le9
        Ldf:
            r5 = move-exception
            goto Le9
        Le1:
            if (r6 != 0) goto Lee
            io.netty.util.internal.logging.InternalLogger r5 = io.netty.util.NetUtil.logger     // Catch: java.net.SocketException -> Ldf
            r5.warn(r0)     // Catch: java.net.SocketException -> Ldf
            goto Lee
        Le9:
            io.netty.util.internal.logging.InternalLogger r7 = io.netty.util.NetUtil.logger
            r7.warn(r0, r5)
        Lee:
            if (r6 == 0) goto L10f
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.NetUtil.logger
            java.lang.String r1 = r6.getName()
            java.lang.String r2 = r6.getDisplayName()
            java.lang.String r3 = r10.getHostAddress()
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r4] = r1
            r1 = 1
            r5[r1] = r2
            r1 = 2
            r5[r1] = r3
            java.lang.String r1 = "Loopback interface: {} ({}, {})"
            r0.debug(r1, r5)
            goto L13b
        L10f:
            if (r10 != 0) goto L13b
            java.net.Inet6Address r0 = io.netty.util.NetUtil.LOCALHOST6     // Catch: java.lang.Throwable -> L121 java.lang.Exception -> L123
            java.net.NetworkInterface r0 = java.net.NetworkInterface.getByInetAddress(r0)     // Catch: java.lang.Throwable -> L121 java.lang.Exception -> L123
            if (r0 == 0) goto L125
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.NetUtil.logger     // Catch: java.lang.Throwable -> L121 java.lang.Exception -> L123
            java.lang.String r4 = "Using hard-coded IPv6 localhost address: {}"
            r0.debug(r4, r1)     // Catch: java.lang.Throwable -> L121 java.lang.Exception -> L123
            goto L126
        L121:
            r0 = move-exception
            goto L130
        L123:
            goto L138
        L125:
            r1 = r10
        L126:
            if (r1 != 0) goto L12e
        L128:
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.NetUtil.logger
            r0.debug(r2, r3)
            goto L13c
        L12e:
            r3 = r1
            goto L13c
        L130:
            if (r10 != 0) goto L137
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.util.NetUtil.logger
            r1.debug(r2, r3)
        L137:
            throw r0
        L138:
            if (r10 != 0) goto L13b
            goto L128
        L13b:
            r3 = r10
        L13c:
            io.netty.util.NetUtil.LOOPBACK_IF = r6
            io.netty.util.NetUtil.LOCALHOST = r3
            io.netty.util.NetUtil$1 r0 = new io.netty.util.NetUtil$1
            r0.<init>()
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            io.netty.util.NetUtil.SOMAXCONN = r0
            return
    }

    private NetUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ io.netty.util.internal.logging.InternalLogger access$000() {
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.NetUtil.logger
            return r0
    }

    static /* synthetic */ java.lang.Integer access$100(java.lang.String r0) throws java.io.IOException {
            java.lang.Integer r0 = sysctlGetInt(r0)
            return r0
    }

    public static java.lang.String bytesToIpAddress(byte[] r2) {
            r0 = 0
            int r1 = r2.length
            java.lang.String r2 = bytesToIpAddress(r2, r0, r1)
            return r2
    }

    public static java.lang.String bytesToIpAddress(byte[] r2, int r3, int r4) {
            r0 = 4
            if (r4 == r0) goto L29
            r0 = 16
            if (r4 != r0) goto Ld
            r4 = 0
            java.lang.String r2 = toAddressString(r2, r3, r4)
            return r2
        Ld:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "length: "
            r3.append(r0)
            r3.append(r4)
            java.lang.String r4 = " (expected: 4 or 16)"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L29:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r0 = 15
            r4.<init>(r0)
            r0 = r2[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r4.append(r0)
            r0 = 46
            r4.append(r0)
            int r1 = r3 + 1
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r4.append(r1)
            r4.append(r0)
            int r1 = r3 + 2
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r4.append(r1)
            r4.append(r0)
            int r3 = r3 + 3
            r2 = r2[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            return r2
    }

    public static byte[] createByteArrayFromIpAddressString(java.lang.String r4) {
            boolean r0 = isValidIpV4Address(r4)
            if (r0 == 0) goto Lb
            byte[] r4 = validIpV4ToBytes(r4)
            return r4
        Lb:
            boolean r0 = isValidIpV6Address(r4)
            if (r0 == 0) goto L35
            r0 = 0
            char r1 = r4.charAt(r0)
            r2 = 91
            r3 = 1
            if (r1 != r2) goto L24
            int r1 = r4.length()
            int r1 = r1 - r3
            java.lang.String r4 = r4.substring(r3, r1)
        L24:
            r1 = 37
            int r1 = r4.indexOf(r1)
            if (r1 < 0) goto L30
            java.lang.String r4 = r4.substring(r0, r1)
        L30:
            byte[] r4 = getIPv6ByName(r4, r3)
            return r4
        L35:
            r4 = 0
            return r4
    }

    private static int decimalDigit(java.lang.String r0, int r1) {
            char r0 = r0.charAt(r1)
            int r0 = r0 + (-48)
            return r0
    }

    public static java.net.Inet6Address getByName(java.lang.CharSequence r1) {
            r0 = 1
            java.net.Inet6Address r1 = getByName(r1, r0)
            return r1
    }

    public static java.net.Inet6Address getByName(java.lang.CharSequence r1, boolean r2) {
            byte[] r1 = getIPv6ByName(r1, r2)
            r2 = 0
            if (r1 != 0) goto L8
            return r2
        L8:
            r0 = -1
            java.net.Inet6Address r1 = java.net.Inet6Address.getByAddress(r2, r1, r0)     // Catch: java.net.UnknownHostException -> Le
            return r1
        Le:
            r1 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r1)
            throw r2
    }

    public static java.lang.String getHostname(java.net.InetSocketAddress r2) {
            int r0 = io.netty.util.internal.PlatformDependent.javaVersion()
            r1 = 7
            if (r0 < r1) goto Lc
            java.lang.String r2 = r2.getHostString()
            return r2
        Lc:
            java.lang.String r2 = r2.getHostName()
            return r2
    }

    private static byte[] getIPv6ByName(java.lang.CharSequence r27, boolean r28) {
            r0 = r27
            r1 = 16
            byte[] r2 = new byte[r1]
            int r3 = r0.length()
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = -1
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
        L13:
            r16 = 10
            r17 = -1
            r19 = 0
            r5 = 58
            r4 = 4
            r22 = 15
            r23 = 2
            if (r6 >= r3) goto L165
            char r1 = r0.charAt(r6)
            r15 = 46
            if (r1 == r15) goto Lbb
            if (r1 == r5) goto L53
            boolean r5 = isValidHexChar(r1)
            if (r5 == 0) goto L52
            if (r8 <= 0) goto L3b
            boolean r5 = isValidNumericChar(r1)
            if (r5 != 0) goto L3b
            goto L52
        L3b:
            if (r9 >= 0) goto L3f
            r9 = r6
            goto L44
        L3f:
            int r5 = r6 - r9
            if (r5 <= r4) goto L44
            return r19
        L44:
            int r1 = io.netty.util.internal.StringUtil.decodeHexNibble(r1)
            int r4 = r6 - r9
            int r4 = r4 << 2
            int r1 = r1 << r4
            int r13 = r13 + r1
        L4e:
            r24 = 1
            goto L15e
        L52:
            return r19
        L53:
            int r1 = r10 + 1
            int r9 = r6 - r9
            if (r9 > r4) goto Lba
            if (r8 > 0) goto Lba
            r15 = 8
            if (r1 > r15) goto Lba
            int r15 = r11 + 1
            r4 = 16
            r26 = 4
            if (r15 < r4) goto L68
            goto Lba
        L68:
            int r4 = 4 - r9
            int r4 = r4 << 2
            int r4 = r13 << r4
            if (r12 <= 0) goto L72
            int r12 = r12 + (-2)
        L72:
            r9 = r4 & 15
            int r9 = r9 << 4
            int r13 = r4 >> 4
            r13 = r13 & 15
            r9 = r9 | r13
            byte r9 = (byte) r9
            r2[r11] = r9
            int r11 = r11 + 2
            int r9 = r4 >> 8
            r9 = r9 & 15
            int r9 = r9 << 4
            int r13 = r4 >> 12
            r13 = r13 & 15
            r9 = r9 | r13
            byte r9 = (byte) r9
            r2[r15] = r9
            int r9 = r6 + 1
            if (r9 >= r3) goto Lb6
            char r13 = r0.charAt(r9)
            if (r13 != r5) goto Lb6
            int r6 = r6 + 2
            if (r7 != 0) goto Lb5
            if (r6 >= r3) goto La5
            char r1 = r0.charAt(r6)
            if (r1 != r5) goto La5
            goto Lb5
        La5:
            int r10 = r10 + 2
            r1 = 2
            if (r10 != r1) goto Lae
            if (r4 != 0) goto Lae
            r14 = 1
            goto Laf
        Lae:
            r14 = 0
        Laf:
            int r1 = 14 - r11
            r12 = r1
            r6 = r9
            r7 = r11
            goto Lb7
        Lb5:
            return r19
        Lb6:
            r10 = r1
        Lb7:
            r9 = -1
            r13 = 0
            goto L4e
        Lba:
            return r19
        Lbb:
            int r8 = r8 + 1
            int r1 = r6 - r9
            r4 = 3
            if (r1 > r4) goto L164
            if (r9 < 0) goto L164
            if (r8 > r4) goto L164
            if (r10 <= 0) goto Lce
            int r4 = r11 + r12
            r5 = 12
            if (r4 < r5) goto L164
        Lce:
            int r4 = r6 + 1
            if (r4 >= r3) goto L164
            r4 = 16
            if (r11 >= r4) goto L164
            r4 = 1
            if (r8 != r4) goto L135
            if (r28 == 0) goto L164
            if (r11 == 0) goto Le3
            boolean r4 = isValidIPv4Mapped(r2, r11, r7, r12)
            if (r4 == 0) goto L164
        Le3:
            r4 = 3
            if (r1 != r4) goto L10a
            int r4 = r6 + (-1)
            char r4 = r0.charAt(r4)
            boolean r4 = isValidNumericChar(r4)
            if (r4 == 0) goto L164
            int r4 = r6 + (-2)
            char r4 = r0.charAt(r4)
            boolean r4 = isValidNumericChar(r4)
            if (r4 == 0) goto L164
            int r4 = r6 + (-3)
            char r4 = r0.charAt(r4)
            boolean r4 = isValidNumericChar(r4)
            if (r4 == 0) goto L164
        L10a:
            r4 = 2
            if (r1 != r4) goto L125
            int r4 = r6 + (-1)
            char r4 = r0.charAt(r4)
            boolean r4 = isValidNumericChar(r4)
            if (r4 == 0) goto L164
            int r4 = r6 + (-2)
            char r4 = r0.charAt(r4)
            boolean r4 = isValidNumericChar(r4)
            if (r4 == 0) goto L164
        L125:
            r4 = 1
            if (r1 != r4) goto L135
            int r4 = r6 + (-1)
            char r4 = r0.charAt(r4)
            boolean r4 = isValidNumericChar(r4)
            if (r4 != 0) goto L135
            goto L164
        L135:
            int r1 = 3 - r1
            r23 = 2
            int r1 = r1 << 2
            int r1 = r13 << r1
            r4 = r1 & 15
            int r4 = r4 * 100
            int r5 = r1 >> 4
            r5 = r5 & 15
            int r5 = r5 * 10
            int r4 = r4 + r5
            r25 = 8
            int r1 = r1 >> 8
            r1 = r1 & 15
            int r4 = r4 + r1
            if (r4 < 0) goto L164
            r1 = 255(0xff, float:3.57E-43)
            if (r4 <= r1) goto L156
            goto L164
        L156:
            int r1 = r11 + 1
            byte r4 = (byte) r4
            r2[r11] = r4
            r11 = r1
            goto Lb7
        L15e:
            int r6 = r6 + 1
            r1 = 16
            goto L13
        L164:
            return r19
        L165:
            r24 = 1
            r26 = 4
            if (r7 <= 0) goto L16c
            goto L16e
        L16c:
            r24 = 0
        L16e:
            if (r8 <= 0) goto L1d4
            if (r9 <= 0) goto L178
            int r1 = r6 - r9
            r4 = 3
            if (r1 > r4) goto L1d3
            goto L179
        L178:
            r4 = 3
        L179:
            if (r8 != r4) goto L1d3
            r4 = 16
            if (r11 < r4) goto L180
            goto L1d3
        L180:
            if (r10 != 0) goto L186
            r1 = 2
            r12 = 12
            goto L1aa
        L186:
            r1 = 2
            if (r10 < r1) goto L1d3
            if (r24 != 0) goto L198
            r1 = 6
            if (r10 != r1) goto L198
            r1 = 0
            char r3 = r0.charAt(r1)
            if (r3 != r5) goto L196
            goto L199
        L196:
            r1 = 2
            goto L1a8
        L198:
            r1 = 0
        L199:
            if (r24 == 0) goto L1d3
            r15 = 8
            if (r10 >= r15) goto L1d3
            char r0 = r0.charAt(r1)
            if (r0 != r5) goto L196
            r1 = 2
            if (r7 > r1) goto L1d3
        L1a8:
            int r12 = r12 + (-2)
        L1aa:
            int r6 = r6 - r9
            r21 = 3
            int r4 = 3 - r6
            int r0 = r4 << 2
            int r0 = r13 << r0
            r1 = r0 & 15
            int r1 = r1 * 100
            int r3 = r0 >> 4
            r3 = r3 & 15
            int r3 = r3 * 10
            int r1 = r1 + r3
            r25 = 8
            int r0 = r0 >> 8
            r0 = r0 & 15
            int r1 = r1 + r0
            if (r1 < 0) goto L1d3
            r0 = 255(0xff, float:3.57E-43)
            if (r1 <= r0) goto L1cc
            goto L1d3
        L1cc:
            int r0 = r11 + 1
            byte r1 = (byte) r1
            r2[r11] = r1
            goto L256
        L1d3:
            return r19
        L1d4:
            int r1 = r3 + (-1)
            if (r9 <= 0) goto L1dd
            int r4 = r6 - r9
            r15 = 4
            if (r4 > r15) goto L298
        L1dd:
            r4 = 2
            if (r10 < r4) goto L298
            if (r24 != 0) goto L1f5
            int r4 = r10 + 1
            r15 = 8
            if (r4 != r15) goto L298
            r4 = 0
            char r15 = r0.charAt(r4)
            if (r15 == r5) goto L298
            char r4 = r0.charAt(r1)
            if (r4 == r5) goto L298
        L1f5:
            if (r24 == 0) goto L211
            r15 = 8
            if (r10 > r15) goto L298
            if (r10 != r15) goto L211
            r4 = 2
            if (r7 > r4) goto L207
            r4 = 0
            char r10 = r0.charAt(r4)
            if (r10 != r5) goto L298
        L207:
            r4 = 14
            if (r7 < r4) goto L211
            char r1 = r0.charAt(r1)
            if (r1 != r5) goto L298
        L211:
            int r1 = r11 + 1
            r4 = 16
            if (r1 >= r4) goto L298
            r4 = 2
            if (r9 >= 0) goto L221
            int r3 = r3 - r4
            char r3 = r0.charAt(r3)
            if (r3 != r5) goto L298
        L221:
            if (r7 <= r4) goto L22c
            r3 = 0
            char r0 = r0.charAt(r3)
            if (r0 != r5) goto L22c
            goto L298
        L22c:
            if (r9 < 0) goto L237
            int r6 = r6 - r9
            r15 = 4
            if (r6 > r15) goto L238
            int r0 = 4 - r6
            int r0 = r0 << r4
            int r13 = r13 << r0
            goto L238
        L237:
            r15 = 4
        L238:
            r0 = r13 & 15
            int r0 = r0 << r15
            int r3 = r13 >> 4
            r3 = r3 & 15
            r0 = r0 | r3
            byte r0 = (byte) r0
            r2[r11] = r0
            r23 = 2
            int r0 = r11 + 2
            int r3 = r13 >> 8
            r3 = r3 & 15
            int r3 = r3 << r15
            r20 = 12
            int r4 = r13 >> 12
            r4 = r4 & 15
            r3 = r3 | r4
            byte r3 = (byte) r3
            r2[r1] = r3
        L256:
            int r1 = r0 + r12
            r4 = 16
            if (r14 != 0) goto L273
            if (r1 < r4) goto L25f
            goto L273
        L25f:
            r1 = 0
        L260:
            if (r1 >= r12) goto L28f
            int r0 = r1 + r7
            int r3 = r0 + r12
            if (r3 >= r4) goto L28f
            r5 = r2[r0]
            r2[r3] = r5
            r18 = 0
            r2[r0] = r18
            int r1 = r1 + 1
            goto L260
        L273:
            if (r1 < r4) goto L277
            int r7 = r7 + 1
        L277:
            if (r0 >= r4) goto L28f
            r1 = 15
        L27b:
            if (r1 < r7) goto L286
            int r3 = r1 + (-1)
            r3 = r2[r3]
            r2[r1] = r3
            int r1 = r1 + (-1)
            goto L27b
        L286:
            r18 = 0
            r2[r1] = r18
            int r7 = r7 + 1
            int r0 = r0 + 1
            goto L277
        L28f:
            if (r8 <= 0) goto L297
            r0 = 11
            r2[r0] = r17
            r2[r16] = r17
        L297:
            return r2
        L298:
            return r19
    }

    private static boolean inRangeEndExclusive(int r0, int r1, int r2) {
            if (r0 < r1) goto L6
            if (r0 >= r2) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public static java.lang.String intToIpAddress(int r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 15
            r0.<init>(r1)
            int r1 = r3 >> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0.append(r1)
            r1 = 46
            r0.append(r1)
            int r2 = r3 >> 16
            r2 = r2 & 255(0xff, float:3.57E-43)
            r0.append(r2)
            r0.append(r1)
            int r2 = r3 >> 8
            r2 = r2 & 255(0xff, float:3.57E-43)
            r0.append(r2)
            r0.append(r1)
            r3 = r3 & 255(0xff, float:3.57E-43)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    private static byte ipv4WordToByte(java.lang.String r2, int r3, int r4) {
            int r0 = decimalDigit(r2, r3)
            int r1 = r3 + 1
            if (r1 != r4) goto La
            byte r2 = (byte) r0
            return r2
        La:
            int r0 = r0 * 10
            int r1 = decimalDigit(r2, r1)
            int r0 = r0 + r1
            int r3 = r3 + 2
            if (r3 != r4) goto L17
            byte r2 = (byte) r0
            return r2
        L17:
            int r0 = r0 * 10
            int r2 = decimalDigit(r2, r3)
            int r0 = r0 + r2
            byte r2 = (byte) r0
            return r2
    }

    public static boolean isIpV4StackPreferred() {
            boolean r0 = io.netty.util.NetUtil.IPV4_PREFERRED
            return r0
    }

    public static boolean isIpV6AddressesPreferred() {
            boolean r0 = io.netty.util.NetUtil.IPV6_ADDRESSES_PREFERRED
            return r0
    }

    private static boolean isValidHexChar(char r1) {
            r0 = 48
            if (r1 < r0) goto L8
            r0 = 57
            if (r1 <= r0) goto L18
        L8:
            r0 = 65
            if (r1 < r0) goto L10
            r0 = 70
            if (r1 <= r0) goto L18
        L10:
            r0 = 97
            if (r1 < r0) goto L1a
            r0 = 102(0x66, float:1.43E-43)
            if (r1 > r0) goto L1a
        L18:
            r1 = 1
            return r1
        L1a:
            r1 = 0
            return r1
    }

    private static boolean isValidIPv4Mapped(byte[] r4, int r5, int r6, int r7) {
            int r7 = r7 + r6
            r0 = 14
            r1 = 0
            r2 = 1
            if (r7 < r0) goto L9
            r7 = 1
            goto La
        L9:
            r7 = 0
        La:
            r0 = 12
            if (r5 > r0) goto L2c
            r3 = 2
            if (r5 < r3) goto L2c
            if (r7 == 0) goto L15
            if (r6 >= r0) goto L2c
        L15:
            int r6 = r5 + (-1)
            r6 = r4[r6]
            int r0 = r5 + (-2)
            r0 = r4[r0]
            boolean r6 = isValidIPv4MappedSeparators(r6, r0, r7)
            if (r6 == 0) goto L2c
            int r5 = r5 + (-3)
            boolean r4 = io.netty.util.internal.PlatformDependent.isZero(r4, r1, r5)
            if (r4 == 0) goto L2c
            return r2
        L2c:
            return r1
    }

    private static boolean isValidIPv4MappedChar(char r1) {
            r0 = 102(0x66, float:1.43E-43)
            if (r1 == r0) goto Lb
            r0 = 70
            if (r1 != r0) goto L9
            goto Lb
        L9:
            r1 = 0
            return r1
        Lb:
            r1 = 1
            return r1
    }

    private static boolean isValidIPv4MappedSeparators(byte r0, byte r1, boolean r2) {
            if (r0 != r1) goto Lb
            if (r0 == 0) goto L9
            if (r2 != 0) goto Lb
            r0 = -1
            if (r1 != r0) goto Lb
        L9:
            r0 = 1
            return r0
        Lb:
            r0 = 0
            return r0
    }

    private static boolean isValidIpV4Address(io.netty.util.AsciiString r3, int r4, int r5) {
            int r0 = r5 - r4
            r1 = 15
            if (r0 > r1) goto L40
            r1 = 7
            if (r0 < r1) goto L40
            int r0 = r4 + 1
            r1 = 46
            int r0 = r3.indexOf(r1, r0)
            if (r0 <= 0) goto L40
            boolean r4 = isValidIpV4Word(r3, r4, r0)
            if (r4 == 0) goto L40
            int r4 = r0 + 2
            int r4 = r3.indexOf(r1, r4)
            if (r4 <= 0) goto L40
            r2 = 1
            int r0 = r0 + r2
            boolean r0 = isValidIpV4Word(r3, r0, r4)
            if (r0 == 0) goto L40
            int r0 = r4 + 2
            int r0 = r3.indexOf(r1, r0)
            if (r0 <= 0) goto L40
            int r4 = r4 + r2
            boolean r4 = isValidIpV4Word(r3, r4, r0)
            if (r4 == 0) goto L40
            int r0 = r0 + r2
            boolean r3 = isValidIpV4Word(r3, r0, r5)
            if (r3 == 0) goto L40
            return r2
        L40:
            r3 = 0
            return r3
    }

    public static boolean isValidIpV4Address(java.lang.CharSequence r2) {
            r0 = 0
            int r1 = r2.length()
            boolean r2 = isValidIpV4Address(r2, r0, r1)
            return r2
    }

    private static boolean isValidIpV4Address(java.lang.CharSequence r1, int r2, int r3) {
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto Lb
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = isValidIpV4Address(r1, r2, r3)
            return r1
        Lb:
            boolean r0 = r1 instanceof io.netty.util.AsciiString
            if (r0 == 0) goto L16
            io.netty.util.AsciiString r1 = (io.netty.util.AsciiString) r1
            boolean r1 = isValidIpV4Address(r1, r2, r3)
            return r1
        L16:
            boolean r1 = isValidIpV4Address0(r1, r2, r3)
            return r1
    }

    public static boolean isValidIpV4Address(java.lang.String r2) {
            r0 = 0
            int r1 = r2.length()
            boolean r2 = isValidIpV4Address(r2, r0, r1)
            return r2
    }

    private static boolean isValidIpV4Address(java.lang.String r3, int r4, int r5) {
            int r0 = r5 - r4
            r1 = 15
            if (r0 > r1) goto L40
            r1 = 7
            if (r0 < r1) goto L40
            int r0 = r4 + 1
            r1 = 46
            int r0 = r3.indexOf(r1, r0)
            if (r0 <= 0) goto L40
            boolean r4 = isValidIpV4Word(r3, r4, r0)
            if (r4 == 0) goto L40
            int r4 = r0 + 2
            int r4 = r3.indexOf(r1, r4)
            if (r4 <= 0) goto L40
            r2 = 1
            int r0 = r0 + r2
            boolean r0 = isValidIpV4Word(r3, r0, r4)
            if (r0 == 0) goto L40
            int r0 = r4 + 2
            int r0 = r3.indexOf(r1, r0)
            if (r0 <= 0) goto L40
            int r4 = r4 + r2
            boolean r4 = isValidIpV4Word(r3, r4, r0)
            if (r4 == 0) goto L40
            int r0 = r0 + r2
            boolean r3 = isValidIpV4Word(r3, r0, r5)
            if (r3 == 0) goto L40
            return r2
        L40:
            r3 = 0
            return r3
    }

    private static boolean isValidIpV4Address0(java.lang.CharSequence r3, int r4, int r5) {
            int r0 = r5 - r4
            r1 = 15
            if (r0 > r1) goto L40
            r1 = 7
            if (r0 < r1) goto L40
            int r0 = r4 + 1
            r1 = 46
            int r0 = io.netty.util.AsciiString.indexOf(r3, r1, r0)
            if (r0 <= 0) goto L40
            boolean r4 = isValidIpV4Word(r3, r4, r0)
            if (r4 == 0) goto L40
            int r4 = r0 + 2
            int r4 = io.netty.util.AsciiString.indexOf(r3, r1, r4)
            if (r4 <= 0) goto L40
            r2 = 1
            int r0 = r0 + r2
            boolean r0 = isValidIpV4Word(r3, r0, r4)
            if (r0 == 0) goto L40
            int r0 = r4 + 2
            int r0 = io.netty.util.AsciiString.indexOf(r3, r1, r0)
            if (r0 <= 0) goto L40
            int r4 = r4 + r2
            boolean r4 = isValidIpV4Word(r3, r4, r0)
            if (r4 == 0) goto L40
            int r0 = r0 + r2
            boolean r3 = isValidIpV4Word(r3, r0, r5)
            if (r3 == 0) goto L40
            return r2
        L40:
            r3 = 0
            return r3
    }

    private static boolean isValidIpV4Word(java.lang.CharSequence r6, int r7, int r8) {
            int r8 = r8 - r7
            r0 = 0
            r1 = 1
            if (r8 < r1) goto L4d
            r2 = 3
            if (r8 > r2) goto L4d
            char r3 = r6.charAt(r7)
            r4 = 48
            if (r3 >= r4) goto L11
            goto L4d
        L11:
            r5 = 57
            if (r8 != r2) goto L3d
            int r8 = r7 + 1
            char r8 = r6.charAt(r8)
            if (r8 < r4) goto L3c
            int r7 = r7 + 2
            char r6 = r6.charAt(r7)
            if (r6 < r4) goto L3c
            r7 = 49
            if (r3 > r7) goto L2d
            if (r8 > r5) goto L2d
            if (r6 <= r5) goto L3b
        L2d:
            r7 = 50
            if (r3 != r7) goto L3c
            r7 = 53
            if (r8 > r7) goto L3c
            if (r6 <= r7) goto L3b
            if (r8 >= r7) goto L3c
            if (r6 > r5) goto L3c
        L3b:
            return r1
        L3c:
            return r0
        L3d:
            if (r3 > r5) goto L4d
            if (r8 == r1) goto L4c
            int r7 = r7 + r1
            char r6 = r6.charAt(r7)
            boolean r6 = isValidNumericChar(r6)
            if (r6 == 0) goto L4d
        L4c:
            return r1
        L4d:
            return r0
    }

    public static boolean isValidIpV6Address(java.lang.CharSequence r14) {
            int r0 = r14.length()
            r1 = 0
            r2 = 2
            if (r0 >= r2) goto L9
            return r1
        L9:
            char r3 = r14.charAt(r1)
            r4 = 91
            r5 = 1
            if (r3 != r4) goto L23
            int r0 = r0 + (-1)
            char r3 = r14.charAt(r0)
            r4 = 93
            if (r3 == r4) goto L1d
            return r1
        L1d:
            char r3 = r14.charAt(r5)
            r4 = 1
            goto L24
        L23:
            r4 = 0
        L24:
            r6 = 58
            if (r3 != r6) goto L37
            int r3 = r4 + 1
            char r3 = r14.charAt(r3)
            if (r3 == r6) goto L31
            return r1
        L31:
            int r3 = r4 + 2
            r13 = r4
            r4 = r3
            r3 = r13
            goto L3a
        L37:
            r2 = -1
            r2 = 0
            r3 = -1
        L3a:
            r7 = r4
            r8 = 0
        L3c:
            r9 = 7
            if (r7 >= r0) goto Ld3
            char r10 = r14.charAt(r7)
            boolean r11 = isValidHexChar(r10)
            if (r11 == 0) goto L50
            r9 = 4
            if (r8 >= r9) goto L4f
            int r8 = r8 + 1
            goto L6e
        L4f:
            return r1
        L50:
            r11 = 37
            if (r10 == r11) goto Ld2
            r12 = 46
            if (r10 == r12) goto L71
            if (r10 == r6) goto L5b
            return r1
        L5b:
            if (r2 <= r9) goto L5e
            return r1
        L5e:
            int r9 = r7 + (-1)
            char r10 = r14.charAt(r9)
            if (r10 != r6) goto L6b
            if (r3 < 0) goto L69
            return r1
        L69:
            r3 = r9
            goto L6c
        L6b:
            r8 = 0
        L6c:
            int r2 = r2 + 1
        L6e:
            int r7 = r7 + 1
            goto L3c
        L71:
            if (r3 >= 0) goto L76
            r5 = 6
            if (r2 != r5) goto L7c
        L76:
            if (r2 != r9) goto L7a
            if (r3 >= r4) goto L7c
        L7a:
            if (r2 <= r9) goto L7d
        L7c:
            return r1
        L7d:
            int r7 = r7 - r8
            int r2 = r7 + (-2)
            char r3 = r14.charAt(r2)
            boolean r3 = isValidIPv4MappedChar(r3)
            if (r3 == 0) goto Lb3
            int r2 = r7 + (-3)
            char r2 = r14.charAt(r2)
            boolean r2 = isValidIPv4MappedChar(r2)
            if (r2 == 0) goto Lb2
            int r2 = r7 + (-4)
            char r2 = r14.charAt(r2)
            boolean r2 = isValidIPv4MappedChar(r2)
            if (r2 == 0) goto Lb2
            int r2 = r7 + (-5)
            char r2 = r14.charAt(r2)
            boolean r2 = isValidIPv4MappedChar(r2)
            if (r2 != 0) goto Laf
            goto Lb2
        Laf:
            int r2 = r7 + (-7)
            goto Lb3
        Lb2:
            return r1
        Lb3:
            if (r2 < r4) goto Lc3
            char r3 = r14.charAt(r2)
            r5 = 48
            if (r3 == r5) goto Lc0
            if (r3 == r6) goto Lc0
            return r1
        Lc0:
            int r2 = r2 + (-1)
            goto Lb3
        Lc3:
            int r1 = r7 + 7
            int r1 = io.netty.util.AsciiString.indexOf(r14, r11, r1)
            if (r1 >= 0) goto Lcc
            goto Lcd
        Lcc:
            r0 = r1
        Lcd:
            boolean r14 = isValidIpV4Address(r14, r7, r0)
            return r14
        Ld2:
            r0 = r7
        Ld3:
            if (r3 >= 0) goto Ldb
            if (r2 != r9) goto Lda
            if (r8 <= 0) goto Lda
            return r5
        Lda:
            return r1
        Ldb:
            int r14 = r3 + 2
            if (r14 == r0) goto Le9
            if (r8 <= 0) goto Le8
            r14 = 8
            if (r2 < r14) goto Le9
            if (r3 > r4) goto Le8
            goto Le9
        Le8:
            return r1
        Le9:
            return r5
    }

    public static boolean isValidIpV6Address(java.lang.String r0) {
            boolean r0 = isValidIpV6Address(r0)
            return r0
    }

    private static boolean isValidNumericChar(char r1) {
            r0 = 48
            if (r1 < r0) goto La
            r0 = 57
            if (r1 > r0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    private static java.lang.StringBuilder newSocketAddressStringBuilder(java.lang.String r4, java.lang.String r5, boolean r6) {
            int r0 = r4.length()
            r1 = 1
            if (r6 == 0) goto L16
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r0 = r0 + r1
            int r5 = r5.length()
            int r0 = r0 + r5
            r6.<init>(r0)
            r6.append(r4)
            return r6
        L16:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r2 = r0 + 3
            int r5 = r5.length()
            int r2 = r2 + r5
            r6.<init>(r2)
            r5 = 93
            r2 = 91
            if (r0 <= r1) goto L3a
            r3 = 0
            char r3 = r4.charAt(r3)
            if (r3 != r2) goto L3a
            int r0 = r0 - r1
            char r0 = r4.charAt(r0)
            if (r0 != r5) goto L3a
            r6.append(r4)
            return r6
        L3a:
            r6.append(r2)
            r6.append(r4)
            r6.append(r5)
            return r6
    }

    private static java.lang.Integer sysctlGetInt(java.lang.String r5) throws java.io.IOException {
            java.lang.ProcessBuilder r0 = new java.lang.ProcessBuilder
            java.lang.String r1 = "sysctl"
            java.lang.String[] r1 = new java.lang.String[]{r1, r5}
            r0.<init>(r1)
            java.lang.Process r0 = r0.start()
            java.io.InputStream r1 = r0.getInputStream()     // Catch: java.lang.Throwable -> L4e
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L4e
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L4e
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L4e
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r2 = r1.readLine()     // Catch: java.lang.Throwable -> L50
            boolean r3 = r2.startsWith(r5)     // Catch: java.lang.Throwable -> L50
            if (r3 == 0) goto L55
            int r3 = r2.length()     // Catch: java.lang.Throwable -> L50
            int r3 = r3 + (-1)
        L2d:
            int r4 = r5.length()     // Catch: java.lang.Throwable -> L50
            if (r3 <= r4) goto L55
            char r4 = r2.charAt(r3)     // Catch: java.lang.Throwable -> L50
            boolean r4 = java.lang.Character.isDigit(r4)     // Catch: java.lang.Throwable -> L50
            if (r4 != 0) goto L52
            int r3 = r3 + 1
            java.lang.String r5 = r2.substring(r3)     // Catch: java.lang.Throwable -> L50
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L50
            r1.close()     // Catch: java.lang.Throwable -> L4e
            r0.destroy()
            return r5
        L4e:
            r5 = move-exception
            goto L61
        L50:
            r5 = move-exception
            goto L5d
        L52:
            int r3 = r3 + (-1)
            goto L2d
        L55:
            r1.close()     // Catch: java.lang.Throwable -> L4e
            r0.destroy()
            r5 = 0
            return r5
        L5d:
            r1.close()     // Catch: java.lang.Throwable -> L4e
            throw r5     // Catch: java.lang.Throwable -> L4e
        L61:
            if (r0 == 0) goto L66
            r0.destroy()
        L66:
            throw r5
    }

    public static java.lang.String toAddressString(java.net.InetAddress r1) {
            r0 = 0
            java.lang.String r1 = toAddressString(r1, r0)
            return r1
    }

    public static java.lang.String toAddressString(java.net.InetAddress r2, boolean r3) {
            boolean r0 = r2 instanceof java.net.Inet4Address
            if (r0 == 0) goto L9
            java.lang.String r2 = r2.getHostAddress()
            return r2
        L9:
            boolean r0 = r2 instanceof java.net.Inet6Address
            if (r0 == 0) goto L17
            byte[] r2 = r2.getAddress()
            r0 = 0
            java.lang.String r2 = toAddressString(r2, r0, r3)
            return r2
        L17:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unhandled type: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
    }

    private static java.lang.String toAddressString(byte[] r9, int r10, boolean r11) {
            r0 = 8
            int[] r1 = new int[r0]
            int r2 = r10 + 8
        L6:
            r3 = 1
            if (r10 >= r2) goto L1b
            int r4 = r10 << 1
            r5 = r9[r4]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << r0
            int r4 = r4 + r3
            r3 = r9[r4]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r3 = r3 | r5
            r1[r10] = r3
            int r10 = r10 + 1
            goto L6
        L1b:
            r9 = -1
            r10 = 0
            r2 = 0
            r4 = -1
            r5 = 0
            r6 = -1
        L21:
            if (r2 >= r0) goto L39
            r7 = r1[r2]
            if (r7 != 0) goto L2b
            if (r4 >= 0) goto L36
            r4 = r2
            goto L36
        L2b:
            if (r4 < 0) goto L36
            int r7 = r2 - r4
            if (r7 <= r5) goto L33
            r5 = r7
            goto L34
        L33:
            r4 = r6
        L34:
            r6 = r4
            r4 = -1
        L36:
            int r2 = r2 + 1
            goto L21
        L39:
            if (r4 < 0) goto L40
            int r2 = r2 - r4
            if (r2 <= r5) goto L40
            r5 = r2
            goto L41
        L40:
            r4 = r6
        L41:
            if (r5 != r3) goto L45
            r5 = 0
            goto L46
        L45:
            r9 = r4
        L46:
            int r5 = r5 + r9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r4 = 39
            r2.<init>(r4)
            r4 = 58
            if (r5 >= 0) goto L6c
            r9 = r1[r10]
            java.lang.String r9 = java.lang.Integer.toHexString(r9)
            r2.append(r9)
        L5b:
            if (r3 >= r0) goto Lda
            r2.append(r4)
            r9 = r1[r3]
            java.lang.String r9 = java.lang.Integer.toHexString(r9)
            r2.append(r9)
            int r3 = r3 + 1
            goto L5b
        L6c:
            boolean r6 = inRangeEndExclusive(r10, r9, r5)
            java.lang.String r7 = "::"
            r8 = 5
            if (r6 == 0) goto L85
            r2.append(r7)
            if (r11 == 0) goto L8e
            if (r5 != r8) goto L8e
            r11 = r1[r8]
            r6 = 65535(0xffff, float:9.1834E-41)
            if (r11 != r6) goto L8e
            r10 = 1
            goto L8e
        L85:
            r11 = r1[r10]
            java.lang.String r11 = java.lang.Integer.toHexString(r11)
            r2.append(r11)
        L8e:
            if (r3 >= r0) goto Lda
            boolean r11 = inRangeEndExclusive(r3, r9, r5)
            if (r11 != 0) goto Lcc
            int r11 = r3 + (-1)
            boolean r11 = inRangeEndExclusive(r11, r9, r5)
            r6 = 46
            if (r11 != 0) goto Lad
            if (r10 == 0) goto Laa
            r11 = 6
            if (r3 != r11) goto La6
            goto Laa
        La6:
            r2.append(r6)
            goto Lad
        Laa:
            r2.append(r4)
        Lad:
            if (r10 == 0) goto Lc2
            if (r3 <= r8) goto Lc2
            r11 = r1[r3]
            int r11 = r11 >> r0
            r2.append(r11)
            r2.append(r6)
            r11 = r1[r3]
            r11 = r11 & 255(0xff, float:3.57E-43)
            r2.append(r11)
            goto Ld7
        Lc2:
            r11 = r1[r3]
            java.lang.String r11 = java.lang.Integer.toHexString(r11)
            r2.append(r11)
            goto Ld7
        Lcc:
            int r11 = r3 + (-1)
            boolean r11 = inRangeEndExclusive(r11, r9, r5)
            if (r11 != 0) goto Ld7
            r2.append(r7)
        Ld7:
            int r3 = r3 + 1
            goto L8e
        Lda:
            java.lang.String r9 = r2.toString()
            return r9
    }

    public static java.lang.String toSocketAddressString(java.lang.String r1, int r2) {
            java.lang.String r2 = java.lang.String.valueOf(r2)
            boolean r0 = isValidIpV6Address(r1)
            r0 = r0 ^ 1
            java.lang.StringBuilder r1 = newSocketAddressStringBuilder(r1, r2, r0)
            r0 = 58
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
    }

    public static java.lang.String toSocketAddressString(java.net.InetSocketAddress r2) {
            int r0 = r2.getPort()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r1 = r2.isUnresolved()
            if (r1 == 0) goto L1d
            java.lang.String r2 = getHostname(r2)
            boolean r1 = isValidIpV6Address(r2)
            r1 = r1 ^ 1
            java.lang.StringBuilder r2 = newSocketAddressStringBuilder(r2, r0, r1)
            goto L2b
        L1d:
            java.net.InetAddress r2 = r2.getAddress()
            java.lang.String r1 = toAddressString(r2)
            boolean r2 = r2 instanceof java.net.Inet4Address
            java.lang.StringBuilder r2 = newSocketAddressStringBuilder(r1, r0, r2)
        L2b:
            r1 = 58
            r2.append(r1)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            return r2
    }

    static byte[] validIpV4ToBytes(java.lang.String r8) {
            r0 = 46
            r1 = 1
            int r2 = r8.indexOf(r0, r1)
            r3 = 0
            byte r4 = ipv4WordToByte(r8, r3, r2)
            int r5 = r2 + 1
            r6 = 2
            int r2 = r2 + r6
            int r2 = r8.indexOf(r0, r2)
            byte r5 = ipv4WordToByte(r8, r5, r2)
            int r7 = r2 + 1
            int r2 = r2 + r6
            int r0 = r8.indexOf(r0, r2)
            byte r2 = ipv4WordToByte(r8, r7, r0)
            int r0 = r0 + r1
            int r7 = r8.length()
            byte r8 = ipv4WordToByte(r8, r0, r7)
            r0 = 4
            byte[] r0 = new byte[r0]
            r0[r3] = r4
            r0[r1] = r5
            r0[r6] = r2
            r1 = 3
            r0[r1] = r8
            return r0
    }
}
