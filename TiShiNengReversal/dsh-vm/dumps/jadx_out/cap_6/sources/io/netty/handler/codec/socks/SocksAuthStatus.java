package io.netty.handler.codec.socks;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public enum SocksAuthStatus extends java.lang.Enum<io.netty.handler.codec.socks.SocksAuthStatus> {
    private static final /* synthetic */ io.netty.handler.codec.socks.SocksAuthStatus[] $VALUES = null;
    public static final io.netty.handler.codec.socks.SocksAuthStatus FAILURE = null;
    public static final io.netty.handler.codec.socks.SocksAuthStatus SUCCESS = null;
    private final byte b;

    static {
            io.netty.handler.codec.socks.SocksAuthStatus r0 = new io.netty.handler.codec.socks.SocksAuthStatus
            java.lang.String r1 = "SUCCESS"
            r2 = 0
            r0.<init>(r1, r2, r2)
            io.netty.handler.codec.socks.SocksAuthStatus.SUCCESS = r0
            io.netty.handler.codec.socks.SocksAuthStatus r1 = new io.netty.handler.codec.socks.SocksAuthStatus
            r3 = -1
            java.lang.String r4 = "FAILURE"
            r5 = 1
            r1.<init>(r4, r5, r3)
            io.netty.handler.codec.socks.SocksAuthStatus.FAILURE = r1
            r3 = 2
            io.netty.handler.codec.socks.SocksAuthStatus[] r3 = new io.netty.handler.codec.socks.SocksAuthStatus[r3]
            r3[r2] = r0
            r3[r5] = r1
            io.netty.handler.codec.socks.SocksAuthStatus.$VALUES = r3
            return
    }

    SocksAuthStatus(java.lang.String r1, int r2, byte r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.b = r3
            return
    }

    @java.lang.Deprecated
    public static io.netty.handler.codec.socks.SocksAuthStatus fromByte(byte r0) {
            io.netty.handler.codec.socks.SocksAuthStatus r0 = valueOf(r0)
            return r0
    }

    public static io.netty.handler.codec.socks.SocksAuthStatus valueOf(byte r5) {
            io.netty.handler.codec.socks.SocksAuthStatus[] r0 = values()
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
            io.netty.handler.codec.socks.SocksAuthStatus r5 = io.netty.handler.codec.socks.SocksAuthStatus.FAILURE
            return r5
    }

    public static io.netty.handler.codec.socks.SocksAuthStatus valueOf(java.lang.String r1) {
            java.lang.Class<io.netty.handler.codec.socks.SocksAuthStatus> r0 = io.netty.handler.codec.socks.SocksAuthStatus.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.netty.handler.codec.socks.SocksAuthStatus r1 = (io.netty.handler.codec.socks.SocksAuthStatus) r1
            return r1
    }

    public static io.netty.handler.codec.socks.SocksAuthStatus[] values() {
            io.netty.handler.codec.socks.SocksAuthStatus[] r0 = io.netty.handler.codec.socks.SocksAuthStatus.$VALUES
            java.lang.Object r0 = r0.clone()
            io.netty.handler.codec.socks.SocksAuthStatus[] r0 = (io.netty.handler.codec.socks.SocksAuthStatus[]) r0
            return r0
    }

    public byte byteValue() {
            r1 = this;
            byte r0 = r1.b
            return r0
    }
}
