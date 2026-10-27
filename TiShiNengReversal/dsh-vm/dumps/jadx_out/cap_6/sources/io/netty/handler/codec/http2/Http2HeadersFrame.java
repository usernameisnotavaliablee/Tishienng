package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface Http2HeadersFrame extends io.netty.handler.codec.http2.Http2StreamFrame {
    io.netty.handler.codec.http2.Http2Headers headers();

    boolean isEndStream();

    int padding();
}
