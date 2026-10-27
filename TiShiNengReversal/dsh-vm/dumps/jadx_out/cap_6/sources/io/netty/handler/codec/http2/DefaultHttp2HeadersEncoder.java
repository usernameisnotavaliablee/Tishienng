package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultHttp2HeadersEncoder implements io.netty.handler.codec.http2.Http2HeadersEncoder, io.netty.handler.codec.http2.Http2HeadersEncoder.Configuration {
    private final io.netty.handler.codec.http2.HpackEncoder hpackEncoder;
    private final io.netty.handler.codec.http2.Http2HeadersEncoder.SensitivityDetector sensitivityDetector;
    private final io.netty.buffer.ByteBuf tableSizeChangeOutput;

    public DefaultHttp2HeadersEncoder() {
            r1 = this;
            io.netty.handler.codec.http2.Http2HeadersEncoder$SensitivityDetector r0 = io.netty.handler.codec.http2.Http2HeadersEncoder.NEVER_SENSITIVE
            r1.<init>(r0)
            return
    }

    public DefaultHttp2HeadersEncoder(io.netty.handler.codec.http2.Http2HeadersEncoder.SensitivityDetector r2) {
            r1 = this;
            io.netty.handler.codec.http2.HpackEncoder r0 = new io.netty.handler.codec.http2.HpackEncoder
            r0.<init>()
            r1.<init>(r2, r0)
            return
    }

    DefaultHttp2HeadersEncoder(io.netty.handler.codec.http2.Http2HeadersEncoder.SensitivityDetector r2, io.netty.handler.codec.http2.HpackEncoder r3) {
            r1 = this;
            r1.<init>()
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.buffer()
            r1.tableSizeChangeOutput = r0
            java.lang.String r0 = "sensitiveDetector"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.handler.codec.http2.Http2HeadersEncoder$SensitivityDetector r2 = (io.netty.handler.codec.http2.Http2HeadersEncoder.SensitivityDetector) r2
            r1.sensitivityDetector = r2
            java.lang.String r2 = "hpackEncoder"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r2)
            io.netty.handler.codec.http2.HpackEncoder r2 = (io.netty.handler.codec.http2.HpackEncoder) r2
            r1.hpackEncoder = r2
            return
    }

    public DefaultHttp2HeadersEncoder(io.netty.handler.codec.http2.Http2HeadersEncoder.SensitivityDetector r2, boolean r3) {
            r1 = this;
            io.netty.handler.codec.http2.HpackEncoder r0 = new io.netty.handler.codec.http2.HpackEncoder
            r0.<init>(r3)
            r1.<init>(r2, r0)
            return
    }

    public DefaultHttp2HeadersEncoder(io.netty.handler.codec.http2.Http2HeadersEncoder.SensitivityDetector r2, boolean r3, int r4) {
            r1 = this;
            r0 = 512(0x200, float:7.17E-43)
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public DefaultHttp2HeadersEncoder(io.netty.handler.codec.http2.Http2HeadersEncoder.SensitivityDetector r2, boolean r3, int r4, int r5) {
            r1 = this;
            io.netty.handler.codec.http2.HpackEncoder r0 = new io.netty.handler.codec.http2.HpackEncoder
            r0.<init>(r3, r4, r5)
            r1.<init>(r2, r0)
            return
    }

    @Override // io.netty.handler.codec.http2.Http2HeadersEncoder
    public io.netty.handler.codec.http2.Http2HeadersEncoder.Configuration configuration() {
            r0 = this;
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2HeadersEncoder
    public void encodeHeaders(int r3, io.netty.handler.codec.http2.Http2Headers r4, io.netty.buffer.ByteBuf r5) throws io.netty.handler.codec.http2.Http2Exception {
            r2 = this;
            io.netty.buffer.ByteBuf r0 = r2.tableSizeChangeOutput     // Catch: java.lang.Throwable -> L13 io.netty.handler.codec.http2.Http2Exception -> L15
            boolean r0 = r0.isReadable()     // Catch: java.lang.Throwable -> L13 io.netty.handler.codec.http2.Http2Exception -> L15
            if (r0 == 0) goto L17
            io.netty.buffer.ByteBuf r0 = r2.tableSizeChangeOutput     // Catch: java.lang.Throwable -> L13 io.netty.handler.codec.http2.Http2Exception -> L15
            r5.writeBytes(r0)     // Catch: java.lang.Throwable -> L13 io.netty.handler.codec.http2.Http2Exception -> L15
            io.netty.buffer.ByteBuf r0 = r2.tableSizeChangeOutput     // Catch: java.lang.Throwable -> L13 io.netty.handler.codec.http2.Http2Exception -> L15
            r0.clear()     // Catch: java.lang.Throwable -> L13 io.netty.handler.codec.http2.Http2Exception -> L15
            goto L17
        L13:
            r3 = move-exception
            goto L1f
        L15:
            r3 = move-exception
            goto L32
        L17:
            io.netty.handler.codec.http2.HpackEncoder r0 = r2.hpackEncoder     // Catch: java.lang.Throwable -> L13 io.netty.handler.codec.http2.Http2Exception -> L15
            io.netty.handler.codec.http2.Http2HeadersEncoder$SensitivityDetector r1 = r2.sensitivityDetector     // Catch: java.lang.Throwable -> L13 io.netty.handler.codec.http2.Http2Exception -> L15
            r0.encodeHeaders(r3, r5, r4, r1)     // Catch: java.lang.Throwable -> L13 io.netty.handler.codec.http2.Http2Exception -> L15
            return
        L1f:
            io.netty.handler.codec.http2.Http2Error r4 = io.netty.handler.codec.http2.Http2Error.COMPRESSION_ERROR
            java.lang.String r5 = r3.getMessage()
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r5
            java.lang.String r5 = "Failed encoding headers block: %s"
            io.netty.handler.codec.http2.Http2Exception r3 = io.netty.handler.codec.http2.Http2Exception.connectionError(r4, r3, r5, r0)
            throw r3
        L32:
            throw r3
    }

    @Override // io.netty.handler.codec.http2.Http2HeadersEncoder.Configuration
    public long maxHeaderListSize() {
            r2 = this;
            io.netty.handler.codec.http2.HpackEncoder r0 = r2.hpackEncoder
            long r0 = r0.getMaxHeaderListSize()
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2HeadersEncoder.Configuration
    public void maxHeaderListSize(long r2) throws io.netty.handler.codec.http2.Http2Exception {
            r1 = this;
            io.netty.handler.codec.http2.HpackEncoder r0 = r1.hpackEncoder
            r0.setMaxHeaderListSize(r2)
            return
    }

    @Override // io.netty.handler.codec.http2.Http2HeadersEncoder.Configuration
    public long maxHeaderTableSize() {
            r2 = this;
            io.netty.handler.codec.http2.HpackEncoder r0 = r2.hpackEncoder
            long r0 = r0.getMaxHeaderTableSize()
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2HeadersEncoder.Configuration
    public void maxHeaderTableSize(long r3) throws io.netty.handler.codec.http2.Http2Exception {
            r2 = this;
            io.netty.handler.codec.http2.HpackEncoder r0 = r2.hpackEncoder
            io.netty.buffer.ByteBuf r1 = r2.tableSizeChangeOutput
            r0.setMaxHeaderTableSize(r1, r3)
            return
    }
}
