package okhttp3.internal.ws;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nWebSocketReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketReader.kt\nokhttp3/internal/ws/WebSocketReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,310:1\n1#2:311\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class WebSocketReader implements java.io.Closeable {
    private boolean closed;

    @org.jetbrains.annotations.NotNull
    private final okio.Buffer controlFrameBuffer;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.ws.WebSocketReader.FrameCallback frameCallback;
    private long frameLength;
    private final boolean isClient;
    private boolean isControlFrame;
    private boolean isFinalFrame;

    @org.jetbrains.annotations.Nullable
    private final okio.Buffer.UnsafeCursor maskCursor;

    @org.jetbrains.annotations.Nullable
    private final byte[] maskKey;

    @org.jetbrains.annotations.NotNull
    private final okio.Buffer messageFrameBuffer;

    @org.jetbrains.annotations.Nullable
    private okhttp3.internal.ws.MessageInflater messageInflater;
    private final boolean noContextTakeover;
    private int opcode;
    private final boolean perMessageDeflate;
    private boolean readingCompressedMessage;

    @org.jetbrains.annotations.NotNull
    private final okio.BufferedSource source;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface FrameCallback {
        void onReadClose(int r1, @org.jetbrains.annotations.NotNull java.lang.String r2);

        void onReadMessage(@org.jetbrains.annotations.NotNull java.lang.String r1) throws java.io.IOException;

        void onReadMessage(@org.jetbrains.annotations.NotNull okio.ByteString r1) throws java.io.IOException;

        void onReadPing(@org.jetbrains.annotations.NotNull okio.ByteString r1);

        void onReadPong(@org.jetbrains.annotations.NotNull okio.ByteString r1);
    }

    public WebSocketReader(boolean r2, @org.jetbrains.annotations.NotNull okio.BufferedSource r3, @org.jetbrains.annotations.NotNull okhttp3.internal.ws.WebSocketReader.FrameCallback r4, boolean r5, boolean r6) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "frameCallback"
            kotlin.jvm.internal.g0.p(r4, r0)
            r1.<init>()
            r1.isClient = r2
            r1.source = r3
            r1.frameCallback = r4
            r1.perMessageDeflate = r5
            r1.noContextTakeover = r6
            okio.Buffer r3 = new okio.Buffer
            r3.<init>()
            r1.controlFrameBuffer = r3
            okio.Buffer r3 = new okio.Buffer
            r3.<init>()
            r1.messageFrameBuffer = r3
            r3 = 0
            if (r2 == 0) goto L2a
            r4 = r3
            goto L2d
        L2a:
            r4 = 4
            byte[] r4 = new byte[r4]
        L2d:
            r1.maskKey = r4
            if (r2 == 0) goto L32
            goto L37
        L32:
            okio.Buffer$UnsafeCursor r3 = new okio.Buffer$UnsafeCursor
            r3.<init>()
        L37:
            r1.maskCursor = r3
            return
    }

    private final void readControlFrame() throws java.io.IOException {
            r7 = this;
            long r0 = r7.frameLength
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L33
            okio.BufferedSource r4 = r7.source
            okio.Buffer r5 = r7.controlFrameBuffer
            r4.readFully(r5, r0)
            boolean r0 = r7.isClient
            if (r0 != 0) goto L33
            okio.Buffer r0 = r7.controlFrameBuffer
            okio.Buffer$UnsafeCursor r1 = r7.maskCursor
            kotlin.jvm.internal.g0.m(r1)
            r0.readAndWriteUnsafe(r1)
            okio.Buffer$UnsafeCursor r0 = r7.maskCursor
            r0.seek(r2)
            okhttp3.internal.ws.WebSocketProtocol r0 = okhttp3.internal.ws.WebSocketProtocol.INSTANCE
            okio.Buffer$UnsafeCursor r1 = r7.maskCursor
            byte[] r4 = r7.maskKey
            kotlin.jvm.internal.g0.m(r4)
            r0.toggleMask(r1, r4)
            okio.Buffer$UnsafeCursor r0 = r7.maskCursor
            r0.close()
        L33:
            int r0 = r7.opcode
            switch(r0) {
                case 8: goto L6d;
                case 9: goto L61;
                case 10: goto L55;
                default: goto L38;
            }
        L38:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown control opcode: "
            r1.append(r2)
            int r2 = r7.opcode
            java.lang.String r2 = okhttp3.internal._UtilJvmKt.toHexString(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L55:
            okhttp3.internal.ws.WebSocketReader$FrameCallback r0 = r7.frameCallback
            okio.Buffer r1 = r7.controlFrameBuffer
            okio.ByteString r1 = r1.readByteString()
            r0.onReadPong(r1)
            return
        L61:
            okhttp3.internal.ws.WebSocketReader$FrameCallback r0 = r7.frameCallback
            okio.Buffer r1 = r7.controlFrameBuffer
            okio.ByteString r1 = r1.readByteString()
            r0.onReadPing(r1)
            return
        L6d:
            okio.Buffer r0 = r7.controlFrameBuffer
            long r0 = r0.size()
            r4 = 1
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto La5
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L98
            okio.Buffer r0 = r7.controlFrameBuffer
            short r0 = r0.readShort()
            okio.Buffer r1 = r7.controlFrameBuffer
            java.lang.String r1 = r1.readUtf8()
            okhttp3.internal.ws.WebSocketProtocol r2 = okhttp3.internal.ws.WebSocketProtocol.INSTANCE
            java.lang.String r2 = r2.closeCodeExceptionMessage(r0)
            if (r2 != 0) goto L92
            goto L9c
        L92:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            r0.<init>(r2)
            throw r0
        L98:
            r0 = 1005(0x3ed, float:1.408E-42)
            java.lang.String r1 = ""
        L9c:
            okhttp3.internal.ws.WebSocketReader$FrameCallback r2 = r7.frameCallback
            r2.onReadClose(r0, r1)
            r0 = 1
            r7.closed = r0
            return
        La5:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Malformed close payload length of 1."
            r0.<init>(r1)
            throw r0
    }

    private final void readHeader() throws java.io.IOException, java.net.ProtocolException {
            r8 = this;
            boolean r0 = r8.closed
            if (r0 != 0) goto L137
            okio.BufferedSource r0 = r8.source
            okio.Timeout r0 = r0.timeout()
            long r0 = r0.timeoutNanos()
            okio.BufferedSource r2 = r8.source
            okio.Timeout r2 = r2.timeout()
            r2.clearTimeout()
            okio.BufferedSource r2 = r8.source     // Catch: java.lang.Throwable -> L12a
            byte r2 = r2.readByte()     // Catch: java.lang.Throwable -> L12a
            r3 = 255(0xff, float:3.57E-43)
            int r2 = okhttp3.internal._UtilCommonKt.and(r2, r3)     // Catch: java.lang.Throwable -> L12a
            okio.BufferedSource r4 = r8.source
            okio.Timeout r4 = r4.timeout()
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.NANOSECONDS
            r4.timeout(r0, r5)
            r0 = r2 & 15
            r8.opcode = r0
            r1 = r2 & 128(0x80, float:1.8E-43)
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L3a
            r1 = 1
            goto L3b
        L3a:
            r1 = 0
        L3b:
            r8.isFinalFrame = r1
            r6 = r2 & 8
            if (r6 == 0) goto L43
            r6 = 1
            goto L44
        L43:
            r6 = 0
        L44:
            r8.isControlFrame = r6
            if (r6 == 0) goto L53
            if (r1 == 0) goto L4b
            goto L53
        L4b:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Control frames must be final."
            r0.<init>(r1)
            throw r0
        L53:
            r1 = r2 & 64
            if (r1 == 0) goto L59
            r1 = 1
            goto L5a
        L59:
            r1 = 0
        L5a:
            java.lang.String r6 = "Unexpected rsv1 flag"
            if (r0 == r5) goto L6a
            r7 = 2
            if (r0 == r7) goto L6a
            if (r1 != 0) goto L64
            goto L7b
        L64:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            r0.<init>(r6)
            throw r0
        L6a:
            if (r1 == 0) goto L78
            boolean r0 = r8.perMessageDeflate
            if (r0 == 0) goto L72
            r0 = 1
            goto L79
        L72:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            r0.<init>(r6)
            throw r0
        L78:
            r0 = 0
        L79:
            r8.readingCompressedMessage = r0
        L7b:
            r0 = r2 & 32
            if (r0 != 0) goto L122
            r0 = r2 & 16
            if (r0 != 0) goto L11a
            okio.BufferedSource r0 = r8.source
            byte r0 = r0.readByte()
            int r0 = okhttp3.internal._UtilCommonKt.and(r0, r3)
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L92
            r4 = 1
        L92:
            boolean r1 = r8.isClient
            if (r4 != r1) goto La5
            java.net.ProtocolException r0 = new java.net.ProtocolException
            boolean r1 = r8.isClient
            if (r1 == 0) goto L9f
            java.lang.String r1 = "Server-sent frames must not be masked."
            goto La1
        L9f:
            java.lang.String r1 = "Client-sent frames must be masked."
        La1:
            r0.<init>(r1)
            throw r0
        La5:
            r0 = r0 & 127(0x7f, float:1.78E-43)
            long r0 = (long) r0
            r8.frameLength = r0
            r2 = 126(0x7e, double:6.23E-322)
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto Lc1
            okio.BufferedSource r0 = r8.source
            short r0 = r0.readShort()
            r1 = 65535(0xffff, float:9.1834E-41)
            int r0 = okhttp3.internal._UtilCommonKt.and(r0, r1)
            long r0 = (long) r0
            r8.frameLength = r0
            goto Lf8
        Lc1:
            r2 = 127(0x7f, double:6.27E-322)
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto Lf8
            okio.BufferedSource r0 = r8.source
            long r0 = r0.readLong()
            r8.frameLength = r0
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 < 0) goto Ld6
            goto Lf8
        Ld6:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Frame length 0x"
            r1.append(r2)
            long r2 = r8.frameLength
            java.lang.String r2 = okhttp3.internal._UtilJvmKt.toHexString(r2)
            r1.append(r2)
            java.lang.String r2 = " > 0x7FFFFFFFFFFFFFFF"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        Lf8:
            boolean r0 = r8.isControlFrame
            if (r0 == 0) goto L10d
            long r0 = r8.frameLength
            r2 = 125(0x7d, double:6.2E-322)
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 > 0) goto L105
            goto L10d
        L105:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Control frame must be less than 125B."
            r0.<init>(r1)
            throw r0
        L10d:
            if (r4 == 0) goto L119
            okio.BufferedSource r0 = r8.source
            byte[] r1 = r8.maskKey
            kotlin.jvm.internal.g0.m(r1)
            r0.readFully(r1)
        L119:
            return
        L11a:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Unexpected rsv3 flag"
            r0.<init>(r1)
            throw r0
        L122:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Unexpected rsv2 flag"
            r0.<init>(r1)
            throw r0
        L12a:
            r2 = move-exception
            okio.BufferedSource r3 = r8.source
            okio.Timeout r3 = r3.timeout()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.NANOSECONDS
            r3.timeout(r0, r4)
            throw r2
        L137:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "closed"
            r0.<init>(r1)
            throw r0
    }

    private final void readMessage() throws java.io.IOException {
            r5 = this;
        L0:
            boolean r0 = r5.closed
            if (r0 != 0) goto L6a
            long r0 = r5.frameLength
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L40
            okio.BufferedSource r2 = r5.source
            okio.Buffer r3 = r5.messageFrameBuffer
            r2.readFully(r3, r0)
            boolean r0 = r5.isClient
            if (r0 != 0) goto L40
            okio.Buffer r0 = r5.messageFrameBuffer
            okio.Buffer$UnsafeCursor r1 = r5.maskCursor
            kotlin.jvm.internal.g0.m(r1)
            r0.readAndWriteUnsafe(r1)
            okio.Buffer$UnsafeCursor r0 = r5.maskCursor
            okio.Buffer r1 = r5.messageFrameBuffer
            long r1 = r1.size()
            long r3 = r5.frameLength
            long r1 = r1 - r3
            r0.seek(r1)
            okhttp3.internal.ws.WebSocketProtocol r0 = okhttp3.internal.ws.WebSocketProtocol.INSTANCE
            okio.Buffer$UnsafeCursor r1 = r5.maskCursor
            byte[] r2 = r5.maskKey
            kotlin.jvm.internal.g0.m(r2)
            r0.toggleMask(r1, r2)
            okio.Buffer$UnsafeCursor r0 = r5.maskCursor
            r0.close()
        L40:
            boolean r0 = r5.isFinalFrame
            if (r0 != 0) goto L69
            r5.readUntilNonControlFrame()
            int r0 = r5.opcode
            if (r0 != 0) goto L4c
            goto L0
        L4c:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected continuation opcode. Got: "
            r1.append(r2)
            int r2 = r5.opcode
            java.lang.String r2 = okhttp3.internal._UtilJvmKt.toHexString(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L69:
            return
        L6a:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "closed"
            r0.<init>(r1)
            throw r0
    }

    private final void readMessageFrame() throws java.io.IOException {
            r4 = this;
            int r0 = r4.opcode
            r1 = 1
            if (r0 == r1) goto L24
            r2 = 2
            if (r0 != r2) goto L9
            goto L24
        L9:
            java.net.ProtocolException r1 = new java.net.ProtocolException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unknown opcode: "
            r2.append(r3)
            java.lang.String r0 = okhttp3.internal._UtilJvmKt.toHexString(r0)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L24:
            r4.readMessage()
            boolean r2 = r4.readingCompressedMessage
            if (r2 == 0) goto L3d
            okhttp3.internal.ws.MessageInflater r2 = r4.messageInflater
            if (r2 != 0) goto L38
            okhttp3.internal.ws.MessageInflater r2 = new okhttp3.internal.ws.MessageInflater
            boolean r3 = r4.noContextTakeover
            r2.<init>(r3)
            r4.messageInflater = r2
        L38:
            okio.Buffer r3 = r4.messageFrameBuffer
            r2.inflate(r3)
        L3d:
            if (r0 != r1) goto L4b
            okhttp3.internal.ws.WebSocketReader$FrameCallback r0 = r4.frameCallback
            okio.Buffer r1 = r4.messageFrameBuffer
            java.lang.String r1 = r1.readUtf8()
            r0.onReadMessage(r1)
            return
        L4b:
            okhttp3.internal.ws.WebSocketReader$FrameCallback r0 = r4.frameCallback
            okio.Buffer r1 = r4.messageFrameBuffer
            okio.ByteString r1 = r1.readByteString()
            r0.onReadMessage(r1)
            return
    }

    private final void readUntilNonControlFrame() throws java.io.IOException {
            r1 = this;
        L0:
            boolean r0 = r1.closed
            if (r0 != 0) goto L10
            r1.readHeader()
            boolean r0 = r1.isControlFrame
            if (r0 != 0) goto Lc
            goto L10
        Lc:
            r1.readControlFrame()
            goto L0
        L10:
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            okhttp3.internal.ws.MessageInflater r0 = r1.messageInflater
            if (r0 == 0) goto L7
            okhttp3.internal._UtilCommonKt.closeQuietly(r0)
        L7:
            okio.BufferedSource r0 = r1.source
            okhttp3.internal._UtilCommonKt.closeQuietly(r0)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final okio.BufferedSource getSource() {
            r1 = this;
            okio.BufferedSource r0 = r1.source
            return r0
    }

    public final void processNextFrame() throws java.io.IOException {
            r1 = this;
            r1.readHeader()
            boolean r0 = r1.isControlFrame
            if (r0 == 0) goto Lb
            r1.readControlFrame()
            return
        Lb:
            r1.readMessageFrame()
            return
    }
}
