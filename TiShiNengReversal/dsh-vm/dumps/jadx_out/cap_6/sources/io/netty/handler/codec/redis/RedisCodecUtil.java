package io.netty.handler.codec.redis;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class RedisCodecUtil {
    private RedisCodecUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    static byte[] longToAsciiBytes(long r0) {
            java.lang.String r0 = java.lang.Long.toString(r0)
            java.nio.charset.Charset r1 = io.netty.util.CharsetUtil.US_ASCII
            byte[] r0 = r0.getBytes(r1)
            return r0
    }

    static short makeShort(char r1, char r2) {
            boolean r0 = io.netty.util.internal.PlatformDependent.BIG_ENDIAN_NATIVE_ORDER
            if (r0 == 0) goto L9
            int r2 = r2 << 8
            r1 = r1 | r2
        L7:
            short r1 = (short) r1
            return r1
        L9:
            int r1 = r1 << 8
            r1 = r1 | r2
            goto L7
    }

    static byte[] shortToBytes(short r4) {
            r0 = 2
            byte[] r0 = new byte[r0]
            boolean r1 = io.netty.util.internal.PlatformDependent.BIG_ENDIAN_NATIVE_ORDER
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L16
            int r1 = r4 >> 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r0[r3] = r1
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r0[r2] = r4
            return r0
        L16:
            int r1 = r4 >> 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r0[r2] = r1
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r0[r3] = r4
            return r0
    }
}
