package io.netty.handler.codec.http.websocketx;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class WebSocket08FrameDecoder extends io.netty.handler.codec.ByteToMessageDecoder implements io.netty.handler.codec.http.websocketx.WebSocketFrameDecoder {
    private static final byte OPCODE_BINARY = 2;
    private static final byte OPCODE_CLOSE = 8;
    private static final byte OPCODE_CONT = 0;
    private static final byte OPCODE_PING = 9;
    private static final byte OPCODE_PONG = 10;
    private static final byte OPCODE_TEXT = 1;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private final io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig config;
    private int fragmentedFramesCount;
    private boolean frameFinalFlag;
    private boolean frameMasked;
    private int frameOpcode;
    private int framePayloadLen1;
    private long framePayloadLength;
    private int frameRsv;
    private byte[] maskingKey;
    private boolean receivedClosingHandshake;
    private io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder.State state;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$http$websocketx$WebSocket08FrameDecoder$State = null;

        static {
                io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder$State[] r0 = io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$http$websocketx$WebSocket08FrameDecoder$State = r0
                io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder$State r1 = io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder.State.READING_FIRST     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$http$websocketx$WebSocket08FrameDecoder$State     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder$State r1 = io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder.State.READING_SECOND     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$http$websocketx$WebSocket08FrameDecoder$State     // Catch: java.lang.NoSuchFieldError -> L28
                io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder$State r1 = io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder.State.READING_SIZE     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$http$websocketx$WebSocket08FrameDecoder$State     // Catch: java.lang.NoSuchFieldError -> L33
                io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder$State r1 = io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder.State.MASKING_KEY     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$http$websocketx$WebSocket08FrameDecoder$State     // Catch: java.lang.NoSuchFieldError -> L3e
                io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder$State r1 = io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder.State.PAYLOAD     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$http$websocketx$WebSocket08FrameDecoder$State     // Catch: java.lang.NoSuchFieldError -> L49
                io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder$State r1 = io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder.State.CORRUPT     // Catch: java.lang.NoSuchFieldError -> L49
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
    enum State extends java.lang.Enum<io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder.State> {
        private static final /* synthetic */ io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder.State[] $VALUES = null;
        public static final io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder.State CORRUPT = null;
        public static final io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder.State MASKING_KEY = null;
        public static final io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder.State PAYLOAD = null;
        public static final io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder.State READING_FIRST = null;
        public static final io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder.State READING_SECOND = null;
        public static final io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder.State READING_SIZE = null;

        static {
                io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder$State r0 = new io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder$State
                java.lang.String r1 = "READING_FIRST"
                r2 = 0
                r0.<init>(r1, r2)
                io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder.State.READING_FIRST = r0
                io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder$State r1 = new io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder$State
                java.lang.String r3 = "READING_SECOND"
                r4 = 1
                r1.<init>(r3, r4)
                io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder.State.READING_SECOND = r1
                io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder$State r3 = new io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder$State
                java.lang.String r5 = "READING_SIZE"
                r6 = 2
                r3.<init>(r5, r6)
                io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder.State.READING_SIZE = r3
                io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder$State r5 = new io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder$State
                java.lang.String r7 = "MASKING_KEY"
                r8 = 3
                r5.<init>(r7, r8)
                io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder.State.MASKING_KEY = r5
                io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder$State r7 = new io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder$State
                java.lang.String r9 = "PAYLOAD"
                r10 = 4
                r7.<init>(r9, r10)
                io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder.State.PAYLOAD = r7
                io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder$State r9 = new io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder$State
                java.lang.String r11 = "CORRUPT"
                r12 = 5
                r9.<init>(r11, r12)
                io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder.State.CORRUPT = r9
                r11 = 6
                io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder$State[] r11 = new io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder.State[r11]
                r11[r2] = r0
                r11[r4] = r1
                r11[r6] = r3
                r11[r8] = r5
                r11[r10] = r7
                r11[r12] = r9
                io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder.State.$VALUES = r11
                return
        }

        State(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder.State valueOf(java.lang.String r1) {
                java.lang.Class<io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder$State> r0 = io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder.State.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder$State r1 = (io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder.State) r1
                return r1
        }

        public static io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder.State[] values() {
                io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder$State[] r0 = io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder.State.$VALUES
                java.lang.Object r0 = r0.clone()
                io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder$State[] r0 = (io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder.State[]) r0
                return r0
        }
    }

    static {
            java.lang.Class<io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder> r0 = io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder.logger = r0
            return
    }

    public WebSocket08FrameDecoder(io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig r2) {
            r1 = this;
            r1.<init>()
            io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder$State r0 = io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder.State.READING_FIRST
            r1.state = r0
            java.lang.String r0 = "decoderConfig"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig r2 = (io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig) r2
            r1.config = r2
            return
    }

    public WebSocket08FrameDecoder(boolean r2, boolean r3, int r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public WebSocket08FrameDecoder(boolean r2, boolean r3, int r4, boolean r5) {
            r1 = this;
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig$Builder r0 = io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig.newBuilder()
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig$Builder r2 = r0.expectMaskedFrames(r2)
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig$Builder r2 = r2.allowExtensions(r3)
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig$Builder r2 = r2.maxFramePayloadLength(r4)
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig$Builder r2 = r2.allowMaskMismatch(r5)
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig r2 = r2.build()
            r1.<init>(r2)
            return
    }

    private void protocolViolation(io.netty.channel.ChannelHandlerContext r3, io.netty.buffer.ByteBuf r4, io.netty.handler.codec.http.websocketx.CorruptedWebSocketFrameException r5) {
            r2 = this;
            io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder$State r0 = io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder.State.CORRUPT
            r2.state = r0
            int r0 = r4.readableBytes()
            if (r0 <= 0) goto Ld
            r4.skipBytes(r0)
        Ld:
            io.netty.channel.Channel r4 = r3.channel()
            boolean r4 = r4.isActive()
            if (r4 == 0) goto L42
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig r4 = r2.config
            boolean r4 = r4.closeOnProtocolViolation()
            if (r4 == 0) goto L42
            boolean r4 = r2.receivedClosingHandshake
            if (r4 != 0) goto L37
            io.netty.handler.codec.http.websocketx.WebSocketCloseStatus r4 = r5.closeStatus()
            java.lang.String r0 = r5.getMessage()
            if (r0 != 0) goto L31
            java.lang.String r0 = r4.reasonText()
        L31:
            io.netty.handler.codec.http.websocketx.CloseWebSocketFrame r1 = new io.netty.handler.codec.http.websocketx.CloseWebSocketFrame
            r1.<init>(r4, r0)
            goto L39
        L37:
            io.netty.buffer.ByteBuf r1 = io.netty.buffer.Unpooled.EMPTY_BUFFER
        L39:
            io.netty.channel.ChannelFuture r3 = r3.writeAndFlush(r1)
            io.netty.channel.ChannelFutureListener r4 = io.netty.channel.ChannelFutureListener.CLOSE
            r3.addListener(r4)
        L42:
            throw r5
    }

    private void protocolViolation(io.netty.channel.ChannelHandlerContext r2, io.netty.buffer.ByteBuf r3, io.netty.handler.codec.http.websocketx.WebSocketCloseStatus r4, java.lang.String r5) {
            r1 = this;
            io.netty.handler.codec.http.websocketx.CorruptedWebSocketFrameException r0 = new io.netty.handler.codec.http.websocketx.CorruptedWebSocketFrameException
            r0.<init>(r4, r5)
            r1.protocolViolation(r2, r3, r0)
            return
    }

    private void protocolViolation(io.netty.channel.ChannelHandlerContext r2, io.netty.buffer.ByteBuf r3, java.lang.String r4) {
            r1 = this;
            io.netty.handler.codec.http.websocketx.WebSocketCloseStatus r0 = io.netty.handler.codec.http.websocketx.WebSocketCloseStatus.PROTOCOL_ERROR
            r1.protocolViolation(r2, r3, r0, r4)
            return
    }

    private static int toFrameLength(long r3) {
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 > 0) goto L9
            int r4 = (int) r3
            return r4
        L9:
            io.netty.handler.codec.TooLongFrameException r0 = new io.netty.handler.codec.TooLongFrameException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Length:"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    private void unmask(io.netty.buffer.ByteBuf r7) {
            r6 = this;
            int r0 = r7.readerIndex()
            int r1 = r7.writerIndex()
            java.nio.ByteOrder r2 = r7.order()
            byte[] r3 = r6.maskingKey
            r4 = 0
            r4 = r3[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 24
            r5 = 1
            r5 = r3[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 16
            r4 = r4 | r5
            r5 = 2
            r5 = r3[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 8
            r4 = r4 | r5
            r5 = 3
            r3 = r3[r5]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r3 = r3 | r4
            java.nio.ByteOrder r4 = java.nio.ByteOrder.LITTLE_ENDIAN
            if (r2 != r4) goto L33
            int r3 = java.lang.Integer.reverseBytes(r3)
        L33:
            int r2 = r0 + 3
            if (r2 >= r1) goto L42
            int r2 = r7.getInt(r0)
            r2 = r2 ^ r3
            r7.setInt(r0, r2)
            int r0 = r0 + 4
            goto L33
        L42:
            if (r0 >= r1) goto L55
            byte r2 = r7.getByte(r0)
            byte[] r3 = r6.maskingKey
            int r4 = r0 % 4
            r3 = r3[r4]
            r2 = r2 ^ r3
            r7.setByte(r0, r2)
            int r0 = r0 + 1
            goto L42
        L55:
            return
    }

    protected void checkCloseFrameBody(io.netty.channel.ChannelHandlerContext r5, io.netty.buffer.ByteBuf r6) {
            r4 = this;
            if (r6 == 0) goto L53
            boolean r0 = r6.isReadable()
            if (r0 != 0) goto L9
            goto L53
        L9:
            int r0 = r6.readableBytes()
            r1 = 1
            if (r0 != r1) goto L17
            io.netty.handler.codec.http.websocketx.WebSocketCloseStatus r0 = io.netty.handler.codec.http.websocketx.WebSocketCloseStatus.INVALID_PAYLOAD_DATA
            java.lang.String r1 = "Invalid close frame body"
            r4.protocolViolation(r5, r6, r0, r1)
        L17:
            int r0 = r6.readerIndex()
            r1 = 0
            r6.readerIndex(r1)
            short r1 = r6.readShort()
            boolean r2 = io.netty.handler.codec.http.websocketx.WebSocketCloseStatus.isValidStatusCode(r1)
            if (r2 != 0) goto L3d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid close frame getStatus code: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r4.protocolViolation(r5, r6, r1)
        L3d:
            boolean r1 = r6.isReadable()
            if (r1 == 0) goto L50
            io.netty.handler.codec.http.websocketx.Utf8Validator r1 = new io.netty.handler.codec.http.websocketx.Utf8Validator     // Catch: io.netty.handler.codec.http.websocketx.CorruptedWebSocketFrameException -> L4c
            r1.<init>()     // Catch: io.netty.handler.codec.http.websocketx.CorruptedWebSocketFrameException -> L4c
            r1.check(r6)     // Catch: io.netty.handler.codec.http.websocketx.CorruptedWebSocketFrameException -> L4c
            goto L50
        L4c:
            r1 = move-exception
            r4.protocolViolation(r5, r6, r1)
        L50:
            r6.readerIndex(r0)
        L53:
            return
    }

    @Override // io.netty.handler.codec.ByteToMessageDecoder
    protected void decode(io.netty.channel.ChannelHandlerContext r19, io.netty.buffer.ByteBuf r20, java.util.List<java.lang.Object> r21) throws java.lang.Exception {
            r18 = this;
            r1 = r18
            r0 = r19
            r2 = r20
            r3 = r21
            boolean r4 = r1.receivedClosingHandshake
            if (r4 == 0) goto L14
            int r0 = r1.actualReadableBytes()
            r2.skipBytes(r0)
            return
        L14:
            int[] r4 = io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$http$websocketx$WebSocket08FrameDecoder$State
            io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder$State r5 = r1.state
            int r5 = r5.ordinal()
            r4 = r4[r5]
            r5 = 10
            r6 = 127(0x7f, float:1.78E-43)
            r7 = 2
            r8 = 4
            r9 = 0
            r10 = 9
            r11 = 8
            r12 = 1
            switch(r4) {
                case 1: goto L3f;
                case 2: goto L78;
                case 3: goto L146;
                case 4: goto L1cd;
                case 5: goto L1e9;
                case 6: goto L35;
                default: goto L2d;
            }
        L2d:
            java.lang.Error r0 = new java.lang.Error
            java.lang.String r2 = "Shouldn't reach here."
            r0.<init>(r2)
            throw r0
        L35:
            boolean r0 = r2.isReadable()
            if (r0 == 0) goto L1f4
            r2.readByte()
            return
        L3f:
            boolean r4 = r2.isReadable()
            if (r4 != 0) goto L47
            goto L1f4
        L47:
            r13 = 0
            r1.framePayloadLength = r13
            byte r4 = r2.readByte()
            r13 = r4 & 128(0x80, float:1.8E-43)
            if (r13 == 0) goto L55
            r13 = 1
            goto L56
        L55:
            r13 = 0
        L56:
            r1.frameFinalFlag = r13
            r13 = r4 & 112(0x70, float:1.57E-43)
            int r13 = r13 >> r8
            r1.frameRsv = r13
            r4 = r4 & 15
            r1.frameOpcode = r4
            io.netty.util.internal.logging.InternalLogger r4 = io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder.logger
            boolean r13 = r4.isDebugEnabled()
            if (r13 == 0) goto L74
            int r13 = r1.frameOpcode
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.String r14 = "Decoding WebSocket Frame opCode={}"
            r4.debug(r14, r13)
        L74:
            io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder$State r4 = io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder.State.READING_SECOND
            r1.state = r4
        L78:
            boolean r4 = r2.isReadable()
            if (r4 != 0) goto L80
            goto L1f4
        L80:
            byte r4 = r2.readByte()
            r13 = r4 & 128(0x80, float:1.8E-43)
            if (r13 == 0) goto L8a
            r13 = 1
            goto L8b
        L8a:
            r13 = 0
        L8b:
            r1.frameMasked = r13
            r4 = r4 & r6
            r1.framePayloadLen1 = r4
            int r4 = r1.frameRsv
            if (r4 == 0) goto Lb3
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig r4 = r1.config
            boolean r4 = r4.allowExtensions()
            if (r4 != 0) goto Lb3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "RSV != 0 and no extension negotiated, RSV:"
            r3.append(r4)
            int r4 = r1.frameRsv
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.protocolViolation(r0, r2, r3)
            return
        Lb3:
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig r4 = r1.config
            boolean r4 = r4.allowMaskMismatch()
            if (r4 != 0) goto Lcb
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig r4 = r1.config
            boolean r4 = r4.expectMaskedFrames()
            boolean r13 = r1.frameMasked
            if (r4 == r13) goto Lcb
            java.lang.String r3 = "received a frame that is not masked as expected"
            r1.protocolViolation(r0, r2, r3)
            return
        Lcb:
            int r4 = r1.frameOpcode
            r13 = 7
            if (r4 <= r13) goto L10d
            boolean r13 = r1.frameFinalFlag
            if (r13 != 0) goto Lda
            java.lang.String r3 = "fragmented control frame"
            r1.protocolViolation(r0, r2, r3)
            return
        Lda:
            int r13 = r1.framePayloadLen1
            r14 = 125(0x7d, float:1.75E-43)
            if (r13 <= r14) goto Le6
            java.lang.String r3 = "control frame with payload length > 125 octets"
            r1.protocolViolation(r0, r2, r3)
            return
        Le6:
            if (r4 == r11) goto L103
            if (r4 == r10) goto L103
            if (r4 == r5) goto L103
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "control frame using reserved opcode "
            r3.append(r4)
            int r4 = r1.frameOpcode
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.protocolViolation(r0, r2, r3)
            return
        L103:
            if (r4 != r11) goto L142
            if (r13 != r12) goto L142
            java.lang.String r3 = "received close control frame with payload len 1"
            r1.protocolViolation(r0, r2, r3)
            return
        L10d:
            if (r4 == 0) goto L12a
            if (r4 == r12) goto L12a
            if (r4 == r7) goto L12a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "data frame using reserved opcode "
            r3.append(r4)
            int r4 = r1.frameOpcode
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.protocolViolation(r0, r2, r3)
            return
        L12a:
            int r13 = r1.fragmentedFramesCount
            if (r13 != 0) goto L136
            if (r4 != 0) goto L136
            java.lang.String r3 = "received continuation data frame outside fragmented message"
            r1.protocolViolation(r0, r2, r3)
            return
        L136:
            if (r13 == 0) goto L142
            if (r4 == 0) goto L142
            if (r4 == r10) goto L142
            java.lang.String r3 = "received non-continuation data frame while inside fragmented message"
            r1.protocolViolation(r0, r2, r3)
            return
        L142:
            io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder$State r4 = io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder.State.READING_SIZE
            r1.state = r4
        L146:
            int r4 = r1.framePayloadLen1
            r13 = 126(0x7e, float:1.77E-43)
            java.lang.String r14 = "invalid data frame length (not using minimal length encoding)"
            if (r4 != r13) goto L167
            int r4 = r2.readableBytes()
            if (r4 >= r7) goto L156
            goto L1f4
        L156:
            int r4 = r2.readUnsignedShort()
            long r12 = (long) r4
            r1.framePayloadLength = r12
            r16 = 126(0x7e, double:6.23E-322)
            int r4 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r4 >= 0) goto L185
            r1.protocolViolation(r0, r2, r14)
            return
        L167:
            if (r4 != r6) goto L182
            int r4 = r2.readableBytes()
            if (r4 >= r11) goto L171
            goto L1f4
        L171:
            long r12 = r2.readLong()
            r1.framePayloadLength = r12
            r16 = 65536(0x10000, double:3.2379E-319)
            int r4 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r4 >= 0) goto L185
            r1.protocolViolation(r0, r2, r14)
            return
        L182:
            long r12 = (long) r4
            r1.framePayloadLength = r12
        L185:
            long r12 = r1.framePayloadLength
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig r4 = r1.config
            int r4 = r4.maxFramePayloadLength()
            r16 = r12
            long r11 = (long) r4
            int r4 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1))
            if (r4 <= 0) goto L1b6
            io.netty.handler.codec.http.websocketx.WebSocketCloseStatus r3 = io.netty.handler.codec.http.websocketx.WebSocketCloseStatus.MESSAGE_TOO_BIG
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Max frame length of "
            r4.append(r5)
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig r5 = r1.config
            int r5 = r5.maxFramePayloadLength()
            r4.append(r5)
            java.lang.String r5 = " has been exceeded."
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r1.protocolViolation(r0, r2, r3, r4)
            return
        L1b6:
            io.netty.util.internal.logging.InternalLogger r4 = io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder.logger
            boolean r11 = r4.isDebugEnabled()
            if (r11 == 0) goto L1c9
            long r11 = r1.framePayloadLength
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            java.lang.String r12 = "Decoding WebSocket Frame length={}"
            r4.debug(r12, r11)
        L1c9:
            io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder$State r4 = io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder.State.MASKING_KEY
            r1.state = r4
        L1cd:
            boolean r4 = r1.frameMasked
            if (r4 == 0) goto L1e5
            int r4 = r2.readableBytes()
            if (r4 >= r8) goto L1d8
            goto L1f4
        L1d8:
            byte[] r4 = r1.maskingKey
            if (r4 != 0) goto L1e0
            byte[] r4 = new byte[r8]
            r1.maskingKey = r4
        L1e0:
            byte[] r4 = r1.maskingKey
            r2.readBytes(r4)
        L1e5:
            io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder$State r4 = io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder.State.PAYLOAD
            r1.state = r4
        L1e9:
            int r4 = r2.readableBytes()
            long r11 = (long) r4
            long r13 = r1.framePayloadLength
            int r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r4 >= 0) goto L1f5
        L1f4:
            return
        L1f5:
            r4 = 0
            io.netty.buffer.ByteBufAllocator r8 = r0.alloc()     // Catch: java.lang.Throwable -> L210
            long r11 = r1.framePayloadLength     // Catch: java.lang.Throwable -> L210
            int r11 = toFrameLength(r11)     // Catch: java.lang.Throwable -> L210
            io.netty.buffer.ByteBuf r4 = io.netty.buffer.ByteBufUtil.readBytes(r8, r2, r11)     // Catch: java.lang.Throwable -> L210
            io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder$State r2 = io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder.State.READING_FIRST     // Catch: java.lang.Throwable -> L210
            r1.state = r2     // Catch: java.lang.Throwable -> L210
            boolean r2 = r1.frameMasked     // Catch: java.lang.Throwable -> L210
            if (r2 == 0) goto L213
            r1.unmask(r4)     // Catch: java.lang.Throwable -> L210
            goto L213
        L210:
            r0 = move-exception
            goto L29a
        L213:
            int r2 = r1.frameOpcode     // Catch: java.lang.Throwable -> L210
            if (r2 != r10) goto L224
            io.netty.handler.codec.http.websocketx.PingWebSocketFrame r0 = new io.netty.handler.codec.http.websocketx.PingWebSocketFrame     // Catch: java.lang.Throwable -> L210
            boolean r2 = r1.frameFinalFlag     // Catch: java.lang.Throwable -> L210
            int r5 = r1.frameRsv     // Catch: java.lang.Throwable -> L210
            r0.<init>(r2, r5, r4)     // Catch: java.lang.Throwable -> L210
            r3.add(r0)     // Catch: java.lang.Throwable -> L210
            return
        L224:
            if (r2 != r5) goto L233
            io.netty.handler.codec.http.websocketx.PongWebSocketFrame r0 = new io.netty.handler.codec.http.websocketx.PongWebSocketFrame     // Catch: java.lang.Throwable -> L210
            boolean r2 = r1.frameFinalFlag     // Catch: java.lang.Throwable -> L210
            int r5 = r1.frameRsv     // Catch: java.lang.Throwable -> L210
            r0.<init>(r2, r5, r4)     // Catch: java.lang.Throwable -> L210
            r3.add(r0)     // Catch: java.lang.Throwable -> L210
            return
        L233:
            r6 = 8
            if (r2 != r6) goto L24a
            r15 = 1
            r1.receivedClosingHandshake = r15     // Catch: java.lang.Throwable -> L210
            r1.checkCloseFrameBody(r0, r4)     // Catch: java.lang.Throwable -> L210
            io.netty.handler.codec.http.websocketx.CloseWebSocketFrame r0 = new io.netty.handler.codec.http.websocketx.CloseWebSocketFrame     // Catch: java.lang.Throwable -> L210
            boolean r2 = r1.frameFinalFlag     // Catch: java.lang.Throwable -> L210
            int r5 = r1.frameRsv     // Catch: java.lang.Throwable -> L210
            r0.<init>(r2, r5, r4)     // Catch: java.lang.Throwable -> L210
            r3.add(r0)     // Catch: java.lang.Throwable -> L210
            return
        L24a:
            boolean r0 = r1.frameFinalFlag     // Catch: java.lang.Throwable -> L210
            if (r0 == 0) goto L254
            if (r2 == r10) goto L252
            r1.fragmentedFramesCount = r9     // Catch: java.lang.Throwable -> L210
        L252:
            r15 = 1
            goto L25a
        L254:
            int r5 = r1.fragmentedFramesCount     // Catch: java.lang.Throwable -> L210
            r15 = 1
            int r5 = r5 + r15
            r1.fragmentedFramesCount = r5     // Catch: java.lang.Throwable -> L210
        L25a:
            if (r2 != r15) goto L267
            io.netty.handler.codec.http.websocketx.TextWebSocketFrame r2 = new io.netty.handler.codec.http.websocketx.TextWebSocketFrame     // Catch: java.lang.Throwable -> L210
            int r5 = r1.frameRsv     // Catch: java.lang.Throwable -> L210
            r2.<init>(r0, r5, r4)     // Catch: java.lang.Throwable -> L210
            r3.add(r2)     // Catch: java.lang.Throwable -> L210
            return
        L267:
            if (r2 != r7) goto L274
            io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame r2 = new io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame     // Catch: java.lang.Throwable -> L210
            int r5 = r1.frameRsv     // Catch: java.lang.Throwable -> L210
            r2.<init>(r0, r5, r4)     // Catch: java.lang.Throwable -> L210
            r3.add(r2)     // Catch: java.lang.Throwable -> L210
            return
        L274:
            if (r2 != 0) goto L281
            io.netty.handler.codec.http.websocketx.ContinuationWebSocketFrame r2 = new io.netty.handler.codec.http.websocketx.ContinuationWebSocketFrame     // Catch: java.lang.Throwable -> L210
            int r5 = r1.frameRsv     // Catch: java.lang.Throwable -> L210
            r2.<init>(r0, r5, r4)     // Catch: java.lang.Throwable -> L210
            r3.add(r2)     // Catch: java.lang.Throwable -> L210
            return
        L281:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException     // Catch: java.lang.Throwable -> L210
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L210
            r2.<init>()     // Catch: java.lang.Throwable -> L210
            java.lang.String r3 = "Cannot decode web socket frame with opcode: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L210
            int r3 = r1.frameOpcode     // Catch: java.lang.Throwable -> L210
            r2.append(r3)     // Catch: java.lang.Throwable -> L210
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L210
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L210
            throw r0     // Catch: java.lang.Throwable -> L210
        L29a:
            if (r4 == 0) goto L29f
            r4.release()
        L29f:
            throw r0
    }
}
