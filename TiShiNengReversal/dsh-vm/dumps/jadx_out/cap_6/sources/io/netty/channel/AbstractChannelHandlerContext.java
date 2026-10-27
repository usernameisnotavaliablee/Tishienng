package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
abstract class AbstractChannelHandlerContext implements io.netty.channel.ChannelHandlerContext, io.netty.util.ResourceLeakHint {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int ADD_COMPLETE = 2;
    private static final int ADD_PENDING = 1;
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater<io.netty.channel.AbstractChannelHandlerContext> HANDLER_STATE_UPDATER = null;
    private static final int INIT = 0;
    private static final int REMOVE_COMPLETE = 3;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private final int executionMask;
    final io.netty.util.concurrent.EventExecutor executor;
    private volatile int handlerState;
    private io.netty.channel.AbstractChannelHandlerContext.Tasks invokeTasks;
    private final java.lang.String name;
    volatile io.netty.channel.AbstractChannelHandlerContext next;
    private final boolean ordered;
    private final io.netty.channel.DefaultChannelPipeline pipeline;
    volatile io.netty.channel.AbstractChannelHandlerContext prev;
    private io.netty.channel.ChannelFuture succeededFuture;













    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static abstract class AbstractWriteTask implements java.lang.Runnable {
        private static final boolean ESTIMATE_TASK_SIZE_ON_SUBMIT = false;
        private static final int WRITE_TASK_OVERHEAD = 0;
        private io.netty.channel.AbstractChannelHandlerContext ctx;
        private final io.netty.util.Recycler.Handle<io.netty.channel.AbstractChannelHandlerContext.AbstractWriteTask> handle;
        private java.lang.Object msg;
        private io.netty.channel.ChannelPromise promise;
        private int size;

        static {
                java.lang.String r0 = "io.netty.transport.estimateSizeOnSubmit"
                r1 = 1
                boolean r0 = io.netty.util.internal.SystemPropertyUtil.getBoolean(r0, r1)
                io.netty.channel.AbstractChannelHandlerContext.AbstractWriteTask.ESTIMATE_TASK_SIZE_ON_SUBMIT = r0
                java.lang.String r0 = "io.netty.transport.writeTaskSizeOverhead"
                r1 = 48
                int r0 = io.netty.util.internal.SystemPropertyUtil.getInt(r0, r1)
                io.netty.channel.AbstractChannelHandlerContext.AbstractWriteTask.WRITE_TASK_OVERHEAD = r0
                return
        }

        private AbstractWriteTask(io.netty.util.Recycler.Handle<? extends io.netty.channel.AbstractChannelHandlerContext.AbstractWriteTask> r1) {
                r0 = this;
                r0.<init>()
                r0.handle = r1
                return
        }

        /* synthetic */ AbstractWriteTask(io.netty.util.Recycler.Handle r1, io.netty.channel.AbstractChannelHandlerContext.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private void decrementPendingOutboundBytes() {
                r3 = this;
                boolean r0 = io.netty.channel.AbstractChannelHandlerContext.AbstractWriteTask.ESTIMATE_TASK_SIZE_ON_SUBMIT
                if (r0 == 0) goto L10
                io.netty.channel.AbstractChannelHandlerContext r0 = r3.ctx
                io.netty.channel.DefaultChannelPipeline r0 = io.netty.channel.AbstractChannelHandlerContext.access$1600(r0)
                int r1 = r3.size
                long r1 = (long) r1
                r0.decrementPendingOutboundBytes(r1)
            L10:
                return
        }

        protected static void init(io.netty.channel.AbstractChannelHandlerContext.AbstractWriteTask r0, io.netty.channel.AbstractChannelHandlerContext r1, java.lang.Object r2, io.netty.channel.ChannelPromise r3) {
                r0.ctx = r1
                r0.msg = r2
                r0.promise = r3
                boolean r3 = io.netty.channel.AbstractChannelHandlerContext.AbstractWriteTask.ESTIMATE_TASK_SIZE_ON_SUBMIT
                if (r3 == 0) goto L26
                io.netty.channel.DefaultChannelPipeline r3 = io.netty.channel.AbstractChannelHandlerContext.access$1600(r1)
                io.netty.channel.MessageSizeEstimator$Handle r3 = r3.estimatorHandle()
                int r2 = r3.size(r2)
                int r3 = io.netty.channel.AbstractChannelHandlerContext.AbstractWriteTask.WRITE_TASK_OVERHEAD
                int r2 = r2 + r3
                r0.size = r2
                io.netty.channel.DefaultChannelPipeline r1 = io.netty.channel.AbstractChannelHandlerContext.access$1600(r1)
                int r0 = r0.size
                long r2 = (long) r0
                r1.incrementPendingOutboundBytes(r2)
                return
            L26:
                r1 = 0
                r0.size = r1
                return
        }

        private void recycle() {
                r1 = this;
                r0 = 0
                r1.ctx = r0
                r1.msg = r0
                r1.promise = r0
                io.netty.util.Recycler$Handle<io.netty.channel.AbstractChannelHandlerContext$AbstractWriteTask> r0 = r1.handle
                r0.recycle(r1)
                return
        }

        void cancel() {
                r1 = this;
                r1.decrementPendingOutboundBytes()     // Catch: java.lang.Throwable -> L7
                r1.recycle()
                return
            L7:
                r0 = move-exception
                r1.recycle()
                throw r0
        }

        @Override // java.lang.Runnable
        public final void run() {
                r3 = this;
                r3.decrementPendingOutboundBytes()     // Catch: java.lang.Throwable -> L10
                io.netty.channel.AbstractChannelHandlerContext r0 = r3.ctx     // Catch: java.lang.Throwable -> L10
                java.lang.Object r1 = r3.msg     // Catch: java.lang.Throwable -> L10
                io.netty.channel.ChannelPromise r2 = r3.promise     // Catch: java.lang.Throwable -> L10
                r3.write(r0, r1, r2)     // Catch: java.lang.Throwable -> L10
                r3.recycle()
                return
            L10:
                r0 = move-exception
                r3.recycle()
                throw r0
        }

        protected void write(io.netty.channel.AbstractChannelHandlerContext r1, java.lang.Object r2, io.netty.channel.ChannelPromise r3) {
                r0 = this;
                io.netty.channel.AbstractChannelHandlerContext.access$1700(r1, r2, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class Tasks {
        private final java.lang.Runnable invokeChannelReadCompleteTask;
        private final java.lang.Runnable invokeChannelWritableStateChangedTask;
        private final java.lang.Runnable invokeFlushTask;
        private final java.lang.Runnable invokeReadTask;
        private final io.netty.channel.AbstractChannelHandlerContext next;





        Tasks(io.netty.channel.AbstractChannelHandlerContext r2) {
                r1 = this;
                r1.<init>()
                io.netty.channel.AbstractChannelHandlerContext$Tasks$1 r0 = new io.netty.channel.AbstractChannelHandlerContext$Tasks$1
                r0.<init>(r1)
                r1.invokeChannelReadCompleteTask = r0
                io.netty.channel.AbstractChannelHandlerContext$Tasks$2 r0 = new io.netty.channel.AbstractChannelHandlerContext$Tasks$2
                r0.<init>(r1)
                r1.invokeReadTask = r0
                io.netty.channel.AbstractChannelHandlerContext$Tasks$3 r0 = new io.netty.channel.AbstractChannelHandlerContext$Tasks$3
                r0.<init>(r1)
                r1.invokeChannelWritableStateChangedTask = r0
                io.netty.channel.AbstractChannelHandlerContext$Tasks$4 r0 = new io.netty.channel.AbstractChannelHandlerContext$Tasks$4
                r0.<init>(r1)
                r1.invokeFlushTask = r0
                r1.next = r2
                return
        }

        static /* synthetic */ java.lang.Runnable access$1400(io.netty.channel.AbstractChannelHandlerContext.Tasks r0) {
                java.lang.Runnable r0 = r0.invokeReadTask
                return r0
        }

        static /* synthetic */ java.lang.Runnable access$1500(io.netty.channel.AbstractChannelHandlerContext.Tasks r0) {
                java.lang.Runnable r0 = r0.invokeFlushTask
                return r0
        }

        static /* synthetic */ io.netty.channel.AbstractChannelHandlerContext access$2200(io.netty.channel.AbstractChannelHandlerContext.Tasks r0) {
                io.netty.channel.AbstractChannelHandlerContext r0 = r0.next
                return r0
        }

        static /* synthetic */ java.lang.Runnable access$700(io.netty.channel.AbstractChannelHandlerContext.Tasks r0) {
                java.lang.Runnable r0 = r0.invokeChannelReadCompleteTask
                return r0
        }

        static /* synthetic */ java.lang.Runnable access$800(io.netty.channel.AbstractChannelHandlerContext.Tasks r0) {
                java.lang.Runnable r0 = r0.invokeChannelWritableStateChangedTask
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class WriteAndFlushTask extends io.netty.channel.AbstractChannelHandlerContext.AbstractWriteTask {
        private static final io.netty.util.Recycler<io.netty.channel.AbstractChannelHandlerContext.WriteAndFlushTask> RECYCLER = null;


        static {
                io.netty.channel.AbstractChannelHandlerContext$WriteAndFlushTask$1 r0 = new io.netty.channel.AbstractChannelHandlerContext$WriteAndFlushTask$1
                r0.<init>()
                io.netty.channel.AbstractChannelHandlerContext.WriteAndFlushTask.RECYCLER = r0
                return
        }

        private WriteAndFlushTask(io.netty.util.Recycler.Handle<io.netty.channel.AbstractChannelHandlerContext.WriteAndFlushTask> r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        /* synthetic */ WriteAndFlushTask(io.netty.util.Recycler.Handle r1, io.netty.channel.AbstractChannelHandlerContext.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        static io.netty.channel.AbstractChannelHandlerContext.WriteAndFlushTask newInstance(io.netty.channel.AbstractChannelHandlerContext r1, java.lang.Object r2, io.netty.channel.ChannelPromise r3) {
                io.netty.util.Recycler<io.netty.channel.AbstractChannelHandlerContext$WriteAndFlushTask> r0 = io.netty.channel.AbstractChannelHandlerContext.WriteAndFlushTask.RECYCLER
                java.lang.Object r0 = r0.get()
                io.netty.channel.AbstractChannelHandlerContext$WriteAndFlushTask r0 = (io.netty.channel.AbstractChannelHandlerContext.WriteAndFlushTask) r0
                io.netty.channel.AbstractChannelHandlerContext.AbstractWriteTask.init(r0, r1, r2, r3)
                return r0
        }

        @Override // io.netty.channel.AbstractChannelHandlerContext.AbstractWriteTask
        public void write(io.netty.channel.AbstractChannelHandlerContext r1, java.lang.Object r2, io.netty.channel.ChannelPromise r3) {
                r0 = this;
                super.write(r1, r2, r3)
                io.netty.channel.AbstractChannelHandlerContext.access$2100(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class WriteTask extends io.netty.channel.AbstractChannelHandlerContext.AbstractWriteTask implements io.netty.channel.SingleThreadEventLoop.NonWakeupRunnable {
        private static final io.netty.util.Recycler<io.netty.channel.AbstractChannelHandlerContext.WriteTask> RECYCLER = null;


        static {
                io.netty.channel.AbstractChannelHandlerContext$WriteTask$1 r0 = new io.netty.channel.AbstractChannelHandlerContext$WriteTask$1
                r0.<init>()
                io.netty.channel.AbstractChannelHandlerContext.WriteTask.RECYCLER = r0
                return
        }

        private WriteTask(io.netty.util.Recycler.Handle<io.netty.channel.AbstractChannelHandlerContext.WriteTask> r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        /* synthetic */ WriteTask(io.netty.util.Recycler.Handle r1, io.netty.channel.AbstractChannelHandlerContext.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        static io.netty.channel.AbstractChannelHandlerContext.WriteTask newInstance(io.netty.channel.AbstractChannelHandlerContext r1, java.lang.Object r2, io.netty.channel.ChannelPromise r3) {
                io.netty.util.Recycler<io.netty.channel.AbstractChannelHandlerContext$WriteTask> r0 = io.netty.channel.AbstractChannelHandlerContext.WriteTask.RECYCLER
                java.lang.Object r0 = r0.get()
                io.netty.channel.AbstractChannelHandlerContext$WriteTask r0 = (io.netty.channel.AbstractChannelHandlerContext.WriteTask) r0
                io.netty.channel.AbstractChannelHandlerContext.AbstractWriteTask.init(r0, r1, r2, r3)
                return r0
        }
    }

    static {
            java.lang.Class<io.netty.channel.AbstractChannelHandlerContext> r0 = io.netty.channel.AbstractChannelHandlerContext.class
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.channel.AbstractChannelHandlerContext.logger = r1
            java.lang.String r1 = "handlerState"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            io.netty.channel.AbstractChannelHandlerContext.HANDLER_STATE_UPDATER = r0
            return
    }

    AbstractChannelHandlerContext(io.netty.channel.DefaultChannelPipeline r3, io.netty.util.concurrent.EventExecutor r4, java.lang.String r5, java.lang.Class<? extends io.netty.channel.ChannelHandler> r6) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.handlerState = r0
            java.lang.String r1 = "name"
            java.lang.Object r5 = io.netty.util.internal.ObjectUtil.checkNotNull(r5, r1)
            java.lang.String r5 = (java.lang.String) r5
            r2.name = r5
            r2.pipeline = r3
            r2.executor = r4
            int r3 = io.netty.channel.ChannelHandlerMask.mask(r6)
            r2.executionMask = r3
            if (r4 == 0) goto L20
            boolean r3 = r4 instanceof io.netty.util.concurrent.OrderedEventExecutor
            if (r3 == 0) goto L21
        L20:
            r0 = 1
        L21:
            r2.ordered = r0
            return
    }

    static /* synthetic */ void access$000(io.netty.channel.AbstractChannelHandlerContext r0) {
            r0.invokeChannelRegistered()
            return
    }

    static /* synthetic */ void access$100(io.netty.channel.AbstractChannelHandlerContext r0) {
            r0.invokeChannelUnregistered()
            return
    }

    static /* synthetic */ void access$1000(io.netty.channel.AbstractChannelHandlerContext r0, java.net.SocketAddress r1, java.net.SocketAddress r2, io.netty.channel.ChannelPromise r3) {
            r0.invokeConnect(r1, r2, r3)
            return
    }

    static /* synthetic */ void access$1100(io.netty.channel.AbstractChannelHandlerContext r0, io.netty.channel.ChannelPromise r1) {
            r0.invokeDisconnect(r1)
            return
    }

    static /* synthetic */ void access$1200(io.netty.channel.AbstractChannelHandlerContext r0, io.netty.channel.ChannelPromise r1) {
            r0.invokeClose(r1)
            return
    }

    static /* synthetic */ void access$1300(io.netty.channel.AbstractChannelHandlerContext r0, io.netty.channel.ChannelPromise r1) {
            r0.invokeDeregister(r1)
            return
    }

    static /* synthetic */ io.netty.channel.DefaultChannelPipeline access$1600(io.netty.channel.AbstractChannelHandlerContext r0) {
            io.netty.channel.DefaultChannelPipeline r0 = r0.pipeline
            return r0
    }

    static /* synthetic */ void access$1700(io.netty.channel.AbstractChannelHandlerContext r0, java.lang.Object r1, io.netty.channel.ChannelPromise r2) {
            r0.invokeWrite(r1, r2)
            return
    }

    static /* synthetic */ void access$200(io.netty.channel.AbstractChannelHandlerContext r0) {
            r0.invokeChannelActive()
            return
    }

    static /* synthetic */ void access$2100(io.netty.channel.AbstractChannelHandlerContext r0) {
            r0.invokeFlush()
            return
    }

    static /* synthetic */ void access$2300(io.netty.channel.AbstractChannelHandlerContext r0) {
            r0.invokeChannelReadComplete()
            return
    }

    static /* synthetic */ void access$2400(io.netty.channel.AbstractChannelHandlerContext r0) {
            r0.invokeRead()
            return
    }

    static /* synthetic */ void access$2500(io.netty.channel.AbstractChannelHandlerContext r0) {
            r0.invokeChannelWritabilityChanged()
            return
    }

    static /* synthetic */ void access$300(io.netty.channel.AbstractChannelHandlerContext r0) {
            r0.invokeChannelInactive()
            return
    }

    static /* synthetic */ void access$400(io.netty.channel.AbstractChannelHandlerContext r0, java.lang.Throwable r1) {
            r0.invokeExceptionCaught(r1)
            return
    }

    static /* synthetic */ void access$500(io.netty.channel.AbstractChannelHandlerContext r0, java.lang.Object r1) {
            r0.invokeUserEventTriggered(r1)
            return
    }

    static /* synthetic */ void access$600(io.netty.channel.AbstractChannelHandlerContext r0, java.lang.Object r1) {
            r0.invokeChannelRead(r1)
            return
    }

    static /* synthetic */ void access$900(io.netty.channel.AbstractChannelHandlerContext r0, java.net.SocketAddress r1, io.netty.channel.ChannelPromise r2) {
            r0.invokeBind(r1, r2)
            return
    }

    private io.netty.channel.AbstractChannelHandlerContext findContextInbound(int r3) {
            r2 = this;
            r0 = r2
        L1:
            io.netty.channel.AbstractChannelHandlerContext r0 = r0.next
            int r1 = r0.executionMask
            r1 = r1 & r3
            if (r1 == 0) goto L1
            return r0
    }

    private io.netty.channel.AbstractChannelHandlerContext findContextOutbound(int r3) {
            r2 = this;
            r0 = r2
        L1:
            io.netty.channel.AbstractChannelHandlerContext r0 = r0.prev
            int r1 = r0.executionMask
            r1 = r1 & r3
            if (r1 == 0) goto L1
            return r0
    }

    private static boolean inExceptionCaught(java.lang.Throwable r6) {
        L0:
            java.lang.StackTraceElement[] r0 = r6.getStackTrace()
            r1 = 0
            if (r0 == 0) goto L21
            int r2 = r0.length
            r3 = 0
        L9:
            if (r3 >= r2) goto L21
            r4 = r0[r3]
            if (r4 != 0) goto L10
            goto L21
        L10:
            java.lang.String r5 = "exceptionCaught"
            java.lang.String r4 = r4.getMethodName()
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L1e
            r6 = 1
            return r6
        L1e:
            int r3 = r3 + 1
            goto L9
        L21:
            java.lang.Throwable r6 = r6.getCause()
            if (r6 != 0) goto L0
            return r1
    }

    private void invokeBind(java.net.SocketAddress r2, io.netty.channel.ChannelPromise r3) {
            r1 = this;
            boolean r0 = r1.invokeHandler()
            if (r0 == 0) goto L15
            io.netty.channel.ChannelHandler r0 = r1.handler()     // Catch: java.lang.Throwable -> L10
            io.netty.channel.ChannelOutboundHandler r0 = (io.netty.channel.ChannelOutboundHandler) r0     // Catch: java.lang.Throwable -> L10
            r0.bind(r1, r2, r3)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r2 = move-exception
            notifyOutboundHandlerException(r2, r3)
            return
        L15:
            r1.bind(r2, r3)
            return
    }

    private void invokeChannelActive() {
            r1 = this;
            boolean r0 = r1.invokeHandler()
            if (r0 == 0) goto L15
            io.netty.channel.ChannelHandler r0 = r1.handler()     // Catch: java.lang.Throwable -> L10
            io.netty.channel.ChannelInboundHandler r0 = (io.netty.channel.ChannelInboundHandler) r0     // Catch: java.lang.Throwable -> L10
            r0.channelActive(r1)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r0 = move-exception
            r1.notifyHandlerException(r0)
            return
        L15:
            r1.fireChannelActive()
            return
    }

    static void invokeChannelActive(io.netty.channel.AbstractChannelHandlerContext r2) {
            io.netty.util.concurrent.EventExecutor r0 = r2.executor()
            boolean r1 = r0.inEventLoop()
            if (r1 == 0) goto Le
            r2.invokeChannelActive()
            return
        Le:
            io.netty.channel.AbstractChannelHandlerContext$3 r1 = new io.netty.channel.AbstractChannelHandlerContext$3
            r1.<init>(r2)
            r0.execute(r1)
            return
    }

    private void invokeChannelInactive() {
            r1 = this;
            boolean r0 = r1.invokeHandler()
            if (r0 == 0) goto L15
            io.netty.channel.ChannelHandler r0 = r1.handler()     // Catch: java.lang.Throwable -> L10
            io.netty.channel.ChannelInboundHandler r0 = (io.netty.channel.ChannelInboundHandler) r0     // Catch: java.lang.Throwable -> L10
            r0.channelInactive(r1)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r0 = move-exception
            r1.notifyHandlerException(r0)
            return
        L15:
            r1.fireChannelInactive()
            return
    }

    static void invokeChannelInactive(io.netty.channel.AbstractChannelHandlerContext r2) {
            io.netty.util.concurrent.EventExecutor r0 = r2.executor()
            boolean r1 = r0.inEventLoop()
            if (r1 == 0) goto Le
            r2.invokeChannelInactive()
            return
        Le:
            io.netty.channel.AbstractChannelHandlerContext$4 r1 = new io.netty.channel.AbstractChannelHandlerContext$4
            r1.<init>(r2)
            r0.execute(r1)
            return
    }

    static void invokeChannelRead(io.netty.channel.AbstractChannelHandlerContext r2, java.lang.Object r3) {
            io.netty.channel.DefaultChannelPipeline r0 = r2.pipeline
            java.lang.String r1 = "msg"
            java.lang.Object r3 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r1)
            java.lang.Object r3 = r0.touch(r3, r2)
            io.netty.util.concurrent.EventExecutor r0 = r2.executor()
            boolean r1 = r0.inEventLoop()
            if (r1 == 0) goto L1a
            r2.invokeChannelRead(r3)
            return
        L1a:
            io.netty.channel.AbstractChannelHandlerContext$7 r1 = new io.netty.channel.AbstractChannelHandlerContext$7
            r1.<init>(r2, r3)
            r0.execute(r1)
            return
    }

    private void invokeChannelRead(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.invokeHandler()
            if (r0 == 0) goto L15
            io.netty.channel.ChannelHandler r0 = r1.handler()     // Catch: java.lang.Throwable -> L10
            io.netty.channel.ChannelInboundHandler r0 = (io.netty.channel.ChannelInboundHandler) r0     // Catch: java.lang.Throwable -> L10
            r0.channelRead(r1, r2)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r2 = move-exception
            r1.notifyHandlerException(r2)
            return
        L15:
            r1.fireChannelRead(r2)
            return
    }

    private void invokeChannelReadComplete() {
            r1 = this;
            boolean r0 = r1.invokeHandler()
            if (r0 == 0) goto L15
            io.netty.channel.ChannelHandler r0 = r1.handler()     // Catch: java.lang.Throwable -> L10
            io.netty.channel.ChannelInboundHandler r0 = (io.netty.channel.ChannelInboundHandler) r0     // Catch: java.lang.Throwable -> L10
            r0.channelReadComplete(r1)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r0 = move-exception
            r1.notifyHandlerException(r0)
            return
        L15:
            r1.fireChannelReadComplete()
            return
    }

    static void invokeChannelReadComplete(io.netty.channel.AbstractChannelHandlerContext r2) {
            io.netty.util.concurrent.EventExecutor r0 = r2.executor()
            boolean r1 = r0.inEventLoop()
            if (r1 == 0) goto Le
            r2.invokeChannelReadComplete()
            return
        Le:
            io.netty.channel.AbstractChannelHandlerContext$Tasks r1 = r2.invokeTasks
            if (r1 != 0) goto L19
            io.netty.channel.AbstractChannelHandlerContext$Tasks r1 = new io.netty.channel.AbstractChannelHandlerContext$Tasks
            r1.<init>(r2)
            r2.invokeTasks = r1
        L19:
            java.lang.Runnable r2 = io.netty.channel.AbstractChannelHandlerContext.Tasks.access$700(r1)
            r0.execute(r2)
            return
    }

    private void invokeChannelRegistered() {
            r1 = this;
            boolean r0 = r1.invokeHandler()
            if (r0 == 0) goto L15
            io.netty.channel.ChannelHandler r0 = r1.handler()     // Catch: java.lang.Throwable -> L10
            io.netty.channel.ChannelInboundHandler r0 = (io.netty.channel.ChannelInboundHandler) r0     // Catch: java.lang.Throwable -> L10
            r0.channelRegistered(r1)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r0 = move-exception
            r1.notifyHandlerException(r0)
            return
        L15:
            r1.fireChannelRegistered()
            return
    }

    static void invokeChannelRegistered(io.netty.channel.AbstractChannelHandlerContext r2) {
            io.netty.util.concurrent.EventExecutor r0 = r2.executor()
            boolean r1 = r0.inEventLoop()
            if (r1 == 0) goto Le
            r2.invokeChannelRegistered()
            return
        Le:
            io.netty.channel.AbstractChannelHandlerContext$1 r1 = new io.netty.channel.AbstractChannelHandlerContext$1
            r1.<init>(r2)
            r0.execute(r1)
            return
    }

    private void invokeChannelUnregistered() {
            r1 = this;
            boolean r0 = r1.invokeHandler()
            if (r0 == 0) goto L15
            io.netty.channel.ChannelHandler r0 = r1.handler()     // Catch: java.lang.Throwable -> L10
            io.netty.channel.ChannelInboundHandler r0 = (io.netty.channel.ChannelInboundHandler) r0     // Catch: java.lang.Throwable -> L10
            r0.channelUnregistered(r1)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r0 = move-exception
            r1.notifyHandlerException(r0)
            return
        L15:
            r1.fireChannelUnregistered()
            return
    }

    static void invokeChannelUnregistered(io.netty.channel.AbstractChannelHandlerContext r2) {
            io.netty.util.concurrent.EventExecutor r0 = r2.executor()
            boolean r1 = r0.inEventLoop()
            if (r1 == 0) goto Le
            r2.invokeChannelUnregistered()
            return
        Le:
            io.netty.channel.AbstractChannelHandlerContext$2 r1 = new io.netty.channel.AbstractChannelHandlerContext$2
            r1.<init>(r2)
            r0.execute(r1)
            return
    }

    private void invokeChannelWritabilityChanged() {
            r1 = this;
            boolean r0 = r1.invokeHandler()
            if (r0 == 0) goto L15
            io.netty.channel.ChannelHandler r0 = r1.handler()     // Catch: java.lang.Throwable -> L10
            io.netty.channel.ChannelInboundHandler r0 = (io.netty.channel.ChannelInboundHandler) r0     // Catch: java.lang.Throwable -> L10
            r0.channelWritabilityChanged(r1)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r0 = move-exception
            r1.notifyHandlerException(r0)
            return
        L15:
            r1.fireChannelWritabilityChanged()
            return
    }

    static void invokeChannelWritabilityChanged(io.netty.channel.AbstractChannelHandlerContext r2) {
            io.netty.util.concurrent.EventExecutor r0 = r2.executor()
            boolean r1 = r0.inEventLoop()
            if (r1 == 0) goto Le
            r2.invokeChannelWritabilityChanged()
            return
        Le:
            io.netty.channel.AbstractChannelHandlerContext$Tasks r1 = r2.invokeTasks
            if (r1 != 0) goto L19
            io.netty.channel.AbstractChannelHandlerContext$Tasks r1 = new io.netty.channel.AbstractChannelHandlerContext$Tasks
            r1.<init>(r2)
            r2.invokeTasks = r1
        L19:
            java.lang.Runnable r2 = io.netty.channel.AbstractChannelHandlerContext.Tasks.access$800(r1)
            r0.execute(r2)
            return
    }

    private void invokeClose(io.netty.channel.ChannelPromise r2) {
            r1 = this;
            boolean r0 = r1.invokeHandler()
            if (r0 == 0) goto L15
            io.netty.channel.ChannelHandler r0 = r1.handler()     // Catch: java.lang.Throwable -> L10
            io.netty.channel.ChannelOutboundHandler r0 = (io.netty.channel.ChannelOutboundHandler) r0     // Catch: java.lang.Throwable -> L10
            r0.close(r1, r2)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r0 = move-exception
            notifyOutboundHandlerException(r0, r2)
            return
        L15:
            r1.close(r2)
            return
    }

    private void invokeConnect(java.net.SocketAddress r2, java.net.SocketAddress r3, io.netty.channel.ChannelPromise r4) {
            r1 = this;
            boolean r0 = r1.invokeHandler()
            if (r0 == 0) goto L15
            io.netty.channel.ChannelHandler r0 = r1.handler()     // Catch: java.lang.Throwable -> L10
            io.netty.channel.ChannelOutboundHandler r0 = (io.netty.channel.ChannelOutboundHandler) r0     // Catch: java.lang.Throwable -> L10
            r0.connect(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r2 = move-exception
            notifyOutboundHandlerException(r2, r4)
            return
        L15:
            r1.connect(r2, r3, r4)
            return
    }

    private void invokeDeregister(io.netty.channel.ChannelPromise r2) {
            r1 = this;
            boolean r0 = r1.invokeHandler()
            if (r0 == 0) goto L15
            io.netty.channel.ChannelHandler r0 = r1.handler()     // Catch: java.lang.Throwable -> L10
            io.netty.channel.ChannelOutboundHandler r0 = (io.netty.channel.ChannelOutboundHandler) r0     // Catch: java.lang.Throwable -> L10
            r0.deregister(r1, r2)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r0 = move-exception
            notifyOutboundHandlerException(r0, r2)
            return
        L15:
            r1.deregister(r2)
            return
    }

    private void invokeDisconnect(io.netty.channel.ChannelPromise r2) {
            r1 = this;
            boolean r0 = r1.invokeHandler()
            if (r0 == 0) goto L15
            io.netty.channel.ChannelHandler r0 = r1.handler()     // Catch: java.lang.Throwable -> L10
            io.netty.channel.ChannelOutboundHandler r0 = (io.netty.channel.ChannelOutboundHandler) r0     // Catch: java.lang.Throwable -> L10
            r0.disconnect(r1, r2)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r0 = move-exception
            notifyOutboundHandlerException(r0, r2)
            return
        L15:
            r1.disconnect(r2)
            return
    }

    static void invokeExceptionCaught(io.netty.channel.AbstractChannelHandlerContext r2, java.lang.Throwable r3) {
            java.lang.String r0 = "cause"
            io.netty.util.internal.ObjectUtil.checkNotNull(r3, r0)
            io.netty.util.concurrent.EventExecutor r0 = r2.executor()
            boolean r1 = r0.inEventLoop()
            if (r1 == 0) goto L13
            r2.invokeExceptionCaught(r3)
            return
        L13:
            io.netty.channel.AbstractChannelHandlerContext$5 r1 = new io.netty.channel.AbstractChannelHandlerContext$5     // Catch: java.lang.Throwable -> L1c
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L1c
            r0.execute(r1)     // Catch: java.lang.Throwable -> L1c
            return
        L1c:
            r2 = move-exception
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.channel.AbstractChannelHandlerContext.logger
            boolean r1 = r0.isWarnEnabled()
            if (r1 == 0) goto L2f
            java.lang.String r1 = "Failed to submit an exceptionCaught() event."
            r0.warn(r1, r2)
            java.lang.String r2 = "The exceptionCaught() event that was failed to submit was:"
            r0.warn(r2, r3)
        L2f:
            return
    }

    private void invokeExceptionCaught(java.lang.Throwable r4) {
            r3 = this;
            boolean r0 = r3.invokeHandler()
            if (r0 == 0) goto L2d
            io.netty.channel.ChannelHandler r0 = r3.handler()     // Catch: java.lang.Throwable -> Le
            r0.exceptionCaught(r3, r4)     // Catch: java.lang.Throwable -> Le
            return
        Le:
            r0 = move-exception
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.channel.AbstractChannelHandlerContext.logger
            boolean r2 = r1.isDebugEnabled()
            if (r2 == 0) goto L21
            java.lang.String r2 = "An exception {}was thrown by a user handler's exceptionCaught() method while handling the following exception:"
            java.lang.String r0 = io.netty.util.internal.ThrowableUtil.stackTraceToString(r0)
            r1.debug(r2, r0, r4)
            goto L2c
        L21:
            boolean r2 = r1.isWarnEnabled()
            if (r2 == 0) goto L2c
            java.lang.String r2 = "An exception '{}' [enable DEBUG level for full stacktrace] was thrown by a user handler's exceptionCaught() method while handling the following exception:"
            r1.warn(r2, r0, r4)
        L2c:
            return
        L2d:
            r3.fireExceptionCaught(r4)
            return
    }

    private void invokeFlush() {
            r1 = this;
            boolean r0 = r1.invokeHandler()
            if (r0 == 0) goto La
            r1.invokeFlush0()
            return
        La:
            r1.flush()
            return
    }

    private void invokeFlush0() {
            r1 = this;
            io.netty.channel.ChannelHandler r0 = r1.handler()     // Catch: java.lang.Throwable -> La
            io.netty.channel.ChannelOutboundHandler r0 = (io.netty.channel.ChannelOutboundHandler) r0     // Catch: java.lang.Throwable -> La
            r0.flush(r1)     // Catch: java.lang.Throwable -> La
            return
        La:
            r0 = move-exception
            r1.notifyHandlerException(r0)
            return
    }

    private boolean invokeHandler() {
            r3 = this;
            int r0 = r3.handlerState
            r1 = 2
            r2 = 1
            if (r0 == r1) goto Lf
            boolean r1 = r3.ordered
            if (r1 != 0) goto Ld
            if (r0 != r2) goto Ld
            goto Lf
        Ld:
            r0 = 0
            return r0
        Lf:
            return r2
    }

    private void invokeRead() {
            r1 = this;
            boolean r0 = r1.invokeHandler()
            if (r0 == 0) goto L15
            io.netty.channel.ChannelHandler r0 = r1.handler()     // Catch: java.lang.Throwable -> L10
            io.netty.channel.ChannelOutboundHandler r0 = (io.netty.channel.ChannelOutboundHandler) r0     // Catch: java.lang.Throwable -> L10
            r0.read(r1)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r0 = move-exception
            r1.notifyHandlerException(r0)
            return
        L15:
            r1.read()
            return
    }

    static void invokeUserEventTriggered(io.netty.channel.AbstractChannelHandlerContext r2, java.lang.Object r3) {
            java.lang.String r0 = "event"
            io.netty.util.internal.ObjectUtil.checkNotNull(r3, r0)
            io.netty.util.concurrent.EventExecutor r0 = r2.executor()
            boolean r1 = r0.inEventLoop()
            if (r1 == 0) goto L13
            r2.invokeUserEventTriggered(r3)
            return
        L13:
            io.netty.channel.AbstractChannelHandlerContext$6 r1 = new io.netty.channel.AbstractChannelHandlerContext$6
            r1.<init>(r2, r3)
            r0.execute(r1)
            return
    }

    private void invokeUserEventTriggered(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.invokeHandler()
            if (r0 == 0) goto L15
            io.netty.channel.ChannelHandler r0 = r1.handler()     // Catch: java.lang.Throwable -> L10
            io.netty.channel.ChannelInboundHandler r0 = (io.netty.channel.ChannelInboundHandler) r0     // Catch: java.lang.Throwable -> L10
            r0.userEventTriggered(r1, r2)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r2 = move-exception
            r1.notifyHandlerException(r2)
            return
        L15:
            r1.fireUserEventTriggered(r2)
            return
    }

    private void invokeWrite(java.lang.Object r2, io.netty.channel.ChannelPromise r3) {
            r1 = this;
            boolean r0 = r1.invokeHandler()
            if (r0 == 0) goto La
            r1.invokeWrite0(r2, r3)
            return
        La:
            r1.write(r2, r3)
            return
    }

    private void invokeWrite0(java.lang.Object r2, io.netty.channel.ChannelPromise r3) {
            r1 = this;
            io.netty.channel.ChannelHandler r0 = r1.handler()     // Catch: java.lang.Throwable -> La
            io.netty.channel.ChannelOutboundHandler r0 = (io.netty.channel.ChannelOutboundHandler) r0     // Catch: java.lang.Throwable -> La
            r0.write(r1, r2, r3)     // Catch: java.lang.Throwable -> La
            return
        La:
            r2 = move-exception
            notifyOutboundHandlerException(r2, r3)
            return
    }

    private void invokeWriteAndFlush(java.lang.Object r2, io.netty.channel.ChannelPromise r3) {
            r1 = this;
            boolean r0 = r1.invokeHandler()
            if (r0 == 0) goto Ld
            r1.invokeWrite0(r2, r3)
            r1.invokeFlush0()
            return
        Ld:
            r1.writeAndFlush(r2, r3)
            return
    }

    private boolean isNotValidPromise(io.netty.channel.ChannelPromise r5, boolean r6) {
            r4 = this;
            if (r5 == 0) goto L9c
            boolean r0 = r5.isDone()
            r1 = 1
            if (r0 == 0) goto L27
            boolean r6 = r5.isCancelled()
            if (r6 == 0) goto L10
            return r1
        L10:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "promise already done: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
        L27:
            io.netty.channel.Channel r0 = r5.channel()
            io.netty.channel.Channel r2 = r4.channel()
            r3 = 0
            if (r0 != r2) goto L81
            java.lang.Class r0 = r5.getClass()
            java.lang.Class<io.netty.channel.DefaultChannelPromise> r1 = io.netty.channel.DefaultChannelPromise.class
            if (r0 != r1) goto L3b
            return r3
        L3b:
            if (r6 != 0) goto L5f
            boolean r6 = r5 instanceof io.netty.channel.VoidChannelPromise
            if (r6 != 0) goto L42
            goto L5f
        L42:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.Class<io.netty.channel.VoidChannelPromise> r0 = io.netty.channel.VoidChannelPromise.class
            java.lang.String r0 = io.netty.util.internal.StringUtil.simpleClassName(r0)
            r6.append(r0)
            java.lang.String r0 = " not allowed for this operation"
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L5f:
            boolean r5 = r5 instanceof io.netty.channel.AbstractChannel.CloseFuture
            if (r5 != 0) goto L64
            return r3
        L64:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.Class<io.netty.channel.AbstractChannel$CloseFuture> r0 = io.netty.channel.AbstractChannel.CloseFuture.class
            java.lang.String r0 = io.netty.util.internal.StringUtil.simpleClassName(r0)
            r6.append(r0)
            java.lang.String r0 = " not allowed in a pipeline"
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L81:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            io.netty.channel.Channel r5 = r5.channel()
            io.netty.channel.Channel r0 = r4.channel()
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r3] = r5
            r2[r1] = r0
            java.lang.String r5 = "promise.channel does not match: %s (expected: %s)"
            java.lang.String r5 = java.lang.String.format(r5, r2)
            r6.<init>(r5)
            throw r6
        L9c:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "promise"
            r5.<init>(r6)
            throw r5
    }

    private void notifyHandlerException(java.lang.Throwable r3) {
            r2 = this;
            boolean r0 = inExceptionCaught(r3)
            if (r0 == 0) goto L14
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.channel.AbstractChannelHandlerContext.logger
            boolean r1 = r0.isWarnEnabled()
            if (r1 == 0) goto L13
            java.lang.String r1 = "An exception was thrown by a user handler while handling an exceptionCaught event"
            r0.warn(r1, r3)
        L13:
            return
        L14:
            r2.invokeExceptionCaught(r3)
            return
    }

    private static void notifyOutboundHandlerException(java.lang.Throwable r1, io.netty.channel.ChannelPromise r2) {
            boolean r0 = r2 instanceof io.netty.channel.VoidChannelPromise
            if (r0 == 0) goto L6
            r0 = 0
            goto L8
        L6:
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.channel.AbstractChannelHandlerContext.logger
        L8:
            io.netty.util.internal.PromiseNotificationUtil.tryFailure(r2, r1, r0)
            return
    }

    private static boolean safeExecute(io.netty.util.concurrent.EventExecutor r0, java.lang.Runnable r1, io.netty.channel.ChannelPromise r2, java.lang.Object r3) {
            r0.execute(r1)     // Catch: java.lang.Throwable -> L5
            r0 = 1
            return r0
        L5:
            r0 = move-exception
            r2.setFailure(r0)     // Catch: java.lang.Throwable -> L10
            if (r3 == 0) goto Le
            io.netty.util.ReferenceCountUtil.release(r3)
        Le:
            r0 = 0
            return r0
        L10:
            r0 = move-exception
            if (r3 == 0) goto L16
            io.netty.util.ReferenceCountUtil.release(r3)
        L16:
            throw r0
    }

    private void write(java.lang.Object r4, boolean r5, io.netty.channel.ChannelPromise r6) {
            r3 = this;
            java.lang.String r0 = "msg"
            io.netty.util.internal.ObjectUtil.checkNotNull(r4, r0)
            r0 = 1
            boolean r0 = r3.isNotValidPromise(r6, r0)     // Catch: java.lang.RuntimeException -> L10
            if (r0 == 0) goto L12
            io.netty.util.ReferenceCountUtil.release(r4)     // Catch: java.lang.RuntimeException -> L10
            return
        L10:
            r5 = move-exception
            goto L4e
        L12:
            if (r5 == 0) goto L18
            r0 = 98304(0x18000, float:1.37753E-40)
            goto L1b
        L18:
            r0 = 32768(0x8000, float:4.5918E-41)
        L1b:
            io.netty.channel.AbstractChannelHandlerContext r0 = r3.findContextOutbound(r0)
            io.netty.channel.DefaultChannelPipeline r1 = r3.pipeline
            java.lang.Object r4 = r1.touch(r4, r0)
            io.netty.util.concurrent.EventExecutor r1 = r0.executor()
            boolean r2 = r1.inEventLoop()
            if (r2 == 0) goto L39
            if (r5 == 0) goto L35
            r0.invokeWriteAndFlush(r4, r6)
            return
        L35:
            r0.invokeWrite(r4, r6)
            return
        L39:
            if (r5 == 0) goto L40
            io.netty.channel.AbstractChannelHandlerContext$WriteAndFlushTask r5 = io.netty.channel.AbstractChannelHandlerContext.WriteAndFlushTask.newInstance(r0, r4, r6)
            goto L44
        L40:
            io.netty.channel.AbstractChannelHandlerContext$WriteTask r5 = io.netty.channel.AbstractChannelHandlerContext.WriteTask.newInstance(r0, r4, r6)
        L44:
            boolean r4 = safeExecute(r1, r5, r6, r4)
            if (r4 != 0) goto L4d
            r5.cancel()
        L4d:
            return
        L4e:
            io.netty.util.ReferenceCountUtil.release(r4)
            throw r5
    }

    @Override // io.netty.channel.ChannelHandlerContext
    public io.netty.buffer.ByteBufAllocator alloc() {
            r1 = this;
            io.netty.channel.Channel r0 = r1.channel()
            io.netty.channel.ChannelConfig r0 = r0.config()
            io.netty.buffer.ByteBufAllocator r0 = r0.getAllocator()
            return r0
    }

    @Override // io.netty.channel.ChannelHandlerContext
    public <T> io.netty.util.Attribute<T> attr(io.netty.util.AttributeKey<T> r2) {
            r1 = this;
            io.netty.channel.Channel r0 = r1.channel()
            io.netty.util.Attribute r2 = r0.attr(r2)
            return r2
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelFuture bind(java.net.SocketAddress r2) {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.newPromise()
            io.netty.channel.ChannelFuture r2 = r1.bind(r2, r0)
            return r2
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelFuture bind(java.net.SocketAddress r4, io.netty.channel.ChannelPromise r5) {
            r3 = this;
            if (r4 == 0) goto L28
            r0 = 0
            boolean r0 = r3.isNotValidPromise(r5, r0)
            if (r0 == 0) goto La
            return r5
        La:
            r0 = 512(0x200, float:7.17E-43)
            io.netty.channel.AbstractChannelHandlerContext r0 = r3.findContextOutbound(r0)
            io.netty.util.concurrent.EventExecutor r1 = r0.executor()
            boolean r2 = r1.inEventLoop()
            if (r2 == 0) goto L1e
            r0.invokeBind(r4, r5)
            return r5
        L1e:
            io.netty.channel.AbstractChannelHandlerContext$8 r2 = new io.netty.channel.AbstractChannelHandlerContext$8
            r2.<init>(r3, r0, r4, r5)
            r4 = 0
            safeExecute(r1, r2, r5, r4)
            return r5
        L28:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "localAddress"
            r4.<init>(r5)
            throw r4
    }

    final void callHandlerAdded() throws java.lang.Exception {
            r1 = this;
            boolean r0 = r1.setAddComplete()
            if (r0 == 0) goto Ld
            io.netty.channel.ChannelHandler r0 = r1.handler()
            r0.handlerAdded(r1)
        Ld:
            return
    }

    final void callHandlerRemoved() throws java.lang.Exception {
            r2 = this;
            int r0 = r2.handlerState     // Catch: java.lang.Throwable -> Ld
            r1 = 2
            if (r0 != r1) goto Lf
            io.netty.channel.ChannelHandler r0 = r2.handler()     // Catch: java.lang.Throwable -> Ld
            r0.handlerRemoved(r2)     // Catch: java.lang.Throwable -> Ld
            goto Lf
        Ld:
            r0 = move-exception
            goto L13
        Lf:
            r2.setRemoved()
            return
        L13:
            r2.setRemoved()
            throw r0
    }

    @Override // io.netty.channel.ChannelHandlerContext
    public io.netty.channel.Channel channel() {
            r1 = this;
            io.netty.channel.DefaultChannelPipeline r0 = r1.pipeline
            io.netty.channel.Channel r0 = r0.channel()
            return r0
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelFuture close() {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.newPromise()
            io.netty.channel.ChannelFuture r0 = r1.close(r0)
            return r0
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelFuture close(io.netty.channel.ChannelPromise r4) {
            r3 = this;
            r0 = 0
            boolean r0 = r3.isNotValidPromise(r4, r0)
            if (r0 == 0) goto L8
            return r4
        L8:
            r0 = 4096(0x1000, float:5.74E-42)
            io.netty.channel.AbstractChannelHandlerContext r0 = r3.findContextOutbound(r0)
            io.netty.util.concurrent.EventExecutor r1 = r0.executor()
            boolean r2 = r1.inEventLoop()
            if (r2 == 0) goto L1c
            r0.invokeClose(r4)
            return r4
        L1c:
            io.netty.channel.AbstractChannelHandlerContext$11 r2 = new io.netty.channel.AbstractChannelHandlerContext$11
            r2.<init>(r3, r0, r4)
            r0 = 0
            safeExecute(r1, r2, r4, r0)
            return r4
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelFuture connect(java.net.SocketAddress r2) {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.newPromise()
            io.netty.channel.ChannelFuture r2 = r1.connect(r2, r0)
            return r2
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelFuture connect(java.net.SocketAddress r2, io.netty.channel.ChannelPromise r3) {
            r1 = this;
            r0 = 0
            io.netty.channel.ChannelFuture r2 = r1.connect(r2, r0, r3)
            return r2
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelFuture connect(java.net.SocketAddress r2, java.net.SocketAddress r3) {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.newPromise()
            io.netty.channel.ChannelFuture r2 = r1.connect(r2, r3, r0)
            return r2
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelFuture connect(java.net.SocketAddress r8, java.net.SocketAddress r9, io.netty.channel.ChannelPromise r10) {
            r7 = this;
            if (r8 == 0) goto L2c
            r0 = 0
            boolean r0 = r7.isNotValidPromise(r10, r0)
            if (r0 == 0) goto La
            return r10
        La:
            r0 = 1024(0x400, float:1.435E-42)
            io.netty.channel.AbstractChannelHandlerContext r3 = r7.findContextOutbound(r0)
            io.netty.util.concurrent.EventExecutor r0 = r3.executor()
            boolean r1 = r0.inEventLoop()
            if (r1 == 0) goto L1e
            r3.invokeConnect(r8, r9, r10)
            return r10
        L1e:
            io.netty.channel.AbstractChannelHandlerContext$9 r1 = new io.netty.channel.AbstractChannelHandlerContext$9
            r2 = r7
            r4 = r8
            r5 = r9
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            r8 = 0
            safeExecute(r0, r1, r6, r8)
            return r6
        L2c:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            java.lang.String r9 = "remoteAddress"
            r8.<init>(r9)
            throw r8
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelFuture deregister() {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.newPromise()
            io.netty.channel.ChannelFuture r0 = r1.deregister(r0)
            return r0
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelFuture deregister(io.netty.channel.ChannelPromise r4) {
            r3 = this;
            r0 = 0
            boolean r0 = r3.isNotValidPromise(r4, r0)
            if (r0 == 0) goto L8
            return r4
        L8:
            r0 = 8192(0x2000, float:1.148E-41)
            io.netty.channel.AbstractChannelHandlerContext r0 = r3.findContextOutbound(r0)
            io.netty.util.concurrent.EventExecutor r1 = r0.executor()
            boolean r2 = r1.inEventLoop()
            if (r2 == 0) goto L1c
            r0.invokeDeregister(r4)
            return r4
        L1c:
            io.netty.channel.AbstractChannelHandlerContext$12 r2 = new io.netty.channel.AbstractChannelHandlerContext$12
            r2.<init>(r3, r0, r4)
            r0 = 0
            safeExecute(r1, r2, r4, r0)
            return r4
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelFuture disconnect() {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.newPromise()
            io.netty.channel.ChannelFuture r0 = r1.disconnect(r0)
            return r0
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelFuture disconnect(io.netty.channel.ChannelPromise r4) {
            r3 = this;
            io.netty.channel.Channel r0 = r3.channel()
            io.netty.channel.ChannelMetadata r0 = r0.metadata()
            boolean r0 = r0.hasDisconnect()
            if (r0 != 0) goto L13
            io.netty.channel.ChannelFuture r4 = r3.close(r4)
            return r4
        L13:
            r0 = 0
            boolean r0 = r3.isNotValidPromise(r4, r0)
            if (r0 == 0) goto L1b
            return r4
        L1b:
            r0 = 2048(0x800, float:2.87E-42)
            io.netty.channel.AbstractChannelHandlerContext r0 = r3.findContextOutbound(r0)
            io.netty.util.concurrent.EventExecutor r1 = r0.executor()
            boolean r2 = r1.inEventLoop()
            if (r2 == 0) goto L2f
            r0.invokeDisconnect(r4)
            return r4
        L2f:
            io.netty.channel.AbstractChannelHandlerContext$10 r2 = new io.netty.channel.AbstractChannelHandlerContext$10
            r2.<init>(r3, r0, r4)
            r0 = 0
            safeExecute(r1, r2, r4, r0)
            return r4
    }

    @Override // io.netty.channel.ChannelHandlerContext
    public io.netty.util.concurrent.EventExecutor executor() {
            r1 = this;
            io.netty.util.concurrent.EventExecutor r0 = r1.executor
            if (r0 != 0) goto Lc
            io.netty.channel.Channel r0 = r1.channel()
            io.netty.channel.EventLoop r0 = r0.eventLoop()
        Lc:
            return r0
    }

    @Override // io.netty.channel.ChannelHandlerContext, io.netty.channel.ChannelInboundInvoker
    public io.netty.channel.ChannelHandlerContext fireChannelActive() {
            r1 = this;
            r0 = 8
            io.netty.channel.AbstractChannelHandlerContext r0 = r1.findContextInbound(r0)
            invokeChannelActive(r0)
            return r1
    }

    @Override // io.netty.channel.ChannelInboundInvoker
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelInboundInvoker fireChannelActive() {
            r1 = this;
            io.netty.channel.ChannelHandlerContext r0 = r1.fireChannelActive()
            return r0
    }

    @Override // io.netty.channel.ChannelHandlerContext, io.netty.channel.ChannelInboundInvoker
    public io.netty.channel.ChannelHandlerContext fireChannelInactive() {
            r1 = this;
            r0 = 16
            io.netty.channel.AbstractChannelHandlerContext r0 = r1.findContextInbound(r0)
            invokeChannelInactive(r0)
            return r1
    }

    @Override // io.netty.channel.ChannelInboundInvoker
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelInboundInvoker fireChannelInactive() {
            r1 = this;
            io.netty.channel.ChannelHandlerContext r0 = r1.fireChannelInactive()
            return r0
    }

    @Override // io.netty.channel.ChannelHandlerContext, io.netty.channel.ChannelInboundInvoker
    public io.netty.channel.ChannelHandlerContext fireChannelRead(java.lang.Object r2) {
            r1 = this;
            r0 = 32
            io.netty.channel.AbstractChannelHandlerContext r0 = r1.findContextInbound(r0)
            invokeChannelRead(r0, r2)
            return r1
    }

    @Override // io.netty.channel.ChannelInboundInvoker
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelInboundInvoker fireChannelRead(java.lang.Object r1) {
            r0 = this;
            io.netty.channel.ChannelHandlerContext r1 = r0.fireChannelRead(r1)
            return r1
    }

    @Override // io.netty.channel.ChannelHandlerContext, io.netty.channel.ChannelInboundInvoker
    public io.netty.channel.ChannelHandlerContext fireChannelReadComplete() {
            r1 = this;
            r0 = 64
            io.netty.channel.AbstractChannelHandlerContext r0 = r1.findContextInbound(r0)
            invokeChannelReadComplete(r0)
            return r1
    }

    @Override // io.netty.channel.ChannelInboundInvoker
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelInboundInvoker fireChannelReadComplete() {
            r1 = this;
            io.netty.channel.ChannelHandlerContext r0 = r1.fireChannelReadComplete()
            return r0
    }

    @Override // io.netty.channel.ChannelHandlerContext, io.netty.channel.ChannelInboundInvoker
    public io.netty.channel.ChannelHandlerContext fireChannelRegistered() {
            r1 = this;
            r0 = 2
            io.netty.channel.AbstractChannelHandlerContext r0 = r1.findContextInbound(r0)
            invokeChannelRegistered(r0)
            return r1
    }

    @Override // io.netty.channel.ChannelInboundInvoker
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelInboundInvoker fireChannelRegistered() {
            r1 = this;
            io.netty.channel.ChannelHandlerContext r0 = r1.fireChannelRegistered()
            return r0
    }

    @Override // io.netty.channel.ChannelHandlerContext, io.netty.channel.ChannelInboundInvoker
    public io.netty.channel.ChannelHandlerContext fireChannelUnregistered() {
            r1 = this;
            r0 = 4
            io.netty.channel.AbstractChannelHandlerContext r0 = r1.findContextInbound(r0)
            invokeChannelUnregistered(r0)
            return r1
    }

    @Override // io.netty.channel.ChannelInboundInvoker
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelInboundInvoker fireChannelUnregistered() {
            r1 = this;
            io.netty.channel.ChannelHandlerContext r0 = r1.fireChannelUnregistered()
            return r0
    }

    @Override // io.netty.channel.ChannelHandlerContext, io.netty.channel.ChannelInboundInvoker
    public io.netty.channel.ChannelHandlerContext fireChannelWritabilityChanged() {
            r1 = this;
            r0 = 256(0x100, float:3.59E-43)
            io.netty.channel.AbstractChannelHandlerContext r0 = r1.findContextInbound(r0)
            invokeChannelWritabilityChanged(r0)
            return r1
    }

    @Override // io.netty.channel.ChannelInboundInvoker
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelInboundInvoker fireChannelWritabilityChanged() {
            r1 = this;
            io.netty.channel.ChannelHandlerContext r0 = r1.fireChannelWritabilityChanged()
            return r0
    }

    @Override // io.netty.channel.ChannelHandlerContext, io.netty.channel.ChannelInboundInvoker
    public io.netty.channel.ChannelHandlerContext fireExceptionCaught(java.lang.Throwable r2) {
            r1 = this;
            r0 = 1
            io.netty.channel.AbstractChannelHandlerContext r0 = r1.findContextInbound(r0)
            invokeExceptionCaught(r0, r2)
            return r1
    }

    @Override // io.netty.channel.ChannelInboundInvoker
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelInboundInvoker fireExceptionCaught(java.lang.Throwable r1) {
            r0 = this;
            io.netty.channel.ChannelHandlerContext r1 = r0.fireExceptionCaught(r1)
            return r1
    }

    @Override // io.netty.channel.ChannelHandlerContext, io.netty.channel.ChannelInboundInvoker
    public io.netty.channel.ChannelHandlerContext fireUserEventTriggered(java.lang.Object r2) {
            r1 = this;
            r0 = 128(0x80, float:1.8E-43)
            io.netty.channel.AbstractChannelHandlerContext r0 = r1.findContextInbound(r0)
            invokeUserEventTriggered(r0, r2)
            return r1
    }

    @Override // io.netty.channel.ChannelInboundInvoker
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelInboundInvoker fireUserEventTriggered(java.lang.Object r1) {
            r0 = this;
            io.netty.channel.ChannelHandlerContext r1 = r0.fireUserEventTriggered(r1)
            return r1
    }

    @Override // io.netty.channel.ChannelHandlerContext, io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelHandlerContext flush() {
            r4 = this;
            r0 = 65536(0x10000, float:9.1835E-41)
            io.netty.channel.AbstractChannelHandlerContext r0 = r4.findContextOutbound(r0)
            io.netty.util.concurrent.EventExecutor r1 = r0.executor()
            boolean r2 = r1.inEventLoop()
            if (r2 == 0) goto L14
            r0.invokeFlush()
            return r4
        L14:
            io.netty.channel.AbstractChannelHandlerContext$Tasks r2 = r0.invokeTasks
            if (r2 != 0) goto L1f
            io.netty.channel.AbstractChannelHandlerContext$Tasks r2 = new io.netty.channel.AbstractChannelHandlerContext$Tasks
            r2.<init>(r0)
            r0.invokeTasks = r2
        L1f:
            java.lang.Runnable r0 = io.netty.channel.AbstractChannelHandlerContext.Tasks.access$1500(r2)
            io.netty.channel.Channel r2 = r4.channel()
            io.netty.channel.ChannelPromise r2 = r2.voidPromise()
            r3 = 0
            safeExecute(r1, r0, r2, r3)
            return r4
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelOutboundInvoker flush() {
            r1 = this;
            io.netty.channel.ChannelHandlerContext r0 = r1.flush()
            return r0
    }

    @Override // io.netty.channel.ChannelHandlerContext
    public <T> boolean hasAttr(io.netty.util.AttributeKey<T> r2) {
            r1 = this;
            io.netty.channel.Channel r0 = r1.channel()
            boolean r2 = r0.hasAttr(r2)
            return r2
    }

    @Override // io.netty.channel.ChannelHandlerContext
    public boolean isRemoved() {
            r2 = this;
            int r0 = r2.handlerState
            r1 = 3
            if (r0 != r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    @Override // io.netty.channel.ChannelHandlerContext
    public java.lang.String name() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelFuture newFailedFuture(java.lang.Throwable r4) {
            r3 = this;
            io.netty.channel.FailedChannelFuture r0 = new io.netty.channel.FailedChannelFuture
            io.netty.channel.Channel r1 = r3.channel()
            io.netty.util.concurrent.EventExecutor r2 = r3.executor()
            r0.<init>(r1, r2, r4)
            return r0
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelProgressivePromise newProgressivePromise() {
            r3 = this;
            io.netty.channel.DefaultChannelProgressivePromise r0 = new io.netty.channel.DefaultChannelProgressivePromise
            io.netty.channel.Channel r1 = r3.channel()
            io.netty.util.concurrent.EventExecutor r2 = r3.executor()
            r0.<init>(r1, r2)
            return r0
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelPromise newPromise() {
            r3 = this;
            io.netty.channel.DefaultChannelPromise r0 = new io.netty.channel.DefaultChannelPromise
            io.netty.channel.Channel r1 = r3.channel()
            io.netty.util.concurrent.EventExecutor r2 = r3.executor()
            r0.<init>(r1, r2)
            return r0
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelFuture newSucceededFuture() {
            r3 = this;
            io.netty.channel.ChannelFuture r0 = r3.succeededFuture
            if (r0 != 0) goto L13
            io.netty.channel.SucceededChannelFuture r0 = new io.netty.channel.SucceededChannelFuture
            io.netty.channel.Channel r1 = r3.channel()
            io.netty.util.concurrent.EventExecutor r2 = r3.executor()
            r0.<init>(r1, r2)
            r3.succeededFuture = r0
        L13:
            return r0
    }

    @Override // io.netty.channel.ChannelHandlerContext
    public io.netty.channel.ChannelPipeline pipeline() {
            r1 = this;
            io.netty.channel.DefaultChannelPipeline r0 = r1.pipeline
            return r0
    }

    @Override // io.netty.channel.ChannelHandlerContext, io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelHandlerContext read() {
            r3 = this;
            r0 = 16384(0x4000, float:2.2959E-41)
            io.netty.channel.AbstractChannelHandlerContext r0 = r3.findContextOutbound(r0)
            io.netty.util.concurrent.EventExecutor r1 = r0.executor()
            boolean r2 = r1.inEventLoop()
            if (r2 == 0) goto L14
            r0.invokeRead()
            return r3
        L14:
            io.netty.channel.AbstractChannelHandlerContext$Tasks r2 = r0.invokeTasks
            if (r2 != 0) goto L1f
            io.netty.channel.AbstractChannelHandlerContext$Tasks r2 = new io.netty.channel.AbstractChannelHandlerContext$Tasks
            r2.<init>(r0)
            r0.invokeTasks = r2
        L1f:
            java.lang.Runnable r0 = io.netty.channel.AbstractChannelHandlerContext.Tasks.access$1400(r2)
            r1.execute(r0)
            return r3
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelOutboundInvoker read() {
            r1 = this;
            io.netty.channel.ChannelHandlerContext r0 = r1.read()
            return r0
    }

    final boolean setAddComplete() {
            r3 = this;
        L0:
            int r0 = r3.handlerState
            r1 = 3
            if (r0 != r1) goto L7
            r0 = 0
            return r0
        L7:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater<io.netty.channel.AbstractChannelHandlerContext> r1 = io.netty.channel.AbstractChannelHandlerContext.HANDLER_STATE_UPDATER
            r2 = 2
            boolean r0 = r1.compareAndSet(r3, r0, r2)
            if (r0 == 0) goto L0
            r0 = 1
            return r0
    }

    final void setAddPending() {
            r3 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater<io.netty.channel.AbstractChannelHandlerContext> r0 = io.netty.channel.AbstractChannelHandlerContext.HANDLER_STATE_UPDATER
            r1 = 0
            r2 = 1
            r0.compareAndSet(r3, r1, r2)
            return
    }

    final void setRemoved() {
            r1 = this;
            r0 = 3
            r1.handlerState = r0
            return
    }

    public java.lang.String toHintString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 39
            r0.append(r1)
            java.lang.String r1 = r2.name
            r0.append(r1)
            java.lang.String r1 = "' will handle the message from this point."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class<io.netty.channel.ChannelHandlerContext> r1 = io.netty.channel.ChannelHandlerContext.class
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r1)
            r0.append(r1)
            r1 = 40
            r0.append(r1)
            java.lang.String r1 = r2.name
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            io.netty.channel.Channel r1 = r2.channel()
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelPromise voidPromise() {
            r1 = this;
            io.netty.channel.Channel r0 = r1.channel()
            io.netty.channel.ChannelPromise r0 = r0.voidPromise()
            return r0
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelFuture write(java.lang.Object r2) {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.newPromise()
            io.netty.channel.ChannelFuture r2 = r1.write(r2, r0)
            return r2
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelFuture write(java.lang.Object r2, io.netty.channel.ChannelPromise r3) {
            r1 = this;
            r0 = 0
            r1.write(r2, r0, r3)
            return r3
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelFuture writeAndFlush(java.lang.Object r2) {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.newPromise()
            io.netty.channel.ChannelFuture r2 = r1.writeAndFlush(r2, r0)
            return r2
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelFuture writeAndFlush(java.lang.Object r2, io.netty.channel.ChannelPromise r3) {
            r1 = this;
            r0 = 1
            r1.write(r2, r0, r3)
            return r3
    }
}
