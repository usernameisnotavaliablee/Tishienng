package io.netty.handler.codec.spdy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public enum SpdyVersion extends java.lang.Enum<io.netty.handler.codec.spdy.SpdyVersion> {
    private static final /* synthetic */ io.netty.handler.codec.spdy.SpdyVersion[] $VALUES = null;
    public static final io.netty.handler.codec.spdy.SpdyVersion SPDY_3_1 = null;
    private final int minorVersion;
    private final int version;

    static {
            io.netty.handler.codec.spdy.SpdyVersion r0 = new io.netty.handler.codec.spdy.SpdyVersion
            java.lang.String r1 = "SPDY_3_1"
            r2 = 0
            r3 = 3
            r4 = 1
            r0.<init>(r1, r2, r3, r4)
            io.netty.handler.codec.spdy.SpdyVersion.SPDY_3_1 = r0
            io.netty.handler.codec.spdy.SpdyVersion[] r1 = new io.netty.handler.codec.spdy.SpdyVersion[r4]
            r1[r2] = r0
            io.netty.handler.codec.spdy.SpdyVersion.$VALUES = r1
            return
    }

    SpdyVersion(java.lang.String r1, int r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.version = r3
            r0.minorVersion = r4
            return
    }

    public static io.netty.handler.codec.spdy.SpdyVersion valueOf(java.lang.String r1) {
            java.lang.Class<io.netty.handler.codec.spdy.SpdyVersion> r0 = io.netty.handler.codec.spdy.SpdyVersion.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.netty.handler.codec.spdy.SpdyVersion r1 = (io.netty.handler.codec.spdy.SpdyVersion) r1
            return r1
    }

    public static io.netty.handler.codec.spdy.SpdyVersion[] values() {
            io.netty.handler.codec.spdy.SpdyVersion[] r0 = io.netty.handler.codec.spdy.SpdyVersion.$VALUES
            java.lang.Object r0 = r0.clone()
            io.netty.handler.codec.spdy.SpdyVersion[] r0 = (io.netty.handler.codec.spdy.SpdyVersion[]) r0
            return r0
    }

    int getMinorVersion() {
            r1 = this;
            int r0 = r1.minorVersion
            return r0
    }

    int getVersion() {
            r1 = this;
            int r0 = r1.version
            return r0
    }
}
