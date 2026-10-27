package okhttp3.internal.ws;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nRealWebSocket.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealWebSocket.kt\nokhttp3/internal/ws/RealWebSocket\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Lockable.kt\nokhttp3/internal/concurrent/LockableKt\n*L\n1#1,703:1\n1#2:704\n55#3,4:705\n*S KotlinDebug\n*F\n+ 1 RealWebSocket.kt\nokhttp3/internal/ws/RealWebSocket\n*L\n499#1:705,4\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class RealWebSocket implements okhttp3.WebSocket, okhttp3.internal.ws.WebSocketReader.FrameCallback, okhttp3.internal.concurrent.Lockable {
    public static final long CANCEL_AFTER_CLOSE_MILLIS = 60000;

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.ws.RealWebSocket.Companion Companion = null;
    public static final long DEFAULT_MINIMUM_DEFLATE_SIZE = 1024;
    private static final long MAX_QUEUE_SIZE = 16777216;

    @org.jetbrains.annotations.NotNull
    private static final java.util.List<okhttp3.Protocol> ONLY_HTTP1 = null;
    private boolean awaitingPong;

    @org.jetbrains.annotations.Nullable
    private okhttp3.Call call;
    private boolean enqueuedClose;

    @org.jetbrains.annotations.Nullable
    private okhttp3.internal.ws.WebSocketExtensions extensions;
    private boolean failed;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String key;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.WebSocketListener listener;

    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayDeque<java.lang.Object> messageAndCloseQueue;
    private long minimumDeflateSize;

    @org.jetbrains.annotations.Nullable
    private java.lang.String name;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.Request originalRequest;
    private final long pingIntervalMillis;

    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayDeque<okio.ByteString> pongQueue;
    private long queueSize;

    @org.jetbrains.annotations.NotNull
    private final java.util.Random random;

    @org.jetbrains.annotations.Nullable
    private okhttp3.internal.ws.WebSocketReader reader;
    private int receivedCloseCode;

    @org.jetbrains.annotations.Nullable
    private java.lang.String receivedCloseReason;
    private int receivedPingCount;
    private int receivedPongCount;
    private int sentPingCount;

    @org.jetbrains.annotations.Nullable
    private okio.Socket socket;

    @org.jetbrains.annotations.NotNull
    private okhttp3.internal.concurrent.TaskQueue taskQueue;
    private final long webSocketCloseTimeout;

    @org.jetbrains.annotations.Nullable
    private okhttp3.internal.ws.WebSocketWriter writer;

    @org.jetbrains.annotations.Nullable
    private okhttp3.internal.concurrent.Task writerTask;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Close {
        private final long cancelAfterCloseMillis;
        private final int code;

        @org.jetbrains.annotations.Nullable
        private final okio.ByteString reason;

        public Close(int r1, @org.jetbrains.annotations.Nullable okio.ByteString r2, long r3) {
                r0 = this;
                r0.<init>()
                r0.code = r1
                r0.reason = r2
                r0.cancelAfterCloseMillis = r3
                return
        }

        public final long getCancelAfterCloseMillis() {
                r2 = this;
                long r0 = r2.cancelAfterCloseMillis
                return r0
        }

        public final int getCode() {
                r1 = this;
                int r0 = r1.code
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final okio.ByteString getReason() {
                r1 = this;
                okio.ByteString r0 = r1.reason
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Message {

        @org.jetbrains.annotations.NotNull
        private final okio.ByteString data;
        private final int formatOpcode;

        public Message(int r2, @org.jetbrains.annotations.NotNull okio.ByteString r3) {
                r1 = this;
                java.lang.String r0 = "data"
                kotlin.jvm.internal.g0.p(r3, r0)
                r1.<init>()
                r1.formatOpcode = r2
                r1.data = r3
                return
        }

        @org.jetbrains.annotations.NotNull
        public final okio.ByteString getData() {
                r1 = this;
                okio.ByteString r0 = r1.data
                return r0
        }

        public final int getFormatOpcode() {
                r1 = this;
                int r0 = r1.formatOpcode
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class WriterTask extends okhttp3.internal.concurrent.Task {
        final /* synthetic */ okhttp3.internal.ws.RealWebSocket this$0;

        public WriterTask(okhttp3.internal.ws.RealWebSocket r4) {
                r3 = this;
                r3.this$0 = r4
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r4 = okhttp3.internal.ws.RealWebSocket.access$getName$p(r4)
                r0.append(r4)
                java.lang.String r4 = " writer"
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r0 = 2
                r1 = 0
                r2 = 0
                r3.<init>(r4, r2, r0, r1)
                return
        }

        public long runOnce() {
                r7 = this;
                okhttp3.internal.ws.RealWebSocket r0 = r7.this$0     // Catch: java.io.IOException -> Lb
                boolean r0 = r0.writeOneFrame$okhttp()     // Catch: java.io.IOException -> Lb
                if (r0 == 0) goto L16
                r0 = 0
                return r0
            Lb:
                r0 = move-exception
                r2 = r0
                okhttp3.internal.ws.RealWebSocket r1 = r7.this$0
                r5 = 2
                r6 = 0
                r3 = 0
                r4 = 1
                okhttp3.internal.ws.RealWebSocket.failWebSocket$default(r1, r2, r3, r4, r5, r6)
            L16:
                r0 = -1
                return r0
        }
    }

    static {
            okhttp3.internal.ws.RealWebSocket$Companion r0 = new okhttp3.internal.ws.RealWebSocket$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.ws.RealWebSocket.Companion = r0
            okhttp3.Protocol r0 = okhttp3.Protocol.HTTP_1_1
            java.util.List r0 = kotlin.collections.f0.l(r0)
            okhttp3.internal.ws.RealWebSocket.ONLY_HTTP1 = r0
            return
    }

    public RealWebSocket(@org.jetbrains.annotations.NotNull okhttp3.internal.concurrent.TaskRunner r2, @org.jetbrains.annotations.NotNull okhttp3.Request r3, @org.jetbrains.annotations.NotNull okhttp3.WebSocketListener r4, @org.jetbrains.annotations.NotNull java.util.Random r5, long r6, @org.jetbrains.annotations.Nullable okhttp3.internal.ws.WebSocketExtensions r8, long r9, long r11) {
            r1 = this;
            java.lang.String r0 = "taskRunner"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "originalRequest"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "listener"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "random"
            kotlin.jvm.internal.g0.p(r5, r0)
            r1.<init>()
            r1.originalRequest = r3
            r1.listener = r4
            r1.random = r5
            r1.pingIntervalMillis = r6
            r1.extensions = r8
            r1.minimumDeflateSize = r9
            r1.webSocketCloseTimeout = r11
            okhttp3.internal.concurrent.TaskQueue r2 = r2.newQueue()
            r1.taskQueue = r2
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            r1.pongQueue = r2
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            r1.messageAndCloseQueue = r2
            r2 = -1
            r1.receivedCloseCode = r2
            java.lang.String r2 = "GET"
            java.lang.String r4 = r3.method()
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r4)
            if (r2 == 0) goto L62
            okio.ByteString$Companion r3 = okio.ByteString.Companion
            r2 = 16
            byte[] r4 = new byte[r2]
            r5.nextBytes(r4)
            kotlin.n1 r2 = kotlin.n1.a
            r7 = 3
            r8 = 0
            r5 = 0
            r6 = 0
            okio.ByteString r2 = okio.ByteString.Companion.of$default(r3, r4, r5, r6, r7, r8)
            java.lang.String r2 = r2.base64()
            r1.key = r2
            return
        L62:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Request must be GET: "
            r2.append(r4)
            java.lang.String r3 = r3.method()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    public static /* synthetic */ kotlin.n1 a(okhttp3.internal.ws.WebSocketWriter r0) {
            kotlin.n1 r0 = finishReader$lambda$0$0(r0)
            return r0
    }

    public static final /* synthetic */ java.util.ArrayDeque access$getMessageAndCloseQueue$p(okhttp3.internal.ws.RealWebSocket r0) {
            java.util.ArrayDeque<java.lang.Object> r0 = r0.messageAndCloseQueue
            return r0
    }

    public static final /* synthetic */ java.lang.String access$getName$p(okhttp3.internal.ws.RealWebSocket r0) {
            java.lang.String r0 = r0.name
            return r0
    }

    public static final /* synthetic */ boolean access$isValid(okhttp3.internal.ws.RealWebSocket r0, okhttp3.internal.ws.WebSocketExtensions r1) {
            boolean r0 = r0.isValid(r1)
            return r0
    }

    public static final /* synthetic */ void access$setExtensions$p(okhttp3.internal.ws.RealWebSocket r0, okhttp3.internal.ws.WebSocketExtensions r1) {
            r0.extensions = r1
            return
    }

    public static /* synthetic */ kotlin.n1 b(okhttp3.internal.ws.RealWebSocket r0) {
            kotlin.n1 r0 = writeOneFrame$lambda$0$0(r0)
            return r0
    }

    public static /* synthetic */ kotlin.n1 c(kotlin.jvm.internal.Ref.ObjectRef r0) {
            kotlin.n1 r0 = failWebSocket$lambda$0$0(r0)
            return r0
    }

    public static /* synthetic */ long d(okhttp3.internal.ws.RealWebSocket r0, long r1) {
            long r0 = initReaderAndWriter$lambda$0$0(r0, r1)
            return r0
    }

    public static /* synthetic */ void failWebSocket$default(okhttp3.internal.ws.RealWebSocket r0, java.lang.Exception r1, okhttp3.Response r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto La
            r3 = 0
        La:
            r0.failWebSocket(r1, r2, r3)
            return
    }

    private static final kotlin.n1 failWebSocket$lambda$0$0(kotlin.jvm.internal.Ref.ObjectRef r0) {
            java.lang.Object r0 = r0.element
            java.io.Closeable r0 = (java.io.Closeable) r0
            okhttp3.internal._UtilCommonKt.closeQuietly(r0)
            kotlin.n1 r0 = kotlin.n1.a
            return r0
    }

    private static final kotlin.n1 finishReader$lambda$0$0(okhttp3.internal.ws.WebSocketWriter r0) {
            okhttp3.internal._UtilCommonKt.closeQuietly(r0)
            kotlin.n1 r0 = kotlin.n1.a
            return r0
    }

    private static final long initReaderAndWriter$lambda$0$0(okhttp3.internal.ws.RealWebSocket r0, long r1) {
            r0.writePingFrame$okhttp()
            return r1
    }

    private final boolean isValid(okhttp3.internal.ws.WebSocketExtensions r3) {
            r2 = this;
            boolean r0 = r3.unknownValues
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            java.lang.Integer r0 = r3.clientMaxWindowBits
            if (r0 == 0) goto Lb
            return r1
        Lb:
            java.lang.Integer r3 = r3.serverMaxWindowBits
            if (r3 == 0) goto L1d
            int r3 = r3.intValue()
            r0 = 8
            if (r0 > r3) goto L1c
            r0 = 16
            if (r3 >= r0) goto L1c
            goto L1d
        L1c:
            return r1
        L1d:
            r3 = 1
            return r3
    }

    private final void runWriter() {
            r8 = this;
            boolean r0 = okhttp3.internal._UtilJvmKt.assertionsEnabled
            if (r0 == 0) goto L32
            boolean r0 = java.lang.Thread.holdsLock(r8)
            if (r0 == 0) goto Lb
            goto L32
        Lb:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Thread "
            r1.append(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = " MUST hold lock on "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L32:
            okhttp3.internal.concurrent.Task r3 = r8.writerTask
            if (r3 == 0) goto L3f
            okhttp3.internal.concurrent.TaskQueue r2 = r8.taskQueue
            r6 = 2
            r7 = 0
            r4 = 0
            okhttp3.internal.concurrent.TaskQueue.schedule$default(r2, r3, r4, r6, r7)
        L3f:
            return
    }

    private final synchronized boolean send(okio.ByteString r7, int r8) {
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.failed     // Catch: java.lang.Throwable -> L22
            r1 = 0
            if (r0 != 0) goto L3e
            boolean r0 = r6.enqueuedClose     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto Lb
            goto L3e
        Lb:
            long r2 = r6.queueSize     // Catch: java.lang.Throwable -> L22
            int r0 = r7.size()     // Catch: java.lang.Throwable -> L22
            long r4 = (long) r0     // Catch: java.lang.Throwable -> L22
            long r2 = r2 + r4
            r4 = 16777216(0x1000000, double:8.289046E-317)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L24
            r7 = 1001(0x3e9, float:1.403E-42)
            r8 = 0
            r6.close(r7, r8)     // Catch: java.lang.Throwable -> L22
            monitor-exit(r6)
            return r1
        L22:
            r7 = move-exception
            goto L40
        L24:
            long r0 = r6.queueSize     // Catch: java.lang.Throwable -> L22
            int r2 = r7.size()     // Catch: java.lang.Throwable -> L22
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L22
            long r0 = r0 + r2
            r6.queueSize = r0     // Catch: java.lang.Throwable -> L22
            java.util.ArrayDeque<java.lang.Object> r0 = r6.messageAndCloseQueue     // Catch: java.lang.Throwable -> L22
            okhttp3.internal.ws.RealWebSocket$Message r1 = new okhttp3.internal.ws.RealWebSocket$Message     // Catch: java.lang.Throwable -> L22
            r1.<init>(r8, r7)     // Catch: java.lang.Throwable -> L22
            r0.add(r1)     // Catch: java.lang.Throwable -> L22
            r6.runWriter()     // Catch: java.lang.Throwable -> L22
            monitor-exit(r6)
            r7 = 1
            return r7
        L3e:
            monitor-exit(r6)
            return r1
        L40:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L22
            throw r7
    }

    private static final kotlin.n1 writeOneFrame$lambda$0$0(okhttp3.internal.ws.RealWebSocket r0) {
            r0.cancel()
            kotlin.n1 r0 = kotlin.n1.a
            return r0
    }

    public void cancel() {
            r1 = this;
            okhttp3.Call r0 = r1.call
            kotlin.jvm.internal.g0.m(r0)
            r0.cancel()
            return
    }

    @org.jetbrains.annotations.NotNull
    public final okio.Socket checkUpgradeSuccess$okhttp(@org.jetbrains.annotations.NotNull okhttp3.Response r8) throws java.io.IOException {
            r7 = this;
            java.lang.String r0 = "response"
            kotlin.jvm.internal.g0.p(r8, r0)
            int r0 = r8.code()
            r1 = 101(0x65, float:1.42E-43)
            r2 = 39
            if (r0 != r1) goto Lbe
            java.lang.String r0 = "Connection"
            r1 = 0
            r3 = 2
            java.lang.String r0 = okhttp3.Response.header$default(r8, r0, r1, r3, r1)
            java.lang.String r4 = "Upgrade"
            r5 = 1
            boolean r6 = kotlin.text.u.a2(r4, r0, r5)
            if (r6 == 0) goto La4
            java.lang.String r0 = okhttp3.Response.header$default(r8, r4, r1, r3, r1)
            java.lang.String r4 = "websocket"
            boolean r4 = kotlin.text.u.a2(r4, r0, r5)
            if (r4 == 0) goto L8a
            java.lang.String r0 = "Sec-WebSocket-Accept"
            java.lang.String r0 = okhttp3.Response.header$default(r8, r0, r1, r3, r1)
            okio.ByteString$Companion r1 = okio.ByteString.Companion
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r7.key
            r3.append(r4)
            java.lang.String r4 = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            okio.ByteString r1 = r1.encodeUtf8(r3)
            okio.ByteString r1 = r1.sha1()
            java.lang.String r1 = r1.base64()
            boolean r3 = kotlin.jvm.internal.g0.g(r1, r0)
            if (r3 == 0) goto L68
            okio.Socket r8 = r8.socket()
            if (r8 == 0) goto L60
            return r8
        L60:
            java.net.ProtocolException r8 = new java.net.ProtocolException
            java.lang.String r0 = "Web Socket socket missing: bad interceptor?"
            r8.<init>(r0)
            throw r8
        L68:
            java.net.ProtocolException r8 = new java.net.ProtocolException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Expected 'Sec-WebSocket-Accept' header value '"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = "' but was '"
            r3.append(r1)
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            r8.<init>(r0)
            throw r8
        L8a:
            java.net.ProtocolException r8 = new java.net.ProtocolException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Expected 'Upgrade' header value 'websocket' but was '"
            r1.append(r3)
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            r8.<init>(r0)
            throw r8
        La4:
            java.net.ProtocolException r8 = new java.net.ProtocolException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Expected 'Connection' header value 'Upgrade' but was '"
            r1.append(r3)
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            r8.<init>(r0)
            throw r8
        Lbe:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Expected HTTP 101 response but was '"
            r1.append(r3)
            int r3 = r8.code()
            r1.append(r3)
            r3 = 32
            r1.append(r3)
            java.lang.String r8 = r8.message()
            r1.append(r8)
            r1.append(r2)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
    }

    public boolean close(int r3, @org.jetbrains.annotations.Nullable java.lang.String r4) {
            r2 = this;
            long r0 = r2.webSocketCloseTimeout
            boolean r3 = r2.close(r3, r4, r0)
            return r3
    }

    public final synchronized boolean close(int r7, @org.jetbrains.annotations.Nullable java.lang.String r8, long r9) {
            r6 = this;
            monitor-enter(r6)
            okhttp3.internal.ws.WebSocketProtocol r0 = okhttp3.internal.ws.WebSocketProtocol.INSTANCE     // Catch: java.lang.Throwable -> L35
            r0.validateCloseCode(r7)     // Catch: java.lang.Throwable -> L35
            if (r8 == 0) goto L37
            okio.ByteString$Companion r0 = okio.ByteString.Companion     // Catch: java.lang.Throwable -> L35
            okio.ByteString r0 = r0.encodeUtf8(r8)     // Catch: java.lang.Throwable -> L35
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L35
            long r1 = (long) r1     // Catch: java.lang.Throwable -> L35
            r3 = 123(0x7b, double:6.1E-322)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L1a
            goto L38
        L1a:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r7.<init>()     // Catch: java.lang.Throwable -> L35
            java.lang.String r9 = "reason.size() > 123: "
            r7.append(r9)     // Catch: java.lang.Throwable -> L35
            r7.append(r8)     // Catch: java.lang.Throwable -> L35
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L35
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L35
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L35
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L35
            throw r8     // Catch: java.lang.Throwable -> L35
        L35:
            r7 = move-exception
            goto L56
        L37:
            r0 = 0
        L38:
            boolean r8 = r6.failed     // Catch: java.lang.Throwable -> L35
            if (r8 != 0) goto L53
            boolean r8 = r6.enqueuedClose     // Catch: java.lang.Throwable -> L35
            if (r8 == 0) goto L41
            goto L53
        L41:
            r8 = 1
            r6.enqueuedClose = r8     // Catch: java.lang.Throwable -> L35
            java.util.ArrayDeque<java.lang.Object> r1 = r6.messageAndCloseQueue     // Catch: java.lang.Throwable -> L35
            okhttp3.internal.ws.RealWebSocket$Close r2 = new okhttp3.internal.ws.RealWebSocket$Close     // Catch: java.lang.Throwable -> L35
            r2.<init>(r7, r0, r9)     // Catch: java.lang.Throwable -> L35
            r1.add(r2)     // Catch: java.lang.Throwable -> L35
            r6.runWriter()     // Catch: java.lang.Throwable -> L35
            monitor-exit(r6)
            return r8
        L53:
            monitor-exit(r6)
            r7 = 0
            return r7
        L56:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L35
            throw r7
    }

    public final void connect(@org.jetbrains.annotations.NotNull okhttp3.OkHttpClient r9) {
            r8 = this;
            java.lang.String r0 = "client"
            kotlin.jvm.internal.g0.p(r9, r0)
            okhttp3.Request r0 = r8.originalRequest
            java.lang.String r1 = "Sec-WebSocket-Extensions"
            java.lang.String r0 = r0.header(r1)
            if (r0 == 0) goto L1f
            java.net.ProtocolException r3 = new java.net.ProtocolException
            java.lang.String r9 = "Request header not permitted: 'Sec-WebSocket-Extensions'"
            r3.<init>(r9)
            r6 = 6
            r7 = 0
            r4 = 0
            r5 = 0
            r2 = r8
            failWebSocket$default(r2, r3, r4, r5, r6, r7)
            return
        L1f:
            r2 = r8
            okhttp3.OkHttpClient$Builder r9 = r9.newBuilder()
            okhttp3.EventListener r0 = okhttp3.EventListener.NONE
            okhttp3.OkHttpClient$Builder r9 = r9.eventListener(r0)
            java.util.List<okhttp3.Protocol> r0 = okhttp3.internal.ws.RealWebSocket.ONLY_HTTP1
            okhttp3.OkHttpClient$Builder r9 = r9.protocols(r0)
            okhttp3.OkHttpClient r9 = r9.build()
            okhttp3.Request r0 = r2.originalRequest
            okhttp3.Request$Builder r0 = r0.newBuilder()
            java.lang.String r3 = "websocket"
            java.lang.String r4 = "Upgrade"
            okhttp3.Request$Builder r0 = r0.header(r4, r3)
            java.lang.String r3 = "Connection"
            okhttp3.Request$Builder r0 = r0.header(r3, r4)
            java.lang.String r3 = "Sec-WebSocket-Key"
            java.lang.String r4 = r2.key
            okhttp3.Request$Builder r0 = r0.header(r3, r4)
            java.lang.String r3 = "Sec-WebSocket-Version"
            java.lang.String r4 = "13"
            okhttp3.Request$Builder r0 = r0.header(r3, r4)
            java.lang.String r3 = "permessage-deflate"
            okhttp3.Request$Builder r0 = r0.header(r1, r3)
            okhttp3.Request r0 = r0.build()
            okhttp3.internal.connection.RealCall r1 = new okhttp3.internal.connection.RealCall
            r3 = 1
            r1.<init>(r9, r0, r3)
            r2.call = r1
            kotlin.jvm.internal.g0.m(r1)
            okhttp3.internal.ws.RealWebSocket$connect$1 r9 = new okhttp3.internal.ws.RealWebSocket$connect$1
            r9.<init>(r8, r0)
            r1.enqueue(r9)
            return
    }

    public final void failWebSocket(@org.jetbrains.annotations.NotNull java.lang.Exception r13, @org.jetbrains.annotations.Nullable okhttp3.Response r14, boolean r15) {
            r12 = this;
            java.lang.String r0 = "e"
            kotlin.jvm.internal.g0.p(r13, r0)
            kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
            r1.<init>()
            monitor-enter(r12)
            boolean r0 = r12.failed     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L11
            monitor-exit(r12)
            return
        L11:
            r0 = 1
            r12.failed = r0     // Catch: java.lang.Throwable -> L44
            okio.Socket r2 = r12.socket     // Catch: java.lang.Throwable -> L44
            okhttp3.internal.ws.WebSocketWriter r0 = r12.writer     // Catch: java.lang.Throwable -> L44
            r1.element = r0     // Catch: java.lang.Throwable -> L44
            r3 = 0
            r12.writer = r3     // Catch: java.lang.Throwable -> L44
            if (r15 != 0) goto L47
            if (r0 == 0) goto L47
            okhttp3.internal.concurrent.TaskQueue r4 = r12.taskQueue     // Catch: java.lang.Throwable -> L44
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L44
            r0.<init>()     // Catch: java.lang.Throwable -> L44
            java.lang.String r3 = r12.name     // Catch: java.lang.Throwable -> L44
            r0.append(r3)     // Catch: java.lang.Throwable -> L44
            java.lang.String r3 = " writer close"
            r0.append(r3)     // Catch: java.lang.Throwable -> L44
            java.lang.String r5 = r0.toString()     // Catch: java.lang.Throwable -> L44
            okhttp3.internal.ws.d r9 = new okhttp3.internal.ws.d     // Catch: java.lang.Throwable -> L44
            r9.<init>(r1)     // Catch: java.lang.Throwable -> L44
            r10 = 2
            r11 = 0
            r6 = 0
            r8 = 0
            okhttp3.internal.concurrent.TaskQueue.execute$default(r4, r5, r6, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L44
            goto L47
        L44:
            r0 = move-exception
            r13 = r0
            goto L78
        L47:
            okhttp3.internal.concurrent.TaskQueue r0 = r12.taskQueue     // Catch: java.lang.Throwable -> L44
            r0.shutdown()     // Catch: java.lang.Throwable -> L44
            kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> L44
            monitor-exit(r12)
            okhttp3.WebSocketListener r0 = r12.listener     // Catch: java.lang.Throwable -> L65
            r0.onFailure(r12, r13, r14)     // Catch: java.lang.Throwable -> L65
            if (r2 == 0) goto L59
            r2.cancel()
        L59:
            if (r15 == 0) goto L64
            java.lang.Object r13 = r1.element
            okhttp3.internal.ws.WebSocketWriter r13 = (okhttp3.internal.ws.WebSocketWriter) r13
            if (r13 == 0) goto L64
            okhttp3.internal._UtilCommonKt.closeQuietly(r13)
        L64:
            return
        L65:
            r0 = move-exception
            r13 = r0
            if (r2 == 0) goto L6c
            r2.cancel()
        L6c:
            if (r15 == 0) goto L77
            java.lang.Object r14 = r1.element
            okhttp3.internal.ws.WebSocketWriter r14 = (okhttp3.internal.ws.WebSocketWriter) r14
            if (r14 == 0) goto L77
            okhttp3.internal._UtilCommonKt.closeQuietly(r14)
        L77:
            throw r13
        L78:
            monitor-exit(r12)
            throw r13
    }

    public final void finishReader() {
            r13 = this;
            monitor-enter(r13)
            int r0 = r13.receivedCloseCode     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = r13.receivedCloseReason     // Catch: java.lang.Throwable -> L3f
            okhttp3.internal.ws.WebSocketReader r2 = r13.reader     // Catch: java.lang.Throwable -> L3f
            r3 = 0
            r13.reader = r3     // Catch: java.lang.Throwable -> L3f
            boolean r4 = r13.enqueuedClose     // Catch: java.lang.Throwable -> L3f
            if (r4 == 0) goto L46
            java.util.ArrayDeque<java.lang.Object> r4 = r13.messageAndCloseQueue     // Catch: java.lang.Throwable -> L3f
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L3f
            if (r4 == 0) goto L46
            okhttp3.internal.ws.WebSocketWriter r4 = r13.writer     // Catch: java.lang.Throwable -> L3f
            if (r4 == 0) goto L41
            r13.writer = r3     // Catch: java.lang.Throwable -> L3f
            okhttp3.internal.concurrent.TaskQueue r5 = r13.taskQueue     // Catch: java.lang.Throwable -> L3f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3f
            r3.<init>()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r6 = r13.name     // Catch: java.lang.Throwable -> L3f
            r3.append(r6)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r6 = " writer close"
            r3.append(r6)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r6 = r3.toString()     // Catch: java.lang.Throwable -> L3f
            okhttp3.internal.ws.b r10 = new okhttp3.internal.ws.b     // Catch: java.lang.Throwable -> L3f
            r10.<init>(r4)     // Catch: java.lang.Throwable -> L3f
            r11 = 2
            r12 = 0
            r7 = 0
            r9 = 0
            okhttp3.internal.concurrent.TaskQueue.execute$default(r5, r6, r7, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L3f
            goto L41
        L3f:
            r0 = move-exception
            goto L69
        L41:
            okhttp3.internal.concurrent.TaskQueue r3 = r13.taskQueue     // Catch: java.lang.Throwable -> L3f
            r3.shutdown()     // Catch: java.lang.Throwable -> L3f
        L46:
            boolean r3 = r13.failed     // Catch: java.lang.Throwable -> L3f
            if (r3 != 0) goto L55
            okhttp3.internal.ws.WebSocketWriter r3 = r13.writer     // Catch: java.lang.Throwable -> L3f
            if (r3 != 0) goto L55
            int r3 = r13.receivedCloseCode     // Catch: java.lang.Throwable -> L3f
            r4 = -1
            if (r3 == r4) goto L55
            r3 = 1
            goto L56
        L55:
            r3 = 0
        L56:
            kotlin.n1 r4 = kotlin.n1.a     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r13)
            if (r3 == 0) goto L63
            okhttp3.WebSocketListener r3 = r13.listener
            kotlin.jvm.internal.g0.m(r1)
            r3.onClosed(r13, r0, r1)
        L63:
            if (r2 == 0) goto L68
            okhttp3.internal._UtilCommonKt.closeQuietly(r2)
        L68:
            return
        L69:
            monitor-exit(r13)
            throw r0
    }

    @org.jetbrains.annotations.Nullable
    public final okhttp3.Call getCall$okhttp() {
            r1 = this;
            okhttp3.Call r0 = r1.call
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.WebSocketListener getListener$okhttp() {
            r1 = this;
            okhttp3.WebSocketListener r0 = r1.listener
            return r0
    }

    public final void initReaderAndWriter(@org.jetbrains.annotations.NotNull java.lang.String r13, @org.jetbrains.annotations.NotNull okhttp3.internal.connection.BufferedSocket r14, boolean r15) {
            r12 = this;
            java.lang.String r2 = "name"
            kotlin.jvm.internal.g0.p(r13, r2)
            java.lang.String r2 = "socket"
            kotlin.jvm.internal.g0.p(r14, r2)
            okhttp3.internal.ws.WebSocketExtensions r2 = r12.extensions
            kotlin.jvm.internal.g0.m(r2)
            monitor-enter(r12)
            r12.name = r13     // Catch: java.lang.Throwable -> L5b
            r12.socket = r14     // Catch: java.lang.Throwable -> L5b
            okhttp3.internal.ws.WebSocketWriter r4 = new okhttp3.internal.ws.WebSocketWriter     // Catch: java.lang.Throwable -> L5b
            okio.BufferedSink r6 = r14.getSink()     // Catch: java.lang.Throwable -> L5b
            java.util.Random r7 = r12.random     // Catch: java.lang.Throwable -> L5b
            boolean r8 = r2.perMessageDeflate     // Catch: java.lang.Throwable -> L5b
            boolean r9 = r2.noContextTakeover(r15)     // Catch: java.lang.Throwable -> L5b
            long r10 = r12.minimumDeflateSize     // Catch: java.lang.Throwable -> L5b
            r5 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L5b
            r12.writer = r4     // Catch: java.lang.Throwable -> L5b
            okhttp3.internal.ws.RealWebSocket$WriterTask r4 = new okhttp3.internal.ws.RealWebSocket$WriterTask     // Catch: java.lang.Throwable -> L5b
            r4.<init>(r12)     // Catch: java.lang.Throwable -> L5b
            r12.writerTask = r4     // Catch: java.lang.Throwable -> L5b
            long r4 = r12.pingIntervalMillis     // Catch: java.lang.Throwable -> L5b
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L5d
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L5b
            long r4 = r6.toNanos(r4)     // Catch: java.lang.Throwable -> L5b
            okhttp3.internal.concurrent.TaskQueue r6 = r12.taskQueue     // Catch: java.lang.Throwable -> L5b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5b
            r7.<init>()     // Catch: java.lang.Throwable -> L5b
            r7.append(r13)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r0 = " ping"
            r7.append(r0)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r0 = r7.toString()     // Catch: java.lang.Throwable -> L5b
            okhttp3.internal.ws.c r7 = new okhttp3.internal.ws.c     // Catch: java.lang.Throwable -> L5b
            r7.<init>(r12, r4)     // Catch: java.lang.Throwable -> L5b
            r6.schedule(r0, r4, r7)     // Catch: java.lang.Throwable -> L5b
            goto L5d
        L5b:
            r0 = move-exception
            goto L82
        L5d:
            java.util.ArrayDeque<java.lang.Object> r0 = r12.messageAndCloseQueue     // Catch: java.lang.Throwable -> L5b
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L5b
            if (r0 != 0) goto L68
            r12.runWriter()     // Catch: java.lang.Throwable -> L5b
        L68:
            kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r12)
            okhttp3.internal.ws.WebSocketReader r0 = new okhttp3.internal.ws.WebSocketReader
            okio.BufferedSource r1 = r14.getSource()
            boolean r4 = r2.perMessageDeflate
            r5 = r15 ^ 1
            boolean r5 = r2.noContextTakeover(r5)
            r3 = r12
            r2 = r1
            r1 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            r12.reader = r0
            return
        L82:
            monitor-exit(r12)
            throw r0
    }

    public final void loopReader(@org.jetbrains.annotations.NotNull okhttp3.Response r8) throws java.io.IOException {
            r7 = this;
            java.lang.String r0 = "response"
            kotlin.jvm.internal.g0.p(r8, r0)
            okhttp3.WebSocketListener r0 = r7.listener     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1b
            r0.onOpen(r7, r8)     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1b
        La:
            int r8 = r7.receivedCloseCode     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1b
            r0 = -1
            if (r8 != r0) goto L1f
            okhttp3.internal.ws.WebSocketReader r8 = r7.reader     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1b
            kotlin.jvm.internal.g0.m(r8)     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1b
            r8.processNextFrame()     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1b
            goto La
        L18:
            r0 = move-exception
            r8 = r0
            goto L2f
        L1b:
            r0 = move-exception
            r8 = r0
            r2 = r8
            goto L23
        L1f:
            r7.finishReader()
            return
        L23:
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            failWebSocket$default(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L18
            r7.finishReader()
            return
        L2f:
            r7.finishReader()
            throw r8
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadClose(int r3, @org.jetbrains.annotations.NotNull java.lang.String r4) {
            r2 = this;
            java.lang.String r0 = "reason"
            kotlin.jvm.internal.g0.p(r4, r0)
            r0 = -1
            if (r3 == r0) goto L26
            monitor-enter(r2)
            int r1 = r2.receivedCloseCode     // Catch: java.lang.Throwable -> L1a
            if (r1 != r0) goto L1c
            r2.receivedCloseCode = r3     // Catch: java.lang.Throwable -> L1a
            r2.receivedCloseReason = r4     // Catch: java.lang.Throwable -> L1a
            kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r2)
            okhttp3.WebSocketListener r0 = r2.listener
            r0.onClosing(r2, r3, r4)
            return
        L1a:
            r3 = move-exception
            goto L24
        L1c:
            java.lang.String r3 = "already closed"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1a
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L1a
            throw r4     // Catch: java.lang.Throwable -> L1a
        L24:
            monitor-exit(r2)
            throw r3
        L26:
            java.lang.String r3 = "Failed requirement."
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>(r3)
            throw r4
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(@org.jetbrains.annotations.NotNull java.lang.String r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "text"
            kotlin.jvm.internal.g0.p(r2, r0)
            okhttp3.WebSocketListener r0 = r1.listener
            r0.onMessage(r1, r2)
            return
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(@org.jetbrains.annotations.NotNull okio.ByteString r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.g0.p(r2, r0)
            okhttp3.WebSocketListener r0 = r1.listener
            r0.onMessage(r1, r2)
            return
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPing(@org.jetbrains.annotations.NotNull okio.ByteString r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "payload"
            kotlin.jvm.internal.g0.p(r2, r0)     // Catch: java.lang.Throwable -> L17
            boolean r0 = r1.failed     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L29
            boolean r0 = r1.enqueuedClose     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L19
            java.util.ArrayDeque<java.lang.Object> r0 = r1.messageAndCloseQueue     // Catch: java.lang.Throwable -> L17
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L19
            goto L29
        L17:
            r2 = move-exception
            goto L2b
        L19:
            java.util.ArrayDeque<okio.ByteString> r0 = r1.pongQueue     // Catch: java.lang.Throwable -> L17
            r0.add(r2)     // Catch: java.lang.Throwable -> L17
            r1.runWriter()     // Catch: java.lang.Throwable -> L17
            int r2 = r1.receivedPingCount     // Catch: java.lang.Throwable -> L17
            int r2 = r2 + 1
            r1.receivedPingCount = r2     // Catch: java.lang.Throwable -> L17
            monitor-exit(r1)
            return
        L29:
            monitor-exit(r1)
            return
        L2b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r2
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPong(@org.jetbrains.annotations.NotNull okio.ByteString r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "payload"
            kotlin.jvm.internal.g0.p(r2, r0)     // Catch: java.lang.Throwable -> L11
            int r2 = r1.receivedPongCount     // Catch: java.lang.Throwable -> L11
            int r2 = r2 + 1
            r1.receivedPongCount = r2     // Catch: java.lang.Throwable -> L11
            r2 = 0
            r1.awaitingPong = r2     // Catch: java.lang.Throwable -> L11
            monitor-exit(r1)
            return
        L11:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11
            throw r2
    }

    public final synchronized boolean pong(@org.jetbrains.annotations.NotNull okio.ByteString r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "payload"
            kotlin.jvm.internal.g0.p(r2, r0)     // Catch: java.lang.Throwable -> L17
            boolean r0 = r1.failed     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L24
            boolean r0 = r1.enqueuedClose     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L19
            java.util.ArrayDeque<java.lang.Object> r0 = r1.messageAndCloseQueue     // Catch: java.lang.Throwable -> L17
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L19
            goto L24
        L17:
            r2 = move-exception
            goto L27
        L19:
            java.util.ArrayDeque<okio.ByteString> r0 = r1.pongQueue     // Catch: java.lang.Throwable -> L17
            r0.add(r2)     // Catch: java.lang.Throwable -> L17
            r1.runWriter()     // Catch: java.lang.Throwable -> L17
            monitor-exit(r1)
            r2 = 1
            return r2
        L24:
            monitor-exit(r1)
            r2 = 0
            return r2
        L27:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r2
    }

    public final boolean processNextFrame() throws java.io.IOException {
            r8 = this;
            r1 = 0
            okhttp3.internal.ws.WebSocketReader r0 = r8.reader     // Catch: java.lang.Exception -> L11
            kotlin.jvm.internal.g0.m(r0)     // Catch: java.lang.Exception -> L11
            r0.processNextFrame()     // Catch: java.lang.Exception -> L11
            int r0 = r8.receivedCloseCode     // Catch: java.lang.Exception -> L11
            r2 = -1
            if (r0 != r2) goto L10
            r0 = 1
            return r0
        L10:
            return r1
        L11:
            r0 = move-exception
            r3 = r0
            r6 = 6
            r7 = 0
            r4 = 0
            r5 = 0
            r2 = r8
            failWebSocket$default(r2, r3, r4, r5, r6, r7)
            return r1
    }

    public synchronized long queueSize() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.queueSize     // Catch: java.lang.Throwable -> L5
            monitor-exit(r2)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public final synchronized int receivedPingCount() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.receivedPingCount     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public final synchronized int receivedPongCount() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.receivedPongCount     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public okhttp3.Request request() {
            r1 = this;
            okhttp3.Request r0 = r1.originalRequest
            return r0
    }

    public boolean send(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "text"
            kotlin.jvm.internal.g0.p(r2, r0)
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            okio.ByteString r2 = r0.encodeUtf8(r2)
            r0 = 1
            boolean r2 = r1.send(r2, r0)
            return r2
    }

    public boolean send(@org.jetbrains.annotations.NotNull okio.ByteString r2) {
            r1 = this;
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 2
            boolean r2 = r1.send(r2, r0)
            return r2
    }

    public final synchronized int sentPingCount() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.sentPingCount     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public final void setCall$okhttp(@org.jetbrains.annotations.Nullable okhttp3.Call r1) {
            r0 = this;
            r0.call = r1
            return
    }

    public final void tearDown() throws java.lang.InterruptedException {
            r4 = this;
            okhttp3.internal.concurrent.TaskQueue r0 = r4.taskQueue
            r0.shutdown()
            okhttp3.internal.concurrent.TaskQueue r0 = r4.taskQueue
            java.util.concurrent.CountDownLatch r0 = r0.idleLatch()
            r1 = 10
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            r0.await(r1, r3)
            return
    }

    public final boolean writeOneFrame$okhttp() throws java.io.IOException {
            r20 = this;
            r1 = r20
            monitor-enter(r20)
            boolean r0 = r1.failed     // Catch: java.lang.Throwable -> L33
            r2 = 0
            if (r0 == 0) goto La
            monitor-exit(r20)
            return r2
        La:
            okhttp3.internal.ws.WebSocketWriter r0 = r1.writer     // Catch: java.lang.Throwable -> L33
            java.util.ArrayDeque<okio.ByteString> r3 = r1.pongQueue     // Catch: java.lang.Throwable -> L33
            java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L33
            r4 = 1
            r5 = 0
            r6 = -1
            if (r3 != 0) goto L7a
            java.util.ArrayDeque<java.lang.Object> r7 = r1.messageAndCloseQueue     // Catch: java.lang.Throwable -> L33
            java.lang.Object r7 = r7.poll()     // Catch: java.lang.Throwable -> L33
            boolean r8 = r7 instanceof okhttp3.internal.ws.RealWebSocket.Close     // Catch: java.lang.Throwable -> L33
            if (r8 == 0) goto L71
            int r8 = r1.receivedCloseCode     // Catch: java.lang.Throwable -> L33
            java.lang.String r9 = r1.receivedCloseReason     // Catch: java.lang.Throwable -> L33
            if (r8 == r6) goto L3d
            okhttp3.internal.ws.WebSocketWriter r6 = r1.writer     // Catch: java.lang.Throwable -> L33
            r1.writer = r5     // Catch: java.lang.Throwable -> L33
            if (r6 == 0) goto L36
            okhttp3.internal.ws.WebSocketReader r5 = r1.reader     // Catch: java.lang.Throwable -> L33
            if (r5 != 0) goto L36
            r2 = 1
            goto L36
        L33:
            r0 = move-exception
            goto Lee
        L36:
            okhttp3.internal.concurrent.TaskQueue r5 = r1.taskQueue     // Catch: java.lang.Throwable -> L33
            r5.shutdown()     // Catch: java.lang.Throwable -> L33
        L3b:
            r5 = r7
            goto L7d
        L3d:
            r6 = r7
            okhttp3.internal.ws.RealWebSocket$Close r6 = (okhttp3.internal.ws.RealWebSocket.Close) r6     // Catch: java.lang.Throwable -> L33
            long r10 = r6.getCancelAfterCloseMillis()     // Catch: java.lang.Throwable -> L33
            okhttp3.internal.concurrent.TaskQueue r12 = r1.taskQueue     // Catch: java.lang.Throwable -> L33
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L33
            r6.<init>()     // Catch: java.lang.Throwable -> L33
            java.lang.String r13 = r1.name     // Catch: java.lang.Throwable -> L33
            r6.append(r13)     // Catch: java.lang.Throwable -> L33
            java.lang.String r13 = " cancel"
            r6.append(r13)     // Catch: java.lang.Throwable -> L33
            java.lang.String r13 = r6.toString()     // Catch: java.lang.Throwable -> L33
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L33
            long r14 = r6.toNanos(r10)     // Catch: java.lang.Throwable -> L33
            okhttp3.internal.ws.a r6 = new okhttp3.internal.ws.a     // Catch: java.lang.Throwable -> L33
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L33
            r18 = 4
            r19 = 0
            r16 = 0
            r17 = r6
            okhttp3.internal.concurrent.TaskQueue.execute$default(r12, r13, r14, r16, r17, r18, r19)     // Catch: java.lang.Throwable -> L33
            r6 = r5
            goto L3b
        L71:
            if (r7 != 0) goto L75
            monitor-exit(r20)
            return r2
        L75:
            r6 = r5
            r9 = r6
            r5 = r7
        L78:
            r8 = -1
            goto L7d
        L7a:
            r6 = r5
            r9 = r6
            goto L78
        L7d:
            kotlin.n1 r7 = kotlin.n1.a     // Catch: java.lang.Throwable -> L33
            monitor-exit(r20)
            if (r3 == 0) goto L8d
            kotlin.jvm.internal.g0.m(r0)     // Catch: java.lang.Throwable -> L8b
            okio.ByteString r3 = (okio.ByteString) r3     // Catch: java.lang.Throwable -> L8b
            r0.writePong(r3)     // Catch: java.lang.Throwable -> L8b
            goto Ldc
        L8b:
            r0 = move-exception
            goto Le8
        L8d:
            boolean r3 = r5 instanceof okhttp3.internal.ws.RealWebSocket.Message     // Catch: java.lang.Throwable -> L8b
            if (r3 == 0) goto Lbb
            kotlin.jvm.internal.g0.m(r0)     // Catch: java.lang.Throwable -> L8b
            r2 = r5
            okhttp3.internal.ws.RealWebSocket$Message r2 = (okhttp3.internal.ws.RealWebSocket.Message) r2     // Catch: java.lang.Throwable -> L8b
            int r2 = r2.getFormatOpcode()     // Catch: java.lang.Throwable -> L8b
            r3 = r5
            okhttp3.internal.ws.RealWebSocket$Message r3 = (okhttp3.internal.ws.RealWebSocket.Message) r3     // Catch: java.lang.Throwable -> L8b
            okio.ByteString r3 = r3.getData()     // Catch: java.lang.Throwable -> L8b
            r0.writeMessageFrame(r2, r3)     // Catch: java.lang.Throwable -> L8b
            monitor-enter(r20)     // Catch: java.lang.Throwable -> L8b
            long r2 = r1.queueSize     // Catch: java.lang.Throwable -> Lb8
            okhttp3.internal.ws.RealWebSocket$Message r5 = (okhttp3.internal.ws.RealWebSocket.Message) r5     // Catch: java.lang.Throwable -> Lb8
            okio.ByteString r0 = r5.getData()     // Catch: java.lang.Throwable -> Lb8
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Lb8
            long r7 = (long) r0     // Catch: java.lang.Throwable -> Lb8
            long r2 = r2 - r7
            r1.queueSize = r2     // Catch: java.lang.Throwable -> Lb8
            monitor-exit(r20)     // Catch: java.lang.Throwable -> L8b
            goto Ldc
        Lb8:
            r0 = move-exception
            monitor-exit(r20)     // Catch: java.lang.Throwable -> L8b
            throw r0     // Catch: java.lang.Throwable -> L8b
        Lbb:
            boolean r3 = r5 instanceof okhttp3.internal.ws.RealWebSocket.Close     // Catch: java.lang.Throwable -> L8b
            if (r3 == 0) goto Le2
            kotlin.jvm.internal.g0.m(r0)     // Catch: java.lang.Throwable -> L8b
            r3 = r5
            okhttp3.internal.ws.RealWebSocket$Close r3 = (okhttp3.internal.ws.RealWebSocket.Close) r3     // Catch: java.lang.Throwable -> L8b
            int r3 = r3.getCode()     // Catch: java.lang.Throwable -> L8b
            okhttp3.internal.ws.RealWebSocket$Close r5 = (okhttp3.internal.ws.RealWebSocket.Close) r5     // Catch: java.lang.Throwable -> L8b
            okio.ByteString r5 = r5.getReason()     // Catch: java.lang.Throwable -> L8b
            r0.writeClose(r3, r5)     // Catch: java.lang.Throwable -> L8b
            if (r2 == 0) goto Ldc
            okhttp3.WebSocketListener r0 = r1.listener     // Catch: java.lang.Throwable -> L8b
            kotlin.jvm.internal.g0.m(r9)     // Catch: java.lang.Throwable -> L8b
            r0.onClosed(r1, r8, r9)     // Catch: java.lang.Throwable -> L8b
        Ldc:
            if (r6 == 0) goto Le1
            okhttp3.internal._UtilCommonKt.closeQuietly(r6)
        Le1:
            return r4
        Le2:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L8b
            r0.<init>()     // Catch: java.lang.Throwable -> L8b
            throw r0     // Catch: java.lang.Throwable -> L8b
        Le8:
            if (r6 == 0) goto Led
            okhttp3.internal._UtilCommonKt.closeQuietly(r6)
        Led:
            throw r0
        Lee:
            monitor-exit(r20)
            throw r0
    }

    public final void writePingFrame$okhttp() {
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.failed     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L7
            monitor-exit(r8)
            return
        L7:
            okhttp3.internal.ws.WebSocketWriter r0 = r8.writer     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto Ld
            monitor-exit(r8)
            return
        Ld:
            boolean r2 = r8.awaitingPong     // Catch: java.lang.Throwable -> L15
            r3 = -1
            if (r2 == 0) goto L17
            int r2 = r8.sentPingCount     // Catch: java.lang.Throwable -> L15
            goto L18
        L15:
            r0 = move-exception
            goto L66
        L17:
            r2 = -1
        L18:
            int r4 = r8.sentPingCount     // Catch: java.lang.Throwable -> L15
            r5 = 1
            int r4 = r4 + r5
            r8.sentPingCount = r4     // Catch: java.lang.Throwable -> L15
            r8.awaitingPong = r5     // Catch: java.lang.Throwable -> L15
            kotlin.n1 r4 = kotlin.n1.a     // Catch: java.lang.Throwable -> L15
            monitor-exit(r8)
            if (r2 == r3) goto L55
            r3 = r2
            java.net.SocketTimeoutException r2 = new java.net.SocketTimeoutException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "sent ping but didn't receive pong within "
            r0.append(r4)
            long r6 = r8.pingIntervalMillis
            r0.append(r6)
            java.lang.String r4 = "ms (after "
            r0.append(r4)
            int r3 = r3 - r5
            r0.append(r3)
            java.lang.String r3 = " successful ping/pongs)"
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            r5 = 2
            r6 = 0
            r3 = 0
            r4 = 1
            r1 = r8
            failWebSocket$default(r1, r2, r3, r4, r5, r6)
            return
        L55:
            okio.ByteString r1 = okio.ByteString.EMPTY     // Catch: java.io.IOException -> L5b
            r0.writePing(r1)     // Catch: java.io.IOException -> L5b
            return
        L5b:
            r0 = move-exception
            r2 = r0
            r5 = 2
            r6 = 0
            r3 = 0
            r4 = 1
            r1 = r8
            failWebSocket$default(r1, r2, r3, r4, r5, r6)
            return
        L66:
            monitor-exit(r8)
            throw r0
    }
}
