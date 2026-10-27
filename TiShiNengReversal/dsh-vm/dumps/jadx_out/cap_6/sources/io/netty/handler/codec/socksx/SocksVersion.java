package io.netty.handler.codec.socksx;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public enum SocksVersion extends java.lang.Enum<io.netty.handler.codec.socksx.SocksVersion> {
    private static final /* synthetic */ io.netty.handler.codec.socksx.SocksVersion[] $VALUES = null;
    public static final io.netty.handler.codec.socksx.SocksVersion SOCKS4a = null;
    public static final io.netty.handler.codec.socksx.SocksVersion SOCKS5 = null;
    public static final io.netty.handler.codec.socksx.SocksVersion UNKNOWN = null;
    private final byte b;

    static {
            io.netty.handler.codec.socksx.SocksVersion r0 = new io.netty.handler.codec.socksx.SocksVersion
            r1 = 4
            java.lang.String r2 = "SOCKS4a"
            r3 = 0
            r0.<init>(r2, r3, r1)
            io.netty.handler.codec.socksx.SocksVersion.SOCKS4a = r0
            io.netty.handler.codec.socksx.SocksVersion r1 = new io.netty.handler.codec.socksx.SocksVersion
            r2 = 5
            java.lang.String r4 = "SOCKS5"
            r5 = 1
            r1.<init>(r4, r5, r2)
            io.netty.handler.codec.socksx.SocksVersion.SOCKS5 = r1
            io.netty.handler.codec.socksx.SocksVersion r2 = new io.netty.handler.codec.socksx.SocksVersion
            r4 = -1
            java.lang.String r6 = "UNKNOWN"
            r7 = 2
            r2.<init>(r6, r7, r4)
            io.netty.handler.codec.socksx.SocksVersion.UNKNOWN = r2
            r4 = 3
            io.netty.handler.codec.socksx.SocksVersion[] r4 = new io.netty.handler.codec.socksx.SocksVersion[r4]
            r4[r3] = r0
            r4[r5] = r1
            r4[r7] = r2
            io.netty.handler.codec.socksx.SocksVersion.$VALUES = r4
            return
    }

    SocksVersion(java.lang.String r1, int r2, byte r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.b = r3
            return
    }

    public static io.netty.handler.codec.socksx.SocksVersion valueOf(byte r2) {
            io.netty.handler.codec.socksx.SocksVersion r0 = io.netty.handler.codec.socksx.SocksVersion.SOCKS4a
            byte r1 = r0.byteValue()
            if (r2 != r1) goto L9
            return r0
        L9:
            io.netty.handler.codec.socksx.SocksVersion r0 = io.netty.handler.codec.socksx.SocksVersion.SOCKS5
            byte r1 = r0.byteValue()
            if (r2 != r1) goto L12
            return r0
        L12:
            io.netty.handler.codec.socksx.SocksVersion r2 = io.netty.handler.codec.socksx.SocksVersion.UNKNOWN
            return r2
    }

    public static io.netty.handler.codec.socksx.SocksVersion valueOf(java.lang.String r1) {
            java.lang.Class<io.netty.handler.codec.socksx.SocksVersion> r0 = io.netty.handler.codec.socksx.SocksVersion.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.netty.handler.codec.socksx.SocksVersion r1 = (io.netty.handler.codec.socksx.SocksVersion) r1
            return r1
    }

    public static io.netty.handler.codec.socksx.SocksVersion[] values() {
            io.netty.handler.codec.socksx.SocksVersion[] r0 = io.netty.handler.codec.socksx.SocksVersion.$VALUES
            java.lang.Object r0 = r0.clone()
            io.netty.handler.codec.socksx.SocksVersion[] r0 = (io.netty.handler.codec.socksx.SocksVersion[]) r0
            return r0
    }

    public byte byteValue() {
            r1 = this;
            byte r0 = r1.b
            return r0
    }
}
