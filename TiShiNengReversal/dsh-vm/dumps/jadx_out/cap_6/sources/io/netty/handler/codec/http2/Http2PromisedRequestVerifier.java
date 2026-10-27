package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface Http2PromisedRequestVerifier {
    public static final io.netty.handler.codec.http2.Http2PromisedRequestVerifier ALWAYS_VERIFY = null;


    static {
            io.netty.handler.codec.http2.Http2PromisedRequestVerifier$1 r0 = new io.netty.handler.codec.http2.Http2PromisedRequestVerifier$1
            r0.<init>()
            io.netty.handler.codec.http2.Http2PromisedRequestVerifier.ALWAYS_VERIFY = r0
            return
    }

    boolean isAuthoritative(io.netty.channel.ChannelHandlerContext r1, io.netty.handler.codec.http2.Http2Headers r2);

    boolean isCacheable(io.netty.handler.codec.http2.Http2Headers r1);

    boolean isSafe(io.netty.handler.codec.http2.Http2Headers r1);
}
