package io.netty.util.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class MacAddressUtil {
    private static final int EUI48_MAC_ADDRESS_LENGTH = 6;
    private static final int EUI64_MAC_ADDRESS_LENGTH = 8;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;

    static {
            java.lang.Class<io.netty.util.internal.MacAddressUtil> r0 = io.netty.util.internal.MacAddressUtil.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.util.internal.MacAddressUtil.logger = r0
            return
    }

    private MacAddressUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static byte[] bestAvailableMac() {
            byte[] r0 = io.netty.util.internal.EmptyArrays.EMPTY_BYTES
            java.net.Inet4Address r1 = io.netty.util.NetUtil.LOCALHOST4
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.Enumeration r3 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch: java.net.SocketException -> L35
            if (r3 == 0) goto L3d
        Lf:
            boolean r4 = r3.hasMoreElements()     // Catch: java.net.SocketException -> L35
            if (r4 == 0) goto L3d
            java.lang.Object r4 = r3.nextElement()     // Catch: java.net.SocketException -> L35
            java.net.NetworkInterface r4 = (java.net.NetworkInterface) r4     // Catch: java.net.SocketException -> L35
            java.util.Enumeration r5 = io.netty.util.internal.SocketUtils.addressesFromNetworkInterface(r4)     // Catch: java.net.SocketException -> L35
            boolean r6 = r5.hasMoreElements()     // Catch: java.net.SocketException -> L35
            if (r6 == 0) goto Lf
            java.lang.Object r5 = r5.nextElement()     // Catch: java.net.SocketException -> L35
            java.net.InetAddress r5 = (java.net.InetAddress) r5     // Catch: java.net.SocketException -> L35
            boolean r6 = r5.isLoopbackAddress()     // Catch: java.net.SocketException -> L35
            if (r6 != 0) goto Lf
            r2.put(r4, r5)     // Catch: java.net.SocketException -> L35
            goto Lf
        L35:
            r3 = move-exception
            io.netty.util.internal.logging.InternalLogger r4 = io.netty.util.internal.MacAddressUtil.logger
            java.lang.String r5 = "Failed to retrieve the list of available network interfaces"
            r4.warn(r5, r3)
        L3d:
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L45:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L8a
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.net.NetworkInterface r4 = (java.net.NetworkInterface) r4
            java.lang.Object r3 = r3.getValue()
            java.net.InetAddress r3 = (java.net.InetAddress) r3
            boolean r5 = r4.isVirtual()
            if (r5 == 0) goto L64
            goto L45
        L64:
            byte[] r4 = io.netty.util.internal.SocketUtils.hardwareAddressFromNetworkInterface(r4)     // Catch: java.net.SocketException -> L81
            int r5 = compareAddresses(r0, r4)
            if (r5 >= 0) goto L6f
            goto L7e
        L6f:
            if (r5 != 0) goto L45
            int r5 = compareAddresses(r1, r3)
            if (r5 >= 0) goto L78
            goto L7e
        L78:
            if (r5 != 0) goto L45
            int r5 = r0.length
            int r6 = r4.length
            if (r5 >= r6) goto L45
        L7e:
            r1 = r3
            r0 = r4
            goto L45
        L81:
            r3 = move-exception
            io.netty.util.internal.logging.InternalLogger r5 = io.netty.util.internal.MacAddressUtil.logger
            java.lang.String r6 = "Failed to get the hardware address of a network interface: {}"
            r5.debug(r6, r4, r3)
            goto L45
        L8a:
            byte[] r1 = io.netty.util.internal.EmptyArrays.EMPTY_BYTES
            if (r0 != r1) goto L90
            r0 = 0
            return r0
        L90:
            int r1 = r0.length
            r2 = 6
            r3 = 8
            if (r1 == r2) goto L9b
            byte[] r0 = java.util.Arrays.copyOf(r0, r3)
            goto Lae
        L9b:
            byte[] r1 = new byte[r3]
            r2 = 0
            r3 = 3
            java.lang.System.arraycopy(r0, r2, r1, r2, r3)
            r2 = -1
            r1[r3] = r2
            r2 = 4
            r4 = -2
            r1[r2] = r4
            r2 = 5
            java.lang.System.arraycopy(r0, r3, r1, r2, r3)
            r0 = r1
        Lae:
            return r0
    }

    private static int compareAddresses(java.net.InetAddress r0, java.net.InetAddress r1) {
            int r0 = scoreAddress(r0)
            int r1 = scoreAddress(r1)
            int r0 = r0 - r1
            return r0
    }

    static int compareAddresses(byte[] r5, byte[] r6) {
            r0 = 1
            if (r6 == 0) goto L38
            int r1 = r6.length
            r2 = 6
            if (r1 >= r2) goto L8
            goto L38
        L8:
            int r1 = r6.length
            r2 = 0
            r3 = 0
        Lb:
            if (r3 >= r1) goto L38
            r4 = r6[r3]
            if (r4 == 0) goto L35
            if (r4 == r0) goto L35
            r6 = r6[r2]
            r1 = r6 & 1
            if (r1 == 0) goto L1a
            return r0
        L1a:
            r6 = r6 & 2
            if (r6 != 0) goto L2a
            int r6 = r5.length
            if (r6 == 0) goto L28
            r5 = r5[r2]
            r5 = r5 & 2
            if (r5 != 0) goto L28
            return r2
        L28:
            r5 = -1
            return r5
        L2a:
            int r6 = r5.length
            if (r6 == 0) goto L34
            r5 = r5[r2]
            r5 = r5 & 2
            if (r5 != 0) goto L34
            return r0
        L34:
            return r2
        L35:
            int r3 = r3 + 1
            goto Lb
        L38:
            return r0
    }

    public static byte[] defaultMachineId() {
            byte[] r0 = bestAvailableMac()
            if (r0 != 0) goto L1c
            r0 = 8
            byte[] r0 = new byte[r0]
            java.util.Random r1 = io.netty.util.internal.PlatformDependent.threadLocalRandom()
            r1.nextBytes(r0)
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.util.internal.MacAddressUtil.logger
            java.lang.String r2 = "Failed to find a usable hardware address from the network interfaces; using random bytes: {}"
            java.lang.String r3 = formatAddress(r0)
            r1.warn(r2, r3)
        L1c:
            return r0
    }

    public static java.lang.String formatAddress(byte[] r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 24
            r0.<init>(r1)
            int r1 = r6.length
            r2 = 0
            r3 = 0
        La:
            r4 = 1
            if (r3 >= r1) goto L25
            r5 = r6[r3]
            r5 = r5 & 255(0xff, float:3.57E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r2] = r5
            java.lang.String r5 = "%02x:"
            java.lang.String r4 = java.lang.String.format(r5, r4)
            r0.append(r4)
            int r3 = r3 + 1
            goto La
        L25:
            int r6 = r0.length()
            int r6 = r6 - r4
            java.lang.String r6 = r0.substring(r2, r6)
            return r6
    }

    public static byte[] parseMAC(java.lang.String r7) {
            int r0 = r7.length()
            r1 = 17
            r2 = 2
            if (r0 == r1) goto L21
            r1 = 23
            if (r0 != r1) goto L19
            char r0 = r7.charAt(r2)
            validateMacSeparator(r0)
            r1 = 8
            byte[] r1 = new byte[r1]
            goto L2b
        L19:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "value is not supported [MAC-48, EUI-48, EUI-64]"
            r7.<init>(r0)
            throw r7
        L21:
            char r0 = r7.charAt(r2)
            validateMacSeparator(r0)
            r1 = 6
            byte[] r1 = new byte[r1]
        L2b:
            int r2 = r1.length
            int r2 = r2 + (-1)
            r3 = 0
            r4 = 0
        L30:
            if (r3 >= r2) goto L70
            int r5 = r4 + 2
            byte r6 = io.netty.util.internal.StringUtil.decodeHexByte(r7, r4)
            r1[r3] = r6
            char r6 = r7.charAt(r5)
            if (r6 != r0) goto L45
            int r3 = r3 + 1
            int r4 = r4 + 3
            goto L30
        L45:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "expected separator '"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " but got '"
            r2.append(r0)
            char r7 = r7.charAt(r5)
            r2.append(r7)
            java.lang.String r7 = "' at index: "
            r2.append(r7)
            r2.append(r5)
            java.lang.String r7 = r2.toString()
            r1.<init>(r7)
            throw r1
        L70:
            byte r7 = io.netty.util.internal.StringUtil.decodeHexByte(r7, r4)
            r1[r2] = r7
            return r1
    }

    private static int scoreAddress(java.net.InetAddress r1) {
            boolean r0 = r1.isAnyLocalAddress()
            if (r0 != 0) goto L27
            boolean r0 = r1.isLoopbackAddress()
            if (r0 == 0) goto Ld
            goto L27
        Ld:
            boolean r0 = r1.isMulticastAddress()
            if (r0 == 0) goto L15
            r1 = 1
            return r1
        L15:
            boolean r0 = r1.isLinkLocalAddress()
            if (r0 == 0) goto L1d
            r1 = 2
            return r1
        L1d:
            boolean r1 = r1.isSiteLocalAddress()
            if (r1 == 0) goto L25
            r1 = 3
            return r1
        L25:
            r1 = 4
            return r1
        L27:
            r1 = 0
            return r1
    }

    private static void validateMacSeparator(char r3) {
            r0 = 58
            if (r3 == r0) goto L25
            r0 = 45
            if (r3 != r0) goto L9
            goto L25
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unsupported separator: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " (expected: [:-])"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L25:
            return
    }
}
