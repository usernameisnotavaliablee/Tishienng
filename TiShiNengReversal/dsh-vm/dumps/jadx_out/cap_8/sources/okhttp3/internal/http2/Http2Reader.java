package okhttp3.internal.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class Http2Reader implements java.io.Closeable {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.http2.Http2Reader.Companion Companion = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.logging.Logger logger = null;
    private final boolean client;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.http2.Http2Reader.ContinuationSource continuation;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.http2.Hpack.Reader hpackReader;

    @org.jetbrains.annotations.NotNull
    private final okio.BufferedSource source;

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

        @org.jetbrains.annotations.NotNull
        public final java.util.logging.Logger getLogger() {
                r1 = this;
                java.util.logging.Logger r0 = okhttp3.internal.http2.Http2Reader.access$getLogger$cp()
                return r0
        }

        public final int lengthWithoutPadding(int r3, int r4, int r5) throws java.io.IOException {
                r2 = this;
                r4 = r4 & 8
                if (r4 == 0) goto L6
                int r3 = r3 + (-1)
            L6:
                if (r5 > r3) goto La
                int r3 = r3 - r5
                return r3
            La:
                java.io.IOException r4 = new java.io.IOException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "PROTOCOL_ERROR padding "
                r0.append(r1)
                r0.append(r5)
                java.lang.String r5 = " > remaining length "
                r0.append(r5)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r4.<init>(r3)
                throw r4
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class ContinuationSource implements okio.Source {
        private int flags;
        private int left;
        private int length;
        private int padding;

        @org.jetbrains.annotations.NotNull
        private final okio.BufferedSource source;
        private int streamId;

        public ContinuationSource(@org.jetbrains.annotations.NotNull okio.BufferedSource r2) {
                r1 = this;
                java.lang.String r0 = "source"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.<init>()
                r1.source = r2
                return
        }

        private final void readContinuationHeader() throws java.io.IOException {
                r9 = this;
                int r0 = r9.streamId
                okio.BufferedSource r1 = r9.source
                int r1 = okhttp3.internal._UtilCommonKt.readMedium(r1)
                r9.left = r1
                r9.length = r1
                okio.BufferedSource r1 = r9.source
                byte r1 = r1.readByte()
                r2 = 255(0xff, float:3.57E-43)
                int r7 = okhttp3.internal._UtilCommonKt.and(r1, r2)
                okio.BufferedSource r1 = r9.source
                byte r1 = r1.readByte()
                int r1 = okhttp3.internal._UtilCommonKt.and(r1, r2)
                r9.flags = r1
                okhttp3.internal.http2.Http2Reader$Companion r1 = okhttp3.internal.http2.Http2Reader.Companion
                java.util.logging.Logger r2 = r1.getLogger()
                java.util.logging.Level r3 = java.util.logging.Level.FINE
                boolean r2 = r2.isLoggable(r3)
                if (r2 == 0) goto L46
                java.util.logging.Logger r1 = r1.getLogger()
                okhttp3.internal.http2.Http2 r3 = okhttp3.internal.http2.Http2.INSTANCE
                int r5 = r9.streamId
                int r6 = r9.length
                int r8 = r9.flags
                r4 = 1
                java.lang.String r2 = r3.frameLog(r4, r5, r6, r7, r8)
                r1.fine(r2)
            L46:
                okio.BufferedSource r1 = r9.source
                int r1 = r1.readInt()
                r2 = 2147483647(0x7fffffff, float:NaN)
                r1 = r1 & r2
                r9.streamId = r1
                r2 = 9
                if (r7 != r2) goto L61
                if (r1 != r0) goto L59
                return
            L59:
                java.io.IOException r0 = new java.io.IOException
                java.lang.String r1 = "TYPE_CONTINUATION streamId changed"
                r0.<init>(r1)
                throw r0
            L61:
                java.io.IOException r0 = new java.io.IOException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r7)
                java.lang.String r2 = " != TYPE_CONTINUATION"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        public void close() throws java.io.IOException {
                r0 = this;
                return
        }

        public final int getFlags() {
                r1 = this;
                int r0 = r1.flags
                return r0
        }

        public final int getLeft() {
                r1 = this;
                int r0 = r1.left
                return r0
        }

        public final int getLength() {
                r1 = this;
                int r0 = r1.length
                return r0
        }

        public final int getPadding() {
                r1 = this;
                int r0 = r1.padding
                return r0
        }

        public final int getStreamId() {
                r1 = this;
                int r0 = r1.streamId
                return r0
        }

        public long read(@org.jetbrains.annotations.NotNull okio.Buffer r7, long r8) throws java.io.IOException {
                r6 = this;
                java.lang.String r0 = "sink"
                kotlin.jvm.internal.g0.p(r7, r0)
            L5:
                int r0 = r6.left
                r1 = -1
                if (r0 != 0) goto L21
                okio.BufferedSource r0 = r6.source
                int r3 = r6.padding
                long r3 = (long) r3
                r0.skip(r3)
                r0 = 0
                r6.padding = r0
                int r0 = r6.flags
                r0 = r0 & 4
                if (r0 == 0) goto L1d
                return r1
            L1d:
                r6.readContinuationHeader()
                goto L5
            L21:
                okio.BufferedSource r3 = r6.source
                long r4 = (long) r0
                long r8 = java.lang.Math.min(r8, r4)
                long r7 = r3.read(r7, r8)
                int r9 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
                if (r9 != 0) goto L31
                return r1
            L31:
                int r9 = r6.left
                int r0 = (int) r7
                int r9 = r9 - r0
                r6.left = r9
                return r7
        }

        public final void setFlags(int r1) {
                r0 = this;
                r0.flags = r1
                return
        }

        public final void setLeft(int r1) {
                r0 = this;
                r0.left = r1
                return
        }

        public final void setLength(int r1) {
                r0 = this;
                r0.length = r1
                return
        }

        public final void setPadding(int r1) {
                r0 = this;
                r0.padding = r1
                return
        }

        public final void setStreamId(int r1) {
                r0 = this;
                r0.streamId = r1
                return
        }

        @org.jetbrains.annotations.NotNull
        public okio.Timeout timeout() {
                r1 = this;
                okio.BufferedSource r0 = r1.source
                okio.Timeout r0 = r0.timeout()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Handler {
        void ackSettings();

        void alternateService(int r1, @org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull okio.ByteString r3, @org.jetbrains.annotations.NotNull java.lang.String r4, int r5, long r6);

        void data(boolean r1, int r2, @org.jetbrains.annotations.NotNull okio.BufferedSource r3, int r4) throws java.io.IOException;

        void goAway(int r1, @org.jetbrains.annotations.NotNull okhttp3.internal.http2.ErrorCode r2, @org.jetbrains.annotations.NotNull okio.ByteString r3);

        void headers(boolean r1, int r2, int r3, @org.jetbrains.annotations.NotNull java.util.List<okhttp3.internal.http2.Header> r4);

        void ping(boolean r1, int r2, int r3);

        void priority(int r1, int r2, int r3, boolean r4);

        void pushPromise(int r1, int r2, @org.jetbrains.annotations.NotNull java.util.List<okhttp3.internal.http2.Header> r3) throws java.io.IOException;

        void rstStream(int r1, @org.jetbrains.annotations.NotNull okhttp3.internal.http2.ErrorCode r2);

        void settings(boolean r1, @org.jetbrains.annotations.NotNull okhttp3.internal.http2.Settings r2);

        void windowUpdate(int r1, long r2);
    }

    static {
            okhttp3.internal.http2.Http2Reader$Companion r0 = new okhttp3.internal.http2.Http2Reader$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.http2.Http2Reader.Companion = r0
            java.lang.Class<okhttp3.internal.http2.Http2> r0 = okhttp3.internal.http2.Http2.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            java.lang.String r1 = "getLogger(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            okhttp3.internal.http2.Http2Reader.logger = r0
            return
    }

    public Http2Reader(@org.jetbrains.annotations.NotNull okio.BufferedSource r8, boolean r9) {
            r7 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r8, r0)
            r7.<init>()
            r7.source = r8
            r7.client = r9
            okhttp3.internal.http2.Http2Reader$ContinuationSource r2 = new okhttp3.internal.http2.Http2Reader$ContinuationSource
            r2.<init>(r8)
            r7.continuation = r2
            okhttp3.internal.http2.Hpack$Reader r1 = new okhttp3.internal.http2.Hpack$Reader
            r5 = 4
            r6 = 0
            r3 = 4096(0x1000, float:5.74E-42)
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            r7.hpackReader = r1
            return
    }

    public static final /* synthetic */ java.util.logging.Logger access$getLogger$cp() {
            java.util.logging.Logger r0 = okhttp3.internal.http2.Http2Reader.logger
            return r0
    }

    private final void readData(okhttp3.internal.http2.Http2Reader.Handler r4, int r5, int r6, int r7) throws java.io.IOException {
            r3 = this;
            if (r7 == 0) goto L38
            r0 = r6 & 1
            r1 = 0
            if (r0 == 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            r2 = r6 & 32
            if (r2 != 0) goto L30
            r2 = r6 & 8
            if (r2 == 0) goto L1e
            okio.BufferedSource r1 = r3.source
            byte r1 = r1.readByte()
            r2 = 255(0xff, float:3.57E-43)
            int r1 = okhttp3.internal._UtilCommonKt.and(r1, r2)
        L1e:
            okhttp3.internal.http2.Http2Reader$Companion r2 = okhttp3.internal.http2.Http2Reader.Companion
            int r5 = r2.lengthWithoutPadding(r5, r6, r1)
            okio.BufferedSource r6 = r3.source
            r4.data(r0, r7, r6, r5)
            okio.BufferedSource r4 = r3.source
            long r5 = (long) r1
            r4.skip(r5)
            return
        L30:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r5 = "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"
            r4.<init>(r5)
            throw r4
        L38:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r5 = "PROTOCOL_ERROR: TYPE_DATA streamId == 0"
            r4.<init>(r5)
            throw r4
    }

    private final void readGoAway(okhttp3.internal.http2.Http2Reader.Handler r4, int r5, int r6, int r7) throws java.io.IOException {
            r3 = this;
            r6 = 8
            if (r5 < r6) goto L49
            if (r7 != 0) goto L41
            okio.BufferedSource r7 = r3.source
            int r7 = r7.readInt()
            okio.BufferedSource r0 = r3.source
            int r0 = r0.readInt()
            int r5 = r5 - r6
            okhttp3.internal.http2.ErrorCode$Companion r6 = okhttp3.internal.http2.ErrorCode.Companion
            okhttp3.internal.http2.ErrorCode r6 = r6.fromHttp2(r0)
            if (r6 == 0) goto L2a
            okio.ByteString r0 = okio.ByteString.EMPTY
            if (r5 <= 0) goto L26
            okio.BufferedSource r0 = r3.source
            long r1 = (long) r5
            okio.ByteString r0 = r0.readByteString(r1)
        L26:
            r4.goAway(r7, r6, r0)
            return
        L2a:
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "TYPE_GOAWAY unexpected error code: "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L41:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r5 = "TYPE_GOAWAY streamId != 0"
            r4.<init>(r5)
            throw r4
        L49:
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "TYPE_GOAWAY length < 8: "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
    }

    private final java.util.List<okhttp3.internal.http2.Header> readHeaderBlock(int r2, int r3, int r4, int r5) throws java.io.IOException {
            r1 = this;
            okhttp3.internal.http2.Http2Reader$ContinuationSource r0 = r1.continuation
            r0.setLeft(r2)
            okhttp3.internal.http2.Http2Reader$ContinuationSource r2 = r1.continuation
            int r0 = r2.getLeft()
            r2.setLength(r0)
            okhttp3.internal.http2.Http2Reader$ContinuationSource r2 = r1.continuation
            r2.setPadding(r3)
            okhttp3.internal.http2.Http2Reader$ContinuationSource r2 = r1.continuation
            r2.setFlags(r4)
            okhttp3.internal.http2.Http2Reader$ContinuationSource r2 = r1.continuation
            r2.setStreamId(r5)
            okhttp3.internal.http2.Hpack$Reader r2 = r1.hpackReader
            r2.readHeaders()
            okhttp3.internal.http2.Hpack$Reader r2 = r1.hpackReader
            java.util.List r2 = r2.getAndResetHeaderList()
            return r2
    }

    private final void readHeaders(okhttp3.internal.http2.Http2Reader.Handler r4, int r5, int r6, int r7) throws java.io.IOException {
            r3 = this;
            if (r7 == 0) goto L32
            r0 = r6 & 1
            r1 = 0
            if (r0 == 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            r2 = r6 & 8
            if (r2 == 0) goto L1a
            okio.BufferedSource r1 = r3.source
            byte r1 = r1.readByte()
            r2 = 255(0xff, float:3.57E-43)
            int r1 = okhttp3.internal._UtilCommonKt.and(r1, r2)
        L1a:
            r2 = r6 & 32
            if (r2 == 0) goto L23
            r3.readPriority(r4, r7)
            int r5 = r5 + (-5)
        L23:
            okhttp3.internal.http2.Http2Reader$Companion r2 = okhttp3.internal.http2.Http2Reader.Companion
            int r5 = r2.lengthWithoutPadding(r5, r6, r1)
            java.util.List r5 = r3.readHeaderBlock(r5, r1, r6, r7)
            r6 = -1
            r4.headers(r0, r7, r6, r5)
            return
        L32:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r5 = "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"
            r4.<init>(r5)
            throw r4
    }

    private final void readPing(okhttp3.internal.http2.Http2Reader.Handler r2, int r3, int r4, int r5) throws java.io.IOException {
            r1 = this;
            r0 = 8
            if (r3 != r0) goto L24
            if (r5 != 0) goto L1c
            okio.BufferedSource r3 = r1.source
            int r3 = r3.readInt()
            okio.BufferedSource r5 = r1.source
            int r5 = r5.readInt()
            r0 = 1
            r4 = r4 & r0
            if (r4 == 0) goto L17
            goto L18
        L17:
            r0 = 0
        L18:
            r2.ping(r0, r3, r5)
            return
        L1c:
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r3 = "TYPE_PING streamId != 0"
            r2.<init>(r3)
            throw r2
        L24:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "TYPE_PING length != 8: "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3)
            throw r2
    }

    private final void readPriority(okhttp3.internal.http2.Http2Reader.Handler r6, int r7) throws java.io.IOException {
            r5 = this;
            okio.BufferedSource r0 = r5.source
            int r0 = r0.readInt()
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r0
            r2 = 1
            if (r1 == 0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            r3 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r3
            okio.BufferedSource r3 = r5.source
            byte r3 = r3.readByte()
            r4 = 255(0xff, float:3.57E-43)
            int r3 = okhttp3.internal._UtilCommonKt.and(r3, r4)
            int r3 = r3 + r2
            r6.priority(r7, r0, r3, r1)
            return
    }

    private final void readPriority(okhttp3.internal.http2.Http2Reader.Handler r1, int r2, int r3, int r4) throws java.io.IOException {
            r0 = this;
            r3 = 5
            if (r2 != r3) goto L11
            if (r4 == 0) goto L9
            r0.readPriority(r1, r4)
            return
        L9:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_PRIORITY streamId == 0"
            r1.<init>(r2)
            throw r1
        L11:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "TYPE_PRIORITY length: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = " != 5"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
    }

    private final void readPushPromise(okhttp3.internal.http2.Http2Reader.Handler r4, int r5, int r6, int r7) throws java.io.IOException {
            r3 = this;
            if (r7 == 0) goto L2e
            r0 = r6 & 8
            if (r0 == 0) goto L13
            okio.BufferedSource r0 = r3.source
            byte r0 = r0.readByte()
            r1 = 255(0xff, float:3.57E-43)
            int r0 = okhttp3.internal._UtilCommonKt.and(r0, r1)
            goto L14
        L13:
            r0 = 0
        L14:
            okio.BufferedSource r1 = r3.source
            int r1 = r1.readInt()
            r2 = 2147483647(0x7fffffff, float:NaN)
            r1 = r1 & r2
            okhttp3.internal.http2.Http2Reader$Companion r2 = okhttp3.internal.http2.Http2Reader.Companion
            int r5 = r5 + (-4)
            int r5 = r2.lengthWithoutPadding(r5, r6, r0)
            java.util.List r5 = r3.readHeaderBlock(r5, r0, r6, r7)
            r4.pushPromise(r7, r1, r5)
            return
        L2e:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r5 = "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0"
            r4.<init>(r5)
            throw r4
    }

    private final void readRstStream(okhttp3.internal.http2.Http2Reader.Handler r1, int r2, int r3, int r4) throws java.io.IOException {
            r0 = this;
            r3 = 4
            if (r2 != r3) goto L36
            if (r4 == 0) goto L2e
            okio.BufferedSource r2 = r0.source
            int r2 = r2.readInt()
            okhttp3.internal.http2.ErrorCode$Companion r3 = okhttp3.internal.http2.ErrorCode.Companion
            okhttp3.internal.http2.ErrorCode r3 = r3.fromHttp2(r2)
            if (r3 == 0) goto L17
            r1.rstStream(r4, r3)
            return
        L17:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "TYPE_RST_STREAM unexpected error code: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L2e:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_RST_STREAM streamId == 0"
            r1.<init>(r2)
            throw r1
        L36:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "TYPE_RST_STREAM length: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = " != 4"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
    }

    private final void readSettings(okhttp3.internal.http2.Http2Reader.Handler r7, int r8, int r9, int r10) throws java.io.IOException {
            r6 = this;
            if (r10 != 0) goto Lb3
            r10 = 1
            r9 = r9 & r10
            if (r9 == 0) goto L14
            if (r8 != 0) goto Lc
            r7.ackSettings()
            return
        Lc:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = "FRAME_SIZE_ERROR ack frame should be empty!"
            r7.<init>(r8)
            throw r7
        L14:
            int r9 = r8 % 6
            if (r9 != 0) goto L9c
            okhttp3.internal.http2.Settings r9 = new okhttp3.internal.http2.Settings
            r9.<init>()
            r0 = 0
            kotlin.ranges.m r8 = kotlin.ranges.t.W1(r0, r8)
            r1 = 6
            kotlin.ranges.k r8 = kotlin.ranges.t.B1(r8, r1)
            int r1 = r8.e()
            int r2 = r8.f()
            int r8 = r8.g()
            if (r8 <= 0) goto L37
            if (r1 <= r2) goto L3b
        L37:
            if (r8 >= 0) goto L98
            if (r2 > r1) goto L98
        L3b:
            okio.BufferedSource r3 = r6.source
            short r3 = r3.readShort()
            r4 = 65535(0xffff, float:9.1834E-41)
            int r3 = okhttp3.internal._UtilCommonKt.and(r3, r4)
            okio.BufferedSource r4 = r6.source
            int r4 = r4.readInt()
            r5 = 2
            if (r3 == r5) goto L84
            r5 = 4
            if (r3 == r5) goto L79
            r5 = 5
            if (r3 == r5) goto L58
            goto L91
        L58:
            r5 = 16384(0x4000, float:2.2959E-41)
            if (r4 < r5) goto L62
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            if (r4 > r5) goto L62
            goto L91
        L62:
            java.io.IOException r7 = new java.io.IOException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "
            r8.append(r9)
            r8.append(r4)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L79:
            if (r4 < 0) goto L7c
            goto L91
        L7c:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"
            r7.<init>(r8)
            throw r7
        L84:
            if (r4 == 0) goto L91
            if (r4 != r10) goto L89
            goto L91
        L89:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"
            r7.<init>(r8)
            throw r7
        L91:
            r9.set(r3, r4)
            if (r1 == r2) goto L98
            int r1 = r1 + r8
            goto L3b
        L98:
            r7.settings(r0, r9)
            return
        L9c:
            java.io.IOException r7 = new java.io.IOException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "TYPE_SETTINGS length % 6 != 0: "
            r9.append(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r7.<init>(r8)
            throw r7
        Lb3:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = "TYPE_SETTINGS streamId != 0"
            r7.<init>(r8)
            throw r7
    }

    private final void readWindowUpdate(okhttp3.internal.http2.Http2Reader.Handler r10, int r11, int r12, int r13) throws java.io.IOException {
            r9 = this;
            r0 = 4
            if (r11 != r0) goto L45
            okio.BufferedSource r0 = r9.source     // Catch: java.lang.Exception -> L41
            int r0 = r0.readInt()     // Catch: java.lang.Exception -> L41
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r7 = okhttp3.internal._UtilCommonKt.and(r0, r1)     // Catch: java.lang.Exception -> L41
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 == 0) goto L33
            java.util.logging.Logger r12 = okhttp3.internal.http2.Http2Reader.logger
            java.util.logging.Level r0 = java.util.logging.Level.FINE
            boolean r0 = r12.isLoggable(r0)
            if (r0 == 0) goto L2e
            okhttp3.internal.http2.Http2 r3 = okhttp3.internal.http2.Http2.INSTANCE
            r4 = 1
            r6 = r11
            r5 = r13
            java.lang.String r11 = r3.frameLogWindowUpdate(r4, r5, r6, r7)
            r2 = r5
            r12.fine(r11)
            goto L2f
        L2e:
            r2 = r13
        L2f:
            r10.windowUpdate(r2, r7)
            return
        L33:
            r3 = r11
            r2 = r13
            java.io.IOException r10 = new java.io.IOException     // Catch: java.lang.Exception -> L3e
            java.lang.String r11 = "windowSizeIncrement was 0"
            r10.<init>(r11)     // Catch: java.lang.Exception -> L3e
            throw r10     // Catch: java.lang.Exception -> L3e
        L3e:
            r0 = move-exception
        L3f:
            r10 = r0
            goto L5e
        L41:
            r0 = move-exception
            r3 = r11
            r2 = r13
            goto L3f
        L45:
            r3 = r11
            r2 = r13
            java.io.IOException r10 = new java.io.IOException     // Catch: java.lang.Exception -> L3e
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3e
            r11.<init>()     // Catch: java.lang.Exception -> L3e
            java.lang.String r13 = "TYPE_WINDOW_UPDATE length !=4: "
            r11.append(r13)     // Catch: java.lang.Exception -> L3e
            r11.append(r3)     // Catch: java.lang.Exception -> L3e
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Exception -> L3e
            r10.<init>(r11)     // Catch: java.lang.Exception -> L3e
            throw r10     // Catch: java.lang.Exception -> L3e
        L5e:
            java.util.logging.Logger r11 = okhttp3.internal.http2.Http2Reader.logger
            okhttp3.internal.http2.Http2 r0 = okhttp3.internal.http2.Http2.INSTANCE
            r1 = 1
            r4 = 8
            r5 = r12
            java.lang.String r12 = r0.frameLog(r1, r2, r3, r4, r5)
            r11.fine(r12)
            throw r10
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            okio.BufferedSource r0 = r1.source
            r0.close()
            return
    }

    public final boolean nextFrame(boolean r8, @org.jetbrains.annotations.NotNull okhttp3.internal.http2.Http2Reader.Handler r9) throws java.io.IOException {
            r7 = this;
            java.lang.String r0 = "handler"
            kotlin.jvm.internal.g0.p(r9, r0)
            okio.BufferedSource r0 = r7.source     // Catch: java.io.EOFException -> Lb8
            r1 = 9
            r0.require(r1)     // Catch: java.io.EOFException -> Lb8
            okio.BufferedSource r0 = r7.source
            int r4 = okhttp3.internal._UtilCommonKt.readMedium(r0)
            r0 = 16384(0x4000, float:2.2959E-41)
            if (r4 > r0) goto La1
            okio.BufferedSource r0 = r7.source
            byte r0 = r0.readByte()
            r1 = 255(0xff, float:3.57E-43)
            int r5 = okhttp3.internal._UtilCommonKt.and(r0, r1)
            okio.BufferedSource r0 = r7.source
            byte r0 = r0.readByte()
            int r6 = okhttp3.internal._UtilCommonKt.and(r0, r1)
            okio.BufferedSource r0 = r7.source
            int r0 = r0.readInt()
            r1 = 2147483647(0x7fffffff, float:NaN)
            r3 = r0 & r1
            r0 = 8
            if (r5 == r0) goto L4f
            java.util.logging.Logger r0 = okhttp3.internal.http2.Http2Reader.logger
            java.util.logging.Level r1 = java.util.logging.Level.FINE
            boolean r1 = r0.isLoggable(r1)
            if (r1 == 0) goto L4f
            okhttp3.internal.http2.Http2 r1 = okhttp3.internal.http2.Http2.INSTANCE
            r2 = 1
            java.lang.String r1 = r1.frameLog(r2, r3, r4, r5, r6)
            r0.fine(r1)
        L4f:
            if (r8 == 0) goto L72
            r8 = 4
            if (r5 != r8) goto L55
            goto L72
        L55:
            java.io.IOException r8 = new java.io.IOException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "Expected a SETTINGS frame but was "
            r9.append(r0)
            okhttp3.internal.http2.Http2 r0 = okhttp3.internal.http2.Http2.INSTANCE
            java.lang.String r0 = r0.formattedType$okhttp(r5)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L72:
            switch(r5) {
                case 0: goto L9c;
                case 1: goto L98;
                case 2: goto L94;
                case 3: goto L90;
                case 4: goto L8c;
                case 5: goto L88;
                case 6: goto L84;
                case 7: goto L80;
                case 8: goto L7c;
                default: goto L75;
            }
        L75:
            okio.BufferedSource r8 = r7.source
            long r0 = (long) r4
            r8.skip(r0)
            goto L9f
        L7c:
            r7.readWindowUpdate(r9, r4, r6, r3)
            goto L9f
        L80:
            r7.readGoAway(r9, r4, r6, r3)
            goto L9f
        L84:
            r7.readPing(r9, r4, r6, r3)
            goto L9f
        L88:
            r7.readPushPromise(r9, r4, r6, r3)
            goto L9f
        L8c:
            r7.readSettings(r9, r4, r6, r3)
            goto L9f
        L90:
            r7.readRstStream(r9, r4, r6, r3)
            goto L9f
        L94:
            r7.readPriority(r9, r4, r6, r3)
            goto L9f
        L98:
            r7.readHeaders(r9, r4, r6, r3)
            goto L9f
        L9c:
            r7.readData(r9, r4, r6, r3)
        L9f:
            r8 = 1
            return r8
        La1:
            java.io.IOException r8 = new java.io.IOException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "FRAME_SIZE_ERROR: "
            r9.append(r0)
            r9.append(r4)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        Lb8:
            r8 = 0
            return r8
    }

    public final void readConnectionPreface(@org.jetbrains.annotations.NotNull okhttp3.internal.http2.Http2Reader.Handler r5) throws java.io.IOException {
            r4 = this;
            java.lang.String r0 = "handler"
            kotlin.jvm.internal.g0.p(r5, r0)
            boolean r0 = r4.client
            if (r0 == 0) goto L19
            r0 = 1
            boolean r5 = r4.nextFrame(r0, r5)
            if (r5 == 0) goto L11
            goto L55
        L11:
            java.io.IOException r5 = new java.io.IOException
            java.lang.String r0 = "Required SETTINGS preface not received"
            r5.<init>(r0)
            throw r5
        L19:
            okio.BufferedSource r5 = r4.source
            okio.ByteString r0 = okhttp3.internal.http2.Http2.CONNECTION_PREFACE
            int r1 = r0.size()
            long r1 = (long) r1
            okio.ByteString r5 = r5.readByteString(r1)
            java.util.logging.Logger r1 = okhttp3.internal.http2.Http2Reader.logger
            java.util.logging.Level r2 = java.util.logging.Level.FINE
            boolean r2 = r1.isLoggable(r2)
            if (r2 == 0) goto L4f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "<< CONNECTION "
            r2.append(r3)
            java.lang.String r3 = r5.hex()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r2 = okhttp3.internal._UtilJvmKt.format(r2, r3)
            r1.fine(r2)
        L4f:
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r5)
            if (r0 == 0) goto L56
        L55:
            return
        L56:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected a connection header but was "
            r1.append(r2)
            java.lang.String r5 = r5.utf8()
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
    }
}
