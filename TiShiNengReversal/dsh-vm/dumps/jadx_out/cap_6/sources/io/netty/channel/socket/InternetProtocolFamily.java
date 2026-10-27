package io.netty.channel.socket;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public enum InternetProtocolFamily extends java.lang.Enum<io.netty.channel.socket.InternetProtocolFamily> {
    private static final /* synthetic */ io.netty.channel.socket.InternetProtocolFamily[] $VALUES = null;
    public static final io.netty.channel.socket.InternetProtocolFamily IPv4 = null;
    public static final io.netty.channel.socket.InternetProtocolFamily IPv6 = null;
    private final int addressNumber;
    private final java.lang.Class<? extends java.net.InetAddress> addressType;
    private final java.net.InetAddress localHost;

    static {
            io.netty.channel.socket.InternetProtocolFamily r0 = new io.netty.channel.socket.InternetProtocolFamily
            r4 = 1
            java.net.Inet4Address r5 = io.netty.util.NetUtil.LOCALHOST4
            java.lang.String r1 = "IPv4"
            r2 = 0
            java.lang.Class<java.net.Inet4Address> r3 = java.net.Inet4Address.class
            r0.<init>(r1, r2, r3, r4, r5)
            io.netty.channel.socket.InternetProtocolFamily.IPv4 = r0
            io.netty.channel.socket.InternetProtocolFamily r1 = new io.netty.channel.socket.InternetProtocolFamily
            r5 = 2
            java.net.Inet6Address r6 = io.netty.util.NetUtil.LOCALHOST6
            java.lang.String r2 = "IPv6"
            r3 = 1
            java.lang.Class<java.net.Inet6Address> r4 = java.net.Inet6Address.class
            r1.<init>(r2, r3, r4, r5, r6)
            io.netty.channel.socket.InternetProtocolFamily.IPv6 = r1
            r2 = 2
            io.netty.channel.socket.InternetProtocolFamily[] r2 = new io.netty.channel.socket.InternetProtocolFamily[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            io.netty.channel.socket.InternetProtocolFamily.$VALUES = r2
            return
    }

    InternetProtocolFamily(java.lang.String r1, int r2, java.lang.Class r3, int r4, java.net.InetAddress r5) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.addressType = r3
            r0.addressNumber = r4
            r0.localHost = r5
            return
    }

    public static io.netty.channel.socket.InternetProtocolFamily of(java.net.InetAddress r3) {
            boolean r0 = r3 instanceof java.net.Inet4Address
            if (r0 == 0) goto L7
            io.netty.channel.socket.InternetProtocolFamily r3 = io.netty.channel.socket.InternetProtocolFamily.IPv4
            return r3
        L7:
            boolean r0 = r3 instanceof java.net.Inet6Address
            if (r0 == 0) goto Le
            io.netty.channel.socket.InternetProtocolFamily r3 = io.netty.channel.socket.InternetProtocolFamily.IPv6
            return r3
        Le:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "address "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " not supported"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public static io.netty.channel.socket.InternetProtocolFamily valueOf(java.lang.String r1) {
            java.lang.Class<io.netty.channel.socket.InternetProtocolFamily> r0 = io.netty.channel.socket.InternetProtocolFamily.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.netty.channel.socket.InternetProtocolFamily r1 = (io.netty.channel.socket.InternetProtocolFamily) r1
            return r1
    }

    public static io.netty.channel.socket.InternetProtocolFamily[] values() {
            io.netty.channel.socket.InternetProtocolFamily[] r0 = io.netty.channel.socket.InternetProtocolFamily.$VALUES
            java.lang.Object r0 = r0.clone()
            io.netty.channel.socket.InternetProtocolFamily[] r0 = (io.netty.channel.socket.InternetProtocolFamily[]) r0
            return r0
    }

    public int addressNumber() {
            r1 = this;
            int r0 = r1.addressNumber
            return r0
    }

    public java.lang.Class<? extends java.net.InetAddress> addressType() {
            r1 = this;
            java.lang.Class<? extends java.net.InetAddress> r0 = r1.addressType
            return r0
    }

    public java.net.InetAddress localhost() {
            r1 = this;
            java.net.InetAddress r0 = r1.localHost
            return r0
    }
}
