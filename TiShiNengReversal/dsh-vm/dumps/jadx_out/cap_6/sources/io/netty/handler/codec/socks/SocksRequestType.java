package io.netty.handler.codec.socks;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public enum SocksRequestType extends java.lang.Enum<io.netty.handler.codec.socks.SocksRequestType> {
    private static final /* synthetic */ io.netty.handler.codec.socks.SocksRequestType[] $VALUES = null;
    public static final io.netty.handler.codec.socks.SocksRequestType AUTH = null;
    public static final io.netty.handler.codec.socks.SocksRequestType CMD = null;
    public static final io.netty.handler.codec.socks.SocksRequestType INIT = null;
    public static final io.netty.handler.codec.socks.SocksRequestType UNKNOWN = null;

    static {
            io.netty.handler.codec.socks.SocksRequestType r0 = new io.netty.handler.codec.socks.SocksRequestType
            java.lang.String r1 = "INIT"
            r2 = 0
            r0.<init>(r1, r2)
            io.netty.handler.codec.socks.SocksRequestType.INIT = r0
            io.netty.handler.codec.socks.SocksRequestType r1 = new io.netty.handler.codec.socks.SocksRequestType
            java.lang.String r3 = "AUTH"
            r4 = 1
            r1.<init>(r3, r4)
            io.netty.handler.codec.socks.SocksRequestType.AUTH = r1
            io.netty.handler.codec.socks.SocksRequestType r3 = new io.netty.handler.codec.socks.SocksRequestType
            java.lang.String r5 = "CMD"
            r6 = 2
            r3.<init>(r5, r6)
            io.netty.handler.codec.socks.SocksRequestType.CMD = r3
            io.netty.handler.codec.socks.SocksRequestType r5 = new io.netty.handler.codec.socks.SocksRequestType
            java.lang.String r7 = "UNKNOWN"
            r8 = 3
            r5.<init>(r7, r8)
            io.netty.handler.codec.socks.SocksRequestType.UNKNOWN = r5
            r7 = 4
            io.netty.handler.codec.socks.SocksRequestType[] r7 = new io.netty.handler.codec.socks.SocksRequestType[r7]
            r7[r2] = r0
            r7[r4] = r1
            r7[r6] = r3
            r7[r8] = r5
            io.netty.handler.codec.socks.SocksRequestType.$VALUES = r7
            return
    }

    SocksRequestType(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static io.netty.handler.codec.socks.SocksRequestType valueOf(java.lang.String r1) {
            java.lang.Class<io.netty.handler.codec.socks.SocksRequestType> r0 = io.netty.handler.codec.socks.SocksRequestType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.netty.handler.codec.socks.SocksRequestType r1 = (io.netty.handler.codec.socks.SocksRequestType) r1
            return r1
    }

    public static io.netty.handler.codec.socks.SocksRequestType[] values() {
            io.netty.handler.codec.socks.SocksRequestType[] r0 = io.netty.handler.codec.socks.SocksRequestType.$VALUES
            java.lang.Object r0 = r0.clone()
            io.netty.handler.codec.socks.SocksRequestType[] r0 = (io.netty.handler.codec.socks.SocksRequestType[]) r0
            return r0
    }
}
