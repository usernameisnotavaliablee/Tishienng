package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ThreadPerChannelEventLoopGroup extends io.netty.util.concurrent.AbstractEventExecutorGroup implements io.netty.channel.EventLoopGroup {
    final java.util.Set<io.netty.channel.EventLoop> activeChildren;
    private final java.lang.Object[] childArgs;
    private final io.netty.util.concurrent.FutureListener<java.lang.Object> childTerminationListener;
    final java.util.concurrent.Executor executor;
    final java.util.Queue<io.netty.channel.EventLoop> idleChildren;
    private final int maxChannels;
    private volatile boolean shuttingDown;
    private final io.netty.util.concurrent.Promise<?> terminationFuture;
    private final io.netty.channel.ChannelException tooManyChannels;


    protected ThreadPerChannelEventLoopGroup() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    protected ThreadPerChannelEventLoopGroup(int r3) {
            r2 = this;
            java.util.concurrent.ThreadFactory r0 = java.util.concurrent.Executors.defaultThreadFactory()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2.<init>(r3, r0, r1)
            return
    }

    protected ThreadPerChannelEventLoopGroup(int r3, java.util.concurrent.Executor r4, java.lang.Object... r5) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.ConcurrentMap r0 = io.netty.util.internal.PlatformDependent.newConcurrentHashMap()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            r2.activeChildren = r0
            java.util.concurrent.ConcurrentLinkedQueue r0 = new java.util.concurrent.ConcurrentLinkedQueue
            r0.<init>()
            r2.idleChildren = r0
            io.netty.util.concurrent.DefaultPromise r0 = new io.netty.util.concurrent.DefaultPromise
            io.netty.util.concurrent.GlobalEventExecutor r1 = io.netty.util.concurrent.GlobalEventExecutor.INSTANCE
            r0.<init>(r1)
            r2.terminationFuture = r0
            io.netty.channel.ThreadPerChannelEventLoopGroup$1 r0 = new io.netty.channel.ThreadPerChannelEventLoopGroup$1
            r0.<init>(r2)
            r2.childTerminationListener = r0
            if (r3 < 0) goto L6b
            if (r4 == 0) goto L63
            if (r5 != 0) goto L2f
            java.lang.Object[] r5 = io.netty.util.internal.EmptyArrays.EMPTY_OBJECTS
            r2.childArgs = r5
            goto L37
        L2f:
            java.lang.Object r5 = r5.clone()
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            r2.childArgs = r5
        L37:
            r2.maxChannels = r3
            r2.executor = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "too many channels (max: "
            r4.append(r5)
            r4.append(r3)
            r3 = 41
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r4 = 0
            io.netty.channel.ChannelException r3 = io.netty.channel.ChannelException.newStatic(r3, r4)
            java.lang.Class<io.netty.channel.ThreadPerChannelEventLoopGroup> r4 = io.netty.channel.ThreadPerChannelEventLoopGroup.class
            java.lang.String r5 = "nextChild()"
            java.lang.Throwable r3 = io.netty.util.internal.ThrowableUtil.unknownStackTrace(r3, r4, r5)
            io.netty.channel.ChannelException r3 = (io.netty.channel.ChannelException) r3
            r2.tooManyChannels = r3
            return
        L63:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "executor"
            r3.<init>(r4)
            throw r3
        L6b:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r0 = 0
            r5[r0] = r3
            java.lang.String r3 = "maxChannels: %d (expected: >= 0)"
            java.lang.String r3 = java.lang.String.format(r3, r5)
            r4.<init>(r3)
            throw r4
    }

    protected ThreadPerChannelEventLoopGroup(int r2, java.util.concurrent.ThreadFactory r3, java.lang.Object... r4) {
            r1 = this;
            io.netty.util.concurrent.ThreadPerTaskExecutor r0 = new io.netty.util.concurrent.ThreadPerTaskExecutor
            r0.<init>(r3)
            r1.<init>(r2, r0, r4)
            return
    }

    static /* synthetic */ io.netty.util.concurrent.Promise access$000(io.netty.channel.ThreadPerChannelEventLoopGroup r0) {
            io.netty.util.concurrent.Promise<?> r0 = r0.terminationFuture
            return r0
    }

    private io.netty.channel.EventLoop nextChild() throws java.lang.Exception {
            r3 = this;
            boolean r0 = r3.shuttingDown
            if (r0 != 0) goto L35
            java.util.Queue<io.netty.channel.EventLoop> r0 = r3.idleChildren
            java.lang.Object r0 = r0.poll()
            io.netty.channel.EventLoop r0 = (io.netty.channel.EventLoop) r0
            if (r0 != 0) goto L2f
            int r0 = r3.maxChannels
            if (r0 <= 0) goto L20
            java.util.Set<io.netty.channel.EventLoop> r0 = r3.activeChildren
            int r0 = r0.size()
            int r1 = r3.maxChannels
            if (r0 >= r1) goto L1d
            goto L20
        L1d:
            io.netty.channel.ChannelException r0 = r3.tooManyChannels
            throw r0
        L20:
            java.lang.Object[] r0 = r3.childArgs
            io.netty.channel.EventLoop r0 = r3.newChild(r0)
            io.netty.util.concurrent.Future r1 = r0.terminationFuture()
            io.netty.util.concurrent.FutureListener<java.lang.Object> r2 = r3.childTerminationListener
            r1.addListener(r2)
        L2f:
            java.util.Set<io.netty.channel.EventLoop> r1 = r3.activeChildren
            r1.add(r0)
            return r0
        L35:
            java.util.concurrent.RejectedExecutionException r0 = new java.util.concurrent.RejectedExecutionException
            java.lang.String r1 = "shutting down"
            r0.<init>(r1)
            throw r0
    }

    public boolean awaitTermination(long r7, java.util.concurrent.TimeUnit r9) throws java.lang.InterruptedException {
            r6 = this;
            long r0 = java.lang.System.nanoTime()
            long r7 = r9.toNanos(r7)
            long r0 = r0 + r7
            java.util.Set<io.netty.channel.EventLoop> r7 = r6.activeChildren
            java.util.Iterator r7 = r7.iterator()
        Lf:
            boolean r8 = r7.hasNext()
            r2 = 0
            if (r8 == 0) goto L35
            java.lang.Object r8 = r7.next()
            io.netty.channel.EventLoop r8 = (io.netty.channel.EventLoop) r8
        L1d:
            long r4 = java.lang.System.nanoTime()
            long r4 = r0 - r4
            int r9 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r9 > 0) goto L2c
            boolean r7 = r6.isTerminated()
            return r7
        L2c:
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.NANOSECONDS
            boolean r9 = r8.awaitTermination(r4, r9)
            if (r9 == 0) goto L1d
            goto Lf
        L35:
            java.util.Queue<io.netty.channel.EventLoop> r7 = r6.idleChildren
            java.util.Iterator r7 = r7.iterator()
        L3b:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L5f
            java.lang.Object r8 = r7.next()
            io.netty.channel.EventLoop r8 = (io.netty.channel.EventLoop) r8
        L47:
            long r4 = java.lang.System.nanoTime()
            long r4 = r0 - r4
            int r9 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r9 > 0) goto L56
            boolean r7 = r6.isTerminated()
            return r7
        L56:
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.NANOSECONDS
            boolean r9 = r8.awaitTermination(r4, r9)
            if (r9 == 0) goto L47
            goto L3b
        L5f:
            boolean r7 = r6.isTerminated()
            return r7
    }

    public boolean isShutdown() {
            r3 = this;
            java.util.Set<io.netty.channel.EventLoop> r0 = r3.activeChildren
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            io.netty.channel.EventLoop r1 = (io.netty.channel.EventLoop) r1
            boolean r1 = r1.isShutdown()
            if (r1 != 0) goto L6
            return r2
        L1a:
            java.util.Queue<io.netty.channel.EventLoop> r0 = r3.idleChildren
            java.util.Iterator r0 = r0.iterator()
        L20:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L33
            java.lang.Object r1 = r0.next()
            io.netty.channel.EventLoop r1 = (io.netty.channel.EventLoop) r1
            boolean r1 = r1.isShutdown()
            if (r1 != 0) goto L20
            return r2
        L33:
            r0 = 1
            return r0
    }

    public boolean isShuttingDown() {
            r3 = this;
            java.util.Set<io.netty.channel.EventLoop> r0 = r3.activeChildren
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            io.netty.channel.EventLoop r1 = (io.netty.channel.EventLoop) r1
            boolean r1 = r1.isShuttingDown()
            if (r1 != 0) goto L6
            return r2
        L1a:
            java.util.Queue<io.netty.channel.EventLoop> r0 = r3.idleChildren
            java.util.Iterator r0 = r0.iterator()
        L20:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L33
            java.lang.Object r1 = r0.next()
            io.netty.channel.EventLoop r1 = (io.netty.channel.EventLoop) r1
            boolean r1 = r1.isShuttingDown()
            if (r1 != 0) goto L20
            return r2
        L33:
            r0 = 1
            return r0
    }

    public boolean isTerminated() {
            r3 = this;
            java.util.Set<io.netty.channel.EventLoop> r0 = r3.activeChildren
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            io.netty.channel.EventLoop r1 = (io.netty.channel.EventLoop) r1
            boolean r1 = r1.isTerminated()
            if (r1 != 0) goto L6
            return r2
        L1a:
            java.util.Queue<io.netty.channel.EventLoop> r0 = r3.idleChildren
            java.util.Iterator r0 = r0.iterator()
        L20:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L33
            java.lang.Object r1 = r0.next()
            io.netty.channel.EventLoop r1 = (io.netty.channel.EventLoop) r1
            boolean r1 = r1.isTerminated()
            if (r1 != 0) goto L20
            return r2
        L33:
            r0 = 1
            return r0
    }

    public java.util.Iterator<io.netty.util.concurrent.EventExecutor> iterator() {
            r2 = this;
            io.netty.util.internal.ReadOnlyIterator r0 = new io.netty.util.internal.ReadOnlyIterator
            java.util.Set<io.netty.channel.EventLoop> r1 = r2.activeChildren
            java.util.Iterator r1 = r1.iterator()
            r0.<init>(r1)
            return r0
    }

    protected io.netty.channel.EventLoop newChild(java.lang.Object... r1) throws java.lang.Exception {
            r0 = this;
            io.netty.channel.ThreadPerChannelEventLoop r1 = new io.netty.channel.ThreadPerChannelEventLoop
            r1.<init>(r0)
            return r1
    }

    @Override // io.netty.channel.EventLoopGroup
    public io.netty.channel.EventLoop next() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    /* renamed from: next, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.EventExecutor m125next() {
            r1 = this;
            io.netty.channel.EventLoop r0 = r1.next()
            return r0
    }

    @Override // io.netty.channel.EventLoopGroup
    public io.netty.channel.ChannelFuture register(io.netty.channel.Channel r4) {
            r3 = this;
            if (r4 == 0) goto L19
            io.netty.channel.EventLoop r0 = r3.nextChild()     // Catch: java.lang.Throwable -> L10
            io.netty.channel.DefaultChannelPromise r1 = new io.netty.channel.DefaultChannelPromise     // Catch: java.lang.Throwable -> L10
            r1.<init>(r4, r0)     // Catch: java.lang.Throwable -> L10
            io.netty.channel.ChannelFuture r4 = r0.register(r1)     // Catch: java.lang.Throwable -> L10
            return r4
        L10:
            r0 = move-exception
            io.netty.channel.FailedChannelFuture r1 = new io.netty.channel.FailedChannelFuture
            io.netty.util.concurrent.GlobalEventExecutor r2 = io.netty.util.concurrent.GlobalEventExecutor.INSTANCE
            r1.<init>(r4, r2, r0)
            return r1
        L19:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r0 = "channel"
            r4.<init>(r0)
            throw r4
    }

    @Override // io.netty.channel.EventLoopGroup
    @java.lang.Deprecated
    public io.netty.channel.ChannelFuture register(io.netty.channel.Channel r2, io.netty.channel.ChannelPromise r3) {
            r1 = this;
            if (r2 == 0) goto L10
            io.netty.channel.EventLoop r0 = r1.nextChild()     // Catch: java.lang.Throwable -> Lb
            io.netty.channel.ChannelFuture r2 = r0.register(r2, r3)     // Catch: java.lang.Throwable -> Lb
            return r2
        Lb:
            r2 = move-exception
            r3.setFailure(r2)
            return r3
        L10:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "channel"
            r2.<init>(r3)
            throw r2
    }

    @Override // io.netty.channel.EventLoopGroup
    public io.netty.channel.ChannelFuture register(io.netty.channel.ChannelPromise r2) {
            r1 = this;
            io.netty.channel.EventLoop r0 = r1.nextChild()     // Catch: java.lang.Throwable -> L9
            io.netty.channel.ChannelFuture r2 = r0.register(r2)     // Catch: java.lang.Throwable -> L9
            return r2
        L9:
            r0 = move-exception
            r2.setFailure(r0)
            return r2
    }

    @java.lang.Deprecated
    public void shutdown() {
            r2 = this;
            r0 = 1
            r2.shuttingDown = r0
            java.util.Set<io.netty.channel.EventLoop> r0 = r2.activeChildren
            java.util.Iterator r0 = r0.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            io.netty.channel.EventLoop r1 = (io.netty.channel.EventLoop) r1
            r1.shutdown()
            goto L9
        L19:
            java.util.Queue<io.netty.channel.EventLoop> r0 = r2.idleChildren
            java.util.Iterator r0 = r0.iterator()
        L1f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r0.next()
            io.netty.channel.EventLoop r1 = (io.netty.channel.EventLoop) r1
            r1.shutdown()
            goto L1f
        L2f:
            boolean r0 = r2.isTerminated()
            if (r0 == 0) goto L3b
            io.netty.util.concurrent.Promise<?> r0 = r2.terminationFuture
            r1 = 0
            r0.trySuccess(r1)
        L3b:
            return
    }

    public io.netty.util.concurrent.Future<?> shutdownGracefully(long r10, long r12, java.util.concurrent.TimeUnit r14) {
            r9 = this;
            r0 = 1
            r9.shuttingDown = r0
            java.util.Set<io.netty.channel.EventLoop> r0 = r9.activeChildren
            java.util.Iterator r0 = r0.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            r2 = r1
            io.netty.channel.EventLoop r2 = (io.netty.channel.EventLoop) r2
            r3 = r10
            r5 = r12
            r7 = r14
            r2.shutdownGracefully(r3, r5, r7)
            goto L9
        L1d:
            r3 = r10
            r5 = r12
            r7 = r14
            java.util.Queue<io.netty.channel.EventLoop> r10 = r9.idleChildren
            java.util.Iterator r10 = r10.iterator()
        L26:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L3d
            java.lang.Object r11 = r10.next()
            io.netty.channel.EventLoop r11 = (io.netty.channel.EventLoop) r11
            r8 = r7
            r6 = r5
            r4 = r3
            r3 = r11
            r3.shutdownGracefully(r4, r6, r8)
            r3 = r4
            r5 = r6
            r7 = r8
            goto L26
        L3d:
            boolean r10 = r9.isTerminated()
            if (r10 == 0) goto L49
            io.netty.util.concurrent.Promise<?> r10 = r9.terminationFuture
            r11 = 0
            r10.trySuccess(r11)
        L49:
            io.netty.util.concurrent.Future r10 = r9.terminationFuture()
            return r10
    }

    public io.netty.util.concurrent.Future<?> terminationFuture() {
            r1 = this;
            io.netty.util.concurrent.Promise<?> r0 = r1.terminationFuture
            return r0
    }
}
