package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface Http2RemoteFlowController extends io.netty.handler.codec.http2.Http2FlowController {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface FlowControlled {
        void error(io.netty.channel.ChannelHandlerContext r1, java.lang.Throwable r2);

        boolean merge(io.netty.channel.ChannelHandlerContext r1, io.netty.handler.codec.http2.Http2RemoteFlowController.FlowControlled r2);

        int size();

        void write(io.netty.channel.ChannelHandlerContext r1, int r2);

        void writeComplete();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Listener {
        void writabilityChanged(io.netty.handler.codec.http2.Http2Stream r1);
    }

    void addFlowControlled(io.netty.handler.codec.http2.Http2Stream r1, io.netty.handler.codec.http2.Http2RemoteFlowController.FlowControlled r2);

    io.netty.channel.ChannelHandlerContext channelHandlerContext();

    void channelWritabilityChanged() throws io.netty.handler.codec.http2.Http2Exception;

    boolean hasFlowControlled(io.netty.handler.codec.http2.Http2Stream r1);

    boolean isWritable(io.netty.handler.codec.http2.Http2Stream r1);

    void listener(io.netty.handler.codec.http2.Http2RemoteFlowController.Listener r1);

    void updateDependencyTree(int r1, int r2, short r3, boolean r4);

    void writePendingBytes() throws io.netty.handler.codec.http2.Http2Exception;
}
