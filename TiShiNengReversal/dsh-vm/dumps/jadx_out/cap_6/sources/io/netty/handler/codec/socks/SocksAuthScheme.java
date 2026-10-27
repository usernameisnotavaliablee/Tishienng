package io.netty.handler.codec.socks;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public enum SocksAuthScheme extends java.lang.Enum<io.netty.handler.codec.socks.SocksAuthScheme> {
    private static final /* synthetic */ io.netty.handler.codec.socks.SocksAuthScheme[] $VALUES = null;
    public static final io.netty.handler.codec.socks.SocksAuthScheme AUTH_GSSAPI = null;
    public static final io.netty.handler.codec.socks.SocksAuthScheme AUTH_PASSWORD = null;
    public static final io.netty.handler.codec.socks.SocksAuthScheme NO_AUTH = null;
    public static final io.netty.handler.codec.socks.SocksAuthScheme UNKNOWN = null;
    private final byte b;

    static {
            io.netty.handler.codec.socks.SocksAuthScheme r0 = new io.netty.handler.codec.socks.SocksAuthScheme
            java.lang.String r1 = "NO_AUTH"
            r2 = 0
            r0.<init>(r1, r2, r2)
            io.netty.handler.codec.socks.SocksAuthScheme.NO_AUTH = r0
            io.netty.handler.codec.socks.SocksAuthScheme r1 = new io.netty.handler.codec.socks.SocksAuthScheme
            java.lang.String r3 = "AUTH_GSSAPI"
            r4 = 1
            r1.<init>(r3, r4, r4)
            io.netty.handler.codec.socks.SocksAuthScheme.AUTH_GSSAPI = r1
            io.netty.handler.codec.socks.SocksAuthScheme r3 = new io.netty.handler.codec.socks.SocksAuthScheme
            java.lang.String r5 = "AUTH_PASSWORD"
            r6 = 2
            r3.<init>(r5, r6, r6)
            io.netty.handler.codec.socks.SocksAuthScheme.AUTH_PASSWORD = r3
            io.netty.handler.codec.socks.SocksAuthScheme r5 = new io.netty.handler.codec.socks.SocksAuthScheme
            r7 = -1
            java.lang.String r8 = "UNKNOWN"
            r9 = 3
            r5.<init>(r8, r9, r7)
            io.netty.handler.codec.socks.SocksAuthScheme.UNKNOWN = r5
            r7 = 4
            io.netty.handler.codec.socks.SocksAuthScheme[] r7 = new io.netty.handler.codec.socks.SocksAuthScheme[r7]
            r7[r2] = r0
            r7[r4] = r1
            r7[r6] = r3
            r7[r9] = r5
            io.netty.handler.codec.socks.SocksAuthScheme.$VALUES = r7
            return
    }

    SocksAuthScheme(java.lang.String r1, int r2, byte r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.b = r3
            return
    }

    @java.lang.Deprecated
    public static io.netty.handler.codec.socks.SocksAuthScheme fromByte(byte r0) {
            io.netty.handler.codec.socks.SocksAuthScheme r0 = valueOf(r0)
            return r0
    }

    public static io.netty.handler.codec.socks.SocksAuthScheme valueOf(byte r5) {
            io.netty.handler.codec.socks.SocksAuthScheme[] r0 = values()
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
            io.netty.handler.codec.socks.SocksAuthScheme r5 = io.netty.handler.codec.socks.SocksAuthScheme.UNKNOWN
            return r5
    }

    public static io.netty.handler.codec.socks.SocksAuthScheme valueOf(java.lang.String r1) {
            java.lang.Class<io.netty.handler.codec.socks.SocksAuthScheme> r0 = io.netty.handler.codec.socks.SocksAuthScheme.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.netty.handler.codec.socks.SocksAuthScheme r1 = (io.netty.handler.codec.socks.SocksAuthScheme) r1
            return r1
    }

    public static io.netty.handler.codec.socks.SocksAuthScheme[] values() {
            io.netty.handler.codec.socks.SocksAuthScheme[] r0 = io.netty.handler.codec.socks.SocksAuthScheme.$VALUES
            java.lang.Object r0 = r0.clone()
            io.netty.handler.codec.socks.SocksAuthScheme[] r0 = (io.netty.handler.codec.socks.SocksAuthScheme[]) r0
            return r0
    }

    public byte byteValue() {
            r1 = this;
            byte r0 = r1.b
            return r0
    }
}
