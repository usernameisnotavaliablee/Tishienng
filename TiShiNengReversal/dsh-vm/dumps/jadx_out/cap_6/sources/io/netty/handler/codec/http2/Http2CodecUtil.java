package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class Http2CodecUtil {
    private static final io.netty.buffer.ByteBuf CONNECTION_PREFACE = null;
    public static final int CONNECTION_STREAM_ID = 0;
    public static final int CONTINUATION_FRAME_HEADER_LENGTH = 10;
    public static final int DATA_FRAME_HEADER_LENGTH = 10;
    public static final long DEFAULT_GRACEFUL_SHUTDOWN_TIMEOUT_MILLIS = 0;
    public static final long DEFAULT_HEADER_LIST_SIZE = 8192;
    public static final int DEFAULT_HEADER_TABLE_SIZE = 4096;
    public static final int DEFAULT_MAX_FRAME_SIZE = 16384;
    static final int DEFAULT_MAX_RESERVED_STREAMS = 100;
    static final int DEFAULT_MIN_ALLOCATION_CHUNK = 1024;
    public static final short DEFAULT_PRIORITY_WEIGHT = 16;
    public static final int DEFAULT_WINDOW_SIZE = 65535;
    public static final int FRAME_HEADER_LENGTH = 9;
    public static final int GO_AWAY_FRAME_HEADER_LENGTH = 17;
    public static final int HEADERS_FRAME_HEADER_LENGTH = 15;
    public static final java.lang.CharSequence HTTP_UPGRADE_PROTOCOL_NAME = null;
    public static final java.lang.CharSequence HTTP_UPGRADE_SETTINGS_HEADER = null;
    public static final int HTTP_UPGRADE_STREAM_ID = 1;
    public static final int INT_FIELD_LENGTH = 4;
    public static final long MAX_CONCURRENT_STREAMS = 4294967295L;
    public static final int MAX_FRAME_SIZE_LOWER_BOUND = 16384;
    public static final int MAX_FRAME_SIZE_UPPER_BOUND = 16777215;
    public static final long MAX_HEADER_LIST_SIZE = 4294967295L;
    public static final long MAX_HEADER_TABLE_SIZE = 4294967295L;
    public static final int MAX_INITIAL_WINDOW_SIZE = Integer.MAX_VALUE;
    public static final int MAX_PADDING = 256;
    private static final int MAX_PADDING_LENGTH_LENGTH = 1;
    public static final short MAX_UNSIGNED_BYTE = 255;
    public static final long MAX_UNSIGNED_INT = 4294967295L;
    public static final short MAX_WEIGHT = 256;
    public static final long MIN_CONCURRENT_STREAMS = 0;
    public static final long MIN_HEADER_LIST_SIZE = 0;
    public static final long MIN_HEADER_TABLE_SIZE = 0;
    public static final int MIN_INITIAL_WINDOW_SIZE = 0;
    public static final short MIN_WEIGHT = 1;
    public static final int NUM_STANDARD_SETTINGS = 6;
    public static final int PING_FRAME_PAYLOAD_LENGTH = 8;
    public static final int PRIORITY_ENTRY_LENGTH = 5;
    public static final int PRIORITY_FRAME_LENGTH = 14;
    public static final int PUSH_PROMISE_FRAME_HEADER_LENGTH = 14;
    public static final int RST_STREAM_FRAME_LENGTH = 13;
    public static final char SETTINGS_ENABLE_PUSH = 2;
    public static final char SETTINGS_HEADER_TABLE_SIZE = 1;
    public static final char SETTINGS_INITIAL_WINDOW_SIZE = 4;
    public static final char SETTINGS_MAX_CONCURRENT_STREAMS = 3;
    public static final char SETTINGS_MAX_FRAME_SIZE = 5;
    public static final char SETTINGS_MAX_HEADER_LIST_SIZE = 6;
    public static final int SETTING_ENTRY_LENGTH = 6;
    public static final int SMALLEST_MAX_CONCURRENT_STREAMS = 100;
    public static final java.lang.CharSequence TLS_UPGRADE_PROTOCOL_NAME = null;
    public static final int WINDOW_UPDATE_FRAME_LENGTH = 13;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class SimpleChannelPromiseAggregator extends io.netty.channel.DefaultChannelPromise {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private boolean doneAllocating;
        private int doneCount;
        private int expectedCount;
        private java.lang.Throwable lastFailure;
        private final io.netty.channel.ChannelPromise promise;

        static {
                return
        }

        SimpleChannelPromiseAggregator(io.netty.channel.ChannelPromise r1, io.netty.channel.Channel r2, io.netty.util.concurrent.EventExecutor r3) {
                r0 = this;
                r0.<init>(r2, r3)
                r0.promise = r1
                return
        }

        private boolean allPromisesDone() {
                r2 = this;
                int r0 = r2.doneCount
                int r1 = r2.expectedCount
                if (r0 != r1) goto Lc
                boolean r0 = r2.doneAllocating
                if (r0 == 0) goto Lc
                r0 = 1
                return r0
            Lc:
                r0 = 0
                return r0
        }

        private boolean allowFailure() {
                r1 = this;
                boolean r0 = r1.awaitingPromises()
                if (r0 != 0) goto Ld
                int r0 = r1.expectedCount
                if (r0 != 0) goto Lb
                goto Ld
            Lb:
                r0 = 0
                return r0
            Ld:
                r0 = 1
                return r0
        }

        private boolean awaitingPromises() {
                r2 = this;
                int r0 = r2.doneCount
                int r1 = r2.expectedCount
                if (r0 >= r1) goto L8
                r0 = 1
                return r0
            L8:
                r0 = 0
                return r0
        }

        private io.netty.channel.ChannelPromise setPromise() {
                r2 = this;
                java.lang.Throwable r0 = r2.lastFailure
                if (r0 != 0) goto Lf
                io.netty.channel.ChannelPromise r0 = r2.promise
                r0.setSuccess()
                r0 = 0
                io.netty.channel.ChannelPromise r0 = super.setSuccess(r0)
                return r0
            Lf:
                io.netty.channel.ChannelPromise r1 = r2.promise
                r1.setFailure(r0)
                java.lang.Throwable r0 = r2.lastFailure
                io.netty.channel.ChannelPromise r0 = super.setFailure(r0)
                return r0
        }

        private boolean tryPromise() {
                r2 = this;
                java.lang.Throwable r0 = r2.lastFailure
                if (r0 != 0) goto Lf
                io.netty.channel.ChannelPromise r0 = r2.promise
                r0.trySuccess()
                r0 = 0
                boolean r0 = super.trySuccess(r0)
                return r0
            Lf:
                io.netty.channel.ChannelPromise r1 = r2.promise
                r1.tryFailure(r0)
                java.lang.Throwable r0 = r2.lastFailure
                boolean r0 = super.tryFailure(r0)
                return r0
        }

        public io.netty.channel.ChannelPromise doneAllocatingPromises() {
                r2 = this;
                boolean r0 = r2.doneAllocating
                if (r0 != 0) goto L14
                r0 = 1
                r2.doneAllocating = r0
                int r0 = r2.doneCount
                int r1 = r2.expectedCount
                if (r0 == r1) goto Lf
                if (r1 != 0) goto L14
            Lf:
                io.netty.channel.ChannelPromise r0 = r2.setPromise()
                return r0
            L14:
                return r2
        }

        public io.netty.channel.ChannelPromise newPromise() {
                r1 = this;
                int r0 = r1.expectedCount
                int r0 = r0 + 1
                r1.expectedCount = r0
                return r1
        }

        @Override // io.netty.channel.DefaultChannelPromise, io.netty.channel.ChannelPromise
        public io.netty.channel.ChannelPromise setFailure(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.allowFailure()
                if (r0 == 0) goto L19
                int r0 = r1.doneCount
                int r0 = r0 + 1
                r1.doneCount = r0
                r1.lastFailure = r2
                boolean r2 = r1.allPromisesDone()
                if (r2 == 0) goto L19
                io.netty.channel.ChannelPromise r2 = r1.setPromise()
                return r2
            L19:
                return r1
        }

        @Override // io.netty.channel.DefaultChannelPromise
        /* renamed from: setFailure */
        public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise mo20setFailure(java.lang.Throwable r1) {
                r0 = this;
                io.netty.channel.ChannelPromise r1 = r0.setFailure(r1)
                return r1
        }

        @Override // io.netty.channel.DefaultChannelPromise, io.netty.channel.ChannelPromise
        public io.netty.channel.ChannelPromise setSuccess(java.lang.Void r1) {
                r0 = this;
                boolean r1 = r0.awaitingPromises()
                if (r1 == 0) goto L15
                int r1 = r0.doneCount
                int r1 = r1 + 1
                r0.doneCount = r1
                boolean r1 = r0.allPromisesDone()
                if (r1 == 0) goto L15
                r0.setPromise()
            L15:
                return r0
        }

        @Override // io.netty.channel.DefaultChannelPromise
        public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise setSuccess(java.lang.Object r1) {
                r0 = this;
                java.lang.Void r1 = (java.lang.Void) r1
                io.netty.channel.ChannelPromise r1 = r0.setSuccess(r1)
                return r1
        }

        public boolean tryFailure(java.lang.Throwable r3) {
                r2 = this;
                boolean r0 = r2.allowFailure()
                if (r0 == 0) goto L1a
                int r0 = r2.doneCount
                r1 = 1
                int r0 = r0 + r1
                r2.doneCount = r0
                r2.lastFailure = r3
                boolean r3 = r2.allPromisesDone()
                if (r3 == 0) goto L19
                boolean r3 = r2.tryPromise()
                return r3
            L19:
                return r1
            L1a:
                r3 = 0
                return r3
        }

        public /* bridge */ /* synthetic */ boolean trySuccess(java.lang.Object r1) {
                r0 = this;
                java.lang.Void r1 = (java.lang.Void) r1
                boolean r1 = r0.trySuccess(r1)
                return r1
        }

        public boolean trySuccess(java.lang.Void r2) {
                r1 = this;
                boolean r2 = r1.awaitingPromises()
                if (r2 == 0) goto L18
                int r2 = r1.doneCount
                r0 = 1
                int r2 = r2 + r0
                r1.doneCount = r2
                boolean r2 = r1.allPromisesDone()
                if (r2 == 0) goto L17
                boolean r2 = r1.tryPromise()
                return r2
            L17:
                return r0
            L18:
                r2 = 0
                return r2
        }
    }

    static {
            java.lang.String r0 = "HTTP2-Settings"
            io.netty.util.AsciiString r0 = io.netty.util.AsciiString.cached(r0)
            io.netty.handler.codec.http2.Http2CodecUtil.HTTP_UPGRADE_SETTINGS_HEADER = r0
            java.lang.String r0 = "h2c"
            io.netty.handler.codec.http2.Http2CodecUtil.HTTP_UPGRADE_PROTOCOL_NAME = r0
            java.lang.String r0 = "h2"
            io.netty.handler.codec.http2.Http2CodecUtil.TLS_UPGRADE_PROTOCOL_NAME = r0
            r0 = 24
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.directBuffer(r0)
            java.lang.String r1 = "PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n"
            java.nio.charset.Charset r2 = io.netty.util.CharsetUtil.UTF_8
            byte[] r1 = r1.getBytes(r2)
            io.netty.buffer.ByteBuf r0 = r0.writeBytes(r1)
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.unreleasableBuffer(r0)
            io.netty.buffer.ByteBuf r0 = r0.asReadOnly()
            io.netty.handler.codec.http2.Http2CodecUtil.CONNECTION_PREFACE = r0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            r1 = 30
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = r0.convert(r1, r3)
            io.netty.handler.codec.http2.Http2CodecUtil.DEFAULT_GRACEFUL_SHUTDOWN_TIMEOUT_MILLIS = r0
            return
    }

    private Http2CodecUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static long calculateMaxHeaderListSizeGoAway(long r2) {
            r0 = 2
            long r0 = r2 >>> r0
            long r2 = r2 + r0
            return r2
    }

    public static io.netty.buffer.ByteBuf connectionPrefaceBuf() {
            io.netty.buffer.ByteBuf r0 = io.netty.handler.codec.http2.Http2CodecUtil.CONNECTION_PREFACE
            io.netty.buffer.ByteBuf r0 = r0.retainedDuplicate()
            return r0
    }

    public static io.netty.handler.codec.http2.Http2Exception getEmbeddedHttp2Exception(java.lang.Throwable r1) {
        L0:
            if (r1 == 0) goto Le
            boolean r0 = r1 instanceof io.netty.handler.codec.http2.Http2Exception
            if (r0 == 0) goto L9
            io.netty.handler.codec.http2.Http2Exception r1 = (io.netty.handler.codec.http2.Http2Exception) r1
            return r1
        L9:
            java.lang.Throwable r1 = r1.getCause()
            goto L0
        Le:
            r1 = 0
            return r1
    }

    public static void headerListSizeExceeded(int r2, long r3, boolean r5) throws io.netty.handler.codec.http2.Http2Exception {
            io.netty.handler.codec.http2.Http2Error r0 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r1 = 0
            r4[r1] = r3
            java.lang.String r3 = "Header size exceeded max allowed size (%d)"
            io.netty.handler.codec.http2.Http2Exception r2 = io.netty.handler.codec.http2.Http2Exception.headerListSizeError(r2, r0, r5, r3, r4)
            throw r2
    }

    public static void headerListSizeExceeded(long r2) throws io.netty.handler.codec.http2.Http2Exception {
            io.netty.handler.codec.http2.Http2Error r0 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r1 = 0
            r3[r1] = r2
            java.lang.String r2 = "Header size exceeded max allowed size (%d)"
            io.netty.handler.codec.http2.Http2Exception r2 = io.netty.handler.codec.http2.Http2Exception.connectionError(r0, r2, r3)
            throw r2
    }

    public static boolean isMaxFrameSizeValid(int r1) {
            r0 = 16384(0x4000, float:2.2959E-41)
            if (r1 < r0) goto Lb
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            if (r1 > r0) goto Lb
            r1 = 1
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public static boolean isOutboundStream(boolean r3, int r4) {
            r0 = r4 & 1
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            if (r4 <= 0) goto Le
            if (r3 != r0) goto Le
            return r2
        Le:
            return r1
    }

    public static boolean isStreamIdValid(int r0) {
            if (r0 < 0) goto L4
            r0 = 1
            return r0
        L4:
            r0 = 0
            return r0
    }

    static boolean isStreamIdValid(int r2, boolean r3) {
            boolean r0 = isStreamIdValid(r2)
            r1 = 0
            if (r0 == 0) goto L11
            r0 = 1
            r2 = r2 & r0
            if (r2 != 0) goto Ld
            r2 = 1
            goto Le
        Ld:
            r2 = 0
        Le:
            if (r3 != r2) goto L11
            return r0
        L11:
            return r1
    }

    public static int readUnsignedInt(io.netty.buffer.ByteBuf r1) {
            int r1 = r1.readInt()
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1 = r1 & r0
            return r1
    }

    public static int streamableBytes(io.netty.handler.codec.http2.StreamByteDistributor.StreamState r4) {
            long r0 = r4.pendingBytes()
            int r4 = r4.windowSize()
            long r2 = (long) r4
            long r0 = java.lang.Math.min(r0, r2)
            int r4 = (int) r0
            r0 = 0
            int r4 = java.lang.Math.max(r0, r4)
            return r4
    }

    public static io.netty.buffer.ByteBuf toByteBuf(io.netty.channel.ChannelHandlerContext r1, java.lang.Throwable r2) {
            if (r2 == 0) goto L16
            java.lang.String r0 = r2.getMessage()
            if (r0 != 0) goto L9
            goto L16
        L9:
            io.netty.buffer.ByteBufAllocator r1 = r1.alloc()
            java.lang.String r2 = r2.getMessage()
            io.netty.buffer.ByteBuf r1 = io.netty.buffer.ByteBufUtil.writeUtf8(r1, r2)
            return r1
        L16:
            io.netty.buffer.ByteBuf r1 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            return r1
    }

    public static void verifyPadding(int r4) {
            r0 = 256(0x100, float:3.59E-43)
            if (r4 < 0) goto L7
            if (r4 > r0) goto L7
            return
        L7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r4 = 1
            r2[r4] = r0
            java.lang.String r4 = "Invalid padding '%d'. Padding must be between 0 and %d (inclusive)."
            java.lang.String r4 = java.lang.String.format(r4, r2)
            r1.<init>(r4)
            throw r1
    }

    public static void writeFrameHeader(io.netty.buffer.ByteBuf r1, int r2, byte r3, io.netty.handler.codec.http2.Http2Flags r4, int r5) {
            int r0 = r2 + 9
            r1.ensureWritable(r0)
            writeFrameHeaderInternal(r1, r2, r3, r4, r5)
            return
    }

    static void writeFrameHeaderInternal(io.netty.buffer.ByteBuf r0, int r1, byte r2, io.netty.handler.codec.http2.Http2Flags r3, int r4) {
            r0.writeMedium(r1)
            r0.writeByte(r2)
            short r1 = r3.value()
            r0.writeByte(r1)
            r0.writeInt(r4)
            return
    }
}
