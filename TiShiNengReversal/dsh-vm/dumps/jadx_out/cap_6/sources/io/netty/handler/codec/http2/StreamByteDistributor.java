package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface StreamByteDistributor {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface StreamState {
        boolean hasFrame();

        long pendingBytes();

        io.netty.handler.codec.http2.Http2Stream stream();

        int windowSize();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Writer {
        void write(io.netty.handler.codec.http2.Http2Stream r1, int r2);
    }

    boolean distribute(int r1, io.netty.handler.codec.http2.StreamByteDistributor.Writer r2) throws io.netty.handler.codec.http2.Http2Exception;

    void updateDependencyTree(int r1, int r2, short r3, boolean r4);

    void updateStreamableBytes(io.netty.handler.codec.http2.StreamByteDistributor.StreamState r1);
}
