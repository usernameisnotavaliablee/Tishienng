package io.netty.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class MultithreadEventExecutorGroup extends io.netty.util.concurrent.AbstractEventExecutorGroup {
    private final io.netty.util.concurrent.EventExecutor[] children;
    private final io.netty.util.concurrent.EventExecutorChooserFactory.EventExecutorChooser chooser;
    private final java.util.Set<io.netty.util.concurrent.EventExecutor> readonlyChildren;
    private final java.util.concurrent.atomic.AtomicInteger terminatedChildren;
    private final io.netty.util.concurrent.Promise<?> terminationFuture;


    protected MultithreadEventExecutorGroup(int r5, java.util.concurrent.Executor r6, io.netty.util.concurrent.EventExecutorChooserFactory r7, java.lang.Object... r8) {
            r4 = this;
            r4.<init>()
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            r4.terminatedChildren = r0
            io.netty.util.concurrent.DefaultPromise r0 = new io.netty.util.concurrent.DefaultPromise
            io.netty.util.concurrent.GlobalEventExecutor r1 = io.netty.util.concurrent.GlobalEventExecutor.INSTANCE
            r0.<init>(r1)
            r4.terminationFuture = r0
            r0 = 0
            if (r5 <= 0) goto L9d
            if (r6 != 0) goto L21
            io.netty.util.concurrent.ThreadPerTaskExecutor r6 = new io.netty.util.concurrent.ThreadPerTaskExecutor
            java.util.concurrent.ThreadFactory r1 = r4.newDefaultThreadFactory()
            r6.<init>(r1)
        L21:
            io.netty.util.concurrent.EventExecutor[] r1 = new io.netty.util.concurrent.EventExecutor[r5]
            r4.children = r1
            r1 = 0
        L26:
            if (r1 >= r5) goto L6b
            io.netty.util.concurrent.EventExecutor[] r2 = r4.children     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            io.netty.util.concurrent.EventExecutor r3 = r4.newChild(r6, r8)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            r2[r1] = r3     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            int r1 = r1 + 1
            goto L26
        L33:
            r5 = move-exception
            goto L3e
        L35:
            r5 = move-exception
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L33
            java.lang.String r7 = "failed to create a child event loop"
            r6.<init>(r7, r5)     // Catch: java.lang.Throwable -> L33
            throw r6     // Catch: java.lang.Throwable -> L33
        L3e:
            r6 = 0
        L3f:
            if (r6 >= r1) goto L4b
            io.netty.util.concurrent.EventExecutor[] r7 = r4.children
            r7 = r7[r6]
            r7.shutdownGracefully()
            int r6 = r6 + 1
            goto L3f
        L4b:
            if (r0 >= r1) goto L6a
            io.netty.util.concurrent.EventExecutor[] r6 = r4.children
            r6 = r6[r0]
        L51:
            boolean r7 = r6.isTerminated()     // Catch: java.lang.InterruptedException -> L63
            if (r7 != 0) goto L60
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.InterruptedException -> L63
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            r6.awaitTermination(r2, r7)     // Catch: java.lang.InterruptedException -> L63
            goto L51
        L60:
            int r0 = r0 + 1
            goto L4b
        L63:
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            r6.interrupt()
        L6a:
            throw r5
        L6b:
            io.netty.util.concurrent.EventExecutor[] r5 = r4.children
            io.netty.util.concurrent.EventExecutorChooserFactory$EventExecutorChooser r5 = r7.newChooser(r5)
            r4.chooser = r5
            io.netty.util.concurrent.MultithreadEventExecutorGroup$1 r5 = new io.netty.util.concurrent.MultithreadEventExecutorGroup$1
            r5.<init>(r4)
            io.netty.util.concurrent.EventExecutor[] r6 = r4.children
            int r7 = r6.length
        L7b:
            if (r0 >= r7) goto L89
            r8 = r6[r0]
            io.netty.util.concurrent.Future r8 = r8.terminationFuture()
            r8.addListener(r5)
            int r0 = r0 + 1
            goto L7b
        L89:
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
            io.netty.util.concurrent.EventExecutor[] r6 = r4.children
            int r6 = r6.length
            r5.<init>(r6)
            io.netty.util.concurrent.EventExecutor[] r6 = r4.children
            java.util.Collections.addAll(r5, r6)
            java.util.Set r5 = java.util.Collections.unmodifiableSet(r5)
            r4.readonlyChildren = r5
            return
        L9d:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r0] = r5
            java.lang.String r5 = "nThreads: %d (expected: > 0)"
            java.lang.String r5 = java.lang.String.format(r5, r7)
            r6.<init>(r5)
            throw r6
    }

    protected MultithreadEventExecutorGroup(int r2, java.util.concurrent.Executor r3, java.lang.Object... r4) {
            r1 = this;
            io.netty.util.concurrent.DefaultEventExecutorChooserFactory r0 = io.netty.util.concurrent.DefaultEventExecutorChooserFactory.INSTANCE
            r1.<init>(r2, r3, r0, r4)
            return
    }

    protected MultithreadEventExecutorGroup(int r2, java.util.concurrent.ThreadFactory r3, java.lang.Object... r4) {
            r1 = this;
            if (r3 != 0) goto L4
            r3 = 0
            goto La
        L4:
            io.netty.util.concurrent.ThreadPerTaskExecutor r0 = new io.netty.util.concurrent.ThreadPerTaskExecutor
            r0.<init>(r3)
            r3 = r0
        La:
            r1.<init>(r2, r3, r4)
            return
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicInteger access$000(io.netty.util.concurrent.MultithreadEventExecutorGroup r0) {
            java.util.concurrent.atomic.AtomicInteger r0 = r0.terminatedChildren
            return r0
    }

    static /* synthetic */ io.netty.util.concurrent.EventExecutor[] access$100(io.netty.util.concurrent.MultithreadEventExecutorGroup r0) {
            io.netty.util.concurrent.EventExecutor[] r0 = r0.children
            return r0
    }

    static /* synthetic */ io.netty.util.concurrent.Promise access$200(io.netty.util.concurrent.MultithreadEventExecutorGroup r0) {
            io.netty.util.concurrent.Promise<?> r0 = r0.terminationFuture
            return r0
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long r9, java.util.concurrent.TimeUnit r11) throws java.lang.InterruptedException {
            r8 = this;
            long r0 = java.lang.System.nanoTime()
            long r9 = r11.toNanos(r9)
            long r0 = r0 + r9
            io.netty.util.concurrent.EventExecutor[] r9 = r8.children
            int r10 = r9.length
            r11 = 0
        Ld:
            if (r11 >= r10) goto L29
            r2 = r9[r11]
        L11:
            long r3 = java.lang.System.nanoTime()
            long r3 = r0 - r3
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L1e
            goto L29
        L1e:
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.NANOSECONDS
            boolean r3 = r2.awaitTermination(r3, r5)
            if (r3 == 0) goto L11
            int r11 = r11 + 1
            goto Ld
        L29:
            boolean r9 = r8.isTerminated()
            return r9
    }

    public final int executorCount() {
            r1 = this;
            io.netty.util.concurrent.EventExecutor[] r0 = r1.children
            int r0 = r0.length
            return r0
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
            r5 = this;
            io.netty.util.concurrent.EventExecutor[] r0 = r5.children
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L5:
            if (r3 >= r1) goto L13
            r4 = r0[r3]
            boolean r4 = r4.isShutdown()
            if (r4 != 0) goto L10
            return r2
        L10:
            int r3 = r3 + 1
            goto L5
        L13:
            r0 = 1
            return r0
    }

    @Override // io.netty.util.concurrent.EventExecutorGroup
    public boolean isShuttingDown() {
            r5 = this;
            io.netty.util.concurrent.EventExecutor[] r0 = r5.children
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L5:
            if (r3 >= r1) goto L13
            r4 = r0[r3]
            boolean r4 = r4.isShuttingDown()
            if (r4 != 0) goto L10
            return r2
        L10:
            int r3 = r3 + 1
            goto L5
        L13:
            r0 = 1
            return r0
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
            r5 = this;
            io.netty.util.concurrent.EventExecutor[] r0 = r5.children
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L5:
            if (r3 >= r1) goto L13
            r4 = r0[r3]
            boolean r4 = r4.isTerminated()
            if (r4 != 0) goto L10
            return r2
        L10:
            int r3 = r3 + 1
            goto L5
        L13:
            r0 = 1
            return r0
    }

    @Override // io.netty.util.concurrent.EventExecutorGroup, java.lang.Iterable
    public java.util.Iterator<io.netty.util.concurrent.EventExecutor> iterator() {
            r1 = this;
            java.util.Set<io.netty.util.concurrent.EventExecutor> r0 = r1.readonlyChildren
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    protected abstract io.netty.util.concurrent.EventExecutor newChild(java.util.concurrent.Executor r1, java.lang.Object... r2) throws java.lang.Exception;

    protected java.util.concurrent.ThreadFactory newDefaultThreadFactory() {
            r2 = this;
            io.netty.util.concurrent.DefaultThreadFactory r0 = new io.netty.util.concurrent.DefaultThreadFactory
            java.lang.Class r1 = r2.getClass()
            r0.<init>(r1)
            return r0
    }

    @Override // io.netty.util.concurrent.EventExecutorGroup
    public io.netty.util.concurrent.EventExecutor next() {
            r1 = this;
            io.netty.util.concurrent.EventExecutorChooserFactory$EventExecutorChooser r0 = r1.chooser
            io.netty.util.concurrent.EventExecutor r0 = r0.next()
            return r0
    }

    @Override // io.netty.util.concurrent.AbstractEventExecutorGroup, io.netty.util.concurrent.EventExecutorGroup
    @java.lang.Deprecated
    public void shutdown() {
            r4 = this;
            io.netty.util.concurrent.EventExecutor[] r0 = r4.children
            int r1 = r0.length
            r2 = 0
        L4:
            if (r2 >= r1) goto Le
            r3 = r0[r2]
            r3.shutdown()
            int r2 = r2 + 1
            goto L4
        Le:
            return
    }

    @Override // io.netty.util.concurrent.EventExecutorGroup
    public io.netty.util.concurrent.Future<?> shutdownGracefully(long r10, long r12, java.util.concurrent.TimeUnit r14) {
            r9 = this;
            io.netty.util.concurrent.EventExecutor[] r0 = r9.children
            int r1 = r0.length
            r2 = 0
        L4:
            if (r2 >= r1) goto L11
            r3 = r0[r2]
            r4 = r10
            r6 = r12
            r8 = r14
            r3.shutdownGracefully(r4, r6, r8)
            int r2 = r2 + 1
            goto L4
        L11:
            io.netty.util.concurrent.Future r10 = r9.terminationFuture()
            return r10
    }

    @Override // io.netty.util.concurrent.EventExecutorGroup
    public io.netty.util.concurrent.Future<?> terminationFuture() {
            r1 = this;
            io.netty.util.concurrent.Promise<?> r0 = r1.terminationFuture
            return r0
    }
}
