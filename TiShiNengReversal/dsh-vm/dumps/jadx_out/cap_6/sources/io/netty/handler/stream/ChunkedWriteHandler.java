package io.netty.handler.stream;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ChunkedWriteHandler extends io.netty.channel.ChannelDuplexHandler {
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private volatile io.netty.channel.ChannelHandlerContext ctx;
    private io.netty.handler.stream.ChunkedWriteHandler.PendingWrite currentWrite;
    private final java.util.Queue<io.netty.handler.stream.ChunkedWriteHandler.PendingWrite> queue;





    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class PendingWrite {
        final java.lang.Object msg;
        final io.netty.channel.ChannelPromise promise;

        PendingWrite(java.lang.Object r1, io.netty.channel.ChannelPromise r2) {
                r0 = this;
                r0.<init>()
                r0.msg = r1
                r0.promise = r2
                return
        }

        void fail(java.lang.Throwable r2) {
                r1 = this;
                java.lang.Object r0 = r1.msg
                io.netty.util.ReferenceCountUtil.release(r0)
                io.netty.channel.ChannelPromise r0 = r1.promise
                r0.tryFailure(r2)
                return
        }

        void progress(long r3, long r5) {
                r2 = this;
                io.netty.channel.ChannelPromise r0 = r2.promise
                boolean r1 = r0 instanceof io.netty.channel.ChannelProgressivePromise
                if (r1 == 0) goto Lb
                io.netty.channel.ChannelProgressivePromise r0 = (io.netty.channel.ChannelProgressivePromise) r0
                r0.tryProgress(r3, r5)
            Lb:
                return
        }

        void success(long r2) {
                r1 = this;
                io.netty.channel.ChannelPromise r0 = r1.promise
                boolean r0 = r0.isDone()
                if (r0 == 0) goto L9
                return
            L9:
                r1.progress(r2, r2)
                io.netty.channel.ChannelPromise r2 = r1.promise
                r2.trySuccess()
                return
        }
    }

    static {
            java.lang.Class<io.netty.handler.stream.ChunkedWriteHandler> r0 = io.netty.handler.stream.ChunkedWriteHandler.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.handler.stream.ChunkedWriteHandler.logger = r0
            return
    }

    public ChunkedWriteHandler() {
            r1 = this;
            r1.<init>()
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r1.queue = r0
            return
    }

    @java.lang.Deprecated
    public ChunkedWriteHandler(int r4) {
            r3 = this;
            r3.<init>()
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r3.queue = r0
            if (r4 <= 0) goto Ld
            return
        Ld:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "maxPendingWrites: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " (expected: > 0)"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    static /* synthetic */ void access$000(io.netty.handler.stream.ChunkedWriteHandler r0, io.netty.channel.ChannelHandlerContext r1) {
            r0.resumeTransfer0(r1)
            return
    }

    static /* synthetic */ void access$100(io.netty.handler.stream.ChunkedInput r0) {
            closeInput(r0)
            return
    }

    private static void closeInput(io.netty.handler.stream.ChunkedInput<?> r2) {
            r2.close()     // Catch: java.lang.Throwable -> L4
            return
        L4:
            r2 = move-exception
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.handler.stream.ChunkedWriteHandler.logger
            boolean r0 = r0.isWarnEnabled()
            if (r0 == 0) goto L14
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.handler.stream.ChunkedWriteHandler.logger
            java.lang.String r1 = "Failed to close a chunked input."
            r0.warn(r1, r2)
        L14:
            return
    }

    private void discard(java.lang.Throwable r6) {
            r5 = this;
        L0:
            io.netty.handler.stream.ChunkedWriteHandler$PendingWrite r0 = r5.currentWrite
            if (r0 != 0) goto Ld
            java.util.Queue<io.netty.handler.stream.ChunkedWriteHandler$PendingWrite> r0 = r5.queue
            java.lang.Object r0 = r0.poll()
            io.netty.handler.stream.ChunkedWriteHandler$PendingWrite r0 = (io.netty.handler.stream.ChunkedWriteHandler.PendingWrite) r0
            goto L10
        Ld:
            r1 = 0
            r5.currentWrite = r1
        L10:
            if (r0 != 0) goto L13
            return
        L13:
            java.lang.Object r1 = r0.msg
            boolean r2 = r1 instanceof io.netty.handler.stream.ChunkedInput
            if (r2 == 0) goto L61
            io.netty.handler.stream.ChunkedInput r1 = (io.netty.handler.stream.ChunkedInput) r1
            boolean r2 = r1.isEndOfInput()     // Catch: java.lang.Exception -> L37
            long r3 = r1.length()     // Catch: java.lang.Exception -> L37
            closeInput(r1)     // Catch: java.lang.Exception -> L37
            if (r2 != 0) goto L33
            if (r6 != 0) goto L2f
            java.nio.channels.ClosedChannelException r6 = new java.nio.channels.ClosedChannelException
            r6.<init>()
        L2f:
            r0.fail(r6)
            goto L0
        L33:
            r0.success(r3)
            goto L0
        L37:
            r2 = move-exception
            closeInput(r1)
            r0.fail(r2)
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.handler.stream.ChunkedWriteHandler.logger
            boolean r1 = r0.isWarnEnabled()
            if (r1 == 0) goto L0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class<io.netty.handler.stream.ChunkedInput> r3 = io.netty.handler.stream.ChunkedInput.class
            java.lang.String r3 = r3.getSimpleName()
            r1.append(r3)
            java.lang.String r3 = " failed"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.warn(r1, r2)
            goto L0
        L61:
            if (r6 != 0) goto L68
            java.nio.channels.ClosedChannelException r6 = new java.nio.channels.ClosedChannelException
            r6.<init>()
        L68:
            r0.fail(r6)
            goto L0
    }

    private void doFlush(io.netty.channel.ChannelHandlerContext r12) {
            r11 = this;
            io.netty.channel.Channel r0 = r12.channel()
            boolean r1 = r0.isActive()
            r2 = 0
            if (r1 != 0) goto Lf
            r11.discard(r2)
            return
        Lf:
            io.netty.buffer.ByteBufAllocator r1 = r12.alloc()
            r3 = 1
            r4 = 1
        L15:
            boolean r5 = r0.isWritable()
            if (r5 == 0) goto Laf
            io.netty.handler.stream.ChunkedWriteHandler$PendingWrite r5 = r11.currentWrite
            if (r5 != 0) goto L29
            java.util.Queue<io.netty.handler.stream.ChunkedWriteHandler$PendingWrite> r5 = r11.queue
            java.lang.Object r5 = r5.poll()
            io.netty.handler.stream.ChunkedWriteHandler$PendingWrite r5 = (io.netty.handler.stream.ChunkedWriteHandler.PendingWrite) r5
            r11.currentWrite = r5
        L29:
            io.netty.handler.stream.ChunkedWriteHandler$PendingWrite r5 = r11.currentWrite
            if (r5 != 0) goto L2f
            goto Laf
        L2f:
            io.netty.channel.ChannelPromise r5 = r5.promise
            boolean r5 = r5.isDone()
            if (r5 == 0) goto L3a
            r11.currentWrite = r2
            goto L15
        L3a:
            io.netty.handler.stream.ChunkedWriteHandler$PendingWrite r5 = r11.currentWrite
            java.lang.Object r6 = r5.msg
            boolean r7 = r6 instanceof io.netty.handler.stream.ChunkedInput
            if (r7 == 0) goto L99
            io.netty.handler.stream.ChunkedInput r6 = (io.netty.handler.stream.ChunkedInput) r6
            java.lang.Object r7 = r6.readChunk(r1)     // Catch: java.lang.Throwable -> L89
            boolean r8 = r6.isEndOfInput()     // Catch: java.lang.Throwable -> L87
            r9 = 0
            if (r7 != 0) goto L52
            r10 = r8 ^ 1
            goto L53
        L52:
            r10 = 0
        L53:
            if (r10 == 0) goto L56
            goto Laf
        L56:
            if (r7 != 0) goto L5a
            io.netty.buffer.ByteBuf r7 = io.netty.buffer.Unpooled.EMPTY_BUFFER
        L5a:
            io.netty.channel.ChannelFuture r4 = r12.write(r7)
            if (r8 == 0) goto L6b
            r11.currentWrite = r2
            io.netty.handler.stream.ChunkedWriteHandler$2 r7 = new io.netty.handler.stream.ChunkedWriteHandler$2
            r7.<init>(r11, r6, r5)
            r4.addListener(r7)
            goto L82
        L6b:
            boolean r7 = r0.isWritable()
            if (r7 == 0) goto L7a
            io.netty.handler.stream.ChunkedWriteHandler$3 r7 = new io.netty.handler.stream.ChunkedWriteHandler$3
            r7.<init>(r11, r6, r5)
            r4.addListener(r7)
            goto L82
        L7a:
            io.netty.handler.stream.ChunkedWriteHandler$4 r7 = new io.netty.handler.stream.ChunkedWriteHandler$4
            r7.<init>(r11, r6, r5, r0)
            r4.addListener(r7)
        L82:
            r12.flush()
            r4 = 0
            goto La1
        L87:
            r0 = move-exception
            goto L8b
        L89:
            r0 = move-exception
            r7 = r2
        L8b:
            r11.currentWrite = r2
            if (r7 == 0) goto L92
            io.netty.util.ReferenceCountUtil.release(r7)
        L92:
            closeInput(r6)
            r5.fail(r0)
            goto Laf
        L99:
            r11.currentWrite = r2
            io.netty.channel.ChannelPromise r4 = r5.promise
            r12.write(r6, r4)
            r4 = 1
        La1:
            boolean r5 = r0.isActive()
            if (r5 != 0) goto L15
            java.nio.channels.ClosedChannelException r0 = new java.nio.channels.ClosedChannelException
            r0.<init>()
            r11.discard(r0)
        Laf:
            if (r4 == 0) goto Lb4
            r12.flush()
        Lb4:
            return
    }

    private void resumeTransfer0(io.netty.channel.ChannelHandlerContext r3) {
            r2 = this;
            r2.doFlush(r3)     // Catch: java.lang.Exception -> L4
            return
        L4:
            r3 = move-exception
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.handler.stream.ChunkedWriteHandler.logger
            boolean r0 = r0.isWarnEnabled()
            if (r0 == 0) goto L14
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.handler.stream.ChunkedWriteHandler.logger
            java.lang.String r1 = "Unexpected exception while sending chunks."
            r0.warn(r1, r3)
        L14:
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelInactive(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            r0.doFlush(r1)
            r1.fireChannelInactive()
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelWritabilityChanged(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            io.netty.channel.Channel r0 = r2.channel()
            boolean r0 = r0.isWritable()
            if (r0 == 0) goto Ld
            r1.doFlush(r2)
        Ld:
            r2.fireChannelWritabilityChanged()
            return
    }

    @Override // io.netty.channel.ChannelDuplexHandler, io.netty.channel.ChannelOutboundHandler
    public void flush(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            r0.doFlush(r1)
            return
    }

    @Override // io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler
    public void handlerAdded(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            r0.ctx = r1
            return
    }

    public void resumeTransfer() {
            r3 = this;
            io.netty.channel.ChannelHandlerContext r0 = r3.ctx
            if (r0 != 0) goto L5
            return
        L5:
            io.netty.util.concurrent.EventExecutor r1 = r0.executor()
            boolean r1 = r1.inEventLoop()
            if (r1 == 0) goto L13
            r3.resumeTransfer0(r0)
            return
        L13:
            io.netty.util.concurrent.EventExecutor r1 = r0.executor()
            io.netty.handler.stream.ChunkedWriteHandler$1 r2 = new io.netty.handler.stream.ChunkedWriteHandler$1
            r2.<init>(r3, r0)
            r1.execute(r2)
            return
    }

    @Override // io.netty.channel.ChannelDuplexHandler, io.netty.channel.ChannelOutboundHandler
    public void write(io.netty.channel.ChannelHandlerContext r2, java.lang.Object r3, io.netty.channel.ChannelPromise r4) throws java.lang.Exception {
            r1 = this;
            java.util.Queue<io.netty.handler.stream.ChunkedWriteHandler$PendingWrite> r2 = r1.queue
            io.netty.handler.stream.ChunkedWriteHandler$PendingWrite r0 = new io.netty.handler.stream.ChunkedWriteHandler$PendingWrite
            r0.<init>(r3, r4)
            r2.add(r0)
            return
    }
}
