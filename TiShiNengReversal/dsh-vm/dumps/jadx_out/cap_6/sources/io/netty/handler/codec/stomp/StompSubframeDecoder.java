package io.netty.handler.codec.stomp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class StompSubframeDecoder extends io.netty.handler.codec.ReplayingDecoder<io.netty.handler.codec.stomp.StompSubframeDecoder.State> {
    private static final int DEFAULT_CHUNK_SIZE = 8132;
    private static final int DEFAULT_MAX_LINE_LENGTH = 1024;
    private int alreadyReadChunkSize;
    private long contentLength;
    private io.netty.handler.codec.stomp.LastStompContentSubframe lastContent;
    private final int maxChunkSize;
    private final int maxLineLength;
    private final boolean validateHeaders;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.stomp.StompSubframeDecoder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$stomp$StompSubframeDecoder$State = null;

        static {
                io.netty.handler.codec.stomp.StompSubframeDecoder$State[] r0 = io.netty.handler.codec.stomp.StompSubframeDecoder.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.handler.codec.stomp.StompSubframeDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$stomp$StompSubframeDecoder$State = r0
                io.netty.handler.codec.stomp.StompSubframeDecoder$State r1 = io.netty.handler.codec.stomp.StompSubframeDecoder.State.SKIP_CONTROL_CHARACTERS     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.handler.codec.stomp.StompSubframeDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$stomp$StompSubframeDecoder$State     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.handler.codec.stomp.StompSubframeDecoder$State r1 = io.netty.handler.codec.stomp.StompSubframeDecoder.State.READ_HEADERS     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = io.netty.handler.codec.stomp.StompSubframeDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$stomp$StompSubframeDecoder$State     // Catch: java.lang.NoSuchFieldError -> L28
                io.netty.handler.codec.stomp.StompSubframeDecoder$State r1 = io.netty.handler.codec.stomp.StompSubframeDecoder.State.BAD_FRAME     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = io.netty.handler.codec.stomp.StompSubframeDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$stomp$StompSubframeDecoder$State     // Catch: java.lang.NoSuchFieldError -> L33
                io.netty.handler.codec.stomp.StompSubframeDecoder$State r1 = io.netty.handler.codec.stomp.StompSubframeDecoder.State.READ_CONTENT     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = io.netty.handler.codec.stomp.StompSubframeDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$stomp$StompSubframeDecoder$State     // Catch: java.lang.NoSuchFieldError -> L3e
                io.netty.handler.codec.stomp.StompSubframeDecoder$State r1 = io.netty.handler.codec.stomp.StompSubframeDecoder.State.FINALIZE_FRAME_READ     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    enum State extends java.lang.Enum<io.netty.handler.codec.stomp.StompSubframeDecoder.State> {
        private static final /* synthetic */ io.netty.handler.codec.stomp.StompSubframeDecoder.State[] $VALUES = null;
        public static final io.netty.handler.codec.stomp.StompSubframeDecoder.State BAD_FRAME = null;
        public static final io.netty.handler.codec.stomp.StompSubframeDecoder.State FINALIZE_FRAME_READ = null;
        public static final io.netty.handler.codec.stomp.StompSubframeDecoder.State INVALID_CHUNK = null;
        public static final io.netty.handler.codec.stomp.StompSubframeDecoder.State READ_CONTENT = null;
        public static final io.netty.handler.codec.stomp.StompSubframeDecoder.State READ_HEADERS = null;
        public static final io.netty.handler.codec.stomp.StompSubframeDecoder.State SKIP_CONTROL_CHARACTERS = null;

        static {
                io.netty.handler.codec.stomp.StompSubframeDecoder$State r0 = new io.netty.handler.codec.stomp.StompSubframeDecoder$State
                java.lang.String r1 = "SKIP_CONTROL_CHARACTERS"
                r2 = 0
                r0.<init>(r1, r2)
                io.netty.handler.codec.stomp.StompSubframeDecoder.State.SKIP_CONTROL_CHARACTERS = r0
                io.netty.handler.codec.stomp.StompSubframeDecoder$State r1 = new io.netty.handler.codec.stomp.StompSubframeDecoder$State
                java.lang.String r3 = "READ_HEADERS"
                r4 = 1
                r1.<init>(r3, r4)
                io.netty.handler.codec.stomp.StompSubframeDecoder.State.READ_HEADERS = r1
                io.netty.handler.codec.stomp.StompSubframeDecoder$State r3 = new io.netty.handler.codec.stomp.StompSubframeDecoder$State
                java.lang.String r5 = "READ_CONTENT"
                r6 = 2
                r3.<init>(r5, r6)
                io.netty.handler.codec.stomp.StompSubframeDecoder.State.READ_CONTENT = r3
                io.netty.handler.codec.stomp.StompSubframeDecoder$State r5 = new io.netty.handler.codec.stomp.StompSubframeDecoder$State
                java.lang.String r7 = "FINALIZE_FRAME_READ"
                r8 = 3
                r5.<init>(r7, r8)
                io.netty.handler.codec.stomp.StompSubframeDecoder.State.FINALIZE_FRAME_READ = r5
                io.netty.handler.codec.stomp.StompSubframeDecoder$State r7 = new io.netty.handler.codec.stomp.StompSubframeDecoder$State
                java.lang.String r9 = "BAD_FRAME"
                r10 = 4
                r7.<init>(r9, r10)
                io.netty.handler.codec.stomp.StompSubframeDecoder.State.BAD_FRAME = r7
                io.netty.handler.codec.stomp.StompSubframeDecoder$State r9 = new io.netty.handler.codec.stomp.StompSubframeDecoder$State
                java.lang.String r11 = "INVALID_CHUNK"
                r12 = 5
                r9.<init>(r11, r12)
                io.netty.handler.codec.stomp.StompSubframeDecoder.State.INVALID_CHUNK = r9
                r11 = 6
                io.netty.handler.codec.stomp.StompSubframeDecoder$State[] r11 = new io.netty.handler.codec.stomp.StompSubframeDecoder.State[r11]
                r11[r2] = r0
                r11[r4] = r1
                r11[r6] = r3
                r11[r8] = r5
                r11[r10] = r7
                r11[r12] = r9
                io.netty.handler.codec.stomp.StompSubframeDecoder.State.$VALUES = r11
                return
        }

        State(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.netty.handler.codec.stomp.StompSubframeDecoder.State valueOf(java.lang.String r1) {
                java.lang.Class<io.netty.handler.codec.stomp.StompSubframeDecoder$State> r0 = io.netty.handler.codec.stomp.StompSubframeDecoder.State.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.netty.handler.codec.stomp.StompSubframeDecoder$State r1 = (io.netty.handler.codec.stomp.StompSubframeDecoder.State) r1
                return r1
        }

        public static io.netty.handler.codec.stomp.StompSubframeDecoder.State[] values() {
                io.netty.handler.codec.stomp.StompSubframeDecoder$State[] r0 = io.netty.handler.codec.stomp.StompSubframeDecoder.State.$VALUES
                java.lang.Object r0 = r0.clone()
                io.netty.handler.codec.stomp.StompSubframeDecoder$State[] r0 = (io.netty.handler.codec.stomp.StompSubframeDecoder.State[]) r0
                return r0
        }
    }

    public StompSubframeDecoder() {
            r2 = this;
            r0 = 1024(0x400, float:1.435E-42)
            r1 = 8132(0x1fc4, float:1.1395E-41)
            r2.<init>(r0, r1)
            return
    }

    public StompSubframeDecoder(int r2, int r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public StompSubframeDecoder(int r3, int r4, boolean r5) {
            r2 = this;
            io.netty.handler.codec.stomp.StompSubframeDecoder$State r0 = io.netty.handler.codec.stomp.StompSubframeDecoder.State.SKIP_CONTROL_CHARACTERS
            r2.<init>(r0)
            r0 = -1
            r2.contentLength = r0
            java.lang.String r0 = "maxLineLength"
            io.netty.util.internal.ObjectUtil.checkPositive(r3, r0)
            java.lang.String r0 = "maxChunkSize"
            io.netty.util.internal.ObjectUtil.checkPositive(r4, r0)
            r2.maxChunkSize = r4
            r2.maxLineLength = r3
            r2.validateHeaders = r5
            return
    }

    public StompSubframeDecoder(boolean r3) {
            r2 = this;
            r0 = 1024(0x400, float:1.435E-42)
            r1 = 8132(0x1fc4, float:1.1395E-41)
            r2.<init>(r0, r1, r3)
            return
    }

    private static long getContentLength(io.netty.handler.codec.stomp.StompHeaders r3, long r4) {
            io.netty.util.AsciiString r0 = io.netty.handler.codec.stomp.StompHeaders.CONTENT_LENGTH
            long r3 = r3.getLong(r0, r4)
            r1 = 0
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 < 0) goto Ld
            return r3
        Ld:
            io.netty.handler.codec.DecoderException r3 = new io.netty.handler.codec.DecoderException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r5 = " must be non-negative"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    private void invalidHeader(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            if (r3 == 0) goto L16
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = ":"
            r0.append(r3)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
        L16:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "a header value or name contains a prohibited character ':', "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
    }

    private void invalidLineLength() {
            r3 = this;
            io.netty.handler.codec.TooLongFrameException r0 = new io.netty.handler.codec.TooLongFrameException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "An STOMP line is larger than "
            r1.append(r2)
            int r2 = r3.maxLineLength
            r1.append(r2)
            java.lang.String r2 = " bytes."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private io.netty.handler.codec.stomp.StompCommand readCommand(io.netty.buffer.ByteBuf r3) {
            r2 = this;
            r0 = 16
            java.lang.String r3 = r2.readLine(r3, r0)
            io.netty.handler.codec.stomp.StompCommand r0 = io.netty.handler.codec.stomp.StompCommand.valueOf(r3)     // Catch: java.lang.IllegalArgumentException -> Lb
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 != 0) goto L1a
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r3 = r3.toUpperCase(r1)
            io.netty.handler.codec.stomp.StompCommand r0 = io.netty.handler.codec.stomp.StompCommand.valueOf(r3)     // Catch: java.lang.IllegalArgumentException -> L19
            goto L1a
        L19:
        L1a:
            if (r0 == 0) goto L1d
            return r0
        L1d:
            io.netty.handler.codec.DecoderException r3 = new io.netty.handler.codec.DecoderException
            java.lang.String r0 = "failed to read command from channel"
            r3.<init>(r0)
            throw r3
    }

    private boolean readHeader(io.netty.handler.codec.stomp.StompHeaders r9, io.netty.util.internal.AppendableCharSequence r10, io.netty.buffer.ByteBuf r11) {
            r8 = this;
            r10.reset()
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
        L7:
            byte r4 = r11.readByte()
            r5 = 58
            r6 = 1
            if (r4 != r5) goto L1b
            if (r1 != 0) goto L1b
            java.lang.String r1 = r10.toString()
            r10.reset()
            r3 = 1
            goto L7
        L1b:
            r7 = 13
            if (r4 != r7) goto L20
            goto L7
        L20:
            r7 = 10
            if (r4 != r7) goto L3f
            if (r1 != 0) goto L29
            if (r2 != 0) goto L29
            return r0
        L29:
            if (r3 == 0) goto L33
            java.lang.String r10 = r10.toString()
            r9.add(r1, r10)
            goto L3e
        L33:
            boolean r9 = r8.validateHeaders
            if (r9 == 0) goto L3e
            java.lang.String r9 = r10.toString()
            r8.invalidHeader(r1, r9)
        L3e:
            return r6
        L3f:
            int r6 = r8.maxLineLength
            if (r2 < r6) goto L46
            r8.invalidLineLength()
        L46:
            if (r4 != r5) goto L4b
            if (r1 == 0) goto L4b
            r3 = 0
        L4b:
            int r2 = r2 + 1
            char r4 = (char) r4
            r10.append(r4)
            goto L7
    }

    private io.netty.handler.codec.stomp.StompSubframeDecoder.State readHeaders(io.netty.buffer.ByteBuf r4, io.netty.handler.codec.stomp.StompHeaders r5) {
            r3 = this;
            io.netty.util.internal.AppendableCharSequence r0 = new io.netty.util.internal.AppendableCharSequence
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
        L7:
            boolean r1 = r3.readHeader(r5, r0, r4)
            if (r1 != 0) goto L7
            io.netty.util.AsciiString r4 = io.netty.handler.codec.stomp.StompHeaders.CONTENT_LENGTH
            boolean r4 = r5.contains(r4)
            if (r4 == 0) goto L24
            r0 = 0
            long r4 = getContentLength(r5, r0)
            r3.contentLength = r4
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto L24
            io.netty.handler.codec.stomp.StompSubframeDecoder$State r4 = io.netty.handler.codec.stomp.StompSubframeDecoder.State.FINALIZE_FRAME_READ
            return r4
        L24:
            io.netty.handler.codec.stomp.StompSubframeDecoder$State r4 = io.netty.handler.codec.stomp.StompSubframeDecoder.State.READ_CONTENT
            return r4
    }

    private java.lang.String readLine(io.netty.buffer.ByteBuf r4, int r5) {
            r3 = this;
            io.netty.util.internal.AppendableCharSequence r0 = new io.netty.util.internal.AppendableCharSequence
            r0.<init>(r5)
            r5 = 0
        L6:
            byte r1 = r4.readByte()
            r2 = 13
            if (r1 != r2) goto Lf
            goto L6
        Lf:
            r2 = 10
            if (r1 != r2) goto L18
            java.lang.String r4 = r0.toString()
            return r4
        L18:
            int r2 = r3.maxLineLength
            if (r5 < r2) goto L1f
            r3.invalidLineLength()
        L1f:
            int r5 = r5 + 1
            char r1 = (char) r1
            r0.append(r1)
            goto L6
    }

    private void resetDecoder() {
            r2 = this;
            io.netty.handler.codec.stomp.StompSubframeDecoder$State r0 = io.netty.handler.codec.stomp.StompSubframeDecoder.State.SKIP_CONTROL_CHARACTERS
            r2.checkpoint(r0)
            r0 = -1
            r2.contentLength = r0
            r0 = 0
            r2.alreadyReadChunkSize = r0
            r0 = 0
            r2.lastContent = r0
            return
    }

    private static void skipControlCharacters(io.netty.buffer.ByteBuf r2) {
        L0:
            byte r0 = r2.readByte()
            r1 = 13
            if (r0 == r1) goto L0
            r1 = 10
            if (r0 == r1) goto L0
            int r0 = r2.readerIndex()
            int r0 = r0 + (-1)
            r2.readerIndex(r0)
            return
    }

    private static void skipNullCharacter(io.netty.buffer.ByteBuf r3) {
            byte r3 = r3.readByte()
            if (r3 != 0) goto L7
            return
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unexpected byte in buffer "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " while expecting NULL byte"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @Override // io.netty.handler.codec.ByteToMessageDecoder
    protected void decode(io.netty.channel.ChannelHandlerContext r7, io.netty.buffer.ByteBuf r8, java.util.List<java.lang.Object> r9) throws java.lang.Exception {
            r6 = this;
            int[] r0 = io.netty.handler.codec.stomp.StompSubframeDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$stomp$StompSubframeDecoder$State
            java.lang.Object r1 = r6.state()
            io.netty.handler.codec.stomp.StompSubframeDecoder$State r1 = (io.netty.handler.codec.stomp.StompSubframeDecoder.State) r1
            int r1 = r1.ordinal()
            r1 = r0[r1]
            r2 = 1
            if (r1 == r2) goto L20
            r2 = 2
            if (r1 == r2) goto L28
            r2 = 3
            if (r1 == r2) goto L18
            goto L42
        L18:
            int r7 = r6.actualReadableBytes()
            r8.skipBytes(r7)
            return
        L20:
            skipControlCharacters(r8)
            io.netty.handler.codec.stomp.StompSubframeDecoder$State r1 = io.netty.handler.codec.stomp.StompSubframeDecoder.State.READ_HEADERS
            r6.checkpoint(r1)
        L28:
            io.netty.handler.codec.stomp.StompCommand r1 = io.netty.handler.codec.stomp.StompCommand.UNKNOWN
            r2 = 0
            io.netty.handler.codec.stomp.StompCommand r1 = r6.readCommand(r8)     // Catch: java.lang.Exception -> L11a
            io.netty.handler.codec.stomp.DefaultStompHeadersSubframe r3 = new io.netty.handler.codec.stomp.DefaultStompHeadersSubframe     // Catch: java.lang.Exception -> L11a
            r3.<init>(r1)     // Catch: java.lang.Exception -> L11a
            io.netty.handler.codec.stomp.StompHeaders r2 = r3.headers()     // Catch: java.lang.Exception -> L117
            io.netty.handler.codec.stomp.StompSubframeDecoder$State r2 = r6.readHeaders(r8, r2)     // Catch: java.lang.Exception -> L117
            r6.checkpoint(r2)     // Catch: java.lang.Exception -> L117
            r9.add(r3)     // Catch: java.lang.Exception -> L117
        L42:
            java.lang.Object r1 = r6.state()     // Catch: java.lang.Exception -> L92
            io.netty.handler.codec.stomp.StompSubframeDecoder$State r1 = (io.netty.handler.codec.stomp.StompSubframeDecoder.State) r1     // Catch: java.lang.Exception -> L92
            int r1 = r1.ordinal()     // Catch: java.lang.Exception -> L92
            r0 = r0[r1]     // Catch: java.lang.Exception -> L92
            r1 = 4
            if (r0 == r1) goto L55
            r7 = 5
            if (r0 == r7) goto Le3
            goto L5b
        L55:
            int r0 = r8.readableBytes()     // Catch: java.lang.Exception -> L92
            if (r0 != 0) goto L5c
        L5b:
            return
        L5c:
            int r1 = r6.maxChunkSize     // Catch: java.lang.Exception -> L92
            if (r0 <= r1) goto L61
            r0 = r1
        L61:
            long r1 = r6.contentLength     // Catch: java.lang.Exception -> L92
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L9d
            int r3 = r6.alreadyReadChunkSize     // Catch: java.lang.Exception -> L92
            long r3 = (long) r3     // Catch: java.lang.Exception -> L92
            long r1 = r1 - r3
            int r2 = (int) r1     // Catch: java.lang.Exception -> L92
            if (r0 <= r2) goto L71
            r0 = r2
        L71:
            io.netty.buffer.ByteBufAllocator r7 = r7.alloc()     // Catch: java.lang.Exception -> L92
            io.netty.buffer.ByteBuf r7 = io.netty.buffer.ByteBufUtil.readBytes(r7, r8, r0)     // Catch: java.lang.Exception -> L92
            int r1 = r6.alreadyReadChunkSize     // Catch: java.lang.Exception -> L92
            int r1 = r1 + r0
            r6.alreadyReadChunkSize = r1     // Catch: java.lang.Exception -> L92
            long r0 = (long) r1     // Catch: java.lang.Exception -> L92
            long r2 = r6.contentLength     // Catch: java.lang.Exception -> L92
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L94
            io.netty.handler.codec.stomp.DefaultLastStompContentSubframe r0 = new io.netty.handler.codec.stomp.DefaultLastStompContentSubframe     // Catch: java.lang.Exception -> L92
            r0.<init>(r7)     // Catch: java.lang.Exception -> L92
            r6.lastContent = r0     // Catch: java.lang.Exception -> L92
            io.netty.handler.codec.stomp.StompSubframeDecoder$State r7 = io.netty.handler.codec.stomp.StompSubframeDecoder.State.FINALIZE_FRAME_READ     // Catch: java.lang.Exception -> L92
            r6.checkpoint(r7)     // Catch: java.lang.Exception -> L92
            goto Le3
        L92:
            r7 = move-exception
            goto L100
        L94:
            io.netty.handler.codec.stomp.DefaultStompContentSubframe r8 = new io.netty.handler.codec.stomp.DefaultStompContentSubframe     // Catch: java.lang.Exception -> L92
            r8.<init>(r7)     // Catch: java.lang.Exception -> L92
            r9.add(r8)     // Catch: java.lang.Exception -> L92
            return
        L9d:
            int r0 = r8.readerIndex()     // Catch: java.lang.Exception -> L92
            int r1 = r8.writerIndex()     // Catch: java.lang.Exception -> L92
            r2 = 0
            int r0 = io.netty.buffer.ByteBufUtil.indexOf(r8, r0, r1, r2)     // Catch: java.lang.Exception -> L92
            int r1 = r8.readerIndex()     // Catch: java.lang.Exception -> L92
            if (r0 != r1) goto Lb6
            io.netty.handler.codec.stomp.StompSubframeDecoder$State r7 = io.netty.handler.codec.stomp.StompSubframeDecoder.State.FINALIZE_FRAME_READ     // Catch: java.lang.Exception -> L92
            r6.checkpoint(r7)     // Catch: java.lang.Exception -> L92
            goto Le3
        Lb6:
            if (r0 <= 0) goto Lbf
            int r1 = r8.readerIndex()     // Catch: java.lang.Exception -> L92
            int r1 = r0 - r1
            goto Lc8
        Lbf:
            int r1 = r8.writerIndex()     // Catch: java.lang.Exception -> L92
            int r2 = r8.readerIndex()     // Catch: java.lang.Exception -> L92
            int r1 = r1 - r2
        Lc8:
            io.netty.buffer.ByteBufAllocator r7 = r7.alloc()     // Catch: java.lang.Exception -> L92
            io.netty.buffer.ByteBuf r7 = io.netty.buffer.ByteBufUtil.readBytes(r7, r8, r1)     // Catch: java.lang.Exception -> L92
            int r2 = r6.alreadyReadChunkSize     // Catch: java.lang.Exception -> L92
            int r2 = r2 + r1
            r6.alreadyReadChunkSize = r2     // Catch: java.lang.Exception -> L92
            if (r0 <= 0) goto Lf7
            io.netty.handler.codec.stomp.DefaultLastStompContentSubframe r0 = new io.netty.handler.codec.stomp.DefaultLastStompContentSubframe     // Catch: java.lang.Exception -> L92
            r0.<init>(r7)     // Catch: java.lang.Exception -> L92
            r6.lastContent = r0     // Catch: java.lang.Exception -> L92
            io.netty.handler.codec.stomp.StompSubframeDecoder$State r7 = io.netty.handler.codec.stomp.StompSubframeDecoder.State.FINALIZE_FRAME_READ     // Catch: java.lang.Exception -> L92
            r6.checkpoint(r7)     // Catch: java.lang.Exception -> L92
        Le3:
            skipNullCharacter(r8)     // Catch: java.lang.Exception -> L92
            io.netty.handler.codec.stomp.LastStompContentSubframe r7 = r6.lastContent     // Catch: java.lang.Exception -> L92
            if (r7 != 0) goto Lee
            io.netty.handler.codec.stomp.LastStompContentSubframe r7 = io.netty.handler.codec.stomp.LastStompContentSubframe.EMPTY_LAST_CONTENT     // Catch: java.lang.Exception -> L92
            r6.lastContent = r7     // Catch: java.lang.Exception -> L92
        Lee:
            io.netty.handler.codec.stomp.LastStompContentSubframe r7 = r6.lastContent     // Catch: java.lang.Exception -> L92
            r9.add(r7)     // Catch: java.lang.Exception -> L92
            r6.resetDecoder()     // Catch: java.lang.Exception -> L92
            return
        Lf7:
            io.netty.handler.codec.stomp.DefaultStompContentSubframe r8 = new io.netty.handler.codec.stomp.DefaultStompContentSubframe     // Catch: java.lang.Exception -> L92
            r8.<init>(r7)     // Catch: java.lang.Exception -> L92
            r9.add(r8)     // Catch: java.lang.Exception -> L92
            return
        L100:
            io.netty.handler.codec.stomp.DefaultLastStompContentSubframe r8 = new io.netty.handler.codec.stomp.DefaultLastStompContentSubframe
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            r8.<init>(r0)
            io.netty.handler.codec.DecoderResult r7 = io.netty.handler.codec.DecoderResult.failure(r7)
            r8.setDecoderResult(r7)
            r9.add(r8)
            io.netty.handler.codec.stomp.StompSubframeDecoder$State r7 = io.netty.handler.codec.stomp.StompSubframeDecoder.State.BAD_FRAME
            r6.checkpoint(r7)
            return
        L117:
            r7 = move-exception
            r2 = r3
            goto L11b
        L11a:
            r7 = move-exception
        L11b:
            if (r2 != 0) goto L122
            io.netty.handler.codec.stomp.DefaultStompHeadersSubframe r2 = new io.netty.handler.codec.stomp.DefaultStompHeadersSubframe
            r2.<init>(r1)
        L122:
            io.netty.handler.codec.DecoderResult r7 = io.netty.handler.codec.DecoderResult.failure(r7)
            r2.setDecoderResult(r7)
            r9.add(r2)
            io.netty.handler.codec.stomp.StompSubframeDecoder$State r7 = io.netty.handler.codec.stomp.StompSubframeDecoder.State.BAD_FRAME
            r6.checkpoint(r7)
            return
    }
}
