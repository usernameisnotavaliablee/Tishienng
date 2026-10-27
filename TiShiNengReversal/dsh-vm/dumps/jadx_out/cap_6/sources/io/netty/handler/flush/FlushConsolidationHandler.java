package io.netty.handler.flush;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class FlushConsolidationHandler extends io.netty.channel.ChannelDuplexHandler {
    public static final int DEFAULT_EXPLICIT_FLUSH_AFTER_FLUSHES = 256;
    private final boolean consolidateWhenNoReadInProgress;
    private io.netty.channel.ChannelHandlerContext ctx;
    private final int explicitFlushAfterFlushes;
    private int flushPendingCount;
    private final java.lang.Runnable flushTask;
    private java.util.concurrent.Future<?> nextScheduledFlush;
    private boolean readInProgress;


    public FlushConsolidationHandler() {
            r2 = this;
            r0 = 256(0x100, float:3.59E-43)
            r1 = 0
            r2.<init>(r0, r1)
            return
    }

    public FlushConsolidationHandler(int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public FlushConsolidationHandler(int r3, boolean r4) {
            r2 = this;
            r2.<init>()
            if (r3 <= 0) goto L15
            r2.explicitFlushAfterFlushes = r3
            r2.consolidateWhenNoReadInProgress = r4
            if (r4 == 0) goto L11
            io.netty.handler.flush.FlushConsolidationHandler$1 r3 = new io.netty.handler.flush.FlushConsolidationHandler$1
            r3.<init>(r2)
            goto L12
        L11:
            r3 = 0
        L12:
            r2.flushTask = r3
            return
        L15:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "explicitFlushAfterFlushes: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " (expected: > 0)"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }

    static /* synthetic */ int access$000(io.netty.handler.flush.FlushConsolidationHandler r0) {
            int r0 = r0.flushPendingCount
            return r0
    }

    static /* synthetic */ int access$002(io.netty.handler.flush.FlushConsolidationHandler r0, int r1) {
            r0.flushPendingCount = r1
            return r1
    }

    static /* synthetic */ boolean access$100(io.netty.handler.flush.FlushConsolidationHandler r0) {
            boolean r0 = r0.readInProgress
            return r0
    }

    static /* synthetic */ io.netty.channel.ChannelHandlerContext access$200(io.netty.handler.flush.FlushConsolidationHandler r0) {
            io.netty.channel.ChannelHandlerContext r0 = r0.ctx
            return r0
    }

    static /* synthetic */ java.util.concurrent.Future access$302(io.netty.handler.flush.FlushConsolidationHandler r0, java.util.concurrent.Future r1) {
            r0.nextScheduledFlush = r1
            return r1
    }

    private void cancelScheduledFlush() {
            r2 = this;
            java.util.concurrent.Future<?> r0 = r2.nextScheduledFlush
            if (r0 == 0) goto Lb
            r1 = 0
            r0.cancel(r1)
            r0 = 0
            r2.nextScheduledFlush = r0
        Lb:
            return
    }

    private void flushIfNeeded(io.netty.channel.ChannelHandlerContext r2) {
            r1 = this;
            int r0 = r1.flushPendingCount
            if (r0 <= 0) goto L7
            r1.flushNow(r2)
        L7:
            return
    }

    private void flushNow(io.netty.channel.ChannelHandlerContext r2) {
            r1 = this;
            r1.cancelScheduledFlush()
            r0 = 0
            r1.flushPendingCount = r0
            r2.flush()
            return
    }

    private void resetReadAndFlushIfNeeded(io.netty.channel.ChannelHandlerContext r2) {
            r1 = this;
            r0 = 0
            r1.readInProgress = r0
            r1.flushIfNeeded(r2)
            return
    }

    private void scheduleFlush(io.netty.channel.ChannelHandlerContext r2) {
            r1 = this;
            java.util.concurrent.Future<?> r0 = r1.nextScheduledFlush
            if (r0 != 0) goto L14
            io.netty.channel.Channel r2 = r2.channel()
            io.netty.channel.EventLoop r2 = r2.eventLoop()
            java.lang.Runnable r0 = r1.flushTask
            io.netty.util.concurrent.Future r2 = r2.submit(r0)
            r1.nextScheduledFlush = r2
        L14:
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelRead(io.netty.channel.ChannelHandlerContext r2, java.lang.Object r3) throws java.lang.Exception {
            r1 = this;
            r0 = 1
            r1.readInProgress = r0
            r2.fireChannelRead(r3)
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelReadComplete(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            r0.resetReadAndFlushIfNeeded(r1)
            r1.fireChannelReadComplete()
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelWritabilityChanged(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            io.netty.channel.Channel r0 = r2.channel()
            boolean r0 = r0.isWritable()
            if (r0 != 0) goto Ld
            r1.flushIfNeeded(r2)
        Ld:
            r2.fireChannelWritabilityChanged()
            return
    }

    @Override // io.netty.channel.ChannelDuplexHandler, io.netty.channel.ChannelOutboundHandler
    public void close(io.netty.channel.ChannelHandlerContext r1, io.netty.channel.ChannelPromise r2) throws java.lang.Exception {
            r0 = this;
            r0.resetReadAndFlushIfNeeded(r1)
            r1.close(r2)
            return
    }

    @Override // io.netty.channel.ChannelDuplexHandler, io.netty.channel.ChannelOutboundHandler
    public void disconnect(io.netty.channel.ChannelHandlerContext r1, io.netty.channel.ChannelPromise r2) throws java.lang.Exception {
            r0 = this;
            r0.resetReadAndFlushIfNeeded(r1)
            r1.disconnect(r2)
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler, io.netty.channel.ChannelInboundHandler
    public void exceptionCaught(io.netty.channel.ChannelHandlerContext r1, java.lang.Throwable r2) throws java.lang.Exception {
            r0 = this;
            r0.resetReadAndFlushIfNeeded(r1)
            r1.fireExceptionCaught(r2)
            return
    }

    @Override // io.netty.channel.ChannelDuplexHandler, io.netty.channel.ChannelOutboundHandler
    public void flush(io.netty.channel.ChannelHandlerContext r3) throws java.lang.Exception {
            r2 = this;
            boolean r0 = r2.readInProgress
            if (r0 == 0) goto L12
            int r0 = r2.flushPendingCount
            int r0 = r0 + 1
            r2.flushPendingCount = r0
            int r1 = r2.explicitFlushAfterFlushes
            if (r0 != r1) goto L11
            r2.flushNow(r3)
        L11:
            return
        L12:
            boolean r0 = r2.consolidateWhenNoReadInProgress
            if (r0 == 0) goto L28
            int r0 = r2.flushPendingCount
            int r0 = r0 + 1
            r2.flushPendingCount = r0
            int r1 = r2.explicitFlushAfterFlushes
            if (r0 != r1) goto L24
            r2.flushNow(r3)
            return
        L24:
            r2.scheduleFlush(r3)
            return
        L28:
            r2.flushNow(r3)
            return
    }

    @Override // io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler
    public void handlerAdded(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            r0.ctx = r1
            return
    }

    @Override // io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler
    public void handlerRemoved(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            r0.flushIfNeeded(r1)
            return
    }
}
