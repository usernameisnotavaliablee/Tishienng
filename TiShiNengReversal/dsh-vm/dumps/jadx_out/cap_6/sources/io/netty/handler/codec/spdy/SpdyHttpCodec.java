package io.netty.handler.codec.spdy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class SpdyHttpCodec extends io.netty.channel.CombinedChannelDuplexHandler<io.netty.handler.codec.spdy.SpdyHttpDecoder, io.netty.handler.codec.spdy.SpdyHttpEncoder> {
    public SpdyHttpCodec(io.netty.handler.codec.spdy.SpdyVersion r2, int r3) {
            r1 = this;
            io.netty.handler.codec.spdy.SpdyHttpDecoder r0 = new io.netty.handler.codec.spdy.SpdyHttpDecoder
            r0.<init>(r2, r3)
            io.netty.handler.codec.spdy.SpdyHttpEncoder r3 = new io.netty.handler.codec.spdy.SpdyHttpEncoder
            r3.<init>(r2)
            r1.<init>(r0, r3)
            return
    }

    public SpdyHttpCodec(io.netty.handler.codec.spdy.SpdyVersion r2, int r3, boolean r4) {
            r1 = this;
            io.netty.handler.codec.spdy.SpdyHttpDecoder r0 = new io.netty.handler.codec.spdy.SpdyHttpDecoder
            r0.<init>(r2, r3, r4)
            io.netty.handler.codec.spdy.SpdyHttpEncoder r3 = new io.netty.handler.codec.spdy.SpdyHttpEncoder
            r3.<init>(r2)
            r1.<init>(r0, r3)
            return
    }
}
