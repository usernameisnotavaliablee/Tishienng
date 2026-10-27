package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class Http2MultiplexCodecBuilder extends io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder<io.netty.handler.codec.http2.Http2MultiplexCodec, io.netty.handler.codec.http2.Http2MultiplexCodecBuilder> {
    final io.netty.channel.ChannelHandler childHandler;
    private io.netty.handler.codec.http2.Http2FrameWriter frameWriter;
    private io.netty.channel.ChannelHandler upgradeStreamHandler;

    Http2MultiplexCodecBuilder(boolean r1, io.netty.channel.ChannelHandler r2) {
            r0 = this;
            r0.<init>()
            r0.server(r1)
            java.lang.String r1 = "childHandler"
            java.lang.Object r1 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r1)
            io.netty.channel.ChannelHandler r1 = (io.netty.channel.ChannelHandler) r1
            io.netty.channel.ChannelHandler r1 = checkSharable(r1)
            r0.childHandler = r1
            r1 = 0
            r0.gracefulShutdownTimeoutMillis2(r1)
            return
    }

    private static io.netty.channel.ChannelHandler checkSharable(io.netty.channel.ChannelHandler r2) {
            boolean r0 = r2 instanceof io.netty.channel.ChannelHandlerAdapter
            if (r0 == 0) goto L22
            r0 = r2
            io.netty.channel.ChannelHandlerAdapter r0 = (io.netty.channel.ChannelHandlerAdapter) r0
            boolean r0 = r0.isSharable()
            if (r0 != 0) goto L22
            java.lang.Class r0 = r2.getClass()
            java.lang.Class<io.netty.channel.ChannelHandler$Sharable> r1 = io.netty.channel.ChannelHandler.Sharable.class
            boolean r0 = r0.isAnnotationPresent(r1)
            if (r0 == 0) goto L1a
            goto L22
        L1a:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The handler must be Sharable"
            r2.<init>(r0)
            throw r2
        L22:
            return r2
    }

    public static io.netty.handler.codec.http2.Http2MultiplexCodecBuilder forClient(io.netty.channel.ChannelHandler r2) {
            io.netty.handler.codec.http2.Http2MultiplexCodecBuilder r0 = new io.netty.handler.codec.http2.Http2MultiplexCodecBuilder
            r1 = 0
            r0.<init>(r1, r2)
            return r0
    }

    public static io.netty.handler.codec.http2.Http2MultiplexCodecBuilder forServer(io.netty.channel.ChannelHandler r2) {
            io.netty.handler.codec.http2.Http2MultiplexCodecBuilder r0 = new io.netty.handler.codec.http2.Http2MultiplexCodecBuilder
            r1 = 1
            r0.<init>(r1, r2)
            return r0
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2MultiplexCodecBuilder autoAckPingFrame(boolean r1) {
            r0 = this;
            io.netty.handler.codec.http2.Http2MultiplexCodecBuilder r1 = r0.autoAckPingFrame2(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    /* renamed from: autoAckPingFrame, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.Http2MultiplexCodecBuilder autoAckPingFrame2(boolean r1) {
            r0 = this;
            io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder r1 = super.autoAckPingFrame(r1)
            io.netty.handler.codec.http2.Http2MultiplexCodecBuilder r1 = (io.netty.handler.codec.http2.Http2MultiplexCodecBuilder) r1
            return r1
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2MultiplexCodecBuilder autoAckSettingsFrame(boolean r1) {
            r0 = this;
            io.netty.handler.codec.http2.Http2MultiplexCodecBuilder r1 = r0.autoAckSettingsFrame2(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    /* renamed from: autoAckSettingsFrame, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.Http2MultiplexCodecBuilder autoAckSettingsFrame2(boolean r1) {
            r0 = this;
            io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder r1 = super.autoAckSettingsFrame(r1)
            io.netty.handler.codec.http2.Http2MultiplexCodecBuilder r1 = (io.netty.handler.codec.http2.Http2MultiplexCodecBuilder) r1
            return r1
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2MultiplexCodec build() {
            r1 = this;
            io.netty.handler.codec.http2.Http2MultiplexCodec r0 = r1.build2()
            return r0
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    protected /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2MultiplexCodec build(io.netty.handler.codec.http2.Http2ConnectionDecoder r1, io.netty.handler.codec.http2.Http2ConnectionEncoder r2, io.netty.handler.codec.http2.Http2Settings r3) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.http2.Http2MultiplexCodec r1 = r0.build2(r1, r2, r3)
            return r1
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    /* renamed from: build, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.Http2MultiplexCodec build2() {
            r8 = this;
            io.netty.handler.codec.http2.Http2FrameWriter r0 = r8.frameWriter
            if (r0 == 0) goto L7a
            io.netty.handler.codec.http2.DefaultHttp2Connection r2 = new io.netty.handler.codec.http2.DefaultHttp2Connection
            boolean r1 = r8.isServer()
            int r3 = r8.maxReservedStreams()
            r2.<init>(r1, r3)
            io.netty.handler.codec.http2.Http2Settings r1 = r8.initialSettings()
            java.lang.Long r1 = r1.maxHeaderListSize()
            io.netty.handler.codec.http2.DefaultHttp2FrameReader r3 = new io.netty.handler.codec.http2.DefaultHttp2FrameReader
            r4 = 1
            if (r1 != 0) goto L24
            io.netty.handler.codec.http2.DefaultHttp2HeadersDecoder r1 = new io.netty.handler.codec.http2.DefaultHttp2HeadersDecoder
            r1.<init>(r4)
            goto L2e
        L24:
            io.netty.handler.codec.http2.DefaultHttp2HeadersDecoder r5 = new io.netty.handler.codec.http2.DefaultHttp2HeadersDecoder
            long r6 = r1.longValue()
            r5.<init>(r4, r6)
            r1 = r5
        L2e:
            r3.<init>(r1)
            io.netty.handler.codec.http2.Http2FrameLogger r1 = r8.frameLogger()
            if (r1 == 0) goto L4c
            io.netty.handler.codec.http2.Http2OutboundFrameLogger r1 = new io.netty.handler.codec.http2.Http2OutboundFrameLogger
            io.netty.handler.codec.http2.Http2FrameLogger r4 = r8.frameLogger()
            r1.<init>(r0, r4)
            io.netty.handler.codec.http2.Http2InboundFrameLogger r0 = new io.netty.handler.codec.http2.Http2InboundFrameLogger
            io.netty.handler.codec.http2.Http2FrameLogger r4 = r8.frameLogger()
            r0.<init>(r3, r4)
            r4 = r0
            r0 = r1
            goto L4d
        L4c:
            r4 = r3
        L4d:
            io.netty.handler.codec.http2.DefaultHttp2ConnectionEncoder r1 = new io.netty.handler.codec.http2.DefaultHttp2ConnectionEncoder
            r1.<init>(r2, r0)
            boolean r0 = r8.encoderEnforceMaxConcurrentStreams()
            if (r0 == 0) goto L5f
            io.netty.handler.codec.http2.StreamBufferingEncoder r0 = new io.netty.handler.codec.http2.StreamBufferingEncoder
            r0.<init>(r1)
            r3 = r0
            goto L60
        L5f:
            r3 = r1
        L60:
            io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r1 = new io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder
            io.netty.handler.codec.http2.Http2PromisedRequestVerifier r5 = r8.promisedRequestVerifier()
            boolean r6 = r8.isAutoAckSettingsFrame()
            boolean r7 = r8.isAutoAckPingFrame()
            r1.<init>(r2, r3, r4, r5, r6, r7)
            io.netty.handler.codec.http2.Http2Settings r0 = r8.initialSettings()
            io.netty.handler.codec.http2.Http2MultiplexCodec r0 = r8.build2(r1, r3, r0)
            return r0
        L7a:
            io.netty.handler.codec.http2.Http2ConnectionHandler r0 = super.build()
            io.netty.handler.codec.http2.Http2MultiplexCodec r0 = (io.netty.handler.codec.http2.Http2MultiplexCodec) r0
            return r0
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    /* renamed from: build, reason: avoid collision after fix types in other method */
    protected io.netty.handler.codec.http2.Http2MultiplexCodec build2(io.netty.handler.codec.http2.Http2ConnectionDecoder r8, io.netty.handler.codec.http2.Http2ConnectionEncoder r9, io.netty.handler.codec.http2.Http2Settings r10) {
            r7 = this;
            io.netty.handler.codec.http2.Http2MultiplexCodec r0 = new io.netty.handler.codec.http2.Http2MultiplexCodec
            io.netty.channel.ChannelHandler r4 = r7.childHandler
            io.netty.channel.ChannelHandler r5 = r7.upgradeStreamHandler
            boolean r6 = r7.decoupleCloseAndGoAway()
            r2 = r8
            r1 = r9
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            long r8 = r7.gracefulShutdownTimeoutMillis()
            r0.gracefulShutdownTimeoutMillis(r8)
            return r0
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2MultiplexCodecBuilder decoupleCloseAndGoAway(boolean r1) {
            r0 = this;
            io.netty.handler.codec.http2.Http2MultiplexCodecBuilder r1 = r0.decoupleCloseAndGoAway2(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    /* renamed from: decoupleCloseAndGoAway, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.Http2MultiplexCodecBuilder decoupleCloseAndGoAway2(boolean r1) {
            r0 = this;
            io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder r1 = super.decoupleCloseAndGoAway(r1)
            io.netty.handler.codec.http2.Http2MultiplexCodecBuilder r1 = (io.netty.handler.codec.http2.Http2MultiplexCodecBuilder) r1
            return r1
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2MultiplexCodecBuilder encoderEnforceMaxConcurrentStreams(boolean r1) {
            r0 = this;
            io.netty.handler.codec.http2.Http2MultiplexCodecBuilder r1 = r0.encoderEnforceMaxConcurrentStreams2(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    /* renamed from: encoderEnforceMaxConcurrentStreams, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.Http2MultiplexCodecBuilder encoderEnforceMaxConcurrentStreams2(boolean r1) {
            r0 = this;
            io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder r1 = super.encoderEnforceMaxConcurrentStreams(r1)
            io.netty.handler.codec.http2.Http2MultiplexCodecBuilder r1 = (io.netty.handler.codec.http2.Http2MultiplexCodecBuilder) r1
            return r1
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    public boolean encoderEnforceMaxConcurrentStreams() {
            r1 = this;
            boolean r0 = super.encoderEnforceMaxConcurrentStreams()
            return r0
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2MultiplexCodecBuilder encoderIgnoreMaxHeaderListSize(boolean r1) {
            r0 = this;
            io.netty.handler.codec.http2.Http2MultiplexCodecBuilder r1 = r0.encoderIgnoreMaxHeaderListSize2(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    /* renamed from: encoderIgnoreMaxHeaderListSize, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.Http2MultiplexCodecBuilder encoderIgnoreMaxHeaderListSize2(boolean r1) {
            r0 = this;
            io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder r1 = super.encoderIgnoreMaxHeaderListSize(r1)
            io.netty.handler.codec.http2.Http2MultiplexCodecBuilder r1 = (io.netty.handler.codec.http2.Http2MultiplexCodecBuilder) r1
            return r1
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2MultiplexCodecBuilder frameLogger(io.netty.handler.codec.http2.Http2FrameLogger r1) {
            r0 = this;
            io.netty.handler.codec.http2.Http2MultiplexCodecBuilder r1 = r0.frameLogger2(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    public io.netty.handler.codec.http2.Http2FrameLogger frameLogger() {
            r1 = this;
            io.netty.handler.codec.http2.Http2FrameLogger r0 = super.frameLogger()
            return r0
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    /* renamed from: frameLogger, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.Http2MultiplexCodecBuilder frameLogger2(io.netty.handler.codec.http2.Http2FrameLogger r1) {
            r0 = this;
            io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder r1 = super.frameLogger(r1)
            io.netty.handler.codec.http2.Http2MultiplexCodecBuilder r1 = (io.netty.handler.codec.http2.Http2MultiplexCodecBuilder) r1
            return r1
    }

    io.netty.handler.codec.http2.Http2MultiplexCodecBuilder frameWriter(io.netty.handler.codec.http2.Http2FrameWriter r2) {
            r1 = this;
            java.lang.String r0 = "frameWriter"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.handler.codec.http2.Http2FrameWriter r2 = (io.netty.handler.codec.http2.Http2FrameWriter) r2
            r1.frameWriter = r2
            return r1
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    public long gracefulShutdownTimeoutMillis() {
            r2 = this;
            long r0 = super.gracefulShutdownTimeoutMillis()
            return r0
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2MultiplexCodecBuilder gracefulShutdownTimeoutMillis(long r1) {
            r0 = this;
            io.netty.handler.codec.http2.Http2MultiplexCodecBuilder r1 = r0.gracefulShutdownTimeoutMillis2(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    /* renamed from: gracefulShutdownTimeoutMillis, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.Http2MultiplexCodecBuilder gracefulShutdownTimeoutMillis2(long r1) {
            r0 = this;
            io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder r1 = super.gracefulShutdownTimeoutMillis(r1)
            io.netty.handler.codec.http2.Http2MultiplexCodecBuilder r1 = (io.netty.handler.codec.http2.Http2MultiplexCodecBuilder) r1
            return r1
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2MultiplexCodecBuilder headerSensitivityDetector(io.netty.handler.codec.http2.Http2HeadersEncoder.SensitivityDetector r1) {
            r0 = this;
            io.netty.handler.codec.http2.Http2MultiplexCodecBuilder r1 = r0.headerSensitivityDetector2(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    public io.netty.handler.codec.http2.Http2HeadersEncoder.SensitivityDetector headerSensitivityDetector() {
            r1 = this;
            io.netty.handler.codec.http2.Http2HeadersEncoder$SensitivityDetector r0 = super.headerSensitivityDetector()
            return r0
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    /* renamed from: headerSensitivityDetector, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.Http2MultiplexCodecBuilder headerSensitivityDetector2(io.netty.handler.codec.http2.Http2HeadersEncoder.SensitivityDetector r1) {
            r0 = this;
            io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder r1 = super.headerSensitivityDetector(r1)
            io.netty.handler.codec.http2.Http2MultiplexCodecBuilder r1 = (io.netty.handler.codec.http2.Http2MultiplexCodecBuilder) r1
            return r1
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2MultiplexCodecBuilder initialHuffmanDecodeCapacity(int r1) {
            r0 = this;
            io.netty.handler.codec.http2.Http2MultiplexCodecBuilder r1 = r0.initialHuffmanDecodeCapacity2(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    @java.lang.Deprecated
    /* renamed from: initialHuffmanDecodeCapacity, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.Http2MultiplexCodecBuilder initialHuffmanDecodeCapacity2(int r1) {
            r0 = this;
            io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder r1 = super.initialHuffmanDecodeCapacity(r1)
            io.netty.handler.codec.http2.Http2MultiplexCodecBuilder r1 = (io.netty.handler.codec.http2.Http2MultiplexCodecBuilder) r1
            return r1
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2MultiplexCodecBuilder initialSettings(io.netty.handler.codec.http2.Http2Settings r1) {
            r0 = this;
            io.netty.handler.codec.http2.Http2MultiplexCodecBuilder r1 = r0.initialSettings2(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    /* renamed from: initialSettings, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.Http2MultiplexCodecBuilder initialSettings2(io.netty.handler.codec.http2.Http2Settings r1) {
            r0 = this;
            io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder r1 = super.initialSettings(r1)
            io.netty.handler.codec.http2.Http2MultiplexCodecBuilder r1 = (io.netty.handler.codec.http2.Http2MultiplexCodecBuilder) r1
            return r1
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    public io.netty.handler.codec.http2.Http2Settings initialSettings() {
            r1 = this;
            io.netty.handler.codec.http2.Http2Settings r0 = super.initialSettings()
            return r0
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    public boolean isServer() {
            r1 = this;
            boolean r0 = super.isServer()
            return r0
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    public boolean isValidateHeaders() {
            r1 = this;
            boolean r0 = super.isValidateHeaders()
            return r0
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    public int maxReservedStreams() {
            r1 = this;
            int r0 = super.maxReservedStreams()
            return r0
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2MultiplexCodecBuilder maxReservedStreams(int r1) {
            r0 = this;
            io.netty.handler.codec.http2.Http2MultiplexCodecBuilder r1 = r0.maxReservedStreams2(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    /* renamed from: maxReservedStreams, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.Http2MultiplexCodecBuilder maxReservedStreams2(int r1) {
            r0 = this;
            io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder r1 = super.maxReservedStreams(r1)
            io.netty.handler.codec.http2.Http2MultiplexCodecBuilder r1 = (io.netty.handler.codec.http2.Http2MultiplexCodecBuilder) r1
            return r1
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2MultiplexCodecBuilder validateHeaders(boolean r1) {
            r0 = this;
            io.netty.handler.codec.http2.Http2MultiplexCodecBuilder r1 = r0.validateHeaders2(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder
    /* renamed from: validateHeaders, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.Http2MultiplexCodecBuilder validateHeaders2(boolean r1) {
            r0 = this;
            io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder r1 = super.validateHeaders(r1)
            io.netty.handler.codec.http2.Http2MultiplexCodecBuilder r1 = (io.netty.handler.codec.http2.Http2MultiplexCodecBuilder) r1
            return r1
    }

    public io.netty.handler.codec.http2.Http2MultiplexCodecBuilder withUpgradeStreamHandler(io.netty.channel.ChannelHandler r2) {
            r1 = this;
            boolean r0 = r1.isServer()
            if (r0 != 0) goto L9
            r1.upgradeStreamHandler = r2
            return r1
        L9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Server codecs don't use an extra handler for the upgrade stream"
            r2.<init>(r0)
            throw r2
    }
}
