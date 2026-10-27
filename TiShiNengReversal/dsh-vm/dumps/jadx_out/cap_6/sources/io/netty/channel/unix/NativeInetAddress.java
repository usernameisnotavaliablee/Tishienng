package io.netty.channel.unix;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class NativeInetAddress {
    private static final byte[] IPV4_MAPPED_IPV6_PREFIX = null;
    final byte[] address;
    final int scopeId;

    static {
            r0 = 12
            byte[] r0 = new byte[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1} // fill-array
            io.netty.channel.unix.NativeInetAddress.IPV4_MAPPED_IPV6_PREFIX = r0
            return
    }

    public NativeInetAddress(byte[] r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public NativeInetAddress(byte[] r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.address = r1
            r0.scopeId = r2
            return
    }

    public static java.net.InetSocketAddress address(byte[] r5, int r6, int r7) {
            int r0 = r6 + r7
            int r1 = r0 + (-4)
            int r1 = decodeInt(r5, r1)
            r2 = 0
            r3 = 8
            if (r7 == r3) goto L29
            r4 = 24
            if (r7 != r4) goto L23
            r7 = 16
            byte[] r4 = new byte[r7]     // Catch: java.net.UnknownHostException -> L39
            java.lang.System.arraycopy(r5, r6, r4, r2, r7)     // Catch: java.net.UnknownHostException -> L39
            int r0 = r0 - r3
            int r5 = decodeInt(r5, r0)     // Catch: java.net.UnknownHostException -> L39
            r6 = 0
            java.net.Inet6Address r5 = java.net.Inet6Address.getByAddress(r6, r4, r5)     // Catch: java.net.UnknownHostException -> L39
            goto L33
        L23:
            java.lang.Error r5 = new java.lang.Error     // Catch: java.net.UnknownHostException -> L39
            r5.<init>()     // Catch: java.net.UnknownHostException -> L39
            throw r5     // Catch: java.net.UnknownHostException -> L39
        L29:
            r7 = 4
            byte[] r0 = new byte[r7]     // Catch: java.net.UnknownHostException -> L39
            java.lang.System.arraycopy(r5, r6, r0, r2, r7)     // Catch: java.net.UnknownHostException -> L39
            java.net.InetAddress r5 = java.net.InetAddress.getByAddress(r0)     // Catch: java.net.UnknownHostException -> L39
        L33:
            java.net.InetSocketAddress r6 = new java.net.InetSocketAddress     // Catch: java.net.UnknownHostException -> L39
            r6.<init>(r5, r1)     // Catch: java.net.UnknownHostException -> L39
            return r6
        L39:
            r5 = move-exception
            java.lang.Error r6 = new java.lang.Error
            java.lang.String r7 = "Should never happen"
            r6.<init>(r7, r5)
            throw r6
    }

    static int decodeInt(byte[] r2, int r3) {
            r0 = r2[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 24
            int r1 = r3 + 1
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r0 = r0 | r1
            int r1 = r3 + 2
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            int r3 = r3 + 3
            r2 = r2[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r2 = r2 | r0
            return r2
    }

    public static byte[] ipv4MappedIpv6Address(byte[] r4) {
            r0 = 16
            byte[] r0 = new byte[r0]
            byte[] r1 = io.netty.channel.unix.NativeInetAddress.IPV4_MAPPED_IPV6_PREFIX
            int r2 = r1.length
            r3 = 0
            java.lang.System.arraycopy(r1, r3, r0, r3, r2)
            r1 = 12
            int r2 = r4.length
            java.lang.System.arraycopy(r4, r3, r0, r1, r2)
            return r0
    }

    public static io.netty.channel.unix.NativeInetAddress newInstance(java.net.InetAddress r2) {
            byte[] r0 = r2.getAddress()
            boolean r1 = r2 instanceof java.net.Inet6Address
            if (r1 == 0) goto L14
            io.netty.channel.unix.NativeInetAddress r1 = new io.netty.channel.unix.NativeInetAddress
            java.net.Inet6Address r2 = (java.net.Inet6Address) r2
            int r2 = r2.getScopeId()
            r1.<init>(r0, r2)
            return r1
        L14:
            io.netty.channel.unix.NativeInetAddress r2 = new io.netty.channel.unix.NativeInetAddress
            byte[] r0 = ipv4MappedIpv6Address(r0)
            r2.<init>(r0)
            return r2
    }

    public byte[] address() {
            r1 = this;
            byte[] r0 = r1.address
            return r0
    }

    public int scopeId() {
            r1 = this;
            int r0 = r1.scopeId
            return r0
    }
}
