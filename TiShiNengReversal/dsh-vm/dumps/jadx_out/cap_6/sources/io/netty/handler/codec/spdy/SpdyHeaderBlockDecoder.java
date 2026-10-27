package io.netty.handler.codec.spdy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
abstract class SpdyHeaderBlockDecoder {
    SpdyHeaderBlockDecoder() {
            r0 = this;
            r0.<init>()
            return
    }

    static io.netty.handler.codec.spdy.SpdyHeaderBlockDecoder newInstance(io.netty.handler.codec.spdy.SpdyVersion r1, int r2) {
            io.netty.handler.codec.spdy.SpdyHeaderBlockZlibDecoder r0 = new io.netty.handler.codec.spdy.SpdyHeaderBlockZlibDecoder
            r0.<init>(r1, r2)
            return r0
    }

    abstract void decode(io.netty.buffer.ByteBufAllocator r1, io.netty.buffer.ByteBuf r2, io.netty.handler.codec.spdy.SpdyHeadersFrame r3) throws java.lang.Exception;

    abstract void end();

    abstract void endHeaderBlock(io.netty.handler.codec.spdy.SpdyHeadersFrame r1) throws java.lang.Exception;
}
