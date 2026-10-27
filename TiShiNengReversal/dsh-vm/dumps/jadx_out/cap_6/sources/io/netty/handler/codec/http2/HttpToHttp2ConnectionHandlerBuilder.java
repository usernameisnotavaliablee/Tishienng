package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class HttpToHttp2ConnectionHandlerBuilder extends io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder<io.netty.handler.codec.http2.HttpToHttp2ConnectionHandler, io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder> {
    public HttpToHttp2ConnectionHandlerBuilder() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.HttpToHttp2ConnectionHandler build() {
            r1 = this;
            io.netty.handler.codec.http2.HttpToHttp2ConnectionHandler r0 = r1.build2()
            return r0
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    protected /* bridge */ /* synthetic */ io.netty.handler.codec.http2.HttpToHttp2ConnectionHandler build(io.netty.handler.codec.http2.Http2ConnectionDecoder r1, io.netty.handler.codec.http2.Http2ConnectionEncoder r2, io.netty.handler.codec.http2.Http2Settings r3) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.http2.HttpToHttp2ConnectionHandler r1 = r0.build2(r1, r2, r3)
            return r1
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    /* renamed from: build, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.HttpToHttp2ConnectionHandler build2() {
            r1 = this;
            io.netty.handler.codec.http2.Http2ConnectionHandler r0 = super.build()
            io.netty.handler.codec.http2.HttpToHttp2ConnectionHandler r0 = (io.netty.handler.codec.http2.HttpToHttp2ConnectionHandler) r0
            return r0
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    /* renamed from: build, reason: avoid collision after fix types in other method */
    protected io.netty.handler.codec.http2.HttpToHttp2ConnectionHandler build2(io.netty.handler.codec.http2.Http2ConnectionDecoder r7, io.netty.handler.codec.http2.Http2ConnectionEncoder r8, io.netty.handler.codec.http2.Http2Settings r9) {
            r6 = this;
            io.netty.handler.codec.http2.HttpToHttp2ConnectionHandler r0 = new io.netty.handler.codec.http2.HttpToHttp2ConnectionHandler
            boolean r4 = r6.isValidateHeaders()
            boolean r5 = r6.decoupleCloseAndGoAway()
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder codec(io.netty.handler.codec.http2.Http2ConnectionDecoder r1, io.netty.handler.codec.http2.Http2ConnectionEncoder r2) {
            r0 = this;
            io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder r1 = r0.codec2(r1, r2)
            return r1
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    /* renamed from: codec, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder codec2(io.netty.handler.codec.http2.Http2ConnectionDecoder r1, io.netty.handler.codec.http2.Http2ConnectionEncoder r2) {
            r0 = this;
            io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder r1 = super.codec(r1, r2)
            io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder r1 = (io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder) r1
            return r1
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder connection(io.netty.handler.codec.http2.Http2Connection r1) {
            r0 = this;
            io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder r1 = r0.connection2(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    /* renamed from: connection, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder connection2(io.netty.handler.codec.http2.Http2Connection r1) {
            r0 = this;
            io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder r1 = super.connection(r1)
            io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder r1 = (io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder) r1
            return r1
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder decoupleCloseAndGoAway(boolean r1) {
            r0 = this;
            io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder r1 = r0.decoupleCloseAndGoAway2(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    /* renamed from: decoupleCloseAndGoAway, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder decoupleCloseAndGoAway2(boolean r1) {
            r0 = this;
            io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder r1 = super.decoupleCloseAndGoAway(r1)
            io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder r1 = (io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder) r1
            return r1
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder encoderEnforceMaxConcurrentStreams(boolean r1) {
            r0 = this;
            io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder r1 = r0.encoderEnforceMaxConcurrentStreams2(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    /* renamed from: encoderEnforceMaxConcurrentStreams, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder encoderEnforceMaxConcurrentStreams2(boolean r1) {
            r0 = this;
            io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder r1 = super.encoderEnforceMaxConcurrentStreams(r1)
            io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder r1 = (io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder) r1
            return r1
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder frameListener(io.netty.handler.codec.http2.Http2FrameListener r1) {
            r0 = this;
            io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder r1 = r0.frameListener2(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    /* renamed from: frameListener, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder frameListener2(io.netty.handler.codec.http2.Http2FrameListener r1) {
            r0 = this;
            io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder r1 = super.frameListener(r1)
            io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder r1 = (io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder) r1
            return r1
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder frameLogger(io.netty.handler.codec.http2.Http2FrameLogger r1) {
            r0 = this;
            io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder r1 = r0.frameLogger2(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    /* renamed from: frameLogger, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder frameLogger2(io.netty.handler.codec.http2.Http2FrameLogger r1) {
            r0 = this;
            io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder r1 = super.frameLogger(r1)
            io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder r1 = (io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder) r1
            return r1
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder gracefulShutdownTimeoutMillis(long r1) {
            r0 = this;
            io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder r1 = r0.gracefulShutdownTimeoutMillis2(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    /* renamed from: gracefulShutdownTimeoutMillis, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder gracefulShutdownTimeoutMillis2(long r1) {
            r0 = this;
            io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder r1 = super.gracefulShutdownTimeoutMillis(r1)
            io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder r1 = (io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder) r1
            return r1
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder headerSensitivityDetector(io.netty.handler.codec.http2.Http2HeadersEncoder.SensitivityDetector r1) {
            r0 = this;
            io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder r1 = r0.headerSensitivityDetector2(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    /* renamed from: headerSensitivityDetector, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder headerSensitivityDetector2(io.netty.handler.codec.http2.Http2HeadersEncoder.SensitivityDetector r1) {
            r0 = this;
            io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder r1 = super.headerSensitivityDetector(r1)
            io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder r1 = (io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder) r1
            return r1
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder initialHuffmanDecodeCapacity(int r1) {
            r0 = this;
            io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder r1 = r0.initialHuffmanDecodeCapacity2(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    @java.lang.Deprecated
    /* renamed from: initialHuffmanDecodeCapacity, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder initialHuffmanDecodeCapacity2(int r1) {
            r0 = this;
            io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder r1 = super.initialHuffmanDecodeCapacity(r1)
            io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder r1 = (io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder) r1
            return r1
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder initialSettings(io.netty.handler.codec.http2.Http2Settings r1) {
            r0 = this;
            io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder r1 = r0.initialSettings2(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    /* renamed from: initialSettings, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder initialSettings2(io.netty.handler.codec.http2.Http2Settings r1) {
            r0 = this;
            io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder r1 = super.initialSettings(r1)
            io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder r1 = (io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder) r1
            return r1
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder server(boolean r1) {
            r0 = this;
            io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder r1 = r0.server2(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    /* renamed from: server, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder server2(boolean r1) {
            r0 = this;
            io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder r1 = super.server(r1)
            io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder r1 = (io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder) r1
            return r1
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder validateHeaders(boolean r1) {
            r0 = this;
            io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder r1 = r0.validateHeaders2(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    /* renamed from: validateHeaders, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder validateHeaders2(boolean r1) {
            r0 = this;
            io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder r1 = super.validateHeaders(r1)
            io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder r1 = (io.netty.handler.codec.http2.HttpToHttp2ConnectionHandlerBuilder) r1
            return r1
    }
}
