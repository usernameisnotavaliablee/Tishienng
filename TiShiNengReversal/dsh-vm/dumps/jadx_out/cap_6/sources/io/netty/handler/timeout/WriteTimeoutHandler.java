package io.netty.handler.timeout;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class WriteTimeoutHandler extends io.netty.channel.ChannelOutboundHandlerAdapter {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final long MIN_TIMEOUT_NANOS = 0;
    private boolean closed;
    private io.netty.handler.timeout.WriteTimeoutHandler.WriteTimeoutTask lastTask;
    private final long timeoutNanos;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class WriteTimeoutTask implements java.lang.Runnable, io.netty.channel.ChannelFutureListener {
        private final io.netty.channel.ChannelHandlerContext ctx;
        io.netty.handler.timeout.WriteTimeoutHandler.WriteTimeoutTask next;
        io.netty.handler.timeout.WriteTimeoutHandler.WriteTimeoutTask prev;
        private final io.netty.channel.ChannelPromise promise;
        java.util.concurrent.ScheduledFuture<?> scheduledFuture;
        final /* synthetic */ io.netty.handler.timeout.WriteTimeoutHandler this$0;

        WriteTimeoutTask(io.netty.handler.timeout.WriteTimeoutHandler r1, io.netty.channel.ChannelHandlerContext r2, io.netty.channel.ChannelPromise r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.ctx = r2
                r0.promise = r3
                return
        }

        public void operationComplete(io.netty.channel.ChannelFuture r2) throws java.lang.Exception {
                r1 = this;
                java.util.concurrent.ScheduledFuture<?> r2 = r1.scheduledFuture
                r0 = 0
                r2.cancel(r0)
                io.netty.handler.timeout.WriteTimeoutHandler r2 = r1.this$0
                io.netty.handler.timeout.WriteTimeoutHandler.access$000(r2, r1)
                return
        }

        public /* bridge */ /* synthetic */ void operationComplete(io.netty.util.concurrent.Future r1) throws java.lang.Exception {
                r0 = this;
                io.netty.channel.ChannelFuture r1 = (io.netty.channel.ChannelFuture) r1
                r0.operationComplete(r1)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                io.netty.channel.ChannelPromise r0 = r2.promise
                boolean r0 = r0.isDone()
                if (r0 != 0) goto L16
                io.netty.handler.timeout.WriteTimeoutHandler r0 = r2.this$0     // Catch: java.lang.Throwable -> L10
                io.netty.channel.ChannelHandlerContext r1 = r2.ctx     // Catch: java.lang.Throwable -> L10
                r0.writeTimedOut(r1)     // Catch: java.lang.Throwable -> L10
                goto L16
            L10:
                r0 = move-exception
                io.netty.channel.ChannelHandlerContext r1 = r2.ctx
                r1.fireExceptionCaught(r0)
            L16:
                io.netty.handler.timeout.WriteTimeoutHandler r0 = r2.this$0
                io.netty.handler.timeout.WriteTimeoutHandler.access$000(r0, r2)
                return
        }
    }

    static {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            r1 = 1
            long r0 = r0.toNanos(r1)
            io.netty.handler.timeout.WriteTimeoutHandler.MIN_TIMEOUT_NANOS = r0
            return
    }

    public WriteTimeoutHandler(int r3) {
            r2 = this;
            long r0 = (long) r3
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            r2.<init>(r0, r3)
            return
    }

    public WriteTimeoutHandler(long r4, java.util.concurrent.TimeUnit r6) {
            r3 = this;
            r3.<init>()
            if (r6 == 0) goto L1b
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto Le
            r3.timeoutNanos = r0
            return
        Le:
            long r4 = r6.toNanos(r4)
            long r0 = io.netty.handler.timeout.WriteTimeoutHandler.MIN_TIMEOUT_NANOS
            long r4 = java.lang.Math.max(r4, r0)
            r3.timeoutNanos = r4
            return
        L1b:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "unit"
            r4.<init>(r5)
            throw r4
    }

    static /* synthetic */ void access$000(io.netty.handler.timeout.WriteTimeoutHandler r0, io.netty.handler.timeout.WriteTimeoutHandler.WriteTimeoutTask r1) {
            r0.removeWriteTimeoutTask(r1)
            return
    }

    private void addWriteTimeoutTask(io.netty.handler.timeout.WriteTimeoutHandler.WriteTimeoutTask r2) {
            r1 = this;
            io.netty.handler.timeout.WriteTimeoutHandler$WriteTimeoutTask r0 = r1.lastTask
            if (r0 == 0) goto L8
            r0.next = r2
            r2.prev = r0
        L8:
            r1.lastTask = r2
            return
    }

    private void removeWriteTimeoutTask(io.netty.handler.timeout.WriteTimeoutHandler.WriteTimeoutTask r4) {
            r3 = this;
            io.netty.handler.timeout.WriteTimeoutHandler$WriteTimeoutTask r0 = r3.lastTask
            r1 = 0
            if (r4 != r0) goto Le
            io.netty.handler.timeout.WriteTimeoutHandler$WriteTimeoutTask r0 = r0.prev
            r3.lastTask = r0
            if (r0 == 0) goto L26
            r0.next = r1
            goto L26
        Le:
            io.netty.handler.timeout.WriteTimeoutHandler$WriteTimeoutTask r0 = r4.prev
            if (r0 != 0) goto L17
            io.netty.handler.timeout.WriteTimeoutHandler$WriteTimeoutTask r2 = r4.next
            if (r2 != 0) goto L17
            return
        L17:
            if (r0 != 0) goto L1e
            io.netty.handler.timeout.WriteTimeoutHandler$WriteTimeoutTask r0 = r4.next
            r0.prev = r1
            goto L26
        L1e:
            io.netty.handler.timeout.WriteTimeoutHandler$WriteTimeoutTask r2 = r4.next
            r0.next = r2
            io.netty.handler.timeout.WriteTimeoutHandler$WriteTimeoutTask r2 = r4.next
            r2.prev = r0
        L26:
            r4.prev = r1
            r4.next = r1
            return
    }

    private void scheduleTimeout(io.netty.channel.ChannelHandlerContext r5, io.netty.channel.ChannelPromise r6) {
            r4 = this;
            io.netty.handler.timeout.WriteTimeoutHandler$WriteTimeoutTask r0 = new io.netty.handler.timeout.WriteTimeoutHandler$WriteTimeoutTask
            r0.<init>(r4, r5, r6)
            io.netty.util.concurrent.EventExecutor r5 = r5.executor()
            long r1 = r4.timeoutNanos
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.NANOSECONDS
            io.netty.util.concurrent.ScheduledFuture r5 = r5.schedule(r0, r1, r3)
            r0.scheduledFuture = r5
            boolean r5 = r5.isDone()
            if (r5 != 0) goto L1f
            r4.addWriteTimeoutTask(r0)
            r6.addListener(r0)
        L1f:
            return
    }

    @Override // io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler
    public void handlerRemoved(io.netty.channel.ChannelHandlerContext r4) throws java.lang.Exception {
            r3 = this;
            io.netty.handler.timeout.WriteTimeoutHandler$WriteTimeoutTask r4 = r3.lastTask
            r0 = 0
            r3.lastTask = r0
        L5:
            if (r4 == 0) goto L15
            java.util.concurrent.ScheduledFuture<?> r1 = r4.scheduledFuture
            r2 = 0
            r1.cancel(r2)
            io.netty.handler.timeout.WriteTimeoutHandler$WriteTimeoutTask r1 = r4.prev
            r4.prev = r0
            r4.next = r0
            r4 = r1
            goto L5
        L15:
            return
    }

    @Override // io.netty.channel.ChannelOutboundHandlerAdapter, io.netty.channel.ChannelOutboundHandler
    public void write(io.netty.channel.ChannelHandlerContext r6, java.lang.Object r7, io.netty.channel.ChannelPromise r8) throws java.lang.Exception {
            r5 = this;
            long r0 = r5.timeoutNanos
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto Lf
            io.netty.channel.ChannelPromise r8 = r8.unvoid()
            r5.scheduleTimeout(r6, r8)
        Lf:
            r6.write(r7, r8)
            return
    }

    protected void writeTimedOut(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            boolean r0 = r1.closed
            if (r0 != 0) goto Lf
            io.netty.handler.timeout.WriteTimeoutException r0 = io.netty.handler.timeout.WriteTimeoutException.INSTANCE
            r2.fireExceptionCaught(r0)
            r2.close()
            r2 = 1
            r1.closed = r2
        Lf:
            return
    }
}
