package io.netty.handler.codec.spdy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface SpdyWindowUpdateFrame extends io.netty.handler.codec.spdy.SpdyFrame {
    int deltaWindowSize();

    io.netty.handler.codec.spdy.SpdyWindowUpdateFrame setDeltaWindowSize(int r1);

    io.netty.handler.codec.spdy.SpdyWindowUpdateFrame setStreamId(int r1);

    int streamId();
}
