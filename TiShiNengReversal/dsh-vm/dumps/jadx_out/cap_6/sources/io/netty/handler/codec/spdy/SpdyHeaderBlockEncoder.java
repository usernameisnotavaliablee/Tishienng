package io.netty.handler.codec.spdy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
abstract class SpdyHeaderBlockEncoder {
    SpdyHeaderBlockEncoder() {
            r0 = this;
            r0.<init>()
            return
    }

    static io.netty.handler.codec.spdy.SpdyHeaderBlockEncoder newInstance(io.netty.handler.codec.spdy.SpdyVersion r2, int r3, int r4, int r5) {
            int r0 = io.netty.util.internal.PlatformDependent.javaVersion()
            r1 = 7
            if (r0 < r1) goto Ld
            io.netty.handler.codec.spdy.SpdyHeaderBlockZlibEncoder r4 = new io.netty.handler.codec.spdy.SpdyHeaderBlockZlibEncoder
            r4.<init>(r2, r3)
            return r4
        Ld:
            io.netty.handler.codec.spdy.SpdyHeaderBlockJZlibEncoder r0 = new io.netty.handler.codec.spdy.SpdyHeaderBlockJZlibEncoder
            r0.<init>(r2, r3, r4, r5)
            return r0
    }

    abstract io.netty.buffer.ByteBuf encode(io.netty.buffer.ByteBufAllocator r1, io.netty.handler.codec.spdy.SpdyHeadersFrame r2) throws java.lang.Exception;

    abstract void end();
}
