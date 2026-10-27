package io.reactivex.internal.schedulers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class SingleScheduler extends io.reactivex.Scheduler {
    private static final java.lang.String KEY_SINGLE_PRIORITY = "rx2.single-priority";
    static final java.util.concurrent.ScheduledExecutorService SHUTDOWN = null;
    static final io.reactivex.internal.schedulers.RxThreadFactory SINGLE_THREAD_FACTORY = null;
    private static final java.lang.String THREAD_NAME_PREFIX = "RxSingleScheduler";
    final java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ScheduledExecutorService> executor;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class ScheduledWorker extends io.reactivex.Scheduler.Worker {
        volatile boolean disposed;
        final java.util.concurrent.ScheduledExecutorService executor;
        final io.reactivex.disposables.CompositeDisposable tasks;

        ScheduledWorker(java.util.concurrent.ScheduledExecutorService r1) {
                r0 = this;
                r0.<init>()
                r0.executor = r1
                io.reactivex.disposables.CompositeDisposable r1 = new io.reactivex.disposables.CompositeDisposable
                r1.<init>()
                r0.tasks = r1
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                boolean r0 = r1.disposed
                if (r0 != 0) goto Lc
                r0 = 1
                r1.disposed = r0
                io.reactivex.disposables.CompositeDisposable r0 = r1.tasks
                r0.dispose()
            Lc:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                boolean r0 = r1.disposed
                return r0
        }

        @Override // io.reactivex.Scheduler.Worker
        public io.reactivex.disposables.Disposable schedule(java.lang.Runnable r4, long r5, java.util.concurrent.TimeUnit r7) {
                r3 = this;
                boolean r0 = r3.disposed
                if (r0 == 0) goto L7
                io.reactivex.internal.disposables.EmptyDisposable r4 = io.reactivex.internal.disposables.EmptyDisposable.INSTANCE
                return r4
            L7:
                java.lang.Runnable r4 = io.reactivex.plugins.RxJavaPlugins.onSchedule(r4)
                io.reactivex.internal.schedulers.ScheduledRunnable r0 = new io.reactivex.internal.schedulers.ScheduledRunnable
                io.reactivex.disposables.CompositeDisposable r1 = r3.tasks
                r0.<init>(r4, r1)
                io.reactivex.disposables.CompositeDisposable r4 = r3.tasks
                r4.add(r0)
                r1 = 0
                int r4 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r4 > 0) goto L26
                java.util.concurrent.ScheduledExecutorService r4 = r3.executor     // Catch: java.util.concurrent.RejectedExecutionException -> L24
                java.util.concurrent.Future r4 = r4.submit(r0)     // Catch: java.util.concurrent.RejectedExecutionException -> L24
                goto L2c
            L24:
                r4 = move-exception
                goto L30
            L26:
                java.util.concurrent.ScheduledExecutorService r4 = r3.executor     // Catch: java.util.concurrent.RejectedExecutionException -> L24
                java.util.concurrent.ScheduledFuture r4 = r4.schedule(r0, r5, r7)     // Catch: java.util.concurrent.RejectedExecutionException -> L24
            L2c:
                r0.setFuture(r4)     // Catch: java.util.concurrent.RejectedExecutionException -> L24
                return r0
            L30:
                r3.dispose()
                io.reactivex.plugins.RxJavaPlugins.onError(r4)
                io.reactivex.internal.disposables.EmptyDisposable r4 = io.reactivex.internal.disposables.EmptyDisposable.INSTANCE
                return r4
        }
    }

    static {
            r0 = 0
            java.util.concurrent.ScheduledExecutorService r0 = java.util.concurrent.Executors.newScheduledThreadPool(r0)
            io.reactivex.internal.schedulers.SingleScheduler.SHUTDOWN = r0
            r0.shutdown()
            java.lang.String r0 = "rx2.single-priority"
            r1 = 5
            java.lang.Integer r0 = java.lang.Integer.getInteger(r0, r1)
            int r0 = r0.intValue()
            r1 = 10
            int r0 = java.lang.Math.min(r1, r0)
            r1 = 1
            int r0 = java.lang.Math.max(r1, r0)
            io.reactivex.internal.schedulers.RxThreadFactory r1 = new io.reactivex.internal.schedulers.RxThreadFactory
            java.lang.String r2 = "RxSingleScheduler"
            r1.<init>(r2, r0)
            io.reactivex.internal.schedulers.SingleScheduler.SINGLE_THREAD_FACTORY = r1
            return
    }

    public SingleScheduler() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r2.executor = r0
            java.util.concurrent.ScheduledExecutorService r1 = createExecutor()
            r0.lazySet(r1)
            return
    }

    static java.util.concurrent.ScheduledExecutorService createExecutor() {
            io.reactivex.internal.schedulers.RxThreadFactory r0 = io.reactivex.internal.schedulers.SingleScheduler.SINGLE_THREAD_FACTORY
            java.util.concurrent.ScheduledExecutorService r0 = io.reactivex.internal.schedulers.SchedulerPoolFactory.create(r0)
            return r0
    }

    @Override // io.reactivex.Scheduler
    public io.reactivex.Scheduler.Worker createWorker() {
            r2 = this;
            io.reactivex.internal.schedulers.SingleScheduler$ScheduledWorker r0 = new io.reactivex.internal.schedulers.SingleScheduler$ScheduledWorker
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ScheduledExecutorService> r1 = r2.executor
            java.lang.Object r1 = r1.get()
            java.util.concurrent.ScheduledExecutorService r1 = (java.util.concurrent.ScheduledExecutorService) r1
            r0.<init>(r1)
            return r0
    }

    @Override // io.reactivex.Scheduler
    public io.reactivex.disposables.Disposable scheduleDirect(java.lang.Runnable r4, long r5, java.util.concurrent.TimeUnit r7) {
            r3 = this;
            java.lang.Runnable r4 = io.reactivex.plugins.RxJavaPlugins.onSchedule(r4)
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 > 0) goto L19
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ScheduledExecutorService> r5 = r3.executor     // Catch: java.util.concurrent.RejectedExecutionException -> L17
            java.lang.Object r5 = r5.get()     // Catch: java.util.concurrent.RejectedExecutionException -> L17
            java.util.concurrent.ScheduledExecutorService r5 = (java.util.concurrent.ScheduledExecutorService) r5     // Catch: java.util.concurrent.RejectedExecutionException -> L17
            java.util.concurrent.Future r4 = r5.submit(r4)     // Catch: java.util.concurrent.RejectedExecutionException -> L17
            goto L25
        L17:
            r4 = move-exception
            goto L2a
        L19:
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ScheduledExecutorService> r0 = r3.executor     // Catch: java.util.concurrent.RejectedExecutionException -> L17
            java.lang.Object r0 = r0.get()     // Catch: java.util.concurrent.RejectedExecutionException -> L17
            java.util.concurrent.ScheduledExecutorService r0 = (java.util.concurrent.ScheduledExecutorService) r0     // Catch: java.util.concurrent.RejectedExecutionException -> L17
            java.util.concurrent.ScheduledFuture r4 = r0.schedule(r4, r5, r7)     // Catch: java.util.concurrent.RejectedExecutionException -> L17
        L25:
            io.reactivex.disposables.Disposable r4 = io.reactivex.disposables.Disposables.fromFuture(r4)     // Catch: java.util.concurrent.RejectedExecutionException -> L17
            return r4
        L2a:
            io.reactivex.plugins.RxJavaPlugins.onError(r4)
            io.reactivex.internal.disposables.EmptyDisposable r4 = io.reactivex.internal.disposables.EmptyDisposable.INSTANCE
            return r4
    }

    @Override // io.reactivex.Scheduler
    public io.reactivex.disposables.Disposable schedulePeriodicallyDirect(java.lang.Runnable r8, long r9, long r11, java.util.concurrent.TimeUnit r13) {
            r7 = this;
            java.lang.Runnable r1 = io.reactivex.plugins.RxJavaPlugins.onSchedule(r8)
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ScheduledExecutorService> r8 = r7.executor     // Catch: java.util.concurrent.RejectedExecutionException -> L19
            java.lang.Object r8 = r8.get()     // Catch: java.util.concurrent.RejectedExecutionException -> L19
            r0 = r8
            java.util.concurrent.ScheduledExecutorService r0 = (java.util.concurrent.ScheduledExecutorService) r0     // Catch: java.util.concurrent.RejectedExecutionException -> L19
            r2 = r9
            r4 = r11
            r6 = r13
            java.util.concurrent.ScheduledFuture r8 = r0.scheduleAtFixedRate(r1, r2, r4, r6)     // Catch: java.util.concurrent.RejectedExecutionException -> L19
            io.reactivex.disposables.Disposable r8 = io.reactivex.disposables.Disposables.fromFuture(r8)     // Catch: java.util.concurrent.RejectedExecutionException -> L19
            return r8
        L19:
            r0 = move-exception
            r8 = r0
            io.reactivex.plugins.RxJavaPlugins.onError(r8)
            io.reactivex.internal.disposables.EmptyDisposable r8 = io.reactivex.internal.disposables.EmptyDisposable.INSTANCE
            return r8
    }

    @Override // io.reactivex.Scheduler
    public void shutdown() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ScheduledExecutorService> r0 = r2.executor
            java.lang.Object r0 = r0.get()
            java.util.concurrent.ScheduledExecutorService r0 = (java.util.concurrent.ScheduledExecutorService) r0
            java.util.concurrent.ScheduledExecutorService r1 = io.reactivex.internal.schedulers.SingleScheduler.SHUTDOWN
            if (r0 == r1) goto L19
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ScheduledExecutorService> r0 = r2.executor
            java.lang.Object r0 = r0.getAndSet(r1)
            java.util.concurrent.ScheduledExecutorService r0 = (java.util.concurrent.ScheduledExecutorService) r0
            if (r0 == r1) goto L19
            r0.shutdownNow()
        L19:
            return
    }

    @Override // io.reactivex.Scheduler
    public void start() {
            r3 = this;
            r0 = 0
        L1:
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ScheduledExecutorService> r1 = r3.executor
            java.lang.Object r1 = r1.get()
            java.util.concurrent.ScheduledExecutorService r1 = (java.util.concurrent.ScheduledExecutorService) r1
            java.util.concurrent.ScheduledExecutorService r2 = io.reactivex.internal.schedulers.SingleScheduler.SHUTDOWN
            if (r1 == r2) goto L13
            if (r0 == 0) goto L21
            r0.shutdown()
            return
        L13:
            if (r0 != 0) goto L19
            java.util.concurrent.ScheduledExecutorService r0 = createExecutor()
        L19:
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ScheduledExecutorService> r2 = r3.executor
            boolean r1 = androidx.camera.view.p.a(r2, r1, r0)
            if (r1 == 0) goto L1
        L21:
            return
    }
}
