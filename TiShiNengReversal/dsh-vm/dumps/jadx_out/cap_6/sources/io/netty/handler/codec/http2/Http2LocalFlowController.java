package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface Http2LocalFlowController extends io.netty.handler.codec.http2.Http2FlowController {
    boolean consumeBytes(io.netty.handler.codec.http2.Http2Stream r1, int r2) throws io.netty.handler.codec.http2.Http2Exception;

    io.netty.handler.codec.http2.Http2LocalFlowController frameWriter(io.netty.handler.codec.http2.Http2FrameWriter r1);

    int initialWindowSize(io.netty.handler.codec.http2.Http2Stream r1);

    void receiveFlowControlledFrame(io.netty.handler.codec.http2.Http2Stream r1, io.netty.buffer.ByteBuf r2, int r3, boolean r4) throws io.netty.handler.codec.http2.Http2Exception;

    int unconsumedBytes(io.netty.handler.codec.http2.Http2Stream r1);
}
