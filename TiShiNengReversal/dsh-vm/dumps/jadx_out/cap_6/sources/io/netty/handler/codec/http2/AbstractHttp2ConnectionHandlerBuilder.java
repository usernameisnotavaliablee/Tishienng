package io.netty.handler.codec.http2;

import io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder;
import io.netty.handler.codec.http2.Http2ConnectionHandler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class AbstractHttp2ConnectionHandlerBuilder<T extends io.netty.handler.codec.http2.Http2ConnectionHandler, B extends io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder<T, B>> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final io.netty.handler.codec.http2.Http2HeadersEncoder.SensitivityDetector DEFAULT_HEADER_SENSITIVITY_DETECTOR = null;
    private boolean autoAckPingFrame;
    private boolean autoAckSettingsFrame;
    private io.netty.handler.codec.http2.Http2Connection connection;
    private io.netty.handler.codec.http2.Http2ConnectionDecoder decoder;
    private boolean decoupleCloseAndGoAway;
    private io.netty.handler.codec.http2.Http2ConnectionEncoder encoder;
    private java.lang.Boolean encoderEnforceMaxConcurrentStreams;
    private java.lang.Boolean encoderIgnoreMaxHeaderListSize;
    private io.netty.handler.codec.http2.Http2FrameListener frameListener;
    private io.netty.handler.codec.http2.Http2FrameLogger frameLogger;
    private long gracefulShutdownTimeoutMillis;
    private io.netty.handler.codec.http2.Http2HeadersEncoder.SensitivityDetector headerSensitivityDetector;
    private io.netty.handler.codec.http2.Http2Settings initialSettings;
    private java.lang.Boolean isServer;
    private java.lang.Integer maxReservedStreams;
    private io.netty.handler.codec.http2.Http2PromisedRequestVerifier promisedRequestVerifier;
    private java.lang.Boolean validateHeaders;

    static {
            io.netty.handler.codec.http2.Http2HeadersEncoder$SensitivityDetector r0 = io.netty.handler.codec.http2.Http2HeadersEncoder.NEVER_SENSITIVE
            io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder.DEFAULT_HEADER_SENSITIVITY_DETECTOR = r0
            return
    }

    public AbstractHttp2ConnectionHandlerBuilder() {
            r2 = this;
            r2.<init>()
            io.netty.handler.codec.http2.Http2Settings r0 = io.netty.handler.codec.http2.Http2Settings.defaultSettings()
            r2.initialSettings = r0
            long r0 = io.netty.handler.codec.http2.Http2CodecUtil.DEFAULT_GRACEFUL_SHUTDOWN_TIMEOUT_MILLIS
            r2.gracefulShutdownTimeoutMillis = r0
            io.netty.handler.codec.http2.Http2PromisedRequestVerifier r0 = io.netty.handler.codec.http2.Http2PromisedRequestVerifier.ALWAYS_VERIFY
            r2.promisedRequestVerifier = r0
            r0 = 1
            r2.autoAckSettingsFrame = r0
            r2.autoAckPingFrame = r0
            return
    }

    private T buildFromCodec(io.netty.handler.codec.http2.Http2ConnectionDecoder r3, io.netty.handler.codec.http2.Http2ConnectionEncoder r4) {
            r2 = this;
            io.netty.handler.codec.http2.Http2Settings r0 = r2.initialSettings     // Catch: java.lang.Throwable -> L1f
            io.netty.handler.codec.http2.Http2ConnectionHandler r3 = r2.build(r3, r4, r0)     // Catch: java.lang.Throwable -> L1f
            long r0 = r2.gracefulShutdownTimeoutMillis
            r3.gracefulShutdownTimeoutMillis(r0)
            io.netty.handler.codec.http2.Http2ConnectionDecoder r4 = r3.decoder()
            io.netty.handler.codec.http2.Http2FrameListener r4 = r4.frameListener()
            if (r4 != 0) goto L1e
            io.netty.handler.codec.http2.Http2ConnectionDecoder r4 = r3.decoder()
            io.netty.handler.codec.http2.Http2FrameListener r0 = r2.frameListener
            r4.frameListener(r0)
        L1e:
            return r3
        L1f:
            r0 = move-exception
            r4.close()
            r3.close()
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "failed to build a Http2ConnectionHandler"
            r3.<init>(r4, r0)
            throw r3
    }

    private T buildFromConnection(io.netty.handler.codec.http2.Http2Connection r9) {
            r8 = this;
            io.netty.handler.codec.http2.Http2Settings r0 = r8.initialSettings
            java.lang.Long r0 = r0.maxHeaderListSize()
            io.netty.handler.codec.http2.DefaultHttp2FrameReader r1 = new io.netty.handler.codec.http2.DefaultHttp2FrameReader
            io.netty.handler.codec.http2.DefaultHttp2HeadersDecoder r2 = new io.netty.handler.codec.http2.DefaultHttp2HeadersDecoder
            boolean r3 = r8.isValidateHeaders()
            if (r0 != 0) goto L13
            r4 = 8192(0x2000, double:4.0474E-320)
            goto L17
        L13:
            long r4 = r0.longValue()
        L17:
            r0 = -1
            r2.<init>(r3, r4, r0)
            r1.<init>(r2)
            java.lang.Boolean r0 = r8.encoderIgnoreMaxHeaderListSize
            if (r0 != 0) goto L2c
            io.netty.handler.codec.http2.DefaultHttp2FrameWriter r0 = new io.netty.handler.codec.http2.DefaultHttp2FrameWriter
            io.netty.handler.codec.http2.Http2HeadersEncoder$SensitivityDetector r2 = r8.headerSensitivityDetector()
            r0.<init>(r2)
            goto L3b
        L2c:
            io.netty.handler.codec.http2.DefaultHttp2FrameWriter r0 = new io.netty.handler.codec.http2.DefaultHttp2FrameWriter
            io.netty.handler.codec.http2.Http2HeadersEncoder$SensitivityDetector r2 = r8.headerSensitivityDetector()
            java.lang.Boolean r3 = r8.encoderIgnoreMaxHeaderListSize
            boolean r3 = r3.booleanValue()
            r0.<init>(r2, r3)
        L3b:
            io.netty.handler.codec.http2.Http2FrameLogger r2 = r8.frameLogger
            if (r2 == 0) goto L4e
            io.netty.handler.codec.http2.Http2InboundFrameLogger r3 = new io.netty.handler.codec.http2.Http2InboundFrameLogger
            r3.<init>(r1, r2)
            io.netty.handler.codec.http2.Http2OutboundFrameLogger r1 = new io.netty.handler.codec.http2.Http2OutboundFrameLogger
            io.netty.handler.codec.http2.Http2FrameLogger r2 = r8.frameLogger
            r1.<init>(r0, r2)
            r0 = r1
            r4 = r3
            goto L4f
        L4e:
            r4 = r1
        L4f:
            io.netty.handler.codec.http2.DefaultHttp2ConnectionEncoder r1 = new io.netty.handler.codec.http2.DefaultHttp2ConnectionEncoder
            r1.<init>(r9, r0)
            boolean r0 = r8.encoderEnforceMaxConcurrentStreams()
            if (r0 == 0) goto L89
            boolean r2 = r9.isServer()
            if (r2 != 0) goto L67
            io.netty.handler.codec.http2.StreamBufferingEncoder r0 = new io.netty.handler.codec.http2.StreamBufferingEncoder
            r0.<init>(r1)
            r3 = r0
            goto L8a
        L67:
            r1.close()
            r4.close()
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "encoderEnforceMaxConcurrentStreams: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = " not supported for server"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r9.<init>(r0)
            throw r9
        L89:
            r3 = r1
        L8a:
            io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r1 = new io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder
            io.netty.handler.codec.http2.Http2PromisedRequestVerifier r5 = r8.promisedRequestVerifier()
            boolean r6 = r8.isAutoAckSettingsFrame()
            boolean r7 = r8.isAutoAckPingFrame()
            r2 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            io.netty.handler.codec.http2.Http2ConnectionHandler r9 = r8.buildFromCodec(r1, r3)
            return r9
    }

    private static void enforceConstraint(java.lang.String r1, java.lang.String r2, java.lang.Object r3) {
            if (r3 != 0) goto L3
            return
        L3:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "() cannot be called because "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = "() has been called already."
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            r3.<init>(r1)
            throw r3
    }

    private void enforceNonCodecConstraints(java.lang.String r3) {
            r2 = this;
            io.netty.handler.codec.http2.Http2ConnectionDecoder r0 = r2.decoder
            java.lang.String r1 = "server/connection"
            enforceConstraint(r3, r1, r0)
            io.netty.handler.codec.http2.Http2ConnectionEncoder r0 = r2.encoder
            enforceConstraint(r3, r1, r0)
            return
    }

    protected B autoAckPingFrame(boolean r2) {
            r1 = this;
            java.lang.String r0 = "autoAckPingFrame"
            r1.enforceNonCodecConstraints(r0)
            r1.autoAckPingFrame = r2
            io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder r2 = r1.self()
            return r2
    }

    protected B autoAckSettingsFrame(boolean r2) {
            r1 = this;
            java.lang.String r0 = "autoAckSettingsFrame"
            r1.enforceNonCodecConstraints(r0)
            r1.autoAckSettingsFrame = r2
            io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder r2 = r1.self()
            return r2
    }

    protected T build() {
            r3 = this;
            io.netty.handler.codec.http2.Http2ConnectionEncoder r0 = r3.encoder
            if (r0 == 0) goto Lb
            io.netty.handler.codec.http2.Http2ConnectionDecoder r1 = r3.decoder
            io.netty.handler.codec.http2.Http2ConnectionHandler r0 = r3.buildFromCodec(r1, r0)
            return r0
        Lb:
            io.netty.handler.codec.http2.Http2Connection r0 = r3.connection
            if (r0 != 0) goto L1c
            io.netty.handler.codec.http2.DefaultHttp2Connection r0 = new io.netty.handler.codec.http2.DefaultHttp2Connection
            boolean r1 = r3.isServer()
            int r2 = r3.maxReservedStreams()
            r0.<init>(r1, r2)
        L1c:
            io.netty.handler.codec.http2.Http2ConnectionHandler r0 = r3.buildFromConnection(r0)
            return r0
    }

    protected abstract T build(io.netty.handler.codec.http2.Http2ConnectionDecoder r1, io.netty.handler.codec.http2.Http2ConnectionEncoder r2, io.netty.handler.codec.http2.Http2Settings r3) throws java.lang.Exception;

    protected B codec(io.netty.handler.codec.http2.Http2ConnectionDecoder r4, io.netty.handler.codec.http2.Http2ConnectionEncoder r5) {
            r3 = this;
            java.lang.String r0 = "server"
            java.lang.Boolean r1 = r3.isServer
            java.lang.String r2 = "codec"
            enforceConstraint(r2, r0, r1)
            java.lang.String r0 = "maxReservedStreams"
            java.lang.Integer r1 = r3.maxReservedStreams
            enforceConstraint(r2, r0, r1)
            java.lang.String r0 = "connection"
            io.netty.handler.codec.http2.Http2Connection r1 = r3.connection
            enforceConstraint(r2, r0, r1)
            java.lang.String r0 = "frameLogger"
            io.netty.handler.codec.http2.Http2FrameLogger r1 = r3.frameLogger
            enforceConstraint(r2, r0, r1)
            java.lang.String r0 = "validateHeaders"
            java.lang.Boolean r1 = r3.validateHeaders
            enforceConstraint(r2, r0, r1)
            java.lang.String r0 = "headerSensitivityDetector"
            io.netty.handler.codec.http2.Http2HeadersEncoder$SensitivityDetector r1 = r3.headerSensitivityDetector
            enforceConstraint(r2, r0, r1)
            java.lang.String r0 = "encoderEnforceMaxConcurrentStreams"
            java.lang.Boolean r1 = r3.encoderEnforceMaxConcurrentStreams
            enforceConstraint(r2, r0, r1)
            java.lang.String r0 = "decoder"
            io.netty.util.internal.ObjectUtil.checkNotNull(r4, r0)
            java.lang.String r0 = "encoder"
            io.netty.util.internal.ObjectUtil.checkNotNull(r5, r0)
            io.netty.handler.codec.http2.Http2Connection r0 = r4.connection()
            io.netty.handler.codec.http2.Http2Connection r1 = r5.connection()
            if (r0 != r1) goto L50
            r3.decoder = r4
            r3.encoder = r5
            io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder r4 = r3.self()
            return r4
        L50:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "The specified encoder and decoder have different connections."
            r4.<init>(r5)
            throw r4
    }

    protected B connection(io.netty.handler.codec.http2.Http2Connection r4) {
            r3 = this;
            java.lang.String r0 = "maxReservedStreams"
            java.lang.Integer r1 = r3.maxReservedStreams
            java.lang.String r2 = "connection"
            enforceConstraint(r2, r0, r1)
            java.lang.String r0 = "server"
            java.lang.Boolean r1 = r3.isServer
            enforceConstraint(r2, r0, r1)
            io.netty.handler.codec.http2.Http2ConnectionDecoder r0 = r3.decoder
            java.lang.String r1 = "codec"
            enforceConstraint(r2, r1, r0)
            io.netty.handler.codec.http2.Http2ConnectionEncoder r0 = r3.encoder
            enforceConstraint(r2, r1, r0)
            java.lang.Object r4 = io.netty.util.internal.ObjectUtil.checkNotNull(r4, r2)
            io.netty.handler.codec.http2.Http2Connection r4 = (io.netty.handler.codec.http2.Http2Connection) r4
            r3.connection = r4
            io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder r4 = r3.self()
            return r4
    }

    protected io.netty.handler.codec.http2.Http2Connection connection() {
            r1 = this;
            io.netty.handler.codec.http2.Http2Connection r0 = r1.connection
            return r0
    }

    protected io.netty.handler.codec.http2.Http2ConnectionDecoder decoder() {
            r1 = this;
            io.netty.handler.codec.http2.Http2ConnectionDecoder r0 = r1.decoder
            return r0
    }

    protected B decoupleCloseAndGoAway(boolean r1) {
            r0 = this;
            r0.decoupleCloseAndGoAway = r1
            io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder r1 = r0.self()
            return r1
    }

    protected boolean decoupleCloseAndGoAway() {
            r1 = this;
            boolean r0 = r1.decoupleCloseAndGoAway
            return r0
    }

    protected io.netty.handler.codec.http2.Http2ConnectionEncoder encoder() {
            r1 = this;
            io.netty.handler.codec.http2.Http2ConnectionEncoder r0 = r1.encoder
            return r0
    }

    protected B encoderEnforceMaxConcurrentStreams(boolean r2) {
            r1 = this;
            java.lang.String r0 = "encoderEnforceMaxConcurrentStreams"
            r1.enforceNonCodecConstraints(r0)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1.encoderEnforceMaxConcurrentStreams = r2
            io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder r2 = r1.self()
            return r2
    }

    protected boolean encoderEnforceMaxConcurrentStreams() {
            r1 = this;
            java.lang.Boolean r0 = r1.encoderEnforceMaxConcurrentStreams
            if (r0 == 0) goto L9
            boolean r0 = r0.booleanValue()
            return r0
        L9:
            r0 = 0
            return r0
    }

    protected B encoderIgnoreMaxHeaderListSize(boolean r2) {
            r1 = this;
            java.lang.String r0 = "encoderIgnoreMaxHeaderListSize"
            r1.enforceNonCodecConstraints(r0)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1.encoderIgnoreMaxHeaderListSize = r2
            io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder r2 = r1.self()
            return r2
    }

    protected B frameListener(io.netty.handler.codec.http2.Http2FrameListener r2) {
            r1 = this;
            java.lang.String r0 = "frameListener"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.handler.codec.http2.Http2FrameListener r2 = (io.netty.handler.codec.http2.Http2FrameListener) r2
            r1.frameListener = r2
            io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder r2 = r1.self()
            return r2
    }

    protected io.netty.handler.codec.http2.Http2FrameListener frameListener() {
            r1 = this;
            io.netty.handler.codec.http2.Http2FrameListener r0 = r1.frameListener
            return r0
    }

    protected B frameLogger(io.netty.handler.codec.http2.Http2FrameLogger r2) {
            r1 = this;
            java.lang.String r0 = "frameLogger"
            r1.enforceNonCodecConstraints(r0)
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.handler.codec.http2.Http2FrameLogger r2 = (io.netty.handler.codec.http2.Http2FrameLogger) r2
            r1.frameLogger = r2
            io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder r2 = r1.self()
            return r2
    }

    protected io.netty.handler.codec.http2.Http2FrameLogger frameLogger() {
            r1 = this;
            io.netty.handler.codec.http2.Http2FrameLogger r0 = r1.frameLogger
            return r0
    }

    protected long gracefulShutdownTimeoutMillis() {
            r2 = this;
            long r0 = r2.gracefulShutdownTimeoutMillis
            return r0
    }

    protected B gracefulShutdownTimeoutMillis(long r4) {
            r3 = this;
            r0 = -1
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto Ld
            r3.gracefulShutdownTimeoutMillis = r4
            io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder r4 = r3.self()
            return r4
        Ld:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "gracefulShutdownTimeoutMillis: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " (expected: -1 for indefinite or >= 0)"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    protected B headerSensitivityDetector(io.netty.handler.codec.http2.Http2HeadersEncoder.SensitivityDetector r2) {
            r1 = this;
            java.lang.String r0 = "headerSensitivityDetector"
            r1.enforceNonCodecConstraints(r0)
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.handler.codec.http2.Http2HeadersEncoder$SensitivityDetector r2 = (io.netty.handler.codec.http2.Http2HeadersEncoder.SensitivityDetector) r2
            r1.headerSensitivityDetector = r2
            io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder r2 = r1.self()
            return r2
    }

    protected io.netty.handler.codec.http2.Http2HeadersEncoder.SensitivityDetector headerSensitivityDetector() {
            r1 = this;
            io.netty.handler.codec.http2.Http2HeadersEncoder$SensitivityDetector r0 = r1.headerSensitivityDetector
            if (r0 == 0) goto L5
            return r0
        L5:
            io.netty.handler.codec.http2.Http2HeadersEncoder$SensitivityDetector r0 = io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder.DEFAULT_HEADER_SENSITIVITY_DETECTOR
            return r0
    }

    @java.lang.Deprecated
    protected B initialHuffmanDecodeCapacity(int r1) {
            r0 = this;
            io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder r1 = r0.self()
            return r1
    }

    protected B initialSettings(io.netty.handler.codec.http2.Http2Settings r2) {
            r1 = this;
            java.lang.String r0 = "settings"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.handler.codec.http2.Http2Settings r2 = (io.netty.handler.codec.http2.Http2Settings) r2
            r1.initialSettings = r2
            io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder r2 = r1.self()
            return r2
    }

    protected io.netty.handler.codec.http2.Http2Settings initialSettings() {
            r1 = this;
            io.netty.handler.codec.http2.Http2Settings r0 = r1.initialSettings
            return r0
    }

    protected boolean isAutoAckPingFrame() {
            r1 = this;
            boolean r0 = r1.autoAckPingFrame
            return r0
    }

    protected boolean isAutoAckSettingsFrame() {
            r1 = this;
            boolean r0 = r1.autoAckSettingsFrame
            return r0
    }

    protected boolean isServer() {
            r1 = this;
            java.lang.Boolean r0 = r1.isServer
            if (r0 == 0) goto L9
            boolean r0 = r0.booleanValue()
            return r0
        L9:
            r0 = 1
            return r0
    }

    protected boolean isValidateHeaders() {
            r1 = this;
            java.lang.Boolean r0 = r1.validateHeaders
            if (r0 == 0) goto L9
            boolean r0 = r0.booleanValue()
            return r0
        L9:
            r0 = 1
            return r0
    }

    protected int maxReservedStreams() {
            r1 = this;
            java.lang.Integer r0 = r1.maxReservedStreams
            if (r0 == 0) goto L9
            int r0 = r0.intValue()
            return r0
        L9:
            r0 = 100
            return r0
    }

    protected B maxReservedStreams(int r4) {
            r3 = this;
            java.lang.String r0 = "connection"
            io.netty.handler.codec.http2.Http2Connection r1 = r3.connection
            java.lang.String r2 = "server"
            enforceConstraint(r2, r0, r1)
            io.netty.handler.codec.http2.Http2ConnectionDecoder r0 = r3.decoder
            java.lang.String r1 = "codec"
            enforceConstraint(r2, r1, r0)
            io.netty.handler.codec.http2.Http2ConnectionEncoder r0 = r3.encoder
            enforceConstraint(r2, r1, r0)
            java.lang.String r0 = "maxReservedStreams"
            int r4 = io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r4, r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.maxReservedStreams = r4
            io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder r4 = r3.self()
            return r4
    }

    protected B promisedRequestVerifier(io.netty.handler.codec.http2.Http2PromisedRequestVerifier r2) {
            r1 = this;
            java.lang.String r0 = "promisedRequestVerifier"
            r1.enforceNonCodecConstraints(r0)
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.handler.codec.http2.Http2PromisedRequestVerifier r2 = (io.netty.handler.codec.http2.Http2PromisedRequestVerifier) r2
            r1.promisedRequestVerifier = r2
            io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder r2 = r1.self()
            return r2
    }

    protected io.netty.handler.codec.http2.Http2PromisedRequestVerifier promisedRequestVerifier() {
            r1 = this;
            io.netty.handler.codec.http2.Http2PromisedRequestVerifier r0 = r1.promisedRequestVerifier
            return r0
    }

    protected final B self() {
            r0 = this;
            return r0
    }

    protected B server(boolean r4) {
            r3 = this;
            java.lang.String r0 = "connection"
            io.netty.handler.codec.http2.Http2Connection r1 = r3.connection
            java.lang.String r2 = "server"
            enforceConstraint(r2, r0, r1)
            io.netty.handler.codec.http2.Http2ConnectionDecoder r0 = r3.decoder
            java.lang.String r1 = "codec"
            enforceConstraint(r2, r1, r0)
            io.netty.handler.codec.http2.Http2ConnectionEncoder r0 = r3.encoder
            enforceConstraint(r2, r1, r0)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r3.isServer = r4
            io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder r4 = r3.self()
            return r4
    }

    protected B validateHeaders(boolean r2) {
            r1 = this;
            java.lang.String r0 = "validateHeaders"
            r1.enforceNonCodecConstraints(r0)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1.validateHeaders = r2
            io.netty.handler.codec.http2.AbstractHttp2ConnectionHandlerBuilder r2 = r1.self()
            return r2
    }
}
