package io.netty.handler.codec.socks;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public enum SocksMessageType extends java.lang.Enum<io.netty.handler.codec.socks.SocksMessageType> {
    private static final /* synthetic */ io.netty.handler.codec.socks.SocksMessageType[] $VALUES = null;
    public static final io.netty.handler.codec.socks.SocksMessageType REQUEST = null;
    public static final io.netty.handler.codec.socks.SocksMessageType RESPONSE = null;
    public static final io.netty.handler.codec.socks.SocksMessageType UNKNOWN = null;

    static {
            io.netty.handler.codec.socks.SocksMessageType r0 = new io.netty.handler.codec.socks.SocksMessageType
            java.lang.String r1 = "REQUEST"
            r2 = 0
            r0.<init>(r1, r2)
            io.netty.handler.codec.socks.SocksMessageType.REQUEST = r0
            io.netty.handler.codec.socks.SocksMessageType r1 = new io.netty.handler.codec.socks.SocksMessageType
            java.lang.String r3 = "RESPONSE"
            r4 = 1
            r1.<init>(r3, r4)
            io.netty.handler.codec.socks.SocksMessageType.RESPONSE = r1
            io.netty.handler.codec.socks.SocksMessageType r3 = new io.netty.handler.codec.socks.SocksMessageType
            java.lang.String r5 = "UNKNOWN"
            r6 = 2
            r3.<init>(r5, r6)
            io.netty.handler.codec.socks.SocksMessageType.UNKNOWN = r3
            r5 = 3
            io.netty.handler.codec.socks.SocksMessageType[] r5 = new io.netty.handler.codec.socks.SocksMessageType[r5]
            r5[r2] = r0
            r5[r4] = r1
            r5[r6] = r3
            io.netty.handler.codec.socks.SocksMessageType.$VALUES = r5
            return
    }

    SocksMessageType(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static io.netty.handler.codec.socks.SocksMessageType valueOf(java.lang.String r1) {
            java.lang.Class<io.netty.handler.codec.socks.SocksMessageType> r0 = io.netty.handler.codec.socks.SocksMessageType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.netty.handler.codec.socks.SocksMessageType r1 = (io.netty.handler.codec.socks.SocksMessageType) r1
            return r1
    }

    public static io.netty.handler.codec.socks.SocksMessageType[] values() {
            io.netty.handler.codec.socks.SocksMessageType[] r0 = io.netty.handler.codec.socks.SocksMessageType.$VALUES
            java.lang.Object r0 = r0.clone()
            io.netty.handler.codec.socks.SocksMessageType[] r0 = (io.netty.handler.codec.socks.SocksMessageType[]) r0
            return r0
    }
}
