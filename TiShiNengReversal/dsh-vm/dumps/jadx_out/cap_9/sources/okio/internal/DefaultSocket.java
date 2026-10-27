package okio.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class DefaultSocket implements okio.Socket {

    @org.jetbrains.annotations.NotNull
    private java.util.concurrent.atomic.AtomicInteger closeBits;

    @org.jetbrains.annotations.NotNull
    private final okio.Sink sink;

    @org.jetbrains.annotations.NotNull
    private final java.net.Socket socket;

    @org.jetbrains.annotations.NotNull
    private final okio.Source source;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDefaultSocket.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultSocket.kt\nokio/internal/DefaultSocket$SocketSink\n+ 2 Util.kt\nokio/-SegmentedByteString\n+ 3 AsyncTimeout.kt\nokio/AsyncTimeout\n*L\n1#1,176:1\n85#2:177\n175#3,11:178\n175#3,11:189\n175#3,11:200\n*S KotlinDebug\n*F\n+ 1 DefaultSocket.kt\nokio/internal/DefaultSocket$SocketSink\n*L\n60#1:177\n61#1:178,11\n77#1:189,11\n83#1:200,11\n*E\n"})
    public final class SocketSink implements okio.Sink {
        private final java.io.OutputStream outputStream;
        final /* synthetic */ okio.internal.DefaultSocket this$0;

        @org.jetbrains.annotations.NotNull
        private final okio.internal.SocketAsyncTimeout timeout;

        public SocketSink(okio.internal.DefaultSocket r2) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                java.net.Socket r0 = r2.getSocket()
                java.io.OutputStream r0 = r0.getOutputStream()
                r1.outputStream = r0
                okio.internal.SocketAsyncTimeout r0 = new okio.internal.SocketAsyncTimeout
                java.net.Socket r2 = r2.getSocket()
                r0.<init>(r2)
                r1.timeout = r0
                return
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r4 = this;
                okio.internal.SocketAsyncTimeout r0 = r4.timeout
                okio.internal.DefaultSocket r1 = r4.this$0
                r0.enter()
                java.util.concurrent.atomic.AtomicInteger r2 = okio.internal.DefaultSocket.access$getCloseBits$p(r1)     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
                r3 = 1
                int r2 = okio.internal._AtomicKt.setBitsOrZero(r2, r3)     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
                if (r2 == 0) goto L5b
                r3 = 3
                if (r2 == r3) goto L45
                java.net.Socket r2 = r1.getSocket()     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
                boolean r2 = r2.isClosed()     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
                if (r2 != 0) goto L41
                java.net.Socket r2 = r1.getSocket()     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
                boolean r2 = r2.isOutputShutdown()     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
                if (r2 == 0) goto L2a
                goto L41
            L2a:
                java.io.OutputStream r2 = r4.outputStream     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
                r2.flush()     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
                java.net.Socket r1 = r1.getSocket()     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39 java.lang.UnsupportedOperationException -> L3b
                r1.shutdownOutput()     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39 java.lang.UnsupportedOperationException -> L3b
                goto L4c
            L37:
                r1 = move-exception
                goto L6b
            L39:
                r1 = move-exception
                goto L5f
            L3b:
                java.io.OutputStream r1 = r4.outputStream     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
                r1.close()     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
                goto L4c
            L41:
                r0.exit()
                return
            L45:
                java.net.Socket r1 = r1.getSocket()     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
                r1.close()     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
            L4c:
                kotlin.n1 r1 = kotlin.n1.a     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
                boolean r1 = r0.exit()
                if (r1 != 0) goto L55
                return
            L55:
                r1 = 0
                java.io.IOException r0 = r0.access$newTimeoutException(r1)
                throw r0
            L5b:
                r0.exit()
                return
            L5f:
                boolean r2 = r0.exit()     // Catch: java.lang.Throwable -> L37
                if (r2 != 0) goto L66
                goto L6a
            L66:
                java.io.IOException r1 = r0.access$newTimeoutException(r1)     // Catch: java.lang.Throwable -> L37
            L6a:
                throw r1     // Catch: java.lang.Throwable -> L37
            L6b:
                r0.exit()
                throw r1
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() {
                r3 = this;
                okio.internal.SocketAsyncTimeout r0 = r3.timeout
                r0.enter()
                java.io.OutputStream r1 = r3.outputStream     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
                r1.flush()     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
                kotlin.n1 r1 = kotlin.n1.a     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
                boolean r1 = r0.exit()
                if (r1 != 0) goto L13
                return
            L13:
                r1 = 0
                java.io.IOException r0 = r0.access$newTimeoutException(r1)
                throw r0
            L19:
                r1 = move-exception
                goto L28
            L1b:
                r1 = move-exception
                boolean r2 = r0.exit()     // Catch: java.lang.Throwable -> L19
                if (r2 != 0) goto L23
                goto L27
            L23:
                java.io.IOException r1 = r0.access$newTimeoutException(r1)     // Catch: java.lang.Throwable -> L19
            L27:
                throw r1     // Catch: java.lang.Throwable -> L19
            L28:
                r0.exit()
                throw r1
        }

        @Override // okio.Sink
        public /* bridge */ /* synthetic */ okio.Timeout timeout() {
                r1 = this;
                okio.internal.SocketAsyncTimeout r0 = r1.timeout()
                return r0
        }

        @Override // okio.Sink
        @org.jetbrains.annotations.NotNull
        public okio.internal.SocketAsyncTimeout timeout() {
                r1 = this;
                okio.internal.SocketAsyncTimeout r0 = r1.timeout
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "sink("
                r0.append(r1)
                okio.internal.DefaultSocket r1 = r2.this$0
                java.net.Socket r1 = r1.getSocket()
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // okio.Sink
        public void write(@org.jetbrains.annotations.NotNull okio.Buffer r8, long r9) {
                r7 = this;
                java.lang.String r0 = "source"
                kotlin.jvm.internal.g0.p(r8, r0)
                long r1 = r8.size()
                r3 = 0
                r5 = r9
                okio.SegmentedByteString.checkOffsetAndCount(r1, r3, r5)
            Lf:
                r0 = 0
                int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r2 <= 0) goto L7a
                okio.internal.SocketAsyncTimeout r0 = r7.timeout
                r0.throwIfReached()
                okio.Segment r0 = r8.head
                kotlin.jvm.internal.g0.m(r0)
                int r1 = r0.limit
                int r2 = r0.pos
                int r1 = r1 - r2
                long r1 = (long) r1
                long r1 = java.lang.Math.min(r9, r1)
                int r2 = (int) r1
                okio.internal.SocketAsyncTimeout r1 = r7.timeout
                r1.enter()
                java.io.OutputStream r3 = r7.outputStream     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L68
                byte[] r4 = r0.data     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L68
                int r5 = r0.pos     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L68
                r3.write(r4, r5, r2)     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L68
                kotlin.n1 r3 = kotlin.n1.a     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L68
                boolean r3 = r1.exit()
                if (r3 != 0) goto L5f
                int r1 = r0.pos
                int r1 = r1 + r2
                r0.pos = r1
                long r1 = (long) r2
                long r9 = r9 - r1
                long r3 = r8.size()
                long r3 = r3 - r1
                r8.setSize$okio(r3)
                int r1 = r0.pos
                int r2 = r0.limit
                if (r1 != r2) goto Lf
                okio.Segment r1 = r0.pop()
                r8.head = r1
                okio.SegmentPool.recycle(r0)
                goto Lf
            L5f:
                r8 = 0
                java.io.IOException r8 = r1.access$newTimeoutException(r8)
                throw r8
            L65:
                r0 = move-exception
                r8 = r0
                goto L76
            L68:
                r0 = move-exception
                r8 = r0
                boolean r9 = r1.exit()     // Catch: java.lang.Throwable -> L65
                if (r9 != 0) goto L71
                goto L75
            L71:
                java.io.IOException r8 = r1.access$newTimeoutException(r8)     // Catch: java.lang.Throwable -> L65
            L75:
                throw r8     // Catch: java.lang.Throwable -> L65
            L76:
                r1.exit()
                throw r8
            L7a:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDefaultSocket.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultSocket.kt\nokio/internal/DefaultSocket$SocketSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokio/-SegmentedByteString\n+ 4 AsyncTimeout.kt\nokio/AsyncTimeout\n*L\n1#1,176:1\n1#2:177\n85#3:178\n175#4,11:179\n175#4,11:190\n*S KotlinDebug\n*F\n+ 1 DefaultSocket.kt\nokio/internal/DefaultSocket$SocketSource\n*L\n121#1:178\n123#1:179,11\n144#1:190,11\n*E\n"})
    public final class SocketSource implements okio.Source {
        private final java.io.InputStream inputStream;
        final /* synthetic */ okio.internal.DefaultSocket this$0;

        @org.jetbrains.annotations.NotNull
        private final okio.internal.SocketAsyncTimeout timeout;

        public SocketSource(okio.internal.DefaultSocket r2) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                java.net.Socket r0 = r2.getSocket()
                java.io.InputStream r0 = r0.getInputStream()
                r1.inputStream = r0
                okio.internal.SocketAsyncTimeout r0 = new okio.internal.SocketAsyncTimeout
                java.net.Socket r2 = r2.getSocket()
                r0.<init>(r2)
                r1.timeout = r0
                return
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r4 = this;
                okio.internal.SocketAsyncTimeout r0 = r4.timeout
                okio.internal.DefaultSocket r1 = r4.this$0
                r0.enter()
                java.util.concurrent.atomic.AtomicInteger r2 = okio.internal.DefaultSocket.access$getCloseBits$p(r1)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
                r3 = 2
                int r2 = okio.internal._AtomicKt.setBitsOrZero(r2, r3)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
                if (r2 == 0) goto L56
                r3 = 3
                if (r2 == r3) goto L40
                java.net.Socket r2 = r1.getSocket()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
                boolean r2 = r2.isClosed()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
                if (r2 != 0) goto L3c
                java.net.Socket r2 = r1.getSocket()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
                boolean r2 = r2.isInputShutdown()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
                if (r2 == 0) goto L2a
                goto L3c
            L2a:
                java.net.Socket r1 = r1.getSocket()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34 java.lang.UnsupportedOperationException -> L36
                r1.shutdownInput()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34 java.lang.UnsupportedOperationException -> L36
                goto L47
            L32:
                r1 = move-exception
                goto L66
            L34:
                r1 = move-exception
                goto L5a
            L36:
                java.io.InputStream r1 = r4.inputStream     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
                r1.close()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
                goto L47
            L3c:
                r0.exit()
                return
            L40:
                java.net.Socket r1 = r1.getSocket()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
                r1.close()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            L47:
                kotlin.n1 r1 = kotlin.n1.a     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
                boolean r1 = r0.exit()
                if (r1 != 0) goto L50
                return
            L50:
                r1 = 0
                java.io.IOException r0 = r0.access$newTimeoutException(r1)
                throw r0
            L56:
                r0.exit()
                return
            L5a:
                boolean r2 = r0.exit()     // Catch: java.lang.Throwable -> L32
                if (r2 != 0) goto L61
                goto L65
            L61:
                java.io.IOException r1 = r0.access$newTimeoutException(r1)     // Catch: java.lang.Throwable -> L32
            L65:
                throw r1     // Catch: java.lang.Throwable -> L32
            L66:
                r0.exit()
                throw r1
        }

        @Override // okio.Source
        public long read(@org.jetbrains.annotations.NotNull okio.Buffer r5, long r6) {
                r4 = this;
                java.lang.String r0 = "sink"
                kotlin.jvm.internal.g0.p(r5, r0)
                r0 = 0
                int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r2 != 0) goto Lc
                return r0
            Lc:
                if (r2 < 0) goto L83
                okio.internal.SocketAsyncTimeout r0 = r4.timeout
                r0.throwIfReached()
                r0 = 1
                okio.Segment r0 = r5.writableSegment$okio(r0)
                int r1 = r0.limit
                int r1 = 8192 - r1
                long r1 = (long) r1
                long r6 = java.lang.Math.min(r6, r1)
                int r7 = (int) r6
                okio.internal.SocketAsyncTimeout r6 = r4.timeout     // Catch: java.lang.AssertionError -> L61
                r6.enter()     // Catch: java.lang.AssertionError -> L61
                java.io.InputStream r1 = r4.inputStream     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L65
                byte[] r2 = r0.data     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L65
                int r3 = r0.limit     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L65
                int r7 = r1.read(r2, r3, r7)     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L65
                boolean r1 = r6.exit()     // Catch: java.lang.AssertionError -> L61
                if (r1 != 0) goto L5b
                r6 = -1
                if (r7 != r6) goto L4c
                int r6 = r0.pos
                int r7 = r0.limit
                if (r6 != r7) goto L49
                okio.Segment r6 = r0.pop()
                r5.head = r6
                okio.SegmentPool.recycle(r0)
            L49:
                r5 = -1
                return r5
            L4c:
                int r6 = r0.limit
                int r6 = r6 + r7
                r0.limit = r6
                long r0 = r5.size()
                long r6 = (long) r7
                long r0 = r0 + r6
                r5.setSize$okio(r0)
                return r6
            L5b:
                r5 = 0
                java.io.IOException r5 = r6.access$newTimeoutException(r5)     // Catch: java.lang.AssertionError -> L61
                throw r5     // Catch: java.lang.AssertionError -> L61
            L61:
                r5 = move-exception
                goto L76
            L63:
                r5 = move-exception
                goto L72
            L65:
                r5 = move-exception
                boolean r7 = r6.exit()     // Catch: java.lang.Throwable -> L63
                if (r7 != 0) goto L6d
                goto L71
            L6d:
                java.io.IOException r5 = r6.access$newTimeoutException(r5)     // Catch: java.lang.Throwable -> L63
            L71:
                throw r5     // Catch: java.lang.Throwable -> L63
            L72:
                r6.exit()     // Catch: java.lang.AssertionError -> L61
                throw r5     // Catch: java.lang.AssertionError -> L61
            L76:
                boolean r6 = okio.internal._JavaIoKt.isAndroidGetsocknameError(r5)
                if (r6 == 0) goto L82
                java.io.IOException r6 = new java.io.IOException
                r6.<init>(r5)
                throw r6
            L82:
                throw r5
            L83:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r0 = "byteCount < 0: "
                r5.append(r0)
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r5 = r5.toString()
                r6.<init>(r5)
                throw r6
        }

        @Override // okio.Source
        public /* bridge */ /* synthetic */ okio.Timeout timeout() {
                r1 = this;
                okio.internal.SocketAsyncTimeout r0 = r1.timeout()
                return r0
        }

        @Override // okio.Source
        @org.jetbrains.annotations.NotNull
        public okio.internal.SocketAsyncTimeout timeout() {
                r1 = this;
                okio.internal.SocketAsyncTimeout r0 = r1.timeout
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "source("
                r0.append(r1)
                okio.internal.DefaultSocket r1 = r2.this$0
                java.net.Socket r1 = r1.getSocket()
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public DefaultSocket(@org.jetbrains.annotations.NotNull java.net.Socket r2) {
            r1 = this;
            java.lang.String r0 = "socket"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.socket = r2
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r2.<init>()
            r1.closeBits = r2
            okio.internal.DefaultSocket$SocketSource r2 = new okio.internal.DefaultSocket$SocketSource
            r2.<init>(r1)
            r1.source = r2
            okio.internal.DefaultSocket$SocketSink r2 = new okio.internal.DefaultSocket$SocketSink
            r2.<init>(r1)
            r1.sink = r2
            return
    }

    public static final /* synthetic */ java.util.concurrent.atomic.AtomicInteger access$getCloseBits$p(okio.internal.DefaultSocket r0) {
            java.util.concurrent.atomic.AtomicInteger r0 = r0.closeBits
            return r0
    }

    @Override // okio.Socket
    public void cancel() {
            r1 = this;
            java.net.Socket r0 = r1.socket
            r0.close()
            return
    }

    @Override // okio.Socket
    @org.jetbrains.annotations.NotNull
    public okio.Sink getSink() {
            r1 = this;
            okio.Sink r0 = r1.sink
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.net.Socket getSocket() {
            r1 = this;
            java.net.Socket r0 = r1.socket
            return r0
    }

    @Override // okio.Socket
    @org.jetbrains.annotations.NotNull
    public okio.Source getSource() {
            r1 = this;
            okio.Source r0 = r1.source
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.net.Socket r0 = r2.socket
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }
}
