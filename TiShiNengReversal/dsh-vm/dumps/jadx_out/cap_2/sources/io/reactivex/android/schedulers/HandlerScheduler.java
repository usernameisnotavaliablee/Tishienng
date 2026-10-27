package io.reactivex.android.schedulers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class HandlerScheduler extends io.reactivex.Scheduler {
    private final android.os.Handler handler;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class HandlerWorker extends io.reactivex.Scheduler.Worker {
        private volatile boolean disposed;
        private final android.os.Handler handler;

        HandlerWorker(android.os.Handler r1) {
                r0 = this;
                r0.<init>()
                r0.handler = r1
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                r0 = 1
                r1.disposed = r0
                android.os.Handler r0 = r1.handler
                r0.removeCallbacksAndMessages(r1)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                boolean r0 = r1.disposed
                return r0
        }

        @Override // io.reactivex.Scheduler.Worker
        public io.reactivex.disposables.Disposable schedule(java.lang.Runnable r5, long r6, java.util.concurrent.TimeUnit r8) {
                r4 = this;
                if (r5 == 0) goto L46
                if (r8 == 0) goto L3e
                boolean r0 = r4.disposed
                if (r0 == 0) goto Ld
                io.reactivex.disposables.Disposable r5 = io.reactivex.disposables.Disposables.disposed()
                return r5
            Ld:
                java.lang.Runnable r5 = io.reactivex.plugins.RxJavaPlugins.onSchedule(r5)
                io.reactivex.android.schedulers.HandlerScheduler$ScheduledRunnable r0 = new io.reactivex.android.schedulers.HandlerScheduler$ScheduledRunnable
                android.os.Handler r1 = r4.handler
                r0.<init>(r1, r5)
                android.os.Handler r5 = r4.handler
                android.os.Message r5 = android.os.Message.obtain(r5, r0)
                r5.obj = r4
                android.os.Handler r1 = r4.handler
                r2 = 0
                long r6 = r8.toMillis(r6)
                long r6 = java.lang.Math.max(r2, r6)
                r1.sendMessageDelayed(r5, r6)
                boolean r5 = r4.disposed
                if (r5 == 0) goto L3d
                android.os.Handler r5 = r4.handler
                r5.removeCallbacks(r0)
                io.reactivex.disposables.Disposable r5 = io.reactivex.disposables.Disposables.disposed()
                return r5
            L3d:
                return r0
            L3e:
                java.lang.NullPointerException r5 = new java.lang.NullPointerException
                java.lang.String r6 = "unit == null"
                r5.<init>(r6)
                throw r5
            L46:
                java.lang.NullPointerException r5 = new java.lang.NullPointerException
                java.lang.String r6 = "run == null"
                r5.<init>(r6)
                throw r5
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class ScheduledRunnable implements java.lang.Runnable, io.reactivex.disposables.Disposable {
        private final java.lang.Runnable delegate;
        private volatile boolean disposed;
        private final android.os.Handler handler;

        ScheduledRunnable(android.os.Handler r1, java.lang.Runnable r2) {
                r0 = this;
                r0.<init>()
                r0.handler = r1
                r0.delegate = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                r0 = 1
                r1.disposed = r0
                android.os.Handler r0 = r1.handler
                r0.removeCallbacks(r1)
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
                r3 = this;
                java.lang.Runnable r0 = r3.delegate     // Catch: java.lang.Throwable -> L6
                r0.run()     // Catch: java.lang.Throwable -> L6
                return
            L6:
                r0 = move-exception
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "Fatal Exception thrown on Scheduler."
                r1.<init>(r2, r0)
                io.reactivex.plugins.RxJavaPlugins.onError(r1)
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                java.lang.Thread$UncaughtExceptionHandler r2 = r0.getUncaughtExceptionHandler()
                r2.uncaughtException(r0, r1)
                return
        }
    }

    HandlerScheduler(android.os.Handler r1) {
            r0 = this;
            r0.<init>()
            r0.handler = r1
            return
    }

    @Override // io.reactivex.Scheduler
    public io.reactivex.Scheduler.Worker createWorker() {
            r2 = this;
            io.reactivex.android.schedulers.HandlerScheduler$HandlerWorker r0 = new io.reactivex.android.schedulers.HandlerScheduler$HandlerWorker
            android.os.Handler r1 = r2.handler
            r0.<init>(r1)
            return r0
    }

    @Override // io.reactivex.Scheduler
    public io.reactivex.disposables.Disposable scheduleDirect(java.lang.Runnable r4, long r5, java.util.concurrent.TimeUnit r7) {
            r3 = this;
            if (r4 == 0) goto L27
            if (r7 == 0) goto L1f
            java.lang.Runnable r4 = io.reactivex.plugins.RxJavaPlugins.onSchedule(r4)
            io.reactivex.android.schedulers.HandlerScheduler$ScheduledRunnable r0 = new io.reactivex.android.schedulers.HandlerScheduler$ScheduledRunnable
            android.os.Handler r1 = r3.handler
            r0.<init>(r1, r4)
            android.os.Handler r4 = r3.handler
            r1 = 0
            long r5 = r7.toMillis(r5)
            long r5 = java.lang.Math.max(r1, r5)
            r4.postDelayed(r0, r5)
            return r0
        L1f:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "unit == null"
            r4.<init>(r5)
            throw r4
        L27:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "run == null"
            r4.<init>(r5)
            throw r4
    }
}
