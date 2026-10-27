package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface Http2Connection {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Endpoint<F extends io.netty.handler.codec.http2.Http2FlowController> {
        void allowPushTo(boolean r1);

        boolean allowPushTo();

        boolean canOpenStream();

        io.netty.handler.codec.http2.Http2Stream createStream(int r1, boolean r2) throws io.netty.handler.codec.http2.Http2Exception;

        boolean created(io.netty.handler.codec.http2.Http2Stream r1);

        F flowController();

        void flowController(F r1);

        int incrementAndGetNextStreamId();

        boolean isServer();

        boolean isValidStreamId(int r1);

        int lastStreamCreated();

        int lastStreamKnownByPeer();

        int maxActiveStreams();

        void maxActiveStreams(int r1);

        boolean mayHaveCreatedStream(int r1);

        int numActiveStreams();

        io.netty.handler.codec.http2.Http2Connection.Endpoint<? extends io.netty.handler.codec.http2.Http2FlowController> opposite();

        io.netty.handler.codec.http2.Http2Stream reservePushStream(int r1, io.netty.handler.codec.http2.Http2Stream r2) throws io.netty.handler.codec.http2.Http2Exception;
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Listener {
        void onGoAwayReceived(int r1, long r2, io.netty.buffer.ByteBuf r4);

        void onGoAwaySent(int r1, long r2, io.netty.buffer.ByteBuf r4);

        void onStreamActive(io.netty.handler.codec.http2.Http2Stream r1);

        void onStreamAdded(io.netty.handler.codec.http2.Http2Stream r1);

        void onStreamClosed(io.netty.handler.codec.http2.Http2Stream r1);

        void onStreamHalfClosed(io.netty.handler.codec.http2.Http2Stream r1);

        void onStreamRemoved(io.netty.handler.codec.http2.Http2Stream r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface PropertyKey {
    }

    void addListener(io.netty.handler.codec.http2.Http2Connection.Listener r1);

    io.netty.util.concurrent.Future<java.lang.Void> close(io.netty.util.concurrent.Promise<java.lang.Void> r1);

    io.netty.handler.codec.http2.Http2Stream connectionStream();

    io.netty.handler.codec.http2.Http2Stream forEachActiveStream(io.netty.handler.codec.http2.Http2StreamVisitor r1) throws io.netty.handler.codec.http2.Http2Exception;

    void goAwayReceived(int r1, long r2, io.netty.buffer.ByteBuf r4) throws io.netty.handler.codec.http2.Http2Exception;

    boolean goAwayReceived();

    boolean goAwaySent();

    boolean goAwaySent(int r1, long r2, io.netty.buffer.ByteBuf r4) throws io.netty.handler.codec.http2.Http2Exception;

    boolean isServer();

    io.netty.handler.codec.http2.Http2Connection.Endpoint<io.netty.handler.codec.http2.Http2LocalFlowController> local();

    io.netty.handler.codec.http2.Http2Connection.PropertyKey newKey();

    int numActiveStreams();

    io.netty.handler.codec.http2.Http2Connection.Endpoint<io.netty.handler.codec.http2.Http2RemoteFlowController> remote();

    void removeListener(io.netty.handler.codec.http2.Http2Connection.Listener r1);

    io.netty.handler.codec.http2.Http2Stream stream(int r1);

    boolean streamMayHaveExisted(int r1);
}
