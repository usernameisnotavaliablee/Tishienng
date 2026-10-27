package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class Http2NoMoreStreamIdsException extends io.netty.handler.codec.http2.Http2Exception {
    private static final java.lang.String ERROR_MESSAGE = "No more streams can be created on this connection";
    private static final long serialVersionUID = -7756236161274851110L;

    public Http2NoMoreStreamIdsException() {
            r3 = this;
            io.netty.handler.codec.http2.Http2Error r0 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
            java.lang.String r1 = "No more streams can be created on this connection"
            io.netty.handler.codec.http2.Http2Exception$ShutdownHint r2 = io.netty.handler.codec.http2.Http2Exception.ShutdownHint.GRACEFUL_SHUTDOWN
            r3.<init>(r0, r1, r2)
            return
    }

    public Http2NoMoreStreamIdsException(java.lang.Throwable r4) {
            r3 = this;
            io.netty.handler.codec.http2.Http2Error r0 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
            java.lang.String r1 = "No more streams can be created on this connection"
            io.netty.handler.codec.http2.Http2Exception$ShutdownHint r2 = io.netty.handler.codec.http2.Http2Exception.ShutdownHint.GRACEFUL_SHUTDOWN
            r3.<init>(r0, r1, r4, r2)
            return
    }
}
