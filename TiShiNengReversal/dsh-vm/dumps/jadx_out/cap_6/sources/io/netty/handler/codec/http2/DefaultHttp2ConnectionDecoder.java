package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultHttp2ConnectionDecoder implements io.netty.handler.codec.http2.Http2ConnectionDecoder {
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private final boolean autoAckPing;
    private final io.netty.handler.codec.http2.Http2Connection connection;
    private final io.netty.handler.codec.http2.Http2ConnectionEncoder encoder;
    private final io.netty.handler.codec.http2.Http2FrameReader frameReader;
    private io.netty.handler.codec.http2.Http2FrameListener internalFrameListener;
    private io.netty.handler.codec.http2.Http2LifecycleManager lifecycleManager;
    private io.netty.handler.codec.http2.Http2FrameListener listener;
    private final io.netty.handler.codec.http2.Http2PromisedRequestVerifier requestVerifier;
    private final io.netty.handler.codec.http2.Http2SettingsReceivedConsumer settingsReceivedConsumer;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$http2$Http2Stream$State = null;

        static {
                io.netty.handler.codec.http2.Http2Stream$State[] r0 = io.netty.handler.codec.http2.Http2Stream.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$http2$Http2Stream$State = r0
                io.netty.handler.codec.http2.Http2Stream$State r1 = io.netty.handler.codec.http2.Http2Stream.State.OPEN     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$http2$Http2Stream$State     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.handler.codec.http2.Http2Stream$State r1 = io.netty.handler.codec.http2.Http2Stream.State.HALF_CLOSED_LOCAL     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$http2$Http2Stream$State     // Catch: java.lang.NoSuchFieldError -> L28
                io.netty.handler.codec.http2.Http2Stream$State r1 = io.netty.handler.codec.http2.Http2Stream.State.HALF_CLOSED_REMOTE     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$http2$Http2Stream$State     // Catch: java.lang.NoSuchFieldError -> L33
                io.netty.handler.codec.http2.Http2Stream$State r1 = io.netty.handler.codec.http2.Http2Stream.State.CLOSED     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$http2$Http2Stream$State     // Catch: java.lang.NoSuchFieldError -> L3e
                io.netty.handler.codec.http2.Http2Stream$State r1 = io.netty.handler.codec.http2.Http2Stream.State.RESERVED_REMOTE     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$http2$Http2Stream$State     // Catch: java.lang.NoSuchFieldError -> L49
                io.netty.handler.codec.http2.Http2Stream$State r1 = io.netty.handler.codec.http2.Http2Stream.State.IDLE     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class FrameReadListener implements io.netty.handler.codec.http2.Http2FrameListener {
        final /* synthetic */ io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder this$0;

        private FrameReadListener(io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* synthetic */ FrameReadListener(io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r1, io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private void applyLocalSettings(io.netty.handler.codec.http2.Http2Settings r9) throws io.netty.handler.codec.http2.Http2Exception {
                r8 = this;
                java.lang.Boolean r0 = r9.pushEnabled()
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r1 = r8.this$0
                io.netty.handler.codec.http2.Http2FrameReader r1 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$600(r1)
                io.netty.handler.codec.http2.Http2FrameReader$Configuration r1 = r1.configuration()
                io.netty.handler.codec.http2.Http2HeadersDecoder$Configuration r2 = r1.headersConfiguration()
                io.netty.handler.codec.http2.Http2FrameSizePolicy r1 = r1.frameSizePolicy()
                if (r0 == 0) goto L42
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r3 = r8.this$0
                io.netty.handler.codec.http2.Http2Connection r3 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$100(r3)
                boolean r3 = r3.isServer()
                if (r3 != 0) goto L36
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r3 = r8.this$0
                io.netty.handler.codec.http2.Http2Connection r3 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$100(r3)
                io.netty.handler.codec.http2.Http2Connection$Endpoint r3 = r3.local()
                boolean r0 = r0.booleanValue()
                r3.allowPushTo(r0)
                goto L42
            L36:
                io.netty.handler.codec.http2.Http2Error r9 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "Server sending SETTINGS frame with ENABLE_PUSH specified"
                io.netty.handler.codec.http2.Http2Exception r9 = io.netty.handler.codec.http2.Http2Exception.connectionError(r9, r1, r0)
                throw r9
            L42:
                java.lang.Long r0 = r9.maxConcurrentStreams()
                if (r0 == 0) goto L61
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r3 = r8.this$0
                io.netty.handler.codec.http2.Http2Connection r3 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$100(r3)
                io.netty.handler.codec.http2.Http2Connection$Endpoint r3 = r3.remote()
                long r4 = r0.longValue()
                r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
                long r4 = java.lang.Math.min(r4, r6)
                int r0 = (int) r4
                r3.maxActiveStreams(r0)
            L61:
                java.lang.Long r0 = r9.headerTableSize()
                if (r0 == 0) goto L6e
                long r3 = r0.longValue()
                r2.maxHeaderTableSize(r3)
            L6e:
                java.lang.Long r0 = r9.maxHeaderListSize()
                if (r0 == 0) goto L85
                long r3 = r0.longValue()
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r5 = r8.this$0
                long r6 = r0.longValue()
                long r5 = r5.calculateMaxHeaderListSizeGoAway(r6)
                r2.maxHeaderListSize(r3, r5)
            L85:
                java.lang.Integer r0 = r9.maxFrameSize()
                if (r0 == 0) goto L92
                int r0 = r0.intValue()
                r1.maxFrameSize(r0)
            L92:
                java.lang.Integer r9 = r9.initialWindowSize()
                if (r9 == 0) goto La5
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r0 = r8.this$0
                io.netty.handler.codec.http2.Http2LocalFlowController r0 = r0.flowController()
                int r9 = r9.intValue()
                r0.initialWindowSize(r9)
            La5:
                return
        }

        private boolean shouldIgnoreHeadersOrDataFrame(io.netty.channel.ChannelHandlerContext r6, int r7, io.netty.handler.codec.http2.Http2Stream r8, java.lang.String r9) throws io.netty.handler.codec.http2.Http2Exception {
                r5 = this;
                r0 = 3
                r1 = 2
                r2 = 0
                r3 = 1
                if (r8 != 0) goto L39
                boolean r8 = r5.streamCreatedAfterGoAwaySent(r7)
                if (r8 == 0) goto L26
                io.netty.util.internal.logging.InternalLogger r8 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$1000()
                io.netty.channel.Channel r6 = r6.channel()
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r0[r2] = r6
                r0[r3] = r9
                r0[r1] = r7
                java.lang.String r6 = "{} ignoring {} frame for stream {}. Stream sent after GOAWAY sent"
                r8.info(r6, r0)
                return r3
            L26:
                io.netty.handler.codec.http2.Http2Error r6 = io.netty.handler.codec.http2.Http2Error.STREAM_CLOSED
                java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
                java.lang.Object[] r0 = new java.lang.Object[r1]
                r0[r2] = r9
                r0[r3] = r8
                java.lang.String r8 = "Received %s frame for an unknown stream %d"
                io.netty.handler.codec.http2.Http2Exception r6 = io.netty.handler.codec.http2.Http2Exception.streamError(r7, r6, r8, r0)
                throw r6
            L39:
                boolean r4 = r8.isResetSent()
                if (r4 != 0) goto L47
                boolean r7 = r5.streamCreatedAfterGoAwaySent(r7)
                if (r7 == 0) goto L46
                goto L47
            L46:
                return r2
            L47:
                io.netty.util.internal.logging.InternalLogger r7 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$1000()
                boolean r7 = r7.isInfoEnabled()
                if (r7 == 0) goto L8e
                io.netty.util.internal.logging.InternalLogger r7 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$1000()
                io.netty.channel.Channel r6 = r6.channel()
                boolean r8 = r8.isResetSent()
                if (r8 == 0) goto L62
                java.lang.String r8 = "RST_STREAM sent."
                goto L81
            L62:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r4 = "Stream created after GOAWAY sent. Last known stream by peer "
                r8.append(r4)
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r4 = r5.this$0
                io.netty.handler.codec.http2.Http2Connection r4 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$100(r4)
                io.netty.handler.codec.http2.Http2Connection$Endpoint r4 = r4.remote()
                int r4 = r4.lastStreamKnownByPeer()
                r8.append(r4)
                java.lang.String r8 = r8.toString()
            L81:
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r0[r2] = r6
                r0[r3] = r9
                r0[r1] = r8
                java.lang.String r6 = "{} ignoring {} frame for stream {}"
                r7.info(r6, r0)
            L8e:
                return r3
        }

        private boolean streamCreatedAfterGoAwaySent(int r3) {
                r2 = this;
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r0 = r2.this$0
                io.netty.handler.codec.http2.Http2Connection r0 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$100(r0)
                io.netty.handler.codec.http2.Http2Connection$Endpoint r0 = r0.remote()
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r1 = r2.this$0
                io.netty.handler.codec.http2.Http2Connection r1 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$100(r1)
                boolean r1 = r1.goAwaySent()
                if (r1 == 0) goto L24
                boolean r1 = r0.isValidStreamId(r3)
                if (r1 == 0) goto L24
                int r0 = r0.lastStreamKnownByPeer()
                if (r3 <= r0) goto L24
                r3 = 1
                return r3
            L24:
                r3 = 0
                return r3
        }

        private void verifyStreamMayHaveExisted(int r4) throws io.netty.handler.codec.http2.Http2Exception {
                r3 = this;
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r0 = r3.this$0
                io.netty.handler.codec.http2.Http2Connection r0 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$100(r0)
                boolean r0 = r0.streamMayHaveExisted(r4)
                if (r0 == 0) goto Ld
                return
            Ld:
                io.netty.handler.codec.http2.Http2Error r0 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                r1[r2] = r4
                java.lang.String r4 = "Stream %d does not exist"
                io.netty.handler.codec.http2.Http2Exception r4 = io.netty.handler.codec.http2.Http2Exception.connectionError(r0, r4, r1)
                throw r4
        }

        @Override // io.netty.handler.codec.http2.Http2FrameListener
        public int onDataRead(io.netty.channel.ChannelHandlerContext r18, int r19, io.netty.buffer.ByteBuf r20, int r21, boolean r22) throws io.netty.handler.codec.http2.Http2Exception {
                r17 = this;
                r1 = r17
                r4 = r19
                r5 = r20
                r6 = r21
                r7 = r22
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r0 = r1.this$0
                io.netty.handler.codec.http2.Http2Connection r0 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$100(r0)
                io.netty.handler.codec.http2.Http2Stream r8 = r0.stream(r4)
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r0 = r1.this$0
                io.netty.handler.codec.http2.Http2LocalFlowController r9 = r0.flowController()
                int r0 = r5.readableBytes()
                int r10 = r0 + r6
                r2 = 0
                r3 = 1
                java.lang.String r0 = "DATA"
                r11 = r18
                boolean r0 = r1.shouldIgnoreHeadersOrDataFrame(r11, r4, r8, r0)     // Catch: java.lang.Throwable -> Leb io.netty.handler.codec.http2.Http2Exception -> Led
                if (r0 == 0) goto L36
                r9.receiveFlowControlledFrame(r8, r5, r6, r7)
                r9.consumeBytes(r8, r10)
                r1.verifyStreamMayHaveExisted(r4)
                return r10
            L36:
                int[] r0 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$http2$Http2Stream$State
                io.netty.handler.codec.http2.Http2Stream$State r12 = r8.state()
                int r12 = r12.ordinal()
                r0 = r0[r12]
                if (r0 == r3) goto L89
                r12 = 2
                if (r0 == r12) goto L89
                r13 = 3
                java.lang.String r14 = "Stream %d in unexpected state: %s"
                if (r0 == r13) goto L6c
                r13 = 4
                if (r0 == r13) goto L6c
                int r0 = r8.id()
                io.netty.handler.codec.http2.Http2Error r13 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
                int r15 = r8.id()
                java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
                io.netty.handler.codec.http2.Http2Stream$State r16 = r8.state()
                java.lang.Object[] r12 = new java.lang.Object[r12]
                r12[r2] = r15
                r12[r3] = r16
                io.netty.handler.codec.http2.Http2Exception r0 = io.netty.handler.codec.http2.Http2Exception.streamError(r0, r13, r14, r12)
                goto L8a
            L6c:
                int r0 = r8.id()
                io.netty.handler.codec.http2.Http2Error r13 = io.netty.handler.codec.http2.Http2Error.STREAM_CLOSED
                int r15 = r8.id()
                java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
                io.netty.handler.codec.http2.Http2Stream$State r16 = r8.state()
                java.lang.Object[] r12 = new java.lang.Object[r12]
                r12[r2] = r15
                r12[r3] = r16
                io.netty.handler.codec.http2.Http2Exception r0 = io.netty.handler.codec.http2.Http2Exception.streamError(r0, r13, r14, r12)
                goto L8a
            L89:
                r0 = 0
            L8a:
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r2 = r1.this$0
                int r2 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$200(r2, r8)
                r9.receiveFlowControlledFrame(r8, r5, r6, r7)     // Catch: java.lang.Throwable -> Lb9 java.lang.RuntimeException -> Lc2 io.netty.handler.codec.http2.Http2Exception -> Lc4
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r3 = r1.this$0     // Catch: java.lang.Throwable -> Lb9 java.lang.RuntimeException -> Lc2 io.netty.handler.codec.http2.Http2Exception -> Lc4
                int r12 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$200(r3, r8)     // Catch: java.lang.Throwable -> Lb9 java.lang.RuntimeException -> Lc2 io.netty.handler.codec.http2.Http2Exception -> Lc4
                if (r0 != 0) goto Lc1
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r0 = r1.this$0     // Catch: java.lang.Throwable -> Lb9 java.lang.RuntimeException -> Lbb io.netty.handler.codec.http2.Http2Exception -> Lbe
                io.netty.handler.codec.http2.Http2FrameListener r2 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$300(r0)     // Catch: java.lang.Throwable -> Lb9 java.lang.RuntimeException -> Lbb io.netty.handler.codec.http2.Http2Exception -> Lbe
                r3 = r11
                int r0 = r2.onDataRead(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Lb9 java.lang.RuntimeException -> Lbb io.netty.handler.codec.http2.Http2Exception -> Lbe
                r9.consumeBytes(r8, r0)
                if (r7 == 0) goto Lb8
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r2 = r1.this$0
                io.netty.handler.codec.http2.Http2LifecycleManager r2 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$400(r2)
                io.netty.channel.ChannelFuture r3 = r18.newSucceededFuture()
                r2.closeStreamRemote(r8, r3)
            Lb8:
                return r0
            Lb9:
                r0 = move-exception
                goto Ld8
            Lbb:
                r0 = move-exception
                r2 = r12
                goto Lc6
            Lbe:
                r0 = move-exception
                r2 = r12
                goto Lcf
            Lc1:
                throw r0     // Catch: java.lang.Throwable -> Lb9 java.lang.RuntimeException -> Lbb io.netty.handler.codec.http2.Http2Exception -> Lbe
            Lc2:
                r0 = move-exception
                goto Lc6
            Lc4:
                r0 = move-exception
                goto Lcf
            Lc6:
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r3 = r1.this$0     // Catch: java.lang.Throwable -> Lb9
                int r3 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$200(r3, r8)     // Catch: java.lang.Throwable -> Lb9
                int r2 = r2 - r3
                int r10 = r10 - r2
                throw r0     // Catch: java.lang.Throwable -> Lb9
            Lcf:
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r3 = r1.this$0     // Catch: java.lang.Throwable -> Lb9
                int r3 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$200(r3, r8)     // Catch: java.lang.Throwable -> Lb9
                int r2 = r2 - r3
                int r10 = r10 - r2
                throw r0     // Catch: java.lang.Throwable -> Lb9
            Ld8:
                r9.consumeBytes(r8, r10)
                if (r7 == 0) goto Lea
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r2 = r1.this$0
                io.netty.handler.codec.http2.Http2LifecycleManager r2 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$400(r2)
                io.netty.channel.ChannelFuture r3 = r18.newSucceededFuture()
                r2.closeStreamRemote(r8, r3)
            Lea:
                throw r0
            Leb:
                r0 = move-exception
                goto Lef
            Led:
                r0 = move-exception
                goto L100
            Lef:
                io.netty.handler.codec.http2.Http2Error r4 = io.netty.handler.codec.http2.Http2Error.INTERNAL_ERROR
                java.lang.Integer r5 = java.lang.Integer.valueOf(r19)
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r3[r2] = r5
                java.lang.String r2 = "Unhandled error on data stream id %d"
                io.netty.handler.codec.http2.Http2Exception r0 = io.netty.handler.codec.http2.Http2Exception.connectionError(r4, r0, r2, r3)
                throw r0
            L100:
                r9.receiveFlowControlledFrame(r8, r5, r6, r7)
                r9.consumeBytes(r8, r10)
                throw r0
        }

        @Override // io.netty.handler.codec.http2.Http2FrameListener
        public void onGoAwayRead(io.netty.channel.ChannelHandlerContext r7, int r8, long r9, io.netty.buffer.ByteBuf r11) throws io.netty.handler.codec.http2.Http2Exception {
                r6 = this;
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r0 = r6.this$0
                r1 = r7
                r2 = r8
                r3 = r9
                r5 = r11
                r0.onGoAwayRead0(r1, r2, r3, r5)
                return
        }

        @Override // io.netty.handler.codec.http2.Http2FrameListener
        public void onHeadersRead(io.netty.channel.ChannelHandlerContext r11, int r12, io.netty.handler.codec.http2.Http2Headers r13, int r14, short r15, boolean r16, int r17, boolean r18) throws io.netty.handler.codec.http2.Http2Exception {
                r10 = this;
                r8 = r18
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r0 = r10.this$0
                io.netty.handler.codec.http2.Http2Connection r0 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$100(r0)
                io.netty.handler.codec.http2.Http2Stream r0 = r0.stream(r12)
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L35
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r3 = r10.this$0
                io.netty.handler.codec.http2.Http2Connection r3 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$100(r3)
                boolean r3 = r3.streamMayHaveExisted(r12)
                if (r3 != 0) goto L35
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r0 = r10.this$0
                io.netty.handler.codec.http2.Http2Connection r0 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$100(r0)
                io.netty.handler.codec.http2.Http2Connection$Endpoint r0 = r0.remote()
                io.netty.handler.codec.http2.Http2Stream r0 = r0.createStream(r12, r8)
                io.netty.handler.codec.http2.Http2Stream$State r3 = r0.state()
                io.netty.handler.codec.http2.Http2Stream$State r4 = io.netty.handler.codec.http2.Http2Stream.State.HALF_CLOSED_REMOTE
                if (r3 != r4) goto L35
                r3 = 1
            L33:
                r9 = r0
                goto L37
            L35:
                r3 = 0
                goto L33
            L37:
                java.lang.String r0 = "HEADERS"
                boolean r0 = r10.shouldIgnoreHeadersOrDataFrame(r11, r12, r9, r0)
                if (r0 == 0) goto L41
                goto L113
            L41:
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r0 = r10.this$0
                io.netty.handler.codec.http2.Http2Connection r0 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$100(r0)
                boolean r0 = r0.isServer()
                if (r0 != 0) goto L5b
                java.lang.CharSequence r0 = r13.status()
                io.netty.handler.codec.http.HttpStatusClass r0 = io.netty.handler.codec.http.HttpStatusClass.valueOf(r0)
                io.netty.handler.codec.http.HttpStatusClass r4 = io.netty.handler.codec.http.HttpStatusClass.INFORMATIONAL
                if (r0 != r4) goto L5b
                r0 = 1
                goto L5c
            L5b:
                r0 = 0
            L5c:
                r4 = 3
                r5 = 2
                if (r0 != 0) goto L62
                if (r8 != 0) goto L68
            L62:
                boolean r6 = r9.isHeadersReceived()
                if (r6 != 0) goto L114
            L68:
                boolean r6 = r9.isTrailersReceived()
                if (r6 != 0) goto L114
                int[] r6 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$http2$Http2Stream$State
                io.netty.handler.codec.http2.Http2Stream$State r7 = r9.state()
                int r7 = r7.ordinal()
                r6 = r6[r7]
                if (r6 == r1) goto Le2
                if (r6 == r5) goto Le2
                java.lang.String r7 = "Stream %d in unexpected state: %s"
                if (r6 == r4) goto Lc2
                r3 = 4
                if (r6 == r3) goto La5
                r3 = 5
                if (r6 != r3) goto L8c
                r9.open(r8)
                goto Le2
            L8c:
                io.netty.handler.codec.http2.Http2Error r11 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
                int r12 = r9.id()
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                io.netty.handler.codec.http2.Http2Stream$State r13 = r9.state()
                java.lang.Object[] r0 = new java.lang.Object[r5]
                r0[r2] = r12
                r0[r1] = r13
                io.netty.handler.codec.http2.Http2Exception r11 = io.netty.handler.codec.http2.Http2Exception.connectionError(r11, r7, r0)
                throw r11
            La5:
                int r11 = r9.id()
                io.netty.handler.codec.http2.Http2Error r12 = io.netty.handler.codec.http2.Http2Error.STREAM_CLOSED
                int r13 = r9.id()
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
                io.netty.handler.codec.http2.Http2Stream$State r0 = r9.state()
                java.lang.Object[] r3 = new java.lang.Object[r5]
                r3[r2] = r13
                r3[r1] = r0
                io.netty.handler.codec.http2.Http2Exception r11 = io.netty.handler.codec.http2.Http2Exception.streamError(r11, r12, r7, r3)
                throw r11
            Lc2:
                if (r3 == 0) goto Lc5
                goto Le2
            Lc5:
                int r11 = r9.id()
                io.netty.handler.codec.http2.Http2Error r12 = io.netty.handler.codec.http2.Http2Error.STREAM_CLOSED
                int r13 = r9.id()
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
                io.netty.handler.codec.http2.Http2Stream$State r0 = r9.state()
                java.lang.Object[] r3 = new java.lang.Object[r5]
                r3[r2] = r13
                r3[r1] = r0
                io.netty.handler.codec.http2.Http2Exception r11 = io.netty.handler.codec.http2.Http2Exception.streamError(r11, r12, r7, r3)
                throw r11
            Le2:
                r9.headersReceived(r0)
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r0 = r10.this$0
                io.netty.handler.codec.http2.Http2ConnectionEncoder r0 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$500(r0)
                io.netty.handler.codec.http2.Http2RemoteFlowController r0 = r0.flowController()
                r6 = r16
                r0.updateDependencyTree(r12, r14, r15, r6)
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r0 = r10.this$0
                io.netty.handler.codec.http2.Http2FrameListener r0 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$300(r0)
                r1 = r11
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r7 = r17
                r0.onHeadersRead(r1, r2, r3, r4, r5, r6, r7, r8)
                if (r18 == 0) goto L113
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r12 = r10.this$0
                io.netty.handler.codec.http2.Http2LifecycleManager r12 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$400(r12)
                io.netty.channel.ChannelFuture r11 = r11.newSucceededFuture()
                r12.closeStreamRemote(r9, r11)
            L113:
                return
            L114:
                io.netty.handler.codec.http2.Http2Error r13 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
                java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r18)
                io.netty.handler.codec.http2.Http2Stream$State r6 = r9.state()
                java.lang.Object[] r4 = new java.lang.Object[r4]
                r4[r2] = r0
                r4[r1] = r3
                r4[r5] = r6
                java.lang.String r0 = "Stream %d received too many headers EOS: %s state: %s"
                io.netty.handler.codec.http2.Http2Exception r11 = io.netty.handler.codec.http2.Http2Exception.streamError(r12, r13, r0, r4)
                throw r11
        }

        @Override // io.netty.handler.codec.http2.Http2FrameListener
        public void onHeadersRead(io.netty.channel.ChannelHandlerContext r10, int r11, io.netty.handler.codec.http2.Http2Headers r12, int r13, boolean r14) throws io.netty.handler.codec.http2.Http2Exception {
                r9 = this;
                r5 = 16
                r6 = 0
                r4 = 0
                r0 = r9
                r1 = r10
                r2 = r11
                r3 = r12
                r7 = r13
                r8 = r14
                r0.onHeadersRead(r1, r2, r3, r4, r5, r6, r7, r8)
                return
        }

        @Override // io.netty.handler.codec.http2.Http2FrameListener
        public void onPingAckRead(io.netty.channel.ChannelHandlerContext r2, long r3) throws io.netty.handler.codec.http2.Http2Exception {
                r1 = this;
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r0 = r1.this$0
                io.netty.handler.codec.http2.Http2FrameListener r0 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$300(r0)
                r0.onPingAckRead(r2, r3)
                return
        }

        @Override // io.netty.handler.codec.http2.Http2FrameListener
        public void onPingRead(io.netty.channel.ChannelHandlerContext r8, long r9) throws io.netty.handler.codec.http2.Http2Exception {
                r7 = this;
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r0 = r7.this$0
                boolean r0 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$800(r0)
                if (r0 == 0) goto L19
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r0 = r7.this$0
                io.netty.handler.codec.http2.Http2ConnectionEncoder r1 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$500(r0)
                r3 = 1
                io.netty.channel.ChannelPromise r6 = r8.newPromise()
                r2 = r8
                r4 = r9
                r1.writePing(r2, r3, r4, r6)
                goto L1b
            L19:
                r2 = r8
                r4 = r9
            L1b:
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r8 = r7.this$0
                io.netty.handler.codec.http2.Http2FrameListener r8 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$300(r8)
                r8.onPingRead(r2, r4)
                return
        }

        @Override // io.netty.handler.codec.http2.Http2FrameListener
        public void onPriorityRead(io.netty.channel.ChannelHandlerContext r8, int r9, int r10, short r11, boolean r12) throws io.netty.handler.codec.http2.Http2Exception {
                r7 = this;
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r0 = r7.this$0
                io.netty.handler.codec.http2.Http2ConnectionEncoder r0 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$500(r0)
                io.netty.handler.codec.http2.Http2RemoteFlowController r0 = r0.flowController()
                r0.updateDependencyTree(r9, r10, r11, r12)
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r0 = r7.this$0
                io.netty.handler.codec.http2.Http2FrameListener r1 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$300(r0)
                r2 = r8
                r3 = r9
                r4 = r10
                r5 = r11
                r6 = r12
                r1.onPriorityRead(r2, r3, r4, r5, r6)
                return
        }

        @Override // io.netty.handler.codec.http2.Http2FrameListener
        public void onPushPromiseRead(io.netty.channel.ChannelHandlerContext r8, int r9, int r10, io.netty.handler.codec.http2.Http2Headers r11, int r12) throws io.netty.handler.codec.http2.Http2Exception {
                r7 = this;
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r0 = r7.this$0
                io.netty.handler.codec.http2.Http2Connection r0 = r0.connection()
                boolean r0 = r0.isServer()
                r1 = 0
                if (r0 != 0) goto Led
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r0 = r7.this$0
                io.netty.handler.codec.http2.Http2Connection r0 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$100(r0)
                io.netty.handler.codec.http2.Http2Stream r0 = r0.stream(r9)
                java.lang.String r2 = "PUSH_PROMISE"
                boolean r2 = r7.shouldIgnoreHeadersOrDataFrame(r8, r9, r0, r2)
                if (r2 == 0) goto L20
                return
            L20:
                r2 = 1
                if (r0 == 0) goto Ldb
                int[] r3 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$http2$Http2Stream$State
                io.netty.handler.codec.http2.Http2Stream$State r4 = r0.state()
                int r4 = r4.ordinal()
                r3 = r3[r4]
                r4 = 2
                if (r3 == r2) goto L50
                if (r3 != r4) goto L35
                goto L50
            L35:
                io.netty.handler.codec.http2.Http2Error r8 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
                int r9 = r0.id()
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                io.netty.handler.codec.http2.Http2Stream$State r10 = r0.state()
                java.lang.Object[] r11 = new java.lang.Object[r4]
                r11[r1] = r9
                r11[r2] = r10
                java.lang.String r9 = "Stream %d in unexpected state for receiving push promise: %s"
                io.netty.handler.codec.http2.Http2Exception r8 = io.netty.handler.codec.http2.Http2Exception.connectionError(r8, r9, r11)
                throw r8
            L50:
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r3 = r7.this$0
                io.netty.handler.codec.http2.Http2PromisedRequestVerifier r3 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$900(r3)
                boolean r3 = r3.isAuthoritative(r8, r11)
                if (r3 == 0) goto Lc2
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r3 = r7.this$0
                io.netty.handler.codec.http2.Http2PromisedRequestVerifier r3 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$900(r3)
                boolean r3 = r3.isCacheable(r11)
                if (r3 == 0) goto La9
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r3 = r7.this$0
                io.netty.handler.codec.http2.Http2PromisedRequestVerifier r3 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$900(r3)
                boolean r3 = r3.isSafe(r11)
                if (r3 == 0) goto L90
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r1 = r7.this$0
                io.netty.handler.codec.http2.Http2Connection r1 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$100(r1)
                io.netty.handler.codec.http2.Http2Connection$Endpoint r1 = r1.remote()
                r1.reservePushStream(r10, r0)
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r0 = r7.this$0
                io.netty.handler.codec.http2.Http2FrameListener r1 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$300(r0)
                r2 = r8
                r3 = r9
                r4 = r10
                r5 = r11
                r6 = r12
                r1.onPushPromiseRead(r2, r3, r4, r5, r6)
                return
            L90:
                r3 = r9
                r8 = r10
                io.netty.handler.codec.http2.Http2Error r9 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
                java.lang.Integer r10 = java.lang.Integer.valueOf(r3)
                java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
                java.lang.Object[] r12 = new java.lang.Object[r4]
                r12[r1] = r10
                r12[r2] = r11
                java.lang.String r10 = "Promised request on stream %d for promised stream %d is not known to be safe"
                io.netty.handler.codec.http2.Http2Exception r8 = io.netty.handler.codec.http2.Http2Exception.streamError(r8, r9, r10, r12)
                throw r8
            La9:
                r3 = r9
                r8 = r10
                io.netty.handler.codec.http2.Http2Error r9 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
                java.lang.Integer r10 = java.lang.Integer.valueOf(r3)
                java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
                java.lang.Object[] r12 = new java.lang.Object[r4]
                r12[r1] = r10
                r12[r2] = r11
                java.lang.String r10 = "Promised request on stream %d for promised stream %d is not known to be cacheable"
                io.netty.handler.codec.http2.Http2Exception r8 = io.netty.handler.codec.http2.Http2Exception.streamError(r8, r9, r10, r12)
                throw r8
            Lc2:
                r3 = r9
                r8 = r10
                io.netty.handler.codec.http2.Http2Error r9 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
                java.lang.Integer r10 = java.lang.Integer.valueOf(r3)
                java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
                java.lang.Object[] r12 = new java.lang.Object[r4]
                r12[r1] = r10
                r12[r2] = r11
                java.lang.String r10 = "Promised request on stream %d for promised stream %d is not authoritative"
                io.netty.handler.codec.http2.Http2Exception r8 = io.netty.handler.codec.http2.Http2Exception.streamError(r8, r9, r10, r12)
                throw r8
            Ldb:
                r3 = r9
                io.netty.handler.codec.http2.Http2Error r8 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
                java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
                java.lang.Object[] r10 = new java.lang.Object[r2]
                r10[r1] = r9
                java.lang.String r9 = "Stream %d does not exist"
                io.netty.handler.codec.http2.Http2Exception r8 = io.netty.handler.codec.http2.Http2Exception.connectionError(r8, r9, r10)
                throw r8
            Led:
                io.netty.handler.codec.http2.Http2Error r8 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
                java.lang.String r9 = "A client cannot push."
                java.lang.Object[] r10 = new java.lang.Object[r1]
                io.netty.handler.codec.http2.Http2Exception r8 = io.netty.handler.codec.http2.Http2Exception.connectionError(r8, r9, r10)
                throw r8
        }

        @Override // io.netty.handler.codec.http2.Http2FrameListener
        public void onRstStreamRead(io.netty.channel.ChannelHandlerContext r4, int r5, long r6) throws io.netty.handler.codec.http2.Http2Exception {
                r3 = this;
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r0 = r3.this$0
                io.netty.handler.codec.http2.Http2Connection r0 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$100(r0)
                io.netty.handler.codec.http2.Http2Stream r0 = r0.stream(r5)
                if (r0 != 0) goto L10
                r3.verifyStreamMayHaveExisted(r5)
                return
            L10:
                int[] r1 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$http2$Http2Stream$State
                io.netty.handler.codec.http2.Http2Stream$State r2 = r0.state()
                int r2 = r2.ordinal()
                r1 = r1[r2]
                r2 = 4
                if (r1 == r2) goto L4c
                r2 = 6
                if (r1 == r2) goto L39
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r1 = r3.this$0
                io.netty.handler.codec.http2.Http2FrameListener r1 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$300(r1)
                r1.onRstStreamRead(r4, r5, r6)
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r5 = r3.this$0
                io.netty.handler.codec.http2.Http2LifecycleManager r5 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$400(r5)
                io.netty.channel.ChannelFuture r4 = r4.newSucceededFuture()
                r5.closeStream(r0, r4)
                return
            L39:
                io.netty.handler.codec.http2.Http2Error r4 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r6 = 1
                java.lang.Object[] r6 = new java.lang.Object[r6]
                r7 = 0
                r6[r7] = r5
                java.lang.String r5 = "RST_STREAM received for IDLE stream %d"
                io.netty.handler.codec.http2.Http2Exception r4 = io.netty.handler.codec.http2.Http2Exception.connectionError(r4, r5, r6)
                throw r4
            L4c:
                return
        }

        @Override // io.netty.handler.codec.http2.Http2FrameListener
        public void onSettingsAckRead(io.netty.channel.ChannelHandlerContext r2) throws io.netty.handler.codec.http2.Http2Exception {
                r1 = this;
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r0 = r1.this$0
                io.netty.handler.codec.http2.Http2ConnectionEncoder r0 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$500(r0)
                io.netty.handler.codec.http2.Http2Settings r0 = r0.pollSentSettings()
                if (r0 == 0) goto Lf
                r1.applyLocalSettings(r0)
            Lf:
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r0 = r1.this$0
                io.netty.handler.codec.http2.Http2FrameListener r0 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$300(r0)
                r0.onSettingsAckRead(r2)
                return
        }

        @Override // io.netty.handler.codec.http2.Http2FrameListener
        public void onSettingsRead(io.netty.channel.ChannelHandlerContext r3, io.netty.handler.codec.http2.Http2Settings r4) throws io.netty.handler.codec.http2.Http2Exception {
                r2 = this;
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r0 = r2.this$0
                io.netty.handler.codec.http2.Http2SettingsReceivedConsumer r0 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$700(r0)
                if (r0 != 0) goto L1f
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r0 = r2.this$0
                io.netty.handler.codec.http2.Http2ConnectionEncoder r0 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$500(r0)
                io.netty.channel.ChannelPromise r1 = r3.newPromise()
                r0.writeSettingsAck(r3, r1)
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r0 = r2.this$0
                io.netty.handler.codec.http2.Http2ConnectionEncoder r0 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$500(r0)
                r0.remoteSettings(r4)
                goto L28
            L1f:
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r0 = r2.this$0
                io.netty.handler.codec.http2.Http2SettingsReceivedConsumer r0 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$700(r0)
                r0.consumeReceivedSettings(r4)
            L28:
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r0 = r2.this$0
                io.netty.handler.codec.http2.Http2FrameListener r0 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$300(r0)
                r0.onSettingsRead(r3, r4)
                return
        }

        @Override // io.netty.handler.codec.http2.Http2FrameListener
        public void onUnknownFrame(io.netty.channel.ChannelHandlerContext r7, byte r8, int r9, io.netty.handler.codec.http2.Http2Flags r10, io.netty.buffer.ByteBuf r11) throws io.netty.handler.codec.http2.Http2Exception {
                r6 = this;
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r0 = r6.this$0
                r1 = r7
                r2 = r8
                r3 = r9
                r4 = r10
                r5 = r11
                r0.onUnknownFrame0(r1, r2, r3, r4, r5)
                return
        }

        @Override // io.netty.handler.codec.http2.Http2FrameListener
        public void onWindowUpdateRead(io.netty.channel.ChannelHandlerContext r4, int r5, int r6) throws io.netty.handler.codec.http2.Http2Exception {
                r3 = this;
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r0 = r3.this$0
                io.netty.handler.codec.http2.Http2Connection r0 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$100(r0)
                io.netty.handler.codec.http2.Http2Stream r0 = r0.stream(r5)
                if (r0 == 0) goto L32
                io.netty.handler.codec.http2.Http2Stream$State r1 = r0.state()
                io.netty.handler.codec.http2.Http2Stream$State r2 = io.netty.handler.codec.http2.Http2Stream.State.CLOSED
                if (r1 == r2) goto L32
                boolean r1 = r3.streamCreatedAfterGoAwaySent(r5)
                if (r1 == 0) goto L1b
                goto L32
            L1b:
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r1 = r3.this$0
                io.netty.handler.codec.http2.Http2ConnectionEncoder r1 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$500(r1)
                io.netty.handler.codec.http2.Http2RemoteFlowController r1 = r1.flowController()
                r1.incrementWindowSize(r0, r6)
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r0 = r3.this$0
                io.netty.handler.codec.http2.Http2FrameListener r0 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$300(r0)
                r0.onWindowUpdateRead(r4, r5, r6)
                return
            L32:
                r3.verifyStreamMayHaveExisted(r5)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class PrefaceFrameListener implements io.netty.handler.codec.http2.Http2FrameListener {
        final /* synthetic */ io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder this$0;

        private PrefaceFrameListener(io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* synthetic */ PrefaceFrameListener(io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r1, io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private void verifyPrefaceReceived() throws io.netty.handler.codec.http2.Http2Exception {
                r3 = this;
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r0 = r3.this$0
                boolean r0 = r0.prefaceReceived()
                if (r0 == 0) goto L9
                return
            L9:
                io.netty.handler.codec.http2.Http2Error r0 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
                r1 = 0
                java.lang.Object[] r1 = new java.lang.Object[r1]
                java.lang.String r2 = "Received non-SETTINGS as first frame."
                io.netty.handler.codec.http2.Http2Exception r0 = io.netty.handler.codec.http2.Http2Exception.connectionError(r0, r2, r1)
                throw r0
        }

        @Override // io.netty.handler.codec.http2.Http2FrameListener
        public int onDataRead(io.netty.channel.ChannelHandlerContext r8, int r9, io.netty.buffer.ByteBuf r10, int r11, boolean r12) throws io.netty.handler.codec.http2.Http2Exception {
                r7 = this;
                r7.verifyPrefaceReceived()
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r0 = r7.this$0
                io.netty.handler.codec.http2.Http2FrameListener r1 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$1100(r0)
                r2 = r8
                r3 = r9
                r4 = r10
                r5 = r11
                r6 = r12
                int r8 = r1.onDataRead(r2, r3, r4, r5, r6)
                return r8
        }

        @Override // io.netty.handler.codec.http2.Http2FrameListener
        public void onGoAwayRead(io.netty.channel.ChannelHandlerContext r7, int r8, long r9, io.netty.buffer.ByteBuf r11) throws io.netty.handler.codec.http2.Http2Exception {
                r6 = this;
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r0 = r6.this$0
                r1 = r7
                r2 = r8
                r3 = r9
                r5 = r11
                r0.onGoAwayRead0(r1, r2, r3, r5)
                return
        }

        @Override // io.netty.handler.codec.http2.Http2FrameListener
        public void onHeadersRead(io.netty.channel.ChannelHandlerContext r11, int r12, io.netty.handler.codec.http2.Http2Headers r13, int r14, short r15, boolean r16, int r17, boolean r18) throws io.netty.handler.codec.http2.Http2Exception {
                r10 = this;
                r10.verifyPrefaceReceived()
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r0 = r10.this$0
                io.netty.handler.codec.http2.Http2FrameListener r1 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$1100(r0)
                r2 = r11
                r3 = r12
                r4 = r13
                r5 = r14
                r6 = r15
                r7 = r16
                r8 = r17
                r9 = r18
                r1.onHeadersRead(r2, r3, r4, r5, r6, r7, r8, r9)
                return
        }

        @Override // io.netty.handler.codec.http2.Http2FrameListener
        public void onHeadersRead(io.netty.channel.ChannelHandlerContext r8, int r9, io.netty.handler.codec.http2.Http2Headers r10, int r11, boolean r12) throws io.netty.handler.codec.http2.Http2Exception {
                r7 = this;
                r7.verifyPrefaceReceived()
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r0 = r7.this$0
                io.netty.handler.codec.http2.Http2FrameListener r1 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$1100(r0)
                r2 = r8
                r3 = r9
                r4 = r10
                r5 = r11
                r6 = r12
                r1.onHeadersRead(r2, r3, r4, r5, r6)
                return
        }

        @Override // io.netty.handler.codec.http2.Http2FrameListener
        public void onPingAckRead(io.netty.channel.ChannelHandlerContext r2, long r3) throws io.netty.handler.codec.http2.Http2Exception {
                r1 = this;
                r1.verifyPrefaceReceived()
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r0 = r1.this$0
                io.netty.handler.codec.http2.Http2FrameListener r0 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$1100(r0)
                r0.onPingAckRead(r2, r3)
                return
        }

        @Override // io.netty.handler.codec.http2.Http2FrameListener
        public void onPingRead(io.netty.channel.ChannelHandlerContext r2, long r3) throws io.netty.handler.codec.http2.Http2Exception {
                r1 = this;
                r1.verifyPrefaceReceived()
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r0 = r1.this$0
                io.netty.handler.codec.http2.Http2FrameListener r0 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$1100(r0)
                r0.onPingRead(r2, r3)
                return
        }

        @Override // io.netty.handler.codec.http2.Http2FrameListener
        public void onPriorityRead(io.netty.channel.ChannelHandlerContext r8, int r9, int r10, short r11, boolean r12) throws io.netty.handler.codec.http2.Http2Exception {
                r7 = this;
                r7.verifyPrefaceReceived()
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r0 = r7.this$0
                io.netty.handler.codec.http2.Http2FrameListener r1 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$1100(r0)
                r2 = r8
                r3 = r9
                r4 = r10
                r5 = r11
                r6 = r12
                r1.onPriorityRead(r2, r3, r4, r5, r6)
                return
        }

        @Override // io.netty.handler.codec.http2.Http2FrameListener
        public void onPushPromiseRead(io.netty.channel.ChannelHandlerContext r8, int r9, int r10, io.netty.handler.codec.http2.Http2Headers r11, int r12) throws io.netty.handler.codec.http2.Http2Exception {
                r7 = this;
                r7.verifyPrefaceReceived()
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r0 = r7.this$0
                io.netty.handler.codec.http2.Http2FrameListener r1 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$1100(r0)
                r2 = r8
                r3 = r9
                r4 = r10
                r5 = r11
                r6 = r12
                r1.onPushPromiseRead(r2, r3, r4, r5, r6)
                return
        }

        @Override // io.netty.handler.codec.http2.Http2FrameListener
        public void onRstStreamRead(io.netty.channel.ChannelHandlerContext r2, int r3, long r4) throws io.netty.handler.codec.http2.Http2Exception {
                r1 = this;
                r1.verifyPrefaceReceived()
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r0 = r1.this$0
                io.netty.handler.codec.http2.Http2FrameListener r0 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$1100(r0)
                r0.onRstStreamRead(r2, r3, r4)
                return
        }

        @Override // io.netty.handler.codec.http2.Http2FrameListener
        public void onSettingsAckRead(io.netty.channel.ChannelHandlerContext r2) throws io.netty.handler.codec.http2.Http2Exception {
                r1 = this;
                r1.verifyPrefaceReceived()
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r0 = r1.this$0
                io.netty.handler.codec.http2.Http2FrameListener r0 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$1100(r0)
                r0.onSettingsAckRead(r2)
                return
        }

        @Override // io.netty.handler.codec.http2.Http2FrameListener
        public void onSettingsRead(io.netty.channel.ChannelHandlerContext r4, io.netty.handler.codec.http2.Http2Settings r5) throws io.netty.handler.codec.http2.Http2Exception {
                r3 = this;
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r0 = r3.this$0
                boolean r0 = r0.prefaceReceived()
                if (r0 != 0) goto L13
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r0 = r3.this$0
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder$FrameReadListener r1 = new io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder$FrameReadListener
                r2 = 0
                r1.<init>(r0, r2)
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$1102(r0, r1)
            L13:
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r0 = r3.this$0
                io.netty.handler.codec.http2.Http2FrameListener r0 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$1100(r0)
                r0.onSettingsRead(r4, r5)
                return
        }

        @Override // io.netty.handler.codec.http2.Http2FrameListener
        public void onUnknownFrame(io.netty.channel.ChannelHandlerContext r7, byte r8, int r9, io.netty.handler.codec.http2.Http2Flags r10, io.netty.buffer.ByteBuf r11) throws io.netty.handler.codec.http2.Http2Exception {
                r6 = this;
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r0 = r6.this$0
                r1 = r7
                r2 = r8
                r3 = r9
                r4 = r10
                r5 = r11
                r0.onUnknownFrame0(r1, r2, r3, r4, r5)
                return
        }

        @Override // io.netty.handler.codec.http2.Http2FrameListener
        public void onWindowUpdateRead(io.netty.channel.ChannelHandlerContext r2, int r3, int r4) throws io.netty.handler.codec.http2.Http2Exception {
                r1 = this;
                r1.verifyPrefaceReceived()
                io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r0 = r1.this$0
                io.netty.handler.codec.http2.Http2FrameListener r0 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.access$1100(r0)
                r0.onWindowUpdateRead(r2, r3, r4)
                return
        }
    }

    static {
            java.lang.Class<io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder> r0 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.logger = r0
            return
    }

    public DefaultHttp2ConnectionDecoder(io.netty.handler.codec.http2.Http2Connection r2, io.netty.handler.codec.http2.Http2ConnectionEncoder r3, io.netty.handler.codec.http2.Http2FrameReader r4) {
            r1 = this;
            io.netty.handler.codec.http2.Http2PromisedRequestVerifier r0 = io.netty.handler.codec.http2.Http2PromisedRequestVerifier.ALWAYS_VERIFY
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public DefaultHttp2ConnectionDecoder(io.netty.handler.codec.http2.Http2Connection r7, io.netty.handler.codec.http2.Http2ConnectionEncoder r8, io.netty.handler.codec.http2.Http2FrameReader r9, io.netty.handler.codec.http2.Http2PromisedRequestVerifier r10) {
            r6 = this;
            r5 = 1
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public DefaultHttp2ConnectionDecoder(io.netty.handler.codec.http2.Http2Connection r8, io.netty.handler.codec.http2.Http2ConnectionEncoder r9, io.netty.handler.codec.http2.Http2FrameReader r10, io.netty.handler.codec.http2.Http2PromisedRequestVerifier r11, boolean r12) {
            r7 = this;
            r6 = 1
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public DefaultHttp2ConnectionDecoder(io.netty.handler.codec.http2.Http2Connection r3, io.netty.handler.codec.http2.Http2ConnectionEncoder r4, io.netty.handler.codec.http2.Http2FrameReader r5, io.netty.handler.codec.http2.Http2PromisedRequestVerifier r6, boolean r7, boolean r8) {
            r2 = this;
            r2.<init>()
            io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder$PrefaceFrameListener r0 = new io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder$PrefaceFrameListener
            r1 = 0
            r0.<init>(r2, r1)
            r2.internalFrameListener = r0
            r2.autoAckPing = r8
            if (r7 == 0) goto L12
            r2.settingsReceivedConsumer = r1
            goto L1b
        L12:
            boolean r7 = r4 instanceof io.netty.handler.codec.http2.Http2SettingsReceivedConsumer
            if (r7 == 0) goto L6b
            r7 = r4
            io.netty.handler.codec.http2.Http2SettingsReceivedConsumer r7 = (io.netty.handler.codec.http2.Http2SettingsReceivedConsumer) r7
            r2.settingsReceivedConsumer = r7
        L1b:
            java.lang.String r7 = "connection"
            java.lang.Object r7 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r7)
            io.netty.handler.codec.http2.Http2Connection r7 = (io.netty.handler.codec.http2.Http2Connection) r7
            r2.connection = r7
            java.lang.String r7 = "frameReader"
            java.lang.Object r5 = io.netty.util.internal.ObjectUtil.checkNotNull(r5, r7)
            io.netty.handler.codec.http2.Http2FrameReader r5 = (io.netty.handler.codec.http2.Http2FrameReader) r5
            r2.frameReader = r5
            java.lang.String r5 = "encoder"
            java.lang.Object r5 = io.netty.util.internal.ObjectUtil.checkNotNull(r4, r5)
            io.netty.handler.codec.http2.Http2ConnectionEncoder r5 = (io.netty.handler.codec.http2.Http2ConnectionEncoder) r5
            r2.encoder = r5
            java.lang.String r5 = "requestVerifier"
            java.lang.Object r5 = io.netty.util.internal.ObjectUtil.checkNotNull(r6, r5)
            io.netty.handler.codec.http2.Http2PromisedRequestVerifier r5 = (io.netty.handler.codec.http2.Http2PromisedRequestVerifier) r5
            r2.requestVerifier = r5
            io.netty.handler.codec.http2.Http2Connection$Endpoint r5 = r3.local()
            io.netty.handler.codec.http2.Http2FlowController r5 = r5.flowController()
            if (r5 != 0) goto L59
            io.netty.handler.codec.http2.Http2Connection$Endpoint r5 = r3.local()
            io.netty.handler.codec.http2.DefaultHttp2LocalFlowController r6 = new io.netty.handler.codec.http2.DefaultHttp2LocalFlowController
            r6.<init>(r3)
            r5.flowController(r6)
        L59:
            io.netty.handler.codec.http2.Http2Connection$Endpoint r3 = r3.local()
            io.netty.handler.codec.http2.Http2FlowController r3 = r3.flowController()
            io.netty.handler.codec.http2.Http2LocalFlowController r3 = (io.netty.handler.codec.http2.Http2LocalFlowController) r3
            io.netty.handler.codec.http2.Http2FrameWriter r4 = r4.frameWriter()
            r3.frameWriter(r4)
            return
        L6b:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "disabling autoAckSettings requires the encoder to be a "
            r4.append(r5)
            java.lang.Class<io.netty.handler.codec.http2.Http2SettingsReceivedConsumer> r5 = io.netty.handler.codec.http2.Http2SettingsReceivedConsumer.class
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    static /* synthetic */ io.netty.handler.codec.http2.Http2Connection access$100(io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r0) {
            io.netty.handler.codec.http2.Http2Connection r0 = r0.connection
            return r0
    }

    static /* synthetic */ io.netty.util.internal.logging.InternalLogger access$1000() {
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.logger
            return r0
    }

    static /* synthetic */ io.netty.handler.codec.http2.Http2FrameListener access$1100(io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r0) {
            io.netty.handler.codec.http2.Http2FrameListener r0 = r0.internalFrameListener
            return r0
    }

    static /* synthetic */ io.netty.handler.codec.http2.Http2FrameListener access$1102(io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r0, io.netty.handler.codec.http2.Http2FrameListener r1) {
            r0.internalFrameListener = r1
            return r1
    }

    static /* synthetic */ int access$200(io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r0, io.netty.handler.codec.http2.Http2Stream r1) {
            int r0 = r0.unconsumedBytes(r1)
            return r0
    }

    static /* synthetic */ io.netty.handler.codec.http2.Http2FrameListener access$300(io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r0) {
            io.netty.handler.codec.http2.Http2FrameListener r0 = r0.listener
            return r0
    }

    static /* synthetic */ io.netty.handler.codec.http2.Http2LifecycleManager access$400(io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r0) {
            io.netty.handler.codec.http2.Http2LifecycleManager r0 = r0.lifecycleManager
            return r0
    }

    static /* synthetic */ io.netty.handler.codec.http2.Http2ConnectionEncoder access$500(io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r0) {
            io.netty.handler.codec.http2.Http2ConnectionEncoder r0 = r0.encoder
            return r0
    }

    static /* synthetic */ io.netty.handler.codec.http2.Http2FrameReader access$600(io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r0) {
            io.netty.handler.codec.http2.Http2FrameReader r0 = r0.frameReader
            return r0
    }

    static /* synthetic */ io.netty.handler.codec.http2.Http2SettingsReceivedConsumer access$700(io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r0) {
            io.netty.handler.codec.http2.Http2SettingsReceivedConsumer r0 = r0.settingsReceivedConsumer
            return r0
    }

    static /* synthetic */ boolean access$800(io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r0) {
            boolean r0 = r0.autoAckPing
            return r0
    }

    static /* synthetic */ io.netty.handler.codec.http2.Http2PromisedRequestVerifier access$900(io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder r0) {
            io.netty.handler.codec.http2.Http2PromisedRequestVerifier r0 = r0.requestVerifier
            return r0
    }

    private int unconsumedBytes(io.netty.handler.codec.http2.Http2Stream r2) {
            r1 = this;
            io.netty.handler.codec.http2.Http2LocalFlowController r0 = r1.flowController()
            int r2 = r0.unconsumedBytes(r2)
            return r2
    }

    protected long calculateMaxHeaderListSizeGoAway(long r1) {
            r0 = this;
            long r1 = io.netty.handler.codec.http2.Http2CodecUtil.calculateMaxHeaderListSizeGoAway(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http2.Http2ConnectionDecoder, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            io.netty.handler.codec.http2.Http2FrameReader r0 = r1.frameReader
            r0.close()
            return
    }

    @Override // io.netty.handler.codec.http2.Http2ConnectionDecoder
    public io.netty.handler.codec.http2.Http2Connection connection() {
            r1 = this;
            io.netty.handler.codec.http2.Http2Connection r0 = r1.connection
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2ConnectionDecoder
    public void decodeFrame(io.netty.channel.ChannelHandlerContext r2, io.netty.buffer.ByteBuf r3, java.util.List<java.lang.Object> r4) throws io.netty.handler.codec.http2.Http2Exception {
            r1 = this;
            io.netty.handler.codec.http2.Http2FrameReader r4 = r1.frameReader
            io.netty.handler.codec.http2.Http2FrameListener r0 = r1.internalFrameListener
            r4.readFrame(r2, r3, r0)
            return
    }

    @Override // io.netty.handler.codec.http2.Http2ConnectionDecoder
    public final io.netty.handler.codec.http2.Http2LocalFlowController flowController() {
            r1 = this;
            io.netty.handler.codec.http2.Http2Connection r0 = r1.connection
            io.netty.handler.codec.http2.Http2Connection$Endpoint r0 = r0.local()
            io.netty.handler.codec.http2.Http2FlowController r0 = r0.flowController()
            io.netty.handler.codec.http2.Http2LocalFlowController r0 = (io.netty.handler.codec.http2.Http2LocalFlowController) r0
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2ConnectionDecoder
    public io.netty.handler.codec.http2.Http2FrameListener frameListener() {
            r1 = this;
            io.netty.handler.codec.http2.Http2FrameListener r0 = r1.listener
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2ConnectionDecoder
    public void frameListener(io.netty.handler.codec.http2.Http2FrameListener r2) {
            r1 = this;
            java.lang.String r0 = "listener"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.handler.codec.http2.Http2FrameListener r2 = (io.netty.handler.codec.http2.Http2FrameListener) r2
            r1.listener = r2
            return
    }

    io.netty.handler.codec.http2.Http2FrameListener internalFrameListener() {
            r1 = this;
            io.netty.handler.codec.http2.Http2FrameListener r0 = r1.internalFrameListener
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2ConnectionDecoder
    public void lifecycleManager(io.netty.handler.codec.http2.Http2LifecycleManager r2) {
            r1 = this;
            java.lang.String r0 = "lifecycleManager"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.handler.codec.http2.Http2LifecycleManager r2 = (io.netty.handler.codec.http2.Http2LifecycleManager) r2
            r1.lifecycleManager = r2
            return
    }

    @Override // io.netty.handler.codec.http2.Http2ConnectionDecoder
    public io.netty.handler.codec.http2.Http2Settings localSettings() {
            r5 = this;
            io.netty.handler.codec.http2.Http2Settings r0 = new io.netty.handler.codec.http2.Http2Settings
            r0.<init>()
            io.netty.handler.codec.http2.Http2FrameReader r1 = r5.frameReader
            io.netty.handler.codec.http2.Http2FrameReader$Configuration r1 = r1.configuration()
            io.netty.handler.codec.http2.Http2HeadersDecoder$Configuration r2 = r1.headersConfiguration()
            io.netty.handler.codec.http2.Http2FrameSizePolicy r1 = r1.frameSizePolicy()
            io.netty.handler.codec.http2.Http2LocalFlowController r3 = r5.flowController()
            int r3 = r3.initialWindowSize()
            r0.initialWindowSize(r3)
            io.netty.handler.codec.http2.Http2Connection r3 = r5.connection
            io.netty.handler.codec.http2.Http2Connection$Endpoint r3 = r3.remote()
            int r3 = r3.maxActiveStreams()
            long r3 = (long) r3
            r0.maxConcurrentStreams(r3)
            long r3 = r2.maxHeaderTableSize()
            r0.headerTableSize(r3)
            int r1 = r1.maxFrameSize()
            r0.maxFrameSize(r1)
            long r1 = r2.maxHeaderListSize()
            r0.maxHeaderListSize(r1)
            io.netty.handler.codec.http2.Http2Connection r1 = r5.connection
            boolean r1 = r1.isServer()
            if (r1 != 0) goto L56
            io.netty.handler.codec.http2.Http2Connection r1 = r5.connection
            io.netty.handler.codec.http2.Http2Connection$Endpoint r1 = r1.local()
            boolean r1 = r1.allowPushTo()
            r0.pushEnabled(r1)
        L56:
            return r0
    }

    void onGoAwayRead0(io.netty.channel.ChannelHandlerContext r8, int r9, long r10, io.netty.buffer.ByteBuf r12) throws io.netty.handler.codec.http2.Http2Exception {
            r7 = this;
            io.netty.handler.codec.http2.Http2Connection r0 = r7.connection
            r0.goAwayReceived(r9, r10, r12)
            io.netty.handler.codec.http2.Http2FrameListener r1 = r7.listener
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r12
            r1.onGoAwayRead(r2, r3, r4, r6)
            return
    }

    void onUnknownFrame0(io.netty.channel.ChannelHandlerContext r7, byte r8, int r9, io.netty.handler.codec.http2.Http2Flags r10, io.netty.buffer.ByteBuf r11) throws io.netty.handler.codec.http2.Http2Exception {
            r6 = this;
            io.netty.handler.codec.http2.Http2FrameListener r0 = r6.listener
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.onUnknownFrame(r1, r2, r3, r4, r5)
            return
    }

    @Override // io.netty.handler.codec.http2.Http2ConnectionDecoder
    public boolean prefaceReceived() {
            r2 = this;
            io.netty.handler.codec.http2.Http2FrameListener r0 = r2.internalFrameListener
            java.lang.Class r0 = r0.getClass()
            java.lang.Class<io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder$FrameReadListener> r1 = io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.FrameReadListener.class
            if (r1 != r0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }
}
