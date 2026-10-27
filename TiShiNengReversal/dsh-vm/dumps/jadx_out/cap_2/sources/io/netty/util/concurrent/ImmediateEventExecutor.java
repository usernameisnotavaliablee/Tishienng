package io.netty.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ImmediateEventExecutor extends io.netty.util.concurrent.AbstractEventExecutor {
    private static final io.netty.util.concurrent.FastThreadLocal<java.util.Queue<java.lang.Runnable>> DELAYED_RUNNABLES = null;
    public static final io.netty.util.concurrent.ImmediateEventExecutor INSTANCE = null;
    private static final io.netty.util.concurrent.FastThreadLocal<java.lang.Boolean> RUNNING = null;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private final io.netty.util.concurrent.Future<?> terminationFuture;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class ImmediateProgressivePromise<V> extends io.netty.util.concurrent.DefaultProgressivePromise<V> {
        ImmediateProgressivePromise(io.netty.util.concurrent.EventExecutor r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // io.netty.util.concurrent.DefaultPromise
        protected void checkDeadLock() {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class ImmediatePromise<V> extends io.netty.util.concurrent.DefaultPromise<V> {
        ImmediatePromise(io.netty.util.concurrent.EventExecutor r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // io.netty.util.concurrent.DefaultPromise
        protected void checkDeadLock() {
                r0 = this;
                return
        }
    }

    static {
            java.lang.Class<io.netty.util.concurrent.ImmediateEventExecutor> r0 = io.netty.util.concurrent.ImmediateEventExecutor.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.util.concurrent.ImmediateEventExecutor.logger = r0
            io.netty.util.concurrent.ImmediateEventExecutor r0 = new io.netty.util.concurrent.ImmediateEventExecutor
            r0.<init>()
            io.netty.util.concurrent.ImmediateEventExecutor.INSTANCE = r0
            io.netty.util.concurrent.ImmediateEventExecutor$1 r0 = new io.netty.util.concurrent.ImmediateEventExecutor$1
            r0.<init>()
            io.netty.util.concurrent.ImmediateEventExecutor.DELAYED_RUNNABLES = r0
            io.netty.util.concurrent.ImmediateEventExecutor$2 r0 = new io.netty.util.concurrent.ImmediateEventExecutor$2
            r0.<init>()
            io.netty.util.concurrent.ImmediateEventExecutor.RUNNING = r0
            return
    }

    private ImmediateEventExecutor() {
            r3 = this;
            r3.<init>()
            io.netty.util.concurrent.FailedFuture r0 = new io.netty.util.concurrent.FailedFuture
            io.netty.util.concurrent.GlobalEventExecutor r1 = io.netty.util.concurrent.GlobalEventExecutor.INSTANCE
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            r2.<init>()
            r0.<init>(r1, r2)
            r3.terminationFuture = r0
            return
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long r1, java.util.concurrent.TimeUnit r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable r6) {
            r5 = this;
            java.lang.String r0 = "Throwable caught while executing Runnable {}"
            if (r6 == 0) goto L8f
            io.netty.util.concurrent.FastThreadLocal<java.lang.Boolean> r1 = io.netty.util.concurrent.ImmediateEventExecutor.RUNNING
            java.lang.Object r2 = r1.get()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L83
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r1.set(r2)
            r6.run()     // Catch: java.lang.Throwable -> L3d
            io.netty.util.concurrent.FastThreadLocal<java.util.Queue<java.lang.Runnable>> r6 = io.netty.util.concurrent.ImmediateEventExecutor.DELAYED_RUNNABLES
            java.lang.Object r6 = r6.get()
            java.util.Queue r6 = (java.util.Queue) r6
        L22:
            java.lang.Object r1 = r6.poll()
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            if (r1 == 0) goto L35
            r1.run()     // Catch: java.lang.Throwable -> L2e
            goto L22
        L2e:
            r2 = move-exception
            io.netty.util.internal.logging.InternalLogger r3 = io.netty.util.concurrent.ImmediateEventExecutor.logger
            r3.info(r0, r1, r2)
            goto L22
        L35:
            io.netty.util.concurrent.FastThreadLocal<java.lang.Boolean> r6 = io.netty.util.concurrent.ImmediateEventExecutor.RUNNING
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r6.set(r0)
            goto L5e
        L3d:
            r1 = move-exception
            io.netty.util.internal.logging.InternalLogger r2 = io.netty.util.concurrent.ImmediateEventExecutor.logger     // Catch: java.lang.Throwable -> L5f
            r2.info(r0, r6, r1)     // Catch: java.lang.Throwable -> L5f
            io.netty.util.concurrent.FastThreadLocal<java.util.Queue<java.lang.Runnable>> r6 = io.netty.util.concurrent.ImmediateEventExecutor.DELAYED_RUNNABLES
            java.lang.Object r6 = r6.get()
            java.util.Queue r6 = (java.util.Queue) r6
        L4b:
            java.lang.Object r1 = r6.poll()
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            if (r1 == 0) goto L35
            r1.run()     // Catch: java.lang.Throwable -> L57
            goto L4b
        L57:
            r2 = move-exception
            io.netty.util.internal.logging.InternalLogger r3 = io.netty.util.concurrent.ImmediateEventExecutor.logger
            r3.info(r0, r1, r2)
            goto L4b
        L5e:
            return
        L5f:
            r6 = move-exception
            io.netty.util.concurrent.FastThreadLocal<java.util.Queue<java.lang.Runnable>> r1 = io.netty.util.concurrent.ImmediateEventExecutor.DELAYED_RUNNABLES
            java.lang.Object r1 = r1.get()
            java.util.Queue r1 = (java.util.Queue) r1
        L68:
            java.lang.Object r2 = r1.poll()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 == 0) goto L7b
            r2.run()     // Catch: java.lang.Throwable -> L74
            goto L68
        L74:
            r3 = move-exception
            io.netty.util.internal.logging.InternalLogger r4 = io.netty.util.concurrent.ImmediateEventExecutor.logger
            r4.info(r0, r2, r3)
            goto L68
        L7b:
            io.netty.util.concurrent.FastThreadLocal<java.lang.Boolean> r0 = io.netty.util.concurrent.ImmediateEventExecutor.RUNNING
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.set(r1)
            throw r6
        L83:
            io.netty.util.concurrent.FastThreadLocal<java.util.Queue<java.lang.Runnable>> r0 = io.netty.util.concurrent.ImmediateEventExecutor.DELAYED_RUNNABLES
            java.lang.Object r0 = r0.get()
            java.util.Queue r0 = (java.util.Queue) r0
            r0.add(r6)
            return
        L8f:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r0 = "command"
            r6.<init>(r0)
            throw r6
    }

    @Override // io.netty.util.concurrent.AbstractEventExecutor, io.netty.util.concurrent.EventExecutor
    public boolean inEventLoop() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // io.netty.util.concurrent.EventExecutor
    public boolean inEventLoop(java.lang.Thread r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.netty.util.concurrent.EventExecutorGroup
    public boolean isShuttingDown() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.netty.util.concurrent.AbstractEventExecutor, io.netty.util.concurrent.EventExecutor
    public <V> io.netty.util.concurrent.ProgressivePromise<V> newProgressivePromise() {
            r1 = this;
            io.netty.util.concurrent.ImmediateEventExecutor$ImmediateProgressivePromise r0 = new io.netty.util.concurrent.ImmediateEventExecutor$ImmediateProgressivePromise
            r0.<init>(r1)
            return r0
    }

    @Override // io.netty.util.concurrent.AbstractEventExecutor, io.netty.util.concurrent.EventExecutor
    public <V> io.netty.util.concurrent.Promise<V> newPromise() {
            r1 = this;
            io.netty.util.concurrent.ImmediateEventExecutor$ImmediatePromise r0 = new io.netty.util.concurrent.ImmediateEventExecutor$ImmediatePromise
            r0.<init>(r1)
            return r0
    }

    @Override // io.netty.util.concurrent.AbstractEventExecutor, java.util.concurrent.ExecutorService, io.netty.util.concurrent.EventExecutorGroup
    @java.lang.Deprecated
    public void shutdown() {
            r0 = this;
            return
    }

    @Override // io.netty.util.concurrent.EventExecutorGroup
    public io.netty.util.concurrent.Future<?> shutdownGracefully(long r1, long r3, java.util.concurrent.TimeUnit r5) {
            r0 = this;
            io.netty.util.concurrent.Future r1 = r0.terminationFuture()
            return r1
    }

    @Override // io.netty.util.concurrent.EventExecutorGroup
    public io.netty.util.concurrent.Future<?> terminationFuture() {
            r1 = this;
            io.netty.util.concurrent.Future<?> r0 = r1.terminationFuture
            return r0
    }
}
