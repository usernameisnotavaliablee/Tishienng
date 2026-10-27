package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public enum ClientAuth extends java.lang.Enum<io.netty.handler.ssl.ClientAuth> {
    private static final /* synthetic */ io.netty.handler.ssl.ClientAuth[] $VALUES = null;
    public static final io.netty.handler.ssl.ClientAuth NONE = null;
    public static final io.netty.handler.ssl.ClientAuth OPTIONAL = null;
    public static final io.netty.handler.ssl.ClientAuth REQUIRE = null;

    static {
            io.netty.handler.ssl.ClientAuth r0 = new io.netty.handler.ssl.ClientAuth
            java.lang.String r1 = "NONE"
            r2 = 0
            r0.<init>(r1, r2)
            io.netty.handler.ssl.ClientAuth.NONE = r0
            io.netty.handler.ssl.ClientAuth r1 = new io.netty.handler.ssl.ClientAuth
            java.lang.String r3 = "OPTIONAL"
            r4 = 1
            r1.<init>(r3, r4)
            io.netty.handler.ssl.ClientAuth.OPTIONAL = r1
            io.netty.handler.ssl.ClientAuth r3 = new io.netty.handler.ssl.ClientAuth
            java.lang.String r5 = "REQUIRE"
            r6 = 2
            r3.<init>(r5, r6)
            io.netty.handler.ssl.ClientAuth.REQUIRE = r3
            r5 = 3
            io.netty.handler.ssl.ClientAuth[] r5 = new io.netty.handler.ssl.ClientAuth[r5]
            r5[r2] = r0
            r5[r4] = r1
            r5[r6] = r3
            io.netty.handler.ssl.ClientAuth.$VALUES = r5
            return
    }

    ClientAuth(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static io.netty.handler.ssl.ClientAuth valueOf(java.lang.String r1) {
            java.lang.Class<io.netty.handler.ssl.ClientAuth> r0 = io.netty.handler.ssl.ClientAuth.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.netty.handler.ssl.ClientAuth r1 = (io.netty.handler.ssl.ClientAuth) r1
            return r1
    }

    public static io.netty.handler.ssl.ClientAuth[] values() {
            io.netty.handler.ssl.ClientAuth[] r0 = io.netty.handler.ssl.ClientAuth.$VALUES
            java.lang.Object r0 = r0.clone()
            io.netty.handler.ssl.ClientAuth[] r0 = (io.netty.handler.ssl.ClientAuth[]) r0
            return r0
    }
}
