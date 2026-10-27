package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface Http2HeadersDecoder {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Configuration {
        long maxHeaderListSize();

        void maxHeaderListSize(long r1, long r3) throws io.netty.handler.codec.http2.Http2Exception;

        long maxHeaderListSizeGoAway();

        long maxHeaderTableSize();

        void maxHeaderTableSize(long r1) throws io.netty.handler.codec.http2.Http2Exception;
    }

    io.netty.handler.codec.http2.Http2HeadersDecoder.Configuration configuration();

    io.netty.handler.codec.http2.Http2Headers decodeHeaders(int r1, io.netty.buffer.ByteBuf r2) throws io.netty.handler.codec.http2.Http2Exception;
}
