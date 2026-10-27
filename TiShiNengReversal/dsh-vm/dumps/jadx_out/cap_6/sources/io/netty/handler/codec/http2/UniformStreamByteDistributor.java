package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class UniformStreamByteDistributor implements io.netty.handler.codec.http2.StreamByteDistributor {
    private int minAllocationChunk;
    private final java.util.Deque<io.netty.handler.codec.http2.UniformStreamByteDistributor.State> queue;
    private final io.netty.handler.codec.http2.Http2Connection.PropertyKey stateKey;
    private long totalStreamableBytes;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class State {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        boolean enqueued;
        final io.netty.handler.codec.http2.Http2Stream stream;
        int streamableBytes;
        final /* synthetic */ io.netty.handler.codec.http2.UniformStreamByteDistributor this$0;
        boolean windowNegative;
        boolean writing;

        static {
                return
        }

        State(io.netty.handler.codec.http2.UniformStreamByteDistributor r1, io.netty.handler.codec.http2.Http2Stream r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.stream = r2
                return
        }

        void addToQueue() {
                r1 = this;
                boolean r0 = r1.enqueued
                if (r0 != 0) goto L10
                r0 = 1
                r1.enqueued = r0
                io.netty.handler.codec.http2.UniformStreamByteDistributor r0 = r1.this$0
                java.util.Deque r0 = io.netty.handler.codec.http2.UniformStreamByteDistributor.access$300(r0)
                r0.addLast(r1)
            L10:
                return
        }

        void close() {
                r1 = this;
                r1.removeFromQueue()
                r0 = 0
                r1.updateStreamableBytes(r0, r0, r0)
                return
        }

        void removeFromQueue() {
                r1 = this;
                boolean r0 = r1.enqueued
                if (r0 == 0) goto L10
                r0 = 0
                r1.enqueued = r0
                io.netty.handler.codec.http2.UniformStreamByteDistributor r0 = r1.this$0
                java.util.Deque r0 = io.netty.handler.codec.http2.UniformStreamByteDistributor.access$300(r0)
                r0.remove(r1)
            L10:
                return
        }

        void updateStreamableBytes(int r6, boolean r7, int r8) {
                r5 = this;
                int r0 = r5.streamableBytes
                int r0 = r6 - r0
                if (r0 == 0) goto L13
                r5.streamableBytes = r6
                io.netty.handler.codec.http2.UniformStreamByteDistributor r6 = r5.this$0
                long r1 = io.netty.handler.codec.http2.UniformStreamByteDistributor.access$200(r6)
                long r3 = (long) r0
                long r1 = r1 + r3
                io.netty.handler.codec.http2.UniformStreamByteDistributor.access$202(r6, r1)
            L13:
                if (r8 >= 0) goto L17
                r6 = 1
                goto L18
            L17:
                r6 = 0
            L18:
                r5.windowNegative = r6
                if (r7 == 0) goto L27
                if (r8 > 0) goto L24
                if (r8 != 0) goto L27
                boolean r6 = r5.writing
                if (r6 != 0) goto L27
            L24:
                r5.addToQueue()
            L27:
                return
        }

        void write(int r4, io.netty.handler.codec.http2.StreamByteDistributor.Writer r5) throws io.netty.handler.codec.http2.Http2Exception {
                r3 = this;
                r0 = 1
                r3.writing = r0
                r0 = 0
                io.netty.handler.codec.http2.Http2Stream r1 = r3.stream     // Catch: java.lang.Throwable -> Lc
                r5.write(r1, r4)     // Catch: java.lang.Throwable -> Lc
                r3.writing = r0
                return
            Lc:
                r4 = move-exception
                io.netty.handler.codec.http2.Http2Error r5 = io.netty.handler.codec.http2.Http2Error.INTERNAL_ERROR     // Catch: java.lang.Throwable -> L18
                java.lang.String r1 = "byte distribution write error"
                java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L18
                io.netty.handler.codec.http2.Http2Exception r4 = io.netty.handler.codec.http2.Http2Exception.connectionError(r5, r4, r1, r2)     // Catch: java.lang.Throwable -> L18
                throw r4     // Catch: java.lang.Throwable -> L18
            L18:
                r4 = move-exception
                r3.writing = r0
                throw r4
        }
    }

    public UniformStreamByteDistributor(io.netty.handler.codec.http2.Http2Connection r4) {
            r3 = this;
            r3.<init>()
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r1 = 4
            r0.<init>(r1)
            r3.queue = r0
            r0 = 1024(0x400, float:1.435E-42)
            r3.minAllocationChunk = r0
            io.netty.handler.codec.http2.Http2Connection$PropertyKey r0 = r4.newKey()
            r3.stateKey = r0
            io.netty.handler.codec.http2.Http2Stream r1 = r4.connectionStream()
            io.netty.handler.codec.http2.UniformStreamByteDistributor$State r2 = new io.netty.handler.codec.http2.UniformStreamByteDistributor$State
            r2.<init>(r3, r1)
            r1.setProperty(r0, r2)
            io.netty.handler.codec.http2.UniformStreamByteDistributor$1 r0 = new io.netty.handler.codec.http2.UniformStreamByteDistributor$1
            r0.<init>(r3)
            r4.addListener(r0)
            return
    }

    static /* synthetic */ io.netty.handler.codec.http2.Http2Connection.PropertyKey access$000(io.netty.handler.codec.http2.UniformStreamByteDistributor r0) {
            io.netty.handler.codec.http2.Http2Connection$PropertyKey r0 = r0.stateKey
            return r0
    }

    static /* synthetic */ io.netty.handler.codec.http2.UniformStreamByteDistributor.State access$100(io.netty.handler.codec.http2.UniformStreamByteDistributor r0, io.netty.handler.codec.http2.Http2Stream r1) {
            io.netty.handler.codec.http2.UniformStreamByteDistributor$State r0 = r0.state(r1)
            return r0
    }

    static /* synthetic */ long access$200(io.netty.handler.codec.http2.UniformStreamByteDistributor r2) {
            long r0 = r2.totalStreamableBytes
            return r0
    }

    static /* synthetic */ long access$202(io.netty.handler.codec.http2.UniformStreamByteDistributor r0, long r1) {
            r0.totalStreamableBytes = r1
            return r1
    }

    static /* synthetic */ java.util.Deque access$300(io.netty.handler.codec.http2.UniformStreamByteDistributor r0) {
            java.util.Deque<io.netty.handler.codec.http2.UniformStreamByteDistributor$State> r0 = r0.queue
            return r0
    }

    private io.netty.handler.codec.http2.UniformStreamByteDistributor.State state(io.netty.handler.codec.http2.Http2Stream r2) {
            r1 = this;
            java.lang.String r0 = "stream"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.handler.codec.http2.Http2Stream r2 = (io.netty.handler.codec.http2.Http2Stream) r2
            io.netty.handler.codec.http2.Http2Connection$PropertyKey r0 = r1.stateKey
            java.lang.Object r2 = r2.getProperty(r0)
            io.netty.handler.codec.http2.UniformStreamByteDistributor$State r2 = (io.netty.handler.codec.http2.UniformStreamByteDistributor.State) r2
            return r2
    }

    @Override // io.netty.handler.codec.http2.StreamByteDistributor
    public boolean distribute(int r8, io.netty.handler.codec.http2.StreamByteDistributor.Writer r9) throws io.netty.handler.codec.http2.Http2Exception {
            r7 = this;
            java.util.Deque<io.netty.handler.codec.http2.UniformStreamByteDistributor$State> r0 = r7.queue
            int r0 = r0.size()
            r1 = 0
            r3 = 0
            r4 = 1
            if (r0 != 0) goto L14
            long r8 = r7.totalStreamableBytes
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L13
            return r4
        L13:
            return r3
        L14:
            int r5 = r7.minAllocationChunk
            int r0 = r8 / r0
            int r0 = java.lang.Math.max(r5, r0)
            java.util.Deque<io.netty.handler.codec.http2.UniformStreamByteDistributor$State> r5 = r7.queue
            java.lang.Object r5 = r5.pollFirst()
            io.netty.handler.codec.http2.UniformStreamByteDistributor$State r5 = (io.netty.handler.codec.http2.UniformStreamByteDistributor.State) r5
        L24:
            r5.enqueued = r3
            boolean r6 = r5.windowNegative
            if (r6 == 0) goto L2b
            goto L47
        L2b:
            if (r8 != 0) goto L39
            int r6 = r5.streamableBytes
            if (r6 <= 0) goto L39
            java.util.Deque<io.netty.handler.codec.http2.UniformStreamByteDistributor$State> r8 = r7.queue
            r8.addFirst(r5)
            r5.enqueued = r4
            goto L51
        L39:
            int r6 = r5.streamableBytes
            int r6 = java.lang.Math.min(r8, r6)
            int r6 = java.lang.Math.min(r0, r6)
            int r8 = r8 - r6
            r5.write(r6, r9)
        L47:
            java.util.Deque<io.netty.handler.codec.http2.UniformStreamByteDistributor$State> r5 = r7.queue
            java.lang.Object r5 = r5.pollFirst()
            io.netty.handler.codec.http2.UniformStreamByteDistributor$State r5 = (io.netty.handler.codec.http2.UniformStreamByteDistributor.State) r5
            if (r5 != 0) goto L24
        L51:
            long r8 = r7.totalStreamableBytes
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L58
            return r4
        L58:
            return r3
    }

    public void minAllocationChunk(int r2) {
            r1 = this;
            java.lang.String r0 = "minAllocationChunk"
            io.netty.util.internal.ObjectUtil.checkPositive(r2, r0)
            r1.minAllocationChunk = r2
            return
    }

    @Override // io.netty.handler.codec.http2.StreamByteDistributor
    public void updateDependencyTree(int r1, int r2, short r3, boolean r4) {
            r0 = this;
            return
    }

    @Override // io.netty.handler.codec.http2.StreamByteDistributor
    public void updateStreamableBytes(io.netty.handler.codec.http2.StreamByteDistributor.StreamState r4) {
            r3 = this;
            io.netty.handler.codec.http2.Http2Stream r0 = r4.stream()
            io.netty.handler.codec.http2.UniformStreamByteDistributor$State r0 = r3.state(r0)
            int r1 = io.netty.handler.codec.http2.Http2CodecUtil.streamableBytes(r4)
            boolean r2 = r4.hasFrame()
            int r4 = r4.windowSize()
            r0.updateStreamableBytes(r1, r2, r4)
            return
    }
}
