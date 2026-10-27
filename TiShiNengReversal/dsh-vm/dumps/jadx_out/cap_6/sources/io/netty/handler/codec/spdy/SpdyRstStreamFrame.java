package io.netty.handler.codec.spdy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface SpdyRstStreamFrame extends io.netty.handler.codec.spdy.SpdyStreamFrame {
    @Override // io.netty.handler.codec.spdy.SpdyStreamFrame, io.netty.handler.codec.spdy.SpdyDataFrame
    io.netty.handler.codec.spdy.SpdyRstStreamFrame setLast(boolean r1);

    io.netty.handler.codec.spdy.SpdyRstStreamFrame setStatus(io.netty.handler.codec.spdy.SpdyStreamStatus r1);

    @Override // io.netty.handler.codec.spdy.SpdyStreamFrame, io.netty.handler.codec.spdy.SpdyDataFrame
    io.netty.handler.codec.spdy.SpdyRstStreamFrame setStreamId(int r1);

    io.netty.handler.codec.spdy.SpdyStreamStatus status();
}
