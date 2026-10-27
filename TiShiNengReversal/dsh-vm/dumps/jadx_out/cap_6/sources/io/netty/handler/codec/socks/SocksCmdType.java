package io.netty.handler.codec.socks;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public enum SocksCmdType extends java.lang.Enum<io.netty.handler.codec.socks.SocksCmdType> {
    private static final /* synthetic */ io.netty.handler.codec.socks.SocksCmdType[] $VALUES = null;
    public static final io.netty.handler.codec.socks.SocksCmdType BIND = null;
    public static final io.netty.handler.codec.socks.SocksCmdType CONNECT = null;
    public static final io.netty.handler.codec.socks.SocksCmdType UDP = null;
    public static final io.netty.handler.codec.socks.SocksCmdType UNKNOWN = null;
    private final byte b;

    static {
            io.netty.handler.codec.socks.SocksCmdType r0 = new io.netty.handler.codec.socks.SocksCmdType
            java.lang.String r1 = "CONNECT"
            r2 = 0
            r3 = 1
            r0.<init>(r1, r2, r3)
            io.netty.handler.codec.socks.SocksCmdType.CONNECT = r0
            io.netty.handler.codec.socks.SocksCmdType r1 = new io.netty.handler.codec.socks.SocksCmdType
            java.lang.String r4 = "BIND"
            r5 = 2
            r1.<init>(r4, r3, r5)
            io.netty.handler.codec.socks.SocksCmdType.BIND = r1
            io.netty.handler.codec.socks.SocksCmdType r4 = new io.netty.handler.codec.socks.SocksCmdType
            java.lang.String r6 = "UDP"
            r7 = 3
            r4.<init>(r6, r5, r7)
            io.netty.handler.codec.socks.SocksCmdType.UDP = r4
            io.netty.handler.codec.socks.SocksCmdType r6 = new io.netty.handler.codec.socks.SocksCmdType
            java.lang.String r8 = "UNKNOWN"
            r9 = -1
            r6.<init>(r8, r7, r9)
            io.netty.handler.codec.socks.SocksCmdType.UNKNOWN = r6
            r8 = 4
            io.netty.handler.codec.socks.SocksCmdType[] r8 = new io.netty.handler.codec.socks.SocksCmdType[r8]
            r8[r2] = r0
            r8[r3] = r1
            r8[r5] = r4
            r8[r7] = r6
            io.netty.handler.codec.socks.SocksCmdType.$VALUES = r8
            return
    }

    SocksCmdType(java.lang.String r1, int r2, byte r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.b = r3
            return
    }

    @java.lang.Deprecated
    public static io.netty.handler.codec.socks.SocksCmdType fromByte(byte r0) {
            io.netty.handler.codec.socks.SocksCmdType r0 = valueOf(r0)
            return r0
    }

    public static io.netty.handler.codec.socks.SocksCmdType valueOf(byte r5) {
            io.netty.handler.codec.socks.SocksCmdType[] r0 = values()
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
            io.netty.handler.codec.socks.SocksCmdType r5 = io.netty.handler.codec.socks.SocksCmdType.UNKNOWN
            return r5
    }

    public static io.netty.handler.codec.socks.SocksCmdType valueOf(java.lang.String r1) {
            java.lang.Class<io.netty.handler.codec.socks.SocksCmdType> r0 = io.netty.handler.codec.socks.SocksCmdType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.netty.handler.codec.socks.SocksCmdType r1 = (io.netty.handler.codec.socks.SocksCmdType) r1
            return r1
    }

    public static io.netty.handler.codec.socks.SocksCmdType[] values() {
            io.netty.handler.codec.socks.SocksCmdType[] r0 = io.netty.handler.codec.socks.SocksCmdType.$VALUES
            java.lang.Object r0 = r0.clone()
            io.netty.handler.codec.socks.SocksCmdType[] r0 = (io.netty.handler.codec.socks.SocksCmdType[]) r0
            return r0
    }

    public byte byteValue() {
            r1 = this;
            byte r0 = r1.b
            return r0
    }
}
