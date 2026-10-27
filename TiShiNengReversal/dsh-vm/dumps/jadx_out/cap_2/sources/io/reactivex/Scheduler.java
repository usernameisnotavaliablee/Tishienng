package io.reactivex;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class Scheduler {
    static final long CLOCK_DRIFT_TOLERANCE_NANOSECONDS = 0;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class PeriodicDirectTask implements java.lang.Runnable, io.reactivex.disposables.Disposable {
        volatile boolean disposed;
        final java.lang.Runnable run;
        final io.reactivex.Scheduler.Worker worker;

        PeriodicDirectTask(java.lang.Runnable r1, io.reactivex.Scheduler.Worker r2) {
                r0 = this;
                r0.<init>()
                r0.run = r1
                r0.worker = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                r0 = 1
                r1.disposed = r0
                io.reactivex.Scheduler$Worker r0 = r1.worker
                r0.dispose()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                boolean r0 = r1.disposed
                return r0
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                boolean r0 = r2.disposed
                if (r0 != 0) goto L18
                java.lang.Runnable r0 = r2.run     // Catch: java.lang.Throwable -> La
                r0.run()     // Catch: java.lang.Throwable -> La
                return
            La:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.Scheduler$Worker r1 = r2.worker
                r1.dispose()
                java.lang.RuntimeException r0 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r0)
                throw r0
            L18:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class Worker implements io.reactivex.disposables.Disposable {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        final class PeriodicTask implements java.lang.Runnable {
            long count;
            final java.lang.Runnable decoratedRun;
            long lastNowNanoseconds;
            final long periodInNanoseconds;
            final io.reactivex.internal.disposables.SequentialDisposable sd;
            long startInNanoseconds;
            final /* synthetic */ io.reactivex.Scheduler.Worker this$0;

            PeriodicTask(io.reactivex.Scheduler.Worker r1, long r2, java.lang.Runnable r4, long r5, io.reactivex.internal.disposables.SequentialDisposable r7, long r8) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    r0.decoratedRun = r4
                    r0.sd = r7
                    r0.periodInNanoseconds = r8
                    r0.lastNowNanoseconds = r5
                    r0.startInNanoseconds = r2
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r12 = this;
                    java.lang.Runnable r0 = r12.decoratedRun
                    r0.run()
                    io.reactivex.internal.disposables.SequentialDisposable r0 = r12.sd
                    boolean r0 = r0.isDisposed()
                    if (r0 != 0) goto L53
                    io.reactivex.Scheduler$Worker r0 = r12.this$0
                    java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
                    long r2 = r0.now(r1)
                    long r4 = io.reactivex.Scheduler.CLOCK_DRIFT_TOLERANCE_NANOSECONDS
                    long r6 = r2 + r4
                    long r8 = r12.lastNowNanoseconds
                    r10 = 1
                    int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                    if (r0 < 0) goto L35
                    long r6 = r12.periodInNanoseconds
                    long r8 = r8 + r6
                    long r8 = r8 + r4
                    int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                    if (r0 < 0) goto L2a
                    goto L35
                L2a:
                    long r4 = r12.startInNanoseconds
                    long r8 = r12.count
                    long r8 = r8 + r10
                    r12.count = r8
                    long r8 = r8 * r6
                    long r4 = r4 + r8
                    goto L45
                L35:
                    long r4 = r12.periodInNanoseconds
                    long r6 = r2 + r4
                    long r8 = r12.count
                    long r8 = r8 + r10
                    r12.count = r8
                    long r4 = r4 * r8
                    long r4 = r6 - r4
                    r12.startInNanoseconds = r4
                    r4 = r6
                L45:
                    r12.lastNowNanoseconds = r2
                    long r4 = r4 - r2
                    io.reactivex.internal.disposables.SequentialDisposable r0 = r12.sd
                    io.reactivex.Scheduler$Worker r2 = r12.this$0
                    io.reactivex.disposables.Disposable r1 = r2.schedule(r12, r4, r1)
                    r0.replace(r1)
                L53:
                    return
            }
        }

        public Worker() {
                r0 = this;
                r0.<init>()
                return
        }

        public long now(java.util.concurrent.TimeUnit r4) {
                r3 = this;
                long r0 = java.lang.System.currentTimeMillis()
                java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
                long r0 = r4.convert(r0, r2)
                return r0
        }

        public io.reactivex.disposables.Disposable schedule(java.lang.Runnable r4) {
                r3 = this;
                r0 = 0
                java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
                io.reactivex.disposables.Disposable r4 = r3.schedule(r4, r0, r2)
                return r4
        }

        public abstract io.reactivex.disposables.Disposable schedule(java.lang.Runnable r1, long r2, java.util.concurrent.TimeUnit r4);

        public io.reactivex.disposables.Disposable schedulePeriodically(java.lang.Runnable r15, long r16, long r18, java.util.concurrent.TimeUnit r20) {
                r14 = this;
                r0 = r16
                r2 = r20
                io.reactivex.internal.disposables.SequentialDisposable r3 = new io.reactivex.internal.disposables.SequentialDisposable
                r3.<init>()
                io.reactivex.internal.disposables.SequentialDisposable r11 = new io.reactivex.internal.disposables.SequentialDisposable
                r11.<init>(r3)
                java.lang.Runnable r8 = io.reactivex.plugins.RxJavaPlugins.onSchedule(r15)
                r4 = r18
                long r12 = r2.toNanos(r4)
                java.util.concurrent.TimeUnit r15 = java.util.concurrent.TimeUnit.NANOSECONDS
                long r9 = r14.now(r15)
                long r4 = r2.toNanos(r0)
                long r6 = r9 + r4
                io.reactivex.Scheduler$Worker$PeriodicTask r4 = new io.reactivex.Scheduler$Worker$PeriodicTask
                r5 = r14
                r4.<init>(r5, r6, r8, r9, r11, r12)
                io.reactivex.disposables.Disposable r15 = r14.schedule(r4, r0, r2)
                io.reactivex.internal.disposables.EmptyDisposable r0 = io.reactivex.internal.disposables.EmptyDisposable.INSTANCE
                if (r15 != r0) goto L33
                return r15
            L33:
                r3.replace(r15)
                return r11
        }
    }

    static {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MINUTES
            java.lang.String r1 = "rx2.scheduler.drift-tolerance"
            r2 = 15
            java.lang.Long r1 = java.lang.Long.getLong(r1, r2)
            long r1 = r1.longValue()
            long r0 = r0.toNanos(r1)
            io.reactivex.Scheduler.CLOCK_DRIFT_TOLERANCE_NANOSECONDS = r0
            return
    }

    public Scheduler() {
            r0 = this;
            r0.<init>()
            return
    }

    public static long clockDriftTolerance() {
            long r0 = io.reactivex.Scheduler.CLOCK_DRIFT_TOLERANCE_NANOSECONDS
            return r0
    }

    public abstract io.reactivex.Scheduler.Worker createWorker();

    public long now(java.util.concurrent.TimeUnit r4) {
            r3 = this;
            long r0 = java.lang.System.currentTimeMillis()
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = r4.convert(r0, r2)
            return r0
    }

    public io.reactivex.disposables.Disposable scheduleDirect(java.lang.Runnable r4) {
            r3 = this;
            r0 = 0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
            io.reactivex.disposables.Disposable r4 = r3.scheduleDirect(r4, r0, r2)
            return r4
    }

    public io.reactivex.disposables.Disposable scheduleDirect(java.lang.Runnable r3, long r4, java.util.concurrent.TimeUnit r6) {
            r2 = this;
            io.reactivex.Scheduler$Worker r0 = r2.createWorker()
            java.lang.Runnable r3 = io.reactivex.plugins.RxJavaPlugins.onSchedule(r3)
            io.reactivex.Scheduler$1 r1 = new io.reactivex.Scheduler$1
            r1.<init>(r2, r3, r0)
            r0.schedule(r1, r4, r6)
            return r0
    }

    public io.reactivex.disposables.Disposable schedulePeriodicallyDirect(java.lang.Runnable r8, long r9, long r11, java.util.concurrent.TimeUnit r13) {
            r7 = this;
            io.reactivex.Scheduler$Worker r0 = r7.createWorker()
            java.lang.Runnable r8 = io.reactivex.plugins.RxJavaPlugins.onSchedule(r8)
            io.reactivex.Scheduler$PeriodicDirectTask r1 = new io.reactivex.Scheduler$PeriodicDirectTask
            r1.<init>(r8, r0)
            r2 = r9
            r4 = r11
            r6 = r13
            io.reactivex.disposables.Disposable r8 = r0.schedulePeriodically(r1, r2, r4, r6)
            io.reactivex.internal.disposables.EmptyDisposable r9 = io.reactivex.internal.disposables.EmptyDisposable.INSTANCE
            if (r8 != r9) goto L19
            return r8
        L19:
            return r1
    }

    public void shutdown() {
            r0 = this;
            return
    }

    public void start() {
            r0 = this;
            return
    }

    @io.reactivex.annotations.Experimental
    public <S extends io.reactivex.Scheduler & io.reactivex.disposables.Disposable> S when(io.reactivex.functions.Function<io.reactivex.Flowable<io.reactivex.Flowable<io.reactivex.Completable>>, io.reactivex.Completable> r2) {
            r1 = this;
            io.reactivex.internal.schedulers.SchedulerWhen r0 = new io.reactivex.internal.schedulers.SchedulerWhen
            r0.<init>(r2, r1)
            return r0
    }
}
