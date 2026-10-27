package io.netty.handler.codec.compression;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public enum ZlibWrapper extends java.lang.Enum<io.netty.handler.codec.compression.ZlibWrapper> {
    private static final /* synthetic */ io.netty.handler.codec.compression.ZlibWrapper[] $VALUES = null;
    public static final io.netty.handler.codec.compression.ZlibWrapper GZIP = null;
    public static final io.netty.handler.codec.compression.ZlibWrapper NONE = null;
    public static final io.netty.handler.codec.compression.ZlibWrapper ZLIB = null;
    public static final io.netty.handler.codec.compression.ZlibWrapper ZLIB_OR_NONE = null;

    static {
            io.netty.handler.codec.compression.ZlibWrapper r0 = new io.netty.handler.codec.compression.ZlibWrapper
            java.lang.String r1 = "ZLIB"
            r2 = 0
            r0.<init>(r1, r2)
            io.netty.handler.codec.compression.ZlibWrapper.ZLIB = r0
            io.netty.handler.codec.compression.ZlibWrapper r1 = new io.netty.handler.codec.compression.ZlibWrapper
            java.lang.String r3 = "GZIP"
            r4 = 1
            r1.<init>(r3, r4)
            io.netty.handler.codec.compression.ZlibWrapper.GZIP = r1
            io.netty.handler.codec.compression.ZlibWrapper r3 = new io.netty.handler.codec.compression.ZlibWrapper
            java.lang.String r5 = "NONE"
            r6 = 2
            r3.<init>(r5, r6)
            io.netty.handler.codec.compression.ZlibWrapper.NONE = r3
            io.netty.handler.codec.compression.ZlibWrapper r5 = new io.netty.handler.codec.compression.ZlibWrapper
            java.lang.String r7 = "ZLIB_OR_NONE"
            r8 = 3
            r5.<init>(r7, r8)
            io.netty.handler.codec.compression.ZlibWrapper.ZLIB_OR_NONE = r5
            r7 = 4
            io.netty.handler.codec.compression.ZlibWrapper[] r7 = new io.netty.handler.codec.compression.ZlibWrapper[r7]
            r7[r2] = r0
            r7[r4] = r1
            r7[r6] = r3
            r7[r8] = r5
            io.netty.handler.codec.compression.ZlibWrapper.$VALUES = r7
            return
    }

    ZlibWrapper(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static io.netty.handler.codec.compression.ZlibWrapper valueOf(java.lang.String r1) {
            java.lang.Class<io.netty.handler.codec.compression.ZlibWrapper> r0 = io.netty.handler.codec.compression.ZlibWrapper.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.netty.handler.codec.compression.ZlibWrapper r1 = (io.netty.handler.codec.compression.ZlibWrapper) r1
            return r1
    }

    public static io.netty.handler.codec.compression.ZlibWrapper[] values() {
            io.netty.handler.codec.compression.ZlibWrapper[] r0 = io.netty.handler.codec.compression.ZlibWrapper.$VALUES
            java.lang.Object r0 = r0.clone()
            io.netty.handler.codec.compression.ZlibWrapper[] r0 = (io.netty.handler.codec.compression.ZlibWrapper[]) r0
            return r0
    }
}
