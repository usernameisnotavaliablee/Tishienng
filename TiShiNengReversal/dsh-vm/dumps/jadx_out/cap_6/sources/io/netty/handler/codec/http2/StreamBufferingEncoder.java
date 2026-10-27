package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class StreamBufferingEncoder extends io.netty.handler.codec.http2.DecoratingHttp2ConnectionEncoder {
    private boolean closed;
    private int maxConcurrentStreams;
    private final java.util.TreeMap<java.lang.Integer, io.netty.handler.codec.http2.StreamBufferingEncoder.PendingStream> pendingStreams;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class DataFrame extends io.netty.handler.codec.http2.StreamBufferingEncoder.Frame {
        final io.netty.buffer.ByteBuf data;
        final boolean endOfStream;
        final int padding;
        final /* synthetic */ io.netty.handler.codec.http2.StreamBufferingEncoder this$0;

        DataFrame(io.netty.handler.codec.http2.StreamBufferingEncoder r1, io.netty.buffer.ByteBuf r2, int r3, boolean r4, io.netty.channel.ChannelPromise r5) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r5)
                r0.data = r2
                r0.padding = r3
                r0.endOfStream = r4
                return
        }

        @Override // io.netty.handler.codec.http2.StreamBufferingEncoder.Frame
        void release(java.lang.Throwable r1) {
                r0 = this;
                super.release(r1)
                io.netty.buffer.ByteBuf r1 = r0.data
                io.netty.util.ReferenceCountUtil.safeRelease(r1)
                return
        }

        @Override // io.netty.handler.codec.http2.StreamBufferingEncoder.Frame
        void send(io.netty.channel.ChannelHandlerContext r8, int r9) {
                r7 = this;
                io.netty.handler.codec.http2.StreamBufferingEncoder r0 = r7.this$0
                io.netty.buffer.ByteBuf r3 = r7.data
                int r4 = r7.padding
                boolean r5 = r7.endOfStream
                io.netty.channel.ChannelPromise r6 = r7.promise
                r1 = r8
                r2 = r9
                r0.writeData(r1, r2, r3, r4, r5, r6)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static abstract class Frame {
        final io.netty.channel.ChannelPromise promise;

        Frame(io.netty.channel.ChannelPromise r1) {
                r0 = this;
                r0.<init>()
                r0.promise = r1
                return
        }

        void release(java.lang.Throwable r2) {
                r1 = this;
                if (r2 != 0) goto L8
                io.netty.channel.ChannelPromise r2 = r1.promise
                r2.setSuccess()
                return
            L8:
                io.netty.channel.ChannelPromise r0 = r1.promise
                r0.setFailure(r2)
                return
        }

        abstract void send(io.netty.channel.ChannelHandlerContext r1, int r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class HeadersFrame extends io.netty.handler.codec.http2.StreamBufferingEncoder.Frame {
        final boolean endOfStream;
        final boolean exclusive;
        final io.netty.handler.codec.http2.Http2Headers headers;
        final int padding;
        final int streamDependency;
        final /* synthetic */ io.netty.handler.codec.http2.StreamBufferingEncoder this$0;
        final short weight;

        HeadersFrame(io.netty.handler.codec.http2.StreamBufferingEncoder r1, io.netty.handler.codec.http2.Http2Headers r2, int r3, short r4, boolean r5, int r6, boolean r7, io.netty.channel.ChannelPromise r8) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r8)
                r0.headers = r2
                r0.streamDependency = r3
                r0.weight = r4
                r0.exclusive = r5
                r0.padding = r6
                r0.endOfStream = r7
                return
        }

        @Override // io.netty.handler.codec.http2.StreamBufferingEncoder.Frame
        void send(io.netty.channel.ChannelHandlerContext r11, int r12) {
                r10 = this;
                io.netty.handler.codec.http2.StreamBufferingEncoder r0 = r10.this$0
                io.netty.handler.codec.http2.Http2Headers r3 = r10.headers
                int r4 = r10.streamDependency
                short r5 = r10.weight
                boolean r6 = r10.exclusive
                int r7 = r10.padding
                boolean r8 = r10.endOfStream
                io.netty.channel.ChannelPromise r9 = r10.promise
                r1 = r11
                r2 = r12
                r0.writeHeaders(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Http2ChannelClosedException extends io.netty.handler.codec.http2.Http2Exception {
        private static final long serialVersionUID = 4768543442094476971L;

        public Http2ChannelClosedException() {
                r2 = this;
                io.netty.handler.codec.http2.Http2Error r0 = io.netty.handler.codec.http2.Http2Error.REFUSED_STREAM
                java.lang.String r1 = "Connection closed"
                r2.<init>(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Http2GoAwayException extends io.netty.handler.codec.http2.Http2Exception {
        private static final long serialVersionUID = 1326785622777291198L;
        private final byte[] debugData;
        private final long errorCode;
        private final int lastStreamId;

        public Http2GoAwayException(int r2, long r3, byte[] r5) {
                r1 = this;
                io.netty.handler.codec.http2.Http2Error r0 = io.netty.handler.codec.http2.Http2Error.STREAM_CLOSED
                r1.<init>(r0)
                r1.lastStreamId = r2
                r1.errorCode = r3
                r1.debugData = r5
                return
        }

        public byte[] debugData() {
                r1 = this;
                byte[] r0 = r1.debugData
                return r0
        }

        public long errorCode() {
                r2 = this;
                long r0 = r2.errorCode
                return r0
        }

        public int lastStreamId() {
                r1 = this;
                int r0 = r1.lastStreamId
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class PendingStream {
        final io.netty.channel.ChannelHandlerContext ctx;
        final java.util.Queue<io.netty.handler.codec.http2.StreamBufferingEncoder.Frame> frames;
        final int streamId;

        PendingStream(io.netty.channel.ChannelHandlerContext r3, int r4) {
                r2 = this;
                r2.<init>()
                java.util.ArrayDeque r0 = new java.util.ArrayDeque
                r1 = 2
                r0.<init>(r1)
                r2.frames = r0
                r2.ctx = r3
                r2.streamId = r4
                return
        }

        void close(java.lang.Throwable r3) {
                r2 = this;
                java.util.Queue<io.netty.handler.codec.http2.StreamBufferingEncoder$Frame> r0 = r2.frames
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L16
                java.lang.Object r1 = r0.next()
                io.netty.handler.codec.http2.StreamBufferingEncoder$Frame r1 = (io.netty.handler.codec.http2.StreamBufferingEncoder.Frame) r1
                r1.release(r3)
                goto L6
            L16:
                return
        }

        void sendFrames() {
                r4 = this;
                java.util.Queue<io.netty.handler.codec.http2.StreamBufferingEncoder$Frame> r0 = r4.frames
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1a
                java.lang.Object r1 = r0.next()
                io.netty.handler.codec.http2.StreamBufferingEncoder$Frame r1 = (io.netty.handler.codec.http2.StreamBufferingEncoder.Frame) r1
                io.netty.channel.ChannelHandlerContext r2 = r4.ctx
                int r3 = r4.streamId
                r1.send(r2, r3)
                goto L6
            L1a:
                return
        }
    }

    public StreamBufferingEncoder(io.netty.handler.codec.http2.Http2ConnectionEncoder r2) {
            r1 = this;
            r0 = 100
            r1.<init>(r2, r0)
            return
    }

    public StreamBufferingEncoder(io.netty.handler.codec.http2.Http2ConnectionEncoder r1, int r2) {
            r0 = this;
            r0.<init>(r1)
            java.util.TreeMap r1 = new java.util.TreeMap
            r1.<init>()
            r0.pendingStreams = r1
            r0.maxConcurrentStreams = r2
            io.netty.handler.codec.http2.Http2Connection r1 = r0.connection()
            io.netty.handler.codec.http2.StreamBufferingEncoder$1 r2 = new io.netty.handler.codec.http2.StreamBufferingEncoder$1
            r2.<init>(r0)
            r1.addListener(r2)
            return
    }

    static /* synthetic */ void access$000(io.netty.handler.codec.http2.StreamBufferingEncoder r0, int r1, long r2, io.netty.buffer.ByteBuf r4) {
            r0.cancelGoAwayStreams(r1, r2, r4)
            return
    }

    static /* synthetic */ void access$100(io.netty.handler.codec.http2.StreamBufferingEncoder r0) {
            r0.tryCreatePendingStreams()
            return
    }

    private boolean canCreateStream() {
            r2 = this;
            io.netty.handler.codec.http2.Http2Connection r0 = r2.connection()
            io.netty.handler.codec.http2.Http2Connection$Endpoint r0 = r0.local()
            int r0 = r0.numActiveStreams()
            int r1 = r2.maxConcurrentStreams
            if (r0 >= r1) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }

    private void cancelGoAwayStreams(int r3, long r4, io.netty.buffer.ByteBuf r6) {
            r2 = this;
            java.util.TreeMap<java.lang.Integer, io.netty.handler.codec.http2.StreamBufferingEncoder$PendingStream> r0 = r2.pendingStreams
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            io.netty.handler.codec.http2.StreamBufferingEncoder$Http2GoAwayException r1 = new io.netty.handler.codec.http2.StreamBufferingEncoder$Http2GoAwayException
            byte[] r6 = io.netty.buffer.ByteBufUtil.getBytes(r6)
            r1.<init>(r3, r4, r6)
        L13:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L2a
            java.lang.Object r4 = r0.next()
            io.netty.handler.codec.http2.StreamBufferingEncoder$PendingStream r4 = (io.netty.handler.codec.http2.StreamBufferingEncoder.PendingStream) r4
            int r5 = r4.streamId
            if (r5 <= r3) goto L13
            r0.remove()
            r4.close(r1)
            goto L13
        L2a:
            return
    }

    private boolean isExistingStream(int r2) {
            r1 = this;
            io.netty.handler.codec.http2.Http2Connection r0 = r1.connection()
            io.netty.handler.codec.http2.Http2Connection$Endpoint r0 = r0.local()
            int r0 = r0.lastStreamCreated()
            if (r2 > r0) goto L10
            r2 = 1
            return r2
        L10:
            r2 = 0
            return r2
    }

    private void tryCreatePendingStreams() {
            r2 = this;
        L0:
            java.util.TreeMap<java.lang.Integer, io.netty.handler.codec.http2.StreamBufferingEncoder$PendingStream> r0 = r2.pendingStreams
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L23
            boolean r0 = r2.canCreateStream()
            if (r0 == 0) goto L23
            java.util.TreeMap<java.lang.Integer, io.netty.handler.codec.http2.StreamBufferingEncoder$PendingStream> r0 = r2.pendingStreams
            java.util.Map$Entry r0 = r0.pollFirstEntry()
            java.lang.Object r0 = r0.getValue()
            io.netty.handler.codec.http2.StreamBufferingEncoder$PendingStream r0 = (io.netty.handler.codec.http2.StreamBufferingEncoder.PendingStream) r0
            r0.sendFrames()     // Catch: java.lang.Throwable -> L1e
            goto L0
        L1e:
            r1 = move-exception
            r0.close(r1)
            goto L0
        L23:
            return
    }

    @Override // io.netty.handler.codec.http2.DecoratingHttp2FrameWriter, io.netty.handler.codec.http2.Http2FrameWriter, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r2 = this;
            boolean r0 = r2.closed     // Catch: java.lang.Throwable -> L24
            if (r0 != 0) goto L26
            r0 = 1
            r2.closed = r0     // Catch: java.lang.Throwable -> L24
            io.netty.handler.codec.http2.StreamBufferingEncoder$Http2ChannelClosedException r0 = new io.netty.handler.codec.http2.StreamBufferingEncoder$Http2ChannelClosedException     // Catch: java.lang.Throwable -> L24
            r0.<init>()     // Catch: java.lang.Throwable -> L24
        Lc:
            java.util.TreeMap<java.lang.Integer, io.netty.handler.codec.http2.StreamBufferingEncoder$PendingStream> r1 = r2.pendingStreams     // Catch: java.lang.Throwable -> L24
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L24
            if (r1 != 0) goto L26
            java.util.TreeMap<java.lang.Integer, io.netty.handler.codec.http2.StreamBufferingEncoder$PendingStream> r1 = r2.pendingStreams     // Catch: java.lang.Throwable -> L24
            java.util.Map$Entry r1 = r1.pollFirstEntry()     // Catch: java.lang.Throwable -> L24
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L24
            io.netty.handler.codec.http2.StreamBufferingEncoder$PendingStream r1 = (io.netty.handler.codec.http2.StreamBufferingEncoder.PendingStream) r1     // Catch: java.lang.Throwable -> L24
            r1.close(r0)     // Catch: java.lang.Throwable -> L24
            goto Lc
        L24:
            r0 = move-exception
            goto L2a
        L26:
            super.close()
            return
        L2a:
            super.close()
            throw r0
    }

    public int numBufferedStreams() {
            r1 = this;
            java.util.TreeMap<java.lang.Integer, io.netty.handler.codec.http2.StreamBufferingEncoder$PendingStream> r0 = r1.pendingStreams
            int r0 = r0.size()
            return r0
    }

    @Override // io.netty.handler.codec.http2.DecoratingHttp2ConnectionEncoder, io.netty.handler.codec.http2.Http2ConnectionEncoder
    public void remoteSettings(io.netty.handler.codec.http2.Http2Settings r1) throws io.netty.handler.codec.http2.Http2Exception {
            r0 = this;
            super.remoteSettings(r1)
            io.netty.handler.codec.http2.Http2Connection r1 = r0.connection()
            io.netty.handler.codec.http2.Http2Connection$Endpoint r1 = r1.local()
            int r1 = r1.maxActiveStreams()
            r0.maxConcurrentStreams = r1
            r0.tryCreatePendingStreams()
            return
    }

    @Override // io.netty.handler.codec.http2.DecoratingHttp2FrameWriter, io.netty.handler.codec.http2.Http2DataWriter
    public io.netty.channel.ChannelFuture writeData(io.netty.channel.ChannelHandlerContext r3, int r4, io.netty.buffer.ByteBuf r5, int r6, boolean r7, io.netty.channel.ChannelPromise r8) {
            r2 = this;
            boolean r0 = r2.isExistingStream(r4)
            if (r0 == 0) goto Lc
            io.netty.channel.ChannelFuture r3 = super.writeData(r3, r4, r5, r6, r7, r8)
            r4 = r2
            return r3
        Lc:
            r3 = r4
            r4 = r2
            java.util.TreeMap<java.lang.Integer, io.netty.handler.codec.http2.StreamBufferingEncoder$PendingStream> r0 = r4.pendingStreams
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Object r0 = r0.get(r1)
            io.netty.handler.codec.http2.StreamBufferingEncoder$PendingStream r0 = (io.netty.handler.codec.http2.StreamBufferingEncoder.PendingStream) r0
            if (r0 == 0) goto L27
            java.util.Queue<io.netty.handler.codec.http2.StreamBufferingEncoder$Frame> r0 = r0.frames
            io.netty.handler.codec.http2.StreamBufferingEncoder$DataFrame r3 = new io.netty.handler.codec.http2.StreamBufferingEncoder$DataFrame
            r3.<init>(r4, r5, r6, r7, r8)
            r0.add(r3)
            return r8
        L27:
            io.netty.util.ReferenceCountUtil.safeRelease(r5)
            io.netty.handler.codec.http2.Http2Error r4 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6 = 0
            r5[r6] = r3
            java.lang.String r3 = "Stream does not exist %d"
            io.netty.handler.codec.http2.Http2Exception r3 = io.netty.handler.codec.http2.Http2Exception.connectionError(r4, r3, r5)
            r8.setFailure(r3)
            return r8
    }

    @Override // io.netty.handler.codec.http2.DecoratingHttp2FrameWriter, io.netty.handler.codec.http2.Http2FrameWriter
    public io.netty.channel.ChannelFuture writeHeaders(io.netty.channel.ChannelHandlerContext r4, int r5, io.netty.handler.codec.http2.Http2Headers r6, int r7, short r8, boolean r9, int r10, boolean r11, io.netty.channel.ChannelPromise r12) {
            r3 = this;
            boolean r0 = r3.closed
            if (r0 == 0) goto Le
            io.netty.handler.codec.http2.StreamBufferingEncoder$Http2ChannelClosedException r4 = new io.netty.handler.codec.http2.StreamBufferingEncoder$Http2ChannelClosedException
            r4.<init>()
            io.netty.channel.ChannelPromise r4 = r12.setFailure(r4)
            return r4
        Le:
            boolean r0 = r3.isExistingStream(r5)
            if (r0 != 0) goto L62
            io.netty.handler.codec.http2.Http2Connection r0 = r3.connection()
            boolean r0 = r0.goAwayReceived()
            if (r0 == 0) goto L1f
            goto L62
        L1f:
            boolean r0 = r3.canCreateStream()
            if (r0 == 0) goto L2b
            io.netty.channel.ChannelFuture r4 = super.writeHeaders(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r5 = r3
            return r4
        L2b:
            r0 = r12
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r3
            java.util.TreeMap<java.lang.Integer, io.netty.handler.codec.http2.StreamBufferingEncoder$PendingStream> r1 = r6.pendingStreams
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            java.lang.Object r1 = r1.get(r2)
            io.netty.handler.codec.http2.StreamBufferingEncoder$PendingStream r1 = (io.netty.handler.codec.http2.StreamBufferingEncoder.PendingStream) r1
            if (r1 != 0) goto L4f
            io.netty.handler.codec.http2.StreamBufferingEncoder$PendingStream r1 = new io.netty.handler.codec.http2.StreamBufferingEncoder$PendingStream
            r1.<init>(r4, r5)
            java.util.TreeMap<java.lang.Integer, io.netty.handler.codec.http2.StreamBufferingEncoder$PendingStream> r4 = r6.pendingStreams
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.put(r5, r1)
        L4f:
            java.util.Queue<io.netty.handler.codec.http2.StreamBufferingEncoder$Frame> r1 = r1.frames
            io.netty.handler.codec.http2.StreamBufferingEncoder$HeadersFrame r4 = new io.netty.handler.codec.http2.StreamBufferingEncoder$HeadersFrame
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r1.add(r4)
            return r12
        L62:
            io.netty.channel.ChannelFuture r4 = super.writeHeaders(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r4
    }

    @Override // io.netty.handler.codec.http2.DecoratingHttp2FrameWriter, io.netty.handler.codec.http2.Http2FrameWriter
    public io.netty.channel.ChannelFuture writeHeaders(io.netty.channel.ChannelHandlerContext r11, int r12, io.netty.handler.codec.http2.Http2Headers r13, int r14, boolean r15, io.netty.channel.ChannelPromise r16) {
            r10 = this;
            r5 = 16
            r6 = 0
            r4 = 0
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r7 = r14
            r8 = r15
            r9 = r16
            io.netty.channel.ChannelFuture r11 = r0.writeHeaders(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r11
    }

    @Override // io.netty.handler.codec.http2.DecoratingHttp2FrameWriter, io.netty.handler.codec.http2.Http2FrameWriter
    public io.netty.channel.ChannelFuture writeRstStream(io.netty.channel.ChannelHandlerContext r2, int r3, long r4, io.netty.channel.ChannelPromise r6) {
            r1 = this;
            boolean r0 = r1.isExistingStream(r3)
            if (r0 == 0) goto Lc
            io.netty.channel.ChannelFuture r2 = super.writeRstStream(r2, r3, r4, r6)
            r3 = r1
            return r2
        Lc:
            r2 = r3
            r3 = r1
            java.util.TreeMap<java.lang.Integer, io.netty.handler.codec.http2.StreamBufferingEncoder$PendingStream> r4 = r3.pendingStreams
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            java.lang.Object r4 = r4.remove(r5)
            io.netty.handler.codec.http2.StreamBufferingEncoder$PendingStream r4 = (io.netty.handler.codec.http2.StreamBufferingEncoder.PendingStream) r4
            if (r4 == 0) goto L24
            r2 = 0
            r4.close(r2)
            r6.setSuccess()
            return r6
        L24:
            io.netty.handler.codec.http2.Http2Error r4 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r0 = 0
            r5[r0] = r2
            java.lang.String r2 = "Stream does not exist %d"
            io.netty.handler.codec.http2.Http2Exception r2 = io.netty.handler.codec.http2.Http2Exception.connectionError(r4, r2, r5)
            r6.setFailure(r2)
            return r6
    }
}
