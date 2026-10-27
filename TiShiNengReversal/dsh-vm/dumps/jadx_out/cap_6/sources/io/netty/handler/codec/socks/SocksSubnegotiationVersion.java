package io.netty.handler.codec.socks;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public enum SocksSubnegotiationVersion extends java.lang.Enum<io.netty.handler.codec.socks.SocksSubnegotiationVersion> {
    private static final /* synthetic */ io.netty.handler.codec.socks.SocksSubnegotiationVersion[] $VALUES = null;
    public static final io.netty.handler.codec.socks.SocksSubnegotiationVersion AUTH_PASSWORD = null;
    public static final io.netty.handler.codec.socks.SocksSubnegotiationVersion UNKNOWN = null;
    private final byte b;

    static {
            io.netty.handler.codec.socks.SocksSubnegotiationVersion r0 = new io.netty.handler.codec.socks.SocksSubnegotiationVersion
            java.lang.String r1 = "AUTH_PASSWORD"
            r2 = 0
            r3 = 1
            r0.<init>(r1, r2, r3)
            io.netty.handler.codec.socks.SocksSubnegotiationVersion.AUTH_PASSWORD = r0
            io.netty.handler.codec.socks.SocksSubnegotiationVersion r1 = new io.netty.handler.codec.socks.SocksSubnegotiationVersion
            java.lang.String r4 = "UNKNOWN"
            r5 = -1
            r1.<init>(r4, r3, r5)
            io.netty.handler.codec.socks.SocksSubnegotiationVersion.UNKNOWN = r1
            r4 = 2
            io.netty.handler.codec.socks.SocksSubnegotiationVersion[] r4 = new io.netty.handler.codec.socks.SocksSubnegotiationVersion[r4]
            r4[r2] = r0
            r4[r3] = r1
            io.netty.handler.codec.socks.SocksSubnegotiationVersion.$VALUES = r4
            return
    }

    SocksSubnegotiationVersion(java.lang.String r1, int r2, byte r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.b = r3
            return
    }

    @java.lang.Deprecated
    public static io.netty.handler.codec.socks.SocksSubnegotiationVersion fromByte(byte r0) {
            io.netty.handler.codec.socks.SocksSubnegotiationVersion r0 = valueOf(r0)
            return r0
    }

    public static io.netty.handler.codec.socks.SocksSubnegotiationVersion valueOf(byte r5) {
            io.netty.handler.codec.socks.SocksSubnegotiationVersion[] r0 = values()
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
            io.netty.handler.codec.socks.SocksSubnegotiationVersion r5 = io.netty.handler.codec.socks.SocksSubnegotiationVersion.UNKNOWN
            return r5
    }

    public static io.netty.handler.codec.socks.SocksSubnegotiationVersion valueOf(java.lang.String r1) {
            java.lang.Class<io.netty.handler.codec.socks.SocksSubnegotiationVersion> r0 = io.netty.handler.codec.socks.SocksSubnegotiationVersion.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.netty.handler.codec.socks.SocksSubnegotiationVersion r1 = (io.netty.handler.codec.socks.SocksSubnegotiationVersion) r1
            return r1
    }

    public static io.netty.handler.codec.socks.SocksSubnegotiationVersion[] values() {
            io.netty.handler.codec.socks.SocksSubnegotiationVersion[] r0 = io.netty.handler.codec.socks.SocksSubnegotiationVersion.$VALUES
            java.lang.Object r0 = r0.clone()
            io.netty.handler.codec.socks.SocksSubnegotiationVersion[] r0 = (io.netty.handler.codec.socks.SocksSubnegotiationVersion[]) r0
            return r0
    }

    public byte byteValue() {
            r1 = this;
            byte r0 = r1.b
            return r0
    }
}
