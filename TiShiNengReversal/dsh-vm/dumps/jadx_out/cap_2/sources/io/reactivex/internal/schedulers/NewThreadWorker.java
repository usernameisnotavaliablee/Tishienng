package io.reactivex.internal.schedulers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class NewThreadWorker extends io.reactivex.Scheduler.Worker implements io.reactivex.disposables.Disposable {
    volatile boolean disposed;
    private final java.util.concurrent.ScheduledExecutorService executor;

    public NewThreadWorker(java.util.concurrent.ThreadFactory r1) {
            r0 = this;
            r0.<init>()
            java.util.concurrent.ScheduledExecutorService r1 = io.reactivex.internal.schedulers.SchedulerPoolFactory.create(r1)
            r0.executor = r1
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
            r1 = this;
            boolean r0 = r1.disposed
            if (r0 != 0) goto Lc
            r0 = 1
            r1.disposed = r0
            java.util.concurrent.ScheduledExecutorService r0 = r1.executor
            r0.shutdownNow()
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
    public io.reactivex.disposables.Disposable schedule(java.lang.Runnable r4) {
            r3 = this;
            r0 = 0
            r2 = 0
            io.reactivex.disposables.Disposable r4 = r3.schedule(r4, r0, r2)
            return r4
    }

    @Override // io.reactivex.Scheduler.Worker
    public io.reactivex.disposables.Disposable schedule(java.lang.Runnable r7, long r8, java.util.concurrent.TimeUnit r10) {
            r6 = this;
            boolean r0 = r6.disposed
            if (r0 == 0) goto L7
            io.reactivex.internal.disposables.EmptyDisposable r7 = io.reactivex.internal.disposables.EmptyDisposable.INSTANCE
            return r7
        L7:
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r10
            io.reactivex.internal.schedulers.ScheduledRunnable r7 = r0.scheduleActual(r1, r2, r4, r5)
            return r7
    }

    public io.reactivex.internal.schedulers.ScheduledRunnable scheduleActual(java.lang.Runnable r4, long r5, java.util.concurrent.TimeUnit r7, io.reactivex.internal.disposables.DisposableContainer r8) {
            r3 = this;
            java.lang.Runnable r4 = io.reactivex.plugins.RxJavaPlugins.onSchedule(r4)
            io.reactivex.internal.schedulers.ScheduledRunnable r0 = new io.reactivex.internal.schedulers.ScheduledRunnable
            r0.<init>(r4, r8)
            if (r8 == 0) goto L12
            boolean r4 = r8.add(r0)
            if (r4 != 0) goto L12
            return r0
        L12:
            r1 = 0
            int r4 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r4 > 0) goto L21
            java.util.concurrent.ScheduledExecutorService r4 = r3.executor     // Catch: java.util.concurrent.RejectedExecutionException -> L1f
            java.util.concurrent.Future r4 = r4.submit(r0)     // Catch: java.util.concurrent.RejectedExecutionException -> L1f
            goto L27
        L1f:
            r4 = move-exception
            goto L2b
        L21:
            java.util.concurrent.ScheduledExecutorService r4 = r3.executor     // Catch: java.util.concurrent.RejectedExecutionException -> L1f
            java.util.concurrent.ScheduledFuture r4 = r4.schedule(r0, r5, r7)     // Catch: java.util.concurrent.RejectedExecutionException -> L1f
        L27:
            r0.setFuture(r4)     // Catch: java.util.concurrent.RejectedExecutionException -> L1f
            return r0
        L2b:
            r8.remove(r0)
            io.reactivex.plugins.RxJavaPlugins.onError(r4)
            return r0
    }

    public io.reactivex.disposables.Disposable scheduleDirect(java.lang.Runnable r4, long r5, java.util.concurrent.TimeUnit r7) {
            r3 = this;
            java.lang.Runnable r4 = io.reactivex.plugins.RxJavaPlugins.onSchedule(r4)
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 > 0) goto L13
            java.util.concurrent.ScheduledExecutorService r5 = r3.executor     // Catch: java.util.concurrent.RejectedExecutionException -> L11
            java.util.concurrent.Future r4 = r5.submit(r4)     // Catch: java.util.concurrent.RejectedExecutionException -> L11
            goto L19
        L11:
            r4 = move-exception
            goto L1e
        L13:
            java.util.concurrent.ScheduledExecutorService r0 = r3.executor     // Catch: java.util.concurrent.RejectedExecutionException -> L11
            java.util.concurrent.ScheduledFuture r4 = r0.schedule(r4, r5, r7)     // Catch: java.util.concurrent.RejectedExecutionException -> L11
        L19:
            io.reactivex.disposables.Disposable r4 = io.reactivex.disposables.Disposables.fromFuture(r4)     // Catch: java.util.concurrent.RejectedExecutionException -> L11
            return r4
        L1e:
            io.reactivex.plugins.RxJavaPlugins.onError(r4)
            io.reactivex.internal.disposables.EmptyDisposable r4 = io.reactivex.internal.disposables.EmptyDisposable.INSTANCE
            return r4
    }

    public io.reactivex.disposables.Disposable schedulePeriodicallyDirect(java.lang.Runnable r8, long r9, long r11, java.util.concurrent.TimeUnit r13) {
            r7 = this;
            java.lang.Runnable r1 = io.reactivex.plugins.RxJavaPlugins.onSchedule(r8)
            java.util.concurrent.ScheduledExecutorService r0 = r7.executor     // Catch: java.util.concurrent.RejectedExecutionException -> L12
            r2 = r9
            r4 = r11
            r6 = r13
            java.util.concurrent.ScheduledFuture r8 = r0.scheduleAtFixedRate(r1, r2, r4, r6)     // Catch: java.util.concurrent.RejectedExecutionException -> L12
            io.reactivex.disposables.Disposable r8 = io.reactivex.disposables.Disposables.fromFuture(r8)     // Catch: java.util.concurrent.RejectedExecutionException -> L12
            return r8
        L12:
            r0 = move-exception
            r8 = r0
            io.reactivex.plugins.RxJavaPlugins.onError(r8)
            io.reactivex.internal.disposables.EmptyDisposable r8 = io.reactivex.internal.disposables.EmptyDisposable.INSTANCE
            return r8
    }
}
