package io.netty.handler.timeout;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class IdleStateHandler extends io.netty.channel.ChannelDuplexHandler {
    private static final long MIN_TIMEOUT_NANOS = 0;
    private final long allIdleTimeNanos;
    private java.util.concurrent.ScheduledFuture<?> allIdleTimeout;
    private boolean firstAllIdleEvent;
    private boolean firstReaderIdleEvent;
    private boolean firstWriterIdleEvent;
    private long lastChangeCheckTimeStamp;
    private long lastFlushProgress;
    private int lastMessageHashCode;
    private long lastPendingWriteBytes;
    private long lastReadTime;
    private long lastWriteTime;
    private final boolean observeOutput;
    private final long readerIdleTimeNanos;
    private java.util.concurrent.ScheduledFuture<?> readerIdleTimeout;
    private boolean reading;
    private byte state;
    private final io.netty.channel.ChannelFutureListener writeListener;
    private final long writerIdleTimeNanos;
    private java.util.concurrent.ScheduledFuture<?> writerIdleTimeout;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.timeout.IdleStateHandler$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$timeout$IdleState = null;

        static {
                io.netty.handler.timeout.IdleState[] r0 = io.netty.handler.timeout.IdleState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.handler.timeout.IdleStateHandler.AnonymousClass2.$SwitchMap$io$netty$handler$timeout$IdleState = r0
                io.netty.handler.timeout.IdleState r1 = io.netty.handler.timeout.IdleState.ALL_IDLE     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.handler.timeout.IdleStateHandler.AnonymousClass2.$SwitchMap$io$netty$handler$timeout$IdleState     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.handler.timeout.IdleState r1 = io.netty.handler.timeout.IdleState.READER_IDLE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = io.netty.handler.timeout.IdleStateHandler.AnonymousClass2.$SwitchMap$io$netty$handler$timeout$IdleState     // Catch: java.lang.NoSuchFieldError -> L28
                io.netty.handler.timeout.IdleState r1 = io.netty.handler.timeout.IdleState.WRITER_IDLE     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }

        public AnonymousClass2() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static abstract class AbstractIdleTask implements java.lang.Runnable {
        private final io.netty.channel.ChannelHandlerContext ctx;

        AbstractIdleTask(io.netty.channel.ChannelHandlerContext r1) {
                r0 = this;
                r0.<init>()
                r0.ctx = r1
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                io.netty.channel.ChannelHandlerContext r0 = r1.ctx
                io.netty.channel.Channel r0 = r0.channel()
                boolean r0 = r0.isOpen()
                if (r0 != 0) goto Ld
                return
            Ld:
                io.netty.channel.ChannelHandlerContext r0 = r1.ctx
                r1.run(r0)
                return
        }

        protected abstract void run(io.netty.channel.ChannelHandlerContext r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class AllIdleTimeoutTask extends io.netty.handler.timeout.IdleStateHandler.AbstractIdleTask {
        final /* synthetic */ io.netty.handler.timeout.IdleStateHandler this$0;

        AllIdleTimeoutTask(io.netty.handler.timeout.IdleStateHandler r1, io.netty.channel.ChannelHandlerContext r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        @Override // io.netty.handler.timeout.IdleStateHandler.AbstractIdleTask
        protected void run(io.netty.channel.ChannelHandlerContext r14) {
                r13 = this;
                io.netty.handler.timeout.IdleStateHandler r0 = r13.this$0
                long r0 = io.netty.handler.timeout.IdleStateHandler.access$1100(r0)
                io.netty.handler.timeout.IdleStateHandler r2 = r13.this$0
                boolean r2 = io.netty.handler.timeout.IdleStateHandler.access$400(r2)
                if (r2 != 0) goto L26
                io.netty.handler.timeout.IdleStateHandler r2 = r13.this$0
                long r2 = r2.ticksInNanos()
                io.netty.handler.timeout.IdleStateHandler r4 = r13.this$0
                long r4 = io.netty.handler.timeout.IdleStateHandler.access$500(r4)
                io.netty.handler.timeout.IdleStateHandler r6 = r13.this$0
                long r6 = io.netty.handler.timeout.IdleStateHandler.access$000(r6)
                long r4 = java.lang.Math.max(r4, r6)
                long r2 = r2 - r4
                long r0 = r0 - r2
            L26:
                r5 = r0
                r0 = 0
                int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r2 > 0) goto L69
                io.netty.handler.timeout.IdleStateHandler r7 = r13.this$0
                long r10 = io.netty.handler.timeout.IdleStateHandler.access$1100(r7)
                java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.NANOSECONDS
                r9 = r13
                r8 = r14
                java.util.concurrent.ScheduledFuture r14 = r7.schedule(r8, r9, r10, r12)
                r3 = r8
                r4 = r9
                io.netty.handler.timeout.IdleStateHandler.access$1202(r7, r14)
                io.netty.handler.timeout.IdleStateHandler r14 = r4.this$0
                boolean r14 = io.netty.handler.timeout.IdleStateHandler.access$200(r14)
                io.netty.handler.timeout.IdleStateHandler r0 = r4.this$0
                r1 = 0
                io.netty.handler.timeout.IdleStateHandler.access$202(r0, r1)
                io.netty.handler.timeout.IdleStateHandler r0 = r4.this$0     // Catch: java.lang.Throwable -> L63
                boolean r0 = io.netty.handler.timeout.IdleStateHandler.access$1000(r0, r3, r14)     // Catch: java.lang.Throwable -> L63
                if (r0 == 0) goto L55
                goto L68
            L55:
                io.netty.handler.timeout.IdleStateHandler r0 = r4.this$0     // Catch: java.lang.Throwable -> L63
                io.netty.handler.timeout.IdleState r1 = io.netty.handler.timeout.IdleState.ALL_IDLE     // Catch: java.lang.Throwable -> L63
                io.netty.handler.timeout.IdleStateEvent r14 = r0.newIdleStateEvent(r1, r14)     // Catch: java.lang.Throwable -> L63
                io.netty.handler.timeout.IdleStateHandler r0 = r4.this$0     // Catch: java.lang.Throwable -> L63
                r0.channelIdle(r3, r14)     // Catch: java.lang.Throwable -> L63
                goto L68
            L63:
                r0 = move-exception
                r14 = r0
                r3.fireExceptionCaught(r14)
            L68:
                return
            L69:
                r4 = r13
                r3 = r14
                io.netty.handler.timeout.IdleStateHandler r2 = r4.this$0
                java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.NANOSECONDS
                java.util.concurrent.ScheduledFuture r14 = r2.schedule(r3, r4, r5, r7)
                io.netty.handler.timeout.IdleStateHandler.access$1202(r2, r14)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class ReaderIdleTimeoutTask extends io.netty.handler.timeout.IdleStateHandler.AbstractIdleTask {
        final /* synthetic */ io.netty.handler.timeout.IdleStateHandler this$0;

        ReaderIdleTimeoutTask(io.netty.handler.timeout.IdleStateHandler r1, io.netty.channel.ChannelHandlerContext r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        @Override // io.netty.handler.timeout.IdleStateHandler.AbstractIdleTask
        protected void run(io.netty.channel.ChannelHandlerContext r14) {
                r13 = this;
                io.netty.handler.timeout.IdleStateHandler r0 = r13.this$0
                long r0 = io.netty.handler.timeout.IdleStateHandler.access$300(r0)
                io.netty.handler.timeout.IdleStateHandler r2 = r13.this$0
                boolean r2 = io.netty.handler.timeout.IdleStateHandler.access$400(r2)
                if (r2 != 0) goto L1c
                io.netty.handler.timeout.IdleStateHandler r2 = r13.this$0
                long r2 = r2.ticksInNanos()
                io.netty.handler.timeout.IdleStateHandler r4 = r13.this$0
                long r4 = io.netty.handler.timeout.IdleStateHandler.access$500(r4)
                long r2 = r2 - r4
                long r0 = r0 - r2
            L1c:
                r5 = r0
                r0 = 0
                int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r2 > 0) goto L56
                io.netty.handler.timeout.IdleStateHandler r7 = r13.this$0
                long r10 = io.netty.handler.timeout.IdleStateHandler.access$300(r7)
                java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.NANOSECONDS
                r9 = r13
                r8 = r14
                java.util.concurrent.ScheduledFuture r14 = r7.schedule(r8, r9, r10, r12)
                r3 = r8
                r4 = r9
                io.netty.handler.timeout.IdleStateHandler.access$602(r7, r14)
                io.netty.handler.timeout.IdleStateHandler r14 = r4.this$0
                boolean r14 = io.netty.handler.timeout.IdleStateHandler.access$700(r14)
                io.netty.handler.timeout.IdleStateHandler r0 = r4.this$0
                r1 = 0
                io.netty.handler.timeout.IdleStateHandler.access$702(r0, r1)
                io.netty.handler.timeout.IdleStateHandler r0 = r4.this$0     // Catch: java.lang.Throwable -> L50
                io.netty.handler.timeout.IdleState r1 = io.netty.handler.timeout.IdleState.READER_IDLE     // Catch: java.lang.Throwable -> L50
                io.netty.handler.timeout.IdleStateEvent r14 = r0.newIdleStateEvent(r1, r14)     // Catch: java.lang.Throwable -> L50
                io.netty.handler.timeout.IdleStateHandler r0 = r4.this$0     // Catch: java.lang.Throwable -> L50
                r0.channelIdle(r3, r14)     // Catch: java.lang.Throwable -> L50
                goto L55
            L50:
                r0 = move-exception
                r14 = r0
                r3.fireExceptionCaught(r14)
            L55:
                return
            L56:
                r4 = r13
                r3 = r14
                io.netty.handler.timeout.IdleStateHandler r2 = r4.this$0
                java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.NANOSECONDS
                java.util.concurrent.ScheduledFuture r14 = r2.schedule(r3, r4, r5, r7)
                io.netty.handler.timeout.IdleStateHandler.access$602(r2, r14)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class WriterIdleTimeoutTask extends io.netty.handler.timeout.IdleStateHandler.AbstractIdleTask {
        final /* synthetic */ io.netty.handler.timeout.IdleStateHandler this$0;

        WriterIdleTimeoutTask(io.netty.handler.timeout.IdleStateHandler r1, io.netty.channel.ChannelHandlerContext r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        @Override // io.netty.handler.timeout.IdleStateHandler.AbstractIdleTask
        protected void run(io.netty.channel.ChannelHandlerContext r13) {
                r12 = this;
                io.netty.handler.timeout.IdleStateHandler r0 = r12.this$0
                long r0 = io.netty.handler.timeout.IdleStateHandler.access$000(r0)
                io.netty.handler.timeout.IdleStateHandler r2 = r12.this$0
                long r2 = io.netty.handler.timeout.IdleStateHandler.access$800(r2)
                io.netty.handler.timeout.IdleStateHandler r4 = r12.this$0
                long r4 = r4.ticksInNanos()
                long r4 = r4 - r0
                long r9 = r2 - r4
                r0 = 0
                int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r2 > 0) goto L55
                io.netty.handler.timeout.IdleStateHandler r3 = r12.this$0
                long r6 = io.netty.handler.timeout.IdleStateHandler.access$800(r3)
                java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.NANOSECONDS
                r5 = r12
                r4 = r13
                java.util.concurrent.ScheduledFuture r13 = r3.schedule(r4, r5, r6, r8)
                io.netty.handler.timeout.IdleStateHandler.access$902(r3, r13)
                io.netty.handler.timeout.IdleStateHandler r13 = r5.this$0
                boolean r13 = io.netty.handler.timeout.IdleStateHandler.access$100(r13)
                io.netty.handler.timeout.IdleStateHandler r0 = r5.this$0
                r1 = 0
                io.netty.handler.timeout.IdleStateHandler.access$102(r0, r1)
                io.netty.handler.timeout.IdleStateHandler r0 = r5.this$0     // Catch: java.lang.Throwable -> L4f
                boolean r0 = io.netty.handler.timeout.IdleStateHandler.access$1000(r0, r4, r13)     // Catch: java.lang.Throwable -> L4f
                if (r0 == 0) goto L41
                goto L54
            L41:
                io.netty.handler.timeout.IdleStateHandler r0 = r5.this$0     // Catch: java.lang.Throwable -> L4f
                io.netty.handler.timeout.IdleState r1 = io.netty.handler.timeout.IdleState.WRITER_IDLE     // Catch: java.lang.Throwable -> L4f
                io.netty.handler.timeout.IdleStateEvent r13 = r0.newIdleStateEvent(r1, r13)     // Catch: java.lang.Throwable -> L4f
                io.netty.handler.timeout.IdleStateHandler r0 = r5.this$0     // Catch: java.lang.Throwable -> L4f
                r0.channelIdle(r4, r13)     // Catch: java.lang.Throwable -> L4f
                goto L54
            L4f:
                r0 = move-exception
                r13 = r0
                r4.fireExceptionCaught(r13)
            L54:
                return
            L55:
                r5 = r12
                r4 = r13
                io.netty.handler.timeout.IdleStateHandler r6 = r5.this$0
                java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.NANOSECONDS
                r7 = r4
                r8 = r5
                java.util.concurrent.ScheduledFuture r13 = r6.schedule(r7, r8, r9, r11)
                io.netty.handler.timeout.IdleStateHandler.access$902(r6, r13)
                return
        }
    }

    static {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            r1 = 1
            long r0 = r0.toNanos(r1)
            io.netty.handler.timeout.IdleStateHandler.MIN_TIMEOUT_NANOS = r0
            return
    }

    public IdleStateHandler(int r9, int r10, int r11) {
            r8 = this;
            long r1 = (long) r9
            long r3 = (long) r10
            long r5 = (long) r11
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            r0 = r8
            r0.<init>(r1, r3, r5, r7)
            return
    }

    public IdleStateHandler(long r10, long r12, long r14, java.util.concurrent.TimeUnit r16) {
            r9 = this;
            r1 = 0
            r0 = r9
            r2 = r10
            r4 = r12
            r6 = r14
            r8 = r16
            r0.<init>(r1, r2, r4, r6, r8)
            return
    }

    public IdleStateHandler(boolean r5, long r6, long r8, long r10, java.util.concurrent.TimeUnit r12) {
            r4 = this;
            r4.<init>()
            io.netty.handler.timeout.IdleStateHandler$1 r0 = new io.netty.handler.timeout.IdleStateHandler$1
            r0.<init>(r4)
            r4.writeListener = r0
            r0 = 1
            r4.firstReaderIdleEvent = r0
            r4.firstWriterIdleEvent = r0
            r4.firstAllIdleEvent = r0
            if (r12 == 0) goto L51
            r4.observeOutput = r5
            r0 = 0
            int r5 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r5 > 0) goto L1e
            r4.readerIdleTimeNanos = r0
            goto L2a
        L1e:
            long r5 = r12.toNanos(r6)
            long r2 = io.netty.handler.timeout.IdleStateHandler.MIN_TIMEOUT_NANOS
            long r5 = java.lang.Math.max(r5, r2)
            r4.readerIdleTimeNanos = r5
        L2a:
            int r5 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r5 > 0) goto L31
            r4.writerIdleTimeNanos = r0
            goto L3d
        L31:
            long r5 = r12.toNanos(r8)
            long r7 = io.netty.handler.timeout.IdleStateHandler.MIN_TIMEOUT_NANOS
            long r5 = java.lang.Math.max(r5, r7)
            r4.writerIdleTimeNanos = r5
        L3d:
            int r5 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r5 > 0) goto L44
            r4.allIdleTimeNanos = r0
            return
        L44:
            long r5 = r12.toNanos(r10)
            long r7 = io.netty.handler.timeout.IdleStateHandler.MIN_TIMEOUT_NANOS
            long r5 = java.lang.Math.max(r5, r7)
            r4.allIdleTimeNanos = r5
            return
        L51:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "unit"
            r5.<init>(r6)
            throw r5
    }

    static /* synthetic */ long access$000(io.netty.handler.timeout.IdleStateHandler r2) {
            long r0 = r2.lastWriteTime
            return r0
    }

    static /* synthetic */ long access$002(io.netty.handler.timeout.IdleStateHandler r0, long r1) {
            r0.lastWriteTime = r1
            return r1
    }

    static /* synthetic */ boolean access$100(io.netty.handler.timeout.IdleStateHandler r0) {
            boolean r0 = r0.firstWriterIdleEvent
            return r0
    }

    static /* synthetic */ boolean access$1000(io.netty.handler.timeout.IdleStateHandler r0, io.netty.channel.ChannelHandlerContext r1, boolean r2) {
            boolean r0 = r0.hasOutputChanged(r1, r2)
            return r0
    }

    static /* synthetic */ boolean access$102(io.netty.handler.timeout.IdleStateHandler r0, boolean r1) {
            r0.firstWriterIdleEvent = r1
            return r1
    }

    static /* synthetic */ long access$1100(io.netty.handler.timeout.IdleStateHandler r2) {
            long r0 = r2.allIdleTimeNanos
            return r0
    }

    static /* synthetic */ java.util.concurrent.ScheduledFuture access$1202(io.netty.handler.timeout.IdleStateHandler r0, java.util.concurrent.ScheduledFuture r1) {
            r0.allIdleTimeout = r1
            return r1
    }

    static /* synthetic */ boolean access$200(io.netty.handler.timeout.IdleStateHandler r0) {
            boolean r0 = r0.firstAllIdleEvent
            return r0
    }

    static /* synthetic */ boolean access$202(io.netty.handler.timeout.IdleStateHandler r0, boolean r1) {
            r0.firstAllIdleEvent = r1
            return r1
    }

    static /* synthetic */ long access$300(io.netty.handler.timeout.IdleStateHandler r2) {
            long r0 = r2.readerIdleTimeNanos
            return r0
    }

    static /* synthetic */ boolean access$400(io.netty.handler.timeout.IdleStateHandler r0) {
            boolean r0 = r0.reading
            return r0
    }

    static /* synthetic */ long access$500(io.netty.handler.timeout.IdleStateHandler r2) {
            long r0 = r2.lastReadTime
            return r0
    }

    static /* synthetic */ java.util.concurrent.ScheduledFuture access$602(io.netty.handler.timeout.IdleStateHandler r0, java.util.concurrent.ScheduledFuture r1) {
            r0.readerIdleTimeout = r1
            return r1
    }

    static /* synthetic */ boolean access$700(io.netty.handler.timeout.IdleStateHandler r0) {
            boolean r0 = r0.firstReaderIdleEvent
            return r0
    }

    static /* synthetic */ boolean access$702(io.netty.handler.timeout.IdleStateHandler r0, boolean r1) {
            r0.firstReaderIdleEvent = r1
            return r1
    }

    static /* synthetic */ long access$800(io.netty.handler.timeout.IdleStateHandler r2) {
            long r0 = r2.writerIdleTimeNanos
            return r0
    }

    static /* synthetic */ java.util.concurrent.ScheduledFuture access$902(io.netty.handler.timeout.IdleStateHandler r0, java.util.concurrent.ScheduledFuture r1) {
            r0.writerIdleTimeout = r1
            return r1
    }

    private void destroy() {
            r3 = this;
            r0 = 2
            r3.state = r0
            java.util.concurrent.ScheduledFuture<?> r0 = r3.readerIdleTimeout
            r1 = 0
            r2 = 0
            if (r0 == 0) goto Le
            r0.cancel(r2)
            r3.readerIdleTimeout = r1
        Le:
            java.util.concurrent.ScheduledFuture<?> r0 = r3.writerIdleTimeout
            if (r0 == 0) goto L17
            r0.cancel(r2)
            r3.writerIdleTimeout = r1
        L17:
            java.util.concurrent.ScheduledFuture<?> r0 = r3.allIdleTimeout
            if (r0 == 0) goto L20
            r0.cancel(r2)
            r3.allIdleTimeout = r1
        L20:
            return
    }

    private boolean hasOutputChanged(io.netty.channel.ChannelHandlerContext r8, boolean r9) {
            r7 = this;
            boolean r0 = r7.observeOutput
            if (r0 == 0) goto L4c
            long r0 = r7.lastChangeCheckTimeStamp
            long r2 = r7.lastWriteTime
            r4 = 1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L12
            r7.lastChangeCheckTimeStamp = r2
            if (r9 != 0) goto L12
            return r4
        L12:
            io.netty.channel.Channel r8 = r8.channel()
            io.netty.channel.Channel$Unsafe r8 = r8.unsafe()
            io.netty.channel.ChannelOutboundBuffer r8 = r8.outboundBuffer()
            if (r8 == 0) goto L4c
            java.lang.Object r0 = r8.current()
            int r0 = java.lang.System.identityHashCode(r0)
            long r1 = r8.totalPendingWriteBytes()
            int r3 = r7.lastMessageHashCode
            if (r0 != r3) goto L36
            long r5 = r7.lastPendingWriteBytes
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 == 0) goto L3d
        L36:
            r7.lastMessageHashCode = r0
            r7.lastPendingWriteBytes = r1
            if (r9 != 0) goto L3d
            return r4
        L3d:
            long r0 = r8.currentProgress()
            long r2 = r7.lastFlushProgress
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 == 0) goto L4c
            r7.lastFlushProgress = r0
            if (r9 != 0) goto L4c
            return r4
        L4c:
            r8 = 0
            return r8
    }

    private void initOutputChanged(io.netty.channel.ChannelHandlerContext r3) {
            r2 = this;
            boolean r0 = r2.observeOutput
            if (r0 == 0) goto L28
            io.netty.channel.Channel r3 = r3.channel()
            io.netty.channel.Channel$Unsafe r3 = r3.unsafe()
            io.netty.channel.ChannelOutboundBuffer r3 = r3.outboundBuffer()
            if (r3 == 0) goto L28
            java.lang.Object r0 = r3.current()
            int r0 = java.lang.System.identityHashCode(r0)
            r2.lastMessageHashCode = r0
            long r0 = r3.totalPendingWriteBytes()
            r2.lastPendingWriteBytes = r0
            long r0 = r3.currentProgress()
            r2.lastFlushProgress = r0
        L28:
            return
    }

    private void initialize(io.netty.channel.ChannelHandlerContext r12) {
            r11 = this;
            byte r0 = r11.state
            r1 = 1
            if (r0 == r1) goto L5e
            r2 = 2
            if (r0 == r2) goto L5e
            r11.state = r1
            r11.initOutputChanged(r12)
            long r0 = r11.ticksInNanos()
            r11.lastWriteTime = r0
            r11.lastReadTime = r0
            long r0 = r11.readerIdleTimeNanos
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L31
            io.netty.handler.timeout.IdleStateHandler$ReaderIdleTimeoutTask r7 = new io.netty.handler.timeout.IdleStateHandler$ReaderIdleTimeoutTask
            r7.<init>(r11, r12)
            long r8 = r11.readerIdleTimeNanos
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.NANOSECONDS
            r5 = r11
            r6 = r12
            java.util.concurrent.ScheduledFuture r12 = r5.schedule(r6, r7, r8, r10)
            r4 = r5
            r5 = r6
            r4.readerIdleTimeout = r12
            goto L33
        L31:
            r4 = r11
            r5 = r12
        L33:
            long r0 = r4.writerIdleTimeNanos
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 <= 0) goto L48
            io.netty.handler.timeout.IdleStateHandler$WriterIdleTimeoutTask r6 = new io.netty.handler.timeout.IdleStateHandler$WriterIdleTimeoutTask
            r6.<init>(r11, r5)
            long r7 = r4.writerIdleTimeNanos
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.NANOSECONDS
            java.util.concurrent.ScheduledFuture r12 = r4.schedule(r5, r6, r7, r9)
            r4.writerIdleTimeout = r12
        L48:
            long r0 = r4.allIdleTimeNanos
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 <= 0) goto L5f
            io.netty.handler.timeout.IdleStateHandler$AllIdleTimeoutTask r6 = new io.netty.handler.timeout.IdleStateHandler$AllIdleTimeoutTask
            r6.<init>(r11, r5)
            long r7 = r4.allIdleTimeNanos
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.NANOSECONDS
            java.util.concurrent.ScheduledFuture r12 = r4.schedule(r5, r6, r7, r9)
            r4.allIdleTimeout = r12
            return
        L5e:
            r4 = r11
        L5f:
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelActive(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            r0.initialize(r1)
            super.channelActive(r1)
            return
    }

    protected void channelIdle(io.netty.channel.ChannelHandlerContext r1, io.netty.handler.timeout.IdleStateEvent r2) throws java.lang.Exception {
            r0 = this;
            r1.fireUserEventTriggered(r2)
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelInactive(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            r0.destroy()
            super.channelInactive(r1)
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelRead(io.netty.channel.ChannelHandlerContext r6, java.lang.Object r7) throws java.lang.Exception {
            r5 = this;
            long r0 = r5.readerIdleTimeNanos
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto Le
            long r0 = r5.allIdleTimeNanos
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L15
        Le:
            r0 = 1
            r5.reading = r0
            r5.firstAllIdleEvent = r0
            r5.firstReaderIdleEvent = r0
        L15:
            r6.fireChannelRead(r7)
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelReadComplete(io.netty.channel.ChannelHandlerContext r6) throws java.lang.Exception {
            r5 = this;
            long r0 = r5.readerIdleTimeNanos
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto Le
            long r0 = r5.allIdleTimeNanos
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L1b
        Le:
            boolean r0 = r5.reading
            if (r0 == 0) goto L1b
            long r0 = r5.ticksInNanos()
            r5.lastReadTime = r0
            r0 = 0
            r5.reading = r0
        L1b:
            r6.fireChannelReadComplete()
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelRegistered(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            io.netty.channel.Channel r0 = r2.channel()
            boolean r0 = r0.isActive()
            if (r0 == 0) goto Ld
            r1.initialize(r2)
        Ld:
            super.channelRegistered(r2)
            return
    }

    public long getAllIdleTimeInMillis() {
            r3 = this;
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r1 = r3.allIdleTimeNanos
            long r0 = r0.toMillis(r1)
            return r0
    }

    public long getReaderIdleTimeInMillis() {
            r3 = this;
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r1 = r3.readerIdleTimeNanos
            long r0 = r0.toMillis(r1)
            return r0
    }

    public long getWriterIdleTimeInMillis() {
            r3 = this;
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r1 = r3.writerIdleTimeNanos
            long r0 = r0.toMillis(r1)
            return r0
    }

    @Override // io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler
    public void handlerAdded(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            io.netty.channel.Channel r0 = r2.channel()
            boolean r0 = r0.isActive()
            if (r0 == 0) goto L17
            io.netty.channel.Channel r0 = r2.channel()
            boolean r0 = r0.isRegistered()
            if (r0 == 0) goto L17
            r1.initialize(r2)
        L17:
            return
    }

    @Override // io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler
    public void handlerRemoved(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            r0.destroy()
            return
    }

    protected io.netty.handler.timeout.IdleStateEvent newIdleStateEvent(io.netty.handler.timeout.IdleState r4, boolean r5) {
            r3 = this;
            int[] r0 = io.netty.handler.timeout.IdleStateHandler.AnonymousClass2.$SwitchMap$io$netty$handler$timeout$IdleState
            int r1 = r4.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L40
            r1 = 2
            if (r0 == r1) goto L38
            r1 = 3
            if (r0 != r1) goto L19
            if (r5 == 0) goto L16
            io.netty.handler.timeout.IdleStateEvent r4 = io.netty.handler.timeout.IdleStateEvent.FIRST_WRITER_IDLE_STATE_EVENT
            return r4
        L16:
            io.netty.handler.timeout.IdleStateEvent r4 = io.netty.handler.timeout.IdleStateEvent.WRITER_IDLE_STATE_EVENT
            return r4
        L19:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unhandled: state="
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ", first="
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L38:
            if (r5 == 0) goto L3d
            io.netty.handler.timeout.IdleStateEvent r4 = io.netty.handler.timeout.IdleStateEvent.FIRST_READER_IDLE_STATE_EVENT
            return r4
        L3d:
            io.netty.handler.timeout.IdleStateEvent r4 = io.netty.handler.timeout.IdleStateEvent.READER_IDLE_STATE_EVENT
            return r4
        L40:
            if (r5 == 0) goto L45
            io.netty.handler.timeout.IdleStateEvent r4 = io.netty.handler.timeout.IdleStateEvent.FIRST_ALL_IDLE_STATE_EVENT
            return r4
        L45:
            io.netty.handler.timeout.IdleStateEvent r4 = io.netty.handler.timeout.IdleStateEvent.ALL_IDLE_STATE_EVENT
            return r4
    }

    java.util.concurrent.ScheduledFuture<?> schedule(io.netty.channel.ChannelHandlerContext r1, java.lang.Runnable r2, long r3, java.util.concurrent.TimeUnit r5) {
            r0 = this;
            io.netty.util.concurrent.EventExecutor r1 = r1.executor()
            io.netty.util.concurrent.ScheduledFuture r1 = r1.schedule(r2, r3, r5)
            return r1
    }

    long ticksInNanos() {
            r2 = this;
            long r0 = java.lang.System.nanoTime()
            return r0
    }

    @Override // io.netty.channel.ChannelDuplexHandler, io.netty.channel.ChannelOutboundHandler
    public void write(io.netty.channel.ChannelHandlerContext r6, java.lang.Object r7, io.netty.channel.ChannelPromise r8) throws java.lang.Exception {
            r5 = this;
            long r0 = r5.writerIdleTimeNanos
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L13
            long r0 = r5.allIdleTimeNanos
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto Lf
            goto L13
        Lf:
            r6.write(r7, r8)
            return
        L13:
            io.netty.channel.ChannelPromise r8 = r8.unvoid()
            io.netty.channel.ChannelFuture r6 = r6.write(r7, r8)
            io.netty.channel.ChannelFutureListener r7 = r5.writeListener
            r6.addListener(r7)
            return
    }
}
