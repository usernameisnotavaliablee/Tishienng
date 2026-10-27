package io.netty.handler.codec.http.websocketx;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class WebSocketUtil {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final io.netty.util.concurrent.FastThreadLocal<java.security.MessageDigest> MD5 = null;
    private static final io.netty.util.concurrent.FastThreadLocal<java.security.MessageDigest> SHA1 = null;



    static {
            io.netty.handler.codec.http.websocketx.WebSocketUtil$1 r0 = new io.netty.handler.codec.http.websocketx.WebSocketUtil$1
            r0.<init>()
            io.netty.handler.codec.http.websocketx.WebSocketUtil.MD5 = r0
            io.netty.handler.codec.http.websocketx.WebSocketUtil$2 r0 = new io.netty.handler.codec.http.websocketx.WebSocketUtil$2
            r0.<init>()
            io.netty.handler.codec.http.websocketx.WebSocketUtil.SHA1 = r0
            return
    }

    private WebSocketUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    @io.netty.util.internal.SuppressJava6Requirement(reason = "Guarded with java version check")
    static java.lang.String base64(byte[] r2) {
            int r0 = io.netty.util.internal.PlatformDependent.javaVersion()
            r1 = 8
            if (r0 < r1) goto L11
            java.util.Base64$Encoder r0 = io.netty.handler.codec.http.websocketx.a.a()
            java.lang.String r2 = io.netty.handler.codec.http.websocketx.b.a(r0, r2)
            return r2
        L11:
            io.netty.buffer.ByteBuf r2 = io.netty.buffer.Unpooled.wrappedBuffer(r2)
            io.netty.buffer.ByteBuf r2 = io.netty.handler.codec.base64.Base64.encode(r2)
            java.nio.charset.Charset r0 = io.netty.util.CharsetUtil.UTF_8
            java.lang.String r0 = r2.toString(r0)
            r2.release()
            return r0
    }

    private static byte[] digest(io.netty.util.concurrent.FastThreadLocal<java.security.MessageDigest> r0, byte[] r1) {
            java.lang.Object r0 = r0.get()
            java.security.MessageDigest r0 = (java.security.MessageDigest) r0
            r0.reset()
            byte[] r0 = r0.digest(r1)
            return r0
    }

    static byte[] md5(byte[] r1) {
            io.netty.util.concurrent.FastThreadLocal<java.security.MessageDigest> r0 = io.netty.handler.codec.http.websocketx.WebSocketUtil.MD5
            byte[] r1 = digest(r0, r1)
            return r1
    }

    static byte[] randomBytes(int r1) {
            byte[] r1 = new byte[r1]
            java.util.Random r0 = io.netty.util.internal.PlatformDependent.threadLocalRandom()
            r0.nextBytes(r1)
            return r1
    }

    static int randomNumber(int r4, int r5) {
            java.util.Random r0 = io.netty.util.internal.PlatformDependent.threadLocalRandom()
            double r0 = r0.nextDouble()
            double r2 = (double) r4
            int r5 = r5 - r4
            double r4 = (double) r5
            double r0 = r0 * r4
            double r2 = r2 + r0
            int r4 = (int) r2
            return r4
    }

    static byte[] sha1(byte[] r1) {
            io.netty.util.concurrent.FastThreadLocal<java.security.MessageDigest> r0 = io.netty.handler.codec.http.websocketx.WebSocketUtil.SHA1
            byte[] r1 = digest(r0, r1)
            return r1
    }
}
