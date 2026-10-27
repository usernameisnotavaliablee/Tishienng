package okhttp3.internal.ws;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nWebSocketWriter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketWriter.kt\nokhttp3/internal/ws/WebSocketWriter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,215:1\n1#2:216\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class WebSocketWriter implements java.io.Closeable {
    private final boolean isClient;

    @org.jetbrains.annotations.Nullable
    private final okio.Buffer.UnsafeCursor maskCursor;

    @org.jetbrains.annotations.Nullable
    private final byte[] maskKey;

    @org.jetbrains.annotations.NotNull
    private final okio.Buffer messageBuffer;

    @org.jetbrains.annotations.Nullable
    private okhttp3.internal.ws.MessageDeflater messageDeflater;
    private final long minimumDeflateSize;
    private final boolean noContextTakeover;
    private final boolean perMessageDeflate;

    @org.jetbrains.annotations.NotNull
    private final java.util.Random random;

    @org.jetbrains.annotations.NotNull
    private final okio.BufferedSink sink;

    @org.jetbrains.annotations.NotNull
    private final okio.Buffer sinkBuffer;
    private boolean writerClosed;

    public WebSocketWriter(boolean r2, @org.jetbrains.annotations.NotNull okio.BufferedSink r3, @org.jetbrains.annotations.NotNull java.util.Random r4, boolean r5, boolean r6, long r7) {
            r1 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "random"
            kotlin.jvm.internal.g0.p(r4, r0)
            r1.<init>()
            r1.isClient = r2
            r1.sink = r3
            r1.random = r4
            r1.perMessageDeflate = r5
            r1.noContextTakeover = r6
            r1.minimumDeflateSize = r7
            okio.Buffer r4 = new okio.Buffer
            r4.<init>()
            r1.messageBuffer = r4
            okio.Buffer r3 = r3.getBuffer()
            r1.sinkBuffer = r3
            r3 = 0
            if (r2 == 0) goto L2d
            r4 = 4
            byte[] r4 = new byte[r4]
            goto L2e
        L2d:
            r4 = r3
        L2e:
            r1.maskKey = r4
            if (r2 == 0) goto L37
            okio.Buffer$UnsafeCursor r3 = new okio.Buffer$UnsafeCursor
            r3.<init>()
        L37:
            r1.maskCursor = r3
            return
    }

    private final void writeControlFrame(int r7, okio.ByteString r8) throws java.io.IOException {
            r6 = this;
            boolean r0 = r6.writerClosed
            if (r0 != 0) goto L75
            int r0 = r8.size()
            long r1 = (long) r0
            r3 = 125(0x7d, double:6.2E-322)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L6d
            r7 = r7 | 128(0x80, float:1.8E-43)
            okio.Buffer r1 = r6.sinkBuffer
            r1.writeByte(r7)
            boolean r7 = r6.isClient
            if (r7 == 0) goto L5d
            r7 = r0 | 128(0x80, float:1.8E-43)
            okio.Buffer r1 = r6.sinkBuffer
            r1.writeByte(r7)
            java.util.Random r7 = r6.random
            byte[] r1 = r6.maskKey
            kotlin.jvm.internal.g0.m(r1)
            r7.nextBytes(r1)
            okio.Buffer r7 = r6.sinkBuffer
            byte[] r1 = r6.maskKey
            r7.write(r1)
            if (r0 <= 0) goto L67
            okio.Buffer r7 = r6.sinkBuffer
            long r0 = r7.size()
            okio.Buffer r7 = r6.sinkBuffer
            r7.write(r8)
            okio.Buffer r7 = r6.sinkBuffer
            okio.Buffer$UnsafeCursor r8 = r6.maskCursor
            kotlin.jvm.internal.g0.m(r8)
            r7.readAndWriteUnsafe(r8)
            okio.Buffer$UnsafeCursor r7 = r6.maskCursor
            r7.seek(r0)
            okhttp3.internal.ws.WebSocketProtocol r7 = okhttp3.internal.ws.WebSocketProtocol.INSTANCE
            okio.Buffer$UnsafeCursor r8 = r6.maskCursor
            byte[] r0 = r6.maskKey
            r7.toggleMask(r8, r0)
            okio.Buffer$UnsafeCursor r7 = r6.maskCursor
            r7.close()
            goto L67
        L5d:
            okio.Buffer r7 = r6.sinkBuffer
            r7.writeByte(r0)
            okio.Buffer r7 = r6.sinkBuffer
            r7.write(r8)
        L67:
            okio.BufferedSink r7 = r6.sink
            r7.flush()
            return
        L6d:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Payload size must be less than or equal to 125"
            r7.<init>(r8)
            throw r7
        L75:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = "closed"
            r7.<init>(r8)
            throw r7
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            okhttp3.internal.ws.MessageDeflater r0 = r1.messageDeflater
            if (r0 == 0) goto L7
            okhttp3.internal._UtilCommonKt.closeQuietly(r0)
        L7:
            okio.BufferedSink r0 = r1.sink
            okhttp3.internal._UtilCommonKt.closeQuietly(r0)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Random getRandom() {
            r1 = this;
            java.util.Random r0 = r1.random
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okio.BufferedSink getSink() {
            r1 = this;
            okio.BufferedSink r0 = r1.sink
            return r0
    }

    public final void writeClose(int r2, @org.jetbrains.annotations.Nullable okio.ByteString r3) throws java.io.IOException {
            r1 = this;
            okio.ByteString r0 = okio.ByteString.EMPTY
            if (r2 != 0) goto L6
            if (r3 == 0) goto L1e
        L6:
            if (r2 == 0) goto Ld
            okhttp3.internal.ws.WebSocketProtocol r0 = okhttp3.internal.ws.WebSocketProtocol.INSTANCE
            r0.validateCloseCode(r2)
        Ld:
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            r0.writeShort(r2)
            if (r3 == 0) goto L1a
            r0.write(r3)
        L1a:
            okio.ByteString r0 = r0.readByteString()
        L1e:
            r2 = 8
            r3 = 1
            r1.writeControlFrame(r2, r0)     // Catch: java.lang.Throwable -> L27
            r1.writerClosed = r3
            return
        L27:
            r2 = move-exception
            r1.writerClosed = r3
            throw r2
    }

    public final void writeMessageFrame(int r6, @org.jetbrains.annotations.NotNull okio.ByteString r7) throws java.io.IOException {
            r5 = this;
            java.lang.String r0 = "data"
            kotlin.jvm.internal.g0.p(r7, r0)
            boolean r0 = r5.writerClosed
            if (r0 != 0) goto Lba
            okio.Buffer r0 = r5.messageBuffer
            r0.write(r7)
            r0 = r6 | 128(0x80, float:1.8E-43)
            boolean r1 = r5.perMessageDeflate
            if (r1 == 0) goto L33
            int r7 = r7.size()
            long r1 = (long) r7
            long r3 = r5.minimumDeflateSize
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 < 0) goto L33
            okhttp3.internal.ws.MessageDeflater r7 = r5.messageDeflater
            if (r7 != 0) goto L2c
            okhttp3.internal.ws.MessageDeflater r7 = new okhttp3.internal.ws.MessageDeflater
            boolean r0 = r5.noContextTakeover
            r7.<init>(r0)
            r5.messageDeflater = r7
        L2c:
            okio.Buffer r0 = r5.messageBuffer
            r7.deflate(r0)
            r0 = r6 | 192(0xc0, float:2.69E-43)
        L33:
            okio.Buffer r6 = r5.messageBuffer
            long r6 = r6.size()
            okio.Buffer r1 = r5.sinkBuffer
            r1.writeByte(r0)
            boolean r0 = r5.isClient
            if (r0 == 0) goto L45
            r0 = 128(0x80, float:1.8E-43)
            goto L46
        L45:
            r0 = 0
        L46:
            r1 = 125(0x7d, double:6.2E-322)
            int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r3 > 0) goto L54
            int r1 = (int) r6
            r0 = r0 | r1
            okio.Buffer r1 = r5.sinkBuffer
            r1.writeByte(r0)
            goto L75
        L54:
            r1 = 65535(0xffff, double:3.23786E-319)
            int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r3 > 0) goto L69
            r0 = r0 | 126(0x7e, float:1.77E-43)
            okio.Buffer r1 = r5.sinkBuffer
            r1.writeByte(r0)
            okio.Buffer r0 = r5.sinkBuffer
            int r1 = (int) r6
            r0.writeShort(r1)
            goto L75
        L69:
            r0 = r0 | 127(0x7f, float:1.78E-43)
            okio.Buffer r1 = r5.sinkBuffer
            r1.writeByte(r0)
            okio.Buffer r0 = r5.sinkBuffer
            r0.writeLong(r6)
        L75:
            boolean r0 = r5.isClient
            if (r0 == 0) goto Lad
            java.util.Random r0 = r5.random
            byte[] r1 = r5.maskKey
            kotlin.jvm.internal.g0.m(r1)
            r0.nextBytes(r1)
            okio.Buffer r0 = r5.sinkBuffer
            byte[] r1 = r5.maskKey
            r0.write(r1)
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 <= 0) goto Lad
            okio.Buffer r2 = r5.messageBuffer
            okio.Buffer$UnsafeCursor r3 = r5.maskCursor
            kotlin.jvm.internal.g0.m(r3)
            r2.readAndWriteUnsafe(r3)
            okio.Buffer$UnsafeCursor r2 = r5.maskCursor
            r2.seek(r0)
            okhttp3.internal.ws.WebSocketProtocol r0 = okhttp3.internal.ws.WebSocketProtocol.INSTANCE
            okio.Buffer$UnsafeCursor r1 = r5.maskCursor
            byte[] r2 = r5.maskKey
            r0.toggleMask(r1, r2)
            okio.Buffer$UnsafeCursor r0 = r5.maskCursor
            r0.close()
        Lad:
            okio.Buffer r0 = r5.sinkBuffer
            okio.Buffer r1 = r5.messageBuffer
            r0.write(r1, r6)
            okio.BufferedSink r6 = r5.sink
            r6.flush()
            return
        Lba:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r7 = "closed"
            r6.<init>(r7)
            throw r6
    }

    public final void writePing(@org.jetbrains.annotations.NotNull okio.ByteString r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "payload"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 9
            r1.writeControlFrame(r0, r2)
            return
    }

    public final void writePong(@org.jetbrains.annotations.NotNull okio.ByteString r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "payload"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 10
            r1.writeControlFrame(r0, r2)
            return
    }
}
