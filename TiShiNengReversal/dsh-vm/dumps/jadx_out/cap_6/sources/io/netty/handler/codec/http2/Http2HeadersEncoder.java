package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface Http2HeadersEncoder {
    public static final io.netty.handler.codec.http2.Http2HeadersEncoder.SensitivityDetector ALWAYS_SENSITIVE = null;
    public static final io.netty.handler.codec.http2.Http2HeadersEncoder.SensitivityDetector NEVER_SENSITIVE = null;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Configuration {
        long maxHeaderListSize();

        void maxHeaderListSize(long r1) throws io.netty.handler.codec.http2.Http2Exception;

        long maxHeaderTableSize();

        void maxHeaderTableSize(long r1) throws io.netty.handler.codec.http2.Http2Exception;
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface SensitivityDetector {
        boolean isSensitive(java.lang.CharSequence r1, java.lang.CharSequence r2);
    }

    static {
            io.netty.handler.codec.http2.Http2HeadersEncoder$1 r0 = new io.netty.handler.codec.http2.Http2HeadersEncoder$1
            r0.<init>()
            io.netty.handler.codec.http2.Http2HeadersEncoder.NEVER_SENSITIVE = r0
            io.netty.handler.codec.http2.Http2HeadersEncoder$2 r0 = new io.netty.handler.codec.http2.Http2HeadersEncoder$2
            r0.<init>()
            io.netty.handler.codec.http2.Http2HeadersEncoder.ALWAYS_SENSITIVE = r0
            return
    }

    io.netty.handler.codec.http2.Http2HeadersEncoder.Configuration configuration();

    void encodeHeaders(int r1, io.netty.handler.codec.http2.Http2Headers r2, io.netty.buffer.ByteBuf r3) throws io.netty.handler.codec.http2.Http2Exception;
}
