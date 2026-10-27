package io.netty.handler.codec.socks;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public enum SocksAddressType extends java.lang.Enum<io.netty.handler.codec.socks.SocksAddressType> {
    private static final /* synthetic */ io.netty.handler.codec.socks.SocksAddressType[] $VALUES = null;
    public static final io.netty.handler.codec.socks.SocksAddressType DOMAIN = null;
    public static final io.netty.handler.codec.socks.SocksAddressType IPv4 = null;
    public static final io.netty.handler.codec.socks.SocksAddressType IPv6 = null;
    public static final io.netty.handler.codec.socks.SocksAddressType UNKNOWN = null;
    private final byte b;

    static {
            io.netty.handler.codec.socks.SocksAddressType r0 = new io.netty.handler.codec.socks.SocksAddressType
            java.lang.String r1 = "IPv4"
            r2 = 0
            r3 = 1
            r0.<init>(r1, r2, r3)
            io.netty.handler.codec.socks.SocksAddressType.IPv4 = r0
            io.netty.handler.codec.socks.SocksAddressType r1 = new io.netty.handler.codec.socks.SocksAddressType
            java.lang.String r4 = "DOMAIN"
            r5 = 3
            r1.<init>(r4, r3, r5)
            io.netty.handler.codec.socks.SocksAddressType.DOMAIN = r1
            io.netty.handler.codec.socks.SocksAddressType r4 = new io.netty.handler.codec.socks.SocksAddressType
            java.lang.String r6 = "IPv6"
            r7 = 2
            r8 = 4
            r4.<init>(r6, r7, r8)
            io.netty.handler.codec.socks.SocksAddressType.IPv6 = r4
            io.netty.handler.codec.socks.SocksAddressType r6 = new io.netty.handler.codec.socks.SocksAddressType
            java.lang.String r9 = "UNKNOWN"
            r10 = -1
            r6.<init>(r9, r5, r10)
            io.netty.handler.codec.socks.SocksAddressType.UNKNOWN = r6
            io.netty.handler.codec.socks.SocksAddressType[] r8 = new io.netty.handler.codec.socks.SocksAddressType[r8]
            r8[r2] = r0
            r8[r3] = r1
            r8[r7] = r4
            r8[r5] = r6
            io.netty.handler.codec.socks.SocksAddressType.$VALUES = r8
            return
    }

    SocksAddressType(java.lang.String r1, int r2, byte r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.b = r3
            return
    }

    @java.lang.Deprecated
    public static io.netty.handler.codec.socks.SocksAddressType fromByte(byte r0) {
            io.netty.handler.codec.socks.SocksAddressType r0 = valueOf(r0)
            return r0
    }

    public static io.netty.handler.codec.socks.SocksAddressType valueOf(byte r5) {
            io.netty.handler.codec.socks.SocksAddressType[] r0 = values()
            int r1 = r0.length
            r2 = 0
        L6:
            if (r2 >= r1) goto L12
            r3 = r0[r2]
            byte r4 = r3.b
            if (r4 != r5) goto Lf
            return r3
        Lf:
            int r2 = r2 + 1
            goto L6
        L12:
            io.netty.handler.codec.socks.SocksAddressType r5 = io.netty.handler.codec.socks.SocksAddressType.UNKNOWN
            return r5
    }

    public static io.netty.handler.codec.socks.SocksAddressType valueOf(java.lang.String r1) {
            java.lang.Class<io.netty.handler.codec.socks.SocksAddressType> r0 = io.netty.handler.codec.socks.SocksAddressType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.netty.handler.codec.socks.SocksAddressType r1 = (io.netty.handler.codec.socks.SocksAddressType) r1
            return r1
    }

    public static io.netty.handler.codec.socks.SocksAddressType[] values() {
            io.netty.handler.codec.socks.SocksAddressType[] r0 = io.netty.handler.codec.socks.SocksAddressType.$VALUES
            java.lang.Object r0 = r0.clone()
            io.netty.handler.codec.socks.SocksAddressType[] r0 = (io.netty.handler.codec.socks.SocksAddressType[]) r0
            return r0
    }

    public byte byteValue() {
            r1 = this;
            byte r0 = r1.b
            return r0
    }
}
