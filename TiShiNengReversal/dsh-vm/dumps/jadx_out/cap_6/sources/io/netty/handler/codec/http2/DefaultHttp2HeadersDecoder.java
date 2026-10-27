package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultHttp2HeadersDecoder implements io.netty.handler.codec.http2.Http2HeadersDecoder, io.netty.handler.codec.http2.Http2HeadersDecoder.Configuration {
    private static final float HEADERS_COUNT_WEIGHT_HISTORICAL = 0.8f;
    private static final float HEADERS_COUNT_WEIGHT_NEW = 0.2f;
    private float headerArraySizeAccumulator;
    private final io.netty.handler.codec.http2.HpackDecoder hpackDecoder;
    private long maxHeaderListSizeGoAway;
    private final boolean validateHeaders;

    public DefaultHttp2HeadersDecoder() {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            return
    }

    public DefaultHttp2HeadersDecoder(boolean r3) {
            r2 = this;
            r0 = 8192(0x2000, double:4.0474E-320)
            r2.<init>(r3, r0)
            return
    }

    public DefaultHttp2HeadersDecoder(boolean r2, long r3) {
            r1 = this;
            r0 = -1
            r1.<init>(r2, r3, r0)
            return
    }

    public DefaultHttp2HeadersDecoder(boolean r1, long r2, @java.lang.Deprecated int r4) {
            r0 = this;
            io.netty.handler.codec.http2.HpackDecoder r4 = new io.netty.handler.codec.http2.HpackDecoder
            r4.<init>(r2)
            r0.<init>(r1, r4)
            return
    }

    DefaultHttp2HeadersDecoder(boolean r2, io.netty.handler.codec.http2.HpackDecoder r3) {
            r1 = this;
            r1.<init>()
            r0 = 1090519040(0x41000000, float:8.0)
            r1.headerArraySizeAccumulator = r0
            java.lang.String r0 = "hpackDecoder"
            java.lang.Object r0 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r0)
            io.netty.handler.codec.http2.HpackDecoder r0 = (io.netty.handler.codec.http2.HpackDecoder) r0
            r1.hpackDecoder = r0
            r1.validateHeaders = r2
            long r2 = r3.getMaxHeaderListSize()
            long r2 = io.netty.handler.codec.http2.Http2CodecUtil.calculateMaxHeaderListSizeGoAway(r2)
            r1.maxHeaderListSizeGoAway = r2
            return
    }

    @Override // io.netty.handler.codec.http2.Http2HeadersDecoder
    public io.netty.handler.codec.http2.Http2HeadersDecoder.Configuration configuration() {
            r0 = this;
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2HeadersDecoder
    public io.netty.handler.codec.http2.Http2Headers decodeHeaders(int r4, io.netty.buffer.ByteBuf r5) throws io.netty.handler.codec.http2.Http2Exception {
            r3 = this;
            io.netty.handler.codec.http2.Http2Headers r0 = r3.newHeaders()     // Catch: java.lang.Throwable -> L20 io.netty.handler.codec.http2.Http2Exception -> L22
            io.netty.handler.codec.http2.HpackDecoder r1 = r3.hpackDecoder     // Catch: java.lang.Throwable -> L20 io.netty.handler.codec.http2.Http2Exception -> L22
            boolean r2 = r3.validateHeaders     // Catch: java.lang.Throwable -> L20 io.netty.handler.codec.http2.Http2Exception -> L22
            r1.decode(r4, r5, r0, r2)     // Catch: java.lang.Throwable -> L20 io.netty.handler.codec.http2.Http2Exception -> L22
            int r4 = r0.size()     // Catch: java.lang.Throwable -> L20 io.netty.handler.codec.http2.Http2Exception -> L22
            float r4 = (float) r4     // Catch: java.lang.Throwable -> L20 io.netty.handler.codec.http2.Http2Exception -> L22
            r5 = 1045220557(0x3e4ccccd, float:0.2)
            float r4 = r4 * r5
            float r5 = r3.headerArraySizeAccumulator     // Catch: java.lang.Throwable -> L20 io.netty.handler.codec.http2.Http2Exception -> L22
            r1 = 1061997773(0x3f4ccccd, float:0.8)
            float r5 = r5 * r1
            float r4 = r4 + r5
            r3.headerArraySizeAccumulator = r4     // Catch: java.lang.Throwable -> L20 io.netty.handler.codec.http2.Http2Exception -> L22
            return r0
        L20:
            r4 = move-exception
            goto L24
        L22:
            r4 = move-exception
            goto L32
        L24:
            io.netty.handler.codec.http2.Http2Error r5 = io.netty.handler.codec.http2.Http2Error.COMPRESSION_ERROR
            java.lang.String r0 = r4.getMessage()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            io.netty.handler.codec.http2.Http2Exception r4 = io.netty.handler.codec.http2.Http2Exception.connectionError(r5, r4, r0, r1)
            throw r4
        L32:
            throw r4
    }

    @Override // io.netty.handler.codec.http2.Http2HeadersDecoder.Configuration
    public long maxHeaderListSize() {
            r2 = this;
            io.netty.handler.codec.http2.HpackDecoder r0 = r2.hpackDecoder
            long r0 = r0.getMaxHeaderListSize()
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2HeadersDecoder.Configuration
    public void maxHeaderListSize(long r4, long r6) throws io.netty.handler.codec.http2.Http2Exception {
            r3 = this;
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 < 0) goto L12
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 < 0) goto L12
            io.netty.handler.codec.http2.HpackDecoder r0 = r3.hpackDecoder
            r0.setMaxHeaderListSize(r4)
            r3.maxHeaderListSizeGoAway = r6
            return
        L12:
            io.netty.handler.codec.http2.Http2Error r0 = io.netty.handler.codec.http2.Http2Error.INTERNAL_ERROR
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r7 = 0
            r5[r7] = r6
            r6 = 1
            r5[r6] = r4
            java.lang.String r4 = "Header List Size GO_AWAY %d must be non-negative and >= %d"
            io.netty.handler.codec.http2.Http2Exception r4 = io.netty.handler.codec.http2.Http2Exception.connectionError(r0, r4, r5)
            throw r4
    }

    @Override // io.netty.handler.codec.http2.Http2HeadersDecoder.Configuration
    public long maxHeaderListSizeGoAway() {
            r2 = this;
            long r0 = r2.maxHeaderListSizeGoAway
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2HeadersDecoder.Configuration
    public long maxHeaderTableSize() {
            r2 = this;
            io.netty.handler.codec.http2.HpackDecoder r0 = r2.hpackDecoder
            long r0 = r0.getMaxHeaderTableSize()
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2HeadersDecoder.Configuration
    public void maxHeaderTableSize(long r2) throws io.netty.handler.codec.http2.Http2Exception {
            r1 = this;
            io.netty.handler.codec.http2.HpackDecoder r0 = r1.hpackDecoder
            r0.setMaxHeaderTableSize(r2)
            return
    }

    protected io.netty.handler.codec.http2.Http2Headers newHeaders() {
            r3 = this;
            io.netty.handler.codec.http2.DefaultHttp2Headers r0 = new io.netty.handler.codec.http2.DefaultHttp2Headers
            boolean r1 = r3.validateHeaders
            float r2 = r3.headerArraySizeAccumulator
            int r2 = (int) r2
            r0.<init>(r1, r2)
            return r0
    }

    protected final int numberOfHeadersGuess() {
            r1 = this;
            float r0 = r1.headerArraySizeAccumulator
            int r0 = (int) r0
            return r0
    }

    protected final boolean validateHeaders() {
            r1 = this;
            boolean r0 = r1.validateHeaders
            return r0
    }
}
