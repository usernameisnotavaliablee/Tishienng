package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultChannelPipeline implements io.netty.channel.ChannelPipeline {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<io.netty.channel.DefaultChannelPipeline, io.netty.channel.MessageSizeEstimator.Handle> ESTIMATOR = null;
    private static final java.lang.String HEAD_NAME = null;
    private static final java.lang.String TAIL_NAME = null;
    static final io.netty.util.internal.logging.InternalLogger logger = null;
    private static final io.netty.util.concurrent.FastThreadLocal<java.util.Map<java.lang.Class<?>, java.lang.String>> nameCaches = null;
    private final io.netty.channel.Channel channel;
    private java.util.Map<io.netty.util.concurrent.EventExecutorGroup, io.netty.util.concurrent.EventExecutor> childExecutors;
    private volatile io.netty.channel.MessageSizeEstimator.Handle estimatorHandle;
    private boolean firstRegistration;
    final io.netty.channel.AbstractChannelHandlerContext head;
    private io.netty.channel.DefaultChannelPipeline.PendingHandlerCallback pendingHandlerCallbackHead;
    private boolean registered;
    private final io.netty.channel.ChannelFuture succeededFuture;
    final io.netty.channel.AbstractChannelHandlerContext tail;
    private final boolean touch;
    private final io.netty.channel.VoidChannelPromise voidPromise;







    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class HeadContext extends io.netty.channel.AbstractChannelHandlerContext implements io.netty.channel.ChannelOutboundHandler, io.netty.channel.ChannelInboundHandler {
        final /* synthetic */ io.netty.channel.DefaultChannelPipeline this$0;
        private final io.netty.channel.Channel.Unsafe unsafe;

        HeadContext(io.netty.channel.DefaultChannelPipeline r3, io.netty.channel.DefaultChannelPipeline r4) {
                r2 = this;
                r2.this$0 = r3
                java.lang.String r3 = io.netty.channel.DefaultChannelPipeline.access$500()
                java.lang.Class<io.netty.channel.DefaultChannelPipeline$HeadContext> r0 = io.netty.channel.DefaultChannelPipeline.HeadContext.class
                r1 = 0
                r2.<init>(r4, r1, r3, r0)
                io.netty.channel.Channel r3 = r4.channel()
                io.netty.channel.Channel$Unsafe r3 = r3.unsafe()
                r2.unsafe = r3
                r2.setAddComplete()
                return
        }

        private void readIfIsAutoRead() {
                r1 = this;
                io.netty.channel.DefaultChannelPipeline r0 = r1.this$0
                io.netty.channel.Channel r0 = io.netty.channel.DefaultChannelPipeline.access$600(r0)
                io.netty.channel.ChannelConfig r0 = r0.config()
                boolean r0 = r0.isAutoRead()
                if (r0 == 0) goto L19
                io.netty.channel.DefaultChannelPipeline r0 = r1.this$0
                io.netty.channel.Channel r0 = io.netty.channel.DefaultChannelPipeline.access$600(r0)
                r0.read()
            L19:
                return
        }

        @Override // io.netty.channel.ChannelOutboundHandler
        public void bind(io.netty.channel.ChannelHandlerContext r1, java.net.SocketAddress r2, io.netty.channel.ChannelPromise r3) {
                r0 = this;
                io.netty.channel.Channel$Unsafe r1 = r0.unsafe
                r1.bind(r2, r3)
                return
        }

        @Override // io.netty.channel.ChannelInboundHandler
        public void channelActive(io.netty.channel.ChannelHandlerContext r1) {
                r0 = this;
                r1.fireChannelActive()
                r0.readIfIsAutoRead()
                return
        }

        @Override // io.netty.channel.ChannelInboundHandler
        public void channelInactive(io.netty.channel.ChannelHandlerContext r1) {
                r0 = this;
                r1.fireChannelInactive()
                return
        }

        @Override // io.netty.channel.ChannelInboundHandler
        public void channelRead(io.netty.channel.ChannelHandlerContext r1, java.lang.Object r2) {
                r0 = this;
                r1.fireChannelRead(r2)
                return
        }

        @Override // io.netty.channel.ChannelInboundHandler
        public void channelReadComplete(io.netty.channel.ChannelHandlerContext r1) {
                r0 = this;
                r1.fireChannelReadComplete()
                r0.readIfIsAutoRead()
                return
        }

        @Override // io.netty.channel.ChannelInboundHandler
        public void channelRegistered(io.netty.channel.ChannelHandlerContext r2) {
                r1 = this;
                io.netty.channel.DefaultChannelPipeline r0 = r1.this$0
                r0.invokeHandlerAddedIfNeeded()
                r2.fireChannelRegistered()
                return
        }

        @Override // io.netty.channel.ChannelInboundHandler
        public void channelUnregistered(io.netty.channel.ChannelHandlerContext r1) {
                r0 = this;
                r1.fireChannelUnregistered()
                io.netty.channel.DefaultChannelPipeline r1 = r0.this$0
                io.netty.channel.Channel r1 = io.netty.channel.DefaultChannelPipeline.access$600(r1)
                boolean r1 = r1.isOpen()
                if (r1 != 0) goto L14
                io.netty.channel.DefaultChannelPipeline r1 = r0.this$0
                io.netty.channel.DefaultChannelPipeline.access$700(r1)
            L14:
                return
        }

        @Override // io.netty.channel.ChannelInboundHandler
        public void channelWritabilityChanged(io.netty.channel.ChannelHandlerContext r1) {
                r0 = this;
                r1.fireChannelWritabilityChanged()
                return
        }

        @Override // io.netty.channel.ChannelOutboundHandler
        public void close(io.netty.channel.ChannelHandlerContext r1, io.netty.channel.ChannelPromise r2) {
                r0 = this;
                io.netty.channel.Channel$Unsafe r1 = r0.unsafe
                r1.close(r2)
                return
        }

        @Override // io.netty.channel.ChannelOutboundHandler
        public void connect(io.netty.channel.ChannelHandlerContext r1, java.net.SocketAddress r2, java.net.SocketAddress r3, io.netty.channel.ChannelPromise r4) {
                r0 = this;
                io.netty.channel.Channel$Unsafe r1 = r0.unsafe
                r1.connect(r2, r3, r4)
                return
        }

        @Override // io.netty.channel.ChannelOutboundHandler
        public void deregister(io.netty.channel.ChannelHandlerContext r1, io.netty.channel.ChannelPromise r2) {
                r0 = this;
                io.netty.channel.Channel$Unsafe r1 = r0.unsafe
                r1.deregister(r2)
                return
        }

        @Override // io.netty.channel.ChannelOutboundHandler
        public void disconnect(io.netty.channel.ChannelHandlerContext r1, io.netty.channel.ChannelPromise r2) {
                r0 = this;
                io.netty.channel.Channel$Unsafe r1 = r0.unsafe
                r1.disconnect(r2)
                return
        }

        @Override // io.netty.channel.ChannelHandler, io.netty.channel.ChannelInboundHandler
        public void exceptionCaught(io.netty.channel.ChannelHandlerContext r1, java.lang.Throwable r2) {
                r0 = this;
                r1.fireExceptionCaught(r2)
                return
        }

        @Override // io.netty.channel.ChannelOutboundHandler
        public void flush(io.netty.channel.ChannelHandlerContext r1) {
                r0 = this;
                io.netty.channel.Channel$Unsafe r1 = r0.unsafe
                r1.flush()
                return
        }

        @Override // io.netty.channel.ChannelHandlerContext
        public io.netty.channel.ChannelHandler handler() {
                r0 = this;
                return r0
        }

        @Override // io.netty.channel.ChannelHandler
        public void handlerAdded(io.netty.channel.ChannelHandlerContext r1) {
                r0 = this;
                return
        }

        @Override // io.netty.channel.ChannelHandler
        public void handlerRemoved(io.netty.channel.ChannelHandlerContext r1) {
                r0 = this;
                return
        }

        @Override // io.netty.channel.ChannelOutboundHandler
        public void read(io.netty.channel.ChannelHandlerContext r1) {
                r0 = this;
                io.netty.channel.Channel$Unsafe r1 = r0.unsafe
                r1.beginRead()
                return
        }

        @Override // io.netty.channel.ChannelInboundHandler
        public void userEventTriggered(io.netty.channel.ChannelHandlerContext r1, java.lang.Object r2) {
                r0 = this;
                r1.fireUserEventTriggered(r2)
                return
        }

        @Override // io.netty.channel.ChannelOutboundHandler
        public void write(io.netty.channel.ChannelHandlerContext r1, java.lang.Object r2, io.netty.channel.ChannelPromise r3) {
                r0 = this;
                io.netty.channel.Channel$Unsafe r1 = r0.unsafe
                r1.write(r2, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class PendingHandlerAddedTask extends io.netty.channel.DefaultChannelPipeline.PendingHandlerCallback {
        final /* synthetic */ io.netty.channel.DefaultChannelPipeline this$0;

        PendingHandlerAddedTask(io.netty.channel.DefaultChannelPipeline r1, io.netty.channel.AbstractChannelHandlerContext r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        @Override // io.netty.channel.DefaultChannelPipeline.PendingHandlerCallback
        void execute() {
                r6 = this;
                io.netty.channel.AbstractChannelHandlerContext r0 = r6.ctx
                io.netty.util.concurrent.EventExecutor r0 = r0.executor()
                boolean r1 = r0.inEventLoop()
                if (r1 == 0) goto L14
                io.netty.channel.DefaultChannelPipeline r0 = r6.this$0
                io.netty.channel.AbstractChannelHandlerContext r1 = r6.ctx
                io.netty.channel.DefaultChannelPipeline.access$100(r0, r1)
                return
            L14:
                r0.execute(r6)     // Catch: java.util.concurrent.RejectedExecutionException -> L18
                return
            L18:
                r1 = move-exception
                io.netty.util.internal.logging.InternalLogger r2 = io.netty.channel.DefaultChannelPipeline.logger
                boolean r2 = r2.isWarnEnabled()
                if (r2 == 0) goto L3a
                io.netty.util.internal.logging.InternalLogger r2 = io.netty.channel.DefaultChannelPipeline.logger
                io.netty.channel.AbstractChannelHandlerContext r3 = r6.ctx
                java.lang.String r3 = r3.name()
                r4 = 3
                java.lang.Object[] r4 = new java.lang.Object[r4]
                r5 = 0
                r4[r5] = r0
                r0 = 1
                r4[r0] = r3
                r0 = 2
                r4[r0] = r1
                java.lang.String r0 = "Can't invoke handlerAdded() as the EventExecutor {} rejected it, removing handler {}."
                r2.warn(r0, r4)
            L3a:
                io.netty.channel.AbstractChannelHandlerContext r0 = r6.ctx
                io.netty.channel.DefaultChannelPipeline.access$800(r0)
                io.netty.channel.AbstractChannelHandlerContext r0 = r6.ctx
                r0.setRemoved()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                io.netty.channel.DefaultChannelPipeline r0 = r2.this$0
                io.netty.channel.AbstractChannelHandlerContext r1 = r2.ctx
                io.netty.channel.DefaultChannelPipeline.access$100(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static abstract class PendingHandlerCallback implements java.lang.Runnable {
        final io.netty.channel.AbstractChannelHandlerContext ctx;
        io.netty.channel.DefaultChannelPipeline.PendingHandlerCallback next;

        PendingHandlerCallback(io.netty.channel.AbstractChannelHandlerContext r1) {
                r0 = this;
                r0.<init>()
                r0.ctx = r1
                return
        }

        abstract void execute();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class PendingHandlerRemovedTask extends io.netty.channel.DefaultChannelPipeline.PendingHandlerCallback {
        final /* synthetic */ io.netty.channel.DefaultChannelPipeline this$0;

        PendingHandlerRemovedTask(io.netty.channel.DefaultChannelPipeline r1, io.netty.channel.AbstractChannelHandlerContext r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        @Override // io.netty.channel.DefaultChannelPipeline.PendingHandlerCallback
        void execute() {
                r6 = this;
                io.netty.channel.AbstractChannelHandlerContext r0 = r6.ctx
                io.netty.util.concurrent.EventExecutor r0 = r0.executor()
                boolean r1 = r0.inEventLoop()
                if (r1 == 0) goto L14
                io.netty.channel.DefaultChannelPipeline r0 = r6.this$0
                io.netty.channel.AbstractChannelHandlerContext r1 = r6.ctx
                io.netty.channel.DefaultChannelPipeline.access$000(r0, r1)
                return
            L14:
                r0.execute(r6)     // Catch: java.util.concurrent.RejectedExecutionException -> L18
                return
            L18:
                r1 = move-exception
                io.netty.util.internal.logging.InternalLogger r2 = io.netty.channel.DefaultChannelPipeline.logger
                boolean r2 = r2.isWarnEnabled()
                if (r2 == 0) goto L3a
                io.netty.util.internal.logging.InternalLogger r2 = io.netty.channel.DefaultChannelPipeline.logger
                io.netty.channel.AbstractChannelHandlerContext r3 = r6.ctx
                java.lang.String r3 = r3.name()
                r4 = 3
                java.lang.Object[] r4 = new java.lang.Object[r4]
                r5 = 0
                r4[r5] = r0
                r0 = 1
                r4[r0] = r3
                r0 = 2
                r4[r0] = r1
                java.lang.String r0 = "Can't invoke handlerRemoved() as the EventExecutor {} rejected it, removing handler {}."
                r2.warn(r0, r4)
            L3a:
                io.netty.channel.AbstractChannelHandlerContext r0 = r6.ctx
                r0.setRemoved()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                io.netty.channel.DefaultChannelPipeline r0 = r2.this$0
                io.netty.channel.AbstractChannelHandlerContext r1 = r2.ctx
                io.netty.channel.DefaultChannelPipeline.access$000(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class TailContext extends io.netty.channel.AbstractChannelHandlerContext implements io.netty.channel.ChannelInboundHandler {
        final /* synthetic */ io.netty.channel.DefaultChannelPipeline this$0;

        TailContext(io.netty.channel.DefaultChannelPipeline r3, io.netty.channel.DefaultChannelPipeline r4) {
                r2 = this;
                r2.this$0 = r3
                java.lang.String r3 = io.netty.channel.DefaultChannelPipeline.access$400()
                java.lang.Class<io.netty.channel.DefaultChannelPipeline$TailContext> r0 = io.netty.channel.DefaultChannelPipeline.TailContext.class
                r1 = 0
                r2.<init>(r4, r1, r3, r0)
                r2.setAddComplete()
                return
        }

        @Override // io.netty.channel.ChannelInboundHandler
        public void channelActive(io.netty.channel.ChannelHandlerContext r1) {
                r0 = this;
                io.netty.channel.DefaultChannelPipeline r1 = r0.this$0
                r1.onUnhandledInboundChannelActive()
                return
        }

        @Override // io.netty.channel.ChannelInboundHandler
        public void channelInactive(io.netty.channel.ChannelHandlerContext r1) {
                r0 = this;
                io.netty.channel.DefaultChannelPipeline r1 = r0.this$0
                r1.onUnhandledInboundChannelInactive()
                return
        }

        @Override // io.netty.channel.ChannelInboundHandler
        public void channelRead(io.netty.channel.ChannelHandlerContext r2, java.lang.Object r3) {
                r1 = this;
                io.netty.channel.DefaultChannelPipeline r0 = r1.this$0
                r0.onUnhandledInboundMessage(r2, r3)
                return
        }

        @Override // io.netty.channel.ChannelInboundHandler
        public void channelReadComplete(io.netty.channel.ChannelHandlerContext r1) {
                r0 = this;
                io.netty.channel.DefaultChannelPipeline r1 = r0.this$0
                r1.onUnhandledInboundChannelReadComplete()
                return
        }

        @Override // io.netty.channel.ChannelInboundHandler
        public void channelRegistered(io.netty.channel.ChannelHandlerContext r1) {
                r0 = this;
                return
        }

        @Override // io.netty.channel.ChannelInboundHandler
        public void channelUnregistered(io.netty.channel.ChannelHandlerContext r1) {
                r0 = this;
                return
        }

        @Override // io.netty.channel.ChannelInboundHandler
        public void channelWritabilityChanged(io.netty.channel.ChannelHandlerContext r1) {
                r0 = this;
                io.netty.channel.DefaultChannelPipeline r1 = r0.this$0
                r1.onUnhandledChannelWritabilityChanged()
                return
        }

        @Override // io.netty.channel.ChannelInboundHandler
        public void exceptionCaught(io.netty.channel.ChannelHandlerContext r1, java.lang.Throwable r2) {
                r0 = this;
                io.netty.channel.DefaultChannelPipeline r1 = r0.this$0
                r1.onUnhandledInboundException(r2)
                return
        }

        @Override // io.netty.channel.ChannelHandlerContext
        public io.netty.channel.ChannelHandler handler() {
                r0 = this;
                return r0
        }

        @Override // io.netty.channel.ChannelHandler
        public void handlerAdded(io.netty.channel.ChannelHandlerContext r1) {
                r0 = this;
                return
        }

        @Override // io.netty.channel.ChannelHandler
        public void handlerRemoved(io.netty.channel.ChannelHandlerContext r1) {
                r0 = this;
                return
        }

        @Override // io.netty.channel.ChannelInboundHandler
        public void userEventTriggered(io.netty.channel.ChannelHandlerContext r1, java.lang.Object r2) {
                r0 = this;
                io.netty.channel.DefaultChannelPipeline r1 = r0.this$0
                r1.onUnhandledInboundUserEventTriggered(r2)
                return
        }
    }

    static {
            java.lang.Class<io.netty.channel.DefaultChannelPipeline> r0 = io.netty.channel.DefaultChannelPipeline.class
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.channel.DefaultChannelPipeline.logger = r1
            java.lang.Class<io.netty.channel.DefaultChannelPipeline$HeadContext> r1 = io.netty.channel.DefaultChannelPipeline.HeadContext.class
            java.lang.String r1 = generateName0(r1)
            io.netty.channel.DefaultChannelPipeline.HEAD_NAME = r1
            java.lang.Class<io.netty.channel.DefaultChannelPipeline$TailContext> r1 = io.netty.channel.DefaultChannelPipeline.TailContext.class
            java.lang.String r1 = generateName0(r1)
            io.netty.channel.DefaultChannelPipeline.TAIL_NAME = r1
            io.netty.channel.DefaultChannelPipeline$1 r1 = new io.netty.channel.DefaultChannelPipeline$1
            r1.<init>()
            io.netty.channel.DefaultChannelPipeline.nameCaches = r1
            java.lang.Class<io.netty.channel.MessageSizeEstimator$Handle> r1 = io.netty.channel.MessageSizeEstimator.Handle.class
            java.lang.String r2 = "estimatorHandle"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r1, r2)
            io.netty.channel.DefaultChannelPipeline.ESTIMATOR = r0
            return
    }

    protected DefaultChannelPipeline(io.netty.channel.Channel r4) {
            r3 = this;
            r3.<init>()
            boolean r0 = io.netty.util.ResourceLeakDetector.isEnabled()
            r3.touch = r0
            r0 = 1
            r3.firstRegistration = r0
            java.lang.String r1 = "channel"
            java.lang.Object r1 = io.netty.util.internal.ObjectUtil.checkNotNull(r4, r1)
            io.netty.channel.Channel r1 = (io.netty.channel.Channel) r1
            r3.channel = r1
            io.netty.channel.SucceededChannelFuture r1 = new io.netty.channel.SucceededChannelFuture
            r2 = 0
            r1.<init>(r4, r2)
            r3.succeededFuture = r1
            io.netty.channel.VoidChannelPromise r1 = new io.netty.channel.VoidChannelPromise
            r1.<init>(r4, r0)
            r3.voidPromise = r1
            io.netty.channel.DefaultChannelPipeline$TailContext r4 = new io.netty.channel.DefaultChannelPipeline$TailContext
            r4.<init>(r3, r3)
            r3.tail = r4
            io.netty.channel.DefaultChannelPipeline$HeadContext r0 = new io.netty.channel.DefaultChannelPipeline$HeadContext
            r0.<init>(r3, r3)
            r3.head = r0
            r0.next = r4
            r4.prev = r0
            return
    }

    static /* synthetic */ void access$000(io.netty.channel.DefaultChannelPipeline r0, io.netty.channel.AbstractChannelHandlerContext r1) {
            r0.callHandlerRemoved0(r1)
            return
    }

    static /* synthetic */ void access$100(io.netty.channel.DefaultChannelPipeline r0, io.netty.channel.AbstractChannelHandlerContext r1) {
            r0.callHandlerAdded0(r1)
            return
    }

    static /* synthetic */ void access$200(io.netty.channel.DefaultChannelPipeline r0, io.netty.channel.AbstractChannelHandlerContext r1, boolean r2) {
            r0.destroyUp(r1, r2)
            return
    }

    static /* synthetic */ void access$300(io.netty.channel.DefaultChannelPipeline r0, java.lang.Thread r1, io.netty.channel.AbstractChannelHandlerContext r2, boolean r3) {
            r0.destroyDown(r1, r2, r3)
            return
    }

    static /* synthetic */ java.lang.String access$400() {
            java.lang.String r0 = io.netty.channel.DefaultChannelPipeline.TAIL_NAME
            return r0
    }

    static /* synthetic */ java.lang.String access$500() {
            java.lang.String r0 = io.netty.channel.DefaultChannelPipeline.HEAD_NAME
            return r0
    }

    static /* synthetic */ io.netty.channel.Channel access$600(io.netty.channel.DefaultChannelPipeline r0) {
            io.netty.channel.Channel r0 = r0.channel
            return r0
    }

    static /* synthetic */ void access$700(io.netty.channel.DefaultChannelPipeline r0) {
            r0.destroy()
            return
    }

    static /* synthetic */ void access$800(io.netty.channel.AbstractChannelHandlerContext r0) {
            remove0(r0)
            return
    }

    private static void addAfter0(io.netty.channel.AbstractChannelHandlerContext r1, io.netty.channel.AbstractChannelHandlerContext r2) {
            r2.prev = r1
            io.netty.channel.AbstractChannelHandlerContext r0 = r1.next
            r2.next = r0
            io.netty.channel.AbstractChannelHandlerContext r0 = r1.next
            r0.prev = r2
            r1.next = r2
            return
    }

    private static void addBefore0(io.netty.channel.AbstractChannelHandlerContext r1, io.netty.channel.AbstractChannelHandlerContext r2) {
            io.netty.channel.AbstractChannelHandlerContext r0 = r1.prev
            r2.prev = r0
            r2.next = r1
            io.netty.channel.AbstractChannelHandlerContext r0 = r1.prev
            r0.next = r2
            r1.prev = r2
            return
    }

    private void addFirst0(io.netty.channel.AbstractChannelHandlerContext r3) {
            r2 = this;
            io.netty.channel.AbstractChannelHandlerContext r0 = r2.head
            io.netty.channel.AbstractChannelHandlerContext r0 = r0.next
            io.netty.channel.AbstractChannelHandlerContext r1 = r2.head
            r3.prev = r1
            r3.next = r0
            io.netty.channel.AbstractChannelHandlerContext r1 = r2.head
            r1.next = r3
            r0.prev = r3
            return
    }

    private void addLast0(io.netty.channel.AbstractChannelHandlerContext r3) {
            r2 = this;
            io.netty.channel.AbstractChannelHandlerContext r0 = r2.tail
            io.netty.channel.AbstractChannelHandlerContext r0 = r0.prev
            r3.prev = r0
            io.netty.channel.AbstractChannelHandlerContext r1 = r2.tail
            r3.next = r1
            r0.next = r3
            io.netty.channel.AbstractChannelHandlerContext r0 = r2.tail
            r0.prev = r3
            return
    }

    private void callHandlerAdded0(io.netty.channel.AbstractChannelHandlerContext r6) {
            r5 = this;
            r6.callHandlerAdded()     // Catch: java.lang.Throwable -> L4
            return
        L4:
            r0 = move-exception
            remove0(r6)     // Catch: java.lang.Throwable -> L31
            r6.callHandlerRemoved()     // Catch: java.lang.Throwable -> L31
            io.netty.channel.ChannelPipelineException r1 = new io.netty.channel.ChannelPipelineException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            io.netty.channel.ChannelHandler r6 = r6.handler()
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            r2.append(r6)
            java.lang.String r6 = ".handlerAdded() has thrown an exception; removed."
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r1.<init>(r6, r0)
            r5.fireExceptionCaught(r1)
            goto L77
        L31:
            r1 = move-exception
            io.netty.util.internal.logging.InternalLogger r2 = io.netty.channel.DefaultChannelPipeline.logger
            boolean r3 = r2.isWarnEnabled()
            if (r3 == 0) goto L52
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed to remove a handler: "
            r3.append(r4)
            java.lang.String r4 = r6.name()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.warn(r3, r1)
        L52:
            io.netty.channel.ChannelPipelineException r1 = new io.netty.channel.ChannelPipelineException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            io.netty.channel.ChannelHandler r6 = r6.handler()
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            r2.append(r6)
            java.lang.String r6 = ".handlerAdded() has thrown an exception; also failed to remove."
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r1.<init>(r6, r0)
            r5.fireExceptionCaught(r1)
        L77:
            return
    }

    private void callHandlerAddedForAllHandlers() {
            r2 = this;
            monitor-enter(r2)
            r0 = 1
            r2.registered = r0     // Catch: java.lang.Throwable -> L13
            io.netty.channel.DefaultChannelPipeline$PendingHandlerCallback r0 = r2.pendingHandlerCallbackHead     // Catch: java.lang.Throwable -> L13
            r1 = 0
            r2.pendingHandlerCallbackHead = r1     // Catch: java.lang.Throwable -> L13
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L13
        La:
            if (r0 == 0) goto L12
            r0.execute()
            io.netty.channel.DefaultChannelPipeline$PendingHandlerCallback r0 = r0.next
            goto La
        L12:
            return
        L13:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L13
            throw r0
    }

    private void callHandlerAddedInEventLoop(io.netty.channel.AbstractChannelHandlerContext r2, io.netty.util.concurrent.EventExecutor r3) {
            r1 = this;
            r2.setAddPending()
            io.netty.channel.DefaultChannelPipeline$6 r0 = new io.netty.channel.DefaultChannelPipeline$6
            r0.<init>(r1, r2)
            r3.execute(r0)
            return
    }

    private void callHandlerCallbackLater(io.netty.channel.AbstractChannelHandlerContext r2, boolean r3) {
            r1 = this;
            if (r3 == 0) goto L8
            io.netty.channel.DefaultChannelPipeline$PendingHandlerAddedTask r3 = new io.netty.channel.DefaultChannelPipeline$PendingHandlerAddedTask
            r3.<init>(r1, r2)
            goto Ld
        L8:
            io.netty.channel.DefaultChannelPipeline$PendingHandlerRemovedTask r3 = new io.netty.channel.DefaultChannelPipeline$PendingHandlerRemovedTask
            r3.<init>(r1, r2)
        Ld:
            io.netty.channel.DefaultChannelPipeline$PendingHandlerCallback r2 = r1.pendingHandlerCallbackHead
            if (r2 != 0) goto L14
            r1.pendingHandlerCallbackHead = r3
            return
        L14:
            io.netty.channel.DefaultChannelPipeline$PendingHandlerCallback r0 = r2.next
            if (r0 == 0) goto L1a
            r2 = r0
            goto L14
        L1a:
            r2.next = r3
            return
    }

    private void callHandlerRemoved0(io.netty.channel.AbstractChannelHandlerContext r4) {
            r3 = this;
            r4.callHandlerRemoved()     // Catch: java.lang.Throwable -> L4
            return
        L4:
            r0 = move-exception
            io.netty.channel.ChannelPipelineException r1 = new io.netty.channel.ChannelPipelineException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            io.netty.channel.ChannelHandler r4 = r4.handler()
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            r2.append(r4)
            java.lang.String r4 = ".handlerRemoved() has thrown an exception."
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4, r0)
            r3.fireExceptionCaught(r1)
            return
    }

    private void checkDuplicateName(java.lang.String r4) {
            r3 = this;
            io.netty.channel.AbstractChannelHandlerContext r0 = r3.context0(r4)
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Duplicate handler name: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    private static void checkMultiplicity(io.netty.channel.ChannelHandler r2) {
            boolean r0 = r2 instanceof io.netty.channel.ChannelHandlerAdapter
            if (r0 == 0) goto L33
            io.netty.channel.ChannelHandlerAdapter r2 = (io.netty.channel.ChannelHandlerAdapter) r2
            boolean r0 = r2.isSharable()
            if (r0 != 0) goto L30
            boolean r0 = r2.added
            if (r0 != 0) goto L11
            goto L30
        L11:
            io.netty.channel.ChannelPipelineException r0 = new io.netty.channel.ChannelPipelineException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = " is not a @Sharable handler, so can't be added or removed multiple times."
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
        L30:
            r0 = 1
            r2.added = r0
        L33:
            return
    }

    private io.netty.util.concurrent.EventExecutor childExecutor(io.netty.util.concurrent.EventExecutorGroup r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            io.netty.channel.Channel r0 = r2.channel
            io.netty.channel.ChannelConfig r0 = r0.config()
            io.netty.channel.ChannelOption<java.lang.Boolean> r1 = io.netty.channel.ChannelOption.SINGLE_EVENTEXECUTOR_PER_GROUP
            java.lang.Object r0 = r0.getOption(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L1f
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L1f
            io.netty.util.concurrent.EventExecutor r3 = r3.next()
            return r3
        L1f:
            java.util.Map<io.netty.util.concurrent.EventExecutorGroup, io.netty.util.concurrent.EventExecutor> r0 = r2.childExecutors
            if (r0 != 0) goto L2b
            java.util.IdentityHashMap r0 = new java.util.IdentityHashMap
            r1 = 4
            r0.<init>(r1)
            r2.childExecutors = r0
        L2b:
            java.lang.Object r1 = r0.get(r3)
            io.netty.util.concurrent.EventExecutor r1 = (io.netty.util.concurrent.EventExecutor) r1
            if (r1 != 0) goto L3a
            io.netty.util.concurrent.EventExecutor r1 = r3.next()
            r0.put(r3, r1)
        L3a:
            return r1
    }

    private io.netty.channel.AbstractChannelHandlerContext context0(java.lang.String r3) {
            r2 = this;
            io.netty.channel.AbstractChannelHandlerContext r0 = r2.head
            io.netty.channel.AbstractChannelHandlerContext r0 = r0.next
        L4:
            io.netty.channel.AbstractChannelHandlerContext r1 = r2.tail
            if (r0 == r1) goto L16
            java.lang.String r1 = r0.name()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L13
            return r0
        L13:
            io.netty.channel.AbstractChannelHandlerContext r0 = r0.next
            goto L4
        L16:
            r3 = 0
            return r3
    }

    private synchronized void destroy() {
            r2 = this;
            monitor-enter(r2)
            io.netty.channel.AbstractChannelHandlerContext r0 = r2.head     // Catch: java.lang.Throwable -> Lb
            io.netty.channel.AbstractChannelHandlerContext r0 = r0.next     // Catch: java.lang.Throwable -> Lb
            r1 = 0
            r2.destroyUp(r0, r1)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r2)
            return
        Lb:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb
            throw r0
    }

    private void destroyDown(java.lang.Thread r3, io.netty.channel.AbstractChannelHandlerContext r4, boolean r5) {
            r2 = this;
            io.netty.channel.AbstractChannelHandlerContext r0 = r2.head
        L2:
            if (r4 != r0) goto L5
            return
        L5:
            io.netty.util.concurrent.EventExecutor r1 = r4.executor()
            if (r5 != 0) goto L1b
            boolean r5 = r1.inEventLoop(r3)
            if (r5 == 0) goto L12
            goto L1b
        L12:
            io.netty.channel.DefaultChannelPipeline$5 r3 = new io.netty.channel.DefaultChannelPipeline$5
            r3.<init>(r2, r4)
            r1.execute(r3)
            return
        L1b:
            monitor-enter(r2)
            remove0(r4)     // Catch: java.lang.Throwable -> L27
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L27
            r2.callHandlerRemoved0(r4)
            io.netty.channel.AbstractChannelHandlerContext r4 = r4.prev
            r5 = 0
            goto L2
        L27:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L27
            throw r3
    }

    private void destroyUp(io.netty.channel.AbstractChannelHandlerContext r4, boolean r5) {
            r3 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            io.netty.channel.AbstractChannelHandlerContext r1 = r3.tail
        L6:
            if (r4 != r1) goto Le
            io.netty.channel.AbstractChannelHandlerContext r4 = r1.prev
            r3.destroyDown(r0, r4, r5)
            return
        Le:
            io.netty.util.concurrent.EventExecutor r2 = r4.executor()
            if (r5 != 0) goto L23
            boolean r5 = r2.inEventLoop(r0)
            if (r5 != 0) goto L23
            io.netty.channel.DefaultChannelPipeline$4 r5 = new io.netty.channel.DefaultChannelPipeline$4
            r5.<init>(r3, r4)
            r2.execute(r5)
            return
        L23:
            io.netty.channel.AbstractChannelHandlerContext r4 = r4.next
            r5 = 0
            goto L6
    }

    private java.lang.String filterName(java.lang.String r1, io.netty.channel.ChannelHandler r2) {
            r0 = this;
            if (r1 != 0) goto L7
            java.lang.String r1 = r0.generateName(r2)
            return r1
        L7:
            r0.checkDuplicateName(r1)
            return r1
    }

    private java.lang.String generateName(io.netty.channel.ChannelHandler r4) {
            r3 = this;
            io.netty.util.concurrent.FastThreadLocal<java.util.Map<java.lang.Class<?>, java.lang.String>> r0 = io.netty.channel.DefaultChannelPipeline.nameCaches
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Class r4 = r4.getClass()
            java.lang.Object r1 = r0.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L1b
            java.lang.String r1 = generateName0(r4)
            r0.put(r4, r1)
        L1b:
            io.netty.channel.AbstractChannelHandlerContext r4 = r3.context0(r1)
            if (r4 == 0) goto L45
            int r4 = r1.length()
            r0 = 1
            int r4 = r4 - r0
            r2 = 0
            java.lang.String r4 = r1.substring(r2, r4)
        L2c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            io.netty.channel.AbstractChannelHandlerContext r2 = r3.context0(r1)
            if (r2 != 0) goto L42
            return r1
        L42:
            int r0 = r0 + 1
            goto L2c
        L45:
            return r1
    }

    private static java.lang.String generateName0(java.lang.Class<?> r1) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r1)
            r0.append(r1)
            java.lang.String r1 = "#0"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }

    private io.netty.channel.AbstractChannelHandlerContext getContextOrDie(io.netty.channel.ChannelHandler r2) {
            r1 = this;
            io.netty.channel.ChannelHandlerContext r0 = r1.context(r2)
            io.netty.channel.AbstractChannelHandlerContext r0 = (io.netty.channel.AbstractChannelHandlerContext) r0
            if (r0 == 0) goto L9
            return r0
        L9:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            r0.<init>(r2)
            throw r0
    }

    private io.netty.channel.AbstractChannelHandlerContext getContextOrDie(java.lang.Class<? extends io.netty.channel.ChannelHandler> r2) {
            r1 = this;
            io.netty.channel.ChannelHandlerContext r0 = r1.context(r2)
            io.netty.channel.AbstractChannelHandlerContext r0 = (io.netty.channel.AbstractChannelHandlerContext) r0
            if (r0 == 0) goto L9
            return r0
        L9:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r2 = r2.getName()
            r0.<init>(r2)
            throw r0
    }

    private io.netty.channel.AbstractChannelHandlerContext getContextOrDie(java.lang.String r2) {
            r1 = this;
            io.netty.channel.ChannelHandlerContext r0 = r1.context(r2)
            io.netty.channel.AbstractChannelHandlerContext r0 = (io.netty.channel.AbstractChannelHandlerContext) r0
            if (r0 == 0) goto L9
            return r0
        L9:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r2)
            throw r0
    }

    private io.netty.channel.AbstractChannelHandlerContext newContext(io.netty.util.concurrent.EventExecutorGroup r2, java.lang.String r3, io.netty.channel.ChannelHandler r4) {
            r1 = this;
            io.netty.channel.DefaultChannelHandlerContext r0 = new io.netty.channel.DefaultChannelHandlerContext
            io.netty.util.concurrent.EventExecutor r2 = r1.childExecutor(r2)
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    private io.netty.channel.AbstractChannelHandlerContext remove(io.netty.channel.AbstractChannelHandlerContext r3) {
            r2 = this;
            monitor-enter(r2)
            remove0(r3)     // Catch: java.lang.Throwable -> Le
            boolean r0 = r2.registered     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L10
            r0 = 0
            r2.callHandlerCallbackLater(r3, r0)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
            return r3
        Le:
            r3 = move-exception
            goto L29
        L10:
            io.netty.util.concurrent.EventExecutor r0 = r3.executor()     // Catch: java.lang.Throwable -> Le
            boolean r1 = r0.inEventLoop()     // Catch: java.lang.Throwable -> Le
            if (r1 != 0) goto L24
            io.netty.channel.DefaultChannelPipeline$2 r1 = new io.netty.channel.DefaultChannelPipeline$2     // Catch: java.lang.Throwable -> Le
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> Le
            r0.execute(r1)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
            return r3
        L24:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
            r2.callHandlerRemoved0(r3)
            return r3
        L29:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
            throw r3
    }

    private static void remove0(io.netty.channel.AbstractChannelHandlerContext r1) {
            io.netty.channel.AbstractChannelHandlerContext r0 = r1.prev
            io.netty.channel.AbstractChannelHandlerContext r1 = r1.next
            r0.next = r1
            r1.prev = r0
            return
    }

    private <T extends io.netty.channel.ChannelHandler> T removeIfExists(io.netty.channel.ChannelHandlerContext r1) {
            r0 = this;
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            io.netty.channel.AbstractChannelHandlerContext r1 = (io.netty.channel.AbstractChannelHandlerContext) r1
            io.netty.channel.AbstractChannelHandlerContext r1 = r0.remove(r1)
            io.netty.channel.ChannelHandler r1 = r1.handler()
            return r1
    }

    private io.netty.channel.ChannelHandler replace(io.netty.channel.AbstractChannelHandlerContext r2, java.lang.String r3, io.netty.channel.ChannelHandler r4) {
            r1 = this;
            monitor-enter(r1)
            checkMultiplicity(r4)     // Catch: java.lang.Throwable -> Lb
            if (r3 != 0) goto Ld
            java.lang.String r3 = r1.generateName(r4)     // Catch: java.lang.Throwable -> Lb
            goto L1a
        Lb:
            r2 = move-exception
            goto L59
        Ld:
            java.lang.String r0 = r2.name()     // Catch: java.lang.Throwable -> Lb
            boolean r0 = r0.equals(r3)     // Catch: java.lang.Throwable -> Lb
            if (r0 != 0) goto L1a
            r1.checkDuplicateName(r3)     // Catch: java.lang.Throwable -> Lb
        L1a:
            io.netty.util.concurrent.EventExecutor r0 = r2.executor     // Catch: java.lang.Throwable -> Lb
            io.netty.channel.AbstractChannelHandlerContext r3 = r1.newContext(r0, r3, r4)     // Catch: java.lang.Throwable -> Lb
            replace0(r2, r3)     // Catch: java.lang.Throwable -> Lb
            boolean r4 = r1.registered     // Catch: java.lang.Throwable -> Lb
            if (r4 != 0) goto L35
            r4 = 1
            r1.callHandlerCallbackLater(r3, r4)     // Catch: java.lang.Throwable -> Lb
            r3 = 0
            r1.callHandlerCallbackLater(r2, r3)     // Catch: java.lang.Throwable -> Lb
            io.netty.channel.ChannelHandler r2 = r2.handler()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            return r2
        L35:
            io.netty.util.concurrent.EventExecutor r4 = r2.executor()     // Catch: java.lang.Throwable -> Lb
            boolean r0 = r4.inEventLoop()     // Catch: java.lang.Throwable -> Lb
            if (r0 != 0) goto L4d
            io.netty.channel.DefaultChannelPipeline$3 r0 = new io.netty.channel.DefaultChannelPipeline$3     // Catch: java.lang.Throwable -> Lb
            r0.<init>(r1, r3, r2)     // Catch: java.lang.Throwable -> Lb
            r4.execute(r0)     // Catch: java.lang.Throwable -> Lb
            io.netty.channel.ChannelHandler r2 = r2.handler()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            return r2
        L4d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            r1.callHandlerAdded0(r3)
            r1.callHandlerRemoved0(r2)
            io.netty.channel.ChannelHandler r2 = r2.handler()
            return r2
        L59:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r2
    }

    private static void replace0(io.netty.channel.AbstractChannelHandlerContext r2, io.netty.channel.AbstractChannelHandlerContext r3) {
            io.netty.channel.AbstractChannelHandlerContext r0 = r2.prev
            io.netty.channel.AbstractChannelHandlerContext r1 = r2.next
            r3.prev = r0
            r3.next = r1
            r0.next = r3
            r1.prev = r3
            r2.prev = r3
            r2.next = r3
            return
    }

    @Override // io.netty.channel.ChannelPipeline
    public final io.netty.channel.ChannelPipeline addAfter(io.netty.util.concurrent.EventExecutorGroup r1, java.lang.String r2, java.lang.String r3, io.netty.channel.ChannelHandler r4) {
            r0 = this;
            monitor-enter(r0)
            checkMultiplicity(r4)     // Catch: java.lang.Throwable -> L20
            java.lang.String r3 = r0.filterName(r3, r4)     // Catch: java.lang.Throwable -> L20
            io.netty.channel.AbstractChannelHandlerContext r2 = r0.getContextOrDie(r2)     // Catch: java.lang.Throwable -> L20
            io.netty.channel.AbstractChannelHandlerContext r1 = r0.newContext(r1, r3, r4)     // Catch: java.lang.Throwable -> L20
            addAfter0(r2, r1)     // Catch: java.lang.Throwable -> L20
            boolean r2 = r0.registered     // Catch: java.lang.Throwable -> L20
            if (r2 != 0) goto L22
            r1.setAddPending()     // Catch: java.lang.Throwable -> L20
            r2 = 1
            r0.callHandlerCallbackLater(r1, r2)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            return r0
        L20:
            r1 = move-exception
            goto L36
        L22:
            io.netty.util.concurrent.EventExecutor r2 = r1.executor()     // Catch: java.lang.Throwable -> L20
            boolean r3 = r2.inEventLoop()     // Catch: java.lang.Throwable -> L20
            if (r3 != 0) goto L31
            r0.callHandlerAddedInEventLoop(r1, r2)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            return r0
        L31:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            r0.callHandlerAdded0(r1)
            return r0
        L36:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            throw r1
    }

    @Override // io.netty.channel.ChannelPipeline
    public final io.netty.channel.ChannelPipeline addAfter(java.lang.String r2, java.lang.String r3, io.netty.channel.ChannelHandler r4) {
            r1 = this;
            r0 = 0
            io.netty.channel.ChannelPipeline r2 = r1.addAfter(r0, r2, r3, r4)
            return r2
    }

    @Override // io.netty.channel.ChannelPipeline
    public final io.netty.channel.ChannelPipeline addBefore(io.netty.util.concurrent.EventExecutorGroup r1, java.lang.String r2, java.lang.String r3, io.netty.channel.ChannelHandler r4) {
            r0 = this;
            monitor-enter(r0)
            checkMultiplicity(r4)     // Catch: java.lang.Throwable -> L20
            java.lang.String r3 = r0.filterName(r3, r4)     // Catch: java.lang.Throwable -> L20
            io.netty.channel.AbstractChannelHandlerContext r2 = r0.getContextOrDie(r2)     // Catch: java.lang.Throwable -> L20
            io.netty.channel.AbstractChannelHandlerContext r1 = r0.newContext(r1, r3, r4)     // Catch: java.lang.Throwable -> L20
            addBefore0(r2, r1)     // Catch: java.lang.Throwable -> L20
            boolean r2 = r0.registered     // Catch: java.lang.Throwable -> L20
            if (r2 != 0) goto L22
            r1.setAddPending()     // Catch: java.lang.Throwable -> L20
            r2 = 1
            r0.callHandlerCallbackLater(r1, r2)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            return r0
        L20:
            r1 = move-exception
            goto L36
        L22:
            io.netty.util.concurrent.EventExecutor r2 = r1.executor()     // Catch: java.lang.Throwable -> L20
            boolean r3 = r2.inEventLoop()     // Catch: java.lang.Throwable -> L20
            if (r3 != 0) goto L31
            r0.callHandlerAddedInEventLoop(r1, r2)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            return r0
        L31:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            r0.callHandlerAdded0(r1)
            return r0
        L36:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            throw r1
    }

    @Override // io.netty.channel.ChannelPipeline
    public final io.netty.channel.ChannelPipeline addBefore(java.lang.String r2, java.lang.String r3, io.netty.channel.ChannelHandler r4) {
            r1 = this;
            r0 = 0
            io.netty.channel.ChannelPipeline r2 = r1.addBefore(r0, r2, r3, r4)
            return r2
    }

    public final io.netty.channel.ChannelPipeline addFirst(io.netty.channel.ChannelHandler r2) {
            r1 = this;
            r0 = 0
            io.netty.channel.ChannelPipeline r2 = r1.addFirst(r0, r2)
            return r2
    }

    @Override // io.netty.channel.ChannelPipeline
    public final io.netty.channel.ChannelPipeline addFirst(io.netty.util.concurrent.EventExecutorGroup r1, java.lang.String r2, io.netty.channel.ChannelHandler r3) {
            r0 = this;
            monitor-enter(r0)
            checkMultiplicity(r3)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r2 = r0.filterName(r2, r3)     // Catch: java.lang.Throwable -> L1c
            io.netty.channel.AbstractChannelHandlerContext r1 = r0.newContext(r1, r2, r3)     // Catch: java.lang.Throwable -> L1c
            r0.addFirst0(r1)     // Catch: java.lang.Throwable -> L1c
            boolean r2 = r0.registered     // Catch: java.lang.Throwable -> L1c
            if (r2 != 0) goto L1e
            r1.setAddPending()     // Catch: java.lang.Throwable -> L1c
            r2 = 1
            r0.callHandlerCallbackLater(r1, r2)     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            return r0
        L1c:
            r1 = move-exception
            goto L32
        L1e:
            io.netty.util.concurrent.EventExecutor r2 = r1.executor()     // Catch: java.lang.Throwable -> L1c
            boolean r3 = r2.inEventLoop()     // Catch: java.lang.Throwable -> L1c
            if (r3 != 0) goto L2d
            r0.callHandlerAddedInEventLoop(r1, r2)     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            return r0
        L2d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            r0.callHandlerAdded0(r1)
            return r0
        L32:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r1
    }

    @Override // io.netty.channel.ChannelPipeline
    public final io.netty.channel.ChannelPipeline addFirst(io.netty.util.concurrent.EventExecutorGroup r4, io.netty.channel.ChannelHandler... r5) {
            r3 = this;
            if (r5 == 0) goto L25
            int r0 = r5.length
            if (r0 == 0) goto L24
            r0 = 0
            r0 = r5[r0]
            if (r0 != 0) goto Lb
            goto L24
        Lb:
            r0 = 1
            r1 = 1
        Ld:
            int r2 = r5.length
            if (r1 >= r2) goto L18
            r2 = r5[r1]
            if (r2 != 0) goto L15
            goto L18
        L15:
            int r1 = r1 + 1
            goto Ld
        L18:
            int r1 = r1 - r0
        L19:
            if (r1 < 0) goto L24
            r0 = r5[r1]
            r2 = 0
            r3.addFirst(r4, r2, r0)
            int r1 = r1 + (-1)
            goto L19
        L24:
            return r3
        L25:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "handlers"
            r4.<init>(r5)
            throw r4
    }

    @Override // io.netty.channel.ChannelPipeline
    public final io.netty.channel.ChannelPipeline addFirst(java.lang.String r2, io.netty.channel.ChannelHandler r3) {
            r1 = this;
            r0 = 0
            io.netty.channel.ChannelPipeline r2 = r1.addFirst(r0, r2, r3)
            return r2
    }

    @Override // io.netty.channel.ChannelPipeline
    public final io.netty.channel.ChannelPipeline addFirst(io.netty.channel.ChannelHandler... r2) {
            r1 = this;
            r0 = 0
            io.netty.channel.ChannelPipeline r2 = r1.addFirst(r0, r2)
            return r2
    }

    public final io.netty.channel.ChannelPipeline addLast(io.netty.channel.ChannelHandler r2) {
            r1 = this;
            r0 = 0
            io.netty.channel.ChannelPipeline r2 = r1.addLast(r0, r2)
            return r2
    }

    @Override // io.netty.channel.ChannelPipeline
    public final io.netty.channel.ChannelPipeline addLast(io.netty.util.concurrent.EventExecutorGroup r1, java.lang.String r2, io.netty.channel.ChannelHandler r3) {
            r0 = this;
            monitor-enter(r0)
            checkMultiplicity(r3)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r2 = r0.filterName(r2, r3)     // Catch: java.lang.Throwable -> L1c
            io.netty.channel.AbstractChannelHandlerContext r1 = r0.newContext(r1, r2, r3)     // Catch: java.lang.Throwable -> L1c
            r0.addLast0(r1)     // Catch: java.lang.Throwable -> L1c
            boolean r2 = r0.registered     // Catch: java.lang.Throwable -> L1c
            if (r2 != 0) goto L1e
            r1.setAddPending()     // Catch: java.lang.Throwable -> L1c
            r2 = 1
            r0.callHandlerCallbackLater(r1, r2)     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            return r0
        L1c:
            r1 = move-exception
            goto L32
        L1e:
            io.netty.util.concurrent.EventExecutor r2 = r1.executor()     // Catch: java.lang.Throwable -> L1c
            boolean r3 = r2.inEventLoop()     // Catch: java.lang.Throwable -> L1c
            if (r3 != 0) goto L2d
            r0.callHandlerAddedInEventLoop(r1, r2)     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            return r0
        L2d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            r0.callHandlerAdded0(r1)
            return r0
        L32:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r1
    }

    @Override // io.netty.channel.ChannelPipeline
    public final io.netty.channel.ChannelPipeline addLast(io.netty.util.concurrent.EventExecutorGroup r5, io.netty.channel.ChannelHandler... r6) {
            r4 = this;
            if (r6 == 0) goto L13
            int r0 = r6.length
            r1 = 0
        L4:
            if (r1 >= r0) goto L12
            r2 = r6[r1]
            if (r2 != 0) goto Lb
            goto L12
        Lb:
            r3 = 0
            r4.addLast(r5, r3, r2)
            int r1 = r1 + 1
            goto L4
        L12:
            return r4
        L13:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "handlers"
            r5.<init>(r6)
            throw r5
    }

    @Override // io.netty.channel.ChannelPipeline
    public final io.netty.channel.ChannelPipeline addLast(java.lang.String r2, io.netty.channel.ChannelHandler r3) {
            r1 = this;
            r0 = 0
            io.netty.channel.ChannelPipeline r2 = r1.addLast(r0, r2, r3)
            return r2
    }

    @Override // io.netty.channel.ChannelPipeline
    public final io.netty.channel.ChannelPipeline addLast(io.netty.channel.ChannelHandler... r2) {
            r1 = this;
            r0 = 0
            io.netty.channel.ChannelPipeline r2 = r1.addLast(r0, r2)
            return r2
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public final io.netty.channel.ChannelFuture bind(java.net.SocketAddress r2) {
            r1 = this;
            io.netty.channel.AbstractChannelHandlerContext r0 = r1.tail
            io.netty.channel.ChannelFuture r2 = r0.bind(r2)
            return r2
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public final io.netty.channel.ChannelFuture bind(java.net.SocketAddress r2, io.netty.channel.ChannelPromise r3) {
            r1 = this;
            io.netty.channel.AbstractChannelHandlerContext r0 = r1.tail
            io.netty.channel.ChannelFuture r2 = r0.bind(r2, r3)
            return r2
    }

    @Override // io.netty.channel.ChannelPipeline
    public final io.netty.channel.Channel channel() {
            r1 = this;
            io.netty.channel.Channel r0 = r1.channel
            return r0
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public final io.netty.channel.ChannelFuture close() {
            r1 = this;
            io.netty.channel.AbstractChannelHandlerContext r0 = r1.tail
            io.netty.channel.ChannelFuture r0 = r0.close()
            return r0
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public final io.netty.channel.ChannelFuture close(io.netty.channel.ChannelPromise r2) {
            r1 = this;
            io.netty.channel.AbstractChannelHandlerContext r0 = r1.tail
            io.netty.channel.ChannelFuture r2 = r0.close(r2)
            return r2
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public final io.netty.channel.ChannelFuture connect(java.net.SocketAddress r2) {
            r1 = this;
            io.netty.channel.AbstractChannelHandlerContext r0 = r1.tail
            io.netty.channel.ChannelFuture r2 = r0.connect(r2)
            return r2
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public final io.netty.channel.ChannelFuture connect(java.net.SocketAddress r2, io.netty.channel.ChannelPromise r3) {
            r1 = this;
            io.netty.channel.AbstractChannelHandlerContext r0 = r1.tail
            io.netty.channel.ChannelFuture r2 = r0.connect(r2, r3)
            return r2
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public final io.netty.channel.ChannelFuture connect(java.net.SocketAddress r2, java.net.SocketAddress r3) {
            r1 = this;
            io.netty.channel.AbstractChannelHandlerContext r0 = r1.tail
            io.netty.channel.ChannelFuture r2 = r0.connect(r2, r3)
            return r2
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public final io.netty.channel.ChannelFuture connect(java.net.SocketAddress r2, java.net.SocketAddress r3, io.netty.channel.ChannelPromise r4) {
            r1 = this;
            io.netty.channel.AbstractChannelHandlerContext r0 = r1.tail
            io.netty.channel.ChannelFuture r2 = r0.connect(r2, r3, r4)
            return r2
    }

    @Override // io.netty.channel.ChannelPipeline
    public final io.netty.channel.ChannelHandlerContext context(io.netty.channel.ChannelHandler r3) {
            r2 = this;
            if (r3 == 0) goto L14
            io.netty.channel.AbstractChannelHandlerContext r0 = r2.head
            io.netty.channel.AbstractChannelHandlerContext r0 = r0.next
        L6:
            if (r0 != 0) goto La
            r3 = 0
            return r3
        La:
            io.netty.channel.ChannelHandler r1 = r0.handler()
            if (r1 != r3) goto L11
            return r0
        L11:
            io.netty.channel.AbstractChannelHandlerContext r0 = r0.next
            goto L6
        L14:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "handler"
            r3.<init>(r0)
            throw r3
    }

    @Override // io.netty.channel.ChannelPipeline
    public final io.netty.channel.ChannelHandlerContext context(java.lang.Class<? extends io.netty.channel.ChannelHandler> r3) {
            r2 = this;
            if (r3 == 0) goto L1c
            io.netty.channel.AbstractChannelHandlerContext r0 = r2.head
            io.netty.channel.AbstractChannelHandlerContext r0 = r0.next
        L6:
            if (r0 != 0) goto La
            r3 = 0
            return r3
        La:
            io.netty.channel.ChannelHandler r1 = r0.handler()
            java.lang.Class r1 = r1.getClass()
            boolean r1 = r3.isAssignableFrom(r1)
            if (r1 == 0) goto L19
            return r0
        L19:
            io.netty.channel.AbstractChannelHandlerContext r0 = r0.next
            goto L6
        L1c:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "handlerType"
            r3.<init>(r0)
            throw r3
    }

    @Override // io.netty.channel.ChannelPipeline
    public final io.netty.channel.ChannelHandlerContext context(java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto L7
            io.netty.channel.AbstractChannelHandlerContext r2 = r1.context0(r2)
            return r2
        L7:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "name"
            r2.<init>(r0)
            throw r2
    }

    protected void decrementPendingOutboundBytes(long r2) {
            r1 = this;
            io.netty.channel.Channel r0 = r1.channel
            io.netty.channel.Channel$Unsafe r0 = r0.unsafe()
            io.netty.channel.ChannelOutboundBuffer r0 = r0.outboundBuffer()
            if (r0 == 0) goto Lf
            r0.decrementPendingOutboundBytes(r2)
        Lf:
            return
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public final io.netty.channel.ChannelFuture deregister() {
            r1 = this;
            io.netty.channel.AbstractChannelHandlerContext r0 = r1.tail
            io.netty.channel.ChannelFuture r0 = r0.deregister()
            return r0
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public final io.netty.channel.ChannelFuture deregister(io.netty.channel.ChannelPromise r2) {
            r1 = this;
            io.netty.channel.AbstractChannelHandlerContext r0 = r1.tail
            io.netty.channel.ChannelFuture r2 = r0.deregister(r2)
            return r2
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public final io.netty.channel.ChannelFuture disconnect() {
            r1 = this;
            io.netty.channel.AbstractChannelHandlerContext r0 = r1.tail
            io.netty.channel.ChannelFuture r0 = r0.disconnect()
            return r0
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public final io.netty.channel.ChannelFuture disconnect(io.netty.channel.ChannelPromise r2) {
            r1 = this;
            io.netty.channel.AbstractChannelHandlerContext r0 = r1.tail
            io.netty.channel.ChannelFuture r2 = r0.disconnect(r2)
            return r2
    }

    final io.netty.channel.MessageSizeEstimator.Handle estimatorHandle() {
            r3 = this;
            io.netty.channel.MessageSizeEstimator$Handle r0 = r3.estimatorHandle
            if (r0 != 0) goto L1d
            io.netty.channel.Channel r0 = r3.channel
            io.netty.channel.ChannelConfig r0 = r0.config()
            io.netty.channel.MessageSizeEstimator r0 = r0.getMessageSizeEstimator()
            io.netty.channel.MessageSizeEstimator$Handle r0 = r0.newHandle()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<io.netty.channel.DefaultChannelPipeline, io.netty.channel.MessageSizeEstimator$Handle> r1 = io.netty.channel.DefaultChannelPipeline.ESTIMATOR
            r2 = 0
            boolean r1 = androidx.concurrent.futures.a.a(r1, r3, r2, r0)
            if (r1 != 0) goto L1d
            io.netty.channel.MessageSizeEstimator$Handle r0 = r3.estimatorHandle
        L1d:
            return r0
    }

    @Override // io.netty.channel.ChannelInboundInvoker
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelInboundInvoker fireChannelActive() {
            r1 = this;
            io.netty.channel.ChannelPipeline r0 = r1.fireChannelActive()
            return r0
    }

    @Override // io.netty.channel.ChannelPipeline, io.netty.channel.ChannelInboundInvoker
    public final io.netty.channel.ChannelPipeline fireChannelActive() {
            r1 = this;
            io.netty.channel.AbstractChannelHandlerContext r0 = r1.head
            io.netty.channel.AbstractChannelHandlerContext.invokeChannelActive(r0)
            return r1
    }

    @Override // io.netty.channel.ChannelInboundInvoker
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelInboundInvoker fireChannelInactive() {
            r1 = this;
            io.netty.channel.ChannelPipeline r0 = r1.fireChannelInactive()
            return r0
    }

    @Override // io.netty.channel.ChannelPipeline, io.netty.channel.ChannelInboundInvoker
    public final io.netty.channel.ChannelPipeline fireChannelInactive() {
            r1 = this;
            io.netty.channel.AbstractChannelHandlerContext r0 = r1.head
            io.netty.channel.AbstractChannelHandlerContext.invokeChannelInactive(r0)
            return r1
    }

    @Override // io.netty.channel.ChannelInboundInvoker
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelInboundInvoker fireChannelRead(java.lang.Object r1) {
            r0 = this;
            io.netty.channel.ChannelPipeline r1 = r0.fireChannelRead(r1)
            return r1
    }

    @Override // io.netty.channel.ChannelPipeline, io.netty.channel.ChannelInboundInvoker
    public final io.netty.channel.ChannelPipeline fireChannelRead(java.lang.Object r2) {
            r1 = this;
            io.netty.channel.AbstractChannelHandlerContext r0 = r1.head
            io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(r0, r2)
            return r1
    }

    @Override // io.netty.channel.ChannelInboundInvoker
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelInboundInvoker fireChannelReadComplete() {
            r1 = this;
            io.netty.channel.ChannelPipeline r0 = r1.fireChannelReadComplete()
            return r0
    }

    @Override // io.netty.channel.ChannelPipeline, io.netty.channel.ChannelInboundInvoker
    public final io.netty.channel.ChannelPipeline fireChannelReadComplete() {
            r1 = this;
            io.netty.channel.AbstractChannelHandlerContext r0 = r1.head
            io.netty.channel.AbstractChannelHandlerContext.invokeChannelReadComplete(r0)
            return r1
    }

    @Override // io.netty.channel.ChannelInboundInvoker
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelInboundInvoker fireChannelRegistered() {
            r1 = this;
            io.netty.channel.ChannelPipeline r0 = r1.fireChannelRegistered()
            return r0
    }

    @Override // io.netty.channel.ChannelPipeline, io.netty.channel.ChannelInboundInvoker
    public final io.netty.channel.ChannelPipeline fireChannelRegistered() {
            r1 = this;
            io.netty.channel.AbstractChannelHandlerContext r0 = r1.head
            io.netty.channel.AbstractChannelHandlerContext.invokeChannelRegistered(r0)
            return r1
    }

    @Override // io.netty.channel.ChannelInboundInvoker
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelInboundInvoker fireChannelUnregistered() {
            r1 = this;
            io.netty.channel.ChannelPipeline r0 = r1.fireChannelUnregistered()
            return r0
    }

    @Override // io.netty.channel.ChannelPipeline, io.netty.channel.ChannelInboundInvoker
    public final io.netty.channel.ChannelPipeline fireChannelUnregistered() {
            r1 = this;
            io.netty.channel.AbstractChannelHandlerContext r0 = r1.head
            io.netty.channel.AbstractChannelHandlerContext.invokeChannelUnregistered(r0)
            return r1
    }

    @Override // io.netty.channel.ChannelInboundInvoker
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelInboundInvoker fireChannelWritabilityChanged() {
            r1 = this;
            io.netty.channel.ChannelPipeline r0 = r1.fireChannelWritabilityChanged()
            return r0
    }

    @Override // io.netty.channel.ChannelPipeline, io.netty.channel.ChannelInboundInvoker
    public final io.netty.channel.ChannelPipeline fireChannelWritabilityChanged() {
            r1 = this;
            io.netty.channel.AbstractChannelHandlerContext r0 = r1.head
            io.netty.channel.AbstractChannelHandlerContext.invokeChannelWritabilityChanged(r0)
            return r1
    }

    @Override // io.netty.channel.ChannelInboundInvoker
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelInboundInvoker fireExceptionCaught(java.lang.Throwable r1) {
            r0 = this;
            io.netty.channel.ChannelPipeline r1 = r0.fireExceptionCaught(r1)
            return r1
    }

    @Override // io.netty.channel.ChannelPipeline, io.netty.channel.ChannelInboundInvoker
    public final io.netty.channel.ChannelPipeline fireExceptionCaught(java.lang.Throwable r2) {
            r1 = this;
            io.netty.channel.AbstractChannelHandlerContext r0 = r1.head
            io.netty.channel.AbstractChannelHandlerContext.invokeExceptionCaught(r0, r2)
            return r1
    }

    @Override // io.netty.channel.ChannelInboundInvoker
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelInboundInvoker fireUserEventTriggered(java.lang.Object r1) {
            r0 = this;
            io.netty.channel.ChannelPipeline r1 = r0.fireUserEventTriggered(r1)
            return r1
    }

    @Override // io.netty.channel.ChannelPipeline, io.netty.channel.ChannelInboundInvoker
    public final io.netty.channel.ChannelPipeline fireUserEventTriggered(java.lang.Object r2) {
            r1 = this;
            io.netty.channel.AbstractChannelHandlerContext r0 = r1.head
            io.netty.channel.AbstractChannelHandlerContext.invokeUserEventTriggered(r0, r2)
            return r1
    }

    @Override // io.netty.channel.ChannelPipeline
    public final io.netty.channel.ChannelHandler first() {
            r1 = this;
            io.netty.channel.ChannelHandlerContext r0 = r1.firstContext()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            io.netty.channel.ChannelHandler r0 = r0.handler()
            return r0
    }

    @Override // io.netty.channel.ChannelPipeline
    public final io.netty.channel.ChannelHandlerContext firstContext() {
            r2 = this;
            io.netty.channel.AbstractChannelHandlerContext r0 = r2.head
            io.netty.channel.AbstractChannelHandlerContext r0 = r0.next
            io.netty.channel.AbstractChannelHandlerContext r1 = r2.tail
            if (r0 != r1) goto La
            r0 = 0
            return r0
        La:
            io.netty.channel.AbstractChannelHandlerContext r0 = r2.head
            io.netty.channel.AbstractChannelHandlerContext r0 = r0.next
            return r0
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelOutboundInvoker flush() {
            r1 = this;
            io.netty.channel.ChannelPipeline r0 = r1.flush()
            return r0
    }

    @Override // io.netty.channel.ChannelPipeline, io.netty.channel.ChannelOutboundInvoker
    public final io.netty.channel.ChannelPipeline flush() {
            r1 = this;
            io.netty.channel.AbstractChannelHandlerContext r0 = r1.tail
            r0.flush()
            return r1
    }

    @Override // io.netty.channel.ChannelPipeline
    public final <T extends io.netty.channel.ChannelHandler> T get(java.lang.Class<T> r1) {
            r0 = this;
            io.netty.channel.ChannelHandlerContext r1 = r0.context(r1)
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            io.netty.channel.ChannelHandler r1 = r1.handler()
            return r1
    }

    @Override // io.netty.channel.ChannelPipeline
    public final io.netty.channel.ChannelHandler get(java.lang.String r1) {
            r0 = this;
            io.netty.channel.ChannelHandlerContext r1 = r0.context(r1)
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            io.netty.channel.ChannelHandler r1 = r1.handler()
            return r1
    }

    protected void incrementPendingOutboundBytes(long r2) {
            r1 = this;
            io.netty.channel.Channel r0 = r1.channel
            io.netty.channel.Channel$Unsafe r0 = r0.unsafe()
            io.netty.channel.ChannelOutboundBuffer r0 = r0.outboundBuffer()
            if (r0 == 0) goto Lf
            r0.incrementPendingOutboundBytes(r2)
        Lf:
            return
    }

    final void invokeHandlerAddedIfNeeded() {
            r1 = this;
            boolean r0 = r1.firstRegistration
            if (r0 == 0) goto La
            r0 = 0
            r1.firstRegistration = r0
            r1.callHandlerAddedForAllHandlers()
        La:
            return
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<java.util.Map.Entry<java.lang.String, io.netty.channel.ChannelHandler>> iterator() {
            r1 = this;
            java.util.Map r0 = r1.toMap()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    @Override // io.netty.channel.ChannelPipeline
    public final io.netty.channel.ChannelHandler last() {
            r2 = this;
            io.netty.channel.AbstractChannelHandlerContext r0 = r2.tail
            io.netty.channel.AbstractChannelHandlerContext r0 = r0.prev
            io.netty.channel.AbstractChannelHandlerContext r1 = r2.head
            if (r0 != r1) goto La
            r0 = 0
            return r0
        La:
            io.netty.channel.ChannelHandler r0 = r0.handler()
            return r0
    }

    @Override // io.netty.channel.ChannelPipeline
    public final io.netty.channel.ChannelHandlerContext lastContext() {
            r2 = this;
            io.netty.channel.AbstractChannelHandlerContext r0 = r2.tail
            io.netty.channel.AbstractChannelHandlerContext r0 = r0.prev
            io.netty.channel.AbstractChannelHandlerContext r1 = r2.head
            if (r0 != r1) goto L9
            r0 = 0
        L9:
            return r0
    }

    @Override // io.netty.channel.ChannelPipeline
    public final java.util.List<java.lang.String> names() {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            io.netty.channel.AbstractChannelHandlerContext r1 = r3.head
            io.netty.channel.AbstractChannelHandlerContext r1 = r1.next
        L9:
            if (r1 != 0) goto Lc
            return r0
        Lc:
            java.lang.String r2 = r1.name()
            r0.add(r2)
            io.netty.channel.AbstractChannelHandlerContext r1 = r1.next
            goto L9
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public final io.netty.channel.ChannelFuture newFailedFuture(java.lang.Throwable r4) {
            r3 = this;
            io.netty.channel.FailedChannelFuture r0 = new io.netty.channel.FailedChannelFuture
            io.netty.channel.Channel r1 = r3.channel
            r2 = 0
            r0.<init>(r1, r2, r4)
            return r0
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public final io.netty.channel.ChannelProgressivePromise newProgressivePromise() {
            r2 = this;
            io.netty.channel.DefaultChannelProgressivePromise r0 = new io.netty.channel.DefaultChannelProgressivePromise
            io.netty.channel.Channel r1 = r2.channel
            r0.<init>(r1)
            return r0
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public final io.netty.channel.ChannelPromise newPromise() {
            r2 = this;
            io.netty.channel.DefaultChannelPromise r0 = new io.netty.channel.DefaultChannelPromise
            io.netty.channel.Channel r1 = r2.channel
            r0.<init>(r1)
            return r0
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public final io.netty.channel.ChannelFuture newSucceededFuture() {
            r1 = this;
            io.netty.channel.ChannelFuture r0 = r1.succeededFuture
            return r0
    }

    protected void onUnhandledChannelWritabilityChanged() {
            r0 = this;
            return
    }

    protected void onUnhandledInboundChannelActive() {
            r0 = this;
            return
    }

    protected void onUnhandledInboundChannelInactive() {
            r0 = this;
            return
    }

    protected void onUnhandledInboundChannelReadComplete() {
            r0 = this;
            return
    }

    protected void onUnhandledInboundException(java.lang.Throwable r3) {
            r2 = this;
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.channel.DefaultChannelPipeline.logger     // Catch: java.lang.Throwable -> Lb
            java.lang.String r1 = "An exceptionCaught() event was fired, and it reached at the tail of the pipeline. It usually means the last handler in the pipeline did not handle the exception."
            r0.warn(r1, r3)     // Catch: java.lang.Throwable -> Lb
            io.netty.util.ReferenceCountUtil.release(r3)
            return
        Lb:
            r0 = move-exception
            io.netty.util.ReferenceCountUtil.release(r3)
            throw r0
    }

    protected void onUnhandledInboundMessage(io.netty.channel.ChannelHandlerContext r3, java.lang.Object r4) {
            r2 = this;
            r2.onUnhandledInboundMessage(r4)
            io.netty.util.internal.logging.InternalLogger r4 = io.netty.channel.DefaultChannelPipeline.logger
            boolean r0 = r4.isDebugEnabled()
            if (r0 == 0) goto L1c
            io.netty.channel.ChannelPipeline r0 = r3.pipeline()
            java.util.List r0 = r0.names()
            io.netty.channel.Channel r3 = r3.channel()
            java.lang.String r1 = "Discarded message pipeline : {}. Channel : {}."
            r4.debug(r1, r0, r3)
        L1c:
            return
    }

    protected void onUnhandledInboundMessage(java.lang.Object r3) {
            r2 = this;
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.channel.DefaultChannelPipeline.logger     // Catch: java.lang.Throwable -> Lb
            java.lang.String r1 = "Discarded inbound message {} that reached at the tail of the pipeline. Please check your pipeline configuration."
            r0.debug(r1, r3)     // Catch: java.lang.Throwable -> Lb
            io.netty.util.ReferenceCountUtil.release(r3)
            return
        Lb:
            r0 = move-exception
            io.netty.util.ReferenceCountUtil.release(r3)
            throw r0
    }

    protected void onUnhandledInboundUserEventTriggered(java.lang.Object r1) {
            r0 = this;
            io.netty.util.ReferenceCountUtil.release(r1)
            return
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelOutboundInvoker read() {
            r1 = this;
            io.netty.channel.ChannelPipeline r0 = r1.read()
            return r0
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public final io.netty.channel.ChannelPipeline read() {
            r1 = this;
            io.netty.channel.AbstractChannelHandlerContext r0 = r1.tail
            r0.read()
            return r1
    }

    @Override // io.netty.channel.ChannelPipeline
    public final <T extends io.netty.channel.ChannelHandler> T remove(java.lang.Class<T> r1) {
            r0 = this;
            io.netty.channel.AbstractChannelHandlerContext r1 = r0.getContextOrDie(r1)
            io.netty.channel.AbstractChannelHandlerContext r1 = r0.remove(r1)
            io.netty.channel.ChannelHandler r1 = r1.handler()
            return r1
    }

    @Override // io.netty.channel.ChannelPipeline
    public final io.netty.channel.ChannelHandler remove(java.lang.String r1) {
            r0 = this;
            io.netty.channel.AbstractChannelHandlerContext r1 = r0.getContextOrDie(r1)
            io.netty.channel.AbstractChannelHandlerContext r1 = r0.remove(r1)
            io.netty.channel.ChannelHandler r1 = r1.handler()
            return r1
    }

    @Override // io.netty.channel.ChannelPipeline
    public final io.netty.channel.ChannelPipeline remove(io.netty.channel.ChannelHandler r1) {
            r0 = this;
            io.netty.channel.AbstractChannelHandlerContext r1 = r0.getContextOrDie(r1)
            r0.remove(r1)
            return r0
    }

    @Override // io.netty.channel.ChannelPipeline
    public final io.netty.channel.ChannelHandler removeFirst() {
            r2 = this;
            io.netty.channel.AbstractChannelHandlerContext r0 = r2.head
            io.netty.channel.AbstractChannelHandlerContext r0 = r0.next
            io.netty.channel.AbstractChannelHandlerContext r1 = r2.tail
            if (r0 == r1) goto L15
            io.netty.channel.AbstractChannelHandlerContext r0 = r2.head
            io.netty.channel.AbstractChannelHandlerContext r0 = r0.next
            io.netty.channel.AbstractChannelHandlerContext r0 = r2.remove(r0)
            io.netty.channel.ChannelHandler r0 = r0.handler()
            return r0
        L15:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    public final <T extends io.netty.channel.ChannelHandler> T removeIfExists(io.netty.channel.ChannelHandler r1) {
            r0 = this;
            io.netty.channel.ChannelHandlerContext r1 = r0.context(r1)
            io.netty.channel.ChannelHandler r1 = r0.removeIfExists(r1)
            return r1
    }

    public final <T extends io.netty.channel.ChannelHandler> T removeIfExists(java.lang.Class<T> r1) {
            r0 = this;
            io.netty.channel.ChannelHandlerContext r1 = r0.context(r1)
            io.netty.channel.ChannelHandler r1 = r0.removeIfExists(r1)
            return r1
    }

    public final <T extends io.netty.channel.ChannelHandler> T removeIfExists(java.lang.String r1) {
            r0 = this;
            io.netty.channel.ChannelHandlerContext r1 = r0.context(r1)
            io.netty.channel.ChannelHandler r1 = r0.removeIfExists(r1)
            return r1
    }

    @Override // io.netty.channel.ChannelPipeline
    public final io.netty.channel.ChannelHandler removeLast() {
            r2 = this;
            io.netty.channel.AbstractChannelHandlerContext r0 = r2.head
            io.netty.channel.AbstractChannelHandlerContext r0 = r0.next
            io.netty.channel.AbstractChannelHandlerContext r1 = r2.tail
            if (r0 == r1) goto L13
            io.netty.channel.AbstractChannelHandlerContext r0 = r1.prev
            io.netty.channel.AbstractChannelHandlerContext r0 = r2.remove(r0)
            io.netty.channel.ChannelHandler r0 = r0.handler()
            return r0
        L13:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // io.netty.channel.ChannelPipeline
    public final <T extends io.netty.channel.ChannelHandler> T replace(java.lang.Class<T> r1, java.lang.String r2, io.netty.channel.ChannelHandler r3) {
            r0 = this;
            io.netty.channel.AbstractChannelHandlerContext r1 = r0.getContextOrDie(r1)
            io.netty.channel.ChannelHandler r1 = r0.replace(r1, r2, r3)
            return r1
    }

    @Override // io.netty.channel.ChannelPipeline
    public final io.netty.channel.ChannelHandler replace(java.lang.String r1, java.lang.String r2, io.netty.channel.ChannelHandler r3) {
            r0 = this;
            io.netty.channel.AbstractChannelHandlerContext r1 = r0.getContextOrDie(r1)
            io.netty.channel.ChannelHandler r1 = r0.replace(r1, r2, r3)
            return r1
    }

    @Override // io.netty.channel.ChannelPipeline
    public final io.netty.channel.ChannelPipeline replace(io.netty.channel.ChannelHandler r1, java.lang.String r2, io.netty.channel.ChannelHandler r3) {
            r0 = this;
            io.netty.channel.AbstractChannelHandlerContext r1 = r0.getContextOrDie(r1)
            r0.replace(r1, r2, r3)
            return r0
    }

    @Override // io.netty.channel.ChannelPipeline
    public final java.util.Map<java.lang.String, io.netty.channel.ChannelHandler> toMap() {
            r4 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            io.netty.channel.AbstractChannelHandlerContext r1 = r4.head
            io.netty.channel.AbstractChannelHandlerContext r1 = r1.next
        L9:
            io.netty.channel.AbstractChannelHandlerContext r2 = r4.tail
            if (r1 != r2) goto Le
            return r0
        Le:
            java.lang.String r2 = r1.name()
            io.netty.channel.ChannelHandler r3 = r1.handler()
            r0.put(r2, r3)
            io.netty.channel.AbstractChannelHandlerContext r1 = r1.next
            goto L9
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r3)
            r0.append(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            io.netty.channel.AbstractChannelHandlerContext r1 = r3.head
            io.netty.channel.AbstractChannelHandlerContext r1 = r1.next
        L15:
            io.netty.channel.AbstractChannelHandlerContext r2 = r3.tail
            if (r1 != r2) goto L1a
            goto L45
        L1a:
            r2 = 40
            r0.append(r2)
            java.lang.String r2 = r1.name()
            r0.append(r2)
            java.lang.String r2 = " = "
            r0.append(r2)
            io.netty.channel.ChannelHandler r2 = r1.handler()
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            io.netty.channel.AbstractChannelHandlerContext r1 = r1.next
            io.netty.channel.AbstractChannelHandlerContext r2 = r3.tail
            if (r1 != r2) goto L4f
        L45:
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L4f:
            java.lang.String r2 = ", "
            r0.append(r2)
            goto L15
    }

    final java.lang.Object touch(java.lang.Object r2, io.netty.channel.AbstractChannelHandlerContext r3) {
            r1 = this;
            boolean r0 = r1.touch
            if (r0 == 0) goto L8
            java.lang.Object r2 = io.netty.util.ReferenceCountUtil.touch(r2, r3)
        L8:
            return r2
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public final io.netty.channel.ChannelPromise voidPromise() {
            r1 = this;
            io.netty.channel.VoidChannelPromise r0 = r1.voidPromise
            return r0
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public final io.netty.channel.ChannelFuture write(java.lang.Object r2) {
            r1 = this;
            io.netty.channel.AbstractChannelHandlerContext r0 = r1.tail
            io.netty.channel.ChannelFuture r2 = r0.write(r2)
            return r2
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public final io.netty.channel.ChannelFuture write(java.lang.Object r2, io.netty.channel.ChannelPromise r3) {
            r1 = this;
            io.netty.channel.AbstractChannelHandlerContext r0 = r1.tail
            io.netty.channel.ChannelFuture r2 = r0.write(r2, r3)
            return r2
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public final io.netty.channel.ChannelFuture writeAndFlush(java.lang.Object r2) {
            r1 = this;
            io.netty.channel.AbstractChannelHandlerContext r0 = r1.tail
            io.netty.channel.ChannelFuture r2 = r0.writeAndFlush(r2)
            return r2
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public final io.netty.channel.ChannelFuture writeAndFlush(java.lang.Object r2, io.netty.channel.ChannelPromise r3) {
            r1 = this;
            io.netty.channel.AbstractChannelHandlerContext r0 = r1.tail
            io.netty.channel.ChannelFuture r2 = r0.writeAndFlush(r2, r3)
            return r2
    }
}
