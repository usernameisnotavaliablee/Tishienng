package io.netty.handler.codec.compression;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class ZlibCodecFactory {
    private static final int DEFAULT_JDK_MEM_LEVEL = 8;
    private static final int DEFAULT_JDK_WINDOW_SIZE = 15;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private static final boolean noJdkZlibDecoder = false;
    private static final boolean noJdkZlibEncoder = false;
    private static final boolean supportsWindowSizeAndMemLevel = false;

    static {
            java.lang.Class<io.netty.handler.codec.compression.ZlibCodecFactory> r0 = io.netty.handler.codec.compression.ZlibCodecFactory.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.handler.codec.compression.ZlibCodecFactory.logger = r0
            int r1 = io.netty.util.internal.PlatformDependent.javaVersion()
            r2 = 1
            r3 = 0
            r4 = 7
            if (r1 >= r4) goto L13
            r1 = 1
            goto L14
        L13:
            r1 = 0
        L14:
            java.lang.String r5 = "io.netty.noJdkZlibDecoder"
            boolean r1 = io.netty.util.internal.SystemPropertyUtil.getBoolean(r5, r1)
            io.netty.handler.codec.compression.ZlibCodecFactory.noJdkZlibDecoder = r1
            java.lang.String r5 = "-Dio.netty.noJdkZlibDecoder: {}"
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)
            r0.debug(r5, r6)
            java.lang.String r5 = "io.netty.noJdkZlibEncoder"
            boolean r5 = io.netty.util.internal.SystemPropertyUtil.getBoolean(r5, r3)
            io.netty.handler.codec.compression.ZlibCodecFactory.noJdkZlibEncoder = r5
            java.lang.String r6 = "-Dio.netty.noJdkZlibEncoder: {}"
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r0.debug(r6, r5)
            if (r1 != 0) goto L40
            int r0 = io.netty.util.internal.PlatformDependent.javaVersion()
            if (r0 < r4) goto L3f
            goto L40
        L3f:
            r2 = 0
        L40:
            io.netty.handler.codec.compression.ZlibCodecFactory.supportsWindowSizeAndMemLevel = r2
            return
    }

    private ZlibCodecFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean isSupportingWindowSizeAndMemLevel() {
            boolean r0 = io.netty.handler.codec.compression.ZlibCodecFactory.supportsWindowSizeAndMemLevel
            return r0
    }

    public static io.netty.handler.codec.compression.ZlibDecoder newZlibDecoder() {
            int r0 = io.netty.util.internal.PlatformDependent.javaVersion()
            r1 = 7
            if (r0 < r1) goto L13
            boolean r0 = io.netty.handler.codec.compression.ZlibCodecFactory.noJdkZlibDecoder
            if (r0 == 0) goto Lc
            goto L13
        Lc:
            io.netty.handler.codec.compression.JdkZlibDecoder r0 = new io.netty.handler.codec.compression.JdkZlibDecoder
            r1 = 1
            r0.<init>(r1)
            return r0
        L13:
            io.netty.handler.codec.compression.JZlibDecoder r0 = new io.netty.handler.codec.compression.JZlibDecoder
            r0.<init>()
            return r0
    }

    public static io.netty.handler.codec.compression.ZlibDecoder newZlibDecoder(io.netty.handler.codec.compression.ZlibWrapper r2) {
            int r0 = io.netty.util.internal.PlatformDependent.javaVersion()
            r1 = 7
            if (r0 < r1) goto L13
            boolean r0 = io.netty.handler.codec.compression.ZlibCodecFactory.noJdkZlibDecoder
            if (r0 == 0) goto Lc
            goto L13
        Lc:
            io.netty.handler.codec.compression.JdkZlibDecoder r0 = new io.netty.handler.codec.compression.JdkZlibDecoder
            r1 = 1
            r0.<init>(r2, r1)
            return r0
        L13:
            io.netty.handler.codec.compression.JZlibDecoder r0 = new io.netty.handler.codec.compression.JZlibDecoder
            r0.<init>(r2)
            return r0
    }

    public static io.netty.handler.codec.compression.ZlibDecoder newZlibDecoder(byte[] r2) {
            int r0 = io.netty.util.internal.PlatformDependent.javaVersion()
            r1 = 7
            if (r0 < r1) goto L12
            boolean r0 = io.netty.handler.codec.compression.ZlibCodecFactory.noJdkZlibDecoder
            if (r0 == 0) goto Lc
            goto L12
        Lc:
            io.netty.handler.codec.compression.JdkZlibDecoder r0 = new io.netty.handler.codec.compression.JdkZlibDecoder
            r0.<init>(r2)
            return r0
        L12:
            io.netty.handler.codec.compression.JZlibDecoder r0 = new io.netty.handler.codec.compression.JZlibDecoder
            r0.<init>(r2)
            return r0
    }

    public static io.netty.handler.codec.compression.ZlibEncoder newZlibEncoder(int r2) {
            int r0 = io.netty.util.internal.PlatformDependent.javaVersion()
            r1 = 7
            if (r0 < r1) goto L12
            boolean r0 = io.netty.handler.codec.compression.ZlibCodecFactory.noJdkZlibEncoder
            if (r0 == 0) goto Lc
            goto L12
        Lc:
            io.netty.handler.codec.compression.JdkZlibEncoder r0 = new io.netty.handler.codec.compression.JdkZlibEncoder
            r0.<init>(r2)
            return r0
        L12:
            io.netty.handler.codec.compression.JZlibEncoder r0 = new io.netty.handler.codec.compression.JZlibEncoder
            r0.<init>(r2)
            return r0
    }

    public static io.netty.handler.codec.compression.ZlibEncoder newZlibEncoder(int r2, int r3, int r4, byte[] r5) {
            int r0 = io.netty.util.internal.PlatformDependent.javaVersion()
            r1 = 7
            if (r0 < r1) goto L1a
            boolean r0 = io.netty.handler.codec.compression.ZlibCodecFactory.noJdkZlibEncoder
            if (r0 != 0) goto L1a
            r0 = 15
            if (r3 != r0) goto L1a
            r0 = 8
            if (r4 == r0) goto L14
            goto L1a
        L14:
            io.netty.handler.codec.compression.JdkZlibEncoder r3 = new io.netty.handler.codec.compression.JdkZlibEncoder
            r3.<init>(r2, r5)
            return r3
        L1a:
            io.netty.handler.codec.compression.JZlibEncoder r0 = new io.netty.handler.codec.compression.JZlibEncoder
            r0.<init>(r2, r3, r4, r5)
            return r0
    }

    public static io.netty.handler.codec.compression.ZlibEncoder newZlibEncoder(int r2, byte[] r3) {
            int r0 = io.netty.util.internal.PlatformDependent.javaVersion()
            r1 = 7
            if (r0 < r1) goto L12
            boolean r0 = io.netty.handler.codec.compression.ZlibCodecFactory.noJdkZlibEncoder
            if (r0 == 0) goto Lc
            goto L12
        Lc:
            io.netty.handler.codec.compression.JdkZlibEncoder r0 = new io.netty.handler.codec.compression.JdkZlibEncoder
            r0.<init>(r2, r3)
            return r0
        L12:
            io.netty.handler.codec.compression.JZlibEncoder r0 = new io.netty.handler.codec.compression.JZlibEncoder
            r0.<init>(r2, r3)
            return r0
    }

    public static io.netty.handler.codec.compression.ZlibEncoder newZlibEncoder(io.netty.handler.codec.compression.ZlibWrapper r2) {
            int r0 = io.netty.util.internal.PlatformDependent.javaVersion()
            r1 = 7
            if (r0 < r1) goto L12
            boolean r0 = io.netty.handler.codec.compression.ZlibCodecFactory.noJdkZlibEncoder
            if (r0 == 0) goto Lc
            goto L12
        Lc:
            io.netty.handler.codec.compression.JdkZlibEncoder r0 = new io.netty.handler.codec.compression.JdkZlibEncoder
            r0.<init>(r2)
            return r0
        L12:
            io.netty.handler.codec.compression.JZlibEncoder r0 = new io.netty.handler.codec.compression.JZlibEncoder
            r0.<init>(r2)
            return r0
    }

    public static io.netty.handler.codec.compression.ZlibEncoder newZlibEncoder(io.netty.handler.codec.compression.ZlibWrapper r2, int r3) {
            int r0 = io.netty.util.internal.PlatformDependent.javaVersion()
            r1 = 7
            if (r0 < r1) goto L12
            boolean r0 = io.netty.handler.codec.compression.ZlibCodecFactory.noJdkZlibEncoder
            if (r0 == 0) goto Lc
            goto L12
        Lc:
            io.netty.handler.codec.compression.JdkZlibEncoder r0 = new io.netty.handler.codec.compression.JdkZlibEncoder
            r0.<init>(r2, r3)
            return r0
        L12:
            io.netty.handler.codec.compression.JZlibEncoder r0 = new io.netty.handler.codec.compression.JZlibEncoder
            r0.<init>(r2, r3)
            return r0
    }

    public static io.netty.handler.codec.compression.ZlibEncoder newZlibEncoder(io.netty.handler.codec.compression.ZlibWrapper r2, int r3, int r4, int r5) {
            int r0 = io.netty.util.internal.PlatformDependent.javaVersion()
            r1 = 7
            if (r0 < r1) goto L1a
            boolean r0 = io.netty.handler.codec.compression.ZlibCodecFactory.noJdkZlibEncoder
            if (r0 != 0) goto L1a
            r0 = 15
            if (r4 != r0) goto L1a
            r0 = 8
            if (r5 == r0) goto L14
            goto L1a
        L14:
            io.netty.handler.codec.compression.JdkZlibEncoder r4 = new io.netty.handler.codec.compression.JdkZlibEncoder
            r4.<init>(r2, r3)
            return r4
        L1a:
            io.netty.handler.codec.compression.JZlibEncoder r0 = new io.netty.handler.codec.compression.JZlibEncoder
            r0.<init>(r2, r3, r4, r5)
            return r0
    }

    public static io.netty.handler.codec.compression.ZlibEncoder newZlibEncoder(byte[] r2) {
            int r0 = io.netty.util.internal.PlatformDependent.javaVersion()
            r1 = 7
            if (r0 < r1) goto L12
            boolean r0 = io.netty.handler.codec.compression.ZlibCodecFactory.noJdkZlibEncoder
            if (r0 == 0) goto Lc
            goto L12
        Lc:
            io.netty.handler.codec.compression.JdkZlibEncoder r0 = new io.netty.handler.codec.compression.JdkZlibEncoder
            r0.<init>(r2)
            return r0
        L12:
            io.netty.handler.codec.compression.JZlibEncoder r0 = new io.netty.handler.codec.compression.JZlibEncoder
            r0.<init>(r2)
            return r0
    }
}
